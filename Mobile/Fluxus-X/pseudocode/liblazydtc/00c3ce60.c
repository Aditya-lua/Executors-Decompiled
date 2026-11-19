/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ce60
 */

int EVP_BytesToKey(EVP_CIPHER *type,EVP_MD *md,uchar *salt,uchar *data,int datal,int count,
                  uchar *key,uchar *iv)

{
  int iVar1;
  
  iVar1 = EVP_BytesToKey(type,md,salt,data,datal,count,key,iv);
  return iVar1;
}

