/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2932c
 */

long __cxa_allocate_exception(long param_1)

{
  void *__s;
  
                    /* try { // try from 00c29340 to 00c29347 has its CatchHandler @ 00c29378 */
  __s = (void *)FUN_00c29b0c(param_1 + 0x8fU & 0xfffffffffffffff0);
  if (__s == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
    std::terminate();
  }
  memset(__s,0,param_1 + 0x8fU & 0xfffffffffffffff0);
  return (long)__s + 0x80;
}

