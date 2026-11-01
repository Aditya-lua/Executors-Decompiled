
undefined8 FUN_00656440(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  undefined4 uVar5;
  long *plVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long *plVar13;
  long *plVar14;
  ulong uVar15;
  ulong unaff_x21;
  long *plVar16;
  undefined1 auVar17 [16];
  undefined *apuStack_e8 [2];
  ulong uStack_d8;
  ulong uStack_d0;
  long lStack_c8;
  undefined *apuStack_b8 [2];
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  undefined8 uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  __ZdlPv();
  if ((unaff_x21 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar17 = __Unwind_Resume();
  plVar14 = auVar17._8_8_;
  plVar13 = auVar17._0_8_;
  plVar6 = (long *)(**(code **)(plVar13[1] + 0x30))();
  uVar7 = func_0x005f007c();
  (**(code **)(*plVar6 + 0x28))(plVar6,uVar7,0);
  plVar6 = (long *)(**(code **)(*plVar13 + 0x98))(plVar13);
  plVar16 = plVar13 + 2;
  plVar8 = (long *)(**(code **)(*plVar16 + 0x18))(plVar16);
  uVar7 = (**(code **)(*plVar8 + 0x10))();
  uVar9 = (**(code **)(*plVar16 + 0x18))(plVar16);
  plVar8 = (long *)(**(code **)(*plVar16 + 0x18))(plVar16);
  plVar8 = (long *)(**(code **)(*plVar8 + 0x10))();
  (**(code **)(*plVar8 + 0xa0))();
  uVar4 = func_0x00602288();
  uVar15 = (ulong)uVar4 + 7 >> 3;
  uStack_80 = 0xffffffffffffffff;
  uStack_78 = uVar15;
  if (uVar4 == 0) {
    lVar10 = 0;
  }
  else {
    lVar10 = func_0x006115d0(uVar15);
  }
  lStack_70 = lVar10;
  plVar8 = (long *)(**(code **)(*plVar13 + 0xa0))(plVar13);
  uVar11 = func_0x005f007c();
  lVar1 = plVar14[3];
  lVar2 = plVar14[4];
  uVar12 = (**(code **)(*plVar14 + 0xa0))(plVar14);
  auVar17 = (**(code **)(*plVar13 + 0xa8))(plVar13);
  lVar3 = plVar14[0x1d];
  plVar13 = (long *)(**(code **)(*plVar16 + 0x18))(plVar16);
  plVar13 = (long *)(**(code **)(*plVar13 + 0x10))();
  (**(code **)(*plVar13 + 0xa0))();
  uVar5 = func_0x00602288();
  (**(code **)(*plVar8 + 0x38))
            (plVar8,uVar11,lVar2,lVar1,uVar12,auVar17._0_8_,auVar17._8_8_,(char)lVar3 != '\0',lVar10
             ,uVar5);
  *(undefined1 *)(plVar14 + 0x1d) = 1;
  func_0x005fef78(apuStack_b8,lVar10,uVar15,0,1);
  func_0x005fef78(apuStack_e8,plVar14[0x10],plVar14[0xf],0,1);
  uVar7 = (**(code **)(*plVar6 + 0x18))(plVar6,uVar7,uVar9,apuStack_b8,apuStack_e8,plVar14 + 0x17);
  apuStack_e8[0] = &UNK_009f5d60;
  if (uStack_d0 <= uStack_d8) {
    uStack_d8 = uStack_d0;
  }
  if (lStack_c8 != 0) {
    if (uStack_d8 != 0) {
      do {
        *(undefined8 *)(lStack_c8 + -8 + uStack_d8 * 8) = 0;
        uStack_d8 = uStack_d8 - 1;
      } while (uStack_d8 != 0);
    }
    func_0x00611644();
  }
  apuStack_b8[0] = &UNK_009f5d60;
  if (uStack_a0 <= uStack_a8) {
    uStack_a8 = uStack_a0;
  }
  if (lStack_98 != 0) {
    if (uStack_a8 != 0) {
      do {
        *(undefined8 *)(lStack_98 + -8 + uStack_a8 * 8) = 0;
        uStack_a8 = uStack_a8 - 1;
      } while (uStack_a8 != 0);
    }
    func_0x00611644();
  }
  if (lVar10 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(lVar10 + -1 + uVar15) = 0;
        uVar15 = uVar15 - 1;
      } while (uVar15 != 0);
    }
    func_0x00611644(lVar10);
  }
  return uVar7;
}

