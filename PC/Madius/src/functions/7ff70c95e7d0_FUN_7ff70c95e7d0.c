/* 7ff70c95e7d0 FUN_7ff70c95e7d0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c95e7d0(undefined8 *param_1,char *param_2,undefined8 param_3)

{
  char *pcVar1;
  double dVar2;
  undefined8 uVar3;
  bool bVar4;
  bool bVar5;
  ulonglong uVar6;
  double dVar7;
  char cVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  int iVar12;
  longlong lVar13;
  longlong lVar14;
  undefined1 *puVar15;
  byte bVar16;
  ulonglong uVar17;
  byte *pbVar18;
  undefined8 *puVar19;
  ulonglong uVar20;
  uint uVar21;
  undefined *puVar22;
  ulonglong uVar23;
  int iVar24;
  uint uVar25;
  uint uVar26;
  char *pcVar27;
  longlong lVar28;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  byte abStackX_8 [8];
  char acStackX_10 [8];
  undefined4 auStackX_18 [2];
  undefined8 uStackX_20;
  undefined8 uStack_48;
  
  uStack_48 = 0x7ff70c95e7e6;
  lVar13 = FUN_7ff70caa9780();
  lVar13 = -lVar13;
  *(undefined4 *)(&stack0x00001180 + lVar13) = unaff_XMM6_Da;
  *(undefined4 *)(&stack0x00001184 + lVar13) = unaff_XMM6_Db;
  *(undefined4 *)(&stack0x00001188 + lVar13) = unaff_XMM6_Dc;
  *(undefined4 *)(&stack0x0000118c + lVar13) = unaff_XMM6_Dd;
  puVar19 = (undefined8 *)(&stack0x00000d80 + lVar13);
  *(undefined8 *)((longlong)&uStack_48 + lVar13) = 0x7ff70c95e816;
  iVar9 = FUN_7ff70c95c440(param_2,&stack0x00000180 + lVar13,puVar19,param_3);
  dVar7 = _DAT_7ff70cb50f10;
  if (iVar9 != 0) {
    return;
  }
  puVar22 = &UNK_7ff70cb50e90;
  iVar24 = 0;
  pcVar1 = acStackX_10 + lVar13;
  iVar9 = 0;
  do {
    while( true ) {
      while (cVar8 = *param_2, cVar8 != '%') {
        if (cVar8 == '\0') {
          return;
        }
        do {
          acStackX_10[lVar13] = cVar8;
          uVar3 = *param_1;
          *(undefined8 *)((longlong)&uStack_48 + lVar13) = 0x7ff70c95e865;
          iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar10 != 0) goto LAB_7ff70c95f48b;
          iVar9 = iVar9 + 1;
          cVar8 = param_2[1];
          param_2 = param_2 + 1;
        } while ((cVar8 != '\0') && (cVar8 != '%'));
      }
      cVar8 = param_2[1];
      if (cVar8 != '%') break;
      acStackX_10[lVar13] = '%';
      uVar3 = *param_1;
      *(undefined8 *)((longlong)&uStack_48 + lVar13) = 0x7ff70c95e8ae;
      iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
      if (iVar10 != 0) goto LAB_7ff70c95f48b;
      param_2 = param_2 + 2;
      iVar9 = iVar9 + 1;
    }
    iVar10 = iVar24;
    if ((byte)(cVar8 - 0x30U) < 10) {
      param_2 = param_2 + 2;
      iVar10 = 0;
      do {
        iVar11 = (uint)(byte)(cVar8 - 0x30) + iVar10 * 10;
        if (0x7f < iVar10) {
          iVar11 = iVar10;
        }
        cVar8 = *param_2;
        param_2 = param_2 + 1;
        iVar10 = iVar11;
      } while ((byte)(cVar8 - 0x30U) < 10);
      iVar10 = iVar11 + -1;
      if (iVar11 == 0) {
        iVar10 = iVar24;
      }
      if (cVar8 != '$') {
        iVar10 = iVar24;
      }
      if (0x80 < iVar11) {
        iVar10 = iVar24;
      }
    }
    *(undefined **)(&stack0xfffffffffffffff0 + lVar13) = puVar22;
    lVar28 = (longlong)iVar10 * 0x18 + lVar13 + -0x40;
    uVar21 = *(uint *)(&stack0x00000184 + (longlong)iVar10 * 0x18 + lVar13);
    if ((uVar21 & 0x4000) == 0) {
      iVar24 = iVar24 + 1;
      uVar25 = *(uint *)(&stack0x00000188 + lVar28 + 0x40);
      uVar26 = uVar25;
    }
    else {
      uVar26 = *(uint *)(&stack0x00000188 + lVar28 + 0x40);
      uVar25 = *(uint *)(&stack0x00000190 + (longlong)(int)uVar26 * 0x18 + lVar13);
      iVar24 = iVar24 + 2;
      if ((int)uVar25 < 0) {
        uVar25 = -uVar25;
        uVar21 = uVar21 & 0xfffffefb | 4;
        *(uint *)(&stack0x00000184 + lVar28 + 0x40) = uVar21;
      }
    }
    if ((uVar21 & 0x10000) == 0) {
      iVar10 = -1;
      if ((short)uVar21 < 0) {
        iVar10 = *(int *)(&stack0x0000018c + lVar28 + 0x40);
      }
    }
    else {
      iVar10 = *(int *)(&stack0x00000190 +
                       (longlong)*(int *)(&stack0x0000018c + lVar28 + 0x40) * 0x18 + lVar13);
      iVar24 = iVar24 + 1;
      if (iVar10 < 0) {
        iVar10 = -1;
      }
    }
    switch(*(undefined4 *)(&stack0x00000180 + lVar28 + 0x40)) {
    case 1:
      pcVar27 = *(char **)(&stack0x00000190 + lVar28 + 0x40);
      if (pcVar27 == (char *)0x0) {
        if (iVar10 == -1 || 4 < iVar10) {
          uVar21 = uVar21 & 0xfffffff7;
          *(uint *)(&stack0x00000184 + lVar28 + 0x40) = uVar21;
          uVar17 = 5;
          *(undefined **)(abStackX_8 + lVar13) = &UNK_7ff70cb50ee5;
        }
        else {
          *(undefined **)(abStackX_8 + lVar13) = &UNK_7ff70cb923a7;
code_r0x7ff70c95ee75:
          uVar17 = 0;
        }
      }
      else {
        *(char **)(abStackX_8 + lVar13) = pcVar27;
        if (iVar10 == -1) {
          if (*pcVar27 == '\0') goto code_r0x7ff70c95ee75;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ee61;
          uVar17 = FUN_7ff70cb12e80();
        }
        else {
          uVar17 = (ulonglong)iVar10;
        }
      }
      uVar20 = 0x7fffffff;
      if (uVar17 < 0x7fffffff) {
        uVar20 = uVar17;
      }
      *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar21;
      *(ulonglong *)(&stack0x00000000 + lVar13) = uVar17;
      iVar10 = iVar9;
      if ((uVar21 & 8) != 0) {
        acStackX_10[lVar13] = '\"';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95eead;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        iVar10 = iVar9 + 1;
        uVar21 = *(uint *)(&stack0xffffffffffffffec + lVar13);
        uVar17 = *(ulonglong *)(&stack0x00000000 + lVar13);
      }
      iVar11 = uVar25 - (int)uVar20;
      if ((uVar21 & 4) == 0) {
        if (iVar11 < 1) {
          iVar11 = iVar11 + -1;
        }
        else {
          iVar10 = (uVar25 + iVar10) - (int)uVar20;
          do {
            acStackX_10[lVar13] = ' ';
            uVar3 = *param_1;
            *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95eef6;
            iVar9 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
            if (iVar9 != 0) goto LAB_7ff70c95f48b;
            iVar9 = iVar11 + -1;
            bVar5 = 0 < iVar11;
            iVar11 = iVar9;
          } while (iVar9 != 0 && bVar5);
          iVar11 = -1;
          uVar21 = *(uint *)(&stack0xffffffffffffffec + lVar13);
          uVar17 = *(ulonglong *)(&stack0x00000000 + lVar13);
        }
      }
      iVar9 = iVar10;
      if (uVar17 != 0) {
        iVar9 = iVar10 + (int)uVar17;
        lVar28 = 0;
        do {
          if (*(char *)(*(longlong *)(abStackX_8 + lVar13) + lVar28) == '\0') {
            iVar9 = iVar10 + (int)lVar28;
            break;
          }
          acStackX_10[lVar13] = *(char *)(*(longlong *)(abStackX_8 + lVar13) + lVar28);
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ef87;
          iVar12 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar12 != 0) goto LAB_7ff70c95f48b;
          lVar28 = lVar28 + 1;
          uVar21 = *(uint *)(&stack0xffffffffffffffec + lVar13);
        } while (*(longlong *)(&stack0x00000000 + lVar13) != lVar28);
      }
      if (((uVar21 & 4) != 0) && (0 < iVar11)) {
        iVar9 = iVar9 + iVar11;
        iVar11 = iVar11 + 1;
        do {
          acStackX_10[lVar13] = ' ';
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95efcd;
          iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar10 != 0) goto LAB_7ff70c95f48b;
          iVar11 = iVar11 + -1;
        } while (1 < iVar11);
        uVar21 = *(uint *)(&stack0xffffffffffffffec + lVar13);
      }
      puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
      if ((uVar21 & 8) != 0) {
        acStackX_10[lVar13] = '\"';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f008;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        iVar9 = iVar9 + 1;
      }
      break;
    case 2:
      uVar17 = *(ulonglong *)(&stack0x00000190 + lVar28 + 0x40);
      if (uVar17 == 0) {
        iVar10 = uVar25 - 5;
        *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar21;
        if ((uVar21 & 4) == 0) {
          puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
          iVar11 = iVar10;
        }
        else {
          iVar11 = uVar25 - 6;
          puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
          if (5 < (int)uVar25) {
            iVar9 = iVar9 + iVar10;
            do {
              acStackX_10[lVar13] = ' ';
              uVar3 = *param_1;
              *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ef3d;
              iVar11 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
              if (iVar11 != 0) goto LAB_7ff70c95f48b;
              iVar10 = iVar10 + -1;
            } while (0 < iVar10);
            iVar11 = -1;
          }
        }
        acStackX_10[lVar13] = '(';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f0de;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        acStackX_10[lVar13] = 'n';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f0fc;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        acStackX_10[lVar13] = 'i';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f11a;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        acStackX_10[lVar13] = 'l';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f138;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        acStackX_10[lVar13] = ')';
        uVar3 = *param_1;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f156;
        iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
        if (iVar10 != 0) goto LAB_7ff70c95f48b;
        iVar9 = iVar9 + 5;
        if ((((&stack0xffffffffffffffec)[lVar13] & 4) == 0) && (0 < iVar11)) {
          iVar9 = iVar9 + iVar11;
          iVar11 = iVar11 + 1;
          do {
            acStackX_10[lVar13] = ' ';
            uVar3 = *param_1;
            *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f190;
            iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
            if (iVar10 != 0) goto LAB_7ff70c95f48b;
            iVar11 = iVar11 + -1;
          } while (1 < iVar11);
        }
      }
      else {
        puVar22 = &UNK_7ff70cb50ec0;
        if ((uVar21 & 0x1000) == 0) {
          puVar22 = &UNK_7ff70cb50e90;
        }
        *(undefined **)(&stack0xfffffffffffffff0 + lVar13) = puVar22;
        uVar20 = 0x10;
        abStackX_8[lVar13] = 1;
        *(undefined4 *)(&stack0x00000000 + lVar13) = 1;
        bVar5 = false;
        *(undefined4 *)(&stack0xfffffffffffffff8 + lVar13) = 0xcb50e01;
code_r0x7ff70c95f1ae:
        if (iVar10 == -1) {
          iVar10 = 1;
        }
        uVar23 = 0x144;
        puVar15 = &stack0x00000174 + lVar13;
        if (uVar17 != 0) {
          do {
            uVar6 = uVar17;
            if (uVar17 >> 0x20 == 0) {
              uVar6 = uVar17 & 0xffffffff;
            }
            (&stack0x00000030)[uVar23 + lVar13] =
                 *(undefined1 *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar13) + uVar6 % uVar20);
            uVar23 = uVar23 - 1;
            bVar4 = uVar20 <= uVar17;
            uVar17 = uVar6 / uVar20;
          } while (bVar4);
          puVar15 = &stack0x0000002f + uVar23 + lVar13 + 1;
        }
        iVar11 = 0x144 - (int)uVar23;
        iVar12 = uVar25 - iVar11;
        iVar11 = iVar10 - iVar11;
        uVar17 = (ulonglong)*(uint *)(&stack0x00000000 + lVar13);
        if ((bVar5 && *(uint *)(&stack0x00000000 + lVar13) != 0) && (iVar11 < 1)) {
          uVar23 = uVar23 - 1;
          *puVar15 = 0x30;
          iVar12 = iVar12 + -1;
        }
        else if ((0 < iVar11) && (iVar12 = iVar12 - iVar11, -1 < (longlong)uVar23)) {
          uVar17 = (ulonglong)((iVar10 + (int)uVar23) - 0x145);
          if (uVar23 < uVar17) {
            uVar17 = uVar23;
          }
          *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar21;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f277;
          FUN_7ff70cb12b80(&stack0x00000030 + (uVar23 - uVar17) + lVar13,
                           CONCAT71((uint7)(uint3)((uint)iVar11 >> 8),0x30),uVar17 + 1);
          uVar21 = *(uint *)(&stack0xffffffffffffffec + lVar13);
          uVar23 = uVar23 + ~uVar17;
          uVar17 = (ulonglong)*(uint *)(&stack0x00000000 + lVar13);
        }
        bVar16 = (byte)uVar17 & (&stack0xfffffffffffffff8)[lVar13];
        *(int *)(&stack0x00000000 + lVar13) = (int)CONCAT71((int7)(uVar17 >> 8),bVar16);
        iVar10 = iVar12 + -2;
        if (bVar16 == 0) {
          iVar10 = iVar12;
        }
        bVar16 = abStackX_8[lVar13];
        uVar25 = (uint)(byte)(bVar16 ^ 1 | (uVar21 & 3) != 0);
        iVar11 = iVar10 - uVar25;
        *(uint *)(&stack0xfffffffffffffff8 + lVar13) = uVar21 & 0x104;
        if ((uVar21 & 0x104) == 0) {
          if (iVar11 < 1) {
            iVar11 = iVar11 + -1;
          }
          else {
            iVar9 = (iVar10 + iVar9) - uVar25;
            do {
              acStackX_10[lVar13] = ' ';
              uVar3 = *param_1;
              *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f31c;
              iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
              if (iVar10 != 0) goto LAB_7ff70c95f48b;
              iVar10 = iVar11 + -1;
              bVar5 = 0 < iVar11;
              iVar11 = iVar10;
            } while (iVar10 != 0 && bVar5);
            iVar11 = -1;
            bVar16 = abStackX_8[lVar13];
          }
        }
        if (bVar16 == 0) {
          acStackX_10[lVar13] = '-';
code_r0x7ff70c95f340:
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f351;
          iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar10 != 0) goto LAB_7ff70c95f48b;
          iVar9 = iVar9 + 1;
        }
        else {
          if ((uVar21 & 2) != 0) {
            acStackX_10[lVar13] = '+';
            goto code_r0x7ff70c95f340;
          }
          if ((uVar21 & 1) != 0) {
            acStackX_10[lVar13] = ' ';
            goto code_r0x7ff70c95f340;
          }
        }
        if ((&stack0x00000000)[lVar13] != '\0') {
          acStackX_10[lVar13] = '0';
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f37f;
          iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar10 != 0) {
LAB_7ff70c95f48b:
            *(undefined1 *)(param_1 + 1) = 1;
            return;
          }
          if ((uVar21 & 0x1000) == 0) {
            acStackX_10[lVar13] = 'x';
          }
          else {
            acStackX_10[lVar13] = 'X';
          }
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f3ad;
          iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar10 != 0) goto LAB_7ff70c95f48b;
          iVar9 = iVar9 + 2;
        }
        if (*(int *)(&stack0xfffffffffffffff8 + lVar13) == 0x100) {
          if (iVar11 < 1) {
            iVar11 = iVar11 + -1;
          }
          else {
            iVar9 = iVar9 + iVar11;
            do {
              acStackX_10[lVar13] = '0';
              uVar3 = *param_1;
              *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f3e6;
              iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
              if (iVar10 != 0) goto LAB_7ff70c95f48b;
              iVar10 = iVar11 + -1;
              bVar5 = 0 < iVar11;
              iVar11 = iVar10;
            } while (iVar10 != 0 && bVar5);
            iVar11 = -1;
          }
        }
        if ((longlong)uVar23 < 0x144) {
          iVar9 = (iVar9 - (int)uVar23) + 0x144;
          do {
            acStackX_10[lVar13] = (&stack0x00000031)[uVar23 + lVar13];
            uVar3 = *param_1;
            *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f42f;
            iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
            if (iVar10 != 0) goto LAB_7ff70c95f48b;
            uVar23 = uVar23 + 1;
          } while (uVar23 != 0x144);
        }
        puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
        if (((uVar21 & 4) != 0) && (0 < iVar11)) {
          iVar9 = iVar9 + iVar11;
          iVar11 = iVar11 + 1;
          do {
            acStackX_10[lVar13] = ' ';
            uVar3 = *param_1;
            *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f474;
            iVar10 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
            if (iVar10 != 0) goto LAB_7ff70c95f48b;
            iVar11 = iVar11 + -1;
          } while (1 < iVar11);
        }
      }
      break;
    case 3:
      uVar17 = *(ulonglong *)(&stack0x00000190 + lVar28 + 0x40);
      if ((uVar21 & 0x20000) == 0) {
        *(uint *)(&stack0x00000000 + lVar13) = uVar21 >> 3 & 1;
        abStackX_8[lVar13] = 1;
        puVar22 = &UNK_7ff70cb50ec0;
        if ((uVar21 & 0x400) == 0) {
          if ((uVar21 & 0x800) == 0) {
            uVar20 = 10;
            if ((uVar21 & 0x200) == 0) {
              uVar23 = -uVar17;
              if ((longlong)-uVar17 < 0) {
                uVar23 = uVar17;
              }
              abStackX_8[lVar13] = -1 < (longlong)uVar17;
              bVar5 = false;
              *(undefined4 *)(&stack0xfffffffffffffff8 + lVar13) = 0;
              uVar17 = uVar23;
            }
            else {
              bVar5 = false;
              *(undefined4 *)(&stack0xfffffffffffffff8 + lVar13) = 0;
            }
          }
          else {
            if ((uVar21 & 0x1000) == 0) {
              puVar22 = &UNK_7ff70cb50e90;
            }
            *(undefined **)(&stack0xfffffffffffffff0 + lVar13) = puVar22;
            uVar20 = 0x10;
            abStackX_8[lVar13] = 1;
            bVar5 = false;
            *(undefined4 *)(&stack0xfffffffffffffff8 + lVar13) = 0xcb50e01;
          }
        }
        else {
          uVar20 = 8;
          *(undefined4 *)(&stack0xfffffffffffffff8 + lVar13) = 0;
          bVar5 = true;
        }
        goto code_r0x7ff70c95f1ae;
      }
      *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar21;
      uVar26 = uVar25;
      iVar10 = iVar9;
      if (((uVar21 & 4) == 0) && (uVar26 = uVar25 - 1, 1 < (int)uVar25)) {
        iVar10 = uVar26 + iVar9;
        do {
          acStackX_10[lVar13] = ' ';
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95eb94;
          iVar9 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar9 != 0) goto LAB_7ff70c95f48b;
          uVar25 = uVar25 - 1;
        } while (1 < (int)uVar25);
        uVar26 = 0;
      }
      acStackX_10[lVar13] = (char)uVar17;
      uVar3 = *param_1;
      *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f059;
      iVar9 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
      puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
      if (iVar9 != 0) goto LAB_7ff70c95f48b;
      iVar9 = iVar10 + 1;
      if ((((&stack0xffffffffffffffec)[lVar13] & 4) != 0) && (1 < (int)uVar26)) {
        iVar9 = iVar10 + uVar26;
        iVar10 = uVar26 + 1;
        do {
          acStackX_10[lVar13] = ' ';
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95f093;
          iVar11 = FUN_7ff70c94fdd0(uVar3,pcVar1,1);
          if (iVar11 != 0) goto LAB_7ff70c95f48b;
          iVar10 = iVar10 + -1;
        } while (2 < iVar10);
      }
      break;
    case 4:
      if ((uVar21 & 0x40) == 0) {
        if (((uVar21 & 0x20) == 0) && ((uVar21 & 0x10) != 0)) {
          **(undefined2 **)(&stack0x00000190 + lVar28 + 0x40) = (short)iVar9;
        }
        else {
          **(int **)(&stack0x00000190 + lVar28 + 0x40) = iVar9;
        }
      }
      else {
        **(longlong **)(&stack0x00000190 + lVar28 + 0x40) = (longlong)iVar9;
      }
    default:
      goto LAB_7ff70c95f0b4;
    case 7:
      *(undefined8 *)((longlong)&uStackX_20 + lVar13) = _UNK_7ff70cb50f00;
      *(undefined8 *)(&stack0x00000028 + lVar13) = _UNK_7ff70cb50f08;
      *(undefined4 *)(acStackX_10 + lVar13) = _UNK_7ff70cb50ef0;
      *(undefined4 *)(acStackX_10 + lVar13 + 4) = _UNK_7ff70cb50ef4;
      *(undefined4 *)((longlong)auStackX_18 + lVar13) = _UNK_7ff70cb50ef8;
      *(undefined4 *)((longlong)auStackX_18 + lVar13 + 4) = _UNK_7ff70cb50efc;
      *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95eb2f;
      lVar14 = FUN_7ff70cb12e80(pcVar1);
      uVar25 = uVar26;
      if (((uVar21 & 0x2000) == 0) && (uVar25 = 0xffffffff, (uVar21 & 0x4000) != 0)) {
        uVar25 = *(uint *)(&stack0x00000190 + (longlong)(int)uVar26 * 0x18 + lVar13);
      }
      if ((short)uVar21 < 0) {
        iVar10 = *(int *)(&stack0x0000018c + lVar28 + 0x40);
joined_r0x7ff70c95ec6b:
        if ((uVar21 & 4) == 0) goto code_r0x7ff70c95ebec;
code_r0x7ff70c95ec71:
        acStackX_10[lVar13 + 1] = '-';
        pbVar18 = (byte *)(acStackX_10 + lVar13 + 2);
      }
      else {
        iVar10 = -1;
        if ((uVar21 & 0x10000) != 0) {
          iVar10 = *(int *)(&stack0x00000190 +
                           (longlong)*(int *)(&stack0x0000018c + lVar28 + 0x40) * 0x18 + lVar13);
          goto joined_r0x7ff70c95ec6b;
        }
        if ((uVar21 & 4) != 0) goto code_r0x7ff70c95ec71;
code_r0x7ff70c95ebec:
        pbVar18 = (byte *)(acStackX_10 + lVar13 + 1);
      }
      if ((uVar21 & 2) != 0) {
        *pbVar18 = 0x2b;
        pbVar18 = (byte *)((longlong)pbVar18 + 1);
      }
      if ((uVar21 & 1) != 0) {
        *pbVar18 = 0x20;
        pbVar18 = pbVar18 + 1;
        uVar21 = *(uint *)(&stack0x00000184 + lVar28 + 0x40);
      }
      if ((uVar21 & 8) != 0) {
        *pbVar18 = 0x23;
        pbVar18 = pbVar18 + 1;
      }
      lVar14 = 0x20 - lVar14;
      *pbVar18 = 0;
      if ((int)uVar25 < 0) {
        *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar25;
      }
      else {
        if (0x144 < uVar25) {
          uVar25 = 0x145;
        }
        *(int *)(&stack0x00000000 + lVar13) = iVar10;
        *(uint *)(&stack0xffffffffffffffec + lVar13) = uVar25;
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ec4c;
        iVar11 = FUN_7ff70c95c190(pbVar18,lVar14,&UNK_7ff70cb878ca);
        iVar10 = *(int *)(&stack0x00000000 + lVar13);
        pbVar18 = pbVar18 + iVar11;
        lVar14 = lVar14 - iVar11;
      }
      if (-1 < iVar10) {
        dVar2 = *(double *)(&stack0x00000190 + lVar28 + 0x40);
        iVar11 = *(int *)(&stack0xffffffffffffffec + lVar13);
        iVar12 = 0x144 - iVar11;
        if (iVar11 < iVar10) {
          iVar12 = 0x144;
        }
        if (iVar11 < 1) {
          iVar12 = 0x144;
        }
        for (; dVar7 <= dVar2; dVar2 = dVar2 / dVar7) {
          iVar12 = iVar12 + -1;
        }
        iVar11 = 1;
        if (1 < iVar12) {
          iVar11 = iVar12;
        }
        iVar11 = iVar11 + -1;
        if (iVar10 <= iVar12) {
          iVar11 = iVar10;
        }
        *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ed67;
        iVar10 = FUN_7ff70c95c190(pbVar18,lVar14,&UNK_7ff70cb878c9,iVar11);
        pbVar18 = pbVar18 + iVar10;
      }
      uVar21 = *(uint *)(&stack0x00000184 + lVar28 + 0x40);
      if ((uVar21 & 0x20) != 0) {
        *pbVar18 = 0x6c;
        pbVar18 = pbVar18 + 1;
        uVar21 = *(uint *)(&stack0x00000184 + lVar28 + 0x40);
      }
      if ((uVar21 & 0x40000) == 0) {
        bVar16 = 0x66;
        if ((uVar21 & 0x80000) != 0) {
          bVar16 = ((uVar21 & 0x1000) == 0) << 5 | 0x47;
        }
      }
      else {
        bVar16 = ((uVar21 & 0x1000) == 0) << 5 | 0x45;
      }
      *pbVar18 = bVar16;
      pbVar18[1] = 0;
      uVar3 = *(undefined8 *)(&stack0x00000190 + lVar28 + 0x40);
      *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95edd4;
      FUN_7ff70ca41af0(&stack0x00000030 + lVar13,0x146,pcVar1,uVar3);
      cVar8 = (&stack0x00000030)[lVar13];
      if (cVar8 != '\0') {
        pcVar27 = &stack0x00000031 + lVar13;
        do {
          (&stack0xffffffffffffffff)[lVar13] = cVar8;
          uVar3 = *param_1;
          *(undefined **)((longlong)&uStack_48 + lVar13) = &UNK_7ff70c95ee00;
          iVar10 = FUN_7ff70c94fdd0(uVar3,&stack0xffffffffffffffff + lVar13,1);
          if (iVar10 != 0) goto LAB_7ff70c95f48b;
          iVar9 = iVar9 + 1;
          cVar8 = *pcVar27;
          pcVar27 = pcVar27 + 1;
        } while (cVar8 != '\0');
      }
LAB_7ff70c95f0b4:
      puVar22 = *(undefined **)(&stack0xfffffffffffffff0 + lVar13);
    }
    param_2 = (char *)*puVar19;
    puVar19 = puVar19 + 1;
  } while( true );
}


