
void FUN_001b1824(long param_1,ulong *param_2,ulong *param_3)

{
  undefined1 *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ushort uVar5;
  short sVar6;
  short sVar7;
  code *pcVar8;
  bool bVar9;
  short sVar10;
  undefined8 *puVar11;
  ulong uVar12;
  uint uVar13;
  long lVar14;
  undefined1 *puVar15;
  ulong uVar16;
  long lVar17;
  short *psVar18;
  long lVar19;
  short sVar20;
  ulong uVar21;
  uint uVar22;
  undefined1 *puVar23;
  long lVar24;
  ulong uVar25;
  ulong uVar26;
  undefined1 *puVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  undefined1 auStack_90 [32];
  ulong *puStack_70;
  ulong uStack_68;
  
  uVar5 = *(ushort *)(param_1 + 0x90);
  if (uVar5 < 5) {
    uVar13 = 0x302;
    if (uVar5 != 3) {
      uVar13 = 0x303;
    }
    uVar22 = 0x301;
    if (uVar5 != 2) {
      uVar22 = uVar13;
    }
    uVar13 = 2;
    if (uVar5 != 0) {
      uVar13 = 0x300;
    }
    if (uVar5 < 2) {
      uVar22 = uVar13;
    }
  }
  else if (uVar5 < 7) {
    uVar22 = 0x304;
    if (uVar5 != 5) {
      uVar22 = 0xfeff;
    }
  }
  else if (uVar5 == 7) {
    uVar22 = 0xfefd;
  }
  else if (uVar5 == 8) {
    uVar22 = 0xfefc;
  }
  else {
    uVar22 = (uint)*(ushort *)(param_1 + 0x92);
  }
  uVar12 = param_2[2];
  if (*param_2 - uVar12 < 2) {
    func_0x0079b61c(param_2,uVar12,2,1,1);
    uVar12 = param_2[2];
  }
  *(ushort *)(param_2[1] + uVar12) = (ushort)(uVar22 >> 8) | (ushort)((uVar22 & 0xff00ff) << 8);
  uVar12 = uVar12 + 2;
  param_2[2] = uVar12;
  if (*param_2 - uVar12 < 0x20) {
    func_0x0079b61c(param_2,uVar12,0x20,1,1);
    uVar12 = param_2[2];
  }
  puVar11 = (undefined8 *)(param_2[1] + uVar12);
  uVar28 = *(undefined8 *)(param_1 + 0x48);
  uVar30 = *(undefined8 *)(param_1 + 0x60);
  uVar29 = *(undefined8 *)(param_1 + 0x58);
  puVar11[1] = *(undefined8 *)(param_1 + 0x50);
  *puVar11 = uVar28;
  puVar11[3] = uVar30;
  puVar11[2] = uVar29;
  uVar26 = uVar12 + 0x20;
  param_2[2] = uVar26;
  uVar25 = *param_3;
  if ((long)uVar25 < -0x7ffffffffffffffe) {
    uVar21 = *(ulong *)(param_1 + 0x88);
    if (uVar26 == *param_2) {
      func_0x00458a18(param_2,&UNK_009c25a8);
    }
    *(char *)(param_2[1] + uVar26) = (char)uVar21;
    uVar12 = uVar12 + 0x21;
    param_2[2] = uVar12;
    if (0x20 < uVar21) {
      func_0x007a28b0(uVar21,0x20,&UNK_009c25c0);
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x1b1f80);
      (*pcVar8)();
    }
    if (*param_2 - uVar12 < uVar21) {
      func_0x0079b61c(param_2,uVar12,uVar21,1,1);
      uVar12 = param_2[2];
    }
    _memcpy(param_2[1] + uVar12,param_1 + 0x68,uVar21);
    uVar12 = uVar12 + uVar21;
  }
  else {
    if (uVar26 == *param_2) {
      func_0x00458a18(param_2,&UNK_009c25a8);
    }
    *(undefined1 *)(param_2[1] + uVar26) = 0;
    uVar12 = uVar12 + 0x21;
    param_2[2] = uVar12;
  }
  param_2[2] = uVar12;
  func_0x001a6d38(param_1,param_2);
  func_0x001a6b30(param_1 + 0x18,param_2);
  if (((long)uVar25 < -0x7ffffffffffffffe) || (param_3[2] == 0)) {
    if (*(long *)(param_1 + 0x40) != 0) {
      func_0x001a68f0(param_1 + 0x30,param_2);
    }
    if ((-0x7fffffffffffffff < (long)uVar25) && (uVar25 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(param_3[1],uVar25 << 2,2);
      return;
    }
  }
  else {
    puVar23 = *(undefined1 **)(param_1 + 0x38);
    lVar17 = *(long *)(param_1 + 0x40);
    lVar24 = lVar17 << 6;
    if (lVar17 != 0) {
      lVar14 = 0;
      sVar6 = *(short *)param_3[1];
      sVar7 = ((short *)param_3[1])[1];
      psVar18 = (short *)(puVar23 + 0x22);
      lVar19 = lVar24;
      do {
        sVar10 = 0xb;
        sVar20 = 0;
        switch(*(undefined8 *)(psVar18 + -0x11)) {
        case 0x8000000000000001:
          goto code_r0x001b1cf8;
        case 0x8000000000000002:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 != 10) break;
          goto code_r0x001b1d0c;
        case 0x8000000000000003:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0xd) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000004:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000005:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x17) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000006:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x10) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000007:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x1a) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000008:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x22) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000009:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x1c) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000a:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x18) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000b:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x1b) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000c:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x15) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000d:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 5) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000e:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x13) goto code_r0x001b1d0c;
          break;
        case 0x800000000000000f:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x12) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000010:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x23) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000011:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x27) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000012:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x19) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000013:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x16) goto code_r0x001b1d0c;
          break;
        default:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x28) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000015:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x29) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000016:
          bVar9 = sVar6 != 0x2a || sVar7 == 0;
          if (sVar6 == 0x1e) goto code_r0x001b1d0c;
          break;
        case 0x8000000000000017:
          sVar10 = psVar18[-1];
          sVar20 = *psVar18;
