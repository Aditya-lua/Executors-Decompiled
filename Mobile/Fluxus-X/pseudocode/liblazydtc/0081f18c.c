/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081f18c
 */

void FUN_0081f18c(byte *param_1)

{
  byte *__src;
  byte bVar1;
  long lVar2;
  ulong uVar3;
  bool bVar4;
  bool bVar5;
  char *pcVar6;
  char *pcVar7;
  ulong uVar8;
  ulong uVar9;
  char *pcVar10;
  ulong uVar11;
  ulong local_b8;
  ulong uStack_b0;
  char *local_a8;
  ulong local_a0;
  ulong uStack_98;
  char *local_90;
  undefined8 local_80;
  ulong uStack_78;
  char *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar9 = *(ulong *)(param_1 + 8);
  __src = *(byte **)(param_1 + 0x10);
  if ((*param_1 & 1) == 0) {
    __src = param_1 + 1;
    uVar9 = (ulong)(*param_1 >> 1);
  }
  if (uVar9 != 0) {
    uVar8 = uVar9;
    do {
      uVar11 = uVar8;
      if (uVar11 == 0) goto LAB_0081f478;
      uVar8 = uVar11 - 1;
    } while (__src[uVar11 - 1] != 0x2f);
    if (uVar11 != 0) {
      if (uVar8 <= uVar9) {
        uVar9 = uVar8;
      }
      if (0xfffffffffffffff7 < uVar9) {
        if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_0081f524;
      }
      if (uVar9 < 0x17) {
        pcVar10 = (char *)((ulong)&local_80 | 1);
        local_80 = CONCAT71(local_80._1_7_,(char)((int)uVar9 << 1));
        if (uVar8 != 0) goto LAB_0081f250;
      }
      else {
        uVar8 = 0x1a;
        if ((uVar9 | 7) != 0x17) {
          uVar8 = (uVar9 | 7) + 1;
        }
        pcVar10 = operator_new(uVar8);
        local_80 = uVar8 | 1;
        uStack_78 = uVar9;
        local_70 = pcVar10;
LAB_0081f250:
        memmove(pcVar10,__src,uVar9);
      }
      pcVar7 = local_70;
      uVar8 = uStack_78;
      pcVar10[uVar9] = '\0';
      local_a0 = 0;
      uStack_98 = 0;
      local_90 = (char *)0x0;
      bVar4 = (local_80 & 1) == 0;
      uVar9 = local_80 >> 1 & 0x7f;
      if (!bVar4) {
        uVar9 = uStack_78;
      }
      if (uVar9 != 0) {
        pcVar10 = local_70;
        if ((local_80 & 1) == 0) {
          pcVar10 = (char *)((long)&local_80 + 1);
        }
        pcVar6 = memchr(pcVar10,0x2f,uVar9);
        bVar5 = true;
        if ((pcVar6 != (char *)0x0) &&
           (uVar11 = (long)pcVar6 - (long)pcVar10, uVar11 != 0xffffffffffffffff)) {
          do {
            if (uVar11 <= uVar9) {
              uVar9 = uVar11;
            }
            if (0xfffffffffffffff7 < uVar9) {
              if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0081f4b8 to 0081f4bb has its CatchHandler @ 0081f4dc */
                FUN_007fe124();
              }
              goto LAB_0081f524;
            }
            if (uVar9 < 0x17) {
              local_b8 = CONCAT71(local_b8._1_7_,(char)((int)uVar9 << 1));
              pcVar7 = (char *)((ulong)&local_b8 | 1);
              if (pcVar6 != pcVar10) goto LAB_0081f330;
            }
            else {
              uVar8 = 0x1a;
              if ((uVar9 | 7) != 0x17) {
                uVar8 = (uVar9 | 7) + 1;
              }
                    /* try { // try from 0081f318 to 0081f31f has its CatchHandler @ 0081f4d8 */
              pcVar7 = operator_new(uVar8);
              local_b8 = uVar8 | 1;
              uStack_b0 = uVar9;
              local_a8 = pcVar7;
LAB_0081f330:
              memmove(pcVar7,pcVar10,uVar9);
            }
            pcVar7[uVar9] = '\0';
            if ((local_a0 & 1) != 0) {
              operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
            }
            uVar3 = local_b8;
            uStack_98 = uStack_b0;
            local_a0 = local_b8;
            uVar8 = local_a0;
            local_a0._0_1_ = (byte)local_b8;
            bVar1 = (byte)local_a0;
            local_90 = local_a8;
            bVar4 = (local_b8 & 1) != 0;
            uVar9 = (ulong)((byte)local_a0 >> 1);
            if (bVar4) {
              uVar9 = uStack_b0;
            }
            local_a0 = uVar8;
            if (uVar9 != 0) {
              pcVar10 = (char *)((ulong)&local_a0 | 1);
              if (bVar4) {
                pcVar10 = local_a8;
              }
              mkdir(pcVar10,0x1ff);
            }
            pcVar7 = local_70;
            uVar8 = uStack_78;
            uVar11 = uVar11 + 1;
            bVar4 = (local_80 & 1) == 0;
            uVar9 = local_80 >> 1 & 0x7f;
            if (!bVar4) {
              uVar9 = uStack_78;
            }
            if (uVar9 < uVar11 || uVar9 - uVar11 == 0) goto LAB_0081f44c;
            pcVar10 = (char *)((ulong)&local_80 | 1);
            if ((local_80 & 1) != 0) {
              pcVar10 = local_70;
            }
            pcVar6 = memchr(pcVar10 + uVar11,0x2f,uVar9 - uVar11);
          } while ((pcVar6 != (char *)0x0) &&
                  (uVar11 = (long)pcVar6 - (long)pcVar10, uVar11 != 0xffffffffffffffff));
          bVar5 = (uVar3 & 1) == 0;
        }
        if (bVar5) {
          if (bVar4) {
            uStack_98 = uStack_78;
            local_a0 = local_80;
            local_90 = local_70;
          }
          else {
            FUN_007fdf5c(&local_a0,pcVar7,uVar8);
          }
        }
        else {
                    /* try { // try from 0081f408 to 0081f42b has its CatchHandler @ 0081f4d0 */
          FUN_007fe004(&local_a0,pcVar10,uVar9);
        }
        pcVar10 = (char *)((ulong)&local_a0 | 1);
        if ((local_a0 & 1) != 0) {
          pcVar10 = local_90;
        }
        mkdir(pcVar10,0x1ff);
        bVar1 = (byte)local_a0;
LAB_0081f44c:
        if ((bVar1 & 1) != 0) {
          operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
        }
      }
      if ((local_80 & 1) != 0) {
        operator_delete(local_70,local_80 & 0xfffffffffffffffe);
      }
    }
  }
LAB_0081f478:
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
LAB_0081f524:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

