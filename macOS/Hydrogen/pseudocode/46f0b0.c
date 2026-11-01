
uint FUN_0046f0b0(uint param_1,undefined8 param_2,uint param_3)

{
  uint uVar1;
  uint in_w9;
  
  uVar1 = 0;
  if (in_w9 != 0) {
    uVar1 = (param_1 & 0xff | (param_3 & 0xff) << 8) / in_w9;
  }
  return uVar1;
}

