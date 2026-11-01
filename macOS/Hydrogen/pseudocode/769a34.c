
/* WARNING: Removing unreachable block (ram,0x0076a4e4) */
/* WARNING: Removing unreachable block (ram,0x0076a4f0) */
/* WARNING: Removing unreachable block (ram,0x0076a4f4) */
/* WARNING: Removing unreachable block (ram,0x0076a768) */
/* WARNING: Removing unreachable block (ram,0x0076a4f8) */
/* WARNING: Removing unreachable block (ram,0x0076a770) */
/* WARNING: Removing unreachable block (ram,0x0076a500) */
/* WARNING: Removing unreachable block (ram,0x0076a77c) */
/* WARNING: Removing unreachable block (ram,0x0076a790) */
/* WARNING: Removing unreachable block (ram,0x0076a788) */
/* WARNING: Removing unreachable block (ram,0x0076a79c) */
/* WARNING: Removing unreachable block (ram,0x0076a510) */
/* WARNING: Removing unreachable block (ram,0x0076a760) */

undefined8 FUN_00769a34(code *param_1,undefined8 param_2)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  ulong uVar4;
  uint uVar5;
  undefined4 uVar6;
  long lVar7;
  code *pcVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar10;
  long unaff_x27;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  uint *in_stack_00000028;
  ulong *in_stack_00000040;
  undefined8 in_stack_00000048;
  int iStack0000000000000050;
  
  iVar3 = (*param_1)(param_2,in_stack_00000010,in_stack_00000008);
  lVar7 = *(long *)(unaff_x19 + 0xd0);
  if (lVar7 != 0) {
    *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xfb;
  }
  if (iVar3 != 0) {
    func_0x0073c9e4();
    iStack0000000000000050 = 0x2a;
    goto code_r0x00769a70;
  }
  if ((*in_stack_00000040 & 3) == 1) {
    func_0x00734f74(*(undefined8 *)(unaff_x19 + 0x18),0);
    if (*(int *)(unaff_x19 + 0x60) != 0xf) {
      uVar6 = 0xf;
code_r0x0076a41c:
      iStack0000000000000050 = 0;
      *(undefined4 *)(unaff_x19 + 0x60) = uVar6;
      uVar10 = 0xffffffff;
      goto code_r0x0076a428;
    }
  }
  else {
    *(undefined1 *)(unaff_x29 + -0x58) = 0;
    pcVar8 = *(code **)(*(long *)(*(long *)(unaff_x19 + 0x18) + 0x3a0) + 0x10);
    if (pcVar8 != (code *)0x0) {
      iStack0000000000000050 = (*pcVar8)();
      if (iStack0000000000000050 == 0x37) {
        if ((*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x398) >> 6 & 1) != 0) {
          iStack0000000000000050 = func_0x00783aec();
          if (iStack0000000000000050 == 0) {
            iStack0000000000000050 = 0x37;
          }
          func_0x007686a4();
          in_stack_00000048._3_1_ = '\x01';
          uVar10 = 0;
          (*(code *)*unaff_x28)(0);
          goto code_r0x0076a428;
        }
code_r0x00769a70:
        func_0x007686a4();
      }
      else {
        if (iStack0000000000000050 == 0) {
          if (*(char *)(unaff_x29 + -0x58) != '\0') {
            if ((*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x399) >> 4 & 1) == 0) {
              if (*(int *)(unaff_x19 + 0x60) != 0xc) {
                *(undefined4 *)(unaff_x19 + 0x60) = 0xc;
                *in_stack_00000028 = *in_stack_00000028 & 0xffffefff;
                func_0x007706e4();
              }
            }
            else if (*(int *)(unaff_x19 + 0x60) != 0xb) {
              uVar6 = 0xb;
              goto code_r0x0076a41c;
            }
            goto code_r0x0076a1f8;
          }
          goto code_r0x0076a14c;
        }
        if (*(long *)(unaff_x19 + 0x18) != 0) goto code_r0x00769a70;
      }
      uVar10 = 0;
      in_stack_00000048._3_1_ = '\x01';
      goto code_r0x0076a428;
    }
code_r0x0076a14c:
    if ((((&UNK_00001345)[unaff_x19] & 1) == 0) ||
       ((*(byte *)(*(long *)(&UNK_00001348 + unaff_x19) + 0x40) | 2) != 7)) {
      if (*(int *)(unaff_x19 + 0x60) != 10) {
        uVar6 = 10;
        goto code_r0x0076a41c;
      }
    }
    else {
      func_0x007686a4();
      func_0x00768340();
    }
  }
code_r0x0076a1f8:
  uVar10 = 0xffffffff;
  iStack0000000000000050 = 0;
