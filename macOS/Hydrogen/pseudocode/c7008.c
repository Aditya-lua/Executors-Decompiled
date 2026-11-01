
/* WARNING: Removing unreachable block (ram,0x000c7260) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c7008(long param_1)

{
  float *pfVar1;
  char *pcVar2;
  int *piVar3;
  int *piVar4;
  short sVar5;
  undefined1 auVar6 [16];
  double dVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined8 uVar10;
  long lVar11;
  char cVar12;
  bool bVar13;
  bool bVar14;
  undefined8 uVar15;
  long lVar16;
  long *plVar17;
  long lVar18;
  long *plVar19;
  uint uVar20;
  ulong uVar21;
  long lVar22;
  undefined4 in_w10;
  undefined4 in_w11;
  int iVar23;
  long lVar24;
  undefined4 in_w12;
  uint uVar25;
  undefined *puVar26;
  ulong in_x13;
  undefined4 in_w14;
  char *pcVar27;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  float *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  float fVar28;
  undefined4 uVar29;
  int iVar30;
  float fVar37;
  ulong uVar31;
  ulong uVar32;
  undefined1 auVar33 [16];
  int iVar38;
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 uVar41;
  undefined1 uVar42;
  undefined1 uVar43;
  undefined1 uVar44;
  undefined1 uVar45;
  undefined1 uVar46;
  float fVar47;
  float fVar48;
  undefined1 uVar49;
  undefined1 uVar50;
  undefined1 uVar51;
  undefined1 uVar52;
  float fVar53;
  float fVar54;
  float fVar55;
  int iVar56;
  float fVar57;
  int iVar59;
  ulong uVar58;
  float unaff_s8;
  int *in_stack_00000048;
  long in_stack_00000050;
  int *in_stack_00000058;
  int in_stack_00000070;
  long in_stack_00000078;
  
  *(undefined2 *)(&UNK_00004bc0 + param_1) = 0x101;
  *(ulong *)(&UNK_00004bd0 + param_1) = CONCAT44(in_w11,in_w11);
  *(undefined4 *)(&UNK_00004bd8 + param_1) = in_w12;
  *(uint *)(&UNK_00004bc4 + param_1) = (uint)(in_x13 >> 6) & 0x10 | (uint)in_x13;
  *(undefined4 *)(&UNK_00004bc8 + param_1) = in_w14;
  (&UNK_00004bc2)[param_1] = 0;
  if (((uint)in_x13 >> 9 & 1) == 0) {
    in_w10 = *(undefined4 *)(param_1 + 0xe60);
  }
  *(undefined4 *)(&UNK_00004bcc + param_1) = in_w10;
  *(undefined4 *)(&UNK_00004c28 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c10 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c08 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c30 + param_1) = 0xffffffffffffffff;
  *(undefined4 *)(&UNK_00004c40 + param_1) = 0x7f7fffff;
  uVar39 = 0xff;
  uVar41 = 0xff;
  uVar43 = 0x7f;
  uVar45 = 0x7f;
  *(undefined8 *)(&UNK_00004c38 + param_1) = 0x7f7fffff7f7fffff;
  *(undefined4 *)(&UNK_00004c68 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c50 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c48 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c70 + param_1) = 0xffffffffffffffff;
  *(undefined4 *)(&UNK_00004c80 + param_1) = 0x7f7fffff;
  *(undefined8 *)(&UNK_00004c78 + param_1) = 0x7f7fffff7f7fffff;
  *(undefined4 *)(&UNK_00004ca8 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c90 + param_1) = 0;
  *(undefined8 *)(&UNK_00004c88 + param_1) = 0;
  *(undefined8 *)(&UNK_00004cb0 + param_1) = 0xffffffffffffffff;
  *(undefined4 *)(&UNK_00004cc0 + param_1) = 0x7f7fffff;
  *(undefined8 *)(&UNK_00004cb8 + param_1) = 0x7f7fffff7f7fffff;
  *(undefined4 *)(&UNK_00004c04 + param_1) = 0;
  *(undefined8 *)(&UNK_00004cd0 + param_1) = 0;
  *(undefined8 *)(&UNK_00004cc8 + param_1) = 0;
  *(undefined4 *)(&UNK_00004ce8 + param_1) = 0;
  *(undefined8 *)(&UNK_00004cf0 + param_1) = 0xffffffffffffffff;
  *(undefined4 *)(&UNK_00004d00 + param_1) = 0x7f7fffff;
  *(undefined8 *)(&UNK_00004cf8 + param_1) = 0x7f7fffff7f7fffff;
  (&UNK_00004b7c)[param_1] = 1;
  if (*(char *)(unaff_x25 + 600) == '\0') {
LAB_000c72b0:
    if (unaff_x22 != (long *)0x0) {
      uVar21 = (ulong)*(uint *)(unaff_x25 + 0x200);
      goto LAB_000c72b8;
    }
    fVar53 = 0.0;
    uVar40 = 0;
    uVar42 = 0;
    uVar44 = 0;
    uVar46 = 0;
    uVar39 = 0;
    uVar41 = 0;
    uVar43 = 0;
    uVar45 = 0;
    fVar28 = 0.0;
  }
  else {
    if (*(int *)(unaff_x25 + 0x1b8) == 0) {
      if ((*(byte *)(unaff_x24 + 0x518) >> 3 & 1) == 0) {
        *(undefined2 *)(unaff_x25 + 0x215) = 0x101;
        *(undefined4 *)(unaff_x25 + 0x220) = 0;
        *(undefined1 *)(unaff_x25 + 0x212) = 0;
      }
      else {
        func_0x000bae48("[nav] NavInitRequest: from move, window \"%s\", layer=%d\n");
        *(undefined2 *)(unaff_x25 + 0x215) = 0x101;
        *(undefined4 *)(unaff_x25 + 0x220) = 0;
        *(undefined1 *)(unaff_x25 + 0x212) = 0;
        if (*(char *)(unaff_x25 + 600) == '\0') goto LAB_000c72b0;
      }
    }
    if (((*(int *)(unaff_x25 + 0x1fc) != 3) || (*(int *)(unaff_x25 + 0x200) != 0)) ||
       (unaff_x22 == (long *)0x0)) goto LAB_000c72b0;
    uVar29 = *(undefined4 *)(unaff_x25 + 0x25c);
    fVar28 = (float)func_0x000d2840();
    uVar21 = CONCAT44(uVar29,uVar29) & _UNK_0080c1b8;
    iVar56 = -(uint)((int)uVar21 == 0);
    iVar59 = -(uint)((int)(uVar21 >> 0x20) == 0);
    uVar58 = CONCAT44(iVar59,iVar56);
    if ((((byte)iVar56 | (byte)iVar59) & 1) == 0) {
LAB_000c7270:
      uVar21 = 0;
    }
    else {
      uVar15 = NEON_fmov(0xbf800000,4);
      uVar10 = NEON_fmov(0x3f800000,4);
      fVar54 = (float)unaff_x22[0x24];
      fVar57 = (float)((ulong)unaff_x22[0x24] >> 0x20);
      fVar28 = fVar28 - (float)*(undefined8 *)((long)unaff_x22 + 0x8c);
      fVar37 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) -
               (float)((ulong)*(undefined8 *)((long)unaff_x22 + 0x8c) >> 0x20);
      fVar53 = (((float)unaff_x22[0x41] + (float)uVar15) - fVar54) + fVar28;
      fVar55 = (((float)((ulong)unaff_x22[0x41] >> 0x20) + (float)((ulong)uVar15 >> 0x20)) - fVar57)
               + fVar37;
      fVar28 = (((float)unaff_x22[0x42] + (float)uVar10) - fVar54) + fVar28;
      fVar37 = (((float)((ulong)unaff_x22[0x42] >> 0x20) + (float)((ulong)uVar10 >> 0x20)) - fVar57)
               + fVar37;
      if (((fVar53 <= *(float *)(unaff_x22 + 0x78)) &&
          (fVar55 <= *(float *)((long)unaff_x22 + 0x3c4))) &&
         ((*(float *)(unaff_x22 + 0x79) <= fVar28 && (*(float *)((long)unaff_x22 + 0x3cc) <= fVar37)
          ))) goto LAB_000c7270;
      if ((*(byte *)(unaff_x24 + 0x518) >> 3 & 1) != 0) {
        func_0x000bae48("[nav] NavMoveRequest: clamp NavRectRel for gamepad move\n");
      }
      fVar54 = *(float *)(&UNK_00003d3c + *unaff_x22) * *(float *)(unaff_x22 + 0x54);
      uVar39 = SUB41(fVar54,0);
      uVar41 = (undefined1)((uint)fVar54 >> 8);
      uVar43 = (undefined1)((uint)fVar54 >> 0x10);
      uVar45 = (undefined1)((uint)fVar54 >> 0x18);
      if (unaff_x22[0x6f] != 0) {
        fVar54 = fVar54 * *(float *)(unaff_x22[0x6f] + 0x2a0);
        uVar39 = SUB41(fVar54,0);
        uVar41 = (undefined1)((uint)fVar54 >> 8);
        uVar43 = (undefined1)((uint)fVar54 >> 0x10);
        uVar45 = (undefined1)((uint)fVar54 >> 0x18);
      }
      fVar54 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) * 0.5;
      uVar21 = (ulong)*(uint *)(unaff_x25 + 0x200);
      uVar31 = CONCAT44(fVar37 - fVar55,fVar28 - fVar53);
      iVar56 = -(uint)(fVar37 - fVar55 < fVar54);
      uVar31 = uVar31 ^ (uVar31 ^ CONCAT17((char)((uint)fVar54 >> 0x18),
                                           CONCAT16((char)((uint)fVar54 >> 0x10),
                                                    CONCAT15((char)((uint)fVar54 >> 8),
                                                             CONCAT14(SUB41(fVar54,0),fVar54))))) &
                        ~CONCAT17((char)((uint)iVar56 >> 0x18),
                                  CONCAT16((char)((uint)iVar56 >> 0x10),
                                           CONCAT15((char)((uint)iVar56 >> 8),
                                                    CONCAT14((char)iVar56,
                                                             -(uint)(fVar28 - fVar53 < fVar54)))));
      fVar54 = (float)uVar31;
      fVar53 = fVar53 + fVar54;
      fVar57 = (float)(uVar31 >> 0x20);
      fVar55 = fVar55 + fVar57;
      uVar39 = (undefined1)((uint)fVar55 >> 8);
      uVar41 = (undefined1)((uint)fVar55 >> 0x10);
      uVar43 = (undefined1)((uint)fVar55 >> 0x18);
      uVar31 = CONCAT17(uVar43,CONCAT16(uVar41,CONCAT15(uVar39,CONCAT14(SUB41(fVar55,0),fVar53)))) ^
               (CONCAT17(uVar43,CONCAT16(uVar41,CONCAT15(uVar39,CONCAT14(SUB41(fVar55,0),fVar53))))
               ^ 0xff7fffffff7fffff) & ~uVar58;
      fVar47 = (float)uVar31;
      fVar48 = (float)(uVar31 >> 0x20);
      uVar32 = CONCAT44(fVar37 - fVar57,fVar28 - fVar54);
      auVar33._0_8_ = uVar32 ^ (uVar32 ^ 0x7f7fffff7f7fffff) & ~uVar58;
      auVar33._8_8_ = auVar33._0_8_;
      fVar37 = (float)unaff_x22[uVar21 * 2 + 0x79];
      fVar54 = (float)((ulong)unaff_x22[uVar21 * 2 + 0x79] >> 0x20);
      uVar15 = *(undefined8 *)*(undefined1 (*) [12])(unaff_x22 + uVar21 * 2 + 0x78);
      fVar28 = (float)uVar15;
      fVar53 = (float)((ulong)uVar15 >> 0x20);
      fVar55 = (float)(auVar33._0_8_ >> 0x20);
      auVar6._12_4_ = fVar54;
      auVar6._0_12_ = *(undefined1 (*) [12])(unaff_x22 + uVar21 * 2 + 0x78);
      auVar9._4_4_ = -(uint)(fVar55 < fVar53);
      auVar9._0_4_ = -(uint)((float)auVar33._0_8_ < fVar28);
      auVar9._8_4_ = -(uint)((float)auVar33._0_8_ < fVar37);
      auVar9._12_4_ = -(uint)(fVar55 < fVar54);
      auVar33 = auVar33 ^ (auVar33 ^ auVar6) & ~auVar9;
      auVar36._8_4_ = fVar47;
      auVar36._0_8_ = uVar31;
      auVar36._12_4_ = fVar48;
      auVar8._4_4_ = -(uint)(fVar53 < fVar48);
      auVar8._0_4_ = -(uint)(fVar28 < fVar47);
      auVar8._8_4_ = -(uint)(fVar37 < fVar47);
      auVar8._12_4_ = -(uint)(fVar54 < fVar48);
      auVar33 = auVar33 ^ (auVar33 ^ auVar36) & auVar8;
      unaff_x22[uVar21 * 2 + 0x79] = auVar33._8_8_;
      unaff_x22[uVar21 * 2 + 0x78] = auVar33._0_8_;
      *(undefined4 *)(unaff_x25 + 0x1b8) = 0;
    }
LAB_000c72b8:
    fVar55 = *(float *)(unaff_x22 + uVar21 * 2 + 0x79);
    fVar28 = 0.0;
    if (*(float *)(unaff_x22 + uVar21 * 2 + 0x78) <= fVar55) {
      fVar54 = *(float *)((long)unaff_x22 + uVar21 * 0x10 + 0x3c4);
      fVar57 = *(float *)((long)unaff_x22 + uVar21 * 0x10 + 0x3cc);
      uVar39 = 0;
      uVar41 = 0;
      uVar43 = 0;
      uVar45 = 0;
      fVar37 = 0.0;
      fVar53 = 0.0;
      if (fVar54 <= fVar57) {
        uVar39 = SUB41(fVar55,0);
        uVar41 = (undefined1)((uint)fVar55 >> 8);
        uVar43 = (undefined1)((uint)fVar55 >> 0x10);
        uVar45 = (undefined1)((uint)fVar55 >> 0x18);
        fVar37 = fVar54;
        fVar53 = *(float *)(unaff_x22 + uVar21 * 2 + 0x78);
        fVar28 = fVar57;
      }
    }
    else {
      uVar39 = 0;
      uVar41 = 0;
      uVar43 = 0;
      uVar45 = 0;
      fVar37 = 0.0;
      fVar53 = 0.0;
    }
    fVar53 = fVar53 + *(float *)(unaff_x22 + 0x24);
    fVar55 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) +
             *(float *)(unaff_x22 + 0x24);
    uVar39 = SUB41(fVar55,0);
    uVar41 = (undefined1)((uint)fVar55 >> 8);
    uVar43 = (undefined1)((uint)fVar55 >> 0x10);
    uVar45 = (undefined1)((uint)fVar55 >> 0x18);
    fVar37 = unaff_s8 + fVar37 + *(float *)((long)unaff_x22 + 0x124);
    uVar40 = SUB41(fVar37,0);
    uVar42 = (undefined1)((uint)fVar37 >> 8);
    uVar44 = (undefined1)((uint)fVar37 >> 0x10);
    uVar46 = (undefined1)((uint)fVar37 >> 0x18);
    fVar28 = unaff_s8 + fVar28 + *(float *)((long)unaff_x22 + 0x124);
    if (*(char *)(unaff_x25 + 600) != '\0') {
      lVar22 = unaff_x22[0x74];
      pfVar1 = (float *)(lVar22 + uVar21 * 8 + 0x3e0);
      uVar20 = *(uint *)(unaff_x25 + 0x268);
      fVar57 = *(float *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x120);
      fVar54 = *(float *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x124);
      if (-1 < *(char *)(unaff_x25 + 0x25c)) {
        if (*pfVar1 == 3.4028235e+38) {
          fVar47 = fVar53 + 1.0;
          if (fVar55 <= fVar53 + 1.0) {
            fVar47 = fVar55;
          }
          *pfVar1 = fVar47 - fVar57;
        }
        lVar16 = lVar22 + uVar21 * 8;
        if (*(float *)(lVar16 + 0x3e4) == 3.4028235e+38) {
          *(float *)(lVar16 + 0x3e4) = (fVar37 + fVar28) * 0.5 - fVar54;
        }
      }
      if ((uVar20 & 0xfffffffe) == 2) {
        if (*pfVar1 != 3.4028235e+38) {
          fVar53 = fVar57 + *pfVar1;
          uVar39 = SUB41(fVar53,0);
          uVar41 = (undefined1)((uint)fVar53 >> 8);
          uVar43 = (undefined1)((uint)fVar53 >> 0x10);
          uVar45 = (undefined1)((uint)fVar53 >> 0x18);
        }
      }
      else if ((uVar20 < 2) &&
              (fVar55 = *(float *)(lVar22 + uVar21 * 8 + 0x3e4), fVar55 != 3.4028235e+38)) {
        fVar28 = fVar54 + fVar55;
        uVar40 = SUB41(fVar28,0);
        uVar42 = (undefined1)((uint)fVar28 >> 8);
        uVar44 = (undefined1)((uint)fVar28 >> 0x10);
        uVar46 = (undefined1)((uint)fVar28 >> 0x18);
      }
    }
  }
  *unaff_x24 = fVar53;
  unaff_x24[1] = (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)));
  unaff_x24[2] = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
  unaff_x24[3] = fVar28;
  if (unaff_x24[4] <= fVar53) {
    if (!(unaff_x24[5] == (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) ||
         unaff_x24[5] < (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)))))
    goto code_r0x000c7470;
code_r0x000c7430:
    if (unaff_x24[6] < (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))))
    goto code_r0x000c743c;
code_r0x000c7480:
    fVar53 = unaff_x24[7];
    uVar39 = SUB41(fVar53,0);
    uVar41 = (undefined1)((uint)fVar53 >> 8);
    uVar43 = (undefined1)((uint)fVar53 >> 0x10);
    uVar45 = (undefined1)((uint)fVar53 >> 0x18);
    if (fVar53 < fVar28) goto code_r0x000c748c;
code_r0x000c744c:
    iVar56 = *(int *)(unaff_x21 + 0xae8);
    lVar22 = lRam0000000000a334c0;
  }
  else {
    unaff_x24[4] = fVar53;
    if (!(unaff_x24[5] != (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) &&
         (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) <= unaff_x24[5]))
    goto code_r0x000c7430;
code_r0x000c7470:
    unaff_x24[5] = (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)));
    if ((float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) <= unaff_x24[6])
    goto code_r0x000c7480;
code_r0x000c743c:
    unaff_x24[6] = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
    fVar53 = unaff_x24[7];
    uVar39 = SUB41(fVar53,0);
    uVar41 = (undefined1)((uint)fVar53 >> 8);
    uVar43 = (undefined1)((uint)fVar53 >> 0x10);
    uVar45 = (undefined1)((uint)fVar53 >> 0x18);
    if (fVar28 <= fVar53) goto code_r0x000c744c;
code_r0x000c748c:
    unaff_x24[7] = fVar28;
    iVar56 = *(int *)(unaff_x21 + 0xae8);
    lVar22 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar22;
  if ((((iVar56 == -1) && (lVar16 = *(long *)(&UNK_00004b18 + lVar22), lVar16 != 0)) &&
      (*(long *)(&UNK_00004d10 + lVar22) == 0)) &&
     (((*(byte *)(lVar16 + 0x16) & 1) == 0 && ((&UNK_00002e64)[lVar22] != '\0')))) {
    fVar28 = *(float *)(&UNK_00002e68 + lVar22);
    if (0.0 <= fVar28) {
      if (fVar28 == 0.0) goto code_r0x000c74dc;
      fVar53 = *(float *)(lVar22 + 0x70);
      uVar39 = SUB41(fVar53,0);
      uVar41 = (undefined1)((uint)fVar53 >> 8);
      uVar43 = (undefined1)((uint)fVar53 >> 0x10);
      uVar45 = (undefined1)((uint)fVar53 >> 0x18);
      if ((fVar53 < fVar28) && (fVar55 = fVar28 - *(float *)(lVar22 + 0x18), fVar55 < fVar28)) {
        fVar37 = *(float *)(lVar22 + 0x74);
        if (fVar37 <= 0.0) {
          if ((fVar53 <= fVar28) && (fVar55 < fVar53)) goto code_r0x000c74dc;
        }
        else {
          if (fVar53 <= fVar55) {
            iVar56 = (int)((fVar55 - fVar53) / fVar37);
          }
          else {
            iVar56 = -1;
          }
          if (fVar53 <= fVar28) {
            iVar59 = (int)((fVar28 - fVar53) / fVar37);
          }
          else {
            iVar59 = -1;
          }
          if (iVar56 < iVar59) {
code_r0x000c74dc:
            if (((((&UNK_0000496c)[lVar22] == '\0') || (*(int *)(&UNK_00004064 + lVar22) == -1)) &&
                (*(int *)(&UNK_000040d4 + lVar22) == -1)) &&
               ((*(char *)(lVar22 + 0xe5c) == '\0' && (*(char *)(lVar22 + 0xe5e) == '\0')))) {
              if ((*(byte *)(lVar22 + 8) & 1) == 0) {
                if (*(char *)(lVar22 + 0xe5d) != '\0') goto code_r0x000c7704;
code_r0x000c77b8:
                uVar20 = (uint)(*(int *)(&UNK_00004064 + lVar22) != 0);
                uVar15 = 3;
              }
              else if (*(char *)(lVar22 + 0xe5d) == '\0') {
                if ((&UNK_00004b7a)[lVar22] != '\0') goto code_r0x000c77b8;
                uVar15 = 3;
                uVar20 = 1;
              }
              else {
code_r0x000c7704:
                uVar15 = 2;
                uVar20 = 0xffffffff;
              }
              *(uint *)(&UNK_00004c00 + lVar22) = uVar20;
              uVar29 = 3;
              if (*(char *)(lVar16 + 0xc4) != '\0') {
                uVar29 = 0x21;
              }
              func_0x000d45ac(0xffffffff,uVar15,&UNK_00001400,uVar29);
              *(undefined4 *)(&UNK_00004c04 + lVar22) = 0xffffffff;
              unaff_x20 = in_stack_00000058;
            }
          }
        }
      }
    }
  }
  lVar22 = lRam0000000000a334c0;
  pcVar27 = &UNK_000046e8 + lRam0000000000a334c0;
  pcVar2 = &UNK_00003674 + lRam0000000000a334c0;
  if ((&UNK_00004bc1)[lRam0000000000a334c0] == '\0') {
    (&UNK_00004b7c)[lRam0000000000a334c0] = (&UNK_00004b7d)[lRam0000000000a334c0] != '\0';
    *(undefined1 *)(unaff_x21 + 0xa90) = 0;
    plVar17 = *(long **)(&UNK_00004b18 + in_stack_00000078);
    if (plVar17 != (long *)0x0) goto code_r0x000c7854;
code_r0x000c78f8:
    if ((unaff_x28 & 1) != 0) goto code_r0x000c78fc;
    *(undefined2 *)(unaff_x21 + 0xa92) = 1;
  }
  else {
    (&UNK_00004b7c)[lRam0000000000a334c0] = 1;
    *(undefined1 *)(unaff_x21 + 0xa90) = 0;
    plVar17 = *(long **)(&UNK_00004b18 + in_stack_00000078);
    if (plVar17 == (long *)0x0) goto code_r0x000c78f8;
code_r0x000c7854:
    if (((*(byte *)((long)plVar17 + 0x16) & 1) != 0) ||
       (*(long *)(&UNK_00004d10 + in_stack_00000078) != 0)) goto code_r0x000c78f8;
    fVar28 = *(float *)(&UNK_00003d3c + *plVar17) * *(float *)(plVar17 + 0x54);
    if (plVar17[0x6f] != 0) {
      fVar28 = fVar28 * *(float *)(plVar17[0x6f] + 0x2a0);
    }
    fVar53 = *(float *)(in_stack_00000078 + 0x18);
    uVar39 = SUB41(fVar53,0);
    uVar41 = (undefined1)((uint)fVar53 >> 8);
    uVar43 = (undefined1)((uint)fVar53 >> 0x10);
    uVar45 = (undefined1)((uint)fVar53 >> 0x18);
    fVar28 = (float)(int)(fVar53 * fVar28 * 100.0 + 0.5);
    if (((*(short *)((long)plVar17 + 0x16c) == 0) && (*(char *)((long)plVar17 + 0x172) != '\0')) &&
       (uVar20 = *(uint *)(unaff_x21 + 0xae8), uVar20 != 0xffffffff)) {
      if (uVar20 < 2) {
        uVar39 = 0xbf;
        if (uVar20 != 0) {
          uVar39 = 0x3f;
        }
        fVar53 = (float)(int)(*(float *)((long)plVar17 + 0x8c) +
                             fVar28 * (float)CONCAT13(uVar39,0x800000));
        uVar39 = SUB41(fVar53,0);
        uVar41 = (undefined1)((uint)fVar53 >> 8);
        uVar43 = (undefined1)((uint)fVar53 >> 0x10);
        uVar45 = (undefined1)((uint)fVar53 >> 0x18);
        *(float *)((long)plVar17 + 0x9c) = fVar53;
        *(undefined4 *)((long)plVar17 + 0xa4) = 0;
        *(undefined4 *)((long)plVar17 + 0xac) = 0;
      }
      if ((uVar20 & 0xfffffffe) == 2) {
        uVar39 = 0xbf;
        if (uVar20 != 2) {
          uVar39 = 0x3f;
        }
        fVar53 = (float)(int)(*(float *)(plVar17 + 0x12) + fVar28 * (float)CONCAT13(uVar39,0x800000)
                             );
        uVar39 = SUB41(fVar53,0);
        uVar41 = (undefined1)((uint)fVar53 >> 8);
        uVar43 = (undefined1)((uint)fVar53 >> 0x10);
        uVar45 = (undefined1)((uint)fVar53 >> 0x18);
        *(float *)(plVar17 + 0x14) = fVar53;
        *(undefined4 *)(plVar17 + 0x15) = 0;
        *(undefined4 *)(plVar17 + 0x16) = 0;
      }
    }
    if (*(int *)(unaff_x29 + -0x7c) == 0) goto code_r0x000c78f8;
    fVar55 = *(float *)(&UNK_00003710 + lVar22);
    fVar53 = *(float *)(&UNK_000036f0 + lVar22) - *(float *)(&UNK_000036e0 + lVar22);
    uVar39 = SUB41(fVar53,0);
    uVar41 = (undefined1)((uint)fVar53 >> 8);
    uVar43 = (undefined1)((uint)fVar53 >> 0x10);
    uVar45 = (undefined1)((uint)fVar53 >> 0x18);
    fVar37 = *(float *)(&UNK_00003700 + lVar22);
    if ((*pcVar2 == '\0') || (*pcVar27 != '\0')) {
      if ((&UNK_00003684)[lVar22] == '\0') {
        uVar40 = 0;
        uVar42 = 0;
        uVar44 = 0x80;
        uVar46 = 0x3f;
      }
      else {
        uVar44 = 0x20;
        uVar46 = 0x41;
        if ((&UNK_000046f4)[lVar22] != '\0') {
          uVar44 = 0x80;
          uVar46 = 0x3f;
        }
        uVar42 = 0;
        uVar40 = 0;
      }
    }
    else {
      uVar40 = 0xcd;
      uVar42 = 0xcc;
      uVar44 = 0xcc;
      uVar46 = 0x3d;
    }
    if ((fVar53 != 0.0) && (*(char *)((long)plVar17 + 0xbc) != '\0')) {
      fVar53 = (float)(int)(*(float *)((long)plVar17 + 0x8c) +
                           (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) *
                           fVar53 * fVar28);
      uVar39 = SUB41(fVar53,0);
      uVar41 = (undefined1)((uint)fVar53 >> 8);
      uVar43 = (undefined1)((uint)fVar53 >> 0x10);
      uVar45 = (undefined1)((uint)fVar53 >> 0x18);
      *(float *)((long)plVar17 + 0x9c) = fVar53;
      *(undefined4 *)((long)plVar17 + 0xa4) = 0;
      *(undefined4 *)((long)plVar17 + 0xac) = 0;
    }
    if (fVar55 - fVar37 != 0.0) {
      fVar53 = *(float *)(plVar17 + 0x12);
      uVar39 = SUB41(fVar53,0);
      uVar41 = (undefined1)((uint)fVar53 >> 8);
      uVar43 = (undefined1)((uint)fVar53 >> 0x10);
      uVar45 = (undefined1)((uint)fVar53 >> 0x18);
      *(float *)(plVar17 + 0x14) =
           (float)(int)(fVar53 + (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) *
                                 (fVar55 - fVar37) * fVar28);
      *(undefined4 *)(plVar17 + 0x15) = 0;
      *(undefined4 *)(plVar17 + 0x16) = 0;
    }
code_r0x000c78fc:
    if (((in_stack_00000070 != 0) && ((*(byte *)(in_stack_00000078 + 8) >> 2 & 1) != 0)) &&
       ((*(byte *)(in_stack_00000078 + 0xc) >> 2 & 1) != 0)) {
      uVar29 = func_0x000d96e8();
      *(undefined4 *)(&UNK_00003808 + lVar22) = uVar29;
      *(uint *)(&UNK_0000380c + lVar22) = CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
      *(undefined4 *)(lVar22 + 0xe40) = uVar29;
      *(uint *)(lVar22 + 0xe44) = CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
      *(undefined1 *)(lVar22 + 0xcd) = 1;
    }
  }
  *(undefined4 *)(unaff_x21 + 0xb14) = 0;
  bVar14 = false;
  if (*(char *)(lVar22 + 0xe5d) != '\0') {
    bVar14 = *(char *)(lVar22 + 0x59) == '\0';
  }
  (&UNK_0000388d)[lVar22] = bVar14;
  auVar34._0_8_ = *(ulong *)(lVar22 + 0xe40);
  auVar34._8_8_ = 0;
  fVar53 = (float)(auVar34._0_8_ >> 0x20);
  uVar39 = (undefined1)(auVar34._0_8_ >> 0x20);
  uVar41 = (undefined1)(auVar34._0_8_ >> 0x28);
  uVar43 = (undefined1)(auVar34._0_8_ >> 0x30);
  uVar45 = (undefined1)(auVar34._0_8_ >> 0x38);
  fVar28 = (float)auVar34._0_8_;
  if ((-256000.0 <= fVar28) && (-256000.0 <= fVar53)) {
    iVar56 = -(uint)(0.0 <= fVar28);
    iVar59 = -(uint)(0.0 <= fVar53);
    iVar23 = (int)fVar53;
    uVar15 = NEON_scvtf(CONCAT17((char)((uint)iVar23 >> 0x18),
                                 CONCAT16((char)((uint)iVar23 >> 0x10),
                                          CONCAT15((char)((uint)iVar23 >> 8),
                                                   CONCAT14((char)iVar23,(int)fVar28)))),4);
    iVar30 = -(uint)(fVar28 == (float)uVar15);
    iVar38 = -(uint)(fVar53 == (float)((ulong)uVar15 >> 0x20));
    iVar56 = CONCAT13(~(byte)((uint)iVar56 >> 0x18) & ~(byte)((uint)iVar30 >> 0x18),
                      CONCAT12(~(byte)((uint)iVar56 >> 0x10) & ~(byte)((uint)iVar30 >> 0x10),
                               CONCAT11(~(byte)((uint)iVar56 >> 8) & ~(byte)((uint)iVar30 >> 8),
                                        ~(byte)iVar56 & ~(byte)iVar30)));
    auVar34._0_8_ =
         NEON_scvtf(CONCAT44((int)(CONCAT17(~(byte)((uint)iVar59 >> 0x18) &
                                            ~(byte)((uint)iVar38 >> 0x18),
                                            CONCAT16(~(byte)((uint)iVar59 >> 0x10) &
                                                     ~(byte)((uint)iVar38 >> 0x10),
                                                     CONCAT15(~(byte)((uint)iVar59 >> 8) &
                                                              ~(byte)((uint)iVar38 >> 8),
                                                              CONCAT14(~(byte)iVar59 & ~(byte)iVar38
                                                                       ,iVar56)))) >> 0x20) + iVar23
                             ,iVar56 + (int)fVar28),4);
    auVar34._8_8_ = 0;
    *(ulong *)(&UNK_00004ef0 + lVar22) = auVar34._0_8_;
    *(ulong *)(lVar22 + 0xe40) = auVar34._0_8_;
    uVar39 = (undefined1)(auVar34._0_8_ >> 0x20);
    uVar41 = (undefined1)(auVar34._0_8_ >> 0x28);
    uVar43 = (undefined1)(auVar34._0_8_ >> 0x30);
    uVar45 = (undefined1)(auVar34._0_8_ >> 0x38);
  }
  if (((auVar34._0_4_ < -256000.0) ||
      (bVar14 = NAN((float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)))),
      (!bVar14 && (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) < -256000.0) !=
      bVar14)) ||
     ((*(float *)(&UNK_00003808 + lVar22) < -256000.0 ||
      (*(float *)(&UNK_0000380c + lVar22) < -256000.0)))) {
    *(undefined8 *)(lVar22 + 0xe8) = 0;
    uVar40 = 0;
    uVar42 = 0;
    uVar44 = 0;
    uVar46 = 0;
    fVar28 = 0.0;
  }
  else {
    fVar28 = auVar34._0_4_ - *(float *)(&UNK_00003808 + lVar22);
    fVar53 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) -
             *(float *)(&UNK_0000380c + lVar22);
    uVar40 = SUB41(fVar53,0);
    uVar42 = (undefined1)((uint)fVar53 >> 8);
    uVar44 = (undefined1)((uint)fVar53 >> 0x10);
    uVar46 = (undefined1)((uint)fVar53 >> 0x18);
    *(float *)(lVar22 + 0xe8) = fVar28;
    *(float *)(lVar22 + 0xec) = fVar53;
  }
  fVar53 = 4.0;
  if (*(int *)(lVar22 + 0xe58) != 0) {
    fVar53 = 9.0;
  }
  fVar55 = 0.0;
  if ((float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) *
      (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) + fVar28 * fVar28 <= fVar53)
  {
    fVar55 = *(float *)(&UNK_00004eec + lVar22) + *(float *)(lVar22 + 0x18);
  }
  *(float *)(&UNK_00004eec + lVar22) = fVar55;
  if ((fVar28 != 0.0) ||
     (NAN((float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)))) ||
      (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) != 0.0)) {
    (&UNK_00004b7b)[lVar22] = 0;
  }
  lVar18 = 0;
  lVar16 = 0;
  lVar24 = -0x28;
  puVar26 = &UNK_000038b8;
  do {
    if (*(char *)(lVar22 + lVar16 + 0xe48) == '\0') {
      pcVar27 = &UNK_00003865 + lVar16 + lVar22 + -5;
      *pcVar27 = '\0';
      *(undefined2 *)(&UNK_00003865 + lVar18 + lVar22 + 5) = 0;
      fVar28 = *(float *)(puVar26 + lVar22 + -0x28);
      (&UNK_00003865)[lVar16 + lVar22 + 0x19] = 0.0 <= fVar28;
      *(float *)(puVar26 + lVar22 + -0x14) = fVar28;
      *(undefined4 *)(puVar26 + lVar22 + -0x28) = 0xbf800000;
      (&UNK_00003865)[lVar16 + lVar22] = 0;
      cVar12 = *pcVar27;
    }
    else {
      fVar28 = *(float *)(puVar26 + lVar22 + -0x28);
      (&UNK_00003865)[lVar16 + lVar22 + -5] = fVar28 < 0.0;
      *(undefined2 *)(&UNK_00003865 + lVar18 + lVar22 + 5) = 0;
      (&UNK_00003865)[lVar16 + lVar22 + 0x19] = 0;
      *(float *)(puVar26 + lVar22 + -0x14) = fVar28;
      fVar53 = auVar34._0_4_;
      if (fVar28 < 0.0) {
        *(undefined4 *)(puVar26 + lVar22 + -0x28) = 0;
        dVar7 = *(double *)(&UNK_00003f50 + lVar22);
        lVar11 = lVar16 * 8 + lVar22;
        if (*(float *)(lVar22 + 100) <= (float)(dVar7 - *(double *)(&UNK_00003865 + lVar11 + -0x2d))
           ) {
code_r0x000c7c20:
          *(undefined2 *)(&UNK_00003865 + lVar18 + lVar22 + 0xf) = 1;
        }
        else {
          fVar28 = 0.0;
          if (fVar53 < -256000.0) {
            if (*(float *)(lVar22 + 0x68) * *(float *)(lVar22 + 0x68) <= 0.0) goto code_r0x000c7c20;
          }
          else {
            bVar14 = NAN((float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))));
            fVar55 = 0.0;
            if ((!bVar14 &&
                (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) < -256000.0) ==
                bVar14) {
              fVar28 = fVar53 - *(float *)(&UNK_00003865 + lVar24 + lVar22 + -0x2d);
              fVar55 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) -
                       *(float *)(&UNK_00003865 + lVar18 * 4 + lVar22 + -0x51);
            }
            if (*(float *)(lVar22 + 0x68) * *(float *)(lVar22 + 0x68) <=
                fVar55 * fVar55 + fVar28 * fVar28) goto code_r0x000c7c20;
          }
          *(short *)(&UNK_00003865 + lVar18 + lVar22 + 0xf) =
               *(short *)(&UNK_00003865 + lVar18 + lVar22 + 0xf) + 1;
        }
        *(double *)(&UNK_00003865 + lVar11 + -0x2d) = dVar7;
        uVar21 = *(ulong *)(lVar22 + 0xe40);
        *(ulong *)(&UNK_00003865 + lVar24 + lVar22 + -0x2d) = uVar21;
        sVar5 = *(short *)(&UNK_00003865 + lVar18 + lVar22 + 0xf);
        *(short *)(&UNK_00003865 + lVar18 + lVar22 + 5) = sVar5;
        *(undefined4 *)(puVar26 + lVar22) = 0;
        auVar34._0_8_ = uVar21 & 0xffffffff;
        auVar34._8_8_ = 0;
        uVar39 = (undefined1)(uVar21 >> 0x20);
        uVar41 = (undefined1)(uVar21 >> 0x28);
        uVar43 = (undefined1)(uVar21 >> 0x30);
        uVar45 = (undefined1)(uVar21 >> 0x38);
        (&UNK_00003865)[lVar16 + lVar22] = sVar5 == 2;
        cVar12 = (&UNK_00003860)[lVar22 + lVar16];
      }
      else {
        *(float *)(puVar26 + lVar22 + -0x28) = fVar28 + *(float *)(lVar22 + 0x18);
        uVar40 = 0;
        uVar42 = 0;
        uVar44 = 0;
        uVar46 = 0;
        bVar14 = true;
        bVar13 = false;
        if (-256000.0 <= fVar53) {
          bVar14 = false;
          bVar13 = true;
          if (!NAN((float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))))) {
            bVar14 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) < -256000.0;
            bVar13 = false;
          }
        }
        if (bVar14 == bVar13) {
          fVar53 = fVar53 - *(float *)(&UNK_00003865 + lVar24 + lVar22 + -0x2d);
          fVar28 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) -
                   *(float *)(&UNK_00003865 + lVar18 * 4 + lVar22 + -0x51);
          fVar28 = fVar28 * fVar28 + fVar53 * fVar53;
          uVar40 = SUB41(fVar28,0);
          uVar42 = (undefined1)((uint)fVar28 >> 8);
          uVar44 = (undefined1)((uint)fVar28 >> 0x10);
          uVar46 = (undefined1)((uint)fVar28 >> 0x18);
        }
        fVar28 = *(float *)(puVar26 + lVar22);
        uVar49 = SUB41(fVar28,0);
        uVar50 = (char)((uint)fVar28 >> 8);
        uVar51 = (char)((uint)fVar28 >> 0x10);
        uVar52 = (char)((uint)fVar28 >> 0x18);
        if (fVar28 < (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)))) {
          uVar49 = uVar40;
          uVar50 = uVar42;
          uVar51 = uVar44;
          uVar52 = uVar46;
        }
        *(uint *)(puVar26 + lVar22) = CONCAT13(uVar52,CONCAT12(uVar51,CONCAT11(uVar50,uVar49)));
        (&UNK_00003865)[lVar16 + lVar22] = 0;
        cVar12 = (&UNK_00003860)[lVar22 + lVar16];
      }
    }
    if (cVar12 != '\0') {
      (&UNK_00004b7b)[lVar22] = 0;
    }
    lVar16 = lVar16 + 1;
    lVar18 = lVar18 + 2;
    lVar24 = lVar24 + 8;
    puVar26 = puVar26 + 4;
  } while (lVar16 != 5);
  func_0x000c3cec();
  func_0x000c3560();
  lVar22 = lRam0000000000a334c0;
  pfVar1 = (float *)(&UNK_00004028 + lRam0000000000a334c0);
  if (0 < (int)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0)) {
    uVar21 = (ulong)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) + 1;
    do {
      lVar16 = *(long *)(*(long *)(&UNK_00004ad8 + lRam0000000000a334c0) +
                         (ulong)((int)uVar21 - 2) * 0x38 + 8);
      if ((lVar16 != 0) && ((*(byte *)(lVar16 + 0x17) >> 3 & 1) != 0)) goto code_r0x000c7ce8;
      uVar21 = uVar21 - 1;
    } while (1 < uVar21);
  }
  if ((*(long *)(&UNK_00004d10 + unaff_x26) == 0) || ((float)unaff_x20[0x9f] <= 0.0)) {
    fVar28 = (float)unaff_x20[0xa6] + *(float *)(unaff_x26 + 0x18) * -10.0;
    if (fVar28 < 0.0) {
      fVar28 = 0.0;
    }
  }
  else {
code_r0x000c7ce8:
    fVar28 = (float)NEON_fminnm((float)unaff_x20[0xa6] + *(float *)(unaff_x26 + 0x18) * 6.0,
                                0x3f800000);
  }
  unaff_x20[0xa6] = (int)fVar28;
  in_stack_00000048[0x30] = 0;
  *(undefined4 *)(unaff_x27 + 0x350) = 0xffffffff;
  *(undefined8 *)(&UNK_00006208 + unaff_x26) = 0xffffffffffffffff;
  uVar15 = *(undefined8 *)(unaff_x27 + 0x78);
  *(undefined8 *)(&UNK_00005f50 + unaff_x26) = *(undefined8 *)(unaff_x27 + 0x80);
  *(undefined8 *)(&UNK_00005f48 + unaff_x26) = uVar15;
  *(undefined1 *)(unaff_x27 + 0x78) = 0;
  plVar17 = *(long **)(&UNK_00004020 + lVar22);
  lVar16 = lVar22;
  if (plVar17 != (long *)0x0) {
    fVar28 = *(float *)(&UNK_00004038 + lVar22) - *(float *)(lVar22 + 0x18);
    *(float *)(&UNK_00004038 + lVar22) = fVar28;
    if ((((-256000.0 <= *(float *)(lVar22 + 0xe40)) && (-256000.0 <= *(float *)(lVar22 + 0xe44))) &&
        (fVar53 = *(float *)(lVar22 + 0xe40) - *pfVar1,
        fVar55 = *(float *)(lVar22 + 0xe44) - *(float *)(&UNK_0000402c + lVar22),
        *(float *)(lVar22 + 0x6c) * *(float *)(lVar22 + 0x6c) < fVar55 * fVar55 + fVar53 * fVar53))
       || (fVar28 <= 0.0)) {
      *(undefined4 *)(&UNK_00004038 + lVar22) = 0;
      if (((byte)(&UNK_0000603c)[lVar22] >> 6 & 1) != 0) {
        func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
        lVar16 = lRam0000000000a334c0;
      }
      plVar17 = (long *)0x0;
      *(undefined8 *)(&UNK_00004020 + lVar22) = 0;
      *(undefined8 *)(&UNK_00004028 + lVar22) = *(undefined8 *)(lVar22 + 0xe40);
      *(undefined4 *)(&UNK_00004030 + lVar22) = 0xffffffff;
      *(undefined4 *)(&UNK_00004044 + lVar22) = 0;
      *(undefined4 *)(&UNK_00004048 + lVar22) = 0;
    }
  }
  fVar28 = 0.0;
  uVar39 = 0;
  uVar41 = 0;
  uVar43 = 0;
  uVar45 = 0;
  plVar19 = plVar17;
  if (*(int *)(&UNK_000047c4 + lVar16) == -1) {
    uVar29 = *(undefined4 *)(lVar22 + 0xe54);
    uVar39 = (undefined1)uVar29;
    uVar41 = (undefined1)((uint)uVar29 >> 8);
    uVar43 = (undefined1)((uint)uVar29 >> 0x10);
    uVar45 = (undefined1)((uint)uVar29 >> 0x18);
    if (*(int *)(&UNK_000047d0 + lVar16) == -1) goto code_r0x000c7e4c;
code_r0x000c7e30:
    if (plVar17 != (long *)0x0) goto code_r0x000c7e60;
code_r0x000c7e58:
    plVar19 = *(long **)(&UNK_00004008 + lVar22);
    if (*(long **)(&UNK_00004008 + lVar22) != (long *)0x0) goto code_r0x000c7e60;
  }
  else {
    if (*(int *)(&UNK_000047d0 + lVar16) != -1) goto code_r0x000c7e30;
code_r0x000c7e4c:
    fVar28 = *(float *)(lVar22 + 0xe50);
    if (plVar17 == (long *)0x0) goto code_r0x000c7e58;
code_r0x000c7e60:
    if (*(char *)((long)plVar19 + 0xc1) == '\0') {
      if (fVar28 == 0.0) {
        if (*(char *)(lVar22 + 0xe5c) == '\0') goto code_r0x000c82f8;
      }
      else if (*(char *)(lVar22 + 0xe5c) == '\0') {
code_r0x000c82f8:
        uVar40 = SUB41(fVar28,0);
        uVar42 = (undefined1)((uint)fVar28 >> 8);
        uVar44 = (undefined1)((uint)fVar28 >> 0x10);
        uVar46 = (undefined1)((uint)fVar28 >> 0x18);
        if ((&UNK_0000388d)[lVar22] != '\0') {
          uVar40 = 0;
          uVar42 = 0;
          uVar44 = 0;
          uVar46 = 0;
        }
        fVar53 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
        if ((&UNK_0000388d)[lVar22] != '\0') {
          fVar53 = fVar28;
        }
        fVar55 = (*(float *)(&UNK_00004044 + lVar22) - *(float *)(&UNK_00004044 + lVar22) / 30.0) +
                 ABS(fVar53) / 30.0;
        fVar28 = ABS((float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)))) / 30.0 +
                 (*(float *)(&UNK_00004048 + lVar22) - *(float *)(&UNK_00004048 + lVar22) / 30.0);
        *(float *)(&UNK_00004044 + lVar22) = fVar55;
        *(float *)(&UNK_00004048 + lVar22) = fVar28;
        fVar53 = fVar53 + *(float *)(&UNK_0000403c + lVar22);
        fVar37 = (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) +
                 *(float *)(&UNK_00004040 + lVar22);
        *(undefined4 *)(&UNK_0000403c + lVar22) = 0;
        *(undefined4 *)(&UNK_00004040 + lVar22) = 0;
        lVar16 = lRam0000000000a334c0;
        if ((fVar53 != 0.0) || (fVar37 != 0.0)) {
          if (plVar17 == (long *)0x0) {
            if (fVar53 == 0.0) {
              if (fVar37 == 0.0) goto code_r0x000c7e68;
              plVar17 = (long *)0x0;
              plVar19 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar20 = *(uint *)((long)plVar19 + 0x14);
            }
            else {
              plVar19 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar20 = *(uint *)((long)plVar19 + 0x14);
              plVar17 = plVar19;
              if ((uVar20 >> 0x18 & 1) != 0) {
                uVar25 = uVar20;
                do {
                  if (((uVar25 & 0x210) != 0x10) && (*(float *)((long)plVar17 + 0x94) != 0.0))
                  break;
                  plVar17 = (long *)plVar17[0x6f];
                  uVar25 = *(uint *)((long)plVar17 + 0x14);
                } while ((uVar25 >> 0x18 & 1) != 0);
              }
              if (fVar37 == 0.0) goto code_r0x000c836c;
            }
            uVar25 = uVar20 & 0x1000000;
            while ((uVar25 != 0 &&
                   (((uVar20 & 0x210) == 0x10 || (*(float *)(plVar19 + 0x13) == 0.0))))) {
              plVar19 = (long *)plVar19[0x6f];
              uVar20 = *(uint *)((long)plVar19 + 0x14);
              uVar25 = uVar20 >> 0x18 & 1;
            }
            if ((fVar37 != 0.0 && plVar17 != (long *)0x0) && plVar17 != plVar19) {
              iVar56 = *(int *)(&UNK_00004030 + lRam0000000000a334c0);
              iVar59 = *(int *)(&UNK_00003f58 + lRam0000000000a334c0);
              if (iVar56 == -1) {
                *(int *)(&UNK_00004030 + lRam0000000000a334c0) = iVar59;
                iVar56 = iVar59;
              }
              if ((fVar53 == 0.0) || (iVar56 != iVar59)) {
                if (*(float *)(&UNK_00004044 + lVar16) != *(float *)(&UNK_00004048 + lVar16)) {
                  if (*(float *)(&UNK_00004044 + lVar16) <= *(float *)(&UNK_00004048 + lVar16)) {
                    plVar17 = plVar19;
                  }
                  goto code_r0x000c836c;
                }
              }
              *(float *)(&UNK_0000403c + lVar16) = fVar53;
              *(float *)(&UNK_00004040 + lVar16) = fVar37;
              goto code_r0x000c7e68;
            }
            plVar17 = plVar19;
          }
code_r0x000c836c:
          if ((*(ushort *)((long)plVar17 + 0x14) & 0x210) == 0) {
            if (fVar53 == 0.0) {
              cVar12 = false;
            }
            else {
              cVar12 = *(float *)((long)plVar17 + 0x94) != 0.0;
            }
            *(char *)(unaff_x29 + -0x78) = cVar12;
            if (fVar37 == 0.0) {
              *(undefined1 *)(unaff_x29 + -0x77) = 0;
            }
            else {
              fVar54 = *(float *)(plVar17 + 0x13);
              *(bool *)(unaff_x29 + -0x77) = fVar54 != 0.0;
              if (((bool)cVar12 != false) && (fVar54 != 0.0)) {
                *(undefined1 *)(unaff_x29 + -0x78 + (ulong)(fVar28 < fVar55)) = 0;
                cVar12 = *(char *)(unaff_x29 + -0x78);
              }
            }
            if (cVar12 != '\0') {
              func_0x000eb200(plVar17);
              fVar55 = (*(float *)(plVar17 + 0x42) - *(float *)(plVar17 + 0x41)) * 0.67;
              fVar28 = *(float *)(&UNK_00003d3c + *plVar17) * *(float *)(plVar17 + 0x54);
              uVar39 = SUB41(fVar28,0);
              uVar41 = (undefined1)((uint)fVar28 >> 8);
              uVar43 = (undefined1)((uint)fVar28 >> 0x10);
              uVar45 = (undefined1)((uint)fVar28 >> 0x18);
              if (plVar17[0x6f] != 0) {
                fVar28 = fVar28 * *(float *)(plVar17[0x6f] + 0x2a0);
                uVar39 = SUB41(fVar28,0);
                uVar41 = (undefined1)((uint)fVar28 >> 8);
                uVar43 = (undefined1)((uint)fVar28 >> 0x10);
                uVar45 = (undefined1)((uint)fVar28 >> 0x18);
              }
              fVar28 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) +
                       (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39)));
              if (fVar55 <= fVar28) {
                fVar28 = fVar55;
              }
              *(float *)((long)plVar17 + 0x9c) =
                   *(float *)((long)plVar17 + 0x8c) - (float)(int)fVar28 * fVar53;
              *(undefined4 *)((long)plVar17 + 0xa4) = 0;
              *(undefined4 *)((long)plVar17 + 0xac) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar22) = *(undefined4 *)(&UNK_00003f58 + lVar22);
            }
            if (*(char *)(unaff_x29 + -0x77) != '\0') {
              func_0x000eb200(plVar17);
              fVar53 = (*(float *)((long)plVar17 + 0x214) - *(float *)((long)plVar17 + 0x20c)) *
                       0.67;
              fVar28 = *(float *)(&UNK_00003d3c + *plVar17) * *(float *)(plVar17 + 0x54);
              uVar39 = SUB41(fVar28,0);
              uVar41 = (undefined1)((uint)fVar28 >> 8);
              uVar43 = (undefined1)((uint)fVar28 >> 0x10);
              uVar45 = (undefined1)((uint)fVar28 >> 0x18);
              if (plVar17[0x6f] != 0) {
                fVar28 = fVar28 * *(float *)(plVar17[0x6f] + 0x2a0);
                uVar39 = SUB41(fVar28,0);
                uVar41 = (undefined1)((uint)fVar28 >> 8);
                uVar43 = (undefined1)((uint)fVar28 >> 0x10);
                uVar45 = (undefined1)((uint)fVar28 >> 0x18);
              }
              fVar28 = (float)CONCAT13(uVar45,CONCAT12(uVar43,CONCAT11(uVar41,uVar39))) * 5.0;
              if (fVar53 <= fVar28) {
                fVar28 = fVar53;
              }
              *(float *)(plVar17 + 0x14) = *(float *)(plVar17 + 0x12) - (float)(int)fVar28 * fVar37;
              *(undefined4 *)(plVar17 + 0x15) = 0;
              *(undefined4 *)(plVar17 + 0x16) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar22) = *(undefined4 *)(&UNK_00003f58 + lVar22);
            }
          }
        }
      }
      else if (*(char *)(lVar22 + 0x44) != '\0') {
        fVar28 = (float)NEON_fminnm(*(float *)(&UNK_00004038 + lVar16) + ABS(fVar28) * 0.7,
                                    0x3f333333);
        *(float *)(&UNK_00004038 + lVar16) = fVar28;
        if (*(long **)(&UNK_00004020 + lVar16) != plVar19) {
          if (((byte)(&UNK_0000603c)[lVar16] >> 6 & 1) != 0) {
            func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
          }
          *(long **)(&UNK_00004020 + lVar16) = plVar19;
          *(undefined8 *)(&UNK_00004028 + lVar16) = *(undefined8 *)(lVar16 + 0xe40);
        }
        fVar53 = *(float *)(plVar19 + 0x54);
        fVar28 = fVar53 + *(float *)(lVar22 + 0xe50) * 0.1;
        uVar39 = 0;
        uVar41 = 0;
        uVar43 = 0x20;
        uVar45 = 0x40;
        if (fVar28 <= 2.5) {
          uVar39 = SUB41(fVar28,0);
          uVar41 = (char)((uint)fVar28 >> 8);
          uVar43 = (char)((uint)fVar28 >> 0x10);
          uVar45 = (char)((uint)fVar28 >> 0x18);
        }
        uVar40 = 0;
        uVar42 = 0;
        uVar44 = 0;
        uVar46 = 0x3f;
        if (0.5 <= fVar28) {
          uVar40 = uVar39;
          uVar42 = uVar41;
          uVar44 = uVar43;
          uVar46 = uVar45;
        }
        *(uint *)(plVar19 + 0x54) = CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40)));
        if (plVar19 == (long *)plVar19[0x71]) {
          fVar53 = (float)CONCAT13(uVar46,CONCAT12(uVar44,CONCAT11(uVar42,uVar40))) / fVar53;
          fVar37 = (float)plVar19[5];
          fVar54 = (float)((ulong)plVar19[5] >> 0x20);
          fVar28 = (float)plVar19[6];
          fVar55 = (float)((ulong)plVar19[6] >> 0x20);
          uVar15 = *(undefined8 *)(lVar22 + 0xe40);
          *(uint *)(plVar19 + 0x1d) = *(uint *)(plVar19 + 0x1d) & 0xfffffff1;
          *(undefined8 *)((long)plVar19 + 0xec) = 0x7f7fffff7f7fffff;
          iVar56 = (int)(fVar54 + (fVar55 * (1.0 - fVar53) *
                                  ((float)((ulong)uVar15 >> 0x20) - fVar54)) / fVar55);
          lVar22 = NEON_scvtf(CONCAT17((char)((uint)iVar56 >> 0x18),
                                       CONCAT16((char)((uint)iVar56 >> 0x10),
                                                CONCAT15((char)((uint)iVar56 >> 8),
                                                         CONCAT14((char)iVar56,
                                                                  (int)(fVar37 + (fVar28 * (1.0 - 
                                                  fVar53) * ((float)uVar15 - fVar37)) / fVar28))))),
                              4);
          plVar19[5] = lVar22;
          fVar37 = (float)lVar22 - fVar37;
          fVar54 = (float)((ulong)lVar22 >> 0x20) - fVar54;
          uVar39 = (undefined1)((uint)fVar54 >> 8);
          uVar41 = (undefined1)((uint)fVar54 >> 0x10);
          uVar43 = (undefined1)((uint)fVar54 >> 0x18);
          if ((fVar37 != 0.0) || (fVar54 != 0.0)) {
            if (((*(byte *)((long)plVar19 + 0x15) & 1) == 0) &&
               (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
              *(float *)(&UNK_00005f5c + lRam0000000000a334c0) =
                   *(float *)(lRam0000000000a334c0 + 0x1c);
            }
            plVar19[0x22] =
                 CONCAT44(fVar54 + (float)((ulong)plVar19[0x22] >> 0x20),
                          fVar37 + (float)plVar19[0x22]);
            fVar57 = fVar54 + (float)((ulong)plVar19[0x26] >> 0x20);
            plVar19[0x26] =
                 CONCAT17((char)((uint)fVar57 >> 0x18),
                          CONCAT16((char)((uint)fVar57 >> 0x10),
                                   CONCAT15((char)((uint)fVar57 >> 8),
                                            CONCAT14(SUB41(fVar57,0),fVar37 + (float)plVar19[0x26]))
                                  ));
            fVar57 = (float)(CONCAT17(uVar43,CONCAT16(uVar41,CONCAT15(uVar39,CONCAT14(SUB41(fVar54,0
                                                  ),fVar37)))) >> 0x20) +
                     (float)((ulong)plVar19[0x24] >> 0x20);
            plVar19[0x25] =
                 CONCAT44((float)(CONCAT17(uVar43,CONCAT16(uVar41,CONCAT15(uVar39,CONCAT14(SUB41(
                                                  fVar54,0),fVar37)))) >> 0x20) +
                          (float)((ulong)plVar19[0x25] >> 0x20),fVar37 + (float)plVar19[0x25]);
            plVar19[0x24] =
                 CONCAT17((char)((uint)fVar57 >> 0x18),
                          CONCAT16((char)((uint)fVar57 >> 0x10),
                                   CONCAT15((char)((uint)fVar57 >> 8),
                                            CONCAT14(SUB41(fVar57,0),fVar37 + (float)plVar19[0x24]))
                                  ));
          }
          auVar35._0_4_ = (int)(fVar28 * fVar53);
          auVar35._4_4_ = (int)(fVar55 * fVar53);
          auVar35._8_4_ = (int)((float)plVar19[7] * fVar53);
          auVar35._12_4_ = (int)((float)((ulong)plVar19[7] >> 0x20) * fVar53);
          auVar36 = NEON_scvtf(auVar35,4);
          plVar19[7] = auVar36._8_8_;
          plVar19[6] = auVar36._0_8_;
        }
      }
    }
  }
code_r0x000c7e68:
  if (*(char *)(in_stack_00000050 + 0x20b) == '\0') {
    if (0.0 <= *(float *)(unaff_x26 + 0x60)) {
      fVar28 = (float)*(double *)(&UNK_00003f50 + unaff_x26) - *(float *)(unaff_x26 + 0x60);
      iVar56 = *(int *)(&UNK_00003fa0 + unaff_x26);
    }
    else {
      fVar28 = 3.4028235e+38;
      iVar56 = *(int *)(&UNK_00003fa0 + unaff_x26);
    }
  }
  else {
    fVar28 = 3.4028235e+38;
    iVar56 = *(int *)(&UNK_00003fa0 + unaff_x26);
  }
  if (iVar56 != 0) {
    plVar17 = *(long **)(&UNK_00003fa8 + unaff_x26);
    lVar22 = (long)iVar56 << 3;
    do {
      lVar16 = *plVar17;
      cVar12 = *(char *)(lVar16 + 0xbe);
      *(char *)(lVar16 + 0xbf) = cVar12;
      *(undefined1 *)(lVar16 + 0xbe) = 0;
      *(undefined1 *)(lVar16 + 0xc0) = 0;
      *(undefined2 *)(lVar16 + 0xce) = *(undefined2 *)(lVar16 + 0xcc);
      *(undefined2 *)(lVar16 + 0xcc) = 0;
      if (((cVar12 == '\0') && (*(char *)(lVar16 + 0x3fc) == '\0')) &&
         (*(float *)(lVar16 + 0x274) < fVar28)) {
        func_0x000c1cc8();
      }
      plVar17 = plVar17 + 1;
      lVar22 = lVar22 + -8;
    } while (lVar22 != 0);
  }
  iVar56 = in_stack_00000048[0xe];
  if (0 < iVar56) {
    lVar16 = 0;
    lVar22 = 0;
    do {
      fVar53 = *(float *)(*(long *)(&UNK_00004e68 + unaff_x26) + lVar22 * 4);
      bVar14 = false;
      if ((0.0 <= fVar53) && (bVar14 = false, !NAN(fVar53) && !NAN(fVar28))) {
        bVar14 = fVar53 < fVar28;
      }
      if (bVar14) {
        func_0x00134464(*(long *)(&UNK_00004e40 + unaff_x26) + lVar16);
        iVar56 = in_stack_00000048[0xe];
      }
      lVar22 = lVar22 + 1;
      lVar16 = lVar16 + 0x250;
    } while (lVar22 < iVar56);
  }
  if (*in_stack_00000048 != 0) {
    lVar22 = *(long *)(&UNK_00004e30 + unaff_x26);
    lVar16 = (long)*in_stack_00000048 * 0x78;
    do {
      fVar53 = *(float *)(lVar22 + 4);
      bVar14 = false;
      if ((0.0 <= fVar53) && (bVar14 = false, !NAN(fVar53) && !NAN(fVar28))) {
        bVar14 = fVar53 < fVar28;
      }
      if (bVar14) {
        func_0x00134568(lVar22);
      }
      lVar22 = lVar22 + 0x78;
      lVar16 = lVar16 + -0x78;
    } while (lVar16 != 0);
  }
  if (*(char *)(in_stack_00000050 + 0x20b) != '\0') {
    func_0x000c1b38();
  }
  *(undefined1 *)(in_stack_00000050 + 0x20b) = 0;
  if ((*(long *)(&UNK_00004b18 + unaff_x26) == 0) ||
     (*(char *)(*(long *)(&UNK_00004b18 + unaff_x26) + 0xbf) != '\0')) {
    if (-1 < *(int *)(&UNK_00003fd4 + unaff_x26)) goto code_r0x000c8164;
code_r0x000c8278:
    func_0x000ee530(&UNK_00003fd0 + unaff_x26,0);
    *(undefined4 *)(&UNK_00003fd0 + unaff_x26) = 0;
    if (in_stack_00000058[0xd] < 0) goto code_r0x000c8294;
code_r0x000c8170:
    in_stack_00000058[0xc] = 0;
    iVar56 = in_stack_00000058[1];
    if (-1 < iVar56) goto code_r0x000c817c;
code_r0x000c82ac:
    func_0x000eb9f0(in_stack_00000058,0);
    iVar56 = in_stack_00000058[1];
    *in_stack_00000058 = 0;
  }
  else {
    if (0 < *(int *)(&UNK_00003fb0 + lRam0000000000a334c0)) {
      lVar22 = (ulong)(*(int *)(&UNK_00003fb0 + lRam0000000000a334c0) - 1) << 3;
      do {
        lVar16 = *(long *)(*(long *)(&UNK_00003fb8 + lRam0000000000a334c0) + lVar22);
        if (((lVar16 != 0) && (*(char *)(lVar16 + 0xbf) != '\0')) &&
           (((*(uint *)(lVar16 + 0x14) ^ 0xffffffff) & 0x10200) != 0)) {
          func_0x000c3098(lVar16,1);
          iVar56 = *(int *)(&UNK_00003fd4 + unaff_x26);
          goto joined_r0x000c8274;
        }
        bVar14 = lVar22 != 0;
        lVar22 = lVar22 + -8;
      } while (bVar14);
    }
    func_0x000c3098(0,1);
    iVar56 = *(int *)(&UNK_00003fd4 + unaff_x26);
joined_r0x000c8274:
    if (iVar56 < 0) goto code_r0x000c8278;
code_r0x000c8164:
    *(undefined4 *)(&UNK_00003fd0 + unaff_x26) = 0;
    if (-1 < in_stack_00000058[0xd]) goto code_r0x000c8170;
code_r0x000c8294:
    func_0x000eadcc(in_stack_00000058 + 0xc,0);
    in_stack_00000058[0xc] = 0;
    iVar56 = in_stack_00000058[1];
    if (iVar56 < 0) goto code_r0x000c82ac;
code_r0x000c817c:
    *in_stack_00000058 = 0;
  }
  iVar59 = 0;
  if (iVar56 == 0) {
    func_0x000eb9f0(in_stack_00000058,8);
    iVar59 = *in_stack_00000058;
  }
  *(undefined4 *)(*(long *)(&UNK_00004ab8 + unaff_x26) + (long)iVar59 * 4) = 0;
  *in_stack_00000058 = *in_stack_00000058 + 1;
  if (in_stack_00000058[5] < 0) {
    func_0x000eadcc(in_stack_00000058 + 4,0);
  }
  in_stack_00000058[4] = 0;
  lVar22 = lRam0000000000a334c0;
  pcVar27 = &UNK_00006075 + lRam0000000000a334c0;
  *(undefined4 *)(&UNK_00006078 + lRam0000000000a334c0) = 0;
  if (*pcVar27 != '\0') {
    iVar56 = *(int *)(&UNK_00004054 + lVar22);
    *(undefined4 *)(&UNK_00004ee8 + lVar22) = 7;
    if ((&UNK_00002f44)[lVar22] != '\0') {
      fVar28 = *(float *)(&UNK_00002f48 + lVar22);
      if (0.0 <= fVar28) {
        if (fVar28 == 0.0) goto code_r0x000c820c;
        fVar53 = *(float *)(lVar22 + 0x70);
        if ((fVar53 < fVar28) && (fVar55 = fVar28 - *(float *)(lVar22 + 0x18), fVar55 < fVar28)) {
          fVar37 = *(float *)(lVar22 + 0x74);
          if (fVar37 <= 0.0) {
            if ((fVar53 <= fVar28) && (fVar55 < fVar53)) goto code_r0x000c820c;
          }
          else {
            if (fVar53 <= fVar55) {
              iVar59 = (int)((fVar55 - fVar53) / fVar37);
            }
            else {
              iVar59 = -1;
            }
            if (fVar53 <= fVar28) {
              iVar23 = (int)((fVar28 - fVar53) / fVar37);
            }
            else {
              iVar23 = -1;
            }
            if (iVar59 < iVar23) {
code_r0x000c820c:
              if ((&UNK_00004184)[lVar22] == '\0') {
                *pcVar27 = '\0';
              }
            }
          }
        }
      }
    }
    iVar59 = *(int *)(lVar22 + 0xe60);
    if (iVar59 == 0x3000) {
      if (((*(char *)(lVar22 + 0xe48) != '\0') && (*(float *)(&UNK_00003890 + lVar22) == 0.0)) &&
         ((&UNK_00004790)[lVar22] == '\0')) {
        (&UNK_00006076)[lVar22] = 0;
      }
      if (((*(char *)(lVar22 + 0xe49) != '\0') && (*(float *)(&UNK_00003894 + lVar22) == 0.0)) &&
         ((&UNK_0000479c)[lVar22] == '\0')) {
        (&UNK_00006076)[lVar22] = 1;
      }
      if (((*(char *)(lVar22 + 0xe4a) != '\0') && (*(float *)(&UNK_00003898 + lVar22) == 0.0)) &&
         ((&UNK_000047a8)[lVar22] == '\0')) {
        (&UNK_00006076)[lVar22] = 2;
      }
    }
    else {
      uVar21 = (ulong)(byte)(&UNK_00006076)[lVar22];
      if ((*(char *)(lVar22 + uVar21 + 0xe48) != '\0') &&
         (*(float *)(&UNK_00003890 + lVar22 + uVar21 * 4) == 0.0)) {
        if ((byte)(&UNK_00006076)[lVar22] < 0xb) {
          bVar14 = (&UNK_00004790)[lVar22 + uVar21 * 0xc] == '\0';
        }
        else {
          bVar14 = true;
        }
        if ((bVar14) && (iVar56 != 0)) {
          *(int *)(&UNK_00006078 + lVar22) = iVar56;
          *pcVar27 = '\0';
        }
      }
    }
    *(uint *)(&UNK_000049f8 + lVar22) = *(uint *)(&UNK_000049f8 + lVar22) | 0x40;
    *(undefined4 *)(&UNK_00004a58 + lVar22) = 0x3f333333;
    func_0x000d8e98(0,0);
    func_0x0010adc0("HoveredId: 0x%08X");
    func_0x0010adc0("Press ESC to abort picking.");
    if (iVar59 == 0x3000) {
      func_0x0010adc0("Remap w/ Ctrl+Shift: click anywhere to select new mouse button.");
    }
    else {
      func_0x0010ae94(&UNK_000039cc + lRam0000000000a334c0 + (ulong)(iVar56 == 0) * 0x10,
                      "Click %s Button to break in debugger! (remap w/ Ctrl+Shift)");
    }
    func_0x000cea90();
    lVar22 = lRam0000000000a334c0;
  }
  piVar3 = (int *)(&UNK_0000404c + lVar22);
  *piVar3 = 0;
  if (*(int *)(&UNK_00003f58 + lVar22) != *(int *)(&UNK_000060a8 + lVar22) + 1)
  goto code_r0x000c8960;
  iVar56 = *(int *)(&UNK_00004054 + lVar22);
  if (iVar56 == 0) {
    iVar56 = *(int *)(&UNK_00004064 + lVar22);
    if (*(int *)(&UNK_000060b0 + lVar22) != iVar56) goto code_r0x000c88c8;
  }
  else if (*(int *)(&UNK_000060b0 + lVar22) != iVar56) {
code_r0x000c88c8:
    *(undefined4 *)(&UNK_000060ac + lVar22) = 0xffffffff;
    *(int *)(&UNK_000060b0 + lVar22) = iVar56;
    if (*(int *)(&UNK_000060bc + lVar22) < 0) {
      func_0x000eb834(&UNK_000060b8 + lVar22,0);
    }
    *(undefined4 *)(&UNK_000060b8 + lVar22) = 0;
  }
  if (iVar56 != 0) {
    uVar20 = *(uint *)(&UNK_000060ac + lVar22);
    if ((int)uVar20 < 0) {
      if (uVar20 == 0xffffffff) {
        *piVar3 = iVar56;
      }
    }
    else {
      if (((int)uVar20 < *(int *)(&UNK_000060b8 + lVar22)) &&
         ((lVar16 = *(long *)(&UNK_000060c0 + lVar22) + (ulong)uVar20 * 0x40,
          *(char *)(lVar16 + 5) != '\0' || ('\x02' < *(char *)(lVar16 + 4))))) {
        uVar20 = uVar20 + 1;
        *(uint *)(&UNK_000060ac + lVar22) = uVar20;
      }
      if ((int)uVar20 < *(int *)(&UNK_000060b8 + lVar22)) {
        piVar4 = (int *)(*(long *)(&UNK_000060c0 + lVar22) + (ulong)uVar20 * 0x40);
        *piVar3 = *piVar4;
        *(char *)(piVar4 + 1) = (char)piVar4[1] + '\x01';
      }
    }
  }
code_r0x000c8960:
  lVar22 = lRam0000000000a334c0;
  piVar3 = (int *)(&UNK_00004a6c + lRam0000000000a334c0);
  if (0.0 < *(float *)(&UNK_0000607c + lRam0000000000a334c0)) {
    fVar28 = (float)_cosf(*(float *)(&UNK_0000607c + lRam0000000000a334c0) * 6.0,0);
    iVar56 = *piVar3;
    lVar16 = lVar22 + (long)iVar56 * 0x10;
    fVar55 = (float)_fmodf(fVar28 * 0.5 + 0.5,0);
    fVar55 = fVar55 / 0.16666667;
    fVar28 = ((fVar55 - (float)(int)fVar55) * -0.5 + 1.0) * 0.5;
    fVar53 = 0.5;
    if ((uint)(int)fVar55 < 5) {
      fVar54 = ((1.0 - (fVar55 - (float)(int)fVar55)) * -0.5 + 1.0) * 0.5;
      fVar37 = 0.25;
      uVar41 = SUB41(fVar54,0);
      uVar43 = (undefined1)((uint)fVar54 >> 8);
      uVar45 = (undefined1)((uint)fVar54 >> 0x10);
      uVar39 = (char)((uint)fVar54 >> 0x18);
      switch((int)fVar55) {
      case 1:
        uVar41 = 0;
        uVar43 = 0;
        uVar45 = 0;
        uVar39 = 0x3f;
        fVar53 = fVar28;
        break;
      case 2:
        uVar41 = 0;
        uVar43 = 0;
        uVar45 = 0;
        uVar39 = 0x3f;
        fVar53 = 0.25;
        fVar37 = fVar54;
        break;
      case 3:
        uVar41 = SUB41(fVar28,0);
        uVar43 = (undefined1)((uint)fVar28 >> 8);
        uVar45 = (undefined1)((uint)fVar28 >> 0x10);
        uVar39 = (char)((uint)fVar28 >> 0x18);
        fVar53 = 0.25;
        fVar37 = 0.5;
        break;
      case 4:
        uVar41 = 0;
        uVar43 = 0;
        uVar45 = 0x80;
        uVar39 = 0x3e;
        fVar53 = fVar54;
        fVar37 = 0.5;
      }
    }
    else {
      uVar41 = 0;
      uVar43 = 0;
      uVar45 = 0x80;
      uVar39 = 0x3e;
      fVar37 = fVar28;
    }
    *(float *)(&UNK_000039cc + lVar16) = fVar53;
    *(uint *)(&UNK_000039d0 + lVar16) = CONCAT13(uVar39,CONCAT12(uVar45,CONCAT11(uVar43,uVar41)));
    *(float *)(&UNK_000039d4 + lVar16) = fVar37;
    *(undefined4 *)(&UNK_000039d8 + lVar22 + (long)iVar56 * 0x10) = 0x3f800000;
    fVar28 = *(float *)(&UNK_0000607c + lVar22) - *(float *)(lVar22 + 0x18);
    *(float *)(&UNK_0000607c + lVar22) = fVar28;
    if (fVar28 <= 0.0) {
      if (iVar56 != 0x35) {
        auVar36 = *(undefined1 (*) [16])(&UNK_00006080 + lVar22);
        *(long *)(&UNK_000039d4 + lVar16) = auVar36._8_8_;
        *(long *)(&UNK_000039cc + lVar16) = auVar36._0_8_;
      }
      *piVar3 = 0x35;
    }
  }
  cVar12 = *(char *)(unaff_x27 + 0x1ad);
  if ((cVar12 != '\0') && (*(char *)(unaff_x27 + 0x1ad) = cVar12 + -1, cVar12 == '\x01')) {
    *(undefined4 *)(in_stack_00000050 + 0xc24) = 0;
    *(undefined1 *)(unaff_x27 + 0x1ae) = 0;
  }
  cVar12 = *(char *)(unaff_x27 + 0x1ac);
  if (cVar12 != '\0') {
    *(char *)(unaff_x27 + 0x1ac) = cVar12 + -1;
    if (cVar12 == '\x01') {
      func_0x000bae48("(Debug Log: Auto-disabled some ImGuiDebugLogFlags after 2 frames)\n");
      *(uint *)(unaff_x27 + 0x17c) =
           *(uint *)(unaff_x27 + 0x17c) & (*(uint *)(unaff_x27 + 0x1a8) ^ 0xffffffff);
      *(undefined4 *)(unaff_x27 + 0x1a8) = 0;
      lVar22 = lRam0000000000a334c0;
    }
  }
  *(undefined1 *)(in_stack_00000050 + 0x209) = 1;
  *(uint *)(&UNK_000049f8 + lVar22) = *(uint *)(&UNK_000049f8 + lVar22) | 2;
  *(undefined8 *)(&UNK_00004a18 + lVar22) = 0x43c8000043c80000;
  *(undefined4 *)(&UNK_00004a00 + lVar22) = 4;
  func_0x000c9774("Debug##Default",0,0);
  if (*(char *)(unaff_x26 + 0x7a) == '\0') {
    *(undefined1 *)(unaff_x27 + 0x1b4) = 0xff;
    iVar56 = *(int *)(unaff_x27 + 0xe0);
  }
  else {
    iVar56 = (int)*(char *)(unaff_x27 + 0x1b4);
    if (iVar56 == -1) {
      *(undefined1 *)(unaff_x27 + 0x1b4) = 0;
      iVar56 = *(int *)(unaff_x27 + 0xe0);
    }
    else {
      if (((&UNK_00003f58)[unaff_x26] & 3) == 0) {
        iVar56 = *(char *)(unaff_x27 + 0x1b4) + 1;
      }
      *(char *)(unaff_x27 + 0x1b4) =
           (char)iVar56 + ((char)(iVar56 * 0x6667 >> 0x12) - (char)(iVar56 * 0x6667 >> 0x1f)) * -10;
      iVar56 = *(int *)(unaff_x27 + 0xe0);
    }
  }
  if (iVar56 != 0) {
    lVar22 = *(long *)(&UNK_00005fa8 + unaff_x26);
    lVar16 = (long)iVar56 << 5;
    do {
      if (*(int *)(lVar22 + 4) == 1) {
        (**(code **)(lVar22 + 0x10))();
      }
      lVar22 = lVar22 + 0x20;
      lVar16 = lVar16 + -0x20;
    } while (lVar16 != 0);
  }
  return;
}

