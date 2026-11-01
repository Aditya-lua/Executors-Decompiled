
void FUN_0041d080(undefined8 *param_1)

{
  int iVar1;
  long *plVar2;
  undefined8 extraout_x1;
  undefined8 extraout_x8;
  code *extraout_x9;
  long *unaff_x19;
  long lVar3;
  undefined1 auStack_20 [16];
  
  plVar2 = (long *)(*(code *)*param_1)(param_1);
  lVar3 = *plVar2;
  if (lVar3 == 0) {
    if (lRam0000000000a3bfe0 != -1) {
      lVar3 = lRam0000000000a3bfe0 + 1;
      lRam0000000000a3bfe0 = lVar3;
      plVar2 = (long *)(*extraout_x9)(extraout_x8);
      *plVar2 = lVar3;
      if (lVar3 != unaff_x19[1]) goto LAB_0041d0fc;
      goto LAB_0041d0a0;
    }
    func_0x007a0378();
LAB_0041d12c:
    func_0x007a23d8(&UNK_00886819,0x26,&UNK_009dadd0);
LAB_0041d144:
    func_0x007a0ec8();
    iVar1 = _pthread_mutex_lock();
  }
  else {
    if (lVar3 == unaff_x19[1]) {
LAB_0041d0a0:
      if ((int)unaff_x19[2] != -1) {
        iVar1 = (int)unaff_x19[2] + 1;
        goto LAB_0041d114;
      }
      goto LAB_0041d12c;
    }
LAB_0041d0fc:
    if (*unaff_x19 == 0) goto LAB_0041d144;
    iVar1 = _pthread_mutex_lock();
  }
  if (iVar1 != 0) {
    func_0x007a1368();
    func_0x00469240(auStack_20,extraout_x1,&UNK_00886367,6);
    func_0x00465564(auStack_20);
    return;
  }
  unaff_x19[1] = lVar3;
  iVar1 = 1;
LAB_0041d114:
  *(int *)(unaff_x19 + 2) = iVar1;
  return;
}

