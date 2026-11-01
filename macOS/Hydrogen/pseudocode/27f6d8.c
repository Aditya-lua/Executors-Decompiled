
undefined8 FUN_0027f6d8(long param_1,ulong *param_2,undefined8 param_3,char *param_4)

{
  char *pcVar1;
  ulong *puVar2;
  bool bVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  short *psVar7;
  long lVar8;
  long *plVar9;
  ulong *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  byte *pbVar13;
  undefined4 uVar14;
  char *pcVar15;
  ulong uVar16;
  char *pcVar17;
  ulong uVar18;
  long lVar19;
  undefined1 auVar20 [16];
  undefined2 uStack_56;
  byte abStack_54 [4];
  
  if (param_2 != (ulong *)0x0) {
    do {
      puVar2 = param_2;
      if ((ulong *)0x7ffffffe < param_2) {
        puVar2 = (ulong *)0x7fffffff;
      }
      puVar10 = puVar2;
      uVar4 = func_0x0027e76c(param_3,param_1);
      if ((int)puVar2 < (int)uVar4) {
        auVar20 = func_0x0079d038();
        plVar9 = auVar20._8_8_;
        uVar11 = auVar20._0_8_;
        uVar5 = func_0x0027e418(uVar11,&uStack_56,2);
        uVar4 = uVar5;
        if ((int)uVar5 < 1) goto LAB_0027f848;
        if (uVar5 == 2) goto code_r0x0027f818;
        uVar18 = 2 - (ulong)uVar5;
        pbVar13 = abStack_54 + ((ulong)uVar5 - 2);
        goto LAB_0027f7e8;
      }
      if ((int)uVar4 < 1) {
        func_0x0028f83c(0xc,0,0x6b,"/aws-lc/crypto/bio/bio.c",0x130);
        return 0;
      }
      param_1 = param_1 + (ulong)uVar4;
      param_2 = (ulong *)((long)param_2 - (ulong)uVar4);
    } while (param_2 != (ulong *)0x0);
  }
  return 1;
LAB_0027f848:
  if (((int)uVar5 < 1) && (uVar4 == 0)) {
    uVar11 = 0x7b;
    uVar12 = 699;
  }
  else {
    uVar11 = 0xa2;
    uVar12 = 0x2bd;
  }
  goto LAB_0027fad8;
  while( true ) {
    pbVar13 = pbVar13 + uVar4;
    uVar18 = uVar18 - uVar4;
    if (uVar18 == 0) break;
LAB_0027f7e8:
    uVar14 = (undefined4)uVar18;
    if (uVar18 >> 0x1f != 0) {
      uVar14 = 0x7fffffff;
    }
    uVar4 = func_0x0027e418(uVar11,pbVar13,uVar14);
    if ((int)uVar4 < 1) goto LAB_0027f848;
  }
code_r0x0027f818:
  if ((((byte)uStack_56 ^ 0xff) & 0x1f) == 0) {
    uVar11 = 0x6d;
    uVar12 = 0x2c7;
    goto LAB_0027fad8;
  }
  uVar18 = (ulong)uStack_56._1_1_;
  if (uStack_56 < 0) {
    uVar16 = uVar18 & 0x7f;
    iVar6 = (int)uVar16;
    if ((((byte)uStack_56 >> 5 & 1) != 0) && (iVar6 == 0)) {
      pcVar15 = param_4;
      if ("rameworks/CoreFoundation.framework/Versions/A/CoreFoundation" < param_4) {
        pcVar15 = "ameworks/CoreFoundation.framework/Versions/A/CoreFoundation";
      }
      if ((char *)0x1 < pcVar15) {
        psVar7 = (short *)func_0x0036e274(pcVar15);
        *plVar9 = (long)psVar7;
        if (psVar7 != (short *)0x0) {
          *psVar7 = uStack_56;
          if (pcVar15 != (char *)0x2) {
            pcVar17 = (char *)0x2;
            do {
              uVar18 = (long)pcVar15 - (long)pcVar17;
              if (0x7ffffffe < uVar18) {
                uVar18 = 0x7fffffff;
              }
              iVar6 = func_0x0027e418(uVar11,pcVar17 + *plVar9,uVar18);
              if (iVar6 == -1) break;
              if (iVar6 == 0) {
                *puVar10 = (ulong)pcVar17;
                return 1;
              }
              pcVar17 = pcVar17 + iVar6;
              if ((pcVar15 < param_4) && ((ulong)((long)pcVar15 - (long)pcVar17) < 0x800)) {
                pcVar1 = pcVar15 + 0x1000;
                bVar3 = pcVar15 < (char *)0xfffffffffffff000;
                pcVar15 = param_4;
                if (pcVar1 <= param_4 && bVar3) {
                  pcVar15 = pcVar1;
                }
                lVar19 = func_0x0036e48c(*plVar9,pcVar15);
                if (lVar19 == 0) break;
                *plVar9 = lVar19;
              }
            } while (pcVar17 != pcVar15);
          }
          func_0x0036e3d8(*plVar9);
        }
      }
      uVar11 = 0xa2;
      uVar12 = 0x2d7;
      goto LAB_0027fad8;
    }
    if (iVar6 - 5U < 0xfffffffc) {
      uVar11 = 0x6d;
      uVar12 = 0x2de;
      goto LAB_0027fad8;
    }
    uVar4 = func_0x0027e418(uVar11,abStack_54,uVar16);
    if ((int)uVar4 < 1) {
LAB_0027fac0:
      uVar11 = 0xa2;
      uVar12 = 0x2e3;
      goto LAB_0027fad8;
    }
    uVar18 = uVar16 - uVar4;
    if (uVar18 == 0) {
LAB_0027fa50:
      uVar18 = 0;
      lVar19 = uVar16 + 2;
      pbVar13 = abStack_54;
      do {
        uVar4 = (uint)*pbVar13 | (int)uVar18 << 8;
        uVar18 = (ulong)uVar4;
        uVar16 = uVar16 - 1;
        pbVar13 = pbVar13 + 1;
      } while (uVar16 != 0);
      if (0x7f < uVar4) {
        if (uVar4 >> (ulong)(iVar6 * 8 - 8U & 0x1f) == 0) {
          uVar11 = 0x6d;
          uVar12 = 0x2f6;
          goto LAB_0027fad8;
        }
        goto code_r0x0027f898;
      }
    }
    else {
      pbVar13 = abStack_54 + uVar4;
      do {
        uVar14 = (undefined4)uVar18;
        if (uVar18 >> 0x1f != 0) {
          uVar14 = 0x7fffffff;
        }
        uVar4 = func_0x0027e418(uVar11,pbVar13,uVar14);
        if ((int)uVar4 < 1) goto LAB_0027fac0;
        pbVar13 = pbVar13 + uVar4;
        uVar18 = uVar18 - uVar4;
      } while (uVar18 != 0);
      if (iVar6 != 0) goto LAB_0027fa50;
    }
    uVar11 = 0x6d;
    uVar12 = 0x2f0;
  }
  else {
    lVar19 = 2;
code_r0x0027f898:
    if (uVar18 >> 0x1f == 0 && (char *)(lVar19 + uVar18) <= param_4) {
      *puVar10 = lVar19 + uVar18;
      lVar8 = func_0x0036e274();
      *plVar9 = lVar8;
      if (lVar8 == 0) {
        return 0;
      }
      _memcpy(lVar8,&uStack_56,lVar19);
      if (uVar18 == 0) {
        return 1;
      }
      lVar8 = *plVar9;
      uVar4 = func_0x0027e418(uVar11,lVar8 + lVar19,uVar18);
      if (0 < (int)uVar4) {
        uVar18 = uVar18 - uVar4;
        if (uVar18 == 0) {
          return 1;
        }
        lVar19 = lVar8 + lVar19 + (ulong)uVar4;
        while( true ) {
          uVar14 = (undefined4)uVar18;
          if (uVar18 >> 0x1f != 0) {
            uVar14 = 0x7fffffff;
          }
          uVar4 = func_0x0027e418(uVar11,lVar19,uVar14);
          if ((int)uVar4 < 1) break;
          lVar19 = lVar19 + (ulong)uVar4;
          uVar18 = uVar18 - uVar4;
          if (uVar18 == 0) {
            return 1;
          }
        }
      }
      func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x30c);
      func_0x0036e3d8(*plVar9);
      return 0;
    }
    uVar11 = 0xb1;
    uVar12 = 0x300;
  }
LAB_0027fad8:
  func_0x0028f83c(0xc,0,uVar11,"/aws-lc/crypto/bio/bio.c",uVar12);
  return 0;
}

