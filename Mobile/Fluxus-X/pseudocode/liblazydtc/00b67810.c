/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67810
 */

undefined8 ossl_gcm_set_ctx_params(long param_1,long param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  byte bVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  long local_48;
  long local_38;
  
  if (param_2 == 0) {
LAB_00b67b60:
    uVar6 = 1;
  }
  else {
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002c5a75);
    if (lVar5 == 0) {
LAB_00b67878:
      lVar5 = OSSL_PARAM_locate_const(param_2,"ivlen");
      if (lVar5 != 0) {
        iVar4 = OSSL_PARAM_get_size_t(lVar5,&local_38);
        if (iVar4 == 0) {
          ERR_new();
          uVar6 = 0x101;
          goto LAB_00b67a9c;
        }
        if (0x7f < local_38 - 1U) {
          ERR_new();
          ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0x105,
                        "ossl_gcm_set_ctx_params");
          uVar6 = 0x6d;
          goto LAB_00b67aa8;
        }
        if (*(long *)(param_1 + 0x10) != local_38) {
          if (*(int *)(param_1 + 0x50) != 0) {
            *(undefined4 *)(param_1 + 0x50) = 3;
          }
          *(long *)(param_1 + 0x10) = local_38;
        }
      }
      lVar5 = OSSL_PARAM_locate_const(param_2,"tlsaad");
      if (lVar5 == 0) {
LAB_00b67a24:
        lVar5 = OSSL_PARAM_locate_const(param_2,"tlsivfixed");
        if (lVar5 != 0) {
          if (*(int *)(lVar5 + 8) != 5) {
            ERR_new();
            uVar6 = 0x121;
            goto LAB_00b67a9c;
          }
          uVar1 = *(ulong *)(lVar5 + 0x18);
          if (uVar1 != 0xffffffffffffffff) {
            if ((3 < uVar1) && (lVar8 = *(long *)(param_1 + 0x10), 7 < (ulong)(lVar8 - (int)uVar1)))
            {
              memcpy((void *)(param_1 + 0x55),*(void **)(lVar5 + 0x10),uVar1);
              bVar3 = *(byte *)(param_1 + 0x54);
              if ((bVar3 & 1) == 0) goto LAB_00b67acc;
              iVar4 = RAND_bytes_ex(*(undefined8 *)(param_1 + 0xe8),param_1 + uVar1 + 0x55,
                                    lVar8 - uVar1,0);
              if (0 < iVar4) goto LAB_00b67ac8;
            }
            ERR_new();
            uVar6 = 0x125;
            goto LAB_00b67a9c;
          }
          memcpy((void *)(param_1 + 0x55),*(void **)(lVar5 + 0x10),*(size_t *)(param_1 + 0x10));
LAB_00b67ac8:
          bVar3 = *(byte *)(param_1 + 0x54);
LAB_00b67acc:
          *(byte *)(param_1 + 0x54) = bVar3 | 0x10;
          *(undefined4 *)(param_1 + 0x50) = 1;
        }
        lVar5 = OSSL_PARAM_locate_const(param_2,"tlsivinv");
        if (lVar5 != 0) {
          if (*(void **)(lVar5 + 0x10) == (void *)0x0) {
            return 0;
          }
          if (*(int *)(lVar5 + 8) != 5) {
            return 0;
          }
          if ((*(byte *)(param_1 + 0x54) & 0x15) != 0x14) {
            return 0;
          }
          memcpy((void *)((param_1 + 0x55 + *(long *)(param_1 + 0x10)) - *(size_t *)(lVar5 + 0x18)),
                 *(void **)(lVar5 + 0x10),*(size_t *)(lVar5 + 0x18));
          uVar6 = (**(code **)(*(long *)(param_1 + 0xf0) + 8))
                            (param_1,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10));
          if ((int)uVar6 == 0) {
            return uVar6;
          }
          *(undefined4 *)(param_1 + 0x50) = 2;
        }
        goto LAB_00b67b60;
      }
      if (*(int *)(lVar5 + 8) != 5) {
        ERR_new();
        uVar6 = 0x113;
        goto LAB_00b67a9c;
      }
      puVar2 = *(undefined8 **)(lVar5 + 0x10);
      lVar5 = *(long *)(lVar5 + 0x18);
      iVar4 = ossl_prov_is_running();
      if ((lVar5 == 0xd) && (iVar4 != 0)) {
        *(undefined8 *)(param_1 + 0xda) = *(undefined8 *)((long)puVar2 + 5);
        uVar6 = *puVar2;
        *(undefined8 *)(param_1 + 0x28) = 0xd;
        uVar1 = (ulong)CONCAT11(*(undefined1 *)(param_1 + 0xe0),*(undefined1 *)(param_1 + 0xe1));
        *(undefined8 *)(param_1 + 0xd5) = uVar6;
        uVar7 = uVar1 - 8;
        if (7 < uVar1) {
          if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
            if (uVar7 < 0x10) goto LAB_00b679c0;
            uVar7 = uVar1 - 0x18;
          }
          *(char *)(param_1 + 0xe1) = (char)uVar7;
          *(char *)(param_1 + 0xe0) = (char)(uVar7 >> 8);
          local_38 = 0x10;
          *(undefined8 *)(param_1 + 0x20) = 0x10;
          goto LAB_00b67a24;
        }
      }
LAB_00b679c0:
      local_38 = 0;
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0x118,
                    "ossl_gcm_set_ctx_params");
      uVar6 = 0x6c;
    }
    else {
      local_48 = param_1 + 0xd5;
      iVar4 = OSSL_PARAM_get_octet_string(lVar5,&local_48,0x10,&local_38);
      if (iVar4 == 0) {
        ERR_new();
        uVar6 = 0xf4;
LAB_00b67a9c:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",uVar6,
                      "ossl_gcm_set_ctx_params");
        uVar6 = 0x67;
      }
      else {
        if ((local_38 != 0) && ((*(byte *)(param_1 + 0x54) & 1) == 0)) {
          *(long *)(param_1 + 0x18) = local_38;
          goto LAB_00b67878;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0xf8,
                      "ossl_gcm_set_ctx_params");
        uVar6 = 0x6e;
      }
    }
LAB_00b67aa8:
    ERR_set_error(0x39,uVar6,0);
    uVar6 = 0;
  }
  return uVar6;
}

