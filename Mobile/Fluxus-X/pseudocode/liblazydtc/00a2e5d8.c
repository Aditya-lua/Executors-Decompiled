/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e5d8
 */

EC_KEY * EC_KEY_new_by_curve_name_ex(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  int iVar1;
  EC_KEY *key;
  long lVar2;
  
  key = (EC_KEY *)ossl_ec_key_new_method_int(param_1,param_2,0);
  if (key != (EC_KEY *)0x0) {
    lVar2 = EC_GROUP_new_by_curve_name_ex(param_1,param_2,param_3);
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

