
undefined8 FUN_00082370(undefined8 param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  long unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  long lVar4;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined1 uStack0000000000000018;
  
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *in_x12;
    } while (in_x12 != unaff_x24);
  }
  lVar4 = *unaff_x21;
  *(undefined8 **)(unaff_x19 + 8) = in_x9;
  *(long *)(unaff_x19 + 0x10) = unaff_x25;
  *(undefined8 *)(unaff_x19 + 0x18) = param_1;
  if (lVar4 != 0) {
    __ZdlPv(lVar4);
  }
  *(long *)(unaff_x19 + 0x10) = unaff_x25;
  if ((unaff_x20 != 0xffffffffffffffff) && (*(char **)(unaff_x25 + -8) != (char *)0x0)) {
    uVar3 = (ulong)**(char **)(unaff_x25 + -8);
    if (uVar3 < 3) {
      uVar3 = *(ulong *)(&UNK_0080ba98 + uVar3 * 8);
    }
    else {
      uVar3 = 1;
    }
    if (uVar3 < unaff_x20) {
      uVar2 = ___cxa_allocate_exception(0x20);
      __ZNSt3__19to_stringEm();
      func_0x00083bfc(&uStack0000000000000018,"excessive array size: ");
      func_0x00082c0c(uVar2,0x198,&uStack0000000000000018,
                      *(undefined8 *)(*(long *)(unaff_x19 + 0x10) + -8));
      ___cxa_throw(uVar2,&UNK_009b9520,&DAT_0008292c);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x8246c);
      (*pcVar1)();
    }
  }
  return 1;
}

