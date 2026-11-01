
void FUN_0002469c(void)

{
  long *plVar1;
  code *pcVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  uint uVar6;
  long lVar7;
  ulong uVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  undefined8 *puVar14;
  long *unaff_x19;
  long unaff_x20;
  long lVar15;
  long lVar16;
  undefined1 *puVar17;
  long lVar18;
  undefined1 *puVar19;
  undefined1 *puVar20;
  undefined1 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  *unaff_x19 = 0;
  puVar3 = (undefined1 *)__Znwm(1);
  *puVar3 = *(undefined1 *)(unaff_x20 + 5);
  unaff_x19[1] = (long)(puVar3 + 1);
  unaff_x19[2] = (long)(puVar3 + 1);
  *unaff_x19 = (long)puVar3;
  puVar4 = (undefined1 *)__Znwm(2);
  puVar17 = puVar4 + 2;
  puVar4[1] = *(undefined1 *)(unaff_x20 + 4);
  *puVar4 = *puVar3;
  lVar7 = *unaff_x19;
  *unaff_x19 = (long)puVar4;
  unaff_x19[1] = (long)puVar17;
  unaff_x19[2] = (long)puVar17;
  if (lVar7 != 0) {
    __ZdlPv(lVar7);
  }
  unaff_x19[1] = (long)puVar17;
  if (0 < *(int *)(unaff_x20 + 0x98)) {
    lVar7 = 0;
    do {
      lVar18 = *(long *)(unaff_x20 + 8);
      plVar1 = (long *)(lVar18 + lVar7 * 0x10);
      switch(*(undefined4 *)((long)plVar1 + 0xc)) {
      case 0:
        puVar17 = (undefined1 *)unaff_x19[1];
        if (puVar17 < (undefined1 *)unaff_x19[2]) {
          *puVar17 = 0;
          unaff_x19[1] = (long)(puVar17 + 1);
        }
        else {
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar17 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar8 = unaff_x19[2] - (long)puVar4;
          puVar10 = (undefined1 *)(uVar8 * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < uVar8) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 == (undefined1 *)0x0) {
            puVar5 = (undefined1 *)0x0;
            *puVar20 = 0;
            puVar3 = puVar20;
          }
          else {
            puVar5 = (undefined1 *)__Znwm(puVar10);
            puVar3 = puVar5 + (long)puVar20;
            *puVar3 = 0;
          }
          puVar19 = puVar3 + 1;
          if (puVar17 != puVar4) {
            puVar13 = puVar17;
            if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar20) &&
               (0x3f < (ulong)((long)puVar4 - (long)puVar5))) {
              if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
                puVar9 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
                puVar11 = (undefined8 *)(puVar17 + -0x20);
                puVar14 = (undefined8 *)(puVar5 + (long)puVar20 + -0x20);
                puVar13 = puVar9;
                do {
                  uVar24 = *puVar11;
                  uVar23 = puVar11[3];
                  uVar22 = puVar11[2];
                  uVar28 = puVar11[-3];
                  uVar27 = puVar11[-4];
                  uVar26 = puVar11[-1];
                  uVar25 = puVar11[-2];
                  puVar14[1] = puVar11[1];
                  *puVar14 = uVar24;
                  puVar14[3] = uVar23;
                  puVar14[2] = uVar22;
                  puVar14[-3] = uVar28;
                  puVar14[-4] = uVar27;
                  puVar14[-1] = uVar26;
                  puVar14[-2] = uVar25;
                  puVar11 = puVar11 + -8;
                  puVar14 = puVar14 + -8;
                  puVar13 = puVar13 + -0x40;
                } while (puVar13 != (undefined1 *)0x0);
                if (puVar20 == puVar9) goto code_r0x00025fc8;
                if (((ulong)puVar20 & 0x38) == 0) {
                  puVar3 = puVar3 + -(long)puVar9;
                  puVar13 = puVar17 + -(long)puVar9;
                  goto code_r0x00025ed8;
                }
              }
              else {
                puVar9 = (undefined1 *)0x0;
              }
              puVar12 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
              puVar13 = puVar17 + -(long)puVar12;
              puVar3 = puVar3 + -(long)puVar12;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar9);
              puVar11 = (undefined8 *)(puVar5 + ((long)puVar14 - (long)puVar4));
              lVar18 = (long)puVar9 - (long)puVar12;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              if (puVar20 == puVar12) goto code_r0x00025fc8;
            }
code_r0x00025ed8:
            do {
              puVar3 = puVar3 + -1;
              puVar13 = puVar13 + -1;
              *puVar3 = *puVar13;
            } while (puVar13 != puVar4);
            goto code_r0x00025fc8;
          }
code_r0x00025618:
          *unaff_x19 = (long)puVar3;
          unaff_x19[1] = (long)puVar19;
          unaff_x19[2] = (long)(puVar5 + (long)puVar10);
