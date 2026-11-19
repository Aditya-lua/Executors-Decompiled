/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bac4a4
 */

undefined8 mbedtls_sha1_finish(uint *param_1,uint *param_2)

{
  void *__s;
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  
  puVar2 = param_1 + 7;
  uVar3 = *param_1;
  uVar1 = uVar3 & 0x3f;
  __s = (void *)((long)puVar2 + (ulong)(uVar1 + 1));
  *(undefined1 *)((long)puVar2 + (ulong)uVar1) = 0x80;
  if (uVar1 + 1 < 0x39) {
    memset(__s,0,(ulong)(0x37 - uVar1));
  }
  else {
    memset(__s,0,(ulong)(uVar1 ^ 0x3f));
    mbedtls_internal_sha1_process(param_1,puVar2);
    param_1[0x11] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    param_1[0x14] = 0;
    param_1[0xd] = 0;
    param_1[0xe] = 0;
    param_1[0xf] = 0;
    param_1[0x10] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[0xc] = 0;
    puVar2[0] = 0;
    puVar2[1] = 0;
    uVar3 = *param_1;
  }
  uVar1 = (uVar3 << 3 & 0xff00ff00) >> 8 | (uVar3 << 3 & 0xff00ff) << 8;
  uVar3 = (uint)(CONCAT44(param_1[1],uVar3) >> 0x1d);
  uVar3 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
  param_1[0x15] = uVar3 >> 0x10 | uVar3 << 0x10;
  param_1[0x16] = uVar1 >> 0x10 | uVar1 << 0x10;
  mbedtls_internal_sha1_process(param_1,puVar2);
  uVar1 = (param_1[2] & 0xff00ff00) >> 8 | (param_1[2] & 0xff00ff) << 8;
  *param_2 = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (param_1[3] & 0xff00ff00) >> 8 | (param_1[3] & 0xff00ff) << 8;
  param_2[1] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (param_1[4] & 0xff00ff00) >> 8 | (param_1[4] & 0xff00ff) << 8;
  param_2[2] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (param_1[5] & 0xff00ff00) >> 8 | (param_1[5] & 0xff00ff) << 8;
  param_2[3] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (param_1[6] & 0xff00ff00) >> 8 | (param_1[6] & 0xff00ff) << 8;
  param_2[4] = uVar1 >> 0x10 | uVar1 << 0x10;
  mbedtls_platform_zeroize(param_1,0x5c);
  return 0;
}

