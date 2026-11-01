
undefined8 FUN_00584168(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long *in_stack_00000080;
  ulong auStack_d8 [3];
  long lStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  ulong auStack_90 [3];
  long lStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  
  do {
    func_0x005d2ac4(unaff_x20);
    do {
      unaff_x20 = unaff_x20 + 1;
      unaff_x22 = unaff_x22 + -1;
      if (unaff_x22 == 0) {
        if (in_stack_00000050 != 0) {
          func_0x00187bd4(in_stack_00000058,in_stack_00000050 << 3,8);
        }
        func_0x0058151c(unaff_x21 + 0x38);
        lVar1 = *in_stack_00000080;
        *in_stack_00000080 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2c74(unaff_x21 + 0x50);
        }
        __Unwind_Resume();
        func_0x007a2668();
        auVar4 = func_0x007a2668();
        plVar3 = auVar4._8_8_;
        plVar2 = auVar4._0_8_;
        lStack_50 = plVar2[2];
        if (lStack_50 != plVar3[2]) {
          return 0;
        }
        auStack_d8[2] = *plVar2;
        lStack_c0 = plVar2[1];
        lStack_98 = lStack_50;
        if (auStack_d8[2] == 0) {
          lStack_98 = 0;
        }
        auStack_d8[0] = (ulong)(auStack_d8[2] != 0);
        auStack_90[2] = *plVar3;
        lStack_78 = plVar3[1];
        if (auStack_90[2] == 0) {
          lStack_50 = 0;
        }
        auStack_90[0] = (ulong)(auStack_90[2] != 0);
        auStack_d8[1] = 0;
        uStack_b0 = 0;
        auStack_90[1] = 0;
        uStack_68 = 0;
        uStack_48 = 0;
        uStack_40 = 0;
        uStack_38 = 0;
        uStack_30 = 0;
        uStack_b8 = auStack_d8[0];
        lStack_a8 = auStack_d8[2];
        lStack_a0 = lStack_c0;
        uStack_70 = auStack_90[0];
        lStack_60 = auStack_90[2];
        lStack_58 = lStack_78;
        while( true ) {
          auVar4 = func_0x0058027c(auStack_d8);
          plVar2 = auVar4._0_8_;
          if (plVar2 == (long *)0x0) {
            return 1;
          }
          auVar5 = func_0x0058027c(auStack_90);
          plVar3 = auVar5._0_8_;
          if (plVar3 == (long *)0x0) break;
          if (((*plVar2 != *plVar3) || (plVar2[1] != plVar3[1] || plVar2[2] != plVar3[2])) ||
             (*auVar4._8_8_ != *auVar5._8_8_)) {
            return 0;
          }
        }
        return 1;
      }
      lVar1 = *(long *)*unaff_x20;
      *(long *)*unaff_x20 = lVar1 + unaff_x23;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

