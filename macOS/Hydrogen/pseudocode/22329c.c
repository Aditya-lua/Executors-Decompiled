
/* WARNING: Possible PIC construction at 0x0022330c: Changing call to branch */

void FUN_0022329c(long param_1,long *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long in_x9;
  undefined8 unaff_x29;
  undefined8 uVar5;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (param_1 != in_x9) {
    if (param_1 == -0x7fffffffffffffff) {
      param_2 = param_2 + 1;
      lVar3 = *param_2;
      unaff_x29 = in_stack_00000020;
      uVar5 = in_stack_00000028;
    }
    else {
      lVar2 = *(long *)param_2[3];
      *(long *)param_2[3] = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f8c();
      }
      lVar2 = param_2[4];
      puVar1 = (undefined8 *)param_2[5];
      if ((code *)*puVar1 != (code *)0x0) {
        (*(code *)*puVar1)(lVar2);
      }
      lVar3 = puVar1[1];
      if (lVar3 != 0) {
        uVar4 = puVar1[2];
        uVar5 = 0x223310;
        goto code_r0x00187bd4;
      }
      lVar3 = *param_2;
      unaff_x29 = in_stack_00000020;
      uVar5 = in_stack_00000028;
    }
    if ((lVar3 != -0x8000000000000000) && (lVar3 != 0)) {
      lVar2 = param_2[1];
      uVar4 = 1;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      in_stack_00000020 = unaff_x29;
      in_stack_00000028 = uVar5;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar2,lVar3,uVar4);
      return;
    }
  }
  return;
}

