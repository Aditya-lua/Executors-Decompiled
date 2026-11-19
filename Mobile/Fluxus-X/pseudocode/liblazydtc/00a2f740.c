/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f740
 */

int EC_KEY_precompute_mult(EC_KEY *key,BN_CTX *ctx)

{
  int iVar1;
  
  if (*(EC_GROUP **)(key + 0x18) == (EC_GROUP *)0x0) {
    return 0;
  }
  iVar1 = EC_GROUP_precompute_mult(*(EC_GROUP **)(key + 0x18),ctx);
  return iVar1;
}

