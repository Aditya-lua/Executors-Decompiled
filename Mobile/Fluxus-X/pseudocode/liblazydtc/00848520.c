/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00848520
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00848520(long param_1,ulong *param_2,ulong *param_3)

{
  ulong uVar1;
  long lVar2;
  bool bVar3;
  byte bVar4;
  void *pvVar5;
  undefined8 uVar6;
  byte *pbVar7;
  ulong uVar8;
  ulong local_b0;
  ulong uStack_a8;
  void *local_a0;
  ulong local_98;
  ulong uStack_90;
  void *local_88;
  ulong local_80;
  ulong uStack_78;
  void *local_70;
  ulong local_68;
  ulong uStack_60;
  void *local_58;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*(char *)(param_1 + 0xa6) == '\x01') {
    bVar3 = ((byte)*param_2 & 1) == 0;
    uVar8 = (ulong)(byte)((byte)*param_2 >> 1);
    if (!bVar3) {
      uVar8 = param_2[1];
    }
    if ((*(byte *)(param_1 + 0xa5) & 1) == 0) {
      if (uVar8 != 0) {
        uVar8 = 0;
        do {
          uVar8 = uVar8 + 1;
          uVar1 = (ulong)(byte)((byte)*param_2 >> 1);
          if (((byte)*param_2 & 1) != 0) {
            uVar1 = param_2[1];
          }
        } while (uVar8 < uVar1);
      }
      uVar8 = (ulong)(byte)((byte)*param_3 >> 1);
      if (((byte)*param_3 & 1) != 0) {
        uVar8 = param_3[1];
      }
      if (uVar8 != 0) {
        uVar8 = 0;
        do {
          uVar8 = uVar8 + 1;
          uVar1 = (ulong)(byte)((byte)*param_3 >> 1);
          if (((byte)*param_3 & 1) != 0) {
            uVar1 = param_3[1];
          }
        } while (uVar8 < uVar1);
      }
    }
    else {
      if (uVar8 != 0) {
        uVar8 = 0;
        do {
          pbVar7 = (byte *)((long)param_2 + 1);
          if (!bVar3) {
            pbVar7 = (byte *)param_2[2];
          }
          bVar4 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))
                            (*(long **)(param_1 + 0x18),pbVar7[uVar8]);
          pbVar7 = (byte *)((long)param_2 + 1);
          if ((*param_2 & 1) != 0) {
            pbVar7 = (byte *)param_2[2];
          }
          pbVar7[uVar8] = bVar4;
          uVar8 = uVar8 + 1;
          bVar3 = ((byte)*param_2 & 1) == 0;
          uVar1 = (ulong)(byte)((byte)*param_2 >> 1);
          if (!bVar3) {
            uVar1 = param_2[1];
          }
        } while (uVar8 < uVar1);
      }
      bVar3 = ((byte)*param_3 & 1) == 0;
      uVar8 = (ulong)(byte)((byte)*param_3 >> 1);
      if (!bVar3) {
        uVar8 = param_3[1];
      }
      if (uVar8 != 0) {
        uVar8 = 0;
        do {
          pbVar7 = (byte *)((long)param_3 + 1);
          if (!bVar3) {
            pbVar7 = (byte *)param_3[2];
          }
          bVar4 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))
                            (*(long **)(param_1 + 0x18),pbVar7[uVar8]);
          pbVar7 = (byte *)((long)param_3 + 1);
          if ((*param_3 & 1) != 0) {
            pbVar7 = (byte *)param_3[2];
          }
          pbVar7[uVar8] = bVar4;
          uVar8 = uVar8 + 1;
          bVar3 = ((byte)*param_3 & 1) == 0;
          uVar1 = (ulong)(byte)((byte)*param_3 >> 1);
          if (!bVar3) {
            uVar1 = param_3[1];
          }
        } while (uVar8 < uVar1);
      }
    }
    uVar8 = param_2[1];
    pbVar7 = (byte *)param_2[2];
    if (((byte)*param_2 & 1) == 0) {
      pbVar7 = (byte *)((long)param_2 + 1);
      uVar8 = (ulong)(byte)((byte)*param_2 >> 1);
    }
    FUN_00849620(&local_98,param_1 + 0x10,pbVar7,pbVar7 + uVar8);
    uVar8 = param_3[1];
    pbVar7 = (byte *)param_3[2];
    if (((byte)*param_3 & 1) == 0) {
      pbVar7 = (byte *)((long)param_3 + 1);
      uVar8 = (ulong)(byte)((byte)*param_3 >> 1);
    }
                    /* try { // try from 0084881c to 0084882b has its CatchHandler @ 00848954 */
    FUN_00849620(&local_b0,param_1 + 0x10,pbVar7,pbVar7 + uVar8);
    local_70 = local_88;
    uStack_78 = uStack_90;
    uStack_90 = 0;
    local_88 = (void *)0x0;
    local_80 = local_98;
    uStack_60 = uStack_a8;
    local_68 = local_b0;
    local_58 = local_a0;
    local_b0 = 0;
    uStack_a8 = 0;
    local_a0 = (void *)0x0;
    local_98 = 0;
                    /* try { // try from 00848858 to 00848863 has its CatchHandler @ 0084892c */
    FUN_008494c8(param_1 + 0x58,&local_80);
    if ((local_68 & 1) != 0) {
      operator_delete(local_58,local_68 & 0xfffffffffffffffe);
    }
    if ((local_80 & 1) != 0) {
      operator_delete(local_70,local_80 & 0xfffffffffffffffe);
    }
    if ((local_b0 & 1) != 0) {
      operator_delete(local_a0,local_b0 & 0xfffffffffffffffe);
    }
    if ((local_98 & 1) != 0) {
      pvVar5 = local_88;
      uVar8 = local_98;
LAB_008488d8:
      operator_delete(pvVar5,uVar8 & 0xfffffffffffffffe);
    }
