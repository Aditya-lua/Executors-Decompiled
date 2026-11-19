/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b58724
 */

undefined8
ossl_prov_drbg_generate
          (long param_1,undefined8 param_2,ulong param_3,uint param_4,int param_5,undefined8 param_6
          ,ulong param_7)

{
  bool bVar1;
  __pid_t _Var2;
  int iVar3;
  undefined8 uVar4;
  time_t tVar5;
  
  uVar4 = ossl_prov_is_running();
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  iVar3 = *(int *)(param_1 + 0xf0);
  if (iVar3 != 1) {
    if (iVar3 == 2) {
      (**(code **)(param_1 + 0x18))(param_1);
      iVar3 = *(int *)(param_1 + 0xf0);
    }
    if (iVar3 == 0) {
      ossl_prov_drbg_instantiate(param_1,*(undefined4 *)(param_1 + 0x80),0,0,0);
      iVar3 = *(int *)(param_1 + 0xf0);
    }
    if (iVar3 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x27a,"ossl_prov_drbg_generate");
      uVar4 = 0xc1;
      goto LAB_00b589d4;
    }
    if (iVar3 == 2) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x276,"ossl_prov_drbg_generate");
      uVar4 = 0xc0;
      goto LAB_00b589d4;
    }
  }
  if (*(uint *)(param_1 + 0x80) < param_4) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x27f,"ossl_prov_drbg_generate");
    uVar4 = 0xb5;
  }
  else if (*(ulong *)(param_1 + 0x88) < param_3) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x284,"ossl_prov_drbg_generate");
    uVar4 = 0xc4;
  }
  else if (*(ulong *)(param_1 + 0xb8) < param_7) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x288,"ossl_prov_drbg_generate");
    uVar4 = 0xb8;
  }
  else {
    _Var2 = openssl_get_fork_id();
    bVar1 = *(int *)(param_1 + 0x78) != _Var2;
    if (bVar1) {
      *(__pid_t *)(param_1 + 0x78) = _Var2;
    }
    if (*(uint *)(param_1 + 0xc4) != 0) {
      bVar1 = *(uint *)(param_1 + 0xc4) <= *(uint *)(param_1 + 0xc0) || bVar1;
    }
    if (0 < *(long *)(param_1 + 0xd0)) {
      tVar5 = time((time_t *)0x0);
      if ((tVar5 < *(long *)(param_1 + 200)) ||
         (*(long *)(param_1 + 0xd0) <= tVar5 - *(long *)(param_1 + 200))) {
        bVar1 = true;
      }
    }
    if ((*(long *)(param_1 + 0x30) != 0) &&
       (iVar3 = FUN_00b59430(param_1), iVar3 != *(int *)(param_1 + 0xe0))) {
      bVar1 = true;
    }
    if (bVar1 || param_5 != 0) {
      iVar3 = ossl_prov_drbg_reseed(param_1,param_5,0,0,param_6,param_7);
      if (iVar3 == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/rands/drbg.c",0x2a4,"ossl_prov_drbg_generate");
        uVar4 = 0xc5;
        goto LAB_00b589d4;
      }
      param_7 = 0;
      param_6 = 0;
    }
    iVar3 = (**(code **)(param_1 + 0x28))(param_1,param_2,param_3,param_6,param_7);
    if (iVar3 != 0) {
      *(int *)(param_1 + 0xc0) = *(int *)(param_1 + 0xc0) + 1;
      return 1;
    }
    *(undefined4 *)(param_1 + 0xf0) = 2;
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x2ad,"ossl_prov_drbg_generate");
    uVar4 = 0xbf;
  }
LAB_00b589d4:
  ERR_set_error(0x39,uVar4,0);
  return 0;
}

