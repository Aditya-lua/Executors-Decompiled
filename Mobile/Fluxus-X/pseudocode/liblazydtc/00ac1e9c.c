/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac1e9c
 */

uint FUN_00ac1e9c(BIO *param_1,void *param_2,int param_3)

{
  uint uVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  BIO *b;
  
  uVar1 = 0;
  if ((param_2 != (void *)0x0) && (0 < param_3)) {
    ctx = (EVP_MD_CTX *)BIO_get_data();
    b = BIO_next(param_1);
    uVar1 = 0;
    if ((ctx != (EVP_MD_CTX *)0x0) && (b != (BIO *)0x0)) {
      uVar1 = BIO_write(b,param_2,param_3);
    }
    iVar2 = BIO_get_init(param_1);
    if ((((int)uVar1 < 1) || (iVar2 == 0)) ||
       (iVar2 = EVP_DigestUpdate(ctx,param_2,(ulong)uVar1), iVar2 != 0)) {
      if (b != (BIO *)0x0) {
        BIO_clear_flags(param_1,0xf);
        BIO_copy_next_retry(param_1);
      }
    }
    else {
      BIO_clear_flags(param_1,0xf);
      uVar1 = 0;
    }
  }
  return uVar1;
}

