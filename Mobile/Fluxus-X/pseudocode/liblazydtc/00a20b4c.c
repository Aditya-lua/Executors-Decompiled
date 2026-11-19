/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20b4c
 */

undefined8 DSA_security_bits(long param_1)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  
  if ((*(BIGNUM **)(param_1 + 8) == (BIGNUM *)0x0) || (*(long *)(param_1 + 0x10) == 0)) {
    return 0xffffffff;
  }
  iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
  iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
  uVar3 = BN_security_bits(iVar1,iVar2);
  return uVar3;
}

