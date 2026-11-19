/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70924
 */

undefined4 evp_pkey_get_params_to_ctrl(undefined8 param_1,long *param_2)

{
  undefined4 uVar1;
  int *piVar2;
  long lVar3;
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 local_100;
  long lStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined1 auStack_e0 [8];
  int local_d8;
  undefined8 local_c0;
  long *local_b0;
  void *local_68;
  
  if (param_2 == (long *)0x0) {
    uVar1 = 1;
  }
  else {
    uVar1 = 1;
    lVar3 = *param_2;
    while (lVar3 != 0) {
      memset(auStack_e0,0,0x90);
      uStack_118 = 0;
      uStack_108 = 0;
      uStack_110 = 0;
      local_100 = 0;
      uStack_e8 = 0;
      uStack_f0 = 0;
      local_120 = 1;
      lStack_f8 = *param_2;
      piVar2 = (int *)FUN_00a70be0(&local_120,&DAT_00c60308,0x27);
      if (piVar2 == (int *)0x0) {
        return 0xfffffffe;
      }
      local_d8 = *piVar2;
      if (*(code **)(piVar2 + 0xe) == (code *)0x0) {
        return 0xfffffffe;
      }
      if (local_d8 != 1) {
        return 0xfffffffe;
      }
      local_c0 = param_1;
      local_b0 = param_2;
      uVar1 = (**(code **)(piVar2 + 0xe))(0,piVar2,auStack_e0);
      if (local_68 != (void *)0x0) {
        CRYPTO_free(local_68);
      }
      param_2 = param_2 + 5;
      lVar3 = *param_2;
    }
  }
  return uVar1;
}

