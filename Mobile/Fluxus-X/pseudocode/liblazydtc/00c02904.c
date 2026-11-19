/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02904
 */

/* std::__ndk1::__time_get_c_storage<char>::__weeks() const */

undefined1 * std::__ndk1::__time_get_c_storage<char>::__weeks(void)

{
  int iVar1;
  
  if (((DAT_00d27308 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27308), iVar1 != 0)) {
    FUN_00c02970();
    DAT_00d27300 = &DAT_00d27400;
    __cxa_guard_release(&DAT_00d27308);
  }
  return DAT_00d27300;
}

