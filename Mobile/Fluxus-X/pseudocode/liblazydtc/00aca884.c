/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca884
 */

undefined8 FUN_00aca884(undefined8 *param_1,ulong param_2)

{
  undefined4 uVar1;
  bool bVar2;
  void *__dest;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar6 = param_1[5];
  lVar4 = param_1[1];
  if (uVar6 - lVar4 < param_2) {
    if ((*(int *)(param_1 + 2) == 0) && (uVar5 = param_1[4], param_2 <= uVar5 - lVar4)) {
      do {
        bVar2 = uVar5 >> 1 <= uVar6;
        uVar6 = uVar6 << 1;
        if (bVar2) {
          uVar6 = uVar5;
        }
      } while (uVar6 - lVar4 < param_2);
      if (*(int *)((long)param_1 + 0x14) == 0) {
        __dest = (void *)CRYPTO_zalloc(uVar6,"crypto/rand/rand_pool.c",0xe0);
      }
      else {
        __dest = (void *)CRYPTO_secure_zalloc(uVar6,"crypto/rand/rand_pool.c",0xde);
      }
      if (__dest != (void *)0x0) {
        memcpy(__dest,(void *)*param_1,param_1[1]);
        if (*(int *)((long)param_1 + 0x14) == 0) {
          CRYPTO_clear_free(*param_1,param_1[5],"crypto/rand/rand_pool.c",0xe9);
        }
        else {
          CRYPTO_secure_clear_free();
        }
        *param_1 = __dest;
        param_1[5] = uVar6;
        goto LAB_00aca9c8;
      }
      ERR_new();
      ERR_set_debug("crypto/rand/rand_pool.c",0xe2,"rand_pool_grow");
      uVar1 = 0xc0100;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/rand/rand_pool.c",0xd5,"rand_pool_grow");
      uVar1 = 0xc0103;
    }
    ERR_set_error(0x24,uVar1,0);
    uVar3 = 0;
  }
  else {
LAB_00aca9c8:
    uVar3 = 1;
  }
  return uVar3;
}

