/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc304
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_9(void)

{
  int iVar1;
  
  if (((DAT_00cca8d0 & 1) != 0) || (iVar1 = __cxa_guard_acquire(&DAT_00cca8d0), iVar1 == 0)) {
    return;
  }
  if (((DAT_00ccaa18 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00ccaa18), iVar1 != 0)) {
    DAT_00ccaa08 = 0x9a3f870811057c59;
    DAT_00ccaa10 = 0xc143b4d;
    _DAT_00ccaa14 = 0x167;
    __cxa_atexit(&LAB_007fded4,&DAT_00ccaa08,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00ccaa18);
  }
  if (DAT_00ccaa15 == '\x01') {
    _DAT_00ccaa14 = (ushort)(DAT_00ccaa14 ^ 0x67);
    DAT_00ccaa08 = DAT_00ccaa08 ^ 0xf553e56763671535;
    DAT_00ccaa10 = DAT_00ccaa10 ^ 0x63671535;
  }
  DAT_00cca8c8 = &DAT_00ccaa08;
  __cxa_guard_release(&DAT_00cca8d0);
  return;
}

