/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b2b0
 */

bool FUN_00b5b2b0(long param_1,void *param_2,undefined8 param_3,undefined4 param_4)

{
  long lVar1;
  long lVar2;
  void *__src;
  size_t __n;
  undefined4 uVar3;
  
  if (*(int *)(param_1 + 8) == 1) {
    lVar1 = ossl_rand_pool_new(param_4,1,param_3,param_3);
    if (lVar1 != 0) {
      lVar2 = ossl_pool_acquire_entropy();
      if (lVar2 != 0) {
        __src = (void *)ossl_rand_pool_buffer(lVar1);
        __n = ossl_rand_pool_length(lVar1);
        memcpy(param_2,__src,__n);
      }
      ossl_rand_pool_free(lVar1);
      return lVar2 != 0;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/rands/seed_src.c",0x6d,"seed_src_generate");
    uVar3 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/seed_src.c",0x67,"seed_src_generate");
    uVar3 = 0xc0;
    if (*(int *)(param_1 + 8) != 2) {
      uVar3 = 0xc1;
    }
  }
  ERR_set_error(0x39,uVar3,0);
  return false;
}

