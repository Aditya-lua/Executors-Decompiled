/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a1ddc
 */

/* int 
   std::__ndk1::uniform_int_distribution<int>::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::linear_congruential_engine<unsigned
   long, 48271ul, 0ul, 2147483647ul>&, std::__ndk1::uniform_int_distribution<int>::param_type
   const&) */

int __thiscall
std::__ndk1::uniform_int_distribution<int>::operator()
          (uniform_int_distribution<int> *this,linear_congruential_engine *param_1,
          param_type *param_2)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  uint uVar12;
  uint uVar13;
  
  iVar2 = *(int *)param_2;
  if (*(int *)(param_2 + 4) - iVar2 == 0) {
    return iVar2;
  }
  uVar1 = (*(int *)(param_2 + 4) - iVar2) + 1;
  if (uVar1 == 0) {
    uVar7 = *(ulong *)param_1;
    do {
      uVar7 = (uVar7 * 0xbc8f) % 0x7fffffff;
      uVar10 = uVar7 - 1;
    } while (0x7ffeffff < uVar10);
    do {
      uVar7 = (uVar7 * 0xbc8f) % 0x7fffffff;
    } while (0x7ffeffff < uVar7 - 1);
    *(ulong *)param_1 = uVar7;
    return (uint)(uVar7 - 1) & 0xffff | (int)uVar10 << 0x10;
  }
  uVar10 = (0x20 - LZCOUNT(uVar1)) -
           (ulong)((0xffffffffU >> (ulong)(0x21U - (int)(0x20 - LZCOUNT(uVar1)) & 0x1f) & uVar1) ==
                  0);
  uVar7 = uVar10 / 0x1e;
  if (uVar10 % 0x1e != 0) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = 0;
  if (uVar7 != 0) {
    uVar8 = uVar10 / uVar7;
  }
  uVar9 = (0x7ffffffeUL >> (uVar8 & 0x3f)) << (uVar8 & 0x3f);
  if (0x3f < uVar8) {
    uVar9 = 0;
  }
  uVar11 = 0;
  if (uVar7 != 0) {
    uVar11 = uVar9 / uVar7;
  }
  if (uVar11 < 0x7ffffffe - uVar9) {
    uVar7 = uVar7 + 1;
    uVar8 = 0;
    if (uVar7 != 0) {
      uVar8 = uVar10 / uVar7;
    }
    if (uVar8 < 0x40) {
      uVar9 = (0x7ffffffeUL >> (uVar8 & 0x3f)) << (uVar8 & 0x3f);
      goto LAB_009a1e7c;
    }
    uVar9 = 0;
    uVar10 = uVar7 - (uVar10 - uVar8 * uVar7);
  }
  else {
LAB_009a1e7c:
    uVar11 = 0;
    if (uVar7 != 0) {
      uVar11 = uVar10 / uVar7;
    }
    uVar10 = uVar7 - (uVar10 - uVar11 * uVar7);
    if (uVar8 < 0x3f) {
      uVar11 = (0x7ffffffeUL >> (uVar8 + 1 & 0x3f)) << (uVar8 + 1 & 0x3f);
      uVar13 = 0;
      if (uVar8 != 0) {
        uVar13 = (uint)(0xffffffffffffffff >> (0x40 - uVar8 & 0x3f));
      }
      uVar12 = (uint)(0xffffffffffffffff >> (0x3f - uVar8 & 0x3f));
      goto LAB_009a1f78;
    }
  }
  uVar12 = 0xffffffff;
  uVar11 = 0;
  uVar13 = 0;
  if (uVar8 != 0) {
    uVar13 = (uint)(0xffffffffffffffff >> (0x40 - uVar8 & 0x3f));
  }
LAB_009a1f78:
  do {
    while (uVar4 = 0, uVar10 != 0) {
      uVar5 = *(ulong *)param_1;
      uVar6 = 0;
      do {
        do {
          uVar5 = (uVar5 * 0xbc8f) % 0x7fffffff;
        } while (uVar9 <= uVar5 - 1);
        iVar3 = uVar4 << (ulong)((uint)uVar8 & 0x1f);
        uVar6 = uVar6 + 1;
        if (0x1f < uVar8) {
          iVar3 = 0;
        }
        uVar4 = iVar3 + ((uint)(uVar5 - 1) & uVar13);
      } while (uVar6 != uVar10);
      *(ulong *)param_1 = uVar5;
      uVar6 = uVar10;
      if (uVar10 < uVar7) goto LAB_009a200c;
LAB_009a1ff4:
      if (uVar4 < uVar1) goto LAB_009a2068;
    }
    uVar6 = 0;
    if (uVar7 == 0) goto LAB_009a1ff4;
LAB_009a200c:
    uVar5 = *(ulong *)param_1;
    do {
      do {
        uVar5 = (uVar5 * 0xbc8f) % 0x7fffffff;
      } while (uVar11 <= uVar5 - 1);
      iVar3 = uVar4 << (ulong)((uint)uVar8 + 1 & 0x1f);
      uVar6 = uVar6 + 1;
      if (0x1e < uVar8) {
        iVar3 = 0;
      }
      uVar4 = iVar3 + ((uint)(uVar5 - 1) & uVar12);
    } while (uVar6 != uVar7);
    *(ulong *)param_1 = uVar5;
  } while (uVar1 <= uVar4);
LAB_009a2068:
  return uVar4 + iVar2;
}

