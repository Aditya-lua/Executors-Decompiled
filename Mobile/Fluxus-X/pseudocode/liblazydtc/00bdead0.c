/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bdead0
 */

/* std::__ndk1::__cloc() */

__locale_t std::__ndk1::__cloc(void)

{
  int iVar1;
  
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bdeb18 to 00bdeb2b has its CatchHandler @ 00bdeb40 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  return DAT_00d270f0;
}

