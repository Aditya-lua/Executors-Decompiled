/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b590a8
 */

ulong ossl_prov_drbg_reseed
                (long param_1,undefined4 param_2,long param_3,ulong param_4,long param_5,
                ulong param_6)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  ulong uVar4;
  long lVar5;
  time_t tVar6;
  undefined8 uVar7;
  code *pcVar8;
  undefined8 local_48;
  
  local_48 = 0;
  uVar4 = ossl_prov_is_running();
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  iVar2 = *(int *)(param_1 + 0xf0);
  if (iVar2 != 1) {
    if (iVar2 == 2) {
      (**(code **)(param_1 + 0x18))(param_1);
      iVar2 = *(int *)(param_1 + 0xf0);
    }
    if (iVar2 == 0) {
      ossl_prov_drbg_instantiate(param_1,*(undefined4 *)(param_1 + 0x80),0,0,0);
      iVar2 = *(int *)(param_1 + 0xf0);
    }
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x208,"ossl_prov_drbg_reseed");
      uVar7 = 0xc1;
      goto LAB_00b59378;
    }
    if (iVar2 == 2) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x204,"ossl_prov_drbg_reseed");
      uVar7 = 0xc0;
      goto LAB_00b59378;
    }
  }
  if (param_3 != 0) {
    if (param_4 < *(ulong *)(param_1 + 0x90)) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x20f,"ossl_prov_drbg_reseed");
      uVar7 = 0x7c;
LAB_00b591f0:
      ERR_set_error(0x24,uVar7,0);
      *(undefined4 *)(param_1 + 0xf0) = 2;
      return 0;
    }
    if (*(ulong *)(param_1 + 0x98) < param_4) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x214,"ossl_prov_drbg_reseed");
      uVar7 = 0x6a;
      goto LAB_00b591f0;
    }
  }
  if (param_5 == 0) {
    param_6 = 0;
  }
  else if (*(ulong *)(param_1 + 0xb8) < param_6) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x21d,"ossl_prov_drbg_reseed");
    uVar7 = 0xb8;
    goto LAB_00b59378;
  }
  *(undefined4 *)(param_1 + 0xf0) = 2;
  iVar1 = *(int *)(param_1 + 0xd8);
  iVar2 = iVar1;
  if ((iVar1 != 0) && (iVar2 = 1, iVar1 != -1)) {
    iVar2 = iVar1 + 1;
  }
  *(int *)(param_1 + 0xdc) = iVar2;
  if (param_3 != 0) {
    iVar2 = (**(code **)(param_1 + 0x20))(param_1,param_3,param_4,param_5,param_6);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x239,"ossl_prov_drbg_reseed");
      uVar7 = 0xcc;
LAB_00b59378:
      ERR_set_error(0x39,uVar7,0);
      return 0;
    }
    param_6 = 0;
    param_5 = 0;
  }
  uVar4 = FUN_00b58f10(param_1,&local_48,*(undefined4 *)(param_1 + 0x80),
                       *(undefined8 *)(param_1 + 0x90),*(undefined8 *)(param_1 + 0x98),param_2);
  if ((uVar4 < *(ulong *)(param_1 + 0x90)) || (*(ulong *)(param_1 + 0x98) < uVar4)) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x248,"ossl_prov_drbg_reseed");
    ERR_set_error(0x39,0xbd,0);
  }
  else {
    iVar2 = (**(code **)(param_1 + 0x20))(param_1,local_48,uVar4,param_5,param_6);
    if (iVar2 != 0) {
      *(undefined4 *)(param_1 + 0xf0) = 1;
      *(undefined4 *)(param_1 + 0xc0) = 1;
      tVar6 = time((time_t *)0x0);
      *(time_t *)(param_1 + 200) = tVar6;
      *(undefined4 *)(param_1 + 0xd8) = *(undefined4 *)(param_1 + 0xdc);
      if (*(long *)(param_1 + 0x30) != 0) {
        uVar3 = FUN_00b59430(param_1);
        *(undefined4 *)(param_1 + 0xe0) = uVar3;
      }
    }
  }
  uVar7 = local_48;
  lVar5 = *(long *)(param_1 + 0x30);
  if (lVar5 == 0) {
    ossl_prov_cleanup_entropy(*(undefined8 *)(param_1 + 8),local_48,uVar4);
  }
  else {
    pcVar8 = *(code **)(param_1 + 0x68);
    if (pcVar8 != (code *)0x0) {
      if (*(code **)(param_1 + 0x40) != (code *)0x0) {
        iVar2 = (**(code **)(param_1 + 0x40))();
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/rands/drbg.c",0x46,"ossl_drbg_lock_parent");
          ERR_set_error(0x39,0xb6,0);
          goto LAB_00b5940c;
        }
        pcVar8 = *(code **)(param_1 + 0x68);
        lVar5 = *(long *)(param_1 + 0x30);
      }
      (*pcVar8)(lVar5,uVar7,uVar4);
      if ((*(long *)(param_1 + 0x30) != 0) && (*(code **)(param_1 + 0x48) != (code *)0x0)) {
        (**(code **)(param_1 + 0x48))();
      }
    }
  }
LAB_00b5940c:
  return (ulong)(*(int *)(param_1 + 0xf0) == 1);
}

