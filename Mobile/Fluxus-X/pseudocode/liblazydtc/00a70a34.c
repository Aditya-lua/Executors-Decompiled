/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70a34
 */

undefined8 FUN_00a70a34(int param_1,int *param_2)

{
  undefined8 uVar1;
  
  if (param_1 - 7U < 2) {
    if (param_2 != (int *)0x0) {
      if ((param_2[4] != 0) && (param_2[0xc] != 0)) {
        return 1;
      }
      ERR_new();
      uVar1 = 0x14e;
LAB_00a70b58:
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",uVar1,"default_check");
      ERR_set_error(6,0xc0103,0);
      return 0xffffffff;
    }
    ERR_new();
    uVar1 = 0x149;
  }
  else if (param_1 == 4) {
    if (param_2 == (int *)0x0) {
      return 1;
    }
    if (*param_2 != 1) {
      if ((*(long *)(param_2 + 10) == 0) || (param_2[0xc] == 0)) {
        ERR_new();
        ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x141,"default_check");
        ERR_set_error(6,0xc0103,0);
        return 0;
      }
      return 1;
    }
    ERR_new();
    uVar1 = 0x13c;
  }
  else {
    if (param_1 != 1) {
      return 1;
    }
    if (param_2 != (int *)0x0) {
      if ((*(long *)(param_2 + 10) != 0) && (param_2[0xc] != 0)) {
        return 1;
      }
      ERR_new();
      uVar1 = 0x12f;
      goto LAB_00a70b58;
    }
    ERR_new();
    uVar1 = 0x12a;
  }
  ERR_set_debug("crypto/evp/ctrl_params_translate.c",uVar1,"default_check");
  ERR_set_error(6,0x93,0);
  return 0xfffffffe;
}

