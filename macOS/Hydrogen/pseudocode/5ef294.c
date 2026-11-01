
undefined8 * FUN_005ef294(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  uint unaff_w21;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar5 = __Unwind_Resume();
  puVar2 = auVar5._8_8_;
  puVar1 = auVar5._0_8_;
  *puVar1 = &UNK_009b2ec8;
  *(undefined4 *)(puVar1 + 1) = 0;
  if (*(char *)((long)puVar2 + 0x17) < '\0') {
    func_0x00017634(puVar1 + 2,*puVar2,puVar2[1]);
  }
  else {
    uVar4 = puVar2[1];
    uVar3 = *puVar2;
    puVar1[4] = puVar2[2];
    puVar1[3] = uVar4;
    puVar1[2] = uVar3;
  }
  *puVar1 = &UNK_009b2ea0;
  return puVar1;
}

