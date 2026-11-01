
void FUN_0002463c(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  uint uVar8;
  long lVar9;
  ulong uVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined8 *puVar13;
  undefined1 *puVar14;
  undefined1 *puVar15;
  undefined8 *puVar16;
  long *unaff_x19;
  long unaff_x20;
  long lVar17;
  long lVar18;
  undefined1 *puVar19;
  long lVar20;
  undefined1 *puVar21;
  undefined1 *puVar22;
  undefined1 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  
  uVar2 = func_0x00086db4();
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x4cb);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  *unaff_x19 = 0;
  puVar5 = (undefined1 *)__Znwm(1);
  *puVar5 = *(undefined1 *)(unaff_x20 + 5);
  unaff_x19[1] = (long)(puVar5 + 1);
  unaff_x19[2] = (long)(puVar5 + 1);
  *unaff_x19 = (long)puVar5;
  puVar6 = (undefined1 *)__Znwm(2);
  puVar19 = puVar6 + 2;
  puVar6[1] = *(undefined1 *)(unaff_x20 + 4);
  *puVar6 = *puVar5;
  lVar9 = *unaff_x19;
  *unaff_x19 = (long)puVar6;
  unaff_x19[1] = (long)puVar19;
  unaff_x19[2] = (long)puVar19;
  if (lVar9 != 0) {
    __ZdlPv(lVar9);
  }
  unaff_x19[1] = (long)puVar19;
  if (0 < *(int *)(unaff_x20 + 0x98)) {
    lVar9 = 0;
    do {
      lVar20 = *(long *)(unaff_x20 + 8);
      plVar3 = (long *)(lVar20 + lVar9 * 0x10);
      switch(*(undefined4 *)((long)plVar3 + 0xc)) {
      case 0:
        puVar19 = (undefined1 *)unaff_x19[1];
        if (puVar19 < (undefined1 *)unaff_x19[2]) {
          *puVar19 = 0;
          unaff_x19[1] = (long)(puVar19 + 1);
        }
        else {
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar19 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar10 = unaff_x19[2] - (long)puVar6;
          puVar12 = (undefined1 *)(uVar10 * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < uVar10) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 == (undefined1 *)0x0) {
            puVar7 = (undefined1 *)0x0;
            *puVar22 = 0;
            puVar5 = puVar22;
          }
          else {
            puVar7 = (undefined1 *)__Znwm(puVar12);
            puVar5 = puVar7 + (long)puVar22;
            *puVar5 = 0;
          }
          puVar21 = puVar5 + 1;
          if (puVar19 != puVar6) {
            puVar15 = puVar19;
            if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar22) &&
               (0x3f < (ulong)((long)puVar6 - (long)puVar7))) {
              if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
                puVar11 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
                puVar13 = (undefined8 *)(puVar19 + -0x20);
                puVar16 = (undefined8 *)(puVar7 + (long)puVar22 + -0x20);
                puVar15 = puVar11;
                do {
                  uVar25 = *puVar13;
                  uVar24 = puVar13[3];
                  uVar2 = puVar13[2];
                  uVar29 = puVar13[-3];
                  uVar28 = puVar13[-4];
                  uVar27 = puVar13[-1];
                  uVar26 = puVar13[-2];
                  puVar16[1] = puVar13[1];
                  *puVar16 = uVar25;
                  puVar16[3] = uVar24;
                  puVar16[2] = uVar2;
                  puVar16[-3] = uVar29;
                  puVar16[-4] = uVar28;
                  puVar16[-1] = uVar27;
                  puVar16[-2] = uVar26;
                  puVar13 = puVar13 + -8;
                  puVar16 = puVar16 + -8;
                  puVar15 = puVar15 + -0x40;
                } while (puVar15 != (undefined1 *)0x0);
                if (puVar22 == puVar11) goto LAB_00025fc8;
                if (((ulong)puVar22 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar11;
                  puVar15 = puVar19 + -(long)puVar11;
                  goto code_r0x00025ed8;
                }
              }
              else {
                puVar11 = (undefined1 *)0x0;
              }
              puVar14 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
              puVar15 = puVar19 + -(long)puVar14;
              puVar5 = puVar5 + -(long)puVar14;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar11);
              puVar13 = (undefined8 *)(puVar7 + ((long)puVar16 - (long)puVar6));
              lVar20 = (long)puVar11 - (long)puVar14;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar20 = lVar20 + 8;
              } while (lVar20 != 0);
              if (puVar22 == puVar14) goto LAB_00025fc8;
            }
code_r0x00025ed8:
            do {
              puVar5 = puVar5 + -1;
              puVar15 = puVar15 + -1;
              *puVar5 = *puVar15;
            } while (puVar15 != puVar6);
            goto LAB_00025fc8;
          }
code_r0x00025618:
          *unaff_x19 = (long)puVar5;
          unaff_x19[1] = (long)puVar21;
          unaff_x19[2] = (long)(puVar7 + (long)puVar12);
