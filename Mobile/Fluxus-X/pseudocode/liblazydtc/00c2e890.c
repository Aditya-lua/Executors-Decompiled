/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2e890
 */

ulong FUN_00c2e890(byte *param_1,undefined8 param_2,long param_3,ulong param_4)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  byte *pbVar6;
  byte bVar7;
  byte bVar8;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  byte *pbVar13;
  ulong *puVar14;
  uint uVar15;
  ulong uVar16;
  byte *pbVar17;
  ulong uVar18;
  ulong *puVar19;
  undefined1 auVar20 [16];
  ulong local_380 [99];
  byte *local_68;
  
  local_68 = param_1;
  lVar10 = FUN_00c2e6c8(&local_68,param_1 + 0x14);
  local_380[0] = param_4;
  pbVar6 = local_68 + lVar10;
  if (local_68 < pbVar6) {
    puVar1 = (ulong *)(param_3 + 0xf0);
    puVar2 = (ulong *)(param_3 + 0xe8);
    puVar3 = (ulong *)(param_3 + 0x108);
    puVar4 = (ulong *)(param_3 + 0xf8);
    puVar19 = local_380;
    puVar5 = (ulong *)(param_3 + 0x100);
    pbVar17 = local_68;
    do {
      pbVar13 = pbVar17 + 1;
      local_68 = pbVar13;
      bVar8 = *pbVar17;
      uVar9 = (uint)bVar8;
      if (0x91 < uVar9 - 3) {
code_r0x00c2f114:
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","evaluateExpression",
                "DWARF opcode not implemented");
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      }
      uVar15 = (uint)bVar8;
      puVar14 = puVar4;
      switch(uVar9) {
      case 3:
      case 0xe:
      case 0xf:
        uVar16 = *(ulong *)(pbVar17 + 1);
        local_68 = pbVar17 + 9;
        goto LAB_00c2ed78;
      case 4:
      case 5:
      case 7:
        goto code_r0x00c2f114;
      case 6:
        puVar14 = (ulong *)*puVar19;
LAB_00c2ed08:
        *puVar19 = *puVar14;
        goto LAB_00c2e914;
      case 8:
        uVar16 = (ulong)pbVar17[1];
        goto LAB_00c2ecdc;
      case 9:
        uVar16 = (ulong)(char)pbVar17[1];
LAB_00c2ecdc:
        local_68 = pbVar17 + 2;
        goto LAB_00c2ed78;
      case 10:
        uVar16 = (ulong)*(ushort *)(pbVar17 + 1);
        local_68 = pbVar17 + 3;
        goto LAB_00c2ed78;
      case 0xb:
        uVar16 = (ulong)*(short *)(pbVar17 + 1);
        local_68 = pbVar17 + 3;
        goto LAB_00c2ed78;
      case 0xc:
        uVar16 = (ulong)*(uint *)(pbVar17 + 1);
        local_68 = pbVar17 + 5;
        goto LAB_00c2ed78;
      case 0xd:
        uVar16 = (ulong)*(int *)(pbVar17 + 1);
        local_68 = pbVar17 + 5;
        goto LAB_00c2ed78;
      case 0x10:
        uVar16 = FUN_00c2e6c8(&local_68,pbVar6);
        puVar19 = puVar19 + 1;
        *puVar19 = uVar16;
        goto LAB_00c2e914;
      case 0x11:
        uVar11 = 0;
        uVar16 = 0xfffffffffffffff9;
        pbVar17 = pbVar13;
        do {
          if (pbVar17 == pbVar6) {
            fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                    "truncated sleb128 expression");
            fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
            abort();
          }
          bVar8 = *pbVar17;
          uVar16 = uVar16 + 7;
          pbVar13 = pbVar13 + 1;
          uVar11 = ((ulong)bVar8 & 0x7f) << (uVar16 & 0x3f) | uVar11;
          pbVar17 = pbVar17 + 1;
        } while ((char)bVar8 < '\0');
        uVar12 = -1L << ((ulong)((int)uVar16 + 7) & 0x3f);
        local_68 = pbVar13;
        if (0x38 < uVar16 || bVar8 < 0x40) {
          uVar12 = 0;
        }
        puVar19 = puVar19 + 1;
        *puVar19 = uVar11 | uVar12;
        goto LAB_00c2e914;
      case 0x12:
        uVar16 = *puVar19;
        goto LAB_00c2e910;
      case 0x13:
        puVar19 = puVar19 + -1;
        goto LAB_00c2e914;
      case 0x14:
        uVar16 = puVar19[-1];
        goto LAB_00c2e910;
      case 0x15:
        local_68 = pbVar17 + 2;
        uVar16 = puVar19[-(ulong)pbVar17[1]];
LAB_00c2ed78:
LAB_00c2e910:
        puVar19[1] = uVar16;
        puVar19 = puVar19 + 1;
        goto LAB_00c2e914;
      case 0x16:
        auVar20 = NEON_ext(*(undefined1 (*) [16])(puVar19 + -1),*(undefined1 (*) [16])(puVar19 + -1)
                           ,8,1);
        *puVar19 = auVar20._8_8_;
        puVar19[-1] = auVar20._0_8_;
        goto LAB_00c2e914;
      case 0x17:
        uVar16 = *puVar19;
        *puVar19 = SUB168(*(undefined1 (*) [16])(puVar19 + -2),8);
        puVar19[-1] = SUB168(*(undefined1 (*) [16])(puVar19 + -2),0);
        puVar19[-2] = uVar16;
        goto LAB_00c2e914;
      case 0x18:
        puVar14 = (ulong *)*puVar19;
        puVar19 = puVar19 + -1;
        *puVar19 = *puVar14;
        goto LAB_00c2e914;
      case 0x19:
        uVar16 = *puVar19;
        if ((long)uVar16 < 0) goto LAB_00c2eeb0;
        goto LAB_00c2e914;
      case 0x1a:
        uVar16 = puVar19[-1] & *puVar19;
        break;
      case 0x1b:
        uVar16 = 0;
        if (*puVar19 != 0) {
          uVar16 = (long)puVar19[-1] / (long)*puVar19;
        }
        break;
      case 0x1c:
        uVar16 = puVar19[-1] - *puVar19;
        break;
      case 0x1d:
        uVar16 = *puVar19;
        lVar10 = 0;
        if (uVar16 != 0) {
          lVar10 = (long)puVar19[-1] / (long)uVar16;
        }
        uVar16 = puVar19[-1] - lVar10 * uVar16;
        break;
      case 0x1e:
        uVar16 = puVar19[-1] * *puVar19;
        break;
      case 0x1f:
        uVar16 = *puVar19;
LAB_00c2eeb0:
        *puVar19 = -uVar16;
        goto LAB_00c2e914;
      case 0x20:
        *puVar19 = ~*puVar19;
        goto LAB_00c2e914;
      case 0x21:
        uVar16 = puVar19[-1] | *puVar19;
        break;
      case 0x22:
        uVar16 = puVar19[-1] + *puVar19;
        break;
      case 0x23:
        lVar10 = FUN_00c2e6c8(&local_68,pbVar6);
        *puVar19 = *puVar19 + lVar10;
        goto LAB_00c2e914;
      case 0x24:
        uVar16 = puVar19[-1] << (*puVar19 & 0x3f);
        break;
      case 0x25:
        uVar16 = puVar19[-1] >> (*puVar19 & 0x3f);
        break;
      case 0x26:
        uVar16 = (long)puVar19[-1] >> (*puVar19 & 0x3f);
        break;
      case 0x27:
        uVar16 = puVar19[-1] ^ *puVar19;
        break;
      case 0x28:
        puVar14 = puVar19 + -1;
        uVar16 = *puVar19;
        local_68 = pbVar17 + 3;
        puVar19 = puVar14;
        if (uVar16 != 0) {
          local_68 = pbVar17 + 3 + *(short *)(pbVar17 + 1);
        }
        goto LAB_00c2e914;
      case 0x29:
        uVar16 = (ulong)(puVar19[-1] == *puVar19);
        break;
      case 0x2a:
        uVar16 = (ulong)(*puVar19 <= puVar19[-1]);
        break;
      case 0x2b:
        uVar16 = (ulong)(*puVar19 < puVar19[-1]);
        break;
      case 0x2c:
        uVar16 = (ulong)(puVar19[-1] <= *puVar19);
        break;
      case 0x2d:
        uVar16 = (ulong)(puVar19[-1] < *puVar19);
        break;
      case 0x2e:
        uVar16 = (ulong)(puVar19[-1] != *puVar19);
        break;
      case 0x2f:
        local_68 = pbVar17 + (long)*(short *)(pbVar17 + 1) + 3;
        goto LAB_00c2e914;
      default:
        uVar16 = (ulong)(uVar15 - 0x30);
        goto LAB_00c2e910;
      case 0x50:
      case 0x51:
      case 0x52:
      case 0x53:
      case 0x54:
      case 0x55:
      case 0x56:
      case 0x57:
      case 0x58:
      case 0x59:
      case 0x5a:
      case 0x5b:
      case 0x5c:
      case 0x5d:
      case 0x5e:
      case 0x5f:
      case 0x60:
      case 0x61:
      case 0x62:
      case 99:
      case 100:
      case 0x65:
      case 0x66:
      case 0x67:
      case 0x68:
      case 0x69:
      case 0x6a:
      case 0x6b:
      case 0x6c:
      case 0x6d:
      case 0x6e:
      case 0x6f:
        if (((uVar15 != 0x6f) && (puVar14 = puVar1, bVar8 != 0x6e)) &&
           (puVar14 = puVar2, bVar8 != 0x6d)) {
          puVar14 = (ulong *)(param_3 + (ulong)(uVar15 - 0x50) * 8);
        }
        goto LAB_00c2e90c;
      case 0x70:
      case 0x71:
      case 0x72:
      case 0x73:
      case 0x74:
      case 0x75:
      case 0x76:
      case 0x77:
      case 0x78:
      case 0x79:
      case 0x7a:
      case 0x7b:
      case 0x7c:
      case 0x7d:
      case 0x7e:
      case 0x7f:
      case 0x80:
      case 0x81:
      case 0x82:
      case 0x83:
      case 0x84:
      case 0x85:
      case 0x86:
      case 0x87:
      case 0x88:
      case 0x89:
      case 0x8a:
      case 0x8b:
      case 0x8c:
      case 0x8d:
      case 0x8e:
      case 0x8f:
        uVar11 = 0;
        uVar16 = 0xfffffffffffffff9;
        pbVar17 = pbVar13;
        do {
          if (pbVar17 == pbVar6) {
            fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                    "truncated sleb128 expression");
            fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
            abort();
          }
          bVar7 = *pbVar17;
          uVar16 = uVar16 + 7;
          pbVar13 = pbVar13 + 1;
          uVar11 = ((ulong)bVar7 & 0x7f) << (uVar16 & 0x3f) | uVar11;
          pbVar17 = pbVar17 + 1;
        } while ((char)bVar7 < '\0');
        uVar12 = -1L << ((ulong)((int)uVar16 + 7) & 0x3f);
        local_68 = pbVar13;
        if (0x38 < uVar16 || bVar7 < 0x40) {
          uVar12 = 0;
        }
        if (bVar8 < 0x8e) {
          if (((bVar8 != 0x6e) && (puVar14 = puVar5, bVar8 != 0x6f)) &&
             (puVar14 = puVar2, bVar8 != 0x8d)) goto LAB_00c2ea4c;
        }
        else if (bVar8 < 0x90) {
          puVar14 = puVar1;
          if ((bVar8 != 0x8e) && (puVar14 = puVar4, uVar15 != 0x8f)) goto LAB_00c2ea4c;
        }
        else {
          puVar14 = puVar5;
          if ((bVar8 != 0x90) && (puVar14 = puVar3, bVar8 != 0x92)) {
LAB_00c2ea4c:
            if (0x1c < uVar9 - 0x70) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getRegister",
                      "unsupported arm64 register");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            puVar14 = (ulong *)(param_3 + (ulong)(uVar9 - 0x70) * 8);
          }
        }
        uVar16 = *puVar14 + (uVar11 | uVar12);
        goto LAB_00c2e910;
      case 0x90:
        uVar16 = FUN_00c2e6c8(&local_68,pbVar6);
        uVar9 = (uint)uVar16;
        if ((int)uVar9 < 0x1e) {
          if (((uVar9 != 0xfffffffe) && (puVar14 = puVar5, uVar9 != 0xffffffff)) &&
             (puVar14 = puVar2, uVar9 != 0x1d)) goto LAB_00c2efb0;
        }
        else if ((int)uVar9 < 0x20) {
          puVar14 = puVar1;
          if ((uVar9 != 0x1e) && (puVar14 = puVar4, uVar9 != 0x1f)) goto LAB_00c2efb0;
        }
        else {
          puVar14 = puVar5;
          if ((uVar9 != 0x20) && (puVar14 = puVar3, uVar9 != 0x22)) {
LAB_00c2efb0:
            if (0x1c < uVar9) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getRegister",
                      "unsupported arm64 register");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            puVar14 = (ulong *)(param_3 + (uVar16 & 0x1f) * 8);
          }
        }
