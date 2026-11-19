/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0ccc
 */

int BN_BLINDING_update(BN_BLINDING *b,BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  BIGNUM *pBVar3;
  undefined8 uVar4;
  BN_BLINDING *pBVar5;
  
  if ((*(long *)b == 0) || (pBVar3 = *(BIGNUM **)(b + 8), pBVar3 == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_blind.c",0x62,"BN_BLINDING_update");
    ERR_set_error(3,0x6b,0);
    iVar2 = 0;
    goto LAB_00ad0e04;
  }
  pBVar5 = b + 0x28;
  if (*(int *)pBVar5 == -1) {
    *(int *)pBVar5 = 1;
LAB_00ad0d88:
    if (((byte)b[0x30] & 1) == 0) {
      if (*(long *)(b + 0x38) == 0) {
        iVar1 = BN_mod_mul(pBVar3,pBVar3,pBVar3,*(BIGNUM **)(b + 0x18),ctx);
        iVar2 = 0;
        if (iVar1 == 0) goto LAB_00ad0e04;
        pBVar3 = *(BIGNUM **)b;
        iVar1 = BN_mod_mul(pBVar3,pBVar3,pBVar3,*(BIGNUM **)(b + 0x18),ctx);
        iVar2 = 0;
        if (iVar1 == 0) goto LAB_00ad0e04;
      }
      else {
        iVar1 = bn_mul_mont_fixed_top(pBVar3,pBVar3,pBVar3,*(long *)(b + 0x38),ctx);
        iVar2 = 0;
        if (iVar1 == 0) goto LAB_00ad0e04;
        uVar4 = *(undefined8 *)b;
        iVar2 = bn_mul_mont_fixed_top(uVar4,uVar4,uVar4,*(undefined8 *)(b + 0x38),ctx);
        if (iVar2 == 0) {
          iVar2 = 0;
          goto LAB_00ad0e04;
        }
      }
    }
  }
  else {
    iVar2 = *(int *)pBVar5 + 1;
    *(int *)pBVar5 = iVar2;
    if (((iVar2 != 0x20) || (*(long *)(b + 0x10) == 0)) || (((byte)b[0x30] >> 1 & 1) != 0))
    goto LAB_00ad0d88;
    pBVar5 = BN_BLINDING_create_param
                       (b,(BIGNUM *)0x0,(BIGNUM *)0x0,ctx,(bn_mod_exp *)0x0,(BN_MONT_CTX *)0x0);
    if (pBVar5 == (BN_BLINDING *)0x0) {
      iVar2 = 0;
      goto LAB_00ad0e04;
    }
  }
  iVar2 = 1;
LAB_00ad0e04:
  if (*(int *)(b + 0x28) == 0x20) {
    *(int *)(b + 0x28) = 0;
  }
  return iVar2;
}

