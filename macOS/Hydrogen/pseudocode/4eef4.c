
void FUN_0004eef4(undefined8 *param_1)

{
  long lVar1;
  long *unaff_x20;
  
  *param_1 = &UNK_009b7ab0;
  param_1[0x34] = &UNK_009b7ad8;
  __ZNSt3__18ios_base4initEPv();
  unaff_x20[0x45] = 0;
  *(undefined4 *)(unaff_x20 + 0x46) = 0xffffffff;
  *unaff_x20 = (long)&UNK_009b7a40;
  unaff_x20[0x34] = (long)&UNK_009b7a68;
  func_0x0004f298(param_1 + 1);
  lVar1 = func_0x0004f038(param_1 + 1);
  if (lVar1 == 0) {
    lVar1 = (long)unaff_x20 + *(long *)(*unaff_x20 + -0x18);
    __ZNSt3__18ios_base5clearEj(lVar1,*(uint *)(lVar1 + 0x20) | 4);
  }
  return;
}

