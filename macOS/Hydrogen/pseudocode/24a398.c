
/* WARNING: Possible PIC construction at 0x00246a14: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00246a78: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024671c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002468c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00246910: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00246ae0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00246974: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024684c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00246874: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00246914) */
/* WARNING: Removing unreachable block (ram,0x00246a7c) */
/* WARNING: Removing unreachable block (ram,0x00246850) */

void FUN_0024a398(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *unaff_x19;
  ulong unaff_x20;
  ulong *puVar7;
  long *plVar8;
  long unaff_x22;
  long *plVar9;
  long lVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined *puVar13;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  uStack0000000000000008 = param_1;
  func_0x001bb074(param_3);
  uVar6 = *(ulong *)(unaff_x22 + 0x10) - unaff_x20;
  if (*(ulong *)(unaff_x22 + 0x10) < unaff_x20) {
    func_0x007a28a4();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x24a440);
    (*pcVar2)();
  }
  lVar11 = *(long *)(unaff_x22 + 8);
  plVar9 = *(long **)(unaff_x22 + 0x18);
  (**(code **)(plVar9[6] + 0x30))(plVar9[5],lVar11 + unaff_x20,uVar6);
  if (*plVar9 != -0x8000000000000000) {
    lVar10 = plVar9[2];
    if ((ulong)(*plVar9 - lVar10) < uVar6) {
      func_0x0079b61c(plVar9,lVar10,uVar6,1,1);
      lVar10 = plVar9[2];
    }
    _memcpy(plVar9[1] + lVar10,lVar11 + unaff_x20,uVar6);
    plVar9[2] = lVar10 + uVar6;
  }
  puVar3 = &uStack0000000000000010;
  puVar12 = &uStack0000000000000050;
  uVar5 = *unaff_x19;
  uVar6 = uVar5 ^ 0x8000000000000000;
  if (0x15 < uVar6) {
    uVar6 = 1;
  }
  switch(uVar6) {
  case 0:
  case 0xb:
  case 0xc:
  case 0x11:
    goto code_r0x002466f4;
  case 1:
    if (uVar5 != 0) {
      uVar6 = unaff_x19[1];
      uVar5 = uVar5 << 2;
      uVar4 = 2;
      puVar13 = &UNK_00246878;
      goto code_r0x00187bd4;
    }
    if (unaff_x19[3] != 0) {
      func_0x00187bd4(unaff_x19[4],unaff_x19[3] << 1,1);
    }
    lVar11 = unaff_x19[8] + 1;
    uVar6 = unaff_x19[7];
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x001a09ec(uVar6);
      uVar6 = uVar6 + 0x40;
    }
    if (unaff_x19[6] == 0) {
      return;
    }
    uVar6 = unaff_x19[7];
    uVar5 = unaff_x19[6] << 6;
    break;
  case 2:
    lVar11 = unaff_x19[3] + 1;
    uVar6 = unaff_x19[2];
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x0016abd8(uVar6);
      uVar6 = uVar6 + 0x28;
    }
    goto code_r0x002469ec;
  case 3:
    uVar6 = unaff_x19[3];
    if (uVar6 != 0) {
      lVar11 = 0;
      plVar8 = (long *)unaff_x19[2];
      plVar9 = plVar8;
      do {
        lVar10 = *plVar9;
        uVar5 = lVar10 + 0x7fffffffffffffff;
        if (3 < uVar5) {
          uVar5 = 4;
        }
        if ((long)uVar5 < 2) {
          if (uVar5 != 0) {
            if (uVar5 != 1) goto code_r0x002467bc;
code_r0x002467e0:
            lVar10 = plVar9[1];
            plVar1 = plVar8 + lVar11 * 4 + 1;
joined_r0x002467ec:
            if (lVar10 != 0) {
              func_0x00187bd4(plVar1[1],lVar10,1);
            }
          }
        }
        else if (uVar5 != 2) {
          if (uVar5 == 3) goto code_r0x002467e0;
code_r0x002467bc:
          plVar1 = plVar9;
          if (lVar10 != -0x8000000000000000) goto joined_r0x002467ec;
        }
        plVar9 = plVar9 + 4;
        lVar11 = lVar11 + 1;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    uVar5 = unaff_x19[1];
    if (uVar5 == 0) {
      return;
    }
    uVar6 = unaff_x19[2];
    goto code_r0x00246a8c;
  case 4:
    uVar6 = unaff_x19[3];
    if (uVar6 != 0) {
      puVar7 = (ulong *)(unaff_x19[2] + 8);
      do {
        uVar5 = puVar7[-1];
        if (uVar5 != 0x8000000000000000 && uVar5 != 0) {
          uVar6 = *puVar7;
          uVar4 = 1;
          puVar13 = &UNK_00246850;
          puVar3 = &uStack0000000000000010;
          goto code_r0x00187bd4;
        }
        puVar7 = puVar7 + 3;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    uVar5 = unaff_x19[1];
    if (uVar5 == 0) {
      return;
    }
    uVar6 = unaff_x19[2];
    goto code_r0x00246924;
  case 5:
    uVar5 = unaff_x19[1];
    if (uVar5 != 0) {
      uVar6 = unaff_x19[2];
      uVar4 = 1;
      puVar13 = &UNK_00246978;
      puVar3 = &uStack0000000000000010;
      goto code_r0x00187bd4;
    }
    func_0x0016c428(unaff_x19 + 4);
    if (unaff_x19[4] == 0) {
      return;
    }
    uVar6 = unaff_x19[5];
    uVar5 = unaff_x19[4] * 0x30;
    break;
  default:
    uVar5 = unaff_x19[1];
    if (uVar5 == 0x8000000000000000 || uVar5 == 0) {
      return;
    }
    goto code_r0x00246938;
  case 7:
    if (unaff_x19[1] == 0x8000000000000000) {
      uVar5 = unaff_x19[2];
      if (uVar5 == 0x8000000000000000) {
        return;
      }
      lVar11 = 0x10;
    }
    else {
      uVar5 = unaff_x19[5];
      if (uVar5 == 0x8000000000000000) {
        lVar11 = 0x30;
      }
      else {
        if (uVar5 != 0) {
          uVar6 = unaff_x19[6];
          uVar4 = 1;
          puVar13 = &UNK_00246ae4;
          puVar3 = &uStack0000000000000010;
          goto code_r0x00187bd4;
        }
        if (unaff_x19[8] != 0) {
          func_0x00187bd4(unaff_x19[9],unaff_x19[8],1);
        }
        lVar11 = 0x58;
      }
      lVar10 = *(long *)((long)unaff_x19 + lVar11);
      if (lVar10 != 0) {
        func_0x00187bd4(((long *)((long)unaff_x19 + lVar11))[1],lVar10,1);
      }
      uVar5 = unaff_x19[1];
      lVar11 = 8;
    }
    if (uVar5 == 0) {
      return;
    }
    uVar6 = *(ulong *)((long)unaff_x19 + lVar11 + 8);
    goto code_r0x0024693c;
  case 8:
    if (unaff_x19[1] != 0) {
      uVar6 = unaff_x19[2];
      uVar5 = unaff_x19[1] << 1;
      uVar4 = 1;
      puVar13 = &UNK_002468c8;
      puVar3 = &uStack0000000000000010;
      goto code_r0x00187bd4;
    }
    if (unaff_x19[4] != 0) {
      func_0x00187bd4(unaff_x19[5],unaff_x19[4] << 2,2);
    }
    uVar6 = unaff_x19[9];
    if (uVar6 != 0) {
      puVar7 = (ulong *)(unaff_x19[8] + 8);
      do {
        uVar5 = puVar7[-1];
        if (uVar5 != 0) {
          uVar6 = *puVar7;
          uVar4 = 1;
          puVar13 = &UNK_00246914;
          puVar3 = &uStack0000000000000010;
          goto code_r0x00187bd4;
        }
        puVar7 = puVar7 + 3;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    uVar5 = unaff_x19[7];
    if (uVar5 == 0) {
      return;
    }
    uVar6 = unaff_x19[8];
code_r0x00246924:
    uVar5 = uVar5 * 0x18;
    break;
  case 9:
    uVar5 = unaff_x19[1];
    if (uVar5 != 0) {
      uVar6 = unaff_x19[2];
      uVar4 = 1;
      puVar13 = &UNK_00246720;
      puVar3 = &uStack0000000000000010;
      goto code_r0x00187bd4;
    }
    lVar11 = unaff_x19[6] + 1;
    uVar6 = unaff_x19[5];
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x0016ad38(uVar6);
      uVar6 = uVar6 + 0x20;
    }
    goto code_r0x00246a80;
  case 10:
    uVar5 = unaff_x19[1];
    if (uVar5 == 0) {
      return;
    }
code_r0x00246938:
    uVar6 = unaff_x19[2];
code_r0x0024693c:
    uVar4 = 1;
    goto code_r0x00246aa8;
  case 0xe:
    plVar9 = (long *)unaff_x19[1];
    lVar11 = *plVar9;
    *plVar9 = lVar11 + -1;
    LORelease();
    if (lVar11 != 1) {
      return;
    }
    DataMemoryBarrier(2,1);
    uVar6 = unaff_x19[1];
    if (*(long *)(uVar6 + 0x10) != 0) {
      func_0x00187bd4(*(undefined8 *)(uVar6 + 0x18),*(long *)(uVar6 + 0x10),1);
    }
    if (uVar6 != 0xffffffffffffffff) {
      lVar11 = *(long *)(uVar6 + 8);
      *(long *)(uVar6 + 8) = lVar11 + -1;
      LORelease();
      if (lVar11 == 1) {
        DataMemoryBarrier(2,1);
        uVar5 = 0x28;
        uVar4 = 8;
        puVar3 = (undefined8 *)&uStack0000000000000060;
        puVar12 = uStack0000000000000050;
        puVar13 = in_stack_00000058;
        goto code_r0x00187bd4;
      }
    }
    return;
  case 0xf:
    uVar5 = unaff_x19[1];
    if (uVar5 != 0) {
      uVar6 = unaff_x19[2];
      uVar4 = 1;
      puVar3 = &uStack0000000000000010;
      puVar13 = &UNK_00246a18;
      goto code_r0x00187bd4;
    }
    lVar11 = *(long *)unaff_x19[7];
    *(long *)unaff_x19[7] = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa0f4();
    }
    uVar6 = unaff_x19[6];
    if (uVar6 != 0) {
      puVar7 = (ulong *)(unaff_x19[5] + 8);
      do {
        uVar5 = puVar7[-1];
        if (-0x7fffffffffffffff < (long)uVar5 && uVar5 != 0) {
          uVar6 = *puVar7;
          uVar4 = 1;
          puVar3 = &uStack0000000000000010;
          puVar13 = &UNK_00246a7c;
          goto code_r0x00187bd4;
        }
        puVar7 = puVar7 + 4;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
code_r0x00246a80:
    uVar5 = unaff_x19[4];
    if (uVar5 == 0) {
      return;
    }
    uVar6 = unaff_x19[5];
code_r0x00246a8c:
    uVar5 = uVar5 << 5;
    break;
  case 0x10:
    lVar11 = unaff_x19[3] + 1;
    uVar6 = unaff_x19[2];
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x0016abd8(uVar6);
      uVar6 = uVar6 + 0x28;
    }
code_r0x002469ec:
    if (unaff_x19[1] == 0) {
code_r0x002466f4:
      return;
    }
    uVar6 = unaff_x19[2];
    uVar5 = unaff_x19[1] * 0x28;
  }
  uVar4 = 8;
code_r0x00246aa8:
  puVar3 = (undefined8 *)&uStack0000000000000060;
  puVar12 = uStack0000000000000050;
  puVar13 = in_stack_00000058;
code_r0x00187bd4:
  *(undefined8 **)((long)puVar3 + -0x10) = puVar12;
  *(undefined **)((long)puVar3 + -8) = puVar13;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar6,uVar5,uVar4);
  return;
}