joined_r0x00025fdc:
          if (puVar19 != (undefined1 *)0x0) {
            __ZdlPv(puVar5,puVar19);
          }
          unaff_x19[1] = (long)puVar21;
        }
        break;
      case 1:
        puVar19 = (undefined1 *)unaff_x19[1];
        uVar23 = (undefined1)*plVar3;
        if ((undefined1 *)unaff_x19[2] <= puVar19) {
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar19 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar10 = unaff_x19[2] - (long)puVar6;
          puVar12 = (undefined1 *)(uVar10 * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < uVar10) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 == (undefined1 *)0x0) {
            puVar7 = (undefined1 *)0x0;
            *puVar22 = uVar23;
            puVar5 = puVar22;
          }
          else {
            puVar7 = (undefined1 *)__Znwm(puVar12);
            puVar5 = puVar7 + (long)puVar22;
            *puVar5 = uVar23;
          }
          puVar21 = puVar5 + 1;
          if (puVar19 == puVar6) {
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)(puVar7 + (long)puVar12);
            goto joined_r0x00025fdc;
          }
          puVar15 = puVar19;
          if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar22) &&
             (0x3f < (ulong)((long)puVar6 - (long)puVar7))) {
            if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
              puVar11 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar7 + (long)puVar22 + -0x20);
              puVar15 = puVar11;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar15 = puVar15 + -0x40;
              } while (puVar15 != (undefined1 *)0x0);
              if (puVar22 == puVar11) goto LAB_00025fc8;
              if (((ulong)puVar22 & 0x38) == 0) {
                puVar5 = puVar5 + -(long)puVar11;
                puVar15 = puVar19 + -(long)puVar11;
                goto LAB_00025eb8;
              }
            }
            else {
              puVar11 = (undefined1 *)0x0;
            }
            puVar14 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
            puVar15 = puVar19 + -(long)puVar14;
            puVar5 = puVar5 + -(long)puVar14;
            puVar16 = (undefined8 *)(puVar19 + -(long)puVar11);
            puVar13 = (undefined8 *)(puVar7 + ((long)puVar16 - (long)puVar6));
            lVar20 = (long)puVar11 - (long)puVar14;
            do {
              puVar16 = puVar16 + -1;
              puVar13 = puVar13 + -1;
              *puVar13 = *puVar16;
              lVar20 = lVar20 + 8;
            } while (lVar20 != 0);
            if (puVar22 == puVar14) goto LAB_00025fc8;
          }
LAB_00025eb8:
          do {
            puVar5 = puVar5 + -1;
            puVar15 = puVar15 + -1;
            *puVar5 = *puVar15;
          } while (puVar15 != puVar6);
LAB_00025fc8:
          puVar19 = (undefined1 *)*unaff_x19;
          *unaff_x19 = (long)puVar7;
          unaff_x19[1] = (long)puVar21;
          unaff_x19[2] = (long)(puVar7 + (long)puVar12);
          puVar5 = puVar7;
          goto joined_r0x00025fdc;
        }
        *puVar19 = uVar23;
        unaff_x19[1] = (long)(puVar19 + 1);
        break;
      case 3:
        func_0x000262e0();
        break;
      case 4:
        puVar19 = (undefined1 *)unaff_x19[1];
        if (puVar19 < (undefined1 *)unaff_x19[2]) {
          puVar21 = puVar19 + 1;
          *puVar19 = 0;
        }
        else {
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar19 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar10 = unaff_x19[2] - (long)puVar6;
          puVar12 = (undefined1 *)(uVar10 * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < uVar10) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 == (undefined1 *)0x0) {
            puVar7 = (undefined1 *)0x0;
            puVar21 = puVar22 + 1;
            *puVar22 = 0;
            puVar5 = puVar22;
            if (puVar19 == puVar6) goto code_r0x00024ae0;
code_r0x000249b4:
            puVar15 = puVar19;
            if ((puVar22 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - (long)puVar7) < 0x40)
               ) {
code_r0x00025ef8:
              do {
                puVar5 = puVar5 + -1;
                puVar15 = puVar15 + -1;
                *puVar5 = *puVar15;
              } while (puVar15 != puVar6);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
              puVar11 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar7 + (long)puVar22 + -0x20);
              puVar15 = puVar11;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar15 = puVar15 + -0x40;
              } while (puVar15 != (undefined1 *)0x0);
              if (puVar22 != puVar11) {
                if (((ulong)puVar22 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar11;
                  puVar15 = puVar19 + -(long)puVar11;
                  goto code_r0x00025ef8;
                }
                goto code_r0x00025834;
              }
            }
            else {
              puVar11 = (undefined1 *)0x0;
code_r0x00025834:
              puVar14 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
              puVar15 = puVar19 + -(long)puVar14;
              puVar5 = puVar5 + -(long)puVar14;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar11);
              puVar13 = (undefined8 *)(puVar7 + ((long)puVar16 - (long)puVar6));
              lVar17 = (long)puVar11 - (long)puVar14;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar17 = lVar17 + 8;
              } while (lVar17 != 0);
              if (puVar22 != puVar14) goto code_r0x00025ef8;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = (long)puVar7;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)(puVar7 + (long)puVar12);
          }
          else {
            puVar7 = (undefined1 *)__Znwm(puVar12);
            puVar5 = puVar7 + (long)puVar22;
            puVar21 = puVar5 + 1;
            *puVar5 = 0;
            if (puVar19 != puVar6) goto code_r0x000249b4;
code_r0x00024ae0:
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)(puVar7 + (long)puVar12);
            puVar7 = puVar5;
          }
          if (puVar19 != (undefined1 *)0x0) {
            __ZdlPv(puVar7,puVar19);
          }
        }
        unaff_x19[1] = (long)puVar21;
        if (puVar21 < (undefined1 *)unaff_x19[2]) {
          puVar7 = puVar21 + 1;
          *puVar21 = 0;
          unaff_x19[1] = (long)puVar7;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar7 < puVar19) goto code_r0x00024bcc;
