/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180c1b760(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  longlong *plVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  char cVar4;
  undefined4 uVar5;
  undefined1 (*pauVar6) [16];
  int iVar7;
  uint uVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong *puVar11;
  longlong lVar12;
  char *pcVar13;
  ulonglong uVar14;
  undefined *puVar15;
  ulonglong uVar16;
  undefined *puVar17;
  undefined1 *puVar18;
  undefined2 *puVar19;
  uint uVar20;
  ulonglong uVar21;
  undefined1 auVar22 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar37 [16];
  undefined1 auVar41 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined8 auStackX_8 [2];
  undefined8 uStackX_18;
  undefined auStackX_1e [2];
  undefined8 uStackX_20;
  undefined8 uStack_38;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 uVar38;
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  
  uStack_38 = 0x180c1b786;
  auStackX_8[0] = param_1;
  auStackX_8[1] = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  lVar9 = FUN_180e15b20();
  lVar9 = -lVar9;
  plVar1 = (longlong *)((longlong)&uStackX_20 + lVar9);
  *(ulonglong *)(&stack0x00000230 + lVar9) = _DAT_1810c1700 ^ (ulonglong)plVar1;
  *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b7aa;
  lVar10 = GetStdHandle(0xfffffff4);
  if (lVar10 != 0) {
    *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b7bb;
    iVar7 = GetFileType(lVar10);
    if (iVar7 != 0) {
      *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b7cb;
      puVar11 = (ulonglong *)func_0x0001801e0ad0();
      *(undefined1 **)(&stack0xfffffffffffffff8 + lVar9) = &stack0x00000288 + lVar9;
      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar9) = 0;
      uVar14 = *puVar11;
      *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b7f6;
      iVar7 = FUN_180e24224(uVar14 | 1,&stack0x00000030 + lVar9,0x200,
                            *(undefined8 *)(&stack0x00000280 + lVar9));
      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar9) = 0;
      if (iVar7 < 0) {
        iVar7 = -1;
      }
      if (iVar7 < 0) {
        iVar7 = 0x200;
      }
      *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b81e;
      WriteFile(lVar10,&stack0x00000030 + lVar9,iVar7,plVar1);
      puVar18 = &stack0xffffffffffffffd0 + lVar9;
      goto LAB_180c1bafd;
    }
  }
  pcVar13 = *(char **)(&stack0x00000280 + lVar9);
  uVar8 = 0;
  cVar4 = *pcVar13;
  uVar16 = 0;
  uVar14 = uVar16;
  while ((cVar4 != '\0' && (uVar8 = (uint)uVar14, uVar8 < 0x80000000))) {
    pcVar13 = pcVar13 + 1;
    uVar8 = uVar8 + 1;
    cVar4 = *pcVar13;
    uVar14 = (ulonglong)uVar8;
  }
  uVar8 = (uVar8 & 0x7fffffff) + 1;
  uVar21 = (ulonglong)uVar8;
  uVar14 = uVar21 * 2 + 0xf;
  if (uVar14 <= uVar21 * 2) {
    uVar14 = 0xffffffffffffff0;
  }
  uVar14 = uVar14 & 0xfffffffffffffff0;
  *(undefined8 *)((longlong)&uStack_38 + lVar9) = 0x180c1b875;
  uVar20 = uVar8;
  FUN_180e15b20();
  lVar10 = -uVar14;
  puVar18 = &stack0xffffffffffffffd0 + lVar10 + lVar9;
  puVar17 = (undefined *)((longlong)&uStackX_20 + lVar10 + lVar9);
  if (puVar17 == (undefined *)0x0) {
    puVar17 = &UNK_180f673b8;
  }
  else {
    *(uint *)(&stack0xfffffffffffffff8 + lVar10 + lVar9) = uVar20;
    *(undefined **)(&stack0xfffffffffffffff0 + lVar10 + lVar9) = puVar17;
    *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1b8a2;
    iVar7 = MultiByteToWideChar(0,0);
    if ((iVar7 == 0) && (uVar21 != 0)) {
      uVar14 = uVar16;
      if (3 < uVar21) {
        puVar15 = *(undefined **)(&stack0x00000280 + lVar9);
        if ((puVar17 <= puVar15 + (uVar21 - 1)) &&
           (puVar15 <= auStackX_1e + uVar21 * 2 + lVar10 + lVar9)) goto LAB_180c1b9c0;
        if (uVar21 < 0x20) {
LAB_180c1b977:
          lVar12 = *(longlong *)(&stack0x00000280 + lVar9);
          do {
            uVar5 = *(undefined4 *)(uVar14 + lVar12);
            uVar40 = (undefined1)((uint)uVar5 >> 0x18);
            uVar39 = (undefined1)((uint)uVar5 >> 0x10);
            uVar38 = (undefined1)((uint)uVar5 >> 8);
            auVar37._4_4_ =
                 (int)(CONCAT35(CONCAT21(CONCAT11(uVar40,uVar40),uVar39),CONCAT14(uVar39,uVar5)) >>
                      0x20);
            auVar37[3] = uVar38;
            auVar37[2] = uVar38;
            auVar37[0] = (undefined1)uVar5;
            auVar37[1] = auVar37[0];
            auVar37._8_8_ = 0;
            auVar28 = psraw(auVar37,8);
            *(longlong *)(puVar17 + uVar14 * 2) = auVar28._0_8_;
            uVar14 = uVar14 + 4;
          } while (uVar14 < (uVar21 & 0xfffffffffffffffc));
        }
        else {
          puVar11 = (ulonglong *)(*(longlong *)(&stack0x00000280 + lVar9) + 0x10);
          pauVar6 = (undefined1 (*) [16])(&stack0x00000000 + lVar10 + lVar9);
          do {
            uVar2 = puVar11[-2];
            uVar3 = puVar11[-1];
            uVar38 = (undefined1)(uVar2 >> 0x38);
            auVar27._8_6_ = 0;
            auVar27._0_8_ = uVar2;
            auVar27[0xe] = uVar38;
            auVar27[0xf] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x30);
            auVar26._14_2_ = auVar27._14_2_;
            auVar26._8_5_ = 0;
            auVar26._0_8_ = uVar2;
            auVar26[0xd] = uVar38;
            auVar25._13_3_ = auVar26._13_3_;
            auVar25._8_4_ = 0;
            auVar25._0_8_ = uVar2;
            auVar25[0xc] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x28);
            auVar24._12_4_ = auVar25._12_4_;
            auVar24._8_3_ = 0;
            auVar24._0_8_ = uVar2;
            auVar24[0xb] = uVar38;
            auVar23._11_5_ = auVar24._11_5_;
            auVar23._8_2_ = 0;
            auVar23._0_8_ = uVar2;
            auVar23[10] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x20);
            auVar22._10_6_ = auVar23._10_6_;
            auVar22[8] = 0;
            auVar22._0_8_ = uVar2;
            auVar22[9] = uVar38;
            auVar28._9_7_ = auVar22._9_7_;
            auVar28[8] = uVar38;
            auVar28._0_8_ = uVar2;
            uVar38 = (undefined1)(uVar2 >> 0x18);
            auVar49._8_8_ = auVar28._8_8_;
            auVar49[7] = uVar38;
            auVar49[6] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x10);
            auVar49[5] = uVar38;
            auVar49[4] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 8);
            auVar49[3] = uVar38;
            auVar49[2] = uVar38;
            auVar49[0] = (undefined1)uVar2;
            auVar49[1] = auVar49[0];
            uVar14 = uVar14 + 0x20;
            uVar38 = (undefined1)(uVar3 >> 0x38);
            auVar48._8_6_ = 0;
            auVar48._0_8_ = uVar3;
            auVar48[0xe] = uVar38;
            auVar48[0xf] = uVar38;
            uVar38 = (undefined1)(uVar3 >> 0x30);
            auVar47._14_2_ = auVar48._14_2_;
            auVar47._8_5_ = 0;
            auVar47._0_8_ = uVar3;
            auVar47[0xd] = uVar38;
            auVar46._13_3_ = auVar47._13_3_;
            auVar46._8_4_ = 0;
            auVar46._0_8_ = uVar3;
            auVar46[0xc] = uVar38;
            uVar38 = (undefined1)(uVar3 >> 0x28);
            auVar45._12_4_ = auVar46._12_4_;
            auVar45._8_3_ = 0;
            auVar45._0_8_ = uVar3;
            auVar45[0xb] = uVar38;
            auVar44._11_5_ = auVar45._11_5_;
            auVar44._8_2_ = 0;
            auVar44._0_8_ = uVar3;
            auVar44[10] = uVar38;
            uVar38 = (undefined1)(uVar3 >> 0x20);
            auVar43._10_6_ = auVar44._10_6_;
            auVar43[8] = 0;
            auVar43._0_8_ = uVar3;
            auVar43[9] = uVar38;
            auVar42._9_7_ = auVar43._9_7_;
            auVar42[8] = uVar38;
            auVar42._0_8_ = uVar3;
            uVar38 = (undefined1)(uVar3 >> 0x18);
            auVar41._8_8_ = auVar42._8_8_;
            auVar41[7] = uVar38;
            auVar41[6] = uVar38;
            uVar38 = (undefined1)(uVar3 >> 0x10);
            auVar41[5] = uVar38;
            auVar41[4] = uVar38;
            uVar38 = (undefined1)(uVar3 >> 8);
            auVar41[3] = uVar38;
            auVar41[2] = uVar38;
            auVar41[0] = (undefined1)uVar3;
            auVar41[1] = auVar41[0];
            auVar28 = psraw(auVar49,8);
            auVar49 = psraw(auVar41,8);
            pauVar6[2] = auVar28;
            uVar2 = *puVar11;
            uVar38 = (undefined1)(uVar2 >> 0x38);
            auVar36._8_6_ = 0;
            auVar36._0_8_ = uVar2;
            auVar36[0xe] = uVar38;
            auVar36[0xf] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x30);
            auVar35._14_2_ = auVar36._14_2_;
            auVar35._8_5_ = 0;
            auVar35._0_8_ = uVar2;
            auVar35[0xd] = uVar38;
            auVar34._13_3_ = auVar35._13_3_;
            auVar34._8_4_ = 0;
            auVar34._0_8_ = uVar2;
            auVar34[0xc] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x28);
            auVar33._12_4_ = auVar34._12_4_;
            auVar33._8_3_ = 0;
            auVar33._0_8_ = uVar2;
            auVar33[0xb] = uVar38;
            auVar32._11_5_ = auVar33._11_5_;
            auVar32._8_2_ = 0;
            auVar32._0_8_ = uVar2;
            auVar32[10] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x20);
            auVar31._10_6_ = auVar32._10_6_;
            auVar31[8] = 0;
            auVar31._0_8_ = uVar2;
            auVar31[9] = uVar38;
            auVar30._9_7_ = auVar31._9_7_;
            auVar30[8] = uVar38;
            auVar30._0_8_ = uVar2;
            uVar38 = (undefined1)(uVar2 >> 0x18);
            auVar29._8_8_ = auVar30._8_8_;
            auVar29[7] = uVar38;
            auVar29[6] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x10);
            auVar29[5] = uVar38;
            auVar29[4] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 8);
            auVar29[3] = uVar38;
            auVar29[2] = uVar38;
            auVar29[0] = (undefined1)uVar2;
            auVar29[1] = auVar29[0];
            auVar28 = psraw(auVar29,8);
            pauVar6[3] = auVar49;
            uVar2 = puVar11[1];
            uVar38 = (undefined1)(uVar2 >> 0x38);
            auVar57._8_6_ = 0;
            auVar57._0_8_ = uVar2;
            auVar57[0xe] = uVar38;
            auVar57[0xf] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x30);
            auVar56._14_2_ = auVar57._14_2_;
            auVar56._8_5_ = 0;
            auVar56._0_8_ = uVar2;
            auVar56[0xd] = uVar38;
            auVar55._13_3_ = auVar56._13_3_;
            auVar55._8_4_ = 0;
            auVar55._0_8_ = uVar2;
            auVar55[0xc] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x28);
            auVar54._12_4_ = auVar55._12_4_;
            auVar54._8_3_ = 0;
            auVar54._0_8_ = uVar2;
            auVar54[0xb] = uVar38;
            auVar53._11_5_ = auVar54._11_5_;
            auVar53._8_2_ = 0;
            auVar53._0_8_ = uVar2;
            auVar53[10] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x20);
            auVar52._10_6_ = auVar53._10_6_;
            auVar52[8] = 0;
            auVar52._0_8_ = uVar2;
            auVar52[9] = uVar38;
            auVar51._9_7_ = auVar52._9_7_;
            auVar51[8] = uVar38;
            auVar51._0_8_ = uVar2;
            uVar38 = (undefined1)(uVar2 >> 0x18);
            auVar50._8_8_ = auVar51._8_8_;
            auVar50[7] = uVar38;
            auVar50[6] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 0x10);
            auVar50[5] = uVar38;
            auVar50[4] = uVar38;
            uVar38 = (undefined1)(uVar2 >> 8);
            auVar50[3] = uVar38;
            auVar50[2] = uVar38;
            auVar50[0] = (undefined1)uVar2;
            auVar50[1] = auVar50[0];
            auVar49 = psraw(auVar50,8);
            pauVar6[4] = auVar28;
            pauVar6[5] = auVar49;
            puVar11 = puVar11 + 4;
            pauVar6 = pauVar6 + 4;
          } while (uVar14 < uVar21 - (uVar8 & 0x1f));
          if (3 < (ulonglong)(uVar8 & 0x1f)) goto LAB_180c1b977;
        }
        if (uVar21 <= uVar14) goto LAB_180c1b9d5;
      }
      do {
        puVar15 = *(undefined **)(&stack0x00000280 + lVar9);
LAB_180c1b9c0:
        *(short *)(puVar17 + uVar14 * 2) = (short)(char)puVar15[uVar14];
        uVar14 = uVar14 + 1;
      } while (uVar14 < uVar21);
    }
    else {
LAB_180c1b9d5:
      if (uVar21 == 0) goto LAB_180c1ba4b;
    }
    do {
      if (*(short *)(puVar17 + uVar16 * 2) == 0x25) {
        puVar19 = (undefined2 *)((longlong)&uStackX_20 + uVar16 * 2 + lVar10 + lVar9 + 2);
        do {
          switch(*puVar19) {
          case 0x2a:
          case 0x2d:
          case 0x2e:
          case 0x30:
          case 0x31:
          case 0x32:
          case 0x33:
          case 0x34:
          case 0x35:
          case 0x36:
          case 0x37:
          case 0x38:
          case 0x39:
            uVar16 = uVar16 + 1;
            puVar19 = puVar19 + 1;
            break;
          default:
            goto LAB_180c1ba43;
          case 0x43:
            *(undefined2 *)((longlong)&uStackX_20 + uVar16 * 2 + lVar10 + lVar9 + 2) = 99;
            goto LAB_180c1ba43;
          case 0x53:
            *(undefined2 *)((longlong)&uStackX_20 + uVar16 * 2 + lVar10 + lVar9 + 2) = 0x73;
            goto LAB_180c1ba43;
          case 99:
            *(undefined2 *)((longlong)&uStackX_20 + uVar16 * 2 + lVar10 + lVar9 + 2) = 0x43;
            goto LAB_180c1ba43;
          case 0x73:
            *(undefined2 *)((longlong)&uStackX_20 + uVar16 * 2 + lVar10 + lVar9 + 2) = 0x53;
            goto LAB_180c1ba43;
          }
        } while( true );
      }
LAB_180c1ba43:
      uVar16 = uVar16 + 1;
    } while (uVar16 < uVar21);
  }
