/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d6f8
 */

int NCONF_dump_bio(CONF *conf,BIO *out)

{
  int iVar1;
  
  if (conf == (CONF *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x18e,"NCONF_dump_bio");
    ERR_set_error(0xe,0x69,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a0d704. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*conf->meth->dump)(conf,out);
  return iVar1;
}

