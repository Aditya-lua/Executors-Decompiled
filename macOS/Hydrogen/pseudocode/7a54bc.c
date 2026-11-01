
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007a54bc(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long unaff_x19;
  long unaff_x21;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  
  lVar5 = in_stack_00000010;
  func_0x007a5594(param_1,param_2,0x39,1,1);
  uVar4 = _UNK_008a4692;
  uVar3 = _UNK_008a468a;
  uVar2 = _UNK_008a467a;
  puVar1 = (undefined8 *)(in_stack_00000018 + in_stack_00000020);
  puVar1[1] = _UNK_008a4682;
  *puVar1 = uVar2;
  puVar1[3] = uVar4;
  puVar1[2] = uVar3;
  uVar2 = _UNK_008a469a;
  puVar1[5] = CONCAT71(_UNK_008a46a3,UNK_008a46a2);
  puVar1[4] = uVar2;
  uVar2 = CONCAT17(UNK_008a46aa,_UNK_008a46a3);
  *(undefined8 *)((long)puVar1 + 0x31) = _UNK_008a46ab;
  *(undefined8 *)((long)puVar1 + 0x29) = uVar2;
  if (in_stack_00000010 != -0x8000000000000000) {
    in_stack_00000010 = *(long *)(unaff_x21 + 8);
    in_stack_00000018 = *(long *)(unaff_x21 + 0x10);
  }
  lVar6 = *(long *)(unaff_x19 + 0x140);
  if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x148),lVar6,1);
  }
  *(long *)(unaff_x19 + 0x140) = lVar5;
  *(long *)(unaff_x19 + 0x150) = in_stack_00000018;
  *(long *)(unaff_x19 + 0x148) = in_stack_00000010;
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)();
  return;
}

