/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b148
 */

void FUN_0086b148(long param_1,long param_2,uint param_3)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined8 local_78;
  undefined8 uStack_70;
  int local_68;
  int local_64;
  int local_60;
  undefined8 local_5c;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar1 = *(int *)(param_1 + 0x90);
  if (((iVar1 != 0x21) && (iVar1 != 0x7c)) && (iVar1 != 0x26)) {
    uVar3 = 0;
    goto LAB_0086b32c;
  }
  uVar5 = *(undefined8 *)(param_1 + 0x94);
  FUN_00853d20(&local_68,param_1 + 0x70);
  iVar1 = *(int *)(param_1 + 0x90);
  if ((iVar1 == 0x26) && (local_68 == 0x26)) {
    uVar4 = 0;
    if (*(int *)(param_1 + 0xa0) == local_60) {
      uVar3 = 0;
      if (*(int *)(param_1 + 0x9c) == local_64) {
        if (param_3 < *(byte *)(param_2 + 0x1c)) {
          FUN_00858f2c(param_1);
          uStack_70 = local_5c;
          local_78 = uVar5;
          FUN_00860ecc(param_1,&local_78,"Unexpected \'&&\'; did you mean \'and\'?");
          uVar4 = 0x100000000;
          uVar3 = 0xe;
        }
        else {
LAB_0086b320:
          uVar4 = 0;
          uVar3 = 0;
        }
      }
      goto LAB_0086b328;
    }
LAB_0086b318:
    uVar4 = 0;
    uVar3 = uVar4;
  }
  else {
    if ((iVar1 == 0x7c) && (local_68 == 0x7c)) {
      uVar4 = 0;
      if (*(int *)(param_1 + 0xa0) == local_60) {
        uVar3 = 0;
        if (*(int *)(param_1 + 0x9c) == local_64) {
          if (*(byte *)(param_2 + 0x1e) <= param_3) goto LAB_0086b320;
          FUN_00858f2c(param_1);
          uStack_70 = local_5c;
          local_78 = uVar5;
          FUN_00860ecc(param_1,&local_78,"Unexpected \'||\'; did you mean \'or\'?");
          uVar4 = 0x100000000;
          uVar3 = 0xf;
        }
        goto LAB_0086b328;
      }
      goto LAB_0086b318;
    }
    uVar4 = 0;
    if (iVar1 != 0x21) goto LAB_0086b318;
    uVar3 = 0;
    if (local_68 == 0x3d) {
      uVar4 = 0;
      if (*(int *)(param_1 + 0xa0) != local_60) goto LAB_0086b318;
      uVar3 = 0;
      if (*(int *)(param_1 + 0x9c) == local_64) {
        if (*(byte *)(param_2 + 0x10) <= param_3) goto LAB_0086b320;
        FUN_00858f2c(param_1);
        uStack_70 = local_5c;
        local_78 = uVar5;
        FUN_00860ecc(param_1,&local_78,"Unexpected \'!=\'; did you mean \'~=\'?");
        uVar4 = 0x100000000;
        uVar3 = 8;
      }
    }
  }
LAB_0086b328:
  uVar3 = uVar3 | uVar4;
LAB_0086b32c:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

