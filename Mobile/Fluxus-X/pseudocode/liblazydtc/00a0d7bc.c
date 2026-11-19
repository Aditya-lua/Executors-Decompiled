/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d7bc
 */

CONF * NCONF_new(CONF_METHOD *meth)

{
  CONF *pCVar1;
  
  if (meth == (CONF_METHOD *)0x0) {
    meth = NCONF_default();
  }
  pCVar1 = (*meth->create)(meth);
  if (pCVar1 == (CONF *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0xbf,"NCONF_new_ex");
    ERR_set_error(0xe,0xc0100,0);
    return (CONF *)0x0;
  }
  pCVar1[1].data = (lhash_st_CONF_VALUE *)0x0;
  return pCVar1;
}

