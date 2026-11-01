
/* WARNING: Type propagation algorithm not settling */

undefined1 * FUN_00757b5c(void)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  ulong in_x3;
  ulong in_x4;
  int *in_x5;
  int iVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  int *unaff_x19;
  ulong unaff_x21;
  ulong uVar11;
  long unaff_x22;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long *plVar12;
  undefined1 *unaff_x26;
  undefined1 *puVar13;
  undefined1 *unaff_x27;
  long lVar14;
  long unaff_x29;
  undefined1 auVar15 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  
  auVar15._8_8_ = unaff_x24;
  auVar15._0_8_ = unaff_x25;
code_r0x00757b5c:
  *unaff_x19 = 0x51;
  puVar6 = unaff_x26;
  iVar2 = func_0x0074075c(unaff_x22,auVar15._8_8_);
  *unaff_x19 = iVar2;
  if (iVar2 != 0) goto LAB_00757ee8;
  if ((long)unaff_x26 < 0) goto LAB_00757ee8;
  unaff_x27 = unaff_x26 + (long)unaff_x27;
  puVar13 = (undefined1 *)0x0;
  lVar14 = *(long *)(auVar15._0_8_ + 0x30);
  if (lVar14 != 0) goto LAB_00757bd8;
LAB_00757a8c:
  if (puVar13 == (undefined1 *)0x0) goto code_r0x00757ea8;
