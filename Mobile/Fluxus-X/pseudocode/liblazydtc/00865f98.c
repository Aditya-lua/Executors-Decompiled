/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00865f98
 */

undefined8 FUN_00865f98(long param_1)

{
  undefined4 uVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 local_70;
  undefined8 uStack_68;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar5 = *(int *)(param_1 + 0x90);
  if (iVar5 == 0x119) {
    FUN_00853d20(&local_70,param_1 + 0x70);
    iVar5 = *(int *)(param_1 + 0x90);
    if ((int)local_70 == 0x106) {
      if (iVar5 == 0x119) {
        uVar7 = *(undefined8 *)(param_1 + 0xa8);
        uVar8 = *(undefined8 *)(param_1 + 0x94);
        FUN_00858f2c(param_1);
        uVar6 = *(undefined8 *)(param_1 + 0x94);
      }
      else {
        FUN_0086e040(param_1,"generic name");
        uVar6 = *(undefined8 *)(param_1 + 0x94);
        uVar7 = *(undefined8 *)(param_1 + 0x138);
        uVar8 = uVar6;
      }
      uVar9 = *(undefined8 *)(param_1 + 0x9c);
      if (*(int *)(param_1 + 0x90) == 0x106) {
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e3b4(param_1,0x106,"generic type pack annotation");
      }
      local_70 = uVar8;
      uStack_68 = uVar9;
      uVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
      FUN_0085135c(uVar8,&local_70,uVar7);
      if (*(char *)(param_1 + 0x68) == '\x01') {
        uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
        FUN_008521c8(uVar7,uVar6);
        local_70 = uVar8;
        puVar4 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_70);
        *puVar4 = uVar7;
      }
      goto LAB_00866070;
    }
  }
  uStack_68 = *(undefined8 *)(param_1 + 0x9c);
  local_70 = *(undefined8 *)(param_1 + 0x94);
  uVar1 = *(undefined4 *)(param_1 + 0x124);
  uVar8 = 0;
  if ((iVar5 != 0x26) && (iVar5 != 0x7c)) {
    uVar8 = FUN_008695d4(param_1,0,0);
    *(undefined4 *)(param_1 + 0x124) = uVar1;
  }
  lVar3 = FUN_00867310(param_1,uVar8,&local_70);
  *(undefined4 *)(param_1 + 0x124) = uVar1;
  uVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
  FUN_008512d4(uVar8,lVar3 + 0xc,lVar3);
LAB_00866070:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar8;
}

