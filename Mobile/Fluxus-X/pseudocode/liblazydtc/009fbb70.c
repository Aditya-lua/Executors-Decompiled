/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbb70
 */

int BIO_dump_indent(BIO *b,char *bytes,int len,int indent)

{
  int iVar1;
  
  iVar1 = BIO_dump_indent_cb((cb *)&LAB_009fbb5c,b,bytes,len,indent);
  return iVar1;
}

