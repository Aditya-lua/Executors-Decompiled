/* 7ff70c92e540 FUN_7ff70c92e540 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c92e540(longlong param_1,undefined4 param_2)

{
  byte bVar1;
  uint uVar2;
  longlong *plVar3;
  code *pcVar4;
  undefined8 *puVar5;
  longlong lVar6;
  uint uVar7;
  undefined8 *puVar8;
  uint uVar9;
  
  puVar8 = *(undefined8 **)(param_1 + 8);
  if (*(int *)(puVar8 + 1) == 6) {
    bVar1 = *(byte *)(param_1 + 0x11);
  }
  else {
    puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
    *(undefined4 *)(puVar5 + 1) = 6;
    *(undefined8 *)((longlong)puVar5 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar5 + 0x14) = 0;
    *puVar5 = &UNK_7ff70cb46928;
    puVar5[4] = 0;
    puVar5[5] = 0;
    puVar5[3] = puVar8;
    lVar6 = puVar8[2];
    if (lVar6 != 0) {
      puVar5[2] = lVar6;
      *(undefined8 **)(lVar6 + 0x18) = puVar5;
      puVar8 = *(undefined8 **)(param_1 + 8);
    }
    puVar8[2] = puVar5;
    *(undefined8 **)(param_1 + 8) = puVar5;
    bVar1 = *(byte *)(param_1 + 0x11);
    puVar8 = puVar5;
  }
  if ((bVar1 & 1) != 0) {
    plVar3 = *(longlong **)(*(longlong *)(param_1 + 0x18) + 8);
    param_2 = (**(code **)(*plVar3 + 0x20))(plVar3,param_2);
    puVar8 = *(undefined8 **)(param_1 + 8);
  }
  uVar2 = *(uint *)(puVar8 + 4);
  uVar7 = *(uint *)((longlong)puVar8 + 0x24);
  if (uVar7 < uVar2) {
    lVar6 = puVar8[5];
  }
  else {
    uVar7 = 0x10;
    if (0x10 < uVar2 >> 1) {
      uVar7 = uVar2 >> 1;
    }
    uVar9 = 0xffffffff;
    if (!CARRY4(uVar7,uVar2)) {
      uVar9 = uVar7 + uVar2;
    }
    if ((uVar9 == uVar2) || (lVar6 = (*_DAT_7ff70cb96738)(puVar8[5],uVar9), lVar6 == 0)) {
      FUN_7ff70cb12980(9);
      pcVar4 = (code *)swi(3);
      (*pcVar4)();
      return;
    }
    puVar8[5] = lVar6;
    *(uint *)(puVar8 + 4) = uVar9;
    uVar7 = *(uint *)((longlong)puVar8 + 0x24);
  }
  *(uint *)((longlong)puVar8 + 0x24) = uVar7 + 1;
  *(char *)(lVar6 + (ulonglong)uVar7) = (char)param_2;
  return;
}


