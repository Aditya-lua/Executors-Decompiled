
void FUN_00628a28(long *param_1,long param_2)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long *plVar2;
  
  lVar1 = *(long *)(param_2 + 8);
  *param_1 = lVar1;
  plVar2 = param_1 + 1;
  *plVar2 = *(long *)(param_2 + 0x68);
  param_1[2] = *(long *)(param_2 + 0x70);
  *(undefined8 *)((long)param_1 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(param_2 + 0x78);
  func_0x00621dd4(param_1 + 0x1f);
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *plVar2 = lVar1;
  *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(unaff_x19 + 0x58);
  *(undefined8 *)((long)plVar2 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(unaff_x19 + 0x60);
  func_0x0065a978(unaff_x20 + 0x18);
  return;
}