code_r0x00024c2c:
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar7 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar12 = (undefined1 *)(((long)puVar19 - (long)puVar6) * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar6)) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 != (undefined1 *)0x0) {
            lVar17 = __Znwm(puVar12);
            puVar19 = puVar22 + lVar17;
            puVar12 = puVar12 + lVar17;
            puVar21 = puVar19 + 1;
            *puVar19 = 0;
            puVar5 = puVar12;
            if (puVar7 != puVar6) goto code_r0x00024c78;
code_r0x00024dac:
            *unaff_x19 = (long)puVar19;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)puVar12;
code_r0x00024db8:
            __ZdlPv(puVar7);
            unaff_x19[1] = (long)puVar21;
            uVar23 = (undefined1)*plVar3;
            puVar19 = (undefined1 *)unaff_x19[2];
            if (puVar21 < puVar19) goto code_r0x00024cd8;
            goto code_r0x00024dd4;
          }
          lVar17 = 0;
          puVar21 = puVar22 + 1;
          *puVar22 = 0;
          puVar12 = (undefined1 *)0x0;
          puVar5 = (undefined1 *)0x0;
          puVar19 = puVar22;
          if (puVar7 == puVar6) goto code_r0x00024dac;
code_r0x00024c78:
          if ((puVar22 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar17) < 0x40)) {
code_r0x00024ca0:
            do {
              puVar19 = puVar19 + -1;
              puVar7 = puVar7 + -1;
              *puVar19 = *puVar7;
            } while (puVar7 != puVar6);
          }
          else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
            puVar15 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
            puVar13 = (undefined8 *)(puVar7 + -0x20);
            puVar16 = (undefined8 *)(puVar22 + lVar17 + -0x20);
            puVar12 = puVar15;
            do {
              uVar25 = *puVar13;
              uVar24 = puVar13[3];
              uVar2 = puVar13[2];
              uVar29 = puVar13[-3];
              uVar28 = puVar13[-4];
              uVar27 = puVar13[-1];
              uVar26 = puVar13[-2];
              puVar16[1] = puVar13[1];
              *puVar16 = uVar25;
              puVar16[3] = uVar24;
              puVar16[2] = uVar2;
              puVar16[-3] = uVar29;
              puVar16[-4] = uVar28;
              puVar16[-1] = uVar27;
              puVar16[-2] = uVar26;
              puVar13 = puVar13 + -8;
              puVar16 = puVar16 + -8;
              puVar12 = puVar12 + -0x40;
            } while (puVar12 != (undefined1 *)0x0);
            if (puVar22 != puVar15) {
              if (((ulong)puVar22 & 0x38) == 0) {
                puVar19 = puVar19 + -(long)puVar15;
                puVar7 = puVar7 + -(long)puVar15;
                goto code_r0x00024ca0;
              }
              goto code_r0x00025940;
            }
          }
          else {
            puVar15 = (undefined1 *)0x0;
code_r0x00025940:
            puVar12 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
            puVar19 = puVar19 + -(long)puVar12;
            puVar16 = (undefined8 *)(puVar7 + -(long)puVar15);
            puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar6));
            lVar18 = (long)puVar15 - (long)puVar12;
            do {
              puVar16 = puVar16 + -1;
              puVar13 = puVar13 + -1;
              *puVar13 = *puVar16;
              lVar18 = lVar18 + 8;
            } while (lVar18 != 0);
            puVar7 = puVar7 + -(long)puVar12;
            if (puVar22 != puVar12) goto code_r0x00024ca0;
          }
          puVar7 = (undefined1 *)*unaff_x19;
          *unaff_x19 = lVar17;
          unaff_x19[1] = (long)puVar21;
          unaff_x19[2] = (long)puVar5;
          if (puVar7 != (undefined1 *)0x0) goto code_r0x00024db8;
          unaff_x19[1] = (long)puVar21;
          uVar23 = (undefined1)*plVar3;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar21) goto code_r0x00024dd4;
code_r0x00024cd8:
          puVar7 = puVar21 + 1;
          *puVar21 = uVar23;
          unaff_x19[1] = (long)puVar7;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar7) goto code_r0x00024cf8;
code_r0x00024e80:
          puVar19 = puVar7 + 1;
          *puVar7 = 0;
code_r0x00024e88:
          unaff_x19[1] = (long)puVar19;
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar19 < puVar5) goto code_r0x00024e98;
code_r0x00024f34:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar19 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar5 = puVar12 + 1;
            *puVar12 = 0;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar19 == puVar22) goto code_r0x00025014;
code_r0x00024f80:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x00024fa8:
              do {
                puVar6 = puVar6 + -1;
                puVar19 = puVar19 + -1;
                *puVar6 = *puVar19;
              } while (puVar19 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar19 = puVar19 + -(long)puVar15;
                  goto code_r0x00024fa8;
                }
                goto code_r0x00025acc;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025acc:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar19 = puVar19 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x00024fa8;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar21;
            if (puVar19 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar5;
              puVar19 = (undefined1 *)unaff_x19[2];
              if (puVar5 < puVar19) goto code_r0x00024fd8;
              goto code_r0x00025034;
            }
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar5 = puVar6 + 1;
            *puVar6 = 0;
            puVar21 = puVar7;
            if (puVar19 != puVar22) goto code_r0x00024f80;
