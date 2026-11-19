/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22b4c
 */

char * DSO_convert_filename(DSO *dso,char *filename)

{
  char *pcVar1;
  undefined8 uVar2;
  _func_3878 *p_Var3;
  
  if (dso == (DSO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x113,"DSO_convert_filename");
    uVar2 = 0xc0102;
  }
  else if ((filename == (char *)0x0) && (filename = dso->filename, filename == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x119,"DSO_convert_filename");
    uVar2 = 0x6f;
  }
  else {
    if (((dso->flags & 1) == 0) &&
       (((p_Var3 = (_func_3878 *)dso->name_converter, p_Var3 != (_func_3878 *)0x0 ||
         (p_Var3 = dso->meth->dso_ctrl, p_Var3 != (_func_3878 *)0x0)) &&
        (pcVar1 = (*p_Var3)(dso,filename), pcVar1 != (char *)0x0)))) {
      return pcVar1;
    }
    pcVar1 = CRYPTO_strdup(filename,"crypto/dso/dso_lib.c",0x123);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x125,"DSO_convert_filename");
    uVar2 = 0xc0100;
  }
  ERR_set_error(0x25,uVar2,0);
  return (char *)0x0;
}