joined_r0x00025fdc:
          if (puVar17 != (undefined1 *)0x0) {
            __ZdlPv(puVar3,puVar17);
          }
          unaff_x19[1] = (long)puVar19;
        }
        break;
      case 1:
        puVar17 = (undefined1 *)unaff_x19[1];
        uVar21 = (undefined1)*plVar1;
        if ((undefined1 *)unaff_x19[2] <= puVar17) {
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar17 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar8 = unaff_x19[2] - (long)puVar4;
          puVar10 = (undefined1 *)(uVar8 * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < uVar8) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 == (undefined1 *)0x0) {
            puVar5 = (undefined1 *)0x0;
            *puVar20 = uVar21;
            puVar3 = puVar20;
          }
          else {
            puVar5 = (undefined1 *)__Znwm(puVar10);
            puVar3 = puVar5 + (long)puVar20;
            *puVar3 = uVar21;
          }
          puVar19 = puVar3 + 1;
          if (puVar17 == puVar4) {
            *unaff_x19 = (long)puVar3;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)(puVar5 + (long)puVar10);
            goto joined_r0x00025fdc;
          }
          puVar13 = puVar17;
          if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar20) &&
             (0x3f < (ulong)((long)puVar4 - (long)puVar5))) {
            if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
              puVar9 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar5 + (long)puVar20 + -0x20);
              puVar13 = puVar9;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar13 = puVar13 + -0x40;
              } while (puVar13 != (undefined1 *)0x0);
              if (puVar20 == puVar9) goto code_r0x00025fc8;
              if (((ulong)puVar20 & 0x38) == 0) {
                puVar3 = puVar3 + -(long)puVar9;
                puVar13 = puVar17 + -(long)puVar9;
                goto code_r0x00025eb8;
              }
            }
            else {
              puVar9 = (undefined1 *)0x0;
            }
            puVar12 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
            puVar13 = puVar17 + -(long)puVar12;
            puVar3 = puVar3 + -(long)puVar12;
            puVar14 = (undefined8 *)(puVar17 + -(long)puVar9);
            puVar11 = (undefined8 *)(puVar5 + ((long)puVar14 - (long)puVar4));
            lVar18 = (long)puVar9 - (long)puVar12;
            do {
              puVar14 = puVar14 + -1;
              puVar11 = puVar11 + -1;
              *puVar11 = *puVar14;
              lVar18 = lVar18 + 8;
            } while (lVar18 != 0);
            if (puVar20 == puVar12) goto code_r0x00025fc8;
          }
code_r0x00025eb8:
          do {
            puVar3 = puVar3 + -1;
            puVar13 = puVar13 + -1;
            *puVar3 = *puVar13;
          } while (puVar13 != puVar4);
code_r0x00025fc8:
          puVar17 = (undefined1 *)*unaff_x19;
          *unaff_x19 = (long)puVar5;
          unaff_x19[1] = (long)puVar19;
          unaff_x19[2] = (long)(puVar5 + (long)puVar10);
          puVar3 = puVar5;
          goto joined_r0x00025fdc;
        }
        *puVar17 = uVar21;
        unaff_x19[1] = (long)(puVar17 + 1);
        break;
      case 3:
        func_0x000262e0();
        break;
      case 4:
        puVar17 = (undefined1 *)unaff_x19[1];
        if (puVar17 < (undefined1 *)unaff_x19[2]) {
          puVar19 = puVar17 + 1;
          *puVar17 = 0;
        }
        else {
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar17 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar8 = unaff_x19[2] - (long)puVar4;
          puVar10 = (undefined1 *)(uVar8 * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < uVar8) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 == (undefined1 *)0x0) {
            puVar5 = (undefined1 *)0x0;
            puVar19 = puVar20 + 1;
            *puVar20 = 0;
            puVar3 = puVar20;
            if (puVar17 == puVar4) goto code_r0x00024ae0;
code_r0x000249b4:
            puVar13 = puVar17;
            if ((puVar20 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar4 - (long)puVar5) < 0x40)
               ) {
code_r0x00025ef8:
              do {
                puVar3 = puVar3 + -1;
                puVar13 = puVar13 + -1;
                *puVar3 = *puVar13;
              } while (puVar13 != puVar4);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
              puVar9 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar5 + (long)puVar20 + -0x20);
              puVar13 = puVar9;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar13 = puVar13 + -0x40;
              } while (puVar13 != (undefined1 *)0x0);
              if (puVar20 != puVar9) {
                if (((ulong)puVar20 & 0x38) == 0) {
                  puVar3 = puVar3 + -(long)puVar9;
                  puVar13 = puVar17 + -(long)puVar9;
                  goto code_r0x00025ef8;
                }
                goto code_r0x00025834;
              }
            }
            else {
              puVar9 = (undefined1 *)0x0;
code_r0x00025834:
              puVar12 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
              puVar13 = puVar17 + -(long)puVar12;
              puVar3 = puVar3 + -(long)puVar12;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar9);
              puVar11 = (undefined8 *)(puVar5 + ((long)puVar14 - (long)puVar4));
              lVar15 = (long)puVar9 - (long)puVar12;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar15 = lVar15 + 8;
              } while (lVar15 != 0);
              if (puVar20 != puVar12) goto code_r0x00025ef8;
            }
            puVar17 = (undefined1 *)*unaff_x19;
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)(puVar5 + (long)puVar10);
          }
          else {
            puVar5 = (undefined1 *)__Znwm(puVar10);
            puVar3 = puVar5 + (long)puVar20;
            puVar19 = puVar3 + 1;
            *puVar3 = 0;
            if (puVar17 != puVar4) goto code_r0x000249b4;
code_r0x00024ae0:
            *unaff_x19 = (long)puVar3;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)(puVar5 + (long)puVar10);
            puVar5 = puVar3;
          }
          if (puVar17 != (undefined1 *)0x0) {
            __ZdlPv(puVar5,puVar17);
          }
        }
        unaff_x19[1] = (long)puVar19;
        if (puVar19 < (undefined1 *)unaff_x19[2]) {
          puVar5 = puVar19 + 1;
          *puVar19 = 0;
          unaff_x19[1] = (long)puVar5;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar17) goto code_r0x00024bcc;