code_r0x00025014:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar19);
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar5) goto code_r0x00025034;
code_r0x00024fd8:
          puVar19 = puVar5 + 1;
          *puVar5 = 0;
          unaff_x19[1] = (long)puVar19;
          uVar23 = (undefined1)*(undefined4 *)((long)plVar3 + 4);
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar19 < puVar5) goto code_r0x000250dc;
code_r0x00025138:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar19 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar5 = puVar12 + 1;
            *puVar12 = uVar23;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar19 == puVar22) goto code_r0x00025214;
code_r0x00025184:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x000251ac:
              do {
                puVar6 = puVar6 + -1;
                puVar19 = puVar19 + -1;
                *puVar6 = *puVar19;
              } while (puVar19 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar19 = puVar19 + -(long)puVar15;
                  goto code_r0x000251ac;
                }
                goto code_r0x00025bd4;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025bd4:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar19 = puVar19 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x000251ac;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar21;
            if (puVar19 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar5;
              puVar19 = (undefined1 *)unaff_x19[2];
              if (puVar5 < puVar19) goto code_r0x000251dc;
              goto code_r0x00025234;
            }
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar5 = puVar6 + 1;
            *puVar6 = uVar23;
            puVar21 = puVar7;
            if (puVar19 != puVar22) goto code_r0x00025184;
code_r0x00025214:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar19);
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar5) goto code_r0x00025234;
code_r0x000251dc:
          puVar19 = puVar5 + 1;
          *puVar5 = 0;
          unaff_x19[1] = (long)puVar19;
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar19 < puVar5) goto code_r0x000252d8;
code_r0x00025330:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar19 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar5 = puVar12 + 1;
            *puVar12 = 0;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar19 == puVar22) goto code_r0x000253fc;
code_r0x0002537c:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x000253a4:
              do {
                puVar6 = puVar6 + -1;
                puVar19 = puVar19 + -1;
                *puVar6 = *puVar19;
              } while (puVar19 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar19 = puVar19 + -(long)puVar15;
                  goto code_r0x000253a4;
                }
                goto code_r0x00025cdc;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025cdc:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar19 = puVar19 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x000253a4;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar21;
            if (puVar19 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar5;
              puVar19 = (undefined1 *)unaff_x19[2];
              if (puVar5 < puVar19) goto code_r0x000253d4;
              goto code_r0x0002541c;
            }
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar5 = puVar6 + 1;
            *puVar6 = 0;
            puVar21 = puVar7;
            if (puVar19 != puVar22) goto code_r0x0002537c;
code_r0x000253fc:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar5;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar19);
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar5) goto code_r0x0002541c;
code_r0x000253d4:
          puVar19 = puVar5 + 1;
          *puVar5 = 0;
        }
        else {
          puVar5 = (undefined1 *)*unaff_x19;
          puVar6 = puVar21 + -(long)puVar5;
          puVar19 = puVar6 + 1;
          if ((long)puVar19 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          uVar10 = unaff_x19[2] - (long)puVar5;
          puVar22 = (undefined1 *)(uVar10 * 2);
          if (puVar22 <= puVar19) {
            puVar22 = puVar19;
          }
          if (0x3ffffffffffffffe < uVar10) {
            puVar22 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar22 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar7 = puVar6 + 1;
            *puVar6 = 0;
            puVar22 = (undefined1 *)0x0;
            puVar12 = (undefined1 *)0x0;
            puVar19 = puVar6;
            if (puVar21 == puVar5) goto code_r0x00024c0c;
code_r0x00024b74:
            if ((puVar6 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar5 - lVar17) < 0x40)) {
code_r0x00024b9c:
              do {
                puVar19 = puVar19 + -1;
                puVar21 = puVar21 + -1;
                *puVar19 = *puVar21;
              } while (puVar21 != puVar5);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar6) {
              puVar15 = (undefined1 *)((ulong)puVar6 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar21 + -0x20);
              puVar16 = (undefined8 *)(puVar6 + lVar17 + -0x20);
              puVar22 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar22 = puVar22 + -0x40;
              } while (puVar22 != (undefined1 *)0x0);
              if (puVar6 != puVar15) {
                if (((ulong)puVar6 & 0x38) == 0) {
                  puVar19 = puVar19 + -(long)puVar15;
                  puVar21 = puVar21 + -(long)puVar15;
                  goto code_r0x00024b9c;
                }
                goto code_r0x000258bc;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x000258bc:
              puVar22 = (undefined1 *)((ulong)puVar6 & 0xfffffffffffffff8);
              puVar19 = puVar19 + -(long)puVar22;
              puVar16 = (undefined8 *)(puVar21 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar5));
              lVar18 = (long)puVar15 - (long)puVar22;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar21 = puVar21 + -(long)puVar22;
              if (puVar6 != puVar22) goto code_r0x00024b9c;
            }
            puVar21 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar7;
            unaff_x19[2] = (long)puVar12;
            if (puVar21 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar7;
              puVar19 = (undefined1 *)unaff_x19[2];
              if (puVar19 <= puVar7) goto code_r0x00024c2c;
              goto code_r0x00024bcc;
            }
          }
          else {
            lVar17 = __Znwm(puVar22);
            puVar19 = puVar6 + lVar17;
            puVar22 = puVar22 + lVar17;
            puVar7 = puVar19 + 1;
            *puVar19 = 0;
            puVar12 = puVar22;
            if (puVar21 != puVar5) goto code_r0x00024b74;
code_r0x00024c0c:
            *unaff_x19 = (long)puVar19;
            unaff_x19[1] = (long)puVar7;
            unaff_x19[2] = (long)puVar22;
          }
          __ZdlPv(puVar21);
          unaff_x19[1] = (long)puVar7;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar19 <= puVar7) goto code_r0x00024c2c;
