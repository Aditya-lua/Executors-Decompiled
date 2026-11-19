/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e7a0
 */

bool ossl_dh_generate_public_key(BN_CTX *param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  BIGNUM *a;
  BN_MONT_CTX *pBVar3;
  
  a = BN_new();
  if (a == (BIGNUM *)0x0) {
    return false;
  }
  if ((*(byte *)(param_2 + 0x80) & 1) == 0) {
    pBVar3 = (BN_MONT_CTX *)0x0;
  }
  else {
    pBVar3 = BN_MONT_CTX_set_locked
                       ((BN_MONT_CTX **)(param_2 + 0x88),(int)*(undefined8 *)(param_2 + 0xc0),
                        *(BIGNUM **)(param_2 + 8),param_1);
    if (pBVar3 == (BN_MONT_CTX *)0x0) {
      bVar1 = false;
      goto LAB_00a1e84c;
    }
  }
  BN_with_flags(a,param_3,4);
  iVar2 = (**(code **)(*(long *)(param_2 + 0xb8) + 0x18))
                    (param_2,param_4,*(undefined8 *)(param_2 + 0x18),a,*(undefined8 *)(param_2 + 8),
                     param_1,pBVar3);
  bVar1 = iVar2 != 0;
LAB_00a1e84c:
  BN_clear_free(a);
  return bVar1;
}

