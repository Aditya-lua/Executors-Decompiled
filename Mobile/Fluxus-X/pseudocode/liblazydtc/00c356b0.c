/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c356b0
 */

int CRYPTO_dup_ex_data(int class_index,CRYPTO_EX_DATA *to,CRYPTO_EX_DATA *from)

{
  int iVar1;
  
  iVar1 = CRYPTO_dup_ex_data(class_index,to,from);
  return iVar1;
}

