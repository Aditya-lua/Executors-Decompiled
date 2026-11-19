/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bdc36c
 */

long * FUN_00bdc36c(undefined8 param_1,long *param_2,long *param_3,long param_4,uint *param_5,
                   undefined8 *param_6)

{
  uint uVar1;
  long *plVar2;
  byte *pbVar3;
  bool bVar4;
  char cVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  char *pcVar9;
  uint *puVar10;
  ulong uVar11;
  uint *puVar12;
  uint *puVar13;
  uint *puVar14;
  byte *pbVar15;
  undefined1 (*pauVar16) [16];
  byte bVar17;
  uint *puVar18;
  ulong uVar19;
  ulong uVar20;
  undefined1 (*pauVar21) [16];
  bool bVar22;
  char *pcVar23;
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  uint local_154;
  uint *local_150;
  undefined1 local_148 [4];
  uint uStack_144;
  undefined8 uStack_140;
  undefined8 auStack_138 [18];
  char *local_a8;
  undefined8 local_a0;
  ulong local_98;
  char *local_90;
  basic_string_conflict local_88;
  undefined7 uStack_87;
  ulong local_80;
  byte *local_78;
  char local_6c [12];
  
  uVar1 = *(uint *)(param_4 + 8) & 0x4a;
  if (uVar1 == 0) {
    iVar7 = 0;
  }
  else if (uVar1 == 0x40) {
    iVar7 = 8;
  }
  else if (uVar1 == 8) {
    iVar7 = 0x10;
  }
  else {
    iVar7 = 10;
  }
  FUN_00c0bec0(&local_88,param_4,local_6c);
  local_a0 = 0;
  local_98 = 0;
  local_90 = (char *)0x0;
                    /* try { // try from 00bdc3f8 to 00bdc40b has its CatchHandler @ 00bdc948 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)&local_a0
         ,0x16,'\0');
  local_150 = (uint *)local_148;
  pcVar23 = (char *)((ulong)&local_a0 | 1);
  pcVar9 = local_90;
  if ((local_a0 & 1) == 0) {
    pcVar9 = (char *)((long)&local_a0 + 1);
  }
  local_154 = 0;
  local_a8 = pcVar9;
LAB_00bdc450:
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    plVar2 = param_2;
joined_r0x00bdc480:
    param_2 = plVar2;
    bVar22 = bVar4;
    if (param_3 != (long *)0x0) goto LAB_00bdc468;
LAB_00bdc484:
    if (bVar4 != false) goto LAB_00bdc618;
  }
  else {
    if (param_2[3] == param_2[4]) {
                    /* try { // try from 00bdc494 to 00bdc4bf has its CatchHandler @ 00bdc954 */
      iVar6 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar4 = iVar6 == -1;
      plVar2 = (long *)0x0;
      if (!bVar4) {
        plVar2 = param_2;
      }
      goto joined_r0x00bdc480;
    }
    bVar4 = false;
    bVar22 = false;
    if (param_3 == (long *)0x0) goto LAB_00bdc484;
