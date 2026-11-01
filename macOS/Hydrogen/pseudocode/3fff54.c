
undefined8 FUN_003fff54(long param_1,ulong param_2,long param_3)

{
  ulong uVar1;
  uint uVar2;
  undefined1 uVar3;
  uint in_w8;
  long lVar4;
  uint in_w10;
  ulong in_x14;
  
  uVar2 = in_w8 & 0xffe00000 | in_w8 & 0x3ffff | (in_w10 & 7) << 0x12;
  if ((in_x14 & 1) == 0) {
    if (uVar2 < 0x80) {
      lVar4 = 1;
    }
    else if (uVar2 < 0x800) {
      lVar4 = 2;
    }
    else {
      lVar4 = 3;
      if (0xffff < uVar2) {
        lVar4 = 4;
      }
    }
    uVar1 = lVar4 + param_3;
    if (uVar1 != 0) {
      uVar3 = uVar1 == param_2;
      if (param_2 <= uVar1) goto LAB_003fffc8;
      uVar3 = *(char *)(param_1 + uVar1) == -0x40;
      if (*(char *)(param_1 + uVar1) < -0x40) {
        do {
          func_0x007a297c();
LAB_003fffc8:
        } while (!(bool)uVar3);
      }
    }
  }
  return 1;
}

