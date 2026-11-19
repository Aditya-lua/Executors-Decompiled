/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3dc70
 */

undefined8 * ossl_ecx_key_dup(undefined8 *param_1,uint param_2)

{
  undefined8 *ptr;
  long lVar1;
  char *pcVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x70,"crypto/ec/ecx_backend.c",0x6f);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_backend.c",0x72,"ossl_ecx_key_dup");
    ERR_set_error(0x10,0xc0100,0);
    return (undefined8 *)0x0;
  }
  lVar1 = CRYPTO_THREAD_lock_new();
  ptr[0xd] = lVar1;
  if (lVar1 == 0) {
    CRYPTO_free(ptr);
    return (undefined8 *)0x0;
  }
  *ptr = *param_1;
  *(byte *)(ptr + 2) = *(byte *)(ptr + 2) & 0xfe;
  ptr[0xb] = param_1[0xb];
  *(undefined4 *)(ptr + 0xc) = *(undefined4 *)(param_1 + 0xc);
  *(undefined4 *)((long)ptr + 100) = 1;
  if ((char *)param_1[1] != (char *)0x0) {
    pcVar2 = CRYPTO_strdup((char *)param_1[1],"crypto/ec/ecx_backend.c",0x83);
    ptr[1] = pcVar2;
    if (pcVar2 == (char *)0x0) goto LAB_00a3ddac;
  }
  if (((param_2 >> 1 & 1) != 0) && ((*(byte *)(param_1 + 2) & 1) != 0)) {
    uVar3 = *(undefined8 *)((long)param_1 + 0x3a);
    *(undefined8 *)((long)ptr + 0x42) = *(undefined8 *)((long)param_1 + 0x42);
    *(undefined8 *)((long)ptr + 0x3a) = uVar3;
    uVar3 = *(undefined8 *)((long)param_1 + 0x31);
    *(undefined8 *)((long)ptr + 0x39) = *(undefined8 *)((long)param_1 + 0x39);
    *(undefined8 *)((long)ptr + 0x31) = uVar3;
    uVar3 = *(undefined8 *)((long)param_1 + 0x21);
    *(undefined8 *)((long)ptr + 0x29) = *(undefined8 *)((long)param_1 + 0x29);
    *(undefined8 *)((long)ptr + 0x21) = uVar3;
    uVar4 = *(undefined8 *)((long)param_1 + 0x19);
    uVar3 = *(undefined8 *)((long)param_1 + 0x11);
    *(byte *)(ptr + 2) = *(byte *)(ptr + 2) | 1;
    *(undefined8 *)((long)ptr + 0x19) = uVar4;
    *(undefined8 *)((long)ptr + 0x11) = uVar3;
  }
  if ((param_2 & 1) == 0) {
    return ptr;
  }
  if (param_1[10] == 0) {
    return ptr;
  }
  lVar1 = ossl_ecx_key_allocate_privkey(ptr);
  if (lVar1 != 0) {
    memcpy((void *)ptr[10],(void *)param_1[10],ptr[0xb]);
    return ptr;
  }
LAB_00a3ddac:
  ossl_ecx_key_free(ptr);
  ERR_new();
  ERR_set_debug("crypto/ec/ecx_backend.c",0x99,"ossl_ecx_key_dup");
  ERR_set_error(0x10,0xc0100,0);
  return (undefined8 *)0x0;
}

