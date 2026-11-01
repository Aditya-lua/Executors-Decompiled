
undefined8 FUN_006e4bdc(long *param_1)

{
  bool in_ZR;
  long lVar1;
  long unaff_x19;
  
  if (!in_ZR) {
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return 0;
  }
  lVar1 = *(long *)(unaff_x19 + 8);
  *(undefined8 *)(*param_1 + 0x10) = *(undefined8 *)(lVar1 + -0x10);
  if (((*(byte *)(*param_1 + 1) >> 2 & 1) != 0) &&
     ((*(byte *)(*(long *)(lVar1 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48();
  }
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return 1;
}

