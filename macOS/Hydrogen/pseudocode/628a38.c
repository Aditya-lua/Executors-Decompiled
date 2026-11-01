
void FUN_00628a38(long param_1,long param_2,long param_3)

{
  long lVar1;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *plVar2;
  
  plVar2 = (long *)(unaff_x21 + 8);
  *plVar2 = in_x9;
  *(undefined8 *)(param_2 + 0x10) = *(undefined8 *)(param_3 + 0x70);
  *(undefined8 *)(param_2 + *(long *)(param_1 + -0x18)) = *(undefined8 *)(param_3 + 0x78);
  func_0x00621dd4(param_2 + 0xf8);
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *plVar2 = lVar1;
  *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(unaff_x19 + 0x58);
  *(undefined8 *)((long)plVar2 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(unaff_x19 + 0x60);
  func_0x0065a978(unaff_x20 + 0x18);
  return;
}

