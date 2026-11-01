
void FUN_0066f13c(void)

{
  long *plVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  long unaff_x25;
  long unaff_x27;
  undefined8 in_stack_00000008;
  undefined1 in_stack_00000010;
  undefined1 uStack000000000000001c;
  
  func_0x0066e3a8();
  plVar1 = (long *)__Znwm(0x28);
  func_0x005edf2c(plVar1,0);
  *plVar1 = unaff_x27;
  plVar1[1] = unaff_x27 + 400;
  plVar1[3] = unaff_x19;
  *(undefined1 *)(plVar1 + 4) = 0;
  func_0x0066cd18(unaff_x19 + 0x158,unaff_x25 + 0x10,plVar1);
  func_0x0066cbdc("BlockPaddingScheme",&uStack000000000000001c,1);
  puVar2 = (undefined8 *)__Znwm(0x28);
  *(undefined1 *)(puVar2 + 2) = in_stack_00000010;
  *(undefined1 *)((long)puVar2 + 0x11) = 0;
  *puVar2 = &UNK_00a0f080;
  puVar2[1] = "AuthenticatedDecryptionFilterFlags";
  *(undefined4 *)(puVar2 + 4) = unaff_w22;
  puVar2[3] = in_stack_00000008;
  plVar1 = (long *)__Znwm(0x28);
  *(undefined1 *)(plVar1 + 2) = in_stack_00000010;
  *(undefined1 *)((long)plVar1 + 0x11) = 0;
  *plVar1 = (long)&UNK_009f8b20;
  plVar1[1] = (long)"TruncatedDigestSize";
  *(undefined4 *)(plVar1 + 4) = unaff_w21;
  plVar1[3] = (long)puVar2;
  func_0x0066b7cc();
  if (plVar1 != (long *)0x0) {
    (**(code **)(*plVar1 + 8))();
  }
  return;
}

