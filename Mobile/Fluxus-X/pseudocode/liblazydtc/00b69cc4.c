/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69cc4
 */

undefined8 mbedtls_cipher_set_iv(long *param_1,void *param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  ulong __n;
  
  if (*param_1 != 0) {
    if (0x10 < param_3) {
      return 0xffff9f80;
    }
    uVar3 = *(uint *)(*param_1 + 8);
    __n = param_3;
    if (((uVar3 >> 0x18 & 1) != 0) || (__n = (ulong)(uVar3 >> 3 & 0x1c), __n <= param_3)) {
      if ((uVar3 & 0xff0000) == 0x4c0000) {
        if (param_3 != 0xc) {
          return 0xffff9f00;
        }
        iVar1 = mbedtls_chacha20_starts(param_1[10],param_2,0);
        if (iVar1 != 0) {
          return 0xffff9f00;
        }
        uVar3 = *(uint *)(*param_1 + 8);
      }
      else if ((param_3 != 0xc) && ((uVar3 & 0xff0000) == 0x4d0000)) {
        return 0xffff9f00;
      }
      uVar3 = uVar3 >> 0xc & 0xf;
      if (uVar3 == 9) {
        uVar2 = mbedtls_ccm_set_lengths(param_1[10],0,0,0);
        if ((int)uVar2 != 0) {
          return uVar2;
        }
        if (*(int *)((long)param_1 + 0xc) == 0) {
          uVar2 = 2;
        }
        else {
          if (*(int *)((long)param_1 + 0xc) != 1) {
            return 0xffff9f00;
          }
          uVar2 = 3;
        }
        uVar2 = mbedtls_ccm_starts(param_1[10],uVar2,param_2,param_3);
        return uVar2;
      }
      if (uVar3 == 6) {
        uVar2 = mbedtls_gcm_starts(param_1[10],*(undefined4 *)((long)param_1 + 0xc),param_2,param_3)
        ;
        return uVar2;
      }
      if (__n == 0) {
        return 0;
      }
      memcpy(param_1 + 7,param_2,__n);
      param_1[9] = __n;
      return 0;
    }
  }
  return 0xffff9f00;
}

