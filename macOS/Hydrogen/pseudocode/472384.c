
bool FUN_00472384(byte *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  uint in_w9;
  
  do {
    uVar1 = ((in_w9 & 0xff) + (in_w9 & 0xff) * 4) * 2;
    uVar2 = *param_1 - 0x30;
    if (9 < uVar2) {
      return true;
    }
    if ((uVar1 & 0xf00) != 0) {
      return true;
    }
    in_w9 = uVar1 + uVar2;
    param_2 = param_2 + -1;
    if ((uVar1 & 0xff) + (uVar2 & 0xff) >> 8 != 0) {
      return true;
    }
    param_1 = param_1 + 1;
  } while (param_2 != 0);
  return (in_w9 & 0xff) == 0;
}