code_r0x00024bcc:
          puVar21 = puVar7 + 1;
          *puVar7 = 0;
          unaff_x19[1] = (long)puVar21;
          uVar23 = (undefined1)*plVar3;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar21 < puVar19) goto code_r0x00024cd8;
code_r0x00024dd4:
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar21 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar12 = (undefined1 *)(((long)puVar19 - (long)puVar6) * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar6)) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 != (undefined1 *)0x0) {
            lVar17 = __Znwm(puVar12);
            puVar19 = puVar22 + lVar17;
            puVar12 = puVar12 + lVar17;
            puVar7 = puVar19 + 1;
            *puVar19 = uVar23;
            puVar5 = puVar12;
            if (puVar21 != puVar6) goto code_r0x00024e24;
code_r0x00024ed0:
            *unaff_x19 = (long)puVar19;
            unaff_x19[1] = (long)puVar7;
            unaff_x19[2] = (long)puVar12;
code_r0x00024edc:
            __ZdlPv(puVar21);
            unaff_x19[1] = (long)puVar7;
            puVar19 = (undefined1 *)unaff_x19[2];
            if (puVar19 <= puVar7) goto code_r0x00024cf8;
            goto code_r0x00024e80;
          }
          lVar17 = 0;
          puVar7 = puVar22 + 1;
          *puVar22 = uVar23;
          puVar12 = (undefined1 *)0x0;
          puVar5 = (undefined1 *)0x0;
          puVar19 = puVar22;
          if (puVar21 == puVar6) goto code_r0x00024ed0;
code_r0x00024e24:
          if ((puVar22 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar17) < 0x40)) {
code_r0x00024e50:
            do {
              puVar19 = puVar19 + -1;
              puVar21 = puVar21 + -1;
              *puVar19 = *puVar21;
            } while (puVar21 != puVar6);
          }
          else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
            puVar15 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
            puVar13 = (undefined8 *)(puVar21 + -0x20);
            puVar16 = (undefined8 *)(puVar22 + lVar17 + -0x20);
            puVar12 = puVar15;
            do {
              uVar25 = *puVar13;
              uVar24 = puVar13[3];
              uVar2 = puVar13[2];
              uVar29 = puVar13[-3];
              uVar28 = puVar13[-4];
              uVar27 = puVar13[-1];
              uVar26 = puVar13[-2];
              puVar16[1] = puVar13[1];
              *puVar16 = uVar25;
              puVar16[3] = uVar24;
              puVar16[2] = uVar2;
              puVar16[-3] = uVar29;
              puVar16[-4] = uVar28;
              puVar16[-1] = uVar27;
              puVar16[-2] = uVar26;
              puVar13 = puVar13 + -8;
              puVar16 = puVar16 + -8;
              puVar12 = puVar12 + -0x40;
            } while (puVar12 != (undefined1 *)0x0);
            if (puVar22 != puVar15) {
              if (((ulong)puVar22 & 0x38) == 0) {
                puVar19 = puVar19 + -(long)puVar15;
                puVar21 = puVar21 + -(long)puVar15;
                goto code_r0x00024e50;
              }
              goto code_r0x000259c4;
            }
          }
          else {
            puVar15 = (undefined1 *)0x0;
code_r0x000259c4:
            puVar12 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
            puVar19 = puVar19 + -(long)puVar12;
            puVar16 = (undefined8 *)(puVar21 + -(long)puVar15);
            puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar6));
            lVar18 = (long)puVar15 - (long)puVar12;
            do {
              puVar16 = puVar16 + -1;
              puVar13 = puVar13 + -1;
              *puVar13 = *puVar16;
              lVar18 = lVar18 + 8;
            } while (lVar18 != 0);
            puVar21 = puVar21 + -(long)puVar12;
            if (puVar22 != puVar12) goto code_r0x00024e50;
          }
          puVar21 = (undefined1 *)*unaff_x19;
          *unaff_x19 = lVar17;
          unaff_x19[1] = (long)puVar7;
          unaff_x19[2] = (long)puVar5;
          if (puVar21 != (undefined1 *)0x0) goto code_r0x00024edc;
          unaff_x19[1] = (long)puVar7;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar7 < puVar19) goto code_r0x00024e80;
code_r0x00024cf8:
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar7 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar12 = (undefined1 *)(((long)puVar19 - (long)puVar6) * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar6)) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar19 = puVar22 + 1;
            *puVar22 = 0;
            puVar12 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar5 = puVar22;
            if (puVar7 == puVar6) goto code_r0x00024f14;
