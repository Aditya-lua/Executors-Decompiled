
undefined8 FUN_00535660(undefined8 param_1)

{
  int iVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x19;
  
  iVar1 = *(int *)(unaff_x19 + 2);
  *(int *)(unaff_x19 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    unaff_x19[1] = 0;
    func_0x00430048(*unaff_x19);
  }
  __Unwind_Resume(param_1);
  func_0x007a2668();
  puVar3 = (undefined8 *)func_0x0041d068();
  if (puVar3[3] != 0) {
    func_0x007a2334(&UNK_009ebb10);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5356e4);
    (*pcVar2)();
  }
  iVar1 = *(int *)(puVar3 + 2);
  *(int *)(puVar3 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    puVar3[1] = 0;
    func_0x00430048(*puVar3);
  }
  return 1;
}

