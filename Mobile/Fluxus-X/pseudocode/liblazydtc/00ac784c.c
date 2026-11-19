/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac784c
 */

undefined8
ossl_rand_get_entropy
          (undefined8 param_1,undefined8 *param_2,undefined4 param_3,undefined8 param_4,
          undefined8 param_5)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  lVar1 = ossl_rand_pool_new(param_3,1,param_4,param_5);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/rand/prov_seed.c",0x19,"ossl_rand_get_entropy");
    ERR_set_error(0x24,0xc0100,0);
    uVar3 = 0;
  }
  else {
    lVar2 = ossl_pool_acquire_entropy();
    if (lVar2 == 0) {
      uVar3 = 0;
    }
    else {
      uVar3 = ossl_rand_pool_length(lVar1);
      uVar4 = ossl_rand_pool_detach(lVar1);
      *param_2 = uVar4;
    }
    ossl_rand_pool_free(lVar1);
  }
  return uVar3;
}

