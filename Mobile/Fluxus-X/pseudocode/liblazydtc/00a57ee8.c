/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57ee8
 */

int EVP_DigestInit_ex(EVP_MD_CTX *ctx,EVP_MD *type,ENGINE *impl)

{
  int iVar1;
  
  iVar1 = FUN_00a577c0((int)ctx,type,0,impl);
  return iVar1;
}

