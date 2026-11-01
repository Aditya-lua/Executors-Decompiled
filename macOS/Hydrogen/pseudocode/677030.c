
int FUN_00677030(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  int in_w8;
  long in_x9;
  ulong uVar4;
  uint uVar5;
  long in_x10;
  uint uVar6;
  long in_x11;
  long in_x12;
  
  do {
    if (in_x11 + in_x10 == 0) {
      return 0;
    }
    lVar1 = in_x10 * 8;
    in_w8 = in_w8 + 0x40;
    in_x10 = in_x10 + -1;
  } while (*(long *)(in_x12 + lVar1) == 0);
  if ((int)in_x11 + (int)in_x10 == -1) {
    return 0;
  }
  uVar4 = *(ulong *)(in_x9 + (ulong)(uint)((int)in_x11 + (int)in_x10) * 8);
  if (uVar4 == 0) {
    return -in_w8;
  }
  uVar6 = 0;
  uVar5 = 0x40;
  do {
    uVar3 = uVar6 + uVar5 >> 1;
    uVar2 = uVar3;
    if (uVar4 >> ((ulong)uVar3 & 0x3f) != 0) {
      uVar2 = uVar5;
      uVar6 = uVar3;
    }
    uVar5 = uVar2;
  } while (1 < uVar2 - uVar6);
  return uVar2 - in_w8;
}

