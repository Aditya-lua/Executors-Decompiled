/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1da1c
 */

int BN_rand(BIGNUM *rnd,int bits,int top,int bottom)

{
  int iVar1;
  
  iVar1 = FUN_00a1d778(0,rnd,bits,top,bottom,0,0);
  return iVar1;
}

