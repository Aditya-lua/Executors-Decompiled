/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be0508
 */

long * FUN_00be0508(undefined8 param_1,long *param_2,long *param_3,long param_4,uint *param_5,
                   undefined4 *param_6)

{
  uint uVar1;
  long *plVar2;
  byte *pbVar3;
  bool bVar4;
  wchar_t wVar5;
  int iVar6;
  undefined4 uVar7;
  int iVar8;
  wchar_t *pwVar9;
  char *pcVar10;
  uint *puVar11;
  ulong uVar12;
  uint *puVar13;
  uint *puVar14;
  uint *puVar15;
  byte *pbVar16;
  undefined1 (*pauVar17) [16];
  byte bVar18;
  uint *puVar19;
  ulong uVar20;
  ulong uVar21;
  undefined1 (*pauVar22) [16];
  char *pcVar23;
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  uint local_1bc;
  uint *local_1b8;
  undefined1 local_1b0 [4];
  uint uStack_1ac;
  undefined8 uStack_1a8;
  undefined8 auStack_1a0 [18];
  char *local_110;
  undefined8 local_108;
  ulong local_100;
  char *local_f8;
  basic_string_conflict local_f0;
  undefined7 uStack_ef;
  ulong local_e8;
  byte *local_e0;
  undefined1 auStack_d4 [104];
  wchar_t local_6c [3];
  
  uVar1 = *(uint *)(param_4 + 8) & 0x4a;
  if (uVar1 == 0) {
    iVar8 = 0;
  }
  else if (uVar1 == 0x40) {
    iVar8 = 8;
  }
  else if (uVar1 == 8) {
    iVar8 = 0x10;
  }
  else {
    iVar8 = 10;
  }
  pwVar9 = (wchar_t *)FUN_00c0cb44(param_1,param_4,auStack_d4);
  FUN_00c0cc28(&local_f0,param_4,local_6c);
  local_108 = 0;
  local_100 = 0;
  local_f8 = (char *)0x0;
                    /* try { // try from 00be05a4 to 00be05b7 has its CatchHandler @ 00be0ae0 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         &local_108,0x16,'\0');
  local_1b8 = (uint *)local_1b0;
  pcVar23 = (char *)((ulong)&local_108 | 1);
  local_1bc = 0;
  pcVar10 = local_f8;
  if ((local_108 & 1) == 0) {
    pcVar10 = (char *)((long)&local_108 + 1);
  }
  local_110 = pcVar10;
LAB_00be05f0:
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    if (param_3 != (long *)0x0) goto LAB_00be0638;
LAB_00be0610:
    if (bVar4 != false) goto LAB_00be07b4;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
                    /* try { // try from 00be0620 to 00be065b has its CatchHandler @ 00be0aec */
      iVar6 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar6 = *(int *)param_2[3];
    }
    bVar4 = iVar6 == -1;
    plVar2 = (long *)0x0;
    if (!bVar4) {
      plVar2 = param_2;
    }
    param_2 = plVar2;
    if (param_3 == (long *)0x0) goto LAB_00be0610;
