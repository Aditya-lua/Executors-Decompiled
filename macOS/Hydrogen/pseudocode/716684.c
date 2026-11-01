
void thunk_FUN_007166f8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                       undefined8 param_5)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long *extraout_x8;
  long *plVar4;
  long lVar5;
  long extraout_x9;
  long unaff_x29;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000000;
  
  func_0x0071b3a8(unaff_x29 + -0xa0);
  uVar2 = __Unwind_Resume(param_1);
  plVar4 = *(long **)(unaff_x29 + -0xa0);
  lVar5 = *plVar4 + *(long *)(unaff_x29 + -0x98) * 0x28;
  if (lVar5 == plVar4[1]) {
    __Unwind_Resume(uVar2);
    plVar4 = extraout_x8;
    lVar5 = extraout_x9;
  }
  plVar4[1] = lVar5;
  auVar6 = __Unwind_Resume(uVar2);
  lVar3 = auVar6._0_8_;
  func_0x00724748(lVar3,auVar6._8_8_,param_5,&uStack0000000000000000);
  lVar5 = *(long *)(lVar3 + 0x1a8);
  lVar1 = *(long *)(lVar3 + 0x1b0);
  uVar2 = func_0x00704c24(*(undefined8 *)(lVar3 + 0xd8),0x48);
  func_0x00707c78(uVar2,auVar6._8_8_,param_3,param_4,
                  (int)((ulong)(lVar1 - lVar5) >> 4) * -0x55555555 + -1);
  return;
}

