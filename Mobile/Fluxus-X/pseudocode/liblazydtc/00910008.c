/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910008
 */

void FUN_00910008(long param_1,long param_2,undefined8 param_3,code *param_4)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined1 auStack_60 [24];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_2 != 0) {
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,5,2);
    }
    FUN_00916a74(param_2,auStack_60);
    lVar3 = FUN_00916a80(auStack_60);
    while (lVar3 != 0) {
      lVar5 = *(long *)(lVar3 + 0x18);
      lVar3 = FUN_00916a80(auStack_60);
      puVar6 = *(undefined8 **)(lVar5 + 0x10);
      while (puVar6 != (undefined8 *)0x0) {
        uVar4 = *puVar6;
        puVar6 = (undefined8 *)puVar6[2];
        iVar2 = (*param_4)(param_1,uVar4,param_3);
        if (iVar2 == 1) {
          if (*(long *)(param_1 + 0xd0) != 0) {
            FUN_0093f680(param_1,5);
          }
          uVar4 = 1;
          goto LAB_009100e4;
        }
      }
    }
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,5);
    }
  }
  uVar4 = 0;
LAB_009100e4:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

