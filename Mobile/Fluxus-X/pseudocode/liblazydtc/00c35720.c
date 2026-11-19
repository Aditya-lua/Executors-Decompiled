/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35720
 */

int CRYPTO_set_ex_data(CRYPTO_EX_DATA *ad,int idx,void *val)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data(ad,idx,val);
  return iVar1;
}

