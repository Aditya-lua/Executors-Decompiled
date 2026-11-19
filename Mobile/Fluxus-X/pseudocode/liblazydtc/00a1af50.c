/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1af50
 */

void BN_check_prime(BIGNUM *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = BN_num_bits(param_1);
  uVar2 = 0x80;
  if (iVar1 < 0x801) {
    uVar2 = 0x40;
  }
  FUN_00a1abb8(param_1,uVar2,param_2,1,param_3);
  return;
}

