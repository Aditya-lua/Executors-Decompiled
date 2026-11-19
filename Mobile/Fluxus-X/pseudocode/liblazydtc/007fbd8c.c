/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fbd8c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_4(void)

{
  int iVar1;
  
  if (((DAT_00cca880 & 1) != 0) || (iVar1 = __cxa_guard_acquire(&DAT_00cca880), iVar1 == 0)) {
    return;
  }
  if (((DAT_00cca990 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca990), iVar1 != 0)) {
    DAT_00cca980 = 0xbf9f7e52a1485d03;
    _DAT_00cca988 = 0x145;
    __cxa_atexit(&LAB_007fdd3c,&DAT_00cca980,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca990);
  }
  if (DAT_00cca989 == '\x01') {
    DAT_00cca980 = DAT_00cca980 ^ 0xe7bf0d27d93d3145;
    _DAT_00cca988 = (ushort)(DAT_00cca988 ^ 0x45);
  }
  DAT_00cca878 = &DAT_00cca980;
  __cxa_guard_release(&DAT_00cca880);
  return;
}

