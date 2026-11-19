/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03048
 */

bool bn_mul_mont_fixed_top
               (undefined8 param_1,long param_2,long param_3,long param_4,BN_CTX *param_5)

{
  bool bVar1;
  int iVar2;
  BIGNUM *pBVar3;
  
  bVar1 = false;
  if (*(int *)(param_3 + 8) + *(int *)(param_2 + 8) <= *(int *)(param_4 + 0x28) * 2) {
    BN_CTX_start(param_5);
    pBVar3 = BN_CTX_get(param_5);
    bVar1 = false;
    if (pBVar3 != (BIGNUM *)0x0) {
      if (param_2 == param_3) {
        iVar2 = bn_sqr_fixed_top(pBVar3,param_2,param_5);
      }
      else {
        iVar2 = bn_mul_fixed_top(pBVar3,param_2,param_3,param_5);
      }
      if (iVar2 == 0) {
        bVar1 = false;
      }
      else {
        iVar2 = FUN_00a03110(param_1,pBVar3,param_4);
        bVar1 = iVar2 != 0;
      }
    }
    BN_CTX_end(param_5);
  }
  return bVar1;
}

