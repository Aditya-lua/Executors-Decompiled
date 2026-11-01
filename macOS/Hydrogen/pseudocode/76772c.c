
undefined8 thunk_FUN_00767734(long param_1)

{
  long lVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x21;
  long *plVar5;
  long unaff_x23;
  undefined1 uStack0000000000000004;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  
  puVar2 = (undefined1 *)(*pcRam0000000000a2b5e8)(param_1 + unaff_x23 + 1);
  if (puVar2 != (undefined1 *)0x0) {
    *puVar2 = 0x30;
    _memcpy(puVar2 + 1,&uStack0000000000000004);
    puVar2[unaff_x23 + 1] = (char)((ulong)in_stack_00000008 >> 8);
    puVar2[unaff_x23 + 2] = (char)in_stack_00000008;
    _memcpy(puVar2 + unaff_x23 + 3,in_stack_00000010,in_stack_00000008);
    lVar1 = in_stack_00000008 + unaff_x23 + 3;
    _memcpy(puVar2 + lVar1);
    plVar5 = *(long **)(unaff_x19 + 0x1b0);
    uVar3 = func_0x007841a0();
    if ((int)uVar3 != 0) goto LAB_00767648;
    func_0x0073c8fc();
    lVar1 = (lVar1 + unaff_x21) - in_stack_00000018;
    if (lVar1 == 0) {
      uVar3 = 0;
      *plVar5 = 0;
      plVar5[1] = 0;
      goto LAB_00767648;
    }
    lVar4 = func_0x0077e8e4(puVar2 + in_stack_00000018,lVar1);
    if (lVar4 != 0) {
      uVar3 = 0;
      *plVar5 = lVar4;
      plVar5[1] = lVar1;
      goto LAB_00767648;
    }
  }
  uVar3 = 0x1b;
LAB_00767648:
  (*pcRam0000000000a2b5f0)(puVar2);
  (*pcRam0000000000a2b5f0)(in_stack_00000010);
  return uVar3;
}

