/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4828c
 */

undefined8 FUN_00b4828c(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  char *pcVar3;
  ulong local_28;
  
  if (param_2 != 0) {
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002c3a6a);
    if ((lVar1 != 0) && (uVar2 = FUN_00b48874(param_1 + 0x10,param_1 + 0x18,lVar1), (int)uVar2 == 0)
       ) {
      return uVar2;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
    if ((lVar1 != 0) && (uVar2 = FUN_00b48874(param_1 + 0x20,param_1 + 0x28,lVar1), (int)uVar2 == 0)
       ) {
      return uVar2;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002a5623);
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_uint64(lVar1,&local_28);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if (local_28 < 2) {
        return 0;
      }
      if ((local_28 - 1 & local_28) != 0) {
        return 0;
      }
      *(ulong *)(param_1 + 0x30) = local_28;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002c8cc8);
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_uint64(lVar1,&local_28);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if (local_28 == 0) {
        return 0;
      }
      *(ulong *)(param_1 + 0x38) = local_28;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002a38e7);
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_uint64(lVar1,&local_28);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if (local_28 == 0) {
        return 0;
      }
      *(ulong *)(param_1 + 0x40) = local_28;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"maxmem_bytes");
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_uint64(lVar1,&local_28);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      if (local_28 == 0) {
        return 0;
      }
      *(ulong *)(param_1 + 0x48) = local_28;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"properties");
    if (lVar1 != 0) {
      if (*(int *)(lVar1 + 8) != 4) {
        return 0;
      }
      pcVar3 = *(char **)(lVar1 + 0x10);
      CRYPTO_free(*(void **)(param_1 + 8));
      *(undefined8 *)(param_1 + 8) = 0;
      if (pcVar3 != (char *)0x0) {
        pcVar3 = CRYPTO_strdup(pcVar3,"providers/implementations/kdfs/scrypt.c",0x8f);
        *(char **)(param_1 + 8) = pcVar3;
        if (pcVar3 == (char *)0x0) {
          ERR_new();
          ERR_set_debug("providers/implementations/kdfs/scrypt.c",0x91,"set_property_query");
          ERR_set_error(0x39,0xc0100,0);
          return 0;
        }
      }
      uVar2 = FUN_00b484c8(param_1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
  }
  return 1;
}

