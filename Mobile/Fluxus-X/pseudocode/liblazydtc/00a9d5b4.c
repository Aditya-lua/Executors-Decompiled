/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d5b4
 */

undefined8 *
FUN_00a9d5b4(long param_1,undefined8 param_2,int param_3,undefined8 param_4,undefined4 param_5,
            int param_6)

{
  long lVar1;
  int iVar2;
  undefined8 *ptr;
  long lVar3;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x38,"crypto/param_build.c",0x37);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/param_build.c",0x3a,"param_push");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    *ptr = param_2;
    *(undefined4 *)(ptr + 1) = param_5;
    ptr[2] = (long)param_3;
    lVar3 = ossl_param_bytes_to_blocks(param_4);
    ptr[3] = lVar3;
    *(int *)((long)ptr + 0xc) = param_6;
    lVar1 = 0;
    if (param_6 != 0) {
      lVar1 = 8;
    }
    *(long *)(param_1 + lVar1) = *(long *)(param_1 + lVar1) + lVar3;
    iVar2 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0x10),ptr);
    if (iVar2 < 1) {
      CRYPTO_free(ptr);
      ptr = (undefined8 *)0x0;
    }
  }
  return ptr;
}

