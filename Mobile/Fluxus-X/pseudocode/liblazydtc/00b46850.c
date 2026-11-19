/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b46850
 */

undefined8 FUN_00b46850(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  
  uVar1 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    uVar1 = ossl_prov_cipher_load_from_params(param_1 + 1,param_2,uVar1);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (lVar2 != 0) {
      puVar3 = param_1 + 4;
      puVar4 = param_1 + 5;
      CRYPTO_clear_free(*puVar3,*puVar4,"providers/implementations/kdfs/krb5kdf.c",99);
      *puVar4 = 0;
      *puVar3 = 0;
      uVar1 = OSSL_PARAM_get_octet_string(lVar2,puVar3,0,puVar4);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"constant");
    if (lVar2 != 0) {
      puVar3 = param_1 + 6;
      param_1 = param_1 + 7;
      CRYPTO_clear_free(*puVar3,*param_1,"providers/implementations/kdfs/krb5kdf.c",99);
      *param_1 = 0;
      *puVar3 = 0;
      uVar1 = OSSL_PARAM_get_octet_string(lVar2,puVar3,0,param_1);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
    }
  }
  return 1;
}

