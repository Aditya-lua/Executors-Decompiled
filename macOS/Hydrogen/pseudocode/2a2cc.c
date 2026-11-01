
undefined8 FUN_0002a2cc(long *param_1)

{
  char cVar1;
  long *plVar2;
  undefined8 uVar3;
  long extraout_x8;
  long *plVar4;
  long *plVar5;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong *puVar6;
  long *unaff_x22;
  ulong uVar7;
  undefined *unaff_x23;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000008;
  
  while( true ) {
    plVar4 = unaff_x22;
    plVar5 = param_1;
    do {
      plVar2 = plVar5 + 1;
      if (unaff_x20 <= (ulong)plVar5[4]) {
        plVar4 = plVar5;
        plVar2 = plVar5;
      }
      plVar5 = (long *)*plVar2;
    } while (plVar5 != (long *)0x0);
    if ((plVar4 == unaff_x22) || (unaff_x20 < (ulong)plVar4[4])) break;
    do {
      while (unaff_x20 < (ulong)param_1[4]) {
        param_1 = (long *)*param_1;
        if (param_1 == (long *)0x0) goto LAB_0002a27c;
      }
      if (unaff_x20 <= (ulong)param_1[4]) {
        uStack0000000000000008._0_4_ = (undefined4)param_1[5];
        auVar8 = func_0x0002a764(&uStack0000000000000008);
        uVar7 = auVar8._0_8_;
        if (((auVar8._8_8_ & 0xff) == 0) || (unaff_x20 = uVar7, *(char *)(uVar7 + 3) == '\0'))
        goto LAB_0002a354;
        goto LAB_0002a2b8;
      }
      param_1 = (long *)param_1[1];
    } while (param_1 != (long *)0x0);
LAB_0002a27c:
    func_0x0002a824("map::at:  key not found");
    uStack0000000000000008._4_4_ = *(undefined4 *)(extraout_x8 + 0x28);
    auVar8 = func_0x0002a764((long)&uStack0000000000000008 + 4);
    uVar7 = auVar8._0_8_;
    if ((auVar8._8_8_ & 0xff) == 0) {
      return 0;
    }
    unaff_x20 = uVar7;
    if (*(char *)(uVar7 + 3) == '\0') break;
    unaff_x23 = &DAT_0002a1e0;
LAB_0002a2b8:
    unaff_x20 = uVar7;
    if ((*(undefined **)(uVar7 + 0x18) != unaff_x23) ||
       (param_1 = *(long **)(unaff_x21 + 0x378), param_1 == (long *)0x0)) break;
  }
LAB_0002a354:
  if (*(char *)(unaff_x20 + 3) == '\0') {
    func_0x006e1e34();
    puVar6 = *(ulong **)(unaff_x19 + 8);
    *puVar6 = unaff_x20;
    *(undefined4 *)((long)puVar6 + 0xc) = 7;
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
    func_0x006e1ee0();
    uVar3 = 0xffffffff;
    func_0x006e4c80();
    cVar1 = *(char *)(unaff_x19 + 3);
    if (((cVar1 != '\x01') && (cVar1 != '\x06')) && (cVar1 != '\x7f')) {
      uVar3 = func_0x006e1e34();
    }
  }
  else {
    puVar6 = *(ulong **)(*(long *)(unaff_x19 + 0x20) + 8);
    uVar7 = *puVar6;
    *puVar6 = unaff_x20;
    *(undefined4 *)((long)puVar6 + 0xc) = 7;
    uVar3 = (**(code **)(unaff_x20 + 0x18))();
    if (*(ulong **)(*(long *)(unaff_x19 + 0x20) + 8) == puVar6) {
      *puVar6 = uVar7;
      *(undefined4 *)((long)puVar6 + 0xc) = 7;
    }
  }
  return uVar3;
}

