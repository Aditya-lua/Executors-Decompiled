
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_00590dc8(long param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined *puVar5;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if (param_1 != 1) {
    return;
  }
  lVar1 = *param_2;
  lVar2 = *(long *)(lVar1 + 0x10);
  if (lVar2 == -0x8000000000000000 || lVar2 == 0) {
    lVar2 = 0x28;
    uVar3 = 8;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000020;
    puVar4 = uStack0000000000000010;
    puVar5 = in_stack_00000018;
  }
  else {
    puVar4 = &uStack0000000000000010;
    lVar1 = *(long *)(lVar1 + 0x18);
    uVar3 = 1;
    puVar5 = &UNK_005d2b08;
  }
  *(undefined8 **)((long)register0x00000008 + -0x10) = puVar4;
  *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,uVar3);
  return;
}

