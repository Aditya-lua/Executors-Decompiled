
void FUN_006b2dd8(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined7 in_stack_00000018;
  undefined1 uStack000000000000001f;
  
  uStack000000000000001f = (undefined1)unaff_x20;
  if (unaff_x20 != 0) {
    _memmove(&uStack0000000000000008);
  }
  *(undefined1 *)((long)&uStack0000000000000008 + unaff_x20) = 0;
  lVar1 = *unaff_x19 + (ulong)*(uint *)(unaff_x19 + 3) * 0x88;
  if (*(char *)(lVar1 + 0x57) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 0x40));
  }
  *(ulong *)(lVar1 + 0x50) = CONCAT17(uStack000000000000001f,in_stack_00000018);
  *(undefined8 *)(lVar1 + 0x48) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 0x40) = uStack0000000000000008;
  return;
}

