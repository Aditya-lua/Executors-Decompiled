/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40020
 */

int RSA_verify_PKCS1_PSS_mgf1
              (RSA *rsa,uchar *mHash,EVP_MD *Hash,EVP_MD *mgf1Hash,uchar *EM,int sLen)

{
  int iVar1;
  
  iVar1 = RSA_verify_PKCS1_PSS_mgf1(rsa,mHash,Hash,mgf1Hash,EM,sLen);
  return iVar1;
}

