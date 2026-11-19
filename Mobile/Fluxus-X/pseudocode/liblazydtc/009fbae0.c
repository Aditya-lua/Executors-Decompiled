/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbae0
 */

int BIO_dump_fp(FILE *fp,char *s,int len)

{
  int iVar1;
  
  iVar1 = BIO_dump_indent_cb(FUN_009fbb00,fp,s,len,0);
  return iVar1;
}

