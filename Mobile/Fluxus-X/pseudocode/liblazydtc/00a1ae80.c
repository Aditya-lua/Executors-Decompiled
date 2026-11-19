/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ae80
 */

void ossl_bn_check_prime(BIGNUM *param_1,int param_2,undefined8 param_3,undefined4 param_4,
                        undefined8 param_5)

{
  int iVar1;
  int iVar2;
  
  iVar1 = BN_num_bits(param_1);
  iVar2 = 0x80;
  if (iVar1 < 0x801) {
    iVar2 = 0x40;
  }
  if (iVar2 <= param_2) {
    iVar2 = param_2;
  }
  FUN_00a1abb8(param_1,iVar2,param_3,param_4,param_5);
  return;
}

