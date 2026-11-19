/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e740
 */

EC_KEY * EC_KEY_new_by_curve_name(int nid)

{
  int iVar1;
  EC_KEY *key;
  long lVar2;
  
  key = (EC_KEY *)ossl_ec_key_new_method_int(0,0,0);
  if (key != (EC_KEY *)0x0) {
    lVar2 = EC_GROUP_new_by_curve_name_ex(0,0,nid);
    *(long *)(key + 0x18) = lVar2;
    if ((lVar2 == 0) ||
       ((*(code **)(*(long *)key + 0x28) != (code *)0x0 &&
        (iVar1 = (**(code **)(*(long *)key + 0x28))(key,lVar2), iVar1 == 0)))) {
      EC_KEY_free(key);
      key = (EC_KEY *)0x0;
    }
  }
  return key;
}