LAB_00be0638:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar6 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar6 = *(int *)param_3[3];
    }
    plVar2 = (long *)0x0;
    if (iVar6 != -1) {
      plVar2 = param_3;
    }
    param_3 = plVar2;
    if (bVar4 == (iVar6 == -1)) goto LAB_00be07b4;
  }
  uVar21 = local_108 >> 1 & 0x7f;
  if ((local_108 & 1) != 0) {
    uVar21 = local_100;
  }
  if (local_110 == pcVar10 + uVar21) {
    if ((long)uVar21 < 1) {
      uVar12 = uVar21 * 2;
      if ((local_108 & 1) == 0) {
        local_108 = CONCAT71(local_108._1_7_,(char)((int)uVar12 << 1));
        pcVar10 = pcVar23;
      }
      else {
        pcVar10 = local_f8;
        local_100 = uVar12;
      }
      pcVar10[uVar12] = '\0';
    }
    else {
                    /* try { // try from 00be069c to 00be070b has its CatchHandler @ 00be0ae8 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_108,uVar21,'\0');
    }
    uVar12 = 0x16;
    if ((local_108 & 1) != 0) {
      uVar12 = (local_108 & 0xfffffffffffffffe) - 1;
    }
    uVar20 = local_108 >> 1 & 0x7f;
    if ((local_108 & 1) != 0) {
      uVar20 = local_100;
    }
    if (uVar12 < uVar20 || uVar12 - uVar20 == 0) {
      if ((local_108 & 1) == 0) {
        local_108 = CONCAT71(local_108._1_7_,(char)((int)uVar12 << 1));
        pcVar10 = pcVar23;
      }
      else {
        pcVar10 = local_f8;
        local_100 = uVar12;
      }
      pcVar10[uVar12] = '\0';
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_108,uVar12 - uVar20,'\0');
    }
    pcVar10 = pcVar23;
    if ((local_108 & 1) != 0) {
      pcVar10 = local_f8;
    }
    local_110 = pcVar10 + uVar21;
  }
  if ((wchar_t *)param_2[3] == (wchar_t *)param_2[4]) {
                    /* try { // try from 00be0764 to 00be07af has its CatchHandler @ 00be0aec */
    wVar5 = (**(code **)(*param_2 + 0x48))(param_2);
  }
  else {
    wVar5 = *(wchar_t *)param_2[3];
  }
  iVar6 = std::__ndk1::__num_get<wchar_t>::__stage2_int_loop
                    (wVar5,iVar8,pcVar10,&local_110,&local_1bc,local_6c[0],&local_f0,
                     (uint *)local_1b0,&local_1b8,pwVar9);
  if (iVar6 != 0) goto LAB_00be07b4;
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
  }
  else {
    param_2[3] = param_2[3] + 4;
  }
  goto LAB_00be05f0;
