/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bae50c
 */

undefined8 mbedtls_sha512(void *param_1,ulong param_2,undefined8 param_3,uint param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  bool bVar9;
  undefined8 uVar10;
  void *pvVar11;
  ulong uVar12;
  ulong local_148 [2];
  undefined8 local_138;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined1 auStack_f8 [128];
  uint local_78;
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  if (param_4 < 2) {
    bVar9 = param_4 != 0;
    uVar10 = 0x6a09e667f3bcc908;
    if (bVar9) {
      uVar10 = 0xcbbb9d5dc1059ed8;
    }
    uVar1 = 0xbb67ae8584caa73b;
    if (bVar9) {
      uVar1 = 0x629a292a367cd507;
    }
    uVar2 = 0x510e527fade682d1;
    if (bVar9) {
      uVar2 = 0x67332667ffc00b31;
    }
    uVar3 = 0x9b05688c2b3e6c1f;
    if (bVar9) {
      uVar3 = 0x8eb44a8768581511;
    }
    uVar4 = 0x1f83d9abfb41bd6b;
    if (bVar9) {
      uVar4 = 0xdb0c2e0d64f98fa7;
    }
    uVar5 = 0x3c6ef372fe94f82b;
    if (bVar9) {
      uVar5 = 0x9159015a3070dd17;
    }
    uVar6 = 0xa54ff53a5f1d36f1;
    if (bVar9) {
      uVar6 = 0x152fecd8f70e5939;
    }
    uVar7 = 0x5be0cd19137e2179;
    if (bVar9) {
      uVar7 = 0x47b5481dbefa4fa4;
    }
    memset(local_148,0,0xd8);
    local_138 = uVar10;
    local_130 = uVar1;
    uStack_128 = uVar5;
    local_120 = uVar6;
    uStack_118 = uVar2;
    local_110 = uVar3;
    uStack_108 = uVar4;
    local_100 = uVar7;
    local_78 = param_4;
    if (param_2 == 0) {
LAB_00bae71c:
      mbedtls_sha512_finish(local_148,param_3);
      uVar10 = 0;
    }
    else {
      local_148[0] = param_2;
      do {
        if (param_2 < 0x80) {
          if (param_2 != 0) {
            memcpy(auStack_f8,param_1,param_2);
          }
          goto LAB_00bae71c;
        }
        pvVar11 = param_1;
        uVar12 = param_2;
        do {
          mbedtls_internal_sha512_process(local_148,pvVar11);
          uVar12 = uVar12 - 0x80;
          pvVar11 = (void *)((long)pvVar11 + 0x80);
        } while (0x7f < uVar12);
        uVar12 = param_2 & 0xffffffffffffff80;
        param_1 = (void *)((long)param_1 + uVar12);
        param_2 = param_2 - uVar12;
      } while (uVar12 != 0);
      uVar10 = 0xffffffff;
    }
    mbedtls_platform_zeroize(local_148,0xd8);
  }
  else {
    uVar10 = 0xffffff8b;
  }
  if (*(long *)(lVar8 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar10;
}