LAB_008488e0:
    if (*(long *)(lVar2 + 0x28) == local_48) {
      return;
    }
  }
  else {
    bVar4 = (byte)*param_2;
    uVar8 = (ulong)(bVar4 >> 1);
    if ((bVar4 & 1) != 0) {
      uVar8 = param_2[1];
    }
    if (uVar8 == 1) {
      uVar8 = (ulong)(byte)((byte)*param_3 >> 1);
      if (((byte)*param_3 & 1) != 0) {
        uVar8 = param_3[1];
      }
      if (uVar8 == 1) {
        if (*(char *)(param_1 + 0xa5) == '\x01') {
          pbVar7 = (byte *)param_2[2];
          if ((bVar4 & 1) == 0) {
            pbVar7 = (byte *)((long)param_2 + 1);
          }
          bVar4 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))
                            (*(long **)(param_1 + 0x18),*pbVar7);
          pbVar7 = (byte *)param_2[2];
          if ((*param_2 & 1) == 0) {
            pbVar7 = (byte *)((long)param_2 + 1);
          }
          *pbVar7 = bVar4;
          pbVar7 = (byte *)param_3[2];
          if ((*param_3 & 1) == 0) {
            pbVar7 = (byte *)((long)param_3 + 1);
          }
          bVar4 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))
                            (*(long **)(param_1 + 0x18),*pbVar7);
          pbVar7 = (byte *)param_3[2];
          if ((*param_3 & 1) == 0) {
            pbVar7 = (byte *)((long)param_3 + 1);
          }
          *pbVar7 = bVar4;
        }
        local_70 = (void *)param_2[2];
        uStack_78 = param_2[1];
        local_80 = *param_2;
        *param_2 = 0;
        param_2[1] = 0;
        param_2[2] = 0;
        uStack_60 = param_3[1];
        local_68 = *param_3;
        local_58 = (void *)param_3[2];
        *param_3 = 0;
        param_3[1] = 0;
        param_3[2] = 0;
                    /* try { // try from 00848740 to 0084874b has its CatchHandler @ 0084891c */
        FUN_008494c8(param_1 + 0x58,&local_80);
        if ((local_68 & 1) != 0) {
          operator_delete(local_58,local_68 & 0xfffffffffffffffe);
        }
        if ((local_80 & 1) != 0) {
          pvVar5 = local_70;
          uVar8 = local_80;
          goto LAB_008488d8;
        }
        goto LAB_008488e0;
      }
    }
    if (*(long *)(lVar2 + 0x28) == local_48) {
      uVar6 = FUN_00849790();
                    /* catch() { ... } // from try @ 00848740 with catch @ 0084891c */
      FUN_00846fec(&local_80);
      if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar6);
      }
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

