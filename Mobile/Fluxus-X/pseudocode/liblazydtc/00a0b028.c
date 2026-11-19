/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b028
 */

undefined8 bn_sqr_fixed_top(BIGNUM *param_1,BIGNUM *param_2,BN_CTX *param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  long lVar6;
  ulong *puVar7;
  ulong *puVar8;
  ulong *puVar9;
  undefined8 uVar10;
  ulong auStack_150 [32];
  
  puVar9 = auStack_150;
  iVar1 = param_2->top;
  if (iVar1 < 1) {
    param_1->top = 0;
    param_1->neg = 0;
    return 1;
  }
  BN_CTX_start(param_3);
  pBVar4 = param_1;
  if (param_2 == param_1) {
    pBVar4 = BN_CTX_get(param_3);
  }
  pBVar5 = BN_CTX_get(param_3);
  if (pBVar4 != (BIGNUM *)0x0) {
    uVar10 = 0;
    if (pBVar5 == (BIGNUM *)0x0) goto LAB_00a0b194;
    iVar2 = iVar1 << 1;
    lVar6 = bn_wexpand(pBVar4,iVar2);
    if (lVar6 != 0) {
      if (iVar1 == 8) {
        bn_sqr_comba8(pBVar4->d,param_2->d);
      }
      else if (iVar1 == 4) {
        bn_sqr_comba4(pBVar4->d,param_2->d);
      }
      else {
        if (0xf < iVar1) {
          iVar3 = BN_num_bits_word((long)iVar1);
          if (iVar1 == 1 << (ulong)(iVar3 - 1U & 0x1f)) {
            lVar6 = bn_wexpand(pBVar5,iVar1 << 2);
            if (lVar6 != 0) {
              bn_sqr_recursive(pBVar4->d,param_2->d,iVar1,pBVar5->d);
              goto LAB_00a0b168;
            }
          }
          else {
            lVar6 = bn_wexpand(pBVar5,iVar2);
            if (lVar6 != 0) {
              puVar7 = pBVar4->d;
              puVar8 = param_2->d;
              puVar9 = pBVar5->d;
              goto LAB_00a0b160;
            }
          }
          goto LAB_00a0b190;
        }
        puVar7 = pBVar4->d;
        puVar8 = param_2->d;
LAB_00a0b160:
        bn_sqr_normal(puVar7,puVar8,iVar1,puVar9);
      }
LAB_00a0b168:
      pBVar4->neg = 0;
      pBVar4->top = iVar2;
      if ((pBVar4 == param_1) || (pBVar4 = BN_copy(param_1,pBVar4), pBVar4 != (BIGNUM *)0x0)) {
        uVar10 = 1;
        goto LAB_00a0b194;
      }
    }
  }
LAB_00a0b190:
  uVar10 = 0;
LAB_00a0b194:
  BN_CTX_end(param_3);
  return uVar10;
}

