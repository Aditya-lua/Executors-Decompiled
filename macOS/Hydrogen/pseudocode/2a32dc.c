
/* WARNING: Possible PIC construction at 0x002a3500: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3558: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3524: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002a355c) */
/* WARNING: Removing unreachable block (ram,0x002a3504) */
/* WARNING: Removing unreachable block (ram,0x002a3528) */

void thunk_FUN_002a3310(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4
                       )

{
  undefined8 *****pppppuVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined4 uVar8;
  long lVar9;
  ulong uVar10;
  long *plVar11;
  long unaff_x20;
  undefined8 *****pppppuVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  undefined8 uStack_60;
  undefined8 *puStack_58;
  undefined8 *****pppppuStack_50;
  undefined8 uStack_48;
  
  if (*(char *)(unaff_x20 + 0x28) != '\0') {
    return;
  }
  if (*(long *)(unaff_x20 + 0x10) != 0) {
    lVar9 = *(long *)(unaff_x20 + 0x10) + -1;
    *(long *)(unaff_x20 + 0x10) = lVar9;
    *(undefined8 *)(unaff_x20 + 0x20) = *(undefined8 *)(*(long *)(unaff_x20 + 8) + lVar9 * 8);
    return;
  }
  func_0x0079db4c();
  auVar14 = func_0x0079dcc8();
  puVar6 = auVar14._8_8_;
  pppppuVar1 = (undefined8 *****)((long)register0x00000008 + -0x10);
  if (*(char *)(param_4 + 5) == '\0') {
    uVar13 = param_4[4];
    uVar10 = param_4[2];
    if (uVar10 != param_4[3]) {
      lVar9 = param_4[1];
LAB_002a3408:
      *(undefined8 *)(lVar9 + uVar10 * 8) = uVar13;
      param_4[2] = param_4[2] + 1;
      goto LAB_002a3418;
    }
    uVar2 = 0x20;
    if (uVar10 != 0) {
      uVar2 = uVar10 * 3 >> 1;
    }
    if ((uVar10 < uVar2 && uVar2 >> 0x3d == 0) &&
       (lVar9 = func_0x0036e48c(param_4[1],uVar2 << 3), lVar9 != 0)) {
      param_4[1] = lVar9;
      param_4[3] = uVar2;
      uVar10 = param_4[2];
      goto LAB_002a3408;
    }
    *(undefined2 *)(param_4 + 5) = 0x101;
    puVar5 = (undefined8 *)func_0x0029e340(param_4);
  }
  else {
LAB_002a3418:
    puVar5 = (undefined8 *)func_0x0029e340(param_4);
  }
  if (puVar5 != (undefined8 *)0x0) {
    if (puVar5 != puVar6) {
      iVar4 = func_0x0029afb8(puVar5,(long)*(int *)(puVar6 + 1));
      if (iVar4 == 0) goto LAB_002a3478;
      uVar8 = 0;
      if (*(int *)(puVar6 + 1) != 0) {
        _memcpy(*puVar5,*puVar6,(long)*(int *)(puVar6 + 1) << 3);
        uVar8 = *(undefined4 *)(puVar6 + 1);
      }
      *(undefined4 *)(puVar5 + 1) = uVar8;
      *(undefined4 *)(puVar5 + 2) = *(undefined4 *)(puVar6 + 2);
    }
    func_0x002aadb8(auVar14._0_8_,puVar5,param_3);
  }
LAB_002a3478:
  if (*(char *)(param_4 + 5) != '\0') {
    return;
  }
  if (param_4[2] != 0) {
    lVar9 = param_4[2] + -1;
    param_4[2] = lVar9;
    param_4[4] = *(undefined8 *)(param_4[1] + lVar9 * 8);
    return;
  }
  puVar6 = (undefined8 *)func_0x0079db4c();
  if (puVar6 == (undefined8 *)0x0) {
    return;
  }
  puVar5 = &uStack_60;
  uStack_48 = 0x2a34e0;
  pppppuVar12 = &pppppuStack_50;
  uStack_60 = param_3;
  puStack_58 = param_4;
  pppppuStack_50 = pppppuVar1;
  if ((*(uint *)((long)puVar6 + 0x14) >> 1 & 1) == 0) {
    puVar5 = &uStack_60;
    puVar7 = (undefined8 *)*puVar6;
    uVar13 = 0x2a3504;
  }
  else {
    puVar7 = puVar6;
    if ((*(uint *)((long)puVar6 + 0x14) & 1) == 0) {
      *puVar6 = 0;
      uVar3 = *(uint *)((long)puVar6 + 0x2c);
      if ((uVar3 >> 1 & 1) == 0) {
        func_0x0036e3d8(puVar6[3]);
        uVar3 = *(uint *)((long)puVar6 + 0x2c);
      }
      if ((uVar3 & 1) == 0) {
        puVar6[3] = 0;
        puVar5 = (undefined8 *)((long)register0x00000008 + -0x40);
        puVar6 = puStack_58;
        param_3 = uStack_60;
        pppppuVar12 = pppppuStack_50;
        uVar13 = uStack_48;
      }
      else {
        uVar13 = 0x2a355c;
        puVar5 = &uStack_60;
        puVar7 = puVar6 + 3;
      }
    }
    else {
      uVar13 = 0x2a3528;
    }
  }
  *(undefined8 *)((long)puVar5 + -0x20) = param_3;
  *(undefined8 **)((long)puVar5 + -0x18) = puVar6;
  *(undefined8 ******)((long)puVar5 + -0x10) = pppppuVar12;
  *(undefined8 *)((long)puVar5 + -8) = uVar13;
  if (puVar7 == (undefined8 *)0x0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar11 = puVar7 + -1;
    if (*plVar11 + 8 != 0) {
      _bzero(plVar11,*plVar11 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar11);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)(puVar7,"",0);
    return;
  }
  auVar14 = func_0x0079fc90();
  *(undefined8 *)((long)puVar5 + -0x40) = param_3;
  *(undefined8 **)((long)puVar5 + -0x38) = puVar7;
  *(undefined1 **)((long)puVar5 + -0x30) = (undefined1 *)((long)puVar5 + -0x10);
  *(undefined **)((long)puVar5 + -0x28) = &_aws_lc_0_24_0_OPENSSL_cleanse;
  if (auVar14._8_8_ != 0) {
    _bzero(auVar14._0_8_);
  }
  return;
}

