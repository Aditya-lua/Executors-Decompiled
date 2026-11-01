
long * FUN_00437b10(ulong param_1,undefined8 param_2,int param_3)

{
  uint uVar1;
  ulong uVar2;
  bool in_ZR;
  bool bVar3;
  int iVar4;
  long *plVar5;
  uint in_w10;
  ulong unaff_x19;
  long lVar6;
  uint unaff_w20;
  int iStack0000000000000000;
  ulong uStack0000000000000008;
  uint in_stack_00000010;
  
  uVar1 = 0;
  if (in_ZR) {
    uVar1 = unaff_w20;
  }
  uVar1 = param_3 + uVar1;
  if ((in_w10 - 1 < uVar1) &&
     ((bVar3 = SCARRY8(param_1,1), param_1 = param_1 + 1, bVar3 ||
      (uVar1 = uVar1 + 0xc4653600, uVar1 == in_w10)))) {
    uVar1 = 999999999;
    param_1 = 0x7fffffffffffffff;
  }
  uStack0000000000000008 = (ulong)uVar1;
  _iStack0000000000000000 = param_1;
  iVar4 = _pthread_cond_timedwait();
  if ((iVar4 != 0x3c) && (iVar4 != 0)) {
    plVar5 = (long *)func_0x007a247c(&UNK_008871ac,0x30,&UNK_009db860);
    lVar6 = *plVar5;
    *plVar5 = 0;
    if ((lVar6 == 0) || (plVar5 = (long *)_pthread_mutex_trylock(lVar6), (int)plVar5 != 0)) {
      return plVar5;
    }
    _pthread_mutex_unlock(lVar6);
    _pthread_mutex_destroy(lVar6);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar5 = (long *)(*(code *)PTR__free_00a24e58)(lVar6,0x40,8);
    return plVar5;
  }
  if (iVar4 == 0) {
    plVar5 = (long *)((long)&MACH_HEADER.magic + 1);
  }
  else {
    func_0x00430548(8);
    func_0x0043065c();
    uVar2 = 0;
    if (iStack0000000000000000 == 0) {
      uVar2 = uStack0000000000000008;
    }
    uVar1 = 0;
    if ((_iStack0000000000000000 & 1) == 0) {
      uVar1 = in_stack_00000010;
    }
    bVar3 = uVar2 < unaff_x19;
    if (uVar2 == unaff_x19) {
      bVar3 = uVar1 < unaff_w20;
    }
    plVar5 = (long *)(ulong)bVar3;
  }
  return plVar5;
}

