/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22df4
 */

void * DSO_global_lookup(char *name)

{
  uint uVar1;
  DSO_METHOD *pDVar2;
  _func_3881 *UNRECOVERED_JUMPTABLE;
  int in_w2;
  
  pDVar2 = DSO_METHOD_openssl();
  UNRECOVERED_JUMPTABLE = pDVar2->pathbyaddr;
  if (UNRECOVERED_JUMPTABLE == (_func_3881 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x14e,"DSO_global_lookup");
    ERR_set_error(0x25,0x6c,0);
    return (void *)0x0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a22e1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(name,(char *)UNRECOVERED_JUMPTABLE,in_w2);
  return (void *)(ulong)uVar1;
}