LAB_00c2e90c:
        uVar16 = *puVar14;
        goto LAB_00c2e910;
      case 0x91:
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","evaluateExpression",
                "DW_OP_fbreg not implemented");
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      case 0x92:
        uVar11 = FUN_00c2e6c8(&local_68,pbVar6);
        uVar12 = 0;
        uVar16 = 0xfffffffffffffff9;
        pbVar17 = local_68;
        pbVar13 = local_68;
        do {
          if (pbVar13 == pbVar6) {
            fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                    "truncated sleb128 expression");
            fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
            abort();
          }
          bVar8 = *pbVar13;
          uVar16 = uVar16 + 7;
          pbVar17 = pbVar17 + 1;
          uVar12 = ((ulong)bVar8 & 0x7f) << (uVar16 & 0x3f) | uVar12;
          pbVar13 = pbVar13 + 1;
        } while ((char)bVar8 < '\0');
        uVar18 = -1L << ((ulong)((int)uVar16 + 7) & 0x3f);
        local_68 = pbVar17;
        if (0x38 < uVar16 || bVar8 < 0x40) {
          uVar18 = 0;
        }
        uVar9 = (uint)uVar11;
        if ((int)uVar9 < 0x1e) {
          if (((uVar9 != 0xfffffffe) && (puVar14 = puVar5, uVar9 != 0xffffffff)) &&
             (puVar14 = puVar2, uVar9 != 0x1d)) goto LAB_00c2efdc;
        }
        else if ((int)uVar9 < 0x20) {
          puVar14 = puVar1;
          if ((uVar9 != 0x1e) && (puVar14 = puVar4, uVar9 != 0x1f)) goto LAB_00c2efdc;
        }
        else {
          puVar14 = puVar5;
          if ((uVar9 != 0x20) && (puVar14 = puVar3, uVar9 != 0x22)) {
LAB_00c2efdc:
            if (0x1c < uVar9) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getRegister",
                      "unsupported arm64 register");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            puVar14 = (ulong *)(param_3 + (uVar11 & 0x1f) * 8);
          }
        }
        uVar16 = *puVar14 + (uVar12 | uVar18);
        goto LAB_00c2e910;
      case 0x93:
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","evaluateExpression",
                "DW_OP_piece not implemented");
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      case 0x94:
        local_68 = pbVar17 + 2;
        puVar14 = (ulong *)*puVar19;
        bVar8 = pbVar17[1];
        if (bVar8 < 4) {
          if (bVar8 == 1) {
            *puVar19 = (ulong)(byte)*puVar14;
          }
          else {
            if (bVar8 != 2) goto LAB_00c2f1b8;
            *puVar19 = (ulong)(ushort)*puVar14;
          }
        }
        else {
          if (bVar8 != 4) {
            if (bVar8 != 8) {
LAB_00c2f1b8:
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","evaluateExpression",
                      "DW_OP_deref_size with bad size");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            goto LAB_00c2ed08;
          }
          *puVar19 = (ulong)(uint)*puVar14;
        }
        goto LAB_00c2e914;
      }
      puVar19[-1] = uVar16;
      puVar19 = puVar19 + -1;
LAB_00c2e914:
      pbVar17 = local_68;
    } while (local_68 < pbVar6);
    param_4 = *puVar19;
  }
  return param_4;
}

