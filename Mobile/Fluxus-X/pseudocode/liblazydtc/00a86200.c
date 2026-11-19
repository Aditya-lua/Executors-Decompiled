/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86200
 */

long FUN_00a86200(void)

{
  int iVar1;
  long lVar2;
  
  if (DAT_00d220a0 == 0) {
    lVar2 = EVP_CIPHER_meth_new(5,1,5);
    if ((((lVar2 == 0) || (iVar1 = EVP_CIPHER_meth_set_iv_length(lVar2,0), iVar1 == 0)) ||
        (iVar1 = EVP_CIPHER_meth_set_flags(lVar2,8), iVar1 == 0)) ||
       (((iVar1 = EVP_CIPHER_meth_set_init(lVar2,&LAB_00a862a8), iVar1 == 0 ||
         (iVar1 = EVP_CIPHER_meth_set_do_cipher(lVar2,&LAB_00a86340), iVar1 == 0)) ||
        (iVar1 = EVP_CIPHER_meth_set_impl_ctx_size(lVar2,0x112), iVar1 == 0)))) {
      EVP_CIPHER_meth_free(lVar2);
      lVar2 = 0;
    }
    DAT_00d220a0 = lVar2;
  }
  return DAT_00d220a0;
}

