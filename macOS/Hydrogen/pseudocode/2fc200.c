
/* WARNING: Possible PIC construction at 0x002fd5f4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002fd5f8) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_002fc200(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  char cVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 *puVar10;
  int iVar11;
  undefined4 uVar12;
  uint uVar13;
  int iVar14;
  int iVar15;
  uint uVar16;
  long *plVar17;
  segment_command *psVar18;
  undefined8 uVar19;
  long *plVar20;
  segment_command *psVar21;
  segment_command *psVar22;
  ulong uVar23;
  long lVar24;
  long extraout_x8;
  long lVar25;
  ulong *puVar26;
  long extraout_x9;
  long lVar27;
  long lVar28;
  uint uVar29;
  ulong extraout_x11;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  long extraout_x14;
  segment_command *unaff_x19;
  qword qVar34;
  undefined8 *puVar35;
  segment_command *unaff_x20;
  segment_command *psVar36;
  ulong unaff_x21;
  segment_command *unaff_x23;
  segment_command *psVar37;
  long unaff_x24;
  ulong unaff_x25;
  segment_command *unaff_x26;
  long *plVar38;
  ulong unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  undefined1 auVar57 [16];
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  undefined8 uVar82;
  byte bVar89;
  byte bVar90;
  byte bVar92;
  byte bVar93;
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  undefined8 uVar91;
  byte bVar98;
  byte bVar99;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  undefined8 uVar100;
  byte bVar107;
  undefined8 uVar108;
  undefined8 uVar109;
  undefined8 uVar110;
  undefined8 uVar111;
  undefined8 uVar112;
  undefined8 uVar113;
  undefined8 uVar114;
  undefined8 uVar115;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long *in_stack_00000010;
  segment_command *in_stack_00000018;
  
  plVar17 = (long *)func_0x0029e340();
  psVar18 = (segment_command *)func_0x0029e340();
  uVar19 = 0;
  psVar37 = unaff_x23;
  if (unaff_x24 == 0) goto LAB_002fc288;
  if (plVar17 == (long *)0x0) goto LAB_002fc288;
  if (psVar18 == (segment_command *)0x0) goto LAB_002fc288;
  uVar19 = func_0x002fbc24();
  if ((int)uVar19 == 0) goto LAB_002fc288;
  unaff_x25 = *(ulong *)(unaff_x21 + 0x128);
  psVar36 = *(segment_command **)(unaff_x21 + 0x130);
  psVar37 = (segment_command *)(unaff_x25 + 0x18);
  psVar21 = *(segment_command **)psVar37;
  unaff_x28 = *(ulong *)(unaff_x21 + 0x138);
  uVar19._0_4_ = unaff_x26->cmd;
  uVar19._4_4_ = unaff_x26->cmdsize;
  psVar22 = (segment_command *)(long)*(int *)(unaff_x25 + 0x20);
  iVar11 = func_0x0029d99c(uVar19,(long)*(int *)unaff_x26->segname);
  if (-1 < iVar11) {
    func_0x0079f098();
    in_stack_00000018 = unaff_x26;
code_r0x002fc6a4:
    puVar39 = &_aws_lc_0_24_0_RSA_generate_key_ex;
    auVar57 = func_0x0079f0c0();
    uVar23 = 0;
    puVar10 = (undefined1 *)register0x00000008;
    while( true ) {
      *(ulong *)(puVar10 + -0x60) = unaff_x28;
      *(long **)(puVar10 + -0x58) = plVar17;
      *(segment_command **)(puVar10 + -0x50) = in_stack_00000018;
      *(ulong *)(puVar10 + -0x48) = unaff_x25;
      *(long *)(puVar10 + -0x40) = unaff_x24;
      *(segment_command **)(puVar10 + -0x38) = psVar37;
      *(segment_command **)(puVar10 + -0x30) = psVar18;
      *(ulong *)(puVar10 + -0x28) = unaff_x21;
      *(segment_command **)(puVar10 + -0x20) = psVar36;
      *(segment_command **)(puVar10 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar10 + -0x10) = unaff_x29;
      *(undefined **)(puVar10 + -8) = puVar39;
      uVar13 = auVar57._8_4_ & 0xffffff80;
      if ((int)uVar13 < 0x100) break;
      *(long *)(puVar10 + -0xb0) = auVar57._0_8_;
      unaff_x25 = 0;
      *(uint *)(puVar10 + -0xa8) = uVar13;
      uVar13 = uVar13 >> 1;
      uVar16 = uVar13 - 100 >> 6;
      *(ulong *)(puVar10 + -0x88) = (ulong)uVar16;
      *(segment_command **)(puVar10 + -0x80) = psVar22;
      uVar29 = auVar57._8_4_ >> 7;
      *(ulong *)(puVar10 + -0x98) = (ulong)(uVar16 + 1);
      *(ulong *)(puVar10 + -0x90) = (ulong)uVar29;
      *(ulong *)(puVar10 + -0xa0) = (ulong)(uVar29 + 1);
      *(uint *)(puVar10 + -0xa4) = uVar13;
      *(uint *)(puVar10 + -0xb8) = uVar13 - 0x800;
      *(uint *)(puVar10 + -0xb4) = 0x800 - uVar13;
      uVar33 = unaff_x21;
      psVar37 = psVar18;
      plVar38 = plVar17;
      unaff_x28 = uVar23;
LAB_002fc85c:
      func_0x0028f0e4();
      lVar24 = func_0x002f8ac4(0);
      if (lVar24 == 0) {
        uVar19 = 0;
        goto LAB_002fd4a8;
      }
      uVar16 = *(uint *)psVar21->segname;
      uVar23 = (ulong)uVar16;
      uVar13 = uVar16 & (int)uVar16 >> 0x1f;
      lVar25 = uVar23 * 8;
      do {
        lVar25 = lVar25 + -8;
        uVar29 = (uint)uVar23;
        uVar23 = (ulong)(uVar29 - 1);
        if ((int)uVar29 < 1) {
          if (-1 < (int)uVar16) goto code_r0x002fc954;
          lVar28._0_4_ = psVar21->cmd;
          lVar28._4_4_ = psVar21->cmdsize;
          goto code_r0x002fc8ac;
        }
        lVar28 = *(long *)psVar21;
      } while (*(long *)(lVar28 + lVar25) == 0);
      uVar13 = uVar29;
code_r0x002fc8ac:
      uVar31 = *(ulong *)(lVar28 + (long)(int)(uVar13 - 1) * 8);
      uVar30 = uVar31 >> 0x20;
      uVar23 = uVar30;
      if (uVar30 == 0) {
        uVar23 = uVar31;
      }
      uVar32 = uVar23 >> 0x10;
      uVar1 = uVar32;
      if (uVar32 == 0) {
        uVar1 = uVar23;
      }
      uVar23 = uVar1 >> 8;
      if (uVar1 < 0x100) {
        uVar23 = uVar1;
      }
      uVar2 = uVar23 >> 4;
      if (uVar23 < 0x10) {
        uVar2 = uVar23;
      }
      uVar3 = uVar2 >> 2;
      if (uVar2 < 4) {
        uVar3 = uVar2;
      }
      uVar13 = (uint)(uVar31 != 0) | (uVar13 - 1) * 0x40 | (uint)(uVar30 != 0) << 5 |
               (uint)(uVar32 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar23) << 2 |
               (uint)(3 < uVar2) << 1;
      if (1 < uVar3) {
        uVar13 = uVar13 + 1;
      }
      if (0x20 < uVar13) {
        func_0x0028f83c(4,0,0x65,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3fd);
        plVar17 = plVar38;
LAB_002fd084:
        uVar33 = func_0x0028edc4();
        func_0x002f7efc(lVar24);
        uVar19 = 0;
        lVar24 = 0;
        if (((2 < (uint)unaff_x25) || (((uint)uVar33 & 0xff000000) != 0x4000000)) ||
           (unaff_x25 = (ulong)((uint)unaff_x25 + 1), plVar38 = plVar17,
           ((uint)uVar33 & 0xfff) != 0x8d)) goto LAB_002fd4a8;
        goto LAB_002fc85c;
      }
code_r0x002fc954:
      in_stack_00000018 = (segment_command *)func_0x0036e31c(0x30);
      if (in_stack_00000018 == (segment_command *)0x0) {
LAB_002fd00c:
        psVar22 = (segment_command *)((long)&MACH_HEADER.magic + 3);
        func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd12c:
        plVar20 = (long *)((long)&MACH_HEADER.magic + 1);
        plVar17 = plVar38;
joined_r0x002fd12c:
        if (in_stack_00000018 != (segment_command *)0x0) {
          if ((char)in_stack_00000018->fileoff == '\0') {
            if (*(long *)(in_stack_00000018->segname + 8) == 0) {
              func_0x0079db4c();
code_r0x002fd4e8:
              func_0x0079f160();
code_r0x002fd4ec:
              func_0x0079f138();
LAB_002fd4f0:
              func_0x0079f110();
              goto LAB_002fd4f4;
            }
            lVar25 = *(long *)(in_stack_00000018->segname + 8) + -1;
            *(long *)(in_stack_00000018->segname + 8) = lVar25;
            qVar34 = *(qword *)(*(long *)in_stack_00000018->segname + lVar25 * 8);
            in_stack_00000018->vmsize = qVar34;
            if (qVar34 != 0) goto LAB_002fd4f8;
          }
          uVar109._0_4_ = in_stack_00000018->cmd;
          uVar109._4_4_ = in_stack_00000018->cmdsize;
          func_0x00373520(uVar109,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
          func_0x0036e3d8(*(undefined8 *)in_stack_00000018->segname);
          func_0x0036e3d8(in_stack_00000018);
        }
        if ((int)plVar20 == 0) {
          if (((int)unaff_x28 != 0) && (iVar11 = func_0x002fb278(lVar24), iVar11 == 0)) {
            func_0x002f7efc(lVar24);
            return 0;
          }
          lVar25 = *(long *)(puVar10 + -0xb0);
          func_0x002f8cb0(lVar25);
          puVar35 = *(undefined8 **)(lVar25 + 8);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 8) = *(undefined8 *)(lVar24 + 8);
          *(undefined8 *)(lVar24 + 8) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x10);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x10) = *(undefined8 *)(lVar24 + 0x10);
          *(undefined8 *)(lVar24 + 0x10) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x18);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x18) = *(undefined8 *)(lVar24 + 0x18);
          *(undefined8 *)(lVar24 + 0x18) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x20);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x20) = *(undefined8 *)(lVar24 + 0x20);
          *(undefined8 *)(lVar24 + 0x20) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x28);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x28) = *(undefined8 *)(lVar24 + 0x28);
          *(undefined8 *)(lVar24 + 0x28) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x30);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x30) = *(undefined8 *)(lVar24 + 0x30);
          *(undefined8 *)(lVar24 + 0x30) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x38);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x38) = *(undefined8 *)(lVar24 + 0x38);
          *(undefined8 *)(lVar24 + 0x38) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x40);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x40) = *(undefined8 *)(lVar24 + 0x40);
          *(undefined8 *)(lVar24 + 0x40) = 0;
          func_0x002a34e0(*(undefined8 *)(lVar25 + 0x128));
          *(undefined8 *)(lVar25 + 0x128) = *(undefined8 *)(lVar24 + 0x128);
          *(undefined8 *)(lVar24 + 0x128) = 0;
          func_0x002a34e0(*(undefined8 *)(lVar25 + 0x130));
          *(undefined8 *)(lVar25 + 0x130) = *(undefined8 *)(lVar24 + 0x130);
          *(undefined8 *)(lVar24 + 0x130) = 0;
          func_0x002a34e0(*(undefined8 *)(lVar25 + 0x138));
          *(undefined8 *)(lVar25 + 0x138) = *(undefined8 *)(lVar24 + 0x138);
          *(undefined8 *)(lVar24 + 0x138) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x140);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x140) = *(undefined8 *)(lVar24 + 0x140);
          *(undefined8 *)(lVar24 + 0x140) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x148);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x148) = *(undefined8 *)(lVar24 + 0x148);
          *(undefined8 *)(lVar24 + 0x148) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x150);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x150) = *(undefined8 *)(lVar24 + 0x150);
          *(undefined8 *)(lVar24 + 0x150) = 0;
          puVar35 = *(undefined8 **)(lVar25 + 0x158);
          if (puVar35 != (undefined8 *)0x0) {
            uVar13 = *(uint *)((long)puVar35 + 0x14);
            if ((uVar13 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar35);
              uVar13 = *(uint *)((long)puVar35 + 0x14);
            }
            if ((uVar13 & 1) == 0) {
              *puVar35 = 0;
            }
            else {
              func_0x0036e3d8(puVar35);
            }
          }
          *(undefined8 *)(lVar25 + 0x158) = *(undefined8 *)(lVar24 + 0x158);
          *(undefined8 *)(lVar24 + 0x158) = 0;
          *(byte *)(lVar25 + 0x180) =
               *(byte *)(lVar25 + 0x180) & 0xfe | *(byte *)(lVar24 + 0x180) & 1;
          uVar19 = 1;
          goto LAB_002fd4a8;
        }
        goto LAB_002fd084;
      }
      in_stack_00000018->segname[0] = '\0';
      in_stack_00000018->segname[1] = '\0';
      in_stack_00000018->segname[2] = '\0';
      in_stack_00000018->segname[3] = '\0';
      in_stack_00000018->segname[4] = '\0';
      in_stack_00000018->segname[5] = '\0';
      in_stack_00000018->segname[6] = '\0';
      in_stack_00000018->segname[7] = '\0';
      in_stack_00000018->segname[8] = '\0';
      in_stack_00000018->segname[9] = '\0';
      in_stack_00000018->segname[10] = '\0';
      in_stack_00000018->segname[0xb] = '\0';
      in_stack_00000018->segname[0xc] = '\0';
      in_stack_00000018->segname[0xd] = '\0';
      in_stack_00000018->segname[0xe] = '\0';
      in_stack_00000018->segname[0xf] = '\0';
      in_stack_00000018->vmaddr = 0;
      if ((char)in_stack_00000018->fileoff == '\0') {
        qVar34 = in_stack_00000018->vmsize;
        lVar25 = func_0x0036e48c(0,0x100);
        if (lVar25 == 0) {
          *(undefined2 *)&in_stack_00000018->fileoff = 0x101;
        }
        else {
          in_stack_00000018->vmaddr = 0x20;
          *(qword *)(lVar25 + *(long *)(in_stack_00000018->segname + 8) * 8) = qVar34;
          *(long *)in_stack_00000018->segname = lVar25;
          *(long *)(in_stack_00000018->segname + 8) = *(long *)(in_stack_00000018->segname + 8) + 1;
        }
      }
      psVar37 = (segment_command *)func_0x0029e340(in_stack_00000018);
      uVar19 = func_0x0029e340(in_stack_00000018);
      *(undefined8 *)(puVar10 + -0x70) = uVar19;
      uVar33 = func_0x0029e340(in_stack_00000018);
      unaff_x24 = func_0x0029e340(in_stack_00000018);
      plVar20 = (long *)func_0x0029e340(in_stack_00000018);
      plVar17 = (long *)func_0x0029e340(in_stack_00000018);
      *(segment_command **)(puVar10 + -0x78) = psVar37;
      if (((psVar37 == (segment_command *)0x0) || (*(long *)(puVar10 + -0x70) == 0)) ||
         ((uVar33 == 0 ||
          (((unaff_x24 == 0 || (plVar20 == (long *)0x0)) ||
           (plVar38 = plVar17, plVar17 == (long *)0x0)))))) goto LAB_002fd00c;
      lVar25 = *(long *)(puVar10 + -0x88);
      if ((int)plVar20[1] <= (int)lVar25) {
        iVar11 = func_0x0029afb8(plVar20,*(undefined8 *)(puVar10 + -0x98));
        if (iVar11 == 0) goto LAB_002fd00c;
        iVar11 = (int)plVar20[1];
        lVar25 = *(long *)(puVar10 + -0x88);
        if (iVar11 <= (int)lVar25) {
          _bzero(*plVar20 + (long)iVar11 * 8,(ulong)(uint)((int)lVar25 - iVar11) * 8 + 8);
          lVar25 = *(long *)(puVar10 + -0x88);
        }
        *(int *)(plVar20 + 1) = (int)*(undefined8 *)(puVar10 + -0x98);
      }
      *(ulong *)(*plVar20 + lVar25 * 8) = *(ulong *)(*plVar20 + lVar25 * 8) | 0x10000000;
      lVar25 = *(long *)(puVar10 + -0x90);
      if ((int)plVar17[1] <= (int)lVar25) {
        iVar11 = func_0x0029afb8(plVar17,*(undefined8 *)(puVar10 + -0xa0));
        if (iVar11 == 0) goto LAB_002fd00c;
        iVar11 = (int)plVar17[1];
        lVar25 = *(long *)(puVar10 + -0x90);
        if (iVar11 <= (int)lVar25) {
          _bzero(*plVar17 + (long)iVar11 * 8,(ulong)(uint)((int)lVar25 - iVar11) * 8 + 8);
          lVar25 = *(long *)(puVar10 + -0x90);
        }
        *(int *)(plVar17 + 1) = (int)*(undefined8 *)(puVar10 + -0xa0);
      }
      *(ulong *)(*plVar17 + lVar25 * 8) = *(ulong *)(*plVar17 + lVar25 * 8) | 1;
      if (*(long *)(lVar24 + 8) == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 8) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 8) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x18);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x18);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x18) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x18) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x10);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x10);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x10) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x10) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x20);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x20);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x20) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x20) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x28);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x28);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x28) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x28) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x30);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x30);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x30) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x30) = lVar25;
        lVar25 = *(long *)(lVar24 + 0x38);
      }
      else {
        lVar25 = *(long *)(lVar24 + 0x38);
      }
      if (lVar25 == 0) {
        lVar25 = func_0x0036e31c(0x18);
        if (lVar25 == 0) {
          *(undefined8 *)(lVar24 + 0x38) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar25 + 0x14) = 1;
        *(long *)(lVar24 + 0x38) = lVar25;
        psVar37 = *(segment_command **)(lVar24 + 0x10);
        if (psVar37 != psVar21) goto code_r0x002fcb2c;
code_r0x002fcc64:
        psVar22 = &segment_command_00000020;
        iVar11 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
      }
      else {
        psVar37 = *(segment_command **)(lVar24 + 0x10);
        if (psVar37 == psVar21) goto code_r0x002fcc64;
code_r0x002fcb2c:
        iVar11 = func_0x0029afb8(psVar37,(long)*(int *)psVar21->segname);
        if (iVar11 == 0) goto LAB_002fd00c;
        uVar12 = 0;
        if (*(int *)psVar21->segname != 0) {
          uVar91._0_4_ = psVar21->cmd;
          uVar91._4_4_ = psVar21->cmdsize;
          uVar82._0_4_ = psVar37->cmd;
          uVar82._4_4_ = psVar37->cmdsize;
          _memcpy(uVar82,uVar91,(long)*(int *)psVar21->segname << 3);
          uVar12 = *(undefined4 *)psVar21->segname;
        }
        *(undefined4 *)psVar37->segname = uVar12;
        *(undefined4 *)(psVar37->segname + 8) = *(undefined4 *)(psVar21->segname + 8);
        psVar22 = &segment_command_00000020;
        iVar11 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
      }
      if (iVar11 == 0) goto LAB_002fd00c;
      iVar11 = func_0x0029bf0c(unaff_x24);
      if (iVar11 != 0x800) goto code_r0x002fd4e8;
      if (*(uint *)(puVar10 + -0xa8) < 0x1000) {
        psVar22 = (segment_command *)(ulong)*(uint *)(puVar10 + -0xb4);
        iVar11 = func_0x0029f130(unaff_x24,unaff_x24);
        if (iVar11 == 0) goto LAB_002fd00c;
      }
      else if (*(uint *)(puVar10 + -0xa8) != 0x1000) {
        iVar11 = func_0x0029b0e4(unaff_x24,1);
        if (iVar11 != 0) {
          psVar22 = (segment_command *)(ulong)*(uint *)(puVar10 + -0xb8);
          iVar11 = func_0x0029ed38(unaff_x24,unaff_x24);
          if (iVar11 != 0) goto code_r0x002fccfc;
        }
        goto LAB_002fd00c;
      }
code_r0x002fccfc:
      *(ulong *)(puVar10 + -0xc0) = uVar33;
      iVar11 = func_0x0029bf0c(unaff_x24);
      *(int *)(puVar10 + -0xc4) = (int)unaff_x28;
      if (*(int *)(puVar10 + -0xa4) != iVar11) goto code_r0x002fd4ec;
LAB_002fcd40:
      do {
        iVar11 = func_0x0031de90(*(undefined8 *)(lVar24 + 0x20),*(undefined4 *)(puVar10 + -0xa4),
                                 *(undefined8 *)(lVar24 + 0x10),0,unaff_x24,plVar20,
                                 in_stack_00000018,*(undefined8 *)(puVar10 + -0x80));
        if (iVar11 == 0) goto LAB_002fd00c;
        if (*(long *)(puVar10 + -0x80) != 0) {
          cVar4 = **(char **)(puVar10 + -0x80);
          if (cVar4 == '\x01') {
            iVar11 = (**(code **)(*(char **)(puVar10 + -0x80) + 0x10))(3,0);
            if (iVar11 == 0) goto LAB_002fd00c;
          }
          else {
            if (cVar4 != '\x02') goto LAB_002fd00c;
            (**(code **)(*(long *)(puVar10 + -0x80) + 0x10))(3,0);
          }
        }
        iVar11 = func_0x0031de90(*(undefined8 *)(lVar24 + 0x28),*(undefined4 *)(puVar10 + -0xa4),
                                 *(undefined8 *)(lVar24 + 0x10),*(undefined8 *)(lVar24 + 0x20),
                                 unaff_x24,plVar20,in_stack_00000018,
                                 *(undefined8 *)(puVar10 + -0x80));
        if (iVar11 == 0) goto LAB_002fd00c;
        if (*(long *)(puVar10 + -0x80) != 0) {
          cVar4 = **(char **)(puVar10 + -0x80);
          if (cVar4 == '\x01') {
            iVar11 = (**(code **)(*(char **)(puVar10 + -0x80) + 0x10))(3,1);
            if (iVar11 == 0) goto LAB_002fd00c;
          }
          else {
            if (cVar4 != '\x02') goto LAB_002fd00c;
            (**(code **)(*(long *)(puVar10 + -0x80) + 0x10))(3,1);
          }
        }
        psVar37 = *(segment_command **)(lVar24 + 0x20);
        psVar18 = *(segment_command **)(lVar24 + 0x28);
        if ((psVar37 == (segment_command *)0x0) || (psVar18 == (segment_command *)0x0)) {
          if (psVar37 != (segment_command *)0x0) goto code_r0x002fce74;
          psVar18 = (segment_command *)0x0;
        }
        else {
          iVar11 = *(int *)(psVar37->segname + 8);
          if (iVar11 == *(int *)(psVar18->segname + 8)) {
            uVar100._0_4_ = psVar37->cmd;
            uVar100._4_4_ = psVar37->cmdsize;
            uVar108._0_4_ = psVar18->cmd;
            uVar108._4_4_ = psVar18->cmdsize;
            iVar15 = func_0x0029d99c(uVar100,(long)*(int *)psVar37->segname,uVar108,
                                     (long)*(int *)psVar18->segname);
            iVar14 = -iVar15;
            if (iVar11 == 0) {
              iVar14 = iVar15;
            }
            if (-1 < iVar14) {
code_r0x002fce7c:
              psVar18 = psVar37;
              goto code_r0x002fce80;
            }
          }
          else if (iVar11 == 0) goto code_r0x002fce7c;
code_r0x002fce74:
          *(segment_command **)(lVar24 + 0x20) = psVar18;
          *(segment_command **)(lVar24 + 0x28) = psVar37;
        }
code_r0x002fce80:
        func_0x00373e9c(0xa29210,&DAT_0029be70);
        iVar11 = func_0x0029b864(*(undefined8 *)(puVar10 + -0x70),psVar18,0xa398c0);
        uVar33 = *(ulong *)(puVar10 + -0xc0);
        if (iVar11 == 0) {
LAB_002fd008:
          unaff_x28 = (ulong)*(uint *)(puVar10 + -0xc4);
          goto LAB_002fd00c;
        }
        psVar37 = *(segment_command **)(lVar24 + 0x28);
        func_0x00373e9c(0xa29210,&DAT_0029be70);
        iVar11 = func_0x0029b864(uVar33,psVar37,0xa398c0);
        if ((iVar11 == 0) ||
           (iVar11 = func_0x002a7f48(*(undefined8 *)(puVar10 + -0x78),
                                     *(undefined8 *)(puVar10 + -0x70),uVar33,in_stack_00000018),
           iVar11 == 0)) goto LAB_002fd008;
        psVar22 = *(segment_command **)(lVar24 + 0x10);
        iVar11 = func_0x002a5b4c(*(undefined8 *)(lVar24 + 0x18),puVar10 + -100,psVar22,
                                 *(undefined8 *)(puVar10 + -0x78),in_stack_00000018);
        if (iVar11 == 0) goto LAB_002fd008;
        puVar35 = *(undefined8 **)(lVar24 + 0x18);
        unaff_x28 = (ulong)*(uint *)(puVar10 + -0xc4);
        if (puVar35 == (undefined8 *)0x0) break;
        uVar13 = *(uint *)(puVar35 + 2);
        uVar33 = (ulong)uVar13;
        if (uVar13 != *(uint *)(plVar17 + 2)) {
          if (uVar13 == 0) break;
          goto LAB_002fcd40;
        }
        psVar22 = (segment_command *)*plVar17;
        iVar14 = func_0x0029d99c(*puVar35,(long)*(int *)(puVar35 + 1),psVar22,(long)(int)plVar17[1])
        ;
        iVar11 = -iVar14;
        if (uVar13 == 0) {
          iVar11 = iVar14;
        }
      } while (iVar11 < 1);
      uVar16 = func_0x0029bf0c(*(undefined8 *)(puVar10 + -0x70));
      uVar13 = *(uint *)(puVar10 + -0xa4);
      plVar20 = (long *)(ulong)uVar13;
      if (uVar16 != uVar13) goto LAB_002fd4f0;
      uVar33 = *(ulong *)(puVar10 + -0xc0);
      uVar16 = func_0x0029bf0c(uVar33);
      if (uVar16 == uVar13) {
        iVar11 = func_0x002a80fc(*(undefined8 *)(lVar24 + 8),*(undefined8 *)(lVar24 + 0x20),
                                 *(undefined8 *)(lVar24 + 0x28),in_stack_00000018);
        if ((iVar11 == 0) ||
           (iVar11 = func_0x0029f764(0,*(undefined8 *)(lVar24 + 0x30),*(undefined8 *)(lVar24 + 0x18)
                                     ,*(undefined8 *)(puVar10 + -0x70),
                                     *(undefined4 *)(puVar10 + -0xa4),in_stack_00000018),
           iVar11 == 0)) goto LAB_002fd00c;
        psVar22 = *(segment_command **)(lVar24 + 0x18);
        iVar11 = func_0x0029f764(0,*(undefined8 *)(lVar24 + 0x38),psVar22,uVar33,
                                 *(undefined4 *)(puVar10 + -0xa4),in_stack_00000018);
        if (iVar11 == 0) goto LAB_002fd00c;
        plVar20 = *(long **)(lVar24 + 8);
        uVar13 = *(uint *)(plVar20 + 1);
        uVar23 = (ulong)uVar13;
        lVar25 = uVar23 * 8;
        do {
          lVar25 = lVar25 + -8;
          iVar11 = (int)uVar23;
          uVar23 = (ulong)(iVar11 - 1);
          if (iVar11 < 1) {
            *(uint *)(plVar20 + 1) = uVar13 & (int)uVar13 >> 0x1f;
            if (-1 < (int)uVar13) {
              *(undefined4 *)(plVar20 + 2) = 0;
            }
            goto LAB_002fd0d4;
          }
        } while (*(long *)(*plVar20 + lVar25) == 0);
        *(int *)(plVar20 + 1) = iVar11;
LAB_002fd0d4:
        iVar11 = func_0x0029bf0c();
        if (iVar11 != *(int *)(puVar10 + -0xa8)) {
          psVar22 = (segment_command *)((long)&segment_command_00000020.vmsize + 4);
          func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
          goto joined_r0x002fd12c;
        }
        iVar11 = func_0x002fbc24(lVar24,in_stack_00000018);
        if (iVar11 == 0) goto LAB_002fd00c;
        iVar11 = func_0x002f77a0(lVar24);
        if (iVar11 == 0) {
          psVar22 = (segment_command *)(section_00000068.segname + 4);
          func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
          goto joined_r0x002fd12c;
        }
        plVar20 = (long *)0x0;
        goto joined_r0x002fd12c;
      }
LAB_002fd4f4:
      func_0x0079f0e8();
LAB_002fd4f8:
      auVar57 = func_0x0079db28();
      unaff_x21 = auVar57._8_8_;
      psVar18 = auVar57._0_8_;
      *(long *)(puVar10 + -0x110) = unaff_x24;
      *(segment_command **)(puVar10 + -0x108) = psVar21;
      *(segment_command **)(puVar10 + -0x100) = psVar37;
      *(ulong *)(puVar10 + -0xf8) = uVar33;
      *(long *)(puVar10 + -0xf0) = lVar24;
      *(long **)(puVar10 + -0xe8) = plVar20;
      *(undefined1 **)(puVar10 + -0xe0) = puVar10 + -0x10;
      *(undefined **)(puVar10 + -0xd8) = &_aws_lc_0_24_0_RSA_generate_key_fips;
      unaff_x29 = puVar10 + -0xe0;
      if ((auVar57._8_4_ < 0x800) || ((unaff_x21 & 0x7f) != 0)) {
        func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
        return 0;
      }
      psVar21 = (segment_command *)func_0x0036e31c(0x18);
      if (psVar21 == (segment_command *)0x0) {
        return 0;
      }
      *(undefined4 *)(psVar21->segname + 0xc) = 1;
      if ((int)*(qword *)(psVar21->segname + 4) == 0) {
        psVar37 = (segment_command *)func_0x0036e358(1,8);
        if (psVar37 == (segment_command *)0x0) {
          uVar13 = (uint)*(qword *)(psVar21->segname + 0xc);
          if ((uVar13 >> 1 & 1) == 0) {
            uVar110._0_4_ = psVar21->cmd;
            uVar110._4_4_ = psVar21->cmdsize;
            func_0x0036e3d8(uVar110);
            uVar13 = (uint)*(qword *)(psVar21->segname + 0xc);
          }
          if ((uVar13 & 1) == 0) {
            psVar21->cmd = 0;
            psVar21->cmdsize = 0;
            return 0;
          }
          func_0x0036e3d8(psVar21);
          return 0;
        }
        if (*(int *)psVar21->segname != 0) {
          uVar111._0_4_ = psVar21->cmd;
          uVar111._4_4_ = psVar21->cmdsize;
          _memcpy(psVar37,uVar111,(long)*(int *)psVar21->segname << 3);
        }
        uVar112._0_4_ = psVar21->cmd;
        uVar112._4_4_ = psVar21->cmdsize;
        func_0x0036e3d8(uVar112);
        *(segment_command **)psVar21 = psVar37;
        *(undefined4 *)(psVar21->segname + 4) = 1;
      }
      else {
        psVar37 = *(segment_command **)psVar21;
      }
      psVar21->segname[8] = '\0';
      psVar21->segname[9] = '\0';
      psVar21->segname[10] = '\0';
      psVar21->segname[0xb] = '\0';
      *(undefined **)psVar37 = &UNK_00010001;
      psVar21->segname[0] = '\x01';
      psVar21->segname[1] = '\0';
      psVar21->segname[2] = '\0';
      psVar21->segname[3] = '\0';
      uVar23 = 1;
      puVar39 = &UNK_002fd5f8;
      puVar10 = puVar10 + -0x110;
      unaff_x19 = psVar21;
      psVar36 = psVar22;
    }
    func_0x0028f0e4();
    lVar24 = func_0x002f8ac4(0);
    if (lVar24 == 0) {
LAB_002fd15c:
      uVar19 = 0;
      lVar24 = 0;
    }
    else {
      func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
      uVar13 = func_0x0028edc4();
      func_0x002f7efc(lVar24);
      if ((uVar13 & 0xff000fff) == 0x400008d) {
        func_0x0028f0e4();
        lVar24 = func_0x002f8ac4(0);
        if (lVar24 == 0) goto LAB_002fd15c;
        func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
        uVar13 = func_0x0028edc4();
        func_0x002f7efc(lVar24);
        if ((uVar13 & 0xff000fff) == 0x400008d) {
          func_0x0028f0e4();
          lVar24 = func_0x002f8ac4(0);
          if (lVar24 == 0) goto LAB_002fd15c;
          func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
          uVar13 = func_0x0028edc4();
          func_0x002f7efc(lVar24);
          if ((uVar13 & 0xff000fff) == 0x400008d) {
            func_0x0028f0e4();
            lVar24 = func_0x002f8ac4(0);
            if (lVar24 == 0) goto LAB_002fd15c;
            func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
            func_0x0028edc4();
            func_0x002f7efc(lVar24);
          }
        }
      }
      lVar24 = 0;
      uVar19 = 0;
    }
LAB_002fd4a8:
    func_0x002f7efc(lVar24);
    return uVar19;
  }
  in_stack_00000018 = unaff_x23;
  if ((dword)psVar36->fileoff != 0) goto code_r0x002fc268;
  unaff_x20 = (segment_command *)&psVar36->vmaddr;
  lVar24 = (long)(int)*(uint *)(unaff_x28 + 0x20);
  uVar13 = (uint)psVar36->vmsize;
  if (*(uint *)(unaff_x28 + 0x20) < uVar13) {
    uVar23 = (int)uVar13 - lVar24;
    if (uVar23 < 8) {
      uVar33 = 0;
      lVar25 = lVar24;
code_r0x002fc360:
      lVar24 = (int)uVar13 - lVar25;
      puVar26 = (ulong *)(*(qword *)unaff_x20 + lVar25 * 8);
      do {
        uVar33 = *puVar26 | uVar33;
        lVar24 = lVar24 + -1;
        puVar26 = puVar26 + 1;
      } while (lVar24 != 0);
    }
    else {
      uVar31 = uVar23 & 0xfffffffffffffff8;
      lVar25 = uVar31 + lVar24;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
      bVar56 = 0;
      bVar58 = 0;
      bVar59 = 0;
      bVar60 = 0;
      bVar61 = 0;
      bVar62 = 0;
      bVar63 = 0;
      bVar64 = 0;
      bVar65 = 0;
      bVar66 = 0;
      bVar67 = 0;
      bVar68 = 0;
      bVar69 = 0;
      bVar70 = 0;
      bVar71 = 0;
      bVar72 = 0;
      uVar19 = 0;
      uVar82 = 0;
      uVar91 = 0;
      uVar100 = 0;
      puVar35 = (undefined8 *)(*(qword *)unaff_x20 + lVar24 * 8 + 0x20);
      uVar33 = uVar31;
      do {
        uVar109 = puVar35[-3];
        uVar108 = puVar35[-4];
        uVar111 = puVar35[-1];
        uVar110 = puVar35[-2];
        uVar113 = puVar35[1];
        uVar112 = *puVar35;
        uVar115 = puVar35[3];
        uVar114 = puVar35[2];
        bVar40 = (byte)uVar108 | bVar40;
        bVar41 = (byte)((ulong)uVar108 >> 8) | bVar41;
        bVar42 = (byte)((ulong)uVar108 >> 0x10) | bVar42;
        bVar43 = (byte)((ulong)uVar108 >> 0x18) | bVar43;
        bVar44 = (byte)((ulong)uVar108 >> 0x20) | bVar44;
        bVar45 = (byte)((ulong)uVar108 >> 0x28) | bVar45;
        bVar46 = (byte)((ulong)uVar108 >> 0x30) | bVar46;
        bVar47 = (byte)((ulong)uVar108 >> 0x38) | bVar47;
        bVar48 = (byte)uVar109 | bVar48;
        bVar49 = (byte)((ulong)uVar109 >> 8) | bVar49;
        bVar50 = (byte)((ulong)uVar109 >> 0x10) | bVar50;
        bVar51 = (byte)((ulong)uVar109 >> 0x18) | bVar51;
        bVar52 = (byte)((ulong)uVar109 >> 0x20) | bVar52;
        bVar53 = (byte)((ulong)uVar109 >> 0x28) | bVar53;
        bVar54 = (byte)((ulong)uVar109 >> 0x30) | bVar54;
        bVar55 = (byte)((ulong)uVar109 >> 0x38) | bVar55;
        bVar56 = (byte)uVar110 | bVar56;
        bVar58 = (byte)((ulong)uVar110 >> 8) | bVar58;
        bVar59 = (byte)((ulong)uVar110 >> 0x10) | bVar59;
        bVar60 = (byte)((ulong)uVar110 >> 0x18) | bVar60;
        bVar61 = (byte)((ulong)uVar110 >> 0x20) | bVar61;
        bVar62 = (byte)((ulong)uVar110 >> 0x28) | bVar62;
        bVar63 = (byte)((ulong)uVar110 >> 0x30) | bVar63;
        bVar64 = (byte)((ulong)uVar110 >> 0x38) | bVar64;
        bVar65 = (byte)uVar111 | bVar65;
        bVar66 = (byte)((ulong)uVar111 >> 8) | bVar66;
        bVar67 = (byte)((ulong)uVar111 >> 0x10) | bVar67;
        bVar68 = (byte)((ulong)uVar111 >> 0x18) | bVar68;
        bVar69 = (byte)((ulong)uVar111 >> 0x20) | bVar69;
        bVar70 = (byte)((ulong)uVar111 >> 0x28) | bVar70;
        bVar71 = (byte)((ulong)uVar111 >> 0x30) | bVar71;
        bVar72 = (byte)((ulong)uVar111 >> 0x38) | bVar72;
        bVar73 = (byte)uVar112 | (byte)uVar19;
        bVar74 = (byte)((ulong)uVar112 >> 8) | (byte)((ulong)uVar19 >> 8);
        bVar75 = (byte)((ulong)uVar112 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
        bVar76 = (byte)((ulong)uVar112 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
        bVar77 = (byte)((ulong)uVar112 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
        bVar78 = (byte)((ulong)uVar112 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
        bVar79 = (byte)((ulong)uVar112 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
        bVar80 = (byte)((ulong)uVar112 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
        uVar19 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar73)))))));
        bVar81 = (byte)uVar113 | (byte)uVar82;
        bVar83 = (byte)((ulong)uVar113 >> 8) | (byte)((ulong)uVar82 >> 8);
        bVar84 = (byte)((ulong)uVar113 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
        bVar85 = (byte)((ulong)uVar113 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
        bVar86 = (byte)((ulong)uVar113 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
        bVar87 = (byte)((ulong)uVar113 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
        bVar88 = (byte)((ulong)uVar113 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
        bVar89 = (byte)((ulong)uVar113 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
        uVar82 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar87,CONCAT14(bVar86,CONCAT13(bVar85,
                                                  CONCAT12(bVar84,CONCAT11(bVar83,bVar81)))))));
        bVar90 = (byte)uVar114 | (byte)uVar91;
        bVar92 = (byte)((ulong)uVar114 >> 8) | (byte)((ulong)uVar91 >> 8);
        bVar93 = (byte)((ulong)uVar114 >> 0x10) | (byte)((ulong)uVar91 >> 0x10);
        bVar94 = (byte)((ulong)uVar114 >> 0x18) | (byte)((ulong)uVar91 >> 0x18);
        bVar95 = (byte)((ulong)uVar114 >> 0x20) | (byte)((ulong)uVar91 >> 0x20);
        bVar96 = (byte)((ulong)uVar114 >> 0x28) | (byte)((ulong)uVar91 >> 0x28);
        bVar97 = (byte)((ulong)uVar114 >> 0x30) | (byte)((ulong)uVar91 >> 0x30);
        bVar98 = (byte)((ulong)uVar114 >> 0x38) | (byte)((ulong)uVar91 >> 0x38);
        uVar91 = CONCAT17(bVar98,CONCAT16(bVar97,CONCAT15(bVar96,CONCAT14(bVar95,CONCAT13(bVar94,
                                                  CONCAT12(bVar93,CONCAT11(bVar92,bVar90)))))));
        bVar99 = (byte)uVar115 | (byte)uVar100;
        bVar101 = (byte)((ulong)uVar115 >> 8) | (byte)((ulong)uVar100 >> 8);
        bVar102 = (byte)((ulong)uVar115 >> 0x10) | (byte)((ulong)uVar100 >> 0x10);
        bVar103 = (byte)((ulong)uVar115 >> 0x18) | (byte)((ulong)uVar100 >> 0x18);
        bVar104 = (byte)((ulong)uVar115 >> 0x20) | (byte)((ulong)uVar100 >> 0x20);
        bVar105 = (byte)((ulong)uVar115 >> 0x28) | (byte)((ulong)uVar100 >> 0x28);
        bVar106 = (byte)((ulong)uVar115 >> 0x30) | (byte)((ulong)uVar100 >> 0x30);
        bVar107 = (byte)((ulong)uVar115 >> 0x38) | (byte)((ulong)uVar100 >> 0x38);
        uVar100 = CONCAT17(bVar107,CONCAT16(bVar106,CONCAT15(bVar105,CONCAT14(bVar104,CONCAT13(
                                                  bVar103,CONCAT12(bVar102,CONCAT11(bVar101,bVar99))
                                                  )))));
        uVar33 = uVar33 - 8;
        puVar35 = puVar35 + 8;
      } while (uVar33 != 0);
      bVar90 = bVar90 | bVar73 | bVar56 | bVar40;
      bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
      bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
      bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
      bVar95 = bVar95 | bVar77 | bVar61 | bVar44;
      bVar96 = bVar96 | bVar78 | bVar62 | bVar45;
      bVar97 = bVar97 | bVar79 | bVar63 | bVar46;
      bVar98 = bVar98 | bVar80 | bVar64 | bVar47;
      bVar99 = bVar99 | bVar81 | bVar65 | bVar48;
      bVar101 = bVar101 | bVar83 | bVar66 | bVar49;
      bVar102 = bVar102 | bVar84 | bVar67 | bVar50;
      bVar103 = bVar103 | bVar85 | bVar68 | bVar51;
      bVar104 = bVar104 | bVar86 | bVar69 | bVar52;
      bVar105 = bVar105 | bVar87 | bVar70 | bVar53;
      bVar106 = bVar106 | bVar88 | bVar71 | bVar54;
      bVar107 = bVar107 | bVar89 | bVar72 | bVar55;
      auVar57[1] = bVar92;
      auVar57[0] = bVar90;
      auVar57[2] = bVar93;
      auVar57[3] = bVar94;
      auVar57[4] = bVar95;
      auVar57[5] = bVar96;
      auVar57[6] = bVar97;
      auVar57[7] = bVar98;
      auVar57[8] = bVar99;
      auVar57[9] = bVar101;
      auVar57[10] = bVar102;
      auVar57[0xb] = bVar103;
      auVar57[0xc] = bVar104;
      auVar57[0xd] = bVar105;
      auVar57[0xe] = bVar106;
      auVar57[0xf] = bVar107;
      auVar9[1] = bVar92;
      auVar9[0] = bVar90;
      auVar9[2] = bVar93;
      auVar9[3] = bVar94;
      auVar9[4] = bVar95;
      auVar9[5] = bVar96;
      auVar9[6] = bVar97;
      auVar9[7] = bVar98;
      auVar9[8] = bVar99;
      auVar9[9] = bVar101;
      auVar9[10] = bVar102;
      auVar9[0xb] = bVar103;
      auVar9[0xc] = bVar104;
      auVar9[0xd] = bVar105;
      auVar9[0xe] = bVar106;
      auVar9[0xf] = bVar107;
      auVar57 = NEON_ext(auVar57,auVar9,8,1);
      uVar33 = CONCAT17(bVar98 | auVar57[7],
                        CONCAT16(bVar97 | auVar57[6],
                                 CONCAT15(bVar96 | auVar57[5],
                                          CONCAT14(bVar95 | auVar57[4],
                                                   CONCAT13(bVar94 | auVar57[3],
                                                            CONCAT12(bVar93 | auVar57[2],
                                                                     CONCAT11(bVar92 | auVar57[1],
                                                                              bVar90 | auVar57[0])))
                                                  ))));
      if (uVar23 != uVar31) goto code_r0x002fc360;
    }
    if (uVar33 != 0) goto code_r0x002fc268;
  }
  uVar19 = func_0x002a3384();
  if ((int)uVar19 == 0) goto LAB_002fc288;
  uVar19 = func_0x002a3110();
  if ((int)uVar19 == 0) goto LAB_002fc288;
  psVar36 = unaff_x20;
  if (*(int *)(unaff_x28 + 0x28) != 0) goto code_r0x002fc268;
  lVar24 = *(long *)(unaff_x21 + 0x130);
  lVar25 = (long)(int)*(uint *)(lVar24 + 0x20);
  uVar13 = *(uint *)(unaff_x28 + 0x20);
  if (*(uint *)(lVar24 + 0x20) < uVar13) {
    lVar28 = *(long *)(unaff_x28 + 0x18);
    uVar23 = (int)uVar13 - lVar25;
    if (uVar23 < 8) {
      uVar33 = 0;
      lVar27 = lVar25;
code_r0x002fc454:
      lVar25 = (int)uVar13 - lVar27;
      puVar26 = (ulong *)(lVar28 + lVar27 * 8);
      do {
        uVar33 = *puVar26 | uVar33;
        lVar25 = lVar25 + -1;
        puVar26 = puVar26 + 1;
      } while (lVar25 != 0);
    }
    else {
      uVar31 = uVar23 & 0xfffffffffffffff8;
      lVar27 = uVar31 + lVar25;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
      bVar56 = 0;
      bVar58 = 0;
      bVar59 = 0;
      bVar60 = 0;
      bVar61 = 0;
      bVar62 = 0;
      bVar63 = 0;
      bVar64 = 0;
      bVar65 = 0;
      bVar66 = 0;
      bVar67 = 0;
      bVar68 = 0;
      bVar69 = 0;
      bVar70 = 0;
      bVar71 = 0;
      bVar72 = 0;
      uVar19 = 0;
      uVar82 = 0;
      uVar91 = 0;
      uVar100 = 0;
      puVar35 = (undefined8 *)(lVar28 + lVar25 * 8 + 0x20);
      uVar33 = uVar31;
      do {
        uVar109 = puVar35[-3];
        uVar108 = puVar35[-4];
        uVar111 = puVar35[-1];
        uVar110 = puVar35[-2];
        uVar113 = puVar35[1];
        uVar112 = *puVar35;
        uVar115 = puVar35[3];
        uVar114 = puVar35[2];
        bVar40 = (byte)uVar108 | bVar40;
        bVar41 = (byte)((ulong)uVar108 >> 8) | bVar41;
        bVar42 = (byte)((ulong)uVar108 >> 0x10) | bVar42;
        bVar43 = (byte)((ulong)uVar108 >> 0x18) | bVar43;
        bVar44 = (byte)((ulong)uVar108 >> 0x20) | bVar44;
        bVar45 = (byte)((ulong)uVar108 >> 0x28) | bVar45;
        bVar46 = (byte)((ulong)uVar108 >> 0x30) | bVar46;
        bVar47 = (byte)((ulong)uVar108 >> 0x38) | bVar47;
        bVar48 = (byte)uVar109 | bVar48;
        bVar49 = (byte)((ulong)uVar109 >> 8) | bVar49;
        bVar50 = (byte)((ulong)uVar109 >> 0x10) | bVar50;
        bVar51 = (byte)((ulong)uVar109 >> 0x18) | bVar51;
        bVar52 = (byte)((ulong)uVar109 >> 0x20) | bVar52;
        bVar53 = (byte)((ulong)uVar109 >> 0x28) | bVar53;
        bVar54 = (byte)((ulong)uVar109 >> 0x30) | bVar54;
        bVar55 = (byte)((ulong)uVar109 >> 0x38) | bVar55;
        bVar56 = (byte)uVar110 | bVar56;
        bVar58 = (byte)((ulong)uVar110 >> 8) | bVar58;
        bVar59 = (byte)((ulong)uVar110 >> 0x10) | bVar59;
        bVar60 = (byte)((ulong)uVar110 >> 0x18) | bVar60;
        bVar61 = (byte)((ulong)uVar110 >> 0x20) | bVar61;
        bVar62 = (byte)((ulong)uVar110 >> 0x28) | bVar62;
        bVar63 = (byte)((ulong)uVar110 >> 0x30) | bVar63;
        bVar64 = (byte)((ulong)uVar110 >> 0x38) | bVar64;
        bVar65 = (byte)uVar111 | bVar65;
        bVar66 = (byte)((ulong)uVar111 >> 8) | bVar66;
        bVar67 = (byte)((ulong)uVar111 >> 0x10) | bVar67;
        bVar68 = (byte)((ulong)uVar111 >> 0x18) | bVar68;
        bVar69 = (byte)((ulong)uVar111 >> 0x20) | bVar69;
        bVar70 = (byte)((ulong)uVar111 >> 0x28) | bVar70;
        bVar71 = (byte)((ulong)uVar111 >> 0x30) | bVar71;
        bVar72 = (byte)((ulong)uVar111 >> 0x38) | bVar72;
        bVar73 = (byte)uVar112 | (byte)uVar19;
        bVar74 = (byte)((ulong)uVar112 >> 8) | (byte)((ulong)uVar19 >> 8);
        bVar75 = (byte)((ulong)uVar112 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
        bVar76 = (byte)((ulong)uVar112 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
        bVar77 = (byte)((ulong)uVar112 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
        bVar78 = (byte)((ulong)uVar112 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
        bVar79 = (byte)((ulong)uVar112 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
        bVar80 = (byte)((ulong)uVar112 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
        uVar19 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar73)))))));
        bVar81 = (byte)uVar113 | (byte)uVar82;
        bVar83 = (byte)((ulong)uVar113 >> 8) | (byte)((ulong)uVar82 >> 8);
        bVar84 = (byte)((ulong)uVar113 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
        bVar85 = (byte)((ulong)uVar113 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
        bVar86 = (byte)((ulong)uVar113 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
        bVar87 = (byte)((ulong)uVar113 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
        bVar88 = (byte)((ulong)uVar113 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
        bVar89 = (byte)((ulong)uVar113 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
        uVar82 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar87,CONCAT14(bVar86,CONCAT13(bVar85,
                                                  CONCAT12(bVar84,CONCAT11(bVar83,bVar81)))))));
        bVar90 = (byte)uVar114 | (byte)uVar91;
        bVar92 = (byte)((ulong)uVar114 >> 8) | (byte)((ulong)uVar91 >> 8);
        bVar93 = (byte)((ulong)uVar114 >> 0x10) | (byte)((ulong)uVar91 >> 0x10);
        bVar94 = (byte)((ulong)uVar114 >> 0x18) | (byte)((ulong)uVar91 >> 0x18);
        bVar95 = (byte)((ulong)uVar114 >> 0x20) | (byte)((ulong)uVar91 >> 0x20);
        bVar96 = (byte)((ulong)uVar114 >> 0x28) | (byte)((ulong)uVar91 >> 0x28);
        bVar97 = (byte)((ulong)uVar114 >> 0x30) | (byte)((ulong)uVar91 >> 0x30);
        bVar98 = (byte)((ulong)uVar114 >> 0x38) | (byte)((ulong)uVar91 >> 0x38);
        uVar91 = CONCAT17(bVar98,CONCAT16(bVar97,CONCAT15(bVar96,CONCAT14(bVar95,CONCAT13(bVar94,
                                                  CONCAT12(bVar93,CONCAT11(bVar92,bVar90)))))));
        bVar99 = (byte)uVar115 | (byte)uVar100;
        bVar101 = (byte)((ulong)uVar115 >> 8) | (byte)((ulong)uVar100 >> 8);
        bVar102 = (byte)((ulong)uVar115 >> 0x10) | (byte)((ulong)uVar100 >> 0x10);
        bVar103 = (byte)((ulong)uVar115 >> 0x18) | (byte)((ulong)uVar100 >> 0x18);
        bVar104 = (byte)((ulong)uVar115 >> 0x20) | (byte)((ulong)uVar100 >> 0x20);
        bVar105 = (byte)((ulong)uVar115 >> 0x28) | (byte)((ulong)uVar100 >> 0x28);
        bVar106 = (byte)((ulong)uVar115 >> 0x30) | (byte)((ulong)uVar100 >> 0x30);
        bVar107 = (byte)((ulong)uVar115 >> 0x38) | (byte)((ulong)uVar100 >> 0x38);
        uVar100 = CONCAT17(bVar107,CONCAT16(bVar106,CONCAT15(bVar105,CONCAT14(bVar104,CONCAT13(
                                                  bVar103,CONCAT12(bVar102,CONCAT11(bVar101,bVar99))
                                                  )))));
        uVar33 = uVar33 - 8;
        puVar35 = puVar35 + 8;
      } while (uVar33 != 0);
      bVar90 = bVar90 | bVar73 | bVar56 | bVar40;
      bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
      bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
      bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
      bVar95 = bVar95 | bVar77 | bVar61 | bVar44;
      bVar96 = bVar96 | bVar78 | bVar62 | bVar45;
      bVar97 = bVar97 | bVar79 | bVar63 | bVar46;
      bVar98 = bVar98 | bVar80 | bVar64 | bVar47;
      bVar99 = bVar99 | bVar81 | bVar65 | bVar48;
      bVar101 = bVar101 | bVar83 | bVar66 | bVar49;
      bVar102 = bVar102 | bVar84 | bVar67 | bVar50;
      bVar103 = bVar103 | bVar85 | bVar68 | bVar51;
      bVar104 = bVar104 | bVar86 | bVar69 | bVar52;
      bVar105 = bVar105 | bVar87 | bVar70 | bVar53;
      bVar106 = bVar106 | bVar88 | bVar71 | bVar54;
      bVar107 = bVar107 | bVar89 | bVar72 | bVar55;
      auVar7[1] = bVar92;
      auVar7[0] = bVar90;
      auVar7[2] = bVar93;
      auVar7[3] = bVar94;
      auVar7[4] = bVar95;
      auVar7[5] = bVar96;
      auVar7[6] = bVar97;
      auVar7[7] = bVar98;
      auVar7[8] = bVar99;
      auVar7[9] = bVar101;
      auVar7[10] = bVar102;
      auVar7[0xb] = bVar103;
      auVar7[0xc] = bVar104;
      auVar7[0xd] = bVar105;
      auVar7[0xe] = bVar106;
      auVar7[0xf] = bVar107;
      auVar8[1] = bVar92;
      auVar8[0] = bVar90;
      auVar8[2] = bVar93;
      auVar8[3] = bVar94;
      auVar8[4] = bVar95;
      auVar8[5] = bVar96;
      auVar8[6] = bVar97;
      auVar8[7] = bVar98;
      auVar8[8] = bVar99;
      auVar8[9] = bVar101;
      auVar8[10] = bVar102;
      auVar8[0xb] = bVar103;
      auVar8[0xc] = bVar104;
      auVar8[0xd] = bVar105;
      auVar8[0xe] = bVar106;
      auVar8[0xf] = bVar107;
      auVar57 = NEON_ext(auVar7,auVar8,8,1);
      uVar33 = CONCAT17(bVar98 | auVar57[7],
                        CONCAT16(bVar97 | auVar57[6],
                                 CONCAT15(bVar96 | auVar57[5],
                                          CONCAT14(bVar95 | auVar57[4],
                                                   CONCAT13(bVar94 | auVar57[3],
                                                            CONCAT12(bVar93 | auVar57[2],
                                                                     CONCAT11(bVar92 | auVar57[1],
                                                                              bVar90 | auVar57[0])))
                                                  ))));
      if (uVar23 != uVar31) goto code_r0x002fc454;
    }
    if (uVar33 != 0) goto code_r0x002fc268;
  }
  in_stack_00000010 = (long *)(unaff_x28 + 0x18);
  uVar19 = func_0x002a3384(plVar17);
  if ((int)uVar19 == 0) goto LAB_002fc288;
  uVar19 = func_0x002a3110(plVar17,plVar17,lVar24,lVar24);
  if ((int)uVar19 == 0) goto LAB_002fc288;
  in_stack_00000000 = *(undefined8 *)(unaff_x21 + 0x148);
  in_stack_00000008 = *(undefined8 *)(unaff_x21 + 0x130);
  uVar13 = func_0x002a42a0(psVar18);
  uVar16 = func_0x002a42a0(unaff_x23,plVar17,in_stack_00000000,unaff_x20);
  if ((uVar16 & uVar13) == 0) goto code_r0x002fc284;
  if (*(int *)(unaff_x28 + 0x28) == 0) {
    uVar13 = *(uint *)(*(long *)(unaff_x21 + 0x130) + 0x20);
    lVar24 = (long)(int)uVar13;
    lVar25 = (long)(int)*(uint *)(unaff_x28 + 0x20);
    if (*(uint *)(unaff_x28 + 0x20) <= uVar13) goto code_r0x002fc5cc;
    lVar28 = *in_stack_00000010;
    uVar23 = lVar25 - lVar24;
    lVar27 = lVar24;
    if (7 < uVar23) goto code_r0x002fc54c;
    uVar33 = 0;
    goto code_r0x002fc5b0;
  }
code_r0x002fc268:
  do {
    func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x2a9);
    unaff_x20 = psVar36;
code_r0x002fc284:
    uVar19 = 0;
LAB_002fc288:
    while( true ) {
      if ((char)unaff_x19->fileoff != '\0') {
        return uVar19;
      }
      if (*(long *)(unaff_x19->segname + 8) != 0) {
        lVar24 = *(long *)(unaff_x19->segname + 8) + -1;
        *(long *)(unaff_x19->segname + 8) = lVar24;
        unaff_x19->vmsize = *(qword *)(*(long *)unaff_x19->segname + lVar24 * 8);
        return uVar19;
      }
      func_0x0079db4c(uVar19);
      lVar25 = extraout_x8;
      lVar28 = extraout_x9;
      uVar23 = extraout_x11;
      lVar27 = extraout_x14;
code_r0x002fc54c:
      uVar31 = uVar23 & 0xfffffffffffffff8;
      lVar24 = uVar31 + lVar27;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
      bVar56 = 0;
      bVar58 = 0;
      bVar59 = 0;
      bVar60 = 0;
      bVar61 = 0;
      bVar62 = 0;
      bVar63 = 0;
      bVar64 = 0;
      bVar65 = 0;
      bVar66 = 0;
      bVar67 = 0;
      bVar68 = 0;
      bVar69 = 0;
      bVar70 = 0;
      bVar71 = 0;
      bVar72 = 0;
      uVar19 = 0;
      uVar82 = 0;
      uVar91 = 0;
      uVar100 = 0;
      puVar35 = (undefined8 *)(lVar28 + lVar27 * 8 + 0x20);
      uVar33 = uVar31;
      do {
        uVar109 = puVar35[-3];
        uVar108 = puVar35[-4];
        uVar111 = puVar35[-1];
        uVar110 = puVar35[-2];
        uVar113 = puVar35[1];
        uVar112 = *puVar35;
        uVar115 = puVar35[3];
        uVar114 = puVar35[2];
        bVar40 = (byte)uVar108 | bVar40;
        bVar41 = (byte)((ulong)uVar108 >> 8) | bVar41;
        bVar42 = (byte)((ulong)uVar108 >> 0x10) | bVar42;
        bVar43 = (byte)((ulong)uVar108 >> 0x18) | bVar43;
        bVar44 = (byte)((ulong)uVar108 >> 0x20) | bVar44;
        bVar45 = (byte)((ulong)uVar108 >> 0x28) | bVar45;
        bVar46 = (byte)((ulong)uVar108 >> 0x30) | bVar46;
        bVar47 = (byte)((ulong)uVar108 >> 0x38) | bVar47;
        bVar48 = (byte)uVar109 | bVar48;
        bVar49 = (byte)((ulong)uVar109 >> 8) | bVar49;
        bVar50 = (byte)((ulong)uVar109 >> 0x10) | bVar50;
        bVar51 = (byte)((ulong)uVar109 >> 0x18) | bVar51;
        bVar52 = (byte)((ulong)uVar109 >> 0x20) | bVar52;
        bVar53 = (byte)((ulong)uVar109 >> 0x28) | bVar53;
        bVar54 = (byte)((ulong)uVar109 >> 0x30) | bVar54;
        bVar55 = (byte)((ulong)uVar109 >> 0x38) | bVar55;
        bVar56 = (byte)uVar110 | bVar56;
        bVar58 = (byte)((ulong)uVar110 >> 8) | bVar58;
        bVar59 = (byte)((ulong)uVar110 >> 0x10) | bVar59;
        bVar60 = (byte)((ulong)uVar110 >> 0x18) | bVar60;
        bVar61 = (byte)((ulong)uVar110 >> 0x20) | bVar61;
        bVar62 = (byte)((ulong)uVar110 >> 0x28) | bVar62;
        bVar63 = (byte)((ulong)uVar110 >> 0x30) | bVar63;
        bVar64 = (byte)((ulong)uVar110 >> 0x38) | bVar64;
        bVar65 = (byte)uVar111 | bVar65;
        bVar66 = (byte)((ulong)uVar111 >> 8) | bVar66;
        bVar67 = (byte)((ulong)uVar111 >> 0x10) | bVar67;
        bVar68 = (byte)((ulong)uVar111 >> 0x18) | bVar68;
        bVar69 = (byte)((ulong)uVar111 >> 0x20) | bVar69;
        bVar70 = (byte)((ulong)uVar111 >> 0x28) | bVar70;
        bVar71 = (byte)((ulong)uVar111 >> 0x30) | bVar71;
        bVar72 = (byte)((ulong)uVar111 >> 0x38) | bVar72;
        bVar73 = (byte)uVar112 | (byte)uVar19;
        bVar74 = (byte)((ulong)uVar112 >> 8) | (byte)((ulong)uVar19 >> 8);
        bVar75 = (byte)((ulong)uVar112 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
        bVar76 = (byte)((ulong)uVar112 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
        bVar77 = (byte)((ulong)uVar112 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
        bVar78 = (byte)((ulong)uVar112 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
        bVar79 = (byte)((ulong)uVar112 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
        bVar80 = (byte)((ulong)uVar112 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
        uVar19 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar73)))))));
        bVar81 = (byte)uVar113 | (byte)uVar82;
        bVar83 = (byte)((ulong)uVar113 >> 8) | (byte)((ulong)uVar82 >> 8);
        bVar84 = (byte)((ulong)uVar113 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
        bVar85 = (byte)((ulong)uVar113 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
        bVar86 = (byte)((ulong)uVar113 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
        bVar87 = (byte)((ulong)uVar113 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
        bVar88 = (byte)((ulong)uVar113 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
        bVar89 = (byte)((ulong)uVar113 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
        uVar82 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar87,CONCAT14(bVar86,CONCAT13(bVar85,
                                                  CONCAT12(bVar84,CONCAT11(bVar83,bVar81)))))));
        bVar90 = (byte)uVar114 | (byte)uVar91;
        bVar92 = (byte)((ulong)uVar114 >> 8) | (byte)((ulong)uVar91 >> 8);
        bVar93 = (byte)((ulong)uVar114 >> 0x10) | (byte)((ulong)uVar91 >> 0x10);
        bVar94 = (byte)((ulong)uVar114 >> 0x18) | (byte)((ulong)uVar91 >> 0x18);
        bVar95 = (byte)((ulong)uVar114 >> 0x20) | (byte)((ulong)uVar91 >> 0x20);
        bVar96 = (byte)((ulong)uVar114 >> 0x28) | (byte)((ulong)uVar91 >> 0x28);
        bVar97 = (byte)((ulong)uVar114 >> 0x30) | (byte)((ulong)uVar91 >> 0x30);
        bVar98 = (byte)((ulong)uVar114 >> 0x38) | (byte)((ulong)uVar91 >> 0x38);
        uVar91 = CONCAT17(bVar98,CONCAT16(bVar97,CONCAT15(bVar96,CONCAT14(bVar95,CONCAT13(bVar94,
                                                  CONCAT12(bVar93,CONCAT11(bVar92,bVar90)))))));
        bVar99 = (byte)uVar115 | (byte)uVar100;
        bVar101 = (byte)((ulong)uVar115 >> 8) | (byte)((ulong)uVar100 >> 8);
        bVar102 = (byte)((ulong)uVar115 >> 0x10) | (byte)((ulong)uVar100 >> 0x10);
        bVar103 = (byte)((ulong)uVar115 >> 0x18) | (byte)((ulong)uVar100 >> 0x18);
        bVar104 = (byte)((ulong)uVar115 >> 0x20) | (byte)((ulong)uVar100 >> 0x20);
        bVar105 = (byte)((ulong)uVar115 >> 0x28) | (byte)((ulong)uVar100 >> 0x28);
        bVar106 = (byte)((ulong)uVar115 >> 0x30) | (byte)((ulong)uVar100 >> 0x30);
        bVar107 = (byte)((ulong)uVar115 >> 0x38) | (byte)((ulong)uVar100 >> 0x38);
        uVar100 = CONCAT17(bVar107,CONCAT16(bVar106,CONCAT15(bVar105,CONCAT14(bVar104,CONCAT13(
                                                  bVar103,CONCAT12(bVar102,CONCAT11(bVar101,bVar99))
                                                  )))));
        uVar33 = uVar33 - 8;
        puVar35 = puVar35 + 8;
      } while (uVar33 != 0);
      bVar90 = bVar90 | bVar73 | bVar56 | bVar40;
      bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
      bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
      bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
      bVar95 = bVar95 | bVar77 | bVar61 | bVar44;
      bVar96 = bVar96 | bVar78 | bVar62 | bVar45;
      bVar97 = bVar97 | bVar79 | bVar63 | bVar46;
      bVar98 = bVar98 | bVar80 | bVar64 | bVar47;
      bVar99 = bVar99 | bVar81 | bVar65 | bVar48;
      bVar101 = bVar101 | bVar83 | bVar66 | bVar49;
      bVar102 = bVar102 | bVar84 | bVar67 | bVar50;
      bVar103 = bVar103 | bVar85 | bVar68 | bVar51;
      bVar104 = bVar104 | bVar86 | bVar69 | bVar52;
      bVar105 = bVar105 | bVar87 | bVar70 | bVar53;
      bVar106 = bVar106 | bVar88 | bVar71 | bVar54;
      bVar107 = bVar107 | bVar89 | bVar72 | bVar55;
      auVar5[1] = bVar92;
      auVar5[0] = bVar90;
      auVar5[2] = bVar93;
      auVar5[3] = bVar94;
      auVar5[4] = bVar95;
      auVar5[5] = bVar96;
      auVar5[6] = bVar97;
      auVar5[7] = bVar98;
      auVar5[8] = bVar99;
      auVar5[9] = bVar101;
      auVar5[10] = bVar102;
      auVar5[0xb] = bVar103;
      auVar5[0xc] = bVar104;
      auVar5[0xd] = bVar105;
      auVar5[0xe] = bVar106;
      auVar5[0xf] = bVar107;
      auVar6[1] = bVar92;
      auVar6[0] = bVar90;
      auVar6[2] = bVar93;
      auVar6[3] = bVar94;
      auVar6[4] = bVar95;
      auVar6[5] = bVar96;
      auVar6[6] = bVar97;
      auVar6[7] = bVar98;
      auVar6[8] = bVar99;
      auVar6[9] = bVar101;
      auVar6[10] = bVar102;
      auVar6[0xb] = bVar103;
      auVar6[0xc] = bVar104;
      auVar6[0xd] = bVar105;
      auVar6[0xe] = bVar106;
      auVar6[0xf] = bVar107;
      auVar57 = NEON_ext(auVar5,auVar6,8,1);
      uVar33 = CONCAT17(bVar98 | auVar57[7],
                        CONCAT16(bVar97 | auVar57[6],
                                 CONCAT15(bVar96 | auVar57[5],
                                          CONCAT14(bVar95 | auVar57[4],
                                                   CONCAT13(bVar94 | auVar57[3],
                                                            CONCAT12(bVar93 | auVar57[2],
                                                                     CONCAT11(bVar92 | auVar57[1],
                                                                              bVar90 | auVar57[0])))
                                                  ))));
      if (uVar23 != uVar31) {
code_r0x002fc5b0:
        lVar25 = lVar25 - lVar24;
        puVar26 = (ulong *)(lVar28 + lVar24 * 8);
        do {
          uVar33 = *puVar26 | uVar33;
          lVar25 = lVar25 + -1;
          puVar26 = puVar26 + 1;
        } while (lVar25 != 0);
      }
      psVar36 = unaff_x20;
      if (uVar33 != 0) break;
code_r0x002fc5cc:
      uVar19 = func_0x002a3384();
      if (((((int)uVar19 != 0) && (uVar19 = func_0x002a3110(), (int)uVar19 != 0)) &&
          (uVar19 = func_0x002a0344(in_stack_00000018,in_stack_00000018), (int)uVar19 != 0)) &&
         (((uVar19 = func_0x002a3110(in_stack_00000018,in_stack_00000018,
                                     *(undefined8 *)(unaff_x21 + 0x158),
                                     *(undefined8 *)(unaff_x21 + 0x130)), (int)uVar19 != 0 &&
           (psVar22 = unaff_x19,
           uVar19 = func_0x002a80fc(in_stack_00000018,in_stack_00000018,in_stack_00000010),
           (int)uVar19 != 0)) &&
          (psVar21 = psVar18, uVar19 = func_0x0029aefc(in_stack_00000018,in_stack_00000018),
          (int)uVar19 != 0)))) {
        iVar11 = func_0x0029db84(in_stack_00000018,psVar37);
        psVar36 = unaff_x20;
        if (-1 < iVar11) goto code_r0x002fc6a4;
        uVar12 = func_0x0029bfd4(psVar37);
        func_0x0029cb94(in_stack_00000018,uVar12);
        uVar19 = func_0x0029c3cc(in_stack_00000018,(long)*(int *)(unaff_x25 + 0x20));
        unaff_x20 = in_stack_00000018;
      }
    }
  } while( true );
}

