
undefined8 FUN_0003a3fc(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x24;
  undefined4 unaff_w25;
  long unaff_x29;
  
  while( true ) {
    unaff_x20 = unaff_x20 + 1;
    func_0x006e4860();
    if (*(int *)(unaff_x24 + 0x8c) <= unaff_x20) break;
    func_0x0003ab60();
    uVar2 = func_0x006ef684();
    puVar3 = *(undefined8 **)(unaff_x19 + 8);
    *puVar3 = uVar2;
    *(undefined4 *)((long)puVar3 + 0xc) = unaff_w25;
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x006e63b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3a4a0);
    (*pcVar1)();
  }
  return 1;
}

