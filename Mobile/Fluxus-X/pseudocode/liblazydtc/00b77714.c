/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77714
 */

void mbedtls_gcm_update(long param_1,ulong param_2,ulong param_3,ulong param_4,ulong param_5,
                       ulong *param_6)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_68 = 0;
  uStack_60 = 0;
  if (param_5 < param_3) {
    uVar4 = 0xffffffea;
    goto LAB_00b778f4;
  }
  *param_6 = param_3;
  if (param_3 != 0) {
    if ((param_2 < param_4) && (param_4 - param_2 < param_3)) {
      uVar4 = 0xffffffec;
      goto LAB_00b778f4;
    }
    uVar5 = *(ulong *)(param_1 + 0x160);
    uVar4 = 0xffffffec;
    if ((CARRY8(uVar5,param_3)) || (0xfffffffe0 < uVar5 + param_3)) goto LAB_00b778f4;
    if (uVar5 == 0) {
      if ((*(byte *)(param_1 + 0x168) & 0xf) != 0) {
        FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
        uVar5 = *(ulong *)(param_1 + 0x160);
        goto joined_r0x00b777d0;
      }
      uVar5 = 0;
    }
    else {
joined_r0x00b777d0:
      uVar3 = uVar5 & 0xf;
      if (uVar3 != 0) {
        uVar5 = param_3;
        if (0x10 - uVar3 <= param_3) {
          uVar5 = 0x10 - uVar3;
        }
        uVar4 = FUN_00b77924(param_1,&local_68,uVar3,uVar5,param_2,param_4);
        if ((int)uVar4 != 0) goto LAB_00b778f4;
        if (uVar5 + uVar3 == 0x10) {
          FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
        }
        param_3 = param_3 - uVar5;
        param_2 = param_2 + uVar5;
        param_4 = param_4 + uVar5;
        uVar5 = *(long *)(param_1 + 0x160) + uVar5;
        *(ulong *)(param_1 + 0x160) = uVar5;
      }
    }
    *(ulong *)(param_1 + 0x160) = uVar5 + param_3;
    if (0xf < param_3) {
      do {
        uVar1 = (*(uint *)(param_1 + 0x18c) & 0xff00ff00) >> 8 |
                (*(uint *)(param_1 + 0x18c) & 0xff00ff) << 8;
        uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
        uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
        *(uint *)(param_1 + 0x18c) = uVar1 >> 0x10 | uVar1 << 0x10;
        uVar4 = FUN_00b77924(param_1,&local_68,0,0x10,param_2,param_4);
        if ((int)uVar4 != 0) goto LAB_00b778f4;
        FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
        param_3 = param_3 - 0x10;
        param_2 = param_2 + 0x10;
        param_4 = param_4 + 0x10;
      } while (0xf < param_3);
    }
    if (param_3 != 0) {
      uVar1 = (*(uint *)(param_1 + 0x18c) & 0xff00ff00) >> 8 |
              (*(uint *)(param_1 + 0x18c) & 0xff00ff) << 8;
      uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
      uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      *(uint *)(param_1 + 0x18c) = uVar1 >> 0x10 | uVar1 << 0x10;
      uVar4 = FUN_00b77924(param_1,&local_68,0,param_3,param_2,param_4);
      if ((int)uVar4 != 0) goto LAB_00b778f4;
    }
    mbedtls_platform_zeroize(&local_68,0x10);
  }
  uVar4 = 0;
LAB_00b778f4:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

