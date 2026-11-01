
ulong FUN_006e6984(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 auVar1 [12];
  undefined1 *puVar2;
  int iVar3;
  long lVar4;
  int *piVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 ******ppppppuVar9;
  undefined *puVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000020;
  int iStack_1f4;
  int iStack_1b4;
  undefined1 auStack_1b0 [16];
  undefined8 ******ppppppuStack_1a0;
  undefined *puStack_198;
  int iStack_184;
  undefined8 ******ppppppuStack_160;
  undefined *puStack_158;
  int iStack_144;
  undefined1 auStack_140 [16];
  undefined8 ******ppppppuStack_130;
  undefined *puStack_128;
  undefined8 ******ppppppuStack_100;
  undefined *puStack_f8;
  undefined1 auStack_f0 [16];
  undefined8 ******ppppppuStack_e0;
  undefined *puStack_d8;
  undefined1 auStack_d0 [12];
  int iStack_c4;
  undefined8 *****pppppuStack_a0;
  undefined *puStack_98;
  int iStack_84;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 ****ppppuStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 **ppuStack_40;
  undefined *puStack_38;
  undefined1 *puStack_10;
  undefined *puStack_8;
  
  uVar6 = func_0x006e17a8();
  if ((int)uVar6 != 0) {
    return uVar6;
  }
  auVar11 = func_0x006e644c(param_1,"stack overflow (%s)");
  puStack_8 = &SUB_006e69bc;
  puStack_10 = &uStack0000000000000020;
  uVar6 = func_0x006e21f8();
  if ((int)uVar6 == (int)param_3) {
    return uVar6;
  }
  auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,param_3);
  puStack_38 = &DAT_006e6a04;
  uStack_50 = auVar11._8_8_;
  uStack_48 = param_3;
  ppuStack_40 = (undefined8 **)&puStack_10;
  uVar6 = func_0x006e21f8();
  if ((int)uVar6 != -1) {
    return uVar6;
  }
  uStack_60 = auVar12._8_8_;
  auVar11 = func_0x006e644c(auVar12._0_8_,"missing argument #%d");
  uStack_68 = 0x6e6a4c;
  uStack_80 = auVar12._8_8_;
  uStack_78 = auVar12._0_8_;
  ppppuStack_70 = (undefined8 ****)&ppuStack_40;
  uVar6 = func_0x006e29f0(auVar11._0_8_,auVar11._8_8_,&iStack_84);
  if (iStack_84 != 0) {
    return uVar6;
  }
  auVar11 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
  puStack_98 = &DAT_006e6a94;
  pppppuStack_a0 = &ppppuStack_70;
  uVar6 = func_0x006e21f8();
  if (((int)uVar6 < 1) ||
     (uVar6 = func_0x006e29f0(auVar11._0_8_,auVar11._8_8_,&iStack_c4), iStack_c4 != 0)) {
    return uVar6;
  }
  auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
  auVar1 = auVar12._0_12_;
  puStack_d8 = &DAT_006e6b04;
  ppppppuStack_e0 = &pppppuStack_a0;
  auStack_f0 = auVar11;
  iVar3 = func_0x006e21f8();
  if (iVar3 == 1) {
    puVar2 = auStack_d0;
    ppppppuVar9 = ppppppuStack_e0;
    puVar10 = puStack_d8;
  }
  else {
    uVar6 = 1;
    auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
    auVar1 = auVar11._0_12_;
    puStack_f8 = &DAT_006e6b48;
    ppppppuStack_100 = &ppppppuStack_e0;
    iVar3 = func_0x006e21f8();
    if (iVar3 < 1) {
      return uVar6;
    }
    iVar3 = func_0x006e21f8(auVar11._0_8_,auVar11._8_8_);
    if (iVar3 != 1) {
      auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,1);
      puStack_128 = &SUB_006e6bc0;
      ppppppuStack_130 = &ppppppuStack_100;
      auStack_140 = auVar11;
      uVar6 = func_0x006e2ab8(auVar12._0_8_,auVar12._8_8_,&iStack_144);
      if (iStack_144 != 0) {
        return uVar6;
      }
      uVar6 = 3;
      auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
      puStack_158 = &SUB_006e6c08;
      ppppppuStack_160 = &ppppppuStack_130;
      iVar3 = func_0x006e21f8();
      if (0 < iVar3) {
        uVar6 = func_0x006e2ab8(auVar11._0_8_,auVar11._8_8_,&iStack_184);
        if (iStack_184 == 0) {
          auVar12 = func_0x006e694c(auVar11._0_8_,auVar11._8_8_,3);
          puStack_198 = &SUB_006e6c78;
          ppppppuStack_1a0 = &ppppppuStack_160;
          auStack_1b0 = auVar11;
          uVar6 = func_0x006e2b80(auVar12._0_8_,auVar12._8_8_,&iStack_1b4);
          if (iStack_1b4 != 0) {
            return uVar6;
          }
          uVar6 = 3;
          auVar11 = func_0x006e694c(auVar12._0_8_,auVar12._8_8_);
          iVar3 = func_0x006e21f8();
          if (0 < iVar3) {
            uVar6 = func_0x006e2b80(auVar11._0_8_,auVar11._8_8_,&iStack_1f4);
            if (iStack_1f4 == 0) {
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
    puVar2 = auStack_f0;
    ppppppuVar9 = ppppppuStack_100;
    puVar10 = puStack_f8;
  }
  lVar4 = auVar1._0_8_;
  *(undefined8 *******)(puVar2 + -0x10) = ppppppuVar9;
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

