
/* WARNING: Removing unreachable block (ram,0x00068474) */
/* WARNING: Removing unreachable block (ram,0x00068494) */
/* WARNING: Removing unreachable block (ram,0x00068444) */
/* WARNING: Removing unreachable block (ram,0x000684f0) */
/* WARNING: Removing unreachable block (ram,0x0006857c) */
/* WARNING: Removing unreachable block (ram,0x00068294) */
/* WARNING: Removing unreachable block (ram,0x000682ac) */
/* WARNING: Removing unreachable block (ram,0x000682b8) */

undefined4 FUN_00068428(void)

{
  long lVar1;
  byte bVar2;
  code *pcVar3;
  bool bVar4;
  int iVar5;
  undefined8 *puVar6;
  long *plVar7;
  byte bVar8;
  long *plVar9;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long *plVar10;
  long unaff_x23;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x29;
  undefined8 uVar16;
  undefined8 uVar17;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  uint in_stack_00000020;
  undefined4 uStack0000000000000024;
  long in_stack_00000028;
  long in_stack_00000030;
  long lStack0000000000000048;
  long *in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  int in_stack_000000f0;
  
  do {
    *(undefined1 *)(unaff_x29 + -0xb0) = 0;
    func_0x0005dd28(in_stack_00000028,unaff_x29 + -0xb8,&lStack0000000000000048);
    *(undefined4 *)(in_stack_00000028 + 0x18) = 0x12d;
    do {
      if ((long)in_stack_00000058 < 0) {
        __ZdlPv(lStack0000000000000048);
        bVar4 = false;
        uStack0000000000000024 = 1;
      }
      else {
        bVar4 = false;
        uStack0000000000000024 = 1;
      }
LAB_00068258:
      if (!bVar4) {
        bVar4 = false;
        goto code_r0x00067ef8;
      }
      do {
        bVar4 = true;
code_r0x00067ef8:
        if (!bVar4) {
code_r0x00068584:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return uStack0000000000000024;
          }
          ___stack_chk_fail();
          goto code_r0x000685f8;
        }
        do {
          plVar10 = unaff_x19;
          unaff_x19 = plVar10 + 0xb;
          if (unaff_x19 == (long *)unaff_x23) {
            uStack0000000000000024 = 0;
            goto code_r0x00068584;
          }
          bVar8 = *(byte *)((long)plVar10 + 0x6f);
          uVar13 = (ulong)bVar8;
          if ((char)bVar8 < '\0') {
            plVar9 = (long *)*unaff_x19;
            uVar14 = plVar10[0xc];
            uVar15 = (ulong)*(byte *)(unaff_x21 + 0x2f);
            bVar4 = uVar14 == 0xffffffffffffffff;
            if ((char)*(byte *)(unaff_x21 + 0x2f) < '\0') goto code_r0x00067f54;
code_r0x00067f2c:
            if (bVar4) {
code_r0x000685c4:
              func_0x00049dd0(unaff_x20);
              goto code_r0x00068600;
            }
            uVar11 = uVar15;
            if (uVar14 <= uVar15) {
              uVar11 = uVar14;
            }
            plVar7 = unaff_x20;
          }
          else {
            plVar9 = (long *)*unaff_x19;
            uVar15 = (ulong)*(byte *)(unaff_x21 + 0x2f);
            bVar4 = uVar13 == 0xffffffffffffffff;
            uVar14 = uVar13;
            if (-1 < (char)*(byte *)(unaff_x21 + 0x2f)) goto code_r0x00067f2c;
code_r0x00067f54:
            if (bVar4) goto code_r0x000685c4;
            plVar7 = *(long **)(unaff_x21 + 0x18);
            uVar11 = *(ulong *)(unaff_x21 + 0x20);
            if (uVar14 <= *(ulong *)(unaff_x21 + 0x20)) {
              uVar11 = uVar14;
            }
          }
          if (-1 < (char)bVar8) {
            plVar9 = unaff_x19;
          }
          iVar5 = _memcmp(plVar7,plVar9,uVar11);
        } while (iVar5 != 0 || uVar11 != uVar14);
        if ((char)bVar8 < '\0') {
          uVar13 = plVar10[0xc];
          if ((uint)uVar15 >> 7 != 0) goto code_r0x00067fb8;
code_r0x00067f8c:
          if (uVar15 < uVar13) {
code_r0x000685d0:
            func_0x00049dd0(&uStack0000000000000060);
            goto code_r0x00068600;
          }
          uVar14 = uVar15 - uVar13;
          plVar9 = unaff_x20;
        }
        else {
          if ((uint)uVar15 >> 7 == 0) goto code_r0x00067f8c;
code_r0x00067fb8:
          uVar15 = *(ulong *)(unaff_x21 + 0x20);
          if (uVar15 < uVar13) goto code_r0x000685d0;
          plVar9 = (long *)*unaff_x20;
          uVar14 = uVar15 - uVar13;
        }
        if (0x7ffffffffffffff7 < uVar14) {
          func_0x0001748c(&uStack0000000000000060);
          goto code_r0x00068600;
        }
        if (uVar14 < 0x17) {
          _uStack0000000000000070 = CONCAT17((char)uVar14,uStack0000000000000070);
          puVar6 = &uStack0000000000000060;
          if (uVar15 != uVar13) goto code_r0x00068028;
        }
        else {
          uVar15 = (uVar14 & 0xfffffffffffffff8) + 8;
          if ((uVar14 | 7) != 0x17) {
            uVar15 = uVar14 | 7;
          }
          puVar6 = (undefined8 *)__Znwm(uVar15 + 1);
          _uStack0000000000000070 = uVar15 + 1 | 0x8000000000000000;
          uStack0000000000000060 = puVar6;
          in_stack_00000068 = uVar14;
code_r0x00068028:
          _memmove(puVar6,(long)plVar9 + uVar13,uVar14);
        }
        *(undefined1 *)((long)puVar6 + uVar14) = 0;
        puVar6 = (undefined8 *)
                 __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                           (&uStack0000000000000060,0,"/",1);
        uVar17 = puVar6[1];
        uVar16 = *puVar6;
        *(undefined8 *)(unaff_x29 + -0xc0) = puVar6[2];
        *(undefined8 *)(unaff_x29 + -200) = uVar17;
        *(undefined8 *)(unaff_x29 + -0xd0) = uVar16;
        puVar6[1] = 0;
        puVar6[2] = 0;
        *puVar6 = 0;
        if ((long)_uStack0000000000000070 < 0) {
          __ZdlPv(uStack0000000000000060);
        }
        iVar5 = func_0x00068df8(unaff_x29 + -0xd0);
      } while (iVar5 == 0);
      bVar8 = *(byte *)((long)plVar10 + 0x87);
      uVar13 = plVar10[0xf];
      if (-1 < (char)bVar8) {
        uVar13 = (ulong)bVar8;
      }
      bVar2 = *(byte *)(unaff_x29 + -0xb9);
      uVar14 = *(ulong *)(unaff_x29 + -200);
      if (-1 < (char)bVar2) {
        uVar14 = (ulong)bVar2;
      }
      uVar15 = uVar14 + uVar13;
      if (0x7ffffffffffffff7 < uVar15) {
        func_0x0001748c(unaff_x29 + -0xe8);
        goto code_r0x00068600;
      }
      if (uVar15 < 0x17) {
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0;
        lVar12 = unaff_x29 + -0xe8;
        *(char *)(unaff_x29 + -0xd1) = (char)uVar15;
      }
      else {
        uVar11 = (uVar15 & 0xfffffffffffffff8) + 8;
        if ((uVar15 | 7) != 0x17) {
          uVar11 = uVar15 | 7;
        }
        lVar12 = __Znwm(uVar11 + 1);
        *(ulong *)(unaff_x29 + -0xe0) = uVar15;
        *(ulong *)(unaff_x29 + -0xd8) = uVar11 + 1 | 0x8000000000000000;
        *(long *)(unaff_x29 + -0xe8) = lVar12;
      }
      if (uVar13 != 0) {
        plVar9 = (long *)plVar10[0xe];
        if (-1 < (char)bVar8) {
          plVar9 = plVar10 + 0xe;
        }
        _memmove(lVar12,plVar9,uVar13);
      }
      if (uVar14 != 0) {
        lVar1 = *(long *)(unaff_x29 + -0xd0);
        if (-1 < (char)bVar2) {
          lVar1 = unaff_x29 + -0xd0;
        }
        _memmove(lVar12 + uVar13,lVar1,uVar14);
      }
      *(undefined1 *)(lVar12 + uVar13 + uVar14) = 0;
      bVar8 = *(byte *)(unaff_x29 + -0xd1);
      lVar12 = *(long *)(unaff_x29 + -0xe8);
      uVar13 = *(ulong *)(unaff_x29 + -0xe0);
      lVar1 = lVar12;
      if (-1 < (char)bVar8) {
        uVar13 = (ulong)bVar8;
        lVar1 = unaff_x29 + -0xe8;
      }
      if (*(char *)(lVar1 + uVar13 + -1) == '/') {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (unaff_x29 + -0xe8,"index.html",10);
        bVar8 = *(byte *)(unaff_x29 + -0xd1);
        lVar12 = *(long *)(unaff_x29 + -0xe8);
      }
      in_stack_000000f0 = 0xffffffff;
      if (-1 < (char)bVar8) {
        lVar12 = unaff_x29 + -0xe8;
      }
      in_stack_000000f0 = _stat(lVar12,&uStack0000000000000060);
      unaff_x21 = in_stack_00000030;
      if (in_stack_000000f0 < 0) {
        bVar4 = true;
        goto LAB_00068258;
      }
      if ((uStack0000000000000060._4_2_ & 0xf000) == 0x8000) {
        plVar10 = plVar10 + 0x13;
        while (plVar10 = (long *)*plVar10, plVar10 != (long *)0x0) {
          func_0x0005dd28(in_stack_00000028,plVar10 + 2,plVar10 + 5);
        }
        plVar10 = (long *)__Znwm(0x38);
        plVar9 = plVar10 + 1;
        *plVar9 = 0;
        plVar10[2] = 0;
        plVar7 = plVar10 + 3;
        *(undefined4 *)plVar7 = 0xffffffff;
        *plVar10 = (long)&UNK_009b9128;
        plVar10[4] = 0;
        plVar10[5] = 0;
        *(undefined1 *)(plVar10 + 6) = 0;
        func_0x00070518(plVar7,unaff_x29 + -0xe8);
        lStack0000000000000048 = (long)plVar7;
        in_stack_00000050 = plVar10;
        if (((char)plVar10[6] == '\0') && (plVar10[5] == 0)) {
          uStack0000000000000024 = 0;
          LOAcquire();
          lVar12 = *plVar9;
          *plVar9 = lVar12 + -1;
          LORelease();
        }
        else {
          lVar12 = plVar10[4];
          func_0x0005de70(unaff_x29 + -0xb8,unaff_x29 + -0xe8,in_stack_00000018,in_stack_00000010);
          plVar10[1] = plVar10[1] + 1;
          *(undefined **)(unaff_x29 + -0x80) = &UNK_009b8b58;
          *(long **)(unaff_x29 + -0x78) = plVar7;
          *(long **)(unaff_x29 + -0x70) = plVar10;
          *(long *)(unaff_x29 + -0x68) = unaff_x29 + -0x80;
          *(undefined8 *)(unaff_x29 + -0x88) = 0;
          func_0x0005e578(in_stack_00000028,lVar12,unaff_x29 + -0xb8,unaff_x29 + -0x80,
                          unaff_x29 + -0xa0);
          plVar7 = *(long **)(unaff_x29 + -0x88);
          if (plVar7 == (long *)(unaff_x29 + -0xa0)) {
            plVar7 = (long *)(unaff_x29 + -0xa0);
            lVar12 = 4;
code_r0x000684a0:
            (**(code **)(*plVar7 + lVar12 * 8))();
          }
          else if (plVar7 != (long *)0x0) {
            lVar12 = 5;
            goto code_r0x000684a0;
          }
          plVar7 = *(long **)(unaff_x29 + -0x68);
          if (plVar7 == (long *)(unaff_x29 + -0x80)) {
            plVar7 = (long *)(unaff_x29 + -0x80);
            lVar12 = 4;
code_r0x000684d0:
            (**(code **)(*plVar7 + lVar12 * 8))();
          }
          else if (plVar7 != (long *)0x0) {
            lVar12 = 5;
            goto code_r0x000684d0;
          }
          if (((in_stack_00000020 & 1) == 0) &&
             (plVar7 = *(long **)(in_stack_00000008 + 0xe0), plVar7 != (long *)0x0)) {
            (**(code **)(*plVar7 + 0x30))(plVar7,in_stack_00000030,in_stack_00000028);
          }
          uStack0000000000000024 = 1;
          LOAcquire();
          lVar12 = *plVar9;
          *plVar9 = lVar12 + -1;
          LORelease();
        }
        if (lVar12 == 0) {
          (**(code **)(*plVar10 + 0x10))(plVar10);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar10);
          bVar4 = false;
        }
        else {
          bVar4 = false;
        }
        goto LAB_00068258;
      }
      if ((uStack0000000000000060._4_2_ & 0xf000) != 0x4000) {
        bVar4 = true;
        goto LAB_00068258;
      }
      bVar8 = *(byte *)(unaff_x29 + -0xb9);
      uVar13 = *(ulong *)(unaff_x29 + -200);
      if (-1 < (char)bVar8) {
        uVar13 = (ulong)bVar8;
      }
      plVar10 = (long *)(uVar13 + 1);
      if ((long *)0x7ffffffffffffff7 < plVar10) {
code_r0x000685f8:
        func_0x0001748c(&lStack0000000000000048);
code_r0x00068600:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x68604);
        (*pcVar3)();
      }
      if ((long *)((long)&MACH_HEADER.sizeofcmds + 2) < plVar10) {
        uVar14 = ((ulong)plVar10 & 0xfffffffffffffff8) + 8;
        if (((ulong)plVar10 | 7) != 0x17) {
          uVar14 = (ulong)plVar10 | 7;
        }
        plVar9 = (long *)__Znwm(uVar14 + 1);
        in_stack_00000058 = uVar14 + 1 | 0x8000000000000000;
        lStack0000000000000048 = (long)plVar9;
        in_stack_00000050 = plVar10;
code_r0x000683dc:
        lVar12 = *(long *)(unaff_x29 + -0xd0);
        if (-1 < (char)bVar8) {
          lVar12 = unaff_x29 + -0xd0;
        }
        _memmove(plVar9,lVar12,uVar13);
      }
      else {
        in_stack_00000050 = (long *)0x0;
        lStack0000000000000048 = 0;
        plVar9 = &lStack0000000000000048;
        in_stack_00000058 = (long)plVar10 << 0x38;
        if (uVar13 != 0) goto code_r0x000683dc;
      }
      *(undefined2 *)((long)plVar9 + uVar13) = 0x2f;
      iVar5 = func_0x000616fc(&lStack0000000000000048);
    } while (iVar5 == 0);
    *(undefined1 *)(unaff_x29 + -0xa1) = 8;
    *(undefined8 *)(unaff_x29 + -0xb8) = 0x6e6f697461636f4c;
  } while( true );
}

