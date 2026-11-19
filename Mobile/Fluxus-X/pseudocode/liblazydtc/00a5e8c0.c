/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e8c0
 */

int EVP_CIPHER_CTX_get_iv_length(EVP_CIPHER_CTX *param_1)

{
  int iVar1;
  EVP_CIPHER *pEVar2;
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
  long local_30;
  int local_24;
  
  if (-1 < *(int *)&param_1->field_0x6c) {
    return *(int *)&param_1->field_0x6c;
  }
  pEVar2 = param_1->cipher;
  local_24 = pEVar2->iv_len;
  local_30 = (long)local_24;
  memset(&local_80,0,0x50);
  if (pEVar2[2].cleanup == (_func_1091 *)0x0) {
    if (((*(byte *)((long)&pEVar2->flags + 1) >> 3 & 1) == 0) ||
       (iVar1 = EVP_CIPHER_CTX_ctrl(param_1,0x25,0,&local_24), 0 < iVar1)) goto LAB_00a5e988;
  }
  else {
    OSSL_PARAM_construct_size_t(&local_a8,"ivlen",&local_30);
    local_60 = local_88;
    uStack_78 = uStack_a0;
    local_80 = local_a8;
    uStack_68 = uStack_90;
    uStack_70 = local_98;
    iVar1 = evp_do_ciph_ctx_getparams(param_1->cipher,param_1[1].cipher,&local_80);
    if (iVar1 < 1) {
      if (iVar1 == -1) goto LAB_00a5e988;
    }
    else {
      iVar1 = OSSL_PARAM_modified(&local_80);
      if ((iVar1 == 0) || (iVar1 = OSSL_PARAM_get_int(&local_80,&local_24), iVar1 != 0)) {
LAB_00a5e988:
        *(int *)&param_1->field_0x6c = local_24;
        return local_24;
      }
    }
  }
  return -1;
}

