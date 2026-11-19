/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20958
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DSA * DSA_new(void)

{
  DSA *pDVar1;
  
  pDVar1 = (DSA *)FUN_00a2074c(0,0);
  return pDVar1;
}

