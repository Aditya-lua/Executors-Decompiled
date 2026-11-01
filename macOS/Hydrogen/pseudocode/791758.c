
undefined8 * FUN_00791758(long *param_1,long param_2,int *param_3,undefined8 *param_4,int *param_5)

{
  undefined1 *puVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  char *pcVar7;
  char *pcVar8;
  undefined8 *puVar9;
  int *piVar10;
  long *plVar11;
  undefined8 *puVar12;
  int *unaff_x24;
  undefined8 unaff_x25;
  long lVar13;
  undefined *unaff_x27;
  long lVar14;
  undefined *unaff_x28;
  undefined1 auVar15 [16];
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000031;
  long lStack0000000000000130;
  undefined1 auStack_178 [8];
  long lStack_170;
  long alStack_168 [32];
  long lStack_68;
  undefined *puStack_60;
  undefined *puStack_58;
  long lStack_50;
  undefined8 uStack_48;
  int *piStack_40;
  int *piStack_38;
  undefined8 *puStack_30;
  undefined8 *puStack_28;
  long lStack_20;
  long *plStack_18;
  undefined1 *puStack_10;
  undefined8 uStack_8;
  
  puVar1 = auStack_178 + 0x308;
  lStack0000000000000130 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar13 = *(long *)(param_1[2] + 0x40);
  uStack0000000000000028 = 0;
  pcVar8 = (char *)param_3;
  puVar9 = param_4;
  piVar10 = param_5;
  if (param_4 == (undefined8 *)0x0) {
LAB_00791858:
    iVar3 = 0x51;
    param_3 = unaff_x24;
LAB_00791890:
    *param_5 = iVar3;
LAB_00791894:
    puVar12 = (undefined8 *)0xffffffffffffffff;
  }
  else {
    puVar12 = (undefined8 *)0x0;
    unaff_x25 = *(undefined8 *)(lVar13 + 8);
    unaff_x27 = &UNK_00001b58;
    unaff_x28 = &UNK_00001b63;
    do {
      while( true ) {
        if (((*(byte *)(lVar13 + 0x18) & 1) == 0) &&
           (pcVar8 = (char *)param_5, lVar4 = func_0x00792a90(param_1,param_2,param_5), lVar4 < 0))
        {
          if (*param_5 != 0x51) goto LAB_00791894;
          goto LAB_00791844;
        }
        pcVar8 = (char *)((long)param_4 - (long)puVar12);
        puVar9 = &uStack0000000000000028;
        uVar5 = func_0x00173424(unaff_x25,(undefined1 *)((long)param_3 + (long)puVar12),pcVar8);
        iVar3 = (int)uVar5;
        if (iVar3 == 7000) break;
        if (iVar3 != 0x1b63) {
          if (iVar3 == 0x1b62) {
            pcVar7 = "rustls: peer closed TCP connection without first closing TLS connection";
          }
          else {
            puVar9 = &uStack0000000000000020;
            pcVar8 = (char *)((long)&section_000000b8.reserved1 + 3);
            func_0x0017816c(uVar5,&uStack0000000000000031,0xff);
            pcVar7 = "rustls_connection_read: %.*s";
          }
          func_0x0073c9e4(param_2,pcVar7);
          iVar3 = 0x38;
          goto LAB_00791890;
        }
        *(byte *)(lVar13 + 0x18) = *(byte *)(lVar13 + 0x18) & 0xfe;
        if (param_4 <= puVar12) goto LAB_00791844;
      }
      if (uStack0000000000000028 == 0) goto LAB_00791848;
      puVar12 = (undefined8 *)(uStack0000000000000028 + (long)puVar12);
    } while (puVar12 < param_4);
LAB_00791844:
    unaff_x24 = param_3;
    if (puVar12 == (undefined8 *)0x0) goto LAB_00791858;
LAB_00791848:
    *param_5 = 0;
  }
  if ((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_2 + 0x18) == 0) {
      if (param_1 != (long *)0x0) goto LAB_007918c4;
    }
    else if ((param_1 != (long *)0x0) &&
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + param_2 + 0x18) + 8))) {
LAB_007918c4:
      if (0 < *(int *)(*param_1 + 0xc)) {
        pcVar8 = "cf_recv(len=%zu) -> %zd, %d";
        func_0x0073cbdc(param_2,param_1,"cf_recv(len=%zu) -> %zd, %d");
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000130) {
    return puVar12;
  }
  auVar15 = ___stack_chk_fail();
  lVar4 = auVar15._8_8_;
  plVar11 = auVar15._0_8_;
  uStack_8 = 0x791930;
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar14 = *(long *)(plVar11[2] + 0x40);
  lStack_170 = 0;
  uVar5 = *(undefined8 *)(lVar14 + 8);
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  lStack_50 = lVar13;
  uStack_48 = unaff_x25;
  piStack_40 = param_3;
  piStack_38 = param_5;
  puStack_30 = puVar12;
  puStack_28 = param_4;
  lStack_20 = param_2;
  plStack_18 = param_1;
  puStack_10 = puVar1;
  if ((((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar4 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar4 + 0x18) + 8))))) && (0 < *(int *)(*plVar11 + 0xc))) {
    func_0x0073cbdc(lVar4,plVar11,"cf_send(len=%zu)");
  }
  if (*(long *)(lVar14 + 0x10) == 0) {
    puVar12 = (undefined8 *)0x0;
  }
  else {
    iVar3 = func_0x00792cd4(plVar11,lVar4,uVar5);
    *piVar10 = iVar3;
    if ((((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar4 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar4 + 0x18) + 8))))) && (0 < *(int *)(*plVar11 + 0xc))) {
      func_0x0073cbdc(lVar4,plVar11,"cf_send: flushing %zu previously added bytes -> %d");
      iVar3 = *piVar10;
    }
    if (iVar3 != 0) goto code_r0x00791b18;
    puVar12 = *(undefined8 **)(lVar14 + 0x10);
    *(undefined8 *)(lVar14 + 0x10) = 0;
    bVar2 = puVar9 < puVar12;
    puVar9 = (undefined8 *)((long)puVar9 - (long)puVar12);
    if (bVar2 || puVar9 == (undefined8 *)0x0) goto code_r0x00791b3c;
    pcVar8 = (char *)((long)pcVar8 + (long)puVar12);
  }
  if (puVar9 == (undefined8 *)0x0) goto code_r0x00791b3c;
  if ((((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar4 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar4 + 0x18) + 8))))) && (0 < *(int *)(*plVar11 + 0xc))) {
    func_0x0073cbdc(lVar4,plVar11,"cf_send: adding %zu plain bytes to Rustls");
  }
  uVar6 = func_0x00173348(uVar5,pcVar8,puVar9,&lStack_170);
  if ((int)uVar6 == 7000) {
    if (lStack_170 != 0) goto code_r0x00791b3c;
    pcVar8 = "rustls_connection_write: EOF";
  }
  else {
    plVar11 = alStack_168;
    func_0x0017816c(uVar6,alStack_168,0x100,auStack_178);
    pcVar8 = "rustls_connection_write: %.*s";
  }
  func_0x0073c9e4(lVar4,pcVar8);
  *piVar10 = 0x17;
