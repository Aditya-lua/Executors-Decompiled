
/* WARNING: Type propagation algorithm not settling */

ulong FUN_006e6a20(ulong param_1)

{
  undefined1 auVar1 [12];
  undefined1 *puVar2;
  int iVar3;
  long lVar4;
  int *piVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 *******pppppppuVar9;
  undefined *puVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  int iStack_194;
  int iStack_154;
  undefined1 auStack_150 [16];
  undefined8 *******pppppppuStack_140;
  undefined *puStack_138;
  int iStack_124;
  undefined8 *******pppppppuStack_100;
  undefined *puStack_f8;
  int iStack_e4;
  undefined1 auStack_e0 [16];
  undefined8 *******pppppppuStack_d0;
  undefined *puStack_c8;
  undefined8 *******pppppppuStack_a0;
  undefined *puStack_98;
  undefined1 auStack_90 [16];
  undefined8 *******pppppppuStack_80;
  undefined *puStack_78;
  undefined1 auStack_70 [12];
  int iStack_64;
  undefined8 ******ppppppuStack_40;
  undefined *puStack_38;
  int iStack_24;
  
  if ((int)param_1 != -1) {
    return param_1;
  }
  auVar11 = func_0x006e644c();
  uVar6 = func_0x006e29f0(auVar11._0_8_,auVar11._8_8_,&iStack_24);
  if (iStack_24 != 0) {
    return uVar6;
  }
  auVar11 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
  puStack_38 = &DAT_006e6a94;
  ppppppuStack_40 = (undefined8 ******)(auStack_70 + 0x60);
  uVar6 = func_0x006e21f8();
  if (((int)uVar6 < 1) ||
     (uVar6 = func_0x006e29f0(auVar11._0_8_,auVar11._8_8_,&iStack_64), iStack_64 != 0)) {
    return uVar6;
  }
  auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
  auVar1 = auVar12._0_12_;
  puStack_78 = &DAT_006e6b04;
  pppppppuStack_80 = &ppppppuStack_40;
  auStack_90 = auVar11;
  iVar3 = func_0x006e21f8();
  if (iVar3 == 1) {
    puVar2 = auStack_70;
    pppppppuVar9 = pppppppuStack_80;
    puVar10 = puStack_78;
  }
  else {
    uVar6 = 1;
    auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
    auVar1 = auVar11._0_12_;
    puStack_98 = &DAT_006e6b48;
    pppppppuStack_a0 = &pppppppuStack_80;
    iVar3 = func_0x006e21f8();
    if (iVar3 < 1) {
      return uVar6;
    }
    iVar3 = func_0x006e21f8(auVar11._0_8_,auVar11._8_8_);
    if (iVar3 != 1) {
      auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,1);
      puStack_c8 = &SUB_006e6bc0;
      pppppppuStack_d0 = &pppppppuStack_a0;
      auStack_e0 = auVar11;
      uVar6 = func_0x006e2ab8(auVar12._0_8_,auVar12._8_8_,&iStack_e4);
      if (iStack_e4 != 0) {
        return uVar6;
      }
      uVar6 = 3;
      auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
      puStack_f8 = &SUB_006e6c08;
      pppppppuStack_100 = &pppppppuStack_d0;
      iVar3 = func_0x006e21f8();
      if (0 < iVar3) {
        uVar6 = func_0x006e2ab8(auVar11._0_8_,auVar11._8_8_,&iStack_124);
        if (iStack_124 == 0) {
          auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
          puStack_138 = &SUB_006e6c78;
          pppppppuStack_140 = &pppppppuStack_100;
          auStack_150 = auVar11;
          uVar6 = func_0x006e2b80(auVar12._0_8_,auVar12._8_8_,&iStack_154);
          if (iStack_154 != 0) {
            return uVar6;
          }
          uVar6 = 3;
          auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
          iVar3 = func_0x006e21f8();
          if (0 < iVar3) {
            uVar6 = func_0x006e2b80(auVar11._0_8_,auVar11._8_8_,&iStack_194);
            if (iStack_194 == 0) {
              auVar11 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
              uVar6 = func_0x006e30bc();
              if (uVar6 != 0) {
                return uVar6;
              }
              uVar6 = 4;
              auVar11 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,4);
              iVar3 = func_0x006e21f8();
              if (0 < iVar3) {
                uVar6 = func_0x006e30bc(auVar11._0_8_,auVar11._8_8_);
                if (uVar6 == 0) {
                  uVar8 = 4;
                  uVar7 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,4);
                  uVar6 = func_0x006e4310();
                  if ((int)uVar6 != 0) {
                    func_0x006e3964(uVar7,uVar8);
                    func_0x006e3ee0(uVar7,0xfffffffe);
                    iVar3 = func_0x006e21f8(uVar7,0xffffffff);
                    if (iVar3 == 0) {
                      func_0x006e1d54(uVar7,0xfffffffd);
                      return 0;
                    }
                    func_0x006e1e44(uVar7,0xfffffffe);
                    uVar6 = 1;
                  }
                  return uVar6;
                }
              }
              return uVar6;
            }
          }
          return uVar6;
        }
      }
      return uVar6;
    }
    puVar2 = auStack_90;
    pppppppuVar9 = pppppppuStack_a0;
    puVar10 = puStack_98;
  }
  lVar4 = auVar1._0_8_;
  *(undefined8 ********)(puVar2 + -0x10) = pppppppuVar9;
  *(undefined **)(puVar2 + -8) = puVar10;
  iVar3 = auVar1._8_4_;
  if (iVar3 < 1) {
    if (iVar3 < -9999) {
      piVar5 = (int *)func_0x006e60a0();
      iVar3 = piVar5[3];
      if (iVar3 == 0) {
        return 0;
      }
      goto code_r0x006e2ca4;
    }
    piVar5 = (int *)(*(long *)(lVar4 + 8) + (long)iVar3 * 0x10);
  }
  else {
    piVar5 = (int *)(*(long *)(lVar4 + 0x10) + (ulong)(iVar3 - 1) * 0x10);
    if (*(int **)(lVar4 + 8) <= piVar5) {
      lVar4 = __dyld_get_image_header(0);
      piVar5 = (int *)(lVar4 + 0x4e8dd08);
      iVar3 = *(int *)(lVar4 + 0x4e8dd14);
      if (iVar3 == 0) {
        return 0;
      }
      goto code_r0x006e2ca4;
    }
  }
  iVar3 = piVar5[3];
  if (iVar3 == 0) {
    return 0;
  }
code_r0x006e2ca4:
  if (iVar3 == 1) {
    return (ulong)(*piVar5 != 0);
  }
  return 1;
}

