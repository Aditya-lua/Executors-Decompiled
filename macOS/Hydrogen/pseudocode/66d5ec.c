
void FUN_0066d5ec(ulong param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long lVar6;
  ulong uVar7;
  undefined8 uStack0000000000000008;
  
  uVar7 = 0;
  if (param_1 != 0) {
    uVar7 = unaff_x20 / param_1;
  }
  lVar6 = unaff_x20 - uVar7 * param_1;
  plVar2 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  uVar7 = (ulong)*(uint *)((long)unaff_x19 + 0xcc);
  uStack0000000000000008 = uVar7;
  if ((ulong)unaff_x19[0x15] < uVar7) {
    lVar3 = (**(code **)(*plVar2 + 0x128))(plVar2,&UNK_008ba5c8,&uStack0000000000000008);
    if (uStack0000000000000008 < uVar7) {
      uVar5 = unaff_x19[0x15];
      lVar3 = unaff_x19[0x16];
      if (uVar5 != uVar7) {
        if (lVar3 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(lVar3 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644(lVar3);
        }
        lVar3 = func_0x006115d0(uVar7);
        unaff_x19[0x16] = lVar3;
      }
      unaff_x19[0x14] = -1;
      unaff_x19[0x15] = uVar7;
    }
  }
  else {
    lVar3 = unaff_x19[0x16];
  }
  lVar1 = unaff_x20 - lVar6;
  if (lVar1 != 0) {
    (**(code **)(*(long *)unaff_x19[0x17] + 0x48))((long *)unaff_x19[0x17],lVar3);
    plVar2 = (long *)(**(code **)(*unaff_x19 + 0x160))();
    (**(code **)(*plVar2 + 0x38))(plVar2,lVar3,lVar1,0,1);
    unaff_x21 = unaff_x21 + lVar1;
  }
  if (lVar6 == 0) {
    unaff_x21 = 0;
    lVar6 = 0;
  }
  uVar4 = (**(code **)(*(long *)unaff_x19[0x17] + 0x50))
                    ((long *)unaff_x19[0x17],lVar3,*(undefined4 *)((long)unaff_x19 + 0xcc),unaff_x21
                     ,lVar6);
  plVar2 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  (**(code **)(*plVar2 + 0x38))(plVar2,lVar3,uVar4,0,1);
  return;
}

