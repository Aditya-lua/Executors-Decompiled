/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00860d94
 */

void FUN_00860d94(undefined8 *param_1,long param_2,byte param_3)

{
  undefined4 uVar1;
  char cVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_2 + 0x90) == 0x119) {
    uStack_78 = *(undefined8 *)(param_2 + 0x9c);
    local_80 = *(undefined8 *)(param_2 + 0x94);
    uVar5 = *(undefined8 *)(param_2 + 0xa8);
    FUN_00858f2c(param_2);
  }
  else {
    FUN_0086e040(param_2,"variable name");
    uStack_78 = *(undefined8 *)(param_2 + 0x9c);
    local_80 = *(undefined8 *)(param_2 + 0x94);
    uVar5 = *(undefined8 *)(param_2 + 0x138);
  }
  if (*(int *)(param_2 + 0x90) == 0x3a) {
    uVar6 = *(undefined8 *)(param_2 + 0x94);
    FUN_00858f2c(param_2);
    uStack_68 = *(undefined8 *)(param_2 + 0x9c);
    local_70 = *(undefined8 *)(param_2 + 0x94);
    uVar4 = 0;
    uVar1 = *(undefined4 *)(param_2 + 0x124);
    if ((*(int *)(param_2 + 0x90) != 0x26) && (*(int *)(param_2 + 0x90) != 0x7c)) {
      uVar4 = FUN_008695d4(param_2,0,0);
      *(undefined4 *)(param_2 + 0x124) = uVar1;
    }
    uVar4 = FUN_00867310(param_2,uVar4,&local_70);
    *(undefined4 *)(param_2 + 0x124) = uVar1;
  }
  else {
    uVar4 = 0;
    uVar6 = 0xffffffffffffffff;
  }
  cVar2 = *(char *)(param_2 + 0x68);
  *param_1 = uVar5;
  param_1[2] = uStack_78;
  param_1[1] = local_80;
  if (cVar2 == '\0') {
    uVar6 = 0xffffffffffffffff;
  }
  *(byte *)(param_1 + 5) = param_3 & 1;
  param_1[3] = uVar4;
  param_1[4] = uVar6;
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

