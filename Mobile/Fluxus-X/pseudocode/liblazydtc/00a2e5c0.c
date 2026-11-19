/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e5c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EC_KEY * EC_KEY_new(void)

{
  EC_KEY *pEVar1;
  
  pEVar1 = (EC_KEY *)ossl_ec_key_new_method_int(0,0,0);
  return pEVar1;
}

