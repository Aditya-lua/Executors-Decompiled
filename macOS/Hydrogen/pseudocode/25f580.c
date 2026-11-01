
/* WARNING: Possible PIC construction at 0x0025f4b0: Changing call to branch */

void FUN_0025f580(undefined8 param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 in_w9;
  ulong in_x10;
  ulong in_x12;
  long *unaff_x19;
  long lVar4;
  undefined8 *puVar5;
  ulong *unaff_x24;
  undefined8 unaff_x29;
  undefined *puVar6;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  undefined8 in_stack_00000130;
  undefined *in_stack_00000138;
  undefined1 uStack0000000000000140;
  
  *unaff_x24 = in_x10 & 0xffffffffffff | 0x8000000000000000;
  *(undefined1 *)(unaff_x24 + 1) = in_w9;
  *(int *)((long)unaff_x24 + 9) = (int)param_1;
  *(char *)((long)unaff_x24 + 0xf) = (char)((ulong)param_1 >> 0x30);
  *(short *)((long)unaff_x24 + 0xd) = (short)((ulong)param_1 >> 0x20);
  unaff_x24[2] = in_x12;
  unaff_x24[4] = in_stack_00000038;
  unaff_x24[3] = in_stack_00000030;
  unaff_x24[6] = in_stack_00000048;
  unaff_x24[5] = in_stack_00000040;
  lVar4 = *unaff_x19;
  if (param_3 + 0x22 < lVar4) {
    if ((*(byte *)(unaff_x19 + 3) & 1) == 0) {
      lVar2 = unaff_x19[4];
      if ((lVar2 != -0x8000000000000000) && (lVar2 != 0)) {
        lVar1 = unaff_x19[5];
        uVar3 = 1;
        puVar6 = &UNK_0025f4b4;
        goto code_r0x00187bd4;
      }
    }
    lVar1 = unaff_x19[1];
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      puVar5 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar5[-1] != 0) {
          func_0x00187bd4(*puVar5,puVar5[-1],1);
        }
        puVar5 = puVar5 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (lVar4 != 0) {
      lVar2 = lVar4 * 0x18;
      uVar3 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000140;
      unaff_x29 = in_stack_00000130;
      puVar6 = in_stack_00000138;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar1,lVar2,uVar3);
      return;
    }
  }
  return;
}

