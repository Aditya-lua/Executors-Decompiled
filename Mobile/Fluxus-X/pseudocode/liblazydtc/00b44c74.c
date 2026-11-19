/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b44c74
 */

undefined8 FUN_00b44c74(long param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  void *pvVar3;
  ulong local_28;
  
  if (param_2 != 0) {
    uVar1 = FUN_00b45464();
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_0029e225);
    if (lVar2 != 0) {
      local_28 = 0;
      uVar1 = FUN_00b45664(lVar2,0,&local_28);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      if (0x8000 < local_28) {
        return 0;
      }
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x78),*(undefined8 *)(param_1 + 0x80),
                        "providers/implementations/kdfs/hkdf.c",0x130);
      *(undefined8 *)(param_1 + 0x78) = 0;
      if (local_28 != 0) {
        pvVar3 = CRYPTO_malloc((int)local_28,"providers/implementations/kdfs/hkdf.c",0x135);
        *(void **)(param_1 + 0x78) = pvVar3;
        if (pvVar3 == (void *)0x0) {
          return 0;
        }
        *(ulong *)(param_1 + 0x80) = local_28;
        uVar1 = FUN_00b45664(lVar2,pvVar3,&local_28);
        if ((int)uVar1 == 0) {
          return uVar1;
        }
      }
    }
  }
  return 1;
}

