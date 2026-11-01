
void FUN_0052b7a8(long *param_1,undefined8 param_2,long param_3,undefined8 param_4,long *param_5)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  ulong uVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined *puVar10;
  undefined1 auVar11 [16];
  undefined8 uStack0000000000000018;
  undefined *in_stack_00000020;
  undefined8 in_stack_00000028;
  
  lVar7 = *param_5;
  lVar8 = param_5[1];
  lVar9 = param_5[2];
  func_0x0046b8d0(&uStack0000000000000018,lVar8,lVar9);
  if ((uStack0000000000000018 & 1) != 0) {
    if (lVar7 != -0x8000000000000000) {
      lVar9 = 0;
      lVar5 = *(long *)(param_3 + 0xf0) << 4;
      uVar4 = 0xffffffffffffffff;
      plVar6 = *(long **)(param_3 + 0xe8);
      do {
        if (lVar5 == 0) {
          puVar10 = (undefined *)0x0;
          goto LAB_0052b8b8;
        }
        lVar1 = *plVar6;
        plVar2 = plVar6 + 1;
        uVar4 = uVar4 + 1;
        lVar9 = lVar9 + 0x20;
        lVar5 = lVar5 + -0x10;
        plVar6 = plVar6 + 2;
      } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (uVar4 < *(ulong *)(param_3 + 0x108)) {
        lVar9 = *(long *)(param_3 + 0x100) + lVar9;
        lVar5 = *(long *)(lVar9 + -0x18);
        puVar10 = (undefined *)
                  (*(long *)(lVar9 + -0x20) + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) +
                  0x10);
        auVar11 = (**(code **)(lVar5 + 0x18))(puVar10);
        if (auVar11._0_8_ == 0x1414db8803bc16e0 && auVar11._8_8_ == 0x4f7557bbe08e4383) {
LAB_0052b8b8:
          in_stack_00000020 = &UNK_008a7b62;
          if (puVar10 != (undefined *)0x0) {
            in_stack_00000020 = puVar10;
          }
          in_stack_00000028 = 0;
          uStack0000000000000018 = param_3;
          func_0x00525f7c(&uStack0000000000000018,8,0);
          lVar9 = func_0x0051ca70(param_3);
          if (lVar7 != 0) {
            func_0x00187bd4(lVar8,lVar7,1);
          }
          *param_1 = -0x8000000000000000;
          param_1[1] = lVar9;
          return;
        }
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      }
      else {
        func_0x007a2570(uVar4,*(ulong *)(param_3 + 0x108),&UNK_009e9b68);
      }
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x52b93c);
      (*pcVar3)();
    }
    lVar7 = lVar8;
    lVar8 = lVar9;
    lVar9 = (long)in_stack_00000020;
  }
  *param_1 = lVar7;
  param_1[1] = lVar8;
  param_1[2] = lVar9;
  return;
}

