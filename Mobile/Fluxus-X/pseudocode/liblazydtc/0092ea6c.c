/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ea6c
 */

/* WARNING: Removing unreachable block (ram,0x0092ee9c) */

ulong FUN_0092ea6c(long param_1,ulong param_2,int param_3,undefined4 param_4,undefined4 *param_5)

{
  ulong *puVar1;
  long lVar2;
  bool bVar3;
  undefined8 uVar4;
  uint uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  undefined1 local_d0 [16];
  long local_c0;
  _union_1457 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  ulong local_98;
  _union_1457 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_d0 = FUN_00941cb8();
  if ((param_2 & 1) == 0) {
    if (param_3 == -1) {
      bVar3 = false;
      *(undefined8 *)(param_1 + 0x218) = 0;
      *(undefined8 *)(param_1 + 0x210) = 0;
    }
    else {
      local_b8._0_4_ = param_3;
      lVar7 = FUN_009167a8(param_1 + 0xf8,&local_b8,4);
      if (lVar7 == 0) {
        FUN_0091107c(param_1,param_3,param_4);
        bVar3 = false;
      }
      else {
        FUN_00916a74(lVar7,&local_b8);
        lVar7 = FUN_00916a80(&local_b8);
        bVar3 = false;
        while (lVar7 != 0) {
          lVar7 = *(long *)(lVar7 + 0x18);
          if (lVar7 == *(long *)(param_1 + 0x1d8)) {
            bVar3 = true;
          }
          else {
            if ((*(long *)(lVar7 + 0x20) != 0) &&
               ((*(byte *)(*(long *)(*(long *)(lVar7 + 0x20) + 0x3a8) + 0x94) >> 3 & 1) == 0)) {
              *(byte *)(lVar7 + 0x131b) = *(byte *)(lVar7 + 0x131b) | (byte)param_4;
            }
            FUN_0092aff8(lVar7,0,8);
          }
          lVar7 = FUN_00916a80(&local_b8);
        }
        auVar13 = FUN_00941cb8();
        local_d0 = auVar13;
      }
    }
    lVar7 = 0;
    uVar8 = 0;
    local_98 = 0;
    uStack_a0 = 0;
    local_a8 = 0;
    uStack_b0 = 0;
    local_b8.sa_handler = (__sighandler_t)0x0;
    do {
      while( true ) {
        if (lVar7 == *(long *)(param_1 + 0x1d8)) {
          bVar3 = true;
        }
        else if (lVar7 != 0) {
          uVar8 = *(ulong *)(lVar7 + 0xa82);
          if (((uint)(uVar8 >> 0x1f) & 1) != (uint)(byte)local_98) {
            if ((byte)local_98 == 0) {
              sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
              uVar8 = *(ulong *)(lVar7 + 0xa82);
            }
            local_98 = CONCAT71(local_98._1_7_,(char)(uVar8 >> 0x1f)) & 0xffffffffffffff01;
            if (-1 < (int)uVar8) {
              sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_b8);
              local_90.sa_handler = local_b8.sa_handler;
              uStack_78 = uStack_a0;
              local_80 = local_a8;
              uStack_88 = 1;
              sigaction(0xd,(sigaction *)&local_90,(sigaction *)0x0);
            }
          }
          uVar6 = FUN_0092c7cc(param_1,local_d0,lVar7);
          uVar8 = uVar6 & 0xffffffff;
          if ((int)uVar6 < 1) {
            FUN_0092bcf8(lVar7,&local_90);
            uVar6 = FUN_0092dfc0(param_1,lVar7,&local_90,(undefined8 *)(lVar7 + 0x90));
            uVar8 = uVar6 & 0xffffffff;
            if ((int)uVar6 != 0) goto LAB_0092eda0;
            *(undefined8 *)(lVar7 + 0xa8) = uStack_78;
            *(undefined8 *)(lVar7 + 0xa0) = local_80;
            *(undefined8 *)(lVar7 + 0x98) = uStack_88;
            *(undefined8 *)(lVar7 + 0x90) = local_90.sa_handler;
          }
        }
        uVar6 = FUN_0094152c(local_d0._0_8_,local_d0._8_8_,*(undefined8 *)(param_1 + 0xd0),&local_c0
                            );
        uVar4 = local_d0._8_8_;
        uVar12 = local_d0._0_8_;
        *(ulong *)(param_1 + 0xd0) = uVar6;
        if (local_c0 == 0) goto LAB_0092eda0;
        lVar7 = *(long *)(local_c0 + 0x30);
        if (*(long **)(lVar7 + 0xe10) != (long *)0x0) break;
LAB_0092ed90:
        *(undefined8 *)(lVar7 + 0xdc8) = 0;
        *(undefined4 *)(lVar7 + 0xdd0) = 0;
        if (local_c0 == 0) goto LAB_0092eda0;
      }
      plVar11 = *(long **)(lVar7 + 0xe10);
      do {
        lVar10 = *plVar11;
        plVar9 = (long *)plVar11[2];
        uVar6 = FUN_00941e38(*(undefined8 *)(lVar10 + 0x18),*(undefined8 *)(lVar10 + 0x20),uVar12,
                             uVar4);
        if (0 < (long)uVar6) break;
        uVar6 = FUN_00925d80((long *)(lVar7 + 0xe10),plVar11,0);
        plVar11 = plVar9;
      } while (plVar9 != (long *)0x0);
      if (*(long *)(lVar7 + 0xe10) == 0) goto LAB_0092ed90;
      uVar12 = *(undefined8 *)(lVar10 + 0x18);
      *(undefined8 *)(lVar7 + 0xdd0) = *(undefined8 *)(lVar10 + 0x20);
      *(undefined8 *)(lVar7 + 0xdc8) = uVar12;
      uVar6 = FUN_00941454(*(undefined8 *)(lVar7 + 0xdc8),*(undefined8 *)(lVar7 + 0xdd0),
                           *(undefined8 *)(param_1 + 0xd0),lVar7 + 0xdd8);
      *(ulong *)(param_1 + 0xd0) = uVar6;
    } while (local_c0 != 0);
LAB_0092eda0:
    if (bVar3) {
      puVar1 = (ulong *)(*(long *)(param_1 + 0x1d8) + 0xa82);
      uVar6 = *puVar1;
      if (((uint)(uVar6 >> 0x1f) & 1) != (uint)(byte)local_98) {
        if ((byte)local_98 == 0) {
          sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
          uVar6 = *puVar1;
        }
        local_98 = CONCAT71(local_98._1_7_,(char)(uVar6 >> 0x1f)) & 0xffffffffffffff01;
        if (-1 < (int)uVar6) {
          sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_b8);
          local_90.sa_handler = local_b8.sa_handler;
          uStack_78 = uStack_a0;
          local_80 = local_a8;
          uStack_88 = 1;
          sigaction(0xd,(sigaction *)&local_90,(sigaction *)0x0);
        }
      }
      uVar6 = FUN_00910f38(param_1);
    }
    if ((byte)local_98 == 0) {
      uVar5 = sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
      uVar6 = (ulong)uVar5;
    }
    if (param_5 != (undefined4 *)0x0) {
      *param_5 = *(undefined4 *)(param_1 + 0x1c);
    }
  }
  else {
    uVar6 = curl_multi_perform(param_1,param_5);
    uVar8 = uVar6 & 0xffffffff;
    if (((int)uVar6 != 1) && ((int)uVar6 == 0)) {
      for (lVar7 = *(long *)(param_1 + 8); lVar7 != 0; lVar7 = *(long *)(lVar7 + 0x10)) {
        FUN_0092bcf8(lVar7,&local_b8);
        uVar6 = FUN_0092dfc0(param_1,lVar7,&local_b8,(undefined8 *)(lVar7 + 0x90));
        uVar8 = uVar6 & 0xffffffff;
        if ((int)uVar6 != 0) break;
        *(undefined8 *)(lVar7 + 0xa8) = uStack_a0;
        *(undefined8 *)(lVar7 + 0xa0) = local_a8;
        *(undefined8 *)(lVar7 + 0x98) = uStack_b0;
        *(undefined8 *)(lVar7 + 0x90) = local_b8.sa_handler;
      }
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return uVar8;
}

