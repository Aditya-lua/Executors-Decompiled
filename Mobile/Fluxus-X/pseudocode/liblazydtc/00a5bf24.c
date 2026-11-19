/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5bf24
 */

int EVP_CIPHER_CTX_set_key_length(EVP_CIPHER_CTX *x,int keylen)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  int arg;
  void *in_x3;
  EVP_CIPHER *pEVar4;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  long local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  
  if (x->cipher[1].do_cipher == (_func_1090 *)0x0) {
    if ((char)x->cipher->flags < '\0') {
      iVar1 = EVP_CIPHER_CTX_ctrl(x,1,keylen,(void *)0x0);
      return iVar1;
    }
    iVar1 = EVP_CIPHER_CTX_get_key_length(x);
    if (iVar1 == keylen) {
      return 1;
    }
    if ((0 < keylen) && (((byte)x->cipher->flags >> 3 & 1) != 0)) {
      x->key_len = keylen;
      return 1;
    }
    ERR_new();
    uVar3 = 0x42e;
  }
  else {
    arg = 0x50;
    memset(&local_70,0,0x50);
    local_78 = (long)keylen;
    iVar1 = EVP_CIPHER_CTX_get_key_length(x);
    if (iVar1 == keylen) {
      return 1;
    }
    pEVar4 = x->cipher;
    if ((pEVar4 == (EVP_CIPHER *)0x0) || (pEVar4[2].ctrl == (_func_1094 *)0x0)) {
      iVar1 = 0;
    }
    else {
      EVP_CIPHER_get0_provider(pEVar4);
      iVar1 = ossl_provider_ctx();
      iVar1 = (*pEVar4[2].ctrl)((EVP_CIPHER_CTX *)0x0,iVar1,arg,in_x3);
    }
    lVar2 = OSSL_PARAM_locate_const(iVar1,"keylen");
    if (lVar2 != 0) {
      OSSL_PARAM_construct_size_t(&local_a0,"keylen",&local_78);
      local_50 = local_80;
      uStack_68 = uStack_98;
      local_70 = local_a0;
      uStack_58 = uStack_88;
      uStack_60 = uStack_90;
      iVar1 = evp_do_ciph_ctx_setparams(x->cipher,x[1].cipher,&local_70);
      return (uint)(0 < iVar1);
    }
    ERR_new();
    uVar3 = 0x416;
  }
  ERR_set_debug("crypto/evp/evp_enc.c",uVar3,"EVP_CIPHER_CTX_set_key_length");
  ERR_set_error(6,0x82,0);
  return 0;
}

