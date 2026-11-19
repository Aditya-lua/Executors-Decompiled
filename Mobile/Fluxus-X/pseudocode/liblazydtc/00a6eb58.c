/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6eb58
 */

long EVP_PKEY_get1_encoded_public_key(long param_1,undefined8 *param_2)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *ptr;
  code *pcVar4;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  long local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  long local_78;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x60) == 0) {
      if (((*(long *)(param_1 + 8) != 0) &&
          (pcVar4 = *(code **)(*(long *)(param_1 + 8) + 0xb0), pcVar4 != (code *)0x0)) &&
         (iVar2 = (*pcVar4)(param_1,10,0,param_2), 0 < iVar2)) {
        return (long)iVar2;
      }
    }
    else {
      OSSL_PARAM_construct_octet_string(&local_68,"encoded-pub-key",0,0);
      local_a0 = local_48;
      uStack_b8 = uStack_60;
      local_c0 = local_68;
      uStack_a8 = uStack_50;
      uStack_b0 = local_58;
      OSSL_PARAM_construct_end(&local_68);
      local_78 = local_48;
      uStack_80 = uStack_50;
      local_88 = local_58;
      uStack_90 = uStack_60;
      local_98 = local_68;
      iVar2 = EVP_PKEY_get_params(param_1,&local_c0);
      if (((iVar2 != 0) && (iVar2 = OSSL_PARAM_modified(&local_c0), lVar1 = local_a0, iVar2 != 0))
         && (local_a0 != -1)) {
        *param_2 = 0;
        ptr = CRYPTO_malloc((int)local_a0,"crypto/evp/p_lib.c",0x58c);
        if (ptr != (void *)0x0) {
          OSSL_PARAM_construct_octet_string(&local_68,"encoded-pub-key",ptr,lVar1);
          local_a0 = local_48;
          uStack_b8 = uStack_60;
          local_c0 = local_68;
          uStack_a8 = uStack_50;
          uStack_b0 = local_58;
          OSSL_PARAM_construct_end(&local_68);
          local_78 = local_48;
          uStack_90 = uStack_60;
          local_98 = local_68;
          uStack_80 = uStack_50;
          local_88 = local_58;
          iVar2 = EVP_PKEY_get_params(param_1,&local_c0);
          if (((iVar2 != 0) && (iVar3 = OSSL_PARAM_modified(&local_c0), iVar2 != 0)) && (iVar3 != 0)
             ) {
            *param_2 = ptr;
            return lVar1;
          }
          CRYPTO_free(ptr);
        }
      }
    }
  }
  return 0;
}

