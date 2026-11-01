
/* WARNING: Possible PIC construction at 0x0052b76c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0052b770) */

void FUN_0052b700(long *param_1,undefined8 param_2,long param_3,undefined8 param_4,long *param_5,
                 long param_6)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  long extraout_x1;
  long *plVar6;
  long *extraout_x8;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined *puVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  long lStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 auStack_80 [24];
  long lStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  
  plVar6 = param_5;
  if (param_6 < 0) {
    uVar11 = 0;
LAB_0052b78c:
    func_0x007a1f00(uVar11,param_6,&UNK_009eaac8);
    param_3 = extraout_x1;
    param_1 = extraout_x8;
  }
  else {
    if (param_6 == 0) {
      lVar4 = 1;
    }
    else {
      uVar11 = 1;
      lVar4 = func_0x00187bd0(param_6,1);
      if (lVar4 == 0) goto LAB_0052b78c;
    }
    _memcpy(lVar4,param_5,param_6);
    lStack0000000000000008 = param_6;
    in_stack_00000010 = lVar4;
    in_stack_00000018 = param_6;
    plVar6 = &lStack0000000000000008;
  }
  lVar4 = *plVar6;
  lVar9 = plVar6[1];
  puVar10 = (undefined *)plVar6[2];
  func_0x0046b8d0(&lStack_68,lVar9,puVar10);
  if (((uint)lStack_68 & 1) != 0) {
    if (lVar4 != -0x8000000000000000) {
      lVar7 = 0;
      lVar8 = *(long *)(param_3 + 0xf0) << 4;
      uVar5 = 0xffffffffffffffff;
      plVar6 = *(long **)(param_3 + 0xe8);
      do {
        if (lVar8 == 0) {
          puVar10 = (undefined *)0x0;
          goto code_r0x0052b8b8;
        }
        lVar1 = *plVar6;
        plVar2 = plVar6 + 1;
        uVar5 = uVar5 + 1;
        lVar7 = lVar7 + 0x20;
        lVar8 = lVar8 + -0x10;
        plVar6 = plVar6 + 2;
      } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (uVar5 < *(ulong *)(param_3 + 0x108)) {
        lVar7 = *(long *)(param_3 + 0x100) + lVar7;
        lVar8 = *(long *)(lVar7 + -0x18);
        puVar10 = (undefined *)
                  (*(long *)(lVar7 + -0x20) + (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0) +
                  0x10);
        auVar12 = (**(code **)(lVar8 + 0x18))(puVar10);
        if (auVar12._0_8_ == 0x1414db8803bc16e0 && auVar12._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0052b8b8:
          puStack_60 = &UNK_008a7b62;
          if (puVar10 != (undefined *)0x0) {
            puStack_60 = puVar10;
          }
          uStack_58 = 0;
          lStack_68 = param_3;
          func_0x00525f7c(auStack_80,&lStack_68,8,0);
          lVar7 = func_0x0051ca70(param_3,auStack_80);
          if (lVar4 != 0) {
            func_0x00187bd4(lVar9,lVar4,1);
          }
          *param_1 = -0x8000000000000000;
          param_1[1] = lVar7;
          return;
        }
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      }
      else {
        func_0x007a2570(uVar5,*(ulong *)(param_3 + 0x108),&UNK_009e9b68);
      }
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x52b93c);
      (*pcVar3)();
    }
    lVar4 = lVar9;
    lVar9 = (long)puVar10;
    puVar10 = puStack_60;
  }
  *param_1 = lVar4;
  param_1[1] = lVar9;
  param_1[2] = (long)puVar10;
  return;
}

