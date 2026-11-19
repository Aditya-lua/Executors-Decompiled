/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4cea0
 */

undefined8 FUN_00b4cea0(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  char *__s1;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == 0) {
LAB_00b4cfb8:
    uVar4 = 1;
  }
  else {
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002cecd9);
    if (lVar3 == 0) {
LAB_00b4cf3c:
      lVar3 = OSSL_PARAM_locate_const(param_2,"group");
      if (lVar3 == 0) {
LAB_00b4cf78:
        lVar3 = OSSL_PARAM_locate_const(param_2,"pbits");
        if ((lVar3 != 0) && (uVar4 = OSSL_PARAM_get_size_t(lVar3,param_1 + 0x18), (int)uVar4 == 0))
        {
          return uVar4;
        }
        lVar3 = OSSL_PARAM_locate_const(param_2,"priv_len");
        if ((lVar3 != 0) && (uVar4 = OSSL_PARAM_get_int(lVar3,param_1 + 0x4c), (int)uVar4 == 0)) {
          return uVar4;
        }
        goto LAB_00b4cfb8;
      }
      if (((*(int *)(lVar3 + 8) == 4) && (*(long *)(lVar3 + 0x10) != 0)) &&
         (lVar3 = ossl_ffc_name_to_dh_named_group(), lVar3 != 0)) {
        iVar2 = ossl_ffc_named_group_get_uid();
        *(int *)(param_1 + 0x14) = iVar2;
        if (iVar2 != 0) goto LAB_00b4cf78;
      }
      ERR_new();
      uVar4 = 0x227;
    }
    else {
      if (*(int *)(lVar3 + 8) == 4) {
        __s1 = *(char **)(lVar3 + 0x10);
        iVar2 = *(int *)(param_1 + 0x70);
        iVar1 = strcmp(__s1,"default");
        if (iVar1 == 0) {
          *(uint *)(param_1 + 0x3c) = (uint)(iVar2 == 0x1000);
        }
        else {
          iVar2 = ossl_dh_gen_type_name2id(__s1,iVar2);
          *(int *)(param_1 + 0x3c) = iVar2;
          if (iVar2 == -1) goto LAB_00b4cf14;
        }
        goto LAB_00b4cf3c;
      }
LAB_00b4cf14:
      ERR_new();
      uVar4 = 0x21a;
    }
    ERR_set_debug("providers/implementations/keymgmt/dh_kmgmt.c",uVar4,"dh_gen_common_set_params");
    ERR_set_error(0x39,0x80106,0);
    uVar4 = 0;
  }
  return uVar4;
}

