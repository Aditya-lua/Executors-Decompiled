/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bddd2c
 */

long * FUN_00bddd2c(undefined8 param_1,long *param_2,long *param_3,__num_get<char> *param_4,
                   uint *param_5,undefined8 *param_6)

{
  long *plVar1;
  bool bVar2;
  bool bVar3;
  char cVar4;
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
  bool bVar19;
  byte *pbVar20;
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  char acStack_17c [4];
  bool abStack_178 [4];
  uint local_174;
  uint *local_170;
  undefined1 local_168 [4];
  uint uStack_164;
  undefined8 uStack_160;
  undefined8 auStack_158 [18];
  byte *local_c8;
  undefined8 local_c0;
  ulong local_b8;
  byte *local_b0;
  basic_string_conflict local_a8;
  undefined7 uStack_a7;
  ulong local_a0;
  byte *local_98;
  char local_8c [4];
  char local_88 [4];
  ios_base aiStack_84 [36];
  
  std::__ndk1::__num_get<char>::__stage2_float_prep
            (param_4,aiStack_84,local_88,local_8c,(char *)param_5);
  local_c0 = 0;
  local_b8 = 0;
  local_b0 = (byte *)0x0;
                    /* try { // try from 00bddd80 to 00bddd93 has its CatchHandler @ 00bde370 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)&local_c0
         ,0x16,'\0');
  bVar3 = false;
  pbVar20 = (byte *)((ulong)&local_c0 | 1);
  pbVar7 = local_b0;
  if ((local_c0 & 1) == 0) {
    pbVar7 = (byte *)((long)&local_c0 + 1);
  }
  local_174 = 0;
  abStack_178[0] = true;
  acStack_17c[0] = 'E';
  local_170 = (uint *)local_168;
  local_c8 = pbVar7;
LAB_00bddde0:
  if (param_2 == (long *)0x0) {
    bVar2 = true;
    plVar1 = param_2;
joined_r0x00bdde10:
    param_2 = plVar1;
    bVar19 = bVar2;
    if (param_3 == (long *)0x0) goto LAB_00bdde14;
LAB_00bdddf8:
    if (param_3[3] == param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
      plVar1 = (long *)0x0;
      if (iVar5 != -1) {
        plVar1 = param_3;
      }
      param_3 = plVar1;
      if (bVar19 == (iVar5 == -1)) goto LAB_00bde038;
    }
    else if (bVar19 == false) goto LAB_00bde038;
  }
  else {
    if (param_2[3] == param_2[4]) {
                    /* try { // try from 00bdde24 to 00bdde4f has its CatchHandler @ 00bde37c */
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar2 = iVar5 == -1;
      plVar1 = (long *)0x0;
      if (!bVar2) {
        plVar1 = param_2;
      }
      goto joined_r0x00bdde10;
    }
    bVar2 = false;
    bVar19 = false;
    if (param_3 != (long *)0x0) goto LAB_00bdddf8;
