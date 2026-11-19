/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a120
 */

undefined8 mbedtls_md5_update(uint *param_1,void *param_2,size_t param_3)

{
  void *pvVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  if (param_3 != 0) {
    uVar3 = *param_1;
    uVar2 = uVar3 & 0x3f;
    uVar5 = (ulong)uVar2;
    *param_1 = uVar3 + (uint)param_3;
    if (CARRY4(uVar3,(uint)param_3)) {
      param_1[1] = param_1[1] + 1;
    }
    if ((uVar2 != 0) && (uVar4 = (ulong)(0x40 - uVar2), uVar4 <= param_3)) {
      memcpy((void *)((long)(param_1 + 6) + uVar5),param_2,uVar4);
      mbedtls_internal_md5_process(param_1,param_1 + 6);
      uVar5 = 0;
      param_2 = (void *)((long)param_2 + uVar4);
      param_3 = param_3 - uVar4;
    }
    uVar4 = param_3 - 0x40;
    if (0x3f < param_3) {
      uVar6 = uVar4 & 0xffffffffffffffc0;
      pvVar1 = (void *)((long)param_2 + uVar6 + 0x40);
      do {
        mbedtls_internal_md5_process(param_1,param_2);
        param_3 = param_3 - 0x40;
        param_2 = (void *)((long)param_2 + 0x40);
      } while (0x3f < param_3);
      param_3 = uVar4 - uVar6;
      param_2 = pvVar1;
    }
    if (param_3 != 0) {
      memcpy((void *)((long)param_1 + uVar5 + 0x18),param_2,param_3);
    }
  }
  return 0;
}