code_r0x00024c2c:
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar5 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar10 = (undefined1 *)(((long)puVar17 - (long)puVar4) * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar4)) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 != (undefined1 *)0x0) {
            lVar15 = __Znwm(puVar10);
            puVar17 = puVar20 + lVar15;
            puVar10 = puVar10 + lVar15;
            puVar19 = puVar17 + 1;
            *puVar17 = 0;
            puVar3 = puVar10;
            if (puVar5 != puVar4) goto code_r0x00024c78;
code_r0x00024dac:
            *unaff_x19 = (long)puVar17;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar10;
code_r0x00024db8:
            __ZdlPv(puVar5);
            unaff_x19[1] = (long)puVar19;
            uVar21 = (undefined1)*plVar1;
            puVar17 = (undefined1 *)unaff_x19[2];
            if (puVar19 < puVar17) goto code_r0x00024cd8;
            goto code_r0x00024dd4;
          }
          lVar15 = 0;
          puVar19 = puVar20 + 1;
          *puVar20 = 0;
          puVar10 = (undefined1 *)0x0;
          puVar3 = (undefined1 *)0x0;
          puVar17 = puVar20;
          if (puVar5 == puVar4) goto code_r0x00024dac;
code_r0x00024c78:
          if ((puVar20 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar4 - lVar15) < 0x40)) {
code_r0x00024ca0:
            do {
              puVar17 = puVar17 + -1;
              puVar5 = puVar5 + -1;
              *puVar17 = *puVar5;
            } while (puVar5 != puVar4);
          }
          else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
            puVar13 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
            puVar11 = (undefined8 *)(puVar5 + -0x20);
            puVar14 = (undefined8 *)(puVar20 + lVar15 + -0x20);
            puVar10 = puVar13;
            do {
              uVar24 = *puVar11;
              uVar23 = puVar11[3];
              uVar22 = puVar11[2];
              uVar28 = puVar11[-3];
              uVar27 = puVar11[-4];
              uVar26 = puVar11[-1];
              uVar25 = puVar11[-2];
              puVar14[1] = puVar11[1];
              *puVar14 = uVar24;
              puVar14[3] = uVar23;
              puVar14[2] = uVar22;
              puVar14[-3] = uVar28;
              puVar14[-4] = uVar27;
              puVar14[-1] = uVar26;
              puVar14[-2] = uVar25;
              puVar11 = puVar11 + -8;
              puVar14 = puVar14 + -8;
              puVar10 = puVar10 + -0x40;
            } while (puVar10 != (undefined1 *)0x0);
            if (puVar20 != puVar13) {
              if (((ulong)puVar20 & 0x38) == 0) {
                puVar17 = puVar17 + -(long)puVar13;
                puVar5 = puVar5 + -(long)puVar13;
                goto code_r0x00024ca0;
              }
              goto code_r0x00025940;
            }
          }
          else {
            puVar13 = (undefined1 *)0x0;
code_r0x00025940:
            puVar10 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
            puVar17 = puVar17 + -(long)puVar10;
            puVar14 = (undefined8 *)(puVar5 + -(long)puVar13);
            puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar4));
            lVar16 = (long)puVar13 - (long)puVar10;
            do {
              puVar14 = puVar14 + -1;
              puVar11 = puVar11 + -1;
              *puVar11 = *puVar14;
              lVar16 = lVar16 + 8;
            } while (lVar16 != 0);
            puVar5 = puVar5 + -(long)puVar10;
            if (puVar20 != puVar10) goto code_r0x00024ca0;
          }
          puVar5 = (undefined1 *)*unaff_x19;
          *unaff_x19 = lVar15;
          unaff_x19[1] = (long)puVar19;
          unaff_x19[2] = (long)puVar3;
          if (puVar5 != (undefined1 *)0x0) goto code_r0x00024db8;
          unaff_x19[1] = (long)puVar19;
          uVar21 = (undefined1)*plVar1;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar19) goto code_r0x00024dd4;
code_r0x00024cd8:
          puVar5 = puVar19 + 1;
          *puVar19 = uVar21;
          unaff_x19[1] = (long)puVar5;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar5) goto code_r0x00024cf8;
code_r0x00024e80:
          puVar17 = puVar5 + 1;
          *puVar5 = 0;
code_r0x00024e88:
          unaff_x19[1] = (long)puVar17;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar17 < puVar3) goto code_r0x00024e98;
code_r0x00024f34:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar17 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar3 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar3 = puVar10 + 1;
            *puVar10 = 0;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar17 == puVar20) goto code_r0x00025014;
code_r0x00024f80:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x00024fa8:
              do {
                puVar4 = puVar4 + -1;
                puVar17 = puVar17 + -1;
                *puVar4 = *puVar17;
              } while (puVar17 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar17 = puVar17 + -(long)puVar13;
                  goto code_r0x00024fa8;
                }
                goto code_r0x00025acc;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025acc:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar17 = puVar17 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x00024fa8;
            }
            puVar17 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar19;
            if (puVar17 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar3;
              puVar17 = (undefined1 *)unaff_x19[2];
              if (puVar3 < puVar17) goto code_r0x00024fd8;
              goto code_r0x00025034;
            }
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar3 = puVar4 + 1;
            *puVar4 = 0;
            puVar19 = puVar5;
            if (puVar17 != puVar20) goto code_r0x00024f80;
