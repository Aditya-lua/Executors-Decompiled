/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092c424
 */

int curl_multi_perform(int *param_1,int *param_2)

{
  long lVar1;
  undefined8 uVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  long *plVar12;
  undefined1 auStack_d0 [4];
  undefined1 auStack_cc [4];
  undefined1 local_c8 [16];
  _union_1457 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  ulong local_98;
  _union_1457 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_c8 = FUN_00941cb8();
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    iVar4 = 1;
  }
  else if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
    local_98 = 0;
    uStack_a0 = 0;
    local_a8 = 0;
    uStack_b0 = 0;
    local_b8.sa_handler = (__sighandler_t)0x0;
    if (*(long *)(param_1 + 2) == 0) {
      uVar6 = 0;
      iVar4 = 0;
    }
    else {
      iVar4 = 0;
      lVar8 = *(long *)(param_1 + 2);
      do {
        lVar11 = *(long *)(lVar8 + 0x10);
        if (lVar8 != *(long *)(param_1 + 0x76)) {
          uVar7 = *(ulong *)(lVar8 + 0xa82);
          if (((uint)(uVar7 >> 0x1f) & 1) != (uint)(byte)local_98) {
            if ((byte)local_98 == 0) {
              sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
              uVar7 = *(ulong *)(lVar8 + 0xa82);
            }
            local_98 = CONCAT71(local_98._1_7_,(char)(uVar7 >> 0x1f)) & 0xffffffffffffff01;
            if (-1 < (int)uVar7) {
              sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_b8);
              local_90.sa_handler = local_b8.sa_handler;
              uStack_78 = uStack_a0;
              uStack_80 = local_a8;
              uStack_88 = 1;
              sigaction(0xd,(sigaction *)&local_90,(sigaction *)0x0);
            }
          }
          iVar3 = FUN_0092c7cc(param_1,local_c8,lVar8);
          if (iVar3 != 0) {
            iVar4 = iVar3;
          }
        }
        lVar8 = lVar11;
      } while (lVar11 != 0);
      uVar6 = (uint)(byte)local_98;
    }
    lVar8 = *(long *)(param_1 + 0x76);
    uVar7 = *(ulong *)(lVar8 + 0xa82);
    if (((uint)(uVar7 >> 0x1f) & 1) != uVar6) {
      if (uVar6 == 0) {
        sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
        uVar7 = *(ulong *)(lVar8 + 0xa82);
      }
      local_98 = CONCAT71(local_98._1_7_,(char)(uVar7 >> 0x1f)) & 0xffffffffffffff01;
      if (-1 < (int)uVar7) {
        sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_b8);
        local_90.sa_handler = local_b8.sa_handler;
        uStack_78 = uStack_a0;
        uStack_80 = local_a8;
        uStack_88 = 1;
        sigaction(0xd,(sigaction *)&local_90,(sigaction *)0x0);
      }
    }
    FUN_00910f38(param_1);
    if ((byte)local_98 == '\0') {
      sigaction(0xd,(sigaction *)&local_b8,(sigaction *)0x0);
    }
    do {
      while( true ) {
        uVar5 = FUN_0094152c(local_c8._0_8_,local_c8._8_8_,*(undefined8 *)(param_1 + 0x34),&local_90
                            );
        *(undefined8 *)(param_1 + 0x34) = uVar5;
        if (local_90.sa_handler == (__sighandler_t)0x0) goto LAB_0092c79c;
        lVar8 = *(long *)((long)local_90 + 0x30);
        if (*(int *)(lVar8 + 0x58) == 1) {
          uVar7 = FUN_0092ddf8(lVar8,local_c8,auStack_cc,auStack_d0);
          if ((uVar7 & 1) != 0) {
            if (((lVar8 != 0) && ((*(byte *)(lVar8 + 0xa85) >> 4 & 1) != 0)) &&
               ((*(long *)(lVar8 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar8 + 0x12a0) + 8)))))
            {
              FUN_00904c98(lVar8,"PENDING handle timeout");
            }
            *(undefined8 *)(lVar8 + 0x10) = 0;
            if (*(long *)(param_1 + 2) == 0) {
              *(undefined8 *)(lVar8 + 0x18) = 0;
              *(long *)(param_1 + 2) = lVar8;
            }
            else {
              lVar11 = *(long *)(param_1 + 4);
              *(long *)(lVar11 + 0x10) = lVar8;
              *(long *)(lVar8 + 0x18) = lVar11;
            }
            *(long *)(param_1 + 4) = lVar8;
            if (*(int *)(lVar8 + 0x58) != 3) {
              *(undefined4 *)(lVar8 + 0x58) = 3;
              FUN_009425cc(lVar8);
            }
            FUN_00925d80(param_1 + 0x10,lVar8 + 0x28,0);
            FUN_0092aff8(lVar8,0,8);
          }
          lVar8 = *(long *)((long)local_90 + 0x30);
        }
        uVar2 = local_c8._8_8_;
        uVar5 = local_c8._0_8_;
        if (*(long **)(lVar8 + 0xe10) != (long *)0x0) break;
LAB_0092c78c:
        *(undefined8 *)(lVar8 + 0xdc8) = 0;
        *(undefined4 *)(lVar8 + 0xdd0) = 0;
        if (local_90.sa_handler == (__sighandler_t)0x0) goto LAB_0092c79c;
      }
      plVar10 = *(long **)(lVar8 + 0xe10);
      do {
        lVar9 = *plVar10;
        plVar12 = (long *)plVar10[2];
        lVar11 = FUN_00941e38(*(undefined8 *)(lVar9 + 0x18),*(undefined8 *)(lVar9 + 0x20),uVar5,
                              uVar2);
        if (0 < lVar11) break;
        FUN_00925d80((long *)(lVar8 + 0xe10),plVar10,0);
        plVar10 = plVar12;
      } while (plVar12 != (long *)0x0);
      if (*(long *)(lVar8 + 0xe10) == 0) goto LAB_0092c78c;
      uVar5 = *(undefined8 *)(lVar9 + 0x18);
      *(undefined8 *)(lVar8 + 0xdd0) = *(undefined8 *)(lVar9 + 0x20);
      *(undefined8 *)(lVar8 + 0xdc8) = uVar5;
      uVar5 = FUN_00941454(*(undefined8 *)(lVar8 + 0xdc8),*(undefined8 *)(lVar8 + 0xdd0),
                           *(undefined8 *)(param_1 + 0x34),lVar8 + 0xdd8);
      *(undefined8 *)(param_1 + 0x34) = uVar5;
    } while (local_90.sa_handler != (__sighandler_t)0x0);
LAB_0092c79c:
    if (param_2 != (int *)0x0) {
      *param_2 = param_1[7];
    }
    if (iVar4 < 1) {
      iVar4 = FUN_0092b1f4(param_1);
    }
  }
  else {
    iVar4 = 8;
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

