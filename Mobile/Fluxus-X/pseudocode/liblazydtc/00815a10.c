/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00815a10
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00815a10(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined1 *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1c468 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c468), iVar3 != 0)) {
    DAT_00d1c460 = '\x01';
    DAT_00d1c458 = 0xc1188ddb04b5fce2;
    __cxa_atexit(&LAB_00817db0,&DAT_00d1c458,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c468);
  }
  if (DAT_00d1c460 == '\x01') {
    DAT_00d1c460 = '\0';
    DAT_00d1c458 = DAT_00d1c458 ^ 0xc177ebb56dc19985;
  }
  FUN_008ac76c(param_1,&LAB_008169e8,&DAT_00d1c458,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_008169e8;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c458);
  if (((DAT_00d1c490 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c490), iVar3 != 0)) {
    DAT_00d1c48c = '\x01';
    DAT_00d1c480 = 0xbfd66fd31af10022;
    DAT_00d1c488 = 0x6ff60030;
    __cxa_atexit(&LAB_00817f64,&DAT_00d1c480,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c490);
  }
  if (DAT_00d1c48c == '\x01') {
    DAT_00d1c48c = '\0';
    DAT_00d1c480 = DAT_00d1c480 ^ 0xd3b719a36f856545;
    DAT_00d1c488 = DAT_00d1c488 ^ 0x6f856545;
  }
  FUN_008ac76c(param_1,&LAB_008174f4,&DAT_00d1c480,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_008174f4;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c480);
  if (((DAT_00d1c4a8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c4a8), iVar3 != 0)) {
    DAT_00d1c498 = 0x9b54b55b743f6a46;
    _DAT_00d1c4a0 = 0x14b6a54;
    __cxa_atexit(&LAB_00815898,&DAT_00d1c498,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c4a8);
  }
  if (DAT_00d1c4a3 == '\x01') {
    DAT_00d1c498 = DAT_00d1c498 ^ 0xf735c32b014b0f21;
    uVar2 = (uint3)_DAT_00d1c4a0;
    _DAT_00d1c4a0 = (uint)(uVar2 ^ 0x4b0f21);
  }
  FUN_008ac76c(param_1,&LAB_008175ac,&DAT_00d1c498,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_008175ac;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c498);
  if (((DAT_00d1c4c0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c4c0), iVar3 != 0)) {
    DAT_00d1c4b0 = 0xb3fcbb1dda79582e;
    _DAT_00d1c4b8 = 0x10d5828;
    __cxa_atexit(&LAB_008158b0,&DAT_00d1c4b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c4c0);
  }
  if (DAT_00d1c4bb == '\x01') {
    DAT_00d1c4b0 = DAT_00d1c4b0 ^ 0xdf9dcd6daf0d3d5d;
    _DAT_00d1c4b8 = _DAT_00d1c4b8 & 0xffffff ^ 0xd3d5d;
  }
  FUN_008ac76c(param_1,&LAB_0081763c,&DAT_00d1c4b0,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_0081763c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c4b0);
  if (((DAT_00d1c4d8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c4d8), iVar3 != 0)) {
    DAT_00d1c4c8 = 0xafe0af7e961f56fe;
    DAT_00d1c4d0 = 0x861f5df8;
    _DAT_00d1c4d4 = 0x111;
    __cxa_atexit(&LAB_00817f70,&DAT_00d1c4c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c4d8);
  }
  if (DAT_00d1c4d5 == '\x01') {
    _DAT_00d1c4d4 = (ushort)(DAT_00d1c4d4 ^ 0x11);
    DAT_00d1c4c8 = DAT_00d1c4c8 ^ 0xdb93c111f56b3399;
    DAT_00d1c4d0 = DAT_00d1c4d0 ^ 0xf56b3399;
  }
  FUN_008ac76c(param_1,&LAB_00817704,&DAT_00d1c4c8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817704;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c4c8);
  if (((DAT_00d1c4f0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c4f0), iVar3 != 0)) {
    DAT_00d1c4ec = '\x01';
    DAT_00d1c4e0 = 0x9dbc912454dd3a8a;
    DAT_00d1c4e8 = 0x37dd318c;
    __cxa_atexit(&LAB_00817f7c,&DAT_00d1c4e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c4f0);
  }
  if (DAT_00d1c4ec == '\x01') {
    DAT_00d1c4ec = '\0';
    DAT_00d1c4e0 = DAT_00d1c4e0 ^ 0xe9cfff4b37a95fed;
    DAT_00d1c4e8 = DAT_00d1c4e8 ^ 0x37a95fed;
  }
  FUN_008ac76c(param_1,&LAB_008177d0,&DAT_00d1c4e0,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_008177d0;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c4e0);
  if (((DAT_00d1c508 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c508), iVar3 != 0)) {
    DAT_00d1c504 = '\x01';
    DAT_00d1c4f8 = 0x51ca212a0a499ce6;
    DAT_00d1c500 = 0x694997f4;
    __cxa_atexit(&LAB_00817f88,&DAT_00d1c4f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c508);
  }
  if (DAT_00d1c504 == '\x01') {
    DAT_00d1c504 = '\0';
    DAT_00d1c4f8 = DAT_00d1c4f8 ^ 0x25b94f45693df995;
    DAT_00d1c500 = DAT_00d1c500 ^ 0x693df995;
  }
  FUN_008ac76c(param_1,&LAB_00817864,&DAT_00d1c4f8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817864;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c4f8);
  if (((DAT_00d1c520 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c520), iVar3 != 0)) {
    DAT_00d1c510 = 0xe63b12679b11ba10;
    _DAT_00d1c518 = 0x177;
    __cxa_atexit(&LAB_00817f94,&DAT_00d1c510,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c520);
  }
  if (DAT_00d1c519 == '\x01') {
    DAT_00d1c510 = DAT_00d1c510 ^ 0x894f7d15eb65df77;
    _DAT_00d1c518 = (ushort)(DAT_00d1c518 ^ 0x77);
  }
  FUN_008ac76c(param_1,&LAB_00817940,&DAT_00d1c510,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817940;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c510);
  if (((DAT_00d1c538 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c538), iVar3 != 0)) {
    DAT_00d1c532 = '\x01';
    DAT_00d1c528 = 0x6a775a43d1677032;
    _DAT_00d1c530 = 0x1526;
    __cxa_atexit(&LAB_00817fa0,&DAT_00d1c528,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c538);
  }
  if (DAT_00d1c532 == '\x01') {
    DAT_00d1c532 = '\0';
    DAT_00d1c528 = DAT_00d1c528 ^ 0x5033531a1131555;
    _DAT_00d1c530 = _DAT_00d1c530 ^ 0x1555;
  }
  FUN_008ac76c(param_1,&LAB_00817a2c,&DAT_00d1c528,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817a2c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c528);
  if (((DAT_00d1c550 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c550), iVar3 != 0)) {
    DAT_00d1c540 = 0x5620aa5352f390be;
    _DAT_00d1c548 = 0x1d9;
    __cxa_atexit(&LAB_00817fac,&DAT_00d1c540,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c550);
  }
  if (DAT_00d1c549 == '\x01') {
    DAT_00d1c540 = DAT_00d1c540 ^ 0x3d43cb272187f5d9;
    _DAT_00d1c548 = (ushort)(DAT_00d1c548 ^ 0xd9);
  }
  FUN_008ac76c(param_1,&LAB_00817af0,&DAT_00d1c540,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817af0;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c540);
  if (((DAT_00d1c568 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c568), iVar3 != 0)) {
    DAT_00d1c558 = 0x42aeac39b48b984c;
    _DAT_00d1c560 = 0x13f;
    __cxa_atexit(&LAB_00817fb8,&DAT_00d1c558,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c568);
  }
  if (DAT_00d1c561 == '\x01') {
    DAT_00d1c558 = DAT_00d1c558 ^ 0x29cdcd4dc7fffd3f;
    _DAT_00d1c560 = (ushort)(DAT_00d1c560 ^ 0x3f);
  }
  FUN_008ac76c(param_1,&LAB_00817c00,&DAT_00d1c558,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817c00;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c558);
  if (((DAT_00d1c580 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c580), iVar3 != 0)) {
    DAT_00d1c57c = '\x01';
    DAT_00d1c570 = 0xa236224849bb2a7e;
    DAT_00d1c578 = 0x3bb63d6d;
    __cxa_atexit(&LAB_00817fc4,&DAT_00d1c570,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c580);
  }
  if (DAT_00d1c57c == '\x01') {
    DAT_00d1c57c = '\0';
    DAT_00d1c570 = DAT_00d1c570 ^ 0xd15f452d3bcf4f19;
    DAT_00d1c578 = DAT_00d1c578 ^ 0x3bcf4f19;
  }
  FUN_008ac76c(param_1,&LAB_00817ce8,&DAT_00d1c570,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1c358,&local_40,&local_40);
  local_40 = &LAB_00817ce8;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c570);
  if (((DAT_00d1c590 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c590), iVar3 != 0)) {
    DAT_00d1c58e = '\x01';
    DAT_00d1c588 = 0xf4f14c2f;
    _DAT_00d1c58c = 0x6b0c;
    __cxa_atexit(&LAB_00817fd0,&DAT_00d1c588,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c590);
  }
  if (DAT_00d1c58e == '\x01') {
    DAT_00d1c58e = '\0';
    _DAT_00d1c58c = _DAT_00d1c58c ^ 0x6b6b;
    DAT_00d1c588 = DAT_00d1c588 ^ 0x8193294b;
  }
  FUN_00807e7c(param_1,&DAT_00d1c588);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

