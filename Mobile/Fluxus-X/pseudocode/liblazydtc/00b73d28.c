/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73d28
 */

int FUN_00b73d28(long param_1,void *param_2,ulong param_3,ulong param_4)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined1 auStack_1d8 [384];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar4 = *(ulong *)(param_1 + 0x18);
  if (0x180 < uVar4) {
    iVar2 = -0x38;
    goto LAB_00b73e40;
  }
  iVar2 = -0x38;
  if ((0x180 - uVar4 < param_4) || ((0x180 - uVar4) - param_4 < param_3)) goto LAB_00b73e40;
  memset(auStack_1d8,0,0x180);
  iVar2 = (**(code **)(param_1 + 0x148))(*(undefined8 *)(param_1 + 0x150),auStack_1d8,uVar4);
  if (iVar2 == 0) {
    lVar3 = *(long *)(param_1 + 0x18);
    if (param_4 != 0) {
      iVar2 = (**(code **)(param_1 + 0x148))
                        (*(undefined8 *)(param_1 + 0x150),auStack_1d8 + lVar3,param_4);
      if (iVar2 != 0) goto LAB_00b73db4;
      lVar3 = lVar3 + param_4;
    }
    if ((param_2 != (void *)0x0) && (param_3 != 0)) {
      memcpy(auStack_1d8 + lVar3,param_2,param_3);
      lVar3 = lVar3 + param_3;
    }
    iVar2 = FUN_00b7389c(auStack_1d8,auStack_1d8,lVar3);
    if (iVar2 == 0) {
      iVar2 = FUN_00b73b88(param_1,auStack_1d8);
      if (iVar2 == 0) {
        *(undefined4 *)(param_1 + 0x10) = 1;
      }
    }
    mbedtls_platform_zeroize(auStack_1d8,0x180);
  }
  else {
LAB_00b73db4:
    iVar2 = -0x34;
  }
LAB_00b73e40:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

