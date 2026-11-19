/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adac80
 */

undefined8 FUN_00adac80(BIGNUM *param_1,BIGNUM *param_2,undefined8 param_3,BN_GENCB *param_4)

{
  int iVar1;
  BIGNUM *pBVar2;
  int b;
  
  pBVar2 = BN_copy(param_2,param_1);
  if (pBVar2 != (BIGNUM *)0x0) {
    BN_set_flags(param_2,4);
    b = 1;
    do {
      BN_GENCB_call(param_4,0,b);
      iVar1 = BN_check_prime(param_2,param_3,param_4);
      if (0 < iVar1) {
        BN_GENCB_call(param_4,2,b);
        return 1;
      }
      if (iVar1 < 0) {
        return 0;
      }
      iVar1 = BN_add_word(param_2,2);
      b = b + 1;
    } while (iVar1 != 0);
  }
  return 0;
}