code_r0x00024d44:
            if ((puVar22 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar17) < 0x40)) {
code_r0x00024d6c:
              do {
                puVar5 = puVar5 + -1;
                puVar7 = puVar7 + -1;
                *puVar5 = *puVar7;
              } while (puVar7 != puVar6);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
              puVar15 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar7 + -0x20);
              puVar16 = (undefined8 *)(puVar22 + lVar17 + -0x20);
              puVar12 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar12 = puVar12 + -0x40;
              } while (puVar12 != (undefined1 *)0x0);
              if (puVar22 != puVar15) {
                if (((ulong)puVar22 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar15;
                  puVar7 = puVar7 + -(long)puVar15;
                  goto code_r0x00024d6c;
                }
                goto code_r0x00025a48;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025a48:
              puVar12 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
              puVar5 = puVar5 + -(long)puVar12;
              puVar16 = (undefined8 *)(puVar7 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar6));
              lVar18 = (long)puVar15 - (long)puVar12;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar7 = puVar7 + -(long)puVar12;
              if (puVar22 != puVar12) goto code_r0x00024d6c;
            }
            puVar7 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar21;
            if (puVar7 == (undefined1 *)0x0) goto code_r0x00024e88;
          }
          else {
            lVar17 = __Znwm(puVar12);
            puVar5 = puVar22 + lVar17;
            puVar12 = puVar12 + lVar17;
            puVar19 = puVar5 + 1;
            *puVar5 = 0;
            puVar21 = puVar12;
            if (puVar7 != puVar6) goto code_r0x00024d44;
code_r0x00024f14:
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar12;
          }
          __ZdlPv(puVar7);
          unaff_x19[1] = (long)puVar19;
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar5 <= puVar19) goto code_r0x00024f34;
code_r0x00024e98:
          puVar5 = puVar19 + 1;
          *puVar19 = 0;
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar19) goto code_r0x00024fd8;
code_r0x00025034:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar5 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar19 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar19 = puVar12 + 1;
            *puVar12 = 0;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar5 == puVar22) goto code_r0x00025114;
code_r0x00025080:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x000250a8:
              do {
                puVar6 = puVar6 + -1;
                puVar5 = puVar5 + -1;
                *puVar6 = *puVar5;
              } while (puVar5 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar5 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar5 = puVar5 + -(long)puVar15;
                  goto code_r0x000250a8;
                }
                goto code_r0x00025b50;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025b50:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar5 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar5 = puVar5 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x000250a8;
            }
            puVar5 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar21;
            if (puVar5 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar19;
              uVar23 = (undefined1)*(undefined4 *)((long)plVar3 + 4);
              puVar5 = (undefined1 *)unaff_x19[2];
              if (puVar19 < puVar5) goto code_r0x000250dc;
              goto code_r0x00025138;
            }
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar19 = puVar6 + 1;
            *puVar6 = 0;
            puVar21 = puVar7;
            if (puVar5 != puVar22) goto code_r0x00025080;
code_r0x00025114:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar5);
          unaff_x19[1] = (long)puVar19;
          uVar23 = (undefined1)*(undefined4 *)((long)plVar3 + 4);
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar5 <= puVar19) goto code_r0x00025138;
code_r0x000250dc:
          puVar5 = puVar19 + 1;
          *puVar19 = uVar23;
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar19) goto code_r0x000251dc;
code_r0x00025234:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar5 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar19 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar19 = puVar12 + 1;
            *puVar12 = 0;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar5 == puVar22) goto code_r0x00025310;
code_r0x00025280:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x000252a8:
              do {
                puVar6 = puVar6 + -1;
                puVar5 = puVar5 + -1;
                *puVar6 = *puVar5;
              } while (puVar5 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar5 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar5 = puVar5 + -(long)puVar15;
                  goto code_r0x000252a8;
                }
                goto code_r0x00025c58;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025c58:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar5 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar5 = puVar5 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x000252a8;
            }
            puVar5 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar21;
            if (puVar5 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar19;
              puVar5 = (undefined1 *)unaff_x19[2];
              if (puVar19 < puVar5) goto code_r0x000252d8;
              goto code_r0x00025330;
            }
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar19 = puVar6 + 1;
            *puVar6 = 0;
            puVar21 = puVar7;
            if (puVar5 != puVar22) goto code_r0x00025280;
code_r0x00025310:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar5);
          unaff_x19[1] = (long)puVar19;
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar5 <= puVar19) goto code_r0x00025330;
code_r0x000252d8:
          puVar5 = puVar19 + 1;
          *puVar19 = 0;
          unaff_x19[1] = (long)puVar5;
          puVar19 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar19) goto code_r0x000253d4;
code_r0x0002541c:
          puVar22 = (undefined1 *)*unaff_x19;
          puVar12 = puVar5 + -(long)puVar22;
          puVar6 = puVar12 + 1;
          if ((long)puVar6 < 0) {
            func_0x00017f90();
            goto code_r0x00026138;
          }
          puVar7 = (undefined1 *)(((long)puVar19 - (long)puVar22) * 2);
          if (puVar7 <= puVar6) {
            puVar7 = puVar6;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar19 - (long)puVar22)) {
            puVar7 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar7 == (undefined1 *)0x0) {
            lVar17 = 0;
            puVar19 = puVar12 + 1;
            *puVar12 = 0;
            puVar7 = (undefined1 *)0x0;
            puVar21 = (undefined1 *)0x0;
            puVar6 = puVar12;
            if (puVar5 == puVar22) goto code_r0x000254d0;
code_r0x00025468:
            if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar22 - lVar17) < 0x40)) {
code_r0x00025490:
              do {
                puVar6 = puVar6 + -1;
                puVar5 = puVar5 + -1;
                *puVar6 = *puVar5;
              } while (puVar5 != puVar22);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
              puVar15 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar5 + -0x20);
              puVar16 = (undefined8 *)(puVar12 + lVar17 + -0x20);
              puVar7 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar7 = puVar7 + -0x40;
              } while (puVar7 != (undefined1 *)0x0);
              if (puVar12 != puVar15) {
                if (((ulong)puVar12 & 0x38) == 0) {
                  puVar6 = puVar6 + -(long)puVar15;
                  puVar5 = puVar5 + -(long)puVar15;
                  goto code_r0x00025490;
                }
                goto code_r0x00025d60;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025d60:
              puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
              puVar6 = puVar6 + -(long)puVar7;
              puVar16 = (undefined8 *)(puVar5 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar17 - (long)puVar22));
              lVar18 = (long)puVar15 - (long)puVar7;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar18 = lVar18 + 8;
              } while (lVar18 != 0);
              puVar5 = puVar5 + -(long)puVar7;
              if (puVar12 != puVar7) goto code_r0x00025490;
            }
            puVar5 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar17;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar21;
            if (puVar5 == (undefined1 *)0x0) goto code_r0x000254e0;
          }
          else {
            lVar17 = __Znwm(puVar7);
            puVar6 = puVar12 + lVar17;
            puVar7 = puVar7 + lVar17;
            puVar19 = puVar6 + 1;
            *puVar6 = 0;
            puVar21 = puVar7;
            if (puVar5 != puVar22) goto code_r0x00025468;
code_r0x000254d0:
            *unaff_x19 = (long)puVar6;
            unaff_x19[1] = (long)puVar19;
            unaff_x19[2] = (long)puVar7;
          }
          __ZdlPv(puVar5);
        }