LAB_00bdc468:
    if (param_3[3] == param_3[4]) {
      iVar6 = (**(code **)(*param_3 + 0x48))(param_3);
      plVar2 = (long *)0x0;
      if (iVar6 != -1) {
        plVar2 = param_3;
      }
      param_3 = plVar2;
      if (bVar22 == (iVar6 == -1)) goto LAB_00bdc618;
    }
    else if (bVar22 == false) goto LAB_00bdc618;
  }
  uVar20 = local_a0 >> 1 & 0x7f;
  if ((local_a0 & 1) != 0) {
    uVar20 = local_98;
  }
  if (local_a8 == pcVar9 + uVar20) {
    if ((long)uVar20 < 1) {
      uVar11 = uVar20 * 2;
      if ((local_a0 & 1) == 0) {
        local_a0 = CONCAT71(local_a0._1_7_,(char)((int)uVar11 << 1));
        pcVar9 = pcVar23;
      }
      else {
        pcVar9 = local_90;
        local_98 = uVar11;
      }
      pcVar9[uVar11] = '\0';
    }
    else {
                    /* try { // try from 00bdc500 to 00bdc56f has its CatchHandler @ 00bdc950 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_a0,uVar20,'\0');
    }
    uVar11 = 0x16;
    if ((local_a0 & 1) != 0) {
      uVar11 = (local_a0 & 0xfffffffffffffffe) - 1;
    }
    uVar19 = local_a0 >> 1 & 0x7f;
    if ((local_a0 & 1) != 0) {
      uVar19 = local_98;
    }
    if (uVar11 < uVar19 || uVar11 - uVar19 == 0) {
      if ((local_a0 & 1) == 0) {
        local_a0 = CONCAT71(local_a0._1_7_,(char)((int)uVar11 << 1));
        pcVar9 = pcVar23;
      }
      else {
        pcVar9 = local_90;
        local_98 = uVar11;
      }
      pcVar9[uVar11] = '\0';
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_a0,uVar11 - uVar19,'\0');
    }
    pcVar9 = pcVar23;
    if ((local_a0 & 1) != 0) {
      pcVar9 = local_90;
    }
    local_a8 = pcVar9 + uVar20;
  }
  if ((char *)param_2[3] == (char *)param_2[4]) {
                    /* try { // try from 00bdc5c8 to 00bdc613 has its CatchHandler @ 00bdc954 */
    cVar5 = (**(code **)(*param_2 + 0x48))(param_2);
  }
  else {
    cVar5 = *(char *)param_2[3];
  }
  iVar6 = std::__ndk1::__num_get<char>::__stage2_int_loop
                    (cVar5,iVar7,pcVar9,&local_a8,&local_154,local_6c[0],&local_88,(uint *)local_148
                     ,&local_150,"0123456789abcdefABCDEFxX+-pPiInN");
  if (iVar6 != 0) goto LAB_00bdc618;
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
  }
  else {
    param_2[3] = param_2[3] + 1;
  }
  goto LAB_00bdc450;
