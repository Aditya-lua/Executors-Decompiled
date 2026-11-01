
void FUN_0056bef4(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  ulong unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x29;
  undefined1 uStack000000000000001f;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  
  _memcpy();
  *(undefined8 *)(unaff_x29 + -0x88) = unaff_x24;
  *(undefined8 *)(unaff_x29 + -0x80) = param_1;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24;
  lVar3 = unaff_x22[2];
  if (lVar3 == 0) {
    func_0x007a28bc(1,0,&UNK_009edf90);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x56bff4);
    (*pcVar2)();
  }
  unaff_x22[2] = 1;
  uStack0000000000000020 = unaff_x22[1] + 0x40;
  in_stack_00000028 = unaff_x22[1] + lVar3 * 0x40;
  func_0x0055af64(unaff_x29 + -0x70,&uStack0000000000000020,&UNK_009ee258);
  func_0x005ce9d0(&uStack0000000000000020,&uStack0000000000000058,unaff_x29 + -0x88,
                  unaff_x29 + -0x70);
  func_0x00564f24();
  unaff_x22[-1] = 0xe;
  unaff_x22[1] = in_stack_00000028;
  *unaff_x22 = uStack0000000000000020;
  unaff_x22[3] = lVar3;
  unaff_x22[2] = (long)unaff_x22;
  unaff_x22[5] = in_stack_00000048;
  unaff_x22[4] = 0;
  unaff_x22[6] = in_stack_00000050;
  uStack000000000000001f = 1;
  uVar1 = unaff_x22[-1] - 0xcU;
  if (0x14 < unaff_x22[-1] - 0xcU) {
    uVar1 = unaff_x20;
  }
  uStack0000000000000058 = &uStack000000000000001f;
                    /* WARNING: Could not recover jumptable at 0x0056bddc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0056bc94 + (ulong)*(byte *)(unaff_x25 + uVar1) * 4))();
  return;
}

