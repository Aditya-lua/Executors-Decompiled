/* 7ff70c94a8f0 FUN_7ff70c94a8f0 */

undefined8 FUN_7ff70c94a8f0(longlong param_1)

{
  longlong lVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  int iVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined4 uStack_38;
  undefined4 uStack_34;
  int iStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  int iStack_20;
  undefined4 uStack_1c;
  
  if (*(longlong *)(param_1 + 0x180) == 0) {
    return 0;
  }
  if (*(char *)(param_1 + 0x1b4) != '\0') {
    return 0;
  }
  if (*(longlong *)(param_1 + 0xd0) == 0) {
LAB_7ff70c94a9fb:
    if ((*(longlong *)(param_1 + 400) == 0) && (*(int *)(param_1 + 0x198) == 0)) {
      return 0;
    }
    *(undefined8 *)(param_1 + 400) = 0;
    *(undefined8 *)(param_1 + 0x198) = 0;
    *(undefined1 *)(param_1 + 0x1b3) = 1;
    iVar5 = (**(code **)(param_1 + 0x180))(param_1,0xffffffff,*(undefined8 *)(param_1 + 0x188));
    *(undefined1 *)(param_1 + 0x1b3) = 0;
  }
  else {
    FUN_7ff70c958630(&uStack_38);
    uStack_48 = 0;
    uStack_40 = 0;
    lVar6 = FUN_7ff70c992fc0(&uStack_48,*(undefined8 *)(param_1 + 0xd0));
    *(longlong *)(param_1 + 0xd0) = lVar6;
    lVar1 = *(longlong *)(lVar6 + 0x20);
    if ((lVar1 < CONCAT44(uStack_34,uStack_38)) ||
       ((lVar1 <= CONCAT44(uStack_34,uStack_38) && (*(int *)(lVar6 + 0x28) <= iStack_30)))) {
      uVar7 = 0;
      if (lVar1 == *(longlong *)(param_1 + 400)) {
LAB_7ff70c94a9b6:
        if (*(int *)(lVar6 + 0x28) == *(int *)(param_1 + 0x198)) {
          return 0;
        }
      }
    }
    else {
      uStack_48 = *(undefined8 *)(lVar6 + 0x20);
      uStack_40 = *(undefined8 *)(lVar6 + 0x28);
      uStack_28 = uStack_38;
      uStack_24 = uStack_34;
      iStack_20 = iStack_30;
      uStack_1c = uStack_2c;
      uVar7 = FUN_7ff70c958730(&uStack_48,&uStack_28);
      if ((int)uVar7 < 0) goto LAB_7ff70c94a9fb;
      lVar6 = *(longlong *)(param_1 + 0xd0);
      if (*(longlong *)(lVar6 + 0x20) == *(longlong *)(param_1 + 400)) goto LAB_7ff70c94a9b6;
    }
    uVar2 = *(undefined4 *)(lVar6 + 0x24);
    uVar3 = *(undefined4 *)(lVar6 + 0x28);
    uVar4 = *(undefined4 *)(lVar6 + 0x2c);
    *(undefined4 *)(param_1 + 400) = *(undefined4 *)(lVar6 + 0x20);
    *(undefined4 *)(param_1 + 0x194) = uVar2;
    *(undefined4 *)(param_1 + 0x198) = uVar3;
    *(undefined4 *)(param_1 + 0x19c) = uVar4;
    *(undefined1 *)(param_1 + 0x1b3) = 1;
    iVar5 = (**(code **)(param_1 + 0x180))(param_1,uVar7,*(undefined8 *)(param_1 + 0x188));
    *(undefined1 *)(param_1 + 0x1b3) = 0;
  }
  uVar7 = 0;
  if (iVar5 == -1) {
    *(undefined1 *)(param_1 + 0x1b4) = 1;
    uVar7 = 0xb;
  }
  return uVar7;
}


