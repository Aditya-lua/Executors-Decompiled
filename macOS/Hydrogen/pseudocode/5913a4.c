
/* WARNING: Possible PIC construction at 0x005913c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591628: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591760: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00590edc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591c1c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591e68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591e8c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00590f9c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059107c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591110: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591008: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591098: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591694: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059178c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591700: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591d4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005915b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005915c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591524: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591464: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591474: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591450: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059148c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00591454) */
/* WARNING: Removing unreachable block (ram,0x00591478) */
/* WARNING: Removing unreachable block (ram,0x00591468) */
/* WARNING: Removing unreachable block (ram,0x00591528) */
/* WARNING: Removing unreachable block (ram,0x005915cc) */
/* WARNING: Removing unreachable block (ram,0x005915e4) */
/* WARNING: Removing unreachable block (ram,0x005915f0) */
/* WARNING: Removing unreachable block (ram,0x00591600) */
/* WARNING: Removing unreachable block (ram,0x005915bc) */
/* WARNING: Removing unreachable block (ram,0x00591698) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */
/* WARNING: Removing unreachable block (ram,0x0059109c) */
/* WARNING: Removing unreachable block (ram,0x005910b4) */
/* WARNING: Removing unreachable block (ram,0x00591180) */
/* WARNING: Removing unreachable block (ram,0x00591188) */
/* WARNING: Removing unreachable block (ram,0x005910bc) */
/* WARNING: Removing unreachable block (ram,0x0059100c) */
/* WARNING: Removing unreachable block (ram,0x00591014) */
/* WARNING: Removing unreachable block (ram,0x00591020) */
/* WARNING: Removing unreachable block (ram,0x00591028) */
/* WARNING: Removing unreachable block (ram,0x00591170) */
/* WARNING: Removing unreachable block (ram,0x00591178) */
/* WARNING: Removing unreachable block (ram,0x0059118c) */
/* WARNING: Removing unreachable block (ram,0x00591030) */
/* WARNING: Removing unreachable block (ram,0x00591080) */
/* WARNING: Removing unreachable block (ram,0x00590fa0) */
/* WARNING: Removing unreachable block (ram,0x00591e6c) */
/* WARNING: Removing unreachable block (ram,0x00591e90) */
/* WARNING: Removing unreachable block (ram,0x00591e9c) */
/* WARNING: Removing unreachable block (ram,0x00591eb4) */
/* WARNING: Removing unreachable block (ram,0x00591edc) */
/* WARNING: Removing unreachable block (ram,0x00591ebc) */
/* WARNING: Removing unreachable block (ram,0x00591ea4) */
/* WARNING: Removing unreachable block (ram,0x00591e84) */
/* WARNING: Removing unreachable block (ram,0x00591c20) */
/* WARNING: Removing unreachable block (ram,0x00591c3c) */
/* WARNING: Removing unreachable block (ram,0x00591c54) */
/* WARNING: Removing unreachable block (ram,0x00591c7c) */
/* WARNING: Removing unreachable block (ram,0x00591c5c) */
/* WARNING: Removing unreachable block (ram,0x00591c44) */
/* WARNING: Removing unreachable block (ram,0x00590ee0) */
/* WARNING: Removing unreachable block (ram,0x00591114) */
/* WARNING: Removing unreachable block (ram,0x00591490) */
/* WARNING: Removing unreachable block (ram,0x005914a8) */
/* WARNING: Removing unreachable block (ram,0x005914b4) */
/* WARNING: Removing unreachable block (ram,0x005914c4) */

