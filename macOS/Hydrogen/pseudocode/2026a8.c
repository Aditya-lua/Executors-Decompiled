
/* WARNING: Possible PIC construction at 0x002026e8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002026ec) */

void FUN_002026a8(long *param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  lVar1 = param_1[2];
  if (lVar1 != 0) {
    plVar3 = (long *)(param_1[1] + 8);
    do {
      lVar2 = plVar3[-1];
      if (lVar2 != -0x8000000000000000 && lVar2 != 0) {
        lVar1 = *plVar3;
        puVar4 = &uStack0000000000000030;
        uVar5 = 0x2026ec;
        goto code_r0x00187bd4;
      }
      plVar3 = plVar3 + 3;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  if (*param_1 != 0) {
    func_0x00187bd4(param_1[1],*param_1 * 0x18,8);
  }
  lVar1 = *(long *)param_1[6];
  *(long *)param_1[6] = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964();
  }
  lVar2 = param_1[3];
  if (lVar2 == -0x8000000000000000 || lVar2 == 0) {
    return;
  }
  lVar1 = param_1[4];
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  puVar4 = uStack0000000000000030;
  uVar5 = in_stack_00000038;
code_r0x00187bd4:
  *(undefined8 **)((long)register0x00000008 + -0x10) = puVar4;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,1);
  return;
}

