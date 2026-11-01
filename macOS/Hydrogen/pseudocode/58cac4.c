
void FUN_0058cac4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 *extraout_x8;
  long lVar2;
  undefined1 auVar3 [12];
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000070;
  undefined4 uStack_34;
  
  func_0x004b92d8(&uStack0000000000000070);
  func_0x0058af20(&uStack0000000000000008);
  auVar3 = __Unwind_Resume(param_1);
  uStack_34 = auVar3._8_4_;
  lVar1 = func_0x00578704(auVar3._0_8_,&uStack_34);
  if (lVar1 == 0) {
    lVar1 = 4;
    lVar2 = 4;
  }
  else {
    lVar2 = *(long *)(lVar1 + 8);
    lVar1 = lVar2 + *(long *)(lVar1 + 0x10) * 8;
  }
  extraout_x8[1] = lVar2;
  extraout_x8[2] = lVar1;
  *(int *)(extraout_x8 + 3) = auVar3._8_4_;
  *extraout_x8 = param_3;
  return;
}

