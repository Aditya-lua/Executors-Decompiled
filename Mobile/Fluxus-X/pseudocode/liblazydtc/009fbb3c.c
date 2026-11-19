/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbb3c
 */

int BIO_dump(BIO *b,char *bytes,int len)

{
  int iVar1;
  
  iVar1 = BIO_dump_indent_cb((cb *)&LAB_009fbb5c,b,bytes,len,0);
  return iVar1;
}

