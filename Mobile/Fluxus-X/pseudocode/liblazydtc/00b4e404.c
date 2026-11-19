/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e404
 */

undefined8 FUN_00b4e404(long param_1,EC_KEY *param_2)

{
  int iVar1;
  undefined8 uVar2;
  EC_GROUP *pEVar3;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((((param_2 != (EC_KEY *)0x0) && (param_1 != 0)) && (iVar1 != 0)) &&
     (pEVar3 = EC_KEY_get0_group(param_2), uVar2 = 0, pEVar3 != (EC_GROUP *)0x0)) {
    pEVar3 = EC_GROUP_dup(pEVar3);
    if (pEVar3 == (EC_GROUP *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/ec_kmgmt.c",0x412,"ec_gen_set_group");
      ERR_set_error(0x39,0xb0,0);
      uVar2 = 0;
    }
    else {
      EC_GROUP_free(*(EC_GROUP **)(param_1 + 0x80));
      uVar2 = 1;
      *(EC_GROUP **)(param_1 + 0x80) = pEVar3;
    }
  }
  return uVar2;
}

