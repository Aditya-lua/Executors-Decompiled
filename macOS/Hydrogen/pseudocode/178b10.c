
void thunk_FUN_00178cac(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  ulong *unaff_x19;
  ulong unaff_x21;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  
  iVar2 = func_0x001ef6c0(param_1,&uStack0000000000000018);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_00815823,0x37,&uStack0000000000000030,&UNK_009be610,&UNK_009be5f8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x178c08);
    (*pcVar1)();
  }
  if (unaff_x21 <= in_stack_00000010) {
    in_stack_00000010 = unaff_x21;
  }
  _memcpy();
  *unaff_x19 = in_stack_00000010;
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  return;
}

