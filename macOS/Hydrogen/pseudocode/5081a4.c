
undefined8 FUN_005081a4(void)

{
  char cVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  ulong in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000060;
  
  while( true ) {
    uVar5 = unaff_x19[-3];
    cVar1 = uVar5 < unaff_x24;
    if (unaff_x24 < uVar5) {
      cVar1 = -1;
    }
    if (unaff_x24 == uVar5) {
      lVar2 = *unaff_x19;
      iVar3 = _memcmp();
      lVar2 = unaff_x27 - lVar2;
      if (iVar3 != 0) {
        lVar2 = (long)iVar3;
      }
      cVar1 = 0 < lVar2;
      if (lVar2 < 0) {
        cVar1 = -1;
      }
    }
    unaff_x19 = unaff_x19 + 4;
    unaff_x20 = unaff_x20 + -0x20;
    unaff_x25 = unaff_x25 + 1;
    if (cVar1 != '\x01') break;
    while (unaff_x20 == 0) {
      unaff_x25 = unaff_x28;
code_r0x005081f4:
      if (unaff_x26 == 0) {
        if (*(long *)(in_stack_00000010 + 8) != -0x8000000000000000) {
          func_0x00513f9c(&uStack0000000000000060,&uStack0000000000000020,in_stack_00000018);
          return 0;
        }
        unaff_x25 = in_stack_00000008;
        unaff_x23 = unaff_x22;
        goto code_r0x00508244;
      }
      unaff_x23 = *(long *)(unaff_x23 + unaff_x25 * 8 + 0x1c8);
      unaff_x26 = unaff_x26 + -1;
      unaff_x28 = (ulong)*(ushort *)(unaff_x23 + 0x1c2);
      unaff_x19 = (long *)(unaff_x23 + 0x18);
      unaff_x25 = 0xffffffffffffffff;
      unaff_x20 = unaff_x28 << 5;
    }
  }
  if (cVar1 != '\0') goto code_r0x005081f4;
  if (*(long *)(in_stack_00000010 + 8) != 0) {
    func_0x00187bd4();
  }
code_r0x00508244:
  lVar2 = unaff_x23 + unaff_x25 * 8;
  uVar4 = *(undefined8 *)(lVar2 + 0x168);
  *(undefined8 *)(lVar2 + 0x168) = in_stack_00000018;
  return uVar4;
}

