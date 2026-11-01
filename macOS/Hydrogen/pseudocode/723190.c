
ulong FUN_00723190(long param_1)

{
  undefined8 *puVar1;
  char cVar2;
  char cVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long in_x9;
  undefined8 in_x10;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long unaff_x19;
  ulong unaff_x20;
  int *piVar14;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_78 [16];
  char cStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  *(undefined8 *)(unaff_x19 + 0x428) = in_x10;
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return unaff_x20;
  }
  ___stack_chk_fail();
  lVar5 = __Unwind_Resume();
  piVar14 = (int *)(lVar5 + 0x80);
  iVar4 = *piVar14;
  uStack_48 = *(undefined8 *)(lVar5 + 0x8c);
  uStack_50 = *(undefined8 *)(lVar5 + 0x84);
  if (cRam0000000000a337a0 == '\0') {
    cVar3 = (iVar4 == 0x116) << 1;
    cVar2 = *(char *)(lVar5 + 0x58);
  }
  else if (iVar4 == 0x117) {
    iVar4 = func_0x0070b9dc(piVar14);
    cVar3 = iVar4 == 0;
    cVar2 = *(char *)(lVar5 + 0x58);
  }
  else {
    cVar3 = '\0';
    if (iVar4 == 0x116) {
      cVar3 = '\x02';
    }
    cVar2 = *(char *)(lVar5 + 0x58);
  }
  if (cVar2 == '\0') {
    uStack_60 = 0;
    uStack_58 = 0;
    func_0x0071af20(auStack_78,lVar5,0);
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
    if (*(char *)(lVar5 + 0x58) != '\0') {
      puVar1 = &uStack_60;
    }
    uStack_60 = 0;
    uStack_58 = 0;
    func_0x0071af20(auStack_78,lVar5,puVar1);
  }
  if (cStack_68 == '\0') {
    uStack_88 = 0;
    uStack_80 = 0;
    uVar6 = func_0x0071b400(lVar5,&uStack_50,&uStack_88,
                            "String literal contains malformed escape sequence");
  }
  else {
    uVar6 = func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x38);
    func_0x0070601c(uVar6,&uStack_50,auStack_78,cVar3);
    if (*(char *)(lVar5 + 0x58) != '\0') {
      uVar7 = func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x20);
      func_0x00709424(uVar7,uStack_60,uStack_58,unaff_x23,unaff_x22);
      lVar8 = *(long *)(lVar5 + 0x420);
      if ((ulong)(lVar8 * 3) >> 2 <= *(ulong *)(lVar5 + 0x428)) {
        if ((*(ulong *)(lVar5 + 0x428) != 0) && (uVar6 != *(ulong *)(lVar5 + 0x430))) {
          uVar10 = 0;
          uVar12 = uVar6 >> 4 ^ uVar6 >> 9;
          do {
            uVar12 = uVar12 & lVar8 - 1U;
            uVar13 = *(ulong *)(*(long *)(lVar5 + 0x418) + uVar12 * 0x10);
            if (uVar13 == uVar6) goto code_r0x007233c8;
            uVar10 = uVar10 + 1;
            uVar12 = uVar10 + uVar12;
          } while (uVar13 != *(ulong *)(lVar5 + 0x430) && uVar10 <= lVar8 - 1U);
        }
        func_0x006db93c();
        lVar8 = *(long *)(lVar5 + 0x420);
      }
code_r0x007233c8:
      lVar9 = *(long *)(lVar5 + 0x418);
      uVar10 = (uVar6 >> 4 ^ uVar6 >> 9) & lVar8 - 1U;
      uVar12 = *(ulong *)(lVar9 + uVar10 * 0x10);
      if (uVar12 != *(ulong *)(lVar5 + 0x430)) {
        lVar11 = 1;
        do {
          if (uVar12 == uVar6) goto code_r0x00723428;
          uVar10 = uVar10 + lVar11 & lVar8 - 1U;
          uVar12 = *(ulong *)(lVar9 + uVar10 * 0x10);
          lVar11 = lVar11 + 1;
        } while (uVar12 != *(ulong *)(lVar5 + 0x430));
      }
      *(ulong *)(lVar9 + uVar10 * 0x10) = uVar6;
      *(long *)(lVar5 + 0x428) = *(long *)(lVar5 + 0x428) + 1;
code_r0x00723428:
      *(undefined8 *)(lVar9 + uVar10 * 0x10 + 8) = uVar7;
    }
  }
  return uVar6;
}

