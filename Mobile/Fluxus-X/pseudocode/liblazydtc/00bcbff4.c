/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbff4
 */

/* std::__ndk1::future_category() */

undefined ** std::__ndk1::future_category(void)

{
  int iVar1;
  
  if (((DAT_00d26700 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26700), iVar1 != 0)) {
    __cxa_guard_release(&DAT_00d26700);
  }
  return &PTR_PTR_00cca5f0;
}

