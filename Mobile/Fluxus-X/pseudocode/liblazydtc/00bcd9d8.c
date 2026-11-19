/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd9d8
 */

/* std::__ndk1::iostream_category() */

undefined ** std::__ndk1::iostream_category(void)

{
  int iVar1;
  
  if (((DAT_00d26720 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26720), iVar1 != 0)) {
    __cxa_guard_release(&DAT_00d26720);
  }
  return &PTR_PTR_00cca5f8;
}

