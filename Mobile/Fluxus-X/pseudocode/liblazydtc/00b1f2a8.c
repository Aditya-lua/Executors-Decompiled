/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f2a8
 */

uchar * X509_alias_get0(X509 *x,int *len)

{
  int *piVar1;
  
  if (x[1].altname == (stack_st_GENERAL_NAME *)0x0) {
    return (uchar *)0x0;
  }
  piVar1 = *(int **)&((x[1].altname)->stack).sorted;
  if (piVar1 == (int *)0x0) {
    return (uchar *)0x0;
  }
  if (len != (int *)0x0) {
    *len = *piVar1;
  }
  return *(uchar **)(piVar1 + 2);
}

