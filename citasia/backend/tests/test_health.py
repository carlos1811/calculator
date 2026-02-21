from app.main import health


def test_health_endpoint_contract() -> None:
    assert health() == {"status": "ok"}
