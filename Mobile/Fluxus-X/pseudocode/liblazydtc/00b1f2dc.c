/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f2dc
 */

uchar * X509_keyid_get0(X509 *x,int *len)

{
  _func_257 *p_Var1;
  
  if (x[1].altname == (stack_st_GENERAL_NAME *)0x0) {
    return (uchar *)0x0;
  }
  p_Var1 = ((x[1].altname)->stack).comp;
  if (p_Var1 == (_func_257 *)0x0) {
    return (uchar *)0x0;
  }
  if (len != (int *)0x0) {
    *len = *(int *)p_Var1;
  }
  return *(uchar **)(p_Var1 + 8);
}

