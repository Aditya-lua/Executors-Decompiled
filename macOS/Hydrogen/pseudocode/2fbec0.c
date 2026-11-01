
undefined8 FUN_002fbec0(long param_1)

{
  long lVar1;
  long unaff_x20;
  long *unaff_x21;
  undefined8 uVar2;
  
  lVar1 = *(long *)(unaff_x20 + 0x168);
  param_1 = param_1 - *(long *)(unaff_x20 + 0x170);
  *unaff_x21 = param_1;
  uVar2 = *(undefined8 *)(lVar1 + param_1 * 8);
  func_0x00373e0c();
  return uVar2;
}

