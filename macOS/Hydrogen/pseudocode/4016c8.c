
void FUN_004016c8(long param_1,long *param_2,long param_3)

{
  long lVar1;
  undefined8 uVar2;
  ushort uVar3;
  code *pcVar4;
  bool in_CY;
  long *plVar5;
  long lVar6;
  long *unaff_x19;
  ulong unaff_x20;
  long *plVar7;
  
  lVar1 = param_1;
  plVar7 = param_2;
  if (in_CY) {
    do {
      plVar7 = (long *)*param_2;
      if (plVar7 == (long *)0x0) {
        uVar2 = 0x220;
        if (param_1 != 0) {
          uVar2 = 0x280;
        }
        func_0x00187bd4(param_2,uVar2,8);
        func_0x007a23bc(&UNK_009d9668);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x4017e8);
        (*pcVar4)();
      }
      lVar1 = param_1 + 1;
      uVar3 = *(ushort *)(param_2 + 0x43);
      unaff_x20 = (ulong)uVar3;
      uVar2 = 0x220;
      if (param_1 != 0) {
        uVar2 = 0x280;
      }
      func_0x00187bd4(param_2,uVar2,8);
      param_2 = plVar7;
      param_1 = lVar1;
    } while (*(ushort *)((long)plVar7 + 0x21a) <= uVar3);
  }
  lVar6 = unaff_x20 + 1;
  if (lVar1 == 0) {
    plVar5 = plVar7;
  }
  else {
    plVar5 = plVar7 + lVar6;
    lVar6 = lVar1;
    do {
      plVar5 = (long *)plVar5[0x44];
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
    lVar6 = 0;
  }
  *(long **)(param_3 + 8) = plVar5;
  *(undefined8 *)(param_3 + 0x10) = 0;
  *(long *)(param_3 + 0x18) = lVar6;
  *unaff_x19 = (long)plVar7;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = unaff_x20;
  return;
}

