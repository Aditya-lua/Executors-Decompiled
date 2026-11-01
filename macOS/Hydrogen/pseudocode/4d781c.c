
long FUN_004d781c(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 extraout_x8;
  undefined8 *in_x9;
  uint in_w10;
  code *unaff_x20;
  undefined1 auVar3 [16];
  
  *in_x9 = 0;
  if ((in_w10 & 1) == 0) {
    param_1 = func_0x0042b2b8();
  }
  auVar3 = (*unaff_x20)(param_1);
  puVar2 = auVar3._0_8_;
  *puVar2 = 1;
  puVar2[1] = extraout_x8;
  puVar2[2] = auVar3._8_8_;
  lVar1 = (*unaff_x20)();
  return lVar1 + 8;
}

