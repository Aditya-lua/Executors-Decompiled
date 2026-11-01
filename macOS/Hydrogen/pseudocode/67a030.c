
/* WARNING: Possible PIC construction at 0x0067a3b4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0067a3b8) */

undefined8 * FUN_0067a030(long param_1,long *param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  uint uVar8;
  long lVar9;
  undefined1 auVar10 [12];
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
  long lStack00000000000000d0;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
  lStack00000000000000d0 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((*(byte *)(param_2 + 0x12) & 1) == 0) {
    *(undefined8 *)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(undefined8 *)(param_1 + 8) = 0x1fffffffffffffff;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    in_stack_00000030 = 0x1fffffffffffffff;
    func_0x0069a9fc(&uStack0000000000000048);
    do {
      do {
        in_stack_00000010 = 0x1fffffffffffffff;
        in_stack_00000018 = 0;
        in_stack_00000020 = 0;
        func_0x00675c2c(&uStack0000000000000008,&uStack0000000000000048,(int)param_2[0x12]);
        if (((bRam0000000000a3d088 & 1) == 0) &&
           (iVar1 = ___cxa_guard_acquire(0xa3d088), iVar1 != 0)) {
          uRam0000000000a3d0a8 = 0;
          uRam0000000000a3d0b0 = 0;
          uRam0000000000a3d0a0 = 0x1fffffffffffffff;
          ___cxa_atexit(&SUB_0062a89c,0xa3d098,0);
          ___cxa_guard_release(0xa3d088);
        }
        func_0x006771a4(param_1,0xa3d098);
        func_0x006771a4(&uStack0000000000000028,&uStack0000000000000008);
        if ((int)param_2[0x12] != 1) {
          uVar8 = 1;
          do {
            uVar2 = (**(code **)(*param_2 + 0x90))(param_2,&uStack0000000000000028);
            func_0x006771a4(&uStack0000000000000028,uVar2);
            uVar2 = (**(code **)(*param_2 + 0x90))(param_2,param_1);
            func_0x006771a4(param_1,uVar2);
            uVar2 = (**(code **)(*param_2 + 0x80))(param_2,&uStack0000000000000028,param_3);
            (**(code **)(*param_2 + 0x48))(param_2,param_1,uVar2);
            (**(code **)(*param_2 + 0x48))(param_2,&uStack0000000000000028,&uStack0000000000000008);
            uVar8 = uVar8 + 1;
          } while (uVar8 <= (int)param_2[0x12] - 1U);
        }
        uVar5 = in_stack_00000010;
        if (in_stack_00000018 <= in_stack_00000010) {
          uVar5 = in_stack_00000018;
        }
        if (in_stack_00000020 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(in_stack_00000020 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
      } while (in_stack_00000038 == 0);
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
          puVar3 = (undefined8 *)0x0;
          if (in_stack_00000040 != 0) {
            if (uVar5 != 0) {
              do {
                *(undefined8 *)(in_stack_00000040 + -8 + uVar5 * 8) = 0;
                uVar5 = uVar5 - 1;
              } while (uVar5 != 0);
            }
            puVar3 = (undefined8 *)func_0x00611644();
          }
          if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack00000000000000d0) {
            return puVar3;
          }
          goto LAB_0067a348;
        }
        uVar5 = (ulong)((int)uVar6 + 1);
        uVar7 = uVar6;
      } while (uVar6 < in_stack_00000038);
    } while( true );
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != lStack00000000000000d0) {
LAB_0067a348:
    auVar10 = ___stack_chk_fail();
    if (auVar10._8_4_ == 0) {
      puVar3 = (undefined8 *)__Unwind_Resume(auVar10._0_8_);
    }
    else {
      func_0x0001753c(auVar10._0_8_);
      func_0x0062a89c(&uStack0000000000000008);
      puVar3 = &uStack0000000000000048;
    }
    *puVar3 = &UNK_00a14f18;
    if ((long *)puVar3[0xf] != (long *)0x0) {
      (**(code **)(*(long *)puVar3[0xf] + 8))();
    }
    uVar5 = puVar3[0xc];
    if ((ulong)puVar3[0xd] <= (ulong)puVar3[0xc]) {
      uVar5 = puVar3[0xd];
    }
    if ((undefined8 *)puVar3[0xe] == puVar3 + 7) {
      *(undefined1 *)((long)puVar3 + 0x59) = 0;
      for (; uVar5 != 0; uVar5 = uVar5 - 1) {
        *(undefined1 *)((long)puVar3 + uVar5 + 0x37) = 0;
      }
    }
    uVar5 = puVar3[4];
    if ((ulong)puVar3[5] <= (ulong)puVar3[4]) {
      uVar5 = puVar3[5];
    }
    if ((undefined8 *)puVar3[6] == puVar3 + 1) {
      *(undefined1 *)((long)puVar3 + 0x19) = 0;
      for (; uVar5 != 0; uVar5 = uVar5 - 1) {
        *(undefined1 *)((long)puVar3 + uVar5 + 7) = 0;
      }
    }
    return puVar3;
  }
  lVar9 = *(long *)(param_3 + 0x10);
  *(undefined8 *)(param_1 + 8) = 0x1fffffffffffffff;
  *(long *)(param_1 + 0x10) = lVar9;
  func_0x006108a0(lVar9);
  if (lVar9 == 0) {
    puVar3 = (undefined8 *)0x0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    puVar4 = *(undefined8 **)(param_3 + 0x18);
    if (puVar4 == (undefined8 *)0x0) goto code_r0x00679f68;
  }
  else {
    puVar3 = (undefined8 *)func_0x006115d0(lVar9 << 3);
    *(undefined8 **)(param_1 + 0x18) = puVar3;
    puVar4 = *(undefined8 **)(param_3 + 0x18);
    if (puVar3 == puVar4) goto code_r0x00679f68;
  }
  puVar3 = (undefined8 *)_memcpy(puVar3,puVar4,lVar9 << 3);
code_r0x00679f68:
  if (1 < (int)param_2[0x12] - 1U) {
    uVar8 = 0;
    do {
      uVar2 = (**(code **)(*param_2 + 0x90))(param_2,param_1);
      uVar2 = (**(code **)(*param_2 + 0x90))(param_2,uVar2);
      uVar2 = (**(code **)(*param_2 + 0x20))(param_2,uVar2,param_3);
      puVar3 = (undefined8 *)func_0x006771a4(param_1,uVar2);
      uVar8 = uVar8 + 1;
    } while (uVar8 < (int)param_2[0x12] - 1U >> 1);
  }
  return puVar3;
}

