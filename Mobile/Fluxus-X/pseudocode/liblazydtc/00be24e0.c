/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be24e0
 */

long * FUN_00be24e0(undefined8 param_1,long *param_2,long *param_3,__num_get<wchar_t> *param_4,
                   wchar_t *param_5,undefined8 *param_6)

{
  long *plVar1;
  bool bVar2;
  bool bVar3;
  wchar_t wVar4;
  int iVar5;
  uint uVar6;
  byte *pbVar7;
  uint *puVar8;
  ulong uVar9;
  uint *puVar10;
  uint *puVar11;
  uint *puVar12;
  undefined1 (*pauVar13) [16];
  byte bVar14;
  uint *puVar15;
  ulong uVar16;
  ulong uVar17;
  undefined1 (*pauVar18) [16];
  byte *pbVar19;
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  char acStack_1cc [4];
  bool abStack_1c8 [4];
  uint local_1c4;
  uint *local_1c0;
  undefined1 local_1b8 [4];
  uint uStack_1b4;
  undefined8 uStack_1b0;
  undefined8 auStack_1a8 [18];
  byte *local_118;
  undefined8 local_110;
  ulong local_108;
  byte *local_100;
  basic_string_conflict local_f8;
  undefined7 uStack_f7;
  ulong local_f0;
  byte *local_e8;
  wchar_t local_e0;
  wchar_t wStack_dc;
  ios_base aiStack_d8 [120];
  
  std::__ndk1::__num_get<wchar_t>::__stage2_float_prep
            (param_4,aiStack_d8,&wStack_dc,&local_e0,param_5);
  local_110 = 0;
  local_108 = 0;
  local_100 = (byte *)0x0;
                    /* try { // try from 00be2534 to 00be2547 has its CatchHandler @ 00be2b18 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         &local_110,0x16,'\0');
  bVar3 = false;
  pbVar19 = (byte *)((ulong)&local_110 | 1);
  pbVar7 = local_100;
  if ((local_110 & 1) == 0) {
    pbVar7 = (byte *)((long)&local_110 + 1);
  }
  local_1c4 = 0;
  abStack_1c8[0] = true;
  acStack_1cc[0] = 'E';
  local_1c0 = (uint *)local_1b8;
  local_118 = pbVar7;
LAB_00be2594:
  if (param_2 == (long *)0x0) {
    bVar2 = true;
    if (param_3 != (long *)0x0) goto LAB_00be25dc;
LAB_00be25b4:
    if (bVar2 != false) goto LAB_00be27e4;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
                    /* try { // try from 00be25c4 to 00be25ff has its CatchHandler @ 00be2b24 */
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar5 = *(int *)param_2[3];
    }
    bVar2 = iVar5 == -1;
    plVar1 = (long *)0x0;
    if (!bVar2) {
      plVar1 = param_2;
    }
    param_2 = plVar1;
    if (param_3 == (long *)0x0) goto LAB_00be25b4;