void FUN_005913a4(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong uVar8;
  undefined8 uVar9;
  long *plVar10;
  ulong *unaff_x19;
  ulong *unaff_x20;
  undefined8 *puVar11;
  ulong *puVar12;
  long unaff_x22;
  ulong *unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined1 *puVar13;
  undefined *puVar14;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x00553cb8(unaff_x23);
    unaff_x23 = unaff_x23 + 8;
  }
  if (unaff_x19[4] != 0) {
    uVar4 = unaff_x19[5];
    uVar8 = unaff_x19[4] << 6;
    uVar9 = 8;
    uStack_8 = (code *)&UNK_005913c4;
    goto code_r0x00187bd4;
  }
  __Unwind_Resume();
  puVar5 = (ulong *)func_0x007a2668();
  puVar1 = auStack_c0 + 0x80;
  uStack_8 = (code *)&SUB_005913d0;
  puVar13 = auStack_c0 + 0xb0;
  puVar12 = puVar5 + 3;
  uVar4 = *puVar12 - 0xc;
  if (0x14 < uVar4) {
    uVar4 = 9;
  }
  uVar9 = 0;
  switch(uVar4) {
  case 0:
  case 0x10:
  case 0x11:
    goto code_r0x005917c4;
  case 1:
    puVar5 = puVar5 + 4;
    puVar14 = &SUB_005913d0;
    puVar7 = unaff_x23;
    do {
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(ulong **)((long)register0x00000008 + -0x38) = puVar7;
      *(undefined8 *)((long)register0x00000008 + -0x30) = uVar9;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x23;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar14;
      puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
      unaff_x20 = (ulong *)puVar5[3];
      uStack_8 = (code *)0x591c20;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
      puVar6 = unaff_x20;
      unaff_x19 = puVar5;
      puVar12 = unaff_x23;
      unaff_x23 = puVar7;
code_r0x00590e80:
      puVar5 = puVar6;
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(ulong **)((long)register0x00000008 + -0x38) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x30) = uVar9;
      *(ulong **)((long)register0x00000008 + -0x28) = puVar12;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined1 **)((long)register0x00000008 + -0x10) = puVar13;
      *(code **)((long)register0x00000008 + -8) = uStack_8;
      puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
      uVar4 = *puVar5;
      unaff_x29 = puVar13;
      if ((long)uVar4 < 5) {
        if (1 < (long)uVar4) {
          if (uVar4 == 2) goto code_r0x00591090;
          if (uVar4 != 3) {
            if (uVar4 == 4) {
              return;
            }
            goto code_r0x00591120;
          }
          uVar4 = puVar5[7];
          func_0x00590e80(uVar4);
          uVar8 = 0x40;
          uVar9 = 8;
          uStack_8 = (code *)&UNK_0059100c;
          register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
          break;
        }
        if (uVar4 != 0) {
          if (uVar4 == 1) {
            uVar8 = puVar5[1];
            if (uVar8 == 0) {
              return;
            }
            goto code_r0x00591058;
          }
          goto code_r0x00591120;
        }
        puVar12 = puVar5 + 1;
        lVar3 = *(long *)*puVar12;
        *(long *)*puVar12 = lVar3 + -1;
        LORelease();
        if (lVar3 != 1) {
          return;
        }
        puVar13 = *(undefined1 **)((long)register0x00000008 + -0x10);
        uStack_8 = *(code **)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        puVar5 = *(ulong **)((long)register0x00000008 + -0x18);
        puVar1 = (undefined1 *)register0x00000008;
        goto code_r0x005d2ac4;
      }
      if ((long)uVar4 < 8) {
        if (uVar4 == 5) {
          plVar10 = (long *)puVar5[2];
          for (uVar4 = puVar5[3]; uVar4 != 0; uVar4 = uVar4 - 1) {
            if (*plVar10 != 0xc) {
              func_0x00553cb8(plVar10);
            }
            func_0x00553cb8(plVar10 + 8);
            plVar10 = plVar10 + 0x10;
          }
          if (puVar5[1] == 0) {
            return;
          }
          uVar4 = puVar5[2];
          uVar8 = puVar5[1] << 7;
          goto code_r0x005911a4;
        }
        if (uVar4 != 6) {
          if (uVar4 != 7) goto code_r0x00591120;
          uVar4 = puVar5[1];
          func_0x00590e80(uVar4);
          uVar8 = 0x40;
          uVar9 = 8;
          uStack_8 = (code *)&UNK_00590ee0;
          register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
          break;
        }
        uVar8 = puVar5[1];
        if ((long)uVar8 < -0x7ffffffffffffffb) {
          return;
        }
        if (uVar8 == 0) {
          return;
        }
code_r0x00591058:
        uVar4 = puVar5[2];
        uVar9 = 1;
        goto code_r0x005911a8;
      }
      if (uVar4 == 8) {
        uStack_8 = (code *)&UNK_00591114;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar6 = (ulong *)puVar5[1];
        unaff_x19 = (ulong *)puVar5[1];
        goto code_r0x00590e80;
      }
      if (uVar4 == 9) {
        uVar4 = puVar5[1];
        func_0x00590e80(uVar4);
        uVar8 = 0x40;
        uVar9 = 8;
        uStack_8 = (code *)&UNK_00591080;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        break;
      }
      if (uVar4 == 10) {
        lVar3 = *(long *)puVar5[4];
        *(long *)puVar5[4] = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          func_0x005d2b20();
        }
        uVar4 = puVar5[3];
        if (uVar4 == 0) goto code_r0x0059115c;
        lVar3 = puVar5[2] + 0x18;
        unaff_x20 = (ulong *)0xffffffffffffffff;
        goto code_r0x00590f80;
      }
