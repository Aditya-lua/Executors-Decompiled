
/* WARNING: Possible PIC construction at 0x004bd3e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd2b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd150: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd188: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd450: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd538: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd358: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bd390: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bd35c) */
/* WARNING: Removing unreachable block (ram,0x004bd384) */
/* WARNING: Removing unreachable block (ram,0x004bd53c) */
/* WARNING: Removing unreachable block (ram,0x004bd454) */
/* WARNING: Removing unreachable block (ram,0x004bd18c) */
/* WARNING: Removing unreachable block (ram,0x004bd154) */
/* WARNING: Removing unreachable block (ram,0x004bd5d0) */
/* WARNING: Removing unreachable block (ram,0x004bd17c) */
/* WARNING: Removing unreachable block (ram,0x004bd2bc) */
/* WARNING: Removing unreachable block (ram,0x004bd3e4) */
/* WARNING: Removing unreachable block (ram,0x004bd394) */

void FUN_004bd034(void)

{
  code *pcVar1;
  undefined1 *puVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  undefined *puVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  long *unaff_x19;
  long lVar11;
  long unaff_x21;
  undefined *unaff_x22;
  undefined8 unaff_x23;
  undefined8 uVar12;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar13;
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000008;
  
  plVar3 = (long *)func_0x007a1f00();
  func_0x00187bd4();
  func_0x004bcb5c(&uStack0000000000000008);
  __Unwind_Resume(plVar3);
  puVar13 = (undefined *)0x4bd098;
  auVar14 = func_0x007a2668();
  puVar2 = (undefined1 *)register0x00000008;
SUB_004bd098:
  do {
    while( true ) {
      plVar6 = auVar14._8_8_;
      plVar4 = auVar14._0_8_;
      *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
      *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
      *(undefined **)(puVar2 + -0x30) = unaff_x22;
      *(long *)(puVar2 + -0x28) = unaff_x21;
      *(long **)(puVar2 + -0x20) = plVar3;
      *(long **)(puVar2 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
      *(undefined **)(puVar2 + -8) = puVar13;
      unaff_x29 = puVar2 + -0x10;
      lVar8 = *plVar6;
      unaff_x19 = plVar4;
      plVar3 = plVar6;
      if (5 < lVar8) break;
      if (lVar8 < 3) {
        if (lVar8 == 0) {
          plVar3 = (long *)plVar6[1];
          lVar8 = *plVar3;
          *plVar3 = lVar8 + 1;
          if (-1 < lVar8) {
            *plVar4 = 0;
            plVar4[1] = (long)plVar3;
            return;
          }
          goto code_r0x004bd5bc;
        }
        if (lVar8 == 1) {
          lVar8 = plVar6[3];
          if (lVar8 < 0) {
            uVar12 = 0;
          }
          else {
            lVar11 = plVar6[2];
            if (lVar8 == 0) {
              lVar5 = 1;
code_r0x004bd4e8:
              _memcpy(lVar5,lVar11,lVar8);
              plVar4[2] = lVar5;
              plVar4[3] = lVar8;
              *plVar4 = 1;
              plVar4[1] = lVar8;
              return;
            }
            uVar12 = 1;
            lVar5 = func_0x00187bd0(lVar8,1);
            if (lVar5 != 0) goto code_r0x004bd4e8;
          }
          uVar12 = func_0x007a1f00(uVar12,lVar8,&UNK_009e6b10);
          func_0x004bcb5c(puVar2 + -0xc0);
          __Unwind_Resume(uVar12);
          auVar14 = func_0x007a2668();
          lVar8 = auVar14._0_8_;
          uVar12 = *(undefined8 *)(lVar8 + 0x18);
          *(undefined1 **)(puVar2 + -0xe0) = unaff_x29;
          *(undefined8 *)(puVar2 + -0xd8) = 0x4bd708;
          switch(uVar12) {
          case 0xc:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a208a;
            puVar7 = &UNK_009e59a0;
            break;
          case 0xd:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_0089fb00;
            puVar7 = &UNK_009e59c0;
            goto code_r0x004bd8e0;
          case 0xe:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a208f;
            puVar7 = &UNK_009e59e0;
            goto code_r0x004bd96c;
          case 0xf:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a2099;
            puVar7 = &UNK_009e5a00;
            goto code_r0x004bd994;
          case 0x10:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a209f;
            puVar7 = &UNK_009e5a20;
            uVar12 = 2;
            goto code_r0x004bd9c8;
          case 0x11:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a1584;
            puVar7 = &UNK_009e5a40;
code_r0x004bd8e0:
            uVar12 = 4;
            goto code_r0x004bd9c8;
          case 0x12:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a20a1;
            puVar7 = &UNK_009e5a60;
            break;
          case 0x13:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20a6;
            puVar7 = &UNK_009e5a80;
            break;
          case 0x14:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20ab;
            puVar7 = &UNK_009e5aa0;
            goto code_r0x004bd994;
          default:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a20b1;
            puVar7 = &UNK_009e5ac0;
            goto code_r0x004bd96c;
          case 0x16:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20bb;
            puVar7 = &UNK_009e5ae0;
            goto code_r0x004bd96c;
          case 0x17:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20c5;
            puVar7 = &UNK_009e5b00;
            goto code_r0x004bd96c;
          case 0x18:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20cf;
            puVar7 = &UNK_009e5b20;
            goto code_r0x004bd908;
          case 0x19:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20dd;
            puVar7 = &UNK_009e5b40;
code_r0x004bd908:
            uVar12 = 0xe;
            goto code_r0x004bd9c8;
          case 0x1a:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a20eb;
            puVar7 = &UNK_009e5b60;
code_r0x004bd96c:
            uVar12 = 10;
            goto code_r0x004bd9c8;
          case 0x1b:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a20f5;
            puVar7 = &UNK_009e5b80;
code_r0x004bd994:
            uVar12 = 6;
            goto code_r0x004bd9c8;
          case 0x1c:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a1428;
            puVar7 = &UNK_009e5ba0;
            uVar12 = 8;
            goto code_r0x004bd9c8;
          case 0x1d:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a20fb;
            puVar7 = &UNK_009e5bc0;
            break;
          case 0x1e:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a2100;
            puVar7 = &UNK_009e5be0;
            break;
          case 0x1f:
            *(long *)(puVar2 + -0xe8) = lVar8 + 0x20;
            puVar13 = &UNK_008a2105;
            puVar7 = &UNK_009e5c00;
            goto code_r0x004bd9bc;
          case 0x20:
            *(long *)(puVar2 + -0xe8) = lVar8;
            puVar13 = &UNK_008a210c;
            puVar7 = &UNK_009e5c20;
code_r0x004bd9bc:
            uVar12 = 7;
            goto code_r0x004bd9c8;
          }
          uVar12 = 5;
code_r0x004bd9c8:
          func_0x004699b0(auVar14._8_8_,puVar13,uVar12,puVar2 + -0xe8,puVar7);
          return;
        }
        unaff_x21 = func_0x00187bd0(0x40,8);
        if (unaff_x21 == 0) goto code_r0x004bd5b0;
        auVar14._8_8_ = plVar6[4];
        auVar14._0_8_ = puVar2 + -0x80;
        puVar13 = &UNK_004bd3e4;
        puVar2 = puVar2 + -0xd0;
      }
      else {
        if (lVar8 != 3) {
          if (lVar8 != 4) {
            func_0x004cddc4(plVar4 + 1,plVar6 + 1,&UNK_009e5c88);
            lVar8 = 5;
          }
          *plVar4 = lVar8;
          return;
        }
        unaff_x21 = func_0x00187bd0(0x40,8);
        if (unaff_x21 == 0) {
code_r0x004bd5b0:
          func_0x007a1f18(8,0x40);
code_r0x004bd5bc:
          func_0x007a05dc();
          func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x4bd5e0);
          (*pcVar1)();
        }
        auVar14._8_8_ = plVar6[7];
        auVar14._0_8_ = puVar2 + -0x80;
        puVar13 = &UNK_004bd2bc;
        puVar2 = puVar2 + -0xd0;
      }
    }
    if (8 < lVar8) {
      if (lVar8 != 9) {
        if (lVar8 == 10) {
          plVar3 = (long *)plVar6[4];
          lVar8 = *plVar3;
          *plVar3 = lVar8 + 1;
          if (-1 < lVar8) {
            *(long **)(puVar2 + -0xa0) = plVar3;
            func_0x004cdcb8(puVar2 + -0x80,plVar6 + 1,&UNK_009e5ce8);
            lVar8 = *(long *)(puVar2 + -0x80);
            plVar4[2] = *(long *)(puVar2 + -0x78);
            plVar4[1] = lVar8;
            plVar4[3] = *(long *)(puVar2 + -0x70);
            plVar4[4] = (long)plVar3;
            *plVar4 = 10;
            return;
          }
          goto code_r0x004bd5bc;
        }
        uVar9 = plVar6[1] ^ 0x8000000000000000;
        if (1 < uVar9) {
          uVar9 = 2;
        }
        if (uVar9 == 0) {
          uVar9 = 0x8000000000000000;
        }
        else {
          if (uVar9 != 2) {
            unaff_x21 = func_0x00187bd0(0x40,8);
            if (unaff_x21 == 0) goto code_r0x004bd5b0;
            auVar14._8_8_ = plVar6[5];
            auVar14._0_8_ = puVar2 + -0x80;
            puVar13 = &UNK_004bd53c;
            puVar2 = puVar2 + -0xd0;
            goto SUB_004bd098;
          }
          func_0x004bdc20(puVar2 + -0x80);
          uVar9 = *(ulong *)(puVar2 + -0x80);
          *(undefined8 *)(puVar2 + -0x98) = *(undefined8 *)(puVar2 + -0x70);
          *(undefined8 *)(puVar2 + -0xa0) = *(undefined8 *)(puVar2 + -0x78);
          unaff_x21 = *(long *)(puVar2 + -0x60);
          *(undefined8 *)(puVar2 + -0x90) = *(undefined8 *)(puVar2 + -0x68);
          *(undefined8 *)(puVar2 + -0xb8) = *(undefined8 *)(puVar2 + -0x50);
          *(undefined8 *)(puVar2 + -0xc0) = *(undefined8 *)(puVar2 + -0x58);
        }
        lVar8 = *(long *)(puVar2 + -0xa0);
        plVar4[3] = *(long *)(puVar2 + -0x98);
        plVar4[2] = lVar8;
        plVar4[4] = *(long *)(puVar2 + -0x90);
        plVar4[5] = unaff_x21;
        lVar8 = *(long *)(puVar2 + -0xc0);
        plVar4[7] = *(long *)(puVar2 + -0xb8);
        plVar4[6] = lVar8;
        lVar8 = 0xb;
        goto LAB_004bd594;
      }
      unaff_x22 = &___rust_no_alloc_shim_is_unstable;
      unaff_x21 = func_0x00187bd0(0x40,8);
      if (unaff_x21 == 0) goto code_r0x004bd5b0;
      auVar14._8_8_ = plVar6[1];
      auVar14._0_8_ = puVar2 + -0x80;
      puVar13 = &UNK_004bd35c;
      puVar2 = puVar2 + -0xd0;
      goto SUB_004bd098;
    }
    if (lVar8 == 6) {
      uVar9 = plVar6[1];
      uVar10 = uVar9 ^ 0x8000000000000000;
      if (4 < uVar10) {
        uVar10 = 3;
      }
      if ((long)uVar10 < 2) {
        if (uVar10 != 0) goto LAB_004bd4cc;
        uVar9 = 0x8000000000000000;
      }
      else {
        if ((uVar10 == 2) || (uVar10 != 3)) {
LAB_004bd4cc:
          lVar11 = plVar6[3];
          lVar8 = plVar6[2];
        }
        else {
          func_0x004cdc20(puVar2 + -0x80,plVar6 + 1,&UNK_009e5988);
          uVar9 = *(ulong *)(puVar2 + -0x80);
          lVar11 = *(long *)(puVar2 + -0x70);
          lVar8 = *(long *)(puVar2 + -0x78);
        }
        *(long *)(puVar2 + -0x98) = lVar11;
        *(long *)(puVar2 + -0xa0) = lVar8;
      }
      lVar8 = *(long *)(puVar2 + -0xa0);
      plVar4[3] = *(long *)(puVar2 + -0x98);
      plVar4[2] = lVar8;
      lVar8 = 6;
LAB_004bd594:
      *plVar4 = lVar8;
      plVar4[1] = uVar9;
      return;
    }
    if (lVar8 == 7) {
      unaff_x22 = &___rust_no_alloc_shim_is_unstable;
      unaff_x21 = func_0x00187bd0(0x40,8);
      if (unaff_x21 != 0) break;
      goto code_r0x004bd5b0;
    }
    unaff_x21 = func_0x00187bd0(0x40,8);
    if (unaff_x21 == 0) goto code_r0x004bd5b0;
    auVar14._8_8_ = plVar6[1];
    auVar14._0_8_ = puVar2 + -0x80;
    puVar13 = &UNK_004bd454;
    puVar2 = puVar2 + -0xd0;
  } while( true );
  auVar14._8_8_ = plVar6[1];
  auVar14._0_8_ = puVar2 + -0x80;
  puVar13 = &UNK_004bd154;
  puVar2 = puVar2 + -0xd0;
  goto SUB_004bd098;
}

