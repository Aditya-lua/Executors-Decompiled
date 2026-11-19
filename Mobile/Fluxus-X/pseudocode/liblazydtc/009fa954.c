/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fa954
 */

int FUN_009fa954(BIO *param_1,char *param_2,int param_3)

{
  int iVar1;
  BIO *bp;
  
  bp = BIO_next(param_1);
  iVar1 = BIO_gets(bp,param_2,param_3);
  return iVar1;
}