code_r0x00591120:
      puVar7 = puVar5 + 1;
      uVar4 = *puVar7 ^ 0x8000000000000000;
      if (1 < uVar4) {
        uVar4 = 2;
      }
      if (uVar4 == 0) {
        return;
      }
      if (uVar4 != 1) {
        unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
        puVar14 = *(undefined **)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
        uVar9 = *(undefined8 *)((long)register0x00000008 + -0x30);
        unaff_x23 = *(ulong **)((long)register0x00000008 + -0x28);
        unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
        puVar5 = *(ulong **)((long)register0x00000008 + -0x38);
DAT_00591e48:
        *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
        *(ulong **)((long)register0x00000008 + -0x38) = puVar5;
        *(undefined8 *)((long)register0x00000008 + -0x30) = uVar9;
        *(ulong **)((long)register0x00000008 + -0x28) = unaff_x23;
        *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
        *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
        *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined **)((long)register0x00000008 + -8) = puVar14;
        puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
        puVar12 = (ulong *)puVar7[6];
        uStack_8 = (code *)&UNK_00591e6c;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar6 = puVar12;
        unaff_x19 = puVar7;
        unaff_x23 = puVar5;
        goto code_r0x00590e80;
      }
      puVar5 = puVar5 + 2;
      unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
      puVar14 = *(undefined **)((long)register0x00000008 + -8);
      unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
      unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
      uVar9 = *(undefined8 *)((long)register0x00000008 + -0x30);
      unaff_x23 = *(ulong **)((long)register0x00000008 + -0x28);
      unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
      puVar7 = *(ulong **)((long)register0x00000008 + -0x38);
    } while( true );
  case 2:
    puVar7 = puVar5 + 4;
    puVar14 = &SUB_005913d0;
    puVar5 = unaff_x23;
    goto DAT_00591e48;
  case 3:
  case 0xc:
    uStack_8 = (code *)&SUB_005913d0;
    puVar13 = auStack_c0;
    uVar4 = puVar5[5];
    lVar3 = puVar5[6] + 1;
    uVar8 = uVar4;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553bbc(uVar8);
      uVar8 = uVar8 + 0x18;
    }
    if (puVar5[4] == 0) {
      uVar4 = puVar5[8];
      lVar3 = puVar5[9] + 1;
      uVar8 = uVar4;
      while (lVar3 = lVar3 + -1, lVar3 != 0) {
        func_0x00553cb8(uVar8);
        uVar8 = uVar8 + 0x40;
      }
      if (puVar5[7] == 0) {
        return;
      }
      uVar8 = puVar5[7] << 6;
      uVar9 = 8;
    }
    else {
      uVar8 = puVar5[4] * 0x18;
      uVar9 = 8;
      uStack_8 = FUN_00591d50;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13 + 0xb0;
    }
    break;
  case 4:
    uStack_8 = (code *)&UNK_00591490;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar6 = puVar5 + 4;
    unaff_x19 = puVar5;
    goto code_r0x00590e80;
  default:
    uVar8 = *puVar5;
    if (uVar8 == 0) {
      return;
    }
    uVar4 = puVar5[1];
    uVar9 = 1;
    goto code_r0x00591738;
  case 7:
    func_0x00590e80(puVar5 + 4);
    puVar5 = puVar5 + 0xc;
    plVar10 = (long *)*puVar5;
    goto code_r0x00591794;
  case 8:
    uStack_8 = (code *)&UNK_00591454;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar6 = puVar5 + 4;
    unaff_x19 = puVar5;
    goto code_r0x00590e80;
  case 9:
    func_0x00590d84(puVar5);
    uStack_8 = (code *)&UNK_00591468;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar6 = puVar12;
    unaff_x19 = puVar5;
    goto code_r0x00590e80;
  case 10:
    func_0x00590d84(puVar5 + 0x14);
    uStack_8 = (code *)&UNK_00591528;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar6 = puVar5 + 0x17;
    unaff_x19 = puVar5;
    goto code_r0x00590e80;
  case 0xb:
    uStack_8 = (code *)&UNK_005915bc;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar6 = puVar5 + 4;
    unaff_x19 = puVar5;
    goto code_r0x00590e80;
  case 0xd:
    lVar3 = puVar5[0x16] + 1;
    uVar4 = puVar5[0x15];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553bbc(uVar4);
      uVar4 = uVar4 + 0x18;
    }
    if (puVar5[0x14] == 0) {
      func_0x00590e80(puVar5 + 4);
      puVar6 = puVar5 + 0xc;
code_r0x00591710:
      puVar12 = unaff_x23;
      puVar13 = unaff_x29;
      goto code_r0x00590e80;
    }
    uVar4 = puVar5[0x15];
    uVar8 = puVar5[0x14] * 0x18;
    uVar9 = 8;
    uStack_8 = (code *)&UNK_00591704;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar13;
    break;
  case 0xe:
    if (puVar5[6] != 0) {
      puVar12 = (ulong *)puVar5[5];
      lVar3 = 1 - puVar5[6];
      unaff_x20 = (ulong *)0xffffffffffffffff;
      do {
        lVar2 = *(long *)*puVar12;
        *(long *)*puVar12 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          uStack_8 = (code *)&UNK_00591698;
          goto code_r0x005d2ac4;
        }
        puVar12 = puVar12 + 1;
        lVar3 = lVar3 + 1;
      } while (lVar3 != 1);
    }
    if (puVar5[4] != 0) {
      func_0x00187bd4(puVar5[5],puVar5[4] << 3,8);
    }
    lVar3 = puVar5[9] + 1;
    uVar4 = puVar5[8];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553cb8(uVar4);
      uVar4 = uVar4 + 0x40;
    }
    if (puVar5[7] != 0) {
      uVar4 = puVar5[8];
      uVar8 = puVar5[7] << 6;
      uVar9 = 8;
      uStack_8 = (code *)&UNK_00591790;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13;
      break;
    }
    puVar5 = puVar5 + 10;
    plVar10 = (long *)*puVar5;
