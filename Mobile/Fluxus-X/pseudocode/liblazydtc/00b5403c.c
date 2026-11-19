/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5403c
 */

int CMAC_resume(CMAC_CTX *ctx)

{
  int iVar1;
  
  if (*(int *)(ctx + 0x88) == -1) {
    return 0;
  }
  iVar1 = EVP_EncryptInit_ex(*(EVP_CIPHER_CTX **)ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,
                             (uchar *)(ctx + 0x48));
  return iVar1;
}

