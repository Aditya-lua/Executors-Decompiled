
void FUN_0052dc08(undefined2 *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 *unaff_x19;
  undefined8 *puVar3;
  long unaff_x21;
  long unaff_x23;
  long in_stack_00000008;
  
  if (param_1 == (undefined2 *)0x0) {
    func_0x007a1f00(1,3,&UNK_009eaac8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x52dd0c);
    (*pcVar1)();
  }
  *(undefined1 *)(param_1 + 1) = 0x2e;
  *param_1 = 0x2e2e;
  uVar2 = func_0x0051ba54();
  *(undefined8 *)(unaff_x19 + 8) = uVar2;
  *unaff_x19 = 1;
  if (unaff_x23 != 0) {
    puVar3 = (undefined8 *)(unaff_x21 + 8);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 3;
      unaff_x23 = unaff_x23 + -1;
    } while (unaff_x23 != 0);
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4();
  }
  return;
}

