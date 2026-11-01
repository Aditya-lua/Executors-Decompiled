
/* WARNING: Possible PIC construction at 0x001f8c9c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f8cc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f8cf8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f8d60: Changing call to branch */

void FUN_001f8c88(undefined8 param_1)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  long unaff_x22;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  undefined1 *unaff_x29;
  undefined1 auStack_d0 [128];
  undefined8 uStack_8;
  
  if (*(long *)(unaff_x22 + 8) == 0) {
    func_0x001f9808(*(undefined8 *)(unaff_x19 + 0x20),*(undefined8 *)(unaff_x19 + 0x28));
    if ((*(ulong *)(unaff_x19 + 0x2d8) | 0x8000000000000000) == 0x8000000000000000) {
      func_0x0016e8dc(unaff_x19 + 0x2f0);
      func_0x0016de34(unaff_x19 + 0x50);
      func_0x0016de34(unaff_x19 + 0x88);
      if ((*(ulong *)(unaff_x19 + 0x308) | 0x8000000000000000) == 0x8000000000000000) {
        func_0x001f8014(unaff_x19 + 0xc0);
        __Unwind_Resume(param_1);
        func_0x007a2668();
        plVar2 = (long *)func_0x007a2668();
        uStack_8 = 0x1f8d14;
        puVar1 = auStack_d0;
        if (*plVar2 == 0) {
          return;
        }
        func_0x00437c4c(plVar2 + 1);
        lVar6 = plVar2[1];
        plVar2[1] = 0;
        if (lVar6 == 0) {
          uVar8 = plVar2[6];
          if (uVar8 != 0) {
            puVar5 = (undefined8 *)plVar2[4];
            uVar4 = plVar2[3];
            uVar9 = 0;
            if (uVar4 <= (ulong)plVar2[5]) {
              uVar9 = uVar4;
            }
            lVar3 = plVar2[5] - uVar9;
            uVar9 = uVar4 - lVar3;
            lVar6 = 0;
            if (uVar9 <= uVar8) {
              lVar6 = uVar8 - uVar9;
            }
            if (uVar8 <= uVar9) {
              uVar4 = lVar3 + uVar8;
            }
            lVar10 = uVar4 - lVar3;
            if (lVar10 != 0) {
              puVar7 = puVar5 + lVar3;
              do {
                lVar3 = *(long *)*puVar7;
                *(long *)*puVar7 = lVar3 + -1;
                LORelease();
                if (lVar3 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x001f9a18(puVar7);
                }
                puVar7 = puVar7 + 1;
                lVar10 = lVar10 + -1;
              } while (lVar10 != 0);
            }
            if (uVar9 < uVar8) {
              do {
                lVar3 = *(long *)*puVar5;
                *(long *)*puVar5 = lVar3 + -1;
                LORelease();
                if (lVar3 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x001f9a18(puVar5);
                }
                puVar5 = puVar5 + 1;
                lVar6 = lVar6 + -1;
              } while (lVar6 != 0);
            }
          }
          if (plVar2[3] == 0) {
            return;
          }
        }
        else {
          func_0x00430058(lVar6);
          uStack_8 = 0x1f8d64;
          register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
          unaff_x29 = puVar1 + 0xc0;
        }
      }
      else {
        uStack_8 = 0x1f8cfc;
      }
    }
    else {
      uStack_8 = 0x1f8cc8;
    }
  }
  else {
    uStack_8 = 0x1f8ca0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

