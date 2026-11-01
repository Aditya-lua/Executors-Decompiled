
void FUN_005ea8b8(ulong param_1,undefined8 param_2)

{
  bool bVar1;
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar7;
  long *plVar8;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  
  if ((param_1 & in_x9) != 0) {
    func_0x00187bd4(param_2,param_1 & in_x9);
  }
  if (unaff_x21 == unaff_x20) {
    lVar7 = 1;
  }
  else {
    lVar7 = 1;
    do {
      plVar8 = (long *)(unaff_x22 + unaff_x21 * 0x18);
      if ((int)*plVar8 == 1) {
        plVar6 = (long *)plVar8[1];
        if (plVar6 != (long *)0xffffffffffffffff) {
          lVar4 = *plVar6;
          do {
            if (lVar4 == 0) goto LAB_005ea9a0;
            if (lVar4 < 0) {
              func_0x007b1070(&UNK_009f3bc0,&UNK_009f3be8);
                    /* WARNING: Does not return */
              pcVar3 = (code *)SoftwareBreakpoint(1,0x5eaa34);
              (*pcVar3)();
            }
            lVar5 = lVar4 + 1;
            bVar1 = *plVar6 != lVar4;
            lVar4 = *plVar6;
          } while (bVar1);
          *plVar6 = lVar5;
          in_stack_00000018 = plVar8[2];
          lVar4 = *plVar6;
          *plVar6 = lVar4 + -1;
          LORelease();
          uStack0000000000000010 = plVar6;
          if (lVar4 == 1) {
            DataMemoryBarrier(2,1);
            func_0x005e80f0(&uStack0000000000000010);
          }
          goto LAB_005ea910;
        }
LAB_005ea9a0:
        lVar7 = lVar7 + 1;
        if ((*plVar8 != 0) && (lVar4 = plVar8[1], lVar4 != -1)) {
          lVar5 = *(long *)(lVar4 + 8);
          *(long *)(lVar4 + 8) = lVar5 + -1;
          LORelease();
          if (lVar5 == 1) {
            DataMemoryBarrier(2,1);
            uVar2 = *(ulong *)(plVar8[2] + 0x10);
            if (uVar2 < 9) {
              uVar2 = 8;
            }
            uVar2 = *(long *)(plVar8[2] + 8) + uVar2 + 0xf & -uVar2;
            if (uVar2 != 0) {
              func_0x00187bd4(lVar4,uVar2);
            }
          }
        }
      }
      else {
LAB_005ea910:
        unaff_x22 = *(long *)(unaff_x19 + 8);
        plVar6 = (long *)(unaff_x22 + (unaff_x21 - lVar7) * 0x18);
        lVar4 = plVar8[2];
        lVar5 = *plVar8;
        plVar6[1] = plVar8[1];
        *plVar6 = lVar5;
        plVar6[2] = lVar4;
      }
      unaff_x21 = unaff_x21 + 1;
    } while (unaff_x21 != unaff_x20);
  }
  *(long *)(unaff_x19 + 0x10) = unaff_x20 - lVar7;
  return;
}

