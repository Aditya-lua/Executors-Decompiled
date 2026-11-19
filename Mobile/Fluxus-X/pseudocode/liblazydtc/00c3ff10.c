/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ff10
 */

int PKCS1_MGF1(uchar *mask,long len,uchar *seed,long seedlen,EVP_MD *dgst)

{
  int iVar1;
  
  iVar1 = PKCS1_MGF1(mask,len,seed,seedlen,dgst);
  return iVar1;
}

