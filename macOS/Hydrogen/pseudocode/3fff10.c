
undefined8 FUN_003fff10(long param_1,ulong param_2,long param_3)

{
  byte *pbVar1;
  ulong uVar2;
  uint uVar3;
  undefined1 uVar4;
  uint uVar5;
  long lVar6;
  ulong in_x14;
  
  pbVar1 = (byte *)(param_1 + param_3);
  uVar5 = (uint)*pbVar1;
  if ((char)*pbVar1 < '\0') {
    if (uVar5 < 0xe0) {
      uVar5 = pbVar1[1] & 0x3f | (uVar5 & 0x1f) << 6;
    }
    else {
      uVar3 = pbVar1[2] & 0x3f | (pbVar1[1] & 0x3f) << 6;
      if (uVar5 < 0xf0) {
        uVar5 = uVar3 | (uVar5 & 0x1f) << 0xc;
      }
      else {
        uVar5 = pbVar1[3] & 0x3f | uVar3 << 6 | (uVar5 & 7) << 0x12;
      }
    }
  }
  if ((in_x14 & 1) == 0) {
    if (uVar5 < 0x80) {
      lVar6 = 1;
    }
    else if (uVar5 < 0x800) {
      lVar6 = 2;
    }
    else {
      lVar6 = 3;
      if (0xffff < uVar5) {
        lVar6 = 4;
      }
    }
    uVar2 = lVar6 + param_3;
    if (uVar2 != 0) {
      uVar4 = uVar2 == param_2;
      if (param_2 <= uVar2) goto LAB_003fffc8;
      uVar4 = *(char *)(param_1 + uVar2) == -0x40;
      if (*(char *)(param_1 + uVar2) < -0x40) {
        do {
          func_0x007a297c();
LAB_003fffc8:
        } while (!(bool)uVar4);
      }
    }
  }
  return 1;
}

