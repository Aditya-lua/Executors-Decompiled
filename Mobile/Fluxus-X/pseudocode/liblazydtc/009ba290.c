/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba290
 */

bool FUN_009ba290(long param_1,char *param_2)

{
  int iVar1;
  SSL *ssl;
  
  if (*(SSL_CTX **)(param_1 + 0x18) == (SSL_CTX *)0x0) {
    iVar1 = 1;
    ssl = *(SSL **)(param_1 + 0x20);
  }
  else {
    iVar1 = SSL_CTX_use_PrivateKey_file(*(SSL_CTX **)(param_1 + 0x18),param_2,1);
    ssl = *(SSL **)(param_1 + 0x20);
  }
  if (ssl != (SSL *)0x0) {
    iVar1 = SSL_use_PrivateKey_file(ssl,param_2,1);
  }
  return 0 < iVar1;
}

