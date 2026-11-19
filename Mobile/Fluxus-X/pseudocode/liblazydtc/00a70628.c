/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70628
 */

int evp_pkey_ctx_ctrl_str_to_param(int *param_1,long param_2,char *param_3)

{
  int iVar1;
  int *piVar2;
  size_t sVar3;
  code *pcVar4;
  undefined1 auStack_170 [80];
  undefined4 local_120;
  int iStack_11c;
  int local_118;
  int iStack_114;
  undefined8 local_110;
  long lStack_108;
  long local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  int *local_e0;
  int local_d8;
  long local_d0;
  uint local_c8;
  undefined4 local_c4;
  char *local_c0;
  undefined1 *local_b0;
  void *local_68;
  
  memset(&local_e0,0,0x90);
  uStack_f8 = 0;
  local_100 = 0;
  uStack_e8 = 0;
  uStack_f0 = 0;
  lStack_108 = 0;
  local_110 = 0;
  memset(auStack_170,0,0x50);
  iStack_114 = *param_1;
  iStack_11c = param_1[0x1d];
  local_d8 = 2;
  if (iStack_114 == 0) {
    iStack_114 = -1;
  }
  local_120 = 2;
  local_118 = iStack_11c;
  lStack_108 = param_2;
  local_100 = param_2;
  piVar2 = (int *)FUN_00a70be0(&local_120,&DAT_00c5ec98,0x55);
  pcVar4 = FUN_00a6fd84;
  if (piVar2 != (int *)0x0) {
    local_d8 = *piVar2;
    pcVar4 = FUN_00a6fd84;
    if (*(code **)(piVar2 + 0xe) != (code *)0x0) {
      pcVar4 = *(code **)(piVar2 + 0xe);
    }
    local_c8 = (uint)(local_100 != 0);
  }
  local_d0 = param_2;
  sVar3 = strlen(param_3);
  local_c4 = (undefined4)sVar3;
  local_e0 = param_1;
  local_c0 = param_3;
  local_b0 = auStack_170;
  iVar1 = (*pcVar4)(4,piVar2,&local_e0);
  if ((0 < iVar1) &&
     ((local_d8 != 2 || (iVar1 = evp_pkey_ctx_set_params_strict(param_1,local_b0), 0 < iVar1)))) {
    iVar1 = (*pcVar4)(5,piVar2,&local_e0);
  }
  if (local_68 != (void *)0x0) {
    CRYPTO_free(local_68);
  }
  return iVar1;
}