LAB_00bdc618:
  uVar20 = (ulong)((byte)local_88 >> 1);
  if (((byte)local_88 & 1) != 0) {
    uVar20 = local_80;
  }
  if ((uVar20 != 0) && ((long)local_150 - (long)local_148 < 0xa0)) {
    *local_150 = local_154;
    local_150 = local_150 + 1;
  }
                    /* try { // try from 00bdc658 to 00bdc8c3 has its CatchHandler @ 00bdc94c */
  uVar8 = FUN_00c0c4ac(pcVar9,local_a8,param_5,iVar7);
  uVar11 = (ulong)(byte)local_88;
  bVar17 = (byte)local_88 & 1;
  uVar20 = (ulong)((byte)local_88 >> 1);
  if (((byte)local_88 & 1) != 0) {
    uVar20 = local_80;
  }
  *param_6 = uVar8;
  if ((4 < (long)local_150 - (long)local_148) && (uVar20 != 0)) {
    puVar10 = local_150 + -1;
    if (((uint *)local_148 != local_150) && (local_148 < puVar10)) {
      puVar12 = (uint *)local_148;
      puVar18 = local_150 + -2;
      puVar13 = puVar18;
      if (puVar18 <= &uStack_144) {
        puVar13 = &uStack_144;
      }
      puVar13 = puVar13 + -1;
      puVar14 = puVar12;
      if (puVar13 != puVar12) {
        puVar14 = (uint *)(local_148 + 1);
      }
      uVar20 = (ulong)((long)puVar13 - (long)puVar14) >> 3;
      if (puVar13 != puVar12) {
        uVar20 = uVar20 + 1;
      }
      puVar13 = puVar10;
      if (uVar20 < 0x13) {
LAB_00bdc73c:
        do {
          puVar18 = puVar12 + 1;
          uVar1 = *puVar12;
          *puVar12 = *puVar13;
          puVar14 = puVar13 + -1;
          *puVar13 = uVar1;
          puVar13 = puVar14;
          puVar12 = puVar18;
        } while (puVar18 < puVar14);
      }
      else {
        if (puVar18 <= &uStack_144) {
          puVar18 = &uStack_144;
        }
        puVar18 = puVar18 + -1;
        puVar13 = puVar12;
        if (puVar18 != puVar12) {
          puVar13 = (uint *)(local_148 + 1);
        }
        uVar11 = (ulong)((long)puVar18 - (long)puVar13) >> 3;
        if (puVar18 != puVar12) {
          uVar11 = uVar11 + 1;
        }
        if ((puVar12 < local_150) &&
           (puVar13 = puVar10, local_150 + (-1 - uVar11) < &uStack_144 + uVar11)) goto LAB_00bdc73c;
        pauVar16 = (undefined1 (*) [16])(local_150 + -4);
        uVar19 = uVar20 + 1 & 0x7ffffffffffffff8;
        puVar12 = (uint *)(local_148 + uVar19 * 4);
        pauVar21 = (undefined1 (*) [16])auStack_138;
        uVar11 = uVar19;
        do {
          uVar11 = uVar11 - 8;
          auVar24 = NEON_rev64(*pauVar16,4);
          auVar25 = NEON_rev64(pauVar16[-1],4);
          auVar26 = NEON_rev64(pauVar21[-1],4);
          auVar27 = NEON_rev64(*pauVar21,4);
          auVar24 = NEON_ext(auVar24,auVar24,8,1);
          auVar25 = NEON_ext(auVar25,auVar25,8,1);
          auVar26 = NEON_ext(auVar26,auVar26,8,1);
          auVar27 = NEON_ext(auVar27,auVar27,8,1);
          *(long *)(pauVar21[-1] + 8) = auVar24._8_8_;
          *(long *)pauVar21[-1] = auVar24._0_8_;
          *(long *)(*pauVar21 + 8) = auVar25._8_8_;
          *(long *)*pauVar21 = auVar25._0_8_;
          pauVar21 = pauVar21 + 2;
          *(long *)((long)pauVar16[-1] + 8) = auVar27._8_8_;
          *(long *)pauVar16[-1] = auVar27._0_8_;
          *(long *)((long)*pauVar16 + 8) = auVar26._8_8_;
          *(long *)*pauVar16 = auVar26._0_8_;
          pauVar16 = pauVar16 + -2;
        } while (uVar11 != 0);
        puVar13 = puVar10 + -uVar19;
        if (uVar20 + 1 != uVar19) goto LAB_00bdc73c;
      }
      uVar11 = (ulong)(byte)local_88;
      bVar17 = (byte)local_88 & 1;
    }
    pbVar3 = local_78;
    if (bVar17 == 0) {
      pbVar3 = (byte *)&uStack_87;
    }
    pbVar15 = pbVar3;
    if (local_148 < puVar10) {
      uVar20 = uVar11 >> 1;
      if (bVar17 != 0) {
        uVar20 = local_80;
      }
      puVar12 = (uint *)local_148;
      do {
        bVar17 = *pbVar15;
        if (((bVar17 != 0) && (bVar17 != 0xff)) && (*puVar12 != (uint)bVar17)) goto LAB_00bdc7ec;
        puVar12 = puVar12 + 1;
        if (1 < (long)(pbVar3 + (uVar20 - (long)pbVar15))) {
          pbVar15 = pbVar15 + 1;
        }
      } while (puVar12 < puVar10);
    }
    bVar17 = *pbVar15;
    if (((bVar17 != 0) && (bVar17 != 0xff)) && ((uint)bVar17 <= *puVar10 - 1)) {
LAB_00bdc7ec:
      *param_5 = 4;
    }
  }
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    plVar2 = param_2;
joined_r0x00bdc884:
    param_2 = plVar2;
    if (param_3 != (long *)0x0) goto LAB_00bdc80c;
LAB_00bdc888:
    if (bVar4 == false) goto LAB_00bdc828;
  }
  else {
    if (param_2[3] == param_2[4]) {
      iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar4 = iVar7 == -1;
      plVar2 = (long *)0x0;
      if (!bVar4) {
        plVar2 = param_2;
      }
      goto joined_r0x00bdc884;
    }
    bVar4 = false;
    if (param_3 == (long *)0x0) goto LAB_00bdc888;
LAB_00bdc80c:
    if (param_3[3] == param_3[4]) {
      iVar7 = (**(code **)(*param_3 + 0x48))(param_3);
      if (bVar4 != (iVar7 == -1)) goto LAB_00bdc828;
    }
    else if (bVar4) goto LAB_00bdc828;
  }
  *param_5 = *param_5 | 2;
LAB_00bdc828:
  if ((local_a0 & 1) != 0) {
    operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
  }
  if (((byte)local_88 & 1) != 0) {
    operator_delete(local_78,CONCAT71(uStack_87,local_88) & 0xfffffffffffffffe);
  }
  return param_2;
}

