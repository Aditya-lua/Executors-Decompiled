/* JNI_OnLoad; ELF-relative address 0x10521e8; Ghidra address 011521e8 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong JNI_OnLoad(ulong param_1,ulong param_2,long param_3)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  byte *pbVar3;
  long *plVar4;
  ulong *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  code *pcVar16;
  uint uStack_900;
  ulong uStack_8fc;
  ulong uStack_8f4;
  ulong uStack_26d;
  ulong uStack_13c;
  undefined8 *******apppppppuStack_e0 [2];
  undefined8 *******apppppppuStack_d0 [2];
  ulong uStack_c0;
  undefined4 uStack_b4;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  uint uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  long lStack_68;
  
  lStack_70 = tpidr_el0;
  lStack_68 = *(long *)(lStack_70 + 0x28);
  apppppppuStack_e0[0] = apppppppuStack_d0;
  apppppppuStack_d0[0] = apppppppuStack_e0;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299650);
  uStack_78 = *puVar1;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299670);
  uStack_80 = *puVar1;
  puVar2 = (undefined4 *)func_0x0100de78(0x1299630);
  uStack_84 = *puVar2;
  puVar2 = (undefined4 *)func_0x0100de78(0x12996d0);
  uStack_88 = *puVar2;
  puVar2 = (undefined4 *)func_0x0100de78(0x12996f0);
  uStack_8c = *puVar2;
  pbVar3 = (byte *)func_0x0100de78(0x1299790);
  uStack_90 = (uint)*pbVar3;
  plVar4 = (long *)func_0x0100de78(0x12997b0);
  lStack_98 = *plVar4;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299710);
  uStack_a0 = *puVar1;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299730);
  uStack_a8 = *puVar1;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299750);
  uStack_b0 = *puVar1;
  puVar2 = (undefined4 *)func_0x0100de78(0x1299770);
  uStack_b4 = *puVar2;
  puVar5 = (ulong *)func_0x0100de78(0x1299690);
  uStack_c0 = *puVar5;
  lVar12 = 0;
  do {
    *(undefined1 *)((long)&uStack_900 + lVar12) = 0;
    lVar12 = lVar12 + 1;
  } while (lVar12 != 0x819);
  uVar6 = func_0x0100de78(0x12996b0);
  lVar12 = func_0x0100da20(0x23e664716bf8523f,uVar6);
  uVar13 = lVar12 + 0x23e664716bf8523fU ^ (ulong)&uStack_900 ^ 0x6c3712259c297a43;
  uVar13 = (uVar13 ^ uVar13 >> 0x1e) * -0x40a7b892e31b1a47;
  uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  puVar5 = (ulong *)func_0x0100de78(0x1299690);
  *puVar5 = uVar13 ^ uVar13 >> 0x1f;
  uVar13 = (*puVar5 ^ 0xa948dbc254c051cc ^ (*puVar5 ^ 0xa948dbc254c051cc) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  uStack_26d = uVar13 ^ (ulong)PTR_DAT_01296050 ^ uVar13 >> 0x1f;
  uVar15 = (uRam0000000001299488 ^ uRam0000000001299488 >> 0x21) * -0xae502812aa7333;
  uVar15 = uVar15 ^ uVar15 >> 0x1d;
  uVar13 = uVar15 ^ _UNK_0023bcd0 - 0x3db844c3U;
  uVar13 = ((ulong)((uint)uVar15 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar15) & 0xffff |
           (uVar15 ^ (uVar13 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar15 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar15;
  uVar14 = (*puVar5 ^ 0x2930a13dfc067cd7 ^ (*puVar5 ^ 0x2930a13dfc067cd7) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uStack_13c = (uVar14 ^ uVar14 >> 0x1b) * -0x6b2fb644ecceee15;
  uStack_13c = (uVar13 ^ (ulong)(&UNK_0023bcd0 + uVar15)) +
               (uVar13 & (ulong)(&UNK_0023bcd0 + uVar15)) * 2 ^ uStack_13c >> 0x1f ^ uStack_13c;
  uVar13 = (*puVar5 ^ 0xf72003587f441f97 ^ (*puVar5 ^ 0xf72003587f441f97) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uStack_8fc = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  uStack_8fc = param_1 ^ uStack_8fc >> 0x1f ^ uStack_8fc;
  uVar13 = (*puVar5 ^ 0xe564510c75103f3f ^ (*puVar5 ^ 0xe564510c75103f3f) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uStack_8f4 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  uStack_8f4 = param_2 ^ uStack_8f4 >> 0x1f ^ uStack_8f4;
  puVar1 = (undefined8 *)func_0x0100de78(0x1299650);
  *puVar1 = &uStack_900;
  puVar7 = (undefined8 *)func_0x0100de78(0x1299670);
  *puVar7 = &UNK_0023f600;
  puVar8 = (undefined8 *)func_0x0100de78(0x1299750);
  *puVar8 = &UNK_001d0ec0;
  puVar9 = (undefined8 *)func_0x0100de78(0x1299710);
  *puVar9 = &UNK_0024124a;
  puVar10 = (undefined8 *)func_0x0100de78(0x1299730);
  *puVar10 = &UNK_0024128a;
  uVar14 = (uRam0000000001299488 ^ uRam0000000001299488 >> 0x21) * -0xae502812aa7333;
  uVar14 = uVar14 ^ uVar14 >> 0x1d;
  uVar13 = uVar14 ^ _UNK_0023bcd8 - 0x5befbe7dU;
  uVar13 = ((ulong)((uint)uVar14 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar14) & 0xffff |
           (uVar14 ^ (uVar13 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar14 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar14;
  plVar4 = (long *)func_0x0100de78(0x12997b0);
  *plVar4 = (uVar13 ^ (ulong)(&UNK_0023bcd8 + uVar14)) +
            (uVar13 & (ulong)(&UNK_0023bcd8 + uVar14)) * 2;
  uVar14 = (uRam0000000001299488 ^ uRam0000000001299488 >> 0x21) * -0xae502812aa7333;
  uVar14 = uVar14 ^ uVar14 >> 0x1d;
  uVar13 = uVar14 ^ _UNK_0023bce0 - 0x7a273835U;
  uVar13 = ((ulong)((uint)uVar14 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar14) & 0xffff |
           (uVar14 ^ (uVar13 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar14 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar14;
  (*(code *)((uVar13 ^ (ulong)(&UNK_0023bce0 + uVar14)) +
            (uVar13 & (ulong)(&UNK_0023bce0 + uVar14)) * 2))();
  uVar13 = *puVar5;
  *puVar5 = uStack_c0;
  puVar2 = (undefined4 *)func_0x0100de78(0x1299770);
  *puVar2 = uStack_b4;
  *puVar8 = uStack_b0;
  *puVar10 = uStack_a8;
  *puVar9 = uStack_a0;
  *plVar4 = lStack_98;
  puVar11 = (undefined1 *)func_0x0100de78(0x1299790);
  *puVar11 = (char)uStack_90;
  puVar2 = (undefined4 *)func_0x0100de78(0x12996f0);
  *puVar2 = uStack_8c;
  puVar2 = (undefined4 *)func_0x0100de78(0x12996d0);
  *puVar2 = uStack_88;
  puVar2 = (undefined4 *)func_0x0100de78(0x1299630);
  *puVar2 = uStack_84;
  *puVar7 = uStack_80;
  *puVar1 = uStack_78;
  if (*(long *)(lStack_70 + 0x28) == lStack_68) {
    uVar13 = (uVar13 ^ 0x83fde5bd826defc3 ^ (uVar13 ^ 0x83fde5bd826defc3) >> 0x1e) *
             -0x40a7b892e31b1a47;
    uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
    return (ulong)((uint)(uVar13 >> 0x1f) ^ uStack_900 ^ (uint)uVar13);
  }
  func_0x012085d0();
  if (param_3 == 0) {
    return 0;
  }
  if (*(long *)(param_3 + 0x75d8) != 0) {
    return 0xffffffffffffffc0;
  }
  pcVar16 = *(code **)(param_3 + 0x75b8);
  uVar6 = *(undefined8 *)(param_3 + 0x75c0);
  func_0x0101ba48(*(undefined8 *)(param_3 + 0x75e8));
  *(undefined4 *)(param_3 + 0x7600) = 0;
  *(undefined8 *)(param_3 + 0x75f0) = 0;
  *(undefined8 *)(param_3 + 0x75e8) = 0;
  if (*(long *)(param_3 + 0x7620) != 0) {
    if (pcVar16 == (code *)0x0) {
      func_0x01208630(*(long *)(param_3 + 0x7620));
    }
    else {
      (*pcVar16)(uVar6);
    }
  }
  plVar4 = *(long **)(param_3 + 0x7608);
  *(undefined8 *)(param_3 + 0x7620) = 0;
  if (plVar4 == (long *)0x0) goto code_r0x0101bcc4;
  if (*plVar4 == 0) {
    if (pcVar16 == (code *)0x0) goto code_r0x0101bcb8;
code_r0x0101bca0:
    (*pcVar16)(uVar6,plVar4);
  }
  else {
    if (pcVar16 != (code *)0x0) {
      (*pcVar16)(uVar6);
      goto code_r0x0101bca0;
    }
    func_0x01208630(*plVar4);
code_r0x0101bcb8:
    func_0x01208630(plVar4);
  }
  *(undefined8 *)(param_3 + 0x7608) = 0;
code_r0x0101bcc4:
  if (pcVar16 == (code *)0x0) {
    func_0x01208630(param_3);
  }
  else {
    (*pcVar16)(uVar6,param_3);
  }
  return 0;
}

