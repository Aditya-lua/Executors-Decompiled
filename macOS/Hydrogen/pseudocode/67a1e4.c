
/* WARNING: Possible PIC construction at 0x0067a3b4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0067a3b8) */

undefined8 * FUN_0067a1e4(void)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long *unaff_x21;
  byte *unaff_x22;
  ulong unaff_x26;
  undefined8 *unaff_x27;
  uint uVar8;
  long unaff_x29;
  undefined1 auVar9 [12];
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined1 uStack0000000000000080;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  undefined1 *in_stack_000000b8;
  long *in_stack_000000c0;
  
  do {
    iVar2 = ___cxa_guard_acquire();
    if (iVar2 != 0) {
      unaff_x22[0x20] = 0;
      unaff_x22[0x21] = 0;
      unaff_x22[0x22] = 0;
      unaff_x22[0x23] = 0;
      unaff_x22[0x24] = 0;
      unaff_x22[0x25] = 0;
      unaff_x22[0x26] = 0;
      unaff_x22[0x27] = 0;
      unaff_x22[0x28] = 0;
      unaff_x22[0x29] = 0;
      unaff_x22[0x2a] = 0;
      unaff_x22[0x2b] = 0;
      unaff_x22[0x2c] = 0;
      unaff_x22[0x2d] = 0;
      unaff_x22[0x2e] = 0;
      unaff_x22[0x2f] = 0;
      *(ulong *)(unaff_x22 + 0x18) = unaff_x26;
      ___cxa_atexit();
      ___cxa_guard_release();
    }
    do {
      func_0x006771a4();
      func_0x006771a4(&uStack0000000000000028,&uStack0000000000000008);
      if ((int)unaff_x21[0x12] != 1) {
        uVar8 = 1;
        do {
          uVar3 = (**(code **)(*unaff_x21 + 0x90))();
          func_0x006771a4(&uStack0000000000000028,uVar3);
          (**(code **)(*unaff_x21 + 0x90))();
          func_0x006771a4();
          (**(code **)(*unaff_x21 + 0x80))();
          (**(code **)(*unaff_x21 + 0x48))();
          (**(code **)(*unaff_x21 + 0x48))();
          uVar8 = uVar8 + 1;
        } while (uVar8 <= (int)unaff_x21[0x12] - 1U);
      }
      if (in_stack_00000018 <= in_stack_00000010) {
        in_stack_00000010 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (in_stack_00000010 != 0) {
          do {
            *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
            in_stack_00000010 = in_stack_00000010 - 1;
          } while (in_stack_00000010 != 0);
        }
        func_0x00611644();
      }
      if (in_stack_00000038 != 0) {
        uVar5 = 1;
        uVar7 = 0;
        do {
          uVar6 = uVar5;
          if (*(long *)(in_stack_00000040 + uVar7 * 8) != 0) {
            uStack0000000000000048 = &UNK_00a14f18;
            if (in_stack_000000c0 != (long *)0x0) {
              (**(code **)(*in_stack_000000c0 + 8))();
            }
            uVar5 = in_stack_000000a8;
            if (in_stack_000000b0 <= in_stack_000000a8) {
              uVar5 = in_stack_000000b0;
            }
            if (in_stack_000000b8 == &uStack0000000000000080 && uVar5 != 0) {
              do {
                *(undefined1 *)((long)&uStack0000000000000078 + uVar5 + 7) = 0;
                uVar5 = uVar5 - 1;
              } while (uVar5 != 0);
            }
            uVar5 = in_stack_00000068;
            if (in_stack_00000070 <= in_stack_00000068) {
              uVar5 = in_stack_00000070;
            }
            if (uStack0000000000000078 == &uStack0000000000000050 && uVar5 != 0) {
              do {
                *(undefined1 *)(((ulong)&uStack0000000000000048 | 7) + uVar5) = 0;
                uVar5 = uVar5 - 1;
              } while (uVar5 != 0);
            }
            uVar5 = in_stack_00000030;
            if (in_stack_00000038 <= in_stack_00000030) {
              uVar5 = in_stack_00000038;
            }
            puVar4 = (undefined8 *)0x0;
            if (in_stack_00000040 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(in_stack_00000040 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              puVar4 = (undefined8 *)func_0x00611644();
            }
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
              return puVar4;
            }
            auVar9 = ___stack_chk_fail();
            if (auVar9._8_4_ == 0) {
              puVar4 = (undefined8 *)__Unwind_Resume(auVar9._0_8_);
            }
            else {
              func_0x0001753c(auVar9._0_8_);
              func_0x0062a89c(&uStack0000000000000008);
              puVar4 = &uStack0000000000000048;
            }
            *puVar4 = &UNK_00a14f18;
            if ((long *)puVar4[0xf] != (long *)0x0) {
              (**(code **)(*(long *)puVar4[0xf] + 8))();
            }
            uVar5 = puVar4[0xc];
            if ((ulong)puVar4[0xd] <= (ulong)puVar4[0xc]) {
              uVar5 = puVar4[0xd];
            }
            if ((undefined8 *)puVar4[0xe] == puVar4 + 7) {
              *(undefined1 *)((long)puVar4 + 0x59) = 0;
              for (; uVar5 != 0; uVar5 = uVar5 - 1) {
                *(undefined1 *)((long)puVar4 + uVar5 + 0x37) = 0;
              }
            }
            uVar5 = puVar4[4];
            if ((ulong)puVar4[5] <= (ulong)puVar4[4]) {
              uVar5 = puVar4[5];
            }
            if ((undefined8 *)puVar4[6] == puVar4 + 1) {
              *(undefined1 *)((long)puVar4 + 0x19) = 0;
              for (; uVar5 != 0; uVar5 = uVar5 - 1) {
                *(undefined1 *)((long)puVar4 + uVar5 + 7) = 0;
              }
            }
            return puVar4;
          }
          uVar5 = (ulong)((int)uVar6 + 1);
          uVar7 = uVar6;
        } while (uVar6 < in_stack_00000038);
      }
      lVar1 = unaff_x21[0x12];
      *unaff_x27 = 0;
      unaff_x27[1] = 0;
      func_0x00675c2c(&uStack0000000000000008,&uStack0000000000000048,(int)lVar1);
      in_stack_00000010 = unaff_x26;
    } while ((*unaff_x22 & 1) != 0);
  } while( true );
}

