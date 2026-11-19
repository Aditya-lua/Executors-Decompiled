/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20130
 */

undefined8 ossl_dsa_key_fromdata(long param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  BIGNUM *local_38;
  BIGNUM *local_28;
  
  local_28 = (BIGNUM *)0x0;
  local_38 = (BIGNUM *)0x0;
  uVar4 = 0;
  if (param_1 != 0) {
    if (param_3 == 0) {
      lVar2 = 0;
    }
    else {
      lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002ad463);
    if ((lVar2 == 0 && lVar3 == 0) ||
       ((((lVar3 == 0 || (iVar1 = OSSL_PARAM_get_BN(lVar3,&local_38), iVar1 != 0)) &&
         ((lVar2 == 0 || (iVar1 = OSSL_PARAM_get_BN(lVar2,&local_28), iVar1 != 0)))) &&
        (iVar1 = DSA_set0_key(param_1,local_38,local_28), iVar1 != 0)))) {
      uVar4 = 1;
    }
    else {
      BN_clear_free(local_28);
      BN_free(local_38);
      uVar4 = 0;
    }
  }
  return uVar4;
}

