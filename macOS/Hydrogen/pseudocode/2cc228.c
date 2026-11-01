
undefined8 FUN_002cc228(long param_1,ulong *param_2,undefined8 param_3,byte *param_4)

{
  int iVar1;
  long lVar2;
  long in_x9;
  ulong in_x10;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    in_x10 = (ulong)*param_4 | in_x10 << 8;
    param_4 = param_4 + 1;
  }
  *param_2 = in_x10;
  lVar2 = (in_x9 + -1) * 8;
  if (lVar2 != 0) {
    _bzero(param_2 + 1,lVar2);
  }
  iVar1 = func_0x0029d99c();
  if (iVar1 < 0) {
    return 1;
  }
  func_0x0028f83c(0xf,0,0x80,"/aws-lc/crypto/fipsmodule/ec/simple.c",0x14b);
  return 0;
}

