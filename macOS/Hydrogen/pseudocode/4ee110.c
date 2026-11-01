
long FUN_004ee110(void)

{
  code *pcVar1;
  long lVar2;
  ulong unaff_x19;
  undefined8 *puVar3;
  long unaff_x20;
  long lVar4;
  undefined8 *unaff_x21;
  long unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  long lVar5;
  undefined8 in_stack_000000c8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined1 uStack00000000000001d0;
  long in_stack_000002d0;
  long lVar6;
  long in_stack_000002d8;
  long in_stack_000002e0;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x004ee110:
  lVar5 = unaff_x28;
  lVar2 = func_0x00187bd0(lVar5,1);
  if (lVar2 == 0) {
code_r0x004ee494:
    func_0x007a1f00(unaff_x27,lVar5,&UNK_009e80a0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4ee660);
    (*pcVar1)();
  }
  lVar4 = unaff_x20;
  unaff_x28 = lVar5;
  lVar6 = in_stack_000002d0;
  do {
    in_stack_000002d0 = unaff_x28;
    lVar5 = lVar2;
    _memcpy(lVar5,unaff_x25,in_stack_000002d0);
    func_0x00517aa4(auStack_7ffffffe + 0x8000024e,auStack_7ffffffe + 0x800003be,
                    auStack_7ffffffe + 0x800002ce,auStack_7ffffffe + 0x8000034e);
    unaff_x20 = lVar4 + 0x18;
    if (unaff_x20 == unaff_x26) {
      func_0x00516ab4(auStack_7ffffffe + 0x8000034e,auStack_7ffffffe + 0x800002ce);
      func_0x005174c8(in_stack_000000c8,auStack_7ffffffe + 0x800002ce);
      lVar5 = 0;
      lVar6 = unaff_x24;
      in_stack_000002d8 = in_stack_000000e0;
      in_stack_000002e0 = unaff_x24;
code_r0x004ee218:
      if (3 < unaff_x19) {
        if ((code *)*unaff_x21 != (code *)0x0) {
          (*(code *)*unaff_x21)(in_stack_000000f0);
        }
        if (unaff_x21[1] != 0) {
          func_0x00187bd4(in_stack_000000f0,unaff_x21[1],unaff_x21[2]);
        }
      }
      if ((in_stack_00000100 != -0x8000000000000000) && (in_stack_00000100 != 0)) {
        func_0x00187bd4(in_stack_00000108,in_stack_00000100,1);
      }
      if (lVar5 == 0) {
        lVar5 = func_0x004f15d8(in_stack_000000e8,in_stack_000000c8);
        if ((lVar5 == 0) &&
           (lVar5 = func_0x004f2ac4(in_stack_000000e8,in_stack_000000c8), lVar5 == 0)) {
          func_0x005053c0(auStack_7ffffffe + 0x800002ce,*(undefined8 *)(in_stack_000000e8 + 0x10));
          lVar5 = func_0x00521aa8(auStack_7ffffffe + 0x800002ce,in_stack_000000c8);
          if (in_stack_000002e0 != 0) {
            puVar3 = (undefined8 *)(in_stack_000002d8 + 8);
            do {
              if (puVar3[-1] != 0) {
                func_0x00187bd4(*puVar3,puVar3[-1] << 3,8);
              }
              puVar3 = puVar3 + 5;
              in_stack_000002e0 = in_stack_000002e0 + -1;
            } while (in_stack_000002e0 != 0);
          }
          if (lVar6 != 0) {
            func_0x00187bd4(in_stack_000002d8,lVar6 * 0x28,8);
          }
        }
      }
      else if ((((*(byte *)(*(long *)(in_stack_000000e8 + 0x10) + 700) & 1) != 0) ||
               ((*(byte *)(*(long *)(in_stack_000000e8 + 0x10) + 0x2c0) & 1) != 0)) &&
              (lVar2 = func_0x004f2ac4(in_stack_000000e8,in_stack_000000c8), lVar2 != 0)) {
        func_0x004e9f14();
      }
      return lVar5;
    }
    unaff_x25 = *(undefined8 *)(lVar4 + 0x20);
    unaff_x28 = *(long *)(lVar4 + 0x28);
    func_0x0052a488(auStack_7ffffffe + 0x8000034e,&uStack00000000000001d0);
    if (in_stack_000002d0 == 0) {
      func_0x004ea7c4(auStack_7ffffffe + 0x8000024e);
      if (unaff_x24 != 0) {
        func_0x00187bd4(in_stack_000000e0);
      }
      goto code_r0x004ee218;
    }
    if (unaff_x28 < 0) {
      unaff_x27 = 0;
      goto code_r0x004ee494;
    }
    in_stack_000002d8 = lVar5;
    in_stack_000002e0 = in_stack_000002d0;
    if (unaff_x28 != 0) goto code_r0x004ee110;
    lVar4 = unaff_x20;
    lVar2 = 1;
    lVar6 = in_stack_000002d0;
  } while( true );
}

