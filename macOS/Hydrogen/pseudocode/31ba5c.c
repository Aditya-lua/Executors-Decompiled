
/* WARNING: Possible PIC construction at 0x0031bc7c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0031bc30: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0031bc80) */
/* WARNING: Removing unreachable block (ram,0x0031bc8c) */
/* WARNING: Removing unreachable block (ram,0x0031bc34) */

undefined8 FUN_0031ba5c(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  char *pcVar5;
  code *UNRECOVERED_JUMPTABLE;
  int *piVar6;
  long *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x29;
  undefined *puVar7;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined *in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    iVar1 = _strcmp();
    if ((iVar1 != 0) &&
       (((lVar2 = _strtol(), uStack0000000000000010 == unaff_x20 || (lVar2 < 0)) ||
        (0x7fffffff < lVar2)))) {
      uVar3 = 0x2e7;
code_r0x0031bd4c:
      func_0x0028f83c(6,0,0x7c,"/aws-lc/crypto/fipsmodule/evp/p_rsa.c",uVar3);
      return 0xfffffffe;
    }
    uVar4 = 0x18;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
    unaff_x29 = in_stack_00000040;
    puVar7 = in_stack_00000048;
  }
  else {
    iVar1 = _strcmp();
    if (iVar1 == 0) {
      lVar2 = _strtol();
      if (((uStack0000000000000010 == unaff_x20) || (lVar2 < 1)) || (0x7fffffff < lVar2)) {
        uVar3 = 0x2f2;
        goto code_r0x0031bd4c;
      }
      uVar4 = 4;
      puVar7 = &UNK_0031bc34;
    }
    else {
      iVar1 = _strcmp();
      if (iVar1 != 0) {
        iVar1 = _strcmp();
        if (iVar1 == 0) {
          uVar4 = 0xf8;
          pcVar5 = "s/CoreFoundation.framework/Versions/A/CoreFoundation";
        }
        else {
          iVar1 = _strcmp();
          if (iVar1 != 0) {
            iVar1 = _strcmp();
            if (iVar1 != 0) {
              return 0xfffffffe;
            }
            in_stack_00000008 = 0;
            lVar2 = func_0x0036e92c();
            if (lVar2 == 0) {
              return 0;
            }
            in_stack_00000018 = in_stack_00000008;
            uStack0000000000000010 = lVar2;
            uVar3 = func_0x002d9ef4();
            if ((int)uVar3 < 1) {
              func_0x0036e3d8(lVar2);
              return uVar3;
            }
            return uVar3;
          }
          uVar4 = 0xc0;
          pcVar5 = "rks/CoreFoundation.framework/Versions/A/CoreFoundation";
        }
        if ((unaff_x20 == 0) || (lVar2 = func_0x0028a618(unaff_x20), lVar2 == 0)) {
          func_0x0028f83c(6,0,0x6f,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0x299);
          return 0;
        }
        if (((unaff_x19 == (long *)0x0) || (*unaff_x19 == 0)) ||
           (UNRECOVERED_JUMPTABLE = *(code **)(*unaff_x19 + 0x80),
           UNRECOVERED_JUMPTABLE == (code *)0x0)) {
          func_0x0028f83c(6,0,0x65,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xd7);
          return 0;
        }
        if (*(uint *)(unaff_x19 + 4) == 0) {
          func_0x0028f83c(6,0,0x7b,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe0);
          return 0;
        }
        if ((uVar4 == 0xffffffff) || ((*(uint *)(unaff_x19 + 4) & uVar4) != 0)) {
                    /* WARNING: Could not recover jumptable at 0x002db890. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar3 = (*UNRECOVERED_JUMPTABLE)(unaff_x19,pcVar5,0,lVar2);
          return uVar3;
        }
        func_0x0028f83c(6,0,0x72,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe5);
        return 0;
      }
      uStack0000000000000010 = 0;
      iVar1 = func_0x00281618(&uStack0000000000000010);
      if (iVar1 == 0) {
        return 0xfffffffe;
      }
      uVar4 = 4;
      puVar7 = &UNK_0031bc80;
    }
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar7;
  if ((unaff_x19 != (long *)0x0) && (piVar6 = (int *)*unaff_x19, piVar6 != (int *)0x0)) {
    if ((*piVar6 != 6) && (*piVar6 != 0x390)) {
      func_0x0028f83c(6,0,0x7d,"/aws-lc/crypto/fipsmodule/evp/p_rsa.c",0x356);
      return 0;
    }
    if (*(code **)(piVar6 + 0x20) != (code *)0x0) {
      if (*(uint *)(unaff_x19 + 4) == 0) {
        func_0x0028f83c(6,0,0x7b,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe0);
        return 0;
      }
      if ((uVar4 == 0xffffffff) || ((*(uint *)(unaff_x19 + 4) & uVar4) != 0)) {
                    /* WARNING: Could not recover jumptable at 0x002dcc30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar3 = (**(code **)(piVar6 + 0x20))();
        return uVar3;
      }
      func_0x0028f83c(6,0,0x72,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe5);
      return 0;
    }
  }
  func_0x0028f83c(6,0,0x65,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xd7);
  return 0;
}

