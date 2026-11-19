/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2ae48
 */

undefined1  [16] FUN_00c2ae48(ulong param_1)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  bool bVar6;
  ulong uVar7;
  
  if (param_1 == 0) {
    return ZEXT816(0);
  }
  uVar2 = -param_1;
  if (-1 < (long)param_1) {
    uVar2 = param_1;
  }
  uVar1 = (int)LZCOUNT(uVar2) + 0x31;
  uVar7 = uVar2 << ((ulong)uVar1 & 0x3f);
  bVar6 = (uVar1 & 0x40) == 0;
  uVar3 = uVar7;
  if (bVar6) {
    uVar3 = (uVar2 >> 1) >> ((ulong)~uVar1 & 0x3f);
  }
  uVar4 = 0;
  if (bVar6) {
    uVar4 = uVar7;
  }
  auVar5._8_8_ = (uVar3 ^ 0x1000000000000) + ((ulong)(0x403e - (int)LZCOUNT(uVar2)) << 0x30) |
                 param_1 & 0x8000000000000000;
  auVar5._0_8_ = uVar4;
  return auVar5;
}

