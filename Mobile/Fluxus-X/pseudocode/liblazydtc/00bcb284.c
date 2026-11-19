/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb284
 */

/* std::__ndk1::system_category() */

undefined ** std::__ndk1::system_category(void)

{
  int iVar1;
  
  if (((DAT_00d266f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d266f8), iVar1 != 0)) {
    __cxa_guard_release(&DAT_00d266f8);
  }
  return &PTR_PTR_00cca5e8;
}

