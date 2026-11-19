/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2ad94
 */

undefined1  [16] FUN_00c2ad94(ulong param_1)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  bool bVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  
  uVar10 = param_1 >> 0x34 & 0x7ff;
  uVar8 = param_1 & 0xfffffffffffff;
  if (uVar10 != 0) {
    lVar2 = 0x7fff;
    if (uVar10 != 0x7ff) {
      lVar2 = uVar10 + 0x3c00;
    }
    auVar4._8_8_ = param_1 & 0x8000000000000000 | lVar2 << 0x30 | uVar8 >> 4;
    auVar4._0_8_ = param_1 << 0x3c;
    return auVar4;
  }
  if (uVar8 == 0) {
    auVar6._8_8_ = 0;
    auVar6._0_8_ = param_1 & 0x8000000000000000;
    return auVar6 << 0x40;
  }
  uVar1 = (int)LZCOUNT(uVar8) + 0x31;
  uVar9 = uVar8 << ((ulong)uVar1 & 0x3f);
  bVar7 = (uVar1 & 0x40) == 0;
  uVar10 = uVar9;
  if (bVar7) {
    uVar10 = (uVar8 >> 1) >> ((ulong)~uVar1 & 0x3f);
  }
  uVar3 = 0;
  if (bVar7) {
    uVar3 = uVar9;
  }
  auVar5._8_8_ = param_1 & 0x8000000000000000 | (ulong)(0x3c0c - (int)LZCOUNT(uVar8)) << 0x30 |
                 uVar10 ^ 0x1000000000000;
  auVar5._0_8_ = uVar3;
  return auVar5;
}

