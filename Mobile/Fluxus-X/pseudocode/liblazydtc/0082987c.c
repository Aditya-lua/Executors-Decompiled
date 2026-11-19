/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082987c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082987c(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  uint3 uVar1;
  int iVar2;
  undefined8 uVar3;
  
  if (((DAT_00d1d1c0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d1c0), iVar2 != 0)) {
    DAT_00d1d1b8 = 0x9eb496;
    _DAT_00d1d1bc = 0x11f;
    __cxa_atexit(&LAB_0082baa0,&DAT_00d1d1b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d1c0);
  }
  if (DAT_00d1d1bd == '\x01') {
    _DAT_00d1d1bc = (ushort)(DAT_00d1d1bc ^ 0x1f);
    DAT_00d1d1b8 = DAT_00d1d1b8 ^ 0x65f3d5f1;
  }
  FUN_008acba4(param_1,0xffffd8ee,&DAT_00d1d1b8);
  if (((DAT_00d1d1d8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d1d8), iVar2 != 0)) {
    DAT_00d1d1c8 = 0xaea5a998047ba2c8;
    _DAT_00d1d1d0 = 0x10fa2ec;
    __cxa_atexit(&LAB_0082baac,&DAT_00d1d1c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d1d8);
  }
  if (DAT_00d1d1d3 == '\x01') {
    DAT_00d1d1c8 = DAT_00d1d1c8 ^ 0xc7d3dbfd570fc78f;
    uVar1 = (uint3)_DAT_00d1d1d0;
    _DAT_00d1d1d0 = (uint)(uVar1 ^ 0xfc78f);
  }
  FUN_008acba4(param_1,0xffffffff,&DAT_00d1d1c8);
  FUN_008aac40(param_1,0xfffffffe);
  if (((DAT_00d1d1f0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d1f0), iVar2 != 0)) {
    DAT_00d1d1e0 = 0xa6535bca7038ec5e;
    _DAT_00d1d1e8 = 0x151fc7a;
    __cxa_atexit(&LAB_00802558,&DAT_00d1d1e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d1f0);
  }
  if (DAT_00d1d1eb == '\x01') {
    DAT_00d1d1e0 = DAT_00d1d1e0 ^ 0xcf2529af23519919;
    uVar1 = (uint3)_DAT_00d1d1e8;
    _DAT_00d1d1e8 = (uint)(uVar1 ^ 0x519919);
  }
  FUN_008ac4a8(param_1,&DAT_00d1d1e0);
  FUN_008add48(param_1,2,1);
  if (((DAT_00d1d208 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d208), iVar2 != 0)) {
    DAT_00d1d204 = '\x01';
    DAT_00d1d1f8 = 0xbf1272626e09f408;
    DAT_00d1d200 = 0x2909f43c;
    __cxa_atexit(&LAB_0082bab8,&DAT_00d1d1f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d208);
  }
  if (DAT_00d1d204 == '\x01') {
    DAT_00d1d204 = '\0';
    DAT_00d1d1f8 = DAT_00d1d1f8 ^ 0xd15b1b17297d914f;
    DAT_00d1d200 = DAT_00d1d200 ^ 0x297d914f;
  }
  FUN_008acba4(param_1,0xffffffff,&DAT_00d1d1f8);
  FUN_008aac40(param_1,0xfffffffe);
  FUN_008add48(param_1,1,2);
  if (((DAT_00d1d218 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d218), iVar2 != 0)) {
    DAT_00d1d212 = '\x01';
    _DAT_00d1d210 = 0xe9ff;
    __cxa_atexit(&LAB_0082bac4,&DAT_00d1d210,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d218);
  }
  if (DAT_00d1d212 == '\x01') {
    DAT_00d1d212 = '\0';
    _DAT_00d1d210 = _DAT_00d1d210 ^ 0xe9a7;
  }
  FUN_008acba4(param_1,0xfffffffe,&DAT_00d1d210);
  uVar3 = FUN_008ab528(param_1,0xffffffff,0);
  *param_2 = uVar3;
  FUN_008aa994(param_1,0xfffffffe);
  if (((DAT_00d1d228 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d228), iVar2 != 0)) {
    DAT_00d1d222 = '\x01';
    _DAT_00d1d220 = 0xd504;
    __cxa_atexit(&LAB_0082bacc,&DAT_00d1d220,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d228);
  }
  if (DAT_00d1d222 == '\x01') {
    DAT_00d1d222 = '\0';
    _DAT_00d1d220 = _DAT_00d1d220 ^ 0xd55d;
  }
  FUN_008acba4(param_1,0xfffffffe,&DAT_00d1d220);
  uVar3 = FUN_008ab528(param_1,0xffffffff,0);
  *param_3 = uVar3;
  FUN_008aa994(param_1,0xfffffffe);
  FUN_008aa994(param_1,0xfffffffd);
  return;
}

