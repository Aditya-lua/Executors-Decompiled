/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f250
 */

undefined8 * EVP_CIPHER_CTX_iv_noconst(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 *local_18;
  
  local_18 = param_1 + 5;
  memset(&local_70,0,0x50);
  OSSL_PARAM_construct_octet_ptr(&local_98,"updated-iv",&local_18,0x10);
  local_50 = local_78;
  uStack_68 = uStack_90;
  local_70 = local_98;
  uStack_58 = uStack_80;
  uStack_60 = local_88;
  iVar2 = evp_do_ciph_ctx_getparams(*param_1,param_1[0x15],&local_70);
  puVar1 = (undefined8 *)0x0;
  if (iVar2 != 0) {
    puVar1 = local_18;
  }
  return puVar1;
}

