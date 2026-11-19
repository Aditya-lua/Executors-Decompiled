/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bac92c
 */

undefined8 mbedtls_sha256_starts(long param_1,uint param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  bool bVar9;
  
  if (1 < param_2) {
    return 0xffffff8c;
  }
  bVar9 = param_2 != 0;
  uVar1 = 0x6a09e667;
  if (bVar9) {
    uVar1 = 0xc1059ed8;
  }
  uVar2 = 0x510e527f;
  uVar5 = 0xa54ff53a;
  uVar6 = 0x3c6ef372;
  uVar7 = 0xbb67ae85;
  if (bVar9) {
    uVar2 = 0xffc00b31;
    uVar5 = 0xf70e5939;
    uVar6 = 0x3070dd17;
    uVar7 = 0x367cd507;
  }
  uVar3 = 0x1f83d9ab;
  uVar8 = 0x9b05688c;
  if (bVar9) {
    uVar3 = 0x64f98fa7;
    uVar8 = 0x68581511;
  }
  uVar4 = 0x5be0cd19;
  if (bVar9) {
    uVar4 = 0xbefa4fa4;
  }
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined4 *)(param_1 + 0x48) = uVar1;
  *(undefined4 *)(param_1 + 0x4c) = uVar7;
  *(undefined4 *)(param_1 + 0x50) = uVar6;
  *(undefined4 *)(param_1 + 0x54) = uVar5;
  *(undefined4 *)(param_1 + 0x58) = uVar2;
  *(undefined4 *)(param_1 + 0x5c) = uVar8;
  *(undefined4 *)(param_1 + 0x60) = uVar3;
  *(undefined4 *)(param_1 + 100) = uVar4;
  *(uint *)(param_1 + 0x68) = param_2;
  return 0;
}