LAB_00bdde14:
    if (bVar2 != false) goto LAB_00bde038;
  }
  uVar17 = local_c0 >> 1 & 0x7f;
  if ((local_c0 & 1) != 0) {
    uVar17 = local_b8;
  }
  if (local_c8 == pbVar7 + uVar17) {
    if ((long)uVar17 < 1) {
      uVar9 = uVar17 * 2;
      if ((local_c0 & 1) == 0) {
        local_c0 = CONCAT71(local_c0._1_7_,(char)((int)uVar9 << 1));
        pbVar7 = pbVar20;
      }
      else {
        pbVar7 = local_b0;
        local_b8 = uVar9;
      }
      pbVar7[uVar9] = 0;
    }
    else {
                    /* try { // try from 00bdde90 to 00bddf03 has its CatchHandler @ 00bde378 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_c0,uVar17,'\0');
    }
    uVar9 = 0x16;
    if ((local_c0 & 1) != 0) {
      uVar9 = (local_c0 & 0xfffffffffffffffe) - 1;
    }
    uVar16 = local_c0 >> 1 & 0x7f;
    if ((local_c0 & 1) != 0) {
      uVar16 = local_b8;
    }
    if (uVar9 < uVar16 || uVar9 - uVar16 == 0) {
      if ((local_c0 & 1) == 0) {
        local_c0 = CONCAT71(local_c0._1_7_,(char)((int)uVar9 << 1));
        pbVar7 = pbVar20;
      }
      else {
        pbVar7 = local_b0;
        local_b8 = uVar9;
      }
      pbVar7[uVar9] = 0;
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_c0,uVar9 - uVar16,'\0');
    }
    pbVar7 = pbVar20;
    if ((local_c0 & 1) != 0) {
      pbVar7 = local_b0;
    }
    local_c8 = pbVar7 + uVar17;
  }
  if ((char *)param_2[3] == (char *)param_2[4]) {
                    /* try { // try from 00bddf5c to 00bde01b has its CatchHandler @ 00bde37c */
    cVar4 = (**(code **)(*param_2 + 0x48))(param_2);
  }
  else {
    cVar4 = *(char *)param_2[3];
  }
  iVar5 = std::__ndk1::__num_get<char>::__stage2_float_loop
                    (cVar4,abStack_178,acStack_17c,(char *)pbVar7,(char **)&local_c8,local_88[0],
                     local_8c[0],&local_a8,(uint *)local_168,&local_170,&local_174,
                     (char *)aiStack_84);
  if (iVar5 != 0) goto LAB_00bde038;
  if (bVar3) {
    bVar3 = true;
  }
  else if ((long)local_c8 - (long)pbVar7 < 1) {
LAB_00bddffc:
    bVar3 = false;
  }
  else {
    bVar14 = *pbVar7;
    uVar6 = (uint)bVar14;
    if ((bVar14 == 0x2b) || (bVar14 == 0x2d)) {
      if (((long)local_c8 - (long)pbVar7 == 1) || ((uVar6 != 0x2d && (uVar6 != 0x2b))))
      goto LAB_00bddffc;
      uVar6 = (uint)pbVar7[1];
    }
    bVar3 = true;
    if ((uVar6 != 0x2e) && (bVar3 = true, 9 < uVar6 - 0x30)) goto LAB_00bde038;
  }
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
  }
  else {
    param_2[3] = param_2[3] + 1;
  }
  goto LAB_00bddde0;
