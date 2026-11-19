/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1d1c
 */

ulong ZSTD_XXH64(uint *param_1,ulong param_2,ulong param_3)

{
  uint *puVar1;
  uint *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  uint *puVar10;
  ulong uVar11;
  
  if (param_1 == (uint *)0x0) {
    param_3 = param_3 + 0x27d4eb2f165667c5;
  }
  else {
    if (param_2 < 0x20) {
      lVar6 = param_3 + 0x27d4eb2f165667c5;
    }
    else {
      puVar10 = (uint *)((long)param_1 + (param_2 - 0x1f));
      uVar8 = param_3 + 0x60ea27eeadc0b5d6;
      uVar7 = param_3 + 0xc2b2ae3d27d4eb4f;
      uVar5 = param_3 + 0x61c8864e7a143579;
      do {
        uVar8 = uVar8 + *(long *)param_1 * -0x3d4d51c2d82b14b1;
        uVar7 = uVar7 + *(long *)(param_1 + 2) * -0x3d4d51c2d82b14b1;
        puVar1 = param_1 + 4;
        puVar2 = param_1 + 6;
        param_1 = param_1 + 8;
        param_3 = param_3 + *(long *)puVar1 * -0x3d4d51c2d82b14b1;
        uVar4 = uVar8 >> 0x21 | uVar8 * 0x80000000;
        uVar5 = uVar5 + *(long *)puVar2 * -0x3d4d51c2d82b14b1;
        uVar3 = uVar7 >> 0x21 | uVar7 * 0x80000000;
        uVar8 = uVar4 * -0x61c8864e7a143579;
        uVar11 = param_3 >> 0x21 | param_3 * 0x80000000;
        uVar7 = uVar3 * -0x61c8864e7a143579;
        uVar9 = uVar5 >> 0x21 | uVar5 * 0x80000000;
        param_3 = uVar11 * -0x61c8864e7a143579;
        uVar5 = uVar9 * -0x61c8864e7a143579;
      } while (param_1 < puVar10);
      lVar6 = (((((uVar7 >> 0x39 | uVar3 * 0x1bbcd8c2f5e54380) +
                  (uVar8 >> 0x3f | uVar4 * 0x3c6ef3630bd7950e) +
                  (param_3 >> 0x34 | uVar11 * 0x779b185ebca87000) +
                  (uVar5 >> 0x2e | uVar9 * -0x1939e850d5e40000) ^
                 (uVar4 * -0x210ca4fef0869357 >> 0x21 | uVar4 * -0x784349ab80000000) *
                 -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
                (uVar3 * -0x210ca4fef0869357 >> 0x21 | uVar3 * -0x784349ab80000000) *
                -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
               (uVar11 * -0x210ca4fef0869357 >> 0x21 | uVar11 * -0x784349ab80000000) *
               -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
              (uVar9 * -0x210ca4fef0869357 >> 0x21 | uVar9 * -0x784349ab80000000) *
              -0x61c8864e7a143579) * -0x61c8864e7a143579 + -0x7a1435883d4d519d;
    }
    param_3 = lVar6 + param_2;
    for (param_2 = param_2 & 0x1f; 7 < param_2; param_2 = param_2 - 8) {
      param_3 = ((ulong)(*(long *)param_1 * -0x3d4d51c2d82b14b1) >> 0x21 |
                *(long *)param_1 * -0x6c158a5880000000) * -0x61c8864e7a143579 ^ param_3;
      param_3 = (param_3 >> 0x25 | param_3 << 0x1b) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63;
      param_1 = param_1 + 2;
    }
    puVar10 = param_1;
    if (3 < param_2) {
      puVar10 = param_1 + 1;
      param_3 = (ulong)*param_1 * -0x61c8864e7a143579 ^ param_3;
      param_3 = (param_3 >> 0x29 | param_3 << 0x17) * -0x3d4d51c2d82b14b1 + 0x165667b19e3779f9;
      param_2 = param_2 - 4;
    }
    for (; param_2 != 0; param_2 = param_2 - 1) {
      param_3 = (ulong)(byte)*puVar10 * 0x27d4eb2f165667c5 ^ param_3;
      param_3 = (param_3 >> 0x35 | param_3 << 0xb) * -0x61c8864e7a143579;
      puVar10 = (uint *)((long)puVar10 + 1);
    }
  }
  uVar8 = (param_3 ^ param_3 >> 0x21) * -0x3d4d51c2d82b14b1;
  uVar8 = (uVar8 ^ uVar8 >> 0x1d) * 0x165667b19e3779f9;
  return uVar8 ^ uVar8 >> 0x20;
}

