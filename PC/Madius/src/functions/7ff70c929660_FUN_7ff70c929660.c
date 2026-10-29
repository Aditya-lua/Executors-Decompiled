/* 7ff70c929660 FUN_7ff70c929660 */

void FUN_7ff70c929660(longlong param_1,longlong param_2)

{
  longlong *plVar1;
  undefined8 *puVar2;
  ulonglong uVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 uVar9;
  undefined1 uStack_29;
  
  uVar3 = (ulonglong)*(uint *)(param_1 + 0xe8);
  plVar1 = (longlong *)(param_2 + 0x10);
  lVar4 = *(longlong *)(param_2 + 0x10);
  lVar5 = *(longlong *)(param_2 + 0x18);
  lVar8 = lVar5 - lVar4 >> 3;
  lVar6 = uVar3 + lVar8 * 0x5555555555555555;
  if (uVar3 < (ulonglong)(lVar8 * -0x5555555555555555)) {
    *(ulonglong *)(param_2 + 0x18) = lVar4 + uVar3 * 0x18;
  }
  else if (lVar6 != 0) {
    if ((ulonglong)((*(longlong *)(param_2 + 0x20) - lVar4 >> 3) * -0x5555555555555555) < uVar3) {
      FUN_7ff70c929990(plVar1,uVar3,&uStack_29);
    }
    else {
      lVar6 = lVar6 * 0x18;
      FUN_7ff70cb12b80(lVar5,0,lVar6);
      *(longlong *)(param_2 + 0x18) = lVar5 + lVar6;
    }
  }
  lVar4 = 8;
  if (*(char *)(param_1 + 0xf3) != '\0') {
    lVar4 = 0x40;
  }
  puVar2 = (undefined8 *)*plVar1;
  *(undefined1 *)(puVar2 + 2) = 1;
  *puVar2 = *(undefined8 *)(param_1 + 0xd0);
  puVar2[1] = *(undefined8 *)(param_1 + lVar4);
  if (1 < *(uint *)(param_1 + 0xe8)) {
    lVar5 = 0;
    lVar6 = 0;
    uVar3 = 0;
    do {
      if ((*(ulonglong *)(*(longlong *)(param_1 + 0x20 + lVar4) + (uVar3 >> 6) * 8) >>
           (uVar3 & 0x3f) & 1) == 0) {
        *(undefined1 *)(*plVar1 + 0x28 + lVar6) = 0;
        uVar9 = *(undefined8 *)(param_1 + 0xd8);
        *(undefined8 *)(*plVar1 + 0x18 + lVar6) = uVar9;
      }
      else {
        *(undefined1 *)(*plVar1 + 0x28 + lVar6) = 1;
        *(undefined8 *)(*plVar1 + 0x18 + lVar6) =
             *(undefined8 *)(*(longlong *)(param_1 + 8 + lVar4) + lVar5);
        uVar9 = *(undefined8 *)(*(longlong *)(param_1 + 8 + lVar4) + 8 + lVar5);
      }
      *(undefined8 *)(*plVar1 + 0x20 + lVar6) = uVar9;
      lVar6 = lVar6 + 0x18;
      lVar5 = lVar5 + 0x10;
      uVar7 = uVar3 + 2;
      uVar3 = uVar3 + 1;
    } while (uVar7 < *(uint *)(param_1 + 0xe8));
  }
  *(undefined8 *)(param_2 + 0x30) = **(undefined8 **)(param_2 + 0x10);
  lVar4 = (*(undefined8 **)(param_2 + 0x10))[1];
  *(longlong *)(param_2 + 0x40) = lVar4;
  lVar5 = *(longlong *)(param_1 + 0xd8);
  *(longlong *)(param_2 + 0x48) = lVar5;
  *(bool *)(param_2 + 0x50) = lVar4 != lVar5;
  uVar9 = *(undefined8 *)(param_1 + 0xd8);
  *(undefined8 *)(param_2 + 0x58) = uVar9;
  *(undefined8 *)(param_2 + 0x60) = uVar9;
  return;
}


