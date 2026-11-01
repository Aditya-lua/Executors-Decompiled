
undefined8 FUN_00304b3c(undefined8 param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  ulong in_x9;
  long in_x10;
  long in_x12;
  
  uVar1 = 0;
  if ((((0xf < in_x9) && (param_3 != 0)) && (param_2 != 0)) && (*(long *)(in_x12 + 0x1f8) != 0)) {
    if (0x1000000 < in_x9) {
      func_0x0028f83c(0x1e,0,0x8b,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x2a1);
      return 0;
    }
    if ((bRam0000000000a334f8 >> 2 & 1) != 0) {
      if (*(int *)(in_x10 + 0x1c) == 0) {
        func_0x00379780(param_3,param_2);
        return 1;
      }
      func_0x00378ee0();
      return 1;
    }
    uVar1 = func_0x002f4e68(in_x12 + 0x1f0,in_x10 + 0x34,param_3,param_2);
  }
  return uVar1;
}

