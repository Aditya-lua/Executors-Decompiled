/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4c024
 */

undefined8 FUN_00b4c024(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = FUN_00b4cea0();
  if (((int)uVar1 != 0) &&
     ((lVar2 = OSSL_PARAM_locate_const(param_2,"safeprime-generator"), lVar2 == 0 ||
      (uVar1 = OSSL_PARAM_get_int(lVar2,param_1 + 0x40), (int)uVar1 != 0)))) {
    lVar2 = OSSL_PARAM_locate_const(param_2,"gindex");
    if (((lVar2 == 0) &&
        (((lVar2 = OSSL_PARAM_locate_const(param_2,"pcounter"), lVar2 == 0 &&
          (lVar2 = OSSL_PARAM_locate_const(param_2,"hindex"), lVar2 == 0)) &&
         (lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864), lVar2 == 0)))) &&
       (((lVar2 = OSSL_PARAM_locate_const(param_2,"qbits"), lVar2 == 0 &&
         (lVar2 = OSSL_PARAM_locate_const(param_2,"digest"), lVar2 == 0)) &&
        (lVar2 = OSSL_PARAM_locate_const(param_2,"properties"), lVar2 == 0)))) {
      uVar1 = 1;
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/dh_kmgmt.c",0x2a1,"dh_gen_set_params");
      ERR_set_error(0x39,0x80106,0);
      uVar1 = 0;
    }
  }
  return uVar1;
}

