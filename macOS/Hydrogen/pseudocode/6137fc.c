
/* WARNING: Possible PIC construction at 0x00613de0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00613de4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined ** FUN_006137fc(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  byte *pbVar2;
  bool bVar3;
  int iVar4;
  byte bVar5;
  bool bVar6;
  code *pcVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined **ppuVar10;
  ulong uVar11;
  undefined8 uVar12;
  long *plVar13;
  undefined8 *puVar14;
  long lVar15;
  uint uVar16;
  undefined1 auVar17 [16];
  undefined1 uStack0000000000000018;
  char cStack_c9;
  undefined *puStack_c8;
  long *plStack_c0;
  ulong uStack_b8;
  undefined *puStack_b0;
  undefined *puStack_a8;
  long *plStack_98;
  undefined8 uStack_90;
  ulong uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  
  uVar8 = __Unwind_Resume();
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  uVar8 = __Unwind_Resume(uVar8);
  func_0x0000a5a8(&uStack0000000000000018);
  uVar8 = __Unwind_Resume(uVar8);
  func_0x0000a5a8(&uStack0000000000000018);
  auVar17 = __Unwind_Resume(uVar8);
  plVar9 = auVar17._0_8_;
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (*(int *)((long)plVar9 + 0x9c) == (int)plVar9[0x13]) {
    plVar9 = (long *)(**(code **)(*plVar9 + 0x160))(plVar9);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
                    /* WARNING: Could not recover jumptable at 0x006138e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      ppuVar10 = (undefined **)(**(code **)(*plVar9 + 0x38))(plVar9,auVar17._8_8_,param_3,0,1);
      return ppuVar10;
    }
  }
  else {
    plVar1 = plVar9 + 6;
    puStack_c8 = &UNK_009f7578;
    plStack_c0 = plVar1;
    func_0x00698fd8(plVar1,auVar17._8_8_,param_3);
    uVar8 = uRam0000000000a33570;
    pcVar7 = _UNK_00a14d80;
    pbVar2 = (byte *)(plVar9 + 0x15);
code_r0x0061394c:
    do {
      uVar11 = func_0x00698d8c(plVar1);
      if ((uVar11 & 1) != 0) goto code_r0x00613cdc;
      iVar4 = *(int *)((long)plVar9 + 0x2c);
      if (iVar4 == 0) {
        lVar15 = func_0x00699194(plVar1,pbVar2);
        if (lVar15 == 0) goto code_r0x00613cdc;
        if ((*(byte *)((long)plVar9 + 0xa4) & 1) == 0) {
          uVar12 = func_0x005edeb8();
        }
        else {
          uVar12 = (**(code **)(*plVar9 + 0x160))(plVar9);
        }
        puStack_b0 = (undefined *)0x1;
        (**(code **)(*plVar1 + 0x118))(plVar1,uVar12,&puStack_b0,&UNK_008ba5c8,1);
        *(undefined4 *)((long)plVar9 + 0x2c) = 1;
code_r0x006139e0:
        if (((((int)plVar9[0x14] == 0) || (*pbVar2 != 0)) ||
            (lVar15 = func_0x00699394(plVar1,&cStack_c9), lVar15 == 0)) || (cStack_c9 != '\0')) {
          func_0x005edf2c(&puStack_b0,0);
          puStack_b0 = &UNK_00a14d10;
          puStack_a8 = &UNK_00a14ea0;
          uStack_88 = 0;
          uStack_90 = 0;
          uStack_78 = 0;
          uStack_80 = 0;
          uStack_70 = 0;
          plStack_98 = plVar1;
          (*pcVar7)(&puStack_b0,uVar8,0xffffffff);
          lVar15 = (**(code **)(puStack_b0 + 0xa8))(&puStack_b0,&uStack_b8);
          if (lVar15 == 0) goto code_r0x00613cdc;
          if ((char)(byte)uStack_b8 < '\0') {
            uVar16 = (byte)uStack_b8 & 0x7f;
            if ((uStack_b8 & 0x7f) == 0) {
              bVar6 = true;
            }
            else {
              uVar11 = 0;
              plVar9[0x12] = 0;
              do {
                if (uVar11 >> 0x38 != 0) goto code_r0x00613d28;
                lVar15 = (**(code **)(puStack_b0 + 0xa8))(&puStack_b0,&uStack_b8);
                if (lVar15 == 0) goto code_r0x00613cdc;
                uVar11 = uStack_b8 & 0xff | plVar9[0x12] << 8;
                plVar9[0x12] = uVar11;
                uVar16 = uVar16 - 1;
              } while (uVar16 != 0);
              bVar6 = false;
            }
          }
          else {
            bVar6 = false;
            plVar9[0x12] = uStack_b8 & 0xff;
          }
          if ((*(byte *)((long)plVar9 + 0xa4) & 1) == 0) {
            uVar12 = func_0x005edeb8();
          }
          else {
            uVar12 = (**(code **)(*plVar9 + 0x160))(plVar9);
          }
          uStack_b8 = uStack_88;
          (**(code **)(*plVar1 + 0x118))(plVar1,uVar12,&uStack_b8,&UNK_008ba5c8,1);
          bVar3 = false;
          if ((*pbVar2 & 0x20) == 0) {
            bVar3 = bVar6;
          }
          if (bVar3) {
code_r0x00613d28:
            puVar14 = (undefined8 *)___cxa_allocate_exception(0x28);
            *(undefined4 *)(puVar14 + 1) = 1;
            puVar14[2] = 0x6f63656420524542;
            puVar14[3] = 0x726f727265206564;
            *(undefined1 *)(puVar14 + 4) = 0;
            *(undefined1 *)((long)puVar14 + 0x27) = 0x10;
            *puVar14 = &UNK_009f60b8;
            ___cxa_throw(puVar14,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
            pcVar7 = (code *)SoftwareBreakpoint(1,0x613d8c);
            (*pcVar7)();
          }
          if (!bVar6) {
            *(undefined4 *)((long)plVar9 + 0x2c) = 2;
            bVar5 = *(byte *)((long)plVar9 + 0xa4);
            goto joined_r0x00613ad0;
          }
          if ((*pbVar2 >> 5 & 1) == 0) goto code_r0x00613d28;
          iVar4 = (int)plVar9[0x14] + 1;
        }
        else {
          if ((*(byte *)((long)plVar9 + 0xa4) & 1) == 0) {
            uVar12 = func_0x005edeb8();
          }
          else {
            uVar12 = (**(code **)(*plVar9 + 0x160))(plVar9);
          }
          puStack_b0 = (undefined *)0x1;
          (**(code **)(*plVar1 + 0x118))(plVar1,uVar12,&puStack_b0,&UNK_008ba5c8,1);
          iVar4 = (int)plVar9[0x14] + -1;
        }
        *(int *)(plVar9 + 0x14) = iVar4;
        *(undefined4 *)((long)plVar9 + 0x2c) = 0;
      }
      else {
        if (iVar4 == 1) goto code_r0x006139e0;
        if (iVar4 != 2) goto code_r0x0061394c;
        bVar5 = *(byte *)((long)plVar9 + 0xa4);
joined_r0x00613ad0:
        if ((bVar5 & 1) == 0) {
          uVar12 = func_0x005edeb8();
        }
        else {
          uVar12 = (**(code **)(*plVar9 + 0x160))(plVar9);
        }
        puStack_b0 = (undefined *)plVar9[0x12];
        (**(code **)(plVar9[6] + 0x118))(plVar1,uVar12,&puStack_b0,&UNK_008ba5c8,1);
        lVar15 = plVar9[0x12];
        plVar9[0x12] = lVar15 - (long)puStack_b0;
        if (lVar15 - (long)puStack_b0 == 0) {
          *(undefined4 *)((long)plVar9 + 0x2c) = 0;
          iVar4 = (int)plVar9[0x14];
        }
        else {
          if (*(int *)((long)plVar9 + 0x2c) != 0) goto code_r0x0061394c;
          iVar4 = (int)plVar9[0x14];
        }
      }
      if (iVar4 != 0) goto code_r0x0061394c;
      iVar4 = *(int *)((long)plVar9 + 0x9c) + 1;
      *(int *)((long)plVar9 + 0x9c) = iVar4;
      if ((*(byte *)((long)plVar9 + 0xa4) >> 1 & 1) != 0) {
        plVar13 = (long *)(**(code **)(*plVar9 + 0x160))(plVar9);
        (**(code **)(*plVar13 + 0x38))(plVar13,0,0,0xffffffff,1);
        iVar4 = *(int *)((long)plVar9 + 0x9c);
      }
    } while (iVar4 != (int)plVar9[0x13]);
    uVar16 = *(uint *)((long)plVar9 + 0xa4);
    if ((uVar16 >> 2 & 1) != 0) {
      plVar13 = (long *)(**(code **)(*plVar9 + 0x160))(plVar9);
      (**(code **)(*plVar13 + 0x38))(plVar13,0,0,0xffffffff,1);
      uVar16 = *(uint *)((long)plVar9 + 0xa4);
    }
    if ((uVar16 >> 3 & 1) != 0) {
      plVar13 = (long *)(**(code **)(*plVar9 + 0x160))(plVar9);
      (**(code **)(*plVar13 + 0x80))(plVar13,0xffffffff,1);
    }
    uVar8 = (**(code **)(*plVar9 + 0x160))(plVar9);
    func_0x005f134c(plVar1,uVar8,&UNK_008ba5c8,1);
code_r0x00613cdc:
    puStack_c8 = &UNK_009f7578;
    ppuVar10 = (undefined **)func_0x00698f0c(plVar1);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
      return ppuVar10;
    }
  }
  ___stack_chk_fail();
  puStack_c8 = &UNK_009f7578;
  func_0x00698f0c(plStack_c0);
  return &puStack_c8;
}

