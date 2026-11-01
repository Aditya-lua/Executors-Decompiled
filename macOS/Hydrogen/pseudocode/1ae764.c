
void __ZN92__LT_rustls__msgs__handshake__PresharedKeyIdentity_u20_as_u20_rustls__msgs__codec__Codec_GT_4read17h50702aea4a62554fE
               (long *param_1,long *param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  code *pcVar5;
  int aiStack_50 [2];
  long lStack_48;
  long lStack_40;
  long lStack_38;
  
  func_0x00223f7c(aiStack_50);
  if (aiStack_50[0] == 1) {
    param_1[2] = lStack_40;
    param_1[3] = lStack_38;
    *param_1 = -0x8000000000000000;
    param_1[1] = lStack_48;
  }
  else {
    uVar2 = param_2[1];
    uVar3 = param_2[2];
    if (3 < uVar2 - uVar3) {
      uVar1 = uVar3 + 4;
      param_2[2] = uVar1;
      if (uVar3 < 0xfffffffffffffffc) {
        if (uVar1 <= uVar2) {
          uVar4 = (*(uint *)(*param_2 + uVar3) & 0xff00ff00) >> 8 |
                  (*(uint *)(*param_2 + uVar3) & 0xff00ff) << 8;
          *param_1 = lStack_48;
          param_1[1] = lStack_40;
          param_1[2] = lStack_38;
          *(uint *)(param_1 + 3) = uVar4 >> 0x10 | uVar4 << 0x10;
          return;
        }
        func_0x007a28b0(uVar1,uVar2,&UNK_009c9a78);
      }
      else {
        func_0x007a28bc(uVar3,uVar1,&UNK_009c9a78);
      }
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x1ae86c);
      (*pcVar5)();
    }
    param_1[2] = (long)&UNK_008298e0;
    param_1[3] = 3;
    *(undefined1 *)(param_1 + 1) = 0xc;
    *param_1 = -0x8000000000000000;
    if (lStack_48 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lStack_40,lStack_48,1);
      return;
    }
  }
  return;
}

