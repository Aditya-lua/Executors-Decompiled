
void FUN_00054c28(undefined8 param_1,long param_2)

{
  ulong uVar1;
  char cVar2;
  long *plVar3;
  code *pcVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  long *plVar9;
  undefined8 *puVar10;
  char *pcVar11;
  undefined8 *unaff_x21;
  long in_stack_00000008;
  undefined8 in_stack_00000018;
  long lStack0000000000000020;
  undefined1 uStack0000000000000028;
  undefined1 uStack0000000000000029;
  undefined1 uStack000000000000002a;
  undefined1 uStack000000000000002b;
  undefined1 uStack000000000000002c;
  undefined1 uStack000000000000002d;
  undefined1 uStack000000000000002e;
  undefined1 uStack000000000000002f;
  undefined7 uStack0000000000000030;
  long lStack0000000000000038;
  undefined4 uStack0000000000000040;
  char cStack0000000000000044;
  char cStack0000000000000045;
  undefined1 uStack0000000000000046;
  undefined1 uStack0000000000000047;
  undefined7 uStack0000000000000048;
  undefined1 uStack0000000000000057;
  undefined8 uStack0000000000000058;
  
  *(undefined8 *)(param_2 + 0x40) = param_1;
  puVar10 = *(undefined8 **)(param_2 + 0x38);
  *puVar10 = CONCAT26(s_Roblox_WinInet_008d181d._6_2_,s_Roblox_WinInet_008d181d._0_6_);
  *(ulong *)((long)puVar10 + 6) =
       CONCAT62(s_Roblox_WinInet_008d181d._8_6_,s_Roblox_WinInet_008d181d._6_2_);
  *(undefined1 *)((long)puVar10 + 0xe) = 0;
  if ((long)_uStack0000000000000048 < 0) {
    __ZdlPv(lStack0000000000000038);
  }
  _uStack0000000000000048 = CONCAT17(0xe,uStack0000000000000048);
  lStack0000000000000038._0_1_ = s_Roblox_Game_Id_008d1837[0];
  lStack0000000000000038._1_5_ = s_Roblox_Game_Id_008d1837._1_5_;
  lStack0000000000000038._6_1_ = s_Roblox_Game_Id_008d1837[6];
  lStack0000000000000038._7_1_ = s_Roblox_Game_Id_008d1837[7];
  uStack0000000000000040 = s_Roblox_Game_Id_008d1837._8_4_;
  cStack0000000000000044 = s_Roblox_Game_Id_008d1837[0xc];
  cStack0000000000000045 = s_Roblox_Game_Id_008d1837[0xd];
  uStack0000000000000046 = 0;
  lStack0000000000000020 = (long)&lStack0000000000000038;
  lVar6 = func_0x00055960();
  uVar7 = uRam0000000000a333e0;
  puVar10 = (undefined8 *)(lVar6 + 0x38);
  if (puVar10 != (undefined8 *)0xa333e0) {
    if (*(char *)(lVar6 + 0x4f) < '\0') {
      uVar8 = uRam0000000000a333e8;
      if (-1 < (char)bRam0000000000a333f7) {
        uVar7 = 0xa333e0;
        uVar8 = (ulong)bRam0000000000a333f7;
      }
      func_0x00017784(puVar10,uVar7,uVar8);
    }
    else if ((char)bRam0000000000a333f7 < '\0') {
      func_0x000176c0(puVar10,uRam0000000000a333e0,uRam0000000000a333e8);
    }
    else {
      *(ulong *)(lVar6 + 0x40) = uRam0000000000a333e8;
      *puVar10 = uVar7;
      *(ulong *)(lVar6 + 0x48) = CONCAT17(bRam0000000000a333f7,uRam0000000000a333f0);
    }
  }
  if ((long)_uStack0000000000000048 < 0) {
    __ZdlPv(CONCAT26(lStack0000000000000038._6_2_,
                     CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038)));
  }
  func_0x0000ad38(&lStack0000000000000038);
  _uStack0000000000000030 = CONCAT17(0x14,uStack0000000000000030);
  uStack0000000000000028 = s_Hydrogen_Fingerprint_008d1846[8];
  uStack0000000000000029 = s_Hydrogen_Fingerprint_008d1846[9];
  uStack000000000000002a = s_Hydrogen_Fingerprint_008d1846[10];
  uStack000000000000002b = s_Hydrogen_Fingerprint_008d1846[0xb];
  uStack000000000000002c = s_Hydrogen_Fingerprint_008d1846[0xc];
  uStack000000000000002d = s_Hydrogen_Fingerprint_008d1846[0xd];
  uStack000000000000002e = s_Hydrogen_Fingerprint_008d1846[0xe];
  uStack000000000000002f = s_Hydrogen_Fingerprint_008d1846[0xf];
  lStack0000000000000020._0_1_ = s_Hydrogen_Fingerprint_008d1846[0];
  lStack0000000000000020._1_1_ = s_Hydrogen_Fingerprint_008d1846[1];
  lStack0000000000000020._2_1_ = s_Hydrogen_Fingerprint_008d1846[2];
  lStack0000000000000020._3_1_ = s_Hydrogen_Fingerprint_008d1846[3];
  lStack0000000000000020._4_1_ = s_Hydrogen_Fingerprint_008d1846[4];
  lStack0000000000000020._5_1_ = s_Hydrogen_Fingerprint_008d1846[5];
  lStack0000000000000020._6_1_ = s_Hydrogen_Fingerprint_008d1846[6];
  lStack0000000000000020._7_1_ = s_Hydrogen_Fingerprint_008d1846[7];
  _uStack0000000000000030 = CONCAT35(stack0x00000035,0x746e6972);
  uStack0000000000000058 = &lStack0000000000000020;
  lVar6 = func_0x00055960();
  if (*(char *)(lVar6 + 0x4f) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar6 + 0x38));
  }
  *(ulong *)(lVar6 + 0x40) =
       CONCAT17(uStack0000000000000047,
                CONCAT16(uStack0000000000000046,
                         CONCAT15(cStack0000000000000045,
                                  CONCAT14(cStack0000000000000044,uStack0000000000000040))));
  *(undefined8 *)(lVar6 + 0x38) =
       CONCAT26(lStack0000000000000038._6_2_,
                CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038));
  *(ulong *)(lVar6 + 0x48) = _uStack0000000000000048;
  _uStack0000000000000048 = _uStack0000000000000048 & 0xffffffffffffff;
  lStack0000000000000038._0_1_ = 0;
  if (((long)_uStack0000000000000030 < 0) &&
     (__ZdlPv(lStack0000000000000020), (long)_uStack0000000000000048 < 0)) {
    __ZdlPv(CONCAT26(lStack0000000000000038._6_2_,
                     CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038)));
  }
  _uStack0000000000000048 = CONCAT17(0xc,uStack0000000000000048);
  uStack0000000000000040 = 0x65707954;
  lStack0000000000000038._0_1_ = s_Content_Type_008d186c[0];
  lStack0000000000000038._1_5_ = s_Content_Type_008d186c._1_5_;
  lStack0000000000000038._6_2_ = s_Content_Type_008d186c._6_2_;
  cStack0000000000000044 = 0;
  lStack0000000000000020 = (long)&lStack0000000000000038;
  lVar6 = func_0x00055960();
  if (*(char *)(lVar6 + 0x4f) < '\0') {
    *(undefined8 *)(lVar6 + 0x40) = 0x10;
    pcVar11 = *(char **)(lVar6 + 0x38);
  }
  else {
    pcVar11 = (char *)(lVar6 + 0x38);
    *(undefined1 *)(lVar6 + 0x4f) = 0x10;
  }
  uVar7 = s_application_json_008d185b._0_8_;
  *(undefined8 *)(pcVar11 + 8) = s_application_json_008d185b._8_8_;
  *(undefined8 *)pcVar11 = uVar7;
  pcVar11[0x10] = '\0';
  if ((long)_uStack0000000000000048 < 0) {
    __ZdlPv(CONCAT26(lStack0000000000000038._6_2_,
                     CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038)));
  }
  func_0x006e3d18();
  uVar7 = func_0x006e67c8();
  func_0x0002a730(in_stack_00000008,uVar7);
  func_0x006e1d54();
  uVar8 = func_0x00055674(in_stack_00000008);
  if ((uVar8 & 1) == 0) {
    func_0x006e644c();
code_r0x0005545c:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x55460);
    (*pcVar4)();
  }
  func_0x006e3d18();
  iVar5 = func_0x006e24a4();
  if (iVar5 != 0) {
    func_0x006e2ce4();
    func_0x0002a730();
  }
  func_0x006e1d54();
  func_0x006e3d18();
  iVar5 = func_0x006e24a4();
  if (iVar5 == 0) goto LAB_00054f64;
  lStack0000000000000020 = 0;
  uVar7 = func_0x006e2ce4();
  plVar9 = (long *)lStack0000000000000020;
  if ((long *)0x7ffffffffffffff7 < (ulong)lStack0000000000000020) {
    func_0x0001748c(&lStack0000000000000038);
    goto code_r0x0005545c;
  }
  if ((long *)((long)&MACH_HEADER.sizeofcmds + 2) < (ulong)lStack0000000000000020) {
    uVar8 = (lStack0000000000000020 & 0xfffffffffffffff8U) + 8;
    if ((lStack0000000000000020 | 7U) != 0x17) {
      uVar8 = lStack0000000000000020 | 7U;
    }
    puVar10 = (undefined8 *)__Znwm(uVar8 + 1);
    _uStack0000000000000048 = uVar8 + 1 | 0x8000000000000000;
    uStack0000000000000040 = SUB84(plVar9,0);
    cStack0000000000000044 = (char)((ulong)plVar9 >> 0x20);
    cStack0000000000000045 = (char)((ulong)plVar9 >> 0x28);
    uStack0000000000000046 = (undefined1)((ulong)plVar9 >> 0x30);
    uStack0000000000000047 = (undefined1)((ulong)plVar9 >> 0x38);
    lStack0000000000000038._0_1_ = (char)puVar10;
    lStack0000000000000038._1_5_ = (undefined5)((ulong)puVar10 >> 8);
    lStack0000000000000038._6_2_ = (undefined2)((ulong)puVar10 >> 0x30);
LAB_000553e4:
    _memmove(puVar10,uVar7,plVar9);
    *(undefined1 *)((long)puVar10 + (long)plVar9) = 0;
    cVar2 = *(char *)(in_stack_00000008 + 0x47);
  }
  else {
    _uStack0000000000000048 = CONCAT17((char)lStack0000000000000020,uStack0000000000000048);
    puVar10 = &lStack0000000000000038;
    if ((long *)lStack0000000000000020 != (long *)0x0) goto LAB_000553e4;
    lStack0000000000000038._0_1_ = '\0';
    cVar2 = *(char *)(in_stack_00000008 + 0x47);
  }
  if (cVar2 < '\0') {
    __ZdlPv(*unaff_x21);
  }
  unaff_x21[1] = CONCAT17(uStack0000000000000047,
                          CONCAT16(uStack0000000000000046,
                                   CONCAT15(cStack0000000000000045,
                                            CONCAT14(cStack0000000000000044,uStack0000000000000040))
                                  ));
  *unaff_x21 = CONCAT26(lStack0000000000000038._6_2_,
                        CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038));
  unaff_x21[2] = _uStack0000000000000048;
