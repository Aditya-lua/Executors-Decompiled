/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03458
 */

undefined4
bn_from_mont_fixed_top(undefined8 param_1,BIGNUM *param_2,undefined8 param_3,BN_CTX *param_4)

{
  undefined4 uVar1;
  BIGNUM *a;
  BIGNUM *pBVar2;
  
  BN_CTX_start(param_4);
  a = BN_CTX_get(param_4);
  if ((a == (BIGNUM *)0x0) || (pBVar2 = BN_copy(a,param_2), pBVar2 == (BIGNUM *)0x0)) {
    uVar1 = 0;
  }
  else {
    uVar1 = FUN_00a03110(param_1,a,param_3);
  }
  BN_CTX_end(param_4);
  return uVar1;
}

