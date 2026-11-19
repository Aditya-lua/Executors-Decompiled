/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2b91c
 */

undefined8
ossl_cipher_cbc_cts_block_update
          (long param_1,void *param_2,ulong *param_3,ulong param_4,undefined8 *param_5,ulong param_6
          )

{
  ulong uVar1;
  undefined8 *puVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  size_t __n;
  code *pcVar6;
  void *__dest;
  long lVar7;
  ulong uVar8;
  byte local_a0 [16];
  undefined8 local_90;
  undefined8 uStack_88;
  byte local_80 [16];
  undefined8 local_70;
  undefined8 uStack_68;
  
  if (param_6 < 0x10) {
    return 0;
  }
  if (param_4 < param_6) {
    return 0;
  }
  if (param_2 == (void *)0x0) goto LAB_00b2bcb0;
  if ((*(byte *)(param_1 + 0x6c) >> 4 & 1) != 0) {
    return 0;
  }
  iVar3 = *(int *)(param_1 + 0x68);
  if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
    if (iVar3 == 0) {
      uVar4 = param_6 & 0xf;
      if (uVar4 == 0) {
        pcVar6 = *(code **)(*(long *)(param_1 + 0xa8) + 8);
        uVar4 = param_6;
        goto LAB_00b2bc94;
      }
      lVar7 = param_6 - (uVar4 | 0x10);
      if (lVar7 != 0) {
        iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,lVar7);
        if (iVar3 == 0) {
          return 0;
        }
        param_5 = (undefined8 *)((long)param_5 + lVar7);
        param_2 = (void *)((long)param_2 + lVar7);
      }
      uStack_68 = *(undefined8 *)(param_1 + 0x28);
      local_70 = *(undefined8 *)(param_1 + 0x20);
      puVar2 = (undefined8 *)((long)param_5 + uVar4);
      uStack_88 = puVar2[1];
      local_90 = *puVar2;
      *(undefined8 *)(param_1 + 0x20) = 0;
      *(undefined8 *)(param_1 + 0x28) = 0;
      iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,local_a0,puVar2,0x10);
      if (iVar3 == 0) {
        return 0;
      }
      memcpy(local_80,param_5,uVar4);
      memcpy(local_80 + uVar4,local_a0 + uVar4,0x10 - uVar4);
      uVar8 = 0;
      do {
        uVar1 = uVar8 + 1;
        *(byte *)((long)param_2 + uVar8 + 0x10) = local_a0[uVar8] ^ local_80[uVar8];
        uVar8 = uVar1;
      } while (uVar4 != uVar1);
      *(undefined8 *)(param_1 + 0x28) = uStack_68;
      *(undefined8 *)(param_1 + 0x20) = local_70;
      iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,local_80,0x10);
      if (iVar3 == 0) {
        return 0;
      }
      *(undefined8 *)(param_1 + 0x28) = uStack_88;
      *(undefined8 *)(param_1 + 0x20) = local_90;
      uVar4 = param_6;
    }
    else {
      if (iVar3 != 2) {
        if (iVar3 != 1) {
          return 0;
        }
        if ((param_6 & 0xf) == 0) goto LAB_00b2bbbc;
      }
      uVar4 = FUN_00b2bcf4(param_1,param_5,param_2,param_6);
    }
joined_r0x00b2bcec:
    param_6 = uVar4;
    if (param_6 == 0) {
      return 0;
    }
  }
  else {
    if (iVar3 == 0) {
      uVar8 = param_6 & 0xf;
      uVar4 = param_6 - uVar8;
      iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,uVar4);
      if (iVar3 == 0) {
        return 0;
      }
      if (uVar8 == 0) goto joined_r0x00b2bcec;
      memset(local_80 + uVar8 + 0x10,0,0x10 - uVar8);
      memcpy(&local_70,(void *)((long)param_5 + uVar4),uVar8);
      param_2 = (void *)((long)param_2 + uVar8 + uVar4 + -0x10);
      param_5 = &local_70;
      pcVar6 = *(code **)(*(long *)(param_1 + 0xa8) + 8);
      uVar4 = 0x10;
LAB_00b2bc94:
      iVar3 = (*pcVar6)(param_1,param_2,param_5,uVar4);
      uVar4 = 0;
      if (iVar3 != 0) {
        uVar4 = param_6;
      }
      goto joined_r0x00b2bcec;
    }
    if (iVar3 == 2) {
      if (param_6 != 0x10) {
        uVar8 = param_6 & 0xf;
        uVar4 = 0x10;
        if ((param_6 & 0xf) != 0) {
          uVar4 = uVar8;
        }
        lVar7 = param_6 - uVar4;
        iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,lVar7);
        if (iVar3 == 0) {
          return 0;
        }
        __n = 0;
        if (uVar8 != 0) {
          __n = 0x10 - uVar8;
        }
LAB_00b2bc4c:
        __dest = (void *)((long)param_2 + lVar7);
        memset(local_80 + uVar4 + 0x10,0,__n);
        memcpy(&local_70,(void *)((long)param_5 + lVar7),uVar4);
        param_2 = (void *)((long)__dest + -0x10);
        memcpy(__dest,param_2,uVar4);
        param_5 = &local_70;
        uVar4 = 0x10;
        pcVar6 = *(code **)(*(long *)(param_1 + 0xa8) + 8);
        goto LAB_00b2bc94;
      }
LAB_00b2bba0:
      uVar4 = 0x10;
      pcVar6 = *(code **)(*(long *)(param_1 + 0xa8) + 8);
      goto LAB_00b2bc94;
    }
    if (iVar3 != 1) {
      return 0;
    }
    uVar4 = param_6 & 0xf;
    if (uVar4 != 0) {
      if (param_6 != 0x10) {
        lVar7 = param_6 - uVar4;
        iVar3 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,lVar7);
        if (iVar3 == 0) {
          return 0;
        }
        __n = 0x10 - uVar4;
        goto LAB_00b2bc4c;
      }
      goto LAB_00b2bba0;
    }
LAB_00b2bbbc:
    uVar5 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,param_6);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
  }
  *(byte *)(param_1 + 0x6c) = *(byte *)(param_1 + 0x6c) | 0x10;
LAB_00b2bcb0:
  *param_3 = param_6;
  return 1;
}

