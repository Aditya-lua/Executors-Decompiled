/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00807444
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00807444(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  int iVar3;
  undefined8 *puVar4;
  code *local_50;
  undefined8 uStack_48;
  undefined1 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1b4a0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b4a0), iVar3 != 0)) {
    DAT_00d1b490 = 0xb5e0a7227d8eb790;
    _DAT_00d1b498 = 499;
    __cxa_atexit(&LAB_008087ac,&DAT_00d1b490,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b4a0);
  }
  if (DAT_00d1b499 == '\x01') {
    DAT_00d1b490 = DAT_00d1b490 ^ 0xd385d54713e1dbf3;
    _DAT_00d1b498 = (ushort)(DAT_00d1b498 ^ 0xf3);
  }
  FUN_008ac76c(param_1,FUN_00807b44,&DAT_00d1b490,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar4;
  FUN_00807f14(&DAT_00d1b468,&local_50,&local_50);
  local_50 = FUN_00807b44;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b490);
  local_40 = 0xdf;
  uStack_48 = 0x98842217e45d1cb1;
  local_50 = (code *)0x82843318f54400bc;
  if (((DAT_00d1b4c0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b4c0), iVar3 != 0)) {
                    /* try { // try from 00807950 to 0080795f has its CatchHandler @ 00807b18 */
    FUN_008087b8(&DAT_00d1b4a8,&local_50);
    __cxa_atexit(&LAB_0080884c,&DAT_00d1b4a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b4c0);
  }
  FUN_00808884(&DAT_00d1b4a8);
  FUN_008ac76c(param_1,FUN_00807c3c,&DAT_00d1b4a8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar4;
  FUN_00807f14(&DAT_00d1b468,&local_50,&local_50);
  local_50 = FUN_00807c3c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b4a8);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1b4d8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b4d8), iVar3 != 0)) {
    DAT_00d1b4c8 = 0x1c256e7bd42397f2;
    _DAT_00d1b4d0 = 0x1559cef;
    __cxa_atexit(&LAB_00808858,&DAT_00d1b4c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b4d8);
  }
  if (DAT_00d1b4d3 == '\x01') {
    DAT_00d1b4c8 = DAT_00d1b4c8 ^ 0x7d410717b555f99b;
    uVar2 = (uint3)_DAT_00d1b4d0;
    _DAT_00d1b4d0 = (uint)(uVar2 ^ 0x55f99b);
  }
  FUN_008ac76c(param_1,FUN_00807cc0,&DAT_00d1b4c8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar4;
  FUN_00807f14(&DAT_00d1b468,&local_50,&local_50);
  local_50 = FUN_00807cc0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1b4c8);
  if (((DAT_00d1b4f0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b4f0), iVar3 != 0)) {
    DAT_00d1b4e0 = 0x6d588d1e2cf2a0f8;
    _DAT_00d1b4e8 = 0x191;
    __cxa_atexit(&LAB_00808864,&DAT_00d1b4e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b4f0);
  }
  if (DAT_00d1b4e9 == '\x01') {
    DAT_00d1b4e0 = DAT_00d1b4e0 ^ 0x93de57d4d91d391;
    _DAT_00d1b4e8 = (ushort)(DAT_00d1b4e8 ^ 0x91);
  }
  FUN_008ac76c(param_1,&LAB_00807d48,&DAT_00d1b4e0,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar4;
  FUN_00807f14(&DAT_00d1b468,&local_50,&local_50);
  local_50 = (code *)&LAB_00807d48;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1b4e0);
  if (((DAT_00d1b508 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b508), iVar3 != 0)) {
    DAT_00d1b500 = '\x01';
    DAT_00d1b4f8 = 0x73a086364935b283;
    __cxa_atexit(&LAB_00808870,&DAT_00d1b4f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b508);
  }
  if (DAT_00d1b500 == '\x01') {
    DAT_00d1b500 = '\0';
    DAT_00d1b4f8 = DAT_00d1b4f8 ^ 0x73c5e5572545d7f1;
  }
  FUN_008ac76c(param_1,&LAB_00807de0,&DAT_00d1b4f8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar4;
  FUN_00807f14(&DAT_00d1b468,&local_50,&local_50);
  local_50 = (code *)&LAB_00807de0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1b4f8);
  if (((DAT_00d1b518 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b518), iVar3 != 0)) {
    DAT_00d1b516 = '\x01';
    DAT_00d1b510 = 0x37c29a80;
    _DAT_00d1b514 = 0x7dd2;
    __cxa_atexit(&LAB_00808878,&DAT_00d1b510,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b518);
  }
  if (DAT_00d1b516 == '\x01') {
    DAT_00d1b516 = '\0';
    _DAT_00d1b514 = _DAT_00d1b514 ^ 0x7db7;
    DAT_00d1b510 = DAT_00d1b510 ^ 0x5fa1fbe3;
  }
  FUN_00807e7c(param_1,&DAT_00d1b510);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

