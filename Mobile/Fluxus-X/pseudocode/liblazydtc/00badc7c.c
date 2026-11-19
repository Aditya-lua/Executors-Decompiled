/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00badc7c
 */

undefined8 mbedtls_sha512_starts(undefined8 *param_1,uint param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  bool bVar9;
  
  if (1 < param_2) {
    return 0xffffff8b;
  }
  bVar9 = param_2 != 0;
  uVar1 = 0x6a09e667f3bcc908;
  if (bVar9) {
    uVar1 = 0xcbbb9d5dc1059ed8;
  }
  uVar2 = 0xbb67ae8584caa73b;
  if (bVar9) {
    uVar2 = 0x629a292a367cd507;
  }
  uVar3 = 0x3c6ef372fe94f82b;
  if (bVar9) {
    uVar3 = 0x9159015a3070dd17;
  }
  uVar4 = 0xa54ff53a5f1d36f1;
  if (bVar9) {
    uVar4 = 0x152fecd8f70e5939;
  }
  uVar5 = 0x510e527fade682d1;
  if (bVar9) {
    uVar5 = 0x67332667ffc00b31;
  }
  uVar6 = 0x9b05688c2b3e6c1f;
  if (bVar9) {
    uVar6 = 0x8eb44a8768581511;
  }
  uVar7 = 0x1f83d9abfb41bd6b;
  if (bVar9) {
    uVar7 = 0xdb0c2e0d64f98fa7;
  }
  uVar8 = 0x5be0cd19137e2179;
  if (bVar9) {
    uVar8 = 0x47b5481dbefa4fa4;
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = uVar1;
  param_1[3] = uVar2;
  param_1[4] = uVar3;
  param_1[5] = uVar4;
  param_1[6] = uVar5;
  param_1[7] = uVar6;
  param_1[8] = uVar7;
  param_1[9] = uVar8;
  *(uint *)(param_1 + 0x1a) = param_2;
  return 0;
}

