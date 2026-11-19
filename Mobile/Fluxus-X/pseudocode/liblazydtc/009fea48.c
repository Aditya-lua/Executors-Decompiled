/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fea48
 */

undefined8
FUN_009fea48(double param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,int param_6,uint param_7,uint param_8,int param_9)

{
  bool bVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  uint uVar7;
  uint uVar8;
  ulong uVar9;
  int iVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  int iVar17;
  ulong uVar18;
  double dVar19;
  double dVar20;
  char acStack_9d [40];
  char acStack_75 [21];
  
  uVar7 = 6;
  if (-1 < (int)param_7) {
    uVar7 = param_7;
  }
  if (0.0 <= param_1) {
    if ((param_8 >> 1 & 1) == 0) {
      iVar5 = (param_8 & 4) << 3;
    }
    else {
      iVar5 = 0x2b;
    }
  }
  else {
    iVar5 = 0x2d;
  }
  iVar4 = param_9;
  dVar19 = param_1;
  if (param_9 == 2) {
    iVar4 = 0;
    if (param_1 != 0.0) {
      if ((0.0001 <= param_1) && ((param_1 < 10.0 || (uVar7 != 0)))) {
        if (0 < (int)uVar7) {
          dVar20 = 1.0;
          uVar8 = uVar7;
          do {
            uVar8 = uVar8 - 1;
            dVar20 = dVar20 * 10.0;
          } while (uVar8 != 0);
          if (dVar20 <= param_1) {
            iVar4 = 1;
            goto LAB_009feb14;
          }
        }
        iVar4 = 0;
        goto LAB_009feb10;
      }
      iVar4 = 1;
    }
LAB_009feb14:
    lVar16 = 0;
    if (param_1 != 0.0) {
      if (param_1 < 1.0) {
        lVar16 = 0;
        do {
          dVar19 = dVar19 * 10.0;
          lVar16 = lVar16 + -1;
        } while (dVar19 < 1.0);
      }
      for (; 10.0 < dVar19; dVar19 = dVar19 / 10.0) {
        lVar16 = lVar16 + 1;
      }
    }
    if (param_9 == 2) {
      if (uVar7 == 0) {
        uVar7 = 1;
      }
      uVar7 = uVar7 - 1;
      if ((iVar4 == 0) && (uVar7 = uVar7 - (int)lVar16, (int)uVar7 < 0)) goto LAB_009fedec;
    }
    if (iVar4 != 1) {
      dVar19 = param_1;
    }
  }
  else {
LAB_009feb10:
    if (param_9 != 0) goto LAB_009feb14;
    lVar16 = 0;
  }
  dVar20 = -dVar19;
  if (0.0 <= dVar19) {
    dVar20 = dVar19;
  }
  if (1.8446744073709552e+19 <= dVar20) {
LAB_009fedec:
    FUN_009fe654(param_2,param_3,param_4,param_5,0);
    return 0;
  }
  uVar8 = uVar7;
  if (8 < (int)uVar7) {
    uVar8 = 9;
  }
  uVar9 = (ulong)dVar20;
  if (uVar8 == 0) {
    dVar19 = 1.0;
    uVar18 = 1;
  }
  else {
    uVar11 = 0xfffffff6;
    if (-10 < (int)~uVar7) {
      uVar11 = ~uVar7;
    }
    dVar19 = 1.0;
    iVar10 = uVar11 + 1;
    do {
      iVar10 = iVar10 + 1;
      dVar19 = dVar19 * 10.0;
    } while (iVar10 != 0);
    uVar11 = 0xfffffff6;
    if (-10 < (int)~uVar7) {
      uVar11 = ~uVar7;
    }
    uVar18 = (ulong)(0.5 <= dVar19 - (double)(long)dVar19) + (long)dVar19;
    iVar10 = uVar11 + 1;
    dVar19 = 1.0;
    do {
      iVar10 = iVar10 + 1;
      dVar19 = dVar19 * 10.0;
    } while (iVar10 != 0);
  }
  dVar19 = (dVar20 - (double)uVar9) * dVar19;
  lVar14 = (long)dVar19;
  uVar13 = (ulong)(0.5 <= dVar19 - (double)lVar14) + lVar14;
  uVar12 = 0;
  if (uVar18 <= uVar13) {
    uVar9 = uVar9 + 1;
  }
  uVar2 = 0;
  if (uVar18 <= uVar13) {
    uVar2 = uVar18;
  }
  do {
    acStack_75[uVar12 + 1] = "0123456789"[uVar9 % 10];
    uVar12 = uVar12 + 1;
    if (uVar9 < 10) break;
    uVar9 = uVar9 / 10;
  } while (uVar12 < 0x14);
  uVar13 = uVar13 - uVar2;
  uVar11 = (uint)uVar12;
  uVar7 = uVar11 - 1;
  if (uVar11 != 0x14) {
    uVar7 = uVar11;
  }
  acStack_75[(ulong)uVar7 + 1] = '\0';
  uVar9 = (long)(int)(uVar8 + 1) - 1;
  do {
    uVar18 = uVar9 - 1;
    if ((long)uVar9 < 1) {
      lVar14 = 0;
LAB_009fed68:
      iVar10 = (int)lVar14;
      uVar18 = uVar9 & 0xffffffff;
      goto LAB_009fed6c;
    }
    uVar12 = uVar13;
    lVar15 = 0;
    while( true ) {
      uVar13 = uVar12 / 10;
      if ((lVar15 == 0 && uVar12 % 10 == 0) && (param_9 == 2)) break;
      lVar14 = lVar15 + 1;
      acStack_9d[lVar15 + 0x15] = "0123456789"[uVar12 % 10];
      uVar12 = uVar13;
      lVar15 = lVar14;
      if ((long)uVar9 <= lVar14) goto LAB_009fed68;
    }
    uVar9 = uVar18;
  } while (0 < (long)uVar18);
  iVar10 = 0;
LAB_009fed6c:
  iVar10 = iVar10 - (uint)(iVar10 == 0x14);
  uVar9 = 0;
  acStack_9d[(long)iVar10 + 0x15] = '\0';
  if (iVar4 == 1) {
    iVar3 = -(int)lVar16;
    if (-1 < lVar16) {
      iVar3 = (int)lVar16;
    }
    uVar9 = 0;
    do {
      iVar17 = iVar3;
      uVar12 = uVar9;
      acStack_9d[uVar12 + 1] = "0123456789"[iVar17 % 10];
      uVar9 = uVar12 + 1;
      if (iVar17 < 10) break;
      iVar3 = iVar17 / 10;
    } while (uVar9 < 0x14);
    if (9 < iVar17) goto LAB_009fedec;
    if ((int)uVar9 == 1) {
      acStack_9d[uVar12 + 2] = '0';
      uVar9 = 2;
    }
  }
  iVar17 = (int)uVar18;
  iVar3 = -2 - (int)uVar9;
  if (iVar4 != 1) {
    iVar3 = 0;
  }
  uVar8 = ((((param_6 - (uint)(iVar5 != 0)) - uVar7) - iVar17) - (uint)(0 < iVar17)) + iVar3;
  uVar8 = uVar8 & ((int)uVar8 >> 0x1f ^ 0xffffffffU);
  uVar11 = -uVar8;
  if ((param_8 & 1) == 0) {
    uVar11 = uVar8;
  }
  if (((param_8 >> 4 & 1) == 0) || ((int)uVar11 < 1)) {
    uVar8 = uVar11;
    if (0 < (int)uVar11) {
      do {
        uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,0x20);
        if ((int)uVar6 == 0) {
          return uVar6;
        }
        uVar11 = uVar8 - 1;
        bVar1 = 0 < (int)uVar8;
        uVar8 = uVar11;
      } while (uVar11 != 0 && bVar1);
    }
    if ((iVar5 != 0) &&
       (uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,iVar5), (int)uVar6 == 0)) {
      return uVar6;
    }
  }
  else {
    uVar8 = uVar11;
    if (iVar5 != 0) {
      uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,iVar5);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      bVar1 = (int)uVar11 < 2;
      uVar8 = uVar11 - 1;
      uVar11 = 0;
      if (bVar1) goto LAB_009fef4c;
    }
    iVar5 = uVar8 + 1;
    do {
      uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,0x30);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      iVar5 = iVar5 + -1;
    } while (1 < iVar5);
    uVar11 = 0;
  }
