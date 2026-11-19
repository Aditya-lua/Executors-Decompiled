/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a229d0
 */

DSO_FUNC_TYPE DSO_bind_func(DSO *dso,char *symname)

{
  DSO_FUNC_TYPE pDVar1;
  undefined8 uVar2;
  _func_3876 *p_Var3;
  
  if ((dso == (DSO *)0x0) || (symname == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xa8,"DSO_bind_func");
    uVar2 = 0xc0102;
  }
  else {
    p_Var3 = dso->meth->dso_bind_var;
    if (p_Var3 == (_func_3876 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0xac,"DSO_bind_func");
      uVar2 = 0x6c;
    }
    else {
      pDVar1 = (*p_Var3)(dso,symname);
      if (pDVar1 != (DSO_FUNC_TYPE)0x0) {
        return pDVar1;
      }
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0xb0,"DSO_bind_func");
      uVar2 = 0x6a;
    }
  }
  ERR_set_error(0x25,uVar2,0);
  return (DSO_FUNC_TYPE)0x0;
}

