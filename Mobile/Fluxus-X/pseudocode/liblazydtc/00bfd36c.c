/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd36c
 */

/* std::__ndk1::ctype_byname<char>::do_tolower(char*, char const*) const */

byte * __thiscall
std::__ndk1::ctype_byname<char>::do_tolower(ctype_byname<char> *this,char *param_1,char *param_2)

{
  byte bVar1;
  byte *pbVar2;
  byte *pbVar3;
  ulong uVar4;
  ulong uVar5;
  undefined1 (*pauVar6) [16];
  ulong uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  
  if (param_1 == param_2) {
    return (byte *)param_1;
  }
  uVar4 = (long)param_2 - (long)param_1;
  if (uVar4 < 0x20) {
    pbVar2 = (byte *)param_1;
  }
  else {
    uVar5 = uVar4 & 0xffffffffffffffe0;
    pbVar2 = (byte *)(param_1 + uVar5);
    pauVar6 = (undefined1 (*) [16])(param_1 + 0x10);
    uVar7 = uVar5;
    do {
      auVar8 = pauVar6[-1];
      auVar9 = *pauVar6;
      uVar7 = uVar7 - 0x20;
      auVar10._8_8_ = 0xffffff0fffffff0e;
      auVar10._0_8_ = 0xffffff0dffffff0c;
      auVar10 = a64_TBL(ZEXT816(0),auVar8,auVar10);
      auVar12._8_8_ = 0xffffff0bffffff0a;
      auVar12._0_8_ = 0xffffff09ffffff08;
      auVar12 = a64_TBL(ZEXT816(0),auVar8,auVar12);
      auVar14._8_8_ = 0xffffff07ffffff06;
      auVar14._0_8_ = 0xffffff05ffffff04;
      auVar14 = a64_TBL(ZEXT816(0),auVar8,auVar14);
      auVar16._8_8_ = 0xffffff03ffffff02;
      auVar16._0_8_ = 0xffffff01ffffff00;
      auVar16 = a64_TBL(ZEXT816(0),auVar8,auVar16);
      auVar18._8_8_ = 0xffffff0fffffff0e;
      auVar18._0_8_ = 0xffffff0dffffff0c;
      auVar18 = a64_TBL(ZEXT816(0),auVar9,auVar18);
      auVar19._8_8_ = 0xffffff0bffffff0a;
      auVar19._0_8_ = 0xffffff09ffffff08;
      auVar19 = a64_TBL(ZEXT816(0),auVar9,auVar19);
      auVar20._8_8_ = 0xffffff07ffffff06;
      auVar20._0_8_ = 0xffffff05ffffff04;
      auVar20 = a64_TBL(ZEXT816(0),auVar9,auVar20);
      auVar21._8_8_ = 0xffffff03ffffff02;
      auVar21._0_8_ = 0xffffff01ffffff00;
      auVar21 = a64_TBL(ZEXT816(0),auVar9,auVar21);
      auVar11[1] = -(auVar16._4_4_ - 0x5bU < 0xffffffe6);
      auVar11[0] = -(auVar16._0_4_ - 0x5bU < 0xffffffe6);
      auVar11[2] = -(auVar16._8_4_ - 0x5bU < 0xffffffe6);
      auVar11[3] = -(auVar16._12_4_ - 0x5bU < 0xffffffe6);
      auVar11[4] = -(auVar14._0_4_ - 0x5bU < 0xffffffe6);
      auVar11[5] = -(auVar14._4_4_ - 0x5bU < 0xffffffe6);
      auVar11[6] = -(auVar14._8_4_ - 0x5bU < 0xffffffe6);
      auVar11[7] = -(auVar14._12_4_ - 0x5bU < 0xffffffe6);
      auVar11[8] = -(auVar12._0_4_ - 0x5bU < 0xffffffe6);
      auVar11[9] = -(auVar12._4_4_ - 0x5bU < 0xffffffe6);
      auVar11[10] = -(auVar12._8_4_ - 0x5bU < 0xffffffe6);
      auVar11[0xb] = -(auVar12._12_4_ - 0x5bU < 0xffffffe6);
      auVar11[0xc] = -(auVar10._0_4_ - 0x5bU < 0xffffffe6);
      auVar11[0xd] = -(auVar10._4_4_ - 0x5bU < 0xffffffe6);
      auVar11[0xe] = -(auVar10._8_4_ - 0x5bU < 0xffffffe6);
      auVar11[0xf] = -(auVar10._12_4_ - 0x5bU < 0xffffffe6);
      auVar13._0_8_ = auVar8._0_8_ | 0x2020202020202020;
      auVar13[8] = auVar8[8] | 0x20;
      auVar13[9] = auVar8[9] | 0x20;
      auVar13[10] = auVar8[10] | 0x20;
      auVar13[0xb] = auVar8[0xb] | 0x20;
      auVar13[0xc] = auVar8[0xc] | 0x20;
      auVar13[0xd] = auVar8[0xd] | 0x20;
      auVar13[0xe] = auVar8[0xe] | 0x20;
      auVar13[0xf] = auVar8[0xf] | 0x20;
      auVar15[1] = -(auVar21._4_4_ - 0x5bU < 0xffffffe6);
      auVar15[0] = -(auVar21._0_4_ - 0x5bU < 0xffffffe6);
      auVar15[2] = -(auVar21._8_4_ - 0x5bU < 0xffffffe6);
      auVar15[3] = -(auVar21._12_4_ - 0x5bU < 0xffffffe6);
      auVar15[4] = -(auVar20._0_4_ - 0x5bU < 0xffffffe6);
      auVar15[5] = -(auVar20._4_4_ - 0x5bU < 0xffffffe6);
      auVar15[6] = -(auVar20._8_4_ - 0x5bU < 0xffffffe6);
      auVar15[7] = -(auVar20._12_4_ - 0x5bU < 0xffffffe6);
      auVar15[8] = -(auVar19._0_4_ - 0x5bU < 0xffffffe6);
      auVar15[9] = -(auVar19._4_4_ - 0x5bU < 0xffffffe6);
      auVar15[10] = -(auVar19._8_4_ - 0x5bU < 0xffffffe6);
      auVar15[0xb] = -(auVar19._12_4_ - 0x5bU < 0xffffffe6);
      auVar15[0xc] = -(auVar18._0_4_ - 0x5bU < 0xffffffe6);
      auVar15[0xd] = -(auVar18._4_4_ - 0x5bU < 0xffffffe6);
      auVar15[0xe] = -(auVar18._8_4_ - 0x5bU < 0xffffffe6);
      auVar15[0xf] = -(auVar18._12_4_ - 0x5bU < 0xffffffe6);
      auVar17._0_8_ = auVar9._0_8_ | 0x2020202020202020;
      auVar17[8] = auVar9[8] | 0x20;
      auVar17[9] = auVar9[9] | 0x20;
      auVar17[10] = auVar9[10] | 0x20;
      auVar17[0xb] = auVar9[0xb] | 0x20;
      auVar17[0xc] = auVar9[0xc] | 0x20;
      auVar17[0xd] = auVar9[0xd] | 0x20;
      auVar17[0xe] = auVar9[0xe] | 0x20;
      auVar17[0xf] = auVar9[0xf] | 0x20;
      auVar8 = auVar8 ^ (auVar8 ^ auVar13) & ~auVar11;
      auVar9 = auVar9 ^ (auVar9 ^ auVar17) & ~auVar15;
      *(long *)(pauVar6[-1] + 8) = auVar8._8_8_;
      *(long *)pauVar6[-1] = auVar8._0_8_;
      *(long *)(*pauVar6 + 8) = auVar9._8_8_;
      *(long *)*pauVar6 = auVar9._0_8_;
      pauVar6 = pauVar6 + 2;
    } while (uVar7 != 0);
    if (uVar4 == uVar5) {
      return pbVar2;
    }
  }
  do {
    bVar1 = *pbVar2;
    if (0xffffffe5 < bVar1 - 0x5b) {
      bVar1 = bVar1 | 0x20;
    }
    pbVar3 = pbVar2 + 1;
    *pbVar2 = bVar1;
    pbVar2 = pbVar3;
  } while (pbVar3 != (byte *)param_2);
  return pbVar3;
}

