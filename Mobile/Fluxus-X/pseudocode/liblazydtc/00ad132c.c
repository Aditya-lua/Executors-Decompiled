/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad132c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

RSA * RSA_new(void)

{
  RSA *pRVar1;
  
  pRVar1 = (RSA *)FUN_00ad1338(0,0);
  return pRVar1;
}

