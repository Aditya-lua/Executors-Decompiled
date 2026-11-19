/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d8b4
 */

int NCONF_load(CONF *conf,char *file,long *eline)

{
  int iVar1;
  
  if (conf == (CONF *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0xfd,"NCONF_load");
    ERR_set_error(0xe,0x69,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a0d8c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*conf->meth->load)(conf,file,eline);
  return iVar1;
}

