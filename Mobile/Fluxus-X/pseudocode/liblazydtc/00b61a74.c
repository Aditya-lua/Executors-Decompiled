/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61a74
 */

undefined8 ossl_sm2_do_sign(undefined8 param_1,undefined8 param_2)

{
  BIGNUM *a;
  undefined8 uVar1;
  
  a = (BIGNUM *)FUN_00b61ac8(param_2,param_1);
  if (a == (BIGNUM *)0x0) {
    uVar1 = 0;
  }
  else {
    uVar1 = FUN_00b61d48(param_1,a);
  }
  BN_free(a);
  return uVar1;
}

