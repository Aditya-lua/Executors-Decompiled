/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77554
 */

undefined8
FUN_00a77554(uint *param_1,int param_2,uint param_3,undefined4 param_4,undefined4 param_5,
            undefined8 param_6)

{
  uint uVar1;
  undefined8 uVar2;
  int *piVar3;
  
  piVar3 = *(int **)(param_1 + 0x1e);
  if ((piVar3 == (int *)0x0) || (*(long *)(piVar3 + 0x3e) == 0)) {
    if (*param_1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_lib.c",0x55e,"evp_pkey_ctx_ctrl_int");
      uVar2 = 0x95;
    }
    else {
      if ((param_3 == 0xffffffff) || ((*param_1 & param_3) != 0)) goto LAB_00a77594;
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_lib.c",0x563,"evp_pkey_ctx_ctrl_int");
      uVar2 = 0x94;
    }
    ERR_set_error(6,uVar2,0);
    uVar2 = 0xffffffff;
  }
  else {
LAB_00a77594:
    uVar1 = evp_pkey_ctx_state(param_1);
    if (uVar1 < 2) {
      if ((piVar3 == (int *)0x0) || (*(code **)(piVar3 + 0x30) == (code *)0x0)) {
        ERR_new();
        uVar2 = 0x56e;
      }
      else {
        if ((param_2 != -1) && (*piVar3 != param_2)) {
          return 0xffffffff;
        }
        uVar2 = (**(code **)(piVar3 + 0x30))(param_1,param_4,param_5,param_6);
        if ((int)uVar2 != -2) {
          return uVar2;
        }
        ERR_new();
        uVar2 = 0x577;
      }
      ERR_set_debug("crypto/evp/pmeth_lib.c",uVar2,"evp_pkey_ctx_ctrl_int");
      ERR_set_error(6,0x93,0);
      uVar2 = 0xfffffffe;
    }
    else {
      uVar2 = 0;
      if (uVar1 == 2) {
        uVar2 = evp_pkey_ctx_ctrl_to_param(param_1,param_2,param_3,param_4,param_5,param_6);
        return uVar2;
      }
    }
  }
  return uVar2;
}