code_r0x00025014:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar17);
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar3) goto code_r0x00025034;
code_r0x00024fd8:
          puVar17 = puVar3 + 1;
          *puVar3 = 0;
          unaff_x19[1] = (long)puVar17;
          uVar21 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar17 < puVar3) goto code_r0x000250dc;
code_r0x00025138:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar17 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar3 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar3 = puVar10 + 1;
            *puVar10 = uVar21;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar17 == puVar20) goto code_r0x00025214;
code_r0x00025184:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x000251ac:
              do {
                puVar4 = puVar4 + -1;
                puVar17 = puVar17 + -1;
                *puVar4 = *puVar17;
              } while (puVar17 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar17 = puVar17 + -(long)puVar13;
                  goto code_r0x000251ac;
                }
                goto code_r0x00025bd4;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025bd4:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar17 = puVar17 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x000251ac;
            }
            puVar17 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar19;
            if (puVar17 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar3;
              puVar17 = (undefined1 *)unaff_x19[2];
              if (puVar3 < puVar17) goto code_r0x000251dc;
              goto code_r0x00025234;
            }
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar3 = puVar4 + 1;
            *puVar4 = uVar21;
            puVar19 = puVar5;
            if (puVar17 != puVar20) goto code_r0x00025184;
code_r0x00025214:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar17);
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar3) goto code_r0x00025234;
code_r0x000251dc:
          puVar17 = puVar3 + 1;
          *puVar3 = 0;
          unaff_x19[1] = (long)puVar17;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar17 < puVar3) goto code_r0x000252d8;
code_r0x00025330:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar17 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar3 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar3 = puVar10 + 1;
            *puVar10 = 0;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar17 == puVar20) goto code_r0x000253fc;
code_r0x0002537c:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x000253a4:
              do {
                puVar4 = puVar4 + -1;
                puVar17 = puVar17 + -1;
                *puVar4 = *puVar17;
              } while (puVar17 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar17 = puVar17 + -(long)puVar13;
                  goto code_r0x000253a4;
                }
                goto code_r0x00025cdc;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025cdc:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar17 = puVar17 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x000253a4;
            }
            puVar17 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar19;
            if (puVar17 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar3;
              puVar17 = (undefined1 *)unaff_x19[2];
              if (puVar3 < puVar17) goto code_r0x000253d4;
              goto code_r0x0002541c;
            }
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar3 = puVar4 + 1;
            *puVar4 = 0;
            puVar19 = puVar5;
            if (puVar17 != puVar20) goto code_r0x0002537c;
code_r0x000253fc:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar3;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar17);
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar3) goto code_r0x0002541c;
code_r0x000253d4:
          puVar17 = puVar3 + 1;
          *puVar3 = 0;
        }
        else {
          puVar3 = (undefined1 *)*unaff_x19;
          puVar4 = puVar19 + -(long)puVar3;
          puVar17 = puVar4 + 1;
          if ((long)puVar17 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar8 = unaff_x19[2] - (long)puVar3;
          puVar20 = (undefined1 *)(uVar8 * 2);
          if (puVar20 <= puVar17) {
            puVar20 = puVar17;
          }
          if (0x3ffffffffffffffe < uVar8) {
            puVar20 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar20 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar5 = puVar4 + 1;
            *puVar4 = 0;
            puVar20 = (undefined1 *)0x0;
            puVar10 = (undefined1 *)0x0;
            puVar17 = puVar4;
            if (puVar19 == puVar3) goto code_r0x00024c0c;
code_r0x00024b74:
            if ((puVar4 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar3 - lVar15) < 0x40)) {
code_r0x00024b9c:
              do {
                puVar17 = puVar17 + -1;
                puVar19 = puVar19 + -1;
                *puVar17 = *puVar19;
              } while (puVar19 != puVar3);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar4) {
              puVar13 = (undefined1 *)((ulong)puVar4 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar19 + -0x20);
              puVar14 = (undefined8 *)(puVar4 + lVar15 + -0x20);
              puVar20 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar20 = puVar20 + -0x40;
              } while (puVar20 != (undefined1 *)0x0);
              if (puVar4 != puVar13) {
                if (((ulong)puVar4 & 0x38) == 0) {
                  puVar17 = puVar17 + -(long)puVar13;
                  puVar19 = puVar19 + -(long)puVar13;
                  goto code_r0x00024b9c;
                }
                goto code_r0x000258bc;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x000258bc:
              puVar20 = (undefined1 *)((ulong)puVar4 & 0xfffffffffffffff8);
              puVar17 = puVar17 + -(long)puVar20;
              puVar14 = (undefined8 *)(puVar19 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar3));
              lVar16 = (long)puVar13 - (long)puVar20;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar19 = puVar19 + -(long)puVar20;
              if (puVar4 != puVar20) goto code_r0x00024b9c;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar10;
            if (puVar19 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar5;
              puVar17 = (undefined1 *)unaff_x19[2];
              if (puVar17 <= puVar5) goto code_r0x00024c2c;
              goto code_r0x00024bcc;
            }
          }
          else {
            lVar15 = __Znwm(puVar20);
            puVar17 = puVar4 + lVar15;
            puVar20 = puVar20 + lVar15;
            puVar5 = puVar17 + 1;
            *puVar17 = 0;
            puVar10 = puVar20;
            if (puVar19 != puVar3) goto code_r0x00024b74;
code_r0x00024c0c:
            *unaff_x19 = (long)puVar17;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar20;
          }
          __ZdlPv(puVar19);
          unaff_x19[1] = (long)puVar5;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar17 <= puVar5) goto code_r0x00024c2c;
