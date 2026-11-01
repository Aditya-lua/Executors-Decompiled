
void FUN_0016309c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 in_stack_00000008;
  undefined1 in_stack_00000010;
  undefined8 in_stack_00000020;
  undefined1 uStack000000000000002a;
  undefined1 uStack000000000000002c;
  
  uStack000000000000002c = in_stack_00000010;
  uStack000000000000002a = in_stack_00000008;
  puVar2 = (undefined8 *)func_0x00187bd0(0x38,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x38);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x16311c);
    (*pcVar1)();
  }
  *puVar2 = unaff_x26;
  puVar2[1] = unaff_x27;
  puVar2[2] = unaff_x25;
  puVar2[3] = unaff_x23;
  puVar2[4] = unaff_x22;
  puVar2[5] = unaff_x24;
  puVar2[6] = unaff_x20;
  unaff_x21[2] = unaff_x19;
  unaff_x21[3] = unaff_x28;
  unaff_x21[4] = puVar2;
  unaff_x21[5] = &UNK_009bda50;
  *unaff_x21 = 0x8000000000000027;
  unaff_x21[1] = in_stack_00000020;
  return;
}

