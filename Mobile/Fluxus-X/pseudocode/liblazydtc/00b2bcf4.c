/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2bcf4
 */

ulong FUN_00b2bcf4(long param_1,undefined8 *param_2,long param_3,ulong param_4)

{
  byte *pbVar1;
  byte *pbVar2;
  ulong uVar3;
  size_t __n;
  long lVar4;
  int iVar5;
  size_t sVar6;
  byte local_90 [16];
  undefined8 local_80;
  undefined8 uStack_78;
  byte local_70 [16];
  undefined8 local_60;
  undefined8 uStack_58;
  
  if (param_4 < 0x10) {
    return 0;
  }
  if (param_4 - 0x10 == 0) {
    iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_3,param_2,0x10);
    uVar3 = 0;
    if (iVar5 != 0) {
      uVar3 = 0x10;
    }
    return uVar3;
  }
  __n = 0x10;
  if ((param_4 & 0xf) != 0) {
    __n = param_4 & 0xf;
  }
  lVar4 = (param_4 - 0x10) - __n;
  if (lVar4 != 0) {
    iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_3,param_2,lVar4);
    if (iVar5 == 0) {
      return 0;
    }
    param_2 = (undefined8 *)((long)param_2 + lVar4);
    param_3 = param_3 + lVar4;
  }
  uStack_58 = *(undefined8 *)(param_1 + 0x28);
  local_60 = *(undefined8 *)(param_1 + 0x20);
  uStack_78 = param_2[1];
  local_80 = *param_2;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,local_90,param_2,0x10);
  if (iVar5 != 0) {
    memcpy(local_70,param_2 + 2,__n);
    if ((param_4 & 0xf) != 0) {
      memcpy(local_70 + __n,local_90 + __n,0x10 - __n);
    }
    sVar6 = 0;
    do {
      pbVar1 = local_70 + sVar6;
      pbVar2 = local_90 + sVar6;
      lVar4 = param_3 + sVar6;
      sVar6 = sVar6 + 1;
      *(byte *)(lVar4 + 0x10) = *pbVar2 ^ *pbVar1;
    } while (__n != sVar6);
    *(undefined8 *)(param_1 + 0x28) = uStack_58;
    *(undefined8 *)(param_1 + 0x20) = local_60;
    iVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_3,local_70,0x10);
    if (iVar5 != 0) {
      *(undefined8 *)(param_1 + 0x28) = uStack_78;
      *(undefined8 *)(param_1 + 0x20) = local_80;
      return param_4;
    }
  }
  return 0;
}

