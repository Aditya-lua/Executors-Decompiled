/* 7ff70c95afa0 FUN_7ff70c95afa0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c95afa0(char *param_1,ulonglong param_2,char *param_3)

{
  char *pcVar1;
  double dVar2;
  undefined8 uVar3;
  bool bVar4;
  ulonglong uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined8 uVar9;
  double dVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  int iVar15;
  int iVar16;
  int iVar17;
  longlong lVar18;
  longlong lVar19;
  ulonglong uVar20;
  byte bVar21;
  char cVar22;
  int iVar23;
  byte *pbVar24;
  undefined1 *puVar25;
  undefined8 *puVar26;
  byte *pbVar27;
  ulonglong uVar28;
  char *pcVar29;
  char *pcVar30;
  undefined *puVar31;
  ulonglong uVar32;
  longlong lVar33;
  longlong lVar34;
  byte bVar35;
  uint uVar36;
  undefined4 *puVar37;
  ulonglong uVar38;
  uint uVar39;
  uint uVar40;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  undefined4 unaff_XMM7_Da;
  undefined4 unaff_XMM7_Db;
  undefined4 unaff_XMM7_Dc;
  undefined4 unaff_XMM7_Dd;
  undefined4 unaff_XMM8_Da;
  undefined4 unaff_XMM8_Db;
  undefined4 unaff_XMM8_Dc;
  undefined4 unaff_XMM8_Dd;
  uint uStackX_8;
  byte abStackX_c [4];
  undefined4 uStackX_10;
  undefined4 auStackX_14 [3];
  undefined8 uStackX_20;
  undefined8 uStack_48;
  
  uStack_48 = 0x7ff70c95afb6;
  lVar18 = FUN_7ff70caa9780();
  lVar18 = -lVar18;
  *(undefined4 *)(&stack0x000011b0 + lVar18) = unaff_XMM8_Da;
  *(undefined4 *)(&stack0x000011b4 + lVar18) = unaff_XMM8_Db;
  *(undefined4 *)(&stack0x000011b8 + lVar18) = unaff_XMM8_Dc;
  *(undefined4 *)(&stack0x000011bc + lVar18) = unaff_XMM8_Dd;
  *(undefined4 *)(&stack0x000011a0 + lVar18) = unaff_XMM7_Da;
  *(undefined4 *)(&stack0x000011a4 + lVar18) = unaff_XMM7_Db;
  *(undefined4 *)(&stack0x000011a8 + lVar18) = unaff_XMM7_Dc;
  *(undefined4 *)(&stack0x000011ac + lVar18) = unaff_XMM7_Dd;
  *(undefined4 *)(&stack0x00001190 + lVar18) = unaff_XMM6_Da;
  *(undefined4 *)(&stack0x00001194 + lVar18) = unaff_XMM6_Db;
  *(undefined4 *)(&stack0x00001198 + lVar18) = unaff_XMM6_Dc;
  *(undefined4 *)(&stack0x0000119c + lVar18) = unaff_XMM6_Dd;
  puVar26 = (undefined8 *)(&stack0x00000d90 + lVar18);
  *(undefined8 *)((longlong)&uStack_48 + lVar18) = 0x7ff70c95aff7;
  iVar15 = FUN_7ff70c95c440(param_3,&stack0x00000190 + lVar18,puVar26);
  uVar14 = _UNK_7ff70cb50f38;
  uVar13 = _DAT_7ff70cb50f30;
  uVar12 = _UNK_7ff70cb50f28;
  uVar11 = _DAT_7ff70cb50f20;
  dVar10 = _DAT_7ff70cb50f10;
  if (iVar15 != 0) {
    iVar15 = 0;
    uVar20 = 0;
    goto LAB_7ff70c95c0f6;
  }
  puVar31 = &UNK_7ff70cb50e90;
  iVar17 = 0;
  iVar15 = 0;
  uVar20 = 0;
LAB_7ff70c95b042:
  while( true ) {
    uVar38 = uVar20;
    cVar22 = *param_3;
    uVar20 = uVar38;
    if (cVar22 != '%') {
      if (cVar22 != '\0') goto LAB_7ff70c95b060;
      goto LAB_7ff70c95c0f6;
    }
    cVar22 = param_3[1];
    if (cVar22 != '%') break;
    if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
    param_3 = param_3 + 2;
    *param_1 = '%';
    param_1 = param_1 + 1;
    iVar15 = iVar15 + 1;
    uVar20 = uVar38 + 1;
  }
  *(undefined **)(&stack0x00000000 + lVar18) = puVar31;
  iVar16 = iVar17;
  if ((byte)(cVar22 - 0x30U) < 10) {
    param_3 = param_3 + 2;
    iVar23 = 0;
    do {
      iVar16 = (uint)(byte)(cVar22 - 0x30) + iVar23 * 10;
      if (0x7f < iVar23) {
        iVar16 = iVar23;
      }
      iVar23 = iVar16;
      cVar22 = *param_3;
      param_3 = param_3 + 1;
    } while ((byte)(cVar22 - 0x30U) < 10);
    iVar16 = iVar23 + -1;
    if (iVar23 == 0) {
      iVar16 = iVar17;
    }
    if (cVar22 != '$') {
      iVar16 = iVar17;
    }
    if (0x80 < iVar23) {
      iVar16 = iVar17;
    }
  }
  lVar19 = (longlong)iVar16 * 0x18 + lVar18 + -0x40;
  puVar37 = (undefined4 *)(&stack0x00000190 + lVar19 + 0x40);
  uVar40 = *(uint *)(&stack0x00000194 + (longlong)iVar16 * 0x18 + lVar18);
  if ((uVar40 & 0x4000) == 0) {
    *(int *)(&stack0xffffffffffffffec + lVar18) = iVar17 + 1;
    uVar39 = *(uint *)(&stack0x00000198 + lVar19 + 0x40);
    uVar36 = uVar39;
  }
  else {
    uVar36 = *(uint *)(&stack0x00000198 + lVar19 + 0x40);
    uVar39 = *(uint *)(&stack0x000001a0 + (longlong)(int)uVar36 * 0x18 + lVar18);
    *(int *)(&stack0xffffffffffffffec + lVar18) = iVar17 + 2;
    if ((int)uVar39 < 0) {
      uVar39 = -uVar39;
      uVar40 = uVar40 & 0xfffffefb | 4;
      *(uint *)(&stack0x00000194 + lVar19 + 0x40) = uVar40;
    }
  }
  *(undefined4 **)(&stack0xfffffffffffffff0 + lVar18) = puVar37;
  if ((uVar40 & 0x10000) == 0) {
    if ((short)uVar40 < 0) {
      puVar37 = *(undefined4 **)(&stack0xfffffffffffffff0 + lVar18);
      iVar17 = puVar37[3];
    }
    else {
      puVar37 = *(undefined4 **)(&stack0xfffffffffffffff0 + lVar18);
      iVar17 = -1;
    }
  }
  else {
    iVar17 = *(int *)(&stack0x000001a0 +
                     (longlong)*(int *)(&stack0x0000019c + lVar19 + 0x40) * 0x18 + lVar18);
    *(int *)(&stack0xffffffffffffffec + lVar18) = *(int *)(&stack0xffffffffffffffec + lVar18) + 1;
    if (iVar17 < 0) {
      iVar17 = -1;
    }
  }
  pcVar29 = param_1;
  switch(*puVar37) {
  case 1:
    pcVar29 = *(char **)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10);
    if (pcVar29 == (char *)0x0) {
      if (iVar17 != -1 && iVar17 < 5) {
        pcVar29 = "";
        uVar32 = 0;
        goto code_r0x7ff70c95bec5;
      }
      uVar40 = uVar40 & 0xfffffff7;
      lVar19 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
      *(uint *)(lVar19 + 4) = uVar40;
      uVar32 = 5;
      pcVar29 = "(nil)";
    }
    else {
      if (iVar17 == -1) {
        if (*pcVar29 == '\0') {
          uVar32 = 0;
        }
        else {
          *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95ba5a;
          uVar32 = FUN_7ff70cb12e80(pcVar29);
        }
      }
      else {
        uVar32 = (ulonglong)iVar17;
      }
code_r0x7ff70c95bec5:
      lVar19 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
    }
    uVar28 = 0x7fffffff;
    if (uVar32 < 0x7fffffff) {
      uVar28 = uVar32;
    }
    pcVar30 = param_1;
    if ((uVar40 & 8) != 0) {
      if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
      *param_1 = '\"';
      pcVar30 = param_1 + 1;
      uVar20 = uVar38 + 1;
      iVar15 = iVar15 + 1;
      uVar40 = *(uint *)(lVar19 + 4);
    }
    uVar39 = uVar39 - (int)uVar28;
    uVar36 = uVar39;
    if ((uVar40 & 4) == 0) {
      uVar36 = uVar39 - 1;
      uVar38 = (ulonglong)uVar36;
      if (0 < (int)uVar39) {
        uVar28 = 0;
        if (uVar20 <= param_2) {
          uVar28 = param_2 - uVar20;
        }
        if (uVar38 < uVar28) {
          uVar28 = uVar38;
        }
        param_1 = pcVar30;
        if (0x1f < uVar28) {
          uVar28 = uVar28 + 1;
          uVar38 = (ulonglong)((uint)uVar28 & 0x1f);
          if ((uVar28 & 0x1f) == 0) {
            uVar38 = 0x20;
          }
          lVar19 = uVar28 - uVar38;
          uVar38 = (ulonglong)(uVar36 - (int)lVar19);
          iVar15 = iVar15 + (int)lVar19;
          param_1 = pcVar30 + lVar19;
          uVar20 = uVar20 + lVar19;
          lVar33 = 0;
          do {
            *(undefined8 *)(pcVar30 + lVar33) = uVar11;
            *(undefined8 *)(pcVar30 + lVar33 + 8) = uVar12;
            *(undefined8 *)(pcVar30 + lVar33 + 0x10) = uVar11;
            *(undefined8 *)(pcVar30 + lVar33 + 0x10 + 8) = uVar12;
            lVar33 = lVar33 + 0x20;
          } while (lVar19 != lVar33);
        }
        do {
          if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
          *param_1 = ' ';
          pcVar30 = param_1 + 1;
          uVar20 = uVar20 + 1;
          iVar15 = iVar15 + 1;
          iVar17 = (int)uVar38;
          uVar36 = iVar17 - 1;
          uVar38 = (ulonglong)uVar36;
          param_1 = pcVar30;
        } while (0 < iVar17);
      }
    }
    if (uVar32 != 0) {
      uVar38 = 0;
      do {
        uVar28 = uVar20 + uVar38;
        iVar17 = (int)uVar38;
        if (pcVar29[uVar38] == '\0') break;
        if (param_2 <= uVar20 + uVar38) {
          if (uVar20 <= param_2) {
            uVar20 = param_2;
          }
          iVar15 = iVar15 + (int)uVar38;
          param_1 = pcVar30 + uVar38;
          goto LAB_7ff70c95c0f6;
        }
        pcVar30[uVar38] = pcVar29[uVar38];
        uVar38 = uVar38 + 1;
        uVar28 = uVar32 + uVar20;
        iVar17 = (int)uVar32;
      } while (uVar32 != uVar38);
      iVar15 = iVar15 + iVar17;
      pcVar30 = pcVar30 + uVar38;
      uVar20 = uVar28;
    }
    uVar40 = *(uint *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 4);
    param_1 = pcVar30;
    if (((uVar40 & 4) != 0) && (0 < (int)uVar36)) {
      uVar38 = 0;
      if (uVar20 <= param_2) {
        uVar38 = param_2 - uVar20;
      }
      if (uVar36 - 1 < uVar38) {
        uVar38 = (ulonglong)(uVar36 - 1);
      }
      if (0x1f < uVar38) {
        uVar38 = uVar38 + 1;
        uVar32 = (ulonglong)((uint)uVar38 & 0x1f);
        if ((uVar38 & 0x1f) == 0) {
          uVar32 = 0x20;
        }
        lVar19 = uVar38 - uVar32;
        uVar36 = uVar36 - (int)lVar19;
        iVar15 = iVar15 + (int)lVar19;
        param_1 = pcVar30 + lVar19;
        uVar20 = uVar20 + lVar19;
        lVar33 = 0;
        do {
          *(undefined8 *)(pcVar30 + lVar33) = uVar11;
          *(undefined8 *)(pcVar30 + lVar33 + 8) = uVar12;
          *(undefined8 *)(pcVar30 + lVar33 + 0x10) = uVar11;
          *(undefined8 *)(pcVar30 + lVar33 + 0x10 + 8) = uVar12;
          lVar33 = lVar33 + 0x20;
        } while (lVar19 != lVar33);
      }
      iVar17 = uVar36 + 1;
      do {
        if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
        *param_1 = ' ';
        param_1 = param_1 + 1;
        uVar20 = uVar20 + 1;
        iVar15 = iVar15 + 1;
        iVar17 = iVar17 + -1;
      } while (1 < iVar17);
      uVar40 = *(uint *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 4);
    }
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
    if ((uVar40 & 8) != 0) {
      if (uVar20 < param_2) {
        *param_1 = '\"';
        param_1 = param_1 + 1;
        iVar15 = iVar15 + 1;
        uVar20 = uVar20 + 1;
        goto LAB_7ff70c95c0c9;
      }
      goto LAB_7ff70c95c0f6;
    }
    goto LAB_7ff70c95c0c9;
  case 2:
    uVar32 = *(ulonglong *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10);
    if (uVar32 == 0) {
      if ((uVar40 & 4) == 0) {
        uVar40 = uVar39 - 5;
code_r0x7ff70c95bb14:
        puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
      }
      else {
        uVar40 = uVar39 - 6;
        if ((int)uVar39 < 6) goto code_r0x7ff70c95bb14;
        uVar32 = 0;
        if (uVar38 <= param_2) {
          uVar32 = param_2 - uVar38;
        }
        if (uVar40 < uVar32) {
          uVar32 = (ulonglong)uVar40;
        }
        if (0x1f < uVar32) {
          uVar32 = uVar32 + 1;
          uVar20 = (ulonglong)((uint)uVar32 & 0x1f);
          if ((uVar32 & 0x1f) == 0) {
            uVar20 = 0x20;
          }
          lVar19 = uVar32 - uVar20;
          uVar40 = uVar40 - (int)lVar19;
          iVar15 = iVar15 + (int)lVar19;
          pcVar29 = param_1 + lVar19;
          uVar20 = uVar38 + lVar19;
          lVar33 = 0;
          do {
            *(undefined8 *)(param_1 + lVar33) = uVar11;
            *(undefined8 *)(param_1 + lVar33 + 8) = uVar12;
            *(undefined8 *)(param_1 + lVar33 + 0x10) = uVar11;
            *(undefined8 *)(param_1 + lVar33 + 0x10 + 8) = uVar12;
            lVar33 = lVar33 + 0x20;
          } while (lVar19 != lVar33);
        }
        puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
        param_1 = pcVar29;
        uVar39 = uVar40;
        do {
          if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
          *param_1 = ' ';
          param_1 = param_1 + 1;
          uVar20 = uVar20 + 1;
          iVar15 = iVar15 + 1;
          uVar40 = uVar39 - 1;
          bVar4 = 0 < (int)uVar39;
          pcVar29 = param_1;
          uVar39 = uVar40;
        } while (bVar4);
      }
      param_1 = pcVar29;
      if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
      *pcVar29 = '(';
      uVar32 = uVar20 + 1;
      if (param_2 <= uVar32) {
code_r0x7ff70c95c15f:
        param_1 = pcVar29 + 1;
        iVar15 = iVar15 + 1;
        uVar20 = uVar32;
        goto joined_r0x7ff70c95c128;
      }
      pcVar29[1] = 'n';
      if (param_2 <= uVar20 + 2) {
        param_1 = pcVar29 + 2;
        iVar15 = iVar15 + 2;
        uVar20 = uVar20 + 2;
        goto joined_r0x7ff70c95c128;
      }
      pcVar29[2] = 'i';
      if (param_2 <= uVar20 + 3) {
        param_1 = pcVar29 + 3;
        iVar15 = iVar15 + 3;
        uVar20 = uVar20 + 3;
        goto joined_r0x7ff70c95c128;
      }
      pcVar29[3] = 'l';
      if (param_2 <= uVar20 + 4) {
        param_1 = pcVar29 + 4;
        iVar15 = iVar15 + 4;
        uVar20 = uVar20 + 4;
        goto joined_r0x7ff70c95c128;
      }
      pcVar29[4] = ')';
      param_1 = pcVar29 + 5;
      uVar38 = uVar20 + 5;
      iVar15 = iVar15 + 5;
      if (((*(byte *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 4) & 4) != 0) ||
         ((int)uVar40 < 1)) goto code_r0x7ff70c95be9b;
      uVar20 = (param_2 - 5) - uVar20;
      if (uVar40 - 1 < uVar20) {
        uVar20 = (ulonglong)(uVar40 - 1);
      }
      if (0x1f < uVar20) {
        uVar20 = uVar20 + 1;
        uVar32 = (ulonglong)((uint)uVar20 & 0x1f);
        if ((uVar20 & 0x1f) == 0) {
          uVar32 = 0x20;
        }
        lVar19 = uVar20 - uVar32;
        uVar40 = uVar40 - (int)lVar19;
        iVar15 = iVar15 + (int)lVar19;
        param_1 = param_1 + lVar19;
        uVar38 = uVar38 + lVar19;
        lVar33 = 0;
        do {
          *(undefined8 *)(pcVar29 + lVar33 + 5) = uVar11;
          *(undefined8 *)(pcVar29 + lVar33 + 5 + 8) = uVar12;
          *(undefined8 *)(pcVar29 + lVar33 + 0x15) = uVar11;
          *(undefined8 *)(pcVar29 + lVar33 + 0x15 + 8) = uVar12;
          lVar33 = lVar33 + 0x20;
        } while (lVar19 != lVar33);
      }
      iVar17 = uVar40 + 1;
      puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
      do {
        uVar20 = param_2;
        if (param_2 == uVar38) goto LAB_7ff70c95c0f6;
        *param_1 = ' ';
        param_1 = param_1 + 1;
        uVar38 = uVar38 + 1;
        iVar15 = iVar15 + 1;
        iVar17 = iVar17 + -1;
      } while (1 < iVar17);
    }
    else {
      puVar31 = &UNK_7ff70cb50ec0;
      if ((uVar40 & 0x1000) == 0) {
        puVar31 = &UNK_7ff70cb50e90;
      }
      *(undefined **)(&stack0x00000000 + lVar18) = puVar31;
      (&stack0xfffffffffffffffc)[lVar18] = 1;
      uVar36 = 1;
code_r0x7ff70c95b2cd:
      uVar20 = 0x10;
      *(undefined4 *)((longlong)&uStackX_8 + lVar18) = 0;
      pbVar24 = abStackX_c + lVar18;
      pbVar24[0] = 1;
      pbVar24[1] = 0xe;
      pbVar24[2] = 0xb5;
      pbVar24[3] = 0xc;
code_r0x7ff70c95b71a:
      if (iVar17 == -1) {
        iVar17 = 1;
      }
      uVar28 = 0x144;
      puVar25 = &stack0x00000184 + lVar18;
      if (uVar32 != 0) {
        do {
          uVar5 = uVar32;
          if (uVar32 >> 0x20 == 0) {
            uVar5 = uVar32 & 0xffffffff;
          }
          (&stack0x00000040)[uVar28 + lVar18] =
               *(undefined1 *)(*(longlong *)(&stack0x00000000 + lVar18) + uVar5 % uVar20);
          uVar28 = uVar28 - 1;
          bVar4 = uVar20 <= uVar32;
          uVar32 = uVar5 / uVar20;
        } while (bVar4);
        puVar25 = &stack0x0000003f + uVar28 + lVar18 + 1;
      }
      iVar16 = 0x144 - (int)uVar28;
      iVar23 = uVar39 - iVar16;
      iVar16 = iVar17 - iVar16;
      if (((char)*(undefined4 *)((longlong)&uStackX_8 + lVar18) == '\x01' && uVar36 != 0) &&
         (iVar16 < 1)) {
        uVar28 = uVar28 - 1;
        *puVar25 = 0x30;
        iVar23 = iVar23 + -1;
        bVar21 = (&stack0xfffffffffffffffc)[lVar18];
      }
      else {
        bVar21 = (&stack0xfffffffffffffffc)[lVar18];
        if ((0 < iVar16) && (iVar23 = iVar23 - iVar16, -1 < (longlong)uVar28)) {
          uVar20 = (ulonglong)((iVar17 + (int)uVar28) - 0x145);
          if (uVar28 < uVar20) {
            uVar20 = uVar28;
          }
          *(ulonglong *)(&stack0x00000038 + lVar18) = uVar20;
          *(uint *)((longlong)&uStackX_8 + lVar18) = uVar36;
          *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95b80e;
          FUN_7ff70cb12b80(&stack0x00000040 + (uVar28 - uVar20) + lVar18,
                           CONCAT71((int7)(uVar20 >> 8),0x30),uVar20 + 1);
          bVar21 = (&stack0xfffffffffffffffc)[lVar18];
          uVar36 = *(uint *)((longlong)&uStackX_8 + lVar18);
          uVar28 = uVar28 + ~*(ulonglong *)(&stack0x00000038 + lVar18);
        }
      }
      bVar35 = (byte)uVar36 & abStackX_c[lVar18];
      iVar17 = iVar23 + -2;
      if (bVar35 == 0) {
        iVar17 = iVar23;
      }
      uVar39 = iVar17 - (uint)(byte)(bVar21 ^ 1 | (uVar40 & 3) != 0);
      if ((uVar40 & 0x104) == 0) {
        uVar40 = uVar39 - 1;
        uVar32 = (ulonglong)uVar40;
        bVar4 = (int)uVar39 < 1;
        uVar39 = uVar40;
        if (bVar4) goto code_r0x7ff70c95b86a;
        uVar20 = 0;
        if (uVar38 <= param_2) {
          uVar20 = param_2 - uVar38;
        }
        if (uVar32 < uVar20) {
          uVar20 = uVar32;
        }
        if (0x1f < uVar20) {
          uVar20 = uVar20 + 1;
          uVar32 = (ulonglong)((uint)uVar20 & 0x1f);
          if ((uVar20 & 0x1f) == 0) {
            uVar32 = 0x20;
          }
          lVar19 = uVar20 - uVar32;
          uVar32 = (ulonglong)(uVar40 - (int)lVar19);
          iVar15 = iVar15 + (int)lVar19;
          pcVar29 = param_1 + lVar19;
          uVar38 = uVar38 + lVar19;
          lVar33 = 0;
          do {
            *(undefined8 *)(param_1 + lVar33) = uVar11;
            *(undefined8 *)(param_1 + lVar33 + 8) = uVar12;
            *(undefined8 *)(param_1 + lVar33 + 0x10) = uVar11;
            *(undefined8 *)(param_1 + lVar33 + 0x10 + 8) = uVar12;
            lVar33 = lVar33 + 0x20;
          } while (lVar19 != lVar33);
        }
        lVar19 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
        bVar21 = (&stack0xfffffffffffffffc)[lVar18];
        do {
          param_1 = pcVar29;
          uVar20 = uVar38;
          if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
          *pcVar29 = ' ';
          pcVar29 = pcVar29 + 1;
          uVar38 = uVar38 + 1;
          iVar15 = iVar15 + 1;
          iVar17 = (int)uVar32;
          uVar39 = iVar17 - 1;
          uVar32 = (ulonglong)uVar39;
        } while (0 < iVar17);
      }
      else {
code_r0x7ff70c95b86a:
        lVar19 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
      }
      if (bVar21 == 0) {
        cVar22 = '-';
code_r0x7ff70c95b95c:
        param_1 = pcVar29;
        uVar20 = uVar38;
        if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
        *pcVar29 = cVar22;
        pcVar29 = pcVar29 + 1;
        uVar38 = uVar38 + 1;
        iVar15 = iVar15 + 1;
      }
      else {
        if ((*(uint *)(lVar19 + 4) & 2) != 0) {
          cVar22 = '+';
          goto code_r0x7ff70c95b95c;
        }
        if ((*(uint *)(lVar19 + 4) & 1) != 0) {
          cVar22 = ' ';
          goto code_r0x7ff70c95b95c;
        }
      }
      if (bVar35 != 0) {
        param_1 = pcVar29;
        uVar20 = uVar38;
        if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
        *pcVar29 = '0';
        uVar32 = uVar38 + 1;
        if (param_2 <= uVar32) goto code_r0x7ff70c95c15f;
        pcVar29[1] = ((*(uint *)(lVar19 + 4) & 0x1000) == 0) << 5 | 0x58;
        pcVar29 = pcVar29 + 2;
        uVar38 = uVar38 + 2;
        iVar15 = iVar15 + 2;
      }
      pcVar30 = pcVar29;
      uVar40 = uVar39;
      if ((*(uint *)(lVar19 + 4) & 0x104) == 0x100) {
        uVar40 = uVar39 - 1;
        uVar32 = (ulonglong)uVar40;
        if (0 < (int)uVar39) {
          uVar20 = 0;
          if (uVar38 <= param_2) {
            uVar20 = param_2 - uVar38;
          }
          if (uVar32 < uVar20) {
            uVar20 = uVar32;
          }
          if (0x1f < uVar20) {
            uVar20 = uVar20 + 1;
            uVar32 = (ulonglong)((uint)uVar20 & 0x1f);
            if ((uVar20 & 0x1f) == 0) {
              uVar32 = 0x20;
            }
            lVar19 = uVar20 - uVar32;
            uVar32 = (ulonglong)(uVar40 - (int)lVar19);
            iVar15 = iVar15 + (int)lVar19;
            pcVar30 = pcVar29 + lVar19;
            uVar38 = uVar38 + lVar19;
            lVar33 = 0;
            do {
              *(undefined8 *)(pcVar29 + lVar33) = uVar13;
              *(undefined8 *)(pcVar29 + lVar33 + 8) = uVar14;
              *(undefined8 *)(pcVar29 + lVar33 + 0x10) = uVar13;
              *(undefined8 *)(pcVar29 + lVar33 + 0x10 + 8) = uVar14;
              lVar33 = lVar33 + 0x20;
            } while (lVar19 != lVar33);
          }
          do {
            param_1 = pcVar30;
            uVar20 = uVar38;
            if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
            *pcVar30 = '0';
            pcVar30 = pcVar30 + 1;
            uVar38 = uVar38 + 1;
            iVar15 = iVar15 + 1;
            iVar17 = (int)uVar32;
            uVar40 = iVar17 - 1;
            uVar32 = (ulonglong)uVar40;
          } while (0 < iVar17);
        }
      }
      if ((longlong)uVar28 < 0x144) {
        uVar20 = 0;
        if (uVar38 <= param_2) {
          uVar20 = param_2 - uVar38;
        }
        if (0x143 - uVar28 < uVar20) {
          uVar20 = 0x143 - uVar28;
        }
        uVar20 = uVar20 + 1;
        pcVar29 = pcVar30;
        if ((0x20 < uVar20) &&
           (&stack0x00000040 + uVar28 + (lVar18 - (longlong)pcVar30) <
            (undefined1 *)0xffffffffffffffe0)) {
          uVar32 = (ulonglong)((uint)uVar20 & 0x1f);
          if ((uVar20 & 0x1f) == 0) {
            uVar32 = 0x20;
          }
          lVar33 = uVar20 - uVar32;
          iVar15 = iVar15 + (int)lVar33;
          pcVar29 = pcVar30 + lVar33;
          uVar38 = uVar38 + lVar33;
          lVar19 = uVar28 + lVar18;
          uVar28 = uVar28 + lVar33;
          lVar34 = 0;
          do {
            puVar37 = (undefined4 *)(&stack0x00000041 + lVar34 + lVar19);
            uVar6 = puVar37[1];
            uVar7 = puVar37[2];
            uVar8 = puVar37[3];
            uVar3 = *(undefined8 *)(&stack0x00000051 + lVar34 + lVar19);
            uVar9 = *(undefined8 *)((longlong)(&stack0x00000051 + lVar34 + lVar19) + 8);
            pcVar1 = pcVar30 + lVar34;
            *(undefined4 *)pcVar1 = *puVar37;
            *(undefined4 *)(pcVar1 + 4) = uVar6;
            *(undefined4 *)(pcVar1 + 8) = uVar7;
            *(undefined4 *)(pcVar1 + 0xc) = uVar8;
            *(undefined8 *)(pcVar30 + lVar34 + 0x10) = uVar3;
            *(undefined8 *)(pcVar30 + lVar34 + 0x10 + 8) = uVar9;
            lVar34 = lVar34 + 0x20;
          } while (lVar33 != lVar34);
        }
        puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
        pcVar30 = pcVar29;
        do {
          param_1 = pcVar30;
          uVar20 = uVar38;
          if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
          lVar19 = uVar28 + lVar18;
          uVar28 = uVar28 + 1;
          *pcVar30 = (&stack0x00000041)[lVar19];
          pcVar30 = pcVar30 + 1;
          uVar38 = uVar38 + 1;
          iVar15 = iVar15 + 1;
        } while (uVar28 != 0x144);
      }
      else {
        puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
      }
      param_1 = pcVar30;
      if (((*(byte *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 4) & 4) != 0) &&
         (0 < (int)uVar40)) {
        uVar20 = 0;
        if (uVar38 <= param_2) {
          uVar20 = param_2 - uVar38;
        }
        if (uVar40 - 1 < uVar20) {
          uVar20 = (ulonglong)(uVar40 - 1);
        }
        if (0x1f < uVar20) {
          uVar20 = uVar20 + 1;
          uVar32 = (ulonglong)((uint)uVar20 & 0x1f);
          if ((uVar20 & 0x1f) == 0) {
            uVar32 = 0x20;
          }
          lVar19 = uVar20 - uVar32;
          uVar40 = uVar40 - (int)lVar19;
          iVar15 = iVar15 + (int)lVar19;
          param_1 = pcVar30 + lVar19;
          uVar38 = uVar38 + lVar19;
          lVar33 = 0;
          do {
            *(undefined8 *)(pcVar30 + lVar33) = uVar11;
            *(undefined8 *)(pcVar30 + lVar33 + 8) = uVar12;
            *(undefined8 *)(pcVar30 + lVar33 + 0x10) = uVar11;
            *(undefined8 *)(pcVar30 + lVar33 + 0x10 + 8) = uVar12;
            lVar33 = lVar33 + 0x20;
          } while (lVar19 != lVar33);
        }
        iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
        iVar16 = uVar40 + 1;
        puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
        do {
          uVar20 = uVar38;
          if (param_2 <= uVar38) goto LAB_7ff70c95c0f6;
          *param_1 = ' ';
          param_1 = param_1 + 1;
          uVar38 = uVar38 + 1;
          iVar15 = iVar15 + 1;
          iVar16 = iVar16 + -1;
        } while (1 < iVar16);
        break;
      }
    }
code_r0x7ff70c95be91:
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
    break;
  case 3:
    uVar32 = *(ulonglong *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10);
    if ((uVar40 & 0x20000) == 0) {
      uVar36 = uVar40 >> 3 & 1;
      if ((uVar40 & 0x400) == 0) {
        if ((uVar40 & 0x800) != 0) {
          puVar31 = &UNK_7ff70cb50ec0;
          if ((uVar40 & 0x1000) == 0) {
            puVar31 = &UNK_7ff70cb50e90;
          }
          *(undefined **)(&stack0x00000000 + lVar18) = puVar31;
          (&stack0xfffffffffffffffc)[lVar18] = 1;
          goto code_r0x7ff70c95b2cd;
        }
        (&stack0xfffffffffffffffc)[lVar18] = 1;
        uVar20 = 10;
        if ((uVar40 & 0x200) == 0) {
          uVar28 = -uVar32;
          if ((longlong)-uVar32 < 0) {
            uVar28 = uVar32;
          }
          (&stack0xfffffffffffffffc)[lVar18] = -1 < (longlong)uVar32;
          *(undefined4 *)((longlong)&uStackX_8 + lVar18) = 0;
          pbVar24 = abStackX_c + lVar18;
          pbVar24[0] = 0;
          pbVar24[1] = 0;
          pbVar24[2] = 0;
          pbVar24[3] = 0;
          uVar32 = uVar28;
        }
        else {
          *(undefined4 *)((longlong)&uStackX_8 + lVar18) = 0;
          pbVar24 = abStackX_c + lVar18;
          pbVar24[0] = 0;
          pbVar24[1] = 0;
          pbVar24[2] = 0;
          pbVar24[3] = 0;
        }
      }
      else {
        (&stack0xfffffffffffffffc)[lVar18] = 1;
        uVar20 = 8;
        pbVar24 = abStackX_c + lVar18;
        pbVar24[0] = 0;
        pbVar24[1] = 0;
        pbVar24[2] = 0;
        pbVar24[3] = 0;
        *(undefined4 *)((longlong)&uStackX_8 + lVar18) = 0xffffff01;
      }
      goto code_r0x7ff70c95b71a;
    }
    uVar36 = uVar39;
    if (((uVar40 & 4) == 0) && (uVar36 = uVar39 - 1, 1 < (int)uVar39)) {
      uVar28 = 0;
      if (uVar38 <= param_2) {
        uVar28 = param_2 - uVar38;
      }
      if (uVar39 - 2 < uVar28) {
        uVar28 = (ulonglong)(uVar39 - 2);
      }
      if (0x1f < uVar28) {
        uVar28 = uVar28 + 1;
        uVar20 = (ulonglong)((uint)uVar28 & 0x1f);
        if ((uVar28 & 0x1f) == 0) {
          uVar20 = 0x20;
        }
        lVar19 = uVar28 - uVar20;
        uVar36 = uVar36 - (int)lVar19;
        iVar15 = iVar15 + (int)lVar19;
        pcVar29 = param_1 + lVar19;
        uVar20 = uVar38 + lVar19;
        lVar33 = 0;
        do {
          *(undefined8 *)(param_1 + lVar33) = uVar11;
          *(undefined8 *)(param_1 + lVar33 + 8) = uVar12;
          *(undefined8 *)(param_1 + lVar33 + 0x10) = uVar11;
          *(undefined8 *)(param_1 + lVar33 + 0x10 + 8) = uVar12;
          lVar33 = lVar33 + 0x20;
        } while (lVar19 != lVar33);
      }
      puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
      uVar40 = uVar36;
      do {
        param_1 = pcVar29;
        if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
        *pcVar29 = ' ';
        pcVar29 = pcVar29 + 1;
        uVar20 = uVar20 + 1;
        iVar15 = iVar15 + 1;
        uVar36 = uVar40 - 1;
        bVar4 = 0 < (int)uVar40;
        uVar40 = uVar36;
      } while (uVar36 != 0 && bVar4);
    }
    else {
      puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
    }
    param_1 = pcVar29;
    if (param_2 <= uVar20) goto LAB_7ff70c95c0f6;
    *pcVar29 = (char)uVar32;
    param_1 = pcVar29 + 1;
    uVar38 = uVar20 + 1;
    iVar15 = iVar15 + 1;
    if (((*(byte *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 4) & 4) != 0) &&
       (1 < (int)uVar36)) {
      uVar32 = ~uVar20 + param_2;
      if ((ulonglong)(uVar36 - 2) < ~uVar20 + param_2) {
        uVar32 = (ulonglong)(uVar36 - 2);
      }
      if (0x1f < uVar32) {
        uVar32 = uVar32 + 1;
        uVar20 = (ulonglong)((uint)uVar32 & 0x1f);
        if ((uVar32 & 0x1f) == 0) {
          uVar20 = 0x20;
        }
        lVar33 = uVar32 - uVar20;
        uVar36 = uVar36 - (int)lVar33;
        iVar15 = iVar15 + (int)lVar33;
        param_1 = param_1 + lVar33;
        uVar38 = uVar38 + lVar33;
        lVar19 = 0;
        do {
          *(undefined8 *)(pcVar29 + lVar19 + 1) = uVar11;
          *(undefined8 *)(pcVar29 + lVar19 + 1 + 8) = uVar12;
          *(undefined8 *)(pcVar29 + lVar19 + 0x11) = uVar11;
          *(undefined8 *)(pcVar29 + lVar19 + 0x11 + 8) = uVar12;
          lVar19 = lVar19 + 0x20;
        } while (lVar33 != lVar19);
      }
      iVar17 = uVar36 + 1;
      puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
      do {
        uVar20 = param_2;
        if (param_2 == uVar38) goto joined_r0x7ff70c95c128;
        *param_1 = ' ';
        param_1 = param_1 + 1;
        uVar38 = uVar38 + 1;
        iVar15 = iVar15 + 1;
        iVar17 = iVar17 + -1;
      } while (2 < iVar17);
      goto code_r0x7ff70c95be91;
    }
code_r0x7ff70c95be9b:
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
    break;
  case 4:
    if ((uVar40 & 0x40) != 0) {
      **(longlong **)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10) = (longlong)iVar15;
      goto code_r0x7ff70c95b437;
    }
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
    puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
    if (((uVar40 & 0x20) == 0) && ((uVar40 & 0x10) != 0)) {
      **(undefined2 **)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10) = (short)iVar15;
    }
    else {
      **(int **)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10) = iVar15;
    }
    break;
  case 5:
  case 6:
code_r0x7ff70c95b437:
  default:
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
LAB_7ff70c95c0c9:
    uVar38 = uVar20;
    puVar31 = *(undefined **)(&stack0x00000000 + lVar18);
    break;
  case 7:
    *(undefined8 *)((longlong)&uStackX_20 + lVar18) = _UNK_7ff70cb50f00;
    *(undefined8 *)(&stack0x00000028 + lVar18) = _UNK_7ff70cb50f08;
    *(undefined4 *)((longlong)&uStackX_10 + lVar18) = _UNK_7ff70cb50ef0;
    *(undefined4 *)((longlong)auStackX_14 + lVar18) = _UNK_7ff70cb50ef4;
    *(undefined4 *)((longlong)auStackX_14 + lVar18 + 4) = _UNK_7ff70cb50ef8;
    *(undefined4 *)((longlong)auStackX_14 + lVar18 + 8) = _UNK_7ff70cb50efc;
    *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95b33f;
    lVar19 = FUN_7ff70cb12e80((longlong)&uStackX_10 + lVar18);
    if ((uVar40 & 0x2000) == 0) {
      pbVar24 = (byte *)((longlong)&uStackX_10 + lVar18 + 1);
      uVar39 = 0xffffffff;
      if ((uVar40 & 0x4000) != 0) {
        uVar39 = *(uint *)(&stack0x000001a0 + (longlong)(int)uVar36 * 0x18 + lVar18);
      }
    }
    else {
      pbVar24 = (byte *)((longlong)&uStackX_10 + lVar18 + 1);
      uVar39 = uVar36;
    }
    pbVar27 = (byte *)((longlong)&uStackX_10 + lVar18 + 2);
    if ((short)uVar40 < 0) {
      iVar17 = *(int *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0xc);
joined_r0x7ff70c95b50a:
      if ((uVar40 & 4) != 0) goto code_r0x7ff70c95b510;
code_r0x7ff70c95b47f:
      pbVar27 = pbVar24;
      if ((uVar40 & 2) != 0) goto code_r0x7ff70c95b522;
code_r0x7ff70c95b489:
      lVar33 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
    }
    else {
      iVar17 = -1;
      if ((uVar40 & 0x10000) != 0) {
        iVar17 = *(int *)(&stack0x000001a0 +
                         (longlong)*(int *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0xc)
                         * 0x18 + lVar18);
        goto joined_r0x7ff70c95b50a;
      }
      if ((uVar40 & 4) == 0) goto code_r0x7ff70c95b47f;
code_r0x7ff70c95b510:
      *(undefined1 *)((longlong)&uStackX_10 + lVar18 + 1) = 0x2d;
      if ((uVar40 & 2) == 0) goto code_r0x7ff70c95b489;
code_r0x7ff70c95b522:
      *pbVar27 = 0x2b;
      pbVar27 = pbVar27 + 1;
      lVar33 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
    }
    if ((uVar40 & 1) != 0) {
      *pbVar27 = 0x20;
      pbVar27 = pbVar27 + 1;
      uVar40 = *(uint *)(lVar33 + 4);
    }
    if ((uVar40 & 8) != 0) {
      *pbVar27 = 0x23;
      pbVar27 = pbVar27 + 1;
    }
    lVar19 = 0x20 - lVar19;
    *pbVar27 = 0;
    if ((int)uVar39 < 0) {
      *(uint *)(&stack0xfffffffffffffffc + lVar18) = uVar39;
    }
    else {
      if (0x144 < uVar39) {
        uVar39 = 0x145;
      }
      *(uint *)(&stack0xfffffffffffffffc + lVar18) = uVar39;
      *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95b4e5;
      iVar16 = FUN_7ff70c95c190(pbVar27,lVar19,&UNK_7ff70cb878ca);
      lVar33 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
      pbVar27 = pbVar27 + iVar16;
      lVar19 = lVar19 - iVar16;
    }
    if (-1 < iVar17) {
      dVar2 = *(double *)(lVar33 + 0x10);
      iVar16 = *(int *)(&stack0xfffffffffffffffc + lVar18);
      iVar23 = 0x144 - iVar16;
      if (iVar16 < iVar17) {
        iVar23 = 0x144;
      }
      if (iVar16 < 1) {
        iVar23 = 0x144;
      }
      for (; dVar10 <= dVar2; dVar2 = dVar2 / dVar10) {
        iVar23 = iVar23 + -1;
      }
      iVar16 = 1;
      if (1 < iVar23) {
        iVar16 = iVar23;
      }
      iVar16 = iVar16 + -1;
      if (iVar17 <= iVar23) {
        iVar16 = iVar17;
      }
      *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95b60f;
      iVar17 = FUN_7ff70c95c190(pbVar27,lVar19,&UNK_7ff70cb878c9,iVar16);
      pbVar27 = pbVar27 + iVar17;
      lVar33 = *(longlong *)(&stack0xfffffffffffffff0 + lVar18);
    }
    uVar40 = *(uint *)(lVar33 + 4);
    iVar17 = *(int *)(&stack0xffffffffffffffec + lVar18);
    if ((uVar40 & 0x20) != 0) {
      *pbVar27 = 0x6c;
      pbVar27 = pbVar27 + 1;
      uVar40 = *(uint *)(lVar33 + 4);
    }
    if ((uVar40 & 0x40000) == 0) {
      bVar21 = 0x66;
      if ((uVar40 & 0x80000) != 0) {
        bVar21 = ((uVar40 & 0x1000) == 0) << 5 | 0x47;
      }
    }
    else {
      bVar21 = ((uVar40 & 0x1000) == 0) << 5 | 0x45;
    }
    *pbVar27 = bVar21;
    pbVar27[1] = 0;
    uVar3 = *(undefined8 *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar18) + 0x10);
    *(undefined **)((longlong)&uStack_48 + lVar18) = &UNK_7ff70c95b692;
    FUN_7ff70ca41af0(&stack0x00000040 + lVar18,0x146,(longlong)&uStackX_10 + lVar18,uVar3);
    cVar22 = (&stack0x00000040)[lVar18];
    pcVar29 = &stack0x00000041 + lVar18;
    while (cVar22 != '\0') {
      if (param_2 <= uVar20) goto LAB_7ff70c95c0ef;
      *param_1 = cVar22;
      param_1 = param_1 + 1;
      uVar20 = uVar20 + 1;
      iVar15 = iVar15 + 1;
      cVar22 = *pcVar29;
      pcVar29 = pcVar29 + 1;
    }
    goto LAB_7ff70c95c0c9;
  }
  param_3 = (char *)*puVar26;
  puVar26 = puVar26 + 1;
  uVar20 = uVar38;
  goto LAB_7ff70c95b042;
LAB_7ff70c95b060:
  do {
    if (param_2 <= uVar20) goto LAB_7ff70c95c0ef;
    *param_1 = cVar22;
    param_1 = param_1 + 1;
    uVar20 = uVar20 + 1;
    iVar15 = iVar15 + 1;
    cVar22 = param_3[1];
    param_3 = param_3 + 1;
  } while ((cVar22 != '\0') && (cVar22 != '%'));
  goto LAB_7ff70c95b042;
LAB_7ff70c95c0ef:
  uVar20 = uVar38;
  if (uVar38 <= param_2) {
    uVar20 = param_2;
  }
LAB_7ff70c95c0f6:
  if (param_2 != 0) {
joined_r0x7ff70c95c128:
    if (param_2 == uVar20) {
      param_1[-1] = '\0';
      iVar15 = iVar15 + -1;
    }
    else {
      *param_1 = '\0';
    }
  }
  return iVar15;
}


