/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00847c68
 */

char * FUN_00847c68(undefined8 param_1,char *param_2,char *param_3,long param_4)

{
  ulong uVar1;
  undefined7 *puVar2;
  undefined1 uVar3;
  long lVar4;
  ushort uVar5;
  short sVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long lVar9;
  undefined1 *puVar10;
  char *pcVar11;
  long unaff_x20;
  undefined8 unaff_x21;
  byte local_80;
  undefined7 uStack_7f;
  ulong uStack_78;
  void *local_70;
  byte local_68;
  undefined7 uStack_67;
  ulong local_60;
  undefined7 *local_58;
  ushort local_4c [2];
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  lVar9 = ((long)param_3 - (long)param_2) + -2;
  if (1 < (long)param_3 - (long)param_2) {
    pcVar11 = param_2;
    while ((unaff_x20 = param_4, unaff_x21 = param_1, *pcVar11 != '=' || (pcVar11[1] != ']'))) {
      if (lVar9 == 0) goto LAB_00847ed0;
      lVar9 = lVar9 + -1;
      pcVar11 = pcVar11 + 1;
    }
    if (pcVar11 != param_3) {
      FUN_00848aa8(&local_68,param_1,param_2,pcVar11,0);
      uVar1 = (ulong)(local_68 >> 1);
      if ((local_68 & 1) != 0) {
        uVar1 = local_60;
      }
      if (uVar1 == 0) goto LAB_00847ee4;
      puVar2 = local_58;
      if ((local_68 & 1) == 0) {
        puVar2 = &uStack_67;
      }
                    /* try { // try from 00847d14 to 00847d27 has its CatchHandler @ 00847f1c */
      FUN_00848d68(&local_80,param_1,puVar2,(undefined1 *)((long)puVar2 + uVar1),0);
      uVar1 = (ulong)(local_80 >> 1);
      if ((local_80 & 1) != 0) {
        uVar1 = uStack_78;
      }
      if (uVar1 == 0) {
        uVar1 = (ulong)(local_68 >> 1);
        if ((local_68 & 1) != 0) {
          uVar1 = local_60;
        }
        if (uVar1 == 2) {
          puVar10 = (undefined1 *)((ulong)&local_68 | 2);
          puVar2 = (undefined7 *)((ulong)&local_68 | 1);
          if ((local_68 & 1) != 0) {
            puVar10 = (undefined1 *)((long)local_58 + 1);
            puVar2 = local_58;
          }
          uVar3 = *puVar10;
          if (*(char *)(param_4 + 0xa5) == '\x01') {
            uVar5 = (**(code **)(**(long **)(param_4 + 0x18) + 0x28))();
            sVar6 = (**(code **)(**(long **)(param_4 + 0x18) + 0x28))
                              (*(long **)(param_4 + 0x18),uVar3);
            local_4c[0] = uVar5 & 0xff | sVar6 << 8;
            FUN_008497f0(param_4 + 0x70,local_4c);
          }
          else {
            local_4c[0] = CONCAT11(uVar3,*(undefined1 *)puVar2);
            if (*(char *)(param_4 + 0xa6) == '\x01') {
                    /* try { // try from 00847eac to 00847ecb has its CatchHandler @ 00847f24 */
              FUN_008497f0(param_4 + 0x70,local_4c);
            }
            else {
              FUN_008497f0(param_4 + 0x70,local_4c);
            }
          }
        }
        else {
          if (uVar1 != 1) goto LAB_00847ef8;
          puVar2 = (undefined7 *)((ulong)&local_68 | 1);
          if ((local_68 & 1) != 0) {
            puVar2 = local_58;
          }
                    /* try { // try from 00847d9c to 00847e1f has its CatchHandler @ 00847f24 */
          FUN_0084612c(param_4,*(undefined1 *)puVar2);
        }
      }
      else {
        puVar7 = *(undefined8 **)(param_4 + 0x90);
        if (puVar7 < *(undefined8 **)(param_4 + 0x98)) {
          if ((local_80 & 1) == 0) {
            puVar7[2] = local_70;
            puVar7[1] = uStack_78;
            *puVar7 = CONCAT71(uStack_7f,local_80);
          }
          else {
                    /* try { // try from 00847e28 to 00847e2f has its CatchHandler @ 00847f0c */
            FUN_007ff40c(puVar7,local_70);
          }
          puVar7 = puVar7 + 3;
          *(undefined8 **)(param_4 + 0x90) = puVar7;
        }
        else {
          puVar7 = (undefined8 *)FUN_00848f3c(param_4 + 0x88,&local_80);
        }
        *(undefined8 **)(param_4 + 0x90) = puVar7;
      }
      if ((local_80 & 1) != 0) {
        operator_delete(local_70,CONCAT71(uStack_7f,local_80) & 0xfffffffffffffffe);
      }
      if ((local_68 & 1) != 0) {
        operator_delete(local_58,CONCAT71(uStack_67,local_68) & 0xfffffffffffffffe);
      }
      if (*(long *)(lVar4 + 0x28) == local_48) {
        return pcVar11 + 2;
      }
      goto LAB_00847f70;
    }
  }
LAB_00847ed0:
  if (*(long *)(lVar4 + 0x28) == local_48) {
    FUN_00847644();
    param_4 = unaff_x20;
    param_1 = unaff_x21;
LAB_00847ee4:
    if (*(long *)(lVar4 + 0x28) == local_48) {
                    /* try { // try from 00847ef4 to 00847ef7 has its CatchHandler @ 00847f18 */
      FUN_00848a5c();
LAB_00847ef8:
      if (*(long *)(lVar4 + 0x28) == local_48) {
                    /* try { // try from 00847f08 to 00847f0b has its CatchHandler @ 00847f24 */
        uVar8 = FUN_00848a5c();
                    /* catch() { ... } // from try @ 00847e28 with catch @ 00847f0c */
        *(undefined8 *)(param_4 + 0x90) = param_1;
        if ((local_80 & 1) != 0) {
          operator_delete(local_70,CONCAT71(uStack_7f,local_80) & 0xfffffffffffffffe);
        }
        if ((local_68 & 1) != 0) {
          operator_delete(local_58,CONCAT71(uStack_67,local_68) & 0xfffffffffffffffe);
        }
        if (*(long *)(lVar4 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar8);
        }
      }
    }
  }
LAB_00847f70:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

