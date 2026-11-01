
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007a05e4(void)

{
  code *pcVar1;
  long lVar2;
  ulong *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 extraout_x8;
  code *extraout_x9;
  long extraout_x12;
  long *plVar6;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x007a144c();
  puVar3 = (ulong *)(*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)();
  uVar4 = *puVar3;
  if (uVar4 < 3) {
    if (uVar4 != 2) {
      plVar6 = (long *)func_0x007a0174();
      goto LAB_007a06a0;
    }
    plVar6 = (long *)(*___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E)
                               (&__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E);
    lVar2 = *plVar6;
    if (lVar2 != 0) {
LAB_007a068c:
      uStack_50 = 0x8000000000000000;
      plVar6 = (long *)func_0x00412b1c(lVar2,&uStack_50);
      goto LAB_007a06a0;
    }
    if (lRam0000000000a3bfe0 != -1) {
      lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
      plVar6 = (long *)(*extraout_x9)(extraout_x8);
      *plVar6 = extraout_x12;
      lVar2 = extraout_x12;
      goto LAB_007a068c;
    }
    func_0x007a0378();
  }
  else {
    plVar6 = (long *)(uVar4 - 0x10);
    lVar2 = *plVar6;
    *plVar6 = lVar2 + 1;
    if (lVar2 < 0) goto code_r0x007a0624;
LAB_007a06a0:
    uStack_48 = 1;
    uStack_50 = 1;
    uStack_38 = 0;
    uStack_30 = 0;
    plStack_40 = plVar6;
    uStack_28 = (*
                ___ZN3std4sync4mpmc5waker17current_thread_id5DUMMY29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h77a1ba387093e9e3E
                )();
    puVar5 = (undefined8 *)func_0x00187bd0(0x30,8);
    if (puVar5 != (undefined8 *)0x0) {
      puVar5[1] = uStack_48;
      *puVar5 = uStack_50;
      puVar5[3] = uStack_38;
      puVar5[2] = plStack_40;
      puVar5[5] = uStack_28;
      puVar5[4] = uStack_30;
      return;
    }
  }
  func_0x007a1f18(8,0x30);
code_r0x007a0624:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7a0628);
  (*pcVar1)();
}

