cmake_minimum_required(VERSION 3.28)
project(dpi-core LANGUAGES C)

set(CMAKE_C_STANDARD 11)
add_library(dpi SHARED
    ../../../../upstream/goodbyedpi/dpi.c
    ../../../../upstream/goodbyedpi/tcp_fragment.c
    ../../../../upstream/goodbyedpi/tls_fragment.c
    DpiBridge.c
)

target_include_directories(dpi PRIVATE
    ../../../../upstream/goodbyedpi
    .
)

target_link_libraries(dpi log)