code_r0x00591794:
    lVar3 = *plVar10;
    *plVar10 = lVar3 + -1;
    LORelease();
    if (lVar3 != 1) {
code_r0x005917c4:
      return;
    }
    puVar13 = auStack_c0;
    uVar4 = *puVar5;
    lVar3 = *(long *)(uVar4 + 0x20) + 1;
    lVar2 = *(long *)(uVar4 + 0x18);
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059d298(lVar2);
      lVar2 = lVar2 + 0x108;
    }
    plVar10 = (long *)(uVar4 + 0x10);
    if (*plVar10 == 0) {
      uVar8 = 0x28;
      uVar9 = 8;
    }
    else {
      uVar4 = *(ulong *)(uVar4 + 0x18);
      uVar8 = *plVar10 * 0x108;
      uVar9 = 8;
      uStack_8 = (code *)&UNK_005d2cc8;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13 + 0xb0;
    }
    break;
  case 0xf:
    lVar3 = puVar5[2] + 1;
    uVar4 = puVar5[1];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553cb8(uVar4);
      uVar4 = uVar4 + 0x40;
    }
    if (*puVar5 == 0) {
      return;
    }
    uVar4 = puVar5[1];
    uVar8 = *puVar5 << 6;
    goto code_r0x00591734;
  case 0x12:
    if (puVar5[2] != 0) {
      puVar11 = (undefined8 *)puVar5[1];
      lVar3 = 1 - puVar5[2];
      do {
        lVar2 = *(long *)*puVar11;
        *(long *)*puVar11 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(puVar11);
        }
        puVar11 = puVar11 + 1;
        lVar3 = lVar3 + 1;
      } while (lVar3 != 1);
    }
    if (*puVar5 == 0) {
      return;
    }
    uVar4 = puVar5[1];
    uVar8 = *puVar5 << 3;
