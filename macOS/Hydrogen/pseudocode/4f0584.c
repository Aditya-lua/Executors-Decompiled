
undefined8 FUN_004f0584(void)

{
  undefined *puVar1;
  long *plVar2;
  code *pcVar3;
  int iVar4;
  undefined1 *puVar5;
  ulong uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  undefined *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long unaff_x29;
  undefined1 auVar16 [16];
  long in_stack_00000138;
  undefined8 uVar17;
  long in_stack_00000200;
  long in_stack_00000208;
  undefined1 auStack_7ffffffe [2147483646];
  
  puVar5 = auStack_7ffffffe + 0x8000020e;
  if (in_stack_00000138 != in_stack_00000208) {
    uVar17 = 1;
LAB_004f077c:
    uVar11 = *(undefined8 *)(in_stack_00000138 + 8);
    lVar9 = *(long *)(in_stack_00000138 + 0x10);
    if (*(long *)(puVar5 + 0xc0) != 0) {
      in_stack_00000138 = in_stack_00000138 + 0x18;
      lVar14 = *(long *)(puVar5 + 0xb8);
      lVar15 = lVar14 + *(long *)(puVar5 + 0xc0) * 0x2c8;
      do {
        uVar12 = *(undefined8 *)(lVar14 + 0x230);
        lVar8 = *(long *)(lVar14 + 0x238);
        if (lVar9 == lVar8) {
          iVar4 = _memcmp(uVar11,uVar12,lVar9);
          if (iVar4 == 0) goto LAB_004f081c;
        }
        if (*(long *)(lVar14 + 0x48) != 0) {
          lVar13 = *(long *)(lVar14 + 0x48) * 0x18;
          plVar7 = (long *)(*(long *)(lVar14 + 0x40) + 8);
          do {
            if ((lVar9 == *plVar7) && (iVar4 = _memcmp(uVar11,plVar7[-1],lVar9), iVar4 == 0)) {
              lVar9 = lVar8;
              goto LAB_004f081c;
            }
            lVar13 = lVar13 + -0x18;
            plVar7 = plVar7 + 3;
          } while (lVar13 != 0);
        }
        lVar14 = lVar14 + 0x2c8;
        if (lVar14 == lVar15) break;
      } while( true );
    }
    func_0x0045b558(unaff_x29 + -0xe0,uVar11,lVar9);
    if (*(long *)(unaff_x29 + -0xe0) == -0x8000000000000000) {
      lVar9 = *(long *)(unaff_x29 + -0xd0);
      if (lVar9 < 0) {
        uVar17 = 0;
code_r0x004f0b28:
        func_0x007a1f00(uVar17,lVar9,&UNK_009e80a0);
        goto LAB_004f0b4c;
      }
      uVar11 = *(undefined8 *)(unaff_x29 + -0xd8);
      if (lVar9 == 0) {
        lVar14 = 1;
      }
      else {
        uVar17 = 1;
        lVar14 = func_0x00187bd0(lVar9,1);
        if (lVar14 == 0) goto code_r0x004f0b28;
      }
      _memcpy(lVar14,uVar11,lVar9);
      *(long *)(unaff_x29 + -0x90) = lVar9;
      *(long *)(unaff_x29 + -0x88) = lVar14;
      *(long *)(unaff_x29 + -0x80) = lVar9;
    }
    else {
      *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0xd8);
      *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0xe0);
      *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xd0);
    }
    lVar9 = 0;
    lVar14 = *(long *)(puVar5 + 0xf0) << 4;
    uVar6 = 0xffffffffffffffff;
    plVar7 = *(long **)(puVar5 + 0xe8);
    goto LAB_004f0970;
  }
LAB_004f08ec:
  func_0x00506880(unaff_x29 + -0xe0,puVar5,1);
  uVar17 = func_0x0051aec0(0xc,puVar5,unaff_x29 + -0xe0);
code_r0x004f0a2c:
  func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
  return uVar17;
LAB_004f081c:
  if (lVar9 < 0) {
    uVar17 = 0;
code_r0x004f0a78:
    func_0x007a1f00(uVar17,in_stack_00000200,&UNK_009e80a0);
    goto LAB_004f0b4c;
  }
  if (lVar9 == 0) {
    in_stack_00000200 = 1;
  }
  else {
    in_stack_00000200 = func_0x00187bd0(lVar9,1);
    if (in_stack_00000200 == 0) {
      in_stack_00000200 = lVar9;
      goto code_r0x004f0a78;
    }
    _memcpy(in_stack_00000200,uVar12,lVar9);
  }
  puVar5 = (undefined1 *)func_0x00503d08(puVar5,in_stack_00000200,lVar9);
  if (puVar5 == (undefined1 *)0x0) {
    func_0x007a23bc(&UNK_009e8188);
    goto LAB_004f0b4c;
  }
  if (lVar9 != 0) {
    func_0x00187bd4(in_stack_00000200,lVar9,1);
  }
  if (in_stack_00000138 == in_stack_00000208) goto LAB_004f08ec;
  goto LAB_004f077c;
  while( true ) {
    lVar15 = *plVar7;
    plVar2 = plVar7 + 1;
    uVar6 = uVar6 + 1;
    lVar9 = lVar9 + 0x20;
    lVar14 = lVar14 + -0x10;
    plVar7 = plVar7 + 2;
    if (lVar15 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
LAB_004f0970:
    if (lVar14 == 0) {
      puVar10 = (undefined *)0x0;
      goto LAB_004f09f0;
    }
  }
  if (uVar6 < *(ulong *)(puVar5 + 0x108)) {
    lVar14 = *(long *)(*(long *)(puVar5 + 0x100) + lVar9 + -0x18);
    puVar10 = (undefined *)
              (*(long *)(*(long *)(puVar5 + 0x100) + lVar9 + -0x20) +
               (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    auVar16 = (**(code **)(lVar14 + 0x18))(puVar10);
    if (auVar16._0_8_ == 0x1414db8803bc16e0 && auVar16._8_8_ == 0x4f7557bbe08e4383) {
LAB_004f09f0:
      puVar1 = &UNK_008a7b62;
      if (puVar10 != (undefined *)0x0) {
        puVar1 = puVar10;
      }
      *(undefined1 **)(unaff_x29 + -0xe0) = puVar5;
      *(undefined **)(unaff_x29 + -0xd8) = puVar1;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      func_0x00525f7c(unaff_x29 + -0x78,unaff_x29 + -0xe0,8,0);
      uVar17 = func_0x0051c36c(puVar5,unaff_x29 + -0x90,unaff_x29 + -0x78);
      goto code_r0x004f0a2c;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar6,*(ulong *)(puVar5 + 0x108),&UNK_009e9b68);
  }
LAB_004f0b4c:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4f0b50);
  (*pcVar3)();
}

