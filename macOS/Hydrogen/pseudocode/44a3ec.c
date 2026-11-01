
bool FUN_0044a3ec(uint *param_1,int param_2)

{
  uint uVar1;
  bool bVar2;
  int in_w8;
  uint uVar3;
  int in_w9;
  int in_w10;
  int in_w11;
  int in_w12;
  int in_w13;
  int in_w14;
  int in_w15;
  int in_w16;
  int in_w17;
  
  if (param_2 == in_w9 + 0x420000) {
    bVar2 = true;
  }
  else if (*param_1 == in_w10 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w11 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w12 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w13 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w14 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w15 + 0x420000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w16 + 0x400000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w17 - 0x10000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w8 + 0x410000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w9 + 0x410000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w10 + 0x410000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w11 + 0x410000U) {
    bVar2 = true;
  }
  else if (*param_1 == in_w12 + 0x410000U) {
    bVar2 = true;
  }
  else {
    uVar3 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
    uVar1 = uVar3 >> 0x10 | uVar3 << 0x10;
    uVar3 = (uint)(0x24667337 < uVar1);
    if (uVar1 < 0x24667337) {
      uVar3 = 0xffffffff;
    }
    bVar2 = uVar3 == 0;
  }
  return bVar2;
}

