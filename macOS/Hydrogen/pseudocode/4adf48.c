
/* WARNING: Possible PIC construction at 0x004adfcc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004adfd0) */

void FUN_004adf48(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar7;
  undefined8 *puVar6;
  undefined8 unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined1 uStack0000000000000090;
  
  puVar6 = unaff_x19;
  do {
    puVar7 = puVar6 + 1;
    if (*(long *)*puVar6 == -0x7ffffffffffffffe) {
      func_0x005cf324(&uStack0000000000000018,(long *)*puVar6 + 1);
      lVar2 = in_stack_00000020;
      lVar1 = uStack0000000000000018;
      lVar5 = in_stack_00000028 * 8;
      for (lVar3 = 0; lVar5 != lVar3; lVar3 = lVar3 + 8) {
        uVar4 = *(undefined8 *)(lVar2 + lVar3);
        func_0x004aff18();
        func_0x004af888(uVar4);
      }
      if (lVar1 != 0) {
        uVar4 = 0x4adfd0;
        goto code_r0x00187bd4;
      }
    }
    puVar6 = puVar7;
    if (puVar7 == unaff_x19 + param_1) {
      if (in_stack_00000010 != 0) {
        func_0x00187bd4();
      }
      func_0x005d8830(&uStack0000000000000018,in_stack_00000008);
      lVar2 = in_stack_00000020;
      lVar1 = uStack0000000000000018;
      lVar5 = in_stack_00000028 * 8;
      for (lVar3 = 0; lVar5 != lVar3; lVar3 = lVar3 + 8) {
        uVar4 = *(undefined8 *)(lVar2 + lVar3);
        func_0x004aff18();
        func_0x004af888(uVar4);
      }
      if (lVar1 == 0) {
        return;
      }
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000090;
      unaff_x29 = in_stack_00000080;
      uVar4 = in_stack_00000088;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar2,lVar1 << 3,8);
      return;
    }
  } while( true );
}

