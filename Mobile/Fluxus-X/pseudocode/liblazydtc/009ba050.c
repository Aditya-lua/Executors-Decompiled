/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba050
 */

undefined8 SSL_CONF_cmd_argv(uint *param_1,int *param_2,long *param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  bool bVar5;
  
  if (param_2 == (int *)0x0) {
    bVar5 = true;
  }
  else {
    bVar5 = false;
    if (*param_2 < 1) {
      return 0;
    }
  }
  lVar3 = *(long *)*param_3;
  if (lVar3 != 0) {
    if ((bVar5) || (lVar4 = 0, 1 < *param_2)) {
      lVar4 = ((long *)*param_3)[1];
    }
    *param_1 = *param_1 & 0xfffffffc | 1;
    uVar2 = SSL_CONF_cmd(param_1,lVar3,lVar4);
    iVar1 = (int)uVar2;
    if (0 < iVar1) {
      *param_3 = *param_3 + (long)iVar1 * 8;
      if (param_2 == (int *)0x0) {
        return uVar2;
      }
      *param_2 = *param_2 - iVar1;
      return uVar2;
    }
    if (iVar1 != -2) {
      if (iVar1 == 0) {
        return 0xffffffff;
      }
      return uVar2;
    }
  }
  return 0;
}

