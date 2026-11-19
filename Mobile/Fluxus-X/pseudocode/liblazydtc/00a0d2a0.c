/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d2a0
 */

long CONF_get_number(lhash_st_CONF_VALUE *conf,char *group,char *name)

{
  int iVar1;
  byte *pbVar2;
  undefined8 uVar3;
  long lVar4;
  CONF aCStack_70 [2];
  long local_38;
  
  local_38 = 0;
  ERR_set_mark();
  if (conf == (lhash_st_CONF_VALUE *)0x0) {
    pbVar2 = (byte *)_CONF_get_string((CONF *)0x0,group,name);
    if (pbVar2 == (byte *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_lib.c",0x138,"NCONF_get_string");
      uVar3 = 0x6a;
    }
    else {
      iVar1 = ossl_isdigit(*pbVar2);
      lVar4 = 0;
      while( true ) {
        if (iVar1 == 0) {
          local_38 = lVar4;
          ERR_pop_to_mark();
          return lVar4;
        }
        if ((long)(-0x7fffffffffffffd1 - (ulong)*pbVar2) / 10 < lVar4) break;
        lVar4 = (ulong)*pbVar2 + lVar4 * 10 + -0x30;
        iVar1 = ossl_isdigit(pbVar2[1]);
        pbVar2 = pbVar2 + 1;
      }
      ERR_new();
      ERR_set_debug("crypto/conf/conf_lib.c",0x166,"NCONF_get_number_e");
      uVar3 = 0x79;
    }
    ERR_set_error(0xe,uVar3,0);
    ERR_pop_to_mark();
  }
  else {
    if (DAT_00d21950 == (CONF_METHOD *)0x0) {
      DAT_00d21950 = NCONF_default();
    }
    (*DAT_00d21950->init)(aCStack_70);
    aCStack_70[0].data = conf;
    iVar1 = NCONF_get_number_e(aCStack_70,group,name,&local_38);
    ERR_pop_to_mark();
    if (iVar1 != 0) {
      return local_38;
    }
  }
  return 0;
}

