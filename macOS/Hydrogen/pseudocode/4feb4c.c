
void FUN_004feb4c(void)

{
  code *pcVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 *puVar3;
  long unaff_x29;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00();
  }
  else {
    _memcpy(lVar2);
    *(undefined8 *)(unaff_x29 + -0x48) = unaff_x21;
    *(long *)(unaff_x29 + -0x40) = lVar2;
    *(undefined8 *)(unaff_x29 + -0x38) = unaff_x21;
    func_0x0050cb54(&uStack0000000000000038,&uStack0000000000000050,unaff_x29 + -0x48);
    *(undefined8 *)(unaff_x20 + 0x230) = 1;
    *(undefined8 *)(unaff_x20 + 0x238) = 0;
    lVar2 = *(long *)(unaff_x20 + 0x128);
    if ((lVar2 != -0x8000000000000000) && (lVar2 != 0)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x20 + 0x130),lVar2,1);
    }
    *(undefined8 *)(unaff_x20 + 0x128) = 0x8000000000000000;
    func_0x00500054();
    if (*(long *)(unaff_x29 + -0x48) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x40),*(long *)(unaff_x29 + -0x48),1);
    }
    if (in_stack_00000048 != 0) {
      puVar3 = (undefined8 *)(in_stack_00000040 + 8);
      lVar2 = in_stack_00000048;
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (uStack0000000000000038 != 0) {
      func_0x00187bd4(in_stack_00000040,uStack0000000000000038 * 0x18,8);
    }
    if (in_stack_00000000 != -0x8000000000000000) {
      unaff_x19[1] = in_stack_00000008;
      *unaff_x19 = in_stack_00000000;
      unaff_x19[3] = in_stack_00000018;
      unaff_x19[2] = in_stack_00000010;
      unaff_x19[5] = in_stack_00000028;
      unaff_x19[4] = in_stack_00000020;
      unaff_x19[6] = in_stack_00000030;
      return;
    }
    *(long *)(unaff_x29 + -0x48) = in_stack_00000008;
    func_0x0051ad78(unaff_x29 + -0x48);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4fed14);
  (*pcVar1)();
}

