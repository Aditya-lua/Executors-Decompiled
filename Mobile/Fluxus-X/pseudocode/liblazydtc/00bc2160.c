/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2160
 */

ulong ZSTD_XXH64_digest(ulong *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong *puVar6;
  long lVar7;
  ulong uVar8;
  
  uVar5 = *param_1;
  if (uVar5 < 0x20) {
    lVar7 = param_1[3] + 0x27d4eb2f165667c5;
  }
  else {
    uVar8 = param_1[1];
    uVar2 = param_1[2];
    uVar1 = param_1[3];
    uVar3 = param_1[4];
    lVar7 = (((((uVar2 >> 0x39 | uVar2 << 7) + (uVar8 >> 0x3f | uVar8 << 1) +
                (uVar1 >> 0x34 | uVar1 << 0xc) + (uVar3 >> 0x2e | uVar3 << 0x12) ^
               (uVar8 * -0x3d4d51c2d82b14b1 >> 0x21 | uVar8 * -0x6c158a5880000000) *
               -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
              (uVar2 * -0x3d4d51c2d82b14b1 >> 0x21 | uVar2 * -0x6c158a5880000000) *
              -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
             (uVar1 * -0x3d4d51c2d82b14b1 >> 0x21 | uVar1 * -0x6c158a5880000000) *
             -0x61c8864e7a143579) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63 ^
            (uVar3 * -0x3d4d51c2d82b14b1 >> 0x21 | uVar3 * -0x6c158a5880000000) *
            -0x61c8864e7a143579) * -0x61c8864e7a143579 + -0x7a1435883d4d519d;
  }
  uVar8 = lVar7 + uVar5;
  puVar4 = param_1 + 5;
  for (uVar5 = uVar5 & 0x1f; 7 < uVar5; uVar5 = uVar5 - 8) {
    uVar8 = (*puVar4 * -0x3d4d51c2d82b14b1 >> 0x21 | *puVar4 * -0x6c158a5880000000) *
            -0x61c8864e7a143579 ^ uVar8;
    uVar8 = (uVar8 >> 0x25 | uVar8 << 0x1b) * -0x61c8864e7a143579 + 0x85ebca77c2b2ae63;
    puVar4 = puVar4 + 1;
  }
  puVar6 = puVar4;
  if (3 < uVar5) {
    puVar6 = (ulong *)((long)puVar4 + 4);
    uVar8 = (ulong)(uint)*puVar4 * -0x61c8864e7a143579 ^ uVar8;
    uVar8 = (uVar8 >> 0x29 | uVar8 << 0x17) * -0x3d4d51c2d82b14b1 + 0x165667b19e3779f9;
    uVar5 = uVar5 - 4;
  }
  for (; uVar5 != 0; uVar5 = uVar5 - 1) {
    uVar8 = (ulong)(byte)*puVar6 * 0x27d4eb2f165667c5 ^ uVar8;
    uVar8 = (uVar8 >> 0x35 | uVar8 << 0xb) * -0x61c8864e7a143579;
    puVar6 = (ulong *)((long)puVar6 + 1);
  }
  uVar5 = (uVar8 ^ uVar8 >> 0x21) * -0x3d4d51c2d82b14b1;
  uVar5 = (uVar5 ^ uVar5 >> 0x1d) * 0x165667b19e3779f9;
  return uVar5 ^ uVar5 >> 0x20;
}

