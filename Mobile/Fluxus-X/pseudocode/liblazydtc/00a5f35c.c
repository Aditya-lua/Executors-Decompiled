/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f35c
 */

bool EVP_CIPHER_CTX_get_original_iv(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  memset(&local_80,0,0x50);
  OSSL_PARAM_construct_octet_string(&local_a8,&DAT_002bdad8,param_2,param_3);
  local_60 = local_88;
  uStack_78 = uStack_a0;
  local_80 = local_a8;
  uStack_68 = uStack_90;
  uStack_70 = local_98;
  iVar1 = evp_do_ciph_ctx_getparams(*param_1,param_1[0x15],&local_80);
  return 0 < iVar1;
}