code_r0x000254e0:
        unaff_x19[1] = (long)puVar19;
        uVar23 = (undefined1)*(undefined4 *)(lVar20 + lVar9 * 0x10 + 8);
        if (puVar19 < (undefined1 *)unaff_x19[2]) {
          *puVar19 = uVar23;
          unaff_x19[1] = (long)(puVar19 + 1);
        }
        else {
          puVar6 = (undefined1 *)*unaff_x19;
          puVar22 = puVar19 + -(long)puVar6;
          puVar5 = puVar22 + 1;
          if ((long)puVar5 < 0) {
            func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x2613c);
            (*pcVar1)();
          }
          uVar10 = unaff_x19[2] - (long)puVar6;
          puVar12 = (undefined1 *)(uVar10 * 2);
          if (puVar12 <= puVar5) {
            puVar12 = puVar5;
          }
          if (0x3ffffffffffffffe < uVar10) {
            puVar12 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar12 == (undefined1 *)0x0) {
            lVar20 = 0;
            puVar21 = puVar22 + 1;
            *puVar22 = uVar23;
            puVar12 = (undefined1 *)0x0;
            puVar7 = (undefined1 *)0x0;
            puVar5 = puVar22;
            if (puVar19 == puVar6) goto code_r0x000255c0;
code_r0x00025558:
            if ((puVar22 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar20) < 0x40)) {
code_r0x00025580:
              do {
                puVar5 = puVar5 + -1;
                puVar19 = puVar19 + -1;
                *puVar5 = *puVar19;
              } while (puVar19 != puVar6);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
              puVar15 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
              puVar13 = (undefined8 *)(puVar19 + -0x20);
              puVar16 = (undefined8 *)(puVar22 + lVar20 + -0x20);
              puVar12 = puVar15;
              do {
                uVar25 = *puVar13;
                uVar24 = puVar13[3];
                uVar2 = puVar13[2];
                uVar29 = puVar13[-3];
                uVar28 = puVar13[-4];
                uVar27 = puVar13[-1];
                uVar26 = puVar13[-2];
                puVar16[1] = puVar13[1];
                *puVar16 = uVar25;
                puVar16[3] = uVar24;
                puVar16[2] = uVar2;
                puVar16[-3] = uVar29;
                puVar16[-4] = uVar28;
                puVar16[-1] = uVar27;
                puVar16[-2] = uVar26;
                puVar13 = puVar13 + -8;
                puVar16 = puVar16 + -8;
                puVar12 = puVar12 + -0x40;
              } while (puVar12 != (undefined1 *)0x0);
              if (puVar22 != puVar15) {
                if (((ulong)puVar22 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar15;
                  puVar19 = puVar19 + -(long)puVar15;
                  goto code_r0x00025580;
                }
                goto code_r0x00025de4;
              }
            }
            else {
              puVar15 = (undefined1 *)0x0;
code_r0x00025de4:
              puVar12 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
              puVar5 = puVar5 + -(long)puVar12;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar15);
              puVar13 = (undefined8 *)((long)puVar16 + (lVar20 - (long)puVar6));
              lVar17 = (long)puVar15 - (long)puVar12;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar17 = lVar17 + 8;
              } while (lVar17 != 0);
              puVar19 = puVar19 + -(long)puVar12;
              if (puVar22 != puVar12) goto code_r0x00025580;
            }
            puVar19 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar20;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)puVar7;
            if (puVar19 != (undefined1 *)0x0) goto code_r0x000255c8;
          }
          else {
            lVar20 = __Znwm(puVar12);
            puVar5 = puVar22 + lVar20;
            puVar12 = puVar12 + lVar20;
            puVar21 = puVar5 + 1;
            *puVar5 = uVar23;
            puVar7 = puVar12;
            if (puVar19 != puVar6) goto code_r0x00025558;
code_r0x000255c0:
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar21;
            unaff_x19[2] = (long)puVar12;
code_r0x000255c8:
            __ZdlPv(puVar19);
          }
          unaff_x19[1] = (long)puVar21;
        }
        break;
      case 5:
        func_0x000262e0();
        break;
      case 6:
        lVar17 = *plVar3;
        lVar18 = *(long *)(lVar17 + 0x20);
        lVar20 = __dyld_get_image_header(0);
        if ((lVar18 != lVar20 + 0x4e8dec0) &&
           (uVar8 = (uint)*(byte *)(lVar17 + 6), *(byte *)(lVar17 + 6) != 0x1f)) {
          lVar18 = 0;
          lVar20 = 0;
          do {
            if ((*(uint *)(*(long *)(lVar17 + 0x20) + lVar18 + 0x1c) & 0xf) == 5) {
              func_0x000262e0();
              uVar8 = (uint)*(byte *)(lVar17 + 6);
            }
            lVar20 = lVar20 + 1;
            lVar18 = lVar18 + 0x20;
          } while (lVar20 < 1 << (ulong)(uVar8 & 0x1f));
        }
        break;
      case 7:
        if (*(char *)(*plVar3 + 3) == '\0') {
          func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*plVar3 + 0x18));
          func_0x00026614();
          if (uStack0000000000000008 != 0) {
            in_stack_00000010 = uStack0000000000000008;
            __ZdlPv();
          }
        }
        else {
          puVar19 = (undefined1 *)unaff_x19[1];
          if ((undefined1 *)unaff_x19[2] <= puVar19) {
            puVar6 = (undefined1 *)*unaff_x19;
            puVar22 = puVar19 + -(long)puVar6;
            puVar5 = puVar22 + 1;
            if ((long)puVar5 < 0) {
              func_0x00017f90();
              goto code_r0x00026138;
            }
            uVar10 = unaff_x19[2] - (long)puVar6;
            puVar12 = (undefined1 *)(uVar10 * 2);
            if (puVar12 <= puVar5) {
              puVar12 = puVar5;
            }
            if (0x3ffffffffffffffe < uVar10) {
              puVar12 = (undefined1 *)0x7fffffffffffffff;
            }
            if (puVar12 == (undefined1 *)0x0) {
              puVar7 = (undefined1 *)0x0;
              *puVar22 = 0x43;
              puVar5 = puVar22;
            }
            else {
              puVar7 = (undefined1 *)__Znwm(puVar12);
              puVar5 = puVar7 + (long)puVar22;
              *puVar5 = 0x43;
            }
            puVar21 = puVar5 + 1;
            if (puVar19 == puVar6) goto code_r0x00025618;
            puVar15 = puVar19;
            if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar22) &&
               (0x3f < (ulong)((long)puVar6 - (long)puVar7))) {
              if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar22) {
                puVar11 = (undefined1 *)((ulong)puVar22 & 0xffffffffffffffc0);
                puVar13 = (undefined8 *)(puVar19 + -0x20);
                puVar16 = (undefined8 *)(puVar7 + (long)puVar22 + -0x20);
                puVar15 = puVar11;
                do {
                  uVar25 = *puVar13;
                  uVar24 = puVar13[3];
                  uVar2 = puVar13[2];
                  uVar29 = puVar13[-3];
                  uVar28 = puVar13[-4];
                  uVar27 = puVar13[-1];
                  uVar26 = puVar13[-2];
                  puVar16[1] = puVar13[1];
                  *puVar16 = uVar25;
                  puVar16[3] = uVar24;
                  puVar16[2] = uVar2;
                  puVar16[-3] = uVar29;
                  puVar16[-4] = uVar28;
                  puVar16[-1] = uVar27;
                  puVar16[-2] = uVar26;
                  puVar13 = puVar13 + -8;
                  puVar16 = puVar16 + -8;
                  puVar15 = puVar15 + -0x40;
                } while (puVar15 != (undefined1 *)0x0);
                if (puVar22 == puVar11) goto LAB_00025fc8;
                if (((ulong)puVar22 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar11;
                  puVar15 = puVar19 + -(long)puVar11;
                  goto code_r0x00025fb8;
                }
              }
              else {
                puVar11 = (undefined1 *)0x0;
              }
              puVar14 = (undefined1 *)((ulong)puVar22 & 0xfffffffffffffff8);
              puVar15 = puVar19 + -(long)puVar14;
              puVar5 = puVar5 + -(long)puVar14;
              puVar16 = (undefined8 *)(puVar19 + -(long)puVar11);
              puVar13 = (undefined8 *)(puVar7 + ((long)puVar16 - (long)puVar6));
              lVar20 = (long)puVar11 - (long)puVar14;
              do {
                puVar16 = puVar16 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar16;
                lVar20 = lVar20 + 8;
              } while (lVar20 != 0);
              if (puVar22 == puVar14) goto LAB_00025fc8;
            }
code_r0x00025fb8:
            do {
              puVar5 = puVar5 + -1;
              puVar15 = puVar15 + -1;
              *puVar5 = *puVar15;
            } while (puVar15 != puVar6);
            goto LAB_00025fc8;
          }
          *puVar19 = 0x43;
          unaff_x19[1] = (long)(puVar19 + 1);
        }
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 < *(int *)(unaff_x20 + 0x98));
  }
  if (0 < *(int *)(unaff_x20 + 0x8c)) {
    lVar9 = 0;
    do {
      func_0x000245c0(&uStack0000000000000008,
                      *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar9 * 8));
      func_0x00026614();
      if (uStack0000000000000008 != 0) {
        in_stack_00000010 = uStack0000000000000008;
        __ZdlPv();
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 < *(int *)(unaff_x20 + 0x8c));
  }
  func_0x000262e0();
  return;
}

