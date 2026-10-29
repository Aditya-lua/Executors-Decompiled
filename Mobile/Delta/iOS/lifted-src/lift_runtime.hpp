#pragma once
#include <cstdint>
struct Arm64Context { std::uint64_t x[31]{}; std::uint64_t sp{}; std::uint64_t nzcv{}; };
#define ARM64(text) do { (void)sizeof(text); } while (0)
#define CALL_DIRECT(target) do { (void)sizeof(&target); } while (0)
#define CALL_INDIRECT(reg) do { (void)sizeof(reg); } while (0)
