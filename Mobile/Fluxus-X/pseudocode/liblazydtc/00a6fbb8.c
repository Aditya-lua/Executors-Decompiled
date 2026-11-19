/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6fbb8
 */

int evp_pkey_ctx_ctrl_to_param
              (long param_1,int param_2,undefined4 param_3,undefined4 param_4,int param_5,
              undefined8 param_6)

{
  code *pcVar1;
  int iVar2;
  int *piVar3;
  undefined1 auStack_170 [80];
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  long local_e0;
  int local_d8;
  undefined4 uStack_d4;
  int local_c4;
  undefined8 local_c0;
  undefined1 *local_b0;
  void *local_68;
  
  memset(&local_e0,0,0x90);
  uStack_f8 = 0;
  local_100 = 0;
  uStack_e8 = 0;
  uStack_f0 = 0;
  uStack_118 = 0;
  local_120 = 0;
  uStack_108 = 0;
  uStack_110 = 0;
  memset(auStack_170,0,0x50);
  if (param_2 == -1) {
    param_2 = *(int *)(param_1 + 0x74);
  }
  uStack_110 = CONCAT44(uStack_110._4_4_,param_4);
  local_120 = CONCAT44(param_2,(undefined4)local_120);
  uStack_118 = CONCAT44(param_3,param_2);
  piVar3 = (int *)FUN_00a70be0(&local_120,&DAT_00c5ec98,0x55);
  if (piVar3 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0xa5e,"evp_pkey_ctx_ctrl_to_param");
    ERR_set_error(6,0x93,0);
    return -2;
  }
  if (((*(int **)(param_1 + 0x78) != (int *)0x0) &&
      (iVar2 = **(int **)(param_1 + 0x78), iVar2 != piVar3[1])) && (iVar2 != piVar3[2])) {
    return -1;
  }
  local_d8 = *piVar3;
  pcVar1 = FUN_00a6fd84;
  if (*(code **)(piVar3 + 0xe) != (code *)0x0) {
    pcVar1 = *(code **)(piVar3 + 0xe);
  }
  local_e0 = param_1;
  uStack_d4 = param_4;
  local_c4 = param_5;
  local_c0 = param_6;
  local_b0 = auStack_170;
  iVar2 = (*pcVar1)(1,piVar3,&local_e0);
  if (iVar2 < 1) goto LAB_00a6fd40;
  if (local_d8 == 2) {
    iVar2 = evp_pkey_ctx_set_params_strict(param_1,local_b0);
LAB_00a6fd1c:
    if (iVar2 < 1) goto LAB_00a6fd40;
  }
  else if (local_d8 == 1) {
    iVar2 = evp_pkey_ctx_get_params_strict(param_1,local_b0);
    goto LAB_00a6fd1c;
  }
  local_c4 = iVar2;
  (*pcVar1)(2,piVar3,&local_e0);
  iVar2 = local_c4;
LAB_00a6fd40:
  if (local_68 != (void *)0x0) {
    CRYPTO_free(local_68);
  }
  return iVar2;
}

