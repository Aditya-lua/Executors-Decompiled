
void FUN_0064fee4(undefined8 param_1,ulong param_2)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  long *unaff_x19;
  long lVar4;
  long lVar5;
  
  if (0x333333333333333 < param_2) {
    func_0x00017f90();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x64ff84);
    (*pcVar2)();
  }
  lVar4 = param_2 * 0x50;
  lVar3 = __Znwm(lVar4);
  lVar5 = 0;
  *unaff_x19 = lVar3;
  unaff_x19[1] = lVar3;
  unaff_x19[2] = lVar3 + lVar4;
  do {
    puVar1 = (undefined8 *)(lVar3 + lVar5);
    *puVar1 = &UNK_00a09a70;
    func_0x00675af8(puVar1 + 1);
    func_0x00675af8(puVar1 + 5);
    *(undefined1 *)(lVar3 + lVar5 + 0x48) = 1;
    lVar5 = lVar5 + 0x50;
  } while (lVar4 != lVar5);
  unaff_x19[1] = lVar3 + lVar4;
  return;
}

