/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ec1c
 */

bool FUN_00b4ec1c(EC_KEY *param_1,uint param_2)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *pBVar4;
  EC_POINT *pEVar5;
  EC_GROUP *pEVar6;
  
  iVar3 = ossl_prov_is_running();
  bVar2 = false;
  if ((param_1 != (EC_KEY *)0x0) && (iVar3 != 0)) {
    if ((param_2 & 0x87) == 0) {
      bVar2 = true;
    }
    else {
      if ((param_2 >> 1 & 1) == 0) {
        bVar2 = true;
      }
      else {
        pEVar5 = EC_KEY_get0_public_key(param_1);
        bVar2 = pEVar5 != (EC_POINT *)0x0;
      }
      if (((param_2 & 1) != 0) && (bVar1 = bVar2 != false, bVar2 = false, bVar1)) {
        pBVar4 = EC_KEY_get0_private_key(param_1);
        bVar2 = pBVar4 != (BIGNUM *)0x0;
      }
      if (((param_2 >> 2 & 1) != 0) && (bVar1 = bVar2 != false, bVar2 = false, bVar1)) {
        pEVar6 = EC_KEY_get0_group(param_1);
        bVar2 = pEVar6 != (EC_GROUP *)0x0;
      }
    }
  }
  return bVar2;
}