LAB_009fef4c:
  lVar14 = (long)(int)uVar7;
  while (0 < lVar14) {
    uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,acStack_75[lVar14]);
    lVar14 = lVar14 + -1;
    if ((int)uVar6 == 0) {
      return uVar6;
    }
  }
  if (((param_8 >> 3 & 1) != 0) || (0 < iVar17)) {
    uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,0x2e);
    if ((int)uVar6 == 0) {
      return uVar6;
    }
    lVar14 = (long)iVar10;
    while (0 < lVar14) {
      iVar5 = FUN_009fe654(param_2,param_3,param_4,param_5,acStack_9d[lVar14 + 0x14]);
      lVar14 = lVar14 + -1;
      if (iVar5 == 0) {
        return 0;
      }
    }
  }
  if (0 < iVar17 - iVar10) {
    iVar10 = (iVar17 + 1) - iVar10;
    do {
      uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,0x30);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      iVar10 = iVar10 + -1;
    } while (1 < iVar10);
  }
  if (iVar4 == 1) {
    uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,param_8 & 0x20 ^ 0x65);
    if ((int)uVar6 != 0) {
      if (lVar16 < 0) {
        uVar6 = 0x2d;
      }
      else {
        uVar6 = 0x2b;
      }
      uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,uVar6);
      if ((int)uVar6 != 0) {
        uVar9 = uVar9 & 0xffffffff;
        do {
          if ((long)uVar9 < 1) goto LAB_009ff0dc;
          iVar5 = FUN_009fe654(param_2,param_3,param_4,param_5,acStack_9d[uVar9]);
          uVar6 = 0;
          uVar9 = uVar9 - 1;
        } while (iVar5 != 0);
      }
    }
  }
  else {
LAB_009ff0dc:
    if ((int)uVar11 < 0) {
      iVar5 = uVar11 - 1;
      do {
        uVar6 = FUN_009fe654(param_2,param_3,param_4,param_5,0x20);
        if ((int)uVar6 == 0) {
          return uVar6;
        }
        iVar5 = iVar5 + 1;
        uVar6 = 1;
      } while (iVar5 < -1);
    }
    else {
      uVar6 = 1;
    }
  }
  return uVar6;
}

