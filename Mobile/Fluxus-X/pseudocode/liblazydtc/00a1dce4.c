/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1dce4
 */

int BN_rand_range(BIGNUM *rnd,BIGNUM *range)

{
  int iVar1;
  
  iVar1 = FUN_00a1dac0(0,rnd,range,0,0);
  return iVar1;
}

