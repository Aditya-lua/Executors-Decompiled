
ulong FUN_007152dc(long *param_1)

{
  uint uVar1;
  undefined1 in_ZR;
  bool bVar2;
  int *piVar3;
  long extraout_x8;
  undefined8 extraout_x9;
  long lVar4;
  long in_x9;
  long *in_stack_00000048;
  long in_stack_00000050;
  long *in_stack_00000060;
  long in_stack_00000068;
  long *in_stack_00000078;
  long in_stack_00000080;
  
code_r0x007152dc:
  if (!(bool)in_ZR) {
code_r0x007152e0:
    param_1[1] = in_x9;
    piVar3 = (int *)__Unwind_Resume();
    uVar1 = *piVar3 - 0x10e;
    bVar2 = uVar1 < 8;
    if (!bVar2) {
      uVar1 = 0;
    }
    return (ulong)CONCAT14(bVar2,uVar1);
  }
  do {
    __Unwind_Resume();
    *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
    lVar4 = *in_stack_00000048 + in_stack_00000050 * 8;
    param_1 = in_stack_00000078;
    if (lVar4 == in_stack_00000048[1]) {
      lVar4 = *in_stack_00000060 + in_stack_00000068 * 8;
      if (lVar4 != in_stack_00000060[1]) break;
    }
    else {
      in_stack_00000048[1] = lVar4;
      lVar4 = *in_stack_00000060 + in_stack_00000068 * 8;
      if (lVar4 != in_stack_00000060[1]) break;
    }
    in_x9 = *in_stack_00000078 + in_stack_00000080 * 8;
    if (in_x9 != in_stack_00000078[1]) goto code_r0x007152e0;
  } while( true );
  in_stack_00000060[1] = lVar4;
  in_x9 = *in_stack_00000078 + in_stack_00000080 * 8;
  in_ZR = in_x9 == in_stack_00000078[1];
  goto code_r0x007152dc;
}

