/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35850
 */

int i2b_PrivateKey_bio(BIO *out,EVP_PKEY *pk)

{
  int len;
  int iVar1;
  void *local_28;
  
  local_28 = (void *)0x0;
  len = FUN_00b36458(&local_28,pk,0);
  if (len < 0) {
    len = -1;
  }
  else {
    iVar1 = BIO_write(out,local_28,len);
    CRYPTO_free(local_28);
    if (iVar1 != len) {
      len = -1;
    }
  }
  return len;
}

