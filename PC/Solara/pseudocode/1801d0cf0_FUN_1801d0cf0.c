/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1801d0cf0(undefined8 *param_1,longlong param_2,undefined4 param_3)

{
  longlong *plVar1;
  int *piVar2;
  longlong *plVar3;
  code *pcVar4;
  uint uVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  undefined1 *puVar12;
  ulonglong auStackX_8 [4];
  undefined4 uStack_13d8;
  uint auStack_13d4 [1248];
  undefined4 uStack_54;
  ulonglong uStack_48;
  undefined8 uStack_40;
  
  uStack_40 = 0x1801d0d0d;
  lVar6 = FUN_180e15b20();
  lVar6 = -lVar6;
  uStack_48 = _DAT_1810c1700 ^ (longlong)auStack_13d4 + lVar6 + 0x139c;
  *(undefined8 **)((longlong)auStack_13d4 + lVar6 + 0x13cc) = param_1;
  uVar8 = *param_1;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0d37;
  uVar7 = FUN_1801d5120(uVar8);
  uVar8 = *param_1;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0d42;
  FUN_1801d4460(uVar8);
  *(undefined4 *)((longlong)auStack_13d4 + lVar6 + 0x13bc) = 4;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0d61;
  uVar8 = VirtualAllocEx(uVar7,0,0x40,0x3000);
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0d6f;
  uVar9 = FUN_180af2be0(uVar7,param_2);
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0d77;
  uVar10 = FUN_180e13910();
  uStack_54 = 0xffffffff;
  auStack_13d4[0] = (uint)uVar10;
  uVar11 = 1;
  do {
    uVar5 = ((uint)(uVar10 >> 0x1e) & 3 ^ (uint)uVar10) * 0x6c078965 + (int)uVar11;
    uVar10 = (ulonglong)uVar5;
    auStack_13d4[uVar11] = uVar5;
    uVar11 = uVar11 + 1;
  } while (uVar11 < 0x270);
  uStack_13d8 = 0x270;
  *(undefined4 **)((longlong)auStack_13d4 + lVar6 + 0x13cc) = &uStack_13d8;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0dc9;
  uVar5 = FUN_1801bfc00((longlong)auStack_13d4 + lVar6 + 0x13cc);
  *(ulonglong *)((longlong)auStackX_8 + lVar6) = (ulonglong)uVar5;
  *(undefined4 **)((longlong)auStack_13d4 + lVar6 + 0x13cc) = &uStack_13d8;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0de3;
  uVar5 = FUN_1801bfc00((longlong)auStack_13d4 + lVar6 + 0x13cc);
  *(ulonglong *)((longlong)auStackX_8 + lVar6 + 8) = (ulonglong)uVar5;
  *(undefined8 *)((longlong)auStackX_8 + lVar6 + 0x10) = uVar9;
  *(undefined8 *)((longlong)auStackX_8 + lVar6 + 0x18) = 0;
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x20) = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x24) = 0;
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x28) = *(undefined4 *)(param_2 + 0x18);
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x2c) = 0;
  *(undefined8 *)((longlong)auStackX_8 + lVar6 + 0x30) = 3;
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x38) = param_3;
  *(undefined4 *)((longlong)auStackX_8 + lVar6 + 0x3c) = param_3;
  *(undefined8 *)((longlong)auStack_13d4 + lVar6 + 0x13bc) = 0;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0e49;
  WriteProcessMemory(uVar7,uVar8,(longlong)auStackX_8 + lVar6,0x40);
  plVar3 = (longlong *)param_1[1];
  puVar12 = (undefined1 *)((longlong)auStack_13d4 + lVar6 + 0x139c);
  if (plVar3 != (longlong *)0x0) {
    LOCK();
    plVar1 = plVar3 + 1;
    *(int *)plVar1 = (int)*plVar1 + -1;
    UNLOCK();
    puVar12 = (undefined1 *)((longlong)auStack_13d4 + lVar6 + 0x139c);
    if ((int)*plVar1 == 0) {
      pcVar4 = *(code **)*plVar3;
      *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x1801d0e61;
      (*pcVar4)(plVar3);
      puVar12 = (undefined1 *)((longlong)auStack_13d4 + lVar6 + 0x139c);
      LOCK();
      piVar2 = (int *)((longlong)plVar3 + 0xc);
      *piVar2 = *piVar2 + -1;
      UNLOCK();
      if (*piVar2 == 0) {
        pcVar4 = *(code **)(*plVar3 + 8);
        *(undefined1 **)((longlong)&uStack_40 + lVar6) = &LAB_1801d0e70;
        (*pcVar4)(plVar3);
        puVar12 = (undefined1 *)((longlong)auStack_13d4 + lVar6 + 0x139c);
      }
    }
  }
  *(undefined8 *)(puVar12 + -8) = 0x1801d0e82;
  FUN_180e155e0(uStack_48 ^ (ulonglong)puVar12);
  return;
}

