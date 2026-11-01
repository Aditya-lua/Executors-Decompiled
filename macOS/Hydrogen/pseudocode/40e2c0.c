
void FUN_0040e2c0(long param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  long *plVar3;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000068;
  
  *(undefined8 *)(param_1 + 0x28) = 1;
  *(undefined8 *)(param_1 + 0x30) = in_x9;
  plVar3 = (long *)*unaff_x20;
  lVar2 = *plVar3;
  *plVar3 = lVar2 + 1;
  if (lVar2 < 0) {
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x40e428);
    (*pcVar1)();
  }
  if (plVar3 == (long *)0x0) {
    func_0x0040e428(unaff_x19 + 1,&uStack0000000000000068,&uStack0000000000000008);
    *unaff_x19 = 0;
  }
  else {
    unaff_x19[0xb] = unaff_x20;
    unaff_x19[10] = in_x10;
    unaff_x19[0xc] = unaff_x21;
    *unaff_x19 = plVar3;
    unaff_x19[1] = unaff_x24;
    unaff_x19[2] = unaff_x22;
    unaff_x19[3] = unaff_x23;
    unaff_x19[4] = 0;
    unaff_x19[5] = param_1;
    unaff_x19[6] = in_x10;
    unaff_x19[7] = unaff_x20;
    unaff_x19[8] = in_x10;
    unaff_x19[9] = in_x10;
  }
  return;
}

