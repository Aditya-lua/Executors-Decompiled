
uint FUN_002c0760(void)

{
  uint uVar1;
  bool in_ZR;
  bool in_CY;
  uint in_w8;
  int in_w15;
  
  uVar1 = in_w8 | in_w15 << 1;
  if (in_CY && !in_ZR) {
    uVar1 = uVar1 + 1;
  }
  return uVar1 + 7 >> 3;
}

