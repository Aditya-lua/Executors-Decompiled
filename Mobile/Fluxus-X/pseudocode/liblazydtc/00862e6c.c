/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00862e6c
 */

void FUN_00862e6c(long param_1,undefined8 *param_2)

{
  char cVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uStack_68 = *(undefined8 *)(param_1 + 0x9c);
  local_70 = *(undefined8 *)(param_1 + 0x94);
  uVar7 = *(undefined8 *)(param_1 + 0xa8);
  local_58 = 0;
  uStack_50 = 0;
  uVar3 = FUN_00861fcc(param_1,local_70,uStack_68,uVar7,param_2,&local_58);
  FUN_00858f2c(param_1);
  uVar6 = 4;
  if (uVar3 >> 0x20 != 0) {
    uVar6 = (undefined4)uVar3;
  }
  uVar4 = FUN_0084e938(4,*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_0084e9bc(uVar4,&local_70,uVar6,local_58,uStack_50,uVar7);
  local_78 = uVar4;
  FUN_00870bec(*param_2,&local_78);
  cVar1 = *(char *)(param_1 + 0x68);
  param_2[2] = param_2[2] + 1;
  if (cVar1 == '\x01') {
    uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    FUN_00851d70(uVar7,1);
    local_80 = local_78;
    puVar5 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_80);
    *puVar5 = uVar7;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

