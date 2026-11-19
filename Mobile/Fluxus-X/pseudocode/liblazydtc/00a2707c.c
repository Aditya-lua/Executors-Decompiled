/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2707c
 */

undefined8 ossl_ec_set_ecdh_cofactor_mode(EC_KEY *param_1,uint param_2)

{
  int iVar1;
  EC_GROUP *pEVar2;
  undefined8 uVar3;
  long lVar4;
  
  pEVar2 = EC_KEY_get0_group(param_1);
  uVar3 = 0;
  if ((param_2 < 2) && (lVar4 = EC_GROUP_get0_cofactor(pEVar2), uVar3 = 0, lVar4 != 0)) {
    iVar1 = BN_is_one();
    if (iVar1 == 0) {
      if (param_2 == 0) {
        EC_KEY_clear_flags(param_1,0x1000);
      }
      else if (param_2 == 1) {
        EC_KEY_set_flags(param_1,0x1000);
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

