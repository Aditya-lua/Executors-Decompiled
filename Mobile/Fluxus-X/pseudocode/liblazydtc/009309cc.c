/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009309cc
 */

void FUN_009309cc(byte *param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  bool bVar5;
  int iVar6;
  uint uVar7;
  int iVar8;
  int *piVar9;
  long lVar10;
  size_t sVar11;
  undefined8 uVar12;
  byte bVar13;
  byte *pbVar14;
  uint uVar15;
  uint uVar16;
  byte *pbVar17;
  uint uVar18;
  byte *__nptr;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  int iVar22;
  char *pcVar23;
  uint uVar24;
  uint uVar25;
  undefined **ppuVar26;
  ulong uVar27;
  int local_78;
  uint local_74;
  byte *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  bVar13 = *param_1;
  if (bVar13 == 0) {
    uVar20 = 0xffffffff;
    local_74 = 0xffffffff;
    uVar18 = 0xffffffff;
    uVar21 = 0xffffffff;
    iVar8 = -1;
    uVar25 = 0xffffffff;
    uVar24 = 0xffffffff;
LAB_00931268:
    bVar5 = uVar18 != 0xffffffff;
    uVar19 = 0;
    if (bVar5) {
      uVar19 = uVar20;
    }
    uVar20 = 0;
    if (bVar5) {
      uVar20 = uVar18;
    }
    uVar18 = 0;
    if (bVar5) {
      uVar18 = local_74;
    }
    uVar12 = 0xffffffff;
    if (((((0x62e < (int)uVar21) && (uVar25 != 0xffffffff)) && (uVar24 != 0xffffffff)) &&
        ((uVar12 = 0xffffffff, (int)uVar20 < 0x3d && ((int)uVar18 < 0x3c)))) &&
       (((int)uVar19 < 0x18 && (((int)uVar25 < 0x20 && ((int)uVar24 < 0xc)))))) {
      iVar6 = uVar21 - ((int)uVar24 < 2);
      iVar22 = iVar6 + 3;
      if (-1 < iVar6) {
        iVar22 = iVar6;
      }
      iVar4 = (int)((ulong)((long)iVar6 * -0x51eb851f) >> 0x20);
      iVar1 = 0;
      if (iVar8 != -1) {
        iVar1 = iVar8;
      }
      lVar10 = ((((long)(int)uVar25 + (long)(int)(uVar21 - 0x7b2) * 0x16d +
                  (long)(((iVar4 >> 5) - (iVar4 >> 0x1f)) + (iVar22 >> 2) + iVar6 / 400 + -0x1dd) +
                 (long)*(int *)(&UNK_00747540 + (long)(int)uVar24 * 4)) * 0x18 + (long)(int)uVar19)
                * 0x3c + (long)(int)uVar18) * 0x3c + (long)(int)uVar20 + -0x15180;
      if ((iVar1 < 1) || (lVar10 <= 0x7fffffffffffffff - (long)iVar1)) {
        uVar12 = 0;
        *param_2 = lVar10 + iVar1;
      }
      else {
        uVar12 = 1;
        *param_2 = 0x7fffffffffffffff;
      }
    }
LAB_00931214:
    if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(uVar12);
    }
    return;
  }
  uVar19 = 0;
  local_78 = -1;
  uVar24 = 0xffffffff;
  uVar25 = 0xffffffff;
  iVar22 = -1;
  iVar8 = -1;
  uVar21 = 0xffffffff;
  uVar18 = 0xffffffff;
  uVar20 = 0xffffffff;
  bVar5 = false;
  local_74 = 0xffffffff;
  __nptr = param_1;
