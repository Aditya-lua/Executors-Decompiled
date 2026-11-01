
undefined8 FUN_00283124(int param_1,undefined8 param_2,long param_3)

{
  undefined1 uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000038;
  undefined1 *apuStack_68 [6];
  undefined8 uStack_38;
  
  if (param_1 != 0) {
    uVar1 = *(undefined1 *)(unaff_x29 - 0x30U | unaff_x20);
    param_3 = 1;
    iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
    if (iVar2 != 0) {
      *uStack0000000000000038 = uVar1;
      if (unaff_x20 != 0) {
        uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 1);
        param_3 = 1;
        iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
        if (iVar2 == 0) goto LAB_002832a8;
        *uStack0000000000000038 = uVar1;
        if (1 < unaff_x20) {
          uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 2);
          param_3 = 1;
          iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
          if (iVar2 == 0) goto LAB_002832a8;
          *uStack0000000000000038 = uVar1;
          if (2 < unaff_x20) {
            uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 3);
            param_3 = 1;
            iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
            if (iVar2 == 0) goto LAB_002832a8;
            *uStack0000000000000038 = uVar1;
            if (3 < unaff_x20) {
              uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 4);
              param_3 = 1;
              iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
              if (iVar2 == 0) goto LAB_002832a8;
              *uStack0000000000000038 = uVar1;
              if (4 < unaff_x20) {
                uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 5);
                param_3 = 1;
                iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
                if (iVar2 == 0) goto LAB_002832a8;
                *uStack0000000000000038 = uVar1;
                if (5 < unaff_x20) {
                  uVar1 = *(undefined1 *)((unaff_x20 | unaff_x29 - 0x30U) - 6);
                  param_3 = 1;
                  iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
                  if (iVar2 == 0) goto LAB_002832a8;
                  *uStack0000000000000038 = uVar1;
                  if (unaff_x20 == 7) {
                    uVar1 = *(undefined1 *)((unaff_x29 - 0x30U | 7) - 7);
                    param_3 = 1;
                    iVar2 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038);
                    if (iVar2 == 0) goto LAB_002832a8;
                    *uStack0000000000000038 = uVar1;
                  }
                }
              }
            }
          }
        }
      }
      uVar3 = func_0x00281fbc();
      goto LAB_002832cc;
    }
  }
LAB_002832a8:
  puVar4 = unaff_x19 + 2;
  if (*(char *)(unaff_x19 + 1) != '\0') {
    puVar4 = (undefined8 *)*puVar4;
  }
  uVar3 = 0;
  *(byte *)(puVar4 + 3) = *(byte *)(puVar4 + 3) | 2;
  *unaff_x19 = 0;
LAB_002832cc:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar3;
  }
  auVar6 = ___stack_chk_fail(uVar3);
  puVar4 = auVar6._0_8_;
  iVar2 = func_0x00281fbc();
  if ((iVar2 != 0) && (iVar2 = func_0x002826e4(puVar4,apuStack_68,1), iVar2 != 0)) {
    *apuStack_68[0] = 4;
    iVar2 = func_0x0028253c(puVar4,apuStack_68,1,1);
    if ((iVar2 != 0) && (iVar2 = func_0x002826e4(apuStack_68,&uStack_38,param_3), iVar2 != 0)) {
      if (param_3 != 0) {
        _memcpy(uStack_38,auVar6._8_8_,param_3);
      }
      iVar2 = func_0x00281fbc(puVar4);
      if (iVar2 != 0) {
        return 1;
      }
    }
  }
  puVar5 = puVar4 + 2;
  if (*(char *)(puVar4 + 1) != '\0') {
    puVar5 = (undefined8 *)*puVar5;
  }
  *(byte *)(puVar5 + 3) = *(byte *)(puVar5 + 3) | 2;
  *puVar4 = 0;
  return 0;
}

