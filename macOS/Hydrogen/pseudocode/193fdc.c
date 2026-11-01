
void FUN_00193fdc(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined4 uVar4;
  undefined8 *extraout_x8;
  undefined4 *unaff_x19;
  undefined8 uStack0000000000000008;
  long lStack_68;
  long lStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 *puStack_40;
  undefined *puStack_38;
  undefined8 uStack_30;
  undefined1 uStack_21;
  
  iVar2 = _SecIdentityCopyPrivateKey(param_1,&uStack0000000000000008);
  if (iVar2 == 0) {
    if (uStack0000000000000008 == 0) {
      puVar3 = (undefined8 *)func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1410);
      lStack_68 = 0;
      iVar2 = _SecCertificateCopyCommonName(*puVar3,&lStack_68);
      if (iVar2 != 0) {
        *(int *)(extraout_x8 + 1) = iVar2;
        *extraout_x8 = 0x8000000000000000;
        return;
      }
      if (lStack_68 == 0) {
        func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
      }
      else {
        lStack_60 = lStack_68;
        uStack_58 = 0;
        uStack_50 = 1;
        uStack_48 = 0;
        uStack_30 = 0xe0000020;
        puStack_40 = &uStack_58;
        puStack_38 = &UNK_009c1288;
        iVar2 = func_0x0019f594(&lStack_60,&puStack_40);
        if (iVar2 == 0) {
          extraout_x8[1] = uStack_50;
          *extraout_x8 = uStack_58;
          extraout_x8[2] = uStack_48;
          func_0x0019fb28(&lStack_60);
          return;
        }
      }
      func_0x007a2810(&UNK_0081b1e7,0x37,&uStack_21,&UNK_009c12e8,&UNK_009c12b8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x194110);
      (*pcVar1)();
    }
    uVar4 = 0;
    *(long *)(unaff_x19 + 2) = uStack0000000000000008;
  }
  else {
    unaff_x19[1] = iVar2;
    uVar4 = 1;
  }
  *unaff_x19 = uVar4;
  return;
}

