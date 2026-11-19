/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a748f8
 */

EVP_PKEY * EVP_PKEY_new_mac_key(int type,ENGINE *e,uchar *key,int keylen)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  EVP_PKEY *pEVar2;
  EVP_PKEY *local_28;
  
  local_28 = (EVP_PKEY *)0x0;
  ctx = EVP_PKEY_CTX_new_id(type,e);
  pEVar2 = (EVP_PKEY *)0x0;
  if (ctx != (EVP_PKEY_CTX *)0x0) {
    iVar1 = FUN_00a74374(ctx,4);
    if ((0 < iVar1) && (iVar1 = EVP_PKEY_CTX_set_mac_key(ctx,key,keylen), 0 < iVar1)) {
      if (*(int *)ctx == 4) {
        EVP_PKEY_generate(ctx,&local_28);
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_gn.c",0x10f,"EVP_PKEY_keygen");
        ERR_set_error(6,0x97,0);
      }
    }
    EVP_PKEY_CTX_free(ctx);
    pEVar2 = local_28;
  }
  return pEVar2;
}

