
/* WARNING: Possible PIC construction at 0x004a98a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004a9920: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004a9924) */

void FUN_004a987c(long param_1)

{
  long lVar1;
  long lVar2;
  undefined1 in_ZR;
  long unaff_x19;
  long lVar3;
  long unaff_x23;
  long *plVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 unaff_x29;
  undefined8 uVar7;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  while (!(bool)in_ZR) {
    func_0x0048a468(param_1);
    unaff_x23 = unaff_x23 + -1;
    param_1 = param_1 + 0x18;
    in_ZR = unaff_x23 == 0;
  }
  if (*(long *)(unaff_x19 + 0x30) == 0) {
    lVar1 = *(long *)(unaff_x19 + 0x50);
    lVar2 = *(long *)(unaff_x19 + 0x58);
    if (lVar2 != 0) {
      lVar3 = 0;
      do {
        plVar4 = (long *)(lVar1 + lVar3 * 0x18);
        lVar5 = plVar4[2];
        if (lVar5 != 0) {
          puVar6 = (undefined8 *)(plVar4[1] + 8);
          do {
            if (puVar6[-1] != 0) {
              func_0x00187bd4(*puVar6,puVar6[-1],1);
            }
            puVar6 = puVar6 + 3;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        if (*plVar4 != 0) {
          uVar7 = 0x4a9924;
          goto code_r0x00187bd4;
        }
        lVar3 = lVar3 + 1;
      } while (lVar3 != lVar2);
    }
    if (*(long *)(unaff_x19 + 0x48) == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
    unaff_x29 = in_stack_00000040;
    uVar7 = in_stack_00000048;
  }
  else {
    uVar7 = 0x4a98ac;
  }
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

