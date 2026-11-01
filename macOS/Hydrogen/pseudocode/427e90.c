
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00427e90(undefined *param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 extraout_x8;
  code *in_x9;
  code *extraout_x9;
  long lVar5;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000028;
  undefined7 uStack0000000000000029;
  
  while( true ) {
    plVar4 = (long *)(*in_x9)(param_1);
    lVar5 = *plVar4;
    if (lVar5 != 0) break;
    if (lRam0000000000a3bfe0 != -1) {
      lVar5 = lRam0000000000a3bfe0 + 1;
      lRam0000000000a3bfe0 = lVar5;
      plVar4 = (long *)(*extraout_x9)(extraout_x8);
      *plVar4 = lVar5;
      if (lVar5 != lRam0000000000a3c008) goto LAB_00427f14;
      goto LAB_00427eb0;
    }
    func_0x007a0378();
    func_0x007a23bc(&UNK_009dac88);
    func_0x007a0844((long)&uStack0000000000000008 + 7);
    if ((uStack0000000000000008._7_1_ & 1) != 0) goto LAB_00427fa8;
    param_1 = &__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E;
    in_x9 = ___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E;
  }
  if (lVar5 == lRam0000000000a3c008) {
LAB_00427eb0:
    if (iRam0000000000a3c010 == -1) goto LAB_00427fa8;
    iRam0000000000a3c010 = iRam0000000000a3c010 + 1;
  }
  else {
LAB_00427f14:
    if (lRam0000000000a3c000 == 0) {
      func_0x007a0ec8(0xa3c000);
      iVar3 = _pthread_mutex_trylock();
    }
    else {
      iVar3 = _pthread_mutex_trylock();
    }
    if (iVar3 != 0) goto LAB_00427fa8;
    iRam0000000000a3c010 = 1;
    lRam0000000000a3c008 = lVar5;
  }
  uStack0000000000000010 = 0;
  in_stack_00000018 = 1;
  in_stack_00000020 = 0;
  uStack0000000000000028 = 0;
  if (lRam0000000000a3c018 != 0) {
    func_0x007a2334(&UNK_009da588);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x428040);
    (*pcVar2)();
  }
  lRam0000000000a3c018 = -1;
  func_0x003f7c9c(0xa3c020);
  uRam0000000000a3c038 = CONCAT71(uStack0000000000000029,uStack0000000000000028);
  uRam0000000000a3c028 = in_stack_00000018;
  uRam0000000000a3c020 = uStack0000000000000010;
  uRam0000000000a3c030 = in_stack_00000020;
  lRam0000000000a3c018 = lRam0000000000a3c018 + 1;
  iRam0000000000a3c010 = iRam0000000000a3c010 + -1;
  if (iRam0000000000a3c010 == 0) {
    lRam0000000000a3c008 = 0;
    _pthread_mutex_unlock(lRam0000000000a3c000);
  }
LAB_00427fa8:
  lVar1 = lRam0000000000a3bff8;
  lVar5 = lRam0000000000a3bff0;
  if (lRam0000000000a3bff8 != 0) {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0x20000;
    in_stack_00000020 = CONCAT44(in_stack_00000020._4_4_,4);
    _sigaltstack(&uStack0000000000000010,0);
    _munmap(lVar1 - lVar5,lVar5 + 0x20000);
  }
  return;
}

