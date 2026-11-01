
undefined8 FUN_0027f7fc(void)

{
  char *pcVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  short *psVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  byte *pbVar9;
  long *unaff_x19;
  ulong *unaff_x21;
  char *unaff_x22;
  int unaff_w23;
  ulong uVar10;
  char *pcVar11;
  ulong uVar12;
  char *pcVar13;
  long unaff_x25;
  long lVar14;
  undefined8 uStack0000000000000008;
  
  do {
    uVar3 = func_0x0027e418();
    if ((int)uVar3 < 1) {
      if ((unaff_w23 < 1) && (uVar3 == 0)) {
        uVar7 = 0x7b;
        uVar8 = 699;
      }
      else {
        uVar7 = 0xa2;
        uVar8 = 0x2bd;
      }
      goto LAB_0027fad8;
    }
    unaff_x25 = unaff_x25 - (ulong)uVar3;
  } while (unaff_x25 != 0);
  if (((uStack0000000000000008._2_1_ ^ 0xff) & 0x1f) == 0) {
    uVar7 = 0x6d;
    uVar8 = 0x2c7;
    goto LAB_0027fad8;
  }
  uVar10 = (ulong)uStack0000000000000008._3_1_;
  if (uStack0000000000000008._2_2_ < 0) {
    uVar12 = uVar10 & 0x7f;
    iVar4 = (int)uVar12;
    if (((uStack0000000000000008._2_1_ >> 5 & 1) != 0) && (iVar4 == 0)) {
      pcVar11 = unaff_x22;
      if ("rameworks/CoreFoundation.framework/Versions/A/CoreFoundation" < unaff_x22) {
        pcVar11 = "ameworks/CoreFoundation.framework/Versions/A/CoreFoundation";
      }
      if ((char *)0x1 < pcVar11) {
        psVar5 = (short *)func_0x0036e274(pcVar11);
        *unaff_x19 = (long)psVar5;
        if (psVar5 != (short *)0x0) {
          *psVar5 = uStack0000000000000008._2_2_;
          if (pcVar11 != (char *)0x2) {
            pcVar13 = (char *)0x2;
            do {
              iVar4 = func_0x0027e418();
              if (iVar4 == -1) break;
              if (iVar4 == 0) {
                *unaff_x21 = (ulong)pcVar13;
                return 1;
              }
              pcVar13 = pcVar13 + iVar4;
              if ((pcVar11 < unaff_x22) && ((ulong)((long)pcVar11 - (long)pcVar13) < 0x800)) {
                pcVar1 = pcVar11 + 0x1000;
                bVar2 = pcVar11 < (char *)0xfffffffffffff000;
                pcVar11 = unaff_x22;
                if (pcVar1 <= unaff_x22 && bVar2) {
                  pcVar11 = pcVar1;
                }
                lVar14 = func_0x0036e48c(*unaff_x19,pcVar11);
                if (lVar14 == 0) break;
                *unaff_x19 = lVar14;
              }
            } while (pcVar13 != pcVar11);
          }
          func_0x0036e3d8(*unaff_x19);
        }
      }
      uVar7 = 0xa2;
      uVar8 = 0x2d7;
      goto LAB_0027fad8;
    }
    if (iVar4 - 5U < 0xfffffffc) {
      uVar7 = 0x6d;
      uVar8 = 0x2de;
      goto LAB_0027fad8;
    }
    uVar3 = func_0x0027e418();
    if ((int)uVar3 < 1) {
LAB_0027fac0:
      uVar7 = 0xa2;
      uVar8 = 0x2e3;
      goto LAB_0027fad8;
    }
    lVar14 = uVar12 - uVar3;
    if (lVar14 == 0) {
LAB_0027fa50:
      uVar10 = 0;
      lVar14 = uVar12 + 2;
      pbVar9 = (byte *)((long)&uStack0000000000000008 + 4);
      do {
        uVar3 = (uint)*pbVar9 | (int)uVar10 << 8;
        uVar10 = (ulong)uVar3;
        uVar12 = uVar12 - 1;
        pbVar9 = pbVar9 + 1;
      } while (uVar12 != 0);
      if (0x7f < uVar3) {
        if (uVar3 >> (ulong)(iVar4 * 8 - 8U & 0x1f) == 0) {
          uVar7 = 0x6d;
          uVar8 = 0x2f6;
          goto LAB_0027fad8;
        }
        goto code_r0x0027f898;
      }
    }
    else {
      do {
        uVar3 = func_0x0027e418();
        if ((int)uVar3 < 1) goto LAB_0027fac0;
        lVar14 = lVar14 - (ulong)uVar3;
      } while (lVar14 != 0);
      if (iVar4 != 0) goto LAB_0027fa50;
    }
    uVar7 = 0x6d;
    uVar8 = 0x2f0;
  }
  else {
    lVar14 = 2;
code_r0x0027f898:
    if (uVar10 >> 0x1f == 0 && (char *)(lVar14 + uVar10) <= unaff_x22) {
      *unaff_x21 = lVar14 + uVar10;
      lVar6 = func_0x0036e274();
      *unaff_x19 = lVar6;
      if (lVar6 == 0) {
        return 0;
      }
      _memcpy(lVar6,(long)&uStack0000000000000008 + 2,lVar14);
      if (uVar10 == 0) {
        return 1;
      }
      uVar3 = func_0x0027e418();
      if (0 < (int)uVar3) {
        lVar14 = uVar10 - uVar3;
        if (lVar14 == 0) {
          return 1;
        }
        while (uVar3 = func_0x0027e418(), 0 < (int)uVar3) {
          lVar14 = lVar14 - (ulong)uVar3;
          if (lVar14 == 0) {
            return 1;
          }
        }
      }
      func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x30c);
      func_0x0036e3d8(*unaff_x19);
      return 0;
    }
    uVar7 = 0xb1;
    uVar8 = 0x300;
  }
LAB_0027fad8:
  func_0x0028f83c(0xc,0,uVar7,"/aws-lc/crypto/bio/bio.c",uVar8);
  return 0;
}

