/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acdcb0
 */

bool FUN_00acdcb0(long param_1,long param_2)

{
  bool bVar1;
  uint uVar2;
  int iVar3;
  
  uVar2 = RSA_flags(*(RSA **)(param_1 + 0x20));
  if (((uVar2 & 1) == 0) && (uVar2 = RSA_flags(*(RSA **)(param_2 + 0x20)), (uVar2 & 1) == 0)) {
    iVar3 = BN_cmp(*(BIGNUM **)(*(long *)(param_2 + 0x20) + 0x28),
                   *(BIGNUM **)(*(long *)(param_1 + 0x20) + 0x28));
    bVar1 = false;
    if (iVar3 == 0) {
      iVar3 = BN_cmp(*(BIGNUM **)(*(long *)(param_2 + 0x20) + 0x30),
                     *(BIGNUM **)(*(long *)(param_1 + 0x20) + 0x30));
      bVar1 = iVar3 == 0;
    }
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

