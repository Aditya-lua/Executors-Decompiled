/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac83c0
 */

long RAND_get0_private(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  
  lVar2 = ossl_lib_ctx_get_data(param_1,5,&DAT_00c7ca38);
  if (lVar2 != 0) {
    lVar3 = CRYPTO_THREAD_get_local(lVar2 + 0x1c);
    if (lVar3 != 0) {
      return lVar3;
    }
    lVar3 = RAND_get0_primary(param_1);
    if (lVar3 == 0) {
      return 0;
    }
    uVar4 = ossl_lib_ctx_get_concrete(param_1);
    lVar5 = CRYPTO_THREAD_get_local(lVar2 + 0x18);
    if ((lVar5 != 0) || (iVar1 = ossl_init_thread_start(0,uVar4,&LAB_00ac89c8), iVar1 != 0)) {
      lVar3 = FUN_00ac871c(uVar4,lVar3,0x10000,0x1a4);
      CRYPTO_THREAD_set_local(lVar2 + 0x1c,lVar3);
      return lVar3;
    }
  }
  return 0;
}

