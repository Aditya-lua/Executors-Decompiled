/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2266c
 */

DSO * DSO_load(DSO *dso,char *filename,DSO_METHOD *meth,int flags)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  _func_3874 *p_Var5;
  
  bVar1 = false;
  if (dso == (DSO *)0x0) {
    dso = (DSO *)FUN_00a22380();
    if (dso == (DSO *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0x75,"DSO_load");
      ERR_set_error(0x25,0xc0100,0);
      return (DSO *)0x0;
    }
    bVar1 = true;
    dso->flags = flags;
    pcVar4 = dso->filename;
  }
  else {
    pcVar4 = dso->filename;
  }
  if (pcVar4 != (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x82,"DSO_load");
    uVar3 = 0x6e;
    goto LAB_00a227e0;
  }
  if (filename != (char *)0x0) {
    iVar2 = DSO_set_filename(dso,filename);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0x8b,"DSO_load");
      uVar3 = 0x70;
      goto LAB_00a227e0;
    }
    if (dso->filename != (char *)0x0) {
      p_Var5 = dso->meth->dso_load;
      if (p_Var5 == (_func_3874 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/dso/dso_lib.c",0x94,"DSO_load");
        uVar3 = 0x6c;
      }
      else {
        iVar2 = (*p_Var5)(dso);
        if (iVar2 != 0) {
          return dso;
        }
        ERR_new();
        ERR_set_debug("crypto/dso/dso_lib.c",0x98,"DSO_load");
        uVar3 = 0x67;
      }
      goto LAB_00a227e0;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/dso/dso_lib.c",0x90,"DSO_load");
  uVar3 = 0x6f;
LAB_00a227e0:
  ERR_set_error(0x25,uVar3,0);
  if (bVar1) {
    DSO_free(dso);
  }
  return (DSO *)0x0;
}

