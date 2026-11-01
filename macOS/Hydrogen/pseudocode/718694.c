
void FUN_00718694(void)

{
  long lVar1;
  long *plVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  undefined8 uVar3;
  
  lVar1 = func_0x0072344c();
  uVar3 = *(undefined8 *)(unaff_x20 + 0xa8);
  plVar2 = (long *)func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),8);
  *plVar2 = lVar1;
  *unaff_x19 = plVar2;
  unaff_x19[1] = 1;
  unaff_x19[2] = unaff_x22;
  unaff_x19[3] = uVar3;
  uVar3 = *(undefined8 *)(lVar1 + 0xc);
  unaff_x19[5] = *(undefined8 *)(lVar1 + 0x14);
  unaff_x19[4] = uVar3;
  return;
}

