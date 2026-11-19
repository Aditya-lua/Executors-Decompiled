/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a200
 */

int EVP_DecodeBlock(uchar *t,uchar *f,int n)

{
  int iVar1;
  
  iVar1 = FUN_00a5a080(0,t,f,n);
  return iVar1;
}