code_r0x00791b18:
  puVar12 = (undefined8 *)0xffffffffffffffff;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return (undefined8 *)0xffffffffffffffff;
  }
  do {
    while( true ) {
      ___stack_chk_fail();
code_r0x00791b3c:
      iVar3 = func_0x00792cd4(plVar11,lVar4,uVar5);
      *piVar10 = iVar3;
      if (iVar3 != 0) break;
      puVar12 = (undefined8 *)(lStack_170 + (long)puVar12);
      if ((((lVar4 == 0) || (-1 < *(char *)(lVar4 + 0xa1d))) ||
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar4 + 0x18) != 0 &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar4 + 0x18) + 8) < 1)))) || (*(int *)(*plVar11 + 0xc) < 1)) {
code_r0x00791c44:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
          return puVar12;
        }
      }
      else {
        func_0x0073cbdc(lVar4,plVar11,"cf_send(len=%zu) -> %d, %zd");
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
          return puVar12;
        }
      }
    }
    if (iVar3 != 0x51) {
      puVar12 = (undefined8 *)0xffffffffffffffff;
      goto code_r0x00791c44;
    }
    if (((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar4 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar4 + 0x18) + 8))) && (0 < *(int *)(*plVar11 + 0xc))))) {
      func_0x0073cbdc(lVar4,plVar11,
                      "cf_send: EAGAIN, remember we added %zu plain bytes already to Rustls");
    }
    *(long *)(lVar14 + 0x10) = lStack_170;
    if (puVar12 == (undefined8 *)0x0) goto code_r0x00791b18;
    *piVar10 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
      return puVar12;
    }
  } while( true );
}

