/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc724
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_12(void)

{
  uint3 uVar1;
  int iVar2;
  
  if (((DAT_00cca900 & 1) != 0) || (iVar2 = __cxa_guard_acquire(&DAT_00cca900), iVar2 == 0)) {
    return;
  }
  if (((DAT_00ccaae0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccaae0), iVar2 != 0)) {
    DAT_00ccaad0 = 0xa559683081e457c1;
    _DAT_00ccaad8 = 0x1915af2;
    __cxa_atexit(&LAB_007fdf0c,&DAT_00ccaad0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00ccaae0);
  }
  if (DAT_00ccaadb == '\x01') {
    DAT_00ccaad0 = DAT_00ccaad0 ^ 0xc9771b45f9913b87;
    uVar1 = (uint3)_DAT_00ccaad8;
    _DAT_00ccaad8 = (uint)(uVar1 ^ 0x913b87);
  }
  DAT_00cca8f8 = &DAT_00ccaad0;
  __cxa_guard_release(&DAT_00cca900);
  return;
}

