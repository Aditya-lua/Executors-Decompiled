
undefined8 FUN_0027fa00(uint param_1)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  byte *pbVar6;
  long *unaff_x19;
  ulong *unaff_x21;
  long lVar7;
  ulong unaff_x22;
  uint uVar8;
  ulong uVar9;
  int iVar10;
  long unaff_x24;
  undefined1 uStack000000000000000a;
  byte bStack000000000000000c;
  
  if ((int)param_1 < 1) {
LAB_0027fac0:
    uVar4 = 0xa2;
    uVar5 = 0x2e3;
    goto LAB_0027fad8;
  }
  lVar7 = unaff_x24 - (ulong)param_1;
  iVar10 = (int)unaff_x24;
  if (lVar7 == 0) {
LAB_0027fa50:
    uVar9 = 0;
    lVar7 = unaff_x24 + 2;
    pbVar6 = &bStack000000000000000c;
    do {
      uVar8 = (uint)uVar9;
      uVar2 = (uint)*pbVar6 | uVar8 << 8;
      uVar9 = (ulong)uVar2;
      unaff_x24 = unaff_x24 + -1;
      pbVar6 = pbVar6 + 1;
    } while (unaff_x24 != 0);
    if (0x7f < uVar2) {
      if (uVar2 >> (ulong)(iVar10 * 8 - 8U & 0x1f) == 0) {
        uVar4 = 0x6d;
        uVar5 = 0x2f6;
      }
      else {
        uVar1 = lVar7 + uVar9;
        if ((uVar8 & 0xffffff) >> 0x17 == 0 && uVar1 <= unaff_x22) {
          *unaff_x21 = uVar1;
          lVar3 = func_0x0036e274();
          *unaff_x19 = lVar3;
          if (lVar3 == 0) {
            return 0;
          }
          _memcpy(lVar3,&uStack000000000000000a,lVar7);
          if (uVar9 == 0) {
            return 1;
          }
          uVar2 = func_0x0027e418();
          if (0 < (int)uVar2) {
            lVar7 = uVar9 - uVar2;
            if (lVar7 == 0) {
              return 1;
            }
            while (uVar2 = func_0x0027e418(), 0 < (int)uVar2) {
              lVar7 = lVar7 - (ulong)uVar2;
              if (lVar7 == 0) {
                return 1;
              }
            }
          }
          func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x30c);
          func_0x0036e3d8(*unaff_x19);
          return 0;
        }
        uVar4 = 0xb1;
        uVar5 = 0x300;
      }
      goto LAB_0027fad8;
    }
  }
  else {
    do {
      uVar2 = func_0x0027e418();
      if ((int)uVar2 < 1) goto LAB_0027fac0;
      lVar7 = lVar7 - (ulong)uVar2;
    } while (lVar7 != 0);
    if (iVar10 != 0) goto LAB_0027fa50;
  }
  uVar4 = 0x6d;
  uVar5 = 0x2f0;
LAB_0027fad8:
  func_0x0028f83c(0xc,0,uVar4,"/aws-lc/crypto/bio/bio.c",uVar5);
  return 0;
}

