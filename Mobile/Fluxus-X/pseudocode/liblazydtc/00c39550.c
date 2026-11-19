/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39550
 */

DSO_FUNC_TYPE DSO_bind_func(DSO *dso,char *symname)

{
  DSO_FUNC_TYPE pDVar1;
  
  pDVar1 = DSO_bind_func(dso,symname);
  return pDVar1;
}

