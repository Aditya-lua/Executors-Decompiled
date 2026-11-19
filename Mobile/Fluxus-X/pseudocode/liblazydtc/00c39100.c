/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39100
 */

int BN_GENCB_call(BN_GENCB *cb,int a,int b)

{
  int iVar1;
  
  iVar1 = BN_GENCB_call(cb,a,b);
  return iVar1;
}

