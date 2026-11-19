/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b47930
 */

undefined8 FUN_00b47930(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = ossl_prov_ctx_get0_libctx(*param_1);
  if ((param_2 == 0) ||
     ((((uVar1 = ossl_prov_digest_load_from_params(param_1 + 1,param_2,uVar1), (int)uVar1 != 0 &&
        ((lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c3a6a), lVar2 == 0 ||
         (uVar1 = FUN_00b47a44(param_1 + 4,param_1 + 5,lVar2), (int)uVar1 != 0)))) &&
       ((lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c), lVar2 == 0 ||
        (uVar1 = FUN_00b47a44(param_1 + 6,param_1 + 7,lVar2), (int)uVar1 != 0)))) &&
      (((lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002be1ea), lVar2 == 0 ||
        (uVar1 = OSSL_PARAM_get_int(lVar2,param_1 + 9), (int)uVar1 != 0)) &&
       ((lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002ac172), lVar2 == 0 ||
        (uVar1 = OSSL_PARAM_get_uint64(lVar2,param_1 + 8), (int)uVar1 != 0)))))))) {
    uVar1 = 1;
  }
  return uVar1;
}

