
/* WARNING: Possible PIC construction at 0x00073458: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00073360: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0007345c) */
/* WARNING: Removing unreachable block (ram,0x00073364) */
/* WARNING: Removing unreachable block (ram,0x00073368) */

char * FUN_00072d00(undefined8 param_1,undefined8 param_2,char *param_3)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 *puVar3;
  undefined8 *puVar4;
  char *pcVar5;
  char *pcVar6;
  long lVar7;
  char *pcVar8;
  long lVar9;
  undefined8 uVar10;
  char *unaff_x19;
  undefined8 unaff_x20;
  char *unaff_x21;
  char *pcVar11;
  undefined8 unaff_x22;
  long unaff_x23;
  long lVar12;
  undefined *unaff_x24;
  undefined *unaff_x25;
  undefined *unaff_x26;
  undefined *unaff_x27;
  undefined *unaff_x28;
  undefined1 *unaff_x29;
  undefined8 unaff_x30;
  undefined1 auVar13 [16];
  
  auVar2._8_8_ = param_2;
  auVar2._0_8_ = param_1;
  auVar13._8_8_ = unaff_x22;
  auVar13._0_8_ = unaff_x20;
  puVar3 = (undefined1 *)register0x00000008;
  do {
    pcVar11 = auVar2._8_8_;
    lVar12 = auVar2._0_8_;
    *(undefined **)(puVar3 + -0x40) = unaff_x24;
    *(long *)(puVar3 + -0x38) = unaff_x23;
    *(long *)(puVar3 + -0x30) = auVar13._8_8_;
    *(char **)(puVar3 + -0x28) = unaff_x21;
    *(long *)(puVar3 + -0x20) = auVar13._0_8_;
    *(char **)(puVar3 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar3 + -8) = unaff_x30;
    if (pcVar11 == param_3) {
      return pcVar11;
    }
    if (*pcVar11 == '^') {
      puVar4 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(lVar12 + 0x18);
      lVar9 = *(long *)(lVar12 + 0x38);
      uVar10 = *(undefined8 *)(lVar9 + 8);
      *puVar4 = &UNK_009b3080;
      puVar4[1] = uVar10;
      *(bool *)(puVar4 + 2) = (uVar1 & 0x5f0) == 0x400;
      *(undefined8 **)(lVar9 + 8) = puVar4;
      *(undefined8 *)(lVar12 + 0x38) = *(undefined8 *)(*(long *)(lVar12 + 0x38) + 8);
      pcVar11 = pcVar11 + 1;
    }
    if (pcVar11 == param_3) {
      return param_3;
    }
    do {
      pcVar6 = pcVar11;
      if (pcVar6 == param_3) {
        return param_3;
      }
      pcVar11 = *(char **)(lVar12 + 0x38);
      uVar1 = *(uint *)(lVar12 + 0x1c);
      pcVar8 = param_3;
      pcVar5 = (char *)func_0x00075d28(lVar12,pcVar6);
    } while ((pcVar6 != pcVar5) &&
            (pcVar8 = param_3,
            pcVar11 = (char *)func_0x00075f2c(lVar12,pcVar5,param_3,pcVar11,uVar1 + 1,
                                              *(int *)(lVar12 + 0x1c) + 1), pcVar6 != pcVar11));
    if ((pcVar6 + 1 == param_3) && (*pcVar6 == '$')) {
      puVar4 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(lVar12 + 0x18);
      lVar9 = *(long *)(lVar12 + 0x38);
      uVar10 = *(undefined8 *)(lVar9 + 8);
      *puVar4 = &UNK_009b30c8;
      puVar4[1] = uVar10;
      *(bool *)(puVar4 + 2) = (uVar1 & 0x5f0) == 0x400;
      *(undefined8 **)(lVar9 + 8) = puVar4;
      *(undefined8 *)(lVar12 + 0x38) = *(undefined8 *)(*(long *)(lVar12 + 0x38) + 8);
      return param_3;
    }
    auVar13 = func_0x000339f8();
    pcVar5 = auVar13._8_8_;
    lVar9 = auVar13._0_8_;
    *(undefined **)(puVar3 + -0xa0) = unaff_x28;
    *(undefined **)(puVar3 + -0x98) = unaff_x27;
    *(undefined **)(puVar3 + -0x90) = unaff_x26;
    *(undefined **)(puVar3 + -0x88) = unaff_x25;
    *(undefined **)(puVar3 + -0x80) = unaff_x24;
    *(ulong *)(puVar3 + -0x78) = (ulong)uVar1;
    *(char **)(puVar3 + -0x70) = pcVar6;
    *(char **)(puVar3 + -0x68) = pcVar11;
    *(long *)(puVar3 + -0x60) = lVar12;
    *(char **)(puVar3 + -0x58) = param_3;
    *(undefined1 **)(puVar3 + -0x50) = puVar3 + -0x10;
    *(undefined **)(puVar3 + -0x48) = &SUB_00073160;
    lVar12 = *(long *)(lVar9 + 0x38);
    unaff_x19 = pcVar8;
    pcVar6 = (char *)func_0x00076338();
    if (pcVar6 != pcVar5) {
      do {
        pcVar11 = pcVar6;
        unaff_x19 = pcVar8;
        pcVar6 = (char *)func_0x00076338(lVar9,pcVar11);
      } while (pcVar11 != pcVar6);
      if (pcVar11 != pcVar5) {
        if (pcVar11 == pcVar8) {
          return pcVar8;
        }
        unaff_x24 = &UNK_009b3548;
        unaff_x25 = &UNK_009b2fd8;
        unaff_x26 = &UNK_009b3590;
        while( true ) {
          if (*pcVar11 != '|') {
            return pcVar11;
          }
          unaff_x27 = *(undefined **)(lVar9 + 0x38);
          pcVar5 = pcVar11 + 1;
          unaff_x19 = pcVar8;
          pcVar6 = (char *)func_0x00076338(lVar9,pcVar5);
          if (pcVar5 == pcVar6) break;
          do {
            pcVar11 = pcVar6;
            unaff_x19 = pcVar8;
            pcVar6 = (char *)func_0x00076338(lVar9,pcVar11);
          } while (pcVar11 != pcVar6);
          if (pcVar11 == pcVar5) break;
          puVar4 = (undefined8 *)__Znwm(0x18);
          uVar10 = *(undefined8 *)(unaff_x27 + 8);
          puVar4[1] = *(undefined8 *)(lVar12 + 8);
          puVar4[2] = uVar10;
          *puVar4 = &UNK_009b3548;
          *(undefined8 **)(lVar12 + 8) = puVar4;
          *(undefined8 *)(unaff_x27 + 8) = 0;
          puVar4 = (undefined8 *)__Znwm(0x10);
          uVar10 = *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8);
          *puVar4 = &UNK_009b2fd8;
          puVar4[1] = uVar10;
          *(undefined8 **)(unaff_x27 + 8) = puVar4;
          *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8) = 0;
          puVar4 = (undefined8 *)__Znwm(0x10);
          uVar10 = *(undefined8 *)(unaff_x27 + 8);
          *puVar4 = &UNK_009b3590;
          puVar4[1] = uVar10;
          *(undefined8 **)(*(long *)(lVar9 + 0x38) + 8) = puVar4;
          *(undefined8 *)(lVar9 + 0x38) = *(undefined8 *)(unaff_x27 + 8);
          if (pcVar11 == pcVar8) {
            return pcVar8;
          }
        }
      }
    }
    auVar13 = func_0x000339f8();
    pcVar6 = auVar13._8_8_;
    lVar7 = auVar13._0_8_;
    *(undefined **)(puVar3 + -0x100) = unaff_x28;
    *(undefined **)(puVar3 + -0xf8) = unaff_x27;
    *(undefined **)(puVar3 + -0xf0) = unaff_x26;
    *(undefined **)(puVar3 + -0xe8) = unaff_x25;
    *(undefined **)(puVar3 + -0xe0) = unaff_x24;
    *(long *)(puVar3 + -0xd8) = lVar12;
    *(char **)(puVar3 + -0xd0) = pcVar5;
    *(char **)(puVar3 + -200) = pcVar11;
    *(long *)(puVar3 + -0xc0) = lVar9;
    *(char **)(puVar3 + -0xb8) = pcVar8;
    *(undefined1 **)(puVar3 + -0xb0) = puVar3 + -0x50;
    *(undefined **)(puVar3 + -0xa8) = &DAT_000732c8;
    unaff_x29 = puVar3 + -0xb0;
    unaff_x23 = *(long *)(lVar7 + 0x38);
    pcVar11 = (char *)_memchr(pcVar6,10,(long)unaff_x19 - (long)pcVar6);
    param_3 = unaff_x19;
    if (pcVar11 != (char *)0x0) {
      param_3 = pcVar11;
    }
    unaff_x24 = &UNK_009b2fc8;
    if (param_3 == pcVar6) {
      puVar4 = (undefined8 *)__Znwm(0x10);
      uVar10 = *(undefined8 *)(unaff_x23 + 8);
      *puVar4 = &UNK_009b2fd8;
      puVar4[1] = uVar10;
      *(undefined8 **)(unaff_x23 + 8) = puVar4;
      *(undefined8 *)(lVar7 + 0x38) = *(undefined8 *)(*(long *)(lVar7 + 0x38) + 8);
      if (param_3 != unaff_x19) {
        param_3 = param_3 + 1;
      }
      if (param_3 == unaff_x19) {
        return unaff_x19;
      }
      unaff_x25 = *(undefined **)(lVar7 + 0x38);
      unaff_x26 = &UNK_009b2fd8;
      unaff_x27 = &UNK_009b3548;
      unaff_x28 = &UNK_009b3590;
      pcVar11 = param_3;
      while( true ) {
        auVar2._8_8_ = pcVar11;
        auVar2._0_8_ = lVar7;
        auVar13._8_8_ = pcVar11;
        auVar13._0_8_ = lVar7;
        pcVar6 = (char *)_memchr(pcVar11,10,(long)unaff_x19 - (long)pcVar11);
        param_3 = unaff_x19;
        if (pcVar6 != (char *)0x0) {
          param_3 = pcVar6;
        }
        if (param_3 != pcVar11) break;
        puVar4 = (undefined8 *)__Znwm(0x10);
        uVar10 = *(undefined8 *)(unaff_x25 + 8);
        *puVar4 = &UNK_009b2fd8;
        puVar4[1] = uVar10;
        *(undefined8 **)(unaff_x25 + 8) = puVar4;
        *(undefined8 *)(lVar7 + 0x38) = *(undefined8 *)(*(long *)(lVar7 + 0x38) + 8);
        puVar4 = (undefined8 *)__Znwm(0x18);
        uVar10 = *(undefined8 *)(unaff_x25 + 8);
        puVar4[1] = *(undefined8 *)(unaff_x23 + 8);
        puVar4[2] = uVar10;
        *puVar4 = &UNK_009b3548;
        *(undefined8 **)(unaff_x23 + 8) = puVar4;
        *(undefined8 *)(unaff_x25 + 8) = 0;
        puVar4 = (undefined8 *)__Znwm(0x10);
        uVar10 = *(undefined8 *)(*(long *)(lVar7 + 0x38) + 8);
        *puVar4 = &UNK_009b2fd8;
        puVar4[1] = uVar10;
        *(undefined8 **)(unaff_x25 + 8) = puVar4;
        *(undefined8 *)(*(long *)(lVar7 + 0x38) + 8) = 0;
        puVar4 = (undefined8 *)__Znwm(0x10);
        uVar10 = *(undefined8 *)(unaff_x25 + 8);
        *puVar4 = &UNK_009b3590;
        puVar4[1] = uVar10;
        *(undefined8 **)(*(long *)(lVar7 + 0x38) + 8) = puVar4;
        unaff_x25 = *(undefined **)(unaff_x25 + 8);
        *(undefined **)(lVar7 + 0x38) = unaff_x25;
        if (param_3 != unaff_x19) {
          param_3 = param_3 + 1;
        }
        pcVar11 = param_3;
        if (param_3 == unaff_x19) {
          return unaff_x19;
        }
      }
      unaff_x30 = 0x7345c;
      puVar3 = puVar3 + -0x100;
      unaff_x21 = param_3;
    }
    else {
      unaff_x30 = 0x73364;
      puVar3 = puVar3 + -0x100;
      unaff_x21 = param_3;
      auVar2 = auVar13;
    }
  } while( true );
}

