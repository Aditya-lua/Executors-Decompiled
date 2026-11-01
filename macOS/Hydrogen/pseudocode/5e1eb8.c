
undefined1  [16] FUN_005e1eb8(long param_1,long param_2,long param_3,long param_4)

{
  uint uVar1;
  uint uVar2;
  byte *pbVar3;
  bool in_ZR;
  undefined8 uVar4;
  byte *pbVar5;
  undefined1 auVar6 [16];
  
  if (!in_ZR) {
    param_2 = 0;
    pbVar5 = (byte *)(param_1 + param_3);
    uVar4 = 1;
    do {
      uVar1 = (uint)*pbVar5;
      pbVar3 = pbVar5 + 1;
      if ((char)*pbVar5 < '\0') {
        if (uVar1 < 0xe0) {
          uVar1 = pbVar5[1] & 0x3f | (uVar1 & 0x1f) << 6;
          pbVar3 = pbVar5 + 2;
        }
        else {
          uVar2 = pbVar5[2] & 0x3f | (pbVar5[1] & 0x3f) << 6;
          if (uVar1 < 0xf0) {
            uVar1 = uVar2 | (uVar1 & 0x1f) << 0xc;
            pbVar3 = pbVar5 + 3;
          }
          else {
            uVar1 = pbVar5[3] & 0x3f | uVar2 << 6 | (uVar1 & 7) << 0x12;
            pbVar3 = pbVar5 + 4;
          }
        }
      }
      pbVar5 = pbVar3;
      if (uVar1 != 0x20) goto LAB_005e1f6c;
      param_2 = param_2 + 1;
    } while (pbVar5 != (byte *)(param_1 + param_4));
  }
  uVar4 = 0;
LAB_005e1f6c:
  auVar6._8_8_ = param_2;
  auVar6._0_8_ = uVar4;
  return auVar6;
}

