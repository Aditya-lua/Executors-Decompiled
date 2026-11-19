/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f1e4
 */

undefined8 DH_security_bits(long param_1)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  undefined8 uVar3;
  
  if (*(BIGNUM **)(param_1 + 0x10) == (BIGNUM *)0x0) {
    iVar1 = *(int *)(param_1 + 0x68);
    if (iVar1 == 0) {
      iVar1 = -1;
    }
    a = *(BIGNUM **)(param_1 + 8);
  }
  else {
    iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
    a = *(BIGNUM **)(param_1 + 8);
  }
  if (a == (BIGNUM *)0x0) {
    return 0xffffffff;
  }
  iVar2 = BN_num_bits(a);
  uVar3 = BN_security_bits(iVar2,iVar1);
  return uVar3;
}

