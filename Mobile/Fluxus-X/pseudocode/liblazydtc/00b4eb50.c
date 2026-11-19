/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4eb50
 */

undefined8 FUN_00b4eb50(EC_KEY *param_1,long param_2)

{
  int iVar1;
  EC_GROUP *pEVar2;
  undefined8 uVar3;
  long lVar4;
  BN_CTX *c;
  
  uVar3 = 0;
  if (param_1 != (EC_KEY *)0x0) {
    if (param_2 == 0) {
      uVar3 = 1;
    }
    else {
      pEVar2 = EC_KEY_get0_group(param_1);
      uVar3 = ossl_ec_group_set_params(pEVar2,param_2);
      if ((int)uVar3 != 0) {
        lVar4 = OSSL_PARAM_locate_const(param_2,"encoded-pub-key");
        if (lVar4 != 0) {
          ossl_ec_key_get_libctx(param_1);
          c = (BN_CTX *)BN_CTX_new_ex();
          if (((c == (BN_CTX *)0x0) || (*(int *)(lVar4 + 8) != 5)) ||
             (iVar1 = EC_KEY_oct2key(param_1,*(undefined8 *)(lVar4 + 0x10),
                                     *(undefined8 *)(lVar4 + 0x18),c), iVar1 == 0)) {
            BN_CTX_free(c);
            return 0;
          }
          BN_CTX_free(c);
        }
        uVar3 = ossl_ec_key_otherparams_fromdata(param_1,param_2);
        return uVar3;
      }
    }
  }
  return uVar3;
}