code_r0x00024bcc:
          puVar19 = puVar5 + 1;
          *puVar5 = 0;
          unaff_x19[1] = (long)puVar19;
          uVar21 = (undefined1)*plVar1;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar19 < puVar17) goto code_r0x00024cd8;
code_r0x00024dd4:
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar19 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar10 = (undefined1 *)(((long)puVar17 - (long)puVar4) * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar4)) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 != (undefined1 *)0x0) {
            lVar15 = __Znwm(puVar10);
            puVar17 = puVar20 + lVar15;
            puVar10 = puVar10 + lVar15;
            puVar5 = puVar17 + 1;
            *puVar17 = uVar21;
            puVar3 = puVar10;
            if (puVar19 != puVar4) goto code_r0x00024e24;
code_r0x00024ed0:
            *unaff_x19 = (long)puVar17;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar10;
code_r0x00024edc:
            __ZdlPv(puVar19);
            unaff_x19[1] = (long)puVar5;
            puVar17 = (undefined1 *)unaff_x19[2];
            if (puVar17 <= puVar5) goto code_r0x00024cf8;
            goto code_r0x00024e80;
          }
          lVar15 = 0;
          puVar5 = puVar20 + 1;
          *puVar20 = uVar21;
          puVar10 = (undefined1 *)0x0;
          puVar3 = (undefined1 *)0x0;
          puVar17 = puVar20;
          if (puVar19 == puVar4) goto code_r0x00024ed0;
code_r0x00024e24:
          if ((puVar20 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar4 - lVar15) < 0x40)) {
code_r0x00024e50:
            do {
              puVar17 = puVar17 + -1;
              puVar19 = puVar19 + -1;
              *puVar17 = *puVar19;
            } while (puVar19 != puVar4);
          }
          else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
            puVar13 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
            puVar11 = (undefined8 *)(puVar19 + -0x20);
            puVar14 = (undefined8 *)(puVar20 + lVar15 + -0x20);
            puVar10 = puVar13;
            do {
              uVar24 = *puVar11;
              uVar23 = puVar11[3];
              uVar22 = puVar11[2];
              uVar28 = puVar11[-3];
              uVar27 = puVar11[-4];
              uVar26 = puVar11[-1];
              uVar25 = puVar11[-2];
              puVar14[1] = puVar11[1];
              *puVar14 = uVar24;
              puVar14[3] = uVar23;
              puVar14[2] = uVar22;
              puVar14[-3] = uVar28;
              puVar14[-4] = uVar27;
              puVar14[-1] = uVar26;
              puVar14[-2] = uVar25;
              puVar11 = puVar11 + -8;
              puVar14 = puVar14 + -8;
              puVar10 = puVar10 + -0x40;
            } while (puVar10 != (undefined1 *)0x0);
            if (puVar20 != puVar13) {
              if (((ulong)puVar20 & 0x38) == 0) {
                puVar17 = puVar17 + -(long)puVar13;
                puVar19 = puVar19 + -(long)puVar13;
                goto code_r0x00024e50;
              }
              goto code_r0x000259c4;
            }
          }
          else {
            puVar13 = (undefined1 *)0x0;
code_r0x000259c4:
            puVar10 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
            puVar17 = puVar17 + -(long)puVar10;
            puVar14 = (undefined8 *)(puVar19 + -(long)puVar13);
            puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar4));
            lVar16 = (long)puVar13 - (long)puVar10;
            do {
              puVar14 = puVar14 + -1;
              puVar11 = puVar11 + -1;
              *puVar11 = *puVar14;
              lVar16 = lVar16 + 8;
            } while (lVar16 != 0);
            puVar19 = puVar19 + -(long)puVar10;
            if (puVar20 != puVar10) goto code_r0x00024e50;
          }
          puVar19 = (undefined1 *)*unaff_x19;
          *unaff_x19 = lVar15;
          unaff_x19[1] = (long)puVar5;
          unaff_x19[2] = (long)puVar3;
          if (puVar19 != (undefined1 *)0x0) goto code_r0x00024edc;
          unaff_x19[1] = (long)puVar5;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar17) goto code_r0x00024e80;
code_r0x00024cf8:
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar5 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar10 = (undefined1 *)(((long)puVar17 - (long)puVar4) * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar4)) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar17 = puVar20 + 1;
            *puVar20 = 0;
            puVar10 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar3 = puVar20;
            if (puVar5 == puVar4) goto code_r0x00024f14;
