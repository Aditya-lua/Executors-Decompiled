/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b46b44
 */

void FUN_00b46b44(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  
  uVar3 = *param_1;
  puVar1 = param_1 + 6;
  ossl_prov_digest_reset(puVar1);
  CRYPTO_free((void *)param_1[3]);
  CRYPTO_clear_free(param_1[1],param_1[2],"providers/implementations/kdfs/pbkdf2.c",0x57);
  memset(param_1 + 1,0,0x48);
  *param_1 = uVar3;
  memset(&local_90,0,0x50);
  uVar3 = ossl_prov_ctx_get0_libctx(uVar3);
  OSSL_PARAM_construct_utf8_string(&local_b8,"digest",&DAT_002d142e,0);
  local_70 = local_98;
  uStack_88 = uStack_b0;
  local_90 = local_b8;
  uStack_78 = uStack_a0;
  uStack_80 = local_a8;
  iVar2 = ossl_prov_digest_load_from_params(puVar1,&local_90,uVar3);
  if (iVar2 == 0) {
    ossl_prov_digest_reset(puVar1);
  }
  param_1[5] = 0x800;
  *(undefined4 *)(param_1 + 9) = 0;
  return;
}

