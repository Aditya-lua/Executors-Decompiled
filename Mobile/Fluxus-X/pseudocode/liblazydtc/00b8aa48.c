/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8aa48
 */

ulong psa_cipher_generate_iv(int *param_1,void *param_2,ulong param_3,ulong *param_4)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  void *__src;
  ulong __nmemb;
  ulong uVar5;
  void *pvVar6;
  ulong __n;
  
  if ((*param_1 == 0) || ((*(byte *)(param_1 + 1) & 3) != 1)) {
    __src = (void *)0x0;
    __nmemb = 0;
    param_2 = (void *)0x0;
    __n = 0;
    uVar5 = 0xffffff77;
  }
  else {
    bVar1 = *(byte *)((long)param_1 + 5);
    __nmemb = (ulong)bVar1;
    if (param_3 < __nmemb) {
      __src = (void *)0x0;
      param_2 = (void *)0x0;
      __n = 0;
      uVar5 = 0xffffff76;
    }
    else if (bVar1 < 0x11) {
      if (bVar1 == 0) {
        __n = 0;
        __src = (void *)0x0;
        param_2 = (void *)0x0;
      }
      else {
        __src = calloc(__nmemb,1);
        __n = __nmemb;
        if (__src == (void *)0x0) {
          param_2 = (void *)0x0;
          __n = 0;
          uVar5 = 0xffffff73;
          goto LAB_00b8aabc;
        }
      }
      uVar5 = 0xffffff77;
      if ((DAT_00d25b11 == '\x02') && (DAT_00d25b10 == '\a')) {
        if (bVar1 != 0) {
          uVar5 = __nmemb;
          pvVar6 = __src;
          do {
            uVar4 = uVar5;
            if (0x3ff < uVar5) {
              uVar4 = 0x400;
            }
            iVar2 = mbedtls_ctr_drbg_random(&DAT_00d25e68,pvVar6,uVar4);
            if (iVar2 != 0) {
              uVar3 = mbedtls_to_psa_error();
              uVar5 = (ulong)uVar3;
              if (uVar3 != 0) goto LAB_00b8aabc;
              break;
            }
            uVar5 = uVar5 - uVar4;
            pvVar6 = (void *)((long)pvVar6 + uVar4);
          } while (uVar5 != 0);
        }
        if (*param_1 == 1) {
          uVar4 = mbedtls_psa_cipher_set_iv(param_1 + 2,__src,__nmemb);
          uVar5 = uVar4 & 0xffffffff;
          if ((int)uVar4 == 0) {
            *param_4 = __nmemb;
            *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) | 2;
            if (__src == (void *)0x0) {
              return uVar4;
            }
            goto LAB_00b8aaf8;
          }
        }
        else {
          uVar5 = 0xffffff79;
        }
      }
    }
    else {
      __src = (void *)0x0;
      param_2 = (void *)0x0;
      __n = 0;
      uVar5 = 0xffffff7c;
    }
  }
LAB_00b8aabc:
  *param_4 = 0;
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
    *param_1 = 0;
    *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc;
  }
  if (__src == (void *)0x0) {
    return uVar5;
  }
  mbedtls_platform_zeroize(__src,__nmemb);
LAB_00b8aaf8:
  if (param_2 == (void *)0x0) {
    return 0xffffff69;
  }
  if (__n != 0) {
    memcpy(param_2,__src,__n);
  }
  free(__src);
  return uVar5;
}

