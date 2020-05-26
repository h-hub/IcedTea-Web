package net.adoptopenjdk.icedteaweb.proxy.util;

import net.adoptopenjdk.icedteaweb.logging.Logger;
import net.adoptopenjdk.icedteaweb.logging.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Optional;

public class ProxyUtlis {

    private static final Logger LOG = LoggerFactory.getLogger(ProxyUtlis.class);

    public static Optional<SocketAddress> getAddress(final String host, final int port) {
        if (host == null || host.trim().isEmpty()) {
            return Optional.empty();
        }
        if (port < 0) {
            return Optional.of(new InetSocketAddress(host, ProxyConstants.FALLBACK_PROXY_PORT));
        }
        return Optional.of(new InetSocketAddress(host, port));
    }

}