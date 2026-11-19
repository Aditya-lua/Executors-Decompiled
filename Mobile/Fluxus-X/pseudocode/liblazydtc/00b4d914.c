/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d914
 */

bool FUN_00b4d914(undefined8 param_1,undefined8 param_2,uint param_3)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *a;
  BIGNUM *b;
  undefined8 uVar4;
  undefined8 uVar5;
  byte bVar6;
  
  iVar3 = ossl_prov_is_running();
  if (iVar3 == 0) {
    return false;
  }
  if ((param_3 & 3) == 0) {
    bVar2 = true;
    goto joined_r0x00b4d9d4;
  }
  if ((param_3 >> 1 & 1) == 0) {
LAB_00b4d944:
    if ((param_3 & 1) == 0) {
      bVar2 = false;
      goto joined_r0x00b4d9d4;
    }
    a = (BIGNUM *)DSA_get0_priv_key(param_1);
    b = (BIGNUM *)DSA_get0_priv_key(param_2);
    bVar2 = true;
    if (a == (BIGNUM *)0x0) {
      bVar2 = false;
      goto joined_r0x00b4d9d4;
    }
    bVar6 = 0;
    if (b != (BIGNUM *)0x0) goto LAB_00b4d9bc;
  }
  else {
    a = (BIGNUM *)DSA_get0_pub_key(param_1);
    b = (BIGNUM *)DSA_get0_pub_key(param_2);
    if ((a == (BIGNUM *)0x0) || (b == (BIGNUM *)0x0)) goto LAB_00b4d944;
LAB_00b4d9bc:
    iVar3 = BN_cmp(a,b);
    bVar2 = iVar3 == 0;
    bVar6 = 1;
  }
  bVar2 = (bool)(bVar6 & bVar2);
joined_r0x00b4d9d4:
  if ((param_3 >> 2 & 1) != 0) {
    uVar4 = ossl_dsa_get0_params(param_1);
    uVar5 = ossl_dsa_get0_params(param_2);
    bVar1 = bVar2 != false;
    bVar2 = false;
    if (bVar1) {
      iVar3 = ossl_ffc_params_cmp(uVar4,uVar5,1);
      bVar2 = iVar3 != 0;
    }
  }
  return bVar2;
}

