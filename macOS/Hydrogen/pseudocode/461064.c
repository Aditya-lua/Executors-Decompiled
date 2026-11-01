
undefined1  [16]
FUN_00461064(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4,int param_5,
            undefined2 *param_6,ulong param_7)

{
  long lVar1;
  undefined *puVar2;
  ushort uVar3;
  byte *pbVar4;
  short *psVar5;
  undefined8 uVar6;
  undefined *puVar7;
  undefined *puVar8;
  long lVar9;
  long *plVar10;
  short sVar11;
  undefined *puVar12;
  undefined *extraout_x9;
  long lVar13;
  undefined2 *puVar14;
  uint uVar15;
  long lVar16;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  
  sVar11 = -0x138;
  auVar17 = func_0x007a247c(param_1,0x22);
  auVar17._8_8_ = auVar17._8_8_;
  pbVar4 = auVar17._0_8_;
  if (auVar17._8_8_ == 0) {
    func_0x007a247c(&UNK_008933eb,0x21,&UNK_009dfee0);
LAB_004611ac:
    func_0x007a247c(&UNK_0089347b,0x1f,&UNK_009dfef8);
  }
  else {
    if (*pbVar4 < 0x31) goto LAB_004611ac;
    if (5 < param_7) {
      *param_6 = 2;
      lVar9 = 1;
      *(byte **)(param_6 + 4) = pbVar4;
      *(undefined8 *)(param_6 + 8) = 1;
      if ((auVar17._8_8_ - 1 != 0) || (1 < param_4)) {
        param_6[0xc] = 2;
        *(undefined **)(param_6 + 0x10) = &UNK_008934bc;
        *(undefined8 *)(param_6 + 0x14) = 1;
        param_6[0x18] = 2;
        *(byte **)(param_6 + 0x1c) = pbVar4 + 1;
        *(ulong *)(param_6 + 0x20) = auVar17._8_8_ - 1;
        if (param_4 < auVar17._8_8_ || param_4 - auVar17._8_8_ == 0) {
          lVar9 = 3;
        }
        else {
          param_6[0x24] = 0;
          *(ulong *)(param_6 + 0x28) = param_4 - auVar17._8_8_;
          lVar9 = 4;
        }
      }
      if (sVar11 < 1) {
        puVar7 = &UNK_008934e5;
        if (param_5 == 0) {
          puVar7 = &UNK_008934e3;
        }
        puVar14 = param_6 + lVar9 * 0xc;
        *puVar14 = 2;
        *(undefined **)(puVar14 + 4) = puVar7;
        *(undefined8 *)(puVar14 + 8) = 2;
        sVar11 = 1 - sVar11;
      }
      else {
        sVar11 = sVar11 + -1;
        puVar7 = &UNK_008934e2;
        if (param_5 == 0) {
          puVar7 = &UNK_008934e1;
        }
        puVar14 = param_6 + lVar9 * 0xc;
        *puVar14 = 2;
        *(undefined **)(puVar14 + 4) = puVar7;
        *(undefined8 *)(puVar14 + 8) = 1;
      }
      param_6[lVar9 * 0xc + 0xc] = 1;
      param_6[lVar9 * 0xc + 0xd] = sVar11;
      auVar17._8_8_ = lVar9 + 2;
      auVar17._0_8_ = param_6;
      return auVar17;
    }
  }
  puVar7 = &UNK_009dff10;
  auVar17 = func_0x007a247c(&UNK_008934bf,0x22);
  lVar9 = auVar17._8_8_;
  psVar5 = auVar17._0_8_;
  sVar11 = *psVar5;
  if (sVar11 == 0) {
    puVar2 = *(undefined **)(psVar5 + 4);
  }
  else if (sVar11 == 1) {
    uVar3 = psVar5[1];
    puVar12 = (undefined *)0x2;
    if (99 < uVar3) {
      puVar12 = (undefined *)0x3;
    }
    puVar2 = (undefined *)0x1;
    if (9 < uVar3) {
      puVar2 = puVar12;
    }
    puVar12 = (undefined *)0x4;
    if (0x270 < uVar3 >> 4) {
      puVar12 = (undefined *)0x5;
    }
    if (999 < uVar3) {
      puVar2 = puVar12;
    }
  }
  else {
    puVar2 = *(undefined **)(psVar5 + 8);
  }
  if (puVar7 < puVar2) {
    uVar6 = 0;
    goto LAB_00461304;
  }
  if (sVar11 == 0) {
    puVar12 = *(undefined **)(psVar5 + 4);
    if (puVar7 < puVar12) {
      puVar8 = &UNK_009dff88;
      func_0x007a28b0(puVar12,puVar7,&UNK_009dff88);
      puVar12 = extraout_x9;
LAB_00461328:
      auVar17 = func_0x007a28b0(puVar12,puVar8,&UNK_009dffa0);
      auVar19._8_8_ = auVar17._8_8_;
      lVar16 = auVar17._0_8_;
      lVar9 = *(long *)(lVar16 + 8);
      if (*(long *)(lVar16 + 0x18) != 0) {
        lVar13 = *(long *)(lVar16 + 0x18) * 0x18;
        plVar10 = (long *)(*(long *)(lVar16 + 0x10) + 8);
        do {
          if ((short)plVar10[-1] == 0) {
            lVar16 = *plVar10;
          }
          else if ((short)plVar10[-1] == 1) {
            uVar3 = *(ushort *)((long)plVar10 + -6);
            lVar1 = 2;
            if (99 < uVar3) {
              lVar1 = 3;
            }
            lVar16 = 1;
            if (9 < uVar3) {
              lVar16 = lVar1;
            }
            lVar1 = 4;
            if (0x270 < uVar3 >> 4) {
              lVar1 = 5;
            }
            if (999 < uVar3) {
              lVar16 = lVar1;
            }
          }
          else {
            lVar16 = plVar10[1];
          }
          lVar9 = lVar16 + lVar9;
          plVar10 = plVar10 + 3;
          lVar13 = lVar13 + -0x18;
        } while (lVar13 != 0);
      }
      auVar19._0_8_ = lVar9;
      return auVar19;
    }
    if (puVar12 != (undefined *)0x0) {
      _memset(lVar9,0x30,puVar12);
    }
  }
  else {
    if (sVar11 != 1) {
      puVar12 = *(undefined **)(psVar5 + 8);
      puVar8 = puVar7;
      if (puVar7 < puVar12) goto LAB_00461328;
      _memcpy(lVar9,*(undefined8 *)(psVar5 + 4),puVar12);
      uVar6 = 1;
      goto LAB_00461304;
    }
    if (puVar2 != (undefined *)0x0) {
      uVar6 = 1;
      puVar7 = puVar2;
      uVar15 = (uint)(ushort)psVar5[1];
      do {
        puVar7[lVar9 + -1] = (char)uVar15 + (char)(uVar15 / 10) * -10 | 0x30;
        puVar7 = puVar7 + -1;
        uVar15 = uVar15 / 10;
      } while (puVar7 != (undefined *)0x0);
      goto LAB_00461304;
    }
  }
  uVar6 = 1;
LAB_00461304:
  auVar18._8_8_ = puVar2;
  auVar18._0_8_ = uVar6;
  return auVar18;
}

