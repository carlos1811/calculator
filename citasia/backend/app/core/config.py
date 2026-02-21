from pydantic import BaseSettings


class Settings(BaseSettings):
    app_name: str = "citasIA API"
    jwt_secret: str = "change-me"
    database_url: str = "postgresql://postgres:postgres@localhost:5432/citasia"


settings = Settings()
