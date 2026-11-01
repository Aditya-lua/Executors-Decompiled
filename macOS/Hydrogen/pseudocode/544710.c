
void FUN_00544710(undefined8 param_1,qword *param_2)

{
  code *pcVar1;
  qword qVar2;
  int iVar3;
  undefined8 *puVar4;
  qword *pqVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long unaff_x19;
  bool bVar13;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar14;
  long unaff_x23;
  ulong unaff_x24;
  long lVar15;
  long unaff_x25;
  long *plVar16;
  ulong unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar17 [16];
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  qword *in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 *in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 *in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  qword *in_stack_00000090;
  qword *in_stack_00000098;
  long in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  
  do {
    pqVar5 = uStack0000000000000088;
    uVar9 = (ulong)param_2 ^ 0x8000000000000000;
    if (2 < uVar9) {
      uVar9 = 1;
    }
    if (uVar9 == 0) {
      qVar2 = *uStack0000000000000088;
      *uStack0000000000000088 = qVar2 + unaff_x21;
      LORelease();
      if (qVar2 == 1) {
        func_0x005d2ac4(&uStack0000000000000088);
      }
    }
    else {
      if (uVar9 == 1) {
        if (param_2 == (qword *)0x0) goto LAB_00544798;
        uVar7 = 1;
      }
      else {
        func_0x0053ceac(uStack0000000000000088);
        func_0x00187bd4(pqVar5,0x40,8);
        pqVar5 = in_stack_00000090;
        func_0x0053ceac(in_stack_00000090);
        param_2 = &segment_command_00000020.vmsize;
        uVar7 = 8;
      }
      func_0x00187bd4(pqVar5,param_2,uVar7);
    }
LAB_00544798:
    uVar9 = *(ulong *)(unaff_x23 + 0x48);
    if (uVar9 <= unaff_x26) {
      puVar8 = &UNK_009ec980;
      goto code_r0x00544fc0;
    }
    puVar4 = (undefined8 *)(*(long *)(unaff_x23 + 0x40) + unaff_x26 * 0x40);
    in_stack_000000a8 = puVar4[5];
    in_stack_000000a0 = puVar4[4];
    in_stack_000000b8 = puVar4[7];
    in_stack_000000b0 = puVar4[6];
    uStack0000000000000088 = (qword *)puVar4[1];
    uStack0000000000000080 = (qword *)*puVar4;
    in_stack_00000098 = (qword *)puVar4[3];
    in_stack_00000090 = (qword *)puVar4[2];
    _memmove(puVar4,puVar4 + 8,(uVar9 + unaff_x20) * 0x40);
    *(ulong *)(unaff_x23 + 0x48) = uVar9 - 1;
    func_0x0053ceac(&uStack0000000000000080);
    unaff_x22 = unaff_x22 + -8;
    if (unaff_x22 == 0) {
      do {
        if (in_stack_00000010 != 0) {
          func_0x00187bd4(unaff_x25,in_stack_00000010 << 3,8);
        }
        if (*(long *)(unaff_x28 + 0x10) == 0) {
          if ((*(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28) <= in_stack_00000000) ||
             (plVar16 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                                in_stack_00000000 * 0x20), *plVar16 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009ec938);
code_r0x005450b4:
            func_0x007a2378(&UNK_009ec438);
            goto code_r0x005450f8;
          }
          in_stack_00000098 = (qword *)&MACH_HEADER.filetype;
          if ((ulong)plVar16[2] <= in_stack_00000018) {
            func_0x007a2570(in_stack_00000018,plVar16[2],&UNK_009ec950);
            goto code_r0x005450f8;
          }
          lVar15 = plVar16[1] + in_stack_00000018 * 0x108;
          func_0x0053d360(lVar15);
          _memcpy(lVar15,&uStack0000000000000080,0x108);
        }
        do {
          in_stack_00000018 = in_stack_00000008;
          if (unaff_x24 <= in_stack_00000018) {
            if ((in_stack_00000000 < *(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28)) &&
               (*(long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) + in_stack_00000000 * 0x20)
                != -0x8000000000000000)) {
              func_0x00556794();
              return;
            }
            func_0x007a23bc(&UNK_009ec8a8);
code_r0x005450ec:
            func_0x007a2378(&UNK_009ec438);
            goto code_r0x005450f8;
          }
          in_stack_00000008 = in_stack_00000018 + 1;
          if ((*(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28) <= in_stack_00000000) ||
             (plVar16 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                                in_stack_00000000 * 0x20), *plVar16 == -0x8000000000000000)) {
            auVar17 = func_0x007a23bc(&UNK_009ec8c0);
code_r0x00545030:
            func_0x007a2570(auVar17._0_8_,auVar17._8_8_,&UNK_009f0c60);
            goto code_r0x005450f8;
          }
          if ((ulong)plVar16[2] <= in_stack_00000018) {
            func_0x007a2570(in_stack_00000018,plVar16[2],&UNK_009ec8d8);
            goto code_r0x0054504c;
          }
          lVar15 = plVar16[1] + in_stack_00000018 * 0x108;
        } while (*(long *)(lVar15 + 0x18) != 0xf);
        uStack0000000000000020 = 0;
        in_stack_00000028 = 8;
        in_stack_00000030 = 0;
        uStack0000000000000080 = *(qword **)(lVar15 + 0x28);
        uStack0000000000000088 =
             (qword *)((long)uStack0000000000000080 + *(long *)(lVar15 + 0x30) * 0x18);
        in_stack_00000090 = (qword *)0x0;
        func_0x005593b8(&uStack0000000000000038,&uStack0000000000000080,&UNK_009ec388);
        in_stack_000000a0 = lVar15 + 0x20;
        in_stack_00000098 = in_stack_00000040 + in_stack_00000048 * 2;
        uStack0000000000000080 = in_stack_00000040;
        uStack0000000000000088 = in_stack_00000040;
        in_stack_00000090 = uStack0000000000000038;
        func_0x00556d44(unaff_x29 + -0x88,&uStack0000000000000080,&UNK_009ec388);
        in_stack_00000060 = *(undefined8 *)(unaff_x29 + -0x88);
        in_stack_00000058 = *(undefined8 **)(unaff_x29 + -0x80);
        in_stack_00000068 = in_stack_00000058 + *(long *)(unaff_x29 + -0x78) * 3;
        uStack0000000000000050 = in_stack_00000058;
        puVar4 = in_stack_00000058;
        if (*(long *)(unaff_x29 + -0x78) != 0) {
          do {
            puVar4 = in_stack_00000058 + 3;
            plVar16 = (long *)*in_stack_00000058;
            if (plVar16 == (long *)0x0) break;
            uVar7 = in_stack_00000058[1];
            pqVar5 = (qword *)in_stack_00000058[2];
            in_stack_00000058 = puVar4;
            uStack0000000000000070 = plVar16;
            uStack0000000000000078 = pqVar5;
            if (*(long *)(unaff_x19 + 0x30) != 0) {
              uVar9 = func_0x005787f4(*(undefined8 *)(unaff_x19 + 0x38),
                                      *(undefined8 *)(unaff_x19 + 0x40),plVar16);
              lVar15 = 0;
              uVar10 = uVar9 >> 0x39;
              while( true ) {
                uVar9 = uVar9 & *(ulong *)(unaff_x19 + 0x20);
                uVar11 = *(ulong *)(*(long *)(unaff_x19 + 0x18) + uVar9);
                uVar12 = uVar11 ^ uVar10 * 0x101010101010101;
                for (uVar12 = uVar12 + 0xfefefefefefefeff & (uVar12 ^ 0xffffffffffffffff) &
                              0x8080808080808080; uVar12 != 0; uVar12 = uVar12 - 1 & uVar12) {
                  uVar6 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                          (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
                  uVar6 = *(ulong *)(*(long *)(unaff_x19 + 0x18) + -8 +
                                    (uVar9 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) &
                                    *(ulong *)(unaff_x19 + 0x20)) * -8);
                  auVar17._8_8_ = *(ulong *)(unaff_x19 + 0x10);
                  auVar17._0_8_ = uVar6;
                  if (*(ulong *)(unaff_x19 + 0x10) <= uVar6) goto code_r0x00545030;
                  if (plVar16 == *(long **)(*(long *)(unaff_x19 + 8) + uVar6 * 0x18))
                  goto code_r0x00544968;
                }
                if ((uVar11 & uVar11 << 1 & 0x8080808080808080) != 0) break;
                lVar15 = lVar15 + 8;
                uVar9 = lVar15 + uVar9;
              }
            }
            lVar15 = func_0x0057851c();
            pqVar5 = uStack0000000000000078;
            if (lVar15 == 1) {
code_r0x00544968:
              qVar2 = *pqVar5;
              *pqVar5 = qVar2 + unaff_x21;
              LORelease();
              if (qVar2 == 1) {
                func_0x005d2ac4(&uStack0000000000000078);
              }
            }
            else {
              qVar2 = *uStack0000000000000078;
              *uStack0000000000000078 = qVar2 + 1;
              if ((long)qVar2 < 0) {
code_r0x00544fd4:
                func_0x007a05dc();
                goto code_r0x005450f8;
              }
              uStack0000000000000080 = uStack0000000000000078;
              lVar15 = *uStack0000000000000070;
              *uStack0000000000000070 = lVar15 + 1;
              if (lVar15 < 0) {
                func_0x007a05dc();
                goto code_r0x005450f8;
              }
              uVar9 = func_0x005453d0();
              pqVar5 = uStack0000000000000078;
              if ((uVar9 & 1) == 0) {
                qVar2 = *uStack0000000000000078;
                *uStack0000000000000078 = qVar2 + 1;
                if ((long)qVar2 < 0) goto code_r0x00544fd4;
                puVar4 = (undefined8 *)func_0x00544148();
                uVar9 = *(ulong *)*puVar4;
                *(ulong *)*puVar4 = uVar9 + 1;
                if (0xfffffffffffffffe < uVar9) goto code_r0x005450f8;
                *(undefined8 *)(unaff_x29 + -0xb0) = *puVar4;
                lVar15 = *uStack0000000000000070;
                *uStack0000000000000070 = lVar15 + 1;
                if (lVar15 < 0) {
                  func_0x007a05dc();
                  goto code_r0x005450f8;
                }
                puVar4 = (undefined8 *)func_0x00544148();
                uVar9 = *(ulong *)*puVar4;
                *(ulong *)*puVar4 = uVar9 + 1;
                if (0xfffffffffffffffe < uVar9) goto code_r0x005450f8;
                *(undefined8 *)(unaff_x29 + -0xa8) = *puVar4;
                qVar2 = *pqVar5;
                *pqVar5 = qVar2 + 1;
                if ((long)qVar2 < 0) {
                  func_0x007a05dc();
                  goto code_r0x005450f8;
                }
                plVar16 = (long *)func_0x00547df0();
                lVar15 = *plVar16;
                if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) {
                  func_0x007a2378(&UNK_009eca50);
                  goto code_r0x005450f8;
                }
                *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                uStack0000000000000080 = *(qword **)(lVar15 + 0x18);
                in_stack_00000098 =
                     (qword *)((long)uStack0000000000000080 + *(long *)(lVar15 + 0x20) + 1);
                qVar2 = *uStack0000000000000080;
                in_stack_00000090 = uStack0000000000000080 + 1;
                uStack0000000000000088 =
                     (qword *)(CONCAT17(-(-1 < (long)qVar2),
                                        CONCAT16(-(-1 < (char)(qVar2 >> 0x30)),
                                                 CONCAT15(-(-1 < (char)(qVar2 >> 0x28)),
                                                          CONCAT14(-(-1 < (char)(qVar2 >> 0x20)),
                                                                   CONCAT13(-(-1 < (char)(qVar2 >> 
                                                  0x18)),CONCAT12(-(-1 < (char)(qVar2 >> 0x10)),
                                                                  CONCAT11(-(-1 < (char)(qVar2 >> 8)
                                                                            ),-(-1 < (char)qVar2))))
                                                  )))) & 0x8080808080808080);
                in_stack_000000a0 = *(long *)(lVar15 + 0x30);
                func_0x0055aac0(unaff_x29 + -0xa0,&uStack0000000000000080,&UNK_009ec388);
                *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                puVar4 = *(undefined8 **)(unaff_x29 + -0x98);
                *(undefined8 **)(unaff_x29 + -0x88) = puVar4;
                *(undefined8 **)(unaff_x29 + -0x80) = puVar4;
                *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0xa0);
                *(undefined8 **)(unaff_x29 + -0x70) = puVar4 + *(long *)(unaff_x29 + -0x90);
                if (*(long *)(unaff_x29 + -0x90) != 0) {
                  do {
                    plVar16 = (long *)*puVar4;
                    *(undefined8 **)(unaff_x29 + -0x80) = puVar4 + 1;
                    *(long **)(unaff_x29 + -0x68) = plVar16;
                    if ((plVar16 == uStack0000000000000070) ||
                       ((qword *)plVar16 == uStack0000000000000078)) {
code_r0x00544e20:
                      lVar15 = *plVar16;
                      *plVar16 = lVar15 + unaff_x21;
                      LORelease();
                      if (lVar15 == 1) {
                        func_0x005d2ac4(unaff_x29 + -0x68);
                      }
                    }
                    else {
                      iVar3 = func_0x00543f78();
                      plVar16 = *(long **)(unaff_x29 + -0x68);
                      if (iVar3 == 0) goto code_r0x00544e20;
                      iVar3 = func_0x005473b0();
                      plVar16 = *(long **)(unaff_x29 + -0x68);
                      if (iVar3 == 0) goto code_r0x00544e20;
                      lVar15 = *plVar16;
                      *plVar16 = lVar15 + 1;
                      if (lVar15 < 0) {
                        func_0x007a05dc();
                        goto code_r0x005450f8;
                      }
                      plVar16 = (long *)func_0x00544148();
                      uVar9 = *(ulong *)*plVar16;
                      *(ulong *)*plVar16 = uVar9 + 1;
                      if (0xfffffffffffffffe < uVar9) goto code_r0x005450f8;
                      lVar14 = *plVar16;
                      *(long *)(unaff_x29 + -0x60) = lVar14;
                      lVar15 = *(long *)(unaff_x29 + -0xb0);
                      if (lVar15 != lVar14) {
                        if (*(ulong *)(lVar15 + 0x10) < 0x7fffffffffffffff) {
                          *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                          if (*(ulong *)(lVar14 + 0x10) < 0x7fffffffffffffff) {
                            *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                            uVar9 = func_0x00584344(lVar15 + 0x18,lVar14 + 0x18);
                            *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                            *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                            lVar15 = *(long *)(unaff_x29 + -0xb0);
                            if ((uVar9 & 1) != 0) goto code_r0x00544c64;
                            goto code_r0x00544ccc;
                          }
                          func_0x007a2378(&UNK_009ec438);
                        }
                        else {
code_r0x00545014:
                          func_0x007a2378(&UNK_009ec450);
                        }
                        goto code_r0x005450f8;
                      }
code_r0x00544c64:
                      lVar14 = *(long *)(unaff_x29 + -0xa8);
                      if (lVar15 != lVar14) {
                        if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) goto code_r0x00545014;
                        *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                        if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) {
                          func_0x007a2378(&UNK_009ec438);
                          goto code_r0x005450f8;
                        }
                        *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                        iVar3 = func_0x00584344(lVar15 + 0x18,lVar14 + 0x18);
                        *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                        *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                        if (iVar3 != 0) {
                          lVar15 = *(long *)(unaff_x29 + -0xb0);
                          goto code_r0x00544ccc;
                        }
                        uStack0000000000000080 = (qword *)&UNK_009eca40;
                        uStack0000000000000088 = (qword *)((long)&MACH_HEADER.magic + 1);
                        in_stack_00000098 = (qword *)0x0;
                        in_stack_000000a0 = 0;
                        in_stack_00000090 = (qword *)&MACH_HEADER.cpusubtype;
                        func_0x0041e264(&uStack0000000000000080);
                        lVar15 = **(long **)(unaff_x29 + -0x60) + -1;
                        **(long **)(unaff_x29 + -0x60) = lVar15;
                        if (lVar15 == 0) {
                          func_0x0057e6ac(unaff_x29 + -0x60);
                        }
                        lVar15 = **(long **)(unaff_x29 + -0x68);
                        **(long **)(unaff_x29 + -0x68) = lVar15 + unaff_x21;
                        LORelease();
                        if (lVar15 == 1) {
                          func_0x005d2ac4(unaff_x29 + -0x68);
                        }
code_r0x00544edc:
                        func_0x005928cc(unaff_x29 + -0x88);
                        lVar15 = **(long **)(unaff_x29 + -0xa8) + -1;
                        **(long **)(unaff_x29 + -0xa8) = lVar15;
                        if (lVar15 == 0) {
                          func_0x0057e6ac(unaff_x29 + -0xa8);
                        }
                        lVar15 = **(long **)(unaff_x29 + -0xb0) + -1;
                        **(long **)(unaff_x29 + -0xb0) = lVar15;
                        if (lVar15 != 0) goto code_r0x005449b4;
                        bVar13 = true;
                        goto code_r0x00544b20;
                      }
code_r0x00544ccc:
                      lVar14 = *(long *)(unaff_x29 + -0xa8);
                      if (lVar14 == lVar15) goto code_r0x00544e00;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x00545014;
                      *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) {
                        func_0x007a2378(&UNK_009ec438);
                        goto code_r0x005450f8;
                      }
                      *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                      iVar3 = func_0x00584344(lVar14 + 0x18,lVar15 + 0x18);
                      *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                      *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                      if (iVar3 != 0) {
code_r0x00544e00:
                        lVar15 = **(long **)(unaff_x29 + -0x60) + -1;
                        **(long **)(unaff_x29 + -0x60) = lVar15;
                        if (lVar15 == 0) {
                          func_0x0057e6ac(unaff_x29 + -0x60);
                        }
                        plVar16 = *(long **)(unaff_x29 + -0x68);
                        goto code_r0x00544e20;
                      }
                      lVar15 = *(long *)(unaff_x29 + -0xa8);
                      lVar14 = *(long *)(unaff_x29 + -0x60);
                      if (lVar15 == lVar14) goto code_r0x00544e00;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) goto code_r0x00545014;
                      *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x005450b4;
                      *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                      uVar9 = func_0x00584344(lVar15 + 0x18,lVar14 + 0x18);
                      *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                      *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                      if ((uVar9 & 1) != 0) goto code_r0x00544e00;
                      lVar15 = *(long *)(unaff_x29 + -0xb0);
                      lVar14 = *(long *)(unaff_x29 + -0x60);
                      if (lVar15 == lVar14) goto code_r0x00544e00;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) goto code_r0x00545014;
                      *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x005450ec;
                      *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                      uVar9 = func_0x00584344(lVar15 + 0x18,lVar14 + 0x18);
                      *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                      *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
                      if ((uVar9 & 1) != 0) goto code_r0x00544e00;
                      qVar2 = *pqVar5;
                      *pqVar5 = qVar2 + 1;
                      if ((long)qVar2 < 0) {
                        func_0x007a05dc();
                        goto code_r0x005450f8;
                      }
                      uVar9 = func_0x005453d0();
                      if ((uVar9 & 1) != 0) {
                        uStack0000000000000080 = (qword *)&UNK_009eca40;
                        uStack0000000000000088 = (qword *)((long)&MACH_HEADER.magic + 1);
                        in_stack_00000098 = (qword *)0x0;
                        in_stack_000000a0 = 0;
                        in_stack_00000090 = (qword *)&MACH_HEADER.cpusubtype;
                        func_0x0041e264(&uStack0000000000000080);
                        lVar15 = **(long **)(unaff_x29 + -0x60) + -1;
                        **(long **)(unaff_x29 + -0x60) = lVar15;
                        if (lVar15 == 0) {
                          func_0x0057e6ac(unaff_x29 + -0x60);
                        }
                        goto code_r0x00544edc;
                      }
                      lVar15 = **(long **)(unaff_x29 + -0x60) + -1;
                      **(long **)(unaff_x29 + -0x60) = lVar15;
                      if (lVar15 == 0) {
                        func_0x0057e6ac(unaff_x29 + -0x60);
                      }
                    }
                    puVar4 = *(undefined8 **)(unaff_x29 + -0x80);
                  } while (puVar4 != *(undefined8 **)(unaff_x29 + -0x70));
                }
                func_0x005928cc(unaff_x29 + -0x88);
                lVar15 = **(long **)(unaff_x29 + -0xa8) + -1;
                **(long **)(unaff_x29 + -0xa8) = lVar15;
                if (lVar15 == 0) {
                  func_0x0057e6ac(unaff_x29 + -0xa8);
                }
                lVar15 = **(long **)(unaff_x29 + -0xb0) + -1;
                **(long **)(unaff_x29 + -0xb0) = lVar15;
                if (lVar15 == 0) {
                  bVar13 = false;
code_r0x00544b20:
                  func_0x0057e6ac(unaff_x29 + -0xb0);
                  if (bVar13) goto code_r0x005449b4;
                }
              }
              else {
code_r0x005449b4:
                lVar15 = in_stack_00000030;
                if (in_stack_00000030 == uStack0000000000000020) {
                  func_0x005e25c0(&uStack0000000000000020,&UNK_009ec998);
                }
                *(undefined8 *)(in_stack_00000028 + lVar15 * 8) = uVar7;
                in_stack_00000030 = lVar15 + 1;
              }
              qVar2 = *uStack0000000000000078;
              *uStack0000000000000078 = qVar2 + unaff_x21;
              LORelease();
              if (qVar2 == 1) {
                func_0x005d2ac4(&uStack0000000000000078);
              }
            }
            lVar15 = *uStack0000000000000070;
            *uStack0000000000000070 = lVar15 + unaff_x21;
            LORelease();
            if (lVar15 == 1) {
              func_0x005d2ac4(&uStack0000000000000070);
            }
            puVar4 = in_stack_00000058;
          } while (in_stack_00000058 != in_stack_00000068);
        }
        in_stack_00000058 = puVar4;
        func_0x00593268(&uStack0000000000000050);
        if ((*(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28) <= in_stack_00000000) ||
           (plVar16 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                              in_stack_00000000 * 0x20), *plVar16 == -0x8000000000000000)) {
code_r0x0054504c:
          puVar8 = &UNK_009ec8f0;
code_r0x00545004:
          func_0x007a23bc(puVar8);
          goto code_r0x005450f8;
        }
        if ((ulong)plVar16[2] <= in_stack_00000018) {
          func_0x007a2570(in_stack_00000018,plVar16[2],&UNK_009ec908);
          goto code_r0x005450f8;
        }
        unaff_x23 = plVar16[1] + in_stack_00000018 * 0x108;
        unaff_x28 = unaff_x23 + 0x20;
        if (*(long *)(unaff_x23 + 0x18) != 0xf) {
          puVar8 = &UNK_009ec920;
          goto code_r0x00545004;
        }
        in_stack_00000010 = uStack0000000000000020;
        unaff_x25 = in_stack_00000028;
      } while (in_stack_00000030 == 0);
      unaff_x22 = in_stack_00000030 << 3;
    }
    unaff_x26 = *(ulong *)(unaff_x25 + unaff_x22 + -8);
    uVar9 = *(ulong *)(unaff_x23 + 0x30);
    if (uVar9 <= unaff_x26) {
      puVar8 = &UNK_009ec968;
code_r0x00544fc0:
      func_0x007a2080(unaff_x26,uVar9,puVar8);
code_r0x005450f8:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5450fc);
      (*pcVar1)();
    }
    puVar4 = (undefined8 *)(*(long *)(unaff_x23 + 0x28) + unaff_x26 * 0x18);
    in_stack_00000090 = (qword *)puVar4[2];
    uStack0000000000000088 = (qword *)puVar4[1];
    uStack0000000000000080 = (qword *)*puVar4;
    unaff_x20 = ~unaff_x26;
    _memmove(puVar4,puVar4 + 3,(uVar9 + unaff_x20) * 0x18);
    *(ulong *)(unaff_x23 + 0x30) = uVar9 - 1;
    param_2 = uStack0000000000000080;
  } while( true );
}

