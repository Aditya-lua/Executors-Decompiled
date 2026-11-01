
undefined8 FUN_00478798(void)

{
  uint uVar1;
  undefined8 uVar2;
  int iVar3;
  uint in_w8;
  uint in_w9;
  ulong in_x10;
  ulong uVar4;
  code *pcVar5;
  byte unaff_w24;
  undefined8 *in_stack_00000020;
  undefined1 uStack0000000000000044;
  
  uVar1 = in_w9;
  if (in_w9 <= in_w8) {
    uVar1 = in_w8;
  }
  if (in_w9 < in_w8) {
    uVar4 = in_x10 & 0xff;
    uVar2 = *in_stack_00000020;
    pcVar5 = *(code **)(in_stack_00000020[1] + 0x20);
    do {
      iVar3 = (*pcVar5)(uVar2,(&uStack0000000000000044)[uVar4]);
      if (iVar3 != 0) {
        if (uVar4 < unaff_w24) {
          return 1;
        }
        return 0;
      }
      uVar4 = uVar4 + 1;
    } while (uVar1 != uVar4);
  }
  return 0;
}

