
undefined1 *
FUN_00757ac0(undefined8 param_1,undefined8 param_2,undefined1 *param_3,ulong param_4,ulong param_5,
            int *param_6)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  int *unaff_x19;
  long lVar8;
  ulong unaff_x21;
  ulong uVar9;
  long unaff_x22;
  undefined1 *puVar10;
  undefined8 unaff_x24;
  long lVar11;
  undefined8 unaff_x25;
  long *plVar12;
  undefined1 *unaff_x26;
  undefined1 *puVar13;
  undefined1 *unaff_x27;
  long unaff_x29;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  
  auVar14._8_8_ = unaff_x24;
  auVar14._0_8_ = unaff_x25;
  do {
    lVar11 = auVar14._8_8_;
    plVar12 = auVar14._0_8_;
    lVar3 = _memchr(param_1,param_2);
    if (lVar3 == 0) {
      *unaff_x19 = 0x51;
      param_3 = unaff_x26;
      iVar2 = func_0x0074075c(unaff_x22,lVar11);
      *unaff_x19 = iVar2;
      puVar6 = param_3;
      if ((iVar2 == 0) && (-1 < (long)unaff_x26)) {
        unaff_x27 = unaff_x26 + (long)unaff_x27;
        puVar13 = (undefined1 *)0x0;
        lVar3 = plVar12[6];
        if (lVar3 != 0) goto LAB_00757bd8;
LAB_00757a8c:
        if (puVar13 != (undefined1 *)0x0) goto LAB_00757a90;
        goto code_r0x00757ea8;
      }
LAB_00757ee8:
      iVar5 = 0;
      if (iVar2 != 0x51) {
        unaff_x27 = (undefined1 *)0xffffffffffffffff;
      }
code_r0x00757e7c:
      *unaff_x19 = iVar5;
      puVar10 = puVar6;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return unaff_x27;
      }
code_r0x00757a40:
      auVar14 = ___stack_chk_fail();
      unaff_x27 = (undefined1 *)0x0;
      unaff_x22 = auVar14._0_8_ + 8;
      in_stack_00000018._4_4_ = 0x81a;
      if ((param_5 & 1) != 0) {
        in_stack_00000018._4_4_ = 0x1a;
      }
      in_stack_00000020 = (long)&uStack0000000000000048 + 7;
      unaff_x19 = param_6;
      unaff_x21 = param_5;
      puVar13 = puVar10;
      in_stack_00000038 = param_4;
      uStack0000000000000048 = unaff_x22;
    }
    else {
      plVar12[6] = lVar11;
      plVar12[8] = (lVar3 - lVar11) + 1;
      *unaff_x19 = 0;
      puVar10 = (undefined1 *)plVar12[8];
      if ((long)puVar10 < 0) {
LAB_00757e9c:
        unaff_x27 = (undefined1 *)0xffffffffffffffff;
        *unaff_x19 = 0;
code_r0x00757ea8:
        puVar10 = param_3;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return unaff_x27;
        }
        goto code_r0x00757a40;
      }
      lVar3 = func_0x00156654(unaff_x22);
      param_3 = (undefined1 *)plVar12[8];
      if (lVar3 != 0) {
        iVar2 = func_0x0074075c(unaff_x22,plVar12[6]);
        *unaff_x19 = iVar2;
        puVar6 = param_3;
        if (iVar2 != 0) goto LAB_00757ee8;
        lVar3 = func_0x00740a58(unaff_x22);
        plVar12[6] = lVar3;
        param_3 = (undefined1 *)func_0x00156654(unaff_x22);
        plVar12[8] = (long)param_3;
      }
      if (param_3 == (undefined1 *)0x0) {
LAB_00757b98:
        if ((unaff_x21 & 1) != 0) goto LAB_00757e9c;
      }
      else {
        puVar6 = param_3 + -1;
        if (puVar6[plVar12[6]] == '\n') {
          plVar12[8] = (long)puVar6;
          if (puVar6 == (undefined1 *)0x0) goto LAB_00757b98;
          puVar13 = puVar6;
          puVar6 = param_3 + -2;
          if ((param_3 + -2)[plVar12[6]] != '\r') goto code_r0x00757b54;
LAB_00757bb0:
          puVar13 = puVar6;
          plVar12[8] = (long)puVar13;
        }
        else {
          puVar13 = param_3;
          if (puVar6[plVar12[6]] == '\r') goto LAB_00757bb0;
code_r0x00757b54:
          if ((unaff_x21 & 1) != 0) goto LAB_00757e9c;
        }
        if ((undefined1 *)plVar12[7] < puVar13) goto LAB_00757e9c;
      }
      *unaff_x19 = 0;
      unaff_x27 = puVar10 + (long)unaff_x27;
      puVar13 = unaff_x26 + -(long)puVar10;
      lVar3 = plVar12[6];
      unaff_x26 = puVar10;
      if (lVar3 == 0) goto LAB_00757a8c;
