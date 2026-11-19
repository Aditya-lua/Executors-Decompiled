/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a05000
 */

ulong bn_div_words(ulong h,ulong l,ulong d)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  int iVar11;
  
  if (d == 0) {
    return 0xffffffffffffffff;
  }
  uVar1 = BN_num_bits_word(d);
  uVar3 = 0;
  if (d <= h) {
    uVar3 = d;
  }
  uVar3 = h - uVar3;
  if (0x40 - uVar1 != 0) {
    uVar4 = (ulong)(0x40 - uVar1);
    d = d << (uVar4 & 0x3f);
    uVar3 = uVar3 << (uVar4 & 0x3f) | l >> ((ulong)uVar1 & 0x3f);
    l = l << (uVar4 & 0x3f);
  }
  uVar4 = d >> 0x20;
  uVar6 = 0;
  iVar5 = 2;
  do {
    if (uVar3 >> 0x20 == uVar4) {
      uVar7 = 0xffffffff;
    }
    else {
      uVar7 = 0;
      if (uVar4 != 0) {
        uVar7 = uVar3 / uVar4;
      }
    }
    lVar8 = uVar7 * uVar4;
    uVar10 = uVar3 - lVar8;
    uVar9 = uVar7 * (d & 0xffffffff);
    if (uVar10 >> 0x20 == 0) {
      uVar2 = (uVar3 << 0x20) - (uVar4 << 0x20) * uVar7;
      do {
        if (uVar9 <= (uVar2 | l >> 0x20)) break;
        uVar10 = uVar10 + uVar4;
        uVar7 = uVar7 - 1;
        lVar8 = lVar8 - uVar4;
        uVar9 = uVar9 - (d & 0xffffffff);
        uVar2 = uVar2 + (uVar4 << 0x20);
      } while (uVar10 >> 0x20 == 0);
    }
    uVar10 = lVar8 + (uVar9 >> 0x20);
    if (l < uVar9 << 0x20) {
      uVar10 = uVar10 + 1;
    }
    iVar5 = iVar5 + -1;
    uVar7 = uVar7 - (uVar3 < uVar10);
    if (iVar5 == 0) {
      return uVar7 | uVar6;
    }
    iVar11 = (int)d;
    if (uVar10 <= uVar3) {
      iVar11 = 0;
    }
    uVar6 = uVar7 << 0x20;
    uVar3 = l - (uVar9 << 0x20) >> 0x20 | (ulong)(uint)(((int)uVar3 - (int)uVar10) + iVar11) << 0x20
    ;
    l = l << 0x20;
  } while( true );
}

