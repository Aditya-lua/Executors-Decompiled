/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcd44
 */

char * BIO_ptr_ctrl(BIO *bp,int cmd,long larg)

{
  char *pcVar1;
  long lVar2;
  char *local_18;
  
  local_18 = (char *)0x0;
  lVar2 = BIO_ctrl(bp,cmd,larg,&local_18);
  pcVar1 = (char *)0x0;
  if (0 < lVar2) {
    pcVar1 = local_18;
  }
  return pcVar1;
}

