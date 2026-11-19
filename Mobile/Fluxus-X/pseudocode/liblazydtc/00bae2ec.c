/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bae2ec
 */

undefined8 mbedtls_sha512_update(ulong *param_1,void *param_2,ulong param_3)

{
  uint uVar1;
  undefined8 uVar2;
  ulong uVar3;
  void *pvVar4;
  ulong uVar5;
  
  if (param_3 == 0) {
LAB_00bae3cc:
    uVar2 = 0;
  }
  else {
    uVar3 = *param_1;
    uVar1 = (uint)uVar3 & 0x7f;
    uVar5 = (ulong)uVar1;
    *param_1 = uVar3 + param_3;
    if (CARRY8(uVar3,param_3)) {
      param_1[1] = param_1[1] + 1;
    }
    if (((uVar3 & 0x7f) != 0) && (uVar3 = (ulong)(0x80 - uVar1), uVar3 <= param_3)) {
      memcpy((void *)((long)(param_1 + 10) + uVar5),param_2,uVar3);
      mbedtls_internal_sha512_process(param_1,param_1 + 10);
      uVar5 = 0;
      param_2 = (void *)((long)param_2 + uVar3);
      param_3 = param_3 - uVar3;
    }
    do {
      if (param_3 < 0x80) {
        if (param_3 != 0) {
          memcpy((void *)((long)param_1 + uVar5 + 0x50),param_2,param_3);
        }
        goto LAB_00bae3cc;
      }
      pvVar4 = param_2;
      uVar3 = param_3;
      do {
        mbedtls_internal_sha512_process(param_1,pvVar4);
        uVar3 = uVar3 - 0x80;
        pvVar4 = (void *)((long)pvVar4 + 0x80);
      } while (0x7f < uVar3);
      uVar3 = param_3 & 0xffffffffffffff80;
      param_2 = (void *)((long)param_2 + uVar3);
      param_3 = param_3 - uVar3;
    } while (uVar3 != 0);
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

