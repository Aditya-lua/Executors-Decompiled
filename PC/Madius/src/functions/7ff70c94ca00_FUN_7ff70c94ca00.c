/* 7ff70c94ca00 FUN_7ff70c94ca00 */

int FUN_7ff70c94ca00(int *param_1,int *param_2)

{
  longlong lVar1;
  longlong *plVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  longlong lVar6;
  longlong *plVar7;
  longlong lVar8;
  longlong lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  int *piStack_88;
  int *piStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  
  FUN_7ff70c958630(&uStack_78);
  iVar4 = 1;
  if (((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) &&
     (iVar4 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    lVar8 = *(longlong *)(param_1 + 2);
    piStack_88 = param_2;
    if (lVar8 == 0) {
      iVar4 = 0;
    }
    else {
      iVar4 = 0;
      do {
        lVar8 = *(longlong *)(lVar8 + 0x10);
        iVar3 = FUN_7ff70c94cc00(param_1,&uStack_78);
        if (iVar3 != 0) {
          iVar4 = iVar3;
        }
      } while (lVar8 != 0);
    }
    piStack_80 = param_1;
    do {
      while( true ) {
        uStack_98 = CONCAT44(uStack_74,uStack_78);
        uStack_90 = CONCAT44(uStack_6c,uStack_70);
        uVar5 = FUN_7ff70c993280(&uStack_98,*(undefined8 *)(param_1 + 0x34),&lStack_a0);
        *(undefined8 *)(param_1 + 0x34) = uVar5;
        if (lStack_a0 == 0) goto LAB_7ff70c94cbc8;
        lVar8 = *(longlong *)(lStack_a0 + 0x30);
        uStack_68 = uStack_78;
        uStack_64 = uStack_74;
        uStack_60 = uStack_70;
        uStack_5c = uStack_6c;
        if (*(longlong **)(lVar8 + 0xe00) != (longlong *)0x0) break;
LAB_7ff70c94cab0:
        *(undefined8 *)(lVar8 + 0xdb8) = 0;
        *(undefined4 *)(lVar8 + 0xdc0) = 0;
        if (lStack_a0 == 0) goto LAB_7ff70c94cbc8;
      }
      plVar7 = *(longlong **)(lVar8 + 0xe00);
      do {
        lVar1 = *plVar7;
        plVar2 = (longlong *)plVar7[2];
        uStack_98 = *(undefined8 *)(lVar1 + 0x18);
        uStack_90 = *(undefined8 *)(lVar1 + 0x20);
        uStack_58 = uStack_68;
        uStack_54 = uStack_64;
        uStack_50 = uStack_60;
        uStack_4c = uStack_5c;
        lVar6 = FUN_7ff70c958790(&uStack_98,&uStack_58);
        if (0 < lVar6) break;
        FUN_7ff70c991030((longlong *)(lVar8 + 0xe00),plVar7,0);
        plVar7 = plVar2;
      } while (plVar2 != (longlong *)0x0);
      param_1 = piStack_80;
      if (*(longlong *)(lVar8 + 0xe00) == 0) goto LAB_7ff70c94cab0;
      uVar5 = *(undefined8 *)(lVar1 + 0x20);
      *(undefined8 *)(lVar8 + 0xdb8) = *(undefined8 *)(lVar1 + 0x18);
      *(undefined8 *)(lVar8 + 0xdc0) = uVar5;
      uStack_98 = *(undefined8 *)(lVar1 + 0x18);
      uStack_90 = *(undefined8 *)(lVar1 + 0x20);
      uVar5 = FUN_7ff70c9930e0(&uStack_98,*(undefined8 *)(piStack_80 + 0x34),lVar8 + 0xdc8);
      *(undefined8 *)(param_1 + 0x34) = uVar5;
    } while (lStack_a0 != 0);
LAB_7ff70c94cbc8:
    *piStack_88 = param_1[7];
    if (iVar4 < 1) {
      iVar4 = FUN_7ff70c94a8f0(param_1);
    }
  }
  return iVar4;
}


