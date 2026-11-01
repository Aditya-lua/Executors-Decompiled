
ulong FUN_00687c30(code *param_1)

{
  uint uVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  int iVar5;
  ulong uVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  ulong unaff_x19;
  long *unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  long *unaff_x24;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000010;
  
  do {
    (*param_1)();
    do {
      unaff_x25 = unaff_x25 + 8;
      if (unaff_x25 - *unaff_x24 == 0x1000) {
        unaff_x24 = unaff_x24 + 1;
        unaff_x25 = *unaff_x24;
      }
      uVar1 = (int)unaff_x23 + 1;
      unaff_x23 = (ulong)uVar1;
      if ((uint)unaff_x19 == uVar1) {
        unaff_x23 = unaff_x19;
code_r0x00687c5c:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
          return unaff_x23;
        }
        ___stack_chk_fail();
        auVar10 = __Unwind_Resume();
        lVar9 = auVar10._8_8_;
        lVar8 = auVar10._0_8_;
        uVar6 = func_0x0069a364(lVar8 + 0x20,lVar9 + 0x20);
        uVar7 = *(undefined8 *)(lVar8 + 0x68);
        *(undefined8 *)(lVar8 + 0x68) = *(undefined8 *)(lVar9 + 0x68);
        *(undefined8 *)(lVar9 + 0x68) = uVar7;
        uVar7 = *(undefined8 *)(lVar8 + 0x70);
        *(undefined8 *)(lVar8 + 0x70) = *(undefined8 *)(lVar9 + 0x70);
        *(undefined8 *)(lVar9 + 0x70) = uVar7;
        uVar7 = *(undefined8 *)(lVar8 + 0x78);
        *(undefined8 *)(lVar8 + 0x78) = *(undefined8 *)(lVar9 + 0x78);
        *(undefined8 *)(lVar9 + 0x78) = uVar7;
        uVar7 = *(undefined8 *)(lVar8 + 0x80);
        uVar3 = *(undefined8 *)(lVar8 + 0x88);
        uVar4 = *(undefined8 *)(lVar9 + 0x88);
        *(undefined8 *)(lVar8 + 0x80) = *(undefined8 *)(lVar9 + 0x80);
        *(undefined8 *)(lVar8 + 0x88) = uVar4;
        *(undefined8 *)(lVar9 + 0x80) = uVar7;
        *(undefined8 *)(lVar9 + 0x88) = uVar3;
        uVar7 = *(undefined8 *)(lVar8 + 0x90);
        *(undefined8 *)(lVar8 + 0x90) = *(undefined8 *)(lVar9 + 0x90);
        *(undefined8 *)(lVar9 + 0x90) = uVar7;
        return uVar6;
      }
      plVar2 = (long *)(unaff_x22[0xe] + ((ulong)(unaff_x22[0x11] + unaff_x22[0x12]) >> 9) * 8);
      lVar9 = *plVar2;
      lVar8 = 0;
      if (unaff_x22[0xf] != unaff_x22[0xe]) {
        lVar8 = lVar9 + (unaff_x22[0x11] + unaff_x22[0x12] & 0x1ffU) * 8;
      }
      if (lVar8 == lVar9) {
        lVar8 = plVar2[-1] + 0x1000;
      }
      if (unaff_x25 == lVar8 + -8) goto code_r0x00687c5c;
      (**(code **)(uStack0000000000000010 + 0x118))(&uStack0000000000000010);
      iVar5 = (**(code **)(*unaff_x22 + 0x90))();
    } while (iVar5 == 0);
    (**(code **)(*unaff_x22 + 0x90))();
    param_1 = *(code **)(*unaff_x21 + 0x130);
  } while( true );
}

