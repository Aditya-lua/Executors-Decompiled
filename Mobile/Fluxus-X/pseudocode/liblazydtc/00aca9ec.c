/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca9ec
 */

undefined8 ossl_rand_pool_add(long *param_1,void *param_2,ulong param_3,long param_4)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar2 = param_1[1];
  if (param_1[4] - uVar2 < param_3) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_pool.c",0x135,"ossl_rand_pool_add");
    uVar1 = 0x6a;
  }
  else {
    if (*param_1 == 0) {
      ERR_new();
      uVar1 = 0x13a;
    }
    else {
      if (param_3 == 0) {
        return 1;
      }
      if (((void *)(*param_1 + uVar2) != param_2) || ((ulong)param_1[5] <= uVar2)) {
        uVar1 = FUN_00aca884(param_1,param_3);
        if ((int)uVar1 == 0) {
          return uVar1;
        }
        memcpy((void *)(*param_1 + param_1[1]),param_2,param_3);
        param_1[1] = param_1[1] + param_3;
        param_1[6] = param_1[6] + param_4;
        return 1;
      }
      ERR_new();
      uVar1 = 0x148;
    }
    ERR_set_debug("crypto/rand/rand_pool.c",uVar1,"ossl_rand_pool_add");
    uVar1 = 0xc0103;
  }
  ERR_set_error(0x24,uVar1,0);
  return 0;
}

