
void FUN_004ded5c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 *puStack0000000000000038;
  undefined *puStack0000000000000040;
  
  puStack0000000000000038 = &uStack0000000000000020;
  uStack0000000000000030 = 0;
  puStack0000000000000040 = &UNK_009e7f30;
  iVar2 = func_0x0050f9f0();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008a34d0,0x37);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4dede8);
    (*pcVar1)();
  }
  unaff_x19[1] = in_stack_00000028;
  *unaff_x19 = uStack0000000000000020;
  unaff_x19[2] = uStack0000000000000030;
  return;
}

