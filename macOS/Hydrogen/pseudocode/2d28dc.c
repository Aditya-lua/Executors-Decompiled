
int FUN_002d28dc(undefined8 param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  bool in_ZR;
  bool in_CY;
  uint in_w8;
  int in_w14;
  int in_w15;
  
  uVar2 = in_w8 | in_w14 << 2 | in_w15 << 1;
  if (in_CY && !in_ZR) {
    uVar2 = uVar2 + 1;
  }
  uVar1 = uVar2 + 7 >> 3;
  uVar2 = uVar1;
  if ((param_2 & 0xfffffffd) != 4) {
    uVar2 = 0;
  }
  return uVar1 + uVar2 + 1;
}