LAB_00757a90:
  lVar14 = auVar15._0_8_;
  auVar15._8_8_ = unaff_x26 + auVar15._8_8_;
  auVar15._0_8_ = lVar14;
  if (*(char *)(lVar14 + 0x48) != '\0') goto code_r0x00757ea8;
  do {
    lVar14 = auVar15._8_8_;
    lVar5 = auVar15._0_8_;
    if (*(long *)(lVar5 + 0x30) != 0) {
      *(undefined8 *)(lVar5 + 0x30) = 0;
      *(undefined8 *)(lVar5 + 0x40) = 0;
      func_0x007406b0(unaff_x22);
    }
    puVar6 = puVar13;
    lVar3 = _memchr(lVar14,10);
    unaff_x26 = puVar13;
    if (lVar3 == 0) goto code_r0x00757b5c;
    *(long *)(lVar5 + 0x30) = lVar14;
    *(long *)(lVar5 + 0x40) = (lVar3 - lVar14) + 1;
    *unaff_x19 = 0;
    unaff_x26 = *(undefined1 **)(lVar5 + 0x40);
    if ((long)unaff_x26 < 0) {
code_r0x00757e9c:
      unaff_x27 = (undefined1 *)0xffffffffffffffff;
      *unaff_x19 = 0;
code_r0x00757ea8:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return unaff_x27;
      }
    }
    else {
      lVar14 = func_0x00156654(unaff_x22);
      puVar6 = *(undefined1 **)(lVar5 + 0x40);
      if (lVar14 == 0) {
code_r0x00757b24:
        if (puVar6 == (undefined1 *)0x0) {
code_r0x00757b98:
          if ((unaff_x21 & 1) != 0) goto code_r0x00757e9c;
        }
        else {
          puVar9 = puVar6 + -1;
          if (puVar9[*(long *)(lVar5 + 0x30)] == '\n') {
            *(undefined1 **)(lVar5 + 0x40) = puVar9;
            if (puVar9 == (undefined1 *)0x0) goto code_r0x00757b98;
            puVar7 = puVar9;
            puVar9 = puVar6 + -2;
            if ((puVar6 + -2)[*(long *)(lVar5 + 0x30)] != '\r') goto code_r0x00757b54;
code_r0x00757bb0:
            puVar7 = puVar9;
            *(undefined1 **)(lVar5 + 0x40) = puVar7;
          }
          else {
            puVar7 = puVar6;
            if (puVar9[*(long *)(lVar5 + 0x30)] == '\r') goto code_r0x00757bb0;
code_r0x00757b54:
            if ((unaff_x21 & 1) != 0) goto code_r0x00757e9c;
          }
          if (*(undefined1 **)(lVar5 + 0x38) < puVar7) goto code_r0x00757e9c;
        }
        *unaff_x19 = 0;
        unaff_x27 = unaff_x26 + (long)unaff_x27;
        puVar13 = puVar13 + -(long)unaff_x26;
        lVar14 = *(long *)(lVar5 + 0x30);
        if (lVar14 == 0) goto LAB_00757a8c;
LAB_00757bd8:
        unaff_x22 = uStack0000000000000048;
        plVar12 = auVar15._0_8_;
        puVar9 = (undefined1 *)plVar12[8];
        if (*plVar12 != 0) {
          if (puVar9 == (undefined1 *)0x0) {
            *(undefined1 *)(plVar12 + 9) = 1;
            func_0x007406b0(uStack0000000000000048);
          }
          else {
            iVar2 = func_0x00740ed8(*plVar12 + 0x30,lVar14);
            *unaff_x19 = iVar2;
            puVar6 = puVar9;
            unaff_x22 = uStack0000000000000048;
joined_r0x00757c00:
            if (iVar2 != 0) {
              if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
                return (undefined1 *)0xffffffffffffffff;
              }
              goto code_r0x00757a40;
            }
          }
          goto LAB_00757a90;
        }
        puVar6 = puVar9;
        lVar5 = _memchr(lVar14,0x20);
        uVar11 = 0;
        iVar8 = 3;
        if ((lVar5 != 0) && (puVar7 = (undefined1 *)(lVar5 - lVar14), puVar7 != (undefined1 *)0x0))
        {
          if (puVar7 < puVar9) {
            lVar3 = 0;
            piVar1 = (int *)(lVar5 + 1);
            do {
              if (puVar9[lVar3 + lVar14] == ' ') {
                uVar11 = 0;
                iVar8 = 3;
                if (lVar3 == 0) goto LAB_00757e64;
                puVar10 = puVar9 + lVar3 + (lVar14 - lVar5) + -1;
                if (puVar10 == (undefined1 *)0x0) goto LAB_00757e64;
                if ((puVar9 + lVar3 + (lVar14 - lVar5) == (undefined1 *)0x2) &&
                   (*(char *)piVar1 == '*')) {
                  unaff_x22 = uStack0000000000000048;
                  piVar1 = (int *)0x0;
joined_r0x00757d4c:
                  in_x5 = piVar1;
                  uStack0000000000000048 = unaff_x22;
                  if (in_stack_00000038 == 0) {
                    in_x4 = 0;
                  }
                  else {
                    in_x4 = _strlen(in_stack_00000038);
                  }
                  in_x3 = in_stack_00000038;
                  iVar2 = func_0x00756954(plVar12,lVar14);
                  uVar11 = 0;
                }
                else {
                  iVar2 = _strncmp("CONNECT",lVar14,puVar7);
                  unaff_x22 = uStack0000000000000048;
                  if (iVar2 == 0) goto joined_r0x00757d4c;
                  if (*(char *)piVar1 == '/') {
                    piVar1 = (int *)0x0;
                    goto joined_r0x00757d4c;
                  }
                  puVar6 = puVar10;
                  in_x3 = in_stack_00000038;
                  if ((ulong)puVar10 >> 0xd != 0) {
code_r0x00757f18:
                    iVar8 = 3;
                    goto LAB_00757f24;
                  }
                  ___memcpy_chk(&uStack0000000000000050,piVar1,puVar10,0x2000);
                  puVar9[lVar3 + in_stack_00000020 + (lVar14 - lVar5)] = 0;
                  puVar6 = (undefined1 *)0x0;
                  in_x3 = 0;
                  lVar5 = func_0x00788b7c(&uStack0000000000000050,0);
                  if (lVar5 == 0) {
                    if ((unaff_x21 & 1) == 0) {
                      unaff_x22 = uStack0000000000000048;
                      piVar1 = (int *)0x0;
                      goto joined_r0x00757d4c;
                    }
                    goto code_r0x00757f18;
                  }
                  uVar11 = func_0x00789260();
                  unaff_x22 = uStack0000000000000048;
                  if (uVar11 == 0) {
                    iVar8 = 0x1b;
                    goto LAB_00757f24;
                  }
                  puVar6 = &uStack0000000000000050;
                  in_x3 = (ulong)in_stack_00000018._4_4_;
                  iVar2 = func_0x0078a0e4(uVar11,0);
                  if (iVar2 != 0) goto code_r0x00757e60;
                  in_x3 = uVar11;
                  in_x4 = in_stack_00000038;
                  iVar2 = func_0x00756b1c(plVar12,lVar14);
                }
                func_0x00789278(uVar11);
                *unaff_x19 = iVar2;
                unaff_x21 = unaff_x21 & 0xffffffff;
                puVar6 = puVar7;
                goto joined_r0x00757c00;
              }
              lVar3 = lVar3 + -1;
            } while (puVar7 < puVar9 + lVar3);
            uVar11 = 0;
code_r0x00757e60:
            iVar8 = 3;
          }
          else {
LAB_00757f24:
            uVar11 = 0;
          }
        }
LAB_00757e64:
        func_0x00789278(uVar11);
        unaff_x27 = (undefined1 *)0xffffffffffffffff;
      }
      else {
        iVar2 = func_0x0074075c(unaff_x22,*(undefined8 *)(lVar5 + 0x30));
        *unaff_x19 = iVar2;
        if (iVar2 == 0) {
          uVar4 = func_0x00740a58(unaff_x22);
          *(undefined8 *)(lVar5 + 0x30) = uVar4;
          puVar6 = (undefined1 *)func_0x00156654(unaff_x22);
          *(undefined1 **)(lVar5 + 0x40) = puVar6;
          goto code_r0x00757b24;
        }
LAB_00757ee8:
        iVar8 = 0;
        if (iVar2 != 0x51) {
          unaff_x27 = (undefined1 *)0xffffffffffffffff;
        }
      }
      *unaff_x19 = iVar8;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return unaff_x27;
      }
    }
code_r0x00757a40:
    auVar15 = ___stack_chk_fail();
    unaff_x27 = (undefined1 *)0x0;
    unaff_x22 = auVar15._0_8_ + 8;
    in_stack_00000018._4_4_ = 0x81a;
    if ((in_x4 & 1) != 0) {
      in_stack_00000018._4_4_ = 0x1a;
    }
    in_stack_00000020 = (long)&uStack0000000000000048 + 7;
    unaff_x19 = in_x5;
    unaff_x21 = in_x4;
    puVar13 = puVar6;
    in_stack_00000038 = in_x3;
    uStack0000000000000048 = unaff_x22;
  } while( true );
}

