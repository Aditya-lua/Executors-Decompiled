/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0a6c4
 */

undefined8 bn_mul_fixed_top(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  BIGNUM *pBVar6;
  long lVar7;
  BIGNUM *pBVar8;
  undefined8 uVar9;
  
  iVar2 = param_2->top;
  if ((iVar2 == 0) || (iVar3 = param_3->top, iVar3 == 0)) {
    BN_zero_ex(param_1);
    return 1;
  }
  BN_CTX_start(param_4);
  if (((param_1 != param_2) && (pBVar6 = param_1, param_1 != param_3)) ||
     (pBVar6 = BN_CTX_get(param_4), pBVar6 != (BIGNUM *)0x0)) {
    iVar5 = iVar2 - iVar3;
    if ((iVar2 == 8) && (iVar5 == 0)) {
      lVar7 = bn_wexpand(pBVar6,0x10);
      if (lVar7 != 0) {
        pBVar6->top = 0x10;
        bn_mul_comba8(pBVar6->d,param_2->d,param_3->d);
        goto LAB_00a0a858;
      }
    }
    else {
      iVar1 = iVar3 + iVar2;
      if (((iVar2 < 0x10) || (iVar3 < 0x10)) || (2 < iVar5 + 1U)) {
        lVar7 = bn_wexpand(pBVar6,iVar1);
        if (lVar7 != 0) {
          pBVar6->top = iVar1;
          bn_mul_normal(pBVar6->d,param_2->d,iVar2,param_3->d,iVar3);
          goto LAB_00a0a858;
        }
      }
      else {
        iVar4 = iVar2;
        if (iVar5 < 0) {
          iVar4 = iVar3;
        }
        iVar5 = BN_num_bits_word((long)iVar4);
        pBVar8 = BN_CTX_get(param_4);
        if (pBVar8 != (BIGNUM *)0x0) {
          iVar5 = 1 << (ulong)(iVar5 - 1U & 0x1f);
          iVar4 = iVar2 - iVar5;
          if ((iVar4 == 0 || iVar2 < iVar5) && (iVar3 - iVar5 == 0 || iVar3 < iVar5)) {
            lVar7 = bn_wexpand(pBVar8,iVar5 << 2);
            if ((lVar7 != 0) && (lVar7 = bn_wexpand(pBVar6,iVar5 << 2), lVar7 != 0)) {
              bn_mul_recursive(pBVar6->d,param_2->d,param_3->d,iVar5,iVar4,iVar3 - iVar5,pBVar8->d);
              pBVar6->top = iVar1;
LAB_00a0a858:
              pBVar6->neg = param_3->neg ^ param_2->neg;
              if ((pBVar6 == param_1) || (pBVar6 = BN_copy(param_1,pBVar6), pBVar6 != (BIGNUM *)0x0)
                 ) {
                uVar9 = 1;
                goto LAB_00a0a8d8;
              }
            }
          }
          else {
            lVar7 = bn_wexpand(pBVar8,iVar5 << 3);
            if ((lVar7 != 0) && (lVar7 = bn_wexpand(pBVar6,iVar5 << 3), lVar7 != 0)) {
              bn_mul_part_recursive
                        (pBVar6->d,param_2->d,param_3->d,iVar5,iVar4,iVar3 - iVar5,pBVar8->d);
              pBVar6->top = iVar1;
              goto LAB_00a0a858;
            }
          }
        }
      }
    }
  }
  uVar9 = 0;
LAB_00a0a8d8:
  BN_CTX_end(param_4);
  return uVar9;
}

