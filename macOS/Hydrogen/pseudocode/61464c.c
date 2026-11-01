
/* WARNING: Possible PIC construction at 0x00614c78: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00614c7c) */
/* WARNING: Removing unreachable block (ram,0x00614cf0) */
/* WARNING: Removing unreachable block (ram,0x00614cf8) */
/* WARNING: Removing unreachable block (ram,0x00614d24) */
/* WARNING: Removing unreachable block (ram,0x00614d3c) */
/* WARNING: Removing unreachable block (ram,0x00614d00) */
/* WARNING: Removing unreachable block (ram,0x00614d44) */
/* WARNING: Removing unreachable block (ram,0x00614d08) */
/* WARNING: Removing unreachable block (ram,0x00614d48) */
/* WARNING: Removing unreachable block (ram,0x00614d94) */
/* WARNING: Removing unreachable block (ram,0x00614de0) */
/* WARNING: Removing unreachable block (ram,0x00614df8) */
/* WARNING: Removing unreachable block (ram,0x00614dc0) */
/* WARNING: Removing unreachable block (ram,0x00614dc8) */
/* WARNING: Removing unreachable block (ram,0x00614e00) */
/* WARNING: Removing unreachable block (ram,0x00614e18) */
/* WARNING: Removing unreachable block (ram,0x00614e20) */
/* WARNING: Removing unreachable block (ram,0x00614e2c) */
/* WARNING: Removing unreachable block (ram,0x00614e34) */
/* WARNING: Removing unreachable block (ram,0x00614e44) */
/* WARNING: Removing unreachable block (ram,0x00614e4c) */
/* WARNING: Removing unreachable block (ram,0x00614e78) */
/* WARNING: Removing unreachable block (ram,0x00614e84) */
/* WARNING: Removing unreachable block (ram,0x00614eec) */
/* WARNING: Removing unreachable block (ram,0x00614f0c) */
/* WARNING: Removing unreachable block (ram,0x00614f48) */
/* WARNING: Removing unreachable block (ram,0x00614f7c) */
/* WARNING: Removing unreachable block (ram,0x00614f90) */
/* WARNING: Removing unreachable block (ram,0x00614e8c) */
/* WARNING: Removing unreachable block (ram,0x00614e64) */
/* WARNING: Removing unreachable block (ram,0x00615028) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0061464c(code *param_1)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined8 uVar6;
  ulong uVar7;
  byte *pbVar8;
  undefined8 *puVar9;
  undefined8 extraout_x1;
  byte *pbVar10;
  uint uVar11;
  long *unaff_x19;
  undefined *unaff_x21;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined1 auVar13 [12];
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  char in_stack_00000040;
  undefined8 uStack0000000000000048;
  char in_stack_00000078;
  ulong uStack_2a0;
  char cStack_291;
  undefined *puStack_1d0;
  undefined *puStack_1c8;
  undefined4 uStack_1b8;
  undefined1 uStack_1b4;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined1 uStack_1a0;
  undefined8 uStack_198;
  undefined *puStack_190;
  undefined *puStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  long lStack_170;
  undefined *puStack_168;
  ulong uStack_158;
  undefined *puStack_150;
  undefined *puStack_148;
  long lStack_140;
  undefined **ppuStack_108;
  undefined2 uStack_100;
  undefined *puStack_f8;
  undefined *puStack_f0;
  undefined **ppuStack_b0;
  undefined2 uStack_a8;
  undefined *puStack_a0;
  undefined *puStack_98;
  long *plStack_58;
  undefined2 uStack_50;
  long lStack_48;
  
  lVar3 = (*param_1)();
  if ((lVar3 == 0) || (in_stack_00000008._7_1_ != '\0')) {
    puVar9 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar9 + 1) = 1;
    puVar9[2] = 0x6f63656420524542;
    puVar9[3] = 0x726f727265206564;
    *(undefined1 *)(puVar9 + 4) = 0;
    *(undefined1 *)((long)puVar9 + 0x27) = 0x10;
    *puVar9 = &UNK_009f60b8;
    ___cxa_throw(puVar9,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x614768);
    (*pcVar2)();
  }
  (**(code **)(*unaff_x19 + 0x50))();
  func_0x00612a40(&uStack0000000000000010);
  func_0x00612a40(unaff_x29 + -0x60);
  uStack0000000000000010 = unaff_x21;
  if (in_stack_00000040 == '\0') {
    func_0x00612a40(&uStack0000000000000010);
  }
  if (in_stack_00000078 == '\0') {
    func_0x00612a40(&uStack0000000000000048);
  }
  *(undefined **)(unaff_x29 + -0x60) = unaff_x21;
  *(undefined **)(unaff_x29 + -0x58) = unaff_x21 + 0x198;
  if (*(char *)(unaff_x29 + -0x30) == '\0') {
    func_0x00612a40(unaff_x29 + -0x60);
  }
  while( true ) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return;
    }
    auVar13 = ___stack_chk_fail();
    uVar4 = auVar13._0_8_;
    if (auVar13._8_4_ == 0) break;
    if (auVar13._8_4_ != 2) {
      uVar4 = func_0x0001753c(uVar4);
      uStack0000000000000010 = &UNK_009f6678;
      if (unaff_x21 != (undefined *)0xfffffffffffffe68) {
        __ZdlPv();
        func_0x0060ba20(&uStack0000000000000048);
        func_0x0060ba20(unaff_x29 + -0x60);
        uVar4 = __Unwind_Resume(uVar4);
        func_0x0060ba20(&uStack0000000000000048);
        func_0x0060ba20(unaff_x29 + -0x60);
        uVar4 = __Unwind_Resume(uVar4);
        func_0x0060ba20(unaff_x29 + -0x60);
        uVar4 = __Unwind_Resume(uVar4);
        break;
      }
      goto code_r0x0061486c;
    }
    ___cxa_begin_catch(uVar4);
    ___cxa_end_catch();
  }
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00612ba4(&uStack0000000000000010);
code_r0x0061486c:
  func_0x0060ba20(&uStack0000000000000048);
  func_0x0060ba20(unaff_x29 + -0x60);
  auVar12 = __Unwind_Resume(uVar4);
  plVar5 = auVar12._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x0069862c(&puStack_a0,0);
  uStack_50 = 0x30;
  puStack_a0 = &UNK_009f6108;
  puStack_98 = &UNK_009f6298;
  plStack_58 = auVar12._8_8_;
  func_0x0069862c(&puStack_f8,0);
  ppuStack_b0 = &puStack_a0;
  uStack_a8 = 0x30;
  puStack_f8 = &UNK_009f6108;
  puStack_f0 = &UNK_009f6298;
  (**(code **)(*plVar5 + 0x38))(&puStack_150,plVar5);
  func_0x00612fbc(&puStack_150,&puStack_f8);
  puStack_150 = &UNK_009f6678;
  if (puStack_148 != (undefined *)0x0) {
    lStack_140 = (long)puStack_148;
    __ZdlPv();
  }
  (**(code **)(*plVar5 + 0x48))(plVar5,&puStack_f8);
  uStack_a8 = CONCAT11(1,(undefined1)uStack_a8);
  uVar4 = func_0x00698d50(&puStack_f8);
  puStack_150 = (undefined *)CONCAT71(puStack_150._1_7_,(undefined1)uStack_a8);
  (**(code **)(*ppuStack_b0 + 0x38))(ppuStack_b0,&puStack_150,1,0,1);
  func_0x00611648(ppuStack_b0,uVar4);
  puStack_150 = (undefined *)0xffffffffffffffff;
  (**(code **)(puStack_f8 + 0x118))(&puStack_f8,ppuStack_b0,&puStack_150,&UNK_008ba5c8,1);
  func_0x0069862c(&puStack_150,0);
  puStack_150 = &UNK_009f6a68;
  puStack_148 = &UNK_009f6bf8;
  ppuStack_108 = &puStack_a0;
  uStack_100 = 3;
  uStack_158 = uStack_158 & 0xffffffffffffff00;
  func_0x00698dbc(&puStack_150,&uStack_158,1,0,1);
  (**(code **)(*plVar5 + 0x58))(plVar5,&puStack_150);
  uStack_100 = CONCAT11(1,(undefined1)uStack_100);
  uVar6 = func_0x00698d50(&puStack_150);
  uStack_158 = CONCAT71(uStack_158._1_7_,(undefined1)uStack_100);
  (**(code **)(*ppuStack_108 + 0x38))(ppuStack_108,&uStack_158,1,0,1);
  func_0x00611648(ppuStack_108,uVar6);
  uStack_158 = 0xffffffffffffffff;
  (**(code **)(puStack_150 + 0x118))(&puStack_150,ppuStack_108,&uStack_158,&UNK_008ba5c8,1);
  uStack_50 = CONCAT11(1,(undefined1)uStack_50);
  uVar6 = func_0x00698d50(&puStack_a0);
  uStack_158 = CONCAT71(uStack_158._1_7_,(undefined1)uStack_50);
  (**(code **)(*plStack_58 + 0x38))(plStack_58,&uStack_158,1,0,1);
  func_0x00611648(plStack_58,uVar6);
  uStack_158 = 0xffffffffffffffff;
  (**(code **)(puStack_a0 + 0x118))(&puStack_a0,plStack_58,&uStack_158,&UNK_008ba5c8,1);
  func_0x006143a8(&puStack_150);
  func_0x006143a8(&puStack_f8);
  func_0x006143a8(&puStack_a0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return;
  }
  uVar6 = ___stack_chk_fail();
  func_0x006143a8(&puStack_f8);
  func_0x006143a8(&puStack_a0);
  uVar6 = __Unwind_Resume(uVar6);
  func_0x006143a8(&puStack_150);
  func_0x006143a8(&puStack_f8);
  func_0x006143a8(&puStack_a0);
  __Unwind_Resume(uVar6);
  puStack_190 = &UNK_009f6298;
  puStack_188 = &UNK_009f6108;
  puStack_168 = &DAT_00614be4;
  uStack_198 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uStack_180 = uVar4;
  uStack_178 = uVar6;
  lStack_170 = (long)register0x00000008 + -0x10;
  uVar4 = func_0x005edf2c(&puStack_1d0,0);
  uStack_1b8 = 0xffffffff;
  uStack_1b4 = 0;
  puStack_1d0 = &UNK_009f68a0;
  puStack_1c8 = &UNK_009f6a38;
  uStack_1a8 = 0;
  uStack_1a0 = 0;
  uStack_1b0 = extraout_x1;
  func_0x00613e90(uVar4,0x30);
  puStack_1d0 = &UNK_009f6498;
  puStack_1c8 = &UNK_009f6630;
  lVar3 = (*_UNK_009f6540)(&puStack_1d0,&cStack_291);
  if ((((lVar3 == 0 || cStack_291 != '\x02') ||
       (uVar7 = func_0x006118e8(&puStack_1d0,&uStack_2a0), uVar1 = uStack_2a0, (uVar7 & 1) == 0)) ||
      (uVar7 = (**(code **)(puStack_1d0 + 0x98))(&puStack_1d0), uVar7 < uVar1)) || (uVar1 == 0)) {
    puVar9 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar9 + 1) = 1;
    puVar9[2] = 0x6f63656420524542;
    puVar9[3] = 0x726f727265206564;
    *(undefined1 *)(puVar9 + 4) = 0;
    *(undefined1 *)((long)puVar9 + 0x27) = 0x10;
    *puVar9 = &UNK_009f60b8;
    ___cxa_throw(puVar9,&UNK_009f6090,&DAT_0060f08c);
  }
  else {
    if (uVar1 == 0) {
      pbVar8 = (byte *)0x0;
    }
    else {
      pbVar8 = (byte *)func_0x006115d0(uVar1);
    }
    uVar7 = (**(code **)(puStack_1d0 + 0xb0))(&puStack_1d0,pbVar8,uVar1);
    if (uVar1 == uVar7) {
      if (uVar1 < 5) {
        pbVar10 = pbVar8;
        uVar7 = uVar1;
        if (uVar1 == 0) goto LAB_006150f8;
      }
      else {
        pbVar10 = pbVar8;
        uVar7 = uVar1;
        do {
          if (*pbVar10 != 0) goto LAB_00615140;
          uVar7 = uVar7 - 1;
          pbVar10 = pbVar10 + 1;
        } while (4 < uVar7);
        uStack_2a0 = 4;
        pbVar10 = pbVar8 + (uVar1 - 4);
        uVar7 = 4;
      }
      uVar11 = 0;
      do {
        uVar11 = (uint)*pbVar10 | uVar11 << 8;
        uVar7 = uVar7 - 1;
        pbVar10 = pbVar10 + 1;
      } while (uVar7 != 0);
      if (uVar11 == 0) {
LAB_006150f8:
        if (pbVar8 != (byte *)0x0) {
          for (; uVar1 != 0; uVar1 = uVar1 - 1) {
            pbVar8[uVar1 - 1] = 0;
          }
          func_0x00611644(pbVar8);
        }
        return;
      }
LAB_00615140:
      puVar9 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar9 + 1) = 1;
      puVar9[2] = 0x6f63656420524542;
      puVar9[3] = 0x726f727265206564;
      *(undefined1 *)(puVar9 + 4) = 0;
      *(undefined1 *)((long)puVar9 + 0x27) = 0x10;
      *puVar9 = &UNK_009f60b8;
      ___cxa_throw(puVar9,&UNK_009f6090,&DAT_0060f08c);
      goto code_r0x00615264;
    }
  }
  puVar9 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar9 + 1) = 1;
  puVar9[2] = 0x6f63656420524542;
  puVar9[3] = 0x726f727265206564;
  *(undefined1 *)(puVar9 + 4) = 0;
  *(undefined1 *)((long)puVar9 + 0x27) = 0x10;
  *puVar9 = &UNK_009f60b8;
  ___cxa_throw(puVar9,&UNK_009f6090,&DAT_0060f08c);
code_r0x00615264:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x615268);
  (*pcVar2)();
}

