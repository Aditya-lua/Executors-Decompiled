
undefined8 FUN_004f041c(void)

{
  undefined *puVar1;
  long *plVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  long *plVar8;
  long unaff_x20;
  undefined8 *puVar9;
  long lVar10;
  undefined *puVar11;
  undefined8 uVar12;
  ulong uVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long unaff_x29;
  undefined1 auVar20 [16];
  long in_stack_00000138;
  long in_stack_00000200;
  long in_stack_00000208;
  undefined1 auStack_7ffffffe [2147483646];
  
  lVar5 = func_0x00187bd0();
  if (lVar5 == 0) {
    func_0x007a1f00(8);
    goto LAB_004f0b4c;
  }
  _memcpy(lVar5);
  uVar14 = 0;
  uVar13 = *(ulong *)(unaff_x20 + 0x108);
  uVar15 = uVar13 * 0x20;
  if ((uVar13 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar15)) {
LAB_004f0ad4:
    func_0x007a1f00(uVar14,uVar15,&UNK_009e7fc8);
LAB_004f0b4c:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4f0b50);
    (*pcVar3)();
  }
  if (uVar15 != 0) {
    puVar9 = *(undefined8 **)(unaff_x20 + 0x100);
    uVar14 = 8;
    lVar5 = func_0x00187bd0(uVar15,8);
    if (lVar5 == 0) goto LAB_004f0ad4;
    if (uVar13 != 0) {
      puVar7 = (undefined8 *)(lVar5 + 0x10);
      do {
        if (uVar15 == 0) break;
        plVar8 = (long *)*puVar9;
        lVar5 = *plVar8;
        *plVar8 = lVar5 + 1;
        if (lVar5 < 0) goto LAB_004f0b4c;
        uVar14 = puVar9[1];
        uVar16 = puVar9[3];
        uVar12 = puVar9[2];
        puVar9 = puVar9 + 4;
        puVar7[-2] = plVar8;
        puVar7[-1] = uVar14;
        puVar7[1] = uVar16;
        *puVar7 = uVar12;
        uVar15 = uVar15 - 0x20;
        uVar13 = uVar13 - 1;
        puVar7 = puVar7 + 4;
      } while (uVar13 != 0);
    }
  }
  puVar6 = auStack_7ffffffe + 0x8000020e;
  if (in_stack_00000138 != in_stack_00000208) {
    uVar14 = 1;
LAB_004f077c:
    uVar12 = *(undefined8 *)(in_stack_00000138 + 8);
    lVar5 = *(long *)(in_stack_00000138 + 0x10);
    if (*(long *)(puVar6 + 0xc0) != 0) {
      in_stack_00000138 = in_stack_00000138 + 0x18;
      lVar18 = *(long *)(puVar6 + 0xb8);
      lVar19 = lVar18 + *(long *)(puVar6 + 0xc0) * 0x2c8;
      do {
        uVar16 = *(undefined8 *)(lVar18 + 0x230);
        lVar10 = *(long *)(lVar18 + 0x238);
        if (lVar5 == lVar10) {
          iVar4 = _memcmp(uVar12,uVar16,lVar5);
          if (iVar4 == 0) goto LAB_004f081c;
        }
        if (*(long *)(lVar18 + 0x48) != 0) {
          lVar17 = *(long *)(lVar18 + 0x48) * 0x18;
          plVar8 = (long *)(*(long *)(lVar18 + 0x40) + 8);
          do {
            if ((lVar5 == *plVar8) && (iVar4 = _memcmp(uVar12,plVar8[-1],lVar5), iVar4 == 0)) {
              lVar5 = lVar10;
              goto LAB_004f081c;
            }
            lVar17 = lVar17 + -0x18;
            plVar8 = plVar8 + 3;
          } while (lVar17 != 0);
        }
        lVar18 = lVar18 + 0x2c8;
        if (lVar18 == lVar19) break;
      } while( true );
    }
    func_0x0045b558(unaff_x29 + -0xe0,uVar12,lVar5);
    if (*(long *)(unaff_x29 + -0xe0) == -0x8000000000000000) {
      lVar5 = *(long *)(unaff_x29 + -0xd0);
      if (lVar5 < 0) {
        uVar14 = 0;
code_r0x004f0b28:
        func_0x007a1f00(uVar14,lVar5,&UNK_009e80a0);
        goto LAB_004f0b4c;
      }
      uVar12 = *(undefined8 *)(unaff_x29 + -0xd8);
      if (lVar5 == 0) {
        lVar18 = 1;
      }
      else {
        uVar14 = 1;
        lVar18 = func_0x00187bd0(lVar5,1);
        if (lVar18 == 0) goto code_r0x004f0b28;
      }
      _memcpy(lVar18,uVar12,lVar5);
      *(long *)(unaff_x29 + -0x90) = lVar5;
      *(long *)(unaff_x29 + -0x88) = lVar18;
      *(long *)(unaff_x29 + -0x80) = lVar5;
    }
    else {
      *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0xd8);
      *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0xe0);
      *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xd0);
    }
    lVar5 = 0;
    lVar18 = *(long *)(puVar6 + 0xf0) << 4;
    uVar13 = 0xffffffffffffffff;
    plVar8 = *(long **)(puVar6 + 0xe8);
    goto LAB_004f0970;
  }
