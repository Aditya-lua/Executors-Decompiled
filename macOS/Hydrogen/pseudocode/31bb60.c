
undefined8 FUN_0031bb60(void)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  undefined8 uVar4;
  int *piVar5;
  undefined8 *unaff_x19;
  
  iVar1 = _strcmp();
  if (iVar1 != 0) {
    func_0x0028f83c(6,0,0x8f,"/aws-lc/crypto/fipsmodule/evp/p_rsa.c",0x2d7);
    return 0xfffffffe;
  }
  if ((unaff_x19 != (undefined8 *)0x0) && (piVar5 = (int *)*unaff_x19, piVar5 != (int *)0x0)) {
    if ((*piVar5 != 6) && (*piVar5 != 0x390)) {
      pcVar3 = "/aws-lc/crypto/fipsmodule/evp/p_rsa.c";
      uVar2 = 0x7d;
      uVar4 = 0x356;
      goto code_r0x0031be50;
    }
    if (*(code **)(piVar5 + 0x20) != (code *)0x0) {
      if (*(int *)(unaff_x19 + 4) != 0) {
                    /* WARNING: Could not recover jumptable at 0x0031bd08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (**(code **)(piVar5 + 0x20))();
        return uVar2;
      }
      pcVar3 = "/aws-lc/crypto/fipsmodule/evp/evp_ctx.c";
      uVar2 = 0x7b;
      uVar4 = 0xe0;
      goto code_r0x0031be50;
    }
  }
  pcVar3 = "/aws-lc/crypto/fipsmodule/evp/evp_ctx.c";
  uVar2 = 0x65;
  uVar4 = 0xd7;
code_r0x0031be50:
  func_0x0028f83c(6,0,uVar2,pcVar3,uVar4);
  return 0;
}

