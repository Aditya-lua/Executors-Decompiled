/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b374
 */

/* WARNING: Removing unreachable block (ram,0x00c2b42c) */
/* WARNING: Removing unreachable block (ram,0x00c2b398) */
/* WARNING: Removing unreachable block (ram,0x00c2b5c0) */

undefined1  [16] FUN_00c2b374(ulong param_1,ulong param_2,ulong param_3,ulong param_4)

{
  uint uVar1;
  bool bVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined1 auVar12 [16];
  
  if (CARRY8(param_2,~param_4) || CARRY8(param_2 + ~param_4,(ulong)(param_3 <= param_1))) {
    if (param_4 == 0) {
      if (param_2 < param_3) {
        uVar3 = LZCOUNT(param_3);
        param_3 = param_3 << (uVar3 & 0x3f);
        uVar7 = param_3 >> 0x20;
        uVar4 = param_2 << (uVar3 & 0x3f) | (param_1 >> 1) >> ((ulong)~(uint)uVar3 & 0x3f);
        param_1 = param_1 << (uVar3 & 0x3f);
        uVar8 = 0;
        if (uVar7 != 0) {
          uVar8 = uVar4 / uVar7;
        }
        uVar9 = param_1 >> 0x20;
        uVar3 = uVar4 - uVar8 * uVar7;
        do {
          if ((uVar8 >> 0x20 == 0) && (uVar8 * (param_3 & 0xffffffff) <= (uVar9 | uVar3 << 0x20)))
          break;
          uVar3 = uVar3 + uVar7;
          uVar8 = uVar8 - 1;
        } while (uVar3 >> 0x20 == 0);
        uVar3 = (uVar9 | uVar4 << 0x20) - uVar8 * param_3;
        uVar4 = 0;
        if (uVar7 != 0) {
          uVar4 = uVar3 / uVar7;
        }
        uVar3 = uVar3 - uVar4 * uVar7;
        do {
          if ((uVar4 >> 0x20 == 0) &&
             (uVar4 * (param_3 & 0xffffffff) <= (param_1 & 0xffffffff | uVar3 << 0x20))) break;
          uVar3 = uVar3 + uVar7;
          uVar4 = uVar4 - 1;
        } while (uVar3 >> 0x20 == 0);
        uVar3 = 0;
        uVar4 = uVar4 + (uVar8 << 0x20);
      }
      else {
        uVar3 = 0;
        if (param_3 != 0) {
          uVar3 = param_2 / param_3;
        }
        uVar8 = LZCOUNT(param_3);
        uVar7 = param_3 << (uVar8 & 0x3f);
        uVar6 = param_1 << (uVar8 & 0x3f);
        uVar9 = uVar7 >> 0x20;
        uVar10 = uVar6 >> 0x20;
        uVar4 = param_2 - uVar3 * param_3 << (uVar8 & 0x3f) |
                (param_1 >> 1) >> ((ulong)~(uint)uVar8 & 0x3f);
        uVar8 = 0;
        if (uVar9 != 0) {
          uVar8 = uVar4 / uVar9;
        }
        uVar11 = uVar4 - uVar8 * uVar9;
        do {
          if ((uVar8 >> 0x20 == 0) && (uVar8 * (uVar7 & 0xffffffff) <= (uVar10 | uVar11 << 0x20)))
          break;
          uVar11 = uVar11 + uVar9;
          uVar8 = uVar8 - 1;
        } while (uVar11 >> 0x20 == 0);
        uVar10 = (uVar10 | uVar4 << 0x20) - uVar8 * uVar7;
        uVar4 = 0;
        if (uVar9 != 0) {
          uVar4 = uVar10 / uVar9;
        }
        uVar10 = uVar10 - uVar4 * uVar9;
        do {
          if ((uVar4 >> 0x20 == 0) &&
             (uVar4 * (uVar7 & 0xffffffff) <= (uVar6 & 0xffffffff | uVar10 << 0x20))) break;
          uVar10 = uVar10 + uVar9;
          uVar4 = uVar4 - 1;
        } while (uVar10 >> 0x20 == 0);
        uVar4 = uVar4 + (uVar8 << 0x20);
      }
      goto LAB_00c2b434;
    }
    uVar4 = 0;
    uVar1 = (uint)LZCOUNT(param_4) - (int)LZCOUNT(param_2);
    if (-1 < (int)uVar1) {
      uVar8 = param_3 << ((ulong)uVar1 & 0x3f);
      bVar2 = (uVar1 & 0x40) == 0;
      uVar3 = 0;
      if (bVar2) {
        uVar3 = uVar8;
      }
      if (bVar2) {
        uVar8 = param_4 << ((ulong)uVar1 & 0x3f) | (param_3 >> 1) >> ((ulong)~uVar1 & 0x3f);
      }
      iVar5 = ~(uint)LZCOUNT(param_4) + (int)LZCOUNT(param_2);
      do {
        uVar6 = uVar8 + ~param_2 + (ulong)CARRY8(uVar3,~param_1);
        uVar4 = uVar6 >> 0x3f | uVar4 << 1;
        uVar9 = uVar8;
        uVar7 = uVar3;
        if ((uVar6 & 0x8000000000000000) == 0) {
          uVar7 = 0;
          uVar9 = 0;
        }
        uVar3 = uVar3 >> 1 | uVar8 << 0x3f;
        bVar2 = param_1 < uVar7;
        param_1 = param_1 - uVar7;
        uVar8 = uVar8 >> 1;
        param_2 = param_2 - (uVar9 + bVar2);
        bVar2 = iVar5 != -1;
        iVar5 = iVar5 + 1;
      } while (bVar2);
    }
  }
  else {
    uVar4 = 0;
  }
  uVar3 = 0;
LAB_00c2b434:
  auVar12._8_8_ = uVar3;
  auVar12._0_8_ = uVar4;
  return auVar12;
}

