
/* WARNING: Possible PIC construction at 0x00227b58: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00227bb0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00227c10: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00227bb4) */
/* WARNING: Removing unreachable block (ram,0x00227b5c) */
/* WARNING: Removing unreachable block (ram,0x00227c14) */

void FUN_00227ad0(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  long *unaff_x19;
  long *plVar6;
  undefined8 *unaff_x20;
  long *unaff_x22;
  long lVar7;
  undefined8 unaff_x29;
  long lVar8;
  long lVar9;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined1 uStack0000000000000140;
  
  if (unaff_x22[4] == 0) {
    *unaff_x20 = 0xb;
    lVar2 = *unaff_x22;
    *unaff_x22 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa698();
    }
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      plVar6 = (long *)(unaff_x19[1] + 8);
      do {
        lVar4 = plVar6[-1];
        if (lVar4 != 0) {
          lVar2 = *plVar6;
          uVar5 = 1;
          in_stack_00000138 = 0x227bb4;
          goto code_r0x00187bd4;
        }
        plVar6 = plVar6 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (*unaff_x19 != 0) {
      func_0x00187bd4(unaff_x19[1],*unaff_x19 * 0x18,8);
    }
    lVar2 = unaff_x19[5];
    if (lVar2 != 0) {
      plVar6 = (long *)(unaff_x19[4] + 8);
      do {
        lVar4 = plVar6[-1];
        if (lVar4 != -0x8000000000000000 && lVar4 != 0) {
          lVar2 = *plVar6;
          uVar5 = 1;
          in_stack_00000138 = 0x227c14;
          goto code_r0x00187bd4;
        }
        plVar6 = plVar6 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (unaff_x19[3] != 0) {
      lVar2 = unaff_x19[4];
      lVar4 = unaff_x19[3] * 0x18;
      uVar5 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000140;
      unaff_x29 = in_stack_00000130;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = in_stack_00000138;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar2,lVar4,uVar5);
      return;
    }
  }
  else {
    lVar2 = *unaff_x19;
    lVar8 = unaff_x19[1];
    lVar7 = unaff_x19[2];
    in_stack_00000068 = unaff_x19[4];
    uStack0000000000000060 = unaff_x19[3];
    in_stack_00000070 = unaff_x19[5];
    uStack0000000000000038 = unaff_x22;
    func_0x001da0e0(&uStack0000000000000080,&uStack0000000000000060);
    uVar5 = in_stack_00000088;
    if ((int)uStack0000000000000080 == 1) {
      unaff_x20[1] = in_stack_00000090;
      *unaff_x20 = in_stack_00000088;
      unaff_x20[2] = in_stack_00000098;
      if (lVar7 != 0) {
        plVar6 = (long *)(lVar8 + 8);
        do {
          lVar4 = plVar6[-1];
          if (lVar4 != 0) {
            lVar2 = *plVar6;
            uVar5 = 1;
            in_stack_00000138 = 0x227b5c;
            goto code_r0x00187bd4;
          }
          plVar6 = plVar6 + 3;
          lVar7 = lVar7 + -1;
        } while (lVar7 != 0);
      }
      if (lVar2 != 0) {
        func_0x00187bd4(lVar8,lVar2 * 0x18,8);
      }
      lVar2 = *unaff_x22;
      *unaff_x22 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001fa698(&uStack0000000000000038);
      }
    }
    else {
      in_stack_00000020 = in_stack_00000090;
      in_stack_00000018 = in_stack_00000088;
      in_stack_00000028 = in_stack_00000098;
      lVar7 = unaff_x19[8];
      lVar4 = unaff_x19[7];
      lVar9 = unaff_x19[10];
      lVar8 = unaff_x19[9];
      in_stack_00000008 = unaff_x19[1];
      in_stack_00000000 = *unaff_x19;
      in_stack_00000010 = unaff_x19[2];
      in_stack_00000088 = 1;
      uStack0000000000000080 = 1;
      in_stack_000000a8 = uVar5;
      in_stack_000000b8 = in_stack_00000098;
      in_stack_000000b0 = in_stack_00000090;
      lVar2 = unaff_x19[0xb];
      in_stack_00000090 = in_stack_00000000;
      in_stack_00000098 = in_stack_00000008;
      in_stack_000000a0 = in_stack_00000010;
      puVar3 = (undefined8 *)func_0x00187bd0(0x70,8);
      if (puVar3 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x70);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x227d54);
        (*pcVar1)();
      }
      puVar3[9] = lVar4;
      puVar3[8] = unaff_x22;
      puVar3[0xb] = lVar8;
      puVar3[10] = lVar7;
      puVar3[0xd] = CONCAT44(in_stack_000000e8._4_4_,(int)lVar2);
      puVar3[0xc] = lVar9;
      puVar3[1] = in_stack_00000088;
      *puVar3 = uStack0000000000000080;
      puVar3[3] = in_stack_00000098;
      puVar3[2] = in_stack_00000090;
      puVar3[5] = in_stack_000000a8;
      puVar3[4] = in_stack_000000a0;
      puVar3[7] = in_stack_000000b8;
      puVar3[6] = in_stack_000000b0;
      unaff_x20[1] = puVar3;
      unaff_x20[2] = &UNK_009c8370;
      *unaff_x20 = 0xc;
    }
  }
  return;
}

