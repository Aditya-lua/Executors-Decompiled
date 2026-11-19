/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bae3e4
 */

undefined8 mbedtls_sha512_finish(ulong *param_1,ulong *param_2)

{
  void *__s;
  uint uVar1;
  ulong uVar2;
  ulong *__s_00;
  ulong uVar3;
  
  __s_00 = param_1 + 10;
  uVar3 = *param_1;
  uVar1 = (uint)uVar3 & 0x7f;
  __s = (void *)((long)__s_00 + (ulong)(uVar1 + 1));
  *(undefined1 *)((long)__s_00 + (ulong)uVar1) = 0x80;
  if (uVar1 + 1 < 0x71) {
    memset(__s,0,(ulong)(0x6f - uVar1));
  }
  else {
    memset(__s,0,(ulong)(uVar1 ^ 0x7f));
    mbedtls_internal_sha512_process(param_1,__s_00);
    memset(__s_00,0,0x70);
    uVar3 = *param_1;
  }
  uVar2 = (uVar3 << 3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 << 3 & 0xff00ff00ff00ff) << 8;
  uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
  uVar3 = (param_1[1] << 3 & 0xff00ff00ff00ff00) >> 8 |
          (uVar3 >> 0x3d | param_1[1] << 3 & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_1[0x18] = uVar3 >> 0x20 | uVar3 << 0x20;
  param_1[0x19] = uVar2 >> 0x20 | uVar2 << 0x20;
  mbedtls_internal_sha512_process(param_1,__s_00);
  uVar3 = (param_1[2] & 0xff00ff00ff00ff00) >> 8 | (param_1[2] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  *param_2 = uVar3 >> 0x20 | uVar3 << 0x20;
  uVar3 = (param_1[3] & 0xff00ff00ff00ff00) >> 8 | (param_1[3] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_2[1] = uVar3 >> 0x20 | uVar3 << 0x20;
  uVar3 = (param_1[4] & 0xff00ff00ff00ff00) >> 8 | (param_1[4] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_2[2] = uVar3 >> 0x20 | uVar3 << 0x20;
  uVar3 = (param_1[5] & 0xff00ff00ff00ff00) >> 8 | (param_1[5] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_2[3] = uVar3 >> 0x20 | uVar3 << 0x20;
  uVar3 = (param_1[6] & 0xff00ff00ff00ff00) >> 8 | (param_1[6] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_2[4] = uVar3 >> 0x20 | uVar3 << 0x20;
  uVar3 = (param_1[7] & 0xff00ff00ff00ff00) >> 8 | (param_1[7] & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  param_2[5] = uVar3 >> 0x20 | uVar3 << 0x20;
  if ((int)param_1[0x1a] == 0) {
    uVar3 = (param_1[8] & 0xff00ff00ff00ff00) >> 8 | (param_1[8] & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    param_2[6] = uVar3 >> 0x20 | uVar3 << 0x20;
    uVar3 = (param_1[9] & 0xff00ff00ff00ff00) >> 8 | (param_1[9] & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    param_2[7] = uVar3 >> 0x20 | uVar3 << 0x20;
  }
  mbedtls_platform_zeroize(param_1,0xd8);
  return 0;
}