LAB_004f08ec:
  func_0x00506880(unaff_x29 + -0xe0,puVar6,1);
  uVar14 = func_0x0051aec0(0xc,puVar6,unaff_x29 + -0xe0);
code_r0x004f0a2c:
  func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
  return uVar14;
LAB_004f081c:
  if (lVar5 < 0) {
    uVar14 = 0;
code_r0x004f0a78:
    func_0x007a1f00(uVar14,in_stack_00000200,&UNK_009e80a0);
    goto LAB_004f0b4c;
  }
  if (lVar5 == 0) {
    in_stack_00000200 = 1;
  }
  else {
    in_stack_00000200 = func_0x00187bd0(lVar5,1);
    if (in_stack_00000200 == 0) {
      in_stack_00000200 = lVar5;
      goto code_r0x004f0a78;
    }
    _memcpy(in_stack_00000200,uVar16,lVar5);
  }
  puVar6 = (undefined1 *)func_0x00503d08(puVar6,in_stack_00000200,lVar5);
  if (puVar6 == (undefined1 *)0x0) {
    func_0x007a23bc(&UNK_009e8188);
    goto LAB_004f0b4c;
  }
  if (lVar5 != 0) {
    func_0x00187bd4(in_stack_00000200,lVar5,1);
  }
  if (in_stack_00000138 == in_stack_00000208) goto LAB_004f08ec;
  goto LAB_004f077c;
  while( true ) {
    lVar19 = *plVar8;
    plVar2 = plVar8 + 1;
    uVar13 = uVar13 + 1;
    lVar5 = lVar5 + 0x20;
    lVar18 = lVar18 + -0x10;
    plVar8 = plVar8 + 2;
    if (lVar19 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
LAB_004f0970:
    if (lVar18 == 0) {
      puVar11 = (undefined *)0x0;
      goto LAB_004f09f0;
    }
  }
  if (*(ulong *)(puVar6 + 0x108) <= uVar13) {
    func_0x007a2570(uVar13,*(ulong *)(puVar6 + 0x108),&UNK_009e9b68);
    goto LAB_004f0b4c;
  }
  lVar18 = *(long *)(*(long *)(puVar6 + 0x100) + lVar5 + -0x18);
  puVar11 = (undefined *)
            (*(long *)(*(long *)(puVar6 + 0x100) + lVar5 + -0x20) +
             (*(long *)(lVar18 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  auVar20 = (**(code **)(lVar18 + 0x18))(puVar11);
  if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto LAB_004f0b4c;
  }
LAB_004f09f0:
  puVar1 = &UNK_008a7b62;
  if (puVar11 != (undefined *)0x0) {
    puVar1 = puVar11;
  }
  *(undefined1 **)(unaff_x29 + -0xe0) = puVar6;
  *(undefined **)(unaff_x29 + -0xd8) = puVar1;
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  func_0x00525f7c(unaff_x29 + -0x78,unaff_x29 + -0xe0,8,0);
  uVar14 = func_0x0051c36c(puVar6,unaff_x29 + -0x90,unaff_x29 + -0x78);
  goto code_r0x004f0a2c;
}

