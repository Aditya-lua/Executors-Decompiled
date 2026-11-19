/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67458
 */

undefined8 ossl_gcm_get_ctx_params(long param_1,undefined8 param_2)

{
  char cVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  void *__dest;
  size_t __n;
  
  lVar3 = OSSL_PARAM_locate(param_2,"ivlen");
  if ((lVar3 == 0) ||
     (iVar2 = OSSL_PARAM_set_size_t(lVar3,*(undefined8 *)(param_1 + 0x10)), iVar2 != 0)) {
    lVar3 = OSSL_PARAM_locate(param_2,"keylen");
    if ((lVar3 == 0) ||
       (iVar2 = OSSL_PARAM_set_size_t(lVar3,*(undefined8 *)(param_1 + 8)), iVar2 != 0)) {
      lVar3 = OSSL_PARAM_locate(param_2,"taglen");
      if (lVar3 != 0) {
        lVar6 = 0x10;
        if (*(long *)(param_1 + 0x18) != -1) {
          lVar6 = *(long *)(param_1 + 0x18);
        }
        iVar2 = OSSL_PARAM_set_size_t(lVar3,lVar6);
        if (iVar2 == 0) {
          ERR_new();
          uVar4 = 0xa5;
          goto LAB_00b67578;
        }
      }
      lVar3 = OSSL_PARAM_locate(param_2,&DAT_002bdad8);
      if (lVar3 != 0) {
        if (*(int *)(param_1 + 0x50) == 0) {
          return 0;
        }
        if (*(ulong *)(param_1 + 0x10) <= *(ulong *)(lVar3 + 0x18)) {
          iVar2 = OSSL_PARAM_set_octet_string(lVar3,param_1 + 0x55);
          if ((iVar2 == 0) &&
             (iVar2 = OSSL_PARAM_set_octet_ptr(lVar3,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10))
             , iVar2 == 0)) {
            ERR_new();
            uVar4 = 0xb4;
            goto LAB_00b67578;
          }
          goto LAB_00b675c8;
        }
        ERR_new();
        uVar4 = 0xaf;
LAB_00b67610:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",uVar4,
                      "ossl_gcm_get_ctx_params");
        uVar4 = 0x6d;
        goto LAB_00b67584;
      }
LAB_00b675c8:
      lVar3 = OSSL_PARAM_locate(param_2,"updated-iv");
      if (lVar3 != 0) {
        if (*(int *)(param_1 + 0x50) == 0) {
          return 0;
        }
        if (*(ulong *)(lVar3 + 0x18) < *(ulong *)(param_1 + 0x10)) {
          ERR_new();
          uVar4 = 0xbe;
          goto LAB_00b67610;
        }
        iVar2 = OSSL_PARAM_set_octet_string(lVar3,param_1 + 0x55);
        if ((iVar2 == 0) &&
           (iVar2 = OSSL_PARAM_set_octet_ptr(lVar3,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10)),
           iVar2 == 0)) {
          ERR_new();
          uVar4 = 0xc3;
          goto LAB_00b67578;
        }
      }
      lVar3 = OSSL_PARAM_locate(param_2,"tlsaadpad");
      if ((lVar3 == 0) ||
         (iVar2 = OSSL_PARAM_set_size_t(lVar3,*(undefined8 *)(param_1 + 0x20)), iVar2 != 0)) {
        lVar3 = OSSL_PARAM_locate(param_2,&DAT_002c5a75);
        if (lVar3 == 0) {
LAB_00b676ac:
          lVar3 = OSSL_PARAM_locate(param_2,"tlsivgen");
          if (lVar3 == 0) {
            return 1;
          }
          __dest = *(void **)(lVar3 + 0x10);
          if (__dest == (void *)0x0) {
            return 0;
          }
          if (*(int *)(lVar3 + 8) != 5) {
            return 0;
          }
          if (((*(byte *)(param_1 + 0x54) ^ 0xff) & 0x14) != 0) {
            return 0;
          }
          __n = *(size_t *)(lVar3 + 0x18);
          uVar4 = (**(code **)(*(long *)(param_1 + 0xf0) + 8))
                            (param_1,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10));
          if ((int)uVar4 == 0) {
            return uVar4;
          }
          uVar5 = *(ulong *)(param_1 + 0x10);
          if (uVar5 <= __n - 1) {
            __n = uVar5;
          }
          memcpy(__dest,(void *)((param_1 + uVar5 + 0x55) - __n),__n);
          lVar6 = 0;
          lVar3 = param_1 + *(long *)(param_1 + 0x10) + 0x54;
          do {
            cVar1 = *(char *)(lVar3 + lVar6) + '\x01';
            *(char *)(lVar3 + lVar6) = cVar1;
            if (lVar6 + 8U < 2) break;
            lVar6 = lVar6 + -1;
          } while (cVar1 == '\0');
          *(undefined4 *)(param_1 + 0x50) = 2;
          return 1;
        }
        if (((0xf < *(long *)(lVar3 + 0x18) - 1U) || ((*(byte *)(param_1 + 0x54) & 1) == 0)) ||
           (*(long *)(param_1 + 0x18) == -1)) {
          ERR_new();
          ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0xd4,
                        "ossl_gcm_get_ctx_params");
          uVar4 = 0x6e;
          goto LAB_00b67584;
        }
        iVar2 = OSSL_PARAM_set_octet_string(lVar3,param_1 + 0xd5);
        if (iVar2 != 0) goto LAB_00b676ac;
        ERR_new();
        uVar4 = 0xd8;
      }
      else {
        ERR_new();
        uVar4 = 0xca;
      }
    }
    else {
      ERR_new();
      uVar4 = 0x9c;
    }
  }
  else {
    ERR_new();
    uVar4 = 0x97;
  }
LAB_00b67578:
  ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",uVar4,
                "ossl_gcm_get_ctx_params");
  uVar4 = 0x68;
LAB_00b67584:
  ERR_set_error(0x39,uVar4,0);
  return 0;
}