LAB_00be25dc:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    plVar1 = (long *)0x0;
    if (iVar5 != -1) {
      plVar1 = param_3;
    }
    param_3 = plVar1;
    if (bVar2 == (iVar5 == -1)) goto LAB_00be27e4;
  }
  uVar17 = local_110 >> 1 & 0x7f;
  if ((local_110 & 1) != 0) {
    uVar17 = local_108;
  }
  if (local_118 == pbVar7 + uVar17) {
    if ((long)uVar17 < 1) {
      uVar9 = uVar17 * 2;
      if ((local_110 & 1) == 0) {
        local_110 = CONCAT71(local_110._1_7_,(char)((int)uVar9 << 1));
        pbVar7 = pbVar19;
      }
      else {
        pbVar7 = local_100;
        local_108 = uVar9;
      }
      pbVar7[uVar9] = 0;
    }
    else {
                    /* try { // try from 00be2640 to 00be26b3 has its CatchHandler @ 00be2b20 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_110,uVar17,'\0');
    }
    uVar9 = 0x16;
    if ((local_110 & 1) != 0) {
      uVar9 = (local_110 & 0xfffffffffffffffe) - 1;
    }
    uVar16 = local_110 >> 1 & 0x7f;
    if ((local_110 & 1) != 0) {
      uVar16 = local_108;
    }
    if (uVar9 < uVar16 || uVar9 - uVar16 == 0) {
      if ((local_110 & 1) == 0) {
        local_110 = CONCAT71(local_110._1_7_,(char)((int)uVar9 << 1));
        pbVar7 = pbVar19;
      }
      else {
        pbVar7 = local_100;
        local_108 = uVar9;
      }
      pbVar7[uVar9] = 0;
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_110,uVar9 - uVar16,'\0');
    }
    pbVar7 = pbVar19;
    if ((local_110 & 1) != 0) {
      pbVar7 = local_100;
    }
    local_118 = pbVar7 + uVar17;
  }
  if ((wchar_t *)param_2[3] == (wchar_t *)param_2[4]) {
                    /* try { // try from 00be270c to 00be27c7 has its CatchHandler @ 00be2b24 */
    wVar4 = (**(code **)(*param_2 + 0x48))(param_2);
  }
  else {
    wVar4 = *(wchar_t *)param_2[3];
  }
  iVar5 = std::__ndk1::__num_get<wchar_t>::__stage2_float_loop
                    (wVar4,abStack_1c8,acStack_1cc,(char *)pbVar7,(char **)&local_118,wStack_dc,
                     local_e0,&local_f8,(uint *)local_1b8,&local_1c0,&local_1c4,
                     (wchar_t *)aiStack_d8);
  if (iVar5 != 0) goto LAB_00be27e4;
  if (bVar3) {
    bVar3 = true;
  }
  else if ((long)local_118 - (long)pbVar7 < 1) {
LAB_00be27a8:
    bVar3 = false;
  }
  else {
    bVar14 = *pbVar7;
    uVar6 = (uint)bVar14;
    if ((bVar14 == 0x2b) || (bVar14 == 0x2d)) {
      if (((long)local_118 - (long)pbVar7 == 1) || ((uVar6 != 0x2d && (uVar6 != 0x2b))))
      goto LAB_00be27a8;
      uVar6 = (uint)pbVar7[1];
    }
    bVar3 = true;
    if ((uVar6 != 0x2e) && (bVar3 = true, 9 < uVar6 - 0x30)) goto LAB_00be27e4;
  }
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
  }
  else {
    param_2[3] = param_2[3] + 4;
  }
  goto LAB_00be2594;
