/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66598
 */

undefined8 ossl_ccm_set_ctx_params(byte *param_1,long param_2)

{
  undefined8 *puVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  size_t __n;
  ulong uVar7;
  ulong uVar8;
  long local_38;
  
  if (param_2 == 0) {
    return 1;
  }
  lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002c5a75);
  if (lVar5 == 0) {
LAB_00b66618:
    lVar5 = OSSL_PARAM_locate_const(param_2,"ivlen");
    if (lVar5 == 0) {
LAB_00b666f8:
      lVar5 = OSSL_PARAM_locate_const(param_2,"tlsaad");
      if (lVar5 == 0) {
LAB_00b667f8:
        lVar5 = OSSL_PARAM_locate_const(param_2,"tlsivfixed");
        if (lVar5 == 0) {
          return 1;
        }
        if (*(int *)(lVar5 + 8) == 5) {
          if (*(long *)(lVar5 + 0x18) == 4) {
            *(undefined4 *)(param_1 + 0x30) = **(undefined4 **)(lVar5 + 0x10);
            return 1;
          }
          ERR_new();
          uVar6 = 0x8b;
          goto LAB_00b66664;
        }
        ERR_new();
        uVar6 = 0x87;
      }
      else {
        if (*(int *)(lVar5 + 8) == 5) {
          puVar1 = *(undefined8 **)(lVar5 + 0x10);
          lVar5 = *(long *)(lVar5 + 0x18);
          iVar4 = ossl_prov_is_running();
          if ((lVar5 == 0xd) && (iVar4 != 0)) {
            *(undefined8 *)(param_1 + 0x45) = *(undefined8 *)((long)puVar1 + 5);
            uVar6 = *puVar1;
            param_1[0x20] = 0xd;
            param_1[0x21] = 0;
            param_1[0x22] = 0;
            param_1[0x23] = 0;
            param_1[0x24] = 0;
            param_1[0x25] = 0;
            param_1[0x26] = 0;
            param_1[0x27] = 0;
            *(undefined8 *)(param_1 + 0x40) = uVar6;
            uVar7 = (ulong)CONCAT11(param_1[0x4b],param_1[0x4c]) - 8;
            if (((ulong)CONCAT11(param_1[0x4b],param_1[0x4c]) < 8) ||
               ((uVar8 = *(ulong *)(param_1 + 0x10), (*param_1 & 1) == 0 &&
                (bVar3 = uVar7 < uVar8, uVar7 = uVar7 - uVar8, bVar3)))) goto LAB_00b6676c;
            param_1[0x4c] = (byte)uVar7;
            local_38 = (long)(int)uVar8;
            param_1[0x4b] = (byte)(uVar7 >> 8);
            if ((int)uVar8 != 0) {
              *(long *)(param_1 + 0x28) = local_38;
              goto LAB_00b667f8;
            }
          }
          else {
LAB_00b6676c:
            local_38 = 0;
          }
          ERR_new();
          ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x7e,
                        "ossl_ccm_set_ctx_params");
          uVar6 = 0x73;
          goto LAB_00b66864;
        }
        ERR_new();
        uVar6 = 0x79;
      }
    }
    else {
      iVar4 = OSSL_PARAM_get_size_t(lVar5,&local_38);
      if (iVar4 != 0) {
        if (0xdU - local_38 < 7) {
          if (*(long *)(param_1 + 8) != 0xf - local_38) {
            *(long *)(param_1 + 8) = 0xf - local_38;
            *param_1 = *param_1 & 0xfb;
          }
          goto LAB_00b666f8;
        }
        ERR_new();
        uVar6 = 0x6d;
LAB_00b66664:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",uVar6,
                      "ossl_ccm_set_ctx_params");
        uVar6 = 0x6d;
        goto LAB_00b66864;
      }
      ERR_new();
      uVar6 = 0x68;
    }
  }
  else {
    if (*(int *)(lVar5 + 8) == 5) {
      __n = *(size_t *)(lVar5 + 0x18);
      if ((0xc < __n - 4) || ((__n & 1) != 0)) {
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x54,
                      "ossl_ccm_set_ctx_params");
        uVar6 = 0x76;
        goto LAB_00b66864;
      }
      if (*(void **)(lVar5 + 0x10) != (void *)0x0) {
        bVar2 = *param_1;
        if ((bVar2 & 1) != 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x5a,
                        "ossl_ccm_set_ctx_params");
          uVar6 = 0x78;
          goto LAB_00b66864;
        }
        memcpy(param_1 + 0x40,*(void **)(lVar5 + 0x10),__n);
        *param_1 = bVar2 | 8;
        __n = *(size_t *)(lVar5 + 0x18);
      }
      *(size_t *)(param_1 + 0x10) = __n;
      goto LAB_00b66618;
    }
    ERR_new();
    uVar6 = 0x50;
  }
  ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",uVar6,
                "ossl_ccm_set_ctx_params");
  uVar6 = 0x67;
LAB_00b66864:
  ERR_set_error(0x39,uVar6,0);
  return 0;
}

