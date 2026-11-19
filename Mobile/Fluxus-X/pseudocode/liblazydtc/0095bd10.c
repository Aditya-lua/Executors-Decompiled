/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095bd10
 */

void FUN_0095bd10(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x20);
  if ((*(byte *)(lVar4 + 0x4f8) >> 4 & 1) != 0) {
    uVar2 = FUN_00945a8c(lVar4 + 0x4c8,param_1);
    if ((uVar2 & 1) != 0) {
      uVar3 = FUN_00945ab0(lVar4 + 0x4c8,param_1,0,&local_3c);
      if ((int)uVar3 == 0) {
        if (local_3c == 1) {
          uVar3 = 0;
          *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4e8) = 6;
        }
        else {
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            FUN_00904c98(param_1,"No known authentication mechanisms supported");
          }
          uVar3 = 0x43;
        }
      }
      goto LAB_0095bd98;
    }
    lVar4 = *(long *)(param_1 + 0x20);
  }
  uVar3 = 0;
  *(undefined4 *)(lVar4 + 0x4e8) = 0;
LAB_0095bd98:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

