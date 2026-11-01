
void FUN_0020b10c(void)

{
  ulong uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined2 uVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined8 *extraout_x8;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  __Unwind_Resume();
  func_0x002087e4();
  __Unwind_Resume();
  puVar6 = (ulong *)func_0x007a2668();
  uVar5 = puVar6[3];
  uVar4 = *(undefined2 *)((long)puVar6 + 0x1a);
  uVar2 = *(undefined1 *)((long)puVar6 + 0x1c);
  uVar3 = *(undefined1 *)((long)puVar6 + 0x1d);
  uVar1 = puVar6[1];
  func_0x00256d7c(&uStack_68,uVar1,puVar6[2]);
  *(undefined1 *)((long)extraout_x8 + 0x1c) = uVar2;
  *(undefined1 *)((long)extraout_x8 + 0x1d) = uVar3;
  *(short *)(extraout_x8 + 3) = (short)uVar5;
  *(undefined2 *)((long)extraout_x8 + 0x1a) = uVar4;
  extraout_x8[1] = uStack_60;
  *extraout_x8 = uStack_68;
  extraout_x8[2] = uStack_58;
  if ((*puVar6 | 0x8000000000000000) == 0x8000000000000000) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,*puVar6,1);
  return;
}

