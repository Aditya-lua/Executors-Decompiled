/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ffe0
 */

int RSA_padding_add_PKCS1_PSS_mgf1
              (RSA *rsa,uchar *EM,uchar *mHash,EVP_MD *Hash,EVP_MD *mgf1Hash,int sLen)

{
  int iVar1;
  
  iVar1 = RSA_padding_add_PKCS1_PSS_mgf1(rsa,EM,mHash,Hash,mgf1Hash,sLen);
  return iVar1;
}

