/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bad64c
 */

undefined8 mbedtls_sha256(void *param_1,ulong param_2,undefined8 param_3,uint param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  long lVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  bool bVar10;
  undefined8 uVar11;
  void *pvVar12;
  ulong uVar13;
  undefined1 auStack_d8 [64];
  undefined4 local_98;
  undefined4 local_90;
  undefined4 local_8c;
  undefined4 uStack_88;
  undefined4 local_84;
  undefined4 uStack_80;
  undefined4 local_7c;
  undefined4 uStack_78;
  undefined4 local_74;
  uint uStack_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if (param_4 < 2) {
    bVar10 = param_4 != 0;
    uVar1 = 0x6a09e667;
    if (bVar10) {
      uVar1 = 0xc1059ed8;
    }
    uVar2 = 0x510e527f;
    uVar9 = 0xbb67ae85;
    if (bVar10) {
      uVar2 = 0xffc00b31;
      uVar9 = 0x367cd507;
    }
    uVar3 = 0x1f83d9ab;
    uVar6 = 0x9b05688c;
    if (bVar10) {
      uVar3 = 0x64f98fa7;
      uVar6 = 0x68581511;
    }
    uVar4 = 0x5be0cd19;
    uVar7 = 0xa54ff53a;
    uVar8 = 0x3c6ef372;
    if (bVar10) {
      uVar4 = 0xbefa4fa4;
      uVar7 = 0xf70e5939;
      uVar8 = 0x3070dd17;
    }
    memset(auStack_d8,0,0x48);
    local_90 = uVar1;
    local_8c = uVar9;
    uStack_88 = uVar8;
    local_84 = uVar7;
    uStack_80 = uVar2;
    local_7c = uVar6;
    uStack_78 = uVar3;
    local_74 = uVar4;
    uStack_70 = param_4;
    if (param_2 == 0) {
LAB_00bad7d4:
      mbedtls_sha256_finish(auStack_d8,param_3);
      uVar11 = 0;
    }
    else {
      local_98 = (undefined4)param_2;
      do {
        if (param_2 < 0x40) {
          if (param_2 != 0) {
            memcpy(auStack_d8,param_1,param_2);
          }
          goto LAB_00bad7d4;
        }
        pvVar12 = param_1;
        uVar13 = param_2;
        do {
          mbedtls_internal_sha256_process(auStack_d8,pvVar12);
          uVar13 = uVar13 - 0x40;
          pvVar12 = (void *)((long)pvVar12 + 0x40);
        } while (0x3f < uVar13);
        uVar13 = param_2 & 0xffffffffffffffc0;
        param_1 = (void *)((long)param_1 + uVar13);
        param_2 = param_2 - uVar13;
      } while (uVar13 != 0);
      uVar11 = 0xffffffff;
    }
    mbedtls_platform_zeroize(auStack_d8,0x6c);
  }
  else {
    uVar11 = 0xffffff8c;
  }
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar11;
}

