/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f130
 */

int X509_pubkey_digest(X509 *data,EVP_MD *type,uchar *md,uint *len)

{
  int iVar1;
  
  iVar1 = X509_pubkey_digest(data,type,md,len);
  return iVar1;
}

