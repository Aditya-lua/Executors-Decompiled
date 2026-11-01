
/* WARNING: Possible PIC construction at 0x004fd6d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd738: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd76c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd79c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd7d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fda28: Changing call to branch */

void FUN_004fd6c8(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long lVar4;
  long lVar5;
  undefined8 *unaff_x29;
  undefined8 uVar6;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined1 auStack_90 [128];
  
  puVar1 = (undefined1 *)register0x00000008;
  if (param_1 == 0) {
    if (*(long *)(unaff_x19 + 0xb0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xb8),*(long *)(unaff_x19 + 0xb0) << 5,8);
    }
    if (*(long *)(unaff_x19 + 200) == 0) {
      if (*(long *)(unaff_x19 + 0xe0) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xe8),*(long *)(unaff_x19 + 0xe0) << 5,8);
      }
      if (*(long *)(unaff_x19 + 0xf8) == 0) {
        if (*(long *)(unaff_x19 + 0x110) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x118),*(long *)(unaff_x19 + 0x110) << 4,8);
        }
        if (*(long *)(unaff_x19 + 0x128) == 0) {
          if (*(long *)(unaff_x19 + 0x140) != 0) {
            func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x148),*(long *)(unaff_x19 + 0x140) << 3,4);
          }
          if (*(long *)(unaff_x19 + 0x158) == 0) {
            if (*(long *)(unaff_x19 + 0x170) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x178),*(long *)(unaff_x19 + 0x170) << 4,8
                             );
            }
            if (*(long *)(unaff_x19 + 0x188) == 0) {
              if (*(long *)(unaff_x19 + 0x1a0) != 0) {
                func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1a8),*(long *)(unaff_x19 + 0x1a0) << 4
                                ,8);
              }
              puVar1 = auStack_90 + 0x80;
              unaff_x29 = &uStack0000000000000020;
              if (*(long *)(unaff_x19 + 0x1b8) == 0) {
                lVar3 = *(long *)(unaff_x19 + 0x1d8);
                if (*(long *)(unaff_x19 + 0x1e0) != 0) {
                  lVar5 = 0;
                  lVar4 = 1 - *(long *)(unaff_x19 + 0x1e0);
                  do {
                    lVar2 = **(long **)(lVar3 + lVar5);
                    **(long **)(lVar3 + lVar5) = lVar2 + -1;
                    LORelease();
                    if (lVar2 == 1) {
                      DataMemoryBarrier(2,1);
                      func_0x00525414(lVar3 + lVar5);
                    }
                    lVar5 = lVar5 + 0x20;
                    lVar4 = lVar4 + 1;
                  } while (lVar4 != 1);
                }
                if (*(long *)(unaff_x19 + 0x1d0) == 0) {
                  return;
                }
                param_1 = *(long *)(unaff_x19 + 0x1d0) << 5;
                puVar1 = &uStack0000000000000030;
                unaff_x29 = uStack0000000000000020;
                uVar6 = in_stack_00000028;
              }
              else {
                lVar3 = *(long *)(unaff_x19 + 0x1c0);
                param_1 = *(long *)(unaff_x19 + 0x1b8) << 4;
                uVar6 = 0x4fda2c;
              }
            }
            else {
              lVar3 = *(long *)(unaff_x19 + 400);
              param_1 = *(long *)(unaff_x19 + 0x188) * 0x30;
              uVar6 = 0x4fd7d4;
            }
          }
          else {
            lVar3 = *(long *)(unaff_x19 + 0x160);
            param_1 = *(long *)(unaff_x19 + 0x158) << 4;
            uVar6 = 0x4fd7a0;
          }
        }
        else {
          lVar3 = *(long *)(unaff_x19 + 0x130);
          param_1 = *(long *)(unaff_x19 + 0x128) * 0x18;
          uVar6 = 0x4fd770;
        }
      }
      else {
        lVar3 = *(long *)(unaff_x19 + 0x100);
        param_1 = *(long *)(unaff_x19 + 0xf8) << 4;
        uVar6 = 0x4fd73c;
      }
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0xd0);
      param_1 = *(long *)(unaff_x19 + 200) << 5;
      uVar6 = 0x4fd70c;
    }
  }
  else {
    lVar3 = *(long *)(unaff_x19 + 0xa0);
    param_1 = param_1 << 4;
    uVar6 = 0x4fd6dc;
  }
  *(undefined8 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined8 *)(puVar1 + -8) = uVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,param_1,8);
  return;
}

