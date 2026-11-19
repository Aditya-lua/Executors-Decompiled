/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a272a0
 */

bool ossl_ec_group_fromdata(EC_KEY *param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  EC_GROUP *group;
  
  bVar1 = false;
  if (param_1 != (EC_KEY *)0x0) {
    uVar3 = ossl_ec_key_get_libctx(param_1);
    uVar4 = ossl_ec_key_get0_propq(param_1);
    group = (EC_GROUP *)EC_GROUP_new_from_params(param_2,uVar3,uVar4);
    iVar2 = EC_KEY_set_group(param_1,group);
    bVar1 = iVar2 != 0;
    EC_GROUP_free(group);
  }
  return bVar1;
}

