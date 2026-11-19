/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60858
 */

int EVP_PKEY_get_attr_count(EVP_PKEY *key)

{
  int iVar1;
  
  iVar1 = X509at_get_attr_count(*(undefined8 *)&key[1].references);
  return iVar1;
}

