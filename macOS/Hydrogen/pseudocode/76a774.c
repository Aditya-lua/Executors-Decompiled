
undefined8 FUN_0076a774(void)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  uint uVar6;
  ulong uVar7;
  long unaff_x19;
  long unaff_x20;
  long lVar8;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined8 in_stack_00000048;
  int iStack0000000000000050;
  undefined8 in_stack_00000058;
  
  (*(code *)*unaff_x28)(in_stack_00000058);
  iStack0000000000000050 = 0x2f;
  uVar6 = *(uint *)(unaff_x19 + 0x60);
  uVar7 = (ulong)uVar6;
  if (uVar6 < 3) goto code_r0x0076a560;
  if ((uVar6 < 9) && ((int)unaff_x26 != -1)) {
    if ((*(byte *)(unaff_x20 + 0x271) >> 1 & 1) != 0) goto code_r0x0076a560;
    func_0x0076a868();
    uVar7 = (ulong)*(uint *)(unaff_x19 + 0x60);
  }
  do {
    uVar6 = (uint)uVar7;
    if (uVar6 < 0x10) {
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
          lVar8 = *(long *)(unaff_x19 + 0xd0);
          iVar3 = *(int *)(lVar8 + 8) + -1;
          *(int *)(lVar8 + 8) = iVar3;
          if (iVar3 == 0) {
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0xf8));
            *(undefined8 *)(lVar8 + 0xf8) = 0;
            *(undefined8 *)(lVar8 + 0x100) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xef;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0x108));
            *(undefined8 *)(lVar8 + 0x108) = 0;
            *(undefined8 *)(lVar8 + 0x110) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xdf;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0x118));
            *(undefined8 *)(lVar8 + 0x118) = 0;
            *(undefined8 *)(lVar8 + 0x120) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xbf;
          }
          func_0x0076c100();
        }
code_r0x0076a68c:
        unaff_x26 = 0xffffffff;
code_r0x0076a690:
        uVar6 = *(uint *)(unaff_x19 + 0x60);
        goto joined_r0x0076a698;
      }
      if ((*(long *)(unaff_x19 + 0x18) == 0) || (iVar3 = func_0x0077011c(), iVar3 == 0))
      goto code_r0x0076a690;
      iStack0000000000000050 = 0x2a;
      func_0x00734f74(*(undefined8 *)(unaff_x19 + 0x18),2);
      uVar1 = *(uint *)(unaff_x19 + 0x60);
      uVar6 = 0xf;
      if (0xe < uVar1) {
        uVar6 = 0x10;
      }
      if (uVar1 != uVar6) {
        *(uint *)(unaff_x19 + 0x60) = uVar6;
        if (0xe < uVar1) {
          lVar8 = *(long *)(unaff_x19 + 0xd0);
          iVar3 = *(int *)(lVar8 + 8) + -1;
          *(int *)(lVar8 + 8) = iVar3;
          if (iVar3 == 0) {
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0xf8));
            *(undefined8 *)(lVar8 + 0xf8) = 0;
            *(undefined8 *)(lVar8 + 0x100) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xef;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0x108));
            *(undefined8 *)(lVar8 + 0x108) = 0;
            *(undefined8 *)(lVar8 + 0x110) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xdf;
            (*(code *)*unaff_x28)(*(undefined8 *)(lVar8 + 0x118));
            *(undefined8 *)(lVar8 + 0x118) = 0;
            *(undefined8 *)(lVar8 + 0x120) = 0;
            *(byte *)(lVar8 + 0x271) = *(byte *)(lVar8 + 0x271) & 0xbf;
          }
        }
        if ((0x2eff7U >> (ulong)uVar6 & 1) == 0) {
          (**(code **)(&UNK_00a1f040 + (ulong)uVar6 * 8))();
        }
        goto code_r0x0076a68c;
      }
      if (uVar1 == 0x10) goto code_r0x0076a7d8;
    }
    else {
joined_r0x0076a698:
      if (uVar6 == 0x10) {
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
      if (((int)unaff_x26 != -1) && ((*(byte *)(unaff_x20 + 0x271) >> 1 & 1) == 0)) {
        *(int *)(unaff_x19 + 100) = iStack0000000000000050;
        return unaff_x26;
      }
    }
    in_stack_00000048._3_1_ = '\0';
    bVar2 = *(byte *)(unaff_x20 + 0x271);
    *(byte *)(unaff_x20 + 0x271) = bVar2 & 0xfd;
    if ((bVar2 >> 1 & 1) != 0) {
      func_0x00768960();
    }
    uVar6 = *(uint *)(unaff_x19 + 0x60);
    uVar7 = (ulong)uVar6;
    if (uVar6 - 4 < 0xc) {
      if (*(long *)(unaff_x19 + 0x18) == 0) {
        return 4;
      }
    }
    else if (0xc < uVar6 - 3) {
code_r0x00769738:
      if ((uint)uVar7 < 0x12) {
                    /* WARNING: Could not recover jumptable at 0x00769754. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar5 = (*(code *)(&UNK_00769758 + (ulong)*(ushort *)(unaff_x27 + uVar7 * 2) * 4))();
        return uVar5;
      }
      return 4;
    }
    uVar4 = func_0x0076a868();
    uVar7 = (ulong)*(uint *)(unaff_x19 + 0x60);
    if ((uVar4 & 1) == 0) goto code_r0x00769738;
    unaff_x26 = 0;
  } while( true );
}

