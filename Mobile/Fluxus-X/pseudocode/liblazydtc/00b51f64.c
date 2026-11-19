/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51f64
 */

ulong FUN_00b51f64(undefined8 *param_1,long param_2)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002adc98);
    if (lVar2 != 0) {
      uVar3 = OSSL_PARAM_get_size_t(lVar2,param_1 + 3);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      if ((ulong)param_1[3] < 0x200) {
        ERR_new();
        ERR_set_debug("providers/implementations/keymgmt/rsa_kmgmt.c",0x203,"rsa_gen_set_params");
        ERR_set_error(0x39,0xab,0);
        return 0;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"primes");
    if ((lVar2 != 0) && (uVar3 = OSSL_PARAM_get_size_t(lVar2,param_1 + 5), (int)uVar3 == 0)) {
      return uVar3;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002ab8a5);
    if ((lVar2 != 0) && (uVar3 = OSSL_PARAM_get_BN(lVar2,param_1 + 4), (int)uVar3 == 0)) {
      return uVar3;
    }
    if (*(int *)(param_1 + 2) == 0x1000) {
      iVar1 = ossl_rsa_pss_params_30_fromdata(param_1 + 6,(long)param_1 + 0x44,param_2,*param_1);
      return (ulong)(iVar1 != 0);
    }
  }
  return 1;
}

