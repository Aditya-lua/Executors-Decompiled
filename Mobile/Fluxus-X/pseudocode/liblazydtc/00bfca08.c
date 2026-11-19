/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfca08
 */

/* std::__ndk1::ctype<wchar_t>::do_narrow(wchar_t const*, wchar_t const*, char, char*) const */

wchar_t * __thiscall
std::__ndk1::ctype<wchar_t>::do_narrow
          (ctype<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,char param_3,char *param_4)

{
  undefined1 (*pauVar1) [12];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined8 uVar5;
  uint6 uVar6;
  uint3 uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined8 uVar13;
  undefined1 auVar14 [16];
  undefined8 uVar15;
  undefined1 auVar16 [16];
  undefined1 *puVar17;
  undefined1 *puVar18;
  undefined1 (*pauVar19) [12];
  undefined1 (*pauVar20) [12];
  undefined1 (*pauVar21) [12];
  wchar_t *pwVar22;
  wchar_t wVar23;
  ulong uVar24;
  ulong uVar25;
  undefined1 (*pauVar26) [12];
  char *pcVar27;
  ulong uVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  uint uVar33;
  uint uVar34;
  uint uVar35;
  uint uVar36;
  uint uVar37;
  
  if (param_1 == param_2) {
    return param_1;
  }
  uVar24 = (long)param_2 + (-4 - (long)param_1);
  if ((uVar24 < 0x7c) ||
     ((param_4 < (char *)((long)param_1 + (uVar24 & 0xfffffffffffffffc) + 4) &&
      (param_1 < param_4 + (uVar24 >> 2) + 1)))) {
  }
  else {
    pcVar27 = param_4 + 0x10;
    uVar24 = (uVar24 >> 2) + 1;
    pauVar26 = (undefined1 (*) [12])(param_1 + 0x10);
    uVar25 = uVar24 & 0x7fffffffffffffe0;
    param_1 = param_1 + uVar25;
    param_4 = param_4 + uVar25;
    uVar28 = uVar25;
    do {
      auVar3 = *(undefined1 (*) [16])(pauVar26[-6] + 8);
      auVar31 = *(undefined1 (*) [16])(pauVar26 + -4);
      uVar28 = uVar28 - 0x20;
      puVar18 = *pauVar26;
      uVar34 = (uint)((ulong)*(undefined8 *)(puVar18 + 8) >> 0x20);
      puVar17 = *pauVar26;
      pauVar1 = pauVar26 + 2;
      uVar35 = (uint)((ulong)*(undefined8 *)*pauVar1 >> 0x20);
      uVar11 = *(undefined8 *)*(undefined1 (*) [12])(pauVar26[1] + 4);
      auVar16 = *(undefined1 (*) [16])(pauVar26[-3] + 4);
      pauVar19 = pauVar26 + -1;
      uVar33 = (uint)((ulong)*(undefined8 *)(*pauVar19 + 4) >> 0x20);
      uVar5 = *(undefined8 *)*(undefined1 (*) [12])(pauVar26[-2] + 8);
      pauVar20 = pauVar26 + 3;
      uVar36 = (uint)((ulong)*(undefined8 *)(*pauVar20 + 4) >> 0x20);
      uVar13 = *(undefined8 *)*(undefined1 (*) [12])(pauVar26[2] + 8);
      pauVar21 = pauVar26 + 4;
      uVar37 = (uint)((ulong)*(undefined8 *)(*pauVar21 + 8) >> 0x20);
      uVar15 = *(undefined8 *)pauVar26[4];
      auVar29._8_8_ = 0x3c3834302c282420;
      auVar29._0_8_ = 0x1c1814100c080400;
      auVar4._12_4_ = uVar33;
      auVar4._0_12_ = *(undefined1 (*) [12])(pauVar26[-2] + 8);
      auVar29 = a64_TBL(ZEXT816(0),auVar3,auVar31,auVar16,auVar4,auVar29);
      auVar32._8_8_ = 0x3c3834302c282420;
      auVar32._0_8_ = 0x1c1814100c080400;
      auVar9._12_4_ = uVar34;
      auVar9._0_12_ = *pauVar26;
      auVar10._12_4_ = uVar35;
      auVar10._0_12_ = *(undefined1 (*) [12])(pauVar26[1] + 4);
      auVar12._12_4_ = uVar36;
      auVar12._0_12_ = *(undefined1 (*) [12])(pauVar26[2] + 8);
      auVar14._12_4_ = uVar37;
      auVar14._0_12_ = pauVar26[4];
      auVar32 = a64_TBL(ZEXT816(0),auVar9,auVar10,auVar12,auVar14,auVar32);
      pauVar26 = (undefined1 (*) [12])(pauVar26[10] + 8);
      uVar6 = (uint6)CONCAT14(-((uint)((ulong)uVar5 >> 0x20) < 0x80),-(uint)((uint)uVar5 < 0x80)) &
              0xffff0000ffff;
      uVar7 = CONCAT12(-(auVar16._4_4_ < 0x80),-(ushort)(auVar16._0_4_ < 0x80)) & 0xff00ff;
      auVar30[1] = -((uint)((ulong)*(undefined8 *)puVar17 >> 0x20) < 0x80);
      auVar30[0] = -((uint)*(undefined8 *)puVar17 < 0x80);
      auVar30[2] = -((uint)*(undefined8 *)(puVar18 + 8) < 0x80);
      auVar30[3] = -(uVar34 < 0x80);
      auVar30[4] = -((uint)uVar11 < 0x80);
      auVar30[5] = -((uint)((ulong)uVar11 >> 0x20) < 0x80);
      auVar30[6] = -((uint)*(undefined8 *)*pauVar1 < 0x80);
      auVar30[7] = -(uVar35 < 0x80);
      auVar30[8] = -((uint)uVar13 < 0x80);
      auVar30[9] = -((uint)((ulong)uVar13 >> 0x20) < 0x80);
      auVar30[10] = -((uint)*(undefined8 *)(*pauVar20 + 4) < 0x80);
      auVar30[0xb] = -(uVar36 < 0x80);
      auVar30[0xc] = -((uint)uVar15 < 0x80);
      auVar30[0xd] = -((uint)((ulong)uVar15 >> 0x20) < 0x80);
      auVar30[0xe] = -((uint)*(undefined8 *)(*pauVar21 + 8) < 0x80);
      auVar30[0xf] = -(uVar37 < 0x80);
      auVar2[1] = param_3;
      auVar2[0] = param_3;
      auVar2[2] = param_3;
      auVar2[3] = param_3;
      auVar2[4] = param_3;
      auVar2[5] = param_3;
      auVar2[6] = param_3;
      auVar2[7] = param_3;
      auVar2[8] = param_3;
      auVar2[9] = param_3;
      auVar2[10] = param_3;
      auVar2[0xb] = param_3;
      auVar2[0xc] = param_3;
      auVar2[0xd] = param_3;
      auVar2[0xe] = param_3;
      auVar2[0xf] = param_3;
      auVar8[1] = -(auVar3._4_4_ < 0x80);
      auVar8[0] = -(auVar3._0_4_ < 0x80);
      auVar8[2] = -(auVar3._8_4_ < 0x80);
      auVar8[3] = -(auVar3._12_4_ < 0x80);
      auVar8[4] = -(auVar31._0_4_ < 0x80);
      auVar8[5] = -(auVar31._4_4_ < 0x80);
      auVar8[6] = -(auVar31._8_4_ < 0x80);
      auVar8[7] = -(auVar31._12_4_ < 0x80);
      auVar8[8] = (char)uVar7;
      auVar8[9] = (char)(uVar7 >> 0x10);
      auVar8[10] = -(auVar16._8_4_ < 0x80);
      auVar8[0xb] = -(auVar16._12_4_ < 0x80);
      auVar8[0xc] = (char)uVar6;
      auVar8[0xd] = (char)(uVar6 >> 0x20);
      auVar8[0xe] = -((uint)*(undefined8 *)(*pauVar19 + 4) < 0x80);
      auVar8[0xf] = -(uVar33 < 0x80);
      auVar29 = auVar29 ^ (auVar29 ^ auVar2) & ~auVar8;
      auVar3[1] = param_3;
      auVar3[0] = param_3;
      auVar3[2] = param_3;
      auVar3[3] = param_3;
      auVar3[4] = param_3;
      auVar3[5] = param_3;
      auVar3[6] = param_3;
      auVar3[7] = param_3;
      auVar3[8] = param_3;
      auVar3[9] = param_3;
      auVar3[10] = param_3;
      auVar3[0xb] = param_3;
      auVar3[0xc] = param_3;
      auVar3[0xd] = param_3;
      auVar3[0xe] = param_3;
      auVar3[0xf] = param_3;
      auVar31[1] = param_3;
      auVar31[0] = param_3;
      auVar31[2] = param_3;
      auVar31[3] = param_3;
      auVar31[4] = param_3;
      auVar31[5] = param_3;
      auVar31[6] = param_3;
      auVar31[7] = param_3;
      auVar31[8] = param_3;
      auVar31[9] = param_3;
      auVar31[10] = param_3;
      auVar31[0xb] = param_3;
      auVar31[0xc] = param_3;
      auVar31[0xd] = param_3;
      auVar31[0xe] = param_3;
      auVar31[0xf] = param_3;
      auVar31 = auVar31 ^ (auVar3 ^ auVar32) & auVar30;
      *(long *)(pcVar27 + -8) = auVar29._8_8_;
      *(long *)(pcVar27 + -0x10) = auVar29._0_8_;
      *(long *)(pcVar27 + 8) = auVar31._8_8_;
      *(long *)pcVar27 = auVar31._0_8_;
      pcVar27 = pcVar27 + 0x20;
    } while (uVar28 != 0);
    if (uVar24 == uVar25) {
      return param_1;
    }
  }
  do {
    pwVar22 = param_1 + 1;
    wVar23 = *param_1;
    if (0x7f < (uint)wVar23) {
      wVar23 = (wchar_t)(byte)param_3;
    }
    *param_4 = (char)wVar23;
    param_1 = pwVar22;
    param_4 = param_4 + 1;
  } while (pwVar22 != param_2);
  return pwVar22;
}