LAB_00054f64:
  func_0x006e1d54();
  func_0x006e3d18();
  iVar5 = func_0x006e21f8();
  if (iVar5 == 6) {
    func_0x006e383c();
    while (iVar5 = func_0x006e52e0(), iVar5 != 0) {
      uVar7 = func_0x006e67c8();
      uVar8 = _strlen();
      if (0x7ffffffffffffff7 < uVar8) {
        func_0x0001748c(&lStack0000000000000038);
        goto code_r0x0005545c;
      }
      if (uVar8 < 0x17) {
        _uStack0000000000000048 = CONCAT17((char)uVar8,uStack0000000000000048);
        puVar10 = &lStack0000000000000038;
        if (uVar8 != 0) goto code_r0x0005502c;
      }
      else {
        uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
        if ((uVar8 | 7) != 0x17) {
          uVar1 = uVar8 | 7;
        }
        puVar10 = (undefined8 *)__Znwm(uVar1 + 1);
        _uStack0000000000000048 = uVar1 + 1 | 0x8000000000000000;
        uStack0000000000000040 = (undefined4)uVar8;
        cStack0000000000000044 = (char)(uVar8 >> 0x20);
        cStack0000000000000045 = (char)(uVar8 >> 0x28);
        uStack0000000000000046 = (undefined1)(uVar8 >> 0x30);
        uStack0000000000000047 = (undefined1)(uVar8 >> 0x38);
        lStack0000000000000038._0_1_ = (char)puVar10;
        lStack0000000000000038._1_5_ = (undefined5)((ulong)puVar10 >> 8);
        lStack0000000000000038._6_2_ = (undefined2)((ulong)puVar10 >> 0x30);
code_r0x0005502c:
        _memmove(puVar10,uVar7,uVar8);
      }
      *(undefined1 *)((long)puVar10 + uVar8) = 0;
      uVar7 = func_0x006e67c8();
      uVar8 = _strlen();
      if (0x7ffffffffffffff7 < uVar8) {
        func_0x0001748c(&lStack0000000000000020);
        goto code_r0x0005545c;
      }
      if (uVar8 < 0x17) {
        _uStack0000000000000030 = CONCAT17((char)uVar8,uStack0000000000000030);
        plVar9 = &lStack0000000000000020;
        if (uVar8 != 0) goto code_r0x000550ac;
      }
      else {
        uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
        if ((uVar8 | 7) != 0x17) {
          uVar1 = uVar8 | 7;
        }
        plVar9 = (long *)__Znwm(uVar1 + 1);
        _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
        lStack0000000000000020 = (long)plVar9;
        _uStack0000000000000028 = uVar8;
code_r0x000550ac:
        _memmove(plVar9,uVar7,uVar8);
      }
      *(undefined1 *)((long)plVar9 + uVar8) = 0;
      uStack0000000000000058 = &lStack0000000000000038;
      lVar6 = func_0x00055b34();
      plVar9 = (long *)(lVar6 + 0x38);
      if (plVar9 != &lStack0000000000000020) {
        if (*(char *)(lVar6 + 0x4f) < '\0') {
          uVar8 = _uStack0000000000000028;
          plVar3 = (long *)lStack0000000000000020;
          if (-1 < (long)_uStack0000000000000030) {
            uVar8 = _uStack0000000000000030 >> 0x38;
            plVar3 = &lStack0000000000000020;
          }
          func_0x00017784(plVar9,plVar3,uVar8);
        }
        else if ((long)_uStack0000000000000030 < 0) {
          func_0x000176c0(plVar9,lStack0000000000000020,_uStack0000000000000028);
        }
        else {
          *(ulong *)(lVar6 + 0x40) = _uStack0000000000000028;
          *plVar9 = lStack0000000000000020;
          *(ulong *)(lVar6 + 0x48) = _uStack0000000000000030;
        }
      }
      func_0x006e1d54();
      if ((long)_uStack0000000000000030 < 0) {
        __ZdlPv(lStack0000000000000020);
      }
      if ((long)_uStack0000000000000048 < 0) {
        __ZdlPv(CONCAT26(lStack0000000000000038._6_2_,
                         CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038)));
      }
    }
  }
  func_0x006e1d54();
  func_0x006e3d18();
  iVar5 = func_0x006e21f8();
  if (iVar5 == 6) {
    func_0x006e383c();
    while (iVar5 = func_0x006e52e0(), iVar5 != 0) {
      uVar7 = func_0x006e67c8();
      uVar8 = _strlen();
      if (0x7ffffffffffffff7 < uVar8) {
        func_0x0001748c(&lStack0000000000000038);
        goto code_r0x0005545c;
      }
      if (uVar8 < 0x17) {
        _uStack0000000000000048 = CONCAT17((char)uVar8,uStack0000000000000048);
        puVar10 = &lStack0000000000000038;
        if (uVar8 != 0) goto code_r0x00055238;
      }
      else {
        uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
        if ((uVar8 | 7) != 0x17) {
          uVar1 = uVar8 | 7;
        }
        puVar10 = (undefined8 *)__Znwm(uVar1 + 1);
        _uStack0000000000000048 = uVar1 + 1 | 0x8000000000000000;
        uStack0000000000000040 = (undefined4)uVar8;
        cStack0000000000000044 = (char)(uVar8 >> 0x20);
        cStack0000000000000045 = (char)(uVar8 >> 0x28);
        uStack0000000000000046 = (undefined1)(uVar8 >> 0x30);
        uStack0000000000000047 = (undefined1)(uVar8 >> 0x38);
        lStack0000000000000038._0_1_ = (char)puVar10;
        lStack0000000000000038._1_5_ = (undefined5)((ulong)puVar10 >> 8);
        lStack0000000000000038._6_2_ = (undefined2)((ulong)puVar10 >> 0x30);
code_r0x00055238:
        _memmove(puVar10,uVar7,uVar8);
      }
      *(undefined1 *)((long)puVar10 + uVar8) = 0;
      uVar7 = func_0x006e67c8();
      uVar8 = _strlen();
      if (0x7ffffffffffffff7 < uVar8) {
        func_0x0001748c(&lStack0000000000000020);
        goto code_r0x0005545c;
      }
      if (uVar8 < 0x17) {
        _uStack0000000000000030 = CONCAT17((char)uVar8,uStack0000000000000030);
        plVar9 = &lStack0000000000000020;
        if (uVar8 != 0) goto code_r0x000552b8;
      }
      else {
        uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
        if ((uVar8 | 7) != 0x17) {
          uVar1 = uVar8 | 7;
        }
        plVar9 = (long *)__Znwm(uVar1 + 1);
        _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
        lStack0000000000000020 = (long)plVar9;
        _uStack0000000000000028 = uVar8;
code_r0x000552b8:
        _memmove(plVar9,uVar7,uVar8);
      }
      *(undefined1 *)((long)plVar9 + uVar8) = 0;
      uStack0000000000000058 = &lStack0000000000000038;
      lVar6 = func_0x00055b34(in_stack_00000018,&lStack0000000000000038,&UNK_0080364f,
                              &uStack0000000000000058,&uStack0000000000000057);
      plVar9 = (long *)(lVar6 + 0x38);
      if (plVar9 != &lStack0000000000000020) {
        if (*(char *)(lVar6 + 0x4f) < '\0') {
          uVar8 = _uStack0000000000000028;
          plVar3 = (long *)lStack0000000000000020;
          if (-1 < (long)_uStack0000000000000030) {
            uVar8 = _uStack0000000000000030 >> 0x38;
            plVar3 = &lStack0000000000000020;
          }
          func_0x00017784(plVar9,plVar3,uVar8);
        }
        else if ((long)_uStack0000000000000030 < 0) {
          func_0x000176c0(plVar9,lStack0000000000000020,_uStack0000000000000028);
        }
        else {
          *(ulong *)(lVar6 + 0x40) = _uStack0000000000000028;
          *plVar9 = lStack0000000000000020;
          *(ulong *)(lVar6 + 0x48) = _uStack0000000000000030;
        }
      }
      func_0x006e1d54();
      if ((long)_uStack0000000000000030 < 0) {
        __ZdlPv(lStack0000000000000020);
      }
      if ((long)_uStack0000000000000048 < 0) {
        __ZdlPv(CONCAT26(lStack0000000000000038._6_2_,
                         CONCAT51(lStack0000000000000038._1_5_,(char)lStack0000000000000038)));
      }
    }
  }
  func_0x006e1d54();
  func_0x006e1d54();
  return;
}

