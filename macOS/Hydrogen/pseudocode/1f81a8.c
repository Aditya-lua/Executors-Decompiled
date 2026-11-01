
/* WARNING: Possible PIC construction at 0x001f8338: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001f833c) */

void FUN_001f81a8(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  ulong uVar7;
  undefined1 *puVar8;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  func_0x00252db4(unaff_x19 + 0xe0);
  func_0x001f91f4(unaff_x19 + 0x138);
  __Unwind_Resume(param_1);
  puVar4 = (ulong *)func_0x007a2668();
  puVar2 = auStack_c0 + 0x80;
  uStack_8 = 0x1f81dc;
  puVar8 = auStack_c0 + 0xb0;
  uVar7 = *puVar4;
  uVar6 = uVar7 + 0x7fffffffffffffef;
  if (0x15 < uVar6) {
    uVar6 = 0xb;
  }
  if ((long)uVar6 < 0xb) {
    if ((long)uVar6 < 8) {
      if (uVar6 - 2 < 6) {
        return;
      }
      if ((uVar6 == 0) || (uVar6 == 1)) {
        if (puVar4[1] == 0) {
          return;
        }
        uVar5 = puVar4[2];
        uVar6 = puVar4[1] << 1;
LAB_001f82cc:
        uVar7 = 1;
LAB_001f82d0:
        puVar2 = (undefined1 *)register0x00000008;
        puVar8 = unaff_x29;
        goto code_r0x00187bd4;
      }
    }
    else {
      if (uVar6 - 9 < 2) {
        return;
      }
      if (uVar6 == 8) {
        uVar6 = puVar4[1];
        if ((long)uVar6 < -0x7fffffffffffffea) {
          return;
        }
        uVar5 = puVar4[2];
        lVar3 = puVar4[3] + 1;
        uVar7 = uVar5;
        while (lVar3 = lVar3 + -1, lVar3 != 0) {
          func_0x0016af10(uVar7);
          uVar7 = uVar7 + 0x70;
        }
        if (uVar6 == 0) {
          return;
        }
        uVar6 = uVar6 * 0x70;
LAB_001f83b8:
        uVar7 = 8;
        goto LAB_001f82d0;
      }
    }
LAB_001f8358:
    puVar4 = puVar4 + 1;
    lVar3 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar3 + -1;
    LORelease();
  }
  else {
    if (0xd < (long)uVar6) {
      if (uVar6 - 0xe < 7) {
        return;
      }
      goto LAB_001f8358;
    }
    if (uVar6 == 0xb) {
      uVar6 = uVar7 ^ 0x8000000000000000;
      if (0x10 < uVar6) {
        uVar6 = 0xd;
      }
      if (uVar6 < 0xd) {
        return;
      }
      if (uVar6 - 0xe < 2) {
        return;
      }
      if (uVar6 == 0xd) {
        if ((((puVar4[3] & 1) == 0) && (uVar6 = puVar4[4], uVar6 != 0x8000000000000000)) &&
           (uVar6 != 0)) {
          uVar5 = puVar4[5];
          uVar7 = 1;
          uStack_8 = 0x1f833c;
          goto code_r0x00187bd4;
        }
        func_0x0016c818();
        if (uVar7 == 0) {
          return;
        }
        uVar5 = puVar4[1];
        uVar6 = uVar7 * 0x18;
        goto LAB_001f83b8;
      }
      goto LAB_001f8358;
    }
    if (uVar6 != 0xc) {
      if (uVar6 == 0xd) {
        uVar6 = puVar4[1];
        if (uVar6 == 0) {
          return;
        }
        uVar5 = puVar4[2];
        goto LAB_001f82cc;
      }
      goto LAB_001f8358;
    }
    if (puVar4[1] != 4) {
      return;
    }
    puVar4 = puVar4 + 2;
    lVar3 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar3 + -1;
    LORelease();
  }
  if (lVar3 != 1) {
    return;
  }
  DataMemoryBarrier(2,1);
  uStack_8 = 0x1f81dc;
  uVar5 = *puVar4;
  puVar1 = (undefined8 *)puVar4[1];
  uVar7 = puVar1[2];
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(uVar5 + (uVar7 - 1 & 0xfffffffffffffff0) + 0x10);
  }
  if (uVar5 != 0xffffffffffffffff) {
    lVar3 = *(long *)(uVar5 + 8);
    *(long *)(uVar5 + 8) = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      if (uVar7 < 9) {
        uVar7 = 8;
      }
      uVar6 = uVar7 + puVar1[1] + 0xf & -uVar7;
      if (uVar6 != 0) {
        puVar2 = (undefined1 *)register0x00000008;
        puVar8 = unaff_x29;
code_r0x00187bd4:
        *(undefined1 **)(puVar2 + -0x10) = puVar8;
        *(undefined8 *)(puVar2 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(uVar5,uVar6,uVar7);
        return;
      }
    }
  }
  return;
}