code_r0x001b1cf8:
          bVar9 = sVar6 != 0x2a || sVar20 == sVar7;
          if (sVar10 == sVar6) {
code_r0x001b1d0c:
            if (bVar9) {
              uVar25 = param_3[2] - lVar14;
              uVar26 = -lVar14;
              bVar9 = true;
              goto code_r0x001b1d9c;
            }
          }
        }
        lVar14 = lVar14 + -1;
        psVar18 = psVar18 + 0x20;
        lVar19 = lVar19 + -0x40;
      } while (lVar19 != 0);
    }
    bVar9 = false;
code_r0x001b1d9c:
    uStack_c0 = param_3[1];
    uStack_c8 = *param_3;
    uStack_b8 = param_3[2];
    uStack_d0 = 0x8000000000000015;
    uVar21 = param_2[2];
    uVar12 = uVar21;
    if (*param_2 - uVar21 < 2) {
      func_0x0079b61c(param_2,uVar21,2,1,1);
      uVar12 = param_2[2];
    }
    *(undefined2 *)(param_2[1] + uVar12) = 0xffff;
    param_2[2] = uVar12 + 2;
    auStack_90[0] = 0x16;
    puStack_70 = param_2;
    uStack_68 = uVar21;
    if (bVar9) {
      uVar12 = 0;
      puVar1 = puVar23 + lVar17 * 0x40;
      puVar27 = puVar23;
      while (puVar27 != puVar1) {
        uVar21 = uVar26 - uVar12;
        if (uVar26 < uVar12) {
          uVar2 = uVar12;
          if (uVar12 <= uVar25) {
            uVar2 = uVar25;
          }
          uVar16 = uVar2 - uVar12;
          uVar3 = (ulong)(puVar1 + (-0x40 - (long)puVar27)) >> 6;
          if (uVar16 <= (ulong)(puVar1 + (-0x40 - (long)puVar27)) >> 6) {
            uVar3 = uVar16;
          }
          if (uVar21 <= uVar3) {
            uVar3 = uVar21;
          }
          if ((uVar3 < 4) || (((int)puVar23 - (int)puVar27 & 0x3fU) != 0)) {
            puVar15 = puVar27;
          }
          else {
            uVar21 = uVar3 + 1 & 3;
            uVar4 = 4;
            if (uVar21 != 0) {
              uVar4 = uVar21;
            }
            lVar17 = (uVar3 + 1) - uVar4;
            uVar12 = uVar12 + lVar17;
            puVar15 = puVar27 + lVar17 * 0x40;
            do {
              lVar17 = lVar17 + -4;
            } while (lVar17 != 0);
          }
          lVar17 = (uVar2 - uVar12) + 1;
          lVar24 = uVar26 - uVar12;
          while (puVar15 = puVar15 + 0x40, lVar24 != 0) {
            lVar17 = lVar17 + -1;
            puVar11 = (undefined8 *)(puVar27 + uVar16 * 0x40);
            uVar12 = uVar2;
            if (lVar17 == 0) goto code_r0x001b1e3c;
            lVar24 = lVar24 + -1;
            if (puVar15 == puVar1) goto code_r0x001b1efc;
          }
          puVar11 = &uStack_d0;
          uVar12 = uVar26;
        }
        else {
          puVar11 = &uStack_d0;
          if (uVar21 != 0) {
            puVar11 = (undefined8 *)puVar27;
          }
          puVar15 = puVar27 + 0x40;
        }
code_r0x001b1e3c:
        uVar12 = uVar12 + 1;
        func_0x001af0a8(puVar11,param_2);
        puVar27 = puVar15;
      }
    }
    else {
      for (; lVar24 != 0; lVar24 = lVar24 + -0x40) {
        func_0x001af0a8(puVar23,param_2);
        puVar23 = puVar23 + 0x40;
      }
    }
code_r0x001b1efc:
    func_0x0024031c(auStack_90);
    func_0x001ace50(&uStack_d0);
  }
  return;
}

