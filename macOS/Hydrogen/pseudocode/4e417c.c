
void FUN_004e417c(void)

{
  long lVar1;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x29;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_00000100;
  ulong in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  ulong in_stack_00000128;
  ulong in_stack_00000130;
  undefined8 in_stack_00000148;
  undefined8 *in_stack_00000150;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000238;
  undefined8 in_stack_00000240;
  ulong in_stack_00000248;
  ulong in_stack_00000250;
  undefined8 in_stack_000002c0;
  undefined8 in_stack_000002c8;
  undefined8 in_stack_000002d0;
  long in_stack_000002d8;
  long in_stack_000002e0;
  
  do {
    lVar1 = in_stack_000002e0;
    while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
      func_0x004df40c(lVar1);
      lVar1 = lVar1 + 600;
    }
    if (in_stack_000002d8 != 0) {
      func_0x00187bd4(in_stack_000002e0,in_stack_000002d8 * 600,8);
    }
    __Unwind_Resume(unaff_x21);
    if (in_stack_00000150[1] != 0) {
      func_0x00187bd4(in_stack_00000148,in_stack_00000150[1],in_stack_00000150[2]);
    }
    unaff_x21 = func_0x007a2668();
    if ((in_stack_00000108 & 0x100000000) == 0) {
      func_0x00187bd4(in_stack_000002c0,in_stack_000000f0,8);
    }
    if ((in_stack_00000128 & 1) == 0) {
      func_0x00187bd4(in_stack_000002c8,in_stack_00000100,8);
    }
    if ((in_stack_00000128 & 0x100000000) == 0) {
      func_0x00187bd4(in_stack_000002d0,in_stack_00000110,8);
    }
    if ((in_stack_00000130 & 1) == 0) {
      func_0x00187bd4(in_stack_00000238,in_stack_00000120,8);
    }
    if ((in_stack_00000130 & 0x100000000) == 0) {
      func_0x00187bd4(in_stack_00000240,in_stack_00000118,8);
    }
    if ((3 < in_stack_00000248) && (in_stack_00000248 != 5)) {
      if ((code *)*in_stack_00000150 != (code *)0x0) {
        (*(code *)*in_stack_00000150)(in_stack_00000148);
      }
      if (in_stack_00000150[1] != 0) {
        func_0x00187bd4(in_stack_00000148,in_stack_00000150[1],in_stack_00000150[2]);
      }
    }
    if ((in_stack_00000250 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(in_stack_00000168,in_stack_00000250,1);
    }
    lVar1 = *(long *)(unaff_x29 + -0xb8);
    if ((lVar1 != -0x8000000000000000) && (lVar1 != 0)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb0),lVar1,1);
    }
  } while( true );
}

