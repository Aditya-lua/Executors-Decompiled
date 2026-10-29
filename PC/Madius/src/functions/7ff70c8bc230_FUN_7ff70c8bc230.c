/* 7ff70c8bc230 FUN_7ff70c8bc230 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8bc230(longlong param_1)

{
  undefined8 *puVar1;
  ushort *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar6;
  undefined8 uVar7;
  ushort uVar8;
  ushort uVar9;
  undefined4 uVar10;
  longlong *plVar11;
  int *piVar12;
  undefined8 uVar13;
  longlong *plVar14;
  code *pcVar15;
  undefined8 uVar16;
  longlong lVar17;
  float *pfVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  float fVar21;
  undefined8 uVar22;
  int iVar23;
  uint uVar24;
  longlong lVar25;
  longlong lVar26;
  longlong lVar27;
  undefined8 *puVar28;
  undefined8 *puVar29;
  int iVar30;
  ushort *puVar31;
  longlong lVar32;
  ulonglong uVar33;
  longlong *plVar34;
  longlong *plVar35;
  int iVar36;
  float fVar37;
  float fVar39;
  float fVar40;
  float fVar41;
  undefined1 auVar38 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  undefined4 unaff_XMM7_Da;
  undefined4 unaff_XMM7_Db;
  undefined4 unaff_XMM7_Dc;
  undefined4 unaff_XMM7_Dd;
  undefined8 unaff_XMM8_Qa;
  undefined8 unaff_XMM8_Qb;
  undefined4 unaff_XMM9_Da;
  undefined4 unaff_XMM9_Db;
  undefined4 unaff_XMM9_Dc;
  undefined4 unaff_XMM9_Dd;
  undefined4 unaff_XMM10_Da;
  undefined4 unaff_XMM10_Db;
  undefined4 unaff_XMM10_Dc;
  undefined4 unaff_XMM10_Dd;
  undefined4 unaff_XMM11_Da;
  undefined4 unaff_XMM11_Db;
  undefined4 unaff_XMM11_Dc;
  undefined4 unaff_XMM11_Dd;
  undefined4 unaff_XMM12_Da;
  undefined4 unaff_XMM12_Db;
  undefined4 unaff_XMM12_Dc;
  undefined4 unaff_XMM12_Dd;
  longlong lStackX_8;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined8 uStack_48;
  undefined8 uVar5;
  
  uStack_48 = 0x7ff70c8bc246;
  lVar25 = FUN_7ff70caa9780();
  lVar25 = -lVar25;
  *(undefined4 *)(&stack0x00001c30 + lVar25) = unaff_XMM12_Da;
  *(undefined4 *)(&stack0x00001c34 + lVar25) = unaff_XMM12_Db;
  *(undefined4 *)(&stack0x00001c38 + lVar25) = unaff_XMM12_Dc;
  *(undefined4 *)(&stack0x00001c3c + lVar25) = unaff_XMM12_Dd;
  *(undefined4 *)(&stack0x00001c20 + lVar25) = unaff_XMM11_Da;
  *(undefined4 *)(&stack0x00001c24 + lVar25) = unaff_XMM11_Db;
  *(undefined4 *)(&stack0x00001c28 + lVar25) = unaff_XMM11_Dc;
  *(undefined4 *)(&stack0x00001c2c + lVar25) = unaff_XMM11_Dd;
  *(undefined4 *)(&stack0x00001c10 + lVar25) = unaff_XMM10_Da;
  *(undefined4 *)(&stack0x00001c14 + lVar25) = unaff_XMM10_Db;
  *(undefined4 *)(&stack0x00001c18 + lVar25) = unaff_XMM10_Dc;
  *(undefined4 *)(&stack0x00001c1c + lVar25) = unaff_XMM10_Dd;
  *(undefined4 *)(&stack0x00001c00 + lVar25) = unaff_XMM9_Da;
  *(undefined4 *)(&stack0x00001c04 + lVar25) = unaff_XMM9_Db;
  *(undefined4 *)(&stack0x00001c08 + lVar25) = unaff_XMM9_Dc;
  *(undefined4 *)(&stack0x00001c0c + lVar25) = unaff_XMM9_Dd;
  *(undefined8 *)(&stack0x00001bf0 + lVar25) = unaff_XMM8_Qa;
  *(undefined8 *)(&stack0x00001bf8 + lVar25) = unaff_XMM8_Qb;
  *(undefined4 *)(&stack0x00001be0 + lVar25) = unaff_XMM7_Da;
  *(undefined4 *)(&stack0x00001be4 + lVar25) = unaff_XMM7_Db;
  *(undefined4 *)(&stack0x00001be8 + lVar25) = unaff_XMM7_Dc;
  *(undefined4 *)(&stack0x00001bec + lVar25) = unaff_XMM7_Dd;
  *(undefined4 *)(&stack0x00001bd0 + lVar25) = unaff_XMM6_Da;
  *(undefined4 *)(&stack0x00001bd4 + lVar25) = unaff_XMM6_Db;
  *(undefined4 *)(&stack0x00001bd8 + lVar25) = unaff_XMM6_Dc;
  *(undefined4 *)(&stack0x00001bdc + lVar25) = unaff_XMM6_Dd;
  *(ulonglong *)(&stack0x00001bc8 + lVar25) =
       _DAT_7ff70cbebd80 ^ (ulonglong)(&stack0xffffffffffffffc0 + lVar25);
  if ((*(float *)(param_1 + 0x28) <= 0.0) || (*(float *)(param_1 + 0x2c) <= 0.0))
  goto LAB_7ff70c8bd110;
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc2b8;
  lVar26 = FUN_7ff70c808680();
  if (lVar26 == 0) {
    lVar26 = 0;
  }
  else {
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc2c2;
    lVar26 = FUN_7ff70c8194a0();
    lVar26 = *(longlong *)(lVar26 + 0x98);
  }
  uVar3 = _DAT_7ff70cb1eb90;
  uVar22 = _UNK_7ff70cb1eb88;
  uVar16 = _DAT_7ff70cb1eb80;
  *(longlong *)(&stack0x00000000 + lVar25) = lVar26;
  plVar11 = *(longlong **)(lVar26 + 8);
  piVar12 = *(int **)(param_1 + 0x40);
  if ((piVar12 != (int *)0x0) && ((longlong)*piVar12 != 0)) {
    plVar34 = *(longlong **)(piVar12 + 2);
    plVar35 = plVar34 + *piVar12;
    *(longlong *)(&stack0xfffffffffffffff8 + lVar25) = param_1;
    *(longlong **)((longlong)&lStackX_8 + lVar25) = plVar35;
    do {
      lVar26 = *plVar34;
      if (*(int *)(lVar26 + 4) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc35d;
        lVar27 = FUN_7ff70c808680();
        if (lVar27 == 0) {
          puVar29 = (undefined8 *)0x0;
          iVar23 = *(int *)(lVar26 + 4);
        }
        else {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc36b;
          lVar27 = FUN_7ff70c8194a0();
          puVar29 = *(undefined8 **)(lVar27 + 0x98);
          iVar23 = *(int *)(lVar26 + 4);
        }
        if (iVar23 == 4) {
          if ((0 < *(int *)(lVar26 + 0x50)) &&
             (puVar29 = *(undefined8 **)(lVar26 + 8), puVar29 != (undefined8 *)0x0)) {
            pcVar15 = *(code **)(*(longlong *)puVar29[1] + 0x10);
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc4a2;
            (*pcVar15)();
            pcVar15 = *(code **)(*(longlong *)*puVar29 + 0x10);
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc4ac;
            (*pcVar15)();
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc4b4;
            FUN_7ff70c802510(puVar29);
            *(undefined4 *)(lVar26 + 4) = 1;
            *(undefined8 *)(lVar26 + 8) = 0;
            *(undefined8 *)(lVar26 + 0x10) = 0;
          }
        }
        else if (iVar23 == 3) {
          if ((longlong)*(int *)(lVar26 + 0x40) != 0) {
            puVar28 = *(undefined8 **)(lVar26 + 8);
            puVar31 = *(ushort **)(lVar26 + 0x48);
            puVar2 = puVar31 + (longlong)*(int *)(lVar26 + 0x40) * 4;
            do {
              uVar8 = *puVar31;
              *(uint *)(&stack0x00000088 + lVar25) = (uint)uVar8;
              uVar9 = puVar31[1];
              *(uint *)(&stack0x0000008c + lVar25) = (uint)uVar9;
              *(undefined4 *)(&stack0x00000090 + lVar25) = 0;
              *(uint *)(&stack0x00000094 + lVar25) = (uint)puVar31[2] + (uint)uVar8;
              *(uint *)(&stack0x00000098 + lVar25) = (uint)puVar31[3] + (uint)uVar9;
              *(undefined4 *)(&stack0x0000009c + lVar25) = 1;
              plVar35 = (longlong *)puVar29[1];
              iVar23 = *(int *)(lVar26 + 0x1c);
              iVar30 = *(int *)(lVar26 + 0x24);
              lVar27 = *(longlong *)(lVar26 + 0x28);
              uVar13 = *puVar28;
              lVar32 = *plVar35;
              *(int *)(&stack0xffffffffffffffe8 + lVar25) = iVar30 * iVar23;
              *(longlong *)(&stack0xffffffffffffffe0 + lVar25) =
                   (int)((iVar23 * (uint)uVar9 + (uint)uVar8) * iVar30) + lVar27;
              *(undefined4 *)(&stack0xfffffffffffffff0 + lVar25) = 0;
              pcVar15 = *(code **)(lVar32 + 0x180);
              *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc570;
              (*pcVar15)(plVar35,uVar13,0,&stack0x00000088 + lVar25);
              puVar31 = puVar31 + 4;
            } while (puVar31 != puVar2);
          }
          *(undefined4 *)(lVar26 + 4) = 0;
          param_1 = *(longlong *)(&stack0xfffffffffffffff8 + lVar25);
          plVar35 = *(longlong **)((longlong)&lStackX_8 + lVar25);
        }
        else if (iVar23 == 2) {
          uVar13 = *(undefined8 *)(lVar26 + 0x28);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc39b;
          puVar28 = (undefined8 *)FUN_7ff70c802100(0x10);
          *puVar28 = 0;
          puVar28[1] = 0;
          *(undefined8 *)(&stack0x000000a0 + lVar25) = 0;
          *(undefined8 *)(&stack0x000000a8 + lVar25) = 0;
          *(undefined4 *)(&stack0x000000b0 + lVar25) = 0;
          iVar23 = *(int *)(lVar26 + 0x1c);
          *(undefined8 *)(&stack0x00000088 + lVar25) = *(undefined8 *)(lVar26 + 0x1c);
          *(undefined8 *)(&stack0x00000090 + lVar25) = uVar16;
          *(undefined8 *)(&stack0x00000098 + lVar25) = uVar22;
          *(undefined4 *)(&stack0x000000a8 + lVar25) = 8;
          *(undefined8 *)(&stack0x00000070 + lVar25) = uVar13;
          param_1 = *(longlong *)(&stack0xfffffffffffffff8 + lVar25);
          *(int *)(&stack0x00000078 + lVar25) = iVar23 << 2;
          *(undefined4 *)(&stack0x0000007c + lVar25) = 0;
          plVar14 = (longlong *)*puVar29;
          pcVar15 = *(code **)(*plVar14 + 0x28);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc410;
          (*pcVar15)(plVar14,&stack0x00000088 + lVar25,&stack0x00000070 + lVar25,puVar28);
          *(undefined8 *)((longlong)&uStackX_20 + lVar25) = 0;
          *(undefined8 *)((longlong)&uStackX_10 + lVar25) = uVar3;
          *(ulonglong *)((longlong)&uStackX_18 + lVar25) =
               (ulonglong)*(uint *)(&stack0x00000090 + lVar25) << 0x20;
          plVar14 = (longlong *)*puVar29;
          uVar13 = *puVar28;
          pcVar15 = *(code **)(*plVar14 + 0x38);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc447;
          (*pcVar15)(plVar14,uVar13,(longlong)&uStackX_10 + lVar25,puVar28 + 1);
          *(undefined8 *)(lVar26 + 0x10) = puVar28[1];
          *(undefined4 *)(lVar26 + 4) = 0;
          *(undefined8 **)(lVar26 + 8) = puVar28;
        }
      }
      plVar34 = plVar34 + 1;
    } while (plVar34 != plVar35);
  }
  puVar28 = *(undefined8 **)(&stack0x00000000 + lVar25);
  puVar29 = puVar28 + 3;
  if ((longlong *)puVar28[3] == (longlong *)0x0) {
LAB_7ff70c8bc5aa:
    iVar23 = *(int *)(param_1 + 0xc);
    *(int *)(puVar28 + 0xd) = iVar23 + 5000;
    *(undefined4 *)(&stack0x0000009c + lVar25) = 0;
    *(int *)(&stack0x00000088 + lVar25) = (iVar23 * 4 + 20000) * 5;
    *(undefined8 *)(&stack0x0000008c + lVar25) = _DAT_7ff70cb1eba0;
    *(undefined8 *)(&stack0x00000094 + lVar25) = _UNK_7ff70cb1eba8;
    plVar34 = (longlong *)*puVar28;
    pcVar15 = *(code **)(*plVar34 + 0x18);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc5fa;
    iVar23 = (*pcVar15)(plVar34,&stack0x00000088 + lVar25,0,puVar29);
    if (iVar23 < 0) goto LAB_7ff70c8bd110;
  }
  else if (*(int *)(puVar28 + 0xd) < *(int *)(param_1 + 0xc)) {
    pcVar15 = *(code **)(*(longlong *)puVar28[3] + 0x10);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc5a3;
    (*pcVar15)();
    *puVar29 = 0;
    goto LAB_7ff70c8bc5aa;
  }
  puVar1 = puVar28 + 4;
  if ((longlong *)puVar28[4] == (longlong *)0x0) {
LAB_7ff70c8bc625:
    iVar23 = *(int *)(param_1 + 8);
    *(int *)((longlong)puVar28 + 0x6c) = iVar23 + 10000;
    *(undefined8 *)(&stack0x00000098 + lVar25) = 0;
    *(undefined4 *)(&stack0x0000008c + lVar25) = 2;
    *(int *)(&stack0x00000088 + lVar25) = iVar23 * 2 + 20000;
    *(undefined8 *)(&stack0x00000090 + lVar25) = 0x1000000000002;
    plVar34 = (longlong *)*puVar28;
    pcVar15 = *(code **)(*plVar34 + 0x18);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc681;
    iVar23 = (*pcVar15)(plVar34,&stack0x00000088 + lVar25,0,puVar1);
    if (iVar23 < 0) goto LAB_7ff70c8bd110;
  }
  else if (*(int *)((longlong)puVar28 + 0x6c) < *(int *)(param_1 + 8)) {
    pcVar15 = *(code **)(*(longlong *)puVar28[4] + 0x10);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc61e;
    (*pcVar15)();
    *puVar1 = 0;
    goto LAB_7ff70c8bc625;
  }
  uVar16 = *puVar29;
  lVar26 = *plVar11;
  *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00000048 + lVar25;
  *(undefined4 *)(&stack0xffffffffffffffe0 + lVar25) = 0;
  pcVar15 = *(code **)(lVar26 + 0x70);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc6b3;
  iVar23 = (*pcVar15)(plVar11,uVar16,0,4);
  if (iVar23 == 0) {
    uVar16 = *puVar1;
    lVar26 = *plVar11;
    *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00000038 + lVar25;
    *(undefined4 *)(&stack0xffffffffffffffe0 + lVar25) = 0;
    pcVar15 = *(code **)(lVar26 + 0x70);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc6e2;
    iVar23 = (*pcVar15)(plVar11,uVar16,0,4);
    if (iVar23 == 0) {
      if (0 < *(int *)(param_1 + 4)) {
        lVar27 = *(longlong *)(&stack0x00000038 + lVar25);
        lVar26 = *(longlong *)(&stack0x00000048 + lVar25);
        lVar32 = 0;
        do {
          lVar17 = *(longlong *)(*(longlong *)(param_1 + 0x18) + lVar32 * 8);
          uVar16 = *(undefined8 *)(lVar17 + 0x28);
          iVar23 = *(int *)(lVar17 + 0x20);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc731;
          FUN_7ff70cb12b60(lVar26,uVar16,(longlong)iVar23 * 0x14);
          uVar16 = *(undefined8 *)(lVar17 + 0x18);
          iVar23 = *(int *)(lVar17 + 0x10);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc744;
          FUN_7ff70cb12b60(lVar27,uVar16,(longlong)iVar23 * 2);
          lVar26 = lVar26 + (longlong)*(int *)(lVar17 + 0x20) * 0x14;
          lVar27 = lVar27 + (longlong)*(int *)(lVar17 + 0x10) * 2;
          lVar32 = lVar32 + 1;
        } while (lVar32 < *(int *)(param_1 + 4));
      }
      uVar16 = puVar28[3];
      lVar26 = *plVar11;
      *(undefined8 *)(&stack0xfffffffffffffff8 + lVar25) = 0;
      pcVar15 = *(code **)(lVar26 + 0x78);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc77e;
      (*pcVar15)(plVar11,uVar16,0);
      uVar16 = puVar28[4];
      pcVar15 = *(code **)(*plVar11 + 0x78);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc78e;
      (*pcVar15)(plVar11,uVar16,0);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc7a6;
      FUN_7ff70cb12b80(&stack0x00000090 + lVar25,0,0x1b20);
      *(undefined8 *)(&stack0x00000088 + lVar25) = 0x1000000010;
      pcVar15 = *(code **)(*plVar11 + 0x300);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc7d7;
      (*pcVar15)(plVar11,&stack0x00000088 + lVar25,&stack0x00000090 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x2f8);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc7ee;
      (*pcVar15)(plVar11,&stack0x0000008c + lVar25,&stack0x00000190 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x2f0);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc802;
      (*pcVar15)(plVar11,&stack0x00000310 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x2d8);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc826;
      (*pcVar15)(plVar11,&stack0x00000318 + lVar25,&stack0x00000320 + lVar25,
                 &stack0x00000330 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x2e0);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc842;
      (*pcVar15)(plVar11,&stack0x00000338 + lVar25,&stack0x00000334 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x248);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc85e;
      (*pcVar15)(plVar11,0,1,&stack0x00000340 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 600);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc87a;
      (*pcVar15)(plVar11,0,1,&stack0x00000348 + lVar25);
      *(undefined4 *)(&stack0x00000370 + lVar25) = 0x100;
      *(undefined8 *)(&stack0x00000368 + lVar25) = 0x10000000100;
      pcVar15 = *(code **)(*plVar11 + 0x250);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc8cb;
      (*pcVar15)(plVar11,&stack0x00000350 + lVar25,&stack0x00000378 + lVar25,
                 &stack0x00000368 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x260);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc8ea;
      (*pcVar15)(plVar11,&stack0x00000358 + lVar25,&stack0x00000b78 + lVar25,
                 &stack0x0000036c + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x240);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc906;
      (*pcVar15)(plVar11,0,1,&stack0x00001b90 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x290);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc925;
      (*pcVar15)(plVar11,&stack0x00000360 + lVar25,&stack0x00001378 + lVar25,
                 &stack0x00000370 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x298);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc939;
      (*pcVar15)(plVar11,&stack0x00001b78 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x280);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc95d;
      (*pcVar15)(plVar11,&stack0x00001b80 + lVar25,&stack0x00001ba4 + lVar25,
                 &stack0x00001b98 + lVar25);
      lVar26 = *plVar11;
      *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00001ba0 + lVar25;
      *(undefined1 **)(&stack0xffffffffffffffe0 + lVar25) = &stack0x00001b9c + lVar25;
      pcVar15 = *(code **)(lVar26 + 0x278);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc993;
      (*pcVar15)(plVar11,0,1,&stack0x00001b88 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x270);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc9a7;
      (*pcVar15)(plVar11,&stack0x00001ba8 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc9b2;
      FUN_7ff70c8bd410(param_1);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bc9b7;
      lVar26 = FUN_7ff70c819540();
      uVar10 = *(undefined4 *)((longlong)puVar28 + 4);
      uVar19 = *(undefined4 *)(puVar28 + 1);
      uVar20 = *(undefined4 *)((longlong)puVar28 + 0xc);
      *(undefined4 *)((longlong)&uStackX_10 + lVar25) = *(undefined4 *)puVar28;
      *(undefined4 *)((longlong)&uStackX_10 + lVar25 + 4) = uVar10;
      *(undefined4 *)((longlong)&uStackX_18 + lVar25) = uVar19;
      *(undefined4 *)((longlong)&uStackX_18 + lVar25 + 4) = uVar20;
      *(undefined8 *)((longlong)&uStackX_20 + lVar25) = puVar28[9];
      *(undefined8 *)(&stack0x00000028 + lVar25) = puVar28[7];
      *(longlong *)(&stack0x00000000 + lVar25) = lVar26;
      *(longlong *)(lVar26 + 0x48) = (longlong)&uStackX_10 + lVar25;
      uVar22 = _DAT_7ff70cb1d730;
      fVar21 = _DAT_7ff70cb1d670;
      uVar16 = _DAT_7ff70cb1d410;
      uVar24 = _DAT_7ff70cb1ba70;
      iVar23 = *(int *)(param_1 + 4);
      if (0 < iVar23) {
        uVar13 = *(undefined8 *)(param_1 + 0x20);
        uVar3 = *(undefined8 *)(param_1 + 0x20);
        uVar4 = *(undefined8 *)(param_1 + 0x30);
        uVar5 = *(undefined8 *)(param_1 + 0x30);
        lVar26 = 0;
        iVar30 = 0;
        do {
          piVar12 = *(int **)(*(longlong *)(param_1 + 0x18) + lVar26 * 8);
          if (0 < *piVar12) {
            *(longlong *)((longlong)&lStackX_8 + lVar25) = lVar26;
            lVar26 = 0x18;
            lVar27 = 0;
            do {
              lVar17 = *(longlong *)(piVar12 + 2);
              lVar32 = lVar17 + lVar26;
              pcVar15 = *(code **)(lVar17 + 0x18 + lVar26);
              if (pcVar15 == (code *)0x0) {
                fVar37 = (*(float *)(lVar32 + -0x18) - (float)uVar13) * (float)uVar4;
                fVar39 = (*(float *)(lVar32 + -0x14) - (float)((ulonglong)uVar13 >> 0x20)) *
                         (float)((ulonglong)uVar4 >> 0x20);
                fVar40 = (*(float *)(lVar32 + -0x10) - (float)uVar3) * (float)uVar5;
                fVar41 = (*(float *)(lVar32 + -0xc) - (float)((ulonglong)uVar3 >> 0x20)) *
                         (float)((ulonglong)uVar5 >> 0x20);
                iVar23 = -(uint)(fVar37 < fVar40);
                iVar36 = -(uint)(fVar39 < fVar41);
                auVar46._4_4_ = iVar36;
                auVar46._0_4_ = iVar23;
                auVar46._8_4_ = iVar36;
                auVar46._12_4_ = iVar36;
                auVar43._8_8_ = auVar46._8_8_;
                auVar43._4_4_ = iVar23;
                auVar43._0_4_ = iVar23;
                iVar23 = movmskpd(0,auVar43);
                if (iVar23 == 3) {
                  *(int *)(&stack0x00000070 + lVar25) = (int)fVar37;
                  *(int *)(&stack0x00000074 + lVar25) = (int)fVar39;
                  *(int *)(&stack0x00000078 + lVar25) = (int)fVar40;
                  *(int *)(&stack0x0000007c + lVar25) = (int)fVar41;
                  pcVar15 = *(code **)(*plVar11 + 0x168);
                  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcb25;
                  (*pcVar15)(plVar11,1,&stack0x00000070 + lVar25);
                  lVar32 = *(longlong *)(lVar17 + -8 + lVar26);
                  puVar29 = (undefined8 *)(lVar32 + 0x10);
                  if (lVar32 == 0) {
                    puVar29 = (undefined8 *)(lVar17 + lVar26);
                  }
                  *(undefined8 *)(&stack0x00000060 + lVar25) = *puVar29;
                  pcVar15 = *(code **)(*plVar11 + 0x40);
                  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcb5d;
                  (*pcVar15)(plVar11,0,1,&stack0x00000060 + lVar25);
                  iVar23 = *(int *)(lVar17 + 8 + lVar26);
                  iVar36 = *(int *)(lVar17 + 0xc + lVar26);
                  uVar10 = *(undefined4 *)(lVar17 + 0x10 + lVar26);
                  pcVar15 = *(code **)(*plVar11 + 0x60);
                  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcb7d;
                  (*pcVar15)(plVar11,uVar10,iVar36 + *(int *)(&stack0xfffffffffffffff8 + lVar25),
                             iVar23 + iVar30);
                }
              }
              else if (pcVar15 == (code *)0xfffffffffffffff8) {
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcab7;
                lVar32 = FUN_7ff70c808680();
                if (lVar32 == 0) {
                  lVar32 = 0;
                }
                else {
                  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcac5;
                  lVar32 = FUN_7ff70c8194a0();
                  lVar32 = *(longlong *)(lVar32 + 0x98);
                }
                uVar6 = *(undefined8 *)(param_1 + 0x28);
                uVar7 = *(undefined8 *)(param_1 + 0x30);
                *(undefined8 *)(&stack0x00000080 + lVar25) = uVar16;
                *(undefined8 *)(&stack0x00000070 + lVar25) = 0;
                *(ulonglong *)(&stack0x00000078 + lVar25) =
                     CONCAT44((float)((ulonglong)uVar7 >> 0x20) * (float)((ulonglong)uVar6 >> 0x20),
                              (float)uVar7 * (float)uVar6);
                pcVar15 = *(code **)(*plVar11 + 0x160);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcbc3;
                (*pcVar15)(plVar11,1,&stack0x00000070 + lVar25);
                uVar6 = *(undefined8 *)(lVar32 + 0x38);
                lVar17 = *plVar11;
                *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00000060 + lVar25;
                *(undefined4 *)(&stack0xffffffffffffffe0 + lVar25) = 0;
                pcVar15 = *(code **)(lVar17 + 0x70);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcbf2;
                iVar23 = (*pcVar15)(plVar11,uVar6,0,4);
                if (iVar23 == 0) {
                  pfVar18 = *(float **)(&stack0x00000060 + lVar25);
                  uVar33 = *(ulonglong *)(param_1 + 0x20);
                  auVar38._8_8_ = 0;
                  auVar38._0_8_ = uVar33;
                  fVar37 = (float)uVar33;
                  auVar42._0_4_ = (float)*(undefined8 *)(param_1 + 0x28) + fVar37;
                  fVar39 = (float)(uVar33 >> 0x20);
                  auVar42._4_4_ =
                       (float)((ulonglong)*(undefined8 *)(param_1 + 0x28) >> 0x20) + fVar39;
                  auVar42._8_8_ = 0;
                  auVar44._0_4_ = fVar37 + auVar42._0_4_;
                  auVar44._4_4_ = fVar39 + auVar42._4_4_;
                  auVar44._8_8_ = 0;
                  auVar45._8_8_ = 0;
                  auVar45._0_8_ = uVar33;
                  auVar46 = blendps(auVar45,auVar42,2);
                  auVar43 = insertps(auVar42,auVar38,0x50);
                  auVar47._0_4_ = auVar46._0_4_ - auVar43._0_4_;
                  auVar47._4_4_ = auVar46._4_4_ - auVar43._4_4_;
                  auVar47._8_4_ = auVar46._8_4_ - auVar43._8_4_;
                  auVar47._12_4_ = auVar46._12_4_ - auVar43._12_4_;
                  auVar43 = divps(auVar44,auVar47);
                  *pfVar18 = fVar21 / (auVar42._0_4_ - fVar37);
                  pfVar18[1] = 0.0;
                  pfVar18[2] = 0.0;
                  pfVar18[3] = 0.0;
                  pfVar18[4] = 0.0;
                  pfVar18[5] = fVar21 / (fVar39 - auVar42._4_4_);
                  pfVar18[6] = 0.0;
                  pfVar18[7] = 0.0;
                  pfVar18[8] = 0.0;
                  pfVar18[9] = 0.0;
                  *(ulonglong *)(pfVar18 + 10) = (ulonglong)uVar24;
                  *(longlong *)(pfVar18 + 0xc) = auVar43._0_8_;
                  *(undefined8 *)(pfVar18 + 0xe) = uVar22;
                  uVar6 = *(undefined8 *)(lVar32 + 0x38);
                  pcVar15 = *(code **)(*plVar11 + 0x78);
                  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcc7e;
                  (*pcVar15)(plVar11,uVar6,0);
                }
                *(undefined4 *)(&stack0x0000005c + lVar25) = 0x14;
                *(undefined4 *)(&stack0x00000058 + lVar25) = 0;
                uVar6 = *(undefined8 *)(lVar32 + 0x30);
                pcVar15 = *(code **)(*plVar11 + 0x88);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcca4;
                (*pcVar15)(plVar11,uVar6);
                lVar17 = *plVar11;
                *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00000058 + lVar25;
                *(undefined1 **)(&stack0xffffffffffffffe0 + lVar25) = &stack0x0000005c + lVar25;
                pcVar15 = *(code **)(lVar17 + 0x90);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bccd6;
                (*pcVar15)(plVar11,0,1,lVar32 + 0x18);
                uVar6 = *(undefined8 *)(lVar32 + 0x20);
                pcVar15 = *(code **)(*plVar11 + 0x98);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bccef;
                (*pcVar15)(plVar11,uVar6,0x39,0);
                pcVar15 = *(code **)(*plVar11 + 0xc0);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd00;
                (*pcVar15)(plVar11,4);
                uVar6 = *(undefined8 *)(lVar32 + 0x28);
                pcVar15 = *(code **)(*plVar11 + 0x58);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd13;
                (*pcVar15)(plVar11,uVar6,0,0);
                pcVar15 = *(code **)(*plVar11 + 0x38);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd27;
                (*pcVar15)(plVar11,0,1,(undefined8 *)(lVar32 + 0x38));
                uVar6 = *(undefined8 *)(lVar32 + 0x40);
                pcVar15 = *(code **)(*plVar11 + 0x48);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd3a;
                (*pcVar15)(plVar11,uVar6,0,0);
                pcVar15 = *(code **)(*plVar11 + 0x50);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd4f;
                (*pcVar15)(plVar11,0,1,lVar32 + 0x48);
                pcVar15 = *(code **)(*plVar11 + 0xb8);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd63;
                (*pcVar15)(plVar11,0,0,0);
                pcVar15 = *(code **)(*plVar11 + 0x1e0);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd77;
                (*pcVar15)(plVar11,0,0,0);
                pcVar15 = *(code **)(*plVar11 + 0x200);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd8b;
                (*pcVar15)(plVar11,0,0,0);
                pcVar15 = *(code **)(*plVar11 + 0x228);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcd9f;
                (*pcVar15)(plVar11,0,0,0);
                *(undefined8 *)(&stack0x00001bb0 + lVar25) = 0;
                *(undefined8 *)(&stack0x00001bb8 + lVar25) = 0;
                uVar6 = *(undefined8 *)(lVar32 + 0x58);
                pcVar15 = *(code **)(*plVar11 + 0x118);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcdc6;
                (*pcVar15)(plVar11,uVar6,&stack0x00001bb0 + lVar25,0xffffffff);
                uVar6 = *(undefined8 *)(lVar32 + 0x60);
                pcVar15 = *(code **)(*plVar11 + 0x120);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcdd9;
                (*pcVar15)(plVar11,uVar6,0);
                uVar6 = *(undefined8 *)(lVar32 + 0x50);
                pcVar15 = *(code **)(*plVar11 + 0x158);
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcde9;
                (*pcVar15)(plVar11,uVar6);
              }
              else {
                *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bca85;
                (*pcVar15)(piVar12);
              }
              lVar27 = lVar27 + 1;
              lVar26 = lVar26 + 0x48;
            } while (lVar27 < *piVar12);
            iVar23 = *(int *)(param_1 + 4);
            lVar26 = *(longlong *)((longlong)&lStackX_8 + lVar25);
          }
          *(ulonglong *)(&stack0xfffffffffffffff8 + lVar25) =
               (ulonglong)
               (uint)((int)*(undefined8 *)(&stack0xfffffffffffffff8 + lVar25) + piVar12[4]);
          iVar30 = iVar30 + piVar12[8];
          lVar26 = lVar26 + 1;
        } while (lVar26 < iVar23);
      }
      *(undefined8 *)(*(longlong *)(&stack0x00000000 + lVar25) + 0x48) = 0;
      pcVar15 = *(code **)(*plVar11 + 0x168);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce16;
      (*pcVar15)(plVar11,*(undefined4 *)(&stack0x00000088 + lVar25),&stack0x00000090 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x160);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce31;
      (*pcVar15)(plVar11,*(undefined4 *)(&stack0x0000008c + lVar25),&stack0x00000190 + lVar25);
      pcVar15 = *(code **)(*plVar11 + 0x158);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce45;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000310 + lVar25));
      if (*(longlong **)(&stack0x00000310 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000310 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce58;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x118);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce7c;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000318 + lVar25),&stack0x00000320 + lVar25,
                 *(undefined4 *)(&stack0x00000330 + lVar25));
      if (*(longlong **)(&stack0x00000318 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000318 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bce8f;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x120);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bceab;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000338 + lVar25),
                 *(undefined4 *)(&stack0x00000334 + lVar25));
      if (*(longlong **)(&stack0x00000338 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000338 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcebe;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x40);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bced7;
      (*pcVar15)(plVar11,0,1,&stack0x00000340 + lVar25);
      if (*(longlong **)(&stack0x00000340 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000340 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bceea;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x50);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcf03;
      (*pcVar15)(plVar11,0,1,&stack0x00000348 + lVar25);
      if (*(longlong **)(&stack0x00000348 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000348 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcf16;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x48);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcf37;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000350 + lVar25),&stack0x00000378 + lVar25,
                 *(undefined4 *)(&stack0x00000368 + lVar25));
      if (*(longlong **)(&stack0x00000350 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000350 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcf4a;
        (*pcVar15)();
      }
      uVar24 = *(uint *)(&stack0x00000368 + lVar25);
      if (uVar24 != 0) {
        uVar33 = 0;
        do {
          if (*(longlong **)(&stack0x00000378 + uVar33 * 8 + lVar25) != (longlong *)0x0) {
            pcVar15 = *(code **)(**(longlong **)(&stack0x00000378 + uVar33 * 8 + lVar25) + 0x10);
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcf7d;
            (*pcVar15)();
            uVar24 = *(uint *)(&stack0x00000368 + lVar25);
          }
          uVar33 = uVar33 + 1;
        } while (uVar33 < uVar24);
      }
      pcVar15 = *(code **)(*plVar11 + 0x58);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcfa7;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000358 + lVar25),&stack0x00000b78 + lVar25,
                 *(undefined4 *)(&stack0x0000036c + lVar25));
      if (*(longlong **)(&stack0x00000358 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000358 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcfba;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x38);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcfd3;
      (*pcVar15)(plVar11,0,1,&stack0x00001b90 + lVar25);
      if (*(longlong **)(&stack0x00001b90 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00001b90 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bcfe6;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0xb8);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd00a;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00000360 + lVar25),&stack0x00001378 + lVar25,
                 *(undefined4 *)(&stack0x00000370 + lVar25));
      if (*(longlong **)(&stack0x00000360 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00000360 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd01d;
        (*pcVar15)();
      }
      uVar24 = *(uint *)(&stack0x0000036c + lVar25);
      if (uVar24 != 0) {
        uVar33 = 0;
        do {
          if (*(longlong **)(&stack0x00000b78 + uVar33 * 8 + lVar25) != (longlong *)0x0) {
            pcVar15 = *(code **)(**(longlong **)(&stack0x00000b78 + uVar33 * 8 + lVar25) + 0x10);
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd04d;
            (*pcVar15)();
            uVar24 = *(uint *)(&stack0x0000036c + lVar25);
          }
          uVar33 = uVar33 + 1;
        } while (uVar33 < uVar24);
      }
      pcVar15 = *(code **)(*plVar11 + 0xc0);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd069;
      (*pcVar15)(plVar11,*(undefined4 *)(&stack0x00001b78 + lVar25));
      pcVar15 = *(code **)(*plVar11 + 0x98);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd08d;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00001b80 + lVar25),
                 *(undefined4 *)(&stack0x00001ba4 + lVar25),
                 *(undefined4 *)(&stack0x00001b98 + lVar25));
      if (*(longlong **)(&stack0x00001b80 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00001b80 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd0a0;
        (*pcVar15)();
      }
      lVar26 = *plVar11;
      *(undefined1 **)(&stack0xffffffffffffffe8 + lVar25) = &stack0x00001ba0 + lVar25;
      *(undefined1 **)(&stack0xffffffffffffffe0 + lVar25) = &stack0x00001b9c + lVar25;
      pcVar15 = *(code **)(lVar26 + 0x90);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd0d6;
      (*pcVar15)(plVar11,0,1,&stack0x00001b88 + lVar25);
      if (*(longlong **)(&stack0x00001b88 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00001b88 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd0e9;
        (*pcVar15)();
      }
      pcVar15 = *(code **)(*plVar11 + 0x88);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd0fd;
      (*pcVar15)(plVar11,*(undefined8 *)(&stack0x00001ba8 + lVar25));
      if (*(longlong **)(&stack0x00001ba8 + lVar25) != (longlong *)0x0) {
        pcVar15 = *(code **)(**(longlong **)(&stack0x00001ba8 + lVar25) + 0x10);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd110;
        (*pcVar15)();
      }
    }
  }
LAB_7ff70c8bd110:
  if (_DAT_7ff70cbebd80 ==
      (*(ulonglong *)(&stack0x00001bc8 + lVar25) ^ (ulonglong)(&stack0xffffffffffffffc0 + lVar25)))
  {
    return;
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x7ff70c8bd188;
  FUN_7ff70caa97e0(*(ulonglong *)(&stack0x00001bc8 + lVar25) ^
                   (ulonglong)(&stack0xffffffffffffffc0 + lVar25));
  pcVar15 = (code *)swi(3);
  (*pcVar15)();
  return;
}


