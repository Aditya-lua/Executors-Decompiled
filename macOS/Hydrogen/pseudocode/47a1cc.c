
/* WARNING: Possible PIC construction at 0x0047a204: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a27c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047afa4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047b284: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047b2a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a330: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a410: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a4a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a39c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a42c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0047a430) */
/* WARNING: Removing unreachable block (ram,0x0047a448) */
/* WARNING: Removing unreachable block (ram,0x0047a514) */
/* WARNING: Removing unreachable block (ram,0x0047a51c) */
/* WARNING: Removing unreachable block (ram,0x0047a450) */
/* WARNING: Removing unreachable block (ram,0x0047a3a0) */
/* WARNING: Removing unreachable block (ram,0x0047a3a8) */
/* WARNING: Removing unreachable block (ram,0x0047a3b4) */
/* WARNING: Removing unreachable block (ram,0x0047a3bc) */
/* WARNING: Removing unreachable block (ram,0x0047a504) */
/* WARNING: Removing unreachable block (ram,0x0047a50c) */
/* WARNING: Removing unreachable block (ram,0x0047a520) */
/* WARNING: Removing unreachable block (ram,0x0047a3c4) */
/* WARNING: Removing unreachable block (ram,0x0047a414) */
/* WARNING: Removing unreachable block (ram,0x0047a334) */
/* WARNING: Removing unreachable block (ram,0x0047b288) */
/* WARNING: Removing unreachable block (ram,0x0047b2ac) */
/* WARNING: Removing unreachable block (ram,0x0047b2b8) */
/* WARNING: Removing unreachable block (ram,0x0047b2d0) */
/* WARNING: Removing unreachable block (ram,0x0047b2f8) */
/* WARNING: Removing unreachable block (ram,0x0047b2d8) */
/* WARNING: Removing unreachable block (ram,0x0047b2c0) */
/* WARNING: Removing unreachable block (ram,0x0047b2a0) */
/* WARNING: Removing unreachable block (ram,0x0047afa8) */
/* WARNING: Removing unreachable block (ram,0x0047afb4) */
/* WARNING: Removing unreachable block (ram,0x0047afcc) */
/* WARNING: Removing unreachable block (ram,0x0047aff4) */
/* WARNING: Removing unreachable block (ram,0x0047afd4) */
/* WARNING: Removing unreachable block (ram,0x0047afbc) */
/* WARNING: Removing unreachable block (ram,0x0047a280) */
/* WARNING: Removing unreachable block (ram,0x0047a4a8) */
/* WARNING: Removing unreachable block (ram,0x0047a264) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_0047a1cc(ulong *param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong *unaff_x19;
  ulong *puVar6;
  long *unaff_x20;
  undefined8 uVar7;
  long *plVar8;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar9;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    unaff_x24 = unaff_x22 + 0x108;
    func_0x00488488(unaff_x22);
    unaff_x22 = unaff_x24;
  }
  puVar1 = (undefined1 *)register0x00000008;
  if (*unaff_x20 == 0) {
    __Unwind_Resume(param_1);
    puVar9 = (undefined *)0x47a214;
    puVar4 = (ulong *)func_0x007a2668();
    uVar7 = 0;
SUB_0047a214:
    while( true ) {
      while( true ) {
        puVar6 = puVar4;
        *(long *)(puVar1 + -0x40) = unaff_x24;
        *(undefined8 *)(puVar1 + -0x38) = uVar7;
        *(long *)(puVar1 + -0x30) = unaff_x22;
        *(ulong **)(puVar1 + -0x28) = param_1;
        *(long **)(puVar1 + -0x20) = unaff_x20;
        *(ulong **)(puVar1 + -0x18) = unaff_x19;
        *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
        *(undefined **)(puVar1 + -8) = puVar9;
        unaff_x29 = puVar1 + -0x10;
        uVar5 = *puVar6;
        unaff_x19 = puVar6;
        if ((long)uVar5 < 5) {
          if (1 < (long)uVar5) {
            if (uVar5 == 2) goto code_r0x0047a424;
            if (uVar5 != 3) {
              if (uVar5 == 4) {
                return;
              }
              goto code_r0x0047a4b4;
            }
            func_0x0047a214(puVar6[7]);
            puVar9 = &UNK_0047a3a0;
            puVar1 = puVar1 + -0x40;
            goto code_r0x00187bd4;
          }
          if (uVar5 != 0) {
            if (uVar5 != 1) goto code_r0x0047a4b4;
            uVar5 = puVar6[1];
            goto joined_r0x0047a348;
          }
          puVar4 = puVar6 + 1;
          lVar2 = *(long *)*puVar4;
          *(long *)*puVar4 = lVar2 + -1;
          LORelease();
          if (lVar2 != 1) {
            return;
          }
          unaff_x29 = *(undefined1 **)(puVar1 + -0x10);
          puVar9 = *(undefined **)(puVar1 + -8);
          uVar7 = *(undefined8 *)(puVar1 + -0x20);
          puVar6 = *(ulong **)(puVar1 + -0x18);
          goto code_r0x005d2ac4;
        }
        if (7 < (long)uVar5) break;
        if (uVar5 == 5) {
          plVar8 = (long *)puVar6[2];
          for (uVar5 = puVar6[3]; uVar5 != 0; uVar5 = uVar5 - 1) {
            if (*plVar8 != 0xc) {
              func_0x00488078(plVar8);
            }
            func_0x00488078(plVar8 + 8);
            plVar8 = plVar8 + 0x10;
          }
          uVar5 = puVar6[1];
          goto joined_r0x0047a348;
        }
        if (uVar5 == 6) {
          uVar5 = puVar6[1];
          if ((long)uVar5 < -0x7ffffffffffffffb) {
            return;
          }
          goto joined_r0x0047a348;
        }
        if (uVar5 != 7) goto code_r0x0047a4b4;
        param_1 = (ulong *)puVar6[1];
        puVar9 = &UNK_0047a264;
        puVar1 = puVar1 + -0x40;
        puVar4 = param_1;
      }
      if (uVar5 != 8) break;
      puVar9 = &UNK_0047a4a8;
      puVar1 = puVar1 + -0x40;
      puVar4 = (ulong *)puVar6[1];
      unaff_x19 = (ulong *)puVar6[1];
    }
    if (uVar5 == 9) {
      func_0x0047a214(puVar6[1]);
      puVar9 = &UNK_0047a414;
      puVar1 = puVar1 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar5 == 10) {
      lVar2 = *(long *)puVar6[4];
      *(long *)puVar6[4] = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2b20();
      }
      uVar5 = puVar6[3];
      if (uVar5 == 0) goto code_r0x0047a4f0;
      lVar2 = puVar6[2] + 0x18;
      uVar7 = 0xffffffffffffffff;
      goto code_r0x0047a314;
    }
code_r0x0047a4b4:
    uVar5 = puVar6[1] ^ 0x8000000000000000;
    if (1 < uVar5) {
      uVar5 = 2;
    }
    if (uVar5 == 0) {
      return;
    }
    if (uVar5 != 1) {
      unaff_x20 = *(long **)(puVar1 + -0x20);
      unaff_x22 = *(long *)(puVar1 + -0x30);
      unaff_x24 = *(long *)(puVar1 + -0x40);
      uVar7 = *(undefined8 *)(puVar1 + -0x38);
      *(long *)(puVar1 + -0x40) = unaff_x24;
      *(undefined8 *)(puVar1 + -0x38) = uVar7;
      *(long *)(puVar1 + -0x30) = unaff_x22;
      *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
      *(long **)(puVar1 + -0x20) = unaff_x20;
      *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
      *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
      *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
      unaff_x29 = puVar1 + -0x10;
      param_1 = (ulong *)puVar6[7];
      puVar9 = &UNK_0047b288;
      puVar1 = puVar1 + -0x40;
      puVar4 = param_1;
      unaff_x19 = puVar6 + 1;
      goto SUB_0047a214;
    }
    *(undefined8 *)(puVar1 + -0x40) = *(undefined8 *)(puVar1 + -0x40);
    *(undefined8 *)(puVar1 + -0x38) = *(undefined8 *)(puVar1 + -0x38);
    *(undefined8 *)(puVar1 + -0x30) = *(undefined8 *)(puVar1 + -0x30);
    *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
    *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
    *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
    *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
    *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
    unaff_x29 = puVar1 + -0x10;
    func_0x0047a214(puVar6[5]);
    puVar9 = (undefined *)0x47afa8;
    puVar1 = puVar1 + -0x40;
  }
  else {
    puVar9 = (undefined *)0x47a208;
  }
  goto code_r0x00187bd4;
code_r0x0047a424:
  param_1 = (ulong *)puVar6[4];
  puVar9 = &UNK_0047a430;
  puVar1 = puVar1 + -0x40;
  puVar4 = param_1;
  goto SUB_0047a214;
  while (lVar2 = lVar2 + 0x10, uVar5 != 0) {
code_r0x0047a314:
    uVar5 = uVar5 - 1;
    puVar4 = (ulong *)(lVar2 + -0x10);
    lVar3 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      puVar9 = &UNK_0047a334;
      puVar1 = puVar1 + -0x40;
code_r0x005d2ac4:
      if (*(long *)(*puVar4 + 0x10) != -0x8000000000000000 && *(long *)(*puVar4 + 0x10) != 0) {
        *(undefined8 *)(puVar1 + -0x20) = uVar7;
        *(ulong **)(puVar1 + -0x18) = puVar6;
        *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
        *(undefined **)(puVar1 + -8) = puVar9;
        unaff_x29 = puVar1 + -0x10;
        puVar9 = &UNK_005d2b08;
        puVar1 = puVar1 + -0x20;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x0047a4f0:
  uVar5 = puVar6[1];
joined_r0x0047a348:
  if (uVar5 == 0) {
    return;
  }
  unaff_x29 = *(undefined1 **)(puVar1 + -0x10);
  puVar9 = *(undefined **)(puVar1 + -8);
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar9;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

