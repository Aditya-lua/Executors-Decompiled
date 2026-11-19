/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ead8
 */

EC_KEY * FUN_00b4ead8(undefined8 *param_1,long param_2)

{
  int iVar1;
  EC_GROUP *group;
  EC_KEY *pEVar2;
  EC_KEY *key;
  
  iVar1 = ossl_prov_is_running();
  pEVar2 = (EC_KEY *)0x0;
  if ((param_2 == 8) && (iVar1 != 0)) {
    key = (EC_KEY *)*param_1;
    group = EC_KEY_get0_group(key);
    pEVar2 = (EC_KEY *)0x0;
    if (group != (EC_GROUP *)0x0) {
      iVar1 = EC_GROUP_get_curve_name(group);
      pEVar2 = (EC_KEY *)0x0;
      if (iVar1 != 0x494) {
        *param_1 = 0;
        pEVar2 = key;
      }
    }
  }
  return pEVar2;
}