LAB_180c1ba4b:
  *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1ba57;
  puVar11 = (ulonglong *)func_0x0001801e0ad0();
  *(undefined1 **)(&stack0xfffffffffffffff8 + lVar10 + lVar9) = &stack0x00000288 + lVar9;
  *(undefined8 *)(&stack0xfffffffffffffff0 + lVar10 + lVar9) = 0;
  uVar14 = *puVar11;
  *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1ba7a;
  FUN_180e2458c(uVar14 | 1,&stack0x00000030 + lVar9,0xff,puVar17);
  *(undefined2 *)(&stack0x0000022e + lVar9) = 0;
  *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1ba86;
  iVar7 = FUN_180c1b5f0();
  if (iVar7 < 1) {
    *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1bafd;
    MessageBoxW(0,&stack0x00000030 + lVar9,&UNK_180f673e0,0x10);
  }
  else {
    *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1ba99;
    lVar12 = RegisterEventSourceW(0,&UNK_180f673d0);
    puVar18 = &stack0xffffffffffffffd0 + lVar10 + lVar9;
    if (lVar12 != 0) {
      *(undefined8 *)((longlong)auStackX_8 + lVar10 + lVar9 + 8) = 0;
      *plVar1 = (longlong)(&stack0x00000030 + lVar9);
      *(longlong **)((longlong)auStackX_8 + lVar10 + lVar9) = plVar1;
      *(undefined4 *)(&stack0x00000000 + lVar10 + lVar9) = 0;
      *(undefined2 *)(&stack0xfffffffffffffff8 + lVar10 + lVar9) = 1;
      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar10 + lVar9) = 0;
      *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1badb;
      ReportEventW(lVar12,1,0,0);
      *(undefined8 *)((longlong)&uStack_38 + lVar10 + lVar9) = 0x180c1bae4;
      DeregisterEventSource(lVar12);
      puVar18 = &stack0xffffffffffffffd0 + lVar10 + lVar9;
    }
  }
LAB_180c1bafd:
  uVar14 = *(ulonglong *)(&stack0x00000230 + lVar9);
  *(undefined8 *)(puVar18 + -8) = 0x180c1bb0c;
  FUN_180e155e0(uVar14 ^ (ulonglong)plVar1);
  return;
}


