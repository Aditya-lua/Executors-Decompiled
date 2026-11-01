
void FUN_0066f17c(void)

{
  undefined8 *puVar1;
  long *plVar2;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  undefined8 in_stack_00000008;
  undefined1 in_stack_00000010;
  undefined1 uStack000000000000001c;
  
  func_0x0066cd18();
  func_0x0066cbdc("BlockPaddingScheme",&uStack000000000000001c,1);
  puVar1 = (undefined8 *)__Znwm(0x28);
  *(undefined1 *)(puVar1 + 2) = in_stack_00000010;
  *(undefined1 *)((long)puVar1 + 0x11) = 0;
  *puVar1 = &UNK_00a0f080;
  puVar1[1] = "AuthenticatedDecryptionFilterFlags";
  *(undefined4 *)(puVar1 + 4) = unaff_w22;
  puVar1[3] = in_stack_00000008;
  plVar2 = (long *)__Znwm(0x28);
  *(undefined1 *)(plVar2 + 2) = in_stack_00000010;
  *(undefined1 *)((long)plVar2 + 0x11) = 0;
  *plVar2 = (long)&UNK_009f8b20;
  plVar2[1] = (long)"TruncatedDigestSize";
  *(undefined4 *)(plVar2 + 4) = unaff_w21;
  plVar2[3] = (long)puVar1;
  func_0x0066b7cc();
  if (plVar2 != (long *)0x0) {
    (**(code **)(*plVar2 + 8))();
  }
  return;
}