LAB_00930a40:
  if ((9 < (byte)(bVar13 - 0x30)) && (0x19 < (byte)((bVar13 & 0xdf) + 0xbf))) {
    while( true ) {
      __nptr = __nptr + 1;
      bVar13 = *__nptr;
      if ((byte)((bVar13 & 0xdf) + 0xbf) < 0x1a) break;
      if ((bVar13 == 0) || ((byte)(bVar13 - 0x30) < 10)) break;
    }
  }
  bVar13 = *__nptr;
  if (((bVar13 & 0xffffffdf) - 0x41 & 0xff) < 0x1a) {
    uVar27 = 0;
    do {
      if ((byte)(bVar13 + 0x9f) < 0x1a) {
        if (0xb < uVar27) goto LAB_00930af8;
      }
      else if (((bVar13 < 0x41) || (0xb < uVar27)) || (0x5a < bVar13)) goto LAB_00930af8;
      bVar13 = __nptr[uVar27 + 1];
      uVar27 = uVar27 + 1;
    } while( true );
  }
  uVar15 = bVar13 - 0x30;
  if (uVar15 < 10) {
    if (uVar18 == 0xffffffff) {
      pbVar17 = __nptr + 1;
      bVar13 = *pbVar17;
      if (bVar13 - 0x30 < 10) {
        uVar15 = ((uint)bVar13 + uVar15 * 10) - 0x30;
        if (0x17 < (int)uVar15) goto LAB_00930b50;
        pbVar17 = __nptr + 2;
        bVar13 = *pbVar17;
      }
      if ((bVar13 != 0x3a) || (uVar16 = pbVar17[1] - 0x30, 9 < uVar16)) goto LAB_00930b50;
      pbVar14 = pbVar17 + 2;
      bVar13 = *pbVar14;
      if (bVar13 - 0x30 < 10) {
        uVar16 = ((uint)bVar13 + uVar16 * 10) - 0x30;
        if (0x3b < (int)uVar16) goto LAB_00930b50;
        pbVar14 = pbVar17 + 3;
        bVar13 = *pbVar14;
      }
      if ((bVar13 == 0x3a) && (uVar7 = pbVar14[1] - 0x30, uVar7 < 10)) {
        pbVar17 = pbVar14 + 2;
        if (*pbVar17 - 0x30 < 10) {
          uVar7 = ((uint)*pbVar17 + uVar7 * 10) - 0x30;
          if (0x3c < (int)uVar7) goto LAB_00930b50;
          pbVar17 = pbVar14 + 3;
          uVar18 = uVar7;
        }
        else {
          uVar18 = uVar7;
        }
        local_70 = pbVar17;
      }
      else {
        uVar18 = 0;
        local_70 = pbVar14;
      }
LAB_00930fc0:
      __nptr = local_70;
      uVar20 = uVar15;
      local_74 = uVar16;
      goto LAB_009311f8;
    }
LAB_00930b50:
    piVar9 = (int *)__errno();
    iVar6 = *piVar9;
    *piVar9 = 0;
    lVar10 = strtol((char *)__nptr,(char **)&local_70,10);
    iVar1 = *piVar9;
    if (iVar1 != iVar6) {
      *piVar9 = iVar6;
    }
    if ((iVar1 == 0) && (lVar10 + 0x80000000U >> 0x20 == 0)) {
      uVar7 = FUN_00963a68();
      if (iVar8 == -1) {
        if ((param_1 < __nptr) && ((int)uVar7 < 0x579)) {
          if ((long)local_70 - (long)__nptr == 4) {
            bVar13 = __nptr[-1];
            if ((bVar13 == 0x2d) || (bVar13 == 0x2b)) {
              iVar22 = uVar7 + ((int)uVar7 / 100) * -0x28;
              iVar8 = iVar22 * -0x3c;
              if (bVar13 != 0x2b) {
                iVar8 = iVar22 * 0x3c;
              }
              bVar3 = true;
              iVar22 = iVar8;
              goto joined_r0x00930e88;
            }
            iVar22 = -1;
            iVar8 = -1;
          }
          goto joined_r0x00930f2c;
        }
        bVar3 = false;
      }
      else {
joined_r0x00930f2c:
        bVar3 = false;
      }
joined_r0x00930e88:
      uVar15 = uVar20;
      uVar16 = local_74;
      if (((uVar25 == 0xffffffff) && ((uVar24 & uVar21) == 0xffffffff)) &&
         ((long)local_70 - (long)__nptr == 8)) {
        uVar21 = (int)uVar7 / 10000;
        uVar24 = ((int)uVar7 % 10000) / 100 - 1;
        uVar25 = (int)uVar7 % 100;
      }
      else {
        if (((uVar25 == 0xffffffff) && (!bVar5)) && ((bool)(bVar3 ^ 1))) {
          bVar5 = uVar7 - 1 < 0x1f;
          uVar25 = uVar7;
          if (!bVar5) {
            uVar25 = 0xffffffff;
          }
          bVar3 = (bool)(bVar5 | bVar3);
          bVar5 = true;
        }
        if (((uVar21 != 0xffffffff) || (!bVar5)) || (bVar3)) {
          if (!bVar3) goto LAB_00931210;
        }
        else {
          uVar21 = uVar7;
          if ((int)uVar7 < 100) {
            if ((int)uVar7 < 0x47) {
              uVar21 = uVar7 + 2000;
            }
            else {
              uVar21 = uVar7 + 0x76c;
            }
          }
          bVar5 = uVar25 != 0xffffffff;
        }
      }
      goto LAB_00930fc0;
    }
    goto LAB_00931210;
  }
  goto LAB_009311f8;
