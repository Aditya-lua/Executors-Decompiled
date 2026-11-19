/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ae24
 */

int BN_is_prime_ex(BIGNUM *p,int nchecks,BN_CTX *ctx,BN_GENCB *cb)

{
  int iVar1;
  int iVar2;
  
  iVar1 = BN_num_bits(p);
  iVar2 = 0x80;
  if (iVar1 < 0x801) {
    iVar2 = 0x40;
  }
  if (iVar2 <= nchecks) {
    iVar2 = nchecks;
  }
  iVar2 = FUN_00a1abb8(p,iVar2,ctx,0,cb);
  return iVar2;
}

