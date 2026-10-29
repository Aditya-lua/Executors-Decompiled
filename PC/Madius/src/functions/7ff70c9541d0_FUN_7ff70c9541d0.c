/* 7ff70c9541d0 FUN_7ff70c9541d0 */

/* WARNING: Instruction at (ram,0x7ff70c954529) overlaps instruction at (ram,0x7ff70c954528)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9541d0(longlong param_1,char param_2)

{
  byte *pbVar1;
  byte bVar2;
  char cVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  uint uVar6;
  int iVar7;
  int *piVar8;
  undefined8 uVar9;
  longlong lVar10;
  char *pcVar11;
  ulonglong uVar12;
  longlong lVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  longlong lVar16;
  undefined *puVar17;
  byte *pbVar18;
  undefined8 *puVar19;
  byte **ppbVar20;
  ulonglong unaff_RBP;
  undefined *puVar21;
  ulonglong uVar22;
  ulonglong uVar23;
  bool bVar24;
  byte *pbStack_c8;
  undefined8 uStack_c0;
  undefined1 auStack_b8 [32];
  undefined *puStack_98;
  undefined *puStack_90;
  undefined *puStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined *puStack_70;
  undefined8 uStack_68;
  int *piStack_60;
  int *piStack_58;
  uint uStack_4c;
  byte *pbStack_48;
  
  ppbVar20 = (byte **)auStack_b8;
  lVar13 = *(longlong *)(param_1 + 0x718);
  lVar16 = 2;
  uStack_c0 = 0x7ff70c9541fc;
  FUN_7ff70c959850(param_1,2,2);
  puVar15 = (undefined8 *)auStack_b8;
  if (lVar13 == 0) goto joined_r0x7ff70c954635;
  pbVar18 = *(byte **)(param_1 + 0x718);
  lVar13 = *(longlong *)(param_1 + 0xa58);
  piStack_60 = (int *)0x0;
  piStack_58 = (int *)0x0;
  puVar15 = (undefined8 *)auStack_b8;
  if (lVar13 == 0) goto joined_r0x7ff70c954635;
  uStack_c0 = 0x7ff70c954236;
  FUN_7ff70c9535c0(lVar13);
  uVar6 = *pbVar18 - 0x2d;
  if (uVar6 == 0) {
    uVar6 = (uint)pbVar18[1];
  }
  bVar24 = (int)-uVar6 < 0;
  if (-uVar6 == 0) {
    lVar10 = 1;
    uStack_c0 = 0x7ff70c954275;
    piVar8 = (int *)func_0x7ff70d7cb57b();
    if (!bVar24) {
      unaff_RBP = CONCAT71((int7)(unaff_RBP >> 8),1);
      piStack_60 = piVar8;
LAB_7ff70c95428a:
      uStack_c0 = 0x7ff70c9542a1;
      uVar9 = FUN_7ff70cb12c70(&UNK_7ff70cb922e4,0x83,1);
      lVar16 = (longlong)*(int *)(lVar13 + 0x200);
      if (lVar16 != 0) goto code_r0x7ff70c9542b2;
LAB_7ff70c954498:
      puVar19 = (undefined8 *)auStack_b8;
      piVar8 = piStack_58;
      if ((char)unaff_RBP == '\0') {
        puVar19 = &uStack_c0;
        pbStack_c8 = (byte *)0x7ff70c9544c0;
        uStack_c0 = uVar9;
        func_0x7ff70d979e16(piStack_60);
        uStack_68 = 0;
        if (piStack_60 == (int *)0x0) {
          pbStack_c8 = (byte *)0x7ff70c954633;
          (*_DAT_7ff70cbebad8)(0);
          puVar15 = &uStack_c0;
          goto joined_r0x7ff70c954635;
        }
        pbStack_c8 = (byte *)0x7ff70c9544df;
        iVar7 = FUN_7ff70c996b40();
        piVar8 = piStack_60;
        if (iVar7 != 0) {
          ppbVar20 = &pbStack_c8;
          pbStack_c8 = pbVar18;
          func_0x7ff70d8221a3(piStack_60);
          iVar7 = 0x17;
          goto LAB_7ff70c954264;
        }
      }
      *(undefined8 *)((longlong)puVar19 + -8) = 0x7ff70c9544a8;
      (*_DAT_7ff70cbebad8)(piVar8);
      puVar15 = puVar19;
      goto joined_r0x7ff70c954635;
    }
    pbVar1 = (byte *)(lVar10 + -0x41);
    bVar2 = *pbVar1;
    *pbVar1 = *pbVar1 + (byte)piVar8;
    uVar6 = ((int)piVar8 - *piVar8) - (uint)CARRY1(bVar2,(byte)piVar8);
    *(char *)(ulonglong)uVar6 = *(char *)(ulonglong)uVar6 + (char)uVar6;
code_r0x7ff70c9542b2:
    ppbVar20 = (byte **)auStack_b8;
    uStack_c0 = 0x7ff70c9542c1;
    lVar16 = (*_DAT_7ff70cbebaf0)(1,lVar16 << 3);
    iVar7 = 0x1b;
    if (lVar16 != 0) {
      uStack_4c = (uint)unaff_RBP;
      uVar23 = 0;
      lVar10 = 0;
      do {
        for (puVar15 = *(undefined8 **)(lVar13 + lVar10 * 8); puVar15 != (undefined8 *)0x0;
            puVar15 = (undefined8 *)*puVar15) {
          if (puVar15[5] != 0) {
            *(undefined8 **)(lVar16 + uVar23 * 8) = puVar15;
            uVar23 = uVar23 + 1;
          }
        }
        lVar10 = lVar10 + 1;
      } while (lVar10 != 0x3f);
      uStack_68 = CONCAT17(param_2,(undefined7)uStack_68);
      uStack_c0 = 0x7ff70c954334;
      pbStack_48 = pbVar18;
      pcVar11 = (char *)func_0x7ff70d81f57c(lVar16,uVar23,8,&UNK_7ff70c954640);
      *(int *)pbVar18 = *(int *)pbVar18 + -1;
      *pcVar11 = *pcVar11 + (char)pcVar11;
      uVar12 = 0;
      uVar22 = 1;
      do {
        ppbVar20 = (byte **)auStack_b8;
        lVar13 = *(longlong *)(lVar16 + uVar12 * 8);
        pcVar11 = *(char **)(lVar13 + 0x28);
        puVar21 = &UNK_7ff70cb923a7;
        if (((pcVar11 != (char *)0x0 & *(byte *)(lVar13 + 0x38)) == 1) &&
           (puVar21 = &UNK_7ff70cb923a7, *pcVar11 != '.')) {
          puVar21 = &UNK_7ff70cb8dfd1;
        }
        puStack_70 = *(undefined **)(lVar13 + 0x10);
        puStack_90 = *(undefined **)(lVar13 + 0x18);
        if (pcVar11 == (char *)0x0) {
          pcVar11 = "unknown";
        }
        if (puStack_90 == (undefined *)0x0) {
          puStack_90 = &UNK_7ff70cb8bfe8;
        }
        if (puStack_70 == (undefined *)0x0) {
          puStack_70 = &UNK_7ff70cb923a7;
        }
        puStack_98 = &UNK_7ff70cb8a484;
        if (*(byte *)(lVar13 + 0x38) == 0) {
          puStack_98 = &UNK_7ff70cb8a4ed;
          if (*(char *)(lVar13 + 0x39) == '\0') goto LAB_7ff70c954464;
LAB_7ff70c9543cf:
          puStack_88 = &UNK_7ff70cb8a484;
          cVar3 = *(char *)(lVar13 + 0x3b);
        }
        else {
          if (*(char *)(lVar13 + 0x39) != '\0') goto LAB_7ff70c9543cf;
LAB_7ff70c954464:
          puStack_88 = &UNK_7ff70cb8a4ed;
          cVar3 = *(char *)(lVar13 + 0x3b);
        }
        puVar17 = &UNK_7ff70cb89397;
        if (cVar3 == '\0') {
          puVar17 = &UNK_7ff70cb923a7;
        }
        uStack_78 = *(undefined8 *)(lVar13 + 8);
        uStack_80 = *(undefined8 *)(lVar13 + 0x30);
        uStack_c0 = 0x7ff70c954411;
        lVar13 = FUN_7ff70c95c280(&UNK_7ff70cb831f4,puVar17,puVar21,pcVar11);
        if (lVar13 == 0) {
          uStack_c0 = 0x7ff70c954502;
          (*_DAT_7ff70cbebad8)(lVar16);
          unaff_RBP = (ulonglong)uStack_4c;
          iVar7 = 0x1b;
          param_2 = uStack_68._7_1_;
          goto LAB_7ff70c954511;
        }
        uStack_c0 = 0x7ff70c954431;
        FUN_7ff70c95c3b0(piStack_60,&UNK_7ff70cb90f5a,lVar13);
        uStack_c0 = 0x7ff70c95443a;
        (*_DAT_7ff70cbebad8)(lVar13);
        bVar24 = uVar22 < uVar23;
        uVar12 = uVar22;
        uVar22 = (ulonglong)((int)uVar22 + 1);
      } while (bVar24);
      uStack_c0 = 0x7ff70c95448a;
      uVar9 = (*_DAT_7ff70cbebad8)(lVar16);
      unaff_RBP = (ulonglong)uStack_4c;
      pbVar18 = pbStack_48;
      param_2 = uStack_68._7_1_;
      goto LAB_7ff70c954498;
    }
  }
  else {
    uStack_c0 = 0x7ff70c95425d;
    iVar7 = FUN_7ff70c996a10(param_1,pbVar18,&piStack_60,&piStack_58);
    if (iVar7 == 0) {
      unaff_RBP = 0;
      goto LAB_7ff70c95428a;
    }
LAB_7ff70c954264:
    unaff_RBP = 0;
  }
LAB_7ff70c954511:
  if (*(longlong *)((longlong)ppbVar20 + 0x58) == 0 || (unaff_RBP & 1) != 0) {
    *(undefined8 *)((longlong)ppbVar20 + -8) = 0x7ff70c954534;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)((longlong)ppbVar20 + 0x60));
  }
  else {
    *(undefined **)((longlong)ppbVar20 + -8) = &UNK_7ff70c954528;
    func_0x7ff70d745ae9();
  }
  puVar15 = ppbVar20;
  if (*(char *)(param_1 + 0xa37) == '\x01') {
    *(undefined8 *)((longlong)ppbVar20 + -8) = 0x7ff70c954545;
    uVar14 = FUN_7ff70c991180(iVar7);
    uVar9 = *(undefined8 *)(param_1 + 0x718);
    *(undefined8 *)((longlong)ppbVar20 + -8) = 0x7ff70c95455e;
    FUN_7ff70c941400(param_1,&UNK_7ff70cb829e5,uVar9,uVar14);
  }
joined_r0x7ff70c954635:
  if (param_2 != '\0') {
    lVar13 = *(longlong *)(param_1 + 0xa58);
    if ((*(longlong *)(param_1 + 0xe8) == 0) ||
       (lVar13 != *(longlong *)(*(longlong *)(param_1 + 0xe8) + 0xb8))) {
      if (lVar13 != 0) {
        lVar16 = 0;
        do {
          puVar5 = *(undefined8 **)(lVar13 + lVar16 * 8);
          while (puVar5 != (undefined8 *)0x0) {
            puVar4 = (undefined8 *)*puVar5;
            uVar9 = puVar5[5];
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545bd;
            (*_DAT_7ff70cbebad8)(uVar9);
            uVar9 = puVar5[3];
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545c7;
            (*_DAT_7ff70cbebad8)(uVar9);
            uVar9 = puVar5[4];
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545d1;
            (*_DAT_7ff70cbebad8)(uVar9);
            uVar9 = puVar5[1];
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545db;
            (*_DAT_7ff70cbebad8)(uVar9);
            uVar9 = puVar5[2];
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545e5;
            (*_DAT_7ff70cbebad8)(uVar9);
            *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c9545ee;
            (*_DAT_7ff70cbebad8)(puVar5);
            puVar5 = puVar4;
          }
          lVar16 = lVar16 + 1;
        } while (lVar16 != 0x3f);
        *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c954601;
        (*_DAT_7ff70cbebad8)(lVar13);
      }
      *(undefined8 *)(param_1 + 0xa58) = 0;
    }
  }
  *(undefined8 *)((longlong)puVar15 + -8) = 0x7ff70c954619;
  FUN_7ff70c959890(param_1,2);
  return;
}


