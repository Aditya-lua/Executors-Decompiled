
void FUN_004c6970(long param_1)

{
  long lVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long unaff_x23;
  long lVar4;
  long lVar5;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined7 uStack0000000000000039;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  
  if (param_1 != 0) {
    lVar5 = 0;
    do {
      uStack0000000000000038 = 0;
      uStack0000000000000020 = 0;
      in_stack_00000028 = 8;
      in_stack_00000030 = 0;
      func_0x004d5990();
      lVar5 = lVar5 + 4;
    } while (param_1 * 4 != lVar5);
  }
  if (unaff_x23 != 0) {
    func_0x00187bd4();
  }
  func_0x004d3ae4(&uStack0000000000000020);
  func_0x004d5560(&uStack0000000000000058);
  lVar1 = in_stack_00000060;
  lVar5 = uStack0000000000000058;
  if (uStack0000000000000058 == -0x8000000000000000) {
    func_0x004bcba8(&uStack0000000000000058);
    func_0x007a247c(&UNK_008a253a,0x38,&UNK_009e67b0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4c6a84);
    (*pcVar2)();
  }
  lVar4 = in_stack_00000068 + 1;
  lVar3 = in_stack_00000060;
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x004caae8(lVar3);
    lVar3 = lVar3 + 0x108;
  }
  if (lVar5 != 0) {
    func_0x00187bd4(lVar1,lVar5 * 0x108,8);
  }
  unaff_x19[1] = in_stack_00000028;
  *unaff_x19 = uStack0000000000000020;
  unaff_x19[3] = CONCAT71(uStack0000000000000039,uStack0000000000000038);
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[5] = in_stack_00000048;
  unaff_x19[4] = in_stack_00000040;
  unaff_x19[6] = in_stack_00000050;
  return;
}

