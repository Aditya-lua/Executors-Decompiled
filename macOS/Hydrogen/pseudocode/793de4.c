
ulong FUN_00793de4(ulong param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  undefined1 *puVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  uint uVar9;
  long unaff_x19;
  char *unaff_x20;
  char *unaff_x21;
  char *pcVar10;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined8 uStack0000000000000010;
  undefined8 *in_stack_00000038;
  undefined1 auStack_60 [32];
  long lStack_40;
  undefined8 *puStack_38;
  ulong uStack_30;
  char *pcStack_28;
  char *pcStack_20;
  long lStack_18;
  
  if ((int)param_1 == 0) {
    param_3 = &uStack0000000000000010;
    param_1 = func_0x00729570();
    (*pcRam0000000000a2b5f0)();
    if ((int)param_1 == 0) {
      if (((unaff_x23 != (undefined8 *)0x0) && (*(char *)((long)unaff_x23 + 0xa1d) < '\0')) &&
         ((unaff_x23[0x253] == 0 || (0 < *(int *)(unaff_x23[0x253] + 8))))) {
        func_0x0073cab8();
      }
      lVar2 = (*pcRam0000000000a2b600)();
      if (lVar2 == 0) {
        (*pcRam0000000000a2b5f0)(uStack0000000000000010);
        param_1 = 0x1b;
      }
      else {
        unaff_x20 = ";sha256//";
        unaff_x21 = "sha256//";
        lVar5 = lVar2;
        do {
          puVar3 = (undefined1 *)_strstr(lVar5,";sha256//");
          unaff_x23 = in_stack_00000038;
          if (puVar3 == (undefined1 *)0x0) {
            unaff_x24 = lVar5 + 8;
            puVar4 = (undefined8 *)_strlen(unaff_x24);
            if (unaff_x23 != puVar4) break;
LAB_00793fbc:
            uVar8 = uStack0000000000000010;
            unaff_x24 = lVar5 + 8;
            param_3 = unaff_x23;
            iVar1 = _memcmp(uStack0000000000000010,unaff_x24,unaff_x23);
            if ((puVar3 == (undefined1 *)0x0) || (iVar1 == 0)) {
              uVar9 = 0;
              if (iVar1 != 0) {
                uVar9 = 0x5a;
              }
              param_1 = (ulong)uVar9;
              goto LAB_00793ff8;
            }
          }
          else {
            *puVar3 = 0;
            puVar4 = (undefined8 *)_strlen(lVar5 + 8);
            if (unaff_x23 == puVar4) goto LAB_00793fbc;
          }
          *puVar3 = 0x3b;
          lVar5 = _strstr(puVar3,"sha256//");
          unaff_x24 = 0;
        } while (lVar5 != 0);
        param_1 = 0x5a;
        uVar8 = uStack0000000000000010;
LAB_00793ff8:
        (*pcRam0000000000a2b5f0)(uVar8);
        uStack0000000000000010 = 0;
        (*pcRam0000000000a2b5f0)(lVar2);
        unaff_x19 = lVar2;
      }
    }
  }
  else {
    (*pcRam0000000000a2b5f0)();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return param_1;
  }
  auVar11 = ___stack_chk_fail();
  lVar2 = auVar11._0_8_;
  if (lVar2 != 0) {
    lStack_40 = unaff_x24;
    puStack_38 = unaff_x23;
    uStack_30 = param_1;
    pcStack_28 = unaff_x21;
    pcStack_20 = unaff_x20;
    lStack_18 = unaff_x19;
    func_0x0074066c(auStack_60,0x100000);
    lVar5 = _strstr(lVar2,"-----BEGIN PUBLIC KEY-----");
    if ((lVar5 != 0) &&
       ((lVar6 = lVar5 - lVar2, lVar6 == 0 || (*(char *)(lVar6 + lVar2 + -1) == '\n')))) {
      uVar7 = lVar6 + 0x1a;
      lVar6 = _strstr(lVar2 + uVar7,"\n-----END PUBLIC KEY-----");
      if (lVar6 != 0) {
        if (uVar7 < (ulong)(lVar6 - lVar2)) {
          lVar5 = (lVar6 - lVar5) + -0x1a;
          pcVar10 = (char *)(lVar2 + uVar7);
          do {
            if ((*pcVar10 != '\n' && *pcVar10 != '\r') &&
               (uVar7 = func_0x0074075c(auStack_60,pcVar10,1), (int)uVar7 != 0)) {
              return uVar7;
            }
            pcVar10 = pcVar10 + 1;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        uVar8 = func_0x00740a58(auStack_60);
        uVar7 = func_0x0072923c(uVar8,auVar11._8_8_,param_3);
        func_0x00740678(auStack_60);
        return uVar7;
      }
    }
  }
  return 0x3d;
}

