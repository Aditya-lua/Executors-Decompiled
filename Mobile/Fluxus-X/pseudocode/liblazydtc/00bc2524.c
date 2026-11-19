/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2524
 */

/* std::__ndk1::chrono::system_clock::to_time_t(std::__ndk1::chrono::time_point<std::__ndk1::chrono::system_clock,
   std::__ndk1::chrono::duration<long long, std::__ndk1::ratio<1l, 1000000l> > > const&) */

long std::__ndk1::chrono::system_clock::to_time_t(time_point *param_1)

{
  return *(long *)param_1 / 1000000;
}

