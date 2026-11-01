
long * FUN_0049adf0(void)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  undefined1 in_w8;
  long unaff_x19;
  undefined8 uVar4;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  undefined6 uStack00000000000000b8;
  undefined1 uStack00000000000000bf;
  undefined2 uStack00000000000000c0;
  undefined4 uStack00000000000000c2;
  undefined1 uStack00000000000000c7;
  ushort uStack00000000000000c8;
  undefined4 uStack00000000000000cc;
  undefined4 uStack00000000000000d0;
  undefined4 uStack00000000000000d4;
  undefined8 in_stack_000000d8;
  
  uVar4 = _uStack00000000000000d0;
  uStack00000000000000c2 = CONCAT31(uStack00000000000000c2._1_3_,in_w8);
  uStack00000000000000cc = CONCAT31(uStack00000000000000cc._1_3_,in_w8);
  uStack00000000000000d0 = CONCAT31(uStack00000000000000d0._1_3_,in_w8);
  uStack00000000000000d4 = CONCAT31(SUB83(uVar4,5),in_w8);
  plVar2 = (long *)func_0x00187bd0(0xe0,8);
  if (plVar2 == (long *)0x0) {
    func_0x007a1f18(8,0xe0);
  }
  else {
    plVar2[0x15] = in_stack_000000a8;
    plVar2[0x14] = in_stack_000000a0;
    plVar2[0x17] = CONCAT17(uStack00000000000000bf,CONCAT16(in_w8,uStack00000000000000b8));
    plVar2[0x16] = in_stack_000000b0;
    plVar2[0x19] = CONCAT44(uStack00000000000000cc,(uint)uStack00000000000000c8);
    plVar2[0x18] = CONCAT17(uStack00000000000000c7,
                            CONCAT16(in_w8,CONCAT42(uStack00000000000000c2,uStack00000000000000c0)))
    ;
    plVar2[0x1b] = CONCAT35(in_stack_000000d8._5_3_,0x202000000);
    plVar2[0x1a] = CONCAT44(uStack00000000000000d4,uStack00000000000000d0);
    plVar2[0xd] = in_stack_00000068;
    plVar2[0xc] = in_stack_00000060;
    plVar2[0xf] = in_stack_00000078;
    plVar2[0xe] = in_stack_00000070;
    plVar2[0x11] = in_stack_00000088;
    plVar2[0x10] = in_stack_00000080;
    plVar2[0x13] = in_stack_00000098;
    plVar2[0x12] = in_stack_00000090;
    plVar2[5] = in_stack_00000028;
    plVar2[4] = in_stack_00000020;
    plVar2[7] = in_stack_00000038;
    plVar2[6] = in_stack_00000030;
    plVar2[9] = in_stack_00000048;
    plVar2[8] = in_stack_00000040;
    plVar2[0xb] = in_stack_00000058;
    plVar2[10] = in_stack_00000050;
    plVar2[1] = in_stack_00000008;
    *plVar2 = in_stack_00000000;
    plVar2[3] = in_stack_00000018;
    plVar2[2] = in_stack_00000010;
    if (unaff_x19 < 0) {
      uVar4 = 0;
    }
    else {
      if (unaff_x19 == 0) {
        lVar3 = 1;
LAB_0049aea0:
        _memcpy(lVar3);
        if ((*plVar2 != 2) && (plVar2[1] != 0)) {
          func_0x00187bd4(plVar2[2],plVar2[1],1);
        }
        *plVar2 = 0;
        plVar2[1] = unaff_x19;
        plVar2[2] = lVar3;
        plVar2[3] = unaff_x19;
        return plVar2;
      }
      uVar4 = 1;
      lVar3 = func_0x00187bd0();
      if (lVar3 != 0) goto LAB_0049aea0;
    }
    func_0x007a1f00(uVar4);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49af20);
  (*pcVar1)();
}

