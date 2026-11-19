/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a21c
 */

undefined8 mbedtls_md5_finish(uint *param_1,uint *param_2)

{
  void *__s;
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  
  puVar2 = param_1 + 6;
  uVar3 = *param_1;
  uVar1 = uVar3 & 0x3f;
  __s = (void *)((long)puVar2 + (ulong)(uVar1 + 1));
  *(undefined1 *)((long)puVar2 + (ulong)uVar1) = 0x80;
  if (uVar1 + 1 < 0x39) {
    memset(__s,0,(ulong)(0x37 - uVar1));
  }
  else {
    memset(__s,0,(ulong)(uVar1 ^ 0x3f));
    mbedtls_internal_md5_process(param_1,puVar2);
    param_1[0x10] = 0;
    param_1[0x11] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    param_1[0xc] = 0;
    param_1[0xd] = 0;
    param_1[0xe] = 0;
    param_1[0xf] = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    puVar2[0] = 0;
    puVar2[1] = 0;
    uVar3 = *param_1;
  }
  param_1[0x14] = uVar3 << 3;
  param_1[0x15] = (uint)(CONCAT44(param_1[1],uVar3) >> 0x1d);
  mbedtls_internal_md5_process(param_1,puVar2);
  *param_2 = param_1[2];
  param_2[1] = param_1[3];
  param_2[2] = param_1[4];
  param_2[3] = param_1[5];
  mbedtls_platform_zeroize(param_1,0x58);
  return 0;
}

