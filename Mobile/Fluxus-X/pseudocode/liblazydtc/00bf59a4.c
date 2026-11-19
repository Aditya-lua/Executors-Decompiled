/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf59a4
 */

/* std::__ndk1::locale::classic() */

undefined8 * std::__ndk1::locale::classic(void)

{
  int iVar1;
  
  if (((DAT_00d27240 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27240), iVar1 != 0)) {
                    /* try { // try from 00bf59ec to 00bf59ff has its CatchHandler @ 00bf5a18 */
    FUN_00bf34a8(&DAT_00d27100,1);
    DAT_00d27238 = &DAT_00d27100;
    __cxa_guard_release(&DAT_00d27240);
  }
  return &DAT_00d27238;
}

