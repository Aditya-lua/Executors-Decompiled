/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d414
 */

int NCONF_get_number_e(CONF *conf,char *group,char *name,long *result)

{
  _func_3670 *p_Var1;
  _func_3671 *p_Var2;
  int iVar3;
  char *pcVar4;
  undefined8 uVar5;
  _func_3671 *p_Var6;
  code *pcVar7;
  long lVar8;
  
  if (result == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x153,"NCONF_get_number_e");
    uVar5 = 0xc0102;
LAB_00a0d534:
    ERR_set_error(0xe,uVar5,0);
    iVar3 = 0;
  }
  else {
    pcVar4 = NCONF_get_string(conf,group,name);
    iVar3 = 0;
    if (pcVar4 != (char *)0x0) {
      p_Var6 = (_func_3671 *)&UNK_00a0d9e0;
      pcVar7 = FUN_00a0d9d8;
      if (conf != (CONF *)0x0) {
        p_Var1 = conf->meth->is_number;
        p_Var2 = conf->meth->to_int;
        pcVar7 = FUN_00a0d9d8;
        if (p_Var1 != (_func_3670 *)0x0) {
          pcVar7 = p_Var1;
        }
        p_Var6 = (_func_3671 *)&UNK_00a0d9e0;
        if (p_Var2 != (_func_3671 *)0x0) {
          p_Var6 = p_Var2;
        }
      }
      iVar3 = (*pcVar7)(conf,*pcVar4);
      lVar8 = 0;
      while (iVar3 != 0) {
        iVar3 = (*p_Var6)(conf,*pcVar4);
        if ((0x7fffffffffffffff - (long)iVar3) / 10 < lVar8) {
          ERR_new();
          ERR_set_debug("crypto/conf/conf_lib.c",0x166,"NCONF_get_number_e");
          uVar5 = 0x79;
          goto LAB_00a0d534;
        }
        lVar8 = (long)iVar3 + lVar8 * 10;
        iVar3 = (*pcVar7)(conf,pcVar4[1]);
        pcVar4 = pcVar4 + 1;
      }
      iVar3 = 1;
      *result = lVar8;
    }
  }
  return iVar3;
}