LAB_00bde038:
  uVar17 = (ulong)((byte)local_a8 >> 1);
  if (((byte)local_a8 & 1) != 0) {
    uVar17 = local_a0;
  }
  if (((uVar17 != 0) && (abStack_178[0] == true)) && ((long)local_170 - (long)local_168 < 0xa0)) {
    *local_170 = local_174;
    local_170 = local_170 + 1;
  }
                    /* try { // try from 00bde084 to 00bde2eb has its CatchHandler @ 00bde374 */
  auVar21 = FUN_00c0c96c(pbVar7,local_c8,param_5);
  uVar9 = (ulong)(byte)local_a8;
  bVar14 = (byte)local_a8 & 1;
  uVar17 = (ulong)((byte)local_a8 >> 1);
  if (((byte)local_a8 & 1) != 0) {
    uVar17 = local_a0;
  }
  param_6[1] = auVar21._8_8_;
  *param_6 = auVar21._0_8_;
  if ((4 < (long)local_170 - (long)local_168) && (uVar17 != 0)) {
    puVar8 = local_170 + -1;
    if (((uint *)local_168 != local_170) && (local_168 < puVar8)) {
      puVar10 = (uint *)local_168;
      puVar15 = local_170 + -2;
      puVar11 = puVar15;
      if (puVar15 <= &uStack_164) {
        puVar11 = &uStack_164;
      }
      puVar11 = puVar11 + -1;
      puVar12 = puVar10;
      if (puVar11 != puVar10) {
        puVar12 = (uint *)(local_168 + 1);
      }
      uVar17 = (ulong)((long)puVar11 - (long)puVar12) >> 3;
      if (puVar11 != puVar10) {
        uVar17 = uVar17 + 1;
      }
      puVar11 = puVar8;
      if (uVar17 < 0x13) {
LAB_00bde164:
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
        if (puVar15 <= &uStack_164) {
          puVar15 = &uStack_164;
        }
        puVar15 = puVar15 + -1;
        puVar11 = puVar10;
        if (puVar15 != puVar10) {
          puVar11 = (uint *)(local_168 + 1);
        }
        uVar9 = (ulong)((long)puVar15 - (long)puVar11) >> 3;
        if (puVar15 != puVar10) {
          uVar9 = uVar9 + 1;
        }
        if ((puVar10 < local_170) &&
           (puVar11 = puVar8, local_170 + (-1 - uVar9) < &uStack_164 + uVar9)) goto LAB_00bde164;
        pauVar13 = (undefined1 (*) [16])(local_170 + -4);
        uVar16 = uVar17 + 1 & 0x7ffffffffffffff8;
        puVar10 = (uint *)(local_168 + uVar16 * 4);
        pauVar18 = (undefined1 (*) [16])auStack_158;
        uVar9 = uVar16;
        do {
          uVar9 = uVar9 - 8;
          auVar21 = NEON_rev64(*pauVar13,4);
          auVar22 = NEON_rev64(pauVar13[-1],4);
          auVar23 = NEON_rev64(pauVar18[-1],4);
          auVar24 = NEON_rev64(*pauVar18,4);
          auVar21 = NEON_ext(auVar21,auVar21,8,1);
          auVar22 = NEON_ext(auVar22,auVar22,8,1);
          auVar23 = NEON_ext(auVar23,auVar23,8,1);
          auVar24 = NEON_ext(auVar24,auVar24,8,1);
          *(long *)(pauVar18[-1] + 8) = auVar21._8_8_;
          *(long *)pauVar18[-1] = auVar21._0_8_;
          *(long *)(*pauVar18 + 8) = auVar22._8_8_;
          *(long *)*pauVar18 = auVar22._0_8_;
          pauVar18 = pauVar18 + 2;
          *(long *)((long)pauVar13[-1] + 8) = auVar24._8_8_;
          *(long *)pauVar13[-1] = auVar24._0_8_;
          *(long *)((long)*pauVar13 + 8) = auVar23._8_8_;
          *(long *)*pauVar13 = auVar23._0_8_;
          pauVar13 = pauVar13 + -2;
        } while (uVar9 != 0);
        puVar11 = puVar8 + -uVar16;
        if (uVar17 + 1 != uVar16) goto LAB_00bde164;
      }
      uVar9 = (ulong)(byte)local_a8;
      bVar14 = (byte)local_a8 & 1;
    }
    pbVar7 = local_98;
    if (bVar14 == 0) {
      pbVar7 = (byte *)&uStack_a7;
    }
    pbVar20 = pbVar7;
    if (local_168 < puVar8) {
      uVar17 = uVar9 >> 1;
      if (bVar14 != 0) {
        uVar17 = local_a0;
      }
      puVar10 = (uint *)local_168;
      do {
        bVar14 = *pbVar20;
        if (((bVar14 != 0) && (bVar14 != 0xff)) && (*puVar10 != (uint)bVar14)) goto LAB_00bde214;
        puVar10 = puVar10 + 1;
        if (1 < (long)(pbVar7 + (uVar17 - (long)pbVar20))) {
          pbVar20 = pbVar20 + 1;
        }
      } while (puVar10 < puVar8);
    }
    bVar14 = *pbVar20;
    if (((bVar14 != 0) && (bVar14 != 0xff)) && ((uint)bVar14 <= *puVar8 - 1)) {
LAB_00bde214:
      *param_5 = 4;
    }
  }
  if (param_2 == (long *)0x0) {
    bVar3 = true;
    plVar1 = param_2;
joined_r0x00bde2ac:
    param_2 = plVar1;
    if (param_3 == (long *)0x0) goto LAB_00bde2b0;
LAB_00bde234:
    if (param_3[3] == param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
      if (bVar3 != (iVar5 == -1)) goto LAB_00bde250;
    }
    else if (bVar3) goto LAB_00bde250;
  }
  else {
    if (param_2[3] == param_2[4]) {
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar3 = iVar5 == -1;
      plVar1 = (long *)0x0;
      if (!bVar3) {
        plVar1 = param_2;
      }
      goto joined_r0x00bde2ac;
    }
    bVar3 = false;
    if (param_3 != (long *)0x0) goto LAB_00bde234;
LAB_00bde2b0:
    if (bVar3 == false) goto LAB_00bde250;
  }
  *param_5 = *param_5 | 2;
LAB_00bde250:
  if ((local_c0 & 1) != 0) {
    operator_delete(local_b0,local_c0 & 0xfffffffffffffffe);
  }
  if (((byte)local_a8 & 1) != 0) {
    operator_delete(local_98,CONCAT71(uStack_a7,local_a8) & 0xfffffffffffffffe);
  }
  return param_2;
}

