/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5532c
 */

undefined8 FUN_00b5532c(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  void *__src;
  ulong __n;
  ulong uVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong local_28;
  
  if (param_2 == 0) {
LAB_00b55430:
    uVar2 = 1;
  }
  else {
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002dbfe7);
    if ((lVar1 != 0) && (uVar2 = OSSL_PARAM_get_int(lVar1,param_1 + 0x40), (int)uVar2 == 0)) {
      return uVar2;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002d7e7d);
    if (lVar1 == 0) {
LAB_00b553c4:
      lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
      if ((lVar1 != 0) &&
         (uVar2 = FUN_00b555e8(param_1,*(undefined8 *)(lVar1 + 0x10),*(undefined8 *)(lVar1 + 0x18)),
         (int)uVar2 == 0)) {
        return uVar2;
      }
      lVar1 = OSSL_PARAM_locate_const(param_2,"custom");
      if (lVar1 == 0) goto LAB_00b55430;
      __n = *(ulong *)(lVar1 + 0x18);
      if (__n < 0x201) {
        __src = *(void **)(lVar1 + 0x10);
        if (__src == (void *)0x0) {
          *(undefined8 *)(param_1 + 0x38) = 0;
          return 1;
        }
        uVar3 = __n << 3;
        if (uVar3 == 0) {
          uVar4 = 1;
        }
        else {
          uVar4 = 0;
          uVar6 = uVar3;
          do {
            uVar6 = uVar6 >> 8;
            uVar4 = uVar4 + 1;
            if (uVar6 == 0) break;
          } while (uVar4 < 8);
        }
        uVar5 = (ulong)uVar4;
        uVar6 = __n + uVar5 + 1;
        if (uVar6 < 0x205) {
          *(undefined1 *)(param_1 + 0x2e4) = (char)uVar4;
          uVar7 = uVar5;
          do {
            lVar1 = param_1 + uVar7;
            uVar7 = uVar7 - 1;
            *(char *)(lVar1 + 0x2e4) = (char)uVar3;
            uVar3 = uVar3 >> 8;
          } while (uVar7 != 0);
          memcpy((undefined1 *)(param_1 + 0x2e4) + uVar5 + 1,__src,__n);
          *(ulong *)(param_1 + 0x38) = uVar6;
          return 1;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x201,"encode_string");
        uVar2 = 0xca;
      }
      else {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x1b3,"kmac_set_ctx_params");
        uVar2 = 0x6f;
      }
    }
    else {
      local_28 = 0;
      uVar2 = OSSL_PARAM_get_size_t(lVar1,&local_28);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if (local_28 < 0x200000) {
        *(ulong *)(param_1 + 0x28) = local_28;
        goto LAB_00b553c4;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x1a8,"kmac_set_ctx_params");
      uVar2 = 0xd9;
    }
    ERR_set_error(0x39,uVar2,0);
    uVar2 = 0;
  }
  return uVar2;
}

