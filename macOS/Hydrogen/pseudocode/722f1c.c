
ulong FUN_00722f1c(void)

{
  undefined8 *puVar1;
  char cVar2;
  char cVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long unaff_x19;
  int *piVar14;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_78 [16];
  char cStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  iVar4 = _strcmp();
  func_0x00710d48();
  if ((iVar4 != 0) == true) {
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar5 = func_0x0071b400();
  }
  else {
    uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x30);
    func_0x00705fcc(uVar5,&uStack0000000000000020,iVar4 != 0);
    if (*(char *)(unaff_x19 + 0x58) != '\0') {
      uVar7 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x18);
      func_0x0070940c(uVar7,&uStack0000000000000010);
      lVar6 = *(long *)(unaff_x19 + 0x420);
      unaff_x22 = uVar5 >> 4;
      if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
        if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar5 != *(ulong *)(unaff_x19 + 0x430))) {
          uVar10 = 0;
          uVar12 = unaff_x22 ^ uVar5 >> 9;
          do {
            uVar12 = uVar12 & lVar6 - 1U;
            uVar13 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar12 * 0x10);
            if (uVar13 == uVar5) goto LAB_00723134;
            uVar10 = uVar10 + 1;
            uVar12 = uVar10 + uVar12;
          } while (uVar13 != *(ulong *)(unaff_x19 + 0x430) && uVar10 <= lVar6 - 1U);
        }
        func_0x006db93c();
        lVar6 = *(long *)(unaff_x19 + 0x420);
      }
LAB_00723134:
      lVar8 = *(long *)(unaff_x19 + 0x418);
      uVar10 = (unaff_x22 ^ uVar5 >> 9) & lVar6 - 1U;
      uVar12 = *(ulong *)(lVar8 + uVar10 * 0x10);
      if (uVar12 != *(ulong *)(unaff_x19 + 0x430)) {
        lVar9 = 1;
        do {
          if (uVar12 == uVar5) goto LAB_00723194;
          uVar10 = uVar10 + lVar9 & lVar6 - 1U;
          uVar12 = *(ulong *)(lVar8 + uVar10 * 0x10);
          lVar9 = lVar9 + 1;
        } while (uVar12 != *(ulong *)(unaff_x19 + 0x430));
      }
      *(ulong *)(lVar8 + uVar10 * 0x10) = uVar5;
      *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00723194:
      *(undefined8 *)(lVar8 + uVar10 * 0x10 + 8) = uVar7;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar5;
  }
  ___stack_chk_fail();
  lVar6 = __Unwind_Resume();
  piVar14 = (int *)(lVar6 + 0x80);
  iVar4 = *piVar14;
  uStack_48 = *(undefined8 *)(lVar6 + 0x8c);
  uStack_50 = *(undefined8 *)(lVar6 + 0x84);
  if (cRam0000000000a337a0 == '\0') {
    cVar3 = (iVar4 == 0x116) << 1;
    cVar2 = *(char *)(lVar6 + 0x58);
  }
  else if (iVar4 == 0x117) {
    iVar4 = func_0x0070b9dc(piVar14);
    cVar3 = iVar4 == 0;
    cVar2 = *(char *)(lVar6 + 0x58);
  }
  else {
    cVar3 = '\0';
    if (iVar4 == 0x116) {
      cVar3 = '\x02';
    }
    cVar2 = *(char *)(lVar6 + 0x58);
  }
  if (cVar2 == '\0') {
    uStack_60 = 0;
    uStack_58 = 0;
    func_0x0071af20(auStack_78,lVar6,0);
  }
  else {
    if (*piVar14 == 0x116) {
      unaff_x22 = func_0x0070b9b4(piVar14);
      unaff_x23 = 2;
    }
    else if (*piVar14 == 0x117) {
      iVar4 = func_0x0070b9dc(piVar14);
      unaff_x22 = 0;
      unaff_x23 = (ulong)(iVar4 == 1);
    }
    else {
      unaff_x22 = 0;
      unaff_x23 = 3;
    }
    puVar1 = (undefined8 *)0x0;
    if (*(char *)(lVar6 + 0x58) != '\0') {
      puVar1 = &uStack_60;
    }
    uStack_60 = 0;
    uStack_58 = 0;
    func_0x0071af20(auStack_78,lVar6,puVar1);
  }
  if (cStack_68 == '\0') {
    uStack_88 = 0;
    uStack_80 = 0;
    uVar5 = func_0x0071b400(lVar6,&uStack_50,&uStack_88,
                            "String literal contains malformed escape sequence");
  }
  else {
    uVar5 = func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),0x38);
    func_0x0070601c(uVar5,&uStack_50,auStack_78,cVar3);
    if (*(char *)(lVar6 + 0x58) != '\0') {
      uVar7 = func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),0x20);
      func_0x00709424(uVar7,uStack_60,uStack_58,unaff_x23,unaff_x22);
      lVar8 = *(long *)(lVar6 + 0x420);
      if ((ulong)(lVar8 * 3) >> 2 <= *(ulong *)(lVar6 + 0x428)) {
        if ((*(ulong *)(lVar6 + 0x428) != 0) && (uVar5 != *(ulong *)(lVar6 + 0x430))) {
          uVar10 = 0;
          uVar12 = uVar5 >> 4 ^ uVar5 >> 9;
          do {
            uVar12 = uVar12 & lVar8 - 1U;
            uVar13 = *(ulong *)(*(long *)(lVar6 + 0x418) + uVar12 * 0x10);
            if (uVar13 == uVar5) goto code_r0x007233c8;
            uVar10 = uVar10 + 1;
            uVar12 = uVar10 + uVar12;
          } while (uVar13 != *(ulong *)(lVar6 + 0x430) && uVar10 <= lVar8 - 1U);
        }
        func_0x006db93c();
        lVar8 = *(long *)(lVar6 + 0x420);
      }
code_r0x007233c8:
      lVar9 = *(long *)(lVar6 + 0x418);
      uVar10 = (uVar5 >> 4 ^ uVar5 >> 9) & lVar8 - 1U;
      uVar12 = *(ulong *)(lVar9 + uVar10 * 0x10);
      if (uVar12 != *(ulong *)(lVar6 + 0x430)) {
        lVar11 = 1;
        do {
          if (uVar12 == uVar5) goto code_r0x00723428;
          uVar10 = uVar10 + lVar11 & lVar8 - 1U;
          uVar12 = *(ulong *)(lVar9 + uVar10 * 0x10);
          lVar11 = lVar11 + 1;
        } while (uVar12 != *(ulong *)(lVar6 + 0x430));
      }
      *(ulong *)(lVar9 + uVar10 * 0x10) = uVar5;
      *(long *)(lVar6 + 0x428) = *(long *)(lVar6 + 0x428) + 1;
code_r0x00723428:
      *(undefined8 *)(lVar9 + uVar10 * 0x10 + 8) = uVar7;
    }
  }
  return uVar5;
}

