/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932850
 */

void FUN_00932850(long param_1)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong local_50;
  ulong local_48;
  char local_40;
  undefined7 uStack_3f;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if ((param_1 == 0) || (*(long *)(param_1 + 0x20) == 0)) {
    uVar4 = 2;
    goto LAB_00932950;
  }
  lVar1 = param_1 + 0x140;
  uVar3 = FUN_00924378(lVar1);
  if ((uVar3 & 1) == 0) {
    do {
      uVar3 = FUN_0092487c(lVar1,&local_40,&local_48);
      if ((uVar3 & 1) == 0) break;
      uVar3 = *(ulong *)(param_1 + 0x180);
      if (local_48 <= *(ulong *)(param_1 + 0x180)) {
        uVar3 = local_48;
      }
      uVar4 = FUN_00932c6c(param_1,CONCAT71(uStack_3f,local_40),local_48,uVar3,&local_50);
      if ((int)uVar4 != 0) goto LAB_00932950;
      FUN_009248fc(lVar1,local_50);
      if (uVar3 != 0) {
        if (local_50 <= uVar3) {
          uVar3 = local_50;
        }
        *(ulong *)(param_1 + 0x180) = *(long *)(param_1 + 0x180) - uVar3;
      }
    } while (local_48 <= local_50);
    uVar3 = FUN_00924378(lVar1);
    if ((uVar3 & 1) != 0) goto LAB_00932908;
LAB_0093298c:
    uVar4 = 0x51;
  }
  else {
LAB_00932908:
    uVar4 = 0;
    if ((*(uint *)(param_1 + 0x1b1) & 0xa0) != 0x20) goto LAB_00932950;
    uVar3 = FUN_00924378(lVar1);
    uVar4 = 0;
    if ((uVar3 & 1) == 0) goto LAB_00932950;
    if ((*(byte *)(param_1 + 0x1b3) >> 2 & 1) != 0) {
      uVar4 = FUN_009435fc(param_1,&local_40);
      if ((int)uVar4 != 0) goto LAB_00932950;
      if (local_40 == '\0') goto LAB_0093298c;
    }
    uVar4 = FUN_00932ef0(param_1);
  }
LAB_00932950:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

