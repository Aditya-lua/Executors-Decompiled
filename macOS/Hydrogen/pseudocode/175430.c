
/* WARNING: Possible PIC construction at 0x00175458: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f9f44: Changing call to branch */

void FUN_00175430(long param_1)

{
  undefined8 *puVar1;
  undefined1 in_ZR;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x22;
  undefined8 *unaff_x29;
  undefined *puVar5;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  long alStack_10 [2];
  
  while (!(bool)in_ZR) {
    func_0x00194828(param_1);
    unaff_x22 = unaff_x22 + -1;
    param_1 = param_1 + 8;
    in_ZR = unaff_x22 == 0;
  }
  if (*unaff_x19 != 0) {
    lVar2 = unaff_x19[1];
    lVar3 = *unaff_x19 << 3;
    puVar1 = (undefined8 *)register0x00000008;
    puVar5 = (undefined *)0x17545c;
    goto code_r0x00187bd4;
  }
  plVar4 = (long *)unaff_x19[4];
  if (plVar4 != (long *)0x0) {
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      puVar1 = &uStack0000000000000020;
      unaff_x29 = &uStack0000000000000030;
      lVar2 = unaff_x19[4];
      if (*(long *)(lVar2 + 0x10) != 0) {
        func_0x00187bd4(*(undefined8 *)(lVar2 + 0x18),*(long *)(lVar2 + 0x10) << 4,8);
      }
      plVar4 = (long *)(lVar2 + 0x28);
      if (*plVar4 != 0) {
        lVar2 = *(long *)(lVar2 + 0x30);
        lVar3 = *plVar4 << 4;
        puVar5 = &UNK_001f9f48;
code_r0x00187bd4:
        *(undefined8 **)((long)puVar1 + -0x10) = unaff_x29;
        *(undefined **)((long)puVar1 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar2,lVar3,8);
        return;
      }
      if (lVar2 != -1) {
        lVar3 = *(long *)(lVar2 + 8);
        *(long *)(lVar2 + 8) = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          lVar3 = 0x80;
          puVar1 = (undefined8 *)&uStack0000000000000040;
          unaff_x29 = uStack0000000000000030;
          puVar5 = in_stack_00000038;
          goto code_r0x00187bd4;
        }
      }
      return;
    }
  }
  return;
}

