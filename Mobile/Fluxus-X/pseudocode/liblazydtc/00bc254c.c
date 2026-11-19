/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc254c
 */

/* std::__ndk1::chrono::system_clock::from_time_t(long) */

long std::__ndk1::chrono::system_clock::from_time_t(long param_1)

{
  return param_1 * 1000000;
}

