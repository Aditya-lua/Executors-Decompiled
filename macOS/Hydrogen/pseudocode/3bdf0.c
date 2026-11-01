
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0003bdf0(void)

{
  char *pcVar1;
  ulong uVar2;
  bool bVar3;
  bool bVar4;
  int *******pppppppiVar5;
  undefined8 *******pppppppuVar6;
  code *pcVar7;
  undefined1 uVar8;
  uint uVar9;
  uint uVar10;
  int iVar11;
  undefined8 uVar12;
  ulong uVar13;
  undefined8 uVar14;
  long *plVar15;
  long *plVar16;
  undefined8 uVar17;
  long lVar18;
  char *pcVar19;
  int *******pppppppiVar20;
  undefined8 uVar21;
  undefined8 *puVar22;
  undefined8 *puVar23;
  undefined8 uVar24;
  byte bVar25;
  undefined8 *******pppppppuVar26;
  int *******pppppppiVar27;
  undefined8 ******ppppppuVar28;
  undefined8 uStack0000000000000018;
  undefined8 *******pppppppuStack_198;
  ulong uStack_190;
  ulong uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  long lStack_170;
  undefined8 *puStack_168;
  int *******pppppppiStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  undefined8 *******pppppppuStack_140;
  ulong uStack_138;
  ulong uStack_130;
  undefined8 *******pppppppuStack_128;
  ulong uStack_120;
  undefined8 uStack_118;
  undefined8 *******pppppppuStack_110;
  ulong uStack_108;
  undefined8 uStack_100;
  int *******pppppppiStack_f8;
  ulong uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  long *plStack_d8;
  undefined *puStack_d0;
  long *plStack_c0;
  long lStack_70;
  
  __ZNSt3__16localeD1Ev(&uStack0000000000000018);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  uVar12 = func_0x006e67c8();
  uVar13 = func_0x006e6bc0();
  lVar18 = uStack0000000000000018;
  uVar9 = (uint)uVar13;
  if (uVar9 < 0x10000001) {
    if (uStack0000000000000018 == 0) {
      if (uVar9 == 0) {
        func_0x006e38d8();
        return 1;
      }
      uVar12 = func_0x006e644c();
      __ZNSt3__16localeD1Ev(&uStack0000000000000018);
      uVar12 = __Unwind_Resume(uVar12);
      __ZdaPv();
      uVar12 = __Unwind_Resume(uVar12);
      lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
      uVar14 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
      uVar14 = func_0x00086db4(uVar14,"crypt_encrypt",0xd);
      uVar14 = func_0x00086db4(uVar14," @ ",3);
      uVar14 = func_0x00086db4(uVar14,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
      uVar14 = func_0x00086db4(uVar14,":",1);
      plVar15 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar14,0xdb);
      __ZNKSt3__18ios_base6getlocEv(&plStack_d8,(long)plVar15 + *(long *)(*plVar15 + -0x18));
      plVar16 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                  (&plStack_d8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
      uVar14 = (**(code **)(*plVar16 + 0x38))(plVar16,10);
      __ZNSt3__16localeD1Ev(&plStack_d8);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar15,uVar14);
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar15);
      uVar14 = func_0x006e67c8(uVar12,1,&uStack_e0);
      uVar17 = func_0x006e67c8(uVar12,2,0);
      iVar11 = func_0x006e21f8(uVar12,3);
      if (iVar11 < 1) {
        lVar18 = 0;
      }
      else {
        lVar18 = func_0x006e67c8(uVar12,3,0);
      }
      pcVar19 = (char *)func_0x006e671c(uVar12,4,"CBC",0);
      pcVar1 = "CBC";
      if (pcVar19 != (char *)0x0) {
        pcVar1 = pcVar19;
      }
      uVar13 = _strlen(pcVar1);
      if (uVar13 < 0x7ffffffffffffff8) {
        if (uVar13 < 0x17) {
          uStack_e8 = CONCAT17((char)uVar13,(undefined7)uStack_e8);
          pppppppiVar20 = (int *******)&pppppppiStack_f8;
          if (uVar13 != 0) goto code_r0x0003c120;
        }
        else {
          uVar2 = (uVar13 & 0xfffffffffffffff8) + 8;
          if ((uVar13 | 7) != 0x17) {
            uVar2 = uVar13 | 7;
          }
          pppppppiVar20 = (int *******)__Znwm(uVar2 + 1);
          uStack_e8 = uVar2 + 1 | 0x8000000000000000;
          pppppppiStack_f8 = pppppppiVar20;
          uStack_f0 = uVar13;
code_r0x0003c120:
          _memmove(pppppppiVar20,pcVar1,uVar13);
        }
        *(undefined1 *)((long)pppppppiVar20 + uVar13) = 0;
        pppppppuStack_110 = (undefined8 *******)0x0;
        uStack_108 = 0;
        uStack_100 = 0;
        uVar21 = _strlen(uVar17);
        puVar22 = (undefined8 *)__Znwm(0x68);
        puVar23 = (undefined8 *)__Znwm(0x20);
        func_0x005edf2c(puVar23,0);
        *puVar23 = &UNK_009f9e90;
        puVar23[1] = &UNK_009fa020;
        puVar23[3] = &pppppppuStack_110;
        uVar24 = func_0x006169b8();
        func_0x0003e7a4(puVar22,uVar24,6,puVar23);
        *puVar22 = &UNK_009f7858;
        puVar22[1] = &UNK_009f7a08;
        func_0x0003f450(&plStack_d8,uVar17,uVar21,1,puVar22);
        if ((long)uStack_100 < 0) {
          if (uStack_108 != 0x20) goto code_r0x0003c23c;
        }
        else if (uStack_100._7_1_ != ' ') {
code_r0x0003c23c:
          func_0x006e644c(uVar12,"Key must decode to 32 bytes (256 bits) as per spec, got %zu bytes"
                         );
          goto code_r0x0003cd88;
        }
        plStack_d8 = (long *)&UNK_00a0c238;
        puStack_d0 = &UNK_00a0c3e0;
        if (plStack_c0 != (long *)0x0) {
          (**(code **)(*plStack_c0 + 8))();
        }
        pppppppuStack_128 = (undefined8 *******)0x0;
        uStack_120 = 0;
        uStack_118 = 0;
        pppppppuStack_140 = (undefined8 *******)0x0;
        uStack_138 = 0;
        uStack_130 = 0;
        if ((long)uStack_e8 < 0) {
          func_0x00017634(&pppppppiStack_160,pppppppiStack_f8,uStack_f0);
        }
        else {
          uStack_158 = uStack_f0;
          pppppppiStack_160 = pppppppiStack_f8;
          uStack_150 = uStack_e8;
        }
        uVar13 = (ulong)uStack_150._7_1_;
        pppppppiVar20 = pppppppiStack_160;
        pppppppiVar5 = (int *******)((long)pppppppiStack_160 + uStack_158);
        if (-1 < (long)uStack_150) {
          pppppppiVar20 = (int *******)&pppppppiStack_160;
          pppppppiVar5 = (int *******)((long)&pppppppiStack_160 + uVar13);
        }
        bVar25 = uStack_150._7_1_;
        if (pppppppiVar20 != pppppppiVar5) {
          do {
            uVar8 = ___tolower(*(undefined1 *)pppppppiVar20);
            pppppppiVar27 = (int *******)((long)pppppppiVar20 + 1);
            *(undefined1 *)pppppppiVar20 = uVar8;
            pppppppiVar20 = pppppppiVar27;
          } while (pppppppiVar27 != pppppppiVar5);
          uVar13 = uStack_150 >> 0x38;
          bVar25 = (byte)(uStack_150 >> 0x38);
        }
        uVar2 = uStack_158;
        if (-1 < (char)bVar25) {
          uVar2 = uVar13;
        }
        if (uVar2 == 7) {
          pppppppiVar20 = pppppppiStack_160;
          if (-1 < (char)bVar25) {
            pppppppiVar20 = (int *******)&pppppppiStack_160;
          }
          iVar11 = _memcmp(pppppppiVar20,"aes-ecb");
          if ((iVar11 != 0) &&
             (*(int *)pppppppiVar20 != 0x5f736561 || *(int *)((long)pppppppiVar20 + 3) != 0x6263655f
             )) goto code_r0x0003c340;
code_r0x0003c358:
          if (lVar18 != 0) {
            uVar13 = 0;
            bVar3 = false;
            bVar4 = true;
            goto code_r0x0003c36c;
          }
          if ((long)uStack_118 < 0) {
            *(undefined1 *)pppppppuStack_128 = 0;
            uStack_120 = 0;
            if ((long)uStack_130 < 0) goto code_r0x0003c600;
code_r0x0003c478:
            uStack_130 = uStack_130 & 0xffffffffffffff;
            pppppppuVar26 = &pppppppuStack_140;
          }
          else {
            pppppppuStack_128 = (undefined8 *******)((ulong)pppppppuStack_128 & 0xffffffffffffff00);
            uStack_118 = uStack_118 & 0xffffffffffffff;
            if (-1 < (long)uStack_130) goto code_r0x0003c478;
code_r0x0003c600:
            uStack_138 = 0;
            pppppppuVar26 = pppppppuStack_140;
          }
          *(undefined1 *)pppppppuVar26 = 0;
        }
        else {
          if (uVar2 == 3) {
            pppppppiVar20 = pppppppiStack_160;
            if (-1 < (char)bVar25) {
              pppppppiVar20 = (int *******)&pppppppiStack_160;
            }
            if (*(short *)pppppppiVar20 == 0x6365 && *(char *)((long)pppppppiVar20 + 2) == 'b')
            goto code_r0x0003c358;
          }
code_r0x0003c340:
          if (lVar18 == 0) {
            lStack_170 = _UNK_007fc188;
            uStack_178 = _UNK_007fc180;
            puVar22 = (undefined8 *)func_0x006115d0(0x10);
            puStack_168 = puVar22;
            func_0x006954a8(1,puVar22,0x10);
            if ((long)uStack_118 < 0) {
              uStack_120 = 0x10;
              pppppppuVar26 = pppppppuStack_128;
            }
            else {
              uStack_118 = CONCAT17(0x10,(undefined7)uStack_118);
              pppppppuVar26 = &pppppppuStack_128;
            }
            ppppppuVar28 = (undefined8 ******)*puVar22;
            pppppppuVar26[1] = (undefined8 ******)puVar22[1];
            *pppppppuVar26 = ppppppuVar28;
            *(undefined1 *)(pppppppuVar26 + 2) = 0;
            uVar17 = __Znwm(0x98);
            puVar23 = (undefined8 *)__Znwm(0x20);
            func_0x005edf2c(puVar23,0);
            *puVar23 = &UNK_009f9e90;
            puVar23[1] = &UNK_009fa020;
            puVar23[3] = &pppppppuStack_140;
            func_0x0004004c(uVar17,puVar23,0,0x48);
            func_0x00040ad8(&plStack_d8,&pppppppuStack_128,1,uVar17);
            plStack_d8 = (long *)&UNK_00a0c238;
            puStack_d0 = &UNK_00a0c3e0;
            if (plStack_c0 != (long *)0x0) {
              (**(code **)(*plStack_c0 + 8))();
            }
            *(undefined1 *)((long)puVar22 + 0xf) = 0;
            *(undefined1 *)((long)puVar22 + 0xe) = 0;
            *(undefined1 *)((long)puVar22 + 0xd) = 0;
            *(undefined1 *)((long)puVar22 + 0xc) = 0;
            *(undefined1 *)((long)puVar22 + 0xb) = 0;
            *(undefined1 *)((long)puVar22 + 10) = 0;
            *(undefined1 *)((long)puVar22 + 9) = 0;
            *(undefined1 *)(puVar22 + 1) = 0;
            *(undefined1 *)((long)puVar22 + 7) = 0;
            *(undefined1 *)((long)puVar22 + 6) = 0;
            *(undefined1 *)((long)puVar22 + 5) = 0;
            *(undefined1 *)((long)puVar22 + 4) = 0;
            *(undefined1 *)((long)puVar22 + 3) = 0;
            *(undefined1 *)((long)puVar22 + 2) = 0;
            *(undefined1 *)((long)puVar22 + 1) = 0;
            *(undefined1 *)puVar22 = 0;
            func_0x00611644(puVar22);
          }
          else {
            bVar4 = false;
            bVar3 = true;
            uVar13 = 0x10;
code_r0x0003c36c:
            func_0x0002a730(&pppppppuStack_140,lVar18);
            uVar17 = _strlen(lVar18);
            puVar22 = (undefined8 *)__Znwm(0x68);
            puVar23 = (undefined8 *)__Znwm(0x20);
            func_0x005edf2c(puVar23,0);
            *puVar23 = &UNK_009f9e90;
            puVar23[1] = &UNK_009fa020;
            puVar23[3] = &pppppppuStack_128;
            uVar21 = func_0x006169b8();
            func_0x0003e7a4(puVar22,uVar21,6,puVar23);
            *puVar22 = &UNK_009f7858;
            puVar22[1] = &UNK_009f7a08;
            func_0x0003f450(&plStack_d8,lVar18,uVar17,1,puVar22);
            if (bVar3) {
              if ((long)uStack_118 < 0) {
                if (uStack_120 < uVar13) goto code_r0x0003c8d0;
                if (uVar13 < uStack_120) {
                  pppppppuVar26 = pppppppuStack_128;
                  uStack_120 = uVar13;
                  goto code_r0x0003c49c;
                }
              }
              else {
                if (uStack_118 >> 0x38 < uVar13) {
code_r0x0003c8d0:
                  func_0x006e644c(uVar12,
                                  "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                                 );
                  goto code_r0x0003cd88;
                }
                if (uVar13 < uStack_118 >> 0x38) {
                  uStack_118 = CONCAT17((char)uVar13,(undefined7)uStack_118);
                  pppppppuVar26 = &pppppppuStack_128;
code_r0x0003c49c:
                  *(undefined1 *)((long)pppppppuVar26 + uVar13) = 0;
                }
              }
            }
            if (bVar4) {
              if ((long)uStack_118 < 0) {
                if (uStack_120 != 0) {
code_r0x0003c900:
                  func_0x006e644c(uVar12,
                                  "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value."
                                 );
                  goto code_r0x0003cd88;
                }
                *(undefined1 *)pppppppuStack_128 = 0;
                uStack_120 = 0;
              }
              else {
                if (uStack_118._7_1_ != '\0') goto code_r0x0003c900;
                pppppppuStack_128 =
                     (undefined8 *******)((ulong)pppppppuStack_128 & 0xffffffffffffff00);
                uStack_118 = uStack_118 & 0xffffffffffffff;
              }
            }
            puStack_d0 = &UNK_00a0c3e0;
            plStack_d8 = (long *)&UNK_00a0c238;
            if (plStack_c0 != (long *)0x0) {
              puStack_d0 = &UNK_00a0c3e0;
              plStack_d8 = (long *)&UNK_00a0c238;
              (**(code **)(*plStack_c0 + 8))();
            }
          }
        }
        func_0x0004052c(&plStack_d8,&pppppppiStack_f8,1);
        plVar15 = plStack_d8;
        uStack_180 = 0;
        uStack_178 = 0;
        lStack_170 = 0;
        uVar13 = uStack_108;
        pppppppuVar26 = pppppppuStack_110;
        if (-1 < (long)uStack_100) {
          uVar13 = uStack_100 >> 0x38;
          pppppppuVar26 = &pppppppuStack_110;
        }
        uVar2 = uStack_120;
        pppppppuVar6 = pppppppuStack_128;
        if (-1 < (long)uStack_118) {
          uVar2 = uStack_118 >> 0x38;
          pppppppuVar6 = &pppppppuStack_128;
        }
        func_0x005ee410(plStack_d8,pppppppuVar26,uVar13,pppppppuVar6,uVar2);
        uVar17 = __Znwm(0xd8);
        puVar22 = (undefined8 *)__Znwm(0x20);
        func_0x005edf2c(puVar22,0);
        *puVar22 = &UNK_009f9e90;
        puVar22[1] = &UNK_009fa020;
        puVar22[3] = &uStack_180;
        func_0x0066cd14(uVar17,plVar15 + 1,puVar22,2);
        func_0x0003f450(&plStack_d8,uVar14,uStack_e0,1,uVar17);
        plStack_d8 = (long *)&UNK_00a0c238;
        puStack_d0 = &UNK_00a0c3e0;
        if (plStack_c0 != (long *)0x0) {
          (**(code **)(*plStack_c0 + 8))();
        }
        pppppppuStack_198 = (undefined8 *******)0x0;
        uStack_190 = 0;
        uStack_188 = 0;
        uVar14 = __Znwm(0x98);
        puVar22 = (undefined8 *)__Znwm(0x20);
        func_0x005edf2c(puVar22,0);
        *puVar22 = &UNK_009f9e90;
        puVar22[1] = &UNK_009fa020;
        puVar22[3] = &pppppppuStack_198;
        func_0x0004004c(uVar14,puVar22,0,0x48);
        func_0x00040ad8(&plStack_d8,&uStack_180,1,uVar14);
        plStack_d8 = (long *)&UNK_00a0c238;
        puStack_d0 = &UNK_00a0c3e0;
        if (plStack_c0 != (long *)0x0) {
          (**(code **)(*plStack_c0 + 8))();
        }
        uVar13 = uStack_190;
        pppppppuVar26 = pppppppuStack_198;
        if (-1 < (long)uStack_188) {
          uVar13 = uStack_188 >> 0x38;
          pppppppuVar26 = &pppppppuStack_198;
        }
        func_0x006e38d8(uVar12,pppppppuVar26,uVar13);
        uVar13 = uStack_138;
        pppppppuVar26 = pppppppuStack_140;
        if (-1 < (long)uStack_130) {
          uVar13 = uStack_130 >> 0x38;
          pppppppuVar26 = &pppppppuStack_140;
        }
        func_0x006e38d8(uVar12,pppppppuVar26,uVar13);
        if ((long)uStack_188 < 0) {
          __ZdlPv(pppppppuStack_198);
        }
        if (lStack_170 < 0) {
          __ZdlPv(uStack_180);
        }
        if (plVar15 != (long *)0x0) {
          (**(code **)(*plVar15 + 8))(plVar15);
        }
        if ((long)uStack_150 < 0) {
          __ZdlPv(pppppppiStack_160);
          if ((long)uStack_130 < 0) goto code_r0x0003c870;
code_r0x0003c7ec:
          if (-1 < (long)uStack_118) goto code_r0x0003c7f4;
code_r0x0003c880:
          __ZdlPv(pppppppuStack_128);
          if ((long)uStack_100 < 0) goto code_r0x0003c890;
code_r0x0003c7fc:
          if (-1 < (long)uStack_e8) goto code_r0x0003c804;
code_r0x0003c8a0:
          __ZdlPv(pppppppiStack_f8);
          if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
            return 2;
          }
        }
        else {
          if (-1 < (long)uStack_130) goto code_r0x0003c7ec;
code_r0x0003c870:
          __ZdlPv(pppppppuStack_140);
          if ((long)uStack_118 < 0) goto code_r0x0003c880;
code_r0x0003c7f4:
          if (-1 < (long)uStack_100) goto code_r0x0003c7fc;
code_r0x0003c890:
          __ZdlPv(pppppppuStack_110);
          if ((long)uStack_e8 < 0) goto code_r0x0003c8a0;
code_r0x0003c804:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
            return 2;
          }
        }
        ___stack_chk_fail();
      }
      func_0x0001748c(&pppppppiStack_f8);
code_r0x0003cd88:
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x3cd8c);
      (*pcVar7)();
    }
    if (uVar9 == 0) goto LAB_0003bee0;
    uVar14 = __Znam(uVar13 & 0xffffffff);
    uVar10 = func_0x000a0c14(uVar12,uVar14,lVar18,uVar13);
    if (-1 < (int)uVar10) {
      if (uVar10 == uVar9) {
        func_0x006e38d8();
        __ZdaPv(uVar14);
        return 1;
      }
      func_0x006e644c();
      goto LAB_0003bf1c;
    }
  }
  else {
    func_0x006e644c();
LAB_0003bee0:
    func_0x006e644c();
  }
  func_0x006e644c();
LAB_0003bf1c:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x3bf20);
  (*pcVar7)();
}

