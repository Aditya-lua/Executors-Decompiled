/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e669c
 */

/* std::__ndk1::__murmur2_or_cityhash<unsigned long, 64ul>::TEMPNAMEPLACEHOLDERVALUE(void const*,
   unsigned long) */

long __thiscall
std::__ndk1::__murmur2_or_cityhash<unsigned_long,64ul>::operator()
          (__murmur2_or_cityhash<unsigned_long,64ul> *this,void *param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  
  if (0x20 < param_2) {
    if (param_2 < 0x41) {
      lVar14 = *(long *)((long)param_1 + (param_2 - 0x10));
      lVar2 = *(long *)((long)param_1 + 0x18);
      uVar11 = *(long *)param_1 + (lVar14 + param_2) * -0x3c5a37a36834ced9;
      uVar6 = uVar11 + *(long *)((long)param_1 + 8);
      uVar7 = *(long *)((long)param_1 + (param_2 - 0x20)) + *(long *)((long)param_1 + 0x10);
      uVar10 = uVar6 + *(long *)((long)param_1 + 0x10);
      lVar3 = *(long *)((long)param_1 + (param_2 - 8)) + lVar2;
      uVar12 = lVar3 + uVar7;
      uVar9 = *(long *)((long)param_1 + (param_2 - 0x18)) + uVar7;
      uVar13 = uVar9 + lVar14;
      lVar14 = (uVar6 >> 7 | uVar6 << 0x39) + (uVar11 >> 0x25 | uVar11 * 0x8000000) +
               (uVar11 + lVar2 >> 0x34 | (uVar11 + lVar2) * 0x1000) +
               (uVar10 >> 0x1f | uVar10 << 0x21);
      uVar6 = (uVar13 + lVar3 + lVar14) * -0x3c5a37a36834ced9 +
              (uVar10 + lVar2 + (uVar7 >> 0x25 | uVar7 * 0x8000000) + (uVar9 >> 7 | uVar9 << 0x39) +
               (uVar12 >> 0x34 | uVar12 * 0x1000) + (uVar13 >> 0x1f | uVar13 << 0x21)) *
              -0x651e95c4d06fbfb1;
      uVar6 = lVar14 + (uVar6 ^ uVar6 >> 0x2f) * -0x3c5a37a36834ced9;
      return (uVar6 ^ uVar6 >> 0x2f) * -0x651e95c4d06fbfb1;
    }
    lVar14 = *(long *)((long)param_1 + (param_2 - 0x30));
    lVar2 = *(long *)((long)param_1 + (param_2 - 0x28));
    lVar15 = *(long *)((long)param_1 + (param_2 - 0x38));
    uVar13 = *(ulong *)((long)param_1 + (param_2 - 0x18));
    lVar3 = *(long *)((long)param_1 + (param_2 - 0x40)) + param_2;
    lVar5 = *(long *)((long)param_1 + (param_2 - 0x10));
    uVar11 = (uVar13 ^ lVar14 + param_2) * -0x622015f714c7d297;
    uVar6 = lVar3 + lVar15 + lVar14;
    lVar8 = *(long *)((long)param_1 + (param_2 - 8));
    uVar7 = lVar15 + lVar5;
    lVar14 = uVar7 + *(long *)((long)param_1 + (param_2 - 0x20)) + -0x4b6d499041670d8d;
    uVar10 = lVar14 + uVar13 + lVar5;
    uVar12 = lVar14 + lVar2 + lVar8;
    plVar4 = (long *)((long)param_1 + 0x20);
    lVar15 = *(long *)param_1;
    uVar9 = uVar10 + lVar8;
    uVar10 = (uVar10 >> 0x2c | uVar10 * 0x100000) + lVar14 + (uVar12 >> 0x15 | uVar12 << 0x2b);
    uVar12 = uVar6 + lVar2;
    lVar14 = lVar15 + lVar2 * -0x4b6d499041670d8d;
    uVar13 = (uVar11 ^ uVar13 ^ uVar11 >> 0x2f) * -0x622015f714c7d297;
    uVar11 = (uVar13 ^ uVar13 >> 0x2f) * -0x622015f714c7d297;
    uVar13 = lVar2 + lVar3 + uVar11;
    uVar6 = (uVar6 >> 0x2c | uVar6 * 0x100000) + lVar3 + (uVar13 >> 0x15 | uVar13 << 0x2b);
    lVar3 = -(param_2 - 1 & 0xffffffffffffffc0);
    while( true ) {
      lVar3 = lVar3 + 0x40;
      lVar15 = lVar15 + uVar6 * -0x4b6d499041670d8d;
      lVar2 = lVar14 + uVar12 + uVar7;
      lVar14 = (uVar11 + uVar9 >> 0x21 | (uVar11 + uVar9) * 0x80000000) * -0x4b6d499041670d8d;
      lVar5 = lVar14 + uVar10 + *plVar4;
      uVar6 = uVar7 + uVar6 + plVar4[2];
      uVar7 = plVar4[1] + uVar12 + (uVar6 >> 0x2a | uVar6 * 0x400000) * -0x4b6d499041670d8d;
      lVar8 = lVar15 + uVar9;
      uVar13 = lVar5 + plVar4[1] + plVar4[2];
      uVar6 = lVar2 + plVar4[-3];
      uVar1 = lVar15 + plVar4[-3] + plVar4[-2];
      uVar12 = uVar1 + plVar4[-1];
      uVar11 = (uVar6 >> 0x25 | uVar6 * 0x8000000) * -0x4b6d499041670d8d ^ uVar10;
      uVar9 = uVar13 + plVar4[3];
      uVar6 = lVar8 + plVar4[-1] + uVar11;
      uVar10 = uVar7 + plVar4[-2] + lVar5 + plVar4[3];
      uVar6 = (uVar1 >> 0x2c | uVar1 * 0x100000) + lVar15 + (uVar6 >> 0x15 | uVar6 << 0x2b);
      uVar10 = (uVar13 >> 0x2c | uVar13 * 0x100000) + lVar5 + (uVar10 >> 0x15 | uVar10 << 0x2b);
      if (lVar3 == 0) break;
      lVar15 = plVar4[4];
      plVar4 = plVar4 + 8;
    }
    uVar13 = (uVar9 ^ uVar12) * -0x622015f714c7d297;
    uVar12 = (uVar10 ^ uVar6) * -0x622015f714c7d297;
    uVar6 = (uVar13 ^ uVar9 ^ uVar13 >> 0x2f) * -0x622015f714c7d297;
    uVar10 = (uVar12 ^ uVar10 ^ uVar12 >> 0x2f) * -0x622015f714c7d297;
    uVar10 = lVar14 + (uVar10 ^ uVar10 >> 0x2f) * -0x622015f714c7d297;
    uVar6 = (uVar10 ^ uVar11 + (uVar7 ^ uVar7 >> 0x2f) * -0x4b6d499041670d8d +
                      (uVar6 ^ uVar6 >> 0x2f) * -0x622015f714c7d297) * -0x622015f714c7d297;
    uVar6 = (uVar6 ^ uVar10 ^ uVar6 >> 0x2f) * -0x622015f714c7d297;
    return (uVar6 ^ uVar6 >> 0x2f) * -0x622015f714c7d297;
  }
  if (param_2 < 0x11) {
    lVar3 = __hash_len_0_to_16(param_1,param_2);
    return lVar3;
  }
  lVar3 = *(long *)((long)param_1 + (param_2 - 8));
  uVar6 = *(ulong *)((long)param_1 + 8) ^ 0xc949d7c7509e6557;
  uVar7 = *(long *)param_1 * -0x4b6d499041670d8d - *(ulong *)((long)param_1 + 8);
  uVar6 = *(long *)param_1 * -0x4b6d499041670d8d + param_2 + lVar3 * 0x651e95c4d06fbfb1 +
          (uVar6 >> 0x14 | uVar6 << 0x2c);
  uVar7 = ((uVar7 >> 0x2b | uVar7 * 0x200000) +
           *(long *)((long)param_1 + (param_2 - 0x10)) * -0x3c5a37a36834ced9 +
           (lVar3 * -0x41befec400000000 | (ulong)(lVar3 * -0x651e95c4d06fbfb1) >> 0x1e) ^ uVar6) *
          -0x622015f714c7d297;
  uVar6 = (uVar7 ^ uVar6 ^ uVar7 >> 0x2f) * -0x622015f714c7d297;
  return (uVar6 ^ uVar6 >> 0x2f) * -0x622015f714c7d297;
}

