/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc1d0
 */

int SSL_CTX_use_certificate_chain_file(SSL_CTX *ctx,char *file)

{
  int iVar1;
  
  iVar1 = FUN_009bc1dc((int)ctx,0,file);
  return iVar1;
}

