/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3e1b8
 */

undefined8 * ossl_ecx_key_new(undefined8 param_1,uint param_2,byte param_3,char *param_4)

{
  undefined8 *ptr;
  char *pcVar1;
  long lVar2;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x70,"crypto/ec/ecx_key.c",0x11);
  if (ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  *ptr = param_1;
  *(byte *)(ptr + 2) = *(byte *)(ptr + 2) & 0xfe | param_3 & 1;
  if (param_2 < 4) {
    ptr[0xb] = *(undefined8 *)(&DAT_00364eb0 + (long)(int)param_2 * 8);
  }
  *(uint *)(ptr + 0xc) = param_2;
  *(undefined4 *)((long)ptr + 100) = 1;
  if (param_4 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(param_4,"crypto/ec/ecx_key.c",0x2a);
    ptr[1] = pcVar1;
    if (pcVar1 == (char *)0x0) goto LAB_00a3e25c;
  }
  lVar2 = CRYPTO_THREAD_lock_new();
  ptr[0xd] = lVar2;
  if (lVar2 != 0) {
    return ptr;
  }
LAB_00a3e25c:
  ERR_new();
  ERR_set_debug("crypto/ec/ecx_key.c",0x34,"ossl_ecx_key_new");
  ERR_set_error(0x10,0xc0100,0);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

