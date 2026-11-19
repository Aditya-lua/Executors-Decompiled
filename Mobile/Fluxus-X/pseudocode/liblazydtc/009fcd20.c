/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcd20
 */

long BIO_int_ctrl(BIO *bp,int cmd,long larg,int iarg)

{
  long lVar1;
  int local_14;
  
  local_14 = iarg;
  lVar1 = BIO_ctrl(bp,cmd,larg,&local_14);
  return lVar1;
}