LAB_00757bd8:
      unaff_x22 = uStack0000000000000048;
      puVar10 = (undefined1 *)plVar12[8];
      if (*plVar12 == 0) {
        puVar6 = puVar10;
        lVar4 = _memchr(lVar3,0x20);
        uVar9 = 0;
        iVar5 = 3;
        if ((lVar4 != 0) && (param_3 = (undefined1 *)(lVar4 - lVar3), param_3 != (undefined1 *)0x0))
        {
          if (param_3 < puVar10) {
            lVar8 = 0;
            piVar1 = (int *)(lVar4 + 1);
            do {
              if (puVar10[lVar8 + lVar3] == ' ') {
                uVar9 = 0;
                iVar5 = 3;
                if (lVar8 == 0) goto LAB_00757e64;
                puVar7 = puVar10 + lVar8 + (lVar3 - lVar4) + -1;
                if (puVar7 == (undefined1 *)0x0) goto LAB_00757e64;
                if ((puVar10 + lVar8 + (lVar3 - lVar4) == (undefined1 *)0x2) &&
                   (*(char *)piVar1 == '*')) {
                  unaff_x22 = uStack0000000000000048;
                  piVar1 = (int *)0x0;
joined_r0x00757d4c:
                  param_6 = piVar1;
                  uStack0000000000000048 = unaff_x22;
                  if (in_stack_00000038 == 0) {
                    param_5 = 0;
                  }
                  else {
                    param_5 = _strlen(in_stack_00000038);
                  }
                  param_4 = in_stack_00000038;
                  iVar2 = func_0x00756954(plVar12,lVar3);
                  uVar9 = 0;
                }
                else {
                  iVar2 = _strncmp("CONNECT",lVar3,param_3);
                  unaff_x22 = uStack0000000000000048;
                  if (iVar2 == 0) goto joined_r0x00757d4c;
                  if (*(char *)piVar1 == '/') {
                    piVar1 = (int *)0x0;
                    goto joined_r0x00757d4c;
                  }
                  puVar6 = puVar7;
                  param_4 = in_stack_00000038;
                  if ((ulong)puVar7 >> 0xd != 0) {
code_r0x00757f18:
                    iVar5 = 3;
                    goto LAB_00757f24;
                  }
                  ___memcpy_chk(&uStack0000000000000050,piVar1,puVar7,0x2000);
                  puVar10[lVar8 + in_stack_00000020 + (lVar3 - lVar4)] = 0;
                  puVar6 = (undefined1 *)0x0;
                  param_4 = 0;
                  lVar4 = func_0x00788b7c(&uStack0000000000000050,0);
                  if (lVar4 == 0) {
                    if ((unaff_x21 & 1) == 0) {
                      unaff_x22 = uStack0000000000000048;
                      piVar1 = (int *)0x0;
                      goto joined_r0x00757d4c;
                    }
                    goto code_r0x00757f18;
                  }
                  uVar9 = func_0x00789260();
                  unaff_x22 = uStack0000000000000048;
                  if (uVar9 == 0) {
                    iVar5 = 0x1b;
                    goto LAB_00757f24;
                  }
                  puVar6 = &uStack0000000000000050;
                  param_4 = (ulong)in_stack_00000018._4_4_;
                  iVar2 = func_0x0078a0e4(uVar9,0);
                  if (iVar2 != 0) goto code_r0x00757e60;
                  param_4 = uVar9;
                  param_5 = in_stack_00000038;
                  iVar2 = func_0x00756b1c(plVar12,lVar3);
                }
                func_0x00789278(uVar9);
                *unaff_x19 = iVar2;
                unaff_x21 = unaff_x21 & 0xffffffff;
                puVar10 = param_3;
                if (iVar2 == 0) goto LAB_00757a90;
                goto LAB_00757ef8;
              }
              lVar8 = lVar8 + -1;
            } while (param_3 < puVar10 + lVar8);
            uVar9 = 0;
code_r0x00757e60:
            iVar5 = 3;
          }
          else {
LAB_00757f24:
            uVar9 = 0;
          }
        }
LAB_00757e64:
        func_0x00789278(uVar9);
        unaff_x27 = (undefined1 *)0xffffffffffffffff;
        goto code_r0x00757e7c;
      }
      if (puVar10 == (undefined1 *)0x0) {
        *(undefined1 *)(plVar12 + 9) = 1;
        func_0x007406b0(uStack0000000000000048);
      }
      else {
        iVar2 = func_0x00740ed8(*plVar12 + 0x30,lVar3);
        *unaff_x19 = iVar2;
        param_3 = puVar10;
        unaff_x22 = uStack0000000000000048;
        if (iVar2 != 0) {
LAB_00757ef8:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return (undefined1 *)0xffffffffffffffff;
          }
          goto code_r0x00757a40;
        }
      }
LAB_00757a90:
      auVar14._8_8_ = unaff_x26 + lVar11;
      auVar14._0_8_ = plVar12;
      if ((char)plVar12[9] != '\0') goto code_r0x00757ea8;
    }
    param_3 = puVar13;
    param_1 = auVar14._8_8_;
    lVar3 = auVar14._0_8_;
    if (*(long *)(lVar3 + 0x30) != 0) {
      *(undefined8 *)(lVar3 + 0x30) = 0;
      *(undefined8 *)(lVar3 + 0x40) = 0;
      func_0x007406b0(unaff_x22);
    }
    param_2 = 10;
    unaff_x26 = param_3;
  } while( true );
}

