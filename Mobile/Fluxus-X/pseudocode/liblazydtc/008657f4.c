/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008657f4
 */

void FUN_008657f4(undefined8 *param_1,long param_2,undefined4 param_3,undefined8 *param_4,
                 undefined4 *param_5)

{
  undefined4 uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined4 local_80;
  undefined4 uStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined1 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar6 = 0;
  uVar1 = *(undefined4 *)(param_2 + 0x124);
  uStack_78 = (undefined4)*(undefined8 *)(param_2 + 0x9c);
  uStack_74 = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x9c) >> 0x20);
  local_80 = (undefined4)*(undefined8 *)(param_2 + 0x94);
  uStack_7c = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x94) >> 0x20);
  if ((*(int *)(param_2 + 0x90) != 0x26) && (*(int *)(param_2 + 0x90) != 0x7c)) {
    uVar6 = FUN_008695d4(param_2,0,0);
    *(undefined4 *)(param_2 + 0x124) = uVar1;
  }
  uVar6 = FUN_00867310(param_2,uVar6,&local_80);
  *(undefined4 *)(param_2 + 0x124) = uVar1;
  local_80 = *param_5;
  uStack_7c = (undefined4)*(undefined8 *)(param_5 + 1);
  uStack_78 = (undefined4)((ulong)*(undefined8 *)(param_5 + 1) >> 0x20);
  if (*(int *)(param_2 + 0x90) == 0x5d) {
    FUN_00858f2c(param_2);
  }
  else {
    FUN_0086b5f8(param_2,0x5d,&local_80,0);
    uVar3 = FUN_0086e434(param_2,0x5d);
    if ((uVar3 & 1) == 0) {
      uVar9 = 0xffffffffffffffff;
      goto LAB_008658e0;
    }
  }
  uVar9 = *(undefined8 *)(param_2 + 0xb0);
LAB_008658e0:
  if (*(int *)(param_2 + 0x90) == 0x3a) {
    FUN_00858f2c(param_2);
    uVar10 = *(undefined8 *)(param_2 + 0xb0);
  }
  else {
    FUN_0086e3b4(param_2,0x3a,"table field");
    uVar10 = 0xffffffffffffffff;
  }
  uVar7 = 0;
  uVar1 = *(undefined4 *)(param_2 + 0x124);
  uStack_78 = (undefined4)*(undefined8 *)(param_2 + 0x9c);
  uStack_74 = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x9c) >> 0x20);
  local_80 = (undefined4)*(undefined8 *)(param_2 + 0x94);
  uStack_7c = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x94) >> 0x20);
  if ((*(int *)(param_2 + 0x90) != 0x26) && (*(int *)(param_2 + 0x90) != 0x7c)) {
    uVar7 = FUN_008695d4(param_2,0,0);
    *(undefined4 *)(param_2 + 0x124) = uVar1;
  }
  lVar4 = FUN_00867310(param_2,uVar7,&local_80);
  *(undefined4 *)(param_2 + 0x124) = uVar1;
  local_70 = *(undefined1 *)(param_4 + 2);
  uVar7 = *(undefined8 *)(param_5 + 1);
  uVar8 = *(undefined8 *)(lVar4 + 0x14);
  uStack_78 = (undefined4)param_4[1];
  uStack_74 = (undefined4)((ulong)param_4[1] >> 0x20);
  local_80 = (undefined4)*param_4;
  uStack_7c = (undefined4)((ulong)*param_4 >> 0x20);
  puVar5 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x38);
  *puVar5 = uVar6;
  puVar5[1] = lVar4;
  puVar5[2] = uVar7;
  puVar5[3] = uVar8;
  *(undefined4 *)(puVar5 + 4) = param_3;
  *(ulong *)((long)puVar5 + 0x2c) = CONCAT44(uStack_74,uStack_78);
  *(ulong *)((long)puVar5 + 0x24) = CONCAT44(uStack_7c,local_80);
  *(undefined1 *)((long)puVar5 + 0x34) = local_70;
  uVar6 = *(undefined8 *)(param_5 + 1);
  param_1[2] = uVar9;
  param_1[3] = uVar10;
  *param_1 = puVar5;
  param_1[1] = uVar6;
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