code_r0x00024d44:
            if ((puVar20 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar4 - lVar15) < 0x40)) {
code_r0x00024d6c:
              do {
                puVar3 = puVar3 + -1;
                puVar5 = puVar5 + -1;
                *puVar3 = *puVar5;
              } while (puVar5 != puVar4);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
              puVar13 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar5 + -0x20);
              puVar14 = (undefined8 *)(puVar20 + lVar15 + -0x20);
              puVar10 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar10 = puVar10 + -0x40;
              } while (puVar10 != (undefined1 *)0x0);
              if (puVar20 != puVar13) {
                if (((ulong)puVar20 & 0x38) == 0) {
                  puVar3 = puVar3 + -(long)puVar13;
                  puVar5 = puVar5 + -(long)puVar13;
                  goto code_r0x00024d6c;
                }
                goto code_r0x00025a48;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025a48:
              puVar10 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
              puVar3 = puVar3 + -(long)puVar10;
              puVar14 = (undefined8 *)(puVar5 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar4));
              lVar16 = (long)puVar13 - (long)puVar10;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar5 = puVar5 + -(long)puVar10;
              if (puVar20 != puVar10) goto code_r0x00024d6c;
            }
            puVar5 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar19;
            if (puVar5 == (undefined1 *)0x0) goto code_r0x00024e88;
          }
          else {
            lVar15 = __Znwm(puVar10);
            puVar3 = puVar20 + lVar15;
            puVar10 = puVar10 + lVar15;
            puVar17 = puVar3 + 1;
            *puVar3 = 0;
            puVar19 = puVar10;
            if (puVar5 != puVar4) goto code_r0x00024d44;
code_r0x00024f14:
            *unaff_x19 = (long)puVar3;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar10;
          }
          __ZdlPv(puVar5);
          unaff_x19[1] = (long)puVar17;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar17) goto code_r0x00024f34;
code_r0x00024e98:
          puVar3 = puVar17 + 1;
          *puVar17 = 0;
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar3 < puVar17) goto code_r0x00024fd8;
code_r0x00025034:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar3 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar17 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar17 = puVar10 + 1;
            *puVar10 = 0;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar3 == puVar20) goto code_r0x00025114;
code_r0x00025080:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x000250a8:
              do {
                puVar4 = puVar4 + -1;
                puVar3 = puVar3 + -1;
                *puVar4 = *puVar3;
              } while (puVar3 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar3 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar3 = puVar3 + -(long)puVar13;
                  goto code_r0x000250a8;
                }
                goto code_r0x00025b50;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025b50:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar3 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar3 = puVar3 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x000250a8;
            }
            puVar3 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar19;
            if (puVar3 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar17;
              uVar21 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
              puVar3 = (undefined1 *)unaff_x19[2];
              if (puVar17 < puVar3) goto code_r0x000250dc;
              goto code_r0x00025138;
            }
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar17 = puVar4 + 1;
            *puVar4 = 0;
            puVar19 = puVar5;
            if (puVar3 != puVar20) goto code_r0x00025080;
code_r0x00025114:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar3);
          unaff_x19[1] = (long)puVar17;
          uVar21 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar17) goto code_r0x00025138;
code_r0x000250dc:
          puVar3 = puVar17 + 1;
          *puVar17 = uVar21;
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar3 < puVar17) goto code_r0x000251dc;
code_r0x00025234:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar3 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar17 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar17 = puVar10 + 1;
            *puVar10 = 0;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar3 == puVar20) goto code_r0x00025310;
code_r0x00025280:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x000252a8:
              do {
                puVar4 = puVar4 + -1;
                puVar3 = puVar3 + -1;
                *puVar4 = *puVar3;
              } while (puVar3 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar3 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar3 = puVar3 + -(long)puVar13;
                  goto code_r0x000252a8;
                }
                goto code_r0x00025c58;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025c58:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar3 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar3 = puVar3 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x000252a8;
            }
            puVar3 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar19;
            if (puVar3 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar17;
              puVar3 = (undefined1 *)unaff_x19[2];
              if (puVar17 < puVar3) goto code_r0x000252d8;
              goto code_r0x00025330;
            }
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar17 = puVar4 + 1;
            *puVar4 = 0;
            puVar19 = puVar5;
            if (puVar3 != puVar20) goto code_r0x00025280;
code_r0x00025310:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar3);
          unaff_x19[1] = (long)puVar17;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar17) goto code_r0x00025330;
code_r0x000252d8:
          puVar3 = puVar17 + 1;
          *puVar17 = 0;
          unaff_x19[1] = (long)puVar3;
          puVar17 = (undefined1 *)unaff_x19[2];
          if (puVar3 < puVar17) goto code_r0x000253d4;
code_r0x0002541c:
          puVar20 = (undefined1 *)*unaff_x19;
          puVar10 = puVar3 + -(long)puVar20;
          puVar4 = puVar10 + 1;
          if ((long)puVar4 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar5 = (undefined1 *)(((long)puVar17 - (long)puVar20) * 2);
          if (puVar5 <= puVar4) {
            puVar5 = puVar4;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar17 - (long)puVar20)) {
            puVar5 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar5 == (undefined1 *)0x0) {
            lVar15 = 0;
            puVar17 = puVar10 + 1;
            *puVar10 = 0;
            puVar5 = (undefined1 *)0x0;
            puVar19 = (undefined1 *)0x0;
            puVar4 = puVar10;
            if (puVar3 == puVar20) goto code_r0x000254d0;
code_r0x00025468:
            if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar20 - lVar15) < 0x40)) {
code_r0x00025490:
              do {
                puVar4 = puVar4 + -1;
                puVar3 = puVar3 + -1;
                *puVar4 = *puVar3;
              } while (puVar3 != puVar20);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
              puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar3 + -0x20);
              puVar14 = (undefined8 *)(puVar10 + lVar15 + -0x20);
              puVar5 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar5 = puVar5 + -0x40;
              } while (puVar5 != (undefined1 *)0x0);
              if (puVar10 != puVar13) {
                if (((ulong)puVar10 & 0x38) == 0) {
                  puVar4 = puVar4 + -(long)puVar13;
                  puVar3 = puVar3 + -(long)puVar13;
                  goto code_r0x00025490;
                }
                goto code_r0x00025d60;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025d60:
              puVar5 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
              puVar4 = puVar4 + -(long)puVar5;
              puVar14 = (undefined8 *)(puVar3 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar20));
              lVar16 = (long)puVar13 - (long)puVar5;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar16 = lVar16 + 8;
              } while (lVar16 != 0);
              puVar3 = puVar3 + -(long)puVar5;
              if (puVar10 != puVar5) goto code_r0x00025490;
            }
            puVar3 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar15;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar19;
            if (puVar3 == (undefined1 *)0x0) goto code_r0x000254e0;
          }
          else {
            lVar15 = __Znwm(puVar5);
            puVar4 = puVar10 + lVar15;
            puVar5 = puVar5 + lVar15;
            puVar17 = puVar4 + 1;
            *puVar4 = 0;
            puVar19 = puVar5;
            if (puVar3 != puVar20) goto code_r0x00025468;
code_r0x000254d0:
            *unaff_x19 = (long)puVar4;
            unaff_x19[1] = (long)puVar17;
            unaff_x19[2] = (long)puVar5;
          }
          __ZdlPv(puVar3);
        }
