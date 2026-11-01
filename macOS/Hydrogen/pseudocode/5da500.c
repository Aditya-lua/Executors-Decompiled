
void FUN_005da500(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 extraout_x8_02;
  undefined8 uStack0000000000000008;
  undefined8 uStack_108;
  long lStack_100;
  long lStack_f8;
  undefined8 uStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  undefined8 uStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  
  lVar6 = *uStack0000000000000008;
  *uStack0000000000000008 = lVar6 + -1;
  LORelease();
  if (lVar6 == 1) {
    func_0x005d2ac4(&uStack0000000000000008);
  }
  __Unwind_Resume();
  lVar6 = func_0x007a2668();
  plVar7 = (long *)func_0x00187bd0(0x18,8);
  if (plVar7 != (long *)0x0) {
    *plVar7 = lVar6;
    plVar7[1] = lVar6 + 0x58;
    plVar7[2] = lVar6 + 0xb0;
    *extraout_x8 = 3;
    extraout_x8[1] = plVar7;
    extraout_x8[2] = 3;
    return;
  }
  lVar6 = func_0x007a1f18(8,0x18);
  plVar7 = (long *)func_0x00187bd0(0x18,8);
  if (plVar7 != (long *)0x0) {
    *plVar7 = lVar6 + 0x18;
    plVar7[1] = lVar6 + 0x70;
    plVar7[2] = lVar6 + 200;
    *extraout_x8_00 = 3;
    extraout_x8_00[1] = plVar7;
    extraout_x8_00[2] = 3;
    return;
  }
  lVar6 = func_0x007a1f18(8,0x18);
  plVar7 = (long *)func_0x00187bd0(0x18,8);
  if (plVar7 == (long *)0x0) {
    lVar8 = func_0x007a1f18(8,0x18);
    func_0x005c3198(&uStack_108,lVar8 + 0x18);
    lVar5 = lStack_f8;
    lVar3 = lStack_100;
    uVar1 = uStack_108;
    func_0x005c3198(&uStack_108,lVar8 + 0x70);
    lVar4 = lStack_100;
    uVar2 = uStack_108;
    lVar6 = lStack_100 + lStack_f8 * 8;
    func_0x005c3198(&uStack_108,lVar8 + 200);
    lVar8 = lStack_f8;
    uStack_b0 = uStack_108;
    lStack_f8 = lVar3;
    uStack_f0 = uVar1;
    lStack_d8 = lVar4;
    lStack_e0 = lVar4;
    uStack_d0 = uVar2;
    lStack_a8 = lStack_100 + lVar8 * 8;
    uStack_108 = 1;
    lStack_c0 = lStack_100;
    lStack_b8 = lStack_100;
    lStack_e8 = lVar3 + lVar5 * 8;
    lStack_c8 = lVar6;
    func_0x005a3308(extraout_x8_02,&uStack_108,&UNK_009f30a0);
    return;
  }
  *plVar7 = lVar6 + 0x18;
  plVar7[1] = lVar6 + 0x70;
  plVar7[2] = lVar6 + 200;
  *extraout_x8_01 = 3;
  extraout_x8_01[1] = plVar7;
  extraout_x8_01[2] = 3;
  return;
}