LAB_00930af8:
  if (uVar27 == 0xc) {
LAB_00931210:
    uVar12 = 0xffffffff;
    goto LAB_00931214;
  }
  if (local_78 == -1) {
    ppuVar26 = &PTR_s_Monday_00c4f9c8;
    if ((3 < uVar27) || (ppuVar26 = &PTR_DAT_00c4f930, uVar27 == 3)) {
      pcVar23 = *ppuVar26;
      sVar11 = strlen(pcVar23);
      iVar8 = iVar22;
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 0;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[1];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 1;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[2];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 2;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[3];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 3;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[4];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 4;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[5];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 5;
        goto LAB_009311f4;
      }
      pcVar23 = ppuVar26[6];
      sVar11 = strlen(pcVar23);
      if ((sVar11 == uVar27) && (iVar6 = curl_strnequal(__nptr,pcVar23,uVar27), iVar6 != 0)) {
        local_78 = 6;
        goto LAB_009311f4;
      }
    }
    local_78 = -1;
  }
  if (uVar24 == 0xffffffff) {
    if (uVar27 == 3) {
      iVar6 = curl_strnequal(__nptr,&DAT_002cf121,3);
      if (iVar6 != 0) {
        uVar24 = 0;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002d725f,3);
      if (iVar6 != 0) {
        uVar24 = 1;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002ad1e1,3);
      if (iVar6 != 0) {
        uVar24 = 2;
        goto LAB_009311f4;
      }
      uVar24 = 3;
      iVar6 = curl_strnequal(__nptr,&DAT_002cced3,3);
      if (iVar6 != 0) goto LAB_009311f4;
      iVar6 = curl_strnequal(__nptr,&DAT_002ab5ad,3);
      if (iVar6 != 0) {
        uVar24 = 4;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002cf125,3);
      if (iVar6 != 0) {
        uVar24 = 5;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002b5406,3);
      if (iVar6 != 0) {
        uVar24 = 6;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_0029f61a,3);
      if (iVar6 != 0) {
        uVar24 = 7;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_0029d789,3);
      if (iVar6 != 0) {
        uVar24 = 8;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002a182d,3);
      if (iVar6 != 0) {
        uVar24 = 9;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002db2ea,3);
      if (iVar6 != 0) {
        uVar24 = 10;
        goto LAB_009311f4;
      }
      iVar6 = curl_strnequal(__nptr,&DAT_002d51c5,3);
      if (iVar6 != 0) {
        uVar24 = 0xb;
        goto LAB_009311f4;
      }
    }
    uVar24 = 0xffffffff;
  }
  uVar12 = 0xffffffff;
  if ((iVar8 != -1) || (4 < uVar27)) goto LAB_00931214;
  uVar15 = 0;
  pcVar23 = "GMT";
  while ((sVar11 = strlen(pcVar23), sVar11 != uVar27 ||
         (iVar8 = curl_strnequal(__nptr,pcVar23,uVar27), iVar8 == 0))) {
    uVar15 = uVar15 + 1;
    pcVar23 = pcVar23 + 0xc;
    if (0x44 < uVar15) goto LAB_00931210;
  }
  iVar22 = *(int *)(pcVar23 + 8) * 0x3c;
  iVar8 = iVar22;
LAB_009311f4:
  __nptr = __nptr + uVar27;
LAB_009311f8:
  uVar19 = uVar19 + 1;
  if ((5 < uVar19) || (bVar13 = *__nptr, bVar13 == 0)) goto LAB_00931268;
  goto LAB_00930a40;
}