LAB_00be07b4:
  uVar21 = (ulong)((byte)local_f0 >> 1);
  if (((byte)local_f0 & 1) != 0) {
    uVar21 = local_e8;
  }
  if ((uVar21 != 0) && ((long)local_1b8 - (long)local_1b0 < 0xa0)) {
    *local_1b8 = local_1bc;
    local_1b8 = local_1b8 + 1;
  }
                    /* try { // try from 00be07f4 to 00be09fb has its CatchHandler @ 00be0ae4 */
  uVar7 = FUN_00c0c354(pcVar10,local_110,param_5,iVar8);
  uVar12 = (ulong)(byte)local_f0;
  bVar18 = (byte)local_f0 & 1;
  uVar21 = (ulong)((byte)local_f0 >> 1);
  if (((byte)local_f0 & 1) != 0) {
    uVar21 = local_e8;
  }
  *param_6 = uVar7;
  if ((4 < (long)local_1b8 - (long)local_1b0) && (uVar21 != 0)) {
    puVar11 = local_1b8 + -1;
    if (((uint *)local_1b0 != local_1b8) && (local_1b0 < puVar11)) {
      puVar13 = (uint *)local_1b0;
      puVar19 = local_1b8 + -2;
      puVar14 = puVar19;
      if (puVar19 <= &uStack_1ac) {
        puVar14 = &uStack_1ac;
      }
      puVar14 = puVar14 + -1;
      puVar15 = puVar13;
      if (puVar14 != puVar13) {
        puVar15 = (uint *)(local_1b0 + 1);
      }
      uVar21 = (ulong)((long)puVar14 - (long)puVar15) >> 3;
      if (puVar14 != puVar13) {
        uVar21 = uVar21 + 1;
      }
      puVar14 = puVar11;
      if (uVar21 < 0x13) {
LAB_00be08d8:
        do {
          puVar19 = puVar13 + 1;
          uVar1 = *puVar13;
          *puVar13 = *puVar14;
          puVar15 = puVar14 + -1;
          *puVar14 = uVar1;
          puVar14 = puVar15;
          puVar13 = puVar19;
        } while (puVar19 < puVar15);
      }
      else {
        if (puVar19 <= &uStack_1ac) {
          puVar19 = &uStack_1ac;
        }
        puVar19 = puVar19 + -1;
        puVar14 = puVar13;
        if (puVar19 != puVar13) {
          puVar14 = (uint *)(local_1b0 + 1);
        }
        uVar12 = (ulong)((long)puVar19 - (long)puVar14) >> 3;
        if (puVar19 != puVar13) {
          uVar12 = uVar12 + 1;
        }
        if ((puVar13 < local_1b8) &&
           (puVar14 = puVar11, local_1b8 + (-1 - uVar12) < &uStack_1ac + uVar12)) goto LAB_00be08d8;
        pauVar17 = (undefined1 (*) [16])(local_1b8 + -4);
        uVar20 = uVar21 + 1 & 0x7ffffffffffffff8;
        puVar13 = (uint *)(local_1b0 + uVar20 * 4);
        pauVar22 = (undefined1 (*) [16])auStack_1a0;
        uVar12 = uVar20;
        do {
          uVar12 = uVar12 - 8;
          auVar24 = NEON_rev64(*pauVar17,4);
          auVar25 = NEON_rev64(pauVar17[-1],4);
          auVar26 = NEON_rev64(pauVar22[-1],4);
          auVar27 = NEON_rev64(*pauVar22,4);
          auVar24 = NEON_ext(auVar24,auVar24,8,1);
          auVar25 = NEON_ext(auVar25,auVar25,8,1);
          auVar26 = NEON_ext(auVar26,auVar26,8,1);
          auVar27 = NEON_ext(auVar27,auVar27,8,1);
          *(long *)(pauVar22[-1] + 8) = auVar24._8_8_;
          *(long *)pauVar22[-1] = auVar24._0_8_;
          *(long *)(*pauVar22 + 8) = auVar25._8_8_;
          *(long *)*pauVar22 = auVar25._0_8_;
          pauVar22 = pauVar22 + 2;
          *(long *)((long)pauVar17[-1] + 8) = auVar27._8_8_;
          *(long *)pauVar17[-1] = auVar27._0_8_;
          *(long *)((long)*pauVar17 + 8) = auVar26._8_8_;
          *(long *)*pauVar17 = auVar26._0_8_;
          pauVar17 = pauVar17 + -2;
        } while (uVar12 != 0);
        puVar14 = puVar11 + -uVar20;
        if (uVar21 + 1 != uVar20) goto LAB_00be08d8;
      }
      uVar12 = (ulong)(byte)local_f0;
      bVar18 = (byte)local_f0 & 1;
    }
    pbVar3 = local_e0;
    if (bVar18 == 0) {
      pbVar3 = (byte *)&uStack_ef;
    }
    pbVar16 = pbVar3;
    if (local_1b0 < puVar11) {
      uVar21 = uVar12 >> 1;
      if (bVar18 != 0) {
        uVar21 = local_e8;
      }
      puVar13 = (uint *)local_1b0;
      do {
        bVar18 = *pbVar16;
        if (((bVar18 != 0) && (bVar18 != 0xff)) && (*puVar13 != (uint)bVar18)) goto LAB_00be0988;
        puVar13 = puVar13 + 1;
        if (1 < (long)(pbVar3 + (uVar21 - (long)pbVar16))) {
          pbVar16 = pbVar16 + 1;
        }
      } while (puVar13 < puVar11);
    }
    bVar18 = *pbVar16;
    if (((bVar18 != 0) && (bVar18 != 0xff)) && ((uint)bVar18 <= *puVar11 - 1)) {
LAB_00be0988:
      *param_5 = 4;
    }
  }
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    if (param_3 != (long *)0x0) goto LAB_00be09d8;
LAB_00be09b0:
    if (!bVar4) goto LAB_00be0a18;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar8 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar8 = *(int *)param_2[3];
    }
    bVar4 = iVar8 == -1;
    plVar2 = (long *)0x0;
    if (!bVar4) {
      plVar2 = param_2;
    }
    param_2 = plVar2;
    if (param_3 == (long *)0x0) goto LAB_00be09b0;
LAB_00be09d8:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar8 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar8 = *(int *)param_3[3];
    }
    if (bVar4 != (iVar8 == -1)) goto LAB_00be0a18;
  }
  *param_5 = *param_5 | 2;
LAB_00be0a18:
  if ((local_108 & 1) != 0) {
    operator_delete(local_f8,local_108 & 0xfffffffffffffffe);
  }
  if (((byte)local_f0 & 1) != 0) {
    operator_delete(local_e0,CONCAT71(uStack_ef,local_f0) & 0xfffffffffffffffe);
  }
  return param_2;
}

