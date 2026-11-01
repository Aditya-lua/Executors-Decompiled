
undefined8 FUN_005cc5ac(void)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 extraout_x1;
  char in_w8;
  long lVar4;
  undefined8 *unaff_x20;
  long *plVar5;
  char *unaff_x22;
  undefined8 uVar6;
  long lVar7;
  undefined8 *unaff_x26;
  char unaff_w27;
  undefined8 *puVar8;
  undefined8 *unaff_x28;
  char in_wzr;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  do {
    cVar1 = *unaff_x22;
    if (cVar1 == in_w8) {
      *unaff_x22 = in_wzr;
    }
    puVar8 = unaff_x28;
    if (cVar1 != '\x01') {
      func_0x007b05dc(unaff_x22,0);
    }
    do {
      if (puVar8 == unaff_x26) {
        uVar6 = 0;
        uVar3 = 0;
joined_r0x005cc5e8:
        if (in_stack_00000008 != 0) {
          func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 3,8);
          uVar3 = uVar6;
        }
        return uVar3;
      }
      unaff_x28 = puVar8 + 1;
      plVar5 = (long *)*puVar8;
      iVar2 = func_0x005ccb98(plVar5);
      if (iVar2 != 0) {
        uVar6 = 1;
        uVar3 = 1;
        goto joined_r0x005cc5e8;
      }
      puVar8 = unaff_x28;
    } while (*plVar5 != 10);
    lVar7 = plVar5[4];
    unaff_x22 = (char *)(lVar7 + 8);
    if (*unaff_x22 == '\0') {
      *unaff_x22 = unaff_w27;
    }
    else {
      func_0x007aff64(unaff_x22,extraout_x1,1000000000);
    }
    uVar6 = *unaff_x20;
    if (*(long *)(lVar7 + 0x20) != 0) {
      lVar4 = *(long *)(lVar7 + 0x20) << 3;
      do {
        func_0x005d5ff8(uVar6);
        lVar4 = lVar4 + -8;
      } while (lVar4 != 0);
    }
    func_0x005d6394(uVar6,lVar7 + 0x28);
    in_w8 = '\x01';
  } while( true );
}

