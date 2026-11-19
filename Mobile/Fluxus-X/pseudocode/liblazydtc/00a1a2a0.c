/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a2a0
 */

bool ossl_dh_check_priv_key(long param_1,BIGNUM *param_2,undefined4 *param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  BIGNUM *r;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  
  *param_3 = 0;
  r = BN_new();
  if (r == (BIGNUM *)0x0) {
    return false;
  }
  pBVar5 = *(BIGNUM **)(param_1 + 0x10);
  if (pBVar5 == (BIGNUM *)0x0) {
    if (*(BIGNUM **)(param_1 + 8) != (BIGNUM *)0x0) {
      iVar2 = *(int *)(param_1 + 0x68);
      if (iVar2 == 0) {
        iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
        iVar3 = BN_num_bits(param_2);
        bVar1 = false;
        if (iVar3 < iVar2) {
          iVar2 = BN_num_bits(param_2);
          bVar1 = 1 < iVar2;
        }
      }
      else {
        iVar3 = BN_num_bits(param_2);
        bVar1 = iVar3 == iVar2;
      }
      goto LAB_00a1a364;
    }
LAB_00a1a360:
    bVar1 = false;
  }
  else {
    iVar2 = DH_get_nid(param_1);
    pBVar4 = pBVar5;
    if ((iVar2 != 0) && (*(int *)(param_1 + 0x68) != 0)) {
      pBVar4 = BN_value_one();
      iVar2 = BN_lshift(r,pBVar4,*(int *)(param_1 + 0x68));
      if (iVar2 == 0) goto LAB_00a1a360;
      iVar2 = BN_cmp(r,*(BIGNUM **)(param_1 + 0x10));
      pBVar4 = r;
      if (-1 < iVar2) {
        pBVar4 = pBVar5;
      }
    }
    iVar2 = ossl_ffc_validate_private_key(pBVar4,param_2,param_3);
    bVar1 = iVar2 != 0;
  }
LAB_00a1a364:
  BN_free(r);
  return bVar1;
}

