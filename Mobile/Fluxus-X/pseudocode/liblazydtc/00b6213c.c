/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6213c
 */

undefined4
ossl_sm2_do_verify(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  undefined4 uVar1;
  BIGNUM *a;
  
  a = (BIGNUM *)FUN_00b61ac8(param_2,param_1,param_4,param_5,param_6,param_7);
  if (a == (BIGNUM *)0x0) {
    uVar1 = 0;
  }
  else {
    uVar1 = FUN_00b621b0(param_1,param_3,a);
  }
  BN_free(a);
  return uVar1;
}

