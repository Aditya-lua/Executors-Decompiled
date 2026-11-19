/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d42c
 */

bool ossl_ffc_params_cmp(undefined8 *param_1,undefined8 *param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  
  iVar2 = BN_cmp((BIGNUM *)*param_1,(BIGNUM *)*param_2);
  bVar1 = false;
  if (iVar2 == 0) {
    iVar2 = BN_cmp((BIGNUM *)param_1[2],(BIGNUM *)param_2[2]);
    bVar1 = false;
    if (iVar2 == 0) {
      if (param_3 == 0) {
        iVar2 = BN_cmp((BIGNUM *)param_1[1],(BIGNUM *)param_2[1]);
        bVar1 = iVar2 == 0;
      }
      else {
        bVar1 = true;
      }
    }
  }
  return bVar1;
}

