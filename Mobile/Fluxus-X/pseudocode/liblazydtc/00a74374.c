/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74374
 */

int FUN_00a74374(int *param_1,int param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  code *pcVar4;
  
  if (param_1 == (int *)0x0) {
LAB_00a74468:
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_gn.c",0x59,"gen_init");
    ERR_set_error(6,0x96,0);
    iVar1 = -2;
joined_r0x00a74460:
    if ((param_1 != (int *)0x0) && (iVar1 < 1)) {
      evp_pkey_ctx_free_old_ops(param_1);
      *param_1 = 0;
    }
  }
  else {
    evp_pkey_ctx_free_old_ops(param_1);
    lVar2 = *(long *)(param_1 + 8);
    *param_1 = param_2;
    if ((lVar2 == 0) || (*(long *)(lVar2 + 0x60) == 0)) {
      lVar2 = *(long *)(param_1 + 0x1e);
      if (lVar2 == 0) goto LAB_00a74468;
      if (param_2 == 4) {
        if (*(long *)(lVar2 + 0x38) == 0) goto LAB_00a74468;
        pcVar4 = *(code **)(lVar2 + 0x30);
        if (pcVar4 == (code *)0x0) goto LAB_00a744b4;
LAB_00a74454:
        iVar1 = (*pcVar4)(param_1);
        goto joined_r0x00a74460;
      }
      if (param_2 == 2) {
        if (*(long *)(lVar2 + 0x28) == 0) goto LAB_00a74468;
        pcVar4 = *(code **)(lVar2 + 0x20);
        if (pcVar4 != (code *)0x0) goto LAB_00a74454;
      }
    }
    else {
      if (param_2 == 2) {
        uVar3 = 0x84;
LAB_00a743f0:
        lVar2 = evp_keymgmt_gen_init(lVar2,uVar3,0);
        *(long *)(param_1 + 10) = lVar2;
      }
      else {
        if (param_2 == 4) {
          uVar3 = 3;
          goto LAB_00a743f0;
        }
        lVar2 = *(long *)(param_1 + 10);
      }
      if (lVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_gn.c",0x34,"gen_init");
        ERR_set_error(6,0x86,0);
        iVar1 = 0;
        goto joined_r0x00a74460;
      }
    }
LAB_00a744b4:
    iVar1 = 1;
  }
  return iVar1;
}

