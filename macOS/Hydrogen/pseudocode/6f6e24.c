
undefined1 * FUN_006f6e24(undefined8 param_1,undefined8 param_2,segment_command *param_3)

{
  uint uVar1;
  byte bVar2;
  char cVar3;
  undefined1 in_ZR;
  int iVar4;
  undefined1 *puVar5;
  long lVar6;
  int *piVar7;
  undefined1 *puVar8;
  segment_command *psVar9;
  qword *pqVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  int *piVar14;
  undefined8 *puVar15;
  qword qVar16;
  uint uVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  undefined1 *unaff_x19;
  long unaff_x20;
  undefined1 *puVar21;
  segment_command *unaff_x21;
  int unaff_w23;
  uint uVar22;
  long *plVar23;
  long *unaff_x24;
  segment_command *psVar24;
  undefined1 *unaff_x25;
  int unaff_w26;
  undefined1 auVar25 [16];
  
  while( true ) {
    if (((bool)in_ZR) && (param_3 = unaff_x21, iVar4 = _memcmp(unaff_x25 + 0x18), iVar4 == 0)) {
      if ((unaff_x25[1] & 0xb) == ((*(byte *)(unaff_x24 + 4) ^ 0xff) & 3)) {
        unaff_x25[1] = unaff_x25[1] ^ 3;
      }
      return unaff_x25;
    }
    unaff_x25 = *(undefined1 **)(unaff_x25 + 8);
    if (unaff_x25 == (undefined1 *)0x0) break;
    in_ZR = *(int *)(unaff_x25 + 0x14) == (int)unaff_x21;
  }
  *(int *)(unaff_x19 + 0x10) = unaff_w23 - ((int)unaff_x19 + 0x10);
  (unaff_x19 + (long)unaff_x21)[0x18] = 0;
  *(undefined4 *)(unaff_x19 + 4) = 0xffff8000;
  lVar12 = *unaff_x24;
  *(undefined8 *)(unaff_x19 + 8) = *(undefined8 *)(lVar12 + (long)unaff_w26 * 8);
  *(undefined1 **)(lVar12 + (long)unaff_w26 * 8) = unaff_x19;
  uVar17 = *(uint *)((long)unaff_x24 + 0xc);
  uVar22 = (int)unaff_x24[1] + 1;
  *(uint *)(unaff_x24 + 1) = uVar22;
  if (uVar22 <= uVar17 || 0x3fffffff < (int)uVar17) {
    return unaff_x19;
  }
  if (-1 < (int)uVar17) {
    uVar22 = uVar17 * 2;
    lVar12 = func_0x006f3708();
    plVar23 = *(long **)(unaff_x20 + 0x18);
    if (uVar17 != 0) {
      _bzero(lVar12,(ulong)uVar22 << 3);
    }
    uVar17 = *(uint *)((long)plVar23 + 0xc);
    if (0 < (int)uVar17) {
      uVar13 = 0;
      do {
        lVar6 = *(long *)(*plVar23 + uVar13 * 8);
        while (lVar6 != 0) {
          lVar19 = *(long *)(lVar6 + 8);
          uVar1 = *(int *)(lVar6 + 0x10) + (int)(int *)(lVar6 + 0x10) & uVar22 - 1;
          uVar20 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
          *(undefined8 *)(lVar6 + 8) = *(undefined8 *)(lVar12 + uVar20);
          *(long *)(lVar12 + uVar20) = lVar6;
          lVar6 = lVar19;
        }
        uVar13 = uVar13 + 1;
      } while (uVar13 != uVar17);
    }
    func_0x006f3a2c();
    *(uint *)((long)plVar23 + 0xc) = uVar22;
    *plVar23 = lVar12;
    return unaff_x19;
  }
  auVar25 = func_0x006f36f4();
  piVar7 = auVar25._8_8_;
  lVar12 = auVar25._0_8_;
  psVar9 = param_3;
  piVar14 = piVar7;
  if (param_3 < &segment_command_00000020) {
    psVar24 = param_3;
    if (param_3 != (segment_command *)0x0) goto code_r0x006f6f98;
    uVar22 = 0;
  }
  else {
    uVar22 = 0;
    uVar17 = 0;
    psVar24 = param_3;
    do {
      uVar1 = piVar14[2] + (int)psVar24;
      uVar22 = (uVar1 ^ *piVar14 + uVar22) - (uVar1 >> 0xe | uVar1 * 0x40000);
      uVar17 = (uVar22 ^ piVar14[1] + uVar17) - (uVar22 >> 0xb | uVar22 * 0x200000);
      psVar24 = (segment_command *)(ulong)((uVar17 ^ uVar1) - (uVar17 >> 0x19 | uVar17 * 0x80));
      piVar14 = piVar14 + 3;
      psVar9 = (segment_command *)&psVar9[-1].initprot;
    } while ((undefined1 *)((long)&MACH_HEADER.reserved + 3) < psVar9);
code_r0x006f6f98:
    do {
      uVar22 = (uint)psVar24;
      uVar22 = uVar22 * 0x20 + (uVar22 >> 2) +
               (uint)*(byte *)((long)piVar14 + (long)((long)psVar9->segname + -9)) ^ uVar22;
      psVar9 = (segment_command *)((long)&psVar9[-1].flags + 3);
      psVar24 = (segment_command *)(ulong)uVar22;
    } while (psVar9 != (segment_command *)0x0);
  }
  plVar23 = *(long **)(lVar12 + 0x18);
  psVar9 = param_3;
  for (puVar21 = *(undefined1 **)
                  (*plVar23 + (long)(int)(*(int *)((long)plVar23 + 0xc) - 1U & uVar22) * 8);
      puVar21 != (undefined1 *)0x0; puVar21 = *(undefined1 **)(puVar21 + 8)) {
    if (((segment_command *)(ulong)*(uint *)(puVar21 + 0x14) == param_3) &&
       (psVar9 = param_3, iVar4 = _memcmp(piVar7,puVar21 + 0x18), iVar4 == 0)) {
      if ((puVar21[1] & 0xb) == ((*(byte *)(plVar23 + 4) ^ 0xff) & 3)) {
        puVar21[1] = puVar21[1] ^ 3;
        return puVar21;
      }
      return puVar21;
    }
  }
  if (param_3 < (segment_command *)0x40000001) {
    puVar21 = (undefined1 *)
              func_0x006f3878(lVar12,(undefined1 *)((long)&param_3->vmaddr + 1),
                              *(undefined1 *)(lVar12 + 4));
    puVar21[1] = *(byte *)(*(long *)(lVar12 + 0x18) + 0x20) & 3;
    *puVar21 = 5;
    puVar21[2] = *(undefined1 *)(lVar12 + 4);
    *(undefined4 *)(puVar21 + 4) = 0xffff8000;
    *(uint *)(puVar21 + 0x10) = uVar22 - ((int)puVar21 + 0x10);
    *(int *)(puVar21 + 0x14) = (int)param_3;
    psVar9 = param_3;
    _memcpy(puVar21 + 0x18,piVar7);
    (puVar21 + 0x18)[(long)param_3] = 0;
    plVar23 = *(long **)(lVar12 + 0x18);
    lVar19 = plVar23[1];
    uVar17 = *(uint *)((long)plVar23 + 0xc);
    lVar18 = *plVar23;
    lVar6 = (ulong)(uVar17 - 1 & uVar22) * 8;
    *(undefined8 *)(puVar21 + 8) = *(undefined8 *)(lVar18 + lVar6);
    *(undefined1 **)(lVar18 + lVar6) = puVar21;
    uVar22 = (int)lVar19 + 1;
    *(uint *)(plVar23 + 1) = uVar22;
    if ((0x3fffffff < (int)uVar17) || (uVar22 <= uVar17)) {
      return puVar21;
    }
    if (-1 < (int)uVar17) {
      uVar22 = uVar17 * 2;
      lVar6 = func_0x006f3708(lVar12,(ulong)uVar22 << 3,0);
      plVar23 = *(long **)(lVar12 + 0x18);
      if (uVar17 != 0) {
        _bzero(lVar6,(ulong)uVar22 << 3);
      }
      uVar17 = *(uint *)((long)plVar23 + 0xc);
      if (0 < (int)uVar17) {
        uVar13 = 0;
        do {
          lVar19 = *(long *)(*plVar23 + uVar13 * 8);
          while (lVar19 != 0) {
            lVar18 = *(long *)(lVar19 + 8);
            uVar1 = *(int *)(lVar19 + 0x10) + (int)(int *)(lVar19 + 0x10) & uVar22 - 1;
            uVar20 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
            *(undefined8 *)(lVar19 + 8) = *(undefined8 *)(lVar6 + uVar20);
            *(long *)(lVar6 + uVar20) = lVar19;
            lVar19 = lVar18;
          }
          uVar13 = uVar13 + 1;
        } while (uVar13 != uVar17);
      }
      func_0x006f3a2c(lVar12,*plVar23,(long)(int)uVar17 << 3,0);
      *(uint *)((long)plVar23 + 0xc) = uVar22;
      *plVar23 = lVar6;
      return puVar21;
    }
  }
  auVar25 = func_0x006f36f4(lVar12);
  puVar8 = auVar25._8_8_;
  puVar5 = auVar25._0_8_;
  puVar15 = (undefined8 *)
            (**(long **)(puVar5 + 0x18) +
            (long)(int)(*(int *)(puVar8 + 0x10) + (int)(puVar8 + 0x10) &
                       *(int *)((long)*(long **)(puVar5 + 0x18) + 0xc) - 1U) * 8);
  puVar21 = (undefined1 *)*puVar15;
  if (puVar21 != (undefined1 *)0x0) {
    if (puVar21 != puVar8) {
      do {
        puVar11 = puVar21;
        puVar21 = *(undefined1 **)(puVar11 + 8);
        if (puVar21 == (undefined1 *)0x0) goto code_r0x006f721c;
      } while (puVar21 != puVar8);
      puVar15 = (undefined8 *)(puVar11 + 8);
    }
    *puVar15 = *(undefined8 *)(puVar8 + 8);
    *(int *)(*(long *)(puVar5 + 0x18) + 8) = *(int *)(*(long *)(puVar5 + 0x18) + 8) + -1;
  }
code_r0x006f721c:
  uVar13 = (ulong)*(uint *)(puVar8 + 0x14);
  bVar2 = puVar8[2];
  lVar12 = *(long *)(puVar5 + 0x18);
  if (uVar13 + 0x18 < 0x400) {
    cVar3 = *(char *)(uVar13 + 0xa40319);
    if (cVar3 < 0) goto code_r0x006f3be4;
    *puVar8 = 0;
    lVar19 = *(long *)(puVar5 + 0x18);
    if (psVar9->fileoff == 0) {
      if ((int)psVar9->filesize < 0) {
        lVar6 = lVar19 + (ulong)(uint)(int)cVar3 * 8;
        puVar15 = *(undefined8 **)(lVar6 + 0x1a0);
        *(undefined8 **)psVar9->segname = puVar15;
        if (puVar15 != (undefined8 *)0x0) {
          *puVar15 = psVar9;
        }
        *(segment_command **)(lVar6 + 0x1a0) = psVar9;
        *(qword *)(puVar8 + 8) = psVar9->fileoff;
        psVar9->fileoff = (qword)puVar8;
        iVar4 = *(int *)((long)&psVar9->filesize + 4) + -1;
        *(int *)((long)&psVar9->filesize + 4) = iVar4;
      }
      else {
        *(undefined8 *)(puVar8 + 8) = 0;
        psVar9->fileoff = (qword)puVar8;
        iVar4 = *(int *)((long)&psVar9->filesize + 4) + -1;
        *(int *)((long)&psVar9->filesize + 4) = iVar4;
      }
    }
    else {
      *(qword *)(puVar8 + 8) = psVar9->fileoff;
      psVar9->fileoff = (qword)puVar8;
      iVar4 = *(int *)((long)&psVar9->filesize + 4) + -1;
      *(int *)((long)&psVar9->filesize + 4) = iVar4;
    }
    if (iVar4 != 0) goto code_r0x006f3ce8;
    puVar15 = *(undefined8 **)psVar9->segname;
    if (puVar15 != (undefined8 *)0x0) {
      *puVar15 = *(undefined8 *)psVar9;
    }
    if (*(long *)psVar9 == 0) {
      plVar23 = (long *)(lVar19 + 0x1a0 + ((long)cVar3 & 0xffffffffU) * 8);
      if ((segment_command *)*plVar23 == psVar9) goto code_r0x006f3bdc;
    }
    else {
      plVar23 = (long *)(*(long *)psVar9 + 8);
code_r0x006f3bdc:
      *plVar23 = (long)puVar15;
    }
    lVar6 = *(long *)(puVar5 + 0x18);
    qVar16 = psVar9->vmaddr;
    if (qVar16 != 0) {
      *(undefined8 *)(qVar16 + 0x10) = *(undefined8 *)(psVar9->segname + 8);
    }
    if (*(long *)(psVar9->segname + 8) == 0) {
      pqVar10 = (qword *)(lVar19 + 0x2e8);
      if ((segment_command *)*pqVar10 == psVar9) goto code_r0x006f3c80;
    }
    else {
      pqVar10 = (qword *)(*(long *)(psVar9->segname + 8) + 0x18);
code_r0x006f3c80:
      *pqVar10 = qVar16;
    }
  }
  else {
code_r0x006f3be4:
    qVar16 = psVar9->vmaddr;
    if (qVar16 != 0) {
      *(undefined8 *)(qVar16 + 0x10) = *(undefined8 *)(psVar9->segname + 8);
    }
    lVar6 = lVar12;
    if (*(long *)(psVar9->segname + 8) == 0) {
      pqVar10 = (qword *)(lVar12 + 0x2e8);
      if ((segment_command *)*pqVar10 != psVar9) goto code_r0x006f3cd4;
    }
    else {
      pqVar10 = (qword *)(*(long *)(psVar9->segname + 8) + 0x18);
    }
    *pqVar10 = qVar16;
  }
code_r0x006f3cd4:
  puVar5 = (undefined1 *)
           (**(code **)(lVar6 + 0x10))
                     (*(undefined8 *)(lVar6 + 0x18),psVar9,(long)(int)psVar9->vmsize,0);
code_r0x006f3ce8:
  *(ulong *)(lVar12 + 0x48) = *(long *)(lVar12 + 0x48) - (uVar13 + 0x19);
  lVar12 = lVar12 + (ulong)bVar2 * 8;
  *(ulong *)(lVar12 + 0x560) = *(long *)(lVar12 + 0x560) - (uVar13 + 0x19);
  return puVar5;
}

