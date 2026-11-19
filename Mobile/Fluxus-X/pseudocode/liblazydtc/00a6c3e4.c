/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c3e4
 */

int EVP_PKEY_set_type(EVP_PKEY *pkey,int type)

{
  int iVar1;
  
  iVar1 = FUN_00a6d2f4((int)pkey,0,type,0,0xffffffff,0);
  return iVar1;
}

