/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d550
 */

int EVP_PKEY_set_type_str(EVP_PKEY *pkey,char *str,int len)

{
  int iVar1;
  
  iVar1 = FUN_00a6d2f4((int)pkey,0,0,str,len,0);
  return iVar1;
}

