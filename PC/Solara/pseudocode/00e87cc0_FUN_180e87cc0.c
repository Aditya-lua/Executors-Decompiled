undefined8 FUN_180e87cc0(undefined8 param_1,undefined4 param_2,undefined8 param_3,ulonglong param_4)

{
  int iVar1;
  uint auStackX_20 [2];
  undefined8 in_stack_ffffffffffffffb8;
  undefined4 uVar4;
  longlong *plVar2;
  ulonglong uVar3;
  undefined4 uStack_38;
  undefined4 uStack_34;
  longlong lStack_30;
  longlong alStack_28 [2];
  
  uVar4 = (undefined4)((ulonglong)in_stack_ffffffffffffffb8 >> 0x20);
  uStack_38 = 4;
  alStack_28[0] = 0;
  lStack_30 = 0;
  auStackX_20[0] = 0;
  uStack_34 = (undefined4)param_4;
  FUN_180f297c0(param_3,0,param_4);
  iVar1 = CryptAcquireContextW(alStack_28,0,0,0x18,CONCAT44(uVar4,0xf0000040));
  if (iVar1 != 0) {
    plVar2 = &lStack_30;
    iVar1 = CryptCreateHash(alStack_28[0],0x800c,0,0,plVar2);
    if (iVar1 != 0) {
      iVar1 = CryptHashData(lStack_30,param_1,param_2,0);
      if (iVar1 != 0) {
        uVar3 = (ulonglong)plVar2 & 0xffffffff00000000;
        iVar1 = CryptGetHashParam(lStack_30,4,auStackX_20,&uStack_38,uVar3);
        if ((iVar1 != 0) && (auStackX_20[0] <= param_4)) {
          CryptGetHashParam(lStack_30,2,param_3,&uStack_34,uVar3 & 0xffffffff00000000);
        }
      }
    }
    if (lStack_30 != 0) {
      CryptDestroyHash();
    }
    if (alStack_28[0] != 0) {
      CryptReleaseContext(alStack_28[0],0);
    }
  }
  return 0;
}


