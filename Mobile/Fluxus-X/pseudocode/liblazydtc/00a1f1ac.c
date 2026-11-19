/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f1ac
 */

int DH_size(DH *dh)

{
  int iVar1;
  int iVar2;
  
  if (dh->p == (BIGNUM *)0x0) {
    return -1;
  }
  iVar2 = BN_num_bits(dh->p);
  iVar1 = iVar2 + 0xe;
  if (-1 < iVar2 + 7) {
    iVar1 = iVar2 + 7;
  }
  return iVar1 >> 3;
}

