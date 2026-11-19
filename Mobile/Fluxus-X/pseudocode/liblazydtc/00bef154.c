/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bef154
 */

/* std::__ndk1::__check_grouping(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned int*, unsigned int*, unsigned int&) */

void std::__ndk1::__check_grouping
               (basic_string_conflict *param_1,uint *param_2,uint *param_3,uint *param_4)

{
  uint uVar1;
  basic_string_conflict bVar2;
  uint *puVar3;
  ulong uVar4;
  uint *puVar5;
  uint *puVar6;
  ulong uVar7;
  uint *puVar8;
  basic_string_conflict *pbVar9;
  basic_string_conflict *pbVar10;
  byte bVar11;
  ulong uVar12;
  uint *puVar13;
  undefined1 (*pauVar14) [16];
  undefined1 (*pauVar15) [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  
  bVar2 = *param_1;
  uVar4 = (ulong)(byte)bVar2;
  bVar11 = (byte)bVar2 & 1;
  uVar7 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar7 = *(ulong *)(param_1 + 8);
  }
  if ((long)param_3 - (long)param_2 < 5) {
    return;
  }
  if (uVar7 == 0) {
    return;
  }
  puVar3 = param_3 + -1;
  if ((param_2 == param_3) || (puVar3 <= param_2)) goto LAB_00bef2a8;
  puVar13 = param_3 + -2;
  puVar6 = param_2 + 1;
  puVar8 = puVar13;
  if (puVar13 <= puVar6) {
    puVar8 = puVar6;
  }
  puVar8 = puVar8 + -1;
  puVar5 = param_2;
  if (puVar8 != param_2) {
    puVar5 = (uint *)((long)param_2 + 1);
  }
  uVar7 = (ulong)((long)puVar8 - (long)puVar5) >> 3;
  if (puVar8 != param_2) {
    uVar7 = uVar7 + 1;
  }
  puVar5 = puVar3;
  puVar8 = param_2;
  if (uVar7 < 0x13) {
LAB_00bef284:
    do {
      puVar13 = puVar8 + 1;
      uVar1 = *puVar8;
      *puVar8 = *puVar5;
      puVar6 = puVar5 + -1;
      *puVar5 = uVar1;
      puVar5 = puVar6;
      puVar8 = puVar13;
    } while (puVar13 < puVar6);
  }
  else {
    if (puVar13 <= puVar6) {
      puVar13 = puVar6;
    }
    puVar13 = puVar13 + -1;
    if (puVar13 != param_2) {
      puVar8 = (uint *)((long)param_2 + 1);
    }
    uVar4 = (ulong)((long)puVar13 - (long)puVar8) >> 3;
    if (puVar13 != param_2) {
      uVar4 = uVar4 + 1;
    }
    if ((param_2 < param_3) && (puVar8 = param_2, param_3 + (-1 - uVar4) < puVar6 + uVar4))
    goto LAB_00bef284;
    pauVar14 = (undefined1 (*) [16])(param_2 + 4);
    pauVar15 = (undefined1 (*) [16])(param_3 + -4);
    uVar12 = uVar7 + 1 & 0x7ffffffffffffff8;
    puVar5 = puVar3 + -uVar12;
    puVar8 = param_2 + uVar12;
    uVar4 = uVar12;
    do {
      uVar4 = uVar4 - 8;
      auVar16 = NEON_rev64(*pauVar15,4);
      auVar17 = NEON_rev64(pauVar15[-1],4);
      auVar18 = NEON_rev64(pauVar14[-1],4);
      auVar19 = NEON_rev64(*pauVar14,4);
      auVar16 = NEON_ext(auVar16,auVar16,8,1);
      auVar17 = NEON_ext(auVar17,auVar17,8,1);
      auVar18 = NEON_ext(auVar18,auVar18,8,1);
      auVar19 = NEON_ext(auVar19,auVar19,8,1);
      *(long *)(pauVar14[-1] + 8) = auVar16._8_8_;
      *(long *)pauVar14[-1] = auVar16._0_8_;
      *(long *)(*pauVar14 + 8) = auVar17._8_8_;
      *(long *)*pauVar14 = auVar17._0_8_;
      pauVar14 = pauVar14 + 2;
      *(long *)(pauVar15[-1] + 8) = auVar19._8_8_;
      *(long *)pauVar15[-1] = auVar19._0_8_;
      *(long *)(*pauVar15 + 8) = auVar18._8_8_;
      *(long *)*pauVar15 = auVar18._0_8_;
      pauVar15 = pauVar15 + -2;
    } while (uVar4 != 0);
    if (uVar7 + 1 != uVar12) goto LAB_00bef284;
  }
  uVar4 = (ulong)(byte)*param_1;
  bVar11 = (byte)*param_1 & 1;
LAB_00bef2a8:
  pbVar9 = *(basic_string_conflict **)(param_1 + 0x10);
  if (bVar11 == 0) {
    pbVar9 = param_1 + 1;
  }
  pbVar10 = pbVar9;
  if (param_2 < puVar3) {
    uVar7 = uVar4 >> 1;
    if (bVar11 != 0) {
      uVar7 = *(ulong *)(param_1 + 8);
    }
    do {
      bVar2 = *pbVar10;
      if (((bVar2 != (basic_string_conflict)0x0) && (bVar2 != (basic_string_conflict)0xff)) &&
         (*param_2 != (uint)(byte)bVar2)) goto LAB_00bef32c;
      param_2 = param_2 + 1;
      if (1 < (long)(pbVar9 + (uVar7 - (long)pbVar10))) {
        pbVar10 = pbVar10 + 1;
      }
    } while (param_2 < puVar3);
  }
  bVar2 = *pbVar10;
  if (((bVar2 != (basic_string_conflict)0x0) && (bVar2 != (basic_string_conflict)0xff)) &&
     ((uint)(byte)bVar2 <= *puVar3 - 1)) {
LAB_00bef32c:
    *param_4 = 4;
  }
  return;
}

