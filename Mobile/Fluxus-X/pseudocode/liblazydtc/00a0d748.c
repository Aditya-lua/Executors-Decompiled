/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d748
 */

CONF * NCONF_new_ex(lhash_st_CONF_VALUE *param_1,CONF_METHOD *param_2)

{
  CONF *pCVar1;
  
  if (param_2 == (CONF_METHOD *)0x0) {
    param_2 = NCONF_default();
  }
  pCVar1 = (*param_2->create)(param_2);
  if (pCVar1 == (CONF *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0xbf,"NCONF_new_ex");
    ERR_set_error(0xe,0xc0100,0);
    pCVar1 = (CONF *)0x0;
  }
  else {
    pCVar1[1].data = param_1;
  }
  return pCVar1;
}

