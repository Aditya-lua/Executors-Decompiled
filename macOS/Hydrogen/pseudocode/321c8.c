
void FUN_000321c8(void)

{
  char cVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  byte bStack000000000000002f;
  
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = in_stack_00000010;
  uVar3 = unaff_x19[1];
  if (-1 < (long)in_stack_00000010) {
    uVar3 = in_stack_00000010 >> 0x38;
  }
  if (uVar3 == 0) {
    if (_uStack0000000000000028 < 0) {
      if (2 < in_stack_00000020) goto LAB_000321f0;
      puVar2 = uStack0000000000000018;
      uVar3 = in_stack_00000020;
    }
    else {
      if (2 < bStack000000000000002f) {
        return;
      }
      puVar2 = &uStack0000000000000018;
      uVar3 = (ulong)bStack000000000000002f;
    }
    (**(code **)(**(long **)(unaff_x20 + 0x10) + 0x20))
              (*(long **)(unaff_x20 + 0x10),puVar2,(long)puVar2 + uVar3);
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      __ZdlPv(*unaff_x19);
    }
    unaff_x19[1] = in_stack_00000008;
    *unaff_x19 = in_stack_00000000;
    unaff_x19[2] = in_stack_00000010;
    cVar1 = *(char *)((long)unaff_x19 + 0x17);
    if (cVar1 < '\0') {
      if ((unaff_x19[1] == 1) || (unaff_x19[1] == 0xc)) {
        if (&uStack0000000000000018 != unaff_x19) {
          func_0x00017784();
        }
      }
      else {
        *(undefined1 *)*unaff_x19 = 0;
        unaff_x19[1] = 0;
      }
    }
    else if ((cVar1 == '\x01') || (cVar1 == '\f')) {
      if (&uStack0000000000000018 != unaff_x19) {
        if ((char)bStack000000000000002f < '\0') {
          func_0x000176c0();
        }
        else {
          unaff_x19[1] = in_stack_00000020;
          *unaff_x19 = uStack0000000000000018;
          unaff_x19[2] = CONCAT17(bStack000000000000002f,uStack0000000000000028);
        }
      }
    }
    else {
      *(undefined1 *)unaff_x19 = 0;
      *(undefined1 *)((long)unaff_x19 + 0x17) = 0;
    }
  }
LAB_000321f0:
  if ((char)bStack000000000000002f < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  return;
}

