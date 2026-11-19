/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080ceb4
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0080ceb4(void)

{
  int iVar1;
  
  if (((DAT_00d1b6d8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b6d8), iVar1 != 0)) {
    DAT_00d1b6d4 = 1;
    DAT_00d1b6d0 = 0x1bdb0987;
    uRam0000000000d1b698 = 0x971f10616fb40a9b;
    _DAT_00d1b690 = 0xd84b0d2d7ab20285;
    uRam0000000000d1b6a8 = 0xd04b4e2f6eb74d87;
    _DAT_00d1b6a0 = 0xcb4a592469db43c7;
    uRam0000000000d1b6b8 = 0xcc4b48333bf14dc9;
    _DAT_00d1b6b0 = 0xb316036f35f90386;
    uRam0000000000d1b6c8 = 0xdc35046f35ff459d;
    _DAT_00d1b6c0 = 0xdc585f206ff1039b;
    __cxa_atexit(&LAB_0080cf3c,&DAT_00d1b690,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b6d8);
    return;
  }
  return;
}