code_r0x0076a428:
  uVar5 = *(uint *)(unaff_x19 + 0x60);
  uVar9 = (ulong)uVar5;
  if (uVar5 < 3) goto code_r0x0076a560;
  if ((uVar5 < 9) && ((int)uVar10 != -1)) {
    if ((*(byte *)(unaff_x20 + 0x271) >> 1 & 1) != 0) goto code_r0x0076a560;
    func_0x0076a868();
    uVar9 = (ulong)*(uint *)(unaff_x19 + 0x60);
  }
  do {
    uVar5 = (uint)uVar9;
    if (uVar5 < 0x10) {
code_r0x0076a560:
      if (iStack0000000000000050 != 0) {
        func_0x00768960();
        if (*(long *)(unaff_x19 + 0x18) == 0) {
          iVar3 = *(int *)(unaff_x19 + 0x60);
          if (iVar3 == 3) {
            func_0x00770b90();
            goto code_r0x0076a608;
          }
        }
        else {
          if (in_stack_00000048._3_1_ != '\0') {
            func_0x0075e5fc();
            *(undefined8 *)(unaff_x19 + 0x18) = 0;
            func_0x00732ed0();
          }
code_r0x0076a608:
          iVar3 = *(int *)(unaff_x19 + 0x60);
        }
        if (iVar3 != 0x10) {
          *(undefined4 *)(unaff_x19 + 0x60) = 0x10;
          lVar7 = *(long *)(unaff_x19 + 0xd0);
          iVar3 = *(int *)(lVar7 + 8) + -1;
          *(int *)(lVar7 + 8) = iVar3;
          if (iVar3 == 0) {
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0xf8));
            *(undefined8 *)(lVar7 + 0xf8) = 0;
            *(undefined8 *)(lVar7 + 0x100) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xef;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0x108));
            *(undefined8 *)(lVar7 + 0x108) = 0;
            *(undefined8 *)(lVar7 + 0x110) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xdf;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0x118));
            *(undefined8 *)(lVar7 + 0x118) = 0;
            *(undefined8 *)(lVar7 + 0x120) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xbf;
          }
          func_0x0076c100();
        }
code_r0x0076a68c:
        uVar10 = 0xffffffff;
code_r0x0076a690:
        uVar5 = *(uint *)(unaff_x19 + 0x60);
        goto joined_r0x0076a698;
      }
      if ((*(long *)(unaff_x19 + 0x18) == 0) || (iVar3 = func_0x0077011c(), iVar3 == 0))
      goto code_r0x0076a690;
      iStack0000000000000050 = 0x2a;
      func_0x00734f74(*(undefined8 *)(unaff_x19 + 0x18),2);
      uVar1 = *(uint *)(unaff_x19 + 0x60);
      uVar5 = 0xf;
      if (0xe < uVar1) {
        uVar5 = 0x10;
      }
      if (uVar1 != uVar5) {
        *(uint *)(unaff_x19 + 0x60) = uVar5;
        if (0xe < uVar1) {
          lVar7 = *(long *)(unaff_x19 + 0xd0);
          iVar3 = *(int *)(lVar7 + 8) + -1;
          *(int *)(lVar7 + 8) = iVar3;
          if (iVar3 == 0) {
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0xf8));
            *(undefined8 *)(lVar7 + 0xf8) = 0;
            *(undefined8 *)(lVar7 + 0x100) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xef;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0x108));
            *(undefined8 *)(lVar7 + 0x108) = 0;
            *(undefined8 *)(lVar7 + 0x110) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xdf;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar7 + 0x118));
            *(undefined8 *)(lVar7 + 0x118) = 0;
            *(undefined8 *)(lVar7 + 0x120) = 0;
            *(byte *)(lVar7 + 0x271) = *(byte *)(lVar7 + 0x271) & 0xbf;
          }
        }
        if ((0x2eff7U >> (ulong)uVar5 & 1) == 0) {
          (**(code **)(&UNK_00a1f040 + (ulong)uVar5 * 8))();
        }
        goto code_r0x0076a68c;
      }
      if (uVar1 == 0x10) goto code_r0x0076a7d8;
    }
    else {
joined_r0x0076a698:
      if (uVar5 == 0x10) {
code_r0x0076a7d8:
        if (*(code **)(unaff_x19 + 0x9d8) == (code *)0x0) {
          *(undefined4 *)(unaff_x19 + 0x88) = 1;
          *(long *)(unaff_x19 + 0x90) = unaff_x19;
          *(int *)(unaff_x19 + 0x98) = iStack0000000000000050;
          func_0x0075e474(unaff_x20 + 0x10,unaff_x19 + 0x68,unaff_x19 + 0x68);
          iVar3 = *(int *)(unaff_x19 + 0x60);
        }
        else {
          (**(code **)(unaff_x19 + 0x9d8))();
          iVar3 = *(int *)(unaff_x19 + 0x60);
        }
        if (iVar3 != 0x11) {
          *(undefined4 *)(unaff_x19 + 0x60) = 0x11;
        }
        func_0x0075e5fc();
        func_0x0075e474(unaff_x20 + 0x70);
        return 0;
      }
      if (((int)uVar10 != -1) && ((*(byte *)(unaff_x20 + 0x271) >> 1 & 1) == 0)) {
        *(int *)(unaff_x19 + 100) = iStack0000000000000050;
        return uVar10;
      }
    }
    in_stack_00000048._3_1_ = '\0';
    bVar2 = *(byte *)(unaff_x20 + 0x271);
    *(byte *)(unaff_x20 + 0x271) = bVar2 & 0xfd;
    if ((bVar2 >> 1 & 1) != 0) {
      func_0x00768960();
    }
    uVar5 = *(uint *)(unaff_x19 + 0x60);
    uVar9 = (ulong)uVar5;
    if (uVar5 - 4 < 0xc) {
      if (*(long *)(unaff_x19 + 0x18) == 0) {
        return 4;
      }
    }
    else if (0xc < uVar5 - 3) {
code_r0x00769738:
      if ((uint)uVar9 < 0x12) {
                    /* WARNING: Could not recover jumptable at 0x00769754. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar10 = (*(code *)(&UNK_00769758 + (ulong)*(ushort *)(unaff_x27 + uVar9 * 2) * 4))();
        return uVar10;
      }
      return 4;
    }
    uVar4 = func_0x0076a868();
    uVar9 = (ulong)*(uint *)(unaff_x19 + 0x60);
    if ((uVar4 & 1) == 0) goto code_r0x00769738;
    uVar10 = 0;
  } while( true );
}

