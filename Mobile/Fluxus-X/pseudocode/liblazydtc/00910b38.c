/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910b38
 */

void FUN_00910b38(long param_1,long param_2,long param_3,uint param_4)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  uint uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  char local_ac [4];
  _union_1457 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  _union_1457 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (param_2 == 0) {
    param_2 = *(long *)(param_1 + 0x80);
  }
  local_ac[0] = '\0';
  if ((*(long *)(param_3 + 1000) != 0) && ((param_4 & 1) == 0)) goto LAB_00910d48;
  uVar6 = (uint)(*(char *)(param_3 + 0x575) != '\0');
  *(ulong *)(param_3 + 0x3a0) =
       *(ulong *)(param_3 + 0x3a0) & 0xffffffff80000000 |
       *(ulong *)(param_3 + 0x3a0) & 0x3fffffff | ((ulong)(uVar6 | param_4) & 1) << 0x1e;
  if (uVar6 == 0 && (param_4 & 1) == 0) {
    FUN_0092bb60(param_2,param_3);
    FUN_009111d8(param_2,param_3,local_ac);
    FUN_0092bab8(param_2);
    if ((local_ac[0] == '\0') && ((*(byte *)(param_1 + 0x78) & 1) == 0)) {
      if (*(long *)(param_2 + 0xc0) != 0) {
        lVar7 = *(long *)(*(long *)(param_2 + 0xc0) + 0x1f8);
        if (((0 < lVar7) && (lVar4 = FUN_00925eb0(param_1 + 0x58), lVar4 <= lVar7)) &&
           ((*(byte *)(param_1 + 0x78) & 1) == 0)) {
          puVar5 = *(undefined8 **)(param_1 + 0x58);
          if (puVar5 != (undefined8 *)0x0) {
            uVar8 = *puVar5;
            FUN_00925d80((long *)(param_1 + 0x58),puVar5,0);
            local_88 = 0;
            uStack_90 = 0;
            local_98 = 0;
            uStack_a0 = 0;
            local_a8.sa_handler = (__sighandler_t)0x0;
            piVar1 = (int *)(*(long *)(param_1 + 0x80) + 0xa82);
            if (*piVar1 < 0) {
              sigaction(0xd,(sigaction *)&local_a8,(sigaction *)0x0);
              iVar3 = *piVar1;
              local_88 = CONCAT71(local_88._1_7_,(byte)((uint)iVar3 >> 0x1f));
              if (-1 < iVar3) {
                sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_a8);
                local_80.sa_handler = local_a8.sa_handler;
                uStack_68 = uStack_90;
                uStack_70 = local_98;
                uStack_78 = 1;
                sigaction(0xd,(sigaction *)&local_80,(sigaction *)0x0);
              }
            }
            FUN_009103b0(0,uVar8,param_1,0);
            if ((char)local_88 == '\0') {
              sigaction(0xd,(sigaction *)&local_a8,(sigaction *)0x0);
            }
          }
        }
        if ((*(long *)(param_2 + 0xc0) != 0) && (*(long *)(*(long *)(param_2 + 0xc0) + 0x80) != 0))
        {
          *(undefined8 *)(param_3 + 0x288) = 0;
          *(undefined8 *)(param_3 + 0x280) = 0;
          *(undefined8 *)(param_3 + 0x298) = 0;
          *(undefined8 *)(param_3 + 0x290) = 0;
          uVar9 = *(undefined8 *)(param_1 + 0x80);
          uVar8 = *(undefined8 *)(param_2 + 0xc0);
          uStack_90 = 0;
          local_98 = 0;
          uStack_a0 = 0;
          local_a8.sa_handler = (__sighandler_t)0x0;
          FUN_0092bb60(uVar9,param_3);
          FUN_00907984(uVar9,&local_a8);
          FUN_0092bab8(uVar9);
          iVar3 = FUN_0092dfc0(uVar8,uVar9,&local_a8,(undefined8 *)(param_3 + 0x280));
          if (iVar3 != 0) goto LAB_00910d34;
          *(undefined8 *)(param_3 + 0x298) = uStack_90;
          *(undefined8 *)(param_3 + 0x290) = local_98;
          *(undefined8 *)(param_3 + 0x288) = uStack_a0;
          *(undefined8 *)(param_3 + 0x280) = local_a8.sa_handler;
        }
      }
      FUN_00925d10(param_1 + 0x58,param_3,param_3);
      goto LAB_00910d48;
    }
  }
  else {
    local_ac[0] = '\x01';
  }
LAB_00910d34:
  FUN_009103b0(param_2,param_3,param_1,0);
LAB_00910d48:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

