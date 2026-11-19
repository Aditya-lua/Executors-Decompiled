/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e62c
 */

undefined8 mbedtls_cipher_cmac_starts(long *param_1,long param_2,undefined8 param_3)

{
  byte bVar1;
  undefined8 uVar2;
  void *pvVar3;
  
  if (param_1 != (long *)0x0) {
    if (param_2 == 0) {
      return 0xffff9f00;
    }
    if (*param_1 == 0) {
      return 0xffff9f00;
    }
    uVar2 = mbedtls_cipher_setkey(param_1,param_2,param_3,1);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    if (*param_1 != 0) {
      bVar1 = *(byte *)(*param_1 + 10);
      if (0x24 < bVar1) {
        return 0xffff9f00;
      }
      if ((1L << ((ulong)bVar1 & 0x3f) & 0x100000001cU) == 0) {
        return 0xffff9f00;
      }
      pvVar3 = calloc(1,0x28);
      if (pvVar3 == (void *)0x0) {
        return 0xffff9e80;
      }
      param_1[0xb] = (long)pvVar3;
      mbedtls_platform_zeroize(pvVar3,0x10);
      return 0;
    }
  }
  return 0xffff9f00;
}

