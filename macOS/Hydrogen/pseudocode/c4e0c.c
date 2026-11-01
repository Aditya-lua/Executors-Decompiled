
/* WARNING: Removing unreachable block (ram,0x000c57e0) */
/* WARNING: Removing unreachable block (ram,0x000c7260) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c4e0c(long param_1,float param_2)

{
  int *piVar1;
  undefined1 (*pauVar2) [16];
  float *pfVar3;
  undefined4 *puVar4;
  int *piVar5;
  char *pcVar6;
  int *piVar7;
  uint *puVar8;
  byte bVar9;
  bool bVar10;
  uint uVar11;
  short sVar12;
  uint uVar13;
  undefined8 *puVar14;
  undefined1 auVar15 [16];
  undefined8 uVar16;
  double dVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  uint uVar20;
  char cVar21;
  bool bVar22;
  bool bVar23;
  bool bVar24;
  bool bVar25;
  bool bVar26;
  undefined2 uVar27;
  uint uVar28;
  uint uVar29;
  uint uVar30;
  long lVar31;
  long lVar32;
  undefined2 uVar33;
  undefined2 uVar34;
  undefined8 uVar35;
  long *plVar36;
  undefined4 uVar37;
  long in_x9;
  long lVar38;
  undefined4 uVar39;
  float *pfVar40;
  float *in_x10;
  long lVar41;
  long lVar42;
  long lVar43;
  undefined *puVar44;
  short sVar45;
  float in_w11;
  uint uVar46;
  undefined2 *puVar47;
  ulong uVar48;
  undefined *puVar49;
  ulong uVar50;
  ulong uVar51;
  char *pcVar52;
  long lVar53;
  byte bVar54;
  long unaff_x21;
  int *unaff_x22;
  long *plVar55;
  int *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  uint uVar56;
  long unaff_x29;
  float fVar57;
  int iVar58;
  float fVar59;
  undefined4 uVar60;
  int iVar61;
  int iVar67;
  float fVar68;
  ulong uVar62;
  undefined1 auVar63 [16];
  int iVar69;
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  undefined1 uVar70;
  undefined1 uVar71;
  undefined1 uVar72;
  undefined1 uVar73;
  undefined1 uVar74;
  undefined1 uVar75;
  undefined1 uVar76;
  undefined1 uVar77;
  float fVar78;
  float fVar79;
  undefined1 uVar80;
  undefined1 uVar81;
  undefined1 uVar82;
  undefined1 uVar83;
  float fVar84;
  float fVar85;
  int iVar86;
  float fVar87;
  float fVar88;
  long in_stack_00000050;
  int *in_stack_00000058;
  
code_r0x000c4e0c:
  pfVar40 = in_x10;
  if (param_2 != 0.0) goto LAB_000c4dc8;
code_r0x000c4e14:
  pfVar40 = in_x10;
  if ((((uint)in_x9 - 0x200 < 0x77) || (uVar56 = (uint)in_x9 & 0x7ffffffe, uVar56 == 0x298)) ||
     (uVar56 == 0x296)) {
    *(undefined8 *)(&UNK_000040b8 + unaff_x21) = *(undefined8 *)(&UNK_00003f50 + unaff_x21);
  }
LAB_000c4dc8:
  while( true ) {
    in_x9 = in_x9 + 1;
    in_x10 = pfVar40 + 4;
    if (in_x9 == 0x29a) break;
    param_2 = pfVar40[3];
    *in_x10 = param_2;
    if (*(char *)(pfVar40 + 2) != '\0') goto code_r0x000c4de8;
    pfVar40[3] = in_w11;
    pfVar40 = in_x10;
  }
  lVar38 = 0;
  pcVar52 = (char *)(param_1 + 0xb09);
  do {
    *(undefined4 *)(pcVar52 + -9) = *(undefined4 *)(pcVar52 + -5);
    cVar21 = (&UNK_00002e64)[lVar38 + unaff_x21];
    if (cVar21 == '\0') {
      pcVar52[-5] = -1;
      pcVar52[-4] = -1;
      pcVar52[-3] = -1;
      pcVar52[-2] = -1;
    }
    bVar26 = cVar21 != '\0' && *pcVar52 != '\0';
    *pcVar52 = bVar26;
    pcVar52[-1] = bVar26;
    lVar38 = lVar38 + 0x10;
    pcVar52 = pcVar52 + 0xc;
  } while (lVar38 != 0x9a0);
  piVar7 = unaff_x24 + 4;
  if (unaff_x24[5] < 0) {
    func_0x000eb044(piVar7,0);
  }
  iVar86 = 0;
  *piVar7 = 0;
  lVar38 = 0x200;
  iVar58 = 0;
  do {
    sVar12 = *(short *)(&UNK_00004810 + (lVar38 + -0x200) * 2 + unaff_x21);
    iVar67 = iVar58;
    if (sVar12 != -1) {
      uVar56 = (uint)lVar38;
      *(uint *)(unaff_x29 + -0x7c) = uVar56 & 0xf800;
      do {
        lVar53 = *(long *)(&UNK_00004950 + unaff_x21);
        pauVar2 = (undefined1 (*) [16])(lVar53 + (long)sVar12 * 0x10);
        (*pauVar2)[4] = (*pauVar2)[5];
        iVar61 = *(int *)(*pauVar2 + 0xc);
        *(int *)(*pauVar2 + 8) = iVar61;
        *(undefined4 *)(*pauVar2 + 0xc) = 0xffffffff;
        (*pauVar2)[5] = 0xff;
        if (iVar61 != -1) {
          if (iVar86 == unaff_x24[5]) {
            iVar67 = iVar86;
            if (iVar86 < 0) {
              iVar67 = iVar86 + 1;
            }
            uVar46 = 8;
            if (iVar86 != 0) {
              uVar46 = iVar86 + (iVar67 >> 1);
            }
            if ((int)uVar46 <= (int)(iVar86 + 1U)) {
              uVar46 = iVar86 + 1U;
            }
            lVar31 = (*pcRam0000000000a28da0)
                               (-(ulong)(uVar46 >> 0x1f) & 0xfffffff000000000 | (ulong)uVar46 << 4,
                                uRam0000000000a33a18);
            lVar43 = lRam0000000000a334c0;
            if (lRam0000000000a334c0 != 0) {
              piVar5 = (int *)(&UNK_000060d0 + lRam0000000000a334c0);
              piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
              lVar41 = (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0);
              lVar32 = lRam0000000000a334c0 + lVar41 * 8;
              if (*(int *)(&UNK_000060dc + lVar32) == *piVar1) {
                sVar45 = *(short *)(&UNK_000060e0 + lVar32) + 1;
              }
              else {
                iVar86 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
                *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar86;
                lVar41 = (long)iVar86;
                lVar32 = lVar43 + (long)iVar86 * 8;
                *(int *)(&UNK_000060dc + lVar32) = *piVar1;
                *(undefined4 *)(&UNK_000060e0 + lVar32) = 0;
                sVar45 = 1;
              }
              *(short *)(&UNK_000060e0 + lVar43 + lVar41 * 8) = sVar45;
              *piVar5 = *piVar5 + 1;
            }
            if (*(long *)(&UNK_00004960 + unaff_x21) != 0) {
              _memcpy(lVar31,*(long *)(&UNK_00004960 + unaff_x21),(long)*piVar7 << 4);
              lVar43 = lRam0000000000a334c0;
              lVar32 = *(long *)(&UNK_00004960 + unaff_x21);
              if ((lVar32 != 0) && (lRam0000000000a334c0 != 0)) {
                piVar5 = (int *)(&UNK_000060d4 + lRam0000000000a334c0);
                piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
                lVar42 = (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0);
                lVar41 = lRam0000000000a334c0 + lVar42 * 8;
                if (*(int *)(&UNK_000060dc + lVar41) == *piVar1) {
                  sVar45 = *(short *)(&UNK_000060e2 + lVar41) + 1;
                }
                else {
                  iVar86 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
                  *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar86;
                  lVar42 = (long)iVar86;
                  lVar41 = lVar43 + (long)iVar86 * 8;
                  *(int *)(&UNK_000060dc + lVar41) = *piVar1;
                  *(undefined4 *)(&UNK_000060e0 + lVar41) = 0;
                  sVar45 = 1;
                }
                *(short *)(&UNK_000060e2 + lVar43 + lVar42 * 8) = sVar45;
                *piVar5 = *piVar5 + 1;
              }
              (*pcRam0000000000a28da8)(lVar32,uRam0000000000a33a18);
            }
            *(long *)(&UNK_00004960 + unaff_x21) = lVar31;
            unaff_x24[5] = uVar46;
            iVar86 = unaff_x24[4];
          }
          else {
            lVar31 = *(long *)(&UNK_00004960 + unaff_x21);
          }
          auVar66 = *pauVar2;
          puVar14 = (undefined8 *)(lVar31 + (long)iVar86 * 0x10);
          puVar14[1] = auVar66._8_8_;
          *puVar14 = auVar66._0_8_;
          iVar86 = *piVar7 + 1;
          *piVar7 = iVar86;
          iVar67 = iVar86;
          if (*(uint *)(unaff_x21 + 0xe60) == (uint)*(ushort *)(lVar53 + (long)sVar12 * 0x10 + 2)) {
            lVar53 = lVar38;
            if (*(int *)(unaff_x29 + -0x7c) != 0) {
              if ((int)uVar56 < 0x2000) {
                if (uVar56 == 0x800) {
                  lVar53 = 0x296;
                  if (*(char *)(unaff_x21 + 0x59) != '\0') {
                    lVar53 = 0x299;
                  }
                }
                else if (uVar56 == 0x1000) {
                  lVar53 = 0x296;
                }
              }
              else if (uVar56 == 0x8000) {
                lVar53 = 0x299;
              }
              else if (uVar56 == 0x4000) {
                lVar53 = 0x298;
              }
              else if (uVar56 == 0x2000) {
                lVar53 = 0x297;
              }
            }
            if (*(int *)(&UNK_000040d4 + unaff_x21 + (long)((int)lVar53 + -0x200) * 0xc) == -1) {
              *(int *)(&UNK_000040d4 + unaff_x21 + (long)((int)lVar53 + -0x200) * 0xc) =
                   *(int *)(*pauVar2 + 8);
            }
          }
        }
        sVar12 = *(short *)*pauVar2;
      } while (sVar12 != -1);
    }
    iVar61 = iVar58;
    if (iVar67 <= iVar58) {
      iVar61 = -1;
    }
    *(short *)(&UNK_00004810 + (lVar38 + -0x200) * 2 + unaff_x21) = (short)iVar61;
    if (iVar58 < iVar67) {
      lVar32 = *(long *)(&UNK_00004960 + unaff_x21);
      lVar31 = (long)iVar58;
      lVar43 = (long)iVar67;
      uVar50 = lVar43 - lVar31;
      lVar53 = lVar31;
      if (3 < uVar50) {
        uVar51 = uVar50 & 0xfffffffffffffffc;
        lVar53 = uVar51 + lVar31;
        puVar47 = (undefined2 *)(lVar32 + lVar31 * 0x10 + 0x20);
        uVar48 = uVar51;
        do {
          lVar41 = lVar31 + 4;
          uVar27 = (undefined2)(lVar31 + 1);
          if (lVar43 <= lVar31 + 1) {
            uVar27 = 0xffff;
          }
          uVar33 = (undefined2)(lVar31 + 2);
          if (lVar43 <= lVar31 + 2) {
            uVar33 = 0xffff;
          }
          uVar34 = (undefined2)(lVar31 + 3);
          if (lVar43 <= lVar31 + 3) {
            uVar34 = 0xffff;
          }
          puVar47[-0x10] = uVar27;
          puVar47[-8] = uVar33;
          uVar27 = (undefined2)lVar41;
          if (lVar43 <= lVar41) {
            uVar27 = 0xffff;
          }
          *puVar47 = uVar34;
          puVar47[8] = uVar27;
          puVar47 = puVar47 + 0x20;
          uVar48 = uVar48 - 4;
          lVar31 = lVar41;
        } while (uVar48 != 0);
        if (uVar50 == uVar51) goto code_r0x000c4ee0;
      }
      puVar47 = (undefined2 *)(lVar32 + lVar53 * 0x10);
      do {
        lVar53 = lVar53 + 1;
        uVar27 = (undefined2)lVar53;
        if (lVar43 <= lVar53) {
          uVar27 = 0xffff;
        }
        *puVar47 = uVar27;
        puVar47 = puVar47 + 8;
      } while (lVar43 != lVar53);
    }
code_r0x000c4ee0:
    lVar38 = lVar38 + 1;
    iVar58 = iVar67;
  } while (lVar38 != 0x29a);
  *(undefined4 *)(unaff_x29 + -0x7c) = 0;
  iVar58 = unaff_x24[5];
  *(undefined8 *)(&UNK_00004958 + unaff_x21) = *(undefined8 *)(&UNK_00004948 + unaff_x21);
  *unaff_x24 = iVar86;
  unaff_x24[1] = iVar58;
  uVar35 = *(undefined8 *)(&UNK_00004960 + unaff_x21);
  *(undefined8 *)(&UNK_00004960 + unaff_x21) = *(undefined8 *)(&UNK_00004950 + unaff_x21);
  *(undefined8 *)(&UNK_00004950 + unaff_x21) = uVar35;
  lVar38 = lRam0000000000a334c0;
  pcVar52 = &UNK_000040e8 + lRam0000000000a334c0;
  pcVar6 = &UNK_00002e74 + lRam0000000000a334c0;
  *(undefined1 *)(lRam0000000000a334c0 + 0xcd) = 0;
  uVar56 = *(uint *)(lVar38 + 8);
  if ((uVar56 >> 1 & 1) != 0) {
    if ((*(byte *)(lVar38 + 0xc) & 1) == 0) {
      *(undefined4 *)(unaff_x29 + -0x7c) = 0;
    }
    else {
      if (((&UNK_00003604)[lVar38] != '\0') && ((&UNK_00004694)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_000035f4)[lVar38] != '\0') && ((&UNK_00004688)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003614)[lVar38] != '\0') && ((&UNK_000046a0)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003624)[lVar38] != '\0') && ((&UNK_000046ac)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003644)[lVar38] != '\0') && ((&UNK_000046c4)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003634)[lVar38] != '\0') && ((&UNK_000046b8)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003654)[lVar38] != '\0') && ((&UNK_000046d0)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      if (((&UNK_00003664)[lVar38] != '\0') && ((&UNK_000046dc)[lVar38] == '\0')) {
        *(undefined4 *)(&UNK_00004b64 + lVar38) = 3;
      }
      *(undefined4 *)(unaff_x29 + -0x7c) = 1;
    }
  }
  if ((uVar56 & 1) != 0) {
    if (((&UNK_00002f24)[lVar38] != '\0') && ((&UNK_0000416c)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if (((&UNK_00002f34)[lVar38] != '\0') && ((&UNK_00004178)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if (((&UNK_00002f44)[lVar38] != '\0') && ((&UNK_00004184)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if (((&UNK_00002e84)[lVar38] != '\0') && ((&UNK_000040f4)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if ((*pcVar6 != '\0') && (*pcVar52 == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if (((&UNK_00002e94)[lVar38] != '\0') && ((&UNK_00004100)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
    if (((&UNK_00002ea4)[lVar38] != '\0') && ((&UNK_0000410c)[lVar38] == '\0')) {
      *(undefined4 *)(&UNK_00004b64 + lVar38) = 2;
    }
  }
  *(undefined4 *)(&UNK_00004b50 + lVar38) = 0;
  if (*(int *)(&UNK_00004b88 + lVar38) != 0) {
    func_0x000db2c0();
  }
  *(undefined2 *)(&UNK_00004b7d + lVar38) = 0;
  *(undefined4 *)(&UNK_00004b88 + lVar38) = 0;
  if ((&UNK_00004bc0)[lVar38] != '\0') {
    func_0x000db3e0();
  }
  *(undefined4 *)(&UNK_00004c04 + lVar38) = 0;
  *(undefined2 *)(&UNK_00004bc0 + lVar38) = 0;
  if (((((&UNK_00004b79)[lVar38] == '\0') || ((&UNK_00004b78)[lVar38] == '\0')) ||
      ((&UNK_00004b7a)[lVar38] != '\0')) || ((&UNK_00004b7b)[lVar38] == '\0')) {
    bVar26 = false;
    (&UNK_00004b79)[lVar38] = 0;
    lVar53 = *(long *)(&UNK_00004b18 + lVar38);
  }
  else {
    bVar26 = *(long *)(&UNK_00004b18 + lVar38) != 0;
    (&UNK_00004b79)[lVar38] = 0;
    lVar53 = *(long *)(&UNK_00004b18 + lVar38);
  }
  if (lVar53 != 0) {
    lVar31 = lVar53;
    do {
      if ((*(long *)(lVar31 + 0x388) == lVar31) || ((*(byte *)(lVar31 + 0x17) & 0x14) != 0)) {
        if (lVar31 != lVar53) {
          *(long *)(lVar31 + 0x3b0) = lVar53;
        }
        break;
      }
      lVar31 = *(long *)(lVar31 + 0x378);
    } while (lVar31 != 0);
    if ((*(long *)(lVar53 + 0x3b0) != 0) && (*(int *)(&UNK_00004b68 + lVar38) == 0)) {
      *(undefined8 *)(lVar53 + 0x3b0) = 0;
    }
  }
  lVar53 = lRam0000000000a334c0;
  if ((int)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) < 1) {
code_r0x000c557c:
    bVar22 = true;
    lVar31 = *(long *)(&UNK_00004d18 + lRam0000000000a334c0);
  }
  else {
    uVar50 = (ulong)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) + 1;
    while ((lVar31 = *(long *)(*(long *)(&UNK_00004ad8 + lRam0000000000a334c0) +
                               (ulong)((int)uVar50 - 2) * 0x38 + 8), lVar31 == 0 ||
           ((*(byte *)(lVar31 + 0x17) >> 3 & 1) == 0))) {
      uVar50 = uVar50 - 1;
      if (uVar50 < 2) goto code_r0x000c557c;
    }
    bVar22 = false;
    *(undefined8 *)(&UNK_00004d10 + lRam0000000000a334c0) = 0;
    lVar31 = *(long *)(&UNK_00004d18 + lVar53);
  }
  if ((lVar31 != 0) && (*(long *)(&UNK_00004d10 + lVar53) == 0)) {
    fVar57 = *(float *)(&UNK_00004d2c + lVar53) + *(float *)(lVar53 + 0x18) * -10.0;
    if (fVar57 < 0.0) {
      fVar57 = 0.0;
    }
    *(float *)(&UNK_00004d2c + lVar53) = fVar57;
    if ((*(float *)(&UNK_00004d48 + lVar53) <= 0.0) && (fVar57 <= 0.0)) {
      *(undefined8 *)(&UNK_00004d18 + lVar53) = 0;
    }
  }
  lVar31 = 0;
  uVar46 = 0xffffffff;
  uVar30 = 0x23;
  do {
    lVar43 = lVar31 + 1;
    if (((uVar30 == 0x23) && ((byte)"###NavUpdateWindowing"[lVar43] == 0x23)) &&
       ("###NavUpdateWindowing"[lVar31 + 2] == '#')) {
      uVar46 = 0xffffffff;
    }
    uVar46 = *(uint *)(&UNK_0080c404 + (ulong)(uVar46 & 0xff ^ uVar30) * 4) ^ uVar46 >> 8;
    lVar31 = lVar31 + 1;
    uVar30 = (uint)(byte)"###NavUpdateWindowing"[lVar43];
  } while (lVar31 != 0x15);
  uVar13 = ~uVar46;
  uVar30 = *(uint *)(lVar53 + 8);
  if ((uVar30 >> 1 & 1) == 0) {
    bVar54 = 0;
    if (!bVar22) goto code_r0x000c5658;
code_r0x000c567c:
    iVar86 = *(int *)(&UNK_00004d08 + lVar53);
    uVar28 = 0;
    if (iVar86 != 0) {
      uVar28 = uVar13;
      if (uVar46 + 1 < 2) {
        uVar28 = *(uint *)(&UNK_00004978 + lVar53);
      }
      iVar58 = func_0x000d60b8(iVar86,uVar28,&UNK_00011001);
      if (iVar58 == 0) {
        uVar28 = 0;
      }
      else {
        uVar28 = func_0x000d7798(iVar86,uVar28,&UNK_00011021);
      }
    }
    iVar86 = *(int *)(&UNK_00004d0c + lVar53);
    uVar29 = 0;
    if (iVar86 != 0) {
      uVar29 = uVar13;
      if (uVar46 + 1 < 2) {
        uVar29 = *(uint *)(&UNK_00004978 + lRam0000000000a334c0);
      }
      iVar58 = func_0x000d60b8(iVar86,uVar29,&UNK_00011001);
      if (iVar58 == 0) {
        uVar29 = 0;
      }
      else {
        uVar29 = func_0x000d7798(iVar86,uVar29,&UNK_00011021);
      }
    }
    bVar9 = 0;
    if (*(long *)(&UNK_00004d10 + lVar53) == 0) {
      bVar9 = bVar54;
    }
    uVar11 = uVar28;
    uVar20 = uVar29;
    if (bVar9 == 1) {
      if (((&UNK_000035f4)[lRam0000000000a334c0] == '\0') ||
         (*(float *)(&UNK_000035f8 + lRam0000000000a334c0) != 0.0)) {
        bVar22 = false;
        uVar46 = uVar28 | uVar29;
      }
      else {
        bVar22 = (&UNK_00004688)[lRam0000000000a334c0] == '\0';
        uVar46 = uVar28 | uVar29;
        if (bVar22) goto code_r0x000c5800;
      }
    }
    else {
      bVar22 = false;
      uVar46 = 0;
      if (*(long *)(&UNK_00004d10 + lVar53) == 0) {
        uVar46 = uVar28 | uVar29;
      }
    }
code_r0x000c57fc:
    uVar29 = uVar20;
    uVar28 = uVar11;
    if (uVar46 != 0) goto code_r0x000c5800;
  }
  else {
    bVar54 = *(byte *)(lVar53 + 0xc) & 1;
    if (bVar22) goto code_r0x000c567c;
code_r0x000c5658:
    uVar28 = 0;
    uVar29 = 0;
    uVar46 = 0;
    uVar11 = 0;
    uVar20 = 0;
    if (bVar22 == false) goto code_r0x000c57fc;
code_r0x000c5800:
    if (*(long *)(&UNK_00004b18 + lVar53) == 0) {
      uVar11 = *(uint *)(&UNK_00003fb0 + lVar53);
      if ((0 < (int)uVar11) && ((int)uVar11 <= *(int *)(&UNK_00003fb0 + lRam0000000000a334c0))) {
        uVar50 = (ulong)uVar11 + 1;
        do {
          lVar31 = *(long *)(*(long *)(&UNK_00003fb8 + lRam0000000000a334c0) +
                            (ulong)((int)uVar50 - 2) * 8);
          if (((*(char *)(lVar31 + 0xbf) != '\0') && (*(long *)(lVar31 + 0x388) == lVar31)) &&
             ((*(byte *)(lVar31 + 0x16) >> 1 & 1) == 0)) goto code_r0x000c580c;
          uVar50 = uVar50 - 1;
        } while (1 < uVar50);
      }
    }
    else {
      lVar31 = *(long *)(*(long *)(&UNK_00004b18 + lVar53) + 0x388);
code_r0x000c580c:
      *(long *)(&UNK_00004d18 + lVar53) = lVar31;
      *(long *)(&UNK_00004d10 + lVar53) = lVar31;
      *(undefined8 *)(&UNK_00004d28 + lVar53) = 0;
      *(undefined8 *)(&UNK_00004d40 + lVar53) = 0;
      *(undefined8 *)(&UNK_00004d38 + lVar53) = 0;
      (&UNK_00004d30)[lVar53] = bVar22;
      uVar60 = 2;
      if (uVar46 == 0) {
        uVar60 = 3;
      }
      *(undefined4 *)(&UNK_00004b64 + lVar53) = uVar60;
      if ((uVar28 | uVar29) == 1) {
        func_0x000d7560((*(uint *)(&UNK_00004d0c + lVar53) | *(uint *)(&UNK_00004d08 + lVar53)) &
                        0xf800,uVar13,0);
      }
    }
  }
  fVar57 = *(float *)(&UNK_00004d28 + lVar53);
  uVar70 = SUB41(fVar57,0);
  uVar72 = (undefined1)((uint)fVar57 >> 8);
  uVar74 = (undefined1)((uint)fVar57 >> 0x10);
  uVar76 = (undefined1)((uint)fVar57 >> 0x18);
  fVar57 = *(float *)(lVar53 + 0x18) + fVar57;
  *(float *)(&UNK_00004d28 + lVar53) = fVar57;
  lVar31 = *(long *)(&UNK_00004d10 + lVar53);
  if (lVar31 == 0) goto code_r0x000c5b80;
  iVar86 = *(int *)(&UNK_00004b64 + lVar53);
  if (iVar86 == 3) {
    fVar59 = *(float *)(&UNK_00004d2c + lVar53);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    fVar57 = (fVar57 + -0.2) / 0.05;
    uVar71 = 0;
    uVar73 = 0;
    uVar75 = 0x80;
    uVar77 = 0x3f;
    if (fVar57 <= 1.0) {
      uVar71 = SUB41(fVar57,0);
      uVar73 = (undefined1)((uint)fVar57 >> 8);
      uVar75 = (undefined1)((uint)fVar57 >> 0x10);
      uVar77 = (undefined1)((uint)fVar57 >> 0x18);
    }
    fVar84 = 0.0;
    if (0.0 <= fVar57) {
      fVar84 = (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)));
    }
    if (fVar59 < fVar84) {
      fVar59 = fVar84;
    }
    *(float *)(&UNK_00004d2c + lVar53) = fVar59;
    uVar46 = (uint)(byte)(&UNK_00003674)[lRam0000000000a334c0];
    if ((&UNK_00003674)[lRam0000000000a334c0] == 0) {
code_r0x000c5920:
      cVar21 = (&UNK_00003684)[lRam0000000000a334c0];
    }
    else {
      fVar57 = *(float *)(&UNK_00003678 + lRam0000000000a334c0);
      uVar70 = SUB41(fVar57,0);
      uVar72 = (undefined1)((uint)fVar57 >> 8);
      uVar74 = (undefined1)((uint)fVar57 >> 0x10);
      uVar76 = (undefined1)((uint)fVar57 >> 0x18);
      if (fVar57 < 0.0) {
code_r0x000c591c:
        uVar46 = 0;
        goto code_r0x000c5920;
      }
      if (fVar57 == 0.0) goto code_r0x000c597c;
      fVar84 = *(float *)(lRam0000000000a334c0 + 0x70);
      if ((fVar57 <= fVar84) ||
         (fVar85 = fVar57 - *(float *)(lRam0000000000a334c0 + 0x18), fVar57 <= fVar85))
      goto code_r0x000c591c;
      fVar68 = *(float *)(lRam0000000000a334c0 + 0x74);
      if (fVar68 <= 0.0) {
        bVar22 = false;
        if ((fVar84 <= fVar57) && (bVar22 = false, !NAN(fVar85) && !NAN(fVar84))) {
          bVar22 = fVar85 < fVar84;
        }
        if (!bVar22) goto code_r0x000c591c;
      }
      else {
        if (fVar84 <= fVar85) {
          iVar86 = (int)((fVar85 - fVar84) / fVar68);
        }
        else {
          iVar86 = -1;
        }
        if (fVar84 <= fVar57) {
          fVar68 = (fVar57 - fVar84) / fVar68;
          uVar70 = SUB41(fVar68,0);
          uVar72 = (undefined1)((uint)fVar68 >> 8);
          uVar74 = (undefined1)((uint)fVar68 >> 0x10);
          uVar76 = (undefined1)((uint)fVar68 >> 0x18);
          iVar58 = (int)fVar68;
        }
        else {
          iVar58 = -1;
        }
        if (iVar58 <= iVar86) goto code_r0x000c591c;
      }
code_r0x000c597c:
      uVar46 = (uint)((&UNK_000046e8)[lRam0000000000a334c0] == '\0');
      cVar21 = (&UNK_00003684)[lRam0000000000a334c0];
    }
    if (cVar21 != '\0') {
      fVar57 = *(float *)(&UNK_00003688 + lRam0000000000a334c0);
      uVar70 = SUB41(fVar57,0);
      uVar72 = (undefined1)((uint)fVar57 >> 8);
      uVar74 = (undefined1)((uint)fVar57 >> 0x10);
      uVar76 = (undefined1)((uint)fVar57 >> 0x18);
      if (0.0 <= fVar57) {
        if (fVar57 == 0.0) goto code_r0x000c5938;
        fVar84 = *(float *)(lRam0000000000a334c0 + 0x70);
        if ((fVar84 < fVar57) &&
           (fVar85 = fVar57 - *(float *)(lRam0000000000a334c0 + 0x18), fVar85 < fVar57)) {
          fVar68 = *(float *)(lRam0000000000a334c0 + 0x74);
          if (fVar68 <= 0.0) {
            bVar22 = false;
            if ((fVar84 <= fVar57) && (bVar22 = false, !NAN(fVar85) && !NAN(fVar84))) {
              bVar22 = fVar85 < fVar84;
            }
            if (bVar22) goto code_r0x000c5938;
          }
          else {
            iVar86 = -1;
            if (fVar84 <= fVar85) {
              iVar86 = (int)((fVar85 - fVar84) / fVar68);
            }
            fVar68 = (fVar57 - fVar84) / fVar68;
            uVar70 = SUB41(fVar68,0);
            uVar72 = (undefined1)((uint)fVar68 >> 8);
            uVar74 = (undefined1)((uint)fVar68 >> 0x10);
            uVar76 = (undefined1)((uint)fVar68 >> 0x18);
            iVar58 = -1;
            if (fVar84 <= fVar57) {
              iVar58 = (int)fVar68;
            }
            if (iVar86 < iVar58) {
code_r0x000c5938:
              uVar46 = uVar46 - ((&UNK_000046f4)[lRam0000000000a334c0] == '\0');
            }
          }
        }
      }
    }
    if (uVar46 != 0) {
      func_0x000eb61c(uVar46);
      *(undefined4 *)(&UNK_00004d2c + lVar53) = 0x3f800000;
      fVar59 = 1.0;
    }
    if (((&UNK_000035f4)[lRam0000000000a334c0] != '\0') &&
       ((&UNK_00004688)[lRam0000000000a334c0] == '\0')) {
      lVar31 = *(long *)(&UNK_00004d10 + lVar53);
      if (lVar31 == 0) goto code_r0x000c5b80;
      iVar86 = *(int *)(&UNK_00004b64 + lVar53);
      goto code_r0x000c5b08;
    }
    uVar70 = 0;
    uVar72 = 0;
    uVar74 = 0x80;
    uVar76 = 0x3f;
    cVar21 = (&UNK_00004d30)[lVar53];
    (&UNK_00004d30)[lVar53] = 1.0 > fVar59 && cVar21 != '\0';
    if (1.0 <= fVar59 || cVar21 == '\0') {
      bVar22 = false;
      lVar43 = *(long *)(&UNK_00004d10 + lVar53);
    }
    else {
      lVar43 = 0;
      bVar22 = *(long *)(&UNK_00004b18 + lVar53) != 0;
    }
    *(undefined8 *)(&UNK_00004d10 + lVar53) = 0;
  }
  else {
code_r0x000c5b08:
    if (iVar86 == 2) {
      fVar57 = (*(float *)(&UNK_00004d28 + lVar53) + -0.2) / 0.05;
      uVar71 = 0;
      uVar73 = 0;
      uVar75 = 0x80;
      uVar77 = 0x3f;
      if (fVar57 <= 1.0) {
        uVar71 = SUB41(fVar57,0);
        uVar73 = (char)((uint)fVar57 >> 8);
        uVar75 = (char)((uint)fVar57 >> 0x10);
        uVar77 = (char)((uint)fVar57 >> 0x18);
      }
      uVar70 = 0;
      uVar72 = 0;
      uVar74 = 0;
      uVar76 = 0;
      if (0.0 <= fVar57) {
        uVar70 = uVar71;
        uVar72 = uVar73;
        uVar74 = uVar75;
        uVar76 = uVar77;
      }
      fVar57 = *(float *)(&UNK_00004d2c + lVar53);
      if (*(float *)(&UNK_00004d2c + lVar53) <
          (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)))) {
        fVar57 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
      }
      *(float *)(&UNK_00004d2c + lVar53) = fVar57;
      if ((uVar28 | uVar29) == 1) {
        uVar60 = 1;
        if (uVar28 != 0) {
          uVar60 = 0xffffffff;
        }
        func_0x000eb61c(uVar60);
        goto code_r0x000c5b80;
      }
      uVar46 = 0xf800;
      if (*(uint *)(&UNK_00004d0c + lVar53) != 0) {
        uVar46 = *(uint *)(&UNK_00004d0c + lVar53);
      }
      uVar13 = 0xf800;
      if (*(uint *)(&UNK_00004d08 + lVar53) != 0) {
        uVar13 = *(uint *)(&UNK_00004d08 + lVar53) & 0xf800;
      }
      lVar43 = 0;
      if ((uVar46 & uVar13 & (*(uint *)(lVar53 + 0xe60) ^ 0xffffffff)) != 0) {
        lVar43 = lVar31;
      }
    }
    else {
code_r0x000c5b80:
      lVar43 = 0;
    }
    bVar22 = false;
  }
  lVar31 = lRam0000000000a334c0;
  piVar7 = (int *)(&UNK_000047f4 + lRam0000000000a334c0);
  if ((uVar30 & 1) != 0) {
    if (((((&UNK_00002f74)[lRam0000000000a334c0] == '\0') ||
         (*(float *)(&UNK_00002f78 + lRam0000000000a334c0) != 0.0)) ||
        (((&UNK_0000496c)[lRam0000000000a334c0] != '\0' &&
         (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)))) ||
       (*(int *)(&UNK_000041a0 + lRam0000000000a334c0) != -1)) {
      if ((((&UNK_00002fb4)[lRam0000000000a334c0] == '\0') ||
          (*(float *)(&UNK_00002fb8 + lRam0000000000a334c0) != 0.0)) ||
         ((((&UNK_0000496c)[lRam0000000000a334c0] != '\0' &&
           (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)) ||
          (*(int *)(&UNK_000041d0 + lRam0000000000a334c0) != -1)))) goto code_r0x000c5c68;
      uVar60 = 0x215;
    }
    else {
      uVar60 = 0x211;
    }
    (&UNK_00004d30)[lVar53] = 1;
    *(undefined4 *)(&UNK_00004d34 + lVar53) = uVar60;
    *(undefined4 *)(&UNK_00004b64 + lVar53) = 2;
  }
code_r0x000c5c68:
  if (((&UNK_00004d30)[lVar53] != '\0') && (*(int *)(&UNK_00004b64 + lVar53) == 2)) {
    if ((*(int *)(&UNK_000038d8 + lVar53) < 1) &&
       (((*(char *)(lVar53 + 0xe5c) == '\0' && (*(char *)(lVar53 + 0xe5d) == '\0')) &&
        (*(char *)(lVar53 + 0xe5f) == '\0')))) {
      bVar23 = false;
      uVar46 = *(uint *)(&UNK_00004d34 + lVar53);
      uVar30 = uVar46 - 0x200;
      if (0x99 < uVar30) goto code_r0x000c68c0;
code_r0x000c5cc4:
      if (((&UNK_0000496c)[lVar31] == '\0') ||
         ((0x76 < uVar30 || (*(int *)(&UNK_00004064 + lVar31) == -1)))) {
        uVar30 = uVar46;
        if ((uVar46 & 0xf800) != 0) {
          if ((int)uVar46 < 0x2000) {
            if (uVar46 == 0x800) {
              uVar30 = 0x296;
              if (*(char *)(lVar31 + 0x59) != '\0') {
                uVar30 = 0x299;
              }
            }
            else if (uVar46 == 0x1000) {
              uVar30 = 0x296;
            }
          }
          else if (uVar46 == 0x8000) {
            uVar30 = 0x299;
          }
          else if (uVar46 == 0x4000) {
            uVar30 = 0x298;
          }
          else if (uVar46 == 0x2000) {
            uVar30 = 0x297;
          }
        }
        if (*(int *)(&UNK_000040d4 + lVar31 + (ulong)(uVar30 - 0x200) * 0xc) == -1)
        goto code_r0x000c5d74;
      }
code_r0x000c5d80:
      (&UNK_00004d30)[lVar53] = 0;
    }
    else {
      (&UNK_00004d30)[lVar53] = 0;
      bVar23 = true;
      uVar46 = *(uint *)(&UNK_00004d34 + lVar53);
      uVar30 = uVar46 - 0x200;
      if (uVar30 < 0x9a) goto code_r0x000c5cc4;
code_r0x000c68c0:
      if ((int)uVar46 < 0x2000) {
        if ((uVar46 == 0x800) || (uVar46 == 0x1000)) goto code_r0x000c5cc4;
      }
      else if ((uVar46 == 0x2000) || ((uVar46 == 0x8000 || (uVar46 == 0x4000))))
      goto code_r0x000c5cc4;
code_r0x000c5d74:
      if (*piVar7 != -1) goto code_r0x000c5d80;
      uVar30 = func_0x000d6bdc(uVar46);
      if ((!(bVar23 || ((uVar30 ^ 1) & 1) != 0)) &&
         ((*(int *)(&UNK_00004064 + lVar53) == 0 || ((&UNK_00004071)[lVar53] != '\0')))) {
        fVar57 = *(float *)(&UNK_0000380c + lVar53);
        uVar70 = SUB41(fVar57,0);
        uVar72 = (undefined1)((uint)fVar57 >> 8);
        uVar74 = (undefined1)((uint)fVar57 >> 0x10);
        uVar76 = (undefined1)((uint)fVar57 >> 0x18);
        bVar22 = (bool)((-256000.0 <= *(float *)(lVar53 + 0xe44) &&
                        -256000.0 <= *(float *)(lVar53 + 0xe40)) ==
                        (-256000.0 <= fVar57 && -256000.0 <= *(float *)(&UNK_00003808 + lVar53)) |
                       bVar22);
      }
    }
    uVar50 = func_0x000d6518(uVar46);
    if ((uVar50 & 1) == 0) {
      (&UNK_00004d30)[lVar53] = 0;
    }
  }
  lVar32 = *(long *)(&UNK_00004d10 + lVar53);
  if ((lVar32 != 0) && ((*(byte *)(lVar32 + 0x14) >> 2 & 1) == 0)) {
    if (*(int *)(&UNK_00004b64 + lVar53) == 3) {
      puVar49 = &UNK_00003710;
      fVar57 = *(float *)(&UNK_000036f0 + lVar31) - *(float *)(&UNK_000036e0 + lVar31);
      puVar44 = &UNK_00003700;
code_r0x000c5e04:
      uVar35 = CONCAT44(*(float *)(puVar49 + lVar31) - *(float *)(puVar44 + lVar31),fVar57);
    }
    else {
      uVar35 = 0;
      if ((*(int *)(&UNK_00004b64 + lVar53) == 2) && (*(char *)(lVar53 + 0xe5d) == '\0')) {
        puVar49 = &UNK_00002eb0;
        fVar57 = *(float *)(&UNK_00002e90 + lVar31) - *(float *)(&UNK_00002e80 + lVar31);
        puVar44 = &UNK_00002ea0;
        goto code_r0x000c5e04;
      }
    }
    fVar57 = (float)((ulong)uVar35 >> 0x20);
    if ((float)uVar35 == 0.0) {
      uVar70 = (undefined1)((ulong)uVar35 >> 0x20);
      uVar72 = (undefined1)((ulong)uVar35 >> 0x28);
      uVar74 = (undefined1)((ulong)uVar35 >> 0x30);
      uVar76 = (undefined1)((ulong)uVar35 >> 0x38);
      if (fVar57 == 0.0) goto code_r0x000c5f3c;
    }
    fVar59 = *(float *)(lVar53 + 0x50);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    fVar84 = *(float *)(lVar53 + 0x54);
    if (fVar84 <= fVar59) {
      uVar70 = SUB41(fVar84,0);
      uVar72 = (undefined1)((uint)fVar84 >> 8);
      uVar74 = (undefined1)((uint)fVar84 >> 0x10);
      uVar76 = (undefined1)((uint)fVar84 >> 0x18);
    }
    fVar59 = *(float *)(lVar53 + 0x18) * 800.0 *
             (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
    (&UNK_00004b7b)[lVar53] = 1;
    fVar84 = (float)*(undefined8 *)(&UNK_00004d38 + lVar53) + (float)uVar35 * fVar59;
    fVar57 = (float)((ulong)*(undefined8 *)(&UNK_00004d38 + lVar53) >> 0x20) + fVar57 * fVar59;
    *(ulong *)(&UNK_00004d38 + lVar53) = CONCAT44(fVar57,fVar84);
    iVar58 = (int)fVar84;
    iVar67 = (int)fVar57;
    uVar70 = iVar58 != 0;
    iVar86 = -(uint)(byte)uVar70;
    uVar72 = (undefined1)((uint)iVar86 >> 8);
    uVar74 = (undefined1)((uint)iVar86 >> 0x10);
    uVar76 = (undefined1)((uint)iVar86 >> 0x18);
    if ((bool)uVar70 || iVar67 != 0) {
      uVar35 = NEON_scvtf(CONCAT44(iVar67,iVar58),4);
      lVar32 = *(long *)(lVar32 + 0x388);
      fVar57 = (float)((ulong)uVar35 >> 0x20);
      if ((*(uint *)(lVar32 + 0xe8) & 1) != 0) {
        *(uint *)(lVar32 + 0xe8) = *(uint *)(lVar32 + 0xe8) & 0xfffffff1;
        *(undefined8 *)(lVar32 + 0xec) = 0x7f7fffff7f7fffff;
        fVar59 = (float)*(undefined8 *)(lVar32 + 0x28);
        fVar84 = (float)((ulong)*(undefined8 *)(lVar32 + 0x28) >> 0x20);
        iVar86 = (int)(fVar84 + fVar57);
        uVar16 = NEON_scvtf(CONCAT17((char)((uint)iVar86 >> 0x18),
                                     CONCAT16((char)((uint)iVar86 >> 0x10),
                                              CONCAT15((char)((uint)iVar86 >> 8),
                                                       CONCAT14((char)iVar86,
                                                                (int)(fVar59 + (float)uVar35))))),4)
        ;
        *(undefined8 *)(lVar32 + 0x28) = uVar16;
        fVar59 = (float)uVar16 - fVar59;
        fVar84 = (float)((ulong)uVar16 >> 0x20) - fVar84;
        uVar70 = (undefined1)((uint)fVar84 >> 8);
        uVar72 = (undefined1)((uint)fVar84 >> 0x10);
        uVar74 = (undefined1)((uint)fVar84 >> 0x18);
        if ((fVar59 != 0.0) || (fVar84 != 0.0)) {
          if (((*(byte *)(lVar32 + 0x15) & 1) == 0) && (*(float *)(&UNK_00005f5c + lVar31) <= 0.0))
          {
            *(undefined4 *)(&UNK_00005f5c + lVar31) = *(undefined4 *)(lVar31 + 0x1c);
          }
          *(float *)(lVar32 + 0x110) = fVar59 + *(float *)(lVar32 + 0x110);
          *(float *)(lVar32 + 0x114) = fVar84 + *(float *)(lVar32 + 0x114);
          fVar85 = fVar84 + (float)((ulong)*(undefined8 *)(lVar32 + 0x130) >> 0x20);
          *(ulong *)(lVar32 + 0x130) =
               CONCAT17((char)((uint)fVar85 >> 0x18),
                        CONCAT16((char)((uint)fVar85 >> 0x10),
                                 CONCAT15((char)((uint)fVar85 >> 8),
                                          CONCAT14(SUB41(fVar85,0),
                                                   fVar59 + (float)*(undefined8 *)(lVar32 + 0x130)))
                                ));
          fVar85 = (float)(CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(fVar84,0),
                                                                                    fVar59)))) >>
                          0x20) + (float)((ulong)*(undefined8 *)(lVar32 + 0x120) >> 0x20);
          *(ulong *)(lVar32 + 0x128) =
               CONCAT44((float)(CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(
                                                  fVar84,0),fVar59)))) >> 0x20) +
                        (float)((ulong)*(undefined8 *)(lVar32 + 0x128) >> 0x20),
                        fVar59 + (float)*(undefined8 *)(lVar32 + 0x128));
          *(ulong *)(lVar32 + 0x120) =
               CONCAT17((char)((uint)fVar85 >> 0x18),
                        CONCAT16((char)((uint)fVar85 >> 0x10),
                                 CONCAT15((char)((uint)fVar85 >> 8),
                                          CONCAT14(SUB41(fVar85,0),
                                                   fVar59 + (float)*(undefined8 *)(lVar32 + 0x120)))
                                ));
        }
      }
      *(float *)(&UNK_00004d38 + lVar53) = *(float *)(&UNK_00004d38 + lVar53) - (float)uVar35;
      fVar59 = *(float *)(&UNK_00004d3c + lVar53);
      uVar70 = SUB41(fVar59,0);
      uVar72 = (undefined1)((uint)fVar59 >> 8);
      uVar74 = (undefined1)((uint)fVar59 >> 0x10);
      uVar76 = (undefined1)((uint)fVar59 >> 0x18);
      *(float *)(&UNK_00004d3c + lVar53) = fVar59 - fVar57;
    }
  }
code_r0x000c5f3c:
  if (lVar43 != 0) {
    if ((*(long *)(&UNK_00004b18 + lVar53) == 0) ||
       (lVar43 != *(long *)(*(long *)(&UNK_00004b18 + lVar53) + 0x388))) {
      func_0x000c23ac(0,0);
      lVar31 = lRam0000000000a334c0;
      puVar8 = (uint *)(&UNK_00004ad0 + lRam0000000000a334c0);
      *(undefined2 *)(&UNK_00004b79 + lRam0000000000a334c0) = 1;
      (&UNK_00004b7b)[lVar31] = 1;
      uVar46 = *puVar8;
      if (uVar46 != 0) {
        if ((int)uVar46 < 1) {
          uVar50 = 0;
code_r0x000c6004:
          if ((int)uVar50 < (int)uVar46) {
            if (((byte)(&UNK_0000603c)[lVar31] >> 2 & 1) != 0) {
              func_0x000bae48("[popup] ClosePopupsOverWindow(\"%s\")\n");
            }
            func_0x000d9868(uVar50,0);
          }
        }
        else {
          uVar50 = 0;
          do {
            lVar32 = *(long *)(*(long *)(&UNK_00004ad8 + lVar31) + uVar50 * 0x38 + 8);
            if ((lVar32 != 0) && ((*(byte *)(lVar32 + 0x17) & 1) == 0)) {
              uVar48 = uVar50;
              while (lVar32 = *(long *)(*(long *)(&UNK_00004ad8 + lVar31) + uVar48 * 0x38 + 8),
                    lVar32 == 0) {
code_r0x000c5fc4:
                uVar48 = uVar48 + 1;
                if (uVar48 == uVar46) goto code_r0x000c6004;
              }
              if (*(long *)(lVar43 + 0x388) != lVar32) {
                lVar41 = lVar43;
                while (lVar41 != lVar32) {
                  lVar41 = *(long *)(lVar41 + 0x380);
                  if (lVar41 == 0) goto code_r0x000c5fc4;
                }
              }
            }
            uVar50 = uVar50 + 1;
          } while (uVar50 != uVar46);
        }
      }
      func_0x000c3098(lVar43,1);
      lVar31 = *(long *)(&UNK_00004b18 + lVar53);
      if (*(int *)(lVar31 + 0x3b8) == 0) {
        func_0x000d0a00(lVar31,0);
        sVar12 = *(short *)(lVar31 + 0x16e);
      }
      else {
        sVar12 = *(short *)(lVar31 + 0x16e);
      }
      if (sVar12 == 2) {
        *(undefined4 *)(&UNK_00004b68 + lVar53) = 1;
      }
    }
    *(undefined8 *)(&UNK_00004d10 + lVar53) = 0;
  }
  if ((bVar22) && (*(long *)(&UNK_00004b18 + lVar53) != 0)) {
    func_0x000c23ac(0,0);
    lVar43 = *(long *)(&UNK_00004b18 + lVar53);
    lVar31 = lVar43;
    do {
      lVar32 = lVar31;
      if ((*(long *)(lVar32 + 0x378) == 0) || ((*(ushort *)(lVar32 + 0x16c) >> 1 & 1) != 0)) break;
      lVar31 = *(long *)(lVar32 + 0x378);
    } while ((*(uint *)(lVar32 + 0x14) & 0x15000000) == 0x1000000);
    if (lVar32 != lVar43) {
      func_0x000c3098(lVar32,0);
      *(long *)(lVar32 + 0x3b0) = lVar43;
      lVar43 = *(long *)(&UNK_00004b18 + lVar53);
    }
    uVar46 = *(uint *)(&UNK_00004b68 + lVar53);
    if ((*(ushort *)(lVar43 + 0x16c) >> 1 & 1) == 0) {
      if (uVar46 == 0) goto code_r0x000c6244;
      func_0x000eb6f4(0);
    }
    else if (uVar46 == 0) {
      *(undefined4 *)(lVar43 + 0x3bc) = 0;
      lVar53 = lRam0000000000a334c0;
      piVar7 = (int *)(&UNK_00004b20 + lRam0000000000a334c0);
      lVar31 = *(long *)(&UNK_00004b18 + lRam0000000000a334c0);
      iVar86 = *(int *)(lVar31 + 0x3bc);
      if (iVar86 == 0) {
        *(undefined4 *)(&UNK_00004b68 + lRam0000000000a334c0) = 1;
        func_0x000d0a00(lVar31,1);
      }
      else {
        *(undefined4 *)(&UNK_00004b68 + lRam0000000000a334c0) = 1;
        *piVar7 = iVar86;
        *(undefined4 *)(&UNK_00004b24 + lVar53) = 0;
        lVar43 = lVar31;
        lVar32 = lVar53;
        if (*(int *)(&UNK_00004b2c + lVar53) < 0) {
          func_0x000cef5c(&UNK_00004b28 + lVar53,0);
          lVar43 = *(long *)(&UNK_00004b18 + lVar53);
          lVar32 = lRam0000000000a334c0;
        }
        *(undefined4 *)(&UNK_00004b28 + lVar53) = 0;
        *(int *)(lVar43 + 0x3bc) = iVar86;
        uVar35 = *(undefined8 *)(lVar31 + 0x3d0);
        *(undefined8 *)(lVar43 + 0x3d8) = *(undefined8 *)(lVar31 + 0x3d8);
        *(undefined8 *)(lVar43 + 0x3d0) = uVar35;
        *(undefined8 *)
         (*(long *)(*(long *)(&UNK_00004b18 + lVar32) + 0x3a0) +
          (ulong)*(uint *)(&UNK_00004b68 + lVar32) * 8 + 0x3e0) = 0x7f7fffff7f7fffff;
      }
    }
    else {
      func_0x000eb6f4(uVar46 ^ 1);
    }
    lVar53 = lRam0000000000a334c0;
    *(undefined2 *)(&UNK_00004b79 + lRam0000000000a334c0) = 1;
    (&UNK_00004b7b)[lVar53] = 1;
  }
code_r0x000c6244:
  uVar46 = uVar56 | *(uint *)(unaff_x29 + -0x7c);
  if (((uVar46 & 1) == 0) || (*(long *)(&UNK_00004b18 + lVar38) == 0)) {
    *(undefined1 *)(lVar38 + 0xcf) = 0;
code_r0x000c6288:
    bVar22 = *(long *)(&UNK_00004d10 + lVar38) != 0;
  }
  else {
    uVar30 = *(uint *)(*(long *)(&UNK_00004b18 + lVar38) + 0x14);
    *(bool *)(lVar38 + 0xcf) = (uVar30 & 0x10000) == 0;
    if ((((uVar30 >> 0x10 & 1) != 0) || (*(int *)(&UNK_00004b20 + lVar38) == 0)) ||
       ((&UNK_00004b7a)[lVar38] != '\0')) goto code_r0x000c6288;
    bVar22 = true;
  }
  *(bool *)(lVar38 + 0xd0) = bVar22;
  lVar53 = lRam0000000000a334c0;
  uVar30 = *(uint *)(lRam0000000000a334c0 + 8);
  if ((uVar30 >> 1 & 1) == 0) {
    bVar54 = 0;
    if ((uVar30 & 1) != 0) goto code_r0x000c62d0;
code_r0x000c630c:
    if (((bVar54 != 0) && ((&UNK_00003604)[lRam0000000000a334c0] != '\0')) &&
       ((*(float *)(&UNK_00003608 + lRam0000000000a334c0) == 0.0 &&
        (*(int *)(&UNK_0000468c + lRam0000000000a334c0) == -1)))) goto code_r0x000c6330;
  }
  else {
    bVar54 = *(byte *)(lRam0000000000a334c0 + 0xc) & 1;
    if ((uVar30 & 1) == 0) goto code_r0x000c630c;
code_r0x000c62d0:
    if (((((&UNK_00002f44)[lRam0000000000a334c0] == '\0') ||
         (*(float *)(&UNK_00002f48 + lRam0000000000a334c0) != 0.0)) ||
        (((&UNK_0000496c)[lRam0000000000a334c0] != '\0' &&
         (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)))) ||
       (*(int *)(&UNK_0000417c + lRam0000000000a334c0) != -1)) goto code_r0x000c630c;
code_r0x000c6330:
    piVar7 = (int *)(&UNK_00004ad0 + lRam0000000000a334c0);
    if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 3 & 1) != 0) {
      func_0x000bae48("[nav] NavUpdateCancelRequest()\n");
    }
    if (*(int *)(&UNK_00004064 + lVar53) == 0) {
      if (*(int *)(&UNK_00004b68 + lVar53) == 0) {
        lVar31 = *(long *)(&UNK_00004b18 + lVar53);
        if ((((lVar31 == 0) || (lVar31 == *(long *)(lVar31 + 0x388))) ||
            (lVar43 = *(long *)(lVar31 + 0x3a0), (*(byte *)(lVar43 + 0x17) >> 2 & 1) != 0)) ||
           (lVar32 = *(long *)(lVar43 + 0x378), lVar32 == 0)) {
          uVar50 = (ulong)(*piVar7 - 1);
          if (((*piVar7 < 1) ||
              (lVar43 = *(long *)(*(long *)(&UNK_00004ad8 + lVar53) + uVar50 * 0x38 + 8),
              lVar43 == 0)) || ((*(byte *)(lVar43 + 0x17) >> 3 & 1) != 0)) {
            if ((lVar31 != 0) && ((*(uint *)(lVar31 + 0x14) & 0x5000000) != 0x1000000)) {
              *(undefined4 *)(lVar31 + 0x3b8) = 0;
            }
            *(undefined4 *)(&UNK_00004b20 + lVar53) = 0;
          }
          else {
            func_0x000d9868(uVar50,1);
          }
          goto code_r0x000c6450;
        }
        func_0x000c3098(lVar32,0);
        uVar60 = *(undefined4 *)(lVar43 + 0x88);
        fVar68 = (float)*(undefined8 *)(lVar43 + 0x28);
        fVar87 = (float)((ulong)*(undefined8 *)(lVar43 + 0x28) >> 0x20);
        fVar84 = (float)*(undefined8 *)(lVar32 + 0x120);
        fVar85 = (float)((ulong)*(undefined8 *)(lVar32 + 0x120) >> 0x20);
        fVar57 = (fVar68 + (float)*(undefined8 *)(lVar43 + 0x30)) - fVar84;
        uVar70 = SUB41(fVar57,0);
        uVar72 = (undefined1)((uint)fVar57 >> 8);
        uVar74 = (undefined1)((uint)fVar57 >> 0x10);
        uVar76 = (undefined1)((uint)fVar57 >> 0x18);
        fVar59 = (fVar87 + (float)((ulong)*(undefined8 *)(lVar43 + 0x30) >> 0x20)) - fVar85;
        *(ulong *)(unaff_x29 + -0x78) = CONCAT44(fVar87 - fVar85,fVar68 - fVar84);
        *(ulong *)(unaff_x29 + -0x70) =
             CONCAT17((char)((uint)fVar59 >> 0x18),
                      CONCAT16((char)((uint)fVar59 >> 0x10),
                               CONCAT15((char)((uint)fVar59 >> 8),CONCAT14(SUB41(fVar59,0),fVar57)))
                     );
        func_0x000dad18(uVar60,0,0,unaff_x29 + -0x78);
      }
      else {
        func_0x000eb6f4(0);
      }
      lVar53 = lRam0000000000a334c0;
      *(undefined2 *)(&UNK_00004b79 + lRam0000000000a334c0) = 1;
      (&UNK_00004b7b)[lVar53] = 1;
    }
    else {
      func_0x000c23ac(0,0);
    }
  }
code_r0x000c6450:
  *(undefined8 *)(&UNK_00004b40 + lVar38) = 0;
  *(undefined8 *)(&UNK_00004b38 + lVar38) = 0;
  iVar86 = *(int *)(&UNK_00004b20 + lVar38);
  if (((iVar86 == 0) || ((&UNK_00004b7a)[lVar38] != '\0')) ||
     (*(long *)(&UNK_00004d10 + lVar38) != 0)) {
code_r0x000c6470:
    if ((*(long *)(&UNK_00004b18 + lVar38) != 0) &&
       ((*(byte *)(*(long *)(&UNK_00004b18 + lVar38) + 0x16) & 1) != 0)) {
      (&UNK_00004b7a)[lVar38] = 1;
    }
  }
  else if (*(long *)(&UNK_00004b18 + lVar38) != 0) {
    if ((*(byte *)(*(long *)(&UNK_00004b18 + lVar38) + 0x16) & 1) != 0) goto code_r0x000c6470;
    if ((uVar56 & 1) == 0) {
      if (*(int *)(unaff_x29 + -0x7c) != 0) {
code_r0x000c6828:
        if ((&UNK_00003624)[lRam0000000000a334c0] == '\0') {
          bVar22 = false;
          bVar25 = false;
        }
        else {
          if (*(int *)(&UNK_000046a4 + lRam0000000000a334c0) == -1) {
            if (((uVar56 & 1) != 0) && ((&UNK_00002f24)[lRam0000000000a334c0] != '\0'))
            goto code_r0x000c6918;
            goto code_r0x000c69c4;
          }
          bVar25 = false;
          bVar22 = false;
        }
code_r0x000c69fc:
        if ((uVar56 & 1) != 0) goto code_r0x000c6a00;
        if (*(int *)(unaff_x29 + -0x7c) != 0) goto code_r0x000c6a7c;
        bVar23 = false;
        iVar58 = *(int *)(&UNK_00004064 + lVar38);
        bVar24 = false;
        goto joined_r0x000c6abc;
      }
      bVar24 = false;
      bVar25 = false;
      bVar23 = false;
      bVar54 = 0;
      iVar58 = *(int *)(&UNK_00004064 + lVar38);
      bVar22 = false;
      if (iVar58 != 0) goto code_r0x000c6bec;
      bVar22 = false;
code_r0x000c6c2c:
      if ((bVar23) || (bVar25)) {
        *(int *)(&UNK_00004b3c + lVar38) = iVar86;
      }
      bVar22 = (bool)(bVar22 | bVar54);
    }
    else {
      if ((((&UNK_00002f24)[lRam0000000000a334c0] == '\0') ||
          (((&UNK_0000496c)[lRam0000000000a334c0] != '\0' &&
           (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)))) ||
         (*(int *)(&UNK_00004164 + lRam0000000000a334c0) != -1)) {
        if ((*(uint *)(unaff_x29 + -0x7c) & 1) != 0) goto code_r0x000c6828;
        bVar22 = false;
        bVar25 = false;
      }
      else {
code_r0x000c6918:
        if ((*(float *)(&UNK_00002f28 + lRam0000000000a334c0) == 0.0) &&
           (((&UNK_0000496c)[lRam0000000000a334c0] == '\0' ||
            (*(int *)(&UNK_00004064 + lRam0000000000a334c0) == -1)))) {
          bVar25 = true;
          bVar22 = *(int *)(&UNK_00004164 + lRam0000000000a334c0) == -1;
          if ((!bVar22) && (((*(uint *)(unaff_x29 + -0x7c) ^ 1) & 1) == 0)) goto code_r0x000c69c4;
        }
        else {
          if (*(int *)(unaff_x29 + -0x7c) != 0) {
code_r0x000c69c4:
            bVar22 = false;
            if ((&UNK_00003624)[lRam0000000000a334c0] != '\0') {
              if (*(float *)(&UNK_00003628 + lRam0000000000a334c0) == 0.0) {
                bVar22 = *(int *)(&UNK_000046a4 + lRam0000000000a334c0) == -1;
              }
              else {
                bVar22 = false;
              }
            }
            bVar25 = true;
            goto code_r0x000c69fc;
          }
          bVar25 = true;
          bVar22 = false;
        }
      }
code_r0x000c6a00:
      cVar21 = (&UNK_00002f34)[lRam0000000000a334c0];
      if ((cVar21 == '\0') ||
         ((((&UNK_0000496c)[lRam0000000000a334c0] != '\0' &&
           (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)) ||
          (*(int *)(&UNK_00004170 + lRam0000000000a334c0) != -1)))) {
        if (((&UNK_00003594)[lRam0000000000a334c0] != '\0') &&
           ((((&UNK_0000496c)[lRam0000000000a334c0] == '\0' ||
             (*(int *)(&UNK_00004064 + lRam0000000000a334c0) == -1)) &&
            (*(int *)(&UNK_00004638 + lRam0000000000a334c0) == -1)))) {
code_r0x000c6acc:
          if (cVar21 != '\0') goto code_r0x000c6ad0;
          goto code_r0x000c6b0c;
        }
        if ((*(uint *)(unaff_x29 + -0x7c) & 1) != 0) {
code_r0x000c6a7c:
          if (((&UNK_00003614)[lRam0000000000a334c0] != '\0') &&
             (*(int *)(&UNK_00004698 + lRam0000000000a334c0) == -1)) {
            if ((uVar56 & 1) != 0) {
              cVar21 = (&UNK_00002f34)[lRam0000000000a334c0];
              goto code_r0x000c6acc;
            }
            goto code_r0x000c6b60;
          }
        }
        bVar23 = false;
        bVar24 = false;
        iVar58 = *(int *)(&UNK_00004064 + lVar38);
      }
      else {
code_r0x000c6ad0:
        if ((*(float *)(&UNK_00002f38 + lRam0000000000a334c0) == 0.0) &&
           ((((&UNK_0000496c)[lRam0000000000a334c0] == '\0' ||
             (*(int *)(&UNK_00004064 + lRam0000000000a334c0) == -1)) &&
            (*(int *)(&UNK_00004170 + lRam0000000000a334c0) == -1)))) {
code_r0x000c6bbc:
          bVar24 = true;
          iVar58 = *(int *)(&UNK_00004064 + lVar38);
        }
        else {
code_r0x000c6b0c:
          if (((((&UNK_00003594)[lRam0000000000a334c0] != '\0') &&
               (*(float *)(&UNK_00003598 + lRam0000000000a334c0) == 0.0)) &&
              (((&UNK_0000496c)[lRam0000000000a334c0] == '\0' ||
               (*(int *)(&UNK_00004064 + lRam0000000000a334c0) == -1)))) &&
             (*(int *)(&UNK_00004638 + lRam0000000000a334c0) == -1)) goto code_r0x000c6bbc;
          if ((*(int *)(unaff_x29 + -0x7c) != 0) && ((&UNK_00003614)[lRam0000000000a334c0] != '\0'))
          {
code_r0x000c6b60:
            if (*(float *)(&UNK_00003618 + lRam0000000000a334c0) == 0.0) {
              bVar24 = *(int *)(&UNK_00004698 + lRam0000000000a334c0) == -1;
              bVar23 = true;
              iVar58 = *(int *)(&UNK_00004064 + lVar38);
              goto joined_r0x000c6abc;
            }
          }
          bVar24 = false;
          iVar58 = *(int *)(&UNK_00004064 + lVar38);
        }
        bVar23 = true;
      }
joined_r0x000c6abc:
      if ((iVar58 == 0) && (bVar22)) {
        *(int *)(&UNK_00004b38 + lVar38) = iVar86;
        *(undefined4 *)(&UNK_00004b44 + lVar38) = 2;
        if (bVar24) {
code_r0x000c6c18:
          *(int *)(&UNK_00004b38 + lVar38) = iVar86;
          bVar54 = 1;
          *(undefined4 *)(&UNK_00004b44 + lVar38) = 1;
        }
        else {
          bVar54 = 0;
          bVar22 = true;
        }
        goto code_r0x000c6c2c;
      }
      if (iVar58 == 0) {
        if (bVar24) goto code_r0x000c6c18;
        bVar54 = 0;
        goto code_r0x000c6c2c;
      }
      bVar10 = false;
      if (iVar58 == iVar86) {
        bVar10 = bVar24;
      }
      if (bVar10) {
        *(int *)(&UNK_00004b38 + lVar38) = iVar86;
        bVar24 = true;
        *(undefined4 *)(&UNK_00004b44 + lVar38) = 1;
        iVar58 = iVar86;
      }
code_r0x000c6bec:
      if ((iVar58 == iVar86) && (bVar25 || bVar23)) {
        *(int *)(&UNK_00004b3c + lVar38) = iVar86;
      }
      if (iVar58 != iVar86) goto code_r0x000c6470;
      bVar22 = (bool)(bVar22 | bVar24);
    }
    if (bVar22) {
      *(int *)(&UNK_00004b40 + lVar38) = iVar86;
      lVar53 = lRam0000000000a334c0;
      *(int *)(&UNK_00004b48 + lRam0000000000a334c0) = iVar86;
      *(undefined4 *)(&UNK_00004b4c + lVar53) = 0x3dcccccd;
    }
    goto code_r0x000c6470;
  }
  fVar57 = *(float *)(&UNK_00004b4c + lVar38);
  if (0.0 < fVar57) {
    fVar59 = fVar57 - *(float *)(lVar38 + 0x18);
    uVar70 = 0;
    uVar72 = 0;
    uVar74 = 0;
    uVar76 = 0;
    fVar57 = 0.0;
    if (0.0 < fVar59) {
      fVar57 = fVar59;
    }
    *(float *)(&UNK_00004b4c + lVar38) = fVar57;
  }
  if (fVar57 == 0.0) {
    *(undefined4 *)(&UNK_00004b48 + lVar38) = 0;
  }
  iVar86 = *(int *)(&UNK_00004b5c + lVar38);
  if (iVar86 != 0) {
    *(int *)(&UNK_00004b40 + lVar38) = iVar86;
    *(int *)(&UNK_00004b3c + lVar38) = iVar86;
    *(int *)(&UNK_00004b38 + lVar38) = iVar86;
    *(undefined4 *)(&UNK_00004b44 + lVar38) = *(undefined4 *)(&UNK_00004b60 + lVar38);
  }
  bVar54 = 0;
  *(undefined4 *)(&UNK_00004b5c + lVar38) = 0;
  lVar53 = lRam0000000000a334c0;
  pfVar40 = (float *)(&UNK_00004bdc + lRam0000000000a334c0);
  puVar8 = (uint *)(&UNK_00004968 + lRam0000000000a334c0);
  plVar55 = *(long **)(&UNK_00004b18 + lRam0000000000a334c0);
  uVar56 = *(uint *)(lRam0000000000a334c0 + 8);
  if ((uVar56 >> 1 & 1) != 0) {
    bVar54 = *(byte *)(lRam0000000000a334c0 + 0xc) & 1;
  }
  if (((&UNK_00004bc2)[lRam0000000000a334c0] == '\0') || (plVar55 == (long *)0x0)) {
    *(undefined4 *)(&UNK_00004bd0 + lRam0000000000a334c0) = 0xffffffff;
    *(undefined8 *)(&UNK_00004bc4 + lVar53) = 0;
    if (plVar55 != (long *)0x0) {
      if ((*(long *)(&UNK_00004d10 + lVar53) == 0) && ((*(byte *)((long)plVar55 + 0x16) & 1) == 0))
      {
        uVar30 = *puVar8;
        if ((uVar30 & 1) == 0) {
          if (((bVar54 != 0) && (uVar50 = func_0x000d68f8(0x27d,0xffffffff,5), (uVar50 & 1) != 0))
             || ((uVar60 = 0xffffffff, (uVar56 & 1) != 0 &&
                 (iVar86 = func_0x000d68f8(0x201,0xffffffff,5), iVar86 != 0)))) {
            uVar60 = 0;
            *(undefined4 *)(&UNK_00004bd0 + lVar53) = 0;
          }
        }
        else {
          uVar60 = 0xffffffff;
        }
        if (((uVar30 >> 1 & 1) == 0) &&
           (((bVar54 != 0 && (uVar50 = func_0x000d68f8(0x27e,0xffffffff,5), (uVar50 & 1) != 0)) ||
            (((uVar56 & 1) != 0 && (iVar86 = func_0x000d68f8(0x202,0xffffffff,5), iVar86 != 0))))))
        {
          uVar60 = 1;
          *(undefined4 *)(&UNK_00004bd0 + lVar53) = 1;
        }
        if (((uVar30 >> 2 & 1) == 0) &&
           (((bVar54 != 0 && (uVar50 = func_0x000d68f8(0x27f,0xffffffff,5), (uVar50 & 1) != 0)) ||
            (((uVar56 & 1) != 0 && (iVar86 = func_0x000d68f8(0x203,0xffffffff,5), iVar86 != 0))))))
        {
          uVar60 = 2;
          *(undefined4 *)(&UNK_00004bd0 + lVar53) = 2;
        }
        if (((uVar30 >> 3 & 1) == 0) &&
           (((bVar54 != 0 && (uVar50 = func_0x000d68f8(0x280,0xffffffff,5), (uVar50 & 1) != 0)) ||
            (((uVar56 & 1) != 0 && (iVar86 = func_0x000d68f8(0x204,0xffffffff,5), iVar86 != 0))))))
        {
          uVar60 = 3;
          *(undefined4 *)(&UNK_00004bd0 + lVar53) = 3;
        }
      }
      else {
        uVar60 = 0xffffffff;
      }
      *(undefined4 *)(&UNK_00004bd8 + lVar53) = uVar60;
      uVar35 = _UNK_0080c2f0;
      *(undefined8 *)(&UNK_00004bf4 + lVar53) = _UNK_0080c2f8;
      *(undefined8 *)(&UNK_00004bec + lVar53) = uVar35;
      lVar31 = lRam0000000000a334c0;
      goto joined_r0x000c65e8;
    }
    *(undefined4 *)(&UNK_00004bd8 + lVar53) = 0xffffffff;
    uVar35 = _UNK_0080c2f0;
    *(undefined8 *)(&UNK_00004bf4 + lVar53) = _UNK_0080c2f8;
    *(undefined8 *)(&UNK_00004bec + lVar53) = uVar35;
    fVar57 = 0.0;
  }
  else {
    lVar31 = lRam0000000000a334c0;
    if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 3 & 1) != 0) {
      func_0x000bae48("[nav] NavMoveRequestForward %d\n");
      lVar31 = lRam0000000000a334c0;
    }
joined_r0x000c65e8:
    fVar57 = 0.0;
    lRam0000000000a334c0 = lVar31;
    if (((((uVar56 & 1) != 0) && (fVar57 = 0.0, *(int *)(&UNK_00004bd0 + lVar53) == -1)) &&
        (plVar36 = *(long **)(&UNK_00004b18 + lVar31), (*(byte *)((long)plVar36 + 0x16) & 1) == 0))
       && (*(long *)(&UNK_00004d10 + lVar31) == 0)) {
      bVar22 = false;
      if ((&UNK_00002eb4)[lVar31] != '\0') {
        if (((&UNK_0000496c)[lVar31] == '\0') || (*(int *)(&UNK_00004064 + lVar31) == -1)) {
          bVar22 = *(int *)(&UNK_00004110 + lVar31) == -1;
        }
        else {
          bVar22 = false;
        }
      }
      bVar23 = false;
      if ((&UNK_00002ec4)[lVar31] != '\0') {
        if (((&UNK_0000496c)[lVar31] == '\0') || (*(int *)(&UNK_00004064 + lVar31) == -1)) {
          bVar23 = *(int *)(&UNK_0000411c + lVar31) == -1;
        }
        else {
          bVar23 = false;
        }
      }
      if ((&UNK_00002ed4)[lVar31] == '\0') {
code_r0x000c6c94:
        bVar24 = false;
      }
      else {
        fVar59 = *(float *)(&UNK_00002ed8 + lVar31);
        if (fVar59 < 0.0) goto code_r0x000c6c94;
        if (fVar59 == 0.0) goto code_r0x000c67f4;
        fVar84 = *(float *)(lVar31 + 0x70);
        uVar70 = SUB41(fVar84,0);
        uVar72 = (undefined1)((uint)fVar84 >> 8);
        uVar74 = (undefined1)((uint)fVar84 >> 0x10);
        uVar76 = (undefined1)((uint)fVar84 >> 0x18);
        if ((fVar59 <= fVar84) || (fVar85 = fVar59 - *(float *)(lVar31 + 0x18), fVar59 <= fVar85))
        goto code_r0x000c6c94;
        fVar68 = *(float *)(lVar31 + 0x74);
        if (0.0 < fVar68) {
          if (fVar84 <= fVar85) {
            iVar86 = (int)((fVar85 - fVar84) / fVar68);
          }
          else {
            iVar86 = -1;
          }
          if (fVar84 <= fVar59) {
            iVar58 = (int)((fVar59 - fVar84) / fVar68);
          }
          else {
            iVar58 = -1;
          }
          if (iVar86 < iVar58) goto code_r0x000c67f4;
          goto code_r0x000c6c94;
        }
        bVar24 = false;
        if ((fVar84 <= fVar59) && (fVar85 < fVar84)) {
code_r0x000c67f4:
          if (((&UNK_0000496c)[lVar31] != '\0') && (*(int *)(&UNK_00004064 + lVar31) != -1))
          goto code_r0x000c6c94;
          bVar24 = *(int *)(&UNK_00004128 + lVar31) == -1;
        }
      }
      if ((&UNK_00002ee4)[lVar31] == '\0') {
code_r0x000c6d54:
        bVar25 = false;
      }
      else {
        fVar59 = *(float *)(&UNK_00002ee8 + lVar31);
        if (fVar59 < 0.0) goto code_r0x000c6d54;
        if (fVar59 == 0.0) goto code_r0x000c6cb0;
        fVar84 = *(float *)(lVar31 + 0x70);
        uVar70 = SUB41(fVar84,0);
        uVar72 = (undefined1)((uint)fVar84 >> 8);
        uVar74 = (undefined1)((uint)fVar84 >> 0x10);
        uVar76 = (undefined1)((uint)fVar84 >> 0x18);
        if ((fVar59 <= fVar84) || (fVar85 = fVar59 - *(float *)(lVar31 + 0x18), fVar59 <= fVar85))
        goto code_r0x000c6d54;
        fVar68 = *(float *)(lVar31 + 0x74);
        if (0.0 < fVar68) {
          if (fVar84 <= fVar85) {
            iVar86 = (int)((fVar85 - fVar84) / fVar68);
          }
          else {
            iVar86 = -1;
          }
          if (fVar84 <= fVar59) {
            iVar58 = (int)((fVar59 - fVar84) / fVar68);
          }
          else {
            iVar58 = -1;
          }
          if (iVar86 < iVar58) goto code_r0x000c6cb0;
          goto code_r0x000c6d54;
        }
        bVar25 = false;
        if ((fVar84 <= fVar59) && (fVar85 < fVar84)) {
code_r0x000c6cb0:
          if (((&UNK_0000496c)[lVar31] != '\0') && (*(int *)(&UNK_00004064 + lVar31) != -1))
          goto code_r0x000c6d54;
          bVar25 = *(int *)(&UNK_00004134 + lVar31) == -1;
        }
      }
      if ((bVar22 != bVar23) || (bVar24 != bVar25)) {
        if (*(int *)(&UNK_00004b68 + lVar31) != 0) {
          func_0x000eb6f4(0);
        }
        if ((*(short *)((long)plVar36 + 0x16c) == 0) && (*(char *)((long)plVar36 + 0x172) != '\0'))
        {
          if ((&UNK_00002eb4)[lRam0000000000a334c0] == '\0') {
code_r0x000c7754:
            iVar86 = func_0x000d68f8(0x206,0xffffffff,1);
            if (iVar86 != 0) {
              fVar57 = *(float *)((long)plVar36 + 0x214) - *(float *)((long)plVar36 + 0x20c);
              uVar70 = SUB41(fVar57,0);
              uVar72 = (undefined1)((uint)fVar57 >> 8);
              uVar74 = (undefined1)((uint)fVar57 >> 0x10);
              uVar76 = (undefined1)((uint)fVar57 >> 0x18);
              fVar57 = *(float *)(plVar36 + 0x12) + fVar57;
              goto code_r0x000c7780;
            }
            if (bVar24 != false) {
              *(undefined4 *)(plVar36 + 0x14) = 0;
              goto code_r0x000c7794;
            }
            if (bVar25 != false) {
              fVar57 = *(float *)(plVar36 + 0x13);
              goto code_r0x000c7780;
            }
          }
          else {
            fVar57 = *(float *)(&UNK_00002eb8 + lRam0000000000a334c0);
            if (fVar57 < 0.0) goto code_r0x000c7754;
            if (fVar57 == 0.0) goto code_r0x000c6e78;
            fVar59 = *(float *)(lRam0000000000a334c0 + 0x70);
            uVar70 = SUB41(fVar59,0);
            uVar72 = (undefined1)((uint)fVar59 >> 8);
            uVar74 = (undefined1)((uint)fVar59 >> 0x10);
            uVar76 = (undefined1)((uint)fVar59 >> 0x18);
            if ((fVar57 <= fVar59) ||
               (fVar84 = fVar57 - *(float *)(lRam0000000000a334c0 + 0x18), fVar57 <= fVar84))
            goto code_r0x000c7754;
            fVar85 = *(float *)(lRam0000000000a334c0 + 0x74);
            if (fVar85 <= 0.0) {
              if ((fVar59 <= fVar57) && (fVar84 < fVar59)) goto code_r0x000c6e78;
              goto code_r0x000c7754;
            }
            if (fVar59 <= fVar84) {
              iVar86 = (int)((fVar84 - fVar59) / fVar85);
            }
            else {
              iVar86 = -1;
            }
            if (fVar59 <= fVar57) {
              iVar58 = (int)((fVar57 - fVar59) / fVar85);
            }
            else {
              iVar58 = -1;
            }
            if (iVar58 <= iVar86) goto code_r0x000c7754;
code_r0x000c6e78:
            if ((((&UNK_0000496c)[lRam0000000000a334c0] != '\0') &&
                (*(int *)(&UNK_00004064 + lRam0000000000a334c0) != -1)) ||
               (*(int *)(&UNK_00004110 + lRam0000000000a334c0) != -1)) goto code_r0x000c7754;
            fVar57 = *(float *)((long)plVar36 + 0x214) - *(float *)((long)plVar36 + 0x20c);
            uVar70 = SUB41(fVar57,0);
            uVar72 = (undefined1)((uint)fVar57 >> 8);
            uVar74 = (undefined1)((uint)fVar57 >> 0x10);
            uVar76 = (undefined1)((uint)fVar57 >> 0x18);
            fVar57 = *(float *)(plVar36 + 0x12) - fVar57;
code_r0x000c7780:
            *(float *)(plVar36 + 0x14) = fVar57;
code_r0x000c7794:
            *(undefined4 *)(plVar36 + 0x15) = 0;
            *(undefined4 *)(plVar36 + 0x16) = 0;
          }
code_r0x000c779c:
          fVar57 = 0.0;
        }
        else {
          uVar50 = (ulong)*(uint *)(&UNK_00004b68 + lVar31);
          pfVar3 = (float *)(plVar36 + uVar50 * 2 + 0x78);
          fVar57 = *(float *)(&UNK_00003d3c + *plVar36) * *(float *)(plVar36 + 0x54);
          uVar70 = SUB41(fVar57,0);
          uVar72 = (undefined1)((uint)fVar57 >> 8);
          uVar74 = (undefined1)((uint)fVar57 >> 0x10);
          uVar76 = (undefined1)((uint)fVar57 >> 0x18);
          if (plVar36[0x6f] != 0) {
            fVar57 = fVar57 * *(float *)(plVar36[0x6f] + 0x2a0);
            uVar70 = SUB41(fVar57,0);
            uVar72 = (undefined1)((uint)fVar57 >> 8);
            uVar74 = (undefined1)((uint)fVar57 >> 0x10);
            uVar76 = (undefined1)((uint)fVar57 >> 0x18);
          }
          fVar59 = ((*(float *)((long)plVar36 + 0x214) - *(float *)((long)plVar36 + 0x20c)) -
                   (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)))) +
                   (*(float *)((long)plVar36 + uVar50 * 0x10 + 0x3cc) -
                   *(float *)((long)plVar36 + uVar50 * 0x10 + 0x3c4));
          uVar70 = 0;
          uVar72 = 0;
          uVar74 = 0;
          uVar76 = 0;
          fVar57 = 0.0;
          if (0.0 < fVar59) {
            fVar57 = fVar59;
          }
          if ((&UNK_00002eb4)[lRam0000000000a334c0] == '\0') {
code_r0x000c6f6c:
            if ((&UNK_00002ec4)[lRam0000000000a334c0] != '\0') {
              fVar59 = *(float *)(&UNK_00002ec8 + lRam0000000000a334c0);
              if (0.0 <= fVar59) {
                if (fVar59 == 0.0) goto code_r0x000c6f84;
                fVar84 = *(float *)(lRam0000000000a334c0 + 0x70);
                uVar70 = SUB41(fVar84,0);
                uVar72 = (undefined1)((uint)fVar84 >> 8);
                uVar74 = (undefined1)((uint)fVar84 >> 0x10);
                uVar76 = (undefined1)((uint)fVar84 >> 0x18);
                if ((fVar84 < fVar59) &&
                   (fVar85 = fVar59 - *(float *)(lRam0000000000a334c0 + 0x18), fVar85 < fVar59)) {
                  fVar68 = *(float *)(lRam0000000000a334c0 + 0x74);
                  if (fVar68 <= 0.0) {
                    if ((fVar84 <= fVar59) && (fVar85 < fVar84)) goto code_r0x000c6f84;
                  }
                  else {
                    if (fVar84 <= fVar85) {
                      iVar86 = (int)((fVar85 - fVar84) / fVar68);
                    }
                    else {
                      iVar86 = -1;
                    }
                    if (fVar84 <= fVar59) {
                      iVar58 = (int)((fVar59 - fVar84) / fVar68);
                    }
                    else {
                      iVar58 = -1;
                    }
                    if (iVar86 < iVar58) {
code_r0x000c6f84:
                      if ((&UNK_00004124)[lRam0000000000a334c0] == '\0') {
                        uVar60 = 3;
                        uVar37 = 2;
                        goto code_r0x000c6f94;
                      }
                    }
                  }
                }
              }
            }
            puVar4 = (undefined4 *)((long)plVar36 + uVar50 * 0x10 + 0x3cc);
            if (bVar24 == false) {
              if (bVar25 != false) {
                uVar60 = *(undefined4 *)((long)plVar36 + 0x44);
                *puVar4 = uVar60;
                *(undefined4 *)((long)plVar36 + uVar50 * 0x10 + 0x3c4) = uVar60;
                fVar57 = *(float *)(plVar36 + uVar50 * 2 + 0x79);
                uVar70 = SUB41(fVar57,0);
                uVar72 = (undefined1)((uint)fVar57 >> 8);
                uVar74 = (undefined1)((uint)fVar57 >> 0x10);
                uVar76 = (undefined1)((uint)fVar57 >> 0x18);
                if (fVar57 < *pfVar3) {
                  *(undefined4 *)(plVar36 + uVar50 * 2 + 0x79) = 0;
                  *pfVar3 = 0.0;
                }
                *(undefined4 *)(&UNK_00004bd0 + lVar31) = 2;
                *(undefined4 *)(&UNK_00004bc4 + lVar31) = 0x50;
              }
              goto code_r0x000c779c;
            }
            *puVar4 = 0;
            *(undefined4 *)((long)plVar36 + uVar50 * 0x10 + 0x3c4) = 0;
            fVar57 = *(float *)(plVar36 + uVar50 * 2 + 0x79);
            uVar70 = SUB41(fVar57,0);
            uVar72 = (undefined1)((uint)fVar57 >> 8);
            uVar74 = (undefined1)((uint)fVar57 >> 0x10);
            uVar76 = (undefined1)((uint)fVar57 >> 0x18);
            if (fVar57 < *pfVar3) {
              *(undefined4 *)(plVar36 + uVar50 * 2 + 0x79) = 0;
              *pfVar3 = 0.0;
            }
            *(undefined4 *)(&UNK_00004bd0 + lVar31) = 3;
            *(undefined4 *)(&UNK_00004bc4 + lVar31) = 0x50;
            fVar57 = 0.0;
          }
          else {
            fVar59 = *(float *)(&UNK_00002eb8 + lRam0000000000a334c0);
            if (fVar59 < 0.0) goto code_r0x000c6f6c;
            if (fVar59 == 0.0) goto code_r0x000c6e28;
            fVar84 = *(float *)(lRam0000000000a334c0 + 0x70);
            uVar70 = SUB41(fVar84,0);
            uVar72 = (undefined1)((uint)fVar84 >> 8);
            uVar74 = (undefined1)((uint)fVar84 >> 0x10);
            uVar76 = (undefined1)((uint)fVar84 >> 0x18);
            if ((fVar59 <= fVar84) ||
               (fVar85 = fVar59 - *(float *)(lRam0000000000a334c0 + 0x18), fVar59 <= fVar85))
            goto code_r0x000c6f6c;
            fVar68 = *(float *)(lRam0000000000a334c0 + 0x74);
            if (fVar68 <= 0.0) {
              if ((fVar84 <= fVar59) && (fVar85 < fVar84)) goto code_r0x000c6e28;
              goto code_r0x000c6f6c;
            }
            if (fVar84 <= fVar85) {
              iVar86 = (int)((fVar85 - fVar84) / fVar68);
            }
            else {
              iVar86 = -1;
            }
            if (fVar84 <= fVar59) {
              iVar58 = (int)((fVar59 - fVar84) / fVar68);
            }
            else {
              iVar58 = -1;
            }
            if (iVar58 <= iVar86) goto code_r0x000c6f6c;
code_r0x000c6e28:
            if ((&UNK_00004118)[lRam0000000000a334c0] != '\0') goto code_r0x000c6f6c;
            fVar57 = -fVar57;
            uVar60 = 2;
            uVar37 = 3;
code_r0x000c6f94:
            *(undefined4 *)(&UNK_00004bd0 + lVar31) = uVar37;
            *(undefined4 *)(&UNK_00004bd8 + lVar31) = uVar60;
            *(undefined4 *)(&UNK_00004bc4 + lVar31) = 0x830;
            if (fVar57 != 0.0) {
              lVar31 = plVar55[0x41];
              *(long *)(&UNK_00004bf4 + lVar53) = plVar55[0x42];
              *(long *)(&UNK_00004bec + lVar53) = lVar31;
              *(float *)(&UNK_00004bf0 + lVar53) = fVar57 + *(float *)(&UNK_00004bf0 + lVar53);
              *(float *)(&UNK_00004bf8 + lVar53) = fVar57 + *(float *)(&UNK_00004bf8 + lVar53);
            }
          }
        }
      }
    }
  }
  (&UNK_00004bc2)[lVar53] = 0;
  lVar31 = lRam0000000000a334c0;
  iVar86 = *(int *)(&UNK_00004bd0 + lVar53);
  if (iVar86 != -1) {
    uVar39 = 0;
    uVar60 = *(undefined4 *)(&UNK_00004bd8 + lVar53);
    uVar56 = *(uint *)(&UNK_00004bc4 + lVar53);
    uVar37 = *(undefined4 *)(&UNK_00004bc8 + lVar53);
    puVar49 = &UNK_00004b7c + lRam0000000000a334c0;
    *(undefined2 *)(&UNK_00004bc0 + lRam0000000000a334c0) = 0x101;
    *(ulong *)(&UNK_00004bd0 + lVar31) = CONCAT44(iVar86,iVar86);
    *(undefined4 *)(&UNK_00004bd8 + lVar31) = uVar60;
    *(uint *)(&UNK_00004bc4 + lVar31) = uVar56 >> 6 & 0x10 | uVar56;
    *(undefined4 *)(&UNK_00004bc8 + lVar31) = uVar37;
    (&UNK_00004bc2)[lVar31] = 0;
    if ((uVar56 >> 9 & 1) == 0) {
      uVar39 = *(undefined4 *)(lVar31 + 0xe60);
    }
    *(undefined4 *)(&UNK_00004bcc + lVar31) = uVar39;
    *(undefined4 *)(&UNK_00004c28 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c10 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c08 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c30 + lVar31) = 0xffffffffffffffff;
    *(undefined4 *)(&UNK_00004c40 + lVar31) = 0x7f7fffff;
    uVar70 = 0xff;
    uVar72 = 0xff;
    uVar74 = 0x7f;
    uVar76 = 0x7f;
    *(undefined8 *)(&UNK_00004c38 + lVar31) = 0x7f7fffff7f7fffff;
    *(undefined4 *)(&UNK_00004c68 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c50 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c48 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c70 + lVar31) = 0xffffffffffffffff;
    *(undefined4 *)(&UNK_00004c80 + lVar31) = 0x7f7fffff;
    *(undefined8 *)(&UNK_00004c78 + lVar31) = 0x7f7fffff7f7fffff;
    *(undefined4 *)(&UNK_00004ca8 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c90 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004c88 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004cb0 + lVar31) = 0xffffffffffffffff;
    *(undefined4 *)(&UNK_00004cc0 + lVar31) = 0x7f7fffff;
    *(undefined8 *)(&UNK_00004cb8 + lVar31) = 0x7f7fffff7f7fffff;
    *(undefined4 *)(&UNK_00004c04 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004cd0 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004cc8 + lVar31) = 0;
    *(undefined4 *)(&UNK_00004ce8 + lVar31) = 0;
    *(undefined8 *)(&UNK_00004cf0 + lVar31) = 0xffffffffffffffff;
    *(undefined4 *)(&UNK_00004d00 + lVar31) = 0x7f7fffff;
    *(undefined8 *)(&UNK_00004cf8 + lVar31) = 0x7f7fffff7f7fffff;
    *puVar49 = 1;
  }
  if ((&UNK_00004bc0)[lVar53] == '\0') {
code_r0x000c72b0:
    if (plVar55 != (long *)0x0) {
      uVar50 = (ulong)*(uint *)(&UNK_00004b68 + lVar53);
      goto code_r0x000c72b8;
    }
    fVar59 = 0.0;
    uVar71 = 0;
    uVar73 = 0;
    uVar75 = 0;
    uVar77 = 0;
    uVar70 = 0;
    uVar72 = 0;
    uVar74 = 0;
    uVar76 = 0;
    fVar57 = 0.0;
  }
  else {
    if (*(int *)(&UNK_00004b20 + lVar53) == 0) {
      if (((byte)(&UNK_0000603c)[lVar53] >> 3 & 1) == 0) {
        *(undefined2 *)(&UNK_00004b7d + lVar53) = 0x101;
        *(undefined4 *)(&UNK_00004b88 + lVar53) = 0;
        (&UNK_00004b7a)[lVar53] = 0;
      }
      else {
        func_0x000bae48("[nav] NavInitRequest: from move, window \"%s\", layer=%d\n");
        *(undefined2 *)(&UNK_00004b7d + lVar53) = 0x101;
        *(undefined4 *)(&UNK_00004b88 + lVar53) = 0;
        (&UNK_00004b7a)[lVar53] = 0;
        if ((&UNK_00004bc0)[lVar53] == '\0') goto code_r0x000c72b0;
      }
    }
    if (((*(int *)(&UNK_00004b64 + lVar53) != 3) || (*(int *)(&UNK_00004b68 + lVar53) != 0)) ||
       (plVar55 == (long *)0x0)) goto code_r0x000c72b0;
    uVar60 = *(undefined4 *)(&UNK_00004bc4 + lVar53);
    fVar59 = (float)func_0x000d2840(plVar55);
    uVar50 = CONCAT44(uVar60,uVar60) & _UNK_0080c1b8;
    iVar86 = -(uint)((int)uVar50 == 0);
    iVar58 = -(uint)((int)(uVar50 >> 0x20) == 0);
    uVar48 = CONCAT44(iVar58,iVar86);
    if ((((byte)iVar86 | (byte)iVar58) & 1) == 0) {
code_r0x000c7270:
      uVar50 = 0;
    }
    else {
      uVar35 = NEON_fmov(0xbf800000,4);
      uVar16 = NEON_fmov(0x3f800000,4);
      fVar87 = (float)plVar55[0x24];
      fVar88 = (float)((ulong)plVar55[0x24] >> 0x20);
      fVar59 = fVar59 - (float)*(undefined8 *)((long)plVar55 + 0x8c);
      fVar68 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) -
               (float)((ulong)*(undefined8 *)((long)plVar55 + 0x8c) >> 0x20);
      fVar84 = (((float)plVar55[0x41] + (float)uVar35) - fVar87) + fVar59;
      fVar85 = (((float)((ulong)plVar55[0x41] >> 0x20) + (float)((ulong)uVar35 >> 0x20)) - fVar88) +
               fVar68;
      fVar59 = (((float)plVar55[0x42] + (float)uVar16) - fVar87) + fVar59;
      fVar68 = (((float)((ulong)plVar55[0x42] >> 0x20) + (float)((ulong)uVar16 >> 0x20)) - fVar88) +
               fVar68;
      if (((fVar84 <= *(float *)(plVar55 + 0x78)) && (fVar85 <= *(float *)((long)plVar55 + 0x3c4)))
         && ((*(float *)(plVar55 + 0x79) <= fVar59 && (*(float *)((long)plVar55 + 0x3cc) <= fVar68))
            )) goto code_r0x000c7270;
      if (((byte)(&UNK_0000603c)[lVar53] >> 3 & 1) != 0) {
        func_0x000bae48("[nav] NavMoveRequest: clamp NavRectRel for gamepad move\n");
      }
      fVar87 = *(float *)(&UNK_00003d3c + *plVar55) * *(float *)(plVar55 + 0x54);
      uVar70 = SUB41(fVar87,0);
      uVar72 = (undefined1)((uint)fVar87 >> 8);
      uVar74 = (undefined1)((uint)fVar87 >> 0x10);
      uVar76 = (undefined1)((uint)fVar87 >> 0x18);
      if (plVar55[0x6f] != 0) {
        fVar87 = fVar87 * *(float *)(plVar55[0x6f] + 0x2a0);
        uVar70 = SUB41(fVar87,0);
        uVar72 = (undefined1)((uint)fVar87 >> 8);
        uVar74 = (undefined1)((uint)fVar87 >> 0x10);
        uVar76 = (undefined1)((uint)fVar87 >> 0x18);
      }
      fVar87 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) * 0.5;
      uVar50 = (ulong)*(uint *)(&UNK_00004b68 + lVar53);
      uVar51 = CONCAT44(fVar68 - fVar85,fVar59 - fVar84);
      iVar86 = -(uint)(fVar68 - fVar85 < fVar87);
      uVar51 = uVar51 ^ (uVar51 ^ CONCAT17((char)((uint)fVar87 >> 0x18),
                                           CONCAT16((char)((uint)fVar87 >> 0x10),
                                                    CONCAT15((char)((uint)fVar87 >> 8),
                                                             CONCAT14(SUB41(fVar87,0),fVar87))))) &
                        ~CONCAT17((char)((uint)iVar86 >> 0x18),
                                  CONCAT16((char)((uint)iVar86 >> 0x10),
                                           CONCAT15((char)((uint)iVar86 >> 8),
                                                    CONCAT14((char)iVar86,
                                                             -(uint)(fVar59 - fVar84 < fVar87)))));
      fVar87 = (float)uVar51;
      fVar84 = fVar84 + fVar87;
      fVar88 = (float)(uVar51 >> 0x20);
      fVar85 = fVar85 + fVar88;
      uVar70 = (undefined1)((uint)fVar85 >> 8);
      uVar72 = (undefined1)((uint)fVar85 >> 0x10);
      uVar74 = (undefined1)((uint)fVar85 >> 0x18);
      uVar51 = CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(fVar85,0),fVar84)))) ^
               (CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(fVar85,0),fVar84))))
               ^ 0xff7fffffff7fffff) & ~uVar48;
      fVar78 = (float)uVar51;
      fVar79 = (float)(uVar51 >> 0x20);
      uVar62 = CONCAT44(fVar68 - fVar88,fVar59 - fVar87);
      auVar63._0_8_ = uVar62 ^ (uVar62 ^ 0x7f7fffff7f7fffff) & ~uVar48;
      auVar63._8_8_ = auVar63._0_8_;
      fVar68 = (float)plVar55[uVar50 * 2 + 0x79];
      fVar87 = (float)((ulong)plVar55[uVar50 * 2 + 0x79] >> 0x20);
      uVar35 = *(undefined8 *)*(undefined1 (*) [12])(plVar55 + uVar50 * 2 + 0x78);
      fVar59 = (float)uVar35;
      fVar84 = (float)((ulong)uVar35 >> 0x20);
      fVar85 = (float)(auVar63._0_8_ >> 0x20);
      auVar15._12_4_ = fVar87;
      auVar15._0_12_ = *(undefined1 (*) [12])(plVar55 + uVar50 * 2 + 0x78);
      auVar19._4_4_ = -(uint)(fVar85 < fVar84);
      auVar19._0_4_ = -(uint)((float)auVar63._0_8_ < fVar59);
      auVar19._8_4_ = -(uint)((float)auVar63._0_8_ < fVar68);
      auVar19._12_4_ = -(uint)(fVar85 < fVar87);
      auVar63 = auVar63 ^ (auVar63 ^ auVar15) & ~auVar19;
      auVar66._8_4_ = fVar78;
      auVar66._0_8_ = uVar51;
      auVar66._12_4_ = fVar79;
      auVar18._4_4_ = -(uint)(fVar84 < fVar79);
      auVar18._0_4_ = -(uint)(fVar59 < fVar78);
      auVar18._8_4_ = -(uint)(fVar68 < fVar78);
      auVar18._12_4_ = -(uint)(fVar87 < fVar79);
      auVar63 = auVar63 ^ (auVar63 ^ auVar66) & auVar18;
      plVar55[uVar50 * 2 + 0x79] = auVar63._8_8_;
      plVar55[uVar50 * 2 + 0x78] = auVar63._0_8_;
      *(undefined4 *)(&UNK_00004b20 + lVar53) = 0;
    }
code_r0x000c72b8:
    fVar85 = *(float *)(plVar55 + uVar50 * 2 + 0x79);
    fVar84 = 0.0;
    if (*(float *)(plVar55 + uVar50 * 2 + 0x78) <= fVar85) {
      fVar87 = *(float *)((long)plVar55 + uVar50 * 0x10 + 0x3c4);
      fVar88 = *(float *)((long)plVar55 + uVar50 * 0x10 + 0x3cc);
      uVar70 = 0;
      uVar72 = 0;
      uVar74 = 0;
      uVar76 = 0;
      fVar68 = 0.0;
      fVar59 = 0.0;
      if (fVar87 <= fVar88) {
        uVar70 = SUB41(fVar85,0);
        uVar72 = (undefined1)((uint)fVar85 >> 8);
        uVar74 = (undefined1)((uint)fVar85 >> 0x10);
        uVar76 = (undefined1)((uint)fVar85 >> 0x18);
        fVar68 = fVar87;
        fVar59 = *(float *)(plVar55 + uVar50 * 2 + 0x78);
        fVar84 = fVar88;
      }
    }
    else {
      uVar70 = 0;
      uVar72 = 0;
      uVar74 = 0;
      uVar76 = 0;
      fVar68 = 0.0;
      fVar59 = 0.0;
    }
    fVar59 = fVar59 + *(float *)(plVar55 + 0x24);
    fVar85 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) +
             *(float *)(plVar55 + 0x24);
    uVar70 = SUB41(fVar85,0);
    uVar72 = (undefined1)((uint)fVar85 >> 8);
    uVar74 = (undefined1)((uint)fVar85 >> 0x10);
    uVar76 = (undefined1)((uint)fVar85 >> 0x18);
    fVar68 = fVar57 + fVar68 + *(float *)((long)plVar55 + 0x124);
    uVar71 = SUB41(fVar68,0);
    uVar73 = (undefined1)((uint)fVar68 >> 8);
    uVar75 = (undefined1)((uint)fVar68 >> 0x10);
    uVar77 = (undefined1)((uint)fVar68 >> 0x18);
    fVar57 = fVar57 + fVar84 + *(float *)((long)plVar55 + 0x124);
    if ((&UNK_00004bc0)[lVar53] != '\0') {
      lVar31 = plVar55[0x74];
      pfVar3 = (float *)(lVar31 + uVar50 * 8 + 0x3e0);
      uVar56 = *(uint *)(&UNK_00004bd0 + lVar53);
      fVar87 = *(float *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x120);
      fVar84 = *(float *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x124);
      if (-1 < (char)(&UNK_00004bc4)[lVar53]) {
        if (*pfVar3 == 3.4028235e+38) {
          fVar88 = fVar59 + 1.0;
          if (fVar85 <= fVar59 + 1.0) {
            fVar88 = fVar85;
          }
          *pfVar3 = fVar88 - fVar87;
        }
        lVar43 = lVar31 + uVar50 * 8;
        if (*(float *)(lVar43 + 0x3e4) == 3.4028235e+38) {
          *(float *)(lVar43 + 0x3e4) = (fVar68 + fVar57) * 0.5 - fVar84;
        }
      }
      if ((uVar56 & 0xfffffffe) == 2) {
        if (*pfVar3 != 3.4028235e+38) {
          fVar59 = fVar87 + *pfVar3;
          uVar70 = SUB41(fVar59,0);
          uVar72 = (undefined1)((uint)fVar59 >> 8);
          uVar74 = (undefined1)((uint)fVar59 >> 0x10);
          uVar76 = (undefined1)((uint)fVar59 >> 0x18);
        }
      }
      else if ((uVar56 < 2) &&
              (fVar85 = *(float *)(lVar31 + uVar50 * 8 + 0x3e4), fVar85 != 3.4028235e+38)) {
        fVar57 = fVar84 + fVar85;
        uVar71 = SUB41(fVar57,0);
        uVar73 = (undefined1)((uint)fVar57 >> 8);
        uVar75 = (undefined1)((uint)fVar57 >> 0x10);
        uVar77 = (undefined1)((uint)fVar57 >> 0x18);
      }
    }
  }
  *pfVar40 = fVar59;
  *(uint *)(&UNK_00004be0 + lVar53) = CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)));
  *(uint *)(&UNK_00004be4 + lVar53) = CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
  *(float *)(&UNK_00004be8 + lVar53) = fVar57;
  if (*(float *)(&UNK_00004bec + lVar53) <= fVar59) {
    if (!(*(float *)(&UNK_00004bf0 + lVar53) ==
          (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) ||
         *(float *)(&UNK_00004bf0 + lVar53) <
         (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))))) goto code_r0x000c7470;
code_r0x000c7430:
    if (*(float *)(&UNK_00004bf4 + lVar53) <
        (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)))) goto code_r0x000c743c;
code_r0x000c7480:
    fVar59 = *(float *)(&UNK_00004bf8 + lVar53);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    if (fVar59 < fVar57) goto code_r0x000c748c;
code_r0x000c744c:
    iVar86 = *(int *)(&UNK_00004bd0 + lVar38);
    lVar53 = lRam0000000000a334c0;
  }
  else {
    *(float *)(&UNK_00004bec + lVar53) = fVar59;
    if (!(*(float *)(&UNK_00004bf0 + lVar53) !=
          (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) &&
         (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) <=
         *(float *)(&UNK_00004bf0 + lVar53))) goto code_r0x000c7430;
code_r0x000c7470:
    *(uint *)(&UNK_00004bf0 + lVar53) = CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)));
    if ((float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) <=
        *(float *)(&UNK_00004bf4 + lVar53)) goto code_r0x000c7480;
code_r0x000c743c:
    *(uint *)(&UNK_00004bf4 + lVar53) = CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
    fVar59 = *(float *)(&UNK_00004bf8 + lVar53);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    if (fVar57 <= fVar59) goto code_r0x000c744c;
code_r0x000c748c:
    *(float *)(&UNK_00004bf8 + lVar53) = fVar57;
    iVar86 = *(int *)(&UNK_00004bd0 + lVar38);
    lVar53 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar53;
  if ((((iVar86 == -1) && (lVar31 = *(long *)(&UNK_00004b18 + lVar53), lVar31 != 0)) &&
      (*(long *)(&UNK_00004d10 + lVar53) == 0)) &&
     (((*(byte *)(lVar31 + 0x16) & 1) == 0 && ((&UNK_00002e64)[lVar53] != '\0')))) {
    fVar57 = *(float *)(&UNK_00002e68 + lVar53);
    if (0.0 <= fVar57) {
      if (fVar57 == 0.0) goto code_r0x000c74dc;
      fVar59 = *(float *)(lVar53 + 0x70);
      uVar70 = SUB41(fVar59,0);
      uVar72 = (undefined1)((uint)fVar59 >> 8);
      uVar74 = (undefined1)((uint)fVar59 >> 0x10);
      uVar76 = (undefined1)((uint)fVar59 >> 0x18);
      if ((fVar59 < fVar57) && (fVar84 = fVar57 - *(float *)(lVar53 + 0x18), fVar84 < fVar57)) {
        fVar85 = *(float *)(lVar53 + 0x74);
        if (fVar85 <= 0.0) {
          if ((fVar59 <= fVar57) && (fVar84 < fVar59)) goto code_r0x000c74dc;
        }
        else {
          if (fVar59 <= fVar84) {
            iVar86 = (int)((fVar84 - fVar59) / fVar85);
          }
          else {
            iVar86 = -1;
          }
          if (fVar59 <= fVar57) {
            iVar58 = (int)((fVar57 - fVar59) / fVar85);
          }
          else {
            iVar58 = -1;
          }
          if (iVar86 < iVar58) {
code_r0x000c74dc:
            if (((((&UNK_0000496c)[lVar53] == '\0') || (*(int *)(&UNK_00004064 + lVar53) == -1)) &&
                (*(int *)(&UNK_000040d4 + lVar53) == -1)) &&
               ((*(char *)(lVar53 + 0xe5c) == '\0' && (*(char *)(lVar53 + 0xe5e) == '\0')))) {
              if ((*(byte *)(lVar53 + 8) & 1) == 0) {
                if (*(char *)(lVar53 + 0xe5d) != '\0') goto code_r0x000c7704;
code_r0x000c77b8:
                uVar56 = (uint)(*(int *)(&UNK_00004064 + lVar53) != 0);
                uVar35 = 3;
              }
              else if (*(char *)(lVar53 + 0xe5d) == '\0') {
                if ((&UNK_00004b7a)[lVar53] != '\0') goto code_r0x000c77b8;
                uVar35 = 3;
                uVar56 = 1;
              }
              else {
code_r0x000c7704:
                uVar35 = 2;
                uVar56 = 0xffffffff;
              }
              *(uint *)(&UNK_00004c00 + lVar53) = uVar56;
              uVar60 = 3;
              if (*(char *)(lVar31 + 0xc4) != '\0') {
                uVar60 = 0x21;
              }
              func_0x000d45ac(0xffffffff,uVar35,&UNK_00001400,uVar60);
              *(undefined4 *)(&UNK_00004c04 + lVar53) = 0xffffffff;
            }
          }
        }
      }
    }
  }
  lVar53 = lRam0000000000a334c0;
  pcVar52 = &UNK_000046e8 + lRam0000000000a334c0;
  pcVar6 = &UNK_00003674 + lRam0000000000a334c0;
  if ((&UNK_00004bc1)[lRam0000000000a334c0] == '\0') {
    (&UNK_00004b7c)[lRam0000000000a334c0] = (&UNK_00004b7d)[lRam0000000000a334c0] != '\0';
    (&UNK_00004b78)[lVar38] = 0;
    plVar55 = *(long **)(&UNK_00004b18 + lVar38);
    if (plVar55 != (long *)0x0) goto code_r0x000c7854;
code_r0x000c78f8:
    if ((uVar46 & 1) != 0) goto code_r0x000c78fc;
    *(undefined2 *)(&UNK_00004b7a + lVar38) = 1;
  }
  else {
    (&UNK_00004b7c)[lRam0000000000a334c0] = 1;
    (&UNK_00004b78)[lVar38] = 0;
    plVar55 = *(long **)(&UNK_00004b18 + lVar38);
    if (plVar55 == (long *)0x0) goto code_r0x000c78f8;
code_r0x000c7854:
    if (((*(byte *)((long)plVar55 + 0x16) & 1) != 0) || (*(long *)(&UNK_00004d10 + lVar38) != 0))
    goto code_r0x000c78f8;
    fVar57 = *(float *)(&UNK_00003d3c + *plVar55) * *(float *)(plVar55 + 0x54);
    if (plVar55[0x6f] != 0) {
      fVar57 = fVar57 * *(float *)(plVar55[0x6f] + 0x2a0);
    }
    fVar59 = *(float *)(lVar38 + 0x18);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    fVar57 = (float)(int)(fVar59 * fVar57 * 100.0 + 0.5);
    if (((*(short *)((long)plVar55 + 0x16c) == 0) && (*(char *)((long)plVar55 + 0x172) != '\0')) &&
       (uVar56 = *(uint *)(&UNK_00004bd0 + lVar38), uVar56 != 0xffffffff)) {
      if (uVar56 < 2) {
        uVar70 = 0xbf;
        if (uVar56 != 0) {
          uVar70 = 0x3f;
        }
        fVar59 = (float)(int)(*(float *)((long)plVar55 + 0x8c) +
                             fVar57 * (float)CONCAT13(uVar70,0x800000));
        uVar70 = SUB41(fVar59,0);
        uVar72 = (undefined1)((uint)fVar59 >> 8);
        uVar74 = (undefined1)((uint)fVar59 >> 0x10);
        uVar76 = (undefined1)((uint)fVar59 >> 0x18);
        *(float *)((long)plVar55 + 0x9c) = fVar59;
        *(undefined4 *)((long)plVar55 + 0xa4) = 0;
        *(undefined4 *)((long)plVar55 + 0xac) = 0;
      }
      if ((uVar56 & 0xfffffffe) == 2) {
        uVar70 = 0xbf;
        if (uVar56 != 2) {
          uVar70 = 0x3f;
        }
        fVar59 = (float)(int)(*(float *)(plVar55 + 0x12) + fVar57 * (float)CONCAT13(uVar70,0x800000)
                             );
        uVar70 = SUB41(fVar59,0);
        uVar72 = (undefined1)((uint)fVar59 >> 8);
        uVar74 = (undefined1)((uint)fVar59 >> 0x10);
        uVar76 = (undefined1)((uint)fVar59 >> 0x18);
        *(float *)(plVar55 + 0x14) = fVar59;
        *(undefined4 *)(plVar55 + 0x15) = 0;
        *(undefined4 *)(plVar55 + 0x16) = 0;
      }
    }
    if (*(int *)(unaff_x29 + -0x7c) == 0) goto code_r0x000c78f8;
    fVar84 = *(float *)(&UNK_00003710 + lVar53);
    fVar59 = *(float *)(&UNK_000036f0 + lVar53) - *(float *)(&UNK_000036e0 + lVar53);
    uVar70 = SUB41(fVar59,0);
    uVar72 = (undefined1)((uint)fVar59 >> 8);
    uVar74 = (undefined1)((uint)fVar59 >> 0x10);
    uVar76 = (undefined1)((uint)fVar59 >> 0x18);
    fVar85 = *(float *)(&UNK_00003700 + lVar53);
    if ((*pcVar6 == '\0') || (*pcVar52 != '\0')) {
      if ((&UNK_00003684)[lVar53] == '\0') {
        uVar71 = 0;
        uVar73 = 0;
        uVar75 = 0x80;
        uVar77 = 0x3f;
      }
      else {
        uVar75 = 0x20;
        uVar77 = 0x41;
        if ((&UNK_000046f4)[lVar53] != '\0') {
          uVar75 = 0x80;
          uVar77 = 0x3f;
        }
        uVar73 = 0;
        uVar71 = 0;
      }
    }
    else {
      uVar71 = 0xcd;
      uVar73 = 0xcc;
      uVar75 = 0xcc;
      uVar77 = 0x3d;
    }
    if ((fVar59 != 0.0) && (*(char *)((long)plVar55 + 0xbc) != '\0')) {
      fVar59 = (float)(int)(*(float *)((long)plVar55 + 0x8c) +
                           (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) *
                           fVar59 * fVar57);
      uVar70 = SUB41(fVar59,0);
      uVar72 = (undefined1)((uint)fVar59 >> 8);
      uVar74 = (undefined1)((uint)fVar59 >> 0x10);
      uVar76 = (undefined1)((uint)fVar59 >> 0x18);
      *(float *)((long)plVar55 + 0x9c) = fVar59;
      *(undefined4 *)((long)plVar55 + 0xa4) = 0;
      *(undefined4 *)((long)plVar55 + 0xac) = 0;
    }
    if (fVar84 - fVar85 != 0.0) {
      fVar59 = *(float *)(plVar55 + 0x12);
      uVar70 = SUB41(fVar59,0);
      uVar72 = (undefined1)((uint)fVar59 >> 8);
      uVar74 = (undefined1)((uint)fVar59 >> 0x10);
      uVar76 = (undefined1)((uint)fVar59 >> 0x18);
      *(float *)(plVar55 + 0x14) =
           (float)(int)(fVar59 + (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) *
                                 (fVar84 - fVar85) * fVar57);
      *(undefined4 *)(plVar55 + 0x15) = 0;
      *(undefined4 *)(plVar55 + 0x16) = 0;
    }
code_r0x000c78fc:
    if (((bVar26) && ((*(byte *)(lVar38 + 8) >> 2 & 1) != 0)) &&
       ((*(byte *)(lVar38 + 0xc) >> 2 & 1) != 0)) {
      uVar60 = func_0x000d96e8();
      *(undefined4 *)(&UNK_00003808 + lVar53) = uVar60;
      *(uint *)(&UNK_0000380c + lVar53) = CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
      *(undefined4 *)(lVar53 + 0xe40) = uVar60;
      *(uint *)(lVar53 + 0xe44) = CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
      *(undefined1 *)(lVar53 + 0xcd) = 1;
    }
  }
  *(undefined4 *)(&UNK_00004bfc + lVar38) = 0;
  bVar26 = false;
  if (*(char *)(lVar53 + 0xe5d) != '\0') {
    bVar26 = *(char *)(lVar53 + 0x59) == '\0';
  }
  (&UNK_0000388d)[lVar53] = bVar26;
  auVar64._0_8_ = *(ulong *)(lVar53 + 0xe40);
  auVar64._8_8_ = 0;
  fVar59 = (float)(auVar64._0_8_ >> 0x20);
  uVar70 = (undefined1)(auVar64._0_8_ >> 0x20);
  uVar72 = (undefined1)(auVar64._0_8_ >> 0x28);
  uVar74 = (undefined1)(auVar64._0_8_ >> 0x30);
  uVar76 = (undefined1)(auVar64._0_8_ >> 0x38);
  fVar57 = (float)auVar64._0_8_;
  if ((-256000.0 <= fVar57) && (-256000.0 <= fVar59)) {
    iVar86 = -(uint)(0.0 <= fVar57);
    iVar58 = -(uint)(0.0 <= fVar59);
    iVar67 = (int)fVar59;
    uVar35 = NEON_scvtf(CONCAT17((char)((uint)iVar67 >> 0x18),
                                 CONCAT16((char)((uint)iVar67 >> 0x10),
                                          CONCAT15((char)((uint)iVar67 >> 8),
                                                   CONCAT14((char)iVar67,(int)fVar57)))),4);
    iVar61 = -(uint)(fVar57 == (float)uVar35);
    iVar69 = -(uint)(fVar59 == (float)((ulong)uVar35 >> 0x20));
    iVar86 = CONCAT13(~(byte)((uint)iVar86 >> 0x18) & ~(byte)((uint)iVar61 >> 0x18),
                      CONCAT12(~(byte)((uint)iVar86 >> 0x10) & ~(byte)((uint)iVar61 >> 0x10),
                               CONCAT11(~(byte)((uint)iVar86 >> 8) & ~(byte)((uint)iVar61 >> 8),
                                        ~(byte)iVar86 & ~(byte)iVar61)));
    auVar64._0_8_ =
         NEON_scvtf(CONCAT44((int)(CONCAT17(~(byte)((uint)iVar58 >> 0x18) &
                                            ~(byte)((uint)iVar69 >> 0x18),
                                            CONCAT16(~(byte)((uint)iVar58 >> 0x10) &
                                                     ~(byte)((uint)iVar69 >> 0x10),
                                                     CONCAT15(~(byte)((uint)iVar58 >> 8) &
                                                              ~(byte)((uint)iVar69 >> 8),
                                                              CONCAT14(~(byte)iVar58 & ~(byte)iVar69
                                                                       ,iVar86)))) >> 0x20) + iVar67
                             ,iVar86 + (int)fVar57),4);
    auVar64._8_8_ = 0;
    *(ulong *)(&UNK_00004ef0 + lVar53) = auVar64._0_8_;
    *(ulong *)(lVar53 + 0xe40) = auVar64._0_8_;
    uVar70 = (undefined1)(auVar64._0_8_ >> 0x20);
    uVar72 = (undefined1)(auVar64._0_8_ >> 0x28);
    uVar74 = (undefined1)(auVar64._0_8_ >> 0x30);
    uVar76 = (undefined1)(auVar64._0_8_ >> 0x38);
  }
  if (((auVar64._0_4_ < -256000.0) ||
      (bVar26 = NAN((float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)))),
      (!bVar26 && (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) < -256000.0) !=
      bVar26)) ||
     ((*(float *)(&UNK_00003808 + lVar53) < -256000.0 ||
      (*(float *)(&UNK_0000380c + lVar53) < -256000.0)))) {
    *(undefined8 *)(lVar53 + 0xe8) = 0;
    uVar71 = 0;
    uVar73 = 0;
    uVar75 = 0;
    uVar77 = 0;
    fVar57 = 0.0;
  }
  else {
    fVar57 = auVar64._0_4_ - *(float *)(&UNK_00003808 + lVar53);
    fVar59 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) -
             *(float *)(&UNK_0000380c + lVar53);
    uVar71 = SUB41(fVar59,0);
    uVar73 = (undefined1)((uint)fVar59 >> 8);
    uVar75 = (undefined1)((uint)fVar59 >> 0x10);
    uVar77 = (undefined1)((uint)fVar59 >> 0x18);
    *(float *)(lVar53 + 0xe8) = fVar57;
    *(float *)(lVar53 + 0xec) = fVar59;
  }
  fVar59 = 4.0;
  if (*(int *)(lVar53 + 0xe58) != 0) {
    fVar59 = 9.0;
  }
  fVar84 = 0.0;
  if ((float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) *
      (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) + fVar57 * fVar57 <= fVar59)
  {
    fVar84 = *(float *)(&UNK_00004eec + lVar53) + *(float *)(lVar53 + 0x18);
  }
  *(float *)(&UNK_00004eec + lVar53) = fVar84;
  if ((fVar57 != 0.0) ||
     (NAN((float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)))) ||
      (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) != 0.0)) {
    (&UNK_00004b7b)[lVar53] = 0;
  }
  lVar31 = 0;
  lVar38 = 0;
  lVar43 = -0x28;
  puVar49 = &UNK_000038b8;
  do {
    if (*(char *)(lVar53 + lVar38 + 0xe48) == '\0') {
      pcVar52 = &UNK_00003865 + lVar38 + lVar53 + -5;
      *pcVar52 = '\0';
      *(undefined2 *)(&UNK_00003865 + lVar31 + lVar53 + 5) = 0;
      fVar57 = *(float *)(puVar49 + lVar53 + -0x28);
      (&UNK_00003865)[lVar38 + lVar53 + 0x19] = 0.0 <= fVar57;
      *(float *)(puVar49 + lVar53 + -0x14) = fVar57;
      *(undefined4 *)(puVar49 + lVar53 + -0x28) = 0xbf800000;
      (&UNK_00003865)[lVar38 + lVar53] = 0;
      cVar21 = *pcVar52;
    }
    else {
      fVar57 = *(float *)(puVar49 + lVar53 + -0x28);
      (&UNK_00003865)[lVar38 + lVar53 + -5] = fVar57 < 0.0;
      *(undefined2 *)(&UNK_00003865 + lVar31 + lVar53 + 5) = 0;
      (&UNK_00003865)[lVar38 + lVar53 + 0x19] = 0;
      *(float *)(puVar49 + lVar53 + -0x14) = fVar57;
      fVar59 = auVar64._0_4_;
      if (fVar57 < 0.0) {
        *(undefined4 *)(puVar49 + lVar53 + -0x28) = 0;
        dVar17 = *(double *)(&UNK_00003f50 + lVar53);
        lVar32 = lVar38 * 8 + lVar53;
        if (*(float *)(lVar53 + 100) <=
            (float)(dVar17 - *(double *)(&UNK_00003865 + lVar32 + -0x2d))) {
code_r0x000c7c20:
          *(undefined2 *)(&UNK_00003865 + lVar31 + lVar53 + 0xf) = 1;
        }
        else {
          fVar57 = 0.0;
          if (fVar59 < -256000.0) {
            if (*(float *)(lVar53 + 0x68) * *(float *)(lVar53 + 0x68) <= 0.0) goto code_r0x000c7c20;
          }
          else {
            bVar26 = NAN((float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))));
            fVar84 = 0.0;
            if ((!bVar26 &&
                (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) < -256000.0) ==
                bVar26) {
              fVar57 = fVar59 - *(float *)(&UNK_00003865 + lVar43 + lVar53 + -0x2d);
              fVar84 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) -
                       *(float *)(&UNK_00003865 + lVar31 * 4 + lVar53 + -0x51);
            }
            if (*(float *)(lVar53 + 0x68) * *(float *)(lVar53 + 0x68) <=
                fVar84 * fVar84 + fVar57 * fVar57) goto code_r0x000c7c20;
          }
          *(short *)(&UNK_00003865 + lVar31 + lVar53 + 0xf) =
               *(short *)(&UNK_00003865 + lVar31 + lVar53 + 0xf) + 1;
        }
        *(double *)(&UNK_00003865 + lVar32 + -0x2d) = dVar17;
        uVar50 = *(ulong *)(lVar53 + 0xe40);
        *(ulong *)(&UNK_00003865 + lVar43 + lVar53 + -0x2d) = uVar50;
        sVar12 = *(short *)(&UNK_00003865 + lVar31 + lVar53 + 0xf);
        *(short *)(&UNK_00003865 + lVar31 + lVar53 + 5) = sVar12;
        *(undefined4 *)(puVar49 + lVar53) = 0;
        auVar64._0_8_ = uVar50 & 0xffffffff;
        auVar64._8_8_ = 0;
        uVar70 = (undefined1)(uVar50 >> 0x20);
        uVar72 = (undefined1)(uVar50 >> 0x28);
        uVar74 = (undefined1)(uVar50 >> 0x30);
        uVar76 = (undefined1)(uVar50 >> 0x38);
        (&UNK_00003865)[lVar38 + lVar53] = sVar12 == 2;
        cVar21 = (&UNK_00003860)[lVar53 + lVar38];
      }
      else {
        *(float *)(puVar49 + lVar53 + -0x28) = fVar57 + *(float *)(lVar53 + 0x18);
        uVar71 = 0;
        uVar73 = 0;
        uVar75 = 0;
        uVar77 = 0;
        bVar26 = true;
        bVar22 = false;
        if (-256000.0 <= fVar59) {
          bVar26 = false;
          bVar22 = true;
          if (!NAN((float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))))) {
            bVar26 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) < -256000.0;
            bVar22 = false;
          }
        }
        if (bVar26 == bVar22) {
          fVar59 = fVar59 - *(float *)(&UNK_00003865 + lVar43 + lVar53 + -0x2d);
          fVar57 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) -
                   *(float *)(&UNK_00003865 + lVar31 * 4 + lVar53 + -0x51);
          fVar57 = fVar57 * fVar57 + fVar59 * fVar59;
          uVar71 = SUB41(fVar57,0);
          uVar73 = (undefined1)((uint)fVar57 >> 8);
          uVar75 = (undefined1)((uint)fVar57 >> 0x10);
          uVar77 = (undefined1)((uint)fVar57 >> 0x18);
        }
        fVar57 = *(float *)(puVar49 + lVar53);
        uVar80 = SUB41(fVar57,0);
        uVar81 = (char)((uint)fVar57 >> 8);
        uVar82 = (char)((uint)fVar57 >> 0x10);
        uVar83 = (char)((uint)fVar57 >> 0x18);
        if (fVar57 < (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)))) {
          uVar80 = uVar71;
          uVar81 = uVar73;
          uVar82 = uVar75;
          uVar83 = uVar77;
        }
        *(uint *)(puVar49 + lVar53) = CONCAT13(uVar83,CONCAT12(uVar82,CONCAT11(uVar81,uVar80)));
        (&UNK_00003865)[lVar38 + lVar53] = 0;
        cVar21 = (&UNK_00003860)[lVar53 + lVar38];
      }
    }
    if (cVar21 != '\0') {
      (&UNK_00004b7b)[lVar53] = 0;
    }
    lVar38 = lVar38 + 1;
    lVar31 = lVar31 + 2;
    lVar43 = lVar43 + 8;
    puVar49 = puVar49 + 4;
  } while (lVar38 != 5);
  func_0x000c3cec();
  func_0x000c3560();
  lVar38 = lRam0000000000a334c0;
  pfVar40 = (float *)(&UNK_00004028 + lRam0000000000a334c0);
  if ((int)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) < 1) {
code_r0x000c7cd4:
    if ((*(long *)(&UNK_00004d10 + unaff_x25) != 0) && (0.0 < (float)in_stack_00000058[0x9f]))
    goto code_r0x000c7ce8;
    fVar57 = (float)in_stack_00000058[0xa6] + *(float *)(unaff_x25 + 0x18) * -10.0;
    if (fVar57 < 0.0) {
      fVar57 = 0.0;
    }
  }
  else {
    uVar50 = (ulong)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) + 1;
    while ((lVar53 = *(long *)(*(long *)(&UNK_00004ad8 + lRam0000000000a334c0) +
                               (ulong)((int)uVar50 - 2) * 0x38 + 8), lVar53 == 0 ||
           ((*(byte *)(lVar53 + 0x17) >> 3 & 1) == 0))) {
      uVar50 = uVar50 - 1;
      if (uVar50 < 2) goto code_r0x000c7cd4;
    }
code_r0x000c7ce8:
    fVar57 = (float)NEON_fminnm((float)in_stack_00000058[0xa6] + *(float *)(unaff_x25 + 0x18) * 6.0,
                                0x3f800000);
  }
  in_stack_00000058[0xa6] = (int)fVar57;
  unaff_x22[0x30] = 0;
  *(undefined4 *)(unaff_x26 + 0x350) = 0xffffffff;
  *(undefined8 *)(&UNK_00006208 + unaff_x25) = 0xffffffffffffffff;
  uVar35 = *(undefined8 *)(unaff_x26 + 0x78);
  *(undefined8 *)(&UNK_00005f50 + unaff_x25) = *(undefined8 *)(unaff_x26 + 0x80);
  *(undefined8 *)(&UNK_00005f48 + unaff_x25) = uVar35;
  *(undefined1 *)(unaff_x26 + 0x78) = 0;
  plVar55 = *(long **)(&UNK_00004020 + lVar38);
  lVar53 = lVar38;
  if (plVar55 != (long *)0x0) {
    fVar57 = *(float *)(&UNK_00004038 + lVar38) - *(float *)(lVar38 + 0x18);
    *(float *)(&UNK_00004038 + lVar38) = fVar57;
    if ((((-256000.0 <= *(float *)(lVar38 + 0xe40)) && (-256000.0 <= *(float *)(lVar38 + 0xe44))) &&
        (fVar59 = *(float *)(lVar38 + 0xe40) - *pfVar40,
        fVar84 = *(float *)(lVar38 + 0xe44) - *(float *)(&UNK_0000402c + lVar38),
        *(float *)(lVar38 + 0x6c) * *(float *)(lVar38 + 0x6c) < fVar84 * fVar84 + fVar59 * fVar59))
       || (fVar57 <= 0.0)) {
      *(undefined4 *)(&UNK_00004038 + lVar38) = 0;
      if (((byte)(&UNK_0000603c)[lVar38] >> 6 & 1) != 0) {
        func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
        lVar53 = lRam0000000000a334c0;
      }
      plVar55 = (long *)0x0;
      *(undefined8 *)(&UNK_00004020 + lVar38) = 0;
      *(undefined8 *)(&UNK_00004028 + lVar38) = *(undefined8 *)(lVar38 + 0xe40);
      *(undefined4 *)(&UNK_00004030 + lVar38) = 0xffffffff;
      *(undefined4 *)(&UNK_00004044 + lVar38) = 0;
      *(undefined4 *)(&UNK_00004048 + lVar38) = 0;
    }
  }
  fVar57 = 0.0;
  uVar70 = 0;
  uVar72 = 0;
  uVar74 = 0;
  uVar76 = 0;
  plVar36 = plVar55;
  if (*(int *)(&UNK_000047c4 + lVar53) == -1) {
    uVar60 = *(undefined4 *)(lVar38 + 0xe54);
    uVar70 = (undefined1)uVar60;
    uVar72 = (undefined1)((uint)uVar60 >> 8);
    uVar74 = (undefined1)((uint)uVar60 >> 0x10);
    uVar76 = (undefined1)((uint)uVar60 >> 0x18);
    if (*(int *)(&UNK_000047d0 + lVar53) == -1) goto code_r0x000c7e4c;
code_r0x000c7e30:
    if (plVar55 != (long *)0x0) goto code_r0x000c7e60;
code_r0x000c7e58:
    plVar36 = *(long **)(&UNK_00004008 + lVar38);
    if (*(long **)(&UNK_00004008 + lVar38) != (long *)0x0) goto code_r0x000c7e60;
  }
  else {
    if (*(int *)(&UNK_000047d0 + lVar53) != -1) goto code_r0x000c7e30;
code_r0x000c7e4c:
    fVar57 = *(float *)(lVar38 + 0xe50);
    if (plVar55 == (long *)0x0) goto code_r0x000c7e58;
code_r0x000c7e60:
    if (*(char *)((long)plVar36 + 0xc1) == '\0') {
      if (fVar57 == 0.0) {
        if (*(char *)(lVar38 + 0xe5c) == '\0') goto code_r0x000c82f8;
      }
      else if (*(char *)(lVar38 + 0xe5c) == '\0') {
code_r0x000c82f8:
        uVar71 = SUB41(fVar57,0);
        uVar73 = (undefined1)((uint)fVar57 >> 8);
        uVar75 = (undefined1)((uint)fVar57 >> 0x10);
        uVar77 = (undefined1)((uint)fVar57 >> 0x18);
        if ((&UNK_0000388d)[lVar38] != '\0') {
          uVar71 = 0;
          uVar73 = 0;
          uVar75 = 0;
          uVar77 = 0;
        }
        fVar59 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
        if ((&UNK_0000388d)[lVar38] != '\0') {
          fVar59 = fVar57;
        }
        fVar84 = (*(float *)(&UNK_00004044 + lVar38) - *(float *)(&UNK_00004044 + lVar38) / 30.0) +
                 ABS(fVar59) / 30.0;
        fVar57 = ABS((float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)))) / 30.0 +
                 (*(float *)(&UNK_00004048 + lVar38) - *(float *)(&UNK_00004048 + lVar38) / 30.0);
        *(float *)(&UNK_00004044 + lVar38) = fVar84;
        *(float *)(&UNK_00004048 + lVar38) = fVar57;
        fVar59 = fVar59 + *(float *)(&UNK_0000403c + lVar38);
        fVar85 = (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) +
                 *(float *)(&UNK_00004040 + lVar38);
        *(undefined4 *)(&UNK_0000403c + lVar38) = 0;
        *(undefined4 *)(&UNK_00004040 + lVar38) = 0;
        lVar53 = lRam0000000000a334c0;
        if ((fVar59 != 0.0) || (fVar85 != 0.0)) {
          if (plVar55 == (long *)0x0) {
            if (fVar59 == 0.0) {
              if (fVar85 == 0.0) goto code_r0x000c7e68;
              plVar55 = (long *)0x0;
              plVar36 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar56 = *(uint *)((long)plVar36 + 0x14);
            }
            else {
              plVar36 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar56 = *(uint *)((long)plVar36 + 0x14);
              plVar55 = plVar36;
              if ((uVar56 >> 0x18 & 1) != 0) {
                uVar46 = uVar56;
                do {
                  if (((uVar46 & 0x210) != 0x10) && (*(float *)((long)plVar55 + 0x94) != 0.0))
                  break;
                  plVar55 = (long *)plVar55[0x6f];
                  uVar46 = *(uint *)((long)plVar55 + 0x14);
                } while ((uVar46 >> 0x18 & 1) != 0);
              }
              if (fVar85 == 0.0) goto code_r0x000c836c;
            }
            uVar46 = uVar56 & 0x1000000;
            while ((uVar46 != 0 &&
                   (((uVar56 & 0x210) == 0x10 || (*(float *)(plVar36 + 0x13) == 0.0))))) {
              plVar36 = (long *)plVar36[0x6f];
              uVar56 = *(uint *)((long)plVar36 + 0x14);
              uVar46 = uVar56 >> 0x18 & 1;
            }
            if ((fVar85 != 0.0 && plVar55 != (long *)0x0) && plVar55 != plVar36) {
              iVar86 = *(int *)(&UNK_00004030 + lRam0000000000a334c0);
              iVar58 = *(int *)(&UNK_00003f58 + lRam0000000000a334c0);
              if (iVar86 == -1) {
                *(int *)(&UNK_00004030 + lRam0000000000a334c0) = iVar58;
                iVar86 = iVar58;
              }
              if ((fVar59 == 0.0) || (iVar86 != iVar58)) {
                if (*(float *)(&UNK_00004044 + lVar53) != *(float *)(&UNK_00004048 + lVar53)) {
                  if (*(float *)(&UNK_00004044 + lVar53) <= *(float *)(&UNK_00004048 + lVar53)) {
                    plVar55 = plVar36;
                  }
                  goto code_r0x000c836c;
                }
              }
              *(float *)(&UNK_0000403c + lVar53) = fVar59;
              *(float *)(&UNK_00004040 + lVar53) = fVar85;
              goto code_r0x000c7e68;
            }
            plVar55 = plVar36;
          }
code_r0x000c836c:
          if ((*(ushort *)((long)plVar55 + 0x14) & 0x210) == 0) {
            if (fVar59 == 0.0) {
              cVar21 = false;
            }
            else {
              cVar21 = *(float *)((long)plVar55 + 0x94) != 0.0;
            }
            *(char *)(unaff_x29 + -0x78) = cVar21;
            if (fVar85 == 0.0) {
              *(undefined1 *)(unaff_x29 + -0x77) = 0;
            }
            else {
              fVar68 = *(float *)(plVar55 + 0x13);
              *(bool *)(unaff_x29 + -0x77) = fVar68 != 0.0;
              if (((bool)cVar21 != false) && (fVar68 != 0.0)) {
                *(undefined1 *)(unaff_x29 + -0x78 + (ulong)(fVar57 < fVar84)) = 0;
                cVar21 = *(char *)(unaff_x29 + -0x78);
              }
            }
            if (cVar21 != '\0') {
              func_0x000eb200(plVar55);
              fVar84 = (*(float *)(plVar55 + 0x42) - *(float *)(plVar55 + 0x41)) * 0.67;
              fVar57 = *(float *)(&UNK_00003d3c + *plVar55) * *(float *)(plVar55 + 0x54);
              uVar70 = SUB41(fVar57,0);
              uVar72 = (undefined1)((uint)fVar57 >> 8);
              uVar74 = (undefined1)((uint)fVar57 >> 0x10);
              uVar76 = (undefined1)((uint)fVar57 >> 0x18);
              if (plVar55[0x6f] != 0) {
                fVar57 = fVar57 * *(float *)(plVar55[0x6f] + 0x2a0);
                uVar70 = SUB41(fVar57,0);
                uVar72 = (undefined1)((uint)fVar57 >> 8);
                uVar74 = (undefined1)((uint)fVar57 >> 0x10);
                uVar76 = (undefined1)((uint)fVar57 >> 0x18);
              }
              fVar57 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) +
                       (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70)));
              if (fVar84 <= fVar57) {
                fVar57 = fVar84;
              }
              *(float *)((long)plVar55 + 0x9c) =
                   *(float *)((long)plVar55 + 0x8c) - (float)(int)fVar57 * fVar59;
              *(undefined4 *)((long)plVar55 + 0xa4) = 0;
              *(undefined4 *)((long)plVar55 + 0xac) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar38) = *(undefined4 *)(&UNK_00003f58 + lVar38);
            }
            if (*(char *)(unaff_x29 + -0x77) != '\0') {
              func_0x000eb200(plVar55);
              fVar59 = (*(float *)((long)plVar55 + 0x214) - *(float *)((long)plVar55 + 0x20c)) *
                       0.67;
              fVar57 = *(float *)(&UNK_00003d3c + *plVar55) * *(float *)(plVar55 + 0x54);
              uVar70 = SUB41(fVar57,0);
              uVar72 = (undefined1)((uint)fVar57 >> 8);
              uVar74 = (undefined1)((uint)fVar57 >> 0x10);
              uVar76 = (undefined1)((uint)fVar57 >> 0x18);
              if (plVar55[0x6f] != 0) {
                fVar57 = fVar57 * *(float *)(plVar55[0x6f] + 0x2a0);
                uVar70 = SUB41(fVar57,0);
                uVar72 = (undefined1)((uint)fVar57 >> 8);
                uVar74 = (undefined1)((uint)fVar57 >> 0x10);
                uVar76 = (undefined1)((uint)fVar57 >> 0x18);
              }
              fVar57 = (float)CONCAT13(uVar76,CONCAT12(uVar74,CONCAT11(uVar72,uVar70))) * 5.0;
              if (fVar59 <= fVar57) {
                fVar57 = fVar59;
              }
              *(float *)(plVar55 + 0x14) = *(float *)(plVar55 + 0x12) - (float)(int)fVar57 * fVar85;
              *(undefined4 *)(plVar55 + 0x15) = 0;
              *(undefined4 *)(plVar55 + 0x16) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar38) = *(undefined4 *)(&UNK_00003f58 + lVar38);
            }
          }
        }
      }
      else if (*(char *)(lVar38 + 0x44) != '\0') {
        fVar57 = (float)NEON_fminnm(*(float *)(&UNK_00004038 + lVar53) + ABS(fVar57) * 0.7,
                                    0x3f333333);
        *(float *)(&UNK_00004038 + lVar53) = fVar57;
        if (*(long **)(&UNK_00004020 + lVar53) != plVar36) {
          if (((byte)(&UNK_0000603c)[lVar53] >> 6 & 1) != 0) {
            func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
          }
          *(long **)(&UNK_00004020 + lVar53) = plVar36;
          *(undefined8 *)(&UNK_00004028 + lVar53) = *(undefined8 *)(lVar53 + 0xe40);
        }
        fVar59 = *(float *)(plVar36 + 0x54);
        fVar57 = fVar59 + *(float *)(lVar38 + 0xe50) * 0.1;
        uVar70 = 0;
        uVar72 = 0;
        uVar74 = 0x20;
        uVar76 = 0x40;
        if (fVar57 <= 2.5) {
          uVar70 = SUB41(fVar57,0);
          uVar72 = (char)((uint)fVar57 >> 8);
          uVar74 = (char)((uint)fVar57 >> 0x10);
          uVar76 = (char)((uint)fVar57 >> 0x18);
        }
        uVar71 = 0;
        uVar73 = 0;
        uVar75 = 0;
        uVar77 = 0x3f;
        if (0.5 <= fVar57) {
          uVar71 = uVar70;
          uVar73 = uVar72;
          uVar75 = uVar74;
          uVar77 = uVar76;
        }
        *(uint *)(plVar36 + 0x54) = CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71)));
        if (plVar36 == (long *)plVar36[0x71]) {
          fVar59 = (float)CONCAT13(uVar77,CONCAT12(uVar75,CONCAT11(uVar73,uVar71))) / fVar59;
          fVar85 = (float)plVar36[5];
          fVar68 = (float)((ulong)plVar36[5] >> 0x20);
          fVar57 = (float)plVar36[6];
          fVar84 = (float)((ulong)plVar36[6] >> 0x20);
          uVar35 = *(undefined8 *)(lVar38 + 0xe40);
          *(uint *)(plVar36 + 0x1d) = *(uint *)(plVar36 + 0x1d) & 0xfffffff1;
          *(undefined8 *)((long)plVar36 + 0xec) = 0x7f7fffff7f7fffff;
          iVar86 = (int)(fVar68 + (fVar84 * (1.0 - fVar59) *
                                  ((float)((ulong)uVar35 >> 0x20) - fVar68)) / fVar84);
          lVar38 = NEON_scvtf(CONCAT17((char)((uint)iVar86 >> 0x18),
                                       CONCAT16((char)((uint)iVar86 >> 0x10),
                                                CONCAT15((char)((uint)iVar86 >> 8),
                                                         CONCAT14((char)iVar86,
                                                                  (int)(fVar85 + (fVar57 * (1.0 - 
                                                  fVar59) * ((float)uVar35 - fVar85)) / fVar57))))),
                              4);
          plVar36[5] = lVar38;
          fVar85 = (float)lVar38 - fVar85;
          fVar68 = (float)((ulong)lVar38 >> 0x20) - fVar68;
          uVar70 = (undefined1)((uint)fVar68 >> 8);
          uVar72 = (undefined1)((uint)fVar68 >> 0x10);
          uVar74 = (undefined1)((uint)fVar68 >> 0x18);
          if ((fVar85 != 0.0) || (fVar68 != 0.0)) {
            if (((*(byte *)((long)plVar36 + 0x15) & 1) == 0) &&
               (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
              *(float *)(&UNK_00005f5c + lRam0000000000a334c0) =
                   *(float *)(lRam0000000000a334c0 + 0x1c);
            }
            plVar36[0x22] =
                 CONCAT44(fVar68 + (float)((ulong)plVar36[0x22] >> 0x20),
                          fVar85 + (float)plVar36[0x22]);
            fVar87 = fVar68 + (float)((ulong)plVar36[0x26] >> 0x20);
            plVar36[0x26] =
                 CONCAT17((char)((uint)fVar87 >> 0x18),
                          CONCAT16((char)((uint)fVar87 >> 0x10),
                                   CONCAT15((char)((uint)fVar87 >> 8),
                                            CONCAT14(SUB41(fVar87,0),fVar85 + (float)plVar36[0x26]))
                                  ));
            fVar87 = (float)(CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(fVar68,0
                                                  ),fVar85)))) >> 0x20) +
                     (float)((ulong)plVar36[0x24] >> 0x20);
            plVar36[0x25] =
                 CONCAT44((float)(CONCAT17(uVar74,CONCAT16(uVar72,CONCAT15(uVar70,CONCAT14(SUB41(
                                                  fVar68,0),fVar85)))) >> 0x20) +
                          (float)((ulong)plVar36[0x25] >> 0x20),fVar85 + (float)plVar36[0x25]);
            plVar36[0x24] =
                 CONCAT17((char)((uint)fVar87 >> 0x18),
                          CONCAT16((char)((uint)fVar87 >> 0x10),
                                   CONCAT15((char)((uint)fVar87 >> 8),
                                            CONCAT14(SUB41(fVar87,0),fVar85 + (float)plVar36[0x24]))
                                  ));
          }
          auVar65._0_4_ = (int)(fVar57 * fVar59);
          auVar65._4_4_ = (int)(fVar84 * fVar59);
          auVar65._8_4_ = (int)((float)plVar36[7] * fVar59);
          auVar65._12_4_ = (int)((float)((ulong)plVar36[7] >> 0x20) * fVar59);
          auVar66 = NEON_scvtf(auVar65,4);
          plVar36[7] = auVar66._8_8_;
          plVar36[6] = auVar66._0_8_;
        }
      }
    }
  }
code_r0x000c7e68:
  if (*(char *)(in_stack_00000050 + 0x20b) == '\0') {
    if (0.0 <= *(float *)(unaff_x25 + 0x60)) {
      fVar57 = (float)*(double *)(&UNK_00003f50 + unaff_x25) - *(float *)(unaff_x25 + 0x60);
      iVar86 = *(int *)(&UNK_00003fa0 + unaff_x25);
    }
    else {
      fVar57 = 3.4028235e+38;
      iVar86 = *(int *)(&UNK_00003fa0 + unaff_x25);
    }
  }
  else {
    fVar57 = 3.4028235e+38;
    iVar86 = *(int *)(&UNK_00003fa0 + unaff_x25);
  }
  if (iVar86 != 0) {
    plVar55 = *(long **)(&UNK_00003fa8 + unaff_x25);
    lVar38 = (long)iVar86 << 3;
    do {
      lVar53 = *plVar55;
      cVar21 = *(char *)(lVar53 + 0xbe);
      *(char *)(lVar53 + 0xbf) = cVar21;
      *(undefined1 *)(lVar53 + 0xbe) = 0;
      *(undefined1 *)(lVar53 + 0xc0) = 0;
      *(undefined2 *)(lVar53 + 0xce) = *(undefined2 *)(lVar53 + 0xcc);
      *(undefined2 *)(lVar53 + 0xcc) = 0;
      if (((cVar21 == '\0') && (*(char *)(lVar53 + 0x3fc) == '\0')) &&
         (*(float *)(lVar53 + 0x274) < fVar57)) {
        func_0x000c1cc8();
      }
      plVar55 = plVar55 + 1;
      lVar38 = lVar38 + -8;
    } while (lVar38 != 0);
  }
  iVar86 = unaff_x22[0xe];
  if (0 < iVar86) {
    lVar53 = 0;
    lVar38 = 0;
    do {
      fVar59 = *(float *)(*(long *)(&UNK_00004e68 + unaff_x25) + lVar38 * 4);
      bVar26 = false;
      if ((0.0 <= fVar59) && (bVar26 = false, !NAN(fVar59) && !NAN(fVar57))) {
        bVar26 = fVar59 < fVar57;
      }
      if (bVar26) {
        func_0x00134464(*(long *)(&UNK_00004e40 + unaff_x25) + lVar53);
        iVar86 = unaff_x22[0xe];
      }
      lVar38 = lVar38 + 1;
      lVar53 = lVar53 + 0x250;
    } while (lVar38 < iVar86);
  }
  if (*unaff_x22 != 0) {
    lVar38 = *(long *)(&UNK_00004e30 + unaff_x25);
    lVar53 = (long)*unaff_x22 * 0x78;
    do {
      fVar59 = *(float *)(lVar38 + 4);
      bVar26 = false;
      if ((0.0 <= fVar59) && (bVar26 = false, !NAN(fVar59) && !NAN(fVar57))) {
        bVar26 = fVar59 < fVar57;
      }
      if (bVar26) {
        func_0x00134568(lVar38);
      }
      lVar38 = lVar38 + 0x78;
      lVar53 = lVar53 + -0x78;
    } while (lVar53 != 0);
  }
  if (*(char *)(in_stack_00000050 + 0x20b) != '\0') {
    func_0x000c1b38();
  }
  *(undefined1 *)(in_stack_00000050 + 0x20b) = 0;
  if ((*(long *)(&UNK_00004b18 + unaff_x25) == 0) ||
     (*(char *)(*(long *)(&UNK_00004b18 + unaff_x25) + 0xbf) != '\0')) {
    iVar86 = *(int *)(&UNK_00003fd4 + unaff_x25);
joined_r0x000c8160:
    if (-1 < iVar86) goto code_r0x000c8164;
code_r0x000c8278:
    func_0x000ee530(&UNK_00003fd0 + unaff_x25,0);
    *(undefined4 *)(&UNK_00003fd0 + unaff_x25) = 0;
    if (in_stack_00000058[0xd] < 0) goto code_r0x000c8294;
code_r0x000c8170:
    in_stack_00000058[0xc] = 0;
    iVar86 = in_stack_00000058[1];
    if (-1 < iVar86) goto code_r0x000c817c;
code_r0x000c82ac:
    func_0x000eb9f0(in_stack_00000058,0);
    iVar86 = in_stack_00000058[1];
    *in_stack_00000058 = 0;
  }
  else {
    if (0 < *(int *)(&UNK_00003fb0 + lRam0000000000a334c0)) {
      lVar38 = (ulong)(*(int *)(&UNK_00003fb0 + lRam0000000000a334c0) - 1) << 3;
      do {
        lVar53 = *(long *)(*(long *)(&UNK_00003fb8 + lRam0000000000a334c0) + lVar38);
        if (((lVar53 != 0) && (*(char *)(lVar53 + 0xbf) != '\0')) &&
           (((*(uint *)(lVar53 + 0x14) ^ 0xffffffff) & 0x10200) != 0)) {
          func_0x000c3098(lVar53,1);
          iVar86 = *(int *)(&UNK_00003fd4 + unaff_x25);
          goto joined_r0x000c8160;
        }
        bVar26 = lVar38 != 0;
        lVar38 = lVar38 + -8;
      } while (bVar26);
    }
    func_0x000c3098(0,1);
    if (*(int *)(&UNK_00003fd4 + unaff_x25) < 0) goto code_r0x000c8278;
code_r0x000c8164:
    *(undefined4 *)(&UNK_00003fd0 + unaff_x25) = 0;
    if (-1 < in_stack_00000058[0xd]) goto code_r0x000c8170;
code_r0x000c8294:
    func_0x000eadcc(in_stack_00000058 + 0xc,0);
    in_stack_00000058[0xc] = 0;
    iVar86 = in_stack_00000058[1];
    if (iVar86 < 0) goto code_r0x000c82ac;
code_r0x000c817c:
    *in_stack_00000058 = 0;
  }
  iVar58 = 0;
  if (iVar86 == 0) {
    func_0x000eb9f0(in_stack_00000058,8);
    iVar58 = *in_stack_00000058;
  }
  *(undefined4 *)(*(long *)(&UNK_00004ab8 + unaff_x25) + (long)iVar58 * 4) = 0;
  *in_stack_00000058 = *in_stack_00000058 + 1;
  if (in_stack_00000058[5] < 0) {
    func_0x000eadcc(in_stack_00000058 + 4,0);
  }
  in_stack_00000058[4] = 0;
  lVar38 = lRam0000000000a334c0;
  pcVar52 = &UNK_00006075 + lRam0000000000a334c0;
  *(undefined4 *)(&UNK_00006078 + lRam0000000000a334c0) = 0;
  if (*pcVar52 != '\0') {
    iVar86 = *(int *)(&UNK_00004054 + lVar38);
    *(undefined4 *)(&UNK_00004ee8 + lVar38) = 7;
    if ((&UNK_00002f44)[lVar38] != '\0') {
      fVar57 = *(float *)(&UNK_00002f48 + lVar38);
      if (0.0 <= fVar57) {
        if (fVar57 == 0.0) goto code_r0x000c820c;
        fVar59 = *(float *)(lVar38 + 0x70);
        if ((fVar59 < fVar57) && (fVar84 = fVar57 - *(float *)(lVar38 + 0x18), fVar84 < fVar57)) {
          fVar85 = *(float *)(lVar38 + 0x74);
          if (fVar85 <= 0.0) {
            if ((fVar59 <= fVar57) && (fVar84 < fVar59)) goto code_r0x000c820c;
          }
          else {
            if (fVar59 <= fVar84) {
              iVar58 = (int)((fVar84 - fVar59) / fVar85);
            }
            else {
              iVar58 = -1;
            }
            if (fVar59 <= fVar57) {
              iVar67 = (int)((fVar57 - fVar59) / fVar85);
            }
            else {
              iVar67 = -1;
            }
            if (iVar58 < iVar67) {
code_r0x000c820c:
              if ((&UNK_00004184)[lVar38] == '\0') {
                *pcVar52 = '\0';
              }
            }
          }
        }
      }
    }
    iVar58 = *(int *)(lVar38 + 0xe60);
    if (iVar58 == 0x3000) {
      if (((*(char *)(lVar38 + 0xe48) != '\0') && (*(float *)(&UNK_00003890 + lVar38) == 0.0)) &&
         ((&UNK_00004790)[lVar38] == '\0')) {
        (&UNK_00006076)[lVar38] = 0;
      }
      if (((*(char *)(lVar38 + 0xe49) != '\0') && (*(float *)(&UNK_00003894 + lVar38) == 0.0)) &&
         ((&UNK_0000479c)[lVar38] == '\0')) {
        (&UNK_00006076)[lVar38] = 1;
      }
      if (((*(char *)(lVar38 + 0xe4a) != '\0') && (*(float *)(&UNK_00003898 + lVar38) == 0.0)) &&
         ((&UNK_000047a8)[lVar38] == '\0')) {
        (&UNK_00006076)[lVar38] = 2;
      }
    }
    else {
      uVar50 = (ulong)(byte)(&UNK_00006076)[lVar38];
      if ((*(char *)(lVar38 + uVar50 + 0xe48) != '\0') &&
         (*(float *)(&UNK_00003890 + lVar38 + uVar50 * 4) == 0.0)) {
        if ((byte)(&UNK_00006076)[lVar38] < 0xb) {
          bVar26 = (&UNK_00004790)[lVar38 + uVar50 * 0xc] == '\0';
        }
        else {
          bVar26 = true;
        }
        if ((bVar26) && (iVar86 != 0)) {
          *(int *)(&UNK_00006078 + lVar38) = iVar86;
          *pcVar52 = '\0';
        }
      }
    }
    *(uint *)(&UNK_000049f8 + lVar38) = *(uint *)(&UNK_000049f8 + lVar38) | 0x40;
    *(undefined4 *)(&UNK_00004a58 + lVar38) = 0x3f333333;
    func_0x000d8e98(0,0);
    func_0x0010adc0("HoveredId: 0x%08X");
    func_0x0010adc0("Press ESC to abort picking.");
    if (iVar58 == 0x3000) {
      func_0x0010adc0("Remap w/ Ctrl+Shift: click anywhere to select new mouse button.");
    }
    else {
      func_0x0010ae94(&UNK_000039cc + lRam0000000000a334c0 + (ulong)(iVar86 == 0) * 0x10,
                      "Click %s Button to break in debugger! (remap w/ Ctrl+Shift)");
    }
    func_0x000cea90();
    lVar38 = lRam0000000000a334c0;
  }
  piVar7 = (int *)(&UNK_0000404c + lVar38);
  *piVar7 = 0;
  if (*(int *)(&UNK_00003f58 + lVar38) != *(int *)(&UNK_000060a8 + lVar38) + 1)
  goto code_r0x000c8960;
  iVar86 = *(int *)(&UNK_00004054 + lVar38);
  if (iVar86 == 0) {
    iVar86 = *(int *)(&UNK_00004064 + lVar38);
    if (*(int *)(&UNK_000060b0 + lVar38) != iVar86) goto code_r0x000c88c8;
  }
  else if (*(int *)(&UNK_000060b0 + lVar38) != iVar86) {
code_r0x000c88c8:
    *(undefined4 *)(&UNK_000060ac + lVar38) = 0xffffffff;
    *(int *)(&UNK_000060b0 + lVar38) = iVar86;
    if (*(int *)(&UNK_000060bc + lVar38) < 0) {
      func_0x000eb834(&UNK_000060b8 + lVar38,0);
    }
    *(undefined4 *)(&UNK_000060b8 + lVar38) = 0;
  }
  if (iVar86 != 0) {
    uVar56 = *(uint *)(&UNK_000060ac + lVar38);
    if ((int)uVar56 < 0) {
      if (uVar56 == 0xffffffff) {
        *piVar7 = iVar86;
      }
    }
    else {
      if (((int)uVar56 < *(int *)(&UNK_000060b8 + lVar38)) &&
         ((lVar53 = *(long *)(&UNK_000060c0 + lVar38) + (ulong)uVar56 * 0x40,
          *(char *)(lVar53 + 5) != '\0' || ('\x02' < *(char *)(lVar53 + 4))))) {
        uVar56 = uVar56 + 1;
        *(uint *)(&UNK_000060ac + lVar38) = uVar56;
      }
      if ((int)uVar56 < *(int *)(&UNK_000060b8 + lVar38)) {
        piVar1 = (int *)(*(long *)(&UNK_000060c0 + lVar38) + (ulong)uVar56 * 0x40);
        *piVar7 = *piVar1;
        *(char *)(piVar1 + 1) = (char)piVar1[1] + '\x01';
      }
    }
  }
code_r0x000c8960:
  lVar38 = lRam0000000000a334c0;
  piVar7 = (int *)(&UNK_00004a6c + lRam0000000000a334c0);
  if (0.0 < *(float *)(&UNK_0000607c + lRam0000000000a334c0)) {
    fVar57 = (float)_cosf(*(float *)(&UNK_0000607c + lRam0000000000a334c0) * 6.0,0);
    iVar86 = *piVar7;
    lVar53 = lVar38 + (long)iVar86 * 0x10;
    fVar84 = (float)_fmodf(fVar57 * 0.5 + 0.5,0);
    fVar84 = fVar84 / 0.16666667;
    fVar57 = ((fVar84 - (float)(int)fVar84) * -0.5 + 1.0) * 0.5;
    fVar59 = 0.5;
    if ((uint)(int)fVar84 < 5) {
      fVar68 = ((1.0 - (fVar84 - (float)(int)fVar84)) * -0.5 + 1.0) * 0.5;
      fVar85 = 0.25;
      uVar72 = SUB41(fVar68,0);
      uVar74 = (undefined1)((uint)fVar68 >> 8);
      uVar76 = (undefined1)((uint)fVar68 >> 0x10);
      uVar70 = (char)((uint)fVar68 >> 0x18);
      switch((int)fVar84) {
      case 1:
        uVar72 = 0;
        uVar74 = 0;
        uVar76 = 0;
        uVar70 = 0x3f;
        fVar59 = fVar57;
        break;
      case 2:
        uVar72 = 0;
        uVar74 = 0;
        uVar76 = 0;
        uVar70 = 0x3f;
        fVar59 = 0.25;
        fVar85 = fVar68;
        break;
      case 3:
        uVar72 = SUB41(fVar57,0);
        uVar74 = (undefined1)((uint)fVar57 >> 8);
        uVar76 = (undefined1)((uint)fVar57 >> 0x10);
        uVar70 = (char)((uint)fVar57 >> 0x18);
        fVar59 = 0.25;
        fVar85 = 0.5;
        break;
      case 4:
        uVar72 = 0;
        uVar74 = 0;
        uVar76 = 0x80;
        uVar70 = 0x3e;
        fVar59 = fVar68;
        fVar85 = 0.5;
      }
    }
    else {
      uVar72 = 0;
      uVar74 = 0;
      uVar76 = 0x80;
      uVar70 = 0x3e;
      fVar85 = fVar57;
    }
    *(float *)(&UNK_000039cc + lVar53) = fVar59;
    *(uint *)(&UNK_000039d0 + lVar53) = CONCAT13(uVar70,CONCAT12(uVar76,CONCAT11(uVar74,uVar72)));
    *(float *)(&UNK_000039d4 + lVar53) = fVar85;
    *(undefined4 *)(&UNK_000039d8 + lVar38 + (long)iVar86 * 0x10) = 0x3f800000;
    fVar57 = *(float *)(&UNK_0000607c + lVar38) - *(float *)(lVar38 + 0x18);
    *(float *)(&UNK_0000607c + lVar38) = fVar57;
    if (fVar57 <= 0.0) {
      if (iVar86 != 0x35) {
        auVar66 = *(undefined1 (*) [16])(&UNK_00006080 + lVar38);
        *(long *)(&UNK_000039d4 + lVar53) = auVar66._8_8_;
        *(long *)(&UNK_000039cc + lVar53) = auVar66._0_8_;
      }
      *piVar7 = 0x35;
    }
  }
  cVar21 = *(char *)(unaff_x26 + 0x1ad);
  if ((cVar21 != '\0') && (*(char *)(unaff_x26 + 0x1ad) = cVar21 + -1, cVar21 == '\x01')) {
    *(undefined4 *)(in_stack_00000050 + 0xc24) = 0;
    *(undefined1 *)(unaff_x26 + 0x1ae) = 0;
  }
  cVar21 = *(char *)(unaff_x26 + 0x1ac);
  if (cVar21 != '\0') {
    *(char *)(unaff_x26 + 0x1ac) = cVar21 + -1;
    if (cVar21 == '\x01') {
      func_0x000bae48("(Debug Log: Auto-disabled some ImGuiDebugLogFlags after 2 frames)\n");
      *(uint *)(unaff_x26 + 0x17c) =
           *(uint *)(unaff_x26 + 0x17c) & (*(uint *)(unaff_x26 + 0x1a8) ^ 0xffffffff);
      *(undefined4 *)(unaff_x26 + 0x1a8) = 0;
      lVar38 = lRam0000000000a334c0;
    }
  }
  *(undefined1 *)(in_stack_00000050 + 0x209) = 1;
  *(uint *)(&UNK_000049f8 + lVar38) = *(uint *)(&UNK_000049f8 + lVar38) | 2;
  *(undefined8 *)(&UNK_00004a18 + lVar38) = 0x43c8000043c80000;
  *(undefined4 *)(&UNK_00004a00 + lVar38) = 4;
  func_0x000c9774("Debug##Default",0,0);
  if (*(char *)(unaff_x25 + 0x7a) == '\0') {
    *(undefined1 *)(unaff_x26 + 0x1b4) = 0xff;
    iVar86 = *(int *)(unaff_x26 + 0xe0);
  }
  else {
    iVar86 = (int)*(char *)(unaff_x26 + 0x1b4);
    if (iVar86 == -1) {
      *(undefined1 *)(unaff_x26 + 0x1b4) = 0;
      iVar86 = *(int *)(unaff_x26 + 0xe0);
    }
    else {
      if (((&UNK_00003f58)[unaff_x25] & 3) == 0) {
        iVar86 = *(char *)(unaff_x26 + 0x1b4) + 1;
      }
      *(char *)(unaff_x26 + 0x1b4) =
           (char)iVar86 + ((char)(iVar86 * 0x6667 >> 0x12) - (char)(iVar86 * 0x6667 >> 0x1f)) * -10;
      iVar86 = *(int *)(unaff_x26 + 0xe0);
    }
  }
  if (iVar86 != 0) {
    lVar38 = *(long *)(&UNK_00005fa8 + unaff_x25);
    lVar53 = (long)iVar86 << 5;
    do {
      if (*(int *)(lVar38 + 4) == 1) {
        (**(code **)(lVar38 + 0x10))(unaff_x25,lVar38);
      }
      lVar38 = lVar38 + 0x20;
      lVar53 = lVar53 + -0x20;
    } while (lVar53 != 0);
  }
  return;
code_r0x000c4de8:
  if (0.0 <= param_2) goto code_r0x000c4e00;
  pfVar40[3] = 0.0;
  goto code_r0x000c4e14;
code_r0x000c4e00:
  param_2 = param_2 + *(float *)(unaff_x21 + 0x18);
  pfVar40[3] = param_2;
  goto code_r0x000c4e0c;
}

