/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009103b0
 */

void FUN_009103b0(long param_1,long param_2,long param_3,ulong param_4)

{
  int iVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (param_1 == 0) {
    param_1 = *(long *)(param_3 + 0x80);
    FUN_0092bb60(param_1,param_2);
    lVar3 = *(long *)(param_3 + 0x88);
joined_r0x00910444:
    if ((lVar3 != 0) && (*(long *)(lVar3 + 0x80) != 0)) {
      uStack_50 = 0;
      local_58 = 0;
      uStack_60 = 0;
      local_68 = 0;
      FUN_0092dfc0(lVar3,param_1,&local_68,param_2 + 0x280);
      iVar1 = *(int *)(param_2 + 0x3a0);
      goto joined_r0x0091044c;
    }
  }
  else {
    FUN_0092bb60(param_1,param_2);
    if (param_3 != 0) {
      lVar3 = *(long *)(param_3 + 0x88);
      goto joined_r0x00910444;
    }
  }
  iVar1 = *(int *)(param_2 + 0x3a0);
joined_r0x0091044c:
  if (-1 < iVar1) {
    if (*(long *)(param_2 + 0x30) != 0) {
      FUN_00917b54(param_1);
      *(undefined8 *)(param_2 + 0x30) = 0;
    }
    FUN_00924ee4(param_2);
    if ((*(long *)(param_2 + 0x3a8) != 0) &&
       (pcVar4 = *(code **)(*(long *)(param_2 + 0x3a8) + 0x60), pcVar4 != (code *)0x0)) {
      (*pcVar4)(param_1,param_2,*(ulong *)(param_2 + 0x3a0) >> 0x1e & 1);
    }
    FUN_0090ea54(param_1);
    *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) | 0x80000000;
  }
  if ((param_4 & 1) != 0) {
    FUN_009111d8(param_1,param_2,&local_68);
  }
  FUN_00906fc0(param_1,1);
  FUN_00906fc0(param_1,0);
  FUN_0092bab8(param_1);
  FUN_00946b9c(param_1,param_2);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

