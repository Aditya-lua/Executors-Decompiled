/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9f04
 */

EVP_PKEY * ssl_generate_pkey(long param_1,long param_2)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  EVP_PKEY *local_18;
  
  local_18 = (EVP_PKEY *)0x0;
  if (param_2 == 0) {
    local_18 = (EVP_PKEY *)0x0;
  }
  else {
    ctx = (EVP_PKEY_CTX *)
          EVP_PKEY_CTX_new_from_pkey
                    (**(undefined8 **)(param_1 + 0x9a8),param_2,
                     (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if (((ctx != (EVP_PKEY_CTX *)0x0) && (iVar1 = EVP_PKEY_keygen_init(ctx), 0 < iVar1)) &&
       (iVar1 = EVP_PKEY_keygen(ctx,&local_18), iVar1 < 1)) {
      EVP_PKEY_free(local_18);
      local_18 = (EVP_PKEY *)0x0;
    }
    EVP_PKEY_CTX_free(ctx);
  }
  return local_18;
}

