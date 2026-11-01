
void FUN_005447f8(long param_1,long param_2,undefined8 param_3)

{
  code *pcVar1;
  qword qVar2;
  int iVar3;
  undefined8 *puVar4;
  qword *pqVar5;
  ulong uVar6;
  qword *pqVar7;
  undefined8 uVar8;
  undefined *puVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  bool bVar12;
  long unaff_x21;
  long lVar13;
  ulong unaff_x24;
  long lVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar18 [16];
  ulong in_stack_00000000;
  ulong in_stack_00000008;
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
    func_0x00187bd4(param_1,param_2,param_3);
    do {
      if (*(long *)(unaff_x28 + 0x10) == 0) {
        if ((*(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28) <= in_stack_00000000) ||
           (plVar15 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                              in_stack_00000000 * 0x20), *plVar15 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009ec938);
code_r0x005450b4:
          func_0x007a2378(&UNK_009ec438);
          goto code_r0x005450f8;
        }
        in_stack_00000098 = (qword *)&MACH_HEADER.filetype;
        if ((ulong)plVar15[2] <= in_stack_00000018) {
          func_0x007a2570(in_stack_00000018,plVar15[2],&UNK_009ec950);
          goto code_r0x005450f8;
        }
        lVar14 = plVar15[1] + in_stack_00000018 * 0x108;
        func_0x0053d360(lVar14);
        _memcpy(lVar14,&uStack0000000000000080,0x108);
      }
      do {
        in_stack_00000018 = in_stack_00000008;
        if (unaff_x24 <= in_stack_00000018) {
          if ((in_stack_00000000 < *(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28)) &&
             (*(long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) + in_stack_00000000 * 0x20) !=
              -0x8000000000000000)) {
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
           (plVar15 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                              in_stack_00000000 * 0x20), *plVar15 == -0x8000000000000000)) {
          auVar18 = func_0x007a23bc(&UNK_009ec8c0);
code_r0x00545030:
          func_0x007a2570(auVar18._0_8_,auVar18._8_8_,&UNK_009f0c60);
          goto code_r0x005450f8;
        }
        if ((ulong)plVar15[2] <= in_stack_00000018) {
          func_0x007a2570(in_stack_00000018,plVar15[2],&UNK_009ec8d8);
          goto code_r0x0054504c;
        }
        lVar14 = plVar15[1] + in_stack_00000018 * 0x108;
      } while (*(long *)(lVar14 + 0x18) != 0xf);
      uStack0000000000000020 = 0;
      in_stack_00000028 = 8;
      in_stack_00000030 = 0;
      uStack0000000000000080 = *(qword **)(lVar14 + 0x28);
      uStack0000000000000088 =
           (qword *)((long)uStack0000000000000080 + *(long *)(lVar14 + 0x30) * 0x18);
      in_stack_00000090 = (qword *)0x0;
      func_0x005593b8(&uStack0000000000000038,&uStack0000000000000080,&UNK_009ec388);
      in_stack_000000a0 = lVar14 + 0x20;
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
          plVar15 = (long *)*in_stack_00000058;
          if (plVar15 == (long *)0x0) break;
          uVar8 = in_stack_00000058[1];
          pqVar5 = (qword *)in_stack_00000058[2];
          in_stack_00000058 = puVar4;
          uStack0000000000000070 = plVar15;
          uStack0000000000000078 = pqVar5;
          if (*(long *)(unaff_x19 + 0x30) != 0) {
            uVar16 = func_0x005787f4(*(undefined8 *)(unaff_x19 + 0x38),
                                     *(undefined8 *)(unaff_x19 + 0x40),plVar15);
            lVar14 = 0;
            uVar17 = uVar16 >> 0x39;
            while( true ) {
              uVar16 = uVar16 & *(ulong *)(unaff_x19 + 0x20);
              uVar10 = *(ulong *)(*(long *)(unaff_x19 + 0x18) + uVar16);
              uVar11 = uVar10 ^ uVar17 * 0x101010101010101;
              for (uVar11 = uVar11 + 0xfefefefefefefeff & (uVar11 ^ 0xffffffffffffffff) &
                            0x8080808080808080; uVar11 != 0; uVar11 = uVar11 - 1 & uVar11) {
                uVar6 = (uVar11 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                        (uVar11 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
                uVar6 = *(ulong *)(*(long *)(unaff_x19 + 0x18) + -8 +
                                  (uVar16 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) &
                                  *(ulong *)(unaff_x19 + 0x20)) * -8);
                auVar18._8_8_ = *(ulong *)(unaff_x19 + 0x10);
                auVar18._0_8_ = uVar6;
                if (*(ulong *)(unaff_x19 + 0x10) <= uVar6) goto code_r0x00545030;
                if (plVar15 == *(long **)(*(long *)(unaff_x19 + 8) + uVar6 * 0x18))
                goto code_r0x00544968;
              }
              if ((uVar10 & uVar10 << 1 & 0x8080808080808080) != 0) break;
              lVar14 = lVar14 + 8;
              uVar16 = lVar14 + uVar16;
            }
          }
          lVar14 = func_0x0057851c();
          pqVar5 = uStack0000000000000078;
          if (lVar14 == 1) {
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
            lVar14 = *uStack0000000000000070;
            *uStack0000000000000070 = lVar14 + 1;
            if (lVar14 < 0) {
              func_0x007a05dc();
              goto code_r0x005450f8;
            }
            uVar16 = func_0x005453d0();
            pqVar5 = uStack0000000000000078;
            if ((uVar16 & 1) == 0) {
              qVar2 = *uStack0000000000000078;
              *uStack0000000000000078 = qVar2 + 1;
              if ((long)qVar2 < 0) goto code_r0x00544fd4;
              puVar4 = (undefined8 *)func_0x00544148();
              uVar16 = *(ulong *)*puVar4;
              *(ulong *)*puVar4 = uVar16 + 1;
              if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
              *(undefined8 *)(unaff_x29 + -0xb0) = *puVar4;
              lVar14 = *uStack0000000000000070;
              *uStack0000000000000070 = lVar14 + 1;
              if (lVar14 < 0) {
                func_0x007a05dc();
                goto code_r0x005450f8;
              }
              puVar4 = (undefined8 *)func_0x00544148();
              uVar16 = *(ulong *)*puVar4;
              *(ulong *)*puVar4 = uVar16 + 1;
              if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
              *(undefined8 *)(unaff_x29 + -0xa8) = *puVar4;
              qVar2 = *pqVar5;
              *pqVar5 = qVar2 + 1;
              if ((long)qVar2 < 0) {
                func_0x007a05dc();
                goto code_r0x005450f8;
              }
              plVar15 = (long *)func_0x00547df0();
              lVar14 = *plVar15;
              if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) {
                func_0x007a2378(&UNK_009eca50);
                goto code_r0x005450f8;
              }
              *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
              uStack0000000000000080 = *(qword **)(lVar14 + 0x18);
              in_stack_00000098 =
                   (qword *)((long)uStack0000000000000080 + *(long *)(lVar14 + 0x20) + 1);
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
              in_stack_000000a0 = *(long *)(lVar14 + 0x30);
              func_0x0055aac0(unaff_x29 + -0xa0,&uStack0000000000000080,&UNK_009ec388);
              *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
              puVar4 = *(undefined8 **)(unaff_x29 + -0x98);
              *(undefined8 **)(unaff_x29 + -0x88) = puVar4;
              *(undefined8 **)(unaff_x29 + -0x80) = puVar4;
              *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0xa0);
              *(undefined8 **)(unaff_x29 + -0x70) = puVar4 + *(long *)(unaff_x29 + -0x90);
              if (*(long *)(unaff_x29 + -0x90) != 0) {
                do {
                  plVar15 = (long *)*puVar4;
                  *(undefined8 **)(unaff_x29 + -0x80) = puVar4 + 1;
                  *(long **)(unaff_x29 + -0x68) = plVar15;
                  if ((plVar15 == uStack0000000000000070) ||
                     ((qword *)plVar15 == uStack0000000000000078)) {
code_r0x00544e20:
                    lVar14 = *plVar15;
                    *plVar15 = lVar14 + unaff_x21;
                    LORelease();
                    if (lVar14 == 1) {
                      func_0x005d2ac4(unaff_x29 + -0x68);
                    }
                  }
                  else {
                    iVar3 = func_0x00543f78();
                    plVar15 = *(long **)(unaff_x29 + -0x68);
                    if (iVar3 == 0) goto code_r0x00544e20;
                    iVar3 = func_0x005473b0();
                    plVar15 = *(long **)(unaff_x29 + -0x68);
                    if (iVar3 == 0) goto code_r0x00544e20;
                    lVar14 = *plVar15;
                    *plVar15 = lVar14 + 1;
                    if (lVar14 < 0) {
                      func_0x007a05dc();
                      goto code_r0x005450f8;
                    }
                    plVar15 = (long *)func_0x00544148();
                    uVar16 = *(ulong *)*plVar15;
                    *(ulong *)*plVar15 = uVar16 + 1;
                    if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
                    lVar13 = *plVar15;
                    *(long *)(unaff_x29 + -0x60) = lVar13;
                    lVar14 = *(long *)(unaff_x29 + -0xb0);
                    if (lVar14 != lVar13) {
                      if (*(ulong *)(lVar14 + 0x10) < 0x7fffffffffffffff) {
                        *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                        if (*(ulong *)(lVar13 + 0x10) < 0x7fffffffffffffff) {
                          *(ulong *)(lVar13 + 0x10) = *(ulong *)(lVar13 + 0x10) + 1;
                          uVar16 = func_0x00584344(lVar14 + 0x18,lVar13 + 0x18);
                          *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + -1;
                          *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                          lVar14 = *(long *)(unaff_x29 + -0xb0);
                          if ((uVar16 & 1) != 0) goto code_r0x00544c64;
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
                    lVar13 = *(long *)(unaff_x29 + -0xa8);
                    if (lVar14 != lVar13) {
                      if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x00545014;
                      *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                      if (0x7ffffffffffffffe < *(ulong *)(lVar13 + 0x10)) {
                        func_0x007a2378(&UNK_009ec438);
                        goto code_r0x005450f8;
                      }
                      *(ulong *)(lVar13 + 0x10) = *(ulong *)(lVar13 + 0x10) + 1;
                      iVar3 = func_0x00584344(lVar14 + 0x18,lVar13 + 0x18);
                      *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + -1;
                      *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                      if (iVar3 != 0) {
                        lVar14 = *(long *)(unaff_x29 + -0xb0);
                        goto code_r0x00544ccc;
                      }
                      uStack0000000000000080 = (qword *)&UNK_009eca40;
                      uStack0000000000000088 = (qword *)((long)&MACH_HEADER.magic + 1);
                      in_stack_00000098 = (qword *)0x0;
                      in_stack_000000a0 = 0;
                      in_stack_00000090 = (qword *)&MACH_HEADER.cpusubtype;
                      func_0x0041e264(&uStack0000000000000080);
                      lVar14 = **(long **)(unaff_x29 + -0x60) + -1;
                      **(long **)(unaff_x29 + -0x60) = lVar14;
                      if (lVar14 == 0) {
                        func_0x0057e6ac(unaff_x29 + -0x60);
                      }
                      lVar14 = **(long **)(unaff_x29 + -0x68);
                      **(long **)(unaff_x29 + -0x68) = lVar14 + unaff_x21;
                      LORelease();
                      if (lVar14 == 1) {
                        func_0x005d2ac4(unaff_x29 + -0x68);
                      }
code_r0x00544edc:
                      func_0x005928cc(unaff_x29 + -0x88);
                      lVar14 = **(long **)(unaff_x29 + -0xa8) + -1;
                      **(long **)(unaff_x29 + -0xa8) = lVar14;
                      if (lVar14 == 0) {
                        func_0x0057e6ac(unaff_x29 + -0xa8);
                      }
                      lVar14 = **(long **)(unaff_x29 + -0xb0) + -1;
                      **(long **)(unaff_x29 + -0xb0) = lVar14;
                      if (lVar14 != 0) goto code_r0x005449b4;
                      bVar12 = true;
                      goto code_r0x00544b20;
                    }
code_r0x00544ccc:
                    lVar13 = *(long *)(unaff_x29 + -0xa8);
                    if (lVar13 == lVar14) goto code_r0x00544e00;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar13 + 0x10)) goto code_r0x00545014;
                    *(ulong *)(lVar13 + 0x10) = *(ulong *)(lVar13 + 0x10) + 1;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) {
                      func_0x007a2378(&UNK_009ec438);
                      goto code_r0x005450f8;
                    }
                    *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                    iVar3 = func_0x00584344(lVar13 + 0x18,lVar14 + 0x18);
                    *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                    *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + -1;
                    if (iVar3 != 0) {
code_r0x00544e00:
                      lVar14 = **(long **)(unaff_x29 + -0x60) + -1;
                      **(long **)(unaff_x29 + -0x60) = lVar14;
                      if (lVar14 == 0) {
                        func_0x0057e6ac(unaff_x29 + -0x60);
                      }
                      plVar15 = *(long **)(unaff_x29 + -0x68);
                      goto code_r0x00544e20;
                    }
                    lVar14 = *(long *)(unaff_x29 + -0xa8);
                    lVar13 = *(long *)(unaff_x29 + -0x60);
                    if (lVar14 == lVar13) goto code_r0x00544e00;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x00545014;
                    *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar13 + 0x10)) goto code_r0x005450b4;
                    *(ulong *)(lVar13 + 0x10) = *(ulong *)(lVar13 + 0x10) + 1;
                    uVar16 = func_0x00584344(lVar14 + 0x18,lVar13 + 0x18);
                    *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + -1;
                    *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                    if ((uVar16 & 1) != 0) goto code_r0x00544e00;
                    lVar14 = *(long *)(unaff_x29 + -0xb0);
                    lVar13 = *(long *)(unaff_x29 + -0x60);
                    if (lVar14 == lVar13) goto code_r0x00544e00;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) goto code_r0x00545014;
                    *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                    if (0x7ffffffffffffffe < *(ulong *)(lVar13 + 0x10)) goto code_r0x005450ec;
                    *(ulong *)(lVar13 + 0x10) = *(ulong *)(lVar13 + 0x10) + 1;
                    uVar16 = func_0x00584344(lVar14 + 0x18,lVar13 + 0x18);
                    *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + -1;
                    *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                    if ((uVar16 & 1) != 0) goto code_r0x00544e00;
                    qVar2 = *pqVar5;
                    *pqVar5 = qVar2 + 1;
                    if ((long)qVar2 < 0) {
                      func_0x007a05dc();
                      goto code_r0x005450f8;
                    }
                    uVar16 = func_0x005453d0();
                    if ((uVar16 & 1) != 0) {
                      uStack0000000000000080 = (qword *)&UNK_009eca40;
                      uStack0000000000000088 = (qword *)((long)&MACH_HEADER.magic + 1);
                      in_stack_00000098 = (qword *)0x0;
                      in_stack_000000a0 = 0;
                      in_stack_00000090 = (qword *)&MACH_HEADER.cpusubtype;
                      func_0x0041e264(&uStack0000000000000080);
                      lVar14 = **(long **)(unaff_x29 + -0x60) + -1;
                      **(long **)(unaff_x29 + -0x60) = lVar14;
                      if (lVar14 == 0) {
                        func_0x0057e6ac(unaff_x29 + -0x60);
                      }
                      goto code_r0x00544edc;
                    }
                    lVar14 = **(long **)(unaff_x29 + -0x60) + -1;
                    **(long **)(unaff_x29 + -0x60) = lVar14;
                    if (lVar14 == 0) {
                      func_0x0057e6ac(unaff_x29 + -0x60);
                    }
                  }
                  puVar4 = *(undefined8 **)(unaff_x29 + -0x80);
                } while (puVar4 != *(undefined8 **)(unaff_x29 + -0x70));
              }
              func_0x005928cc(unaff_x29 + -0x88);
              lVar14 = **(long **)(unaff_x29 + -0xa8) + -1;
              **(long **)(unaff_x29 + -0xa8) = lVar14;
              if (lVar14 == 0) {
                func_0x0057e6ac(unaff_x29 + -0xa8);
              }
              lVar14 = **(long **)(unaff_x29 + -0xb0) + -1;
              **(long **)(unaff_x29 + -0xb0) = lVar14;
              if (lVar14 == 0) {
                bVar12 = false;
code_r0x00544b20:
                func_0x0057e6ac(unaff_x29 + -0xb0);
                if (bVar12) goto code_r0x005449b4;
              }
            }
            else {
code_r0x005449b4:
              lVar14 = in_stack_00000030;
              if (in_stack_00000030 == uStack0000000000000020) {
                func_0x005e25c0(&uStack0000000000000020,&UNK_009ec998);
              }
              *(undefined8 *)(in_stack_00000028 + lVar14 * 8) = uVar8;
              in_stack_00000030 = lVar14 + 1;
            }
            qVar2 = *uStack0000000000000078;
            *uStack0000000000000078 = qVar2 + unaff_x21;
            LORelease();
            if (qVar2 == 1) {
              func_0x005d2ac4(&uStack0000000000000078);
            }
          }
          lVar14 = *uStack0000000000000070;
          *uStack0000000000000070 = lVar14 + unaff_x21;
          LORelease();
          if (lVar14 == 1) {
            func_0x005d2ac4(&uStack0000000000000070);
          }
          puVar4 = in_stack_00000058;
        } while (in_stack_00000058 != in_stack_00000068);
      }
      in_stack_00000058 = puVar4;
      func_0x00593268(&uStack0000000000000050);
      param_1 = in_stack_00000028;
      param_2 = uStack0000000000000020;
      if ((*(ulong *)(*(long *)(unaff_x19 + 0xd8) + 0x28) <= in_stack_00000000) ||
         (plVar15 = (long *)(*(long *)(*(long *)(unaff_x19 + 0xd8) + 0x20) +
                            in_stack_00000000 * 0x20), *plVar15 == -0x8000000000000000)) {
code_r0x0054504c:
        puVar9 = &UNK_009ec8f0;
code_r0x00545004:
        func_0x007a23bc(puVar9);
code_r0x005450f8:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x5450fc);
        (*pcVar1)();
      }
      if ((ulong)plVar15[2] <= in_stack_00000018) {
        func_0x007a2570(in_stack_00000018,plVar15[2],&UNK_009ec908);
        goto code_r0x005450f8;
      }
      lVar14 = plVar15[1] + in_stack_00000018 * 0x108;
      unaff_x28 = lVar14 + 0x20;
      if (*(long *)(lVar14 + 0x18) != 0xf) {
        puVar9 = &UNK_009ec920;
        goto code_r0x00545004;
      }
      if (in_stack_00000030 != 0) {
        lVar13 = in_stack_00000030 << 3;
        do {
          uVar16 = *(ulong *)(param_1 + lVar13 + -8);
          uVar17 = *(ulong *)(lVar14 + 0x30);
          if (uVar17 <= uVar16) {
            puVar9 = &UNK_009ec968;
code_r0x00544fc0:
            func_0x007a2080(uVar16,uVar17,puVar9);
            goto code_r0x005450f8;
          }
          puVar4 = (undefined8 *)(*(long *)(lVar14 + 0x28) + uVar16 * 0x18);
          in_stack_00000090 = (qword *)puVar4[2];
          uStack0000000000000088 = (qword *)puVar4[1];
          uStack0000000000000080 = (qword *)*puVar4;
          _memmove(puVar4,puVar4 + 3,(uVar17 + ~uVar16) * 0x18);
          pqVar5 = uStack0000000000000088;
          *(ulong *)(lVar14 + 0x30) = uVar17 - 1;
          uVar17 = (ulong)uStack0000000000000080 ^ 0x8000000000000000;
          if (2 < uVar17) {
            uVar17 = 1;
          }
          if (uVar17 == 0) {
            qVar2 = *uStack0000000000000088;
            *uStack0000000000000088 = qVar2 + unaff_x21;
            LORelease();
            if (qVar2 == 1) {
              func_0x005d2ac4(&uStack0000000000000088);
            }
          }
          else {
            if (uVar17 == 1) {
              if (uStack0000000000000080 == (qword *)0x0) goto code_r0x00544798;
              uVar8 = 1;
              pqVar7 = uStack0000000000000080;
            }
            else {
              func_0x0053ceac(uStack0000000000000088);
              func_0x00187bd4(pqVar5,0x40,8);
              pqVar5 = in_stack_00000090;
              func_0x0053ceac(in_stack_00000090);
              pqVar7 = &segment_command_00000020.vmsize;
              uVar8 = 8;
            }
            func_0x00187bd4(pqVar5,pqVar7,uVar8);
          }
code_r0x00544798:
          uVar17 = *(ulong *)(lVar14 + 0x48);
          if (uVar17 <= uVar16) {
            puVar9 = &UNK_009ec980;
            goto code_r0x00544fc0;
          }
          puVar4 = (undefined8 *)(*(long *)(lVar14 + 0x40) + uVar16 * 0x40);
          in_stack_000000a8 = puVar4[5];
          in_stack_000000a0 = puVar4[4];
          in_stack_000000b8 = puVar4[7];
          in_stack_000000b0 = puVar4[6];
          uStack0000000000000088 = (qword *)puVar4[1];
          uStack0000000000000080 = (qword *)*puVar4;
          in_stack_00000098 = (qword *)puVar4[3];
          in_stack_00000090 = (qword *)puVar4[2];
          _memmove(puVar4,puVar4 + 8,(uVar17 + ~uVar16) * 0x40);
          *(ulong *)(lVar14 + 0x48) = uVar17 - 1;
          func_0x0053ceac(&uStack0000000000000080);
          lVar13 = lVar13 + -8;
        } while (lVar13 != 0);
      }
    } while (param_2 == 0);
    param_2 = param_2 << 3;
    param_3 = 8;
  } while( true );
}

