/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70794
 */

undefined8 FUN_00a70794(EVP_PKEY_CTX *param_1,undefined4 param_2,long *param_3)

{
  int optype;
  int keytype;
  int iVar1;
  int *piVar2;
  code *pcVar3;
  undefined4 local_138;
  int iStack_134;
  int local_130;
  int iStack_12c;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  long lStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  EVP_PKEY_CTX *local_f8;
  int local_f0;
  int local_ec;
  int local_dc;
  void *local_d8;
  long *local_c8;
  void *local_80;
  
  optype = *(int *)param_1;
  if (optype == 0) {
    optype = -1;
  }
  if ((param_3 != (long *)0x0) && (*param_3 != 0)) {
    keytype = *(int *)(param_1 + 0x74);
    do {
      memset(&local_f8,0,0x90);
      local_118 = 0;
      uStack_100 = 0;
      uStack_108 = 0;
      uStack_120 = 0;
      local_128 = 0;
      lStack_110 = *param_3;
      local_138 = param_2;
      iStack_134 = keytype;
      local_130 = keytype;
      iStack_12c = optype;
      piVar2 = (int *)FUN_00a70be0(&local_138,&DAT_00c5ec98,0x55);
      if (piVar2 == (int *)0x0) {
        pcVar3 = FUN_00a6fd84;
      }
      else {
        local_f0 = *piVar2;
        local_ec = piVar2[4];
        pcVar3 = FUN_00a6fd84;
        if (*(code **)(piVar2 + 0xe) != (code *)0x0) {
          pcVar3 = *(code **)(piVar2 + 0xe);
        }
      }
      local_f8 = param_1;
      local_c8 = param_3;
      iVar1 = (*pcVar3)(7,piVar2,&local_f8);
      if (0 < iVar1) {
        if (local_f0 != 0) {
          iVar1 = EVP_PKEY_CTX_ctrl(param_1,keytype,optype,local_ec,local_dc,local_d8);
          if (iVar1 < 1) goto LAB_00a708c4;
        }
        local_dc = iVar1;
        (*pcVar3)(8,piVar2,&local_f8);
        iVar1 = local_dc;
      }
LAB_00a708c4:
      if (local_80 != (void *)0x0) {
        CRYPTO_free(local_80);
      }
      if (iVar1 < 1) {
        return 0;
      }
      param_3 = param_3 + 5;
    } while (*param_3 != 0);
  }
  return 1;
}

