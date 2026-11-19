/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22ad8
 */

char * DSO_merge(DSO *dso,char *filespec1,char *filespec2)

{
  char *pcVar1;
  DSO_MERGER_FUNC UNRECOVERED_JUMPTABLE;
  
  if ((dso == (DSO *)0x0) || (filespec1 == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x102,"DSO_merge");
    ERR_set_error(0x25,0xc0102,0);
    return (char *)0x0;
  }
  if (((dso->flags & 1) == 0) &&
     ((UNRECOVERED_JUMPTABLE = dso->merger, UNRECOVERED_JUMPTABLE != (DSO_MERGER_FUNC)0x0 ||
      (UNRECOVERED_JUMPTABLE = (DSO_MERGER_FUNC)dso->meth->dso_name_converter,
      UNRECOVERED_JUMPTABLE != (DSO_MERGER_FUNC)0x0)))) {
                    /* WARNING: Could not recover jumptable at 0x00a22afc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pcVar1 = (*UNRECOVERED_JUMPTABLE)(dso,filespec1,filespec2);
    return pcVar1;
  }
  return (char *)0x0;
}

