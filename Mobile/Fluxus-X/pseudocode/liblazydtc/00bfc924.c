/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc924
 */

/* std::__ndk1::ctype<wchar_t>::do_widen(char const*, char const*, wchar_t*) const */

byte * __thiscall
std::__ndk1::ctype<wchar_t>::do_widen
          (ctype<wchar_t> *this,char *param_1,char *param_2,wchar_t *param_3)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  byte *pbVar4;
  byte *pbVar3;
  wchar_t *pwVar5;
  ulong uVar6;
  ulong uVar7;
  undefined1 (*pauVar8) [16];
  wchar_t *pwVar9;
  ulong uVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  
  if (param_1 == param_2) {
    return (byte *)param_1;
  }
  uVar6 = (long)param_2 - (long)param_1;
  if ((uVar6 < 0x20) || ((param_3 < param_2 && (param_1 < param_3 + uVar6)))) {
    pbVar4 = (byte *)param_1;
    pwVar5 = param_3;
  }
  else {
    uVar7 = uVar6 & 0xffffffffffffffe0;
    pwVar5 = param_3 + uVar7;
    pbVar4 = (byte *)(param_1 + uVar7);
    pauVar8 = (undefined1 (*) [16])(param_1 + 0x10);
    pwVar9 = param_3 + 0x10;
    uVar10 = uVar7;
    do {
      auVar12 = pauVar8[-1];
      auVar2 = *pauVar8;
      uVar10 = uVar10 - 0x20;
      pauVar8 = pauVar8 + 2;
      auVar16._8_8_ = 0xffffff0fffffff0e;
      auVar16._0_8_ = 0xffffff0dffffff0c;
      auVar13 = a64_TBL(ZEXT816(0),auVar12,auVar16);
      auVar15._8_8_ = 0xffffff0bffffff0a;
      auVar15._0_8_ = 0xffffff09ffffff08;
      auVar15 = a64_TBL(ZEXT816(0),auVar12,auVar15);
      auVar14._8_8_ = 0xffffff07ffffff06;
      auVar14._0_8_ = 0xffffff05ffffff04;
      auVar16 = a64_TBL(ZEXT816(0),auVar12,auVar14);
      auVar11._8_8_ = 0xffffff03ffffff02;
      auVar11._0_8_ = 0xffffff01ffffff00;
      auVar11 = a64_TBL(ZEXT816(0),auVar12,auVar11);
      auVar17._8_8_ = 0xffffff0fffffff0e;
      auVar17._0_8_ = 0xffffff0dffffff0c;
      auVar17 = a64_TBL(ZEXT816(0),auVar2,auVar17);
      *(long *)(pwVar9 + -6) = auVar15._8_8_;
      *(long *)(pwVar9 + -8) = auVar15._0_8_;
      *(long *)(pwVar9 + -2) = auVar13._8_8_;
      *(long *)(pwVar9 + -4) = auVar13._0_8_;
      auVar1._8_8_ = 0xffffff0bffffff0a;
      auVar1._0_8_ = 0xffffff09ffffff08;
      auVar14 = a64_TBL(ZEXT816(0),auVar2,auVar1);
      auVar13._8_8_ = 0xffffff07ffffff06;
      auVar13._0_8_ = 0xffffff05ffffff04;
      auVar13 = a64_TBL(ZEXT816(0),auVar2,auVar13);
      auVar12._8_8_ = 0xffffff03ffffff02;
      auVar12._0_8_ = 0xffffff01ffffff00;
      auVar12 = a64_TBL(ZEXT816(0),auVar2,auVar12);
      *(long *)(pwVar9 + -0xe) = auVar11._8_8_;
      *(long *)(pwVar9 + -0x10) = auVar11._0_8_;
      *(long *)(pwVar9 + -10) = auVar16._8_8_;
      *(long *)(pwVar9 + -0xc) = auVar16._0_8_;
      *(long *)(pwVar9 + 10) = auVar14._8_8_;
      *(long *)(pwVar9 + 8) = auVar14._0_8_;
      *(long *)(pwVar9 + 0xe) = auVar17._8_8_;
      *(long *)(pwVar9 + 0xc) = auVar17._0_8_;
      *(long *)(pwVar9 + 2) = auVar12._8_8_;
      *(long *)pwVar9 = auVar12._0_8_;
      *(long *)(pwVar9 + 6) = auVar13._8_8_;
      *(long *)(pwVar9 + 4) = auVar13._0_8_;
      pwVar9 = pwVar9 + 0x20;
    } while (uVar10 != 0);
    if (uVar6 == uVar7) {
      return pbVar4;
    }
  }
  do {
    pbVar3 = pbVar4 + 1;
    *pwVar5 = (uint)*pbVar4;
    pbVar4 = pbVar3;
    pwVar5 = pwVar5 + 1;
  } while (pbVar3 != (byte *)param_2);
  return pbVar3;
}

