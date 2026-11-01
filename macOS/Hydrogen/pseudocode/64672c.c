
undefined8 FUN_0064672c(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  int iVar5;
  long *plVar6;
  long *unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar7 [12];
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000070;
  undefined5 uStack0000000000000078;
  undefined3 uStack000000000000007d;
  undefined5 uStack0000000000000080;
  
  uStack0000000000000070 = *(undefined8 *)(param_1 + 0x729);
  uStack0000000000000078 = (undefined5)*(undefined8 *)(param_1 + 0x731);
  uStack000000000000007d = (undefined3)*(undefined8 *)(param_1 + 0x736);
  uStack0000000000000080 = (undefined5)((ulong)*(undefined8 *)(param_1 + 0x736) >> 0x18);
  do {
    func_0x006954a8();
    func_0x005edf2c(&uStack0000000000000028,1);
    uStack0000000000000028 = &UNK_00a0a3a0;
    func_0x00646a30(&uStack0000000000000028);
  } while (unaff_x19[2] == *unaff_x19 && unaff_x19[3] == unaff_x19[1]);
  uVar1 = __Znwm(0x98);
  lVar2 = __Znwm(0x58);
  func_0x00646f0c(lVar2,unaff_x19 + 2,0x10);
  plVar6 = unaff_x19;
  func_0x006a4044(uVar1,lVar2 + 8);
  iVar5 = (int)plVar6;
  uVar3 = 0;
  if (*(long **)(unaff_x21 + 8) != (long *)0x0) {
    uVar3 = (**(code **)(**(long **)(unaff_x21 + 8) + 8))();
  }
  *(undefined8 *)(unaff_x21 + 8) = uVar1;
  if (unaff_x20 != (undefined1 *)0x0) {
    unaff_x20[0x1f] = 0;
    unaff_x20[0x1e] = 0;
    unaff_x20[0x1d] = 0;
    unaff_x20[0x1c] = 0;
    unaff_x20[0x1b] = 0;
    unaff_x20[0x1a] = 0;
    unaff_x20[0x19] = 0;
    unaff_x20[0x18] = 0;
    unaff_x20[0x17] = 0;
    unaff_x20[0x16] = 0;
    unaff_x20[0x15] = 0;
    unaff_x20[0x14] = 0;
    unaff_x20[0x13] = 0;
    unaff_x20[0x12] = 0;
    unaff_x20[0x11] = 0;
    unaff_x20[0x10] = 0;
    unaff_x20[0xf] = 0;
    unaff_x20[0xe] = 0;
    unaff_x20[0xd] = 0;
    unaff_x20[0xc] = 0;
    unaff_x20[0xb] = 0;
    unaff_x20[10] = 0;
    unaff_x20[9] = 0;
    unaff_x20[8] = 0;
    unaff_x20[7] = 0;
    unaff_x20[6] = 0;
    unaff_x20[5] = 0;
    unaff_x20[4] = 0;
    unaff_x20[3] = 0;
    unaff_x20[2] = 0;
    unaff_x20[1] = 0;
    *unaff_x20 = 0;
    uVar3 = func_0x00611644();
  }
  if (unaff_x19 != (long *)0x0) {
    *(undefined1 *)((long)unaff_x19 + 0x1f) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x1e) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x1d) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x1c) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x1b) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x1a) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x19) = 0;
    *(undefined1 *)(unaff_x19 + 3) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x17) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x16) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x15) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x14) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x13) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x12) = 0;
    *(undefined1 *)((long)unaff_x19 + 0x11) = 0;
    *(undefined1 *)(unaff_x19 + 2) = 0;
    *(undefined1 *)((long)unaff_x19 + 0xf) = 0;
    *(undefined1 *)((long)unaff_x19 + 0xe) = 0;
    *(undefined1 *)((long)unaff_x19 + 0xd) = 0;
    *(undefined1 *)((long)unaff_x19 + 0xc) = 0;
    *(undefined1 *)((long)unaff_x19 + 0xb) = 0;
    *(undefined1 *)((long)unaff_x19 + 10) = 0;
    *(undefined1 *)((long)unaff_x19 + 9) = 0;
    *(undefined1 *)(unaff_x19 + 1) = 0;
    *(undefined1 *)((long)unaff_x19 + 7) = 0;
    *(undefined1 *)((long)unaff_x19 + 6) = 0;
    *(undefined1 *)((long)unaff_x19 + 5) = 0;
    *(undefined1 *)((long)unaff_x19 + 4) = 0;
    *(undefined1 *)((long)unaff_x19 + 3) = 0;
    *(undefined1 *)((long)unaff_x19 + 2) = 0;
    *(undefined1 *)((long)unaff_x19 + 1) = 0;
    *(undefined1 *)unaff_x19 = 0;
    uVar3 = func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar3;
  }
  auVar7 = ___stack_chk_fail();
  uVar3 = auVar7._0_8_;
  if (auVar7._8_4_ != 0) {
    uVar3 = func_0x0001753c(uVar3);
    __ZdlPv(lVar2);
    __ZdlPv(uVar1);
    func_0x0003e9ec(&uStack0000000000000030);
    func_0x0003e9ec(&uStack0000000000000050);
  }
  auVar8 = __Unwind_Resume(uVar3);
  uVar3 = auVar8._0_8_;
  puVar4 = (undefined8 *)func_0x005edf2c(uVar3,1);
  *puVar4 = &UNK_009fd3d8;
  puVar4[1] = 0;
  if (iVar5 != 0) {
    func_0x006466b0(uVar3,auVar8._8_8_,0,0);
  }
  return uVar3;
}