LAB_00be27e4:
  uVar17 = (ulong)((byte)local_f8 >> 1);
  if (((byte)local_f8 & 1) != 0) {
    uVar17 = local_f0;
  }
  if (((uVar17 != 0) && (abStack_1c8[0] == true)) && ((long)local_1c0 - (long)local_1b8 < 0xa0)) {
    *local_1c0 = local_1c4;
    local_1c0 = local_1c0 + 1;
  }
                    /* try { // try from 00be2830 to 00be2a33 has its CatchHandler @ 00be2b1c */
  auVar20 = FUN_00c0c96c(pbVar7,local_118,param_5);
  uVar9 = (ulong)(byte)local_f8;
  bVar14 = (byte)local_f8 & 1;
  uVar17 = (ulong)((byte)local_f8 >> 1);
  if (((byte)local_f8 & 1) != 0) {
    uVar17 = local_f0;
  }
  param_6[1] = auVar20._8_8_;
  *param_6 = auVar20._0_8_;
  if ((4 < (long)local_1c0 - (long)local_1b8) && (uVar17 != 0)) {
    puVar8 = local_1c0 + -1;
    if (((uint *)local_1b8 != local_1c0) && (local_1b8 < puVar8)) {
      puVar10 = (uint *)local_1b8;
      puVar15 = local_1c0 + -2;
      puVar11 = puVar15;
      if (puVar15 <= &uStack_1b4) {
        puVar11 = &uStack_1b4;
      }
      puVar11 = puVar11 + -1;
      puVar12 = puVar10;
      if (puVar11 != puVar10) {
        puVar12 = (uint *)(local_1b8 + 1);
      }
      uVar17 = (ulong)((long)puVar11 - (long)puVar12) >> 3;
      if (puVar11 != puVar10) {
        uVar17 = uVar17 + 1;
      }
      puVar11 = puVar8;
      if (uVar17 < 0x13) {
LAB_00be2910:
        do {
          puVar15 = puVar10 + 1;
          uVar6 = *puVar10;
          *puVar10 = *puVar11;
          puVar12 = puVar11 + -1;
          *puVar11 = uVar6;
          puVar11 = puVar12;
          puVar10 = puVar15;
        } while (puVar15 < puVar12);
      }
      else {
        if (puVar15 <= &uStack_1b4) {
          puVar15 = &uStack_1b4;
        }
        puVar15 = puVar15 + -1;
        puVar11 = puVar10;
        if (puVar15 != puVar10) {
          puVar11 = (uint *)(local_1b8 + 1);
        }
        uVar9 = (ulong)((long)puVar15 - (long)puVar11) >> 3;
        if (puVar15 != puVar10) {
          uVar9 = uVar9 + 1;
        }
        if ((puVar10 < local_1c0) &&
           (puVar11 = puVar8, local_1c0 + (-1 - uVar9) < &uStack_1b4 + uVar9)) goto LAB_00be2910;
        pauVar13 = (undefined1 (*) [16])(local_1c0 + -4);
        uVar16 = uVar17 + 1 & 0x7ffffffffffffff8;
        puVar10 = (uint *)(local_1b8 + uVar16 * 4);
        pauVar18 = (undefined1 (*) [16])auStack_1a8;
        uVar9 = uVar16;
        do {
          uVar9 = uVar9 - 8;
          auVar20 = NEON_rev64(*pauVar13,4);
          auVar21 = NEON_rev64(pauVar13[-1],4);
          auVar22 = NEON_rev64(pauVar18[-1],4);
          auVar23 = NEON_rev64(*pauVar18,4);
          auVar20 = NEON_ext(auVar20,auVar20,8,1);
          auVar21 = NEON_ext(auVar21,auVar21,8,1);
          auVar22 = NEON_ext(auVar22,auVar22,8,1);
          auVar23 = NEON_ext(auVar23,auVar23,8,1);
          *(long *)(pauVar18[-1] + 8) = auVar20._8_8_;
          *(long *)pauVar18[-1] = auVar20._0_8_;
          *(long *)(*pauVar18 + 8) = auVar21._8_8_;
          *(long *)*pauVar18 = auVar21._0_8_;
          pauVar18 = pauVar18 + 2;
          *(long *)((long)pauVar13[-1] + 8) = auVar23._8_8_;
          *(long *)pauVar13[-1] = auVar23._0_8_;
          *(long *)((long)*pauVar13 + 8) = auVar22._8_8_;
          *(long *)*pauVar13 = auVar22._0_8_;
          pauVar13 = pauVar13 + -2;
        } while (uVar9 != 0);
        puVar11 = puVar8 + -uVar16;
        if (uVar17 + 1 != uVar16) goto LAB_00be2910;
      }
      uVar9 = (ulong)(byte)local_f8;
      bVar14 = (byte)local_f8 & 1;
    }
    pbVar7 = local_e8;
    if (bVar14 == 0) {
      pbVar7 = (byte *)&uStack_f7;
    }
    pbVar19 = pbVar7;
    if (local_1b8 < puVar8) {
      uVar17 = uVar9 >> 1;
      if (bVar14 != 0) {
        uVar17 = local_f0;
      }
      puVar10 = (uint *)local_1b8;
      do {
        bVar14 = *pbVar19;
        if (((bVar14 != 0) && (bVar14 != 0xff)) && (*puVar10 != (uint)bVar14)) goto LAB_00be29c0;
        puVar10 = puVar10 + 1;
        if (1 < (long)(pbVar7 + (uVar17 - (long)pbVar19))) {
          pbVar19 = pbVar19 + 1;
        }
      } while (puVar10 < puVar8);
    }
    bVar14 = *pbVar19;
    if (((bVar14 != 0) && (bVar14 != 0xff)) && ((uint)bVar14 <= *puVar8 - 1)) {
LAB_00be29c0:
      *param_5 = L'\x04';
    }
  }
  if (param_2 == (long *)0x0) {
    bVar3 = true;
    if (param_3 != (long *)0x0) goto LAB_00be2a10;
LAB_00be29e8:
    if (!bVar3) goto LAB_00be2a50;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar5 = *(int *)param_2[3];
    }
    bVar3 = iVar5 == -1;
    plVar1 = (long *)0x0;
    if (!bVar3) {
      plVar1 = param_2;
    }
    param_2 = plVar1;
    if (param_3 == (long *)0x0) goto LAB_00be29e8;
LAB_00be2a10:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    if (bVar3 != (iVar5 == -1)) goto LAB_00be2a50;
  }
  *param_5 = *param_5 | 2;
LAB_00be2a50:
  if ((local_110 & 1) != 0) {
    operator_delete(local_100,local_110 & 0xfffffffffffffffe);
  }
  if (((byte)local_f8 & 1) != 0) {
    operator_delete(local_e8,CONCAT71(uStack_f7,local_f8) & 0xfffffffffffffffe);
  }
  return param_2;
}

