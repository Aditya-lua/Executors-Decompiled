
void FUN_00790cc4(void)

{
  uint uVar1;
  char cVar2;
  byte bVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  undefined2 uVar6;
  int iVar7;
  long *plVar8;
  uint uVar9;
  long lVar10;
  byte *pbVar11;
  byte *pbVar12;
  char *pcVar13;
  char *pcVar14;
  char *unaff_x19;
  long unaff_x20;
  undefined *unaff_x21;
  long unaff_x22;
  char *unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  char *unaff_x27;
  ulong unaff_x28;
  undefined1 *unaff_x29;
  undefined1 auVar15 [16];
  
code_r0x00790cc4:
  lVar10 = 0xb;
  puVar4 = (undefined1 *)register0x00000008;
LAB_00790cf0:
  uVar6 = *(undefined2 *)(&UNK_008ce8d6 + lVar10 * 8);
  puVar5 = puVar4;
  pcVar14 = unaff_x19;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar4 + 0x18)) {
    return;
  }
  do {
    auVar15 = ___stack_chk_fail(uVar6);
    plVar8 = auVar15._0_8_;
    pbVar11 = (byte *)*plVar8;
    if (*pbVar11 < 0x3c && (1L << ((long)(char)*pbVar11 & 0x3fU) & 0xc00100100000200U) != 0) {
      do {
        pbVar11 = pbVar11 + 1;
        *plVar8 = (long)pbVar11;
      } while (*pbVar11 < 0x3c && (1L << ((long)(char)*pbVar11 & 0x3fU) & 0xc00100100000200U) != 0);
    }
    *auVar15._8_8_ = pbVar11;
    pbVar12 = pbVar11 + 1;
    bVar3 = *pbVar11;
    if (bVar3 != 0) {
      do {
        if (((uint)(int)(char)bVar3 < 0x3c) &&
           (pbVar11 = pbVar12,
           (1L << ((ulong)(uint)(int)(char)bVar3 & 0x3f) & 0xc00100100000200U) != 0)) break;
        *auVar15._8_8_ = pbVar12;
        pbVar11 = pbVar12 + 1;
        bVar3 = *pbVar12;
        pbVar12 = pbVar11;
      } while (bVar3 != 0);
      pbVar11 = pbVar11 + -1;
    }
    unaff_x19 = (char *)*plVar8;
    register0x00000008 = (BADSPACEBASE *)(puVar5 + -0x80);
    puVar4 = puVar5 + -0x80;
    *(ulong *)(puVar5 + -0x60) = unaff_x28;
    *(char **)(puVar5 + -0x58) = unaff_x27;
    *(ulong *)(puVar5 + -0x50) = unaff_x26;
    *(ulong *)(puVar5 + -0x48) = unaff_x25;
    *(long *)(puVar5 + -0x40) = unaff_x24;
    *(char **)(puVar5 + -0x38) = unaff_x23;
    *(long *)(puVar5 + -0x30) = unaff_x22;
    *(undefined **)(puVar5 + -0x28) = unaff_x21;
    *(long *)(puVar5 + -0x20) = unaff_x20;
    *(char **)(puVar5 + -0x18) = pcVar14;
    *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar5 + -8) = 0x790d1c;
    unaff_x29 = puVar5 + -0x10;
    *(undefined8 *)(puVar5 + -0x68) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    if ((long)pbVar11 - (long)unaff_x19 != 0) {
      *(undefined8 *)(puVar5 + -0x70) = 0;
      unaff_x27 = unaff_x19 + ((long)pbVar11 - (long)unaff_x19);
      iVar7 = func_0x0077e76c(unaff_x19,"TLS",3);
      unaff_x24 = 0;
      uVar9 = 0x2d;
      if (iVar7 != 0) {
        uVar9 = 0x5f;
      }
      unaff_x25 = (ulong)uVar9;
      *(char **)(puVar5 + -0x80) = unaff_x27 + -1;
      do {
        pcVar14 = unaff_x19;
        if (unaff_x24 == 8) goto code_r0x00790c30;
        unaff_x23 = unaff_x19;
        if (unaff_x19 < unaff_x27) {
          if ((int)*unaff_x19 == 0 || uVar9 == (int)*unaff_x19) {
            unaff_x28 = 1;
          }
          else {
            lVar10 = *(long *)(puVar5 + -0x80) - (long)unaff_x19;
            pcVar13 = unaff_x19;
            do {
              pcVar13 = pcVar13 + 1;
              if (lVar10 == 0) {
                unaff_x23 = unaff_x27;
                goto code_r0x00790984;
              }
              lVar10 = lVar10 + -1;
            } while ((int)*pcVar13 != 0 && uVar9 != (int)*pcVar13);
            unaff_x23 = pcVar13;
code_r0x00790984:
            unaff_x28 = (ulong)(pcVar13 < unaff_x27);
          }
        }
        else {
          unaff_x28 = 0;
        }
        unaff_x20 = (long)unaff_x23 - (long)unaff_x19;
        unaff_x26 = 1;
        unaff_x21 = &UNK_008ce95f;
        while( true ) {
          unaff_x22 = _strlen(unaff_x21);
          if ((unaff_x22 == unaff_x20) &&
             (iVar7 = func_0x0077e76c(unaff_x21,unaff_x19,unaff_x20), iVar7 != 0)) break;
          unaff_x21 = unaff_x21 + unaff_x22 + 1;
          uVar1 = (int)unaff_x26 + 1;
          unaff_x26 = (ulong)uVar1;
          if (uVar1 == 0x1e) goto code_r0x00790c30;
        }
        puVar5[unaff_x24 + -0x70] = (char)unaff_x26;
        if ((int)unaff_x28 == 0) break;
        unaff_x24 = unaff_x24 + 1;
        unaff_x19 = unaff_x23 + 1;
        cVar2 = *unaff_x23;
        unaff_x23 = unaff_x19;
      } while (cVar2 != '\0');
      puVar5[-0x76] = puVar5[-0x70] << 2 | (byte)puVar5[-0x6f] >> 4 & 3;
      puVar5[-0x75] = puVar5[-0x6f] << 4 | (byte)puVar5[-0x6e] >> 2 & 0xf;
      puVar5[-0x74] = puVar5[-0x6d] & 0x3f | puVar5[-0x6e] << 6;
      puVar5[-0x73] = puVar5[-0x6c] << 2 | (byte)puVar5[-0x6b] >> 4 & 3;
      puVar5[-0x72] = puVar5[-0x6b] << 4 | (byte)puVar5[-0x6a] >> 2 & 0xf;
      puVar5[-0x71] = puVar5[-0x69] & 0x3f | puVar5[-0x6a] << 6;
      if (*(int *)(puVar5 + -0x76) == 0x70d57004 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 0;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x74157104 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 1;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x1ce604 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 2;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x70cc7004 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 3;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x19cc7004 && *(short *)(puVar5 + -0x72) == 0xc0) {
        lVar10 = 4;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x1cc22405 && *(short *)(puVar5 + -0x72) == 0x5c35) {
        lVar10 = 5;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x70153249 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 6;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x1cc22405 && *(short *)(puVar5 + -0x72) == 0x5d45) {
        lVar10 = 7;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x74553249 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 8;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x1c822605 && *(short *)(puVar5 + -0x72) == 0x5c35) {
        lVar10 = 9;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x7015a249 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 10;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x1c822605 && *(short *)(puVar5 + -0x72) == 0x5d45)
      goto code_r0x00790cc4;
      if (*(int *)(puVar5 + -0x76) == 0x7455a249 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 0xc;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x39822605 && *(short *)(puVar5 + -0x72) == 0x87) {
        lVar10 = 0xd;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x98a349 && *(short *)(puVar5 + -0x72) == 0) {
        lVar10 = 0xe;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      if (*(int *)(puVar5 + -0x76) == 0x39c22405 && *(short *)(puVar5 + -0x72) == 0x87) {
        lVar10 = 0xf;
        puVar4 = puVar5 + -0x80;
        goto LAB_00790cf0;
      }
      pcVar14 = unaff_x19;
      if (*(int *)(puVar5 + -0x76) == 0x983349 && *(short *)(puVar5 + -0x72) == 0) break;
    }
code_r0x00790c30:
    uVar6 = 0;
    plVar8 = (long *)(puVar5 + -0x68);
    puVar5 = puVar5 + -0x80;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *plVar8) {
      return;
    }
  } while( true );
  lVar10 = 0x10;
  puVar4 = puVar5 + -0x80;
  goto LAB_00790cf0;
}

