/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36880
 */

EC_GROUP * EC_KEY_get0_group(EC_KEY *key)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = EC_KEY_get0_group(key);
  return pEVar1;
}

