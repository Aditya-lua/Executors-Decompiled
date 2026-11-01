
undefined8 thunk_FUN_004f0928(void)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  code *pcVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined *puVar10;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auStack_7ffffffe [2147483646];
  
  _memcpy();
  *(undefined8 *)(unaff_x29 + -0x90) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x20;
  lVar7 = 0;
  lVar8 = *(long *)(unaff_x19 + 0xf0) << 4;
  uVar5 = 0xffffffffffffffff;
  plVar9 = *(long **)(unaff_x19 + 0xe8);
  do {
    if (lVar8 == 0) {
      puVar10 = (undefined *)0x0;
      goto LAB_004f09f0;
    }
    lVar2 = *plVar9;
    plVar3 = plVar9 + 1;
    uVar5 = uVar5 + 1;
    lVar7 = lVar7 + 0x20;
    lVar8 = lVar8 + -0x10;
    plVar9 = plVar9 + 2;
  } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
  if (uVar5 < *(ulong *)(unaff_x19 + 0x108)) {
    lVar7 = *(long *)(unaff_x19 + 0x100) + lVar7;
    lVar8 = *(long *)(lVar7 + -0x18);
    puVar10 = (undefined *)
              (*(long *)(lVar7 + -0x20) + (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
              );
    auVar11 = (**(code **)(lVar8 + 0x18))(puVar10);
    if (auVar11._0_8_ == 0x1414db8803bc16e0 && auVar11._8_8_ == 0x4f7557bbe08e4383) {
LAB_004f09f0:
      puVar1 = &UNK_008a7b62;
      if (puVar10 != (undefined *)0x0) {
        puVar1 = puVar10;
      }
      *(long *)(unaff_x29 + -0xe0) = unaff_x19;
      *(undefined **)(unaff_x29 + -0xd8) = puVar1;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      func_0x00525f7c(unaff_x29 + -0x78,unaff_x29 + -0xe0,8,0);
      uVar6 = func_0x0051c36c();
      func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
      return uVar6;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar5,*(ulong *)(unaff_x19 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4f0b50);
  (*pcVar4)();
}

