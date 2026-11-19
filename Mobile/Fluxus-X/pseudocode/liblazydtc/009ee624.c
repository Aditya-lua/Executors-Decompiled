/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ee624
 */

undefined8 ossl_asn1_time_to_tm(undefined8 *param_1,uint *param_2)

{
  int iVar1;
  uint uVar2;
  char cVar3;
  byte bVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  int iVar13;
  ulong uVar14;
  uint uVar15;
  long lVar16;
  ulong uVar17;
  int iVar18;
  long lVar19;
  uint uVar20;
  ulong uVar21;
  int local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  uVar10 = param_2[1];
  if (uVar10 == 0x18) {
    iVar8 = 6;
    uVar17 = *(ulong *)(param_2 + 4) & 0x100;
    uVar20 = (uint)(uVar17 >> 7) | 0xd;
    uVar11 = 7;
  }
  else {
    if (uVar10 != 0x17) {
      return 0;
    }
    iVar8 = 5;
    uVar11 = 6;
    uVar17 = *(ulong *)(param_2 + 4) & 0x100;
    uVar20 = (int)(uVar17 >> 7) + 0xb;
  }
  uVar2 = *param_2;
  lVar16 = *(long *)(param_2 + 2);
  local_68 = 0;
  uStack_70 = 0;
  local_78 = 0;
  uStack_80 = 0;
  local_88 = 0;
  uStack_90 = 0;
  local_98 = 0;
  if ((int)uVar2 < (int)uVar20) {
    return 0;
  }
  iVar18 = 0;
  uVar21 = 0;
  uVar20 = 0;
  lVar19 = lVar16 + 1;
  local_a0 = 0;
  do {
    if (((iVar8 == 0 && uVar17 == 0) &&
        (uVar12 = *(byte *)(lVar19 + uVar21 + -1) - 0x2b, uVar12 < 0x30)) &&
       ((1L << ((ulong)uVar12 & 0x3f) & 0x800000000005U) != 0)) break;
    uVar9 = ossl_ascii_isdigit();
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    if ((ulong)uVar2 - 1 == uVar21) {
      return 0;
    }
    bVar4 = *(byte *)(lVar19 + uVar21 + -1);
    uVar9 = ossl_ascii_isdigit(*(undefined1 *)(lVar19 + uVar21));
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    if ((ulong)uVar2 - 2 == uVar21) {
      return 0;
    }
    uVar10 = param_2[1];
    uVar12 = uVar20;
    if (uVar10 == 0x17) {
      uVar12 = uVar20 + 1;
    }
    uVar14 = (ulong)uVar12;
    iVar5 = (uint)*(byte *)(lVar19 + uVar21) + (uint)bVar4 * 10;
    iVar13 = iVar5 + -0x210;
    if (iVar13 < *(int *)(&DAT_0074ded8 + uVar14 * 4)) {
      return 0;
    }
    if ((int)(&DAT_0074defc)[uVar14] < iVar13) {
      return 0;
    }
    if (6 < (uVar12 & 0x7fffffff)) goto LAB_009ee9dc;
    iVar7 = iVar5 + -0x1e0;
    switch(uVar14 & 0x7fffffff) {
    case 0:
      local_a0 = iVar13 * 100 + -0x76c;
      goto LAB_009ee878;
    case 1:
      if (uVar10 == 0x17) {
        local_a0 = iVar5 + -0x1ac;
        if (0x61 < iVar7) {
          local_a0 = iVar13;
        }
      }
      else {
        local_a0 = local_a0 + iVar13;
      }
LAB_009ee878:
      local_88 = CONCAT44(local_a0,(undefined4)local_88);
      break;
    case 2:
      iVar18 = iVar5 + -0x211;
      local_88 = CONCAT44(local_88._4_4_,iVar18);
      break;
    case 3:
      if (iVar18 == 1) {
        uVar12 = local_a0 + 0x76c;
        if ((int)uVar12 % 400 == 0) {
          uVar12 = 1;
        }
        else {
          uVar12 = (uint)((int)uVar12 % 100 != 0 && (uVar12 & 3) == 0);
        }
        uVar12 = uVar12 | 0x1c;
      }
      else {
        uVar12 = (&DAT_0074df20)[iVar18];
      }
      if ((int)uVar12 < iVar13) {
        return 0;
      }
      uStack_90 = CONCAT44(iVar13,(undefined4)uStack_90);
      iVar5 = iVar7 + (&DAT_0074df80)[iVar18] + -0x31;
      if (iVar18 < 2) {
        iVar13 = iVar18 + 0xe;
        uVar12 = local_a0 + 0x76b;
      }
      else {
        uVar12 = local_a0 + 0x76c;
        if ((int)uVar12 % 400 == 0) {
          uVar15 = 1;
        }
        else {
          uVar15 = (uint)((int)uVar12 % 100 != 0 && (uVar12 & 3) == 0);
        }
        iVar5 = uVar15 + iVar5;
        iVar13 = iVar18 + 2;
      }
      iVar6 = (int)uVar12 % 100;
      iVar1 = iVar6 + 3;
      if (-1 < iVar6) {
        iVar1 = iVar6;
      }
      uStack_80 = CONCAT44(iVar5,(iVar7 + (iVar13 * 0xd) / 5 + iVar6 + (int)uVar12 / 400 +
                                  (iVar1 >> 2) + ((int)uVar12 / 100) * 5 + -0x2a) % 7);
      break;
    case 4:
      uStack_90 = CONCAT44(uStack_90._4_4_,iVar13);
      break;
    case 5:
      local_98 = CONCAT44(iVar13,(undefined4)local_98);
      break;
    case 6:
      local_98 = CONCAT44(local_98._4_4_,iVar13);
    }
LAB_009ee9dc:
    uVar20 = uVar20 + 1;
    uVar21 = uVar21 + 2;
    iVar8 = iVar8 + -1;
  } while (uVar20 < uVar11);
  uVar20 = (uint)uVar21;
  if ((uVar10 == 0x18) && (*(char *)(lVar16 + (uVar21 & 0xffffffff)) == '.')) {
    if (uVar17 != 0) {
      return 0;
    }
    uVar10 = uVar20 | 1;
    if (uVar10 == uVar2) {
      return 0;
    }
    uVar21 = (ulong)uVar10;
    if ((int)uVar10 < (int)uVar2) {
      uVar21 = (ulong)uVar10;
      do {
        iVar8 = ossl_ascii_isdigit(*(undefined1 *)(lVar16 + uVar21));
        if (iVar8 == 0) break;
        uVar21 = uVar21 + 1;
      } while ((int)uVar21 < (int)uVar2);
    }
    uVar20 = (uint)uVar21;
    if (uVar10 == uVar20) {
      return 0;
    }
    if (uVar20 == uVar2) {
      return 0;
    }
  }
  cVar3 = *(char *)(lVar16 + (int)uVar20);
  if (cVar3 == 'Z') {
    uVar20 = uVar20 + 1;
  }
  else {
    if (uVar17 != 0) {
      return 0;
    }
    if ((cVar3 != '-') && (cVar3 != '+')) {
      return 0;
    }
    iVar8 = -1;
    if (cVar3 == '-') {
      iVar8 = 1;
    }
    if (uVar20 + 5 != uVar2) {
      return 0;
    }
    lVar19 = (long)(int)(uVar20 + 1);
    uVar9 = ossl_ascii_isdigit(*(undefined1 *)(lVar16 + lVar19));
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    bVar4 = *(byte *)(lVar16 + lVar19);
    uVar9 = ossl_ascii_isdigit(*(undefined1 *)(lVar16 + lVar19 + 1));
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    uVar10 = uVar11 + 1;
    if (param_2[1] != 0x17) {
      uVar10 = uVar11;
    }
    iVar18 = (uint)*(byte *)(lVar16 + lVar19 + 1) + (uint)bVar4 * 10 + -0x210;
    if (iVar18 < *(int *)(&DAT_0074ded8 + (ulong)uVar10 * 4)) {
      return 0;
    }
    if ((int)(&DAT_0074defc)[uVar10] < iVar18) {
      return 0;
    }
    uVar9 = ossl_ascii_isdigit(*(undefined1 *)(lVar16 + lVar19 + 2));
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    bVar4 = *(byte *)(lVar16 + lVar19 + 2);
    uVar9 = ossl_ascii_isdigit(*(undefined1 *)(lVar16 + lVar19 + 3));
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    uVar10 = uVar11 + 2;
    if (param_2[1] != 0x17) {
      uVar10 = uVar11 + 1;
    }
    iVar5 = (uint)*(byte *)(lVar16 + lVar19 + 3) + (uint)bVar4 * 10 + -0x210;
    if (iVar5 < *(int *)(&DAT_0074ded8 + (ulong)uVar10 * 4)) {
      return 0;
    }
    if ((int)(&DAT_0074defc)[uVar10] < iVar5) {
      return 0;
    }
    uVar20 = uVar20 + 5;
    if (((param_1 != (undefined8 *)0x0) && (iVar18 = iVar18 * 0xe10 + iVar5 * 0x3c, iVar18 != 0)) &&
       (uVar9 = OPENSSL_gmtime_adj(&local_98,0,(long)(iVar18 * iVar8)), (int)uVar9 == 0)) {
      return uVar9;
    }
  }
  uVar9 = 0;
  if (uVar20 == uVar2) {
    if (param_1 != (undefined8 *)0x0) {
      param_1[6] = local_68;
      param_1[5] = uStack_70;
      param_1[4] = local_78;
      param_1[3] = uStack_80;
      param_1[2] = local_88;
      param_1[1] = uStack_90;
      *param_1 = local_98;
    }
    uVar9 = 1;
  }
  return uVar9;
}

