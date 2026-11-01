
undefined8 FUN_004f07e4(long *param_1)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  code *pcVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  long *plVar8;
  long unaff_x19;
  long unaff_x20;
  long lVar9;
  undefined *puVar10;
  long unaff_x21;
  undefined8 uVar11;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 uVar12;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined8 in_stack_000001f8;
  long in_stack_00000200;
  long in_stack_00000208;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x004f07e4:
  while ((unaff_x21 != *param_1 || (iVar5 = _memcmp(unaff_x23,param_1[-1],unaff_x21), iVar5 != 0)))
  {
    unaff_x25 = unaff_x25 + -0x18;
    param_1 = param_1 + 3;
    if (unaff_x25 == 0) goto LAB_004f079c;
  }
  unaff_x21 = unaff_x20;
  do {
    if (unaff_x21 < 0) {
      in_stack_000001f8 = 0;
code_r0x004f0a78:
      func_0x007a1f00(in_stack_000001f8,in_stack_00000200,&UNK_009e80a0);
      goto code_r0x004f0b4c;
    }
    if (unaff_x21 == 0) {
      in_stack_00000200 = 1;
    }
    else {
      in_stack_00000200 = func_0x00187bd0(unaff_x21,1);
      if (in_stack_00000200 == 0) {
        in_stack_00000200 = unaff_x21;
        goto code_r0x004f0a78;
      }
      _memcpy(in_stack_00000200,unaff_x24,unaff_x21);
    }
    unaff_x19 = func_0x00503d08(unaff_x19,in_stack_00000200,unaff_x21);
    if (unaff_x19 == 0) {
      func_0x007a23bc(&UNK_009e8188);
      goto code_r0x004f0b4c;
    }
    if (unaff_x21 != 0) {
      func_0x00187bd4(in_stack_00000200,unaff_x21,1);
    }
    if (unaff_x22 == in_stack_00000208) {
      func_0x00506880(unaff_x29 + -0xe0,unaff_x19,1);
      uVar12 = func_0x0051aec0(0xc,unaff_x19,unaff_x29 + -0xe0);
      goto code_r0x004f0a2c;
    }
    unaff_x23 = *(undefined8 *)(unaff_x22 + 8);
    unaff_x21 = *(long *)(unaff_x22 + 0x10);
    if (*(long *)(unaff_x19 + 0xc0) == 0) {
code_r0x004f0894:
      func_0x0045b558(unaff_x29 + -0xe0,unaff_x23,unaff_x21);
      if (*(long *)(unaff_x29 + -0xe0) == -0x8000000000000000) {
        lVar9 = *(long *)(unaff_x29 + -0xd0);
        if (lVar9 < 0) {
          uVar12 = 0;
code_r0x004f0b28:
          func_0x007a1f00(uVar12,lVar9,&UNK_009e80a0);
          goto code_r0x004f0b4c;
        }
        uVar11 = *(undefined8 *)(unaff_x29 + -0xd8);
        if (lVar9 == 0) {
          lVar6 = 1;
        }
        else {
          uVar12 = 1;
          lVar6 = func_0x00187bd0(lVar9,1);
          if (lVar6 == 0) goto code_r0x004f0b28;
        }
        _memcpy(lVar6,uVar11,lVar9);
        *(long *)(unaff_x29 + -0x90) = lVar9;
        *(long *)(unaff_x29 + -0x88) = lVar6;
        *(long *)(unaff_x29 + -0x80) = lVar9;
      }
      else {
        *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0xd8);
        *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0xe0);
        *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xd0);
      }
      lVar9 = 0;
      lVar6 = *(long *)(unaff_x19 + 0xf0) << 4;
      uVar7 = 0xffffffffffffffff;
      plVar8 = *(long **)(unaff_x19 + 0xe8);
      break;
    }
    unaff_x22 = unaff_x22 + 0x18;
    unaff_x26 = *(long *)(unaff_x19 + 0xb8);
    unaff_x27 = unaff_x26 + *(long *)(unaff_x19 + 0xc0) * 0x2c8;
    while( true ) {
      unaff_x24 = *(undefined8 *)(unaff_x26 + 0x230);
      unaff_x20 = *(long *)(unaff_x26 + 0x238);
      if ((unaff_x21 == unaff_x20) && (iVar5 = _memcmp(unaff_x23,unaff_x24,unaff_x21), iVar5 == 0))
      break;
      if (*(long *)(unaff_x26 + 0x48) != 0) {
        unaff_x25 = *(long *)(unaff_x26 + 0x48) * 0x18;
        param_1 = (long *)(*(long *)(unaff_x26 + 0x40) + 8);
        goto code_r0x004f07e4;
      }
LAB_004f079c:
      unaff_x26 = unaff_x26 + 0x2c8;
      if (unaff_x26 == unaff_x27) goto code_r0x004f0894;
    }
  } while( true );
  while( true ) {
    lVar2 = *plVar8;
    plVar3 = plVar8 + 1;
    uVar7 = uVar7 + 1;
    lVar9 = lVar9 + 0x20;
    lVar6 = lVar6 + -0x10;
    plVar8 = plVar8 + 2;
    if (lVar2 == 0x1414db8803bc16e0 && *plVar3 == 0x4f7557bbe08e4383) break;
    if (lVar6 == 0) {
      puVar10 = (undefined *)0x0;
      goto code_r0x004f09f0;
    }
  }
  if (uVar7 < *(ulong *)(unaff_x19 + 0x108)) {
    lVar9 = *(long *)(unaff_x19 + 0x100) + lVar9;
    lVar6 = *(long *)(lVar9 + -0x18);
    puVar10 = (undefined *)
              (*(long *)(lVar9 + -0x20) + (*(long *)(lVar6 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
              );
    auVar13 = (**(code **)(lVar6 + 0x18))(puVar10);
    if (auVar13._0_8_ == 0x1414db8803bc16e0 && auVar13._8_8_ == 0x4f7557bbe08e4383) {
code_r0x004f09f0:
      puVar1 = &UNK_008a7b62;
      if (puVar10 != (undefined *)0x0) {
        puVar1 = puVar10;
      }
      *(long *)(unaff_x29 + -0xe0) = unaff_x19;
      *(undefined **)(unaff_x29 + -0xd8) = puVar1;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      func_0x00525f7c(unaff_x29 + -0x78,unaff_x29 + -0xe0,8,0);
      uVar12 = func_0x0051c36c(unaff_x19,unaff_x29 + -0x90,unaff_x29 + -0x78);
code_r0x004f0a2c:
      func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
      return uVar12;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar7,*(ulong *)(unaff_x19 + 0x108),&UNK_009e9b68);
  }
code_r0x004f0b4c:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4f0b50);
  (*pcVar4)();
}

