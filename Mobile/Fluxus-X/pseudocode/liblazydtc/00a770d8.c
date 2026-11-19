/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a770d8
 */

int FUN_00a770d8(int *param_1,void *param_2,size_t *param_3)

{
  size_t sVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  long local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  size_t local_98;
  long local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  size_t local_70;
  long local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  size_t local_48;
  void *local_38;
  
  local_38 = (void *)0x0;
  iVar2 = *param_1;
  if ((((iVar2 - 0x10U < 0x31) && ((1L << ((ulong)(iVar2 - 0x10U) & 0x3f) & 0x1000000010001U) != 0))
      || (iVar2 == 0x80)) || (iVar2 == 0x100)) {
    OSSL_PARAM_construct_octet_ptr(&local_b8,"distid",&local_38,0);
    local_70 = local_98;
    uStack_88 = uStack_b0;
    local_90 = local_b8;
    uStack_78 = uStack_a0;
    uStack_80 = local_a8;
    OSSL_PARAM_construct_end(&local_b8);
    local_48 = local_98;
    uStack_50 = uStack_a0;
    local_58 = local_a8;
    uStack_60 = uStack_b0;
    local_68 = local_b8;
    if ((*(long *)(param_1 + 8) != 0) &&
       (uVar3 = EVP_PKEY_CTX_gettable_params(param_1), local_90 != 0)) {
      plVar5 = &local_68;
      do {
        lVar4 = OSSL_PARAM_locate_const(uVar3);
        if (lVar4 == 0) goto LAB_00a771d0;
        lVar4 = *plVar5;
        plVar5 = plVar5 + 5;
      } while (lVar4 != 0);
    }
    iVar2 = EVP_PKEY_CTX_get_params(param_1,&local_90);
    sVar1 = local_70;
    if (iVar2 != -2) {
      if (iVar2 < 1) {
        return iVar2;
      }
      if (param_2 != (void *)0x0) {
        memcpy(param_2,local_38,local_70);
      }
      if (param_3 == (size_t *)0x0) {
        return iVar2;
      }
      *param_3 = sVar1;
      return iVar2;
    }
LAB_00a771d0:
    ERR_new();
    uVar3 = 0x531;
  }
  else {
    ERR_new();
    uVar3 = 0x526;
  }
  ERR_set_debug("crypto/evp/pmeth_lib.c",uVar3,"get1_id_data");
  ERR_set_error(6,0x93,0);
  return -2;
}

