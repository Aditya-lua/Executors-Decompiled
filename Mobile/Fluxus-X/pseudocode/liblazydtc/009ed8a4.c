/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed8a4
 */

int ASN1_STRING_print_ex_fp(FILE *fp,ASN1_STRING *str,ulong flags)

{
  int iVar1;
  
  iVar1 = FUN_009ed568(&LAB_009ed508,fp,flags,str);
  return iVar1;
}

