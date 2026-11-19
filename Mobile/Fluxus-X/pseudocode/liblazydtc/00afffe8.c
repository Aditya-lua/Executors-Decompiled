/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afffe8
 */

undefined8 ossl_punycode_decode(long param_1,ulong param_2,long param_3,uint *param_4)

{
  char *pcVar1;
  uint *__src;
  uint uVar2;
  byte bVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  long lVar17;
  
  uVar2 = *param_4;
  if (param_2 != 0) {
    uVar10 = 0;
    uVar6 = 1;
    uVar7 = 0;
    do {
      pcVar1 = (char *)(param_1 + uVar10);
      uVar15 = uVar6 - 1;
      uVar10 = (ulong)uVar6;
      uVar6 = uVar6 + 1;
      if (*pcVar1 != '-') {
        uVar15 = uVar7;
      }
      uVar7 = uVar15;
    } while (uVar10 < param_2);
    if (uVar15 != 0) {
      if (uVar2 < uVar15) {
        return 0;
      }
      uVar10 = 0;
      do {
        uVar11 = uVar10 & 0xffffffff;
        bVar3 = *(byte *)(param_1 + uVar11);
        if ((char)bVar3 < '\0') {
          return 0;
        }
        uVar10 = uVar10 + 1;
        *(uint *)(param_3 + uVar11 * 4) = (uint)bVar3;
      } while ((uint)uVar10 < uVar15);
      uVar15 = uVar15 + 1;
      goto LAB_00b00090;
    }
  }
  uVar15 = 0;
  uVar10 = 0;
LAB_00b00090:
  if (uVar15 < param_2) {
    uVar6 = 0;
    uVar16 = 0x48;
    uVar7 = 0x80;
    uVar11 = uVar10;
    do {
      uVar10 = (ulong)uVar15;
      if (param_2 <= uVar10) {
        return 0;
      }
      uVar12 = 1;
      uVar13 = 0x24;
      uVar9 = uVar6;
      while( true ) {
        uVar15 = uVar15 + 1;
        bVar3 = *(byte *)(param_1 + uVar10);
        uVar14 = bVar3 - 0x41;
        if ((0x19 < uVar14) && (uVar14 = bVar3 - 0x61, 0x19 < uVar14)) {
          if (9 < bVar3 - 0x30) {
            return 0;
          }
          uVar14 = bVar3 - 0x16;
        }
        if ((int)uVar14 < 0) {
          return 0;
        }
        uVar5 = 0;
        if (uVar12 != 0) {
          uVar5 = ~uVar9 / uVar12;
        }
        if (uVar5 < uVar14) {
          return 0;
        }
        if (uVar16 < uVar13) {
          uVar5 = uVar13 - uVar16;
          if (uVar16 + 0x1a <= uVar13) {
            uVar5 = 0x1a;
          }
        }
        else {
          uVar5 = 1;
        }
        uVar9 = uVar9 + uVar14 * uVar12;
        if (uVar14 < uVar5) break;
        uVar5 = 0x24 - uVar5;
        uVar14 = 0;
        if (uVar5 != 0) {
          uVar14 = 0xffffffff / uVar5;
        }
        if (uVar14 < uVar12) {
          return 0;
        }
        uVar12 = uVar5 * uVar12;
        uVar10 = (ulong)uVar15;
        uVar13 = uVar13 + 0x24;
        if (param_2 <= uVar10) {
          return 0;
        }
      }
      uVar10 = uVar11 + 1;
      uVar16 = (uVar9 - uVar6) / 700;
      if (uVar6 != 0) {
        uVar16 = uVar9 - uVar6 >> 1;
      }
      uVar6 = 0;
      if ((uint)uVar10 != 0) {
        uVar6 = uVar16 / (uint)uVar10;
      }
      uVar6 = uVar6 + uVar16;
      if (uVar6 < 0x1c8) {
        iVar8 = 0;
      }
      else {
        iVar8 = 0;
        do {
          uVar16 = uVar6 >> 3;
          uVar6 = uVar6 / 0x23;
          iVar8 = iVar8 + 0x24;
        } while (0x7ca < uVar16);
      }
      uVar4 = 0;
      if (uVar10 != 0) {
        uVar4 = uVar9 / uVar10;
      }
      if (~uVar7 < uVar4) {
        return 0;
      }
      if (uVar2 <= uVar11) {
        return 0;
      }
      lVar17 = (ulong)uVar9 - uVar4 * uVar10;
      uVar7 = uVar7 + (int)uVar4;
      uVar13 = uVar6 + 0x26 & 0xffff;
      __src = (uint *)(param_3 + lVar17 * 4);
      uVar16 = 0;
      if (uVar13 != 0) {
        uVar16 = (uVar6 * 0x24 & 0xfffc) / uVar13;
      }
      uVar16 = iVar8 + uVar16;
      memmove(__src + 1,__src,(uVar11 - lVar17) * 4);
      uVar6 = (int)lVar17 + 1;
      *__src = uVar7;
      uVar11 = uVar10;
    } while (uVar15 < param_2);
  }
  *param_4 = (uint)uVar10;
  return 1;
}

