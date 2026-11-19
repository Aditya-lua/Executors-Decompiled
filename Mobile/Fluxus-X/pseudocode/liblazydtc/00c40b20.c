/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40b20
 */

int X509_NAME_add_entry_by_txt
              (X509_NAME *name,char *field,int type,uchar *bytes,int len,int loc,int set)

{
  int iVar1;
  
  iVar1 = X509_NAME_add_entry_by_txt(name,field,type,bytes,len,loc,set);
  return iVar1;
}

