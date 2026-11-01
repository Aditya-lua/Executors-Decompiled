
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c490c) */

undefined8 FUN_004c4bec(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  long lVar2;
  undefined4 *puVar3;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long unaff_x29;
  ulong in_stack_00000038;
  undefined4 in_stack_00000070;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined1 uStack00000000000001f0;
  ulong in_stack_00000208;
  undefined8 in_stack_00000320;
  undefined8 in_stack_00000328;
  undefined8 in_stack_00000330;
  long in_stack_00000490;
  long *in_stack_00000498;
  undefined1 auStack_7ffffffe [2147483646];
  
  _memcpy(param_1,param_2,0x108);
  if (unaff_x24 < 0x15) {
    _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
    func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e64b0);
  }
  else {
    _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
    *(undefined8 *)(unaff_x26 + 0x138) = *(undefined8 *)(unaff_x26 + 0x78);
    *(undefined8 *)(unaff_x26 + 0x130) = *(undefined8 *)(unaff_x26 + 0x70);
    *(undefined8 *)(unaff_x26 + 0x148) = *(undefined8 *)(unaff_x26 + 0x88);
    *(undefined8 *)(unaff_x26 + 0x140) = *(undefined8 *)(unaff_x26 + 0x80);
    *(undefined8 *)(unaff_x26 + 0x158) = *(undefined8 *)(unaff_x26 + 0x98);
    *(undefined8 *)(unaff_x26 + 0x150) = *(undefined8 *)(unaff_x26 + 0x90);
    *(undefined8 *)(unaff_x26 + 0x168) = *(undefined8 *)(unaff_x26 + 0xa8);
    *(undefined8 *)(unaff_x26 + 0x160) = *(undefined8 *)(unaff_x26 + 0xa0);
    if (in_stack_00000490 == -0x8000000000000000) {
      lVar2 = *in_stack_00000498;
      *in_stack_00000498 = lVar2 + 1;
      if (lVar2 < 0) {
        func_0x007a05dc();
      }
      else {
        *(undefined8 *)(unaff_x26 + 0x118) = in_stack_00000328;
        *(undefined8 *)(unaff_x26 + 0x110) = in_stack_00000320;
        *(undefined8 *)(unaff_x26 + 0x120) = in_stack_00000330;
        func_0x005db1b4(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x800004ee,
                        unaff_x29 + -0xd0,auStack_7ffffffe + 0x8000033e,in_stack_00000498,
                        unaff_x29 + -0xf0);
        func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
        func_0x004bb3f8(unaff_x23 + 0x58);
        func_0x004bb3f8(unaff_x23 + 0xb0);
        func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
        func_0x004bdba4();
        func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
        func_0x004bcba8(auStack_7ffffffe + 0x8000066e);
        puVar3 = (undefined4 *)func_0x00187bd0(0x28,8);
        if (puVar3 != (undefined4 *)0x0) {
          *puVar3 = in_stack_00000070;
          *(undefined8 *)(puVar3 + 2) = 0;
          *(undefined8 *)(puVar3 + 4) = 8;
          *(undefined8 *)(puVar3 + 6) = 0;
          *(undefined1 *)(puVar3 + 8) = 0;
          func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8);
          func_0x004bb068(auStack_7ffffffe + 0x8000052e);
          func_0x004bea24(in_stack_000000f8);
          if ((0x19 < in_stack_00000208) || ((1L << (in_stack_00000208 & 0x3f) & 0x2410000U) == 0))
          {
            func_0x004bba74(&uStack00000000000001f0);
          }
          if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
            func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
          }
          if (in_stack_00000120 != 0) {
            func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
          }
          return 1;
        }
        func_0x007a1f18(8,0x28);
      }
    }
    else {
      func_0x007a23bc(&UNK_009e64c8);
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

