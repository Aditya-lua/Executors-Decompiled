/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6be30
 */

int EVP_PKEY_save_parameters(EVP_PKEY *pkey,int mode)

{
  int iVar1;
  
  if (((pkey->type == 0x198) || (iVar1 = 0, pkey->type == 0x74)) &&
     (iVar1 = *(int *)&pkey[1].ameth, -1 < mode)) {
    *(int *)&pkey[1].ameth = mode;
  }
  return iVar1;
}

