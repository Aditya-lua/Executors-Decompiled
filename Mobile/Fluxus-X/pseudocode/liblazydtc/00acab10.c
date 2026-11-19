/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acab10
 */

long ossl_rand_pool_add_begin(long *param_1,ulong param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_2 != 0) {
    if ((ulong)(param_1[4] - param_1[1]) < param_2) {
      ERR_new();
      ERR_set_debug("crypto/rand/rand_pool.c",0x16e,"ossl_rand_pool_add_begin");
      uVar2 = 0x7d;
    }
    else {
      if (*param_1 != 0) {
        iVar1 = FUN_00aca884(param_1);
        if (iVar1 == 0) {
          return 0;
        }
        return *param_1 + param_1[1];
      }
      ERR_new();
      ERR_set_debug("crypto/rand/rand_pool.c",0x173,"ossl_rand_pool_add_begin");
      uVar2 = 0xc0103;
    }
    ERR_set_error(0x24,uVar2,0);
  }
  return 0;
}

