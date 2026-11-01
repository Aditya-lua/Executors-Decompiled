
void FUN_00191be0(void)

{
  int iVar1;
  long lVar2;
  undefined4 *unaff_x19;
  undefined1 auVar3 [16];
  long in_stack_00000008;
  
  iVar1 = _SecTrustSettingsCopyCertificates();
  if (iVar1 != 0) {
    if (iVar1 != -0x62af) {
      *unaff_x19 = 1;
      unaff_x19[1] = iVar1;
      return;
    }
    lVar2 = _CFArrayCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,8,0,
                           PTR__kCFTypeArrayCallBacks_009b0258);
    if (lVar2 != 0) goto LAB_00191c38;
    func_0x007a11c0(&UNK_00819f20,0x22,&UNK_009c0728);
  }
  lVar2 = in_stack_00000008;
  if (in_stack_00000008 == 0) {
    auVar3 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11d0);
                    /* WARNING: Could not recover jumptable at 0x007b2914. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__SecTrustSettingsSetTrustSettings_00a246c8)(*auVar3._8_8_,*auVar3._0_8_,0);
    return;
  }
LAB_00191c38:
  *(long *)(unaff_x19 + 2) = lVar2;
  *(undefined8 *)(unaff_x19 + 4) = 0;
  *unaff_x19 = 0;
  return;
}

