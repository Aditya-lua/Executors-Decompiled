/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3fe00
 */

int RSA_public_encrypt(int flen,uchar *from,uchar *to,RSA *rsa,int padding)

{
  int iVar1;
  
  iVar1 = RSA_public_encrypt(flen,from,to,rsa,padding);
  return iVar1;
}

