package co.omise;

public enum Endpoint {
    VAULT("vault.omise.co"),
    API("api.omise.co");

    private final String host;

    Endpoint(String host) {
        this.host = host;
    }

    public String host() {
        return this.host;
    }

    @Override
    public String toString() {
        return host();
    }
}
