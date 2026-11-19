/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c309b0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

tm * gmtime_r(time_t *__timer,tm *__tp)

{
  tm *ptVar1;
  
  ptVar1 = gmtime_r(__timer,__tp);
  return ptVar1;
}

