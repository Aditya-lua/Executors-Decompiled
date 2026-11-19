/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2280c
 */

long DSO_ctrl(DSO *dso,int cmd,long larg,void *parg)

{
  DSO_FUNC_TYPE pDVar1;
  undefined8 uVar2;
  _func_3877 *UNRECOVERED_JUMPTABLE;
  
  if (dso == (DSO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xc3,"DSO_ctrl");
    uVar2 = 0xc0102;
  }
  else {
    if (cmd == 3) {
      dso->flags = dso->flags | (uint)larg;
      return 0;
    }
    if (cmd == 2) {
      dso->flags = (uint)larg;
      return 0;
    }
    if (cmd == 1) {
      return (long)dso->flags;
    }
    if ((dso->meth != (DSO_METHOD *)0x0) &&
       (UNRECOVERED_JUMPTABLE = dso->meth->dso_bind_func, UNRECOVERED_JUMPTABLE != (_func_3877 *)0x0
       )) {
                    /* WARNING: Could not recover jumptable at 0x00a22898. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      pDVar1 = (*UNRECOVERED_JUMPTABLE)(dso,(char *)(ulong)(uint)cmd);
      return (long)pDVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xd7,"DSO_ctrl");
    uVar2 = 0x6c;
  }
  ERR_set_error(0x25,uVar2,0);
  return -1;
}

