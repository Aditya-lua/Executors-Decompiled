
undefined8 FUN_0029c2fc(ulong *param_1,undefined8 param_2,ulong param_3)

{
  ulong in_x9;
  long in_x10;
  ulong in_x12;
  
  while( true ) {
    in_x12 = in_x9 | in_x12;
    in_x10 = in_x10 + -1;
    if (in_x10 == 0) break;
    in_x9 = *param_1;
    param_1 = param_1 + 1;
  }
  if (in_x12 != 0) {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x142);
    return 0;
  }
  if ((param_3 & 0x1fffffffffffffff) != 0) {
    _bzero();
  }
  if ((param_3 & 0x1fffffffffffffff) != 0) {
    _memcpy();
  }
  return 1;
}