code_r0x000254e0:
        unaff_x19[1] = (long)puVar17;
        uVar21 = (undefined1)*(undefined4 *)(lVar18 + lVar7 * 0x10 + 8);
        if (puVar17 < (undefined1 *)unaff_x19[2]) {
          *puVar17 = uVar21;
          unaff_x19[1] = (long)(puVar17 + 1);
        }
        else {
          puVar4 = (undefined1 *)*unaff_x19;
          puVar20 = puVar17 + -(long)puVar4;
          puVar3 = puVar20 + 1;
          if ((long)puVar3 < 0) {
            func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
            (*pcVar2)();
          }
          uVar8 = unaff_x19[2] - (long)puVar4;
          puVar10 = (undefined1 *)(uVar8 * 2);
          if (puVar10 <= puVar3) {
            puVar10 = puVar3;
          }
          if (0x3ffffffffffffffe < uVar8) {
            puVar10 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar10 == (undefined1 *)0x0) {
            lVar18 = 0;
            puVar19 = puVar20 + 1;
            *puVar20 = uVar21;
            puVar10 = (undefined1 *)0x0;
            puVar5 = (undefined1 *)0x0;
            puVar3 = puVar20;
            if (puVar17 == puVar4) goto code_r0x000255c0;
code_r0x00025558:
            if ((puVar20 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar4 - lVar18) < 0x40)) {
code_r0x00025580:
              do {
                puVar3 = puVar3 + -1;
                puVar17 = puVar17 + -1;
                *puVar3 = *puVar17;
              } while (puVar17 != puVar4);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
              puVar13 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
              puVar11 = (undefined8 *)(puVar17 + -0x20);
              puVar14 = (undefined8 *)(puVar20 + lVar18 + -0x20);
              puVar10 = puVar13;
              do {
                uVar24 = *puVar11;
                uVar23 = puVar11[3];
                uVar22 = puVar11[2];
                uVar28 = puVar11[-3];
                uVar27 = puVar11[-4];
                uVar26 = puVar11[-1];
                uVar25 = puVar11[-2];
                puVar14[1] = puVar11[1];
                *puVar14 = uVar24;
                puVar14[3] = uVar23;
                puVar14[2] = uVar22;
                puVar14[-3] = uVar28;
                puVar14[-4] = uVar27;
                puVar14[-1] = uVar26;
                puVar14[-2] = uVar25;
                puVar11 = puVar11 + -8;
                puVar14 = puVar14 + -8;
                puVar10 = puVar10 + -0x40;
              } while (puVar10 != (undefined1 *)0x0);
              if (puVar20 != puVar13) {
                if (((ulong)puVar20 & 0x38) == 0) {
                  puVar3 = puVar3 + -(long)puVar13;
                  puVar17 = puVar17 + -(long)puVar13;
                  goto code_r0x00025580;
                }
                goto code_r0x00025de4;
              }
            }
            else {
              puVar13 = (undefined1 *)0x0;
code_r0x00025de4:
              puVar10 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
              puVar3 = puVar3 + -(long)puVar10;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar13);
              puVar11 = (undefined8 *)((long)puVar14 + (lVar18 - (long)puVar4));
              lVar15 = (long)puVar13 - (long)puVar10;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar15 = lVar15 + 8;
              } while (lVar15 != 0);
              puVar17 = puVar17 + -(long)puVar10;
              if (puVar20 != puVar10) goto code_r0x00025580;
            }
            puVar17 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar18;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar5;
            if (puVar17 != (undefined1 *)0x0) goto code_r0x000255c8;
          }
          else {
            lVar18 = __Znwm(puVar10);
            puVar3 = puVar20 + lVar18;
            puVar10 = puVar10 + lVar18;
            puVar19 = puVar3 + 1;
            *puVar3 = uVar21;
            puVar5 = puVar10;
            if (puVar17 != puVar4) goto code_r0x00025558;
code_r0x000255c0:
            *unaff_x19 = (long)puVar3;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar10;
code_r0x000255c8:
            __ZdlPv(puVar17);
          }
          unaff_x19[1] = (long)puVar19;
        }
        break;
      case 5:
        func_0x000262e0();
        break;
      case 6:
        lVar15 = *plVar1;
        lVar16 = *(long *)(lVar15 + 0x20);
        lVar18 = __dyld_get_image_header(0);
        if ((lVar16 != lVar18 + 0x4e8dec0) &&
           (uVar6 = (uint)*(byte *)(lVar15 + 6), *(byte *)(lVar15 + 6) != 0x1f)) {
          lVar16 = 0;
          lVar18 = 0;
          do {
            if ((*(uint *)(*(long *)(lVar15 + 0x20) + lVar16 + 0x1c) & 0xf) == 5) {
              func_0x000262e0();
              uVar6 = (uint)*(byte *)(lVar15 + 6);
            }
            lVar18 = lVar18 + 1;
            lVar16 = lVar16 + 0x20;
          } while (lVar18 < 1 << (ulong)(uVar6 & 0x1f));
        }
        break;
      case 7:
        if (*(char *)(*plVar1 + 3) == '\0') {
          func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*plVar1 + 0x18));
          func_0x00026614();
          if (uStack0000000000000008 != 0) {
            in_stack_00000010 = uStack0000000000000008;
            __ZdlPv();
          }
        }
        else {
          puVar17 = (undefined1 *)unaff_x19[1];
          if ((undefined1 *)unaff_x19[2] <= puVar17) {
            puVar4 = (undefined1 *)*unaff_x19;
            puVar20 = puVar17 + -(long)puVar4;
            puVar3 = puVar20 + 1;
            if ((long)puVar3 < 0) {
              func_0x00017f90();
              goto code_r0x00026138;
            }
            uVar8 = unaff_x19[2] - (long)puVar4;
            puVar10 = (undefined1 *)(uVar8 * 2);
            if (puVar10 <= puVar3) {
              puVar10 = puVar3;
            }
            if (0x3ffffffffffffffe < uVar8) {
              puVar10 = (undefined1 *)0x7fffffffffffffff;
            }
            if (puVar10 == (undefined1 *)0x0) {
              puVar5 = (undefined1 *)0x0;
              *puVar20 = 0x43;
              puVar3 = puVar20;
            }
            else {
              puVar5 = (undefined1 *)__Znwm(puVar10);
              puVar3 = puVar5 + (long)puVar20;
              *puVar3 = 0x43;
            }
            puVar19 = puVar3 + 1;
            if (puVar17 == puVar4) goto code_r0x00025618;
            puVar13 = puVar17;
            if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar20) &&
               (0x3f < (ulong)((long)puVar4 - (long)puVar5))) {
              if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar20) {
                puVar9 = (undefined1 *)((ulong)puVar20 & 0xffffffffffffffc0);
                puVar11 = (undefined8 *)(puVar17 + -0x20);
                puVar14 = (undefined8 *)(puVar5 + (long)puVar20 + -0x20);
                puVar13 = puVar9;
                do {
                  uVar24 = *puVar11;
                  uVar23 = puVar11[3];
                  uVar22 = puVar11[2];
                  uVar28 = puVar11[-3];
                  uVar27 = puVar11[-4];
                  uVar26 = puVar11[-1];
                  uVar25 = puVar11[-2];
                  puVar14[1] = puVar11[1];
                  *puVar14 = uVar24;
                  puVar14[3] = uVar23;
                  puVar14[2] = uVar22;
                  puVar14[-3] = uVar28;
                  puVar14[-4] = uVar27;
                  puVar14[-1] = uVar26;
                  puVar14[-2] = uVar25;
                  puVar11 = puVar11 + -8;
                  puVar14 = puVar14 + -8;
                  puVar13 = puVar13 + -0x40;
                } while (puVar13 != (undefined1 *)0x0);
                if (puVar20 == puVar9) goto code_r0x00025fc8;
                if (((ulong)puVar20 & 0x38) == 0) {
                  puVar3 = puVar3 + -(long)puVar9;
                  puVar13 = puVar17 + -(long)puVar9;
                  goto code_r0x00025fb8;
                }
              }
              else {
                puVar9 = (undefined1 *)0x0;
              }
              puVar12 = (undefined1 *)((ulong)puVar20 & 0xfffffffffffffff8);
              puVar13 = puVar17 + -(long)puVar12;
              puVar3 = puVar3 + -(long)puVar12;
              puVar14 = (undefined8 *)(puVar17 + -(long)puVar9);
              puVar11 = (undefined8 *)(puVar5 + ((long)puVar14 - (long)puVar4));
              lVar18 = (long)puVar9 - (long)puVar12;
              do {
                puVar14 = puVar14 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar14;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              if (puVar20 == puVar12) goto code_r0x00025fc8;
            }
code_r0x00025fb8:
            do {
              puVar3 = puVar3 + -1;
              puVar13 = puVar13 + -1;
              *puVar3 = *puVar13;
            } while (puVar13 != puVar4);
            goto code_r0x00025fc8;
          }
          *puVar17 = 0x43;
          unaff_x19[1] = (long)(puVar17 + 1);
        }
      }
      lVar7 = lVar7 + 1;
    } while (lVar7 < *(int *)(unaff_x20 + 0x98));
  }
  if (0 < *(int *)(unaff_x20 + 0x8c)) {
    lVar7 = 0;
    do {
      func_0x000245c0(&uStack0000000000000008,
                      *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar7 * 8));
      func_0x00026614();
      if (uStack0000000000000008 != 0) {
        in_stack_00000010 = uStack0000000000000008;
        __ZdlPv();
      }
      lVar7 = lVar7 + 1;
    } while (lVar7 < *(int *)(unaff_x20 + 0x8c));
  }
  func_0x000262e0();
  return;
}

