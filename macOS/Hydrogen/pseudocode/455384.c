
uint FUN_00455384(undefined8 param_1)

{
  undefined *puVar1;
  undefined8 uVar2;
  uint uVar3;
  ulong uVar4;
  undefined8 *unaff_x19;
  long lVar5;
  char cStack0000000000000000;
  char cStack0000000000000001;
  long in_stack_00000008;
  
  func_0x0045470c(param_1,0x47);
  if (cStack0000000000000000 == '\x01') {
    if (unaff_x19[4] != 0) {
      puVar1 = &UNK_00890c17;
      if (cStack0000000000000001 == '\0') {
        puVar1 = &UNK_00890e30;
      }
      uVar2 = 0x19;
      if (cStack0000000000000001 == '\0') {
        uVar2 = 0x10;
      }
      uVar4 = func_0x0046adc0(puVar1,uVar2);
      if ((uVar4 & 1) != 0) goto code_r0x00455430;
    }
    uVar3 = 0;
    *unaff_x19 = 0;
    *(char *)(unaff_x19 + 1) = cStack0000000000000001;
  }
  else {
    if (unaff_x19[4] == 0) {
      uVar3 = func_0x004558d4();
      goto code_r0x004554d8;
    }
    if (in_stack_00000008 == 0) {
code_r0x004554c4:
      uVar3 = func_0x004558d4();
      *(int *)(unaff_x19 + 5) = *(int *)(unaff_x19 + 5) - (int)in_stack_00000008;
      goto code_r0x004554d8;
    }
    uVar4 = func_0x0046adc0(&UNK_00890e58,4);
    if ((uVar4 & 1) == 0) {
      lVar5 = 0;
      do {
        if (in_stack_00000008 == lVar5) {
          if ((unaff_x19[4] == 0) || (uVar4 = func_0x0046adc0(&UNK_00890c32,2), (uVar4 & 1) == 0))
          goto code_r0x004554c4;
          goto code_r0x00455430;
        }
        if (((lVar5 != 0) && (unaff_x19[4] != 0)) &&
           (uVar4 = func_0x0046adc0(&UNK_00890c34,2), (uVar4 & 1) != 0)) goto code_r0x00455430;
        *(int *)(unaff_x19 + 5) = *(int *)(unaff_x19 + 5) + 1;
        uVar4 = func_0x0045509c();
        lVar5 = lVar5 + 1;
      } while ((uVar4 & 1) == 0);
      uVar3 = 1;
      goto code_r0x004554d8;
    }
code_r0x00455430:
    uVar3 = 1;
  }
code_r0x004554d8:
  return uVar3 & 1;
}