code_r0x00591734:
    uVar9 = 8;
code_r0x00591738:
    break;
  case 0x13:
    puVar12 = puVar5 + 0xf;
    puVar6 = puVar5 + 4;
    lVar3 = *(long *)*puVar12;
    *(long *)*puVar12 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      uStack_8 = (code *)&UNK_0059162c;
      puVar1 = auStack_c0 + 0x80;
code_r0x005d2ac4:
      uVar4 = *puVar12;
      uVar8 = *(ulong *)(uVar4 + 0x10);
      if (uVar8 == 0x8000000000000000 || uVar8 == 0) {
        uVar8 = 0x28;
        uVar9 = 8;
        register0x00000008 = (BADSPACEBASE *)puVar1;
        unaff_x29 = puVar13;
      }
      else {
        *(ulong **)(puVar1 + -0x20) = unaff_x20;
        *(ulong **)(puVar1 + -0x18) = puVar5;
        *(undefined1 **)(puVar1 + -0x10) = puVar13;
        *(code **)(puVar1 + -8) = uStack_8;
        uVar4 = *(ulong *)(uVar4 + 0x18);
        uVar9 = 1;
        uStack_8 = (code *)&UNK_005d2b08;
        register0x00000008 = (BADSPACEBASE *)(puVar1 + -0x20);
        unaff_x29 = puVar1 + -0x10;
      }
    }
    else {
      lVar3 = puVar5[0xe] + 1;
      uVar4 = puVar5[0xd];
      while (lVar3 = lVar3 + -1, lVar3 != 0) {
        func_0x00553cb8(uVar4);
        uVar4 = uVar4 + 0x40;
      }
      if (puVar5[0xc] == 0) {
        if (*puVar6 == 0xc) {
          return;
        }
        goto code_r0x00591710;
      }
      uVar4 = puVar5[0xd];
      uVar8 = puVar5[0xc] << 6;
      uVar9 = 8;
      uStack_8 = (code *)&UNK_00591764;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13;
    }
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar4,uVar8,uVar9);
  return;
code_r0x00591090:
  puVar12 = (ulong *)puVar5[4];
  uStack_8 = (code *)&UNK_0059109c;
  register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
  puVar6 = puVar12;
  unaff_x19 = puVar5;
  goto code_r0x00590e80;
  while (lVar3 = lVar3 + 0x10, uVar4 != 0) {
code_r0x00590f80:
    uVar4 = uVar4 - 1;
    puVar12 = (ulong *)(lVar3 + -0x10);
    lVar2 = *(long *)*puVar12;
    *(long *)*puVar12 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      uStack_8 = (code *)&UNK_00590fa0;
      puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
      goto code_r0x005d2ac4;
    }
  }
code_r0x0059115c:
  if (puVar5[1] == 0) {
    return;
  }
  uVar4 = puVar5[2];
  uVar8 = puVar5[1] << 4;
code_r0x005911a4:
  uVar9 = 8;
code_r0x005911a8:
  uStack_8 = *(code **)((long)register0x00000008 + -8);
  unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
  goto code_r0x00187bd4;
}

