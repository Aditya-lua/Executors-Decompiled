
void FUN_0073444c(undefined8 param_1)

{
  int iVar1;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar2;
  long unaff_x22;
  undefined8 *unaff_x24;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000018;
  
  do {
    iVar1 = func_0x00784c74(param_1);
    if (iVar1 == 0) goto LAB_00734424;
    func_0x00732ed0();
    func_0x0074e010();
    unaff_x21 = func_0x0074e01c(&uStack0000000000000018);
    do {
      if (unaff_x21 == 0) {
        unaff_x24[1] = in_stack_00000010;
        *unaff_x24 = in_stack_00000008;
        *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) & 0xfe;
        if ((*(long *)(unaff_x20 + 0x88) != 0) &&
           ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) != 0)) {
          func_0x00779d40(*(undefined8 *)(unaff_x20 + 0x78),5);
        }
        return;
      }
      uVar2 = *(undefined8 *)(unaff_x21 + 0x20);
      unaff_x21 = func_0x0074e01c(&uStack0000000000000018);
      unaff_x22 = func_0x00740a58(uVar2);
LAB_00734424:
    } while (unaff_x22 == 0);
    param_1 = func_0x00156654(unaff_x22);
    unaff_x22 = func_0x006f4058(unaff_x22);
  } while( true );
}

