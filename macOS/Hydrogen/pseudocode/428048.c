
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00428048(undefined1 param_1 [16],undefined1 param_2 [16])

{
  code *pcVar1;
  int iVar2;
  uint uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long *unaff_x20;
  long lVar6;
  long *plVar7;
  long lVar8;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  unaff_x20[2] = param_1._8_8_;
  unaff_x20[1] = param_1._0_8_;
  unaff_x20[4] = param_2._8_8_;
  unaff_x20[3] = param_2._0_8_;
  *unaff_x20 = *unaff_x20 + 1;
  iRam0000000000a3c010 = iRam0000000000a3c010 + -1;
  if (iRam0000000000a3c010 == 0) {
    uRam0000000000a3c008 = 0;
    _pthread_mutex_unlock(uRam0000000000a3c000);
  }
  __Unwind_Resume();
  puVar4 = (undefined8 *)func_0x007a2668();
  plVar7 = *(long **)*puVar4;
  *(long *)*puVar4 = 0;
  if (plVar7 == (long *)0x0) {
    func_0x007a23bc(&UNK_009dac88);
  }
  else {
    lStack_88 = plVar7[1];
    lStack_90 = *plVar7;
    lStack_78 = plVar7[3];
    lStack_80 = plVar7[2];
    if (lRam0000000000a3bfa8 != 0) goto code_r0x004280e4;
  }
  func_0x007a0ec8(0xa3bfa8);
code_r0x004280e4:
  iVar2 = _pthread_mutex_lock();
  if (iVar2 != 0) {
    func_0x007a1368();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4281c0);
    (*pcVar1)();
  }
  if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E & 0x7fffffffffffffff
      ) == 0) {
    uVar3 = 0;
  }
  else {
    uVar3 = func_0x007a1140();
    uVar3 = uVar3 ^ 1;
  }
  if (lStack_80 != 0) {
    lVar8 = lStack_80 * 0x38;
    lVar6 = lStack_88;
    do {
      lStack_70 = lVar6 + 0x20;
      func_0x0043af4c(1,lVar6,&lStack_70,&UNK_009db458);
      lVar6 = lVar6 + 0x38;
      lVar8 = lVar8 + -0x38;
    } while (lVar8 != 0);
  }
  lStack_68 = lStack_88;
  lStack_70 = lStack_90;
  lStack_58 = lStack_78;
  lStack_60 = lStack_80;
  if ((((uVar3 & 1) == 0) &&
      ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
       0x7fffffffffffffff) != 0)) && (uVar5 = func_0x007a1140(), (uVar5 & 1) == 0)) {
    uRam0000000000a3bfb0 = 1;
  }
  _pthread_mutex_unlock(lRam0000000000a3bfa8);
  plVar7[1] = lStack_68;
  *plVar7 = lStack_70;
  plVar7[3] = lStack_58;
  plVar7[2] = lStack_60;
  return;
}

