/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082bbd0
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082bbd0(undefined8 param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  int iVar1;
  
  if (((DAT_00d1d2e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d2e0), iVar1 != 0)) {
    DAT_00d1d2d8 = 0xae3e9a43;
    _DAT_00d1d2dc = 0x141;
    __cxa_atexit(&LAB_0082bf54,&DAT_00d1d2d8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d2e0);
  }
  if (DAT_00d1d2dd == '\x01') {
    _DAT_00d1d2dc = (ushort)(DAT_00d1d2dc ^ 0x41);
    DAT_00d1d2d8 = DAT_00d1d2d8 ^ 0xc54dfb37;
  }
  FUN_008acba4(param_3,0xffffd8ee,&DAT_00d1d2d8);
  if (((DAT_00d1d2f0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d2f0), iVar1 != 0)) {
    DAT_00d1d2ee = '\x01';
    DAT_00d1d2e8 = 0x1c135847;
    _DAT_00d1d2ec = 0x104;
    __cxa_atexit(&LAB_0082bf60,&DAT_00d1d2e8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d2f0);
  }
  if (DAT_00d1d2ee == '\x01') {
    DAT_00d1d2ee = '\0';
    _DAT_00d1d2ec = _DAT_00d1d2ec ^ 0x17d;
    DAT_00d1d2e8 = DAT_00d1d2e8 ^ 0x7d7f3d23;
  }
  FUN_008acba4(param_3,0xffffffff,&DAT_00d1d2e8);
  FUN_008aab40(param_3,0xfffffffe);
  FUN_008ac11c(0x3f9eb851eb851eb8,param_3);
  FUN_008ac11c(param_1,param_3);
  FUN_008ac11c(param_2,param_3);
  FUN_008ac11c((double)param_4,param_3);
  if (((DAT_00d1d308 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d308), iVar1 != 0)) {
    DAT_00d1d2f8 = 0x7340635ec6142c86;
    DAT_00d1d300 = 0xd012228e;
    _DAT_00d1d304 = 0x13b;
    __cxa_atexit(&LAB_0082bf6c,&DAT_00d1d2f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d308);
  }
  if (DAT_00d1d305 == '\x01') {
    _DAT_00d1d304 = (ushort)(DAT_00d1d304 ^ 0x3b);
    DAT_00d1d2f8 = DAT_00d1d2f8 ^ 0x1f25313bb56143eb;
    DAT_00d1d300 = DAT_00d1d300 ^ 0xb56143eb;
  }
  FUN_008ac76c(param_3,&LAB_0082bee0,&DAT_00d1d2f8,3,0);
  FUN_008adea0(param_3,2,0,0);
  return;
}

