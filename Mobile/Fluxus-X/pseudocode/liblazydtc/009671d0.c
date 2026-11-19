/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009671d0
 */

int FUN_009671d0(undefined8 param_1,char *param_2,undefined8 param_3,uint *param_4,
                undefined8 param_5)

{
  uint uVar1;
  uint uVar2;
  ulong __n;
  uint uVar3;
  char cVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  bool bVar9;
  int iVar10;
  uint uVar11;
  char *pcVar12;
  size_t sVar13;
  ulong __n_00;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  char *pcVar17;
  char *pcVar18;
  undefined1 *puVar19;
  ulong uVar20;
  uint uVar21;
  ulong __n_01;
  uint uVar22;
  ulong __n_02;
  undefined8 *__src;
  long lVar23;
  long lVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 *local_8d0;
  uint local_8c8;
  undefined1 auStack_8c4 [24];
  undefined1 auStack_8ac [8];
  char acStack_8a4 [1028];
  undefined8 local_4a0;
  undefined8 local_498;
  undefined8 local_490;
  undefined8 local_488;
  undefined8 uStack_480;
  undefined8 local_478;
  char acStack_470 [8];
  undefined8 auStack_468 [3];
  undefined1 auStack_450 [992];
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  local_8c8 = 0x18;
  local_8d0 = (undefined8 *)0x0;
  uVar3 = *param_4;
  memset(acStack_8a4,0,0x401);
  local_478 = 0;
  uStack_480 = 0;
  local_488 = 0;
  local_490 = 0;
  local_498 = 0;
  local_4a0 = 0;
  pcVar12 = strchr(param_2,0x5c);
  if (pcVar12 == (char *)0x0) {
    pcVar12 = strchr(param_2,0x2f);
  }
  bVar9 = pcVar12 != (char *)0x0;
  pcVar18 = param_2;
  if (bVar9) {
    pcVar18 = pcVar12 + 1;
  }
  pcVar17 = "";
  if (bVar9) {
    pcVar17 = param_2;
  }
  lVar24 = 0;
  if (bVar9) {
    lVar24 = (long)pcVar12 - (long)param_2;
  }
  sVar13 = strlen(pcVar18);
  curl_msnprintf(acStack_8a4,0x401,&DAT_002b6c62,"WORKSTATION");
  if ((*(byte *)((long)param_4 + 2) >> 3 & 1) == 0) {
    iVar10 = FUN_0095990c(param_3,acStack_470);
    if (iVar10 != 0) goto LAB_009677e4;
    FUN_00959520(acStack_470,param_4 + 1,&local_4a0);
    iVar10 = FUN_0095973c(param_3,auStack_8c4);
    if (iVar10 != 0) goto LAB_009677e4;
    FUN_00959520(auStack_8c4,param_4 + 1,&local_488);
    uVar11 = *param_4 & 0xfff7ffff;
    *param_4 = uVar11;
    __src = &local_4a0;
  }
  else {
    iVar10 = FUN_00932378(param_1,auStack_8ac,8);
    if (iVar10 != 0) goto LAB_009677e4;
    iVar10 = FUN_0095990c(param_3,acStack_470);
    if (iVar10 != 0) goto LAB_009677e4;
    iVar10 = FUN_00959a84(pcVar18,sVar13,pcVar17,lVar24,acStack_470,auStack_8c4);
    if (iVar10 != 0) goto LAB_009677e4;
    iVar10 = FUN_00959e24(auStack_8c4,auStack_8ac,param_4 + 1,&local_488);
    if (iVar10 != 0) goto LAB_009677e4;
    iVar10 = FUN_00959c64(auStack_8c4,auStack_8ac,param_4,&local_8d0,&local_8c8);
    if (iVar10 != 0) goto LAB_009677e4;
    uVar11 = *param_4;
    __src = local_8d0;
  }
  uVar3 = uVar3 & 1;
  __n_02 = lVar24 << uVar3;
  __n_01 = sVar13 << uVar3;
  uVar1 = local_8c8 + 0x58;
  uVar22 = (uint)__n_02;
  uVar2 = uVar22 + uVar1;
  uVar21 = (uint)__n_01;
  __n = 0x16;
  if (uVar3 == 0) {
    __n = 0xb;
  }
  uVar5 = local_8c8 >> 8 & 0xff;
  uVar6 = uVar22 >> 8 & 0xff;
  uVar7 = uVar21 >> 8 & 0xff;
  uVar11 = curl_msnprintf(acStack_470,0x400,&DAT_002a75e1,0,0,0,0,0x18,0,0x18,0,0x40,0,0,0,
                          local_8c8 & 0xff,uVar5,local_8c8 & 0xff,uVar5,0x58,0,0,0,uVar22 & 0xff,
                          uVar6,uVar22 & 0xff,uVar6,uVar1 & 0xff,uVar1 >> 8 & 0xff,0,0,uVar21 & 0xff
                          ,uVar7,uVar21 & 0xff,uVar7,uVar2 & 0xff,uVar2 >> 8 & 0xff,0,0,(int)__n,0,
                          (int)__n,0,uVar2 + uVar21 & 0xff,uVar2 + uVar21 >> 8 & 0xff,0,0,0,0,0,0,0,
                          0,0,0,uVar11 & 0xff,uVar11 >> 8 & 0xff,uVar11 >> 0x10 & 0xff,
                          uVar11 >> 0x18);
  lVar23 = (long)(int)uVar11;
  lVar24 = lVar23;
  if (uVar11 < 1000) {
    lVar24 = lVar23 + 0x18;
    *(undefined8 *)((long)auStack_468 + lVar23 + 8) = local_478;
    *(undefined8 *)((long)auStack_468 + lVar23) = uStack_480;
    *(undefined8 *)(acStack_470 + lVar23) = local_488;
  }
  __n_00 = (ulong)local_8c8;
  uVar14 = lVar24 + __n_00;
  if (uVar14 < 0x401) {
    memcpy(acStack_470 + lVar24,__src,__n_00);
    (*(code *)PTR_free_00cc4678)(local_8d0);
    lVar23 = uVar14 + __n_02;
    if (lVar23 + __n + __n_01 < 0x400) {
      if (uVar3 == 0) {
        memcpy(acStack_470 + uVar14,pcVar17,__n_02);
        memcpy(acStack_470 + lVar23,pcVar18,__n_01);
        memcpy(acStack_470 + lVar23 + __n_01,acStack_8a4,__n);
      }
      else {
        uVar14 = __n_02 >> 1;
        if (uVar14 != 0) {
          uVar16 = 0;
          if (0x3f < __n_02) {
            uVar16 = uVar14 & 0x7fffffffffffffe0;
            pcVar12 = pcVar17 + 0x10;
            puVar19 = auStack_450 + lVar24 + __n_00;
            uVar20 = uVar16;
            do {
              uVar26 = *(undefined8 *)(pcVar12 + -8);
              uVar25 = *(undefined8 *)(pcVar12 + -0x10);
              uVar28 = *(undefined8 *)(pcVar12 + 8);
              uVar27 = *(undefined8 *)pcVar12;
              uVar20 = uVar20 - 0x20;
              pcVar12 = pcVar12 + 0x20;
              puVar19[-0x20] = (char)uVar25;
              puVar19[-0x1f] = 0;
              puVar19[-0x1e] = (char)((ulong)uVar25 >> 8);
              puVar19[-0x1d] = 0;
              puVar19[-0x1c] = (char)((ulong)uVar25 >> 0x10);
              puVar19[-0x1b] = 0;
              puVar19[-0x1a] = (char)((ulong)uVar25 >> 0x18);
              puVar19[-0x19] = 0;
              puVar19[-0x18] = (char)((ulong)uVar25 >> 0x20);
              puVar19[-0x17] = 0;
              puVar19[-0x16] = (char)((ulong)uVar25 >> 0x28);
              puVar19[-0x15] = 0;
              puVar19[-0x14] = (char)((ulong)uVar25 >> 0x30);
              puVar19[-0x13] = 0;
              puVar19[-0x12] = (char)((ulong)uVar25 >> 0x38);
              puVar19[-0x11] = 0;
              puVar19[-0x10] = (char)uVar26;
              puVar19[-0xf] = 0;
              puVar19[-0xe] = (char)((ulong)uVar26 >> 8);
              puVar19[-0xd] = 0;
              puVar19[-0xc] = (char)((ulong)uVar26 >> 0x10);
              puVar19[-0xb] = 0;
              puVar19[-10] = (char)((ulong)uVar26 >> 0x18);
              puVar19[-9] = 0;
              puVar19[-8] = (char)((ulong)uVar26 >> 0x20);
              puVar19[-7] = 0;
              puVar19[-6] = (char)((ulong)uVar26 >> 0x28);
              puVar19[-5] = 0;
              puVar19[-4] = (char)((ulong)uVar26 >> 0x30);
              puVar19[-3] = 0;
              puVar19[-2] = (char)((ulong)uVar26 >> 0x38);
              puVar19[-1] = 0;
              *puVar19 = (char)uVar27;
              puVar19[1] = 0;
              puVar19[2] = (char)((ulong)uVar27 >> 8);
              puVar19[3] = 0;
              puVar19[4] = (char)((ulong)uVar27 >> 0x10);
              puVar19[5] = 0;
              puVar19[6] = (char)((ulong)uVar27 >> 0x18);
              puVar19[7] = 0;
              puVar19[8] = (char)((ulong)uVar27 >> 0x20);
              puVar19[9] = 0;
              puVar19[10] = (char)((ulong)uVar27 >> 0x28);
              puVar19[0xb] = 0;
              puVar19[0xc] = (char)((ulong)uVar27 >> 0x30);
              puVar19[0xd] = 0;
              puVar19[0xe] = (char)((ulong)uVar27 >> 0x38);
              puVar19[0xf] = 0;
              puVar19[0x10] = (char)uVar28;
              puVar19[0x11] = 0;
              puVar19[0x12] = (char)((ulong)uVar28 >> 8);
              puVar19[0x13] = 0;
              puVar19[0x14] = (char)((ulong)uVar28 >> 0x10);
              puVar19[0x15] = 0;
              puVar19[0x16] = (char)((ulong)uVar28 >> 0x18);
              puVar19[0x17] = 0;
              puVar19[0x18] = (char)((ulong)uVar28 >> 0x20);
              puVar19[0x19] = 0;
              puVar19[0x1a] = (char)((ulong)uVar28 >> 0x28);
              puVar19[0x1b] = 0;
              puVar19[0x1c] = (char)((ulong)uVar28 >> 0x30);
              puVar19[0x1d] = 0;
              puVar19[0x1e] = (char)((ulong)uVar28 >> 0x38);
              puVar19[0x1f] = 0;
              puVar19 = puVar19 + 0x40;
            } while (uVar20 != 0);
            if (uVar14 == uVar16) goto LAB_00967664;
          }
          lVar15 = uVar14 - uVar16;
          pcVar12 = acStack_470 + lVar24 + uVar16 * 2 + __n_00 + 1;
          pcVar17 = pcVar17 + uVar16;
          do {
            cVar4 = *pcVar17;
            *pcVar12 = '\0';
            lVar15 = lVar15 + -1;
            pcVar12[-1] = cVar4;
            pcVar12 = pcVar12 + 2;
            pcVar17 = pcVar17 + 1;
          } while (lVar15 != 0);
        }
LAB_00967664:
        uVar14 = __n_01 >> 1;
        if (uVar14 != 0) {
          uVar16 = 0;
          if (0x3f < __n_01) {
            if ((pcVar18 + uVar14 <= acStack_470 + lVar23) ||
               (uVar16 = 0,
               acStack_470 + lVar24 + __n_02 + (__n_01 & 0xfffffffffffffffe) + __n_00 <= pcVar18)) {
              uVar16 = uVar14 & 0x7fffffffffffffe0;
              pcVar12 = pcVar18 + 0x10;
              puVar19 = auStack_450 + lVar24 + __n_02 + __n_00;
              uVar20 = uVar16;
              do {
                uVar26 = *(undefined8 *)(pcVar12 + -8);
                uVar25 = *(undefined8 *)(pcVar12 + -0x10);
                uVar28 = *(undefined8 *)(pcVar12 + 8);
                uVar27 = *(undefined8 *)pcVar12;
                uVar20 = uVar20 - 0x20;
                pcVar12 = pcVar12 + 0x20;
                puVar19[-0x20] = (char)uVar25;
                puVar19[-0x1f] = 0;
                puVar19[-0x1e] = (char)((ulong)uVar25 >> 8);
                puVar19[-0x1d] = 0;
                puVar19[-0x1c] = (char)((ulong)uVar25 >> 0x10);
                puVar19[-0x1b] = 0;
                puVar19[-0x1a] = (char)((ulong)uVar25 >> 0x18);
                puVar19[-0x19] = 0;
                puVar19[-0x18] = (char)((ulong)uVar25 >> 0x20);
                puVar19[-0x17] = 0;
                puVar19[-0x16] = (char)((ulong)uVar25 >> 0x28);
                puVar19[-0x15] = 0;
                puVar19[-0x14] = (char)((ulong)uVar25 >> 0x30);
                puVar19[-0x13] = 0;
                puVar19[-0x12] = (char)((ulong)uVar25 >> 0x38);
                puVar19[-0x11] = 0;
                puVar19[-0x10] = (char)uVar26;
                puVar19[-0xf] = 0;
                puVar19[-0xe] = (char)((ulong)uVar26 >> 8);
                puVar19[-0xd] = 0;
                puVar19[-0xc] = (char)((ulong)uVar26 >> 0x10);
                puVar19[-0xb] = 0;
                puVar19[-10] = (char)((ulong)uVar26 >> 0x18);
                puVar19[-9] = 0;
                puVar19[-8] = (char)((ulong)uVar26 >> 0x20);
                puVar19[-7] = 0;
                puVar19[-6] = (char)((ulong)uVar26 >> 0x28);
                puVar19[-5] = 0;
                puVar19[-4] = (char)((ulong)uVar26 >> 0x30);
                puVar19[-3] = 0;
                puVar19[-2] = (char)((ulong)uVar26 >> 0x38);
                puVar19[-1] = 0;
                *puVar19 = (char)uVar27;
                puVar19[1] = 0;
                puVar19[2] = (char)((ulong)uVar27 >> 8);
                puVar19[3] = 0;
                puVar19[4] = (char)((ulong)uVar27 >> 0x10);
                puVar19[5] = 0;
                puVar19[6] = (char)((ulong)uVar27 >> 0x18);
                puVar19[7] = 0;
                puVar19[8] = (char)((ulong)uVar27 >> 0x20);
                puVar19[9] = 0;
                puVar19[10] = (char)((ulong)uVar27 >> 0x28);
                puVar19[0xb] = 0;
                puVar19[0xc] = (char)((ulong)uVar27 >> 0x30);
                puVar19[0xd] = 0;
                puVar19[0xe] = (char)((ulong)uVar27 >> 0x38);
                puVar19[0xf] = 0;
                puVar19[0x10] = (char)uVar28;
                puVar19[0x11] = 0;
                puVar19[0x12] = (char)((ulong)uVar28 >> 8);
                puVar19[0x13] = 0;
                puVar19[0x14] = (char)((ulong)uVar28 >> 0x10);
                puVar19[0x15] = 0;
                puVar19[0x16] = (char)((ulong)uVar28 >> 0x18);
                puVar19[0x17] = 0;
                puVar19[0x18] = (char)((ulong)uVar28 >> 0x20);
                puVar19[0x19] = 0;
                puVar19[0x1a] = (char)((ulong)uVar28 >> 0x28);
                puVar19[0x1b] = 0;
                puVar19[0x1c] = (char)((ulong)uVar28 >> 0x30);
                puVar19[0x1d] = 0;
                puVar19[0x1e] = (char)((ulong)uVar28 >> 0x38);
                puVar19[0x1f] = 0;
                puVar19 = puVar19 + 0x40;
              } while (uVar20 != 0);
              if (uVar14 == uVar16) goto LAB_0096772c;
            }
          }
          lVar15 = uVar14 - uVar16;
          pcVar12 = acStack_470 + lVar24 + __n_02 + uVar16 * 2 + __n_00 + 1;
          pcVar18 = pcVar18 + uVar16;
          do {
            cVar4 = *pcVar18;
            *pcVar12 = '\0';
            lVar15 = lVar15 + -1;
            pcVar12[-1] = cVar4;
            pcVar12 = pcVar12 + 2;
            pcVar18 = pcVar18 + 1;
          } while (lVar15 != 0);
        }
LAB_0096772c:
        uVar14 = __n >> 1;
        pcVar12 = acStack_470 + lVar24 + __n_02 + __n_01 + __n_00 + 1;
        pcVar18 = acStack_8a4;
        do {
          cVar4 = *pcVar18;
          *pcVar12 = '\0';
          uVar14 = uVar14 - 1;
          pcVar12[-1] = cVar4;
          pcVar12 = pcVar12 + 2;
          pcVar18 = pcVar18 + 1;
        } while (uVar14 != 0);
      }
      iVar10 = FUN_009252b8(param_5,acStack_470,lVar23 + __n_01 + __n);
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_4 + 4));
      param_4[4] = 0;
      param_4[5] = 0;
      param_4[3] = 0;
      goto LAB_009677e4;
    }
    pcVar12 = "user + domain + hostname too big";
  }
  else {
    pcVar12 = "incoming NTLM message too big";
  }
  FUN_00904b80(param_1,pcVar12);
  iVar10 = 0x1b;
LAB_009677e4:
  if (*(long *)(lVar8 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar10;
}

