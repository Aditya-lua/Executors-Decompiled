/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bad444
 */

undefined8 mbedtls_sha256_update(long param_1,void *param_2,ulong param_3)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  ulong uVar4;
  void *pvVar5;
  ulong uVar6;
  
  if (param_3 == 0) {
LAB_00bad51c:
    uVar3 = 0;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0x40);
    uVar1 = uVar2 & 0x3f;
    uVar6 = (ulong)uVar1;
    *(uint *)(param_1 + 0x40) = uVar2 + (uint)param_3;
    if (CARRY4(uVar2,(uint)param_3)) {
      *(int *)(param_1 + 0x44) = *(int *)(param_1 + 0x44) + 1;
    }
    if ((uVar1 != 0) && (uVar4 = (ulong)(0x40 - uVar1), uVar4 <= param_3)) {
      memcpy((void *)(param_1 + uVar6),param_2,uVar4);
      mbedtls_internal_sha256_process(param_1,param_1);
      uVar6 = 0;
      param_2 = (void *)((long)param_2 + uVar4);
      param_3 = param_3 - uVar4;
    }
    do {
      if (param_3 < 0x40) {
        if (param_3 != 0) {
          memcpy((void *)(param_1 + uVar6),param_2,param_3);
        }
        goto LAB_00bad51c;
      }
      pvVar5 = param_2;
      uVar4 = param_3;
      do {
        mbedtls_internal_sha256_process(param_1,pvVar5);
        uVar4 = uVar4 - 0x40;
        pvVar5 = (void *)((long)pvVar5 + 0x40);
      } while (0x3f < uVar4);
      uVar4 = param_3 & 0xffffffffffffffc0;
      param_2 = (void *)((long)param_2 + uVar4);
      param_3 = param_3 - uVar4;
    } while (uVar4 != 0);
    uVar3 = 0xffffffff;
  }
  return uVar3;
}

