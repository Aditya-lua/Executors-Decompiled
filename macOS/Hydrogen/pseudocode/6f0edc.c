
void FUN_006f0edc(long param_1,undefined8 param_2,long param_3,undefined8 *param_4)

{
  byte in_w9;
  
  *(byte *)(param_3 + 1) = in_w9 & 0xfb;
  *param_4 = *(undefined8 *)(param_1 + 0x30);
  *(long *)(param_1 + 0x30) = param_3;
  return;
}

