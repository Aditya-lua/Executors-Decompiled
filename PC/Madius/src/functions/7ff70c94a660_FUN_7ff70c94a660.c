/* 7ff70c94a660 FUN_7ff70c94a660 */

void FUN_7ff70c94a660(longlong param_1,longlong param_2,int param_3)

{
  longlong *plVar1;
  undefined4 uVar2;
  longlong lVar3;
  undefined8 uVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  int iVar8;
  longlong *plVar9;
  longlong lVar10;
  longlong lStack_78;
  undefined8 uStack_70;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  longlong lStack_48;
  
  lVar3 = *(longlong *)(param_1 + 0xd8);
  if (lVar3 == 0) {
    return;
  }
  FUN_7ff70c958630(&lStack_78);
  uVar2 = uStack_70._4_4_;
  iVar5 = ((int)param_2 + (int)(param_2 / 1000) * -1000) * 1000 + (int)uStack_70;
  iVar8 = iVar5 + -1000000;
  if (iVar5 < 1000000) {
    iVar8 = iVar5;
  }
  lVar7 = (ulonglong)(999999 < iVar5) + lStack_78 + param_2 / 1000;
  plVar1 = (longlong *)(param_1 + 0xe00);
  for (plVar9 = *(longlong **)(param_1 + 0xe00); plVar9 != (longlong *)0x0;
      plVar9 = (longlong *)plVar9[2]) {
    if (*(int *)(*plVar9 + 0x28) == param_3) {
      FUN_7ff70c991030(plVar1,plVar9,0);
      break;
    }
  }
  lVar10 = (longlong)param_3 * 0x30;
  lVar6 = param_1 + lVar10 + 0xe20;
  *(longlong *)(param_1 + 0xe38 + lVar10) = lVar7;
  *(int *)(param_1 + 0xe40 + lVar10) = iVar8;
  *(undefined4 *)(param_1 + 0xe44 + lVar10) = uVar2;
  *(int *)(param_1 + 0xe48 + lVar10) = param_3;
  lStack_48 = lVar3;
  lVar3 = FUN_7ff70c991170(plVar1);
  uStack_5c = uVar2;
  if ((lVar3 != 0) && (plVar1 = (longlong *)*plVar1, plVar1 != (longlong *)0x0)) {
    lVar10 = lVar10 + param_1;
    lStack_78 = *(longlong *)(*plVar1 + 0x18);
    uStack_70 = *(undefined8 *)(*plVar1 + 0x20);
    uStack_58 = *(undefined4 *)(lVar10 + 0xe38);
    uStack_54 = *(undefined4 *)(lVar10 + 0xe3c);
    uStack_50 = *(undefined4 *)(lVar10 + 0xe40);
    uStack_4c = *(undefined4 *)(lVar10 + 0xe44);
    lVar3 = FUN_7ff70c9586d0(&lStack_78,&uStack_58);
    if (lVar3 < 1) {
      do {
        plVar9 = plVar1;
        plVar1 = (longlong *)plVar9[2];
        if (plVar1 == (longlong *)0x0) break;
        lStack_78 = *(longlong *)(*plVar1 + 0x18);
        uStack_70 = *(undefined8 *)(*plVar1 + 0x20);
        uStack_58 = *(undefined4 *)(lVar10 + 0xe38);
        uStack_54 = *(undefined4 *)(lVar10 + 0xe3c);
        uStack_50 = *(undefined4 *)(lVar10 + 0xe40);
        uStack_4c = *(undefined4 *)(lVar10 + 0xe44);
        lVar3 = FUN_7ff70c9586d0(&lStack_78,&uStack_58);
      } while (lVar3 < 1);
      goto LAB_7ff70c94a7ae;
    }
  }
  plVar9 = (longlong *)0x0;
LAB_7ff70c94a7ae:
  FUN_7ff70c990fc0(param_1 + 0xe00,plVar9,lVar6,lVar6);
  lVar3 = lStack_48;
  uVar2 = uStack_5c;
  plVar1 = (longlong *)(param_1 + 0xdb8);
  if ((*plVar1 != 0) || (*(int *)(param_1 + 0xdc0) != 0)) {
    uStack_70 = CONCAT44(uStack_5c,iVar8);
    uStack_58 = *(undefined4 *)plVar1;
    uStack_54 = *(undefined4 *)(param_1 + 0xdbc);
    uStack_50 = *(undefined4 *)(param_1 + 0xdc0);
    uStack_4c = *(undefined4 *)(param_1 + 0xdc4);
    lStack_78 = lVar7;
    lVar6 = FUN_7ff70c9586d0(&lStack_78,&uStack_58);
    if (0 < lVar6) {
      return;
    }
    iVar5 = FUN_7ff70c9933f0(*(undefined8 *)(lVar3 + 0xd0),param_1 + 0xdc8,lVar3 + 0xd0);
    if ((iVar5 != 0) && (*(char *)(param_1 + 0xa37) == '\x01')) {
      FUN_7ff70c941400(param_1,&UNK_7ff70cb88de5,iVar5);
    }
  }
  *(longlong *)(param_1 + 0xdb8) = lVar7;
  *(int *)(param_1 + 0xdc0) = iVar8;
  *(undefined4 *)(param_1 + 0xdc4) = uVar2;
  *(longlong *)(param_1 + 0xdf8) = param_1;
  lStack_78 = *plVar1;
  uStack_70 = *(undefined8 *)(param_1 + 0xdc0);
  uVar4 = FUN_7ff70c9930e0(&lStack_78,*(undefined8 *)(lVar3 + 0xd0),param_1 + 0xdc8);
  *(undefined8 *)(lVar3 + 0xd0) = uVar4;
  return;
}


