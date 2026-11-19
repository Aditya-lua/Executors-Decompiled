/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcf64
 */

/* std::__ndk1::ctype<char>::do_narrow(char const*, char const*, char, char*) const */

char * __thiscall
std::__ndk1::ctype<char>::do_narrow
          (ctype<char> *this,char *param_1,char *param_2,char param_3,char *param_4)

{
  char cVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  char *pcVar34;
  ulong uVar35;
  ulong uVar36;
  byte *pbVar37;
  byte *pbVar38;
  ulong uVar39;
  
  if (param_1 == param_2) {
    return param_1;
  }
  uVar35 = (long)param_2 - (long)param_1;
  if ((0x1f < uVar35) && (0x1f < (ulong)((long)param_4 - (long)param_1))) {
    uVar36 = uVar35 & 0xffffffffffffffe0;
    pbVar37 = (byte *)(param_1 + 0x10);
    param_1 = param_1 + uVar36;
    pbVar38 = (byte *)(param_4 + 0x10);
    uVar39 = uVar36;
    do {
      bVar2 = pbVar37[-0x10];
      bVar3 = pbVar37[-0xf];
      bVar4 = pbVar37[-0xe];
      bVar5 = pbVar37[-0xd];
      bVar6 = pbVar37[-0xc];
      bVar7 = pbVar37[-0xb];
      bVar8 = pbVar37[-10];
      bVar9 = pbVar37[-9];
      bVar10 = pbVar37[-8];
      bVar11 = pbVar37[-7];
      bVar12 = pbVar37[-6];
      bVar13 = pbVar37[-5];
      bVar14 = pbVar37[-4];
      bVar15 = pbVar37[-3];
      bVar16 = pbVar37[-2];
      bVar17 = pbVar37[-1];
      bVar18 = *pbVar37;
      bVar19 = pbVar37[1];
      bVar20 = pbVar37[2];
      bVar21 = pbVar37[3];
      bVar22 = pbVar37[4];
      bVar23 = pbVar37[5];
      bVar24 = pbVar37[6];
      bVar25 = pbVar37[7];
      bVar26 = pbVar37[8];
      bVar27 = pbVar37[9];
      bVar28 = pbVar37[10];
      bVar29 = pbVar37[0xb];
      bVar30 = pbVar37[0xc];
      bVar31 = pbVar37[0xd];
      bVar32 = pbVar37[0xe];
      bVar33 = pbVar37[0xf];
      uVar39 = uVar39 - 0x20;
      pbVar37 = pbVar37 + 0x20;
      pbVar38[-8] = bVar10 ^ (bVar10 ^ param_3) & -((char)bVar10 < '\0');
      pbVar38[-7] = bVar11 ^ (bVar11 ^ param_3) & -((char)bVar11 < '\0');
      pbVar38[-6] = bVar12 ^ (bVar12 ^ param_3) & -((char)bVar12 < '\0');
      pbVar38[-5] = bVar13 ^ (bVar13 ^ param_3) & -((char)bVar13 < '\0');
      pbVar38[-4] = bVar14 ^ (bVar14 ^ param_3) & -((char)bVar14 < '\0');
      pbVar38[-3] = bVar15 ^ (bVar15 ^ param_3) & -((char)bVar15 < '\0');
      pbVar38[-2] = bVar16 ^ (bVar16 ^ param_3) & -((char)bVar16 < '\0');
      pbVar38[-1] = bVar17 ^ (bVar17 ^ param_3) & -((char)bVar17 < '\0');
      pbVar38[-0x10] = bVar2 ^ (bVar2 ^ param_3) & -((char)bVar2 < '\0');
      pbVar38[-0xf] = bVar3 ^ (bVar3 ^ param_3) & -((char)bVar3 < '\0');
      pbVar38[-0xe] = bVar4 ^ (bVar4 ^ param_3) & -((char)bVar4 < '\0');
      pbVar38[-0xd] = bVar5 ^ (bVar5 ^ param_3) & -((char)bVar5 < '\0');
      pbVar38[-0xc] = bVar6 ^ (bVar6 ^ param_3) & -((char)bVar6 < '\0');
      pbVar38[-0xb] = bVar7 ^ (bVar7 ^ param_3) & -((char)bVar7 < '\0');
      pbVar38[-10] = bVar8 ^ (bVar8 ^ param_3) & -((char)bVar8 < '\0');
      pbVar38[-9] = bVar9 ^ (bVar9 ^ param_3) & -((char)bVar9 < '\0');
      pbVar38[8] = bVar26 ^ (bVar26 ^ param_3) & -((char)bVar26 < '\0');
      pbVar38[9] = bVar27 ^ (bVar27 ^ param_3) & -((char)bVar27 < '\0');
      pbVar38[10] = bVar28 ^ (bVar28 ^ param_3) & -((char)bVar28 < '\0');
      pbVar38[0xb] = bVar29 ^ (bVar29 ^ param_3) & -((char)bVar29 < '\0');
      pbVar38[0xc] = bVar30 ^ (bVar30 ^ param_3) & -((char)bVar30 < '\0');
      pbVar38[0xd] = bVar31 ^ (bVar31 ^ param_3) & -((char)bVar31 < '\0');
      pbVar38[0xe] = bVar32 ^ (bVar32 ^ param_3) & -((char)bVar32 < '\0');
      pbVar38[0xf] = bVar33 ^ (bVar33 ^ param_3) & -((char)bVar33 < '\0');
      *pbVar38 = bVar18 ^ (bVar18 ^ param_3) & -((char)bVar18 < '\0');
      pbVar38[1] = bVar19 ^ (bVar19 ^ param_3) & -((char)bVar19 < '\0');
      pbVar38[2] = bVar20 ^ (bVar20 ^ param_3) & -((char)bVar20 < '\0');
      pbVar38[3] = bVar21 ^ (bVar21 ^ param_3) & -((char)bVar21 < '\0');
      pbVar38[4] = bVar22 ^ (bVar22 ^ param_3) & -((char)bVar22 < '\0');
      pbVar38[5] = bVar23 ^ (bVar23 ^ param_3) & -((char)bVar23 < '\0');
      pbVar38[6] = bVar24 ^ (bVar24 ^ param_3) & -((char)bVar24 < '\0');
      pbVar38[7] = bVar25 ^ (bVar25 ^ param_3) & -((char)bVar25 < '\0');
      pbVar38 = pbVar38 + 0x20;
    } while (uVar39 != 0);
    param_4 = param_4 + uVar36;
    if (uVar35 == uVar36) {
      return param_1;
    }
  }
  do {
    pcVar34 = param_1 + 1;
    cVar1 = param_3;
    if (-1 < *param_1) {
      cVar1 = *param_1;
    }
    *param_4 = cVar1;
    param_1 = pcVar34;
    param_4 = param_4 + 1;
  } while (pcVar34 != param_2);
  return pcVar34;
}

