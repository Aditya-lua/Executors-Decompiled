/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f024
 */

undefined8 mbedtls_cipher_cmac_reset(long *param_1)

{
  undefined8 uVar1;
  long lVar2;
  
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) || (lVar2 = param_1[0xb], lVar2 == 0)) {
    uVar1 = 0xffff9f00;
  }
  else {
    *(undefined8 *)(lVar2 + 0x20) = 0;
    mbedtls_platform_zeroize(lVar2 + 0x10,0x10);
    mbedtls_platform_zeroize(lVar2,0x10);
    uVar1 = 0;
  }
  return uVar1;
}

