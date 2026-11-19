/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3fdd0
 */

int RSA_private_decrypt(int flen,uchar *from,uchar *to,RSA *rsa,int padding)

{
  int iVar1;
  
  iVar1 = RSA_private_decrypt(flen,from,to,rsa,padding);
  return iVar1;
}

