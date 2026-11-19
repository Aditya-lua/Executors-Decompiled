/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9974c
 */

undefined8 ossl_init_thread_start(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 *ptr;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  ptr = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00cc9130);
  if (ptr == (undefined8 *)0x0) {
    ptr = (undefined8 *)CRYPTO_zalloc(8,"crypto/initthread.c",100);
    if (ptr == (undefined8 *)0x0) {
      return 0;
    }
    iVar1 = CRYPTO_THREAD_set_local(&DAT_00cc9130,ptr);
    if (iVar1 != 0) {
      iVar1 = CRYPTO_THREAD_run_once(&DAT_00d220d8,&LAB_00a99894);
      puVar2 = DAT_00d220e0;
      if ((((DAT_00d220e0 != (undefined8 *)0x0) && (iVar1 != 0)) && (DAT_00d220dc != 0)) &&
         (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d220e0[1]), iVar1 != 0)) {
        iVar1 = OPENSSL_sk_push(*puVar2,ptr);
        CRYPTO_THREAD_unlock(puVar2[1]);
        if (iVar1 != 0) goto LAB_00a99780;
      }
      CRYPTO_THREAD_set_local(&DAT_00cc9130,0);
    }
    CRYPTO_free(ptr);
    uVar3 = 0;
  }
  else {
LAB_00a99780:
    puVar2 = CRYPTO_malloc(0x20,"crypto/initthread.c",0x18b);
    uVar3 = 0;
    if (puVar2 != (undefined8 *)0x0) {
      puVar2[1] = param_2;
      puVar2[2] = param_3;
      *puVar2 = param_1;
      puVar2[3] = *ptr;
      *ptr = puVar2;
      uVar3 = 1;
    }
  }
  return uVar3;
}

