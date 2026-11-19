/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c370c0
 */

int EVP_Digest(void *data,size_t count,uchar *md,uint *size,EVP_MD *type,ENGINE *impl)

{
  int iVar1;
  
  iVar1 = EVP_Digest(data,count,md,size,type,impl);
  return iVar1;
}

