/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61244
 */

undefined8 FUN_00b61244(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  void *local_30;
  long local_28;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == 0) {
LAB_00b61348:
    uVar3 = 1;
  }
  else {
    lVar2 = OSSL_PARAM_locate_const(param_2,"distid");
    if (lVar2 == 0) {
LAB_00b612c4:
      lVar2 = OSSL_PARAM_locate_const(param_2,"digest-size");
      if (lVar2 != 0) {
        uVar3 = OSSL_PARAM_get_size_t(lVar2,&local_28);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        if (local_28 != *(long *)(param_1 + 0x170)) {
          return 0;
        }
      }
      lVar2 = OSSL_PARAM_locate_const(param_2,"digest");
      if (lVar2 == 0) goto LAB_00b61348;
      local_30 = (void *)0x0;
      iVar1 = OSSL_PARAM_get_utf8_string(lVar2,&local_30,0);
      if (iVar1 != 0) {
        iVar1 = FUN_00b613bc(param_1,local_30);
        if (iVar1 != 0) {
          CRYPTO_free(local_30);
          goto LAB_00b61348;
        }
        CRYPTO_free(local_30);
      }
    }
    else {
      local_30 = (void *)0x0;
      local_28 = 0;
      if (((*(byte *)(param_1 + 0x18) & 1) != 0) &&
         ((*(long *)(lVar2 + 0x18) == 0 ||
          (iVar1 = OSSL_PARAM_get_octet_string(lVar2,&local_28,0,&local_30), iVar1 != 0)))) {
        CRYPTO_free(*(void **)(param_1 + 0x178));
        *(long *)(param_1 + 0x178) = local_28;
        *(void **)(param_1 + 0x180) = local_30;
        goto LAB_00b612c4;
      }
    }
    uVar3 = 0;
  }
  return uVar3;
}

