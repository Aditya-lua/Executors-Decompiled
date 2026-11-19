/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19318
 */

undefined8
FUN_00a19318(long *param_1,uchar *param_2,int param_3,undefined8 param_4,undefined8 param_5,
            long param_6)

{
  undefined8 uVar1;
  BIGNUM *pBVar2;
  
  pBVar2 = (BIGNUM *)*param_1;
  if (pBVar2 == (BIGNUM *)0x0) {
    pBVar2 = BN_new();
    *param_1 = (long)pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) {
      return 0;
    }
  }
  pBVar2 = BN_bin2bn(param_2,param_3,pBVar2);
  if (pBVar2 == (BIGNUM *)0x0) {
    pBVar2 = (BIGNUM *)*param_1;
    uVar1 = 0;
    if (pBVar2 != (BIGNUM *)0x0) {
      if ((*(byte *)(param_6 + 0x28) & 1) == 0) {
        BN_free(pBVar2);
      }
      else {
        BN_clear_free(pBVar2);
      }
      uVar1 = 0;
      *param_1 = 0;
    }
  }
  else {
    uVar1 = 1;
  }
  return uVar1;
}

