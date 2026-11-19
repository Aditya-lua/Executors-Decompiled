/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ef94
 */

undefined4 psa_generate_random(void *param_1,ulong param_2)

{
  ulong uVar1;
  int iVar2;
  undefined4 uVar3;
  void *__src;
  size_t __n;
  void *pvVar4;
  
  if (param_2 == 0) {
    __n = 0;
    __src = (void *)0x0;
    param_1 = (void *)0x0;
  }
  else {
    __src = calloc(param_2,1);
    __n = param_2;
    if (__src == (void *)0x0) {
      return 0xffffff73;
    }
  }
  uVar3 = 0xffffff77;
  if (DAT_00d25b11 == '\x02' && DAT_00d25b10 == '\a') {
    uVar3 = 0;
  }
  if ((param_2 != 0) && (DAT_00d25b11 == '\x02' && DAT_00d25b10 == '\a')) {
    pvVar4 = __src;
    do {
      uVar1 = param_2;
      if (0x3ff < param_2) {
        uVar1 = 0x400;
      }
      iVar2 = mbedtls_ctr_drbg_random(&DAT_00d25e68,pvVar4,uVar1);
      if (iVar2 != 0) {
        uVar3 = mbedtls_to_psa_error();
        if (__src == (void *)0x0) {
          return uVar3;
        }
        goto LAB_00b8f058;
      }
      param_2 = param_2 - uVar1;
      pvVar4 = (void *)((long)pvVar4 + uVar1);
    } while (param_2 != 0);
    uVar3 = 0;
  }
  if (__src != (void *)0x0) {
LAB_00b8f058:
    if (param_1 == (void *)0x0) {
      uVar3 = 0xffffff69;
    }
    else {
      if (__n != 0) {
        memcpy(param_1,__src,__n);
      }
      free(__src);
    }
  }
  return uVar3;
}

