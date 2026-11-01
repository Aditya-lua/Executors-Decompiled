
ulong FUN_00723204(void)

{
  char cVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  int in_w8;
  long lVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  int *unaff_x20;
  undefined8 unaff_x22;
  ulong unaff_x23;
  undefined1 uStack0000000000000018;
  char in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  
  uStack0000000000000048 = *(undefined8 *)(unaff_x20 + 3);
  _uStack0000000000000040 = *(undefined8 *)(unaff_x20 + 1);
  if (cRam0000000000a337a0 == '\0') {
    cVar2 = (in_w8 == 0x116) << 1;
    cVar1 = *(char *)(unaff_x19 + 0x58);
  }
  else if (in_w8 == 0x117) {
    iVar3 = func_0x0070b9dc();
    cVar2 = iVar3 == 0;
    cVar1 = *(char *)(unaff_x19 + 0x58);
  }
  else {
    cVar2 = '\0';
    if (in_w8 == 0x116) {
      cVar2 = '\x02';
    }
    cVar1 = *(char *)(unaff_x19 + 0x58);
  }
  if (cVar1 == '\0') {
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    func_0x0071af20(&uStack0000000000000018);
  }
  else {
    if (*unaff_x20 == 0x116) {
      unaff_x22 = func_0x0070b9b4();
      unaff_x23 = 2;
    }
    else if (*unaff_x20 == 0x117) {
      iVar3 = func_0x0070b9dc();
      unaff_x22 = 0;
      unaff_x23 = (ulong)(iVar3 == 1);
    }
    else {
      unaff_x22 = 0;
      unaff_x23 = 3;
    }
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    func_0x0071af20(&uStack0000000000000018);
  }
  if (in_stack_00000028 == '\0') {
    uVar4 = func_0x0071b400();
  }
  else {
    uVar4 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x38);
    func_0x0070601c(uVar4,&uStack0000000000000040,&uStack0000000000000018,cVar2);
    if (*(char *)(unaff_x19 + 0x58) != '\0') {
      uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x20);
      func_0x00709424(uVar5,in_stack_00000030,in_stack_00000038,unaff_x23,unaff_x22);
      lVar6 = *(long *)(unaff_x19 + 0x420);
      if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
        if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar4 != *(ulong *)(unaff_x19 + 0x430))) {
          uVar8 = 0;
          uVar10 = uVar4 >> 4 ^ uVar4 >> 9;
          do {
            uVar10 = uVar10 & lVar6 - 1U;
            uVar11 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar10 * 0x10);
            if (uVar11 == uVar4) goto LAB_007233c8;
            uVar8 = uVar8 + 1;
            uVar10 = uVar8 + uVar10;
          } while (uVar11 != *(ulong *)(unaff_x19 + 0x430) && uVar8 <= lVar6 - 1U);
        }
        func_0x006db93c();
        lVar6 = *(long *)(unaff_x19 + 0x420);
      }
LAB_007233c8:
      lVar7 = *(long *)(unaff_x19 + 0x418);
      uVar8 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar6 - 1U;
      uVar10 = *(ulong *)(lVar7 + uVar8 * 0x10);
      if (uVar10 != *(ulong *)(unaff_x19 + 0x430)) {
        lVar9 = 1;
        do {
          if (uVar10 == uVar4) goto LAB_00723428;
          uVar8 = uVar8 + lVar9 & lVar6 - 1U;
          uVar10 = *(ulong *)(lVar7 + uVar8 * 0x10);
          lVar9 = lVar9 + 1;
        } while (uVar10 != *(ulong *)(unaff_x19 + 0x430));
      }
      *(ulong *)(lVar7 + uVar8 * 0x10) = uVar4;
      *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00723428:
      *(undefined8 *)(lVar7 + uVar8 * 0x10 + 8) = uVar5;
    }
  }
  return uVar4;
}

