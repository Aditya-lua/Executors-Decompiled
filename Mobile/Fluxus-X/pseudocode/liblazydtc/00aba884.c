/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba884
 */

int PKCS12_key_gen_uni(uchar *pass,int passlen,uchar *salt,int saltlen,int id,int iter,int n,
                      uchar *out,EVP_MD *md_type)

{
  int iVar1;
  
  iVar1 = PKCS12_key_gen_uni_ex((int)pass,passlen,salt,saltlen,id,iter,n,out,md_type,0,0);
  return iVar1;
}

