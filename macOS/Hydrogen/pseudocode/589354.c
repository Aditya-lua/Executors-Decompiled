
void FUN_00589354(long param_1,long param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uStack0000000000000018;
  undefined4 uStack0000000000000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  
  if ((param_1 == 0) && ((ulong)(unaff_x25 * 0x30) < 0x7ffffffffffffff9)) {
    if (unaff_x23 != 0) {
      uStack0000000000000018 = unaff_x22[1];
    }
    func_0x0079a108(&uStack0000000000000048,8,unaff_x25 * 0x30,&uStack0000000000000018);
    if (uStack0000000000000048 != 1) {
      *unaff_x22 = unaff_x25;
      unaff_x22[1] = in_stack_00000050;
      lVar3 = unaff_x22[2];
      uVar5 = unaff_x19[1];
      uVar4 = *unaff_x19;
      uVar7 = unaff_x19[3];
      uVar6 = unaff_x19[2];
      uStack0000000000000018 = unaff_x20;
      if (lVar3 == unaff_x25) {
        func_0x00582e78();
      }
      puVar2 = (undefined8 *)(unaff_x22[1] + lVar3 * 0x30);
      puVar2[3] = uVar6;
      puVar2[2] = uVar5;
      puVar2[5] = unaff_x24;
      puVar2[4] = uVar7;
      puVar2[1] = uVar4;
      *puVar2 = uStack0000000000000018;
      unaff_x22[2] = lVar3 + 1;
      *unaff_x21 = unaff_x23;
      unaff_x21[1] = 0;
      return;
    }
    param_2 = in_stack_00000050;
    param_3 = in_stack_00000058;
  }
  func_0x007a1f00(param_2,param_3,&UNK_009f0c90);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x589408);
  (*pcVar1)();
}

