/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbb1c
 */

int BIO_dump_indent_fp(FILE *fp,char *s,int len,int indent)

{
  int iVar1;
  
  iVar1 = BIO_dump_indent_cb(FUN_009fbb00,fp,s,len,indent);
  return iVar1;
}

