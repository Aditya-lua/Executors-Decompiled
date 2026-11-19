/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd36c
 */

/* std::__ndk1::__thread_local_data() */

undefined * std::__ndk1::__thread_local_data(void)

{
  int iVar1;
  
  if (((DAT_00d26718 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26718), iVar1 != 0)) {
                    /* try { // try from 00bcd3b4 to 00bcd3c3 has its CatchHandler @ 00bcd3d8 */
    FUN_00bcd3f0(&DAT_00d26708);
    DAT_00d26710 = &DAT_00d26708;
    __cxa_guard_release(&DAT_00d26718);
  }
  return DAT_00d26710;
}

