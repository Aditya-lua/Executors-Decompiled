/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bad534
 */

undefined8 mbedtls_sha256_finish(undefined8 *param_1,uint *param_2)

{
  void *__s;
  uint uVar1;
  uint uVar2;
  
  uVar2 = (uint)((ulong)*(uint *)(param_1 + 8) & 0x3f);
  *(undefined1 *)((long)param_1 + ((ulong)*(uint *)(param_1 + 8) & 0x3f)) = 0x80;
  __s = (void *)((long)param_1 + (ulong)(uVar2 + 1));
  if (uVar2 + 1 < 0x39) {
    memset(__s,0,(ulong)(0x37 - uVar2));
  }
  else {
    memset(__s,0,(ulong)(uVar2 ^ 0x3f));
    mbedtls_internal_sha256_process(param_1,param_1);
    param_1[5] = 0;
    param_1[6] = 0;
    param_1[3] = 0;
    param_1[4] = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *param_1 = 0;
  }
  uVar1 = (uint)((ulong)param_1[8] >> 0x1d);
  uVar2 = (int)param_1[8] << 3;
  uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
  uVar2 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
  *(uint *)(param_1 + 7) = uVar1 >> 0x10 | uVar1 << 0x10;
  *(uint *)((long)param_1 + 0x3c) = uVar2 >> 0x10 | uVar2 << 0x10;
  mbedtls_internal_sha256_process(param_1,param_1);
  uVar2 = (*(uint *)(param_1 + 9) & 0xff00ff00) >> 8 | (*(uint *)(param_1 + 9) & 0xff00ff) << 8;
  *param_2 = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)((long)param_1 + 0x4c) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x4c) & 0xff00ff) << 8;
  param_2[1] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)(param_1 + 10) & 0xff00ff00) >> 8 | (*(uint *)(param_1 + 10) & 0xff00ff) << 8;
  param_2[2] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)((long)param_1 + 0x54) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x54) & 0xff00ff) << 8;
  param_2[3] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)(param_1 + 0xb) & 0xff00ff00) >> 8 | (*(uint *)(param_1 + 0xb) & 0xff00ff) << 8;
  param_2[4] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)((long)param_1 + 0x5c) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x5c) & 0xff00ff) << 8;
  param_2[5] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (*(uint *)(param_1 + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(param_1 + 0xc) & 0xff00ff) << 8;
  param_2[6] = uVar2 >> 0x10 | uVar2 << 0x10;
  if (*(int *)(param_1 + 0xd) == 0) {
    uVar2 = (*(uint *)((long)param_1 + 100) & 0xff00ff00) >> 8 |
            (*(uint *)((long)param_1 + 100) & 0xff00ff) << 8;
    param_2[7] = uVar2 >> 0x10 | uVar2 << 0x10;
  }
  mbedtls_platform_zeroize(param_1,0x6c);
  return 0;
}

