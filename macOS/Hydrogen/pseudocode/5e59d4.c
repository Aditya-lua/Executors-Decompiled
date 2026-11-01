
long FUN_005e59d4(void)

{
  byte *pbVar1;
  long lVar2;
  undefined2 *puVar3;
  undefined8 extraout_x8;
  undefined8 uVar4;
  undefined8 extraout_x8_00;
  code *extraout_x9;
  code *pcVar5;
  code *extraout_x9_00;
  long unaff_x19;
  undefined8 unaff_x20;
  
  func_0x00187bd4();
  func_0x00187bd4();
  *(undefined8 *)(unaff_x19 + 8) = unaff_x20;
  __Unwind_Resume();
  pbVar1 = (byte *)(*pcRam0000000000a2bdc0)(0xa2bdc0);
  uVar4 = extraout_x8;
  pcVar5 = extraout_x9;
  if ((*pbVar1 & 1) == 0) {
    puVar3 = (undefined2 *)(*extraout_x9)(extraout_x8);
    *puVar3 = 1;
    uVar4 = extraout_x8_00;
    pcVar5 = extraout_x9_00;
  }
  lVar2 = (*pcVar5)(uVar4);
  return lVar2 + 1;
}

