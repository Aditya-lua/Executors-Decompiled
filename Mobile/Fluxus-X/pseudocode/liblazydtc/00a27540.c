/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27540
 */

bool ossl_ec_key_is_foreign(long param_1)

{
  long lVar1;
  long lVar2;
  
  if (*(long *)(param_1 + 8) == 0) {
    lVar1 = EC_KEY_get_method();
    lVar2 = EC_KEY_OpenSSL();
    return lVar1 != lVar2;
  }
  return true;
}

