/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a220b4
 */

undefined8 DSA_SIG_set0(long *param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    BN_clear_free((BIGNUM *)*param_1);
    BN_clear_free((BIGNUM *)param_1[1]);
    uVar1 = 1;
    *param_1 = param_2;
    param_1[1] = param_3;
  }
  return uVar1;
}

