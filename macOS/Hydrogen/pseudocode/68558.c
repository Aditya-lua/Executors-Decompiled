
/* WARNING: Removing unreachable block (ram,0x000684f0) */
/* WARNING: Removing unreachable block (ram,0x0006857c) */
/* WARNING: Removing unreachable block (ram,0x00068444) */
/* WARNING: Removing unreachable block (ram,0x00068494) */
/* WARNING: Removing unreachable block (ram,0x000682ac) */
/* WARNING: Removing unreachable block (ram,0x000682b8) */
/* WARNING: Removing unreachable block (ram,0x0006853c) */
/* WARNING: Removing unreachable block (ram,0x00068474) */
/* WARNING: Removing unreachable block (ram,0x00068294) */

uint FUN_00068558(void)

{
  long lVar1;
  byte bVar2;
  ulong uVar3;
  code *pcVar4;
  bool bVar5;
  int iVar6;
  long *plVar7;
  undefined8 *puVar8;
  byte bVar9;
  long *plVar10;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long *plVar11;
  long unaff_x23;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long *unaff_x28;
  long unaff_x29;
  undefined8 uVar17;
  undefined8 uVar18;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long lStack0000000000000048;
  long *in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  int in_stack_000000f0;
  
  uVar3 = in_stack_00000020;
code_r0x00068558:
  (**(code **)(*unaff_x28 + 0x10))(unaff_x28);
  __ZNSt3__119__shared_weak_count14__release_weakEv(unaff_x28);
  bVar5 = false;
LAB_00068258:
  do {
    if (!bVar5) {
      bVar5 = false;
      goto code_r0x00067ef8;
    }
    do {
      bVar5 = true;
code_r0x00067ef8:
      if (!bVar5) {
code_r0x00068584:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return in_stack_00000020._4_4_ & 1;
        }
        ___stack_chk_fail();
        goto code_r0x000685f8;
      }
      do {
        plVar11 = unaff_x19;
        unaff_x19 = plVar11 + 0xb;
        if (unaff_x19 == (long *)unaff_x23) {
          in_stack_00000020._4_4_ = 0;
          goto code_r0x00068584;
        }
        bVar9 = *(byte *)((long)plVar11 + 0x6f);
        uVar14 = (ulong)bVar9;
        if ((char)bVar9 < '\0') {
          plVar10 = (long *)*unaff_x19;
          uVar15 = plVar11[0xc];
          uVar16 = (ulong)*(byte *)(unaff_x21 + 0x2f);
          bVar5 = uVar15 == 0xffffffffffffffff;
          if ((char)*(byte *)(unaff_x21 + 0x2f) < '\0') goto code_r0x00067f54;
code_r0x00067f2c:
          if (bVar5) {
code_r0x000685c4:
            func_0x00049dd0(unaff_x20);
            goto code_r0x00068600;
          }
          uVar12 = uVar16;
          if (uVar15 <= uVar16) {
            uVar12 = uVar15;
          }
          plVar7 = unaff_x20;
        }
        else {
          plVar10 = (long *)*unaff_x19;
          uVar16 = (ulong)*(byte *)(unaff_x21 + 0x2f);
          bVar5 = uVar14 == 0xffffffffffffffff;
          uVar15 = uVar14;
          if (-1 < (char)*(byte *)(unaff_x21 + 0x2f)) goto code_r0x00067f2c;
code_r0x00067f54:
          if (bVar5) goto code_r0x000685c4;
          plVar7 = *(long **)(unaff_x21 + 0x18);
          uVar12 = *(ulong *)(unaff_x21 + 0x20);
          if (uVar15 <= *(ulong *)(unaff_x21 + 0x20)) {
            uVar12 = uVar15;
          }
        }
        if (-1 < (char)bVar9) {
          plVar10 = unaff_x19;
        }
        iVar6 = _memcmp(plVar7,plVar10,uVar12);
      } while (iVar6 != 0 || uVar12 != uVar15);
      if ((char)bVar9 < '\0') {
        uVar14 = plVar11[0xc];
        if ((uint)uVar16 >> 7 != 0) goto code_r0x00067fb8;
code_r0x00067f8c:
        if (uVar16 < uVar14) {
code_r0x000685d0:
          func_0x00049dd0(&uStack0000000000000060);
          goto code_r0x00068600;
        }
        uVar15 = uVar16 - uVar14;
        plVar10 = unaff_x20;
      }
      else {
        if ((uint)uVar16 >> 7 == 0) goto code_r0x00067f8c;
code_r0x00067fb8:
        uVar16 = *(ulong *)(unaff_x21 + 0x20);
        if (uVar16 < uVar14) goto code_r0x000685d0;
        plVar10 = (long *)*unaff_x20;
        uVar15 = uVar16 - uVar14;
      }
      if (0x7ffffffffffffff7 < uVar15) {
        func_0x0001748c(&uStack0000000000000060);
        goto code_r0x00068600;
      }
      if (uVar15 < 0x17) {
        _uStack0000000000000070 = CONCAT17((char)uVar15,uStack0000000000000070);
        puVar8 = &uStack0000000000000060;
        if (uVar16 != uVar14) goto code_r0x00068028;
      }
      else {
        uVar16 = (uVar15 & 0xfffffffffffffff8) + 8;
        if ((uVar15 | 7) != 0x17) {
          uVar16 = uVar15 | 7;
        }
        puVar8 = (undefined8 *)__Znwm(uVar16 + 1);
        _uStack0000000000000070 = uVar16 + 1 | 0x8000000000000000;
        uStack0000000000000060 = puVar8;
        in_stack_00000068 = uVar15;
code_r0x00068028:
        _memmove(puVar8,(long)plVar10 + uVar14,uVar15);
      }
      *(undefined1 *)((long)puVar8 + uVar15) = 0;
      puVar8 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                         (&uStack0000000000000060,0,"/",1);
      uVar18 = puVar8[1];
      uVar17 = *puVar8;
      *(undefined8 *)(unaff_x29 + -0xc0) = puVar8[2];
      *(undefined8 *)(unaff_x29 + -200) = uVar18;
      *(undefined8 *)(unaff_x29 + -0xd0) = uVar17;
      puVar8[1] = 0;
      puVar8[2] = 0;
      *puVar8 = 0;
      if ((long)_uStack0000000000000070 < 0) {
        __ZdlPv(uStack0000000000000060);
      }
      iVar6 = func_0x00068df8(unaff_x29 + -0xd0);
    } while (iVar6 == 0);
    bVar9 = *(byte *)((long)plVar11 + 0x87);
    uVar14 = plVar11[0xf];
    if (-1 < (char)bVar9) {
      uVar14 = (ulong)bVar9;
    }
    bVar2 = *(byte *)(unaff_x29 + -0xb9);
    uVar15 = *(ulong *)(unaff_x29 + -200);
    if (-1 < (char)bVar2) {
      uVar15 = (ulong)bVar2;
    }
    uVar16 = uVar15 + uVar14;
    if (0x7ffffffffffffff7 < uVar16) {
      func_0x0001748c(unaff_x29 + -0xe8);
code_r0x00068600:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x68604);
      (*pcVar4)();
    }
    if (uVar16 < 0x17) {
      *(undefined8 *)(unaff_x29 + -0xe0) = 0;
      *(undefined8 *)(unaff_x29 + -0xd8) = 0;
      *(undefined8 *)(unaff_x29 + -0xe8) = 0;
      lVar13 = unaff_x29 + -0xe8;
      *(char *)(unaff_x29 + -0xd1) = (char)uVar16;
    }
    else {
      uVar12 = (uVar16 & 0xfffffffffffffff8) + 8;
      if ((uVar16 | 7) != 0x17) {
        uVar12 = uVar16 | 7;
      }
      lVar13 = __Znwm(uVar12 + 1);
      *(ulong *)(unaff_x29 + -0xe0) = uVar16;
      *(ulong *)(unaff_x29 + -0xd8) = uVar12 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xe8) = lVar13;
    }
    if (uVar14 != 0) {
      plVar10 = (long *)plVar11[0xe];
      if (-1 < (char)bVar9) {
        plVar10 = plVar11 + 0xe;
      }
      _memmove(lVar13,plVar10,uVar14);
    }
    if (uVar15 != 0) {
      lVar1 = *(long *)(unaff_x29 + -0xd0);
      if (-1 < (char)bVar2) {
        lVar1 = unaff_x29 + -0xd0;
      }
      _memmove(lVar13 + uVar14,lVar1,uVar15);
    }
    *(undefined1 *)(lVar13 + uVar14 + uVar15) = 0;
    bVar9 = *(byte *)(unaff_x29 + -0xd1);
    lVar13 = *(long *)(unaff_x29 + -0xe8);
    uVar14 = *(ulong *)(unaff_x29 + -0xe0);
    lVar1 = lVar13;
    if (-1 < (char)bVar9) {
      uVar14 = (ulong)bVar9;
      lVar1 = unaff_x29 + -0xe8;
    }
    if (*(char *)(lVar1 + uVar14 + -1) == '/') {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (unaff_x29 + -0xe8,"index.html",10);
      bVar9 = *(byte *)(unaff_x29 + -0xd1);
      lVar13 = *(long *)(unaff_x29 + -0xe8);
    }
    in_stack_000000f0 = 0xffffffff;
    if (-1 < (char)bVar9) {
      lVar13 = unaff_x29 + -0xe8;
    }
    in_stack_000000f0 = _stat(lVar13,&uStack0000000000000060);
    unaff_x21 = in_stack_00000030;
    if (-1 < in_stack_000000f0) {
      if ((uStack0000000000000060._4_2_ & 0xf000) != 0x8000) {
        if ((uStack0000000000000060._4_2_ & 0xf000) == 0x4000) {
          bVar9 = *(byte *)(unaff_x29 + -0xb9);
          uVar14 = *(ulong *)(unaff_x29 + -200);
          if (-1 < (char)bVar9) {
            uVar14 = (ulong)bVar9;
          }
          plVar11 = (long *)(uVar14 + 1);
          if ((long *)0x7ffffffffffffff7 < plVar11) {
code_r0x000685f8:
            func_0x0001748c(&lStack0000000000000048);
            goto code_r0x00068600;
          }
          if ((long *)((long)&MACH_HEADER.sizeofcmds + 2) < plVar11) {
            uVar15 = ((ulong)plVar11 & 0xfffffffffffffff8) + 8;
            if (((ulong)plVar11 | 7) != 0x17) {
              uVar15 = (ulong)plVar11 | 7;
            }
            plVar10 = (long *)__Znwm(uVar15 + 1);
            in_stack_00000058 = uVar15 + 1 | 0x8000000000000000;
            lStack0000000000000048 = (long)plVar10;
            in_stack_00000050 = plVar11;
code_r0x000683dc:
            lVar13 = *(long *)(unaff_x29 + -0xd0);
            if (-1 < (char)bVar9) {
              lVar13 = unaff_x29 + -0xd0;
            }
            _memmove(plVar10,lVar13,uVar14);
          }
          else {
            in_stack_00000050 = (long *)0x0;
            lStack0000000000000048 = 0;
            plVar10 = &lStack0000000000000048;
            in_stack_00000058 = (long)plVar11 << 0x38;
            if (uVar14 != 0) goto code_r0x000683dc;
          }
          *(undefined2 *)((long)plVar10 + uVar14) = 0x2f;
          iVar6 = func_0x000616fc(&lStack0000000000000048);
          if (iVar6 != 0) {
            *(undefined1 *)(unaff_x29 + -0xa1) = 8;
            *(undefined8 *)(unaff_x29 + -0xb8) = 0x6e6f697461636f4c;
            *(undefined1 *)(unaff_x29 + -0xb0) = 0;
            func_0x0005dd28(in_stack_00000028,unaff_x29 + -0xb8,&lStack0000000000000048);
            *(undefined4 *)(in_stack_00000028 + 0x18) = 0x12d;
          }
          if ((long)in_stack_00000058 < 0) {
            __ZdlPv(lStack0000000000000048);
            bVar5 = false;
            in_stack_00000020._4_4_ = 1;
          }
          else {
            bVar5 = false;
            in_stack_00000020._4_4_ = 1;
          }
        }
        else {
          bVar5 = true;
        }
        goto LAB_00068258;
      }
      plVar11 = plVar11 + 0x13;
      while (plVar11 = (long *)*plVar11, plVar11 != (long *)0x0) {
        func_0x0005dd28(in_stack_00000028,plVar11 + 2,plVar11 + 5);
      }
      unaff_x28 = (long *)__Znwm(0x38);
      plVar11 = unaff_x28 + 1;
      *plVar11 = 0;
      unaff_x28[2] = 0;
      plVar10 = unaff_x28 + 3;
      *(undefined4 *)plVar10 = 0xffffffff;
      *unaff_x28 = (long)&UNK_009b9128;
      unaff_x28[4] = 0;
      unaff_x28[5] = 0;
      *(undefined1 *)(unaff_x28 + 6) = 0;
      func_0x00070518(plVar10,unaff_x29 + -0xe8);
      lStack0000000000000048 = (long)plVar10;
      in_stack_00000050 = unaff_x28;
      if (((char)unaff_x28[6] == '\0') && (unaff_x28[5] == 0)) {
        in_stack_00000020._4_4_ = 0;
        LOAcquire();
        lVar13 = *plVar11;
        *plVar11 = lVar13 + -1;
        LORelease();
      }
      else {
        lVar13 = unaff_x28[4];
        func_0x0005de70(unaff_x29 + -0xb8,unaff_x29 + -0xe8,in_stack_00000018,in_stack_00000010);
        unaff_x28[1] = unaff_x28[1] + 1;
        *(undefined **)(unaff_x29 + -0x80) = &UNK_009b8b58;
        *(long **)(unaff_x29 + -0x78) = plVar10;
        *(long **)(unaff_x29 + -0x70) = unaff_x28;
        *(long *)(unaff_x29 + -0x68) = unaff_x29 + -0x80;
        *(undefined8 *)(unaff_x29 + -0x88) = 0;
        func_0x0005e578(in_stack_00000028,lVar13,unaff_x29 + -0xb8,unaff_x29 + -0x80,
                        unaff_x29 + -0xa0);
        plVar10 = *(long **)(unaff_x29 + -0x88);
        if (plVar10 == (long *)(unaff_x29 + -0xa0)) {
          plVar10 = (long *)(unaff_x29 + -0xa0);
          lVar13 = 4;
code_r0x000684a0:
          (**(code **)(*plVar10 + lVar13 * 8))();
        }
        else if (plVar10 != (long *)0x0) {
          lVar13 = 5;
          goto code_r0x000684a0;
        }
        plVar10 = *(long **)(unaff_x29 + -0x68);
        if (plVar10 == (long *)(unaff_x29 + -0x80)) {
          plVar10 = (long *)(unaff_x29 + -0x80);
          lVar13 = 4;
code_r0x000684d0:
          (**(code **)(*plVar10 + lVar13 * 8))();
        }
        else if (plVar10 != (long *)0x0) {
          lVar13 = 5;
          goto code_r0x000684d0;
        }
        if (((uVar3 & 1) == 0) &&
           (plVar10 = *(long **)(in_stack_00000008 + 0xe0), plVar10 != (long *)0x0)) {
          (**(code **)(*plVar10 + 0x30))(plVar10,in_stack_00000030,in_stack_00000028);
        }
        in_stack_00000020._4_4_ = 1;
        LOAcquire();
        lVar13 = *plVar11;
        *plVar11 = lVar13 + -1;
        LORelease();
      }
      if (lVar13 != 0) {
        bVar5 = false;
        goto LAB_00068258;
      }
      goto code_r0x00068558;
    }
    bVar5 = true;
  } while( true );
}

