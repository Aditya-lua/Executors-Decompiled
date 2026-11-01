
long FUN_004b5d08(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 extraout_x8;
  code *unaff_x20;
  undefined1 auVar3 [16];
  
  auVar3 = (*unaff_x20)(param_1);
  puVar2 = auVar3._0_8_;
  *puVar2 = 1;
  puVar2[1] = extraout_x8;
  puVar2[2] = auVar3._8_8_;
  lVar1 = (*unaff_x20)();
  return lVar1 + 8;
}

