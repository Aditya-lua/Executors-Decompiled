/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082112c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0082112c(undefined8 param_1)

{
  ulong uVar1;
  int iVar2;
  
  FUN_008ad0b0(param_1,0,0);
  FUN_008ac4a8(param_1,DAT_00cca8d8);
  if (((DAT_00d1cad8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1cad8), iVar2 != 0)) {
    DAT_00d1cad0 = 0xd539da48;
    _DAT_00d1cad4 = 0x1a9;
    __cxa_atexit(&LAB_008240b4,&DAT_00d1cad0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cad8);
  }
  if (DAT_00d1cad5 == '\x01') {
    _DAT_00d1cad4 = (ushort)(DAT_00d1cad4 ^ 0xa9);
    DAT_00d1cad0 = DAT_00d1cad0 ^ 0xb94b8f25;
  }
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cad0);
  FUN_008ac4a8(param_1,DAT_00cca8e8);
  if (((DAT_00d1cae8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1cae8), iVar2 != 0)) {
    _DAT_00d1cae0 = 0x1bd4ba694b44d56;
    __cxa_atexit(&LAB_008240c0,&DAT_00d1cae0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cae8);
  }
  uVar1 = _DAT_00d1cae0;
  if (DAT_00d1cae7 == '\x01') {
    _DAT_00d1cae0 = (uint6)((ushort)((ushort)(_DAT_00d1cae0 >> 0x20) ^ 0x2500) ^ 0xc3) << 0x20;
    _DAT_00d1cae0 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1cae6,_DAT_00d1cae0) >> 0x20),(int)uVar1) ^
         0xbd0000ffdb193b;
  }
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cae0);
  FUN_008ac4a8(param_1,DAT_00cca8f8);
  if (((DAT_00d1caf8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1caf8), iVar2 != 0)) {
    DAT_00d1caf6 = '\x01';
    DAT_00d1caf0 = 0x47cee142;
    _DAT_00d1caf4 = 0x83c6;
    __cxa_atexit(&LAB_008240cc,&DAT_00d1caf0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1caf8);
  }
  if (DAT_00d1caf6 == '\x01') {
    DAT_00d1caf6 = '\0';
    _DAT_00d1caf4 = _DAT_00d1caf4 ^ 0x83a3;
    DAT_00d1caf0 = DAT_00d1caf0 ^ 0x2ba7a72f;
  }
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1caf0);
  return 1;
}

