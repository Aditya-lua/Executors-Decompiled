/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9eb8
 */

uint * OSSL_STORE_load(long *param_1)

{
  long *plVar1;
  uint uVar2;
  int iVar3;
  uint *puVar4;
  long lVar5;
  uint *local_50;
  long *plStack_48;
  
  *(undefined4 *)(param_1 + 7) = 1;
  plVar1 = param_1 + 9;
  while( true ) {
    if ((param_1[1] == 0) || (iVar3 = (**(code **)(*param_1 + 0xb8))(param_1[2]), param_1[1] == 0))
    {
      iVar3 = (**(code **)(*param_1 + 0x40))(param_1[2]);
    }
    if (iVar3 != 0) {
      return (uint *)0x0;
    }
    if (param_1[8] != 0) break;
LAB_00ae9f94:
    if (param_1[1] == 0) {
LAB_00ae9fd8:
      puVar4 = (uint *)(**(code **)(*param_1 + 0x38))(param_1[2],param_1[10],param_1[0xb]);
    }
    else {
      local_50 = (uint *)0x0;
      *(undefined4 *)((long)param_1 + 0x3c) = 0;
      plStack_48 = param_1;
      iVar3 = (**(code **)(param_1[1] + 0xb0))
                        (param_1[2],ossl_store_handle_load_result,&local_50,
                         ossl_pw_passphrase_callback_dec,plVar1);
      if (iVar3 == 0) {
        *(undefined4 *)((long)param_1 + 0x3c) = 1;
        return (uint *)0x0;
      }
      puVar4 = local_50;
      if (param_1[1] == 0) goto LAB_00ae9fd8;
    }
    if (puVar4 == (uint *)0x0) goto LAB_00ae9ff4;
LAB_00ae9f58:
    if ((code *)param_1[3] == (code *)0x0) goto LAB_00ae9ff4;
    puVar4 = (uint *)(*(code *)param_1[3])(puVar4,param_1[4]);
    if (puVar4 != (uint *)0x0) {
      ossl_pw_clear_passphrase_cache(plVar1);
      uVar2 = *(uint *)(param_1 + 5);
      if (uVar2 == 0) {
        return puVar4;
      }
LAB_00aea008:
      if (*puVar4 < 2) {
        return puVar4;
      }
      if (uVar2 == *puVar4) {
        return puVar4;
      }
      OSSL_STORE_INFO_free(puVar4);
    }
  }
  iVar3 = OPENSSL_sk_num();
  lVar5 = param_1[8];
  if (iVar3 == 0) {
    OPENSSL_sk_free(lVar5);
    param_1[8] = 0;
    goto LAB_00ae9f94;
  }
  if (lVar5 == 0) goto LAB_00ae9f94;
  puVar4 = (uint *)OPENSSL_sk_shift(lVar5);
  if (puVar4 != (uint *)0x0) goto LAB_00ae9f58;
LAB_00ae9ff4:
  ossl_pw_clear_passphrase_cache(plVar1);
  if (puVar4 == (uint *)0x0) {
    return (uint *)0x0;
  }
  uVar2 = *(uint *)(param_1 + 5);
  if (uVar2 == 0) {
    return puVar4;
  }
  goto LAB_00aea008;
}

