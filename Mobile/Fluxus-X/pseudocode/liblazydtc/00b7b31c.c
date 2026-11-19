/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b31c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

tm * mbedtls_platform_gmtime_r(time_t *__timer,tm *__tp)

{
  tm *ptVar1;
  
  ptVar1 = gmtime_r(__timer,__tp);
  return ptVar1;
}

