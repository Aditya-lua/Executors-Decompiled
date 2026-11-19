/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd2c0
 */

/* std::__ndk1::thread::hardware_concurrency() */

uint std::__ndk1::thread::hardware_concurrency(void)

{
  long lVar1;
  
                    /* try { // try from 00bcd2cc to 00bcd2d3 has its CatchHandler @ 00bcd2e8 */
  lVar1 = sysconf(0x61);
  return (uint)lVar1 & ((uint)(lVar1 >> 0x3f) ^ 0xffffffff);
}

