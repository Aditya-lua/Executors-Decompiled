
void FUN_001ad788(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  func_0x0079b61c(param_1,param_2,0x20,1,1);
  lVar2 = *(long *)(unaff_x20 + 0x10);
  puVar1 = (undefined8 *)(*(long *)(unaff_x20 + 8) + lVar2);
  uVar3 = *unaff_x19;
  uVar5 = unaff_x19[3];
  uVar4 = unaff_x19[2];
  puVar1[1] = unaff_x19[1];
  *puVar1 = uVar3;
  puVar1[3] = uVar5;
  puVar1[2] = uVar4;
  *(long *)(unaff_x20 + 0x10) = lVar2 + 0x20;
  return;
}

