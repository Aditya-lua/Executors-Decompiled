/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910604
 */

void FUN_00910604(ulong param_1)

{
  ulong *puVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  undefined8 *puVar6;
  long *plVar7;
  ulong uVar8;
  long lVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  long local_e8;
  undefined8 local_e0;
  undefined4 local_d8;
  _union_1457 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  ulong local_a8;
  _union_1457 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_e8 = *(long *)(param_1 + 0x80);
  if (local_e8 == 0) goto LAB_009109cc;
  local_a8 = 0;
  uStack_b0 = 0;
  local_b8 = 0;
  uStack_c0 = 0;
  local_c8.sa_handler = (__sighandler_t)0x0;
  FUN_00916a74(param_1,&local_a0);
  do {
    lVar5 = FUN_00916a80(&local_a0);
    if (lVar5 == 0) goto LAB_00910780;
    plVar7 = *(long **)(*(long *)(lVar5 + 0x18) + 0x10);
  } while (plVar7 == (long *)0x0);
  lVar5 = *plVar7;
  while (lVar5 != 0) {
    FUN_0090ff1c(param_1,lVar5);
    puVar1 = (ulong *)(local_e8 + 0xa82);
    uVar8 = *puVar1;
    if (((uint)(uVar8 >> 0x1f) & 1) != (uint)(byte)local_a8) {
      if ((byte)local_a8 == 0) {
        sigaction(0xd,(sigaction *)&local_c8,(sigaction *)0x0);
        uVar8 = *puVar1;
      }
      local_a8 = CONCAT71(local_a8._1_7_,(char)(uVar8 >> 0x1f)) & 0xffffffffffffff01;
      if (-1 < (int)uVar8) {
        sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_c8);
        local_a0.sa_handler = local_c8.sa_handler;
        uStack_88 = uStack_b0;
        uStack_90 = local_b8;
        uStack_98 = 1;
        sigaction(0xd,(sigaction *)&local_a0,(sigaction *)0x0);
      }
    }
    FUN_00908c4c(lVar5,1);
    lVar9 = *(long *)(param_1 + 0x80);
    uVar10 = *(undefined8 *)(lVar9 + 0xc38);
    if (*(long *)(lVar9 + 0xd0) != 0) {
      FUN_0093f628(lVar9,5,2);
    }
    FUN_0090ff1c(uVar10,lVar5);
    if (*(long *)(lVar9 + 0xd0) != 0) {
      FUN_0093f680(lVar9,5);
    }
    FUN_00910b38(param_1,*(undefined8 *)(param_1 + 0x80),lVar5,0);
    FUN_00916a74(param_1,&local_a0);
    do {
      lVar5 = FUN_00916a80(&local_a0);
      if (lVar5 == 0) goto LAB_00910780;
      plVar7 = *(long **)(*(long *)(lVar5 + 0x18) + 0x10);
    } while (plVar7 == (long *)0x0);
    lVar5 = *plVar7;
  }
LAB_00910780:
  lVar5 = *(long *)(param_1 + 0x80);
  auVar11 = FUN_00941cb8();
  if (lVar5 == 0) {
    puVar6 = *(undefined8 **)(param_1 + 0x58);
    if (puVar6 != (undefined8 *)0x0) {
      *(byte *)(param_1 + 0x78) = *(byte *)(param_1 + 0x78) | 1;
      do {
        uVar10 = *puVar6;
        FUN_00925d80((long *)(param_1 + 0x58),puVar6,0);
        FUN_009103b0(0,uVar10,param_1,0);
        puVar6 = *(undefined8 **)(param_1 + 0x58);
      } while (puVar6 != (undefined8 *)0x0);
      goto LAB_00910920;
    }
  }
  else {
    FUN_00916a74(param_1,&local_a0);
    do {
      lVar5 = FUN_00916a80(&local_a0);
      if (lVar5 == 0) goto LAB_00910850;
      plVar7 = *(long **)(*(long *)(lVar5 + 0x18) + 0x10);
    } while (plVar7 == (long *)0x0);
    while (lVar5 = *plVar7, lVar5 != 0) {
      FUN_0090ff1c(param_1,lVar5);
      FUN_00910b38(param_1,0,lVar5,0);
      FUN_00916a74(param_1,&local_a0);
      do {
        lVar5 = FUN_00916a80(&local_a0);
        if (lVar5 == 0) goto LAB_00910850;
        plVar7 = *(long **)(*(long *)(lVar5 + 0x18) + 0x10);
      } while (plVar7 == (long *)0x0);
    }
LAB_00910850:
    lVar5 = *(long *)(param_1 + 0x58);
    while( true ) {
      if ((lVar5 == 0) || (FUN_00910f40(param_1), *(long *)(param_1 + 0x58) == 0))
      goto LAB_009108dc;
      auVar12 = FUN_00941cb8();
      lVar5 = FUN_00941d54(auVar12._0_8_,auVar12._8_8_,auVar11._0_8_,auVar11._8_8_);
      if (-1 < lVar5) goto LAB_009108dc;
      FUN_00934a74(&local_e0,&local_a0,10);
      iVar3 = FUN_00910d9c(param_1,&local_e0);
      if (iVar3 != 0) break;
      iVar3 = -(int)lVar5;
      if (999 < iVar3) {
        iVar3 = 1000;
      }
      FUN_0093475c(local_e0,local_d8,(long)iVar3);
      FUN_00934a90(&local_e0);
      lVar5 = *(long *)(param_1 + 0x58);
    }
    FUN_00934a90(&local_e0);
LAB_009108dc:
    puVar6 = *(undefined8 **)(param_1 + 0x58);
    if (puVar6 != (undefined8 *)0x0) {
      *(byte *)(param_1 + 0x78) = *(byte *)(param_1 + 0x78) | 1;
      do {
        uVar10 = *puVar6;
        FUN_00925d80((long *)(param_1 + 0x58),puVar6,0);
        FUN_009103b0(0,uVar10,param_1,0);
        puVar6 = *(undefined8 **)(param_1 + 0x58);
      } while (puVar6 != (undefined8 *)0x0);
LAB_00910920:
      *(byte *)(param_1 + 0x78) = *(byte *)(param_1 + 0x78) & 0xfe;
    }
  }
  puVar1 = (ulong *)(local_e8 + 0xa82);
  uVar8 = *puVar1;
  if (((uint)(uVar8 >> 0x1f) & 1) != (uint)(byte)local_a8) {
    if ((byte)local_a8 == 0) {
      sigaction(0xd,(sigaction *)&local_c8,(sigaction *)0x0);
      uVar8 = *puVar1;
    }
    local_a8 = CONCAT71(local_a8._1_7_,(char)(uVar8 >> 0x1f)) & 0xffffffffffffff01;
    if (-1 < (int)uVar8) {
      sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_c8);
      local_a0.sa_handler = local_c8.sa_handler;
      uStack_88 = uStack_b0;
      uStack_90 = local_b8;
      uStack_98 = 1;
      sigaction(0xd,(sigaction *)&local_a0,(sigaction *)0x0);
    }
  }
  FUN_00917c84(local_e8,*(undefined8 *)(local_e8 + 0xb0));
  param_1 = FUN_00946590(&local_e8);
  if ((byte)local_a8 == '\0') {
    uVar4 = sigaction(0xd,(sigaction *)&local_c8,(sigaction *)0x0);
    param_1 = (ulong)uVar4;
  }
LAB_009109cc:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return;
}

