/* 7ff70c95db90 FUN_7ff70c95db90 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c95db90(undefined8 param_1,char *param_2,undefined8 param_3)

{
  double dVar1;
  undefined1 uVar2;
  ulonglong uVar3;
  bool bVar4;
  double dVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  longlong lVar10;
  longlong lVar11;
  char *pcVar12;
  byte bVar13;
  ulonglong uVar14;
  undefined8 uVar15;
  undefined2 uVar16;
  int iVar18;
  byte *pbVar19;
  undefined8 *puVar20;
  ulonglong uVar21;
  char cVar22;
  uint uVar23;
  code *unaff_R12;
  uint uVar24;
  uint uVar25;
  undefined *puVar26;
  longlong lVar27;
  ulonglong uVar28;
  bool bVar29;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  undefined8 uStackX_8;
  char acStackX_17 [17];
  undefined8 auStack_50 [2];
  undefined1 *puVar17;
  
  auStack_50[1] = 0x7ff70c95dba6;
  lVar10 = FUN_7ff70caa9780();
  lVar10 = -lVar10;
  *(undefined4 *)(&stack0x00001170 + lVar10) = unaff_XMM6_Da;
  *(undefined4 *)(&stack0x00001174 + lVar10) = unaff_XMM6_Db;
  *(undefined4 *)(&stack0x00001178 + lVar10) = unaff_XMM6_Dc;
  *(undefined4 *)(&stack0x0000117c + lVar10) = unaff_XMM6_Dd;
  puVar17 = &stack0x00000170 + lVar10;
  *(undefined8 *)((longlong)auStack_50 + lVar10 + 8) = 0x7ff70c95dbd6;
  pcVar12 = param_2;
  iVar6 = FUN_7ff70c95c440(param_2,puVar17,&stack0x00000d70 + lVar10,param_3);
  uVar16 = SUB82(puVar17,0);
  if (iVar6 != 0) {
    return 0;
  }
  puVar26 = &UNK_7ff70cb50e90;
  iVar18 = 0;
  *(char **)((longlong)auStack_50 + lVar10 + 8) = pcVar12;
  *(undefined8 *)((longlong)auStack_50 + lVar10) = 0x7ff70c95dc0b;
  func_0x7ff70d743c47();
  dVar5 = _DAT_7ff70cb50f10;
  puVar20 = (undefined8 *)(&stack0x00000d71 + lVar10);
  uVar2 = in(uVar16);
  (&stack0x00000d70)[lVar10] = uVar2;
  iVar6 = 0;
  do {
    while( true ) {
      while (cVar22 = *param_2, cVar22 != '%') {
        if (cVar22 == '\0') {
          return iVar6;
        }
        do {
          *(undefined8 *)((longlong)auStack_50 + lVar10) = 0x7ff70c95dc39;
          iVar7 = (*unaff_R12)(cVar22,param_1);
          if (iVar7 == -1) {
            return iVar6;
          }
          iVar6 = iVar6 + 1;
          cVar22 = param_2[1];
          param_2 = param_2 + 1;
        } while ((cVar22 != '\0') && (cVar22 != '%'));
      }
      cVar22 = param_2[1];
      if (cVar22 != '%') break;
      *(undefined8 *)((longlong)auStack_50 + lVar10) = 0x7ff70c95dc73;
      iVar7 = (*unaff_R12)(0x25,param_1);
      if (iVar7 == -1) {
        return iVar6;
      }
      param_2 = param_2 + 2;
      iVar6 = iVar6 + 1;
    }
    iVar7 = iVar18;
    if ((byte)(cVar22 - 0x30U) < 10) {
      param_2 = param_2 + 2;
      iVar7 = 0;
      do {
        iVar8 = (uint)(byte)(cVar22 - 0x30) + iVar7 * 10;
        if (0x7f < iVar7) {
          iVar8 = iVar7;
        }
        cVar22 = *param_2;
        param_2 = param_2 + 1;
        iVar7 = iVar8;
      } while ((byte)(cVar22 - 0x30U) < 10);
      iVar7 = iVar8 + -1;
      if (iVar8 == 0) {
        iVar7 = iVar18;
      }
      if (cVar22 != '$') {
        iVar7 = iVar18;
      }
      if (0x80 < iVar8) {
        iVar7 = iVar18;
      }
    }
    *(undefined **)(&stack0xffffffffffffffe0 + lVar10) = puVar26;
    lVar27 = (longlong)iVar7 * 0x18 + lVar10 + -0x48;
    uVar23 = *(uint *)(&stack0x0000016c + (longlong)iVar7 * 0x18 + lVar10);
    if ((uVar23 & 0x4000) == 0) {
      iVar18 = iVar18 + 1;
      uVar24 = *(uint *)(&stack0x00000170 + lVar27 + 0x48);
      uVar25 = uVar24;
    }
    else {
      uVar25 = *(uint *)(&stack0x00000170 + lVar27 + 0x48);
      uVar24 = *(uint *)(&stack0x00000178 + (longlong)(int)uVar25 * 0x18 + lVar10);
      iVar18 = iVar18 + 2;
      if ((int)uVar24 < 0) {
        uVar24 = -uVar24;
        uVar23 = uVar23 & 0xfffffefb | 4;
        *(uint *)(&stack0x0000016c + lVar27 + 0x48) = uVar23;
      }
    }
    if ((uVar23 & 0x10000) == 0) {
      iVar7 = -1;
      if ((short)uVar23 < 0) {
        iVar7 = *(int *)(&stack0x00000174 + lVar27 + 0x48);
      }
    }
    else {
      iVar7 = *(int *)(&stack0x00000178 +
                      (longlong)*(int *)(&stack0x00000174 + lVar27 + 0x48) * 0x18 + lVar10);
      iVar18 = iVar18 + 1;
      if (iVar7 < 0) {
        iVar7 = -1;
      }
    }
    switch(*(undefined4 *)(&stack0x00000168 + lVar27 + 0x48)) {
    case 1:
      pcVar12 = *(char **)(&stack0x00000178 + lVar27 + 0x48);
      if (pcVar12 == (char *)0x0) {
        if (iVar7 == -1 || 4 < iVar7) {
          uVar23 = uVar23 & 0xfffffff7;
          *(uint *)(&stack0x0000016c + lVar27 + 0x48) = uVar23;
          uVar14 = 5;
          *(undefined **)(&stack0xfffffffffffffff0 + lVar10) = &UNK_7ff70cb50ee5;
        }
        else {
          *(undefined **)(&stack0xfffffffffffffff0 + lVar10) = &UNK_7ff70cb923a7;
code_r0x7ff70c95e44f:
          uVar14 = 0;
        }
      }
      else {
        *(char **)(&stack0xfffffffffffffff0 + lVar10) = pcVar12;
        if (iVar7 == -1) {
          if (*pcVar12 == '\0') goto code_r0x7ff70c95e44f;
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e3d5;
          uVar14 = FUN_7ff70cb12e80();
        }
        else {
          uVar14 = (ulonglong)iVar7;
        }
      }
      uVar21 = 0x7fffffff;
      if (uVar14 < 0x7fffffff) {
        uVar21 = uVar14;
      }
      *(uint *)(&stack0xffffffffffffffd8 + lVar10) = uVar23;
      *(ulonglong *)(&stack0xffffffffffffffe8 + lVar10) = uVar14;
      if ((uVar23 & 8) != 0) {
        *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e47c;
        iVar7 = (*unaff_R12)(0x22,param_1);
        if (iVar7 == -1) {
          return iVar6;
        }
        iVar6 = iVar6 + 1;
        uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
        uVar14 = *(ulonglong *)(&stack0xffffffffffffffe8 + lVar10);
      }
      iVar7 = uVar24 - (int)uVar21;
      if ((uVar23 & 4) == 0) {
        if (iVar7 < 1) {
          iVar7 = iVar7 + -1;
        }
        else {
          iVar8 = uVar24 + iVar6;
          do {
            *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e4b4;
            iVar9 = (*unaff_R12)(0x20,param_1);
            if (iVar9 == -1) {
              return iVar6;
            }
            iVar6 = iVar6 + 1;
            iVar9 = iVar7 + -1;
            bVar29 = 0 < iVar7;
            iVar7 = iVar9;
          } while (iVar9 != 0 && bVar29);
          iVar7 = -1;
          uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
          uVar14 = *(ulonglong *)(&stack0xffffffffffffffe8 + lVar10);
          iVar6 = iVar8 - (int)uVar21;
        }
      }
      iVar8 = iVar6;
      if (uVar14 != 0) {
        iVar8 = (int)uVar14 + iVar6;
        lVar27 = 0;
        do {
          cVar22 = *(char *)(*(longlong *)(&stack0xfffffffffffffff0 + lVar10) + lVar27);
          if (cVar22 == '\0') {
            iVar8 = iVar6 + (int)lVar27;
            break;
          }
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e538;
          iVar9 = (*unaff_R12)(cVar22,param_1);
          if (iVar9 == -1) {
            return iVar6 + (int)lVar27;
          }
          lVar27 = lVar27 + 1;
          uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
        } while (*(longlong *)(&stack0xffffffffffffffe8 + lVar10) != lVar27);
      }
      puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
      iVar6 = iVar8;
      if (((uVar23 & 4) != 0) && (0 < iVar7)) {
        iVar6 = iVar7 + iVar8;
        iVar7 = iVar7 + 1;
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e57a;
          iVar9 = (*unaff_R12)(0x20,param_1);
          if (iVar9 == -1) {
            return iVar8;
          }
          iVar8 = iVar8 + 1;
          iVar7 = iVar7 + -1;
        } while (1 < iVar7);
        uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
      }
      if ((uVar23 & 8) != 0) {
        *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e5ac;
        iVar7 = (*unaff_R12)(0x22,param_1);
        if (iVar7 == -1) {
          return iVar6;
        }
        iVar6 = iVar6 + 1;
      }
      break;
    case 2:
      uVar14 = *(ulonglong *)(&stack0x00000178 + lVar27 + 0x48);
      if (uVar14 != 0) {
        puVar26 = &UNK_7ff70cb50ec0;
        if ((uVar23 & 0x1000) == 0) {
          puVar26 = &UNK_7ff70cb50e90;
        }
        *(undefined **)(&stack0xffffffffffffffe0 + lVar10) = puVar26;
        *(undefined4 *)(&stack0xffffffffffffffe8 + lVar10) = 1;
code_r0x7ff70c95de96:
        bVar29 = true;
        uVar21 = 0x10;
        bVar4 = false;
        *(undefined4 *)(&stack0xffffffffffffffdc + lVar10) = 0xcb50e01;
code_r0x7ff70c95e1c6:
        (&stack0xfffffffffffffff0)[lVar10] = bVar29;
        if (iVar7 == -1) {
          iVar7 = 1;
        }
        uVar28 = 0x144;
        pcVar12 = &stack0x0000015c + lVar10;
        if (uVar14 != 0) {
          do {
            uVar3 = uVar14;
            if (uVar14 >> 0x20 == 0) {
              uVar3 = uVar14 & 0xffffffff;
            }
            acStackX_17[uVar28 + lVar10 + 1] =
                 *(char *)(*(longlong *)(&stack0xffffffffffffffe0 + lVar10) + uVar3 % uVar21);
            uVar28 = uVar28 - 1;
            bVar29 = uVar21 <= uVar14;
            uVar14 = uVar3 / uVar21;
          } while (bVar29);
          pcVar12 = acStackX_17 + uVar28 + lVar10 + 1;
        }
        iVar8 = 0x144 - (int)uVar28;
        iVar9 = uVar24 - iVar8;
        iVar8 = iVar7 - iVar8;
        uVar14 = (ulonglong)*(uint *)(&stack0xffffffffffffffe8 + lVar10);
        *(uint *)(&stack0xffffffffffffffd8 + lVar10) = uVar23;
        if ((bVar4 && *(uint *)(&stack0xffffffffffffffe8 + lVar10) != 0) && (iVar8 < 1)) {
          uVar28 = uVar28 - 1;
          *pcVar12 = '0';
          iVar9 = iVar9 + -1;
        }
        else if ((0 < iVar8) && (iVar9 = iVar9 - iVar8, -1 < (longlong)uVar28)) {
          uVar21 = (ulonglong)((iVar7 + (int)uVar28) - 0x145);
          if (uVar28 < uVar21) {
            uVar21 = uVar28;
          }
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e293;
          FUN_7ff70cb12b80(acStackX_17 + (uVar28 - uVar21) + lVar10 + 1,
                           CONCAT71((uint7)(uint3)((uint)iVar8 >> 8),0x30),uVar21 + 1);
          uVar14 = (ulonglong)*(uint *)(&stack0xffffffffffffffe8 + lVar10);
          uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
          uVar28 = uVar28 + ~uVar21;
        }
        bVar13 = (byte)uVar14 & (&stack0xffffffffffffffdc)[lVar10];
        uVar14 = CONCAT71((int7)(uVar14 >> 8),bVar13);
        iVar7 = iVar9 + -2;
        if (bVar13 == 0) {
          iVar7 = iVar9;
        }
        bVar13 = (&stack0xfffffffffffffff0)[lVar10];
        uVar24 = (uint)(byte)(bVar13 ^ 1 | (uVar23 & 3) != 0);
        iVar8 = iVar7 - uVar24;
        *(uint *)(&stack0xffffffffffffffdc + lVar10) = uVar23 & 0x104;
        *(int *)(&stack0xffffffffffffffe8 + lVar10) = (int)uVar14;
        iVar9 = iVar6;
        if ((uVar23 & 0x104) == 0) {
          if (iVar8 < 1) {
            iVar8 = iVar8 + -1;
          }
          else {
            iVar7 = iVar7 + iVar6;
            do {
              *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e32a;
              iVar9 = (*unaff_R12)(0x20,param_1);
              if (iVar9 == -1) {
                return iVar6;
              }
              iVar6 = iVar6 + 1;
              iVar9 = iVar8 + -1;
              bVar29 = 0 < iVar8;
              iVar8 = iVar9;
            } while (iVar9 != 0 && bVar29);
            iVar8 = -1;
            uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
            uVar14 = (ulonglong)*(uint *)(&stack0xffffffffffffffe8 + lVar10);
            bVar13 = (&stack0xfffffffffffffff0)[lVar10];
            iVar9 = iVar7 - uVar24;
          }
        }
        cVar22 = (char)uVar14;
        if (bVar13 == 0) {
          uVar15 = 0x2d;
code_r0x7ff70c95e37f:
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e385;
          iVar6 = (*unaff_R12)(uVar15,param_1);
          if (iVar6 == -1) {
            return iVar9;
          }
          iVar9 = iVar9 + 1;
          cVar22 = (char)*(undefined4 *)(&stack0xffffffffffffffe8 + lVar10);
        }
        else {
          if ((uVar23 & 2) != 0) {
            uVar15 = 0x2b;
            goto code_r0x7ff70c95e37f;
          }
          if ((uVar23 & 1) != 0) {
            uVar15 = 0x20;
            goto code_r0x7ff70c95e37f;
          }
        }
        if (cVar22 != '\0') {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e3ac;
          iVar6 = (*unaff_R12)(0x30,param_1);
          if (iVar6 == -1) {
            return iVar9;
          }
          if ((uVar23 & 0x1000) == 0) {
            uVar15 = 0x78;
          }
          else {
            uVar15 = 0x58;
          }
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e3e8;
          iVar6 = (*unaff_R12)(uVar15,param_1);
          if (iVar6 == -1) {
            return iVar9 + 1;
          }
          iVar9 = iVar9 + 2;
        }
        if (*(int *)(&stack0xffffffffffffffdc + lVar10) == 0x100) {
          if (iVar8 < 1) {
            iVar8 = iVar8 + -1;
          }
          else {
            iVar6 = iVar8 + iVar9;
            do {
              *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e41f;
              iVar7 = (*unaff_R12)(0x30,param_1);
              if (iVar7 == -1) {
                return iVar9;
              }
              iVar9 = iVar9 + 1;
              iVar7 = iVar8 + -1;
              bVar29 = 0 < iVar8;
              iVar8 = iVar7;
            } while (iVar7 != 0 && bVar29);
            iVar8 = -1;
            uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
            iVar9 = iVar6;
          }
        }
        iVar6 = iVar9;
        if ((longlong)uVar28 < 0x144) {
          iVar6 = (iVar9 - (int)uVar28) + 0x144;
          do {
            cVar22 = acStackX_17[uVar28 + lVar10 + 2];
            *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e5e1;
            iVar7 = (*unaff_R12)(cVar22,param_1);
            if (iVar7 == -1) {
              return iVar9;
            }
            uVar28 = uVar28 + 1;
            iVar9 = iVar9 + 1;
          } while (uVar28 != 0x144);
          uVar23 = *(uint *)(&stack0xffffffffffffffd8 + lVar10);
        }
        if (((uVar23 & 4) == 0) || (iVar8 < 1)) goto LAB_7ff70c95e1a5;
        iVar7 = iVar8 + iVar6;
        iVar8 = iVar8 + 1;
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e626;
          iVar9 = (*unaff_R12)(0x20,param_1);
          if (iVar9 == -1) {
            return iVar6;
          }
          iVar6 = iVar6 + 1;
          iVar8 = iVar8 + -1;
        } while (1 < iVar8);
        goto code_r0x7ff70c95e6c3;
      }
      iVar7 = uVar24 - 5;
      *(uint *)(&stack0xffffffffffffffd8 + lVar10) = uVar23;
      iVar8 = iVar7;
      if (((uVar23 & 4) == 0) || (iVar8 = uVar24 - 6, (int)uVar24 < 6)) {
        puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
        iVar9 = iVar6;
      }
      else {
        iVar9 = iVar7 + iVar6;
        puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e4f9;
          iVar8 = (*unaff_R12)(0x20,param_1);
          if (iVar8 == -1) {
            return iVar6;
          }
          iVar6 = iVar6 + 1;
          iVar7 = iVar7 + -1;
        } while (0 < iVar7);
        iVar8 = -1;
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e6f3;
      iVar6 = (*unaff_R12)(0x28,param_1);
      if (iVar6 == -1) {
        return iVar9;
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e707;
      iVar6 = (*unaff_R12)(0x6e,param_1);
      if (iVar6 == -1) {
        return iVar9 + 1;
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e71b;
      iVar6 = (*unaff_R12)(0x69,param_1);
      if (iVar6 == -1) {
        return iVar9 + 2;
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e72f;
      iVar6 = (*unaff_R12)(0x6c,param_1);
      if (iVar6 == -1) {
        return iVar9 + 3;
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e73f;
      iVar6 = (*unaff_R12)(0x29,param_1);
      if (iVar6 == -1) {
        return iVar9 + 4;
      }
      iVar9 = iVar9 + 5;
      iVar6 = iVar9;
      if ((((&stack0xffffffffffffffd8)[lVar10] & 4) == 0) && (0 < iVar8)) {
        iVar6 = iVar9 + iVar8;
        iVar8 = iVar8 + 1;
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e764;
          iVar7 = (*unaff_R12)(0x20,param_1);
          if (iVar7 == -1) {
            return iVar9;
          }
          iVar9 = iVar9 + 1;
          iVar8 = iVar8 + -1;
        } while (1 < iVar8);
      }
      break;
    case 3:
      uVar14 = *(ulonglong *)(&stack0x00000178 + lVar27 + 0x48);
      if ((uVar23 & 0x20000) == 0) {
        *(uint *)(&stack0xffffffffffffffe8 + lVar10) = uVar23 >> 3 & 1;
        bVar29 = true;
        if ((uVar23 & 0x400) == 0) {
          if ((uVar23 & 0x800) != 0) {
            puVar26 = &UNK_7ff70cb50ec0;
            if ((uVar23 & 0x1000) == 0) {
              puVar26 = &UNK_7ff70cb50e90;
            }
            *(undefined **)(&stack0xffffffffffffffe0 + lVar10) = puVar26;
            goto code_r0x7ff70c95de96;
          }
          uVar21 = 10;
          if ((uVar23 & 0x200) == 0) {
            uVar28 = -uVar14;
            if ((longlong)-uVar14 < 0) {
              uVar28 = uVar14;
            }
            bVar29 = -1 < (longlong)uVar14;
            bVar4 = false;
            *(undefined4 *)(&stack0xffffffffffffffdc + lVar10) = 0;
            uVar14 = uVar28;
          }
          else {
            bVar4 = false;
            *(undefined4 *)(&stack0xffffffffffffffdc + lVar10) = 0;
          }
        }
        else {
          uVar21 = 8;
          *(undefined4 *)(&stack0xffffffffffffffdc + lVar10) = 0;
          bVar4 = true;
        }
        goto code_r0x7ff70c95e1c6;
      }
      uVar25 = uVar24;
      if (((uVar23 & 4) == 0) && (uVar25 = uVar24 - 1, 1 < (int)uVar24)) {
        *(uint *)(&stack0xffffffffffffffe8 + lVar10) = uVar25 + iVar6;
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95df2c;
          iVar7 = (*unaff_R12)(0x20,param_1);
          if (iVar7 == -1) {
            return iVar6;
          }
          iVar6 = iVar6 + 1;
          uVar24 = uVar24 - 1;
        } while (1 < (int)uVar24);
        uVar25 = 0;
        iVar6 = *(int *)(&stack0xffffffffffffffe8 + lVar10);
      }
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e680;
      iVar7 = (*unaff_R12)(uVar14 & 0xff,param_1);
      if (iVar7 == -1) {
        return iVar6;
      }
      iVar7 = iVar6 + 1;
      if (((uVar23 & 4) != 0) && (1 < (int)uVar25)) {
        iVar6 = iVar6 + uVar25;
        iVar8 = uVar25 + 1;
        do {
          *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e6aa;
          iVar9 = (*unaff_R12)(0x20,param_1);
          if (iVar9 == -1) {
            return iVar7;
          }
          iVar7 = iVar7 + 1;
          iVar8 = iVar8 + -1;
        } while (2 < iVar8);
        goto LAB_7ff70c95e1a5;
      }
code_r0x7ff70c95e6c3:
      puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
      iVar6 = iVar7;
      break;
    case 4:
      if ((uVar23 & 0x40) != 0) {
        **(longlong **)(&stack0x00000178 + lVar27 + 0x48) = (longlong)iVar6;
        goto LAB_7ff70c95e1a5;
      }
      puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
      if (((uVar23 & 0x20) == 0) && ((uVar23 & 0x10) != 0)) {
        **(undefined2 **)(&stack0x00000178 + lVar27 + 0x48) = (short)iVar6;
      }
      else {
        **(int **)(&stack0x00000178 + lVar27 + 0x48) = iVar6;
      }
      break;
    case 7:
      *(undefined8 *)((longlong)&uStackX_8 + lVar10) = _UNK_7ff70cb50f00;
      *(undefined8 *)(&stack0x00000010 + lVar10) = _UNK_7ff70cb50f08;
      *(undefined4 *)(&stack0xfffffffffffffff8 + lVar10) = _UNK_7ff70cb50ef0;
      *(undefined4 *)(&stack0xfffffffffffffffc + lVar10) = _UNK_7ff70cb50ef4;
      *(undefined4 *)(acStackX_17 + lVar10 + -0x17) = _UNK_7ff70cb50ef8;
      *(undefined4 *)(acStackX_17 + lVar10 + -0x13) = _UNK_7ff70cb50efc;
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95deca;
      lVar11 = FUN_7ff70cb12e80(&stack0xfffffffffffffff8 + lVar10);
      uVar24 = uVar25;
      if (((uVar23 & 0x2000) == 0) && (uVar24 = 0xffffffff, (uVar23 & 0x4000) != 0)) {
        uVar24 = *(uint *)(&stack0x00000178 + (longlong)(int)uVar25 * 0x18 + lVar10);
      }
      puVar17 = &stack0xfffffffffffffff9;
      if ((short)uVar23 < 0) {
        iVar7 = *(int *)(&stack0x00000174 + lVar27 + 0x48);
      }
      else {
        iVar7 = -1;
        if ((uVar23 & 0x10000) != 0) {
          iVar7 = *(int *)(&stack0x00000178 +
                          (longlong)*(int *)(&stack0x00000174 + lVar27 + 0x48) * 0x18 + lVar10);
        }
      }
      if ((uVar23 & 4) != 0) {
        (&stack0xfffffffffffffff9)[lVar10] = 0x2d;
        puVar17 = &stack0xfffffffffffffffa;
      }
      pbVar19 = (byte *)((longlong)puVar17 + lVar10);
      if ((uVar23 & 2) != 0) {
        *pbVar19 = 0x2b;
        pbVar19 = (byte *)((longlong)pbVar19 + 1);
      }
      if ((uVar23 & 1) != 0) {
        *pbVar19 = 0x20;
        pbVar19 = pbVar19 + 1;
        uVar23 = *(uint *)(&stack0x0000016c + lVar27 + 0x48);
      }
      if ((uVar23 & 8) != 0) {
        *pbVar19 = 0x23;
        pbVar19 = pbVar19 + 1;
      }
      lVar11 = 0x20 - lVar11;
      *pbVar19 = 0;
      if ((int)uVar24 < 0) {
        *(uint *)(&stack0xffffffffffffffd8 + lVar10) = uVar24;
      }
      else {
        if (0x144 < uVar24) {
          uVar24 = 0x145;
        }
        *(uint *)(&stack0xffffffffffffffd8 + lVar10) = uVar24;
        *(int *)(&stack0xffffffffffffffe8 + lVar10) = iVar7;
        *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95dff4;
        iVar8 = FUN_7ff70c95c190(pbVar19,lVar11,&UNK_7ff70cb878ca);
        iVar7 = *(int *)(&stack0xffffffffffffffe8 + lVar10);
        pbVar19 = pbVar19 + iVar8;
        lVar11 = lVar11 - iVar8;
      }
      if (-1 < iVar7) {
        dVar1 = *(double *)(&stack0x00000178 + lVar27 + 0x48);
        iVar8 = *(int *)(&stack0xffffffffffffffd8 + lVar10);
        iVar9 = 0x144 - iVar8;
        if (iVar8 < iVar7) {
          iVar9 = 0x144;
        }
        if (iVar8 < 1) {
          iVar9 = 0x144;
        }
        for (; dVar5 <= dVar1; dVar1 = dVar1 / dVar5) {
          iVar9 = iVar9 + -1;
        }
        iVar8 = 1;
        if (1 < iVar9) {
          iVar8 = iVar9;
        }
        iVar8 = iVar8 + -1;
        if (iVar7 <= iVar9) {
          iVar8 = iVar7;
        }
        *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e10b;
        iVar7 = FUN_7ff70c95c190(pbVar19,lVar11,&UNK_7ff70cb878c9,iVar8);
        pbVar19 = pbVar19 + iVar7;
      }
      uVar23 = *(uint *)(&stack0x0000016c + lVar27 + 0x48);
      if ((uVar23 & 0x20) != 0) {
        *pbVar19 = 0x6c;
        pbVar19 = pbVar19 + 1;
        uVar23 = *(uint *)(&stack0x0000016c + lVar27 + 0x48);
      }
      if ((uVar23 & 0x40000) == 0) {
        bVar13 = 0x66;
        if ((uVar23 & 0x80000) != 0) {
          bVar13 = ((uVar23 & 0x1000) == 0) << 5 | 0x47;
        }
      }
      else {
        bVar13 = ((uVar23 & 0x1000) == 0) << 5 | 0x45;
      }
      *pbVar19 = bVar13;
      pbVar19[1] = 0;
      uVar15 = *(undefined8 *)(&stack0x00000178 + lVar27 + 0x48);
      *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e177;
      FUN_7ff70ca41af0(acStackX_17 + lVar10 + 1,0x146,&stack0xfffffffffffffff8 + lVar10,uVar15);
      cVar22 = acStackX_17[lVar10 + 1];
      pcVar12 = acStackX_17 + lVar10 + 2;
      while (cVar22 != '\0') {
        *(undefined **)((longlong)auStack_50 + lVar10) = &UNK_7ff70c95e18e;
        iVar7 = (*unaff_R12)(cVar22,param_1);
        if (iVar7 == -1) {
          return iVar6;
        }
        iVar6 = iVar6 + 1;
        cVar22 = *pcVar12;
        pcVar12 = pcVar12 + 1;
      }
    default:
LAB_7ff70c95e1a5:
      puVar26 = *(undefined **)(&stack0xffffffffffffffe0 + lVar10);
    }
    param_2 = (char *)*puVar20;
    puVar20 = puVar20 + 1;
  } while( true );
}


