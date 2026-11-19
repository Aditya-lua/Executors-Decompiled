/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be71c
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_008be71c(long param_1)

{
  undefined1 (*pauVar1) [16];
  int iVar2;
  char cVar3;
  byte bVar4;
  byte bVar5;
  short sVar6;
  double ***pppdVar7;
  undefined1 auVar8 [16];
  bool bVar9;
  bool bVar10;
  int iVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  uint uVar15;
  uint uVar16;
  long lVar17;
  double *****pppppdVar18;
  double *****pppppdVar19;
  double *pdVar20;
  double ****ppppdVar21;
  undefined8 *puVar22;
  undefined8 uVar23;
  double *******pppppppdVar24;
  char *pcVar25;
  undefined1 uVar26;
  long *plVar27;
  double **ppdVar28;
  long *plVar29;
  ulong uVar30;
  code *UNRECOVERED_JUMPTABLE;
  double *******pppppppdVar31;
  undefined8 *puVar32;
  ulong uVar33;
  undefined4 *puVar34;
  double *******pppppppdVar35;
  uint *puVar36;
  undefined8 *puVar37;
  double *****pppppdVar38;
  undefined8 *puVar39;
  undefined8 *puVar40;
  double *pdVar41;
  uint *puVar42;
  long lVar43;
  ulong uVar44;
  ulong uVar45;
  double *******pppppppdVar46;
  ulong uVar47;
  ulong uVar48;
  double *******unaff_x22;
  double ******ppppppdVar49;
  double *******unaff_x23;
  long lVar50;
  double *******unaff_x24;
  double *******pppppppdVar51;
  double *******pppppppdVar52;
  double *****pppppdVar53;
  double *****pppppdVar54;
  undefined4 uVar55;
  float fVar56;
  float fVar57;
  undefined4 uVar58;
  float fVar59;
  double ******ppppppdVar60;
  undefined1 auVar61 [16];
  double ******ppppppdVar62;
  double dVar63;
  float fVar64;
  double *******local_c8;
  double *****local_c0;
  ushort local_b4 [2];
  ushort local_b0 [2];
  ushort local_ac [2];
  double local_a8;
  undefined4 local_9c;
  double local_98;
  undefined4 local_8c;
  double *******local_88;
  undefined4 local_7c;
  double ******local_78;
  undefined4 local_6c;
  long local_68;
  
  if (*(char *)(param_1 + 5) == '\x01') {
    lVar17 = tpidr_el0;
    local_68 = *(long *)(lVar17 + 0x28);
LAB_008c352c:
    plVar27 = *(long **)(param_1 + 0x50);
    pppppppdVar52 = *(double ********)(param_1 + 0x70);
    pppppdVar53 = (double *****)plVar27[4];
    local_c8 = *(double ********)plVar27[1];
    local_c0 = *(double ******)(*plVar27 + 0x28);
LAB_008be794:
    pppppdVar38 = pppppdVar53;
LAB_008be79c:
    if ((*(long *)(*(long *)(param_1 + 0x60) + 0x668) != 0) && (((ulong)*pppppdVar38 & 0xbf) != 1))
    {
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
      FUN_008be474(param_1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x668),0);
      if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3618;
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
    }
    pppppppdVar51 = unaff_x22;
    pppppppdVar46 = unaff_x23;
    pppppppdVar31 = unaff_x24;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
    switch(*(undefined1 *)pppppdVar38) {
    case 0:
switchD_008be7f4_caseD_0:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      goto LAB_008be794;
    case 1:
      do {
        lVar50 = **(long **)(param_1 + 0x50);
        uVar26 = *(undefined1 *)
                  (*(long *)(lVar50 + 0x60) +
                  ((ulong)((long)pppppdVar38 - *(long *)(lVar50 + 0x30)) >> 2 & 0xffffffff));
        if (*(long *)(*(long *)(param_1 + 0x60) + 0x678) != 0) {
          (*(long **)(param_1 + 0x50))[4] = (long)pppppdVar38;
          FUN_008be474(param_1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x678),0);
          if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3618;
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
        }
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
        switch(uVar26) {
        case 0:
          goto switchD_008be7f4_caseD_0;
        case 2:
          goto switchD_008be7f4_caseD_2;
        case 3:
          goto switchD_008be7f4_caseD_3;
        case 4:
          goto switchD_008be7f4_caseD_4;
        case 5:
          goto switchD_008be7f4_caseD_5;
        case 6:
          goto switchD_008be7f4_caseD_6;
        case 7:
          goto switchD_008be7f4_caseD_7;
        case 8:
          goto switchD_008be7f4_caseD_8;
        case 9:
          goto switchD_008be7f4_caseD_9;
        case 10:
          goto switchD_008be7f4_caseD_a;
        case 0xb:
          goto switchD_008be7f4_caseD_b;
        case 0xc:
          goto switchD_008be7f4_caseD_c;
        case 0xd:
          goto switchD_008be7f4_caseD_d;
        case 0xe:
          goto switchD_008be7f4_caseD_e;
        case 0xf:
          goto switchD_008be7f4_caseD_f;
        case 0x10:
          goto switchD_008be7f4_caseD_10;
        case 0x11:
          goto switchD_008be7f4_caseD_11;
        case 0x12:
          goto switchD_008be7f4_caseD_12;
        case 0x13:
          goto switchD_008be7f4_caseD_13;
        case 0x14:
          goto switchD_008be7f4_caseD_14;
        case 0x15:
          goto switchD_008be7f4_caseD_15;
        case 0x16:
          goto switchD_008be7f4_caseD_16;
        case 0x17:
          goto switchD_008be7f4_caseD_17;
        case 0x18:
          goto switchD_008be7f4_caseD_18;
        case 0x19:
          goto switchD_008be7f4_caseD_19;
        case 0x1a:
          goto switchD_008be7f4_caseD_1a;
        case 0x1b:
          goto switchD_008be7f4_caseD_1b;
        case 0x1c:
          goto switchD_008be7f4_caseD_1c;
        case 0x1d:
          goto switchD_008be7f4_caseD_1d;
        case 0x1e:
          goto switchD_008be7f4_caseD_1e;
        case 0x1f:
          goto switchD_008be7f4_caseD_1f;
        case 0x20:
          goto switchD_008be7f4_caseD_20;
        case 0x21:
          goto switchD_008be7f4_caseD_21;
        case 0x22:
          goto switchD_008be7f4_caseD_22;
        case 0x23:
          goto switchD_008be7f4_caseD_23;
        case 0x24:
          goto switchD_008be7f4_caseD_24;
        case 0x25:
          goto switchD_008be7f4_caseD_25;
        case 0x26:
          goto switchD_008be7f4_caseD_26;
        case 0x27:
          goto switchD_008be7f4_caseD_27;
        case 0x28:
          goto switchD_008be7f4_caseD_28;
        case 0x29:
          goto switchD_008be7f4_caseD_29;
        case 0x2a:
          goto switchD_008be7f4_caseD_2a;
        case 0x2b:
          goto switchD_008be7f4_caseD_2b;
        case 0x2c:
          goto switchD_008be7f4_caseD_2c;
        case 0x2d:
          goto switchD_008be7f4_caseD_2d;
        case 0x2e:
          goto switchD_008be7f4_caseD_2e;
        case 0x2f:
          goto switchD_008be7f4_caseD_2f;
        case 0x30:
          goto switchD_008be7f4_caseD_30;
        case 0x31:
          goto switchD_008be7f4_caseD_31;
        case 0x32:
          goto switchD_008be7f4_caseD_32;
        case 0x33:
          goto switchD_008be7f4_caseD_33;
        case 0x34:
          goto switchD_008be7f4_caseD_34;
        case 0x35:
          goto switchD_008be7f4_caseD_35;
        case 0x36:
          goto switchD_008be7f4_caseD_36;
        case 0x37:
          goto switchD_008be7f4_caseD_37;
        case 0x38:
          goto switchD_008be7f4_caseD_38;
        case 0x39:
          goto switchD_008be7f4_caseD_39;
        case 0x3a:
          goto switchD_008be7f4_caseD_3a;
        case 0x3b:
          goto switchD_008be7f4_caseD_3b;
        case 0x3c:
          goto switchD_008be7f4_caseD_3c;
        case 0x3d:
          goto switchD_008be7f4_caseD_3d;
        case 0x3e:
          goto switchD_008be7f4_caseD_3e;
        case 0x3f:
          goto switchD_008be7f4_caseD_3f;
        case 0x40:
          goto switchD_008be7f4_caseD_40;
        case 0x41:
          goto switchD_008be7f4_caseD_41;
        case 0x42:
          goto switchD_008be7f4_caseD_42;
        case 0x43:
          goto switchD_008be7f4_caseD_43;
        case 0x44:
          goto switchD_008be7f4_caseD_44;
        case 0x45:
          goto switchD_008be7f4_caseD_45;
        case 0x46:
          goto switchD_008be7f4_caseD_46;
        case 0x47:
          goto switchD_008be7f4_caseD_47;
        case 0x48:
          goto switchD_008be7f4_caseD_48;
        case 0x49:
          goto switchD_008be7f4_caseD_49;
        case 0x4a:
          goto switchD_008be7f4_caseD_4a;
        case 0x4b:
          goto switchD_008be7f4_caseD_4b;
        case 0x4c:
          goto switchD_008be7f4_caseD_4c;
        case 0x4d:
          goto switchD_008be7f4_caseD_4d;
        case 0x4e:
          goto switchD_008be7f4_caseD_4e;
        case 0x4f:
          goto switchD_008be7f4_caseD_4f;
        case 0x50:
          goto switchD_008be7f4_caseD_50;
        case 0x51:
          goto switchD_008be7f4_caseD_51;
        case 0x52:
          goto switchD_008be7f4_caseD_52;
        case 0x53:
          goto switchD_008be7f4_caseD_53;
        case 0x54:
          goto switchD_008be7f4_caseD_54;
        case 0x55:
          goto switchD_008be7f4_caseD_55;
        case 0x56:
          goto switchD_008be7f4_caseD_56;
        case 0x57:
          goto switchD_008be7f4_caseD_57;
        case 0x58:
          goto switchD_008be7f4_caseD_58;
        case 0x59:
          goto switchD_008be7f4_caseD_59;
        case 0x5a:
          goto switchD_008be7f4_caseD_5a;
        case 0x5b:
          goto switchD_008be7f4_caseD_5b;
        case 0x5c:
          goto switchD_008be7f4_caseD_5c;
        case 0x5d:
          goto switchD_008be7f4_caseD_5d;
        case 0x5e:
          goto switchD_008be7f4_caseD_5e;
        }
      } while( true );
    case 2:
switchD_008be7f4_caseD_2:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      *(undefined4 *)((long)pppppppdVar52 + (ulong)*(byte *)((long)pppppdVar38 + 1) * 0x10 + 0xc) =
           0;
      goto LAB_008be794;
    case 3:
switchD_008be7f4_caseD_3:
      uVar16 = *(uint *)pppppdVar38;
      *(uint *)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) = uVar16 >> 0x10 & 0xff;
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 1;
      pppppdVar53 = (double *****)((long)pppppdVar38 + ((ulong)(uVar16 >> 0x16) & 0x3fc) + 4);
      goto LAB_008be794;
    case 4:
switchD_008be7f4_caseD_4:
      uVar16 = *(uint *)pppppdVar38;
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 3;
      pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = (double ******)(double)((int)uVar16 >> 0x10);
      goto LAB_008bfd24;
    case 5:
switchD_008be7f4_caseD_5:
      uVar16 = *(uint *)pppppdVar38;
      ppppppdVar49 = (double ******)local_c0[(long)((int)uVar16 >> 0x10) * 2];
      (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
           (double ******)(local_c0 + (long)((int)uVar16 >> 0x10) * 2)[1];
      pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
      goto LAB_008bfd24;
    case 6:
switchD_008be7f4_caseD_6:
      uVar16 = *(uint *)pppppdVar38;
      ppppppdVar49 = pppppppdVar52[((ulong)(uVar16 >> 0x10) & 0xff) * 2];
      (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
           (pppppppdVar52 + ((ulong)(uVar16 >> 0x10) & 0xff) * 2)[1];
      pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
      goto LAB_008bfd24;
    case 7:
switchD_008be7f4_caseD_7:
      ppppppdVar49 = local_c8[2];
      uVar16 = (uint)*(byte *)((long)ppppppdVar49 + 4) & *(uint *)pppppdVar38 >> 0x18;
      pppppdVar54 = ppppppdVar49[5] + (ulong)uVar16 * 4;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      pppppppdVar31 = (double *******)(local_c0 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2);
      if ((((*(uint *)((long)pppppdVar54 + 0x1c) & 0xf) != 5) ||
          ((double ******)pppppdVar54[2] != *pppppppdVar31)) ||
         (*(int *)((long)pppppdVar54 + 0xc) == 0)) {
        local_6c = 6;
        pppppppdVar46 = &local_78;
        *(uint *)(param_1 + 0x2c) = uVar16;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38 + 1;
        local_78 = ppppppdVar49;
        goto LAB_008c20bc;
      }
      goto LAB_008c1bf8;
    case 8:
switchD_008be7f4_caseD_8:
      pppppdVar53 = pppppdVar38 + 1;
      pppppppdVar31 = (double *******)local_c8[2];
      uVar16 = (uint)*(byte *)((long)pppppppdVar31 + 4) & *(uint *)pppppdVar38 >> 0x18;
      ppppppdVar49 = pppppppdVar31[5] + (ulong)uVar16 * 4;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      if (((((*(uint *)((long)ppppppdVar49 + 0x1c) & 0xf) != 5) ||
           (ppppppdVar49[2] != (double *****)local_c0[(ulong)*(uint *)((long)pppppdVar38 + 4) * 2]))
          || (*(int *)((long)ppppppdVar49 + 0xc) == 0)) ||
         (*(char *)((long)pppppppdVar31 + 7) != '\0')) {
        lVar50 = *(long *)(param_1 + 0x50);
        local_7c = 6;
        pppppppdVar46 = (double *******)&local_88;
        *(uint *)(param_1 + 0x2c) = uVar16;
        local_88 = pppppppdVar31;
        goto LAB_008c2b94;
      }
      ppppppdVar60 = *pppppppdVar46;
      ppppppdVar49[1] = (double *****)pppppppdVar46[1];
      *ppppppdVar49 = (double *****)ppppppdVar60;
LAB_008be8b8:
      if (4 < (int)*(uint *)((long)pppppppdVar46 + 0xc)) {
        if (((*(byte *)((long)pppppppdVar31 + 2) >> 2 & 1) != 0) &&
           (((ulong)**pppppppdVar46 & 0x30000) != 0)) {
          FUN_008b6370(param_1);
        }
      }
      goto LAB_008be794;
    case 9:
switchD_008be7f4_caseD_9:
      uVar30 = (ulong)*(uint *)pppppdVar38;
      bVar5 = (byte)(*(uint *)pppppdVar38 >> 0x10);
      pppppppdVar51 = local_c8 + (ulong)bVar5 * 2 + 4;
      if (*(int *)((long)local_c8 + (ulong)bVar5 * 0x10 + 0x2c) == 0xf) {
        pppppppdVar51 = (double *******)(*pppppppdVar51)[1];
      }
      goto LAB_008be920;
    case 10:
switchD_008be7f4_caseD_a:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      ppppppdVar60 = local_c8[(ulong)(byte)(*(uint *)pppppdVar38 >> 0x10) * 2 + 4];
      ppppppdVar49 = *pppppppdVar51;
      pppppdVar38 = ppppppdVar60[1];
      pppppdVar38[1] = (double ****)pppppppdVar51[1];
      *pppppdVar38 = (double ****)ppppppdVar49;
      if (4 < (int)*(uint *)((long)pppppppdVar51 + 0xc)) {
        if (((*(byte *)((long)ppppppdVar60 + 2) >> 2 & 1) != 0) &&
           (((ulong)**pppppppdVar51 & 0x30000) != 0)) {
          FUN_008b6188(param_1);
        }
      }
      goto LAB_008be794;
    case 0xb:
switchD_008be7f4_caseD_b:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      if (*(long *)(param_1 + 0x30) != 0) {
        if (pppppppdVar52 + (ulong)*(byte *)((long)pppppdVar38 + 1) * 2 <=
            *(double ********)(*(long *)(param_1 + 0x30) + 8)) {
          FUN_008b4fa4(param_1);
        }
      }
      goto LAB_008be794;
    case 0xc:
switchD_008be7f4_caseD_c:
      pppppdVar53 = local_c0 + (long)((int)*(uint *)pppppdVar38 >> 0x10) * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      if ((*(int *)((long)pppppdVar53 + 0xc) != 0) && (*(char *)((long)local_c8[2] + 3) != '\0')) {
        ppppppdVar49 = (double ******)*pppppdVar53;
        pppppppdVar51[1] = (double ******)pppppdVar53[1];
        *pppppppdVar51 = ppppppdVar49;
        goto LAB_008c25a8;
      }
      pppppdVar53 = pppppdVar38 + 1;
      uVar16 = *(uint *)((long)pppppdVar38 + 4);
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008c8e84(param_1,local_c8[2],local_c0,pppppppdVar51,uVar16,0);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      goto LAB_008be794;
    case 0xd:
switchD_008be7f4_caseD_d:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      if ((*(uint *)((long)pppppppdVar51 + 0xc) == 6) && (*(int *)((long)pdVar20 + 0xc) == 3)) {
        ppppppdVar49 = *pppppppdVar51;
        iVar11 = (int)*pdVar20;
        uVar13 = iVar11 - 1;
        if ((uVar13 < *(uint *)(ppppppdVar49 + 1)) &&
           (*pdVar20 == (double)iVar11 && ppppppdVar49[2] == (double *****)0x0)) {
          ppppppdVar60 = (double ******)ppppppdVar49[4][(ulong)uVar13 * 2];
          (pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2)[1] =
               (double ******)(ppppppdVar49[4] + (ulong)uVar13 * 2)[1];
          pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = ppppppdVar60;
          goto LAB_008be794;
        }
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      goto LAB_008c1f34;
    case 0xe:
switchD_008be7f4_caseD_e:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      if ((*(uint *)((long)pppppppdVar51 + 0xc) == 6) && (*(int *)((long)pdVar20 + 0xc) == 3)) {
        pppppppdVar31 = (double *******)*pppppppdVar51;
        iVar11 = (int)*pdVar20;
        uVar16 = iVar11 - 1;
        if ((uVar16 < *(uint *)(pppppppdVar31 + 1)) &&
           ((pppppppdVar31[2] == (double ******)0x0 &&
            (*pdVar20 == (double)iVar11 && *(char *)((long)pppppppdVar31 + 7) == '\0')))) {
          ppppppdVar60 = pppppppdVar31[4];
          ppppppdVar49 = *pppppppdVar46;
          (ppppppdVar60 + (ulong)uVar16 * 2)[1] = (double *****)pppppppdVar46[1];
          ppppppdVar60[(ulong)uVar16 * 2] = (double *****)ppppppdVar49;
          goto LAB_008be8b8;
        }
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      goto LAB_008c1f00;
    case 0xf:
      goto switchD_008be7f4_caseD_f;
    case 0x10:
      goto switchD_008be7f4_caseD_10;
    case 0x11:
switchD_008be7f4_caseD_11:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      uVar13 = uVar16 >> 0x18;
      if (((*(uint *)((long)pppppppdVar51 + 0xc) == 6) &&
          (ppppppdVar49 = *pppppppdVar51, uVar13 < *(uint *)(ppppppdVar49 + 1))) &&
         (ppppppdVar49[2] == (double *****)0x0)) {
        ppppppdVar60 = (double ******)ppppppdVar49[4][(ulong)uVar13 * 2];
        (pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2)[1] =
             (double ******)(ppppppdVar49[4] + (ulong)uVar13 * 2)[1];
        pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = ppppppdVar60;
      }
      else {
        pdVar20 = &local_98;
        local_98 = (double)(uVar13 + 1);
        local_8c = 3;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
LAB_008c1f34:
        pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
        FUN_008cadd4(param_1,pppppppdVar51,pdVar20);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      goto LAB_008be794;
    case 0x12:
switchD_008be7f4_caseD_12:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = uVar16 >> 0x18;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if ((((*(uint *)((long)pppppppdVar51 + 0xc) == 6) &&
           (pppppppdVar31 = (double *******)*pppppppdVar51, uVar13 < *(uint *)(pppppppdVar31 + 1)))
          && (pppppppdVar31[2] == (double ******)0x0)) &&
         (*(char *)((long)pppppppdVar31 + 7) == '\0')) {
        ppppppdVar60 = pppppppdVar31[4];
        ppppppdVar49 = *pppppppdVar46;
        (ppppppdVar60 + (ulong)uVar13 * 2)[1] = (double *****)pppppppdVar46[1];
        ppppppdVar60[(ulong)uVar13 * 2] = (double *****)ppppppdVar49;
        goto LAB_008be8b8;
      }
      pdVar20 = &local_a8;
      local_a8 = (double)(uVar13 + 1);
      local_9c = 3;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
LAB_008c1f00:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      FUN_008cb374(param_1,pppppppdVar51,pdVar20);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      goto LAB_008be794;
    case 0x13:
switchD_008be7f4_caseD_13:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      unaff_x22 = *(double ********)
                   (*(long *)(**(long **)(param_1 + 0x50) + 0x38) + (long)((int)uVar16 >> 0x10) * 8)
      ;
      (*(long **)(param_1 + 0x50))[4] = (long)pppppdVar53;
      ppppppdVar49 = (double ******)
                     FUN_008b4d5c(param_1,*(undefined1 *)((long)unaff_x22 + 6),local_c8[2],unaff_x22
                                 );
      pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = ppppppdVar49;
      cVar3 = *(char *)((long)unaff_x22 + 6);
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 7;
      if (cVar3 != '\0') {
        lVar50 = 0;
        uVar30 = 0;
        unaff_x23 = local_c8 + 4;
        unaff_x24 = (double *******)(ppppppdVar49 + 4);
        goto LAB_008c17cc;
      }
      unaff_x23 = local_c8;
      goto LAB_008c20d4;
    case 0x14:
      goto switchD_008be7f4_caseD_14;
    case 0x15:
switchD_008be7f4_caseD_15:
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x688);
      lVar50 = *(long *)(param_1 + 0x50);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(lVar50 + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        lVar50 = *(long *)(param_1 + 0x50);
        if (*(char *)(param_1 + 3) != '\0') {
LAB_008c360c:
          *(long *)(lVar50 + 0x20) = *(long *)(lVar50 + 0x20) + -4;
          goto LAB_008c3618;
        }
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      unaff_x24 = (double *******)(ulong)uVar16;
      pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pppppppdVar51 = pppppppdVar52 + 2;
      pppppppdVar46 = *(double ********)(param_1 + 0x68);
      if ((uVar16 >> 0x10 & 0xff) != 0) {
        pppppppdVar46 = pppppppdVar51 + (ulong)(byte)(uVar16 >> 0x10) * 2 + -2;
      }
      if (*(uint *)((long)pppppppdVar52 + 0xc) != 7) {
        *(double ******)(lVar50 + 0x20) = pppppdVar53;
        FUN_008cda50(param_1,pppppppdVar52);
        lVar50 = *(long *)(param_1 + 0x50);
        pppppppdVar46 = pppppppdVar46 + 2;
      }
      pppppppdVar31 = (double *******)*pppppppdVar52;
      *(double ******)(lVar50 + 0x20) = pppppdVar53;
      if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
        unaff_x22 = (double *******)FUN_008b4200(param_1);
      }
      else {
        unaff_x22 = (double *******)(*(long *)(param_1 + 0x50) + 0x30);
        *(double ********)(param_1 + 0x50) = unaff_x22;
      }
      cVar3 = *(char *)((long)pppppppdVar31 + 6);
      unaff_x22[1] = (double ******)pppppppdVar52;
      if (cVar3 == '\0') {
        ppppppdVar49 = pppppppdVar31[3];
        if ((DAT_00d1fdf0 == '\x01') &&
           (ppppppdVar60 = (double ******)ppppppdVar49[0x1a],
           (double ******)ppppppdVar49[0x1a] != (double ******)0x0)) {
          do {
            ppppppdVar49 = ppppppdVar60;
            pppppppdVar31[3] = ppppppdVar49;
            ppppppdVar60 = (double ******)ppppppdVar49[0x1a];
          } while ((double ******)ppppppdVar49[0x1a] != (double ******)0x0);
          *(undefined1 *)((long)pppppppdVar31 + 4) = *(undefined1 *)((long)ppppppdVar49 + 5);
        }
      }
      else {
        ppppppdVar49 = (double ******)0x0;
      }
      bVar5 = *(byte *)((long)pppppppdVar31 + 4);
      *unaff_x22 = ppppppdVar49;
      unaff_x22[4] = (double ******)0x0;
      lVar50 = *(long *)(param_1 + 0x48);
      unaff_x22[2] = (double ******)pppppppdVar51;
      unaff_x22[3] = (double ******)(pppppppdVar46 + (ulong)bVar5 * 2);
      bVar5 = *(byte *)((long)pppppppdVar31 + 4);
      uVar13 = (uVar16 >> 0x18) - 1;
      unaff_x23 = (double *******)(ulong)uVar13;
      *(uint *)(unaff_x22 + 5) = uVar13;
      *(uint *)((long)unaff_x22 + 0x2c) = 0;
      *(double ********)(param_1 + 0x68) = pppppppdVar46;
      *(double ********)(param_1 + 0x70) = pppppppdVar51;
      if (lVar50 - (long)pppppppdVar46 <= (long)((ulong)bVar5 * 0x10)) {
        iVar14 = *(int *)(param_1 + 0x40);
        iVar11 = iVar14 + (uint)bVar5;
        if ((int)(uint)bVar5 <= iVar14) {
          iVar11 = iVar14 << 1;
        }
        FUN_008b3fdc(param_1,iVar11,1);
      }
      if (*(char *)((long)pppppppdVar31 + 6) != '\0') {
        uVar12 = (*(code *)pppppppdVar31[5])(param_1);
        if ((int)uVar12 < 0) goto LAB_008c3618;
        lVar50 = *(long *)(param_1 + 0x50);
        puVar22 = *(undefined8 **)(lVar50 + 8);
        if ((uVar13 == 0) || (uVar12 == 0)) goto LAB_008c1e2c;
        puVar32 = *(undefined8 **)(param_1 + 0x68);
        puVar37 = puVar22;
        puVar40 = puVar32 + (ulong)uVar12 * -2;
        goto LAB_008c1e10;
      }
      ppppppdVar49 = pppppppdVar31[3];
      if (DAT_00d1f4f8 == '\x01') {
        *(int *)(ppppppdVar49 + 9) = *(int *)(ppppppdVar49 + 9) + 1;
      }
      pppppppdVar46 = *(double ********)(param_1 + 0x68);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      pppppppdVar51 = pppppppdVar52 + (ulong)*(byte *)((long)ppppppdVar49 + 7) * 2;
      if (pppppppdVar46 < pppppppdVar51) {
        pppppppdVar35 = pppppppdVar51;
        if (pppppppdVar51 <= pppppppdVar46 + 2) {
          pppppppdVar35 = pppppppdVar46 + 2;
        }
        if ((long)pppppppdVar35 + ~(ulong)pppppppdVar46 < 0x10) {
LAB_008bf040:
          do {
            pppppppdVar35 = pppppppdVar46 + 2;
            *(uint *)((long)pppppppdVar46 + 0xc) = 0;
            pppppppdVar46 = pppppppdVar35;
          } while (pppppppdVar35 < pppppppdVar51);
        }
        else {
          uVar30 = ((long)pppppppdVar35 + ~(ulong)pppppppdVar46 >> 4) + 1;
          uVar48 = uVar30 & 0x1ffffffffffffffe;
          pppppppdVar35 = pppppppdVar46 + uVar48 * 2;
          puVar36 = (uint *)((long)pppppppdVar46 + 0x1c);
          uVar44 = uVar48;
          do {
            uVar44 = uVar44 - 2;
            puVar36[-4] = 0;
            *puVar36 = 0;
            puVar36 = puVar36 + 8;
          } while (uVar44 != 0);
          pppppppdVar46 = pppppppdVar35;
          if (uVar30 != uVar48) goto LAB_008bf040;
        }
        cVar3 = *(char *)((long)ppppppdVar49 + 3);
      }
      else {
        cVar3 = *(char *)((long)ppppppdVar49 + 3);
        pppppppdVar35 = pppppppdVar46;
      }
      if (cVar3 == '\0') {
        pppppppdVar35 = (double *******)unaff_x22[3];
      }
      local_c0 = ppppppdVar49[5];
      pppppdVar38 = ppppppdVar49[6];
      *(double ********)(param_1 + 0x68) = pppppppdVar35;
      local_c8 = pppppppdVar31;
      goto LAB_008be79c;
    case 0x16:
switchD_008be7f4_caseD_16:
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x688);
      lVar50 = *(long *)(param_1 + 0x50);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(lVar50 + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        lVar50 = *(long *)(param_1 + 0x50);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c360c;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      uVar16 = *(uint *)pppppdVar38;
      uVar30 = (ulong)(uVar16 >> 0x10) & 0xff;
      if ((int)uVar30 == 0) {
        pppppppdVar51 = *(double ********)(param_1 + 0x68);
      }
      else {
        pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2 + uVar30 * 2 + -2;
      }
      uVar13 = *(uint *)(lVar50 + 0x28);
      pdVar20 = *(double **)(lVar50 + 8);
      uVar12 = uVar13;
      if ((uVar13 == 0) || (pppppppdVar51 <= pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2))
      goto joined_r0x008c21ac;
      pdVar41 = pdVar20;
      pppppppdVar52 = pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2;
      goto LAB_008c218c;
    case 0x17:
switchD_008be7f4_caseD_17:
      pppppdVar53 = (double *****)
                    ((long)pppppdVar38 + ((long)*(short *)((long)pppppdVar38 + 2) + 1) * 4);
      goto LAB_008be794;
    case 0x18:
switchD_008be7f4_caseD_18:
      lVar50 = *(long *)(param_1 + 0x60);
      UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') {
LAB_008c3608:
          lVar50 = *(long *)(param_1 + 0x50);
          goto LAB_008c360c;
        }
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        lVar50 = *(long *)(param_1 + 0x60);
      }
      if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008b52c4(param_1,1);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      uVar16 = *(uint *)pppppdVar38;
      if (DAT_00d1f4f8 == '\x01') {
        *(int *)(**(long **)(param_1 + 0x50) + 0x48) =
             *(int *)(**(long **)(param_1 + 0x50) + 0x48) + 1;
      }
      pppppdVar53 = (double *****)((long)pppppdVar38 + ((long)((int)uVar16 >> 0x10) + 1) * 4);
      goto LAB_008be794;
    case 0x19:
switchD_008be7f4_caseD_19:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2) + 0xc)
      ;
      uVar30 = (ulong)uVar16;
      if (uVar16 != 0) {
        if ((uVar16 == 1) &&
           (*(uint *)(pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2) == 0)) {
          goto LAB_008be794;
        }
        uVar30 = (long)((ulong)*(uint *)pppppdVar38 << 0x20) >> 0x30;
      }
      pppppdVar53 = (double *****)((long)pppppdVar53 + uVar30 * 4);
      goto LAB_008be794;
    case 0x1a:
switchD_008be7f4_caseD_1a:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2) + 0xc)
      ;
      if (uVar16 != 0) {
        if (uVar16 != 1) {
          goto LAB_008be794;
        }
        if (*(uint *)(pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2) != 0) {
          goto LAB_008be794;
        }
      }
      pppppdVar53 = (double *****)
                    ((long)pppppdVar53 + ((long)((ulong)*(uint *)pppppdVar38 << 0x20) >> 0x30) * 4);
      goto LAB_008be794;
    case 0x1b:
switchD_008be7f4_caseD_1b:
      uVar16 = *(uint *)pppppdVar38;
      unaff_x24 = (double *******)(ulong)uVar16;
      unaff_x23 = (double *******)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*(uint *)unaff_x23 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar13 = *(uint *)((long)pppppppdVar51 + 0xc);
      if (uVar13 != *(uint *)((long)pppppppdVar46 + 0xc)) goto LAB_008c25a8;
      iVar11 = (int)uVar16 >> 0x10;
      if ((int)uVar13 < 7) {
        if ((int)uVar13 < 3) {
          if (uVar13 == 0) goto LAB_008c25d8;
          if (uVar13 == 1) {
            if (*(uint *)pppppppdVar51 != *(uint *)pppppppdVar46) {
              iVar11 = 1;
            }
            pppppdVar53 = (double *****)((long)unaff_x23 + (long)iVar11 * 4);
          }
          else if (*pppppppdVar51 == *pppppppdVar46) {
            if (*(uint *)(pppppppdVar51 + 1) == *(uint *)(pppppppdVar46 + 1)) goto LAB_008c29b0;
            pppppdVar53 = pppppdVar38 + 1;
          }
          else {
            pppppdVar53 = pppppdVar38 + 1;
          }
          goto LAB_008be794;
        }
        if ((int)uVar13 < 5) {
          if (uVar13 == 3) {
            bVar10 = (double)*pppppppdVar51 == (double)*pppppppdVar46;
          }
          else {
            if (*(float *)pppppppdVar51 != *(float *)pppppppdVar46) {
              pppppdVar53 = pppppdVar38 + 1;
              goto LAB_008be794;
            }
            if (*(float *)((long)pppppppdVar51 + 4) != *(float *)((long)pppppppdVar46 + 4)) {
              pppppdVar53 = pppppdVar38 + 1;
              goto LAB_008be794;
            }
            bVar10 = false;
            if (!NAN(*(float *)(pppppppdVar51 + 1)) && !NAN(*(float *)(pppppppdVar46 + 1))) {
              bVar10 = *(float *)(pppppppdVar51 + 1) == *(float *)(pppppppdVar46 + 1);
            }
          }
          lVar50 = ((long)unaff_x24 << 0x20) >> 0x30;
          if (!bVar10) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)((long)unaff_x23 + lVar50 * 4);
          goto LAB_008be794;
        }
        if (uVar13 == 5) goto LAB_008c2780;
        ppppppdVar49 = *pppppppdVar51;
        ppppppdVar60 = *pppppppdVar46;
        pppppdVar53 = ppppppdVar49[2];
        if (pppppdVar53 == ppppppdVar60[2]) {
          if ((pppppdVar53 == (double *****)0x0) || (*(char *)((long)pppppdVar53 + 6) < '\0'))
          goto LAB_008c2788;
          if (((*(byte *)((long)pppppdVar53 + 7) >> 1 & 1) == 0) &&
             (lVar50 = FUN_008bdfe0(pppppdVar53,7,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370)
                                   ), lVar50 == 0)) goto LAB_008c2780;
        }
      }
      else if ((int)uVar13 < 9) {
        if (uVar13 == 7) {
LAB_008c2780:
          ppppppdVar49 = *pppppppdVar51;
          ppppppdVar60 = *pppppppdVar46;
LAB_008c2788:
          lVar50 = ((long)unaff_x24 << 0x20) >> 0x30;
          if (ppppppdVar49 != ppppppdVar60) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)((long)unaff_x23 + lVar50 * 4);
          goto LAB_008be794;
        }
        ppppppdVar49 = *pppppppdVar51;
        ppppppdVar60 = *pppppppdVar46;
        pppppdVar53 = ppppppdVar49[1];
        if (pppppdVar53 == ppppppdVar60[1]) {
          if ((pppppdVar53 == (double *****)0x0) || (*(char *)((long)pppppdVar53 + 6) < '\0'))
          goto LAB_008c2788;
          if ((*(byte *)((long)pppppdVar53 + 7) >> 1 & 1) == 0) {
            ppppdVar21 = (double ****)
                         FUN_008bdfe0(pppppdVar53,7,
                                      *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
            if (ppppdVar21 == (double ****)0x0) goto LAB_008c2780;
          }
          else {
            ppppdVar21 = pppppdVar53[4] + -0x10;
          }
          if ((*(int *)((long)ppppdVar21 + 0xc) == 7) && (*(char *)((long)*ppppdVar21 + 6) != '\0'))
          {
            puVar22 = *(undefined8 **)(param_1 + 0x68);
            pppdVar7 = *ppppdVar21;
            puVar22[1] = ppppdVar21[1];
            *puVar22 = pppdVar7;
            ppppppdVar49 = *pppppppdVar51;
            unaff_x22 = (double *******)((ulong)((long)puVar22 - (long)pppppppdVar52) >> 4);
            puVar22[3] = pppppppdVar51[1];
            puVar22[2] = ppppppdVar49;
            ppppppdVar49 = *pppppppdVar46;
            puVar22[5] = pppppppdVar46[1];
            puVar22[4] = ppppppdVar49;
            *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
            *(double ********)(*(long *)(param_1 + 0x50) + 0x20) = unaff_x23;
            FUN_008cd928(param_1,2,(ulong)unaff_x22 & 0xffffffff);
            pppppppdVar52 = *(double ********)(param_1 + 0x70);
            uVar16 = *(uint *)((long)(pppppppdVar52 + (long)(int)unaff_x22 * 2) + 0xc);
            if (uVar16 == 0) {
              pppppdVar53 = pppppdVar38 + 1;
            }
            else {
              if ((uVar16 != 1) || (*(uint *)(pppppppdVar52 + (long)(int)unaff_x22 * 2) != 0))
              goto LAB_008c29b0;
              pppppdVar53 = pppppdVar38 + 1;
            }
            goto LAB_008be794;
          }
        }
      }
      else if ((uVar13 - 9 < 2) || (uVar13 == 0xb)) goto LAB_008c2780;
      *(double ********)(*(long *)(param_1 + 0x50) + 0x20) = unaff_x23;
      iVar14 = FUN_008cbdc8(param_1);
      bVar10 = iVar14 == 1;
LAB_008c28f0:
      if (!bVar10) {
        iVar11 = 1;
      }
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4 + (long)iVar11 * 4);
      unaff_x23 = (double *******)((long)pppppdVar38 + 4);
      goto LAB_008be794;
    case 0x1c:
switchD_008be7f4_caseD_1c:
      uVar16 = *(uint *)pppppdVar38;
      puVar36 = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*puVar36 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
          lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
          if ((double)*pppppppdVar46 < (double)*pppppppdVar51) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)(puVar36 + lVar50);
          goto LAB_008be794;
        }
      }
      else if ((*(uint *)((long)pppppppdVar51 + 0xc) == 5) &&
              (*(uint *)((long)pppppppdVar46 + 0xc) == 5)) {
        iVar14 = FUN_008cba50(*pppppppdVar51,*pppppppdVar46);
        iVar11 = (int)uVar16 >> 0x10;
        if (0 < iVar14) {
          iVar11 = 1;
        }
        pppppdVar53 = (double *****)(puVar36 + iVar11);
        goto LAB_008be794;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
      iVar14 = FUN_008cbbf8(param_1);
      goto LAB_008c2d94;
    case 0x1d:
switchD_008be7f4_caseD_1d:
      uVar16 = *(uint *)pppppdVar38;
      puVar36 = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*puVar36 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
          lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
          if ((double)*pppppppdVar46 <= (double)*pppppppdVar51) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)(puVar36 + lVar50);
          goto LAB_008be794;
        }
      }
      else if ((*(uint *)((long)pppppppdVar51 + 0xc) == 5) &&
              (*(uint *)((long)pppppppdVar46 + 0xc) == 5)) {
        iVar14 = FUN_008cba50(*pppppppdVar51,*pppppppdVar46);
        iVar11 = (int)uVar16 >> 0x10;
        if (-1 < iVar14) {
          iVar11 = 1;
        }
        pppppdVar53 = (double *****)(puVar36 + iVar11);
        goto LAB_008be794;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
      iVar14 = FUN_008cbab8(param_1);
LAB_008c2d94:
      iVar11 = (int)uVar16 >> 0x10;
      bVar10 = iVar14 == 1;
LAB_008c2e90:
      if (!bVar10) {
        iVar11 = 1;
      }
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      pppppdVar53 = (double *****)((long)pppppdVar38 + ((long)iVar11 + 1) * 4);
      goto LAB_008be794;
    case 0x1e:
switchD_008be7f4_caseD_1e:
      uVar16 = *(uint *)pppppdVar38;
      unaff_x24 = (double *******)(ulong)uVar16;
      unaff_x23 = (double *******)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*(uint *)unaff_x23 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar13 = *(uint *)((long)pppppppdVar51 + 0xc);
      if (uVar13 != *(uint *)((long)pppppppdVar46 + 0xc)) {
LAB_008c25d8:
        pppppdVar53 = (double *****)((long)pppppdVar38 + 4 + (long)((int)unaff_x24 >> 0x10) * 4);
        unaff_x23 = (double *******)((long)pppppdVar38 + 4);
        goto LAB_008be794;
      }
      iVar11 = (int)uVar16 >> 0x10;
      if (6 < (int)uVar13) {
        if (8 < (int)uVar13) {
          if (uVar13 - 9 < 2) {
LAB_008c26fc:
            ppppppdVar49 = *pppppppdVar51;
            ppppppdVar60 = *pppppppdVar46;
          }
          else {
            if (uVar13 != 0xb) goto LAB_008c284c;
LAB_008c2370:
            ppppppdVar49 = *pppppppdVar51;
            ppppppdVar60 = *pppppppdVar46;
          }
LAB_008c2704:
          lVar50 = ((long)unaff_x24 << 0x20) >> 0x30;
          if (ppppppdVar49 == ppppppdVar60) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)((long)unaff_x23 + lVar50 * 4);
          goto LAB_008be794;
        }
        if (uVar13 == 7) goto LAB_008c26fc;
        ppppppdVar49 = *pppppppdVar51;
        ppppppdVar60 = *pppppppdVar46;
        pppppdVar53 = ppppppdVar49[1];
        if (pppppdVar53 == ppppppdVar60[1]) {
          if ((pppppdVar53 == (double *****)0x0) || (*(char *)((long)pppppdVar53 + 6) < '\0'))
          goto LAB_008c2704;
          if ((*(byte *)((long)pppppdVar53 + 7) >> 1 & 1) == 0) {
            ppppdVar21 = (double ****)
                         FUN_008bdfe0(pppppdVar53,7,
                                      *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
            if (ppppdVar21 == (double ****)0x0) goto LAB_008c2370;
          }
          else {
            ppppdVar21 = pppppdVar53[4] + -0x10;
          }
          if ((*(int *)((long)ppppdVar21 + 0xc) == 7) && (*(char *)((long)*ppppdVar21 + 6) != '\0'))
          {
            puVar22 = *(undefined8 **)(param_1 + 0x68);
            pppdVar7 = *ppppdVar21;
            puVar22[1] = ppppdVar21[1];
            *puVar22 = pppdVar7;
            ppppppdVar49 = *pppppppdVar51;
            unaff_x22 = (double *******)((ulong)((long)puVar22 - (long)pppppppdVar52) >> 4);
            puVar22[3] = pppppppdVar51[1];
            puVar22[2] = ppppppdVar49;
            ppppppdVar49 = *pppppppdVar46;
            puVar22[5] = pppppppdVar46[1];
            puVar22[4] = ppppppdVar49;
            *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
            *(double ********)(*(long *)(param_1 + 0x50) + 0x20) = unaff_x23;
            FUN_008cd928(param_1,2,(ulong)unaff_x22 & 0xffffffff);
            pppppppdVar52 = *(double ********)(param_1 + 0x70);
            uVar16 = *(uint *)((long)(pppppppdVar52 + (long)(int)unaff_x22 * 2) + 0xc);
            if (uVar16 != 0) {
              if (uVar16 == 1) {
                if (*(uint *)(pppppppdVar52 + (long)(int)unaff_x22 * 2) == 0) goto LAB_008c29b0;
                pppppdVar53 = pppppdVar38 + 1;
              }
              else {
                pppppdVar53 = pppppdVar38 + 1;
              }
              goto LAB_008be794;
            }
            goto LAB_008c29b0;
          }
        }
LAB_008c284c:
        *(double ********)(*(long *)(param_1 + 0x50) + 0x20) = unaff_x23;
        iVar14 = FUN_008cbdc8(param_1);
        bVar10 = iVar14 == 0;
        goto LAB_008c28f0;
      }
      if (2 < (int)uVar13) {
        if (4 < (int)uVar13) {
          if (uVar13 != 5) {
            ppppppdVar49 = *pppppppdVar51;
            ppppppdVar60 = *pppppppdVar46;
            pppppdVar53 = ppppppdVar49[2];
            if (pppppdVar53 == ppppppdVar60[2]) {
              if ((pppppdVar53 == (double *****)0x0) || (*(char *)((long)pppppdVar53 + 6) < '\0'))
              goto LAB_008c2704;
              if (((*(byte *)((long)pppppdVar53 + 7) >> 1 & 1) == 0) &&
                 (lVar50 = FUN_008bdfe0(pppppdVar53,7,
                                        *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370)),
                 lVar50 == 0)) goto LAB_008c2370;
            }
            goto LAB_008c284c;
          }
          goto LAB_008c26fc;
        }
        if (uVar13 == 3) {
          bVar10 = (double)*pppppppdVar51 == (double)*pppppppdVar46;
        }
        else {
          if ((*(float *)pppppppdVar51 != *(float *)pppppppdVar46) ||
             (*(float *)((long)pppppppdVar51 + 4) != *(float *)((long)pppppppdVar46 + 4)))
          goto LAB_008c29b0;
          bVar10 = false;
          if (!NAN(*(float *)(pppppppdVar51 + 1)) && !NAN(*(float *)(pppppppdVar46 + 1))) {
            bVar10 = *(float *)(pppppppdVar51 + 1) == *(float *)(pppppppdVar46 + 1);
          }
        }
        lVar50 = ((long)unaff_x24 << 0x20) >> 0x30;
        if (bVar10) {
          lVar50 = 1;
        }
        pppppdVar53 = (double *****)((long)unaff_x23 + lVar50 * 4);
        goto LAB_008be794;
      }
      if (uVar13 == 0) {
LAB_008c25a8:
        pppppdVar53 = pppppdVar38 + 1;
        goto LAB_008be794;
      }
      if (uVar13 == 1) {
        if (*(uint *)pppppppdVar51 == *(uint *)pppppppdVar46) {
          iVar11 = 1;
        }
        pppppdVar53 = (double *****)((long)unaff_x23 + (long)iVar11 * 4);
        goto LAB_008be794;
      }
      if ((*pppppppdVar51 == *pppppppdVar46) &&
         (*(uint *)(pppppppdVar51 + 1) == *(uint *)(pppppppdVar46 + 1))) {
        pppppdVar53 = pppppdVar38 + 1;
        goto LAB_008be794;
      }
LAB_008c29b0:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4 + (((long)unaff_x24 << 0x20) >> 0x30) * 4);
      unaff_x23 = (double *******)((long)pppppdVar38 + 4);
      goto LAB_008be794;
    case 0x1f:
switchD_008be7f4_caseD_1f:
      uVar16 = *(uint *)pppppdVar38;
      puVar36 = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*puVar36 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      iVar11 = (int)uVar16 >> 0x10;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
          lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
          if ((double)*pppppppdVar51 <= (double)*pppppppdVar46) {
            lVar50 = 1;
          }
          pppppdVar53 = (double *****)(puVar36 + lVar50);
          goto LAB_008be794;
        }
      }
      else if ((*(uint *)((long)pppppppdVar51 + 0xc) == 5) &&
              (*(uint *)((long)pppppppdVar46 + 0xc) == 5)) {
        iVar14 = FUN_008cba50(*pppppppdVar51,*pppppppdVar46);
        if (iVar14 < 1) {
          iVar11 = 1;
        }
        pppppdVar53 = (double *****)(puVar36 + iVar11);
        goto LAB_008be794;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
      iVar14 = FUN_008cbbf8(param_1);
      bVar10 = iVar14 == 0;
      goto LAB_008c2e90;
    case 0x20:
switchD_008be7f4_caseD_20:
      uVar16 = *(uint *)pppppdVar38;
      puVar36 = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar46 = pppppppdVar52 + (ulong)*puVar36 * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      iVar11 = (int)uVar16 >> 0x10;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
          uVar30 = (long)((ulong)uVar16 << 0x20) >> 0x30;
          if ((double)*pppppppdVar51 < (double)*pppppppdVar46) {
            uVar30 = 1;
          }
          goto LAB_008c012c;
        }
      }
      else if ((*(uint *)((long)pppppppdVar51 + 0xc) == 5) &&
              (*(uint *)((long)pppppppdVar46 + 0xc) == 5)) {
        iVar14 = FUN_008cba50(*pppppppdVar51,*pppppppdVar46);
        if (iVar14 < 0) {
          iVar11 = 1;
        }
        pppppdVar53 = (double *****)(puVar36 + iVar11);
        goto LAB_008be794;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
      iVar14 = FUN_008cbab8(param_1);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      if (iVar14 != 0) {
        iVar11 = 1;
      }
      pppppdVar53 = (double *****)(puVar36 + iVar11);
      goto LAB_008be794;
    case 0x21:
switchD_008be7f4_caseD_21:
      uVar13 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      pppppppdVar51 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
      if (uVar16 == 3) {
        if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
          ppppppdVar49 = (double ******)((double)*pppppppdVar46 + (double)*pppppppdVar51);
          uVar16 = 3;
          goto LAB_008be784;
        }
      }
      else if (uVar16 == 4) {
        if (*(uint *)((long)pppppppdVar51 + 0xc) == 4) {
          fVar56 = SUB84(*pppppppdVar46,0) + SUB84(*pppppppdVar51,0);
          fVar57 = (float)((ulong)*pppppppdVar46 >> 0x20) + (float)((ulong)*pppppppdVar51 >> 0x20);
          fVar59 = *(float *)(pppppppdVar46 + 1) + *(float *)(pppppppdVar51 + 1);
LAB_008c2ff8:
          pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
          *pppppppdVar31 = (double ******)CONCAT44(fVar57,fVar56);
          *(float *)(pppppppdVar31 + 1) = fVar59;
          *(uint *)((long)pppppppdVar31 + 0xc) = 4;
          goto LAB_008be794;
        }
      }
      else if (uVar16 == 8) {
        plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,8);
        unaff_x22 = pppppppdVar46;
        unaff_x23 = pppppppdVar51;
        if (((plVar27 != (long *)0x0) && (*(int *)((long)plVar27 + 0xc) == 7)) &&
           (*(char *)(*plVar27 + 6) != '\0')) {
LAB_008bf5ec:
          uVar44 = (ulong)uVar13;
          plVar29 = *(long **)(param_1 + 0x68);
          lVar50 = *plVar27;
          plVar29[1] = plVar27[1];
          *plVar29 = lVar50;
          ppppppdVar49 = *pppppppdVar46;
          plVar29[3] = (long)pppppppdVar46[1];
          plVar29[2] = (long)ppppppdVar49;
          ppppppdVar49 = pppppppdVar51[1];
          uVar55 = SUB84(*pppppppdVar51,0);
          uVar58 = (undefined4)((ulong)*pppppppdVar51 >> 0x20);
          goto LAB_008bfa28;
        }
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      goto LAB_008bf53c;
    case 0x22:
switchD_008be7f4_caseD_22:
      uVar13 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      pppppppdVar51 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
      if (uVar16 == 3) {
        if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
          ppppppdVar49 = (double ******)((double)*pppppppdVar46 - (double)*pppppppdVar51);
          uVar16 = 3;
          goto LAB_008be784;
        }
      }
      else if (uVar16 == 4) {
        if (*(uint *)((long)pppppppdVar51 + 0xc) == 4) {
          fVar56 = SUB84(*pppppppdVar46,0) - SUB84(*pppppppdVar51,0);
          fVar57 = (float)((ulong)*pppppppdVar46 >> 0x20) - (float)((ulong)*pppppppdVar51 >> 0x20);
          fVar59 = *(float *)(pppppppdVar46 + 1) - *(float *)(pppppppdVar51 + 1);
          goto LAB_008c2ff8;
        }
      }
      else if (uVar16 == 8) {
        plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,9);
        unaff_x22 = pppppppdVar46;
        unaff_x23 = pppppppdVar51;
        if (((plVar27 != (long *)0x0) && (*(int *)((long)plVar27 + 0xc) == 7)) &&
           (*(char *)(*plVar27 + 6) != '\0')) goto LAB_008bf5ec;
      }
      goto LAB_008bf608;
    case 0x23:
switchD_008be7f4_caseD_23:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      uVar44 = (ulong)uVar16;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      unaff_x24 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)unaff_x23 + 0xc);
      if (uVar16 == 3) {
        uVar16 = *(uint *)((long)unaff_x24 + 0xc);
        if (uVar16 == 3) {
          ppppppdVar49 = (double ******)((double)*unaff_x23 * (double)*unaff_x24);
          uVar16 = 3;
          goto LAB_008c1dd8;
        }
        pppppppdVar51 = unaff_x24;
        if (uVar16 == 4) {
          ppppppdVar49 = *unaff_x23;
          ppppppdVar60 = *unaff_x24;
          fVar57 = *(float *)(unaff_x24 + 1);
          *(uint *)((long)unaff_x22 + 0xc) = 4;
          fVar56 = (float)(double)ppppppdVar49;
          *unaff_x22 = (double ******)
                       CONCAT44((float)((ulong)ppppppdVar60 >> 0x20) * fVar56,
                                SUB84(ppppppdVar60,0) * fVar56);
          *(float *)(unaff_x22 + 1) = fVar57 * fVar56;
          goto LAB_008be794;
        }
LAB_008bf68c:
        if (((uVar16 == 8) &&
            (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar51,10), plVar27 != (long *)0x0)) &&
           (*(int *)((long)plVar27 + 0xc) == 7)) {
          pppppppdVar46 = unaff_x22;
          pppppppdVar51 = unaff_x23;
          if (*(char *)(*plVar27 + 6) != '\0') goto LAB_008bf6dc;
        }
      }
      else {
        pppppppdVar51 = unaff_x23;
        if (uVar16 != 4) goto LAB_008bf68c;
        if (*(uint *)((long)unaff_x24 + 0xc) == 4) {
          fVar56 = SUB84(*unaff_x23,0) * SUB84(*unaff_x24,0);
          fVar57 = (float)((ulong)*unaff_x23 >> 0x20) * (float)((ulong)*unaff_x24 >> 0x20);
          fVar59 = *(float *)(unaff_x23 + 1) * *(float *)(unaff_x24 + 1);
LAB_008c30c8:
          pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
          *unaff_x22 = (double ******)CONCAT44(fVar57,fVar56);
          *(float *)(unaff_x22 + 1) = fVar59;
          *(uint *)((long)unaff_x22 + 0xc) = 4;
          goto LAB_008be794;
        }
        if (*(uint *)((long)unaff_x24 + 0xc) == 3) {
          ppppppdVar49 = *unaff_x24;
          ppppppdVar60 = *unaff_x23;
          fVar57 = *(float *)(unaff_x23 + 1);
          *(uint *)((long)unaff_x22 + 0xc) = 4;
          fVar56 = (float)(double)ppppppdVar49;
          *unaff_x22 = (double ******)
                       CONCAT44((float)((ulong)ppppppdVar60 >> 0x20) * fVar56,
                                SUB84(ppppppdVar60,0) * fVar56);
          *(float *)(unaff_x22 + 1) = fVar57 * fVar56;
          goto LAB_008be794;
        }
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008cc77c(param_1,unaff_x22,unaff_x23,unaff_x24);
      break;
    case 0x24:
switchD_008be7f4_caseD_24:
      uVar16 = *(uint *)pppppdVar38;
      uVar44 = (ulong)uVar16;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pppppppdVar35 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)pppppppdVar51 + 0xc);
      unaff_x22 = pppppppdVar31;
      unaff_x23 = pppppppdVar51;
      unaff_x24 = pppppppdVar35;
      if (uVar16 == 3) {
        uVar16 = *(uint *)((long)pppppppdVar35 + 0xc);
        if (uVar16 == 3) {
          ppppppdVar49 = (double ******)((double)*pppppppdVar51 / (double)*pppppppdVar35);
        }
        else {
          pppppppdVar46 = pppppppdVar35;
          if (uVar16 != 4) goto LAB_008bf768;
          fVar56 = (float)(double)*pppppppdVar51;
          ppppppdVar49 = (double ******)
                         CONCAT44(fVar56 / (float)((ulong)*pppppppdVar35 >> 0x20),
                                  fVar56 / SUB84(*pppppppdVar35,0));
          *(float *)(pppppppdVar31 + 1) = fVar56 / *(float *)(pppppppdVar35 + 1);
        }
        goto LAB_008c1dd8;
      }
      pppppppdVar46 = pppppppdVar51;
      if (uVar16 == 4) {
        if (*(uint *)((long)pppppppdVar35 + 0xc) == 4) {
          fVar56 = SUB84(*pppppppdVar51,0) / SUB84(*pppppppdVar35,0);
          fVar57 = (float)((ulong)*pppppppdVar51 >> 0x20) / (float)((ulong)*pppppppdVar35 >> 0x20);
          fVar59 = *(float *)(pppppppdVar51 + 1) / *(float *)(pppppppdVar35 + 1);
          goto LAB_008c30c8;
        }
        if (*(uint *)((long)pppppppdVar35 + 0xc) == 3) {
          fVar56 = (float)(double)*pppppppdVar35;
          fVar59 = *(float *)(pppppppdVar51 + 1) / fVar56;
          fVar57 = SUB84(*pppppppdVar51,0) / fVar56;
          fVar56 = (float)((ulong)*pppppppdVar51 >> 0x20) / fVar56;
          goto LAB_008c3040;
        }
LAB_008bf798:
        lVar50 = *(long *)(param_1 + 0x50);
LAB_008c08b0:
        pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
        *(double ******)(lVar50 + 0x20) = pppppdVar53;
        FUN_008cca4c(param_1,pppppppdVar31,pppppppdVar51,pppppppdVar35);
        break;
      }
LAB_008bf768:
      if (((uVar16 != 8) ||
          (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,0xb), plVar27 == (long *)0x0)) ||
         (*(int *)((long)plVar27 + 0xc) != 7)) goto LAB_008bf798;
      pppppppdVar46 = pppppppdVar31;
      if (*(char *)(*plVar27 + 6) == '\0') goto LAB_008bf798;
LAB_008bf6dc:
      plVar29 = *(long **)(param_1 + 0x68);
      lVar50 = *plVar27;
      plVar29[1] = plVar27[1];
      *plVar29 = lVar50;
      ppppppdVar49 = *pppppppdVar51;
      plVar29[3] = (long)pppppppdVar51[1];
      plVar29[2] = (long)ppppppdVar49;
      ppppppdVar49 = unaff_x24[1];
      uVar55 = SUB84(*unaff_x24,0);
      uVar58 = (undefined4)((ulong)*unaff_x24 >> 0x20);
LAB_008bfa28:
      plVar29[5] = (long)ppppppdVar49;
      plVar29[4] = CONCAT44(uVar58,uVar55);
      uVar44 = uVar44 >> 8;
      lVar50 = *(long *)(param_1 + 0x50);
      uVar23 = 2;
      *(long **)(param_1 + 0x68) = plVar29 + 6;
      unaff_x22 = pppppppdVar46;
      unaff_x23 = pppppppdVar51;
      goto LAB_008bfa44;
    case 0x25:
switchD_008be7f4_caseD_25:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      if ((*(uint *)((long)pppppppdVar51 + 0xc) == 3) && (*(int *)((long)pdVar20 + 0xc) == 3)) {
        ppppppdVar49 = (double ******)
                       ((double)*pppppppdVar51 -
                       *pdVar20 * (double)(long)((double)*pppppppdVar51 / *pdVar20));
        uVar16 = 3;
        goto LAB_008be784;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      goto LAB_008bf8a4;
    case 0x26:
switchD_008be7f4_caseD_26:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      if ((*(uint *)((long)pppppppdVar51 + 0xc) != 3) || (*(int *)((long)pdVar20 + 0xc) != 3)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        goto LAB_008bf8f4;
      }
      ppppppdVar49 = (double ******)pow((double)*pppppppdVar51,*pdVar20);
      *pppppppdVar46 = ppppppdVar49;
      *(uint *)((long)pppppppdVar46 + 0xc) = 3;
      goto LAB_008be794;
    case 0x27:
switchD_008be7f4_caseD_27:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
        ppppppdVar49 = (double ******)
                       ((double)*pppppppdVar46 + *(double *)((long)local_c0 + uVar30));
LAB_008be780:
        uVar16 = 3;
        goto LAB_008be784;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar51 = (double *******)((long)local_c0 + uVar30);
LAB_008bf53c:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      FUN_008cc36c(param_1,pppppppdVar31,pppppppdVar46,pppppppdVar51);
      break;
    case 0x28:
switchD_008be7f4_caseD_28:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
        uVar55 = SUB84(*pppppppdVar46,0);
        uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
        ppppppdVar49 = *(double *******)((long)local_c0 + uVar30);
LAB_008c1ea4:
        ppppppdVar49 = (double ******)((double)CONCAT44(uVar58,uVar55) - (double)ppppppdVar49);
        goto LAB_008be780;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      pppppppdVar51 = (double *******)((long)local_c0 + uVar30);
      goto LAB_008bf610;
    case 0x29:
switchD_008be7f4_caseD_29:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      uVar30 = (ulong)(uVar13 >> 0x14) & 0xff0;
      uVar16 = *(uint *)((long)unaff_x22 + 0xc);
      if (uVar16 == 3) {
        ppppppdVar49 = (double ******)((double)*unaff_x22 * *(double *)((long)local_c0 + uVar30));
LAB_008c13bc:
        uVar16 = 3;
LAB_008c13c0:
        pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
        *unaff_x23 = ppppppdVar49;
        *(uint *)((long)unaff_x23 + 0xc) = uVar16;
        goto LAB_008be794;
      }
      if (uVar16 == 4) {
        ppppppdVar49 = *unaff_x22;
        fVar57 = *(float *)(unaff_x22 + 1);
        dVar63 = *(double *)((long)local_c0 + uVar30);
        *(uint *)((long)unaff_x23 + 0xc) = 4;
        fVar56 = (float)dVar63;
        *unaff_x23 = (double ******)
                     CONCAT44((float)((ulong)ppppppdVar49 >> 0x20) * fVar56,
                              SUB84(ppppppdVar49,0) * fVar56);
        *(float *)(unaff_x23 + 1) = fVar57 * fVar56;
        goto LAB_008be794;
      }
      if (((uVar16 == 8) &&
          (plVar27 = (long *)FUN_008be028(param_1,unaff_x22,10), plVar27 != (long *)0x0)) &&
         (*(int *)((long)plVar27 + 0xc) == 7)) {
        pppppppdVar46 = unaff_x22;
        pppppppdVar51 = unaff_x23;
        if (*(char *)(*plVar27 + 6) != '\0') {
LAB_008bfa0c:
          plVar29 = *(long **)(param_1 + 0x68);
          lVar50 = *plVar27;
          plVar29[1] = plVar27[1];
          *plVar29 = lVar50;
          ppppppdVar49 = pppppppdVar46[1];
          uVar55 = SUB84(*pppppppdVar46,0);
          uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
          goto LAB_008bfa1c;
        }
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008cc77c(param_1,unaff_x23,unaff_x22,(long)local_c0 + uVar30);
      break;
    case 0x2a:
switchD_008be7f4_caseD_2a:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      uVar30 = (ulong)(uVar13 >> 0x14) & 0xff0;
      uVar16 = *(uint *)((long)unaff_x22 + 0xc);
      if (uVar16 == 3) {
        ppppppdVar49 = (double ******)((double)*unaff_x22 / *(double *)((long)local_c0 + uVar30));
        goto LAB_008c13bc;
      }
      if (uVar16 == 4) {
        uVar16 = 4;
        fVar56 = (float)*(double *)((long)local_c0 + uVar30);
        ppppppdVar49 = (double ******)
                       CONCAT44((float)((ulong)*unaff_x22 >> 0x20) / fVar56,
                                SUB84(*unaff_x22,0) / fVar56);
        *(float *)(unaff_x23 + 1) = *(float *)(unaff_x22 + 1) / fVar56;
        goto LAB_008c13c0;
      }
      if (((uVar16 == 8) &&
          (plVar27 = (long *)FUN_008be028(param_1,unaff_x22,0xb), plVar27 != (long *)0x0)) &&
         (*(int *)((long)plVar27 + 0xc) == 7)) {
        pppppppdVar46 = unaff_x22;
        pppppppdVar51 = unaff_x23;
        if (*(char *)(*plVar27 + 6) != '\0') goto LAB_008bfa0c;
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008cca4c(param_1,unaff_x23,unaff_x22,(long)local_c0 + uVar30);
      break;
    case 0x2b:
switchD_008be7f4_caseD_2b:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        dVar63 = *(double *)((long)local_c0 + uVar30);
        ppppppdVar49 = (double ******)
                       ((double)*pppppppdVar51 -
                       dVar63 * (double)(long)((double)*pppppppdVar51 / dVar63));
        goto LAB_008be780;
      }
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      pdVar20 = (double *)((long)local_c0 + uVar30);
LAB_008bf8a4:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      FUN_008cd058(param_1,pppppppdVar31,pppppppdVar51,pdVar20);
      break;
    case 0x2c:
switchD_008be7f4_caseD_2c:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        dVar63 = *(double *)((long)local_c0 + uVar30);
        ppppppdVar49 = *pppppppdVar51;
        if (dVar63 == 2.0) {
          ppppppdVar49 = (double ******)((double)ppppppdVar49 * (double)ppppppdVar49);
        }
        else if (dVar63 == 0.5) {
          ppppppdVar49 = (double ******)SQRT((double)ppppppdVar49);
        }
        else if (dVar63 == 3.0) {
          ppppppdVar49 = (double ******)
                         ((double)ppppppdVar49 * (double)ppppppdVar49 * (double)ppppppdVar49);
        }
        else {
          ppppppdVar49 = (double ******)pow((double)ppppppdVar49,dVar63);
        }
        *pppppppdVar46 = ppppppdVar49;
        *(uint *)((long)pppppppdVar46 + 0xc) = 3;
        goto LAB_008be794;
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      pdVar20 = (double *)((long)local_c0 + uVar30);
LAB_008bf8f4:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      FUN_008cd244(param_1,pppppppdVar46,pppppppdVar51,pdVar20);
      break;
    case 0x2d:
switchD_008be7f4_caseD_2d:
      uVar16 = *(uint *)pppppdVar38;
      uVar30 = (ulong)uVar16;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if ((*(uint *)((long)pppppppdVar51 + 0xc) != 0) &&
         ((*(uint *)((long)pppppppdVar51 + 0xc) != 1 || (*(uint *)pppppppdVar51 != 0)))) {
        pppppppdVar51 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      }
      goto LAB_008be920;
    case 0x2e:
switchD_008be7f4_caseD_2e:
      uVar13 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
      pppppppdVar51 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
      goto joined_r0x008bfcc0;
    case 0x2f:
switchD_008be7f4_caseD_2f:
      uVar16 = *(uint *)pppppdVar38;
      uVar30 = (ulong)uVar16;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if ((*(uint *)((long)pppppppdVar51 + 0xc) != 0) &&
         ((*(uint *)((long)pppppppdVar51 + 0xc) != 1 || (*(uint *)pppppppdVar51 != 0)))) {
        pppppppdVar51 = (double *******)((long)local_c0 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      }
      goto LAB_008be920;
    case 0x30:
switchD_008be7f4_caseD_30:
      uVar13 = *(uint *)pppppdVar38;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
      pppppppdVar51 = (double *******)((long)local_c0 + ((ulong)(uVar13 >> 0x14) & 0xff0));
joined_r0x008bfcc0:
      uVar30 = (ulong)uVar13;
      if ((uVar16 != 0) && ((uVar16 != 1 || (*(uint *)pppppppdVar46 != 0)))) {
        pppppppdVar51 = pppppppdVar46;
      }
LAB_008be920:
      ppppppdVar49 = *pppppppdVar51;
      (pppppppdVar52 + (uVar30 >> 8 & 0xff) * 2)[1] = pppppppdVar51[1];
      pppppppdVar52[(uVar30 >> 8 & 0xff) * 2] = ppppppdVar49;
      goto LAB_008bfd24;
    case 0x31:
switchD_008be7f4_caseD_31:
      uVar16 = *(uint *)pppppdVar38;
      uVar30 = (ulong)(uVar16 >> 0x10) & 0xff;
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      FUN_008cc074(param_1,((uVar16 >> 0x18) - (int)uVar30) + 1);
      puVar22 = (undefined8 *)(*(long *)(param_1 + 0x70) + uVar30 * 0x10);
      uVar23 = *puVar22;
      puVar37 = (undefined8 *)(*(long *)(param_1 + 0x70) + ((ulong)(uVar16 >> 8) & 0xff) * 0x10);
      puVar37[1] = puVar22[1];
      *puVar37 = uVar23;
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      goto LAB_008bfd04;
    case 0x32:
switchD_008be7f4_caseD_32:
      uVar13 = *(uint *)pppppdVar38;
      uVar16 = *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2) + 0xc);
      if (uVar16 == 0) {
        uVar16 = 1;
      }
      else if (uVar16 == 1) {
        uVar16 = (uint)(*(uint *)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2) == 0);
      }
      else {
        uVar16 = 0;
      }
      *(uint *)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2) = uVar16;
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2) + 0xc) = 1;
      goto LAB_008bfd24;
    case 0x33:
switchD_008be7f4_caseD_33:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      uVar16 = *(uint *)((long)unaff_x22 + 0xc);
      if (uVar16 == 3) {
        ppppppdVar49 = (double ******)-(double)*unaff_x22;
        uVar16 = 3;
        goto LAB_008c13c0;
      }
      if (uVar16 == 4) {
        ppppppdVar49 = *unaff_x22;
        fVar56 = *(float *)(unaff_x22 + 1);
        *(uint *)((long)unaff_x23 + 0xc) = 4;
        *unaff_x23 = (double ******)
                     CONCAT44(-(float)((ulong)ppppppdVar49 >> 0x20),-SUB84(ppppppdVar49,0));
        *(float *)(unaff_x23 + 1) = -fVar56;
        goto LAB_008be794;
      }
      if (((uVar16 != 8) ||
          (plVar27 = (long *)FUN_008be028(param_1,unaff_x22,0xf), plVar27 == (long *)0x0)) ||
         ((*(int *)((long)plVar27 + 0xc) != 7 || (*(char *)(*plVar27 + 6) == '\0')))) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008cd428(param_1,unaff_x23,unaff_x22,unaff_x22);
        break;
      }
      plVar29 = *(long **)(param_1 + 0x68);
      lVar50 = *plVar27;
      uVar44 = (ulong)(uVar13 >> 8) & 0xff000000000000ff;
      uVar23 = 1;
      plVar29[1] = plVar27[1];
      *plVar29 = lVar50;
      ppppppdVar49 = *unaff_x22;
      plVar29[3] = (long)unaff_x22[1];
      plVar29[2] = (long)ppppppdVar49;
      lVar50 = *(long *)(param_1 + 0x50);
      *(long **)(param_1 + 0x68) = plVar29 + 4;
LAB_008bfa44:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      *(double ******)(lVar50 + 0x20) = pppppdVar53;
      FUN_008cd928(param_1,uVar23,uVar44 & 0xff);
      break;
    case 0x34:
switchD_008be7f4_caseD_34:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 0x10) * 2;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 6) {
        if (((*pppppppdVar51)[2] != (double *****)0x0) &&
           ((*(byte *)((long)(*pppppppdVar51)[2] + 6) >> 6 & 1) == 0)) goto LAB_008bfe68;
        iVar11 = FUN_008bcf64();
        ppppppdVar49 = (double ******)(double)iVar11;
        uVar16 = 3;
      }
      else {
        if (*(uint *)((long)pppppppdVar51 + 0xc) != 5) {
LAB_008bfe68:
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          FUN_008cd618(param_1,unaff_x22);
          break;
        }
        uVar16 = 3;
        ppppppdVar49 = (double ******)NEON_ucvtf((ulong)*(uint *)((long)*pppppppdVar51 + 0x14));
      }
      goto LAB_008c1dd8;
    case 0x35:
switchD_008be7f4_caseD_35:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppdVar53 = pppppdVar38 + 1;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      iVar11 = 0;
      if ((uVar16 >> 0x10 & 0xff) != 0) {
        iVar11 = 1 << (ulong)((uVar16 >> 0x10 & 0xff) - 1 & 0x1f);
      }
      ppppppdVar49 = (double ******)FUN_008bae54(param_1,uVar13,iVar11);
      pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = ppppppdVar49;
      lVar50 = *(long *)(param_1 + 0x50);
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 6;
      *(double ******)(lVar50 + 0x20) = pppppdVar53;
      if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10))
      {
        FUN_008b52c4(param_1,1);
      }
      break;
    case 0x36:
switchD_008be7f4_caseD_36:
      uVar13 = *(uint *)pppppdVar38;
      uVar16 = (int)uVar13 >> 0x10;
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      ppppppdVar49 = (double ******)
                     FUN_008bd16c(param_1,*(undefined8 *)
                                           ((long)local_c0 +
                                           (-(ulong)(uVar16 >> 0x1f) & 0xfffffff000000000 |
                                           (ulong)uVar16 << 4)));
      pppppppdVar52[(ulong)(byte)(uVar13 >> 8) * 2] = ppppppdVar49;
      lVar50 = *(long *)(param_1 + 0x50);
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2) + 0xc) = 6;
      *(uint **)(lVar50 + 0x20) = (uint *)((long)pppppdVar38 + 4);
LAB_008bfd04:
      if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10))
      {
        FUN_008b52c4(param_1,1);
      }
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      goto LAB_008bfd24;
    case 0x37:
switchD_008be7f4_caseD_37:
      uVar13 = *(uint *)pppppdVar38;
      uVar16 = *(uint *)((long)pppppdVar38 + 4);
      if ((uVar13 & 0xff000000) == 0) {
        unaff_x23 = (double *******)
                    ((ulong)(*(long *)(param_1 + 0x68) -
                            (long)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2)) >> 4);
        *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x18);
      }
      else {
        unaff_x23 = (double *******)(ulong)((uVar13 >> 0x18) - 1);
      }
      if (*(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2) + 0xc) != 6)
      goto LAB_008c3618;
      unaff_x22 = (double *******)pppppppdVar52[(ulong)(byte)(uVar13 >> 8) * 2];
      pppppdVar53 = pppppdVar38 + 1;
      if ((int)*(uint *)(unaff_x22 + 1) < (int)(uVar16 + (int)unaff_x23 + -1)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008ba760(param_1,unaff_x22);
      }
      if (0 < (int)unaff_x23) {
        ppppppdVar49 = unaff_x22[4];
        uVar30 = (ulong)unaff_x23 & 0xffffffff;
        uVar16 = uVar16 - 1;
        pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
        do {
          ppppppdVar60 = *pppppppdVar51;
          uVar30 = uVar30 - 1;
          (ppppppdVar49 + (ulong)uVar16 * 2)[1] = (double *****)pppppppdVar51[1];
          ppppppdVar49[(ulong)uVar16 * 2] = (double *****)ppppppdVar60;
          uVar16 = uVar16 + 1;
          pppppppdVar51 = pppppppdVar51 + 2;
        } while (uVar30 != 0);
      }
      if ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) == 0) goto LAB_008be794;
      FUN_008b63a4(param_1,unaff_x22,unaff_x22 + 3);
      pppppdVar38 = pppppdVar53;
      goto LAB_008be79c;
    case 0x38:
switchD_008be7f4_caseD_38:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (((*(uint *)((long)unaff_x22 + 0xc) != 3) || (*(uint *)((long)unaff_x22 + 0x1c) != 3)) ||
         (*(uint *)((long)unaff_x22 + 0x2c) != 3)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008cd7b4(param_1,unaff_x22,unaff_x22 + 2,unaff_x22 + 4);
      }
      ppppppdVar49 = *unaff_x22;
      ppppppdVar62 = unaff_x22[2];
      ppppppdVar60 = unaff_x22[4];
      if (DAT_00d1f4f8 != '\x01') {
        if ((double)ppppppdVar62 <= 0.0) {
          if ((double)ppppppdVar60 < (double)ppppppdVar49) goto LAB_008c0128;
        }
        else if ((double)ppppppdVar49 < (double)ppppppdVar60) {
LAB_008c0128:
          uVar30 = (long)((ulong)uVar16 << 0x20) >> 0x30;
          goto LAB_008c012c;
        }
        uVar30 = 0;
        goto LAB_008c012c;
      }
      if ((double)ppppppdVar62 <= 0.0) {
        if ((double)ppppppdVar49 <= (double)ppppppdVar60) goto LAB_008c00ac;
      }
      else if ((double)ppppppdVar60 <= (double)ppppppdVar49) {
LAB_008c00ac:
        dVar63 = ((double)ppppppdVar49 - (double)ppppppdVar60) / (double)ppppppdVar62 + 1.0;
        if (dVar63 <= 0.0) goto LAB_008be794;
        iVar11 = *(int *)(**(long **)(param_1 + 0x50) + 0x48);
        uVar13 = 0x3fffffff - iVar11;
        uVar16 = (int)dVar63;
        if ((double)uVar13 <= dVar63) {
          uVar16 = uVar13;
        }
        *(uint *)(**(long **)(param_1 + 0x50) + 0x48) = uVar16 + iVar11;
        pppppdVar38 = pppppdVar53;
        goto LAB_008be79c;
      }
      pppppdVar53 = (double *****)((long)pppppdVar53 + (long)((int)uVar16 >> 0x10) * 4);
      goto LAB_008be794;
    case 0x39:
switchD_008be7f4_caseD_39:
      lVar50 = *(long *)(param_1 + 0x60);
      UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3608;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        lVar50 = *(long *)(param_1 + 0x60);
      }
      if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008b52c4(param_1,1);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      *(uint *)((long)pppppppdVar51 + 0x2c) = 3;
      ppppppdVar49 = (double ******)((double)pppppppdVar51[2] + (double)pppppppdVar51[4]);
      ppppppdVar60 = *pppppppdVar51;
      pppppppdVar51[4] = ppppppdVar49;
      if ((double)pppppppdVar51[2] <= 0.0) {
        bVar10 = false;
        bVar9 = true;
        if (!NAN((double)ppppppdVar60) && !NAN((double)ppppppdVar49)) {
          bVar10 = (double)ppppppdVar60 == (double)ppppppdVar49;
          bVar9 = (double)ppppppdVar49 <= (double)ppppppdVar60;
        }
      }
      else {
        bVar9 = (double)ppppppdVar60 <= (double)ppppppdVar49;
        bVar10 = (double)ppppppdVar49 == (double)ppppppdVar60;
      }
      if (!bVar9 || bVar10) goto LAB_008c1970;
      goto LAB_008be794;
    case 0x3a:
switchD_008be7f4_caseD_3a:
      lVar50 = *(long *)(param_1 + 0x60);
      UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3608;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        lVar50 = *(long *)(param_1 + 0x60);
      }
      if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008b52c4(param_1,1);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      uVar16 = *(uint *)pppppdVar38;
      unaff_x23 = (double *******)(ulong)uVar16;
      unaff_x22 = (double *******)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)unaff_x22;
      uVar30 = (ulong)(uVar16 >> 8) & 0xff;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      iVar11 = (int)uVar16 >> 0x10;
      if ((*(uint *)((long)pppppppdVar51 + 0xc) == 0) &&
         (*(uint *)((long)pppppppdVar51 + 0x1c) == 6)) {
        ppppppdVar49 = pppppppdVar51[2];
        ppppppdVar60 = pppppppdVar51[4];
        uVar16 = (uint)ppppppdVar60;
        uVar12 = *(uint *)(ppppppdVar49 + 1);
        if (2 < (int)uVar13) {
          uVar44 = (ulong)uVar13 - 2;
          if (uVar44 < 2) {
            lVar50 = 2;
          }
          else {
            uVar33 = uVar44 & 0xfffffffffffffffe;
            lVar50 = uVar33 + 2;
            puVar36 = (uint *)((long)pppppppdVar51 + 0x6c);
            uVar48 = uVar33;
            do {
              uVar48 = uVar48 - 2;
              puVar36[-4] = 0;
              *puVar36 = 0;
              puVar36 = puVar36 + 8;
            } while (uVar48 != 0);
            if (uVar44 == uVar33) goto LAB_008c02c0;
          }
          lVar43 = (ulong)uVar13 - lVar50;
          puVar34 = (undefined4 *)((long)pppppppdVar52 + lVar50 * 0x10 + uVar30 * 0x10 + 0x3c);
          do {
            lVar43 = lVar43 + -1;
            *puVar34 = 0;
            puVar34 = puVar34 + 4;
          } while (lVar43 != 0);
        }
LAB_008c02c0:
        if ((-1 < (int)uVar13) ||
           ((uVar16 < uVar12 &&
            (*(int *)((long)ppppppdVar49[4] + (((long)ppppppdVar60 << 0x20) >> 0x1c) + 0xc) != 0))))
        {
          if (uVar16 < uVar12) {
            pppppdVar53 = ppppppdVar49[4] + (long)(int)uVar16 * 2;
            do {
              if (*(int *)((long)pppppdVar53 + 0xc) != 0) {
                iVar14 = (int)ppppppdVar60 + 1;
                pppppppdVar51[4] = (double ******)(long)iVar14;
                *(uint *)((long)pppppppdVar51 + 0x3c) = 3;
                pppppppdVar51[5] = (double ******)0x200000080;
                pppppppdVar51[6] = (double ******)(double)iVar14;
                ppppppdVar49 = (double ******)pppppdVar53[1];
                uVar55 = SUB84(*pppppdVar53,0);
                uVar58 = (undefined4)((ulong)*pppppdVar53 >> 0x20);
                goto LAB_008c2954;
              }
              uVar16 = (int)ppppppdVar60 + 1;
              ppppppdVar60 = (double ******)(ulong)uVar16;
              pppppdVar53 = pppppdVar53 + 2;
            } while (uVar16 < uVar12);
          }
          uVar12 = uVar16 - uVar12;
          if (uVar12 >> (ulong)(*(byte *)((long)ppppppdVar49 + 5) & 0x1f) == 0) {
            lVar50 = (ulong)uVar16 << 0x20;
            while( true ) {
              lVar50 = lVar50 + 0x100000000;
              pppppdVar53 = ppppppdVar49[5] + (long)(int)uVar12 * 4;
              if (*(int *)((long)pppppdVar53 + 0xc) != 0) break;
              uVar12 = uVar12 + 1;
              if (uVar12 >> (ulong)(*(byte *)((long)ppppppdVar49 + 5) & 0x1f) != 0)
              goto LAB_008c03e8;
            }
            pppppppdVar51[4] = (double ******)(lVar50 >> 0x20);
            pppppppdVar51[5] = (double ******)0x200000080;
            pppppppdVar51[6] = (double ******)pppppdVar53[2];
            *(uint *)(pppppppdVar51 + 7) = *(uint *)(pppppdVar53 + 3);
            *(uint *)((long)pppppppdVar51 + 0x3c) = *(uint *)((long)pppppdVar53 + 0x1c) & 0xf;
            ppppppdVar49 = (double ******)pppppdVar53[1];
            uVar55 = SUB84(*pppppdVar53,0);
            uVar58 = (undefined4)((ulong)*pppppdVar53 >> 0x20);
LAB_008c2954:
            pppppdVar53 = (double *****)((long)unaff_x22 + (long)iVar11 * 4);
            pppppppdVar51[9] = ppppppdVar49;
            pppppppdVar51[8] = (double ******)CONCAT44(uVar58,uVar55);
            goto LAB_008be794;
          }
        }
LAB_008c03e8:
        pppppdVar38 = pppppdVar38 + 1;
      }
      else {
        if (DAT_00d1f4f8 == '\x01') {
          *(int *)(**(long **)(param_1 + 0x50) + 0x48) =
               *(int *)(**(long **)(param_1 + 0x50) + 0x48) + 1;
        }
        pppppppdVar51[9] = SUB168(*(undefined1 (*) [16])(pppppppdVar51 + 2),8);
        pppppppdVar51[8] = SUB168(*(undefined1 (*) [16])(pppppppdVar51 + 2),0);
        pppppppdVar51[0xb] = pppppppdVar51[5];
        pppppppdVar51[10] = pppppppdVar51[4];
        pppppppdVar51[7] = pppppppdVar51[1];
        pppppppdVar51[6] = *pppppppdVar51;
        *(double ********)(param_1 + 0x68) = pppppppdVar51 + 0xc;
        *(double ********)(*(long *)(param_1 + 0x50) + 0x20) = unaff_x22;
        uVar44 = FUN_008b4310(param_1,pppppppdVar51 + 6,uVar13 & 0xff);
        if ((uVar44 & 1) != 0) goto LAB_008c3618;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        iVar14 = *(int *)((long)pppppppdVar52 + uVar30 * 0x10 + 0x3c);
        *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x18);
        if (iVar14 == 0) {
          iVar11 = 1;
        }
        pppppppdVar52[uVar30 * 2 + 5] = pppppppdVar52[uVar30 * 2 + 7];
        pppppppdVar52[uVar30 * 2 + 4] = pppppppdVar52[uVar30 * 2 + 6];
        pppppdVar38 = (double *****)((long)unaff_x22 + (long)iVar11 * 4);
      }
      goto LAB_008be79c;
    case 0x3b:
switchD_008be7f4_caseD_3b:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (((*(char *)((long)local_c8[2] + 3) != '\0') &&
          (*(uint *)((long)pppppppdVar51 + 0x1c) == 6)) &&
         ((*(uint *)((long)pppppppdVar51 + 0x2c) == 3 && ((double)pppppppdVar51[4] == 0.0)))) {
        if (DAT_00d1f4f8 == '\x01') {
          uVar13 = *(uint *)(pppppppdVar51[2] + 1);
joined_r0x008c2534:
          if (0 < (int)uVar13) {
            iVar11 = *(int *)(**(long **)(param_1 + 0x50) + 0x48);
            uVar12 = 0x3fffffff - iVar11;
            if (uVar12 <= uVar13) {
              uVar13 = uVar12;
            }
            *(uint *)(**(long **)(param_1 + 0x50) + 0x48) = uVar13 + iVar11;
          }
        }
        goto LAB_008c255c;
      }
LAB_008c1964:
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 7) goto LAB_008c1970;
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
      if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_008b399c(param_1,pppppppdVar51,"iterate over");
      }
      goto LAB_008c37c0;
    case 0x3c:
switchD_008be7f4_caseD_3c:
      pppppdVar53 = pppppdVar38 + 1;
      uVar16 = *(uint *)pppppdVar38;
      if (*(char *)((long)local_c8[2] + 3) != '\0') {
        uVar13 = *(uint *)((long)pppppdVar38 + 4);
        pppppdVar54 = (double *****)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
        UNRECOVERED_JUMPTABLE = *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
        uVar15 = *(uint *)((long)pppppdVar54 + -4);
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        pdVar20 = *(double **)(param_1 + 0x68);
        ppppppdVar49 = pppppppdVar52[((ulong)uVar13 & 0xff) * 2];
        uVar12 = uVar15 >> 0x18;
        pdVar20[1] = (double)(pppppppdVar52 + ((ulong)uVar13 & 0xff) * 2)[1];
        *pdVar20 = (double)ppppppdVar49;
        unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar15 >> 8) * 2;
        ppppppdVar49 = pppppppdVar52[((ulong)(uVar13 >> 8) & 0xff) * 2];
        pdVar20[3] = (double)(pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2)[1];
        pdVar20[2] = (double)ppppppdVar49;
        uVar16 = (*UNRECOVERED_JUMPTABLE)
                           (param_1,unaff_x22,pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2,
                            uVar12 - 1,pdVar20,3);
        goto LAB_008c09d4;
      }
      goto LAB_008be794;
    case 0x3d:
switchD_008be7f4_caseD_3d:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (((*(char *)((long)local_c8[2] + 3) == '\0') ||
          (*(uint *)((long)pppppppdVar51 + 0x1c) != 6)) ||
         (*(uint *)((long)pppppppdVar51 + 0x2c) != 0)) goto LAB_008c1964;
      if (DAT_00d1f4f8 == '\x01') {
        uVar13 = (1 << (ulong)(*(byte *)((long)pppppppdVar51[2] + 5) & 0x1f)) +
                 *(int *)(pppppppdVar51[2] + 1);
        goto joined_r0x008c2534;
      }
LAB_008c255c:
      *(uint *)((long)pppppppdVar51 + 0xc) = 0;
      pppppppdVar51[4] = (double ******)0x0;
      pppppppdVar51[5] = (double ******)0x200000080;
LAB_008c1970:
      pppppdVar53 = (double *****)((long)pppppdVar38 + ((long)((int)uVar16 >> 0x10) + 1) * 4);
      goto LAB_008be794;
    case 0x3e:
switchD_008be7f4_caseD_3e:
      plVar27 = *(long **)(param_1 + 0x50);
      lVar50 = *plVar27;
      if (*(long *)(lVar50 + 0x50) != 0) {
        plVar27[4] = *(long *)(lVar50 + 0x30);
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x6f0);
        *(uint *)((long)plVar27 + 0x2c) = *(uint *)((long)plVar27 + 0x2c) | 4;
        iVar11 = (*UNRECOVERED_JUMPTABLE)(param_1);
        if (iVar11 == 1) goto LAB_008c352c;
        goto LAB_008c3618;
      }
      plVar27[4] = (long)pppppdVar38;
      FUN_008c9034(param_1);
      pppppdVar53 = *(double ******)(lVar50 + 0x30);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      local_c0 = *(double ******)(lVar50 + 0x28);
      goto LAB_008be794;
    case 0x3f:
switchD_008be7f4_caseD_3f:
      plVar27 = *(long **)(param_1 + 0x50);
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      uVar12 = uVar13 >> 0x10 & 0xff;
      uVar16 = (int)((ulong)((long)pppppppdVar52 - plVar27[1]) >> 4) +
               ~(uint)*(byte *)(*plVar27 + 7);
      unaff_x22 = (double *******)(ulong)uVar16;
      bVar5 = (byte)(uVar13 >> 8);
      if (uVar12 == 0) {
        plVar27[4] = (long)pppppdVar53;
        if (*(long *)(param_1 + 0x48) - *(long *)(param_1 + 0x68) <= (long)(int)(uVar16 * 0x10)) {
          FUN_008b41e4(param_1,unaff_x22);
        }
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        if (0 < (int)uVar16) {
          pppppppdVar46 = pppppppdVar52 + (long)unaff_x22 * -2;
          pppppppdVar51 = unaff_x22;
          pppppppdVar31 = pppppppdVar52 + (ulong)bVar5 * 2;
          do {
            ppppppdVar49 = *pppppppdVar46;
            pppppppdVar51 = (double *******)((long)pppppppdVar51 + -1);
            pppppppdVar31[1] = pppppppdVar46[1];
            *pppppppdVar31 = ppppppdVar49;
            pppppppdVar46 = pppppppdVar46 + 2;
            pppppppdVar31 = pppppppdVar31 + 2;
          } while (pppppppdVar51 != (double *******)0x0);
        }
        *(double ********)(param_1 + 0x68) =
             pppppppdVar52 + (ulong)bVar5 * 2 + (long)(int)uVar16 * 2;
      }
      else {
        uVar12 = uVar12 - 1;
        uVar15 = uVar12;
        if ((int)uVar16 <= (int)uVar12) {
          uVar15 = uVar16;
        }
        if (0 < (int)uVar15) {
          lVar50 = (ulong)uVar15 << 4;
          pppppppdVar51 = pppppppdVar52 + (ulong)bVar5 * 2;
          pppppppdVar46 = pppppppdVar52 + (long)(int)uVar16 * -2;
          do {
            ppppppdVar49 = *pppppppdVar46;
            lVar50 = lVar50 + -0x10;
            pppppppdVar51[1] = pppppppdVar46[1];
            *pppppppdVar51 = ppppppdVar49;
            pppppppdVar51 = pppppppdVar51 + 2;
            pppppppdVar46 = pppppppdVar46 + 2;
          } while (lVar50 != 0);
        }
        if ((int)uVar16 < (int)uVar12) {
          uVar44 = (ulong)(int)uVar16;
          uVar48 = (ulong)(uVar13 >> 0x10 & 0xff);
          uVar33 = (ulong)(uVar13 >> 8) & 0xff;
          uVar30 = ~uVar44 + uVar48;
          if (1 < uVar30) {
            lVar50 = uVar44 * 0x10;
            uVar45 = uVar30 & 0xfffffffffffffffe;
            uVar44 = uVar45 + uVar44;
            puVar34 = (undefined4 *)((long)pppppppdVar52 + lVar50 + uVar33 * 0x10 + 0x1c);
            uVar47 = uVar45;
            do {
              uVar47 = uVar47 - 2;
              puVar34[-4] = 0;
              *puVar34 = 0;
              puVar34 = puVar34 + 8;
            } while (uVar47 != 0);
            if (uVar30 == uVar45) goto LAB_008be794;
          }
          lVar50 = ~uVar44 + uVar48;
          uVar30 = uVar44 * 0x10 + uVar33 * 0x10 | 0xc;
          do {
            *(undefined4 *)((long)pppppppdVar52 + uVar30) = 0;
            lVar50 = lVar50 + -1;
            uVar30 = uVar30 + 0x10;
          } while (lVar50 != 0);
        }
      }
      goto LAB_008be794;
    case 0x40:
switchD_008be7f4_caseD_40:
      puVar36 = (uint *)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      uVar16 = (int)uVar13 >> 0x10;
      unaff_x24 = *(double ********)
                   ((long)local_c0 +
                   (-(ulong)(uVar16 >> 0x1f) & 0xfffffff000000000 | (ulong)uVar16 << 4));
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
      ppppppdVar49 = local_c8[2];
      unaff_x22 = unaff_x24;
      if (unaff_x24[2] != ppppppdVar49) {
        if (*(char *)((long)unaff_x24 + 6) == '\0') {
          ppppppdVar60 = unaff_x24[3];
          if ((DAT_00d1fdf0 == '\x01') &&
             (ppppppdVar62 = (double ******)ppppppdVar60[0x1a],
             (double ******)ppppppdVar60[0x1a] != (double ******)0x0)) {
            do {
              ppppppdVar60 = ppppppdVar62;
              unaff_x24[3] = ppppppdVar60;
              ppppppdVar62 = (double ******)ppppppdVar60[0x1a];
            } while ((double ******)ppppppdVar60[0x1a] != (double ******)0x0);
            *(undefined1 *)((long)unaff_x24 + 4) = *(undefined1 *)((long)ppppppdVar60 + 5);
          }
        }
        else {
          ppppppdVar60 = (double ******)0x0;
        }
        unaff_x22 = (double *******)
                    FUN_008b4d5c(param_1,*(undefined1 *)((long)unaff_x24 + 5),ppppppdVar49,
                                 ppppppdVar60);
      }
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      *pppppppdVar51 = (double ******)unaff_x22;
      cVar3 = *(char *)((long)unaff_x24 + 5);
      *(uint *)((long)pppppppdVar51 + 0xc) = 7;
      if (cVar3 == '\0') {
        uVar30 = 0;
      }
      else {
        iVar11 = 0;
        do {
          pppppppdVar46 = pppppppdVar52;
          if ((puVar36[iVar11] & 0xff00) != 0) {
            pppppppdVar46 = local_c8 + 4;
          }
          unaff_x23 = (double *******)
                      ((long)pppppppdVar46 + ((ulong)(puVar36[iVar11] >> 0xc) & 0xff0));
          if (unaff_x22 == unaff_x24) {
            iVar14 = FUN_008b9214(unaff_x22 + (long)iVar11 * 2 + 4,unaff_x23);
            if (iVar14 == 0) {
              if (*(char *)((long)unaff_x24 + 3) != '\0') goto LAB_008c0690;
              ppppppdVar49 = local_c8[2];
              if (*(char *)((long)unaff_x24 + 6) == '\0') {
                ppppppdVar60 = unaff_x24[3];
                if ((DAT_00d1fdf0 == '\x01') &&
                   (ppppppdVar62 = (double ******)ppppppdVar60[0x1a],
                   (double ******)ppppppdVar60[0x1a] != (double ******)0x0)) {
                  do {
                    ppppppdVar60 = ppppppdVar62;
                    unaff_x24[3] = ppppppdVar60;
                    ppppppdVar62 = (double ******)ppppppdVar60[0x1a];
                  } while ((double ******)ppppppdVar60[0x1a] != (double ******)0x0);
                  *(undefined1 *)((long)unaff_x24 + 4) = *(undefined1 *)((long)ppppppdVar60 + 5);
                }
              }
              else {
                ppppppdVar60 = (double ******)0x0;
              }
              unaff_x22 = (double *******)
                          FUN_008b4d5c(param_1,*(undefined1 *)((long)unaff_x24 + 5),ppppppdVar49,
                                       ppppppdVar60);
              *pppppppdVar51 = (double ******)unaff_x22;
              *(uint *)((long)pppppppdVar51 + 0xc) = 7;
              iVar11 = -1;
            }
          }
          else {
LAB_008c0690:
            ppppppdVar49 = *unaff_x23;
            unaff_x22[(long)iVar11 * 2 + 5] = unaff_x23[1];
            unaff_x22[(long)iVar11 * 2 + 4] = ppppppdVar49;
            if (((4 < (int)*(uint *)((long)unaff_x23 + 0xc)) &&
                ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) != 0)) &&
               (((ulong)**unaff_x23 & 0x30000) != 0)) {
              FUN_008b6188(param_1,unaff_x22);
            }
          }
          uVar30 = (ulong)*(byte *)((long)unaff_x24 + 5);
          iVar11 = iVar11 + 1;
        } while (iVar11 < (int)(uint)*(byte *)((long)unaff_x24 + 5));
      }
      *(undefined1 *)((long)unaff_x22 + 3) = 0;
      if (unaff_x24 != unaff_x22) {
        *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
        if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <=
            *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
          FUN_008b52c4(param_1,1);
        }
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        uVar30 = (ulong)*(byte *)((long)unaff_x24 + 5);
      }
      goto LAB_008c012c;
    case 0x41:
switchD_008be7f4_caseD_41:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      bVar5 = *(byte *)((long)pppppdVar38 + 1);
      uVar30 = (ulong)bVar5;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      pppppppdVar52 = *(double ********)(param_1 + 0x68);
      if (*(long *)(param_1 + 0x48) - (long)pppppppdVar52 <=
          (long)(ulong)(((uint)bVar5 + (uint)*(byte *)((long)local_c8 + 4)) * 0x10)) {
        FUN_008b41e4(param_1);
        pppppppdVar52 = *(double ********)(param_1 + 0x68);
      }
      if (bVar5 != 0) {
        pdVar20 = *(double **)(param_1 + 0x70);
        pppppppdVar51 = pppppppdVar52;
        do {
          ppppppdVar49 = (double ******)*pdVar20;
          uVar30 = uVar30 - 1;
          pppppppdVar51[1] = (double ******)pdVar20[1];
          *pppppppdVar51 = ppppppdVar49;
          *(undefined4 *)((long)pdVar20 + 0xc) = 0;
          pdVar20 = pdVar20 + 2;
          pppppppdVar51 = pppppppdVar51 + 2;
        } while (uVar30 != 0);
      }
      bVar5 = *(byte *)((long)local_c8 + 4);
      lVar50 = *(long *)(param_1 + 0x50);
      *(double ********)(lVar50 + 0x10) = pppppppdVar52;
      *(double ********)(lVar50 + 0x18) = pppppppdVar52 + (ulong)bVar5 * 2;
      *(double ********)(param_1 + 0x68) = pppppppdVar52 + (ulong)bVar5 * 2;
      *(double ********)(param_1 + 0x70) = pppppppdVar52;
      goto LAB_008be794;
    case 0x42:
switchD_008be7f4_caseD_42:
      bVar5 = *(byte *)((long)pppppdVar38 + 1);
      ppppppdVar49 = (double ******)local_c0[(ulong)*(uint *)((long)pppppdVar38 + 4) * 2];
      (pppppppdVar52 + (ulong)bVar5 * 2)[1] =
           (double ******)(local_c0 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2)[1];
      pppppppdVar52[(ulong)bVar5 * 2] = ppppppdVar49;
      pppppdVar38 = pppppdVar38 + 1;
      goto LAB_008be79c;
    case 0x43:
switchD_008be7f4_caseD_43:
      lVar50 = *(long *)(param_1 + 0x60);
      UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3608;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        lVar50 = *(long *)(param_1 + 0x60);
      }
      if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008b52c4(param_1,1);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      pppppdVar53 = (double *****)
                    ((long)pppppdVar38 + ((long)((int)*(uint *)pppppdVar38 >> 8) + 1) * 4);
      goto LAB_008be794;
    case 0x44:
switchD_008be7f4_caseD_44:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      puVar36 = (uint *)((long)pppppdVar53 + ((ulong)(*(uint *)pppppdVar38 >> 0x16) & 0x3fc));
      uVar13 = *puVar36;
      uVar16 = uVar13 >> 0x10 & 0xff;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      if (uVar16 == 0) {
        uVar16 = (uint)((ulong)(*(long *)(param_1 + 0x68) - (long)unaff_x22) >> 4);
      }
      if (*(char *)((long)local_c8[2] + 3) != '\0') {
        UNRECOVERED_JUMPTABLE =
             *(code **)(&DAT_00c4c918 + ((ulong)(*(uint *)pppppdVar38 >> 8) & 0xff) * 8);
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        uVar16 = (*UNRECOVERED_JUMPTABLE)
                           (param_1,unaff_x22,unaff_x22 + 2,(uVar13 >> 0x18) - 1,unaff_x22 + 4,
                            uVar16 - 1);
        if (-1 < (int)uVar16) {
          if ((uVar13 & 0xff000000) == 0) {
LAB_008c0944:
            pppppppdVar51 = unaff_x22 + (ulong)uVar16 * 2;
          }
          else {
            pppppppdVar51 = *(double ********)(*(long *)(param_1 + 0x50) + 0x18);
          }
          *(double ********)(param_1 + 0x68) = pppppppdVar51;
          goto LAB_008c094c;
        }
      }
      goto LAB_008be794;
    case 0x45:
switchD_008be7f4_caseD_45:
      iVar11 = (int)*(uint *)pppppdVar38 >> 8;
      if (iVar11 < 0x7fffff) {
        iVar11 = iVar11 + 1;
      }
      *(uint *)pppppdVar38 = *(uint *)pppppdVar38 & 0xff | iVar11 << 8;
LAB_008bfd24:
      pppppdVar38 = (double *****)((long)pppppdVar38 + 4);
      goto LAB_008be79c;
    case 0x46:
      goto switchD_008be7f4_caseD_46;
    case 0x47:
switchD_008be7f4_caseD_47:
      uVar16 = *(uint *)pppppdVar38;
      pppppppdVar51 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pppppppdVar46 = (double *******)(local_c0 + (ulong)(byte)(uVar16 >> 0x10) * 2);
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 3) {
        uVar55 = SUB84(*pppppppdVar46,0);
        uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
        ppppppdVar49 = *pppppppdVar51;
        goto LAB_008c1ea4;
      }
LAB_008bf608:
      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = (uint *)((long)pppppdVar38 + 4);
LAB_008bf610:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      FUN_008cc574(param_1,pppppppdVar31,pppppppdVar46,pppppppdVar51);
      break;
    case 0x48:
switchD_008be7f4_caseD_48:
      uVar13 = *(uint *)pppppdVar38;
      pppppppdVar35 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)pppppppdVar35 + 0xc);
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      pppppppdVar51 = (double *******)(local_c0 + (ulong)(byte)(uVar13 >> 0x10) * 2);
      if (uVar16 == 3) {
        ppppppdVar49 = (double ******)((double)*pppppppdVar51 / (double)*pppppppdVar35);
      }
      else {
        if (uVar16 != 4) {
          lVar50 = *(long *)(param_1 + 0x50);
          goto LAB_008c08b0;
        }
        fVar56 = (float)(double)*pppppppdVar51;
        ppppppdVar49 = (double ******)
                       CONCAT44(fVar56 / (float)((ulong)*pppppppdVar35 >> 0x20),
                                fVar56 / SUB84(*pppppppdVar35,0));
        *(float *)(pppppppdVar31 + 1) = fVar56 / *(float *)(pppppppdVar35 + 1);
      }
LAB_008be784:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      *pppppppdVar31 = ppppppdVar49;
      *(uint *)((long)pppppppdVar31 + 0xc) = uVar16;
      goto LAB_008be794;
    case 0x49:
switchD_008be7f4_caseD_49:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      if (*(char *)((long)local_c8[2] + 3) == '\0') goto LAB_008be794;
      puVar36 = (uint *)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
      uVar13 = *puVar36;
      UNRECOVERED_JUMPTABLE = *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      uVar16 = (*UNRECOVERED_JUMPTABLE)
                         (param_1,unaff_x22,pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2,
                          (uVar13 >> 0x18) - 1,0,1);
      if ((int)uVar16 < 0) goto LAB_008be794;
      if ((uVar13 & 0xff000000) == 0) goto LAB_008c0944;
LAB_008c094c:
      pppppdVar38 = (double *****)(puVar36 + 1);
      goto LAB_008be79c;
    case 0x4a:
switchD_008be7f4_caseD_4a:
      pppppdVar53 = pppppdVar38 + 1;
      uVar16 = *(uint *)pppppdVar38;
      if (*(char *)((long)local_c8[2] + 3) != '\0') {
        pppppdVar54 = (double *****)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
        pppppppdVar51 = pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2;
        uVar12 = *(uint *)((long)pppppdVar54 + -4);
        UNRECOVERED_JUMPTABLE = *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
        pppppppdVar46 = pppppppdVar52 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar12 >> 8) * 2;
        goto LAB_008c09cc;
      }
      goto LAB_008be794;
    case 0x4b:
switchD_008be7f4_caseD_4b:
      pppppdVar53 = pppppdVar38 + 1;
      uVar16 = *(uint *)pppppdVar38;
      if (*(char *)((long)local_c8[2] + 3) == '\0') goto LAB_008be794;
      pppppdVar54 = (double *****)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
      pppppppdVar51 = pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2;
      uVar12 = *(uint *)((long)pppppdVar54 + -4);
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      UNRECOVERED_JUMPTABLE = *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar12 >> 8) * 2;
      pppppppdVar46 = (double *******)(local_c0 + (ulong)uVar13 * 2);
LAB_008c09cc:
      uVar12 = uVar12 >> 0x18;
      uVar16 = (*UNRECOVERED_JUMPTABLE)(param_1,unaff_x22,pppppppdVar51,uVar12 - 1,pppppppdVar46,2);
LAB_008c09d4:
      pppppdVar53 = pppppdVar38 + 1;
      if ((int)uVar16 < 0) goto LAB_008be794;
      pppppdVar53 = pppppdVar54;
      if (uVar12 != 0) goto LAB_008be794;
      *(double ********)(param_1 + 0x68) = unaff_x22 + (ulong)uVar16 * 2;
      pppppdVar38 = pppppdVar54;
      goto LAB_008be79c;
    case 0x4c:
switchD_008be7f4_caseD_4c:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      uVar16 = *(uint *)((long)unaff_x22 + 0xc);
      if (DAT_00d1fdd0 != 1) {
        if (uVar16 != 6) {
          if (uVar16 == 7) goto LAB_008c2688;
          if (uVar16 == 8) {
            lVar50 = 8;
            goto LAB_008c23a0;
          }
          goto LAB_008c3704;
        }
        lVar50 = 0x10;
LAB_008c23a0:
        unaff_x23 = *(double ********)((long)*unaff_x22 + lVar50);
        if (unaff_x23 != (double *******)0x0) {
          bVar5 = *(byte *)((long)unaff_x23 + 6);
          if ((bVar5 >> 5 & 1) == 0) {
            if ((*(byte *)((long)unaff_x23 + 7) >> 1 & 1) != 0) goto LAB_008c2634;
            ppppppdVar49 = (double ******)
                           FUN_008bdfe0(unaff_x23,5,
                                        *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x360));
            if (ppppppdVar49 == (double ******)0x0) {
              bVar5 = *(byte *)((long)unaff_x23 + 6);
              goto LAB_008c23d8;
            }
LAB_008c263c:
            unaff_x22[3] = unaff_x22[1];
            unaff_x22[2] = *unaff_x22;
            ppppppdVar60 = (double ******)*ppppppdVar49;
            unaff_x22[1] = (double ******)ppppppdVar49[1];
            *unaff_x22 = ppppppdVar60;
            *(double ********)(param_1 + 0x68) = unaff_x22 + 4;
            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
            FUN_008b465c(param_1,unaff_x22,3);
            pppppppdVar52 = *(double ********)(param_1 + 0x70);
            uVar16 = *(uint *)((long)(pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2) + 0xc);
            *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x18);
            if (uVar16 != 0) goto LAB_008c2688;
            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
            if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
              FUN_008b399c(param_1,pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2,&DAT_002c8ca6);
            }
            goto LAB_008c37c0;
          }
LAB_008c23d8:
          if ((bVar5 >> 4 & 1) != 0) goto LAB_008c247c;
LAB_008c245c:
          if (((*(byte *)((long)unaff_x23 + 7) >> 1 & 1) != 0) ||
             (lVar50 = FUN_008bdfe0(unaff_x23,4,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x358)),
             lVar50 != 0)) goto LAB_008c2688;
        }
LAB_008c247c:
        uVar16 = *(uint *)((long)unaff_x22 + 0xc);
        goto LAB_008c2480;
      }
      if (uVar16 == 6) {
        lVar50 = 0x10;
LAB_008c2400:
        unaff_x23 = *(double ********)((long)*unaff_x22 + lVar50);
        if (unaff_x23 != (double *******)0x0) {
          if ((*(byte *)((long)unaff_x23 + 6) >> 5 & 1) == 0) {
            if ((*(byte *)((long)unaff_x23 + 7) >> 1 & 1) != 0) {
LAB_008c2634:
              ppppppdVar49 = unaff_x23[4] + -0xc;
              goto LAB_008c263c;
            }
            ppppppdVar49 = (double ******)
                           FUN_008bdfe0(unaff_x23,5,
                                        *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x360));
            if (ppppppdVar49 != (double ******)0x0) goto LAB_008c263c;
            uVar16 = *(uint *)((long)unaff_x22 + 0xc);
            bVar10 = false;
            goto LAB_008c2448;
          }
LAB_008c2454:
          if ((*(byte *)((long)unaff_x23 + 6) >> 4 & 1) == 0) goto LAB_008c245c;
        }
LAB_008c2480:
        if (uVar16 != 6) goto LAB_008c3704;
        if ((DAT_00d1f4f8 == '\x01') &&
           (iVar11 = *(int *)(*unaff_x22 + 1),
           iVar14 = 1 << (ulong)(*(byte *)((long)*unaff_x22 + 5) & 0x1f), uVar16 = iVar14 + iVar11,
           uVar16 != 0 && (int)uVar16 < 0 == SCARRY4(iVar14,iVar11))) {
          iVar11 = *(int *)(**(long **)(param_1 + 0x50) + 0x48);
          uVar12 = 0x3fffffff - iVar11;
          if (uVar12 <= uVar16) {
            uVar16 = uVar12;
          }
          *(uint *)(**(long **)(param_1 + 0x50) + 0x48) = uVar16 + iVar11;
        }
        unaff_x22[4] = (double ******)0x0;
        *(uint *)((long)unaff_x22 + 0xc) = 0;
        unaff_x22[3] = unaff_x22[1];
        unaff_x22[2] = *unaff_x22;
        unaff_x22[5] = (double ******)0x200000080;
      }
      else if (uVar16 != 7) {
        if (uVar16 == 8) {
          lVar50 = 8;
          goto LAB_008c2400;
        }
        unaff_x23 = (double *******)0x0;
        bVar10 = true;
LAB_008c2448:
        if (uVar16 == 0xc) {
          ppppppdVar49 = (double ******)FUN_008be028(param_1,unaff_x22,5);
          if (*(int *)((long)ppppppdVar49 + 0xc) != 0) goto LAB_008c263c;
          goto LAB_008c3704;
        }
        if (!bVar10) goto LAB_008c2454;
        goto LAB_008c2480;
      }
LAB_008c2688:
      pppppdVar53 = (double *****)((long)pppppdVar53 + (long)((int)uVar13 >> 0x10) * 4);
      unaff_x24 = (double *******)(ulong)uVar13;
      goto LAB_008be794;
    case 0x4d:
switchD_008be7f4_caseD_4d:
      iVar11 = (int)*(uint *)pppppdVar38 >> 0x10;
      if (-1 < (int)(*(int *)((long)pppppppdVar52 +
                             (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 0x10 + 0xc) - 1U ^
                    *(uint *)((long)pppppdVar38 + 4))) {
        iVar11 = 1;
      }
      pppppdVar53 = (double *****)((uint *)((long)pppppdVar38 + 4) + iVar11);
      goto LAB_008be794;
    case 0x4e:
switchD_008be7f4_caseD_4e:
      uVar16 = *(uint *)pppppdVar38;
      if (*(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) == 1) {
        uVar13 = (uint)(*(uint *)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) ==
                       (*(uint *)((long)pppppdVar38 + 4) & 1));
      }
      else {
        uVar13 = 0;
      }
      bVar10 = uVar13 == -((int)*(uint *)((long)pppppdVar38 + 4) >> 0x1f);
      goto LAB_008c1fb0;
    case 0x4f:
switchD_008be7f4_caseD_4f:
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      bVar10 = *(uint *)((long)pppppppdVar51 + 0xc) == 3;
      if ((int)*(uint *)((long)pppppdVar38 + 4) < 0) {
        if ((!bVar10) ||
           ((double)*pppppppdVar51 !=
            (double)local_c0[((ulong)*(uint *)((long)pppppdVar38 + 4) & 0xffffff) * 2]))
        goto LAB_008c0ba0;
      }
      else if ((bVar10) &&
              ((double)*pppppppdVar51 ==
               (double)local_c0[((ulong)*(uint *)((long)pppppdVar38 + 4) & 0xffffff) * 2])) {
LAB_008c0ba0:
        uVar30 = (long)((ulong)*(uint *)pppppdVar38 << 0x20) >> 0x30;
        goto LAB_008c012c;
      }
      uVar30 = 1;
LAB_008c012c:
      pppppdVar38 = (double *****)((long)pppppdVar38 + (uVar30 + 1) * 4);
      goto LAB_008be79c;
    case 0x50:
switchD_008be7f4_caseD_50:
      uVar16 = *(uint *)pppppdVar38;
      if (*(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) == 5) {
        uVar13 = (uint)(pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] ==
                       (double ******)
                       local_c0[((ulong)*(uint *)((long)pppppdVar38 + 4) & 0xffffff) * 2]);
      }
      else {
        uVar13 = 0;
      }
      bVar10 = uVar13 == -((int)*(uint *)((long)pppppdVar38 + 4) >> 0x1f);
LAB_008c1fb0:
      iVar11 = (int)uVar16 >> 0x10;
      if (bVar10) {
        iVar11 = 1;
      }
      pppppdVar53 = (double *****)((long)pppppdVar38 + ((long)iVar11 + 1) * 4);
      goto LAB_008be794;
    case 0x51:
switchD_008be7f4_caseD_51:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      uVar44 = (ulong)uVar16;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      unaff_x24 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
      uVar16 = *(uint *)((long)unaff_x23 + 0xc);
      if (uVar16 == 3) {
        uVar16 = *(uint *)((long)unaff_x24 + 0xc);
        if (uVar16 == 3) {
          uVar55 = SUB84(*unaff_x23,0);
          uVar58 = (undefined4)((ulong)*unaff_x23 >> 0x20);
          ppppppdVar49 = *unaff_x24;
          goto LAB_008c13e4;
        }
        pppppppdVar51 = unaff_x24;
LAB_008bf810:
        if (((uVar16 == 8) &&
            (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar51,0xc), plVar27 != (long *)0x0)) &&
           (*(int *)((long)plVar27 + 0xc) == 7)) {
          pppppppdVar46 = unaff_x22;
          pppppppdVar51 = unaff_x23;
          if (*(char *)(*plVar27 + 6) != '\0') goto LAB_008bf6dc;
        }
      }
      else {
        pppppppdVar51 = unaff_x23;
        if (uVar16 != 4) goto LAB_008bf810;
        if (*(uint *)((long)unaff_x24 + 0xc) == 3) {
          uVar55 = SUB84(*unaff_x24,0);
          uVar58 = (undefined4)((ulong)*unaff_x24 >> 0x20);
          goto LAB_008c300c;
        }
      }
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008ccd18(param_1,unaff_x22,unaff_x23,unaff_x24);
      break;
    case 0x52:
switchD_008be7f4_caseD_52:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar13 = *(uint *)pppppdVar38;
      unaff_x23 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      uVar30 = (ulong)(uVar13 >> 0x14) & 0xff0;
      uVar16 = *(uint *)((long)unaff_x23 + 0xc);
      if (uVar16 != 3) {
        if (uVar16 == 4) {
          uVar55 = (undefined4)*(undefined8 *)((long)local_c0 + uVar30);
          uVar58 = (undefined4)((ulong)*(undefined8 *)((long)local_c0 + uVar30) >> 0x20);
LAB_008c300c:
          fVar56 = (float)(double)CONCAT44(uVar58,uVar55);
          fVar59 = (float)(double)(long)(*(float *)(unaff_x23 + 1) / fVar56);
          fVar57 = (float)(double)(long)(SUB84(*unaff_x23,0) / fVar56);
          fVar56 = (float)(double)(long)((float)((ulong)*unaff_x23 >> 0x20) / fVar56);
          pppppppdVar31 = unaff_x22;
          pppppppdVar51 = unaff_x23;
          pppppppdVar35 = unaff_x24;
LAB_008c3040:
          ppppppdVar49 = (double ******)CONCAT44(fVar56,fVar57);
          *(float *)(pppppppdVar31 + 1) = fVar59;
          uVar16 = 4;
          unaff_x22 = pppppppdVar31;
          unaff_x23 = pppppppdVar51;
          unaff_x24 = pppppppdVar35;
          goto LAB_008c1dd8;
        }
        if ((((uVar16 != 8) ||
             (plVar27 = (long *)FUN_008be028(param_1,unaff_x23,0xc), plVar27 == (long *)0x0)) ||
            (*(int *)((long)plVar27 + 0xc) != 7)) || (*(char *)(*plVar27 + 6) == '\0')) {
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          FUN_008ccd18(param_1,unaff_x22,unaff_x23,(long)local_c0 + uVar30);
          break;
        }
        plVar29 = *(long **)(param_1 + 0x68);
        lVar50 = *plVar27;
        plVar29[1] = plVar27[1];
        *plVar29 = lVar50;
        ppppppdVar49 = unaff_x23[1];
        uVar55 = SUB84(*unaff_x23,0);
        uVar58 = (undefined4)((ulong)*unaff_x23 >> 0x20);
        pppppppdVar46 = unaff_x22;
        pppppppdVar51 = unaff_x23;
LAB_008bfa1c:
        uVar44 = (ulong)uVar13;
        plVar29[3] = (long)ppppppdVar49;
        plVar29[2] = CONCAT44(uVar58,uVar55);
        ppppppdVar49 = (double ******)((undefined8 *)((long)local_c0 + uVar30))[1];
        uVar23 = *(undefined8 *)((long)local_c0 + uVar30);
        uVar55 = (undefined4)uVar23;
        uVar58 = (undefined4)((ulong)uVar23 >> 0x20);
        goto LAB_008bfa28;
      }
      uVar55 = SUB84(*unaff_x23,0);
      uVar58 = (undefined4)((ulong)*unaff_x23 >> 0x20);
      ppppppdVar49 = *(double *******)((long)local_c0 + uVar30);
LAB_008c13e4:
      uVar16 = 3;
      ppppppdVar49 = (double ******)(long)((double)CONCAT44(uVar58,uVar55) / (double)ppppppdVar49);
LAB_008c1dd8:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      *unaff_x22 = ppppppdVar49;
      *(uint *)((long)unaff_x22 + 0xc) = uVar16;
      goto LAB_008be794;
    case 0x53:
switchD_008be7f4_caseD_53:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      unaff_x24 = (double *******)(ulong)uVar13;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 8) {
        ppppppdVar49 = *pppppppdVar51;
        unaff_x22 = (double *******)(ulong)*(byte *)((long)ppppppdVar49 + 3);
        lVar50 = *(long *)(param_1 + 0x60) + (long)unaff_x22 * 0x48;
        UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x960);
        if ((UNRECOVERED_JUMPTABLE != (code *)0x0) && (*(int *)(lVar50 + 0x93c) != 0)) {
          puVar22 = *(undefined8 **)(param_1 + 0x68);
          uVar23 = *(undefined8 *)(lVar50 + 0x930);
          pppppdVar53 = pppppdVar38 + 1;
          puVar22[1] = *(undefined8 *)(lVar50 + 0x938);
          *puVar22 = uVar23;
          ppppppdVar60 = *pppppppdVar51;
          pppppdVar54 = local_c0 + (ulong)(ushort)uVar13 * 2;
          puVar22[3] = pppppppdVar51[1];
          puVar22[2] = ppppppdVar60;
          ppppdVar21 = *pppppdVar54;
          puVar22[5] = pppppdVar54[1];
          puVar22[4] = ppppdVar21;
          *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x30;
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          sVar6 = *(short *)(param_1 + 0x28);
          *(short *)(param_1 + 0x28) = sVar6 + 1;
          if (199 < (ushort)(sVar6 + 1U)) {
            FUN_008b42d8(param_1);
          }
          FUN_008be620(param_1,1,puVar22);
          local_ac[0] = (ushort)(uVar13 >> 0x10);
          (*UNRECOVERED_JUMPTABLE)
                    (param_1,ppppppdVar49 + 2,(long)*(short *)((long)*pppppdVar54 + 6),local_ac,
                     unaff_x22);
          if ((uVar13 >> 0x10 != (uint)local_ac[0]) && (*(char *)pppppdVar38 == 'S')) {
            *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff | (uint)local_ac[0] << 0x10;
          }
          lVar50 = *(long *)(param_1 + 0x50);
          pppppppdVar52 = *(double ********)(lVar50 + -0x20);
          *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
          *(long *)(param_1 + 0x50) = lVar50 + -0x30;
          *(double ********)(param_1 + 0x70) = pppppppdVar52;
          ppppppdVar49 = *(double *******)(*(long *)(param_1 + 0x68) + -0x10);
          (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
               *(double *******)(*(long *)(param_1 + 0x68) + -8);
          pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
          *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(lVar50 + -0x18);
          unaff_x23 = (double *******)(ulong)(uVar13 >> 0x10);
          goto LAB_008be794;
        }
      }
      *(uint *)pppppdVar38 = uVar16 & 0xffffff00 | 0xf;
      *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff;
switchD_008be7f4_caseD_f:
      uVar16 = *(uint *)pppppdVar38;
      pppppdVar53 = pppppdVar38 + 1;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
      pppppppdVar31 = (double *******)(local_c0 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2);
      unaff_x22 = pppppppdVar51;
      if (uVar13 == 6) {
        unaff_x23 = (double *******)*pppppppdVar46;
        uVar16 = (uint)*(byte *)((long)unaff_x23 + 4) & uVar16 >> 0x18;
        ppppppdVar49 = unaff_x23[5] + (ulong)uVar16 * 4;
        if ((((*(uint *)((long)ppppppdVar49 + 0x1c) & 0xf) == 5) &&
            ((double ******)ppppppdVar49[2] == *pppppppdVar31)) &&
           (*(int *)((long)ppppppdVar49 + 0xc) != 0)) {
          ppppppdVar60 = (double ******)*ppppppdVar49;
          pppppppdVar51[1] = (double ******)ppppppdVar49[1];
          *pppppppdVar51 = ppppppdVar60;
          goto LAB_008be794;
        }
        if (unaff_x23[2] == (double ******)0x0) {
          unaff_x24 = (double *******)FUN_008bb440(unaff_x23,*pppppppdVar31);
          pppppppdVar46 = (double *******)FUN_008bb3b0(&DWORD_007f2ef0);
          if (unaff_x24 != pppppppdVar46) {
            *(char *)((long)pppppdVar38 + 3) =
                 (char)((int)unaff_x24 - *(uint *)(unaff_x23 + 5) >> 5);
          }
          ppppppdVar49 = *unaff_x24;
          pppppppdVar51[1] = unaff_x24[1];
          *pppppppdVar51 = ppppppdVar49;
          goto LAB_008be794;
        }
        *(uint *)(param_1 + 0x2c) = uVar16;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
LAB_008c20bc:
        FUN_008cadd4(param_1,pppppppdVar46,pppppppdVar31,pppppppdVar51);
      }
      else {
        pppppppdVar24 = (double *******)((ulong)(uVar16 >> 8) & 0xff);
        unaff_x23 = pppppppdVar24;
        if (uVar13 != 8) {
LAB_008c3268:
          if (uVar13 == 4) {
            uVar13 = (*(byte *)(*pppppppdVar31 + 3) | 0x20) - 0x78;
            if ((uVar13 < 3) && (*(char *)((long)*pppppppdVar31 + 0x19) == '\0')) {
              fVar56 = *(float *)((long)pppppppdVar46 + (ulong)uVar13 * 4);
              *(uint *)((long)pppppppdVar51 + 0xc) = 3;
              *pppppppdVar51 = (double ******)(double)fVar56;
              goto LAB_008be794;
            }
            lVar50 = *(long *)(*(long *)(param_1 + 0x60) + 0x468);
            if ((lVar50 != 0) && ((*(byte *)(lVar50 + 6) & 1) == 0)) {
              if ((*(byte *)(lVar50 + 7) >> 1 & 1) == 0) {
                ppppdVar21 = (double ****)
                             FUN_008bdfe0(lVar50,0,*(undefined8 *)
                                                    (*(long *)(param_1 + 0x60) + 0x338));
                if (ppppdVar21 == (double ****)0x0) goto LAB_008c32e8;
              }
              else {
                ppppdVar21 = (double ****)(*(long *)(lVar50 + 0x20) + -0x10);
              }
              if ((*(int *)((long)ppppdVar21 + 0xc) == 7) &&
                 (*(char *)((long)*ppppdVar21 + 6) != '\0')) goto LAB_008c333c;
            }
          }
          else if ((uVar13 == 0xc) && ((DAT_00d1fdd0 & 1) != 0)) {
            ppppppdVar49 = *pppppppdVar46;
            uVar16 = uVar16 >> 0x18;
            pppppdVar54 = ppppppdVar49[2];
            unaff_x23 = pppppppdVar46;
            unaff_x24 = pppppppdVar31;
            if ((uVar16 < *(int *)((long)pppppdVar54 + 0x5c) - (uint)*(byte *)(pppppdVar54 + 0xd))
               && (*pppppppdVar31 == (double ******)pppppdVar54[8][uVar16])) {
              if (uVar16 < *(uint *)(pppppdVar54 + 0xb)) {
                pppppdVar38 = ppppppdVar49[4] + (ulong)uVar16 * 2;
              }
              else {
                pppppdVar38 = (double *****)
                              (pppppdVar54[5] + (ulong)(uVar16 - *(uint *)(pppppdVar54 + 0xb)) * 2);
              }
              ppppppdVar49 = (double ******)*pppppdVar38;
              pppppppdVar51[1] = (double ******)pppppdVar38[1];
              *pppppppdVar51 = ppppppdVar49;
            }
            else {
              pdVar20 = (double *)FUN_008bb440(pppppdVar54[7]);
              if (*(int *)((long)pdVar20 + 0xc) == 0) {
LAB_008c379c:
                if (*(long *)(lVar17 + 0x28) == local_68) {
                  FUN_008b3c58(param_1,pppppppdVar46,pppppppdVar31);
                }
                goto LAB_008c37c0;
              }
              uVar13 = (uint)*pdVar20;
              uVar16 = *(uint *)(ppppppdVar49[2] + 0xb);
              ppppppdVar60 = ppppppdVar49 + 4;
              if (uVar16 <= uVar13) {
                ppppppdVar60 = (double ******)(ppppppdVar49[2] + 5);
              }
              uVar12 = 0;
              if (uVar16 <= uVar13) {
                uVar12 = uVar16;
              }
              ppppppdVar49 = (double ******)(*ppppppdVar60)[(ulong)(uVar13 - uVar12) * 2];
              pppppppdVar51[1] = (double ******)(*ppppppdVar60 + (ulong)(uVar13 - uVar12) * 2)[1];
              *pppppppdVar51 = ppppppdVar49;
              *(char *)((long)pppppdVar38 + 3) = (char)uVar13;
            }
            goto LAB_008be794;
          }
LAB_008c32e8:
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          FUN_008cadd4(param_1,pppppppdVar46,pppppppdVar31,pppppppdVar51);
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
          goto LAB_008be794;
        }
        ppppppdVar49 = *pppppppdVar46;
        unaff_x24 = *(double ********)
                     (*(long *)(param_1 + 0x60) + (ulong)*(byte *)((long)ppppppdVar49 + 3) * 8 +
                     0x5068);
        if (unaff_x24 != (double *******)0x0) {
          ppppppdVar60 = unaff_x24[5] +
                         (ulong)((uint)*(byte *)((long)unaff_x24 + 4) & uVar16 >> 0x18) * 4;
          if ((((*(uint *)((long)ppppppdVar60 + 0x1c) & 0xf) == 5) &&
              ((double ******)ppppppdVar60[2] == *pppppppdVar31)) &&
             (*(int *)((long)ppppppdVar60 + 0xc) != 0)) {
            pppppdVar38 = *ppppppdVar60;
          }
          else {
            puVar22 = (undefined8 *)FUN_008bb440(unaff_x24,*pppppppdVar31);
            if (*(int *)((long)puVar22 + 0xc) == 0) {
              uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
              if (uVar13 != 8) goto LAB_008c3268;
              goto LAB_008c31fc;
            }
            *(char *)((long)pppppdVar38 + 3) = (char)((int)puVar22 - *(uint *)(unaff_x24 + 5) >> 5);
            pppppdVar38 = (double *****)*puVar22;
            ppppppdVar49 = *pppppppdVar46;
          }
          (*(code *)pppppdVar38)(ppppppdVar49 + 2,pppppppdVar51);
          goto LAB_008be794;
        }
LAB_008c31fc:
        pppppdVar54 = (*pppppppdVar46)[1];
        if ((pppppdVar54 == (double *****)0x0) || (((ulong)*pppppdVar54 & 0x1000000000000) != 0)) {
LAB_008c3264:
          uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
          goto LAB_008c3268;
        }
        if ((*(byte *)((long)pppppdVar54 + 7) >> 1 & 1) == 0) {
          ppppdVar21 = (double ****)
                       FUN_008bdfe0(pppppdVar54,0,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338)
                                   );
          if (ppppdVar21 == (double ****)0x0) goto LAB_008c3264;
        }
        else {
          ppppdVar21 = pppppdVar54[4] + -2;
        }
        if ((*(int *)((long)ppppdVar21 + 0xc) != 7) || (*(char *)((long)*ppppdVar21 + 6) == '\0'))
        goto LAB_008c3264;
LAB_008c333c:
        puVar22 = *(undefined8 **)(param_1 + 0x68);
        pppdVar7 = *ppppdVar21;
        puVar22[1] = ppppdVar21[1];
        *puVar22 = pppdVar7;
        ppppppdVar49 = *pppppppdVar46;
        uVar23 = 2;
        puVar22[3] = pppppppdVar46[1];
        puVar22[2] = ppppppdVar49;
        ppppppdVar49 = *pppppppdVar31;
        puVar22[5] = pppppppdVar31[1];
        puVar22[4] = ppppppdVar49;
        *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
        lVar50 = *(long *)(param_1 + 0x50);
        *(uint *)(param_1 + 0x2c) = uVar16 >> 0x18;
LAB_008c3378:
        *(double ******)(lVar50 + 0x20) = pppppdVar38 + 1;
        FUN_008cd928(param_1,uVar23,pppppppdVar24);
        unaff_x22 = pppppppdVar51;
      }
LAB_008c20c0:
      pppppdVar53 = pppppdVar38 + 1;
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      *(undefined1 *)((long)pppppdVar38 + 3) = *(undefined1 *)(param_1 + 0x2c);
      goto LAB_008be794;
    case 0x54:
switchD_008be7f4_caseD_54:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 8) {
        unaff_x24 = (double *******)*pppppppdVar51;
        unaff_x22 = (double *******)(ulong)*(byte *)((long)unaff_x24 + 3);
        lVar50 = *(long *)(param_1 + 0x60) + (long)unaff_x22 * 0x48;
        UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x968);
        if ((UNRECOVERED_JUMPTABLE != (code *)0x0) && (*(int *)(lVar50 + 0x94c) != 0)) {
          unaff_x23 = *(double ********)(param_1 + 0x68);
          ppppppdVar49 = *(double *******)(lVar50 + 0x940);
          unaff_x23[1] = *(double *******)(lVar50 + 0x948);
          *unaff_x23 = ppppppdVar49;
          ppppppdVar49 = *pppppppdVar51;
          pppppdVar53 = local_c0 + (ulong)(ushort)uVar13 * 2;
          unaff_x23[3] = pppppppdVar51[1];
          unaff_x23[2] = ppppppdVar49;
          ppppppdVar49 = (double ******)*pppppdVar53;
          unaff_x23[5] = (double ******)pppppdVar53[1];
          unaff_x23[4] = ppppppdVar49;
          ppppppdVar49 = pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2];
          unaff_x23[7] = (pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2)[1];
          unaff_x23[6] = ppppppdVar49;
          *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x40;
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38 + 1;
          sVar6 = *(short *)(param_1 + 0x28);
          *(short *)(param_1 + 0x28) = sVar6 + 1;
          if (199 < (ushort)(sVar6 + 1U)) {
            FUN_008b42d8(param_1);
          }
          FUN_008be620(param_1,0,unaff_x23);
          local_b0[0] = (ushort)(uVar13 >> 0x10);
          (*UNRECOVERED_JUMPTABLE)
                    (param_1,unaff_x24 + 2,(long)*(short *)((long)*pppppdVar53 + 6),local_b0,
                     unaff_x22);
          if ((uVar13 >> 0x10 != (uint)local_b0[0]) && (*(char *)pppppdVar38 == 'T')) {
            *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff | (uint)local_b0[0] << 0x10;
          }
          pauVar1 = (undefined1 (*) [16])(*(long *)(param_1 + 0x50) + -0x20);
          pppppppdVar52 = *(double ********)*pauVar1;
          auVar8 = *pauVar1;
          auVar61 = *pauVar1;
          *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
          auVar61 = NEON_ext(auVar61,auVar8,8,1);
          *(long *)(param_1 + 0x50) = *(long *)(param_1 + 0x50) + -0x30;
          *(long *)(param_1 + 0x70) = auVar61._8_8_;
          *(long *)(param_1 + 0x68) = auVar61._0_8_;
          pppppdVar38 = pppppdVar38 + 1;
          goto LAB_008be79c;
        }
      }
      *(uint *)pppppdVar38 = uVar16 & 0xffffff00 | 0x10;
      *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff;
      pppppppdVar51 = unaff_x22;
switchD_008be7f4_caseD_10:
      uVar16 = *(uint *)pppppdVar38;
      pppppdVar53 = pppppdVar38 + 1;
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pppppppdVar35 = (double *******)(local_c0 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2);
      if (*(uint *)((long)pppppppdVar46 + 0xc) == 6) {
        unaff_x22 = (double *******)*pppppppdVar46;
        uVar16 = (uint)*(byte *)((long)unaff_x22 + 4) & uVar16 >> 0x18;
        ppppppdVar49 = unaff_x22[5] + (ulong)uVar16 * 4;
        if ((((*(uint *)((long)ppppppdVar49 + 0x1c) & 0xf) == 5) &&
            ((double ******)ppppppdVar49[2] == *pppppppdVar35)) &&
           ((*(int *)((long)ppppppdVar49 + 0xc) != 0 && (*(char *)((long)unaff_x22 + 7) == '\0'))))
        {
          ppppppdVar60 = *pppppppdVar31;
          ppppppdVar49[1] = (double *****)pppppppdVar31[1];
          *ppppppdVar49 = (double *****)ppppppdVar60;
          if (4 < (int)*(uint *)((long)pppppppdVar31 + 0xc)) {
            if ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) != 0) {
              bVar5 = *(byte *)((long)*pppppppdVar31 + 2);
LAB_008bea7c:
              if ((bVar5 & 3) != 0) {
                FUN_008b6370(param_1,unaff_x22);
              }
            }
          }
          goto LAB_008be794;
        }
        if (unaff_x22[2] == (double ******)0x0) {
          lVar50 = *(long *)(param_1 + 0x50);
LAB_008beaa8:
          if (*(char *)((long)unaff_x22 + 7) == '\0') {
            *(double ******)(lVar50 + 0x20) = pppppdVar53;
            pdVar20 = (double *)FUN_008bce4c(param_1,unaff_x22,*pppppppdVar35);
            *(char *)((long)pppppdVar38 + 3) = (char)((int)pdVar20 - *(uint *)(unaff_x22 + 5) >> 5);
            ppppppdVar49 = *pppppppdVar31;
            pdVar20[1] = (double)pppppppdVar31[1];
            *pdVar20 = (double)ppppppdVar49;
            if (4 < (int)*(uint *)((long)pppppppdVar31 + 0xc)) {
              if ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) != 0) {
                bVar5 = *(byte *)((long)*pppppppdVar31 + 2);
                goto LAB_008bea7c;
              }
            }
            goto LAB_008be794;
          }
        }
        else {
          lVar50 = *(long *)(param_1 + 0x50);
          if ((*(byte *)((long)unaff_x22[2] + 6) >> 1 & 1) != 0) goto LAB_008beaa8;
        }
        *(uint *)(param_1 + 0x2c) = uVar16;
LAB_008c2b94:
        *(double ******)(lVar50 + 0x20) = pppppdVar38 + 1;
        FUN_008cb374(param_1,pppppppdVar46);
        goto LAB_008c20c0;
      }
      if (*(uint *)((long)pppppppdVar46 + 0xc) == 8) {
        pppppdVar54 = (*pppppppdVar46)[1];
        if (pppppdVar54 == (double *****)0x0) goto LAB_008c3184;
        if ((*(byte *)((long)pppppdVar54 + 6) >> 1 & 1) != 0) goto LAB_008c3184;
        if ((*(byte *)((long)pppppdVar54 + 7) >> 1 & 1) == 0) {
          ppppdVar21 = (double ****)
                       FUN_008bdfe0(pppppdVar54,1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x340)
                                   );
          pppppppdVar51 = pppppppdVar35;
          unaff_x23 = pppppppdVar31;
          if (ppppdVar21 == (double ****)0x0) goto LAB_008c3184;
        }
        else {
          ppppdVar21 = pppppdVar54[4] + -4;
        }
        if (*(int *)((long)ppppdVar21 + 0xc) != 7) goto LAB_008c3184;
        if (*(char *)((long)*ppppdVar21 + 6) == '\0') goto LAB_008c3184;
        puVar22 = *(undefined8 **)(param_1 + 0x68);
        pppdVar7 = *ppppdVar21;
        puVar22[1] = ppppdVar21[1];
        *puVar22 = pppdVar7;
        ppppppdVar49 = *pppppppdVar46;
        uVar23 = 3;
        puVar22[3] = pppppppdVar46[1];
        puVar22[2] = ppppppdVar49;
        ppppppdVar49 = *pppppppdVar35;
        pppppppdVar24 = (double *******)0xffffffff;
        puVar22[5] = pppppppdVar35[1];
        puVar22[4] = ppppppdVar49;
        ppppppdVar49 = *pppppppdVar31;
        puVar22[7] = pppppppdVar31[1];
        puVar22[6] = ppppppdVar49;
        *(undefined8 **)(param_1 + 0x68) = puVar22 + 8;
        lVar50 = *(long *)(param_1 + 0x50);
        *(uint *)(param_1 + 0x2c) = uVar16 >> 0x18;
        goto LAB_008c3378;
      }
LAB_008c3184:
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      FUN_008cb374(param_1);
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      unaff_x22 = pppppppdVar51;
      goto LAB_008be794;
    case 0x55:
switchD_008be7f4_caseD_55:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 8) {
        ppppppdVar49 = *pppppppdVar51;
        unaff_x23 = (double *******)(ulong)*(byte *)((long)ppppppdVar49 + 3);
        lVar50 = *(long *)(param_1 + 0x60) + (long)unaff_x23 * 0x48;
        UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x970);
        if ((UNRECOVERED_JUMPTABLE != (code *)0x0) && (*(int *)(lVar50 + 0x95c) != 0)) {
          ppppppdVar60 = *pppppppdVar51;
          pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
          pppppppdVar52[3] = pppppppdVar51[1];
          pppppppdVar52[2] = ppppppdVar60;
          ppppppdVar60 = *(double *******)(lVar50 + 0x950);
          pppppppdVar52[1] = *(double *******)(lVar50 + 0x958);
          *pppppppdVar52 = ppppppdVar60;
          uVar16 = *(uint *)(pppppdVar38 + 1);
          unaff_x24 = (double *******)(ulong)uVar16;
          lVar50 = 0x10;
          if ((uVar16 & 0xff) != 0x57) {
            lVar50 = 0xc;
          }
          pppppdVar53 = (double *****)((long)pppppdVar38 + lVar50);
          uVar30 = (ulong)(uVar16 >> 0x10) & 0xff;
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          *(double *****)(param_1 + 8) = local_c0[(ulong)(ushort)uVar13 * 2];
          if ((int)uVar30 == 0) {
            pppppppdVar52 = *(double ********)(param_1 + 0x68);
          }
          else {
            pppppppdVar52 = pppppppdVar52 + uVar30 * 2;
          }
          *(double ********)(param_1 + 0x68) = pppppppdVar52;
          uVar12 = (uVar16 >> 0x18) - 1;
          unaff_x22 = (double *******)(ulong)uVar12;
          FUN_008be620(param_1,unaff_x22);
          local_b4[0] = (ushort)(uVar13 >> 0x10);
          uVar15 = (*UNRECOVERED_JUMPTABLE)
                             (param_1,ppppppdVar49 + 2,
                              (long)*(short *)((long)local_c0[(ulong)(ushort)uVar13 * 2] + 6),
                              local_b4,unaff_x23);
          if ((uVar13 >> 0x10 != (uint)local_b4[0]) && (*(char *)pppppdVar38 == 'U')) {
            *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff | (uint)local_b4[0] << 0x10;
          }
          if (-1 < (int)uVar15) {
            lVar50 = *(long *)(param_1 + 0x50);
            puVar22 = *(undefined8 **)(lVar50 + 8);
            if ((uVar12 != 0) && (uVar15 != 0)) {
              puVar32 = *(undefined8 **)(param_1 + 0x68);
              puVar37 = puVar22;
              puVar40 = puVar32 + (ulong)uVar15 * -2;
              do {
                puVar39 = puVar40 + 2;
                uVar23 = *puVar40;
                uVar13 = (int)unaff_x22 - 1;
                unaff_x22 = (double *******)(ulong)uVar13;
                puVar22 = puVar37 + 2;
                puVar37[1] = puVar40[1];
                *puVar37 = uVar23;
                if (uVar13 == 0) break;
                puVar37 = puVar22;
                puVar40 = puVar39;
              } while (puVar39 < puVar32);
            }
            iVar11 = (int)unaff_x22;
            if (0 < iVar11) {
              if (iVar11 == 1) {
                puVar37 = puVar22;
                pppppppdVar51 = unaff_x22;
              }
              else {
                pppppppdVar46 = (double *******)((ulong)unaff_x22 & 0x7ffffffe);
                puVar37 = puVar22 + (long)pppppppdVar46 * 2;
                pppppppdVar51 = (double *******)(ulong)(uint)(iVar11 - (int)pppppppdVar46);
                puVar34 = (undefined4 *)((long)puVar22 + 0x1c);
                pppppppdVar52 = pppppppdVar46;
                do {
                  pppppppdVar52 = (double *******)((long)pppppppdVar52 + -2);
                  puVar34[-4] = 0;
                  *puVar34 = 0;
                  puVar34 = puVar34 + 8;
                } while (pppppppdVar52 != (double *******)0x0);
                bVar10 = pppppppdVar46 == unaff_x22;
                puVar22 = puVar37;
                unaff_x22 = pppppppdVar51;
                if (bVar10) goto LAB_008c0f44;
              }
              uVar13 = (int)pppppppdVar51 + 1;
              do {
                uVar13 = uVar13 - 1;
                *(undefined4 *)((long)puVar37 + 0xc) = 0;
                puVar22 = puVar37 + 2;
                puVar37 = puVar37 + 2;
                unaff_x22 = pppppppdVar51;
              } while (1 < uVar13);
            }
LAB_008c0f44:
            pppppppdVar52 = *(double ********)(lVar50 + -0x20);
            goto LAB_008bf428;
          }
          goto LAB_008c3618;
        }
      }
      *(uint *)pppppdVar38 = uVar16 & 0xffffff00 | 0x14;
      *(uint *)((long)pppppdVar38 + 4) = uVar13 & 0xffff;
switchD_008be7f4_caseD_14:
      uVar16 = *(uint *)pppppdVar38;
      pppppdVar53 = pppppdVar38 + 1;
      unaff_x24 = (double *******)((ulong)(uVar16 >> 8) & 0xff);
      pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
      unaff_x22 = (double *******)(local_c0 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2);
      if (uVar13 == 6) {
        ppppppdVar49 = *pppppppdVar46;
        pppppdVar54 = ppppppdVar49[5] +
                      (ulong)(*(uint *)(*unaff_x22 + 2) &
                             (-1 << (ulong)(*(byte *)((long)ppppppdVar49 + 5) & 0x1f) ^ 0xffffffffU)
                             ) * 4;
        if ((((*(uint *)((long)pppppdVar54 + 0x1c) & 0xf) == 5) &&
            ((double ******)pppppdVar54[2] == *unaff_x22)) &&
           (*(int *)((long)pppppdVar54 + 0xc) != 0)) {
          ppppppdVar49 = *pppppppdVar46;
          pppppppdVar51[3] = pppppppdVar46[1];
          pppppppdVar51[2] = ppppppdVar49;
LAB_008c1bf8:
          pppppdVar53 = pppppdVar38 + 1;
          ppppppdVar49 = (double ******)*pppppdVar54;
          pppppppdVar51[1] = (double ******)pppppdVar54[1];
          *pppppppdVar51 = ppppppdVar49;
          goto LAB_008be794;
        }
        if (((*(uint *)((long)pppppdVar54 + 0x1c) < 0x10) &&
            (pppppdVar54 = ppppppdVar49[2], pppppdVar54 != (double *****)0x0)) &&
           (((ulong)*pppppdVar54 & 0x1000000000000) == 0)) {
          if ((*(byte *)((long)pppppdVar54 + 7) >> 1 & 1) == 0) {
            ppppdVar21 = (double ****)
                         FUN_008bdfe0(pppppdVar54,0,
                                      *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338));
            if (ppppdVar21 == (double ****)0x0) goto LAB_008bed00;
          }
          else {
            ppppdVar21 = pppppdVar54[4] + -2;
          }
          if (*(int *)((long)ppppdVar21 + 0xc) == 6) {
            ppdVar28 = (*ppppdVar21)[5];
            if (((ppdVar28 != (double **)0x0) &&
                (ppdVar28 = ppdVar28 +
                            (ulong)((uint)*(byte *)((long)*ppppdVar21 + 4) & uVar16 >> 0x18) * 4,
                (*(uint *)((long)ppdVar28 + 0x1c) & 0xf) == 5)) &&
               (((double ******)ppdVar28[2] == *unaff_x22 && (*(int *)((long)ppdVar28 + 0xc) != 0)))
               ) {
              ppppppdVar49 = *pppppppdVar46;
              pppppppdVar51[3] = pppppppdVar46[1];
              pppppppdVar51[2] = ppppppdVar49;
              ppppppdVar49 = (double ******)*ppdVar28;
              pppppppdVar51[1] = (double ******)ppdVar28[1];
              *pppppppdVar51 = ppppppdVar49;
              goto LAB_008be794;
            }
          }
        }
LAB_008bed00:
        ppppppdVar49 = pppppppdVar46[1];
        uVar55 = SUB84(*pppppppdVar46,0);
        uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
        uVar16 = uVar16 >> 0x18;
LAB_008bed08:
        pppppppdVar51[3] = ppppppdVar49;
        pppppppdVar51[2] = (double ******)CONCAT44(uVar58,uVar55);
        *(uint *)(param_1 + 0x2c) = uVar16;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008cadd4(param_1,pppppppdVar46,unaff_x22);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        pppppppdVar51 = pppppppdVar52 + (long)unaff_x24 * 2;
        *(undefined1 *)((long)pppppdVar38 + 3) = *(undefined1 *)(param_1 + 0x2c);
LAB_008bed34:
        if (*(uint *)((long)pppppppdVar51 + 0xc) == 0) {
          if (*(long *)(lVar17 + 0x28) == local_68) {
            FUN_008b3cbc(param_1,pppppppdVar51 + 2,*unaff_x22);
            pppppdVar53 = pppppdVar38;
LAB_008c3704:
            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
            if (*(long *)(lVar17 + 0x28) == local_68) {
              pcVar25 = "iterate over";
LAB_008c3568:
                    /* WARNING: Subroutine does not return */
              FUN_008b399c(param_1,unaff_x22,pcVar25);
            }
          }
          goto LAB_008c37c0;
        }
      }
      else {
        if (uVar13 == 8) {
          ppppppdVar49 = *pppppppdVar46 + 1;
        }
        else {
          ppppppdVar49 = (double ******)(*(long *)(param_1 + 0x60) + (long)(int)uVar13 * 8 + 0x448);
        }
        unaff_x23 = (double *******)*ppppppdVar49;
        if (unaff_x23 != (double *******)0x0) {
          bVar5 = *(byte *)((long)unaff_x23 + 6);
          if ((bVar5 >> 3 & 1) == 0) {
            if ((*(byte *)((long)unaff_x23 + 7) >> 1 & 1) == 0) {
              ppppppdVar49 = (double ******)
                             FUN_008bdfe0(unaff_x23,3,
                                          *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x350));
              if (ppppppdVar49 == (double ******)0x0) {
                bVar5 = *(byte *)((long)unaff_x23 + 6);
                goto LAB_008bedbc;
              }
            }
            else {
              ppppppdVar49 = unaff_x23[4] + -8;
            }
            ppppppdVar60 = *pppppppdVar46;
            pppppppdVar51[3] = pppppppdVar46[1];
            pppppppdVar51[2] = ppppppdVar60;
            ppppppdVar60 = (double ******)*ppppppdVar49;
            pppppppdVar51[1] = (double ******)ppppppdVar49[1];
            *pppppppdVar51 = ppppppdVar60;
            *(double *******)(param_1 + 8) = *unaff_x22;
            goto LAB_008be794;
          }
LAB_008bedbc:
          if ((bVar5 & 1) == 0) {
            if ((*(byte *)((long)unaff_x23 + 7) >> 1 & 1) == 0) {
              ppppppdVar49 = (double ******)
                             FUN_008bdfe0(unaff_x23,0,
                                          *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338));
              if (ppppppdVar49 == (double ******)0x0) goto LAB_008bee4c;
            }
            else {
              ppppppdVar49 = unaff_x23[4] + -2;
            }
            if (*(int *)((long)ppppppdVar49 + 0xc) == 6) {
              uVar16 = (uint)*(byte *)((long)*ppppppdVar49 + 4) & uVar16 >> 0x18;
              ppppdVar21 = (*ppppppdVar49)[5] + (ulong)uVar16 * 4;
              if ((((*(uint *)((long)ppppdVar21 + 0x1c) & 0xf) != 5) ||
                  ((double ******)ppppdVar21[2] != *unaff_x22)) ||
                 (*(int *)((long)ppppdVar21 + 0xc) == 0)) {
                ppppppdVar49 = pppppppdVar46[1];
                uVar55 = SUB84(*pppppppdVar46,0);
                uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
                goto LAB_008bed08;
              }
              ppppppdVar49 = *pppppppdVar46;
              pppppppdVar51[3] = pppppppdVar46[1];
              pppppppdVar51[2] = ppppppdVar49;
              ppppppdVar49 = (double ******)*ppppdVar21;
              pppppppdVar51[1] = (double ******)ppppdVar21[1];
              *pppppppdVar51 = ppppppdVar49;
              goto LAB_008be794;
            }
          }
        }
LAB_008bee4c:
        if ((DAT_00d1fdd0 != 1) || (*(uint *)((long)pppppppdVar46 + 0xc) != 0xc)) {
          ppppppdVar49 = *pppppppdVar46;
          pppppppdVar51[3] = pppppppdVar46[1];
          pppppppdVar51[2] = ppppppdVar49;
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          FUN_008cadd4(param_1,pppppppdVar46,unaff_x22);
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
          pppppppdVar51 = pppppppdVar52 + (long)unaff_x24 * 2;
          goto LAB_008bed34;
        }
        ppppppdVar49 = *pppppppdVar46;
        uVar16 = uVar16 >> 0x18;
        pppppdVar54 = ppppppdVar49[2];
        unaff_x23 = pppppppdVar46;
        if ((uVar16 < *(int *)((long)pppppdVar54 + 0x5c) - (uint)*(byte *)(pppppdVar54 + 0xd)) &&
           (*unaff_x22 == (double ******)pppppdVar54[8][uVar16])) {
          ppppppdVar60 = *pppppppdVar46;
          pppppppdVar51[3] = pppppppdVar46[1];
          pppppppdVar51[2] = ppppppdVar60;
          uVar13 = *(uint *)(ppppppdVar49[2] + 0xb);
          if (uVar16 < uVar13) {
            pppppdVar38 = ppppppdVar49[4] + (ulong)uVar16 * 2;
          }
          else {
            pppppdVar38 = (double *****)(ppppppdVar49[2][5] + (ulong)(uVar16 - uVar13) * 2);
          }
          ppppppdVar49 = (double ******)*pppppdVar38;
          pppppppdVar51[1] = (double ******)pppppdVar38[1];
          *pppppppdVar51 = ppppppdVar49;
        }
        else {
          pdVar20 = (double *)FUN_008bb440(pppppdVar54[7]);
          pppppppdVar31 = unaff_x24;
          if (*(int *)((long)pdVar20 + 0xc) == 0) {
switchD_008be7f4_caseD_46:
            if (*(long *)(lVar17 + 0x28) == local_68) {
              FUN_008b3c58(param_1,pppppppdVar46,unaff_x22);
              goto LAB_008c379c;
            }
            goto LAB_008c37c0;
          }
          ppppppdVar60 = *pppppppdVar46;
          dVar63 = *pdVar20;
          pppppppdVar51[3] = pppppppdVar46[1];
          pppppppdVar51[2] = ppppppdVar60;
          uVar13 = (uint)dVar63;
          uVar16 = *(uint *)(ppppppdVar49[2] + 0xb);
          ppppppdVar60 = ppppppdVar49 + 4;
          if (uVar16 <= uVar13) {
            ppppppdVar60 = (double ******)(ppppppdVar49[2] + 5);
          }
          uVar12 = 0;
          if (uVar16 <= uVar13) {
            uVar12 = uVar16;
          }
          ppppppdVar49 = (double ******)(*ppppppdVar60)[(ulong)(uVar13 - uVar12) * 2];
          pppppppdVar51[1] = (double ******)(*ppppppdVar60 + (ulong)(uVar13 - uVar12) * 2)[1];
          *pppppppdVar51 = ppppppdVar49;
          *(char *)((long)pppppdVar38 + 3) = (char)uVar13;
        }
      }
      goto LAB_008be794;
    case 0x56:
switchD_008be7f4_caseD_56:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppdVar38 = pppppdVar38 + 1;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      if ((uVar16 & 0xff0000) == 0) {
        FUN_008b2a58(param_1,pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2],
                     local_c0[(ulong)uVar13 * 2],(long)pppppppdVar52 + uVar30);
      }
      else {
        FUN_008b2c3c(param_1,pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2],(ulong)uVar13,
                     (long)pppppppdVar52 + uVar30);
      }
      goto LAB_008be79c;
    case 0x57:
switchD_008be7f4_caseD_57:
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3608;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      unaff_x24 = (double *******)(ulong)uVar13;
      pppppdVar53 = pppppdVar38 + 1;
      pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      pppppppdVar51 = pppppppdVar52 + 2;
      pppppppdVar46 = *(double ********)(param_1 + 0x68);
      if ((uVar16 >> 0x10 & 0xff) != 0) {
        pppppppdVar46 = pppppppdVar51 + (ulong)(byte)(uVar16 >> 0x10) * 2 + -2;
      }
      if (*(uint *)((long)pppppppdVar52 + 0xc) != 7) {
        if (uVar13 != 0xffffffff) {
          *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
        }
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008cda50(param_1,pppppppdVar52);
        pppppppdVar46 = pppppppdVar46 + 2;
      }
      unaff_x22 = (double *******)*pppppppdVar52;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
        unaff_x23 = (double *******)FUN_008b4200(param_1);
      }
      else {
        unaff_x23 = (double *******)(*(long *)(param_1 + 0x50) + 0x30);
        *(double ********)(param_1 + 0x50) = unaff_x23;
      }
      cVar3 = *(char *)((long)unaff_x22 + 6);
      unaff_x23[1] = (double ******)pppppppdVar52;
      if (cVar3 == '\0') {
        ppppppdVar49 = unaff_x22[3];
        if ((DAT_00d1fdf0 == '\x01') &&
           (ppppppdVar60 = (double ******)ppppppdVar49[0x1a],
           (double ******)ppppppdVar49[0x1a] != (double ******)0x0)) {
          do {
            ppppppdVar49 = ppppppdVar60;
            unaff_x22[3] = ppppppdVar49;
            ppppppdVar60 = (double ******)ppppppdVar49[0x1a];
          } while ((double ******)ppppppdVar49[0x1a] != (double ******)0x0);
          *(undefined1 *)((long)unaff_x22 + 4) = *(undefined1 *)((long)ppppppdVar49 + 5);
        }
      }
      else {
        ppppppdVar49 = (double ******)0x0;
      }
      bVar5 = *(byte *)((long)unaff_x22 + 4);
      *unaff_x23 = ppppppdVar49;
      unaff_x23[4] = (double ******)0x0;
      lVar50 = *(long *)(param_1 + 0x48);
      unaff_x23[2] = (double ******)pppppppdVar51;
      unaff_x23[3] = (double ******)(pppppppdVar46 + (ulong)bVar5 * 2);
      bVar5 = *(byte *)((long)unaff_x22 + 4);
      uVar12 = (uVar16 >> 0x18) - 1;
      *(uint *)(unaff_x23 + 5) = uVar12;
      *(uint *)((long)unaff_x23 + 0x2c) = 0;
      *(double ********)(param_1 + 0x68) = pppppppdVar46;
      *(double ********)(param_1 + 0x70) = pppppppdVar51;
      if (lVar50 - (long)pppppppdVar46 <= (long)((ulong)bVar5 * 0x10)) {
        iVar14 = *(int *)(param_1 + 0x40);
        iVar11 = iVar14 + (uint)bVar5;
        if ((int)(uint)bVar5 <= iVar14) {
          iVar11 = iVar14 << 1;
        }
        FUN_008b3fdc(param_1,iVar11,1);
      }
      if (*(char *)((long)unaff_x22 + 6) == '\0') {
        ppppppdVar49 = unaff_x22[3];
        if (DAT_00d1f4f8 == '\x01') {
          *(int *)(ppppppdVar49 + 9) = *(int *)(ppppppdVar49 + 9) + 1;
        }
        if ((uVar13 != 0xffffffff) &&
           (uVar30 = FUN_008b51c8(param_1,local_c8,unaff_x22,uVar13), (uVar30 & 1) == 0)) {
          *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
        }
        pppppppdVar46 = *(double ********)(param_1 + 0x68);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        pppppppdVar51 = pppppppdVar52 + (ulong)*(byte *)((long)ppppppdVar49 + 7) * 2;
        if (pppppppdVar46 < pppppppdVar51) {
          pppppppdVar31 = pppppppdVar51;
          if (pppppppdVar51 <= pppppppdVar46 + 2) {
            pppppppdVar31 = pppppppdVar46 + 2;
          }
          if ((long)pppppppdVar31 + ~(ulong)pppppppdVar46 < 0x10) {
LAB_008bf2b0:
            do {
              pppppppdVar31 = pppppppdVar46 + 2;
              *(uint *)((long)pppppppdVar46 + 0xc) = 0;
              pppppppdVar46 = pppppppdVar31;
            } while (pppppppdVar31 < pppppppdVar51);
          }
          else {
            uVar30 = ((long)pppppppdVar31 + ~(ulong)pppppppdVar46 >> 4) + 1;
            uVar48 = uVar30 & 0x1ffffffffffffffe;
            pppppppdVar31 = pppppppdVar46 + uVar48 * 2;
            puVar36 = (uint *)((long)pppppppdVar46 + 0x1c);
            uVar44 = uVar48;
            do {
              uVar44 = uVar44 - 2;
              puVar36[-4] = 0;
              *puVar36 = 0;
              puVar36 = puVar36 + 8;
            } while (uVar44 != 0);
            pppppppdVar46 = pppppppdVar31;
            if (uVar30 != uVar48) goto LAB_008bf2b0;
          }
          cVar3 = *(char *)((long)ppppppdVar49 + 3);
        }
        else {
          cVar3 = *(char *)((long)ppppppdVar49 + 3);
          pppppppdVar31 = pppppppdVar46;
        }
        if (cVar3 == '\0') {
          pppppppdVar31 = (double *******)unaff_x23[3];
        }
        local_c0 = ppppppdVar49[5];
        pppppdVar38 = ppppppdVar49[6];
        *(double ********)(param_1 + 0x68) = pppppppdVar31;
        local_c8 = unaff_x22;
      }
      else {
        if (uVar13 != 0xffffffff) {
          *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
        }
        uVar13 = (*(code *)unaff_x22[5])(param_1);
        if ((int)uVar13 < 0) goto LAB_008c3618;
        lVar50 = *(long *)(param_1 + 0x50);
        puVar22 = *(undefined8 **)(lVar50 + 8);
        if ((uVar12 != 0) && (uVar13 != 0)) {
          puVar32 = *(undefined8 **)(param_1 + 0x68);
          puVar37 = puVar22;
          puVar40 = puVar32 + (ulong)uVar13 * -2;
          do {
            puVar39 = puVar40 + 2;
            uVar23 = *puVar40;
            uVar12 = uVar12 - 1;
            puVar22 = puVar37 + 2;
            puVar37[1] = puVar40[1];
            *puVar37 = uVar23;
            if (uVar12 == 0) break;
            puVar37 = puVar22;
            puVar40 = puVar39;
          } while (puVar39 < puVar32);
        }
        if (0 < (int)uVar12) {
          if (uVar12 == 1) {
            iVar11 = 1;
            puVar37 = puVar22;
          }
          else {
            uVar44 = (ulong)uVar12 & 0x7ffffffe;
            puVar37 = puVar22 + uVar44 * 2;
            iVar11 = uVar12 - (int)uVar44;
            puVar34 = (undefined4 *)((long)puVar22 + 0x1c);
            uVar30 = uVar44;
            do {
              uVar30 = uVar30 - 2;
              puVar34[-4] = 0;
              *puVar34 = 0;
              puVar34 = puVar34 + 8;
            } while (uVar30 != 0);
            puVar22 = puVar37;
            if (uVar44 == uVar12) goto LAB_008bf41c;
          }
          uVar13 = iVar11 + 1;
          do {
            uVar13 = uVar13 - 1;
            *(undefined4 *)((long)puVar37 + 0xc) = 0;
            puVar22 = puVar37 + 2;
            puVar37 = puVar37 + 2;
          } while (1 < uVar13);
        }
LAB_008bf41c:
        pppppppdVar52 = *(double ********)(lVar50 + -0x20);
LAB_008bf428:
        *(long *)(param_1 + 0x50) = lVar50 + -0x30;
        *(double ********)(param_1 + 0x70) = pppppppdVar52;
        if (uVar16 >> 0x18 != 0) {
          puVar22 = *(undefined8 **)(lVar50 + -0x18);
        }
        *(undefined8 **)(param_1 + 0x68) = puVar22;
        pppppdVar38 = pppppdVar53;
      }
      goto LAB_008be79c;
    case 0x58:
switchD_008be7f4_caseD_58:
      if ((*(uint *)((long)(pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2) + 0xc) ==
           7) && (ppppppdVar49 = pppppppdVar52[(ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2],
                 *(char *)((long)ppppppdVar49 + 6) == '\0')) {
        pppppdVar53 = pppppdVar38 + 1;
        if (*(uint *)((long)ppppppdVar49[3] + 0xcc) == *(uint *)((long)pppppdVar38 + 4))
        goto LAB_008be794;
      }
      pppppdVar38 = (double *****)
                    ((long)(pppppdVar38 + 1) + ((long)((int)*(uint *)pppppdVar38 >> 0x10) + -1) * 4)
      ;
      goto LAB_008be79c;
    case 0x59:
switchD_008be7f4_caseD_59:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      uVar16 = *(uint *)pppppdVar38;
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x688);
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
             *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
        if (*(char *)(param_1 + 3) != '\0') goto LAB_008c3608;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
      }
      puVar36 = (uint *)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
      uVar13 = *puVar36;
      uVar12 = uVar13 >> 0x10 & 0xff;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
      if (uVar12 == 0) {
        uVar12 = (uint)((ulong)(*(long *)(param_1 + 0x68) - (long)pppppppdVar51) >> 4);
      }
      unaff_x22 = pppppppdVar51;
      if (*(char *)((long)local_c8[2] + 3) == '\0') goto LAB_008be794;
      if (*(ushort *)(param_1 + 0x2a) < *(ushort *)(param_1 + 0x28)) goto LAB_008be794;
      unaff_x24 = (double *******)(ulong)(uVar12 - 1);
      uVar16 = (*(code *)(&PTR_LAB_00c4d118)[uVar16 >> 8 & 0xff])(param_1,pppppppdVar51,unaff_x24);
      if ((int)uVar16 < 0) goto LAB_008be794;
      pppppdVar53 = (double *****)(puVar36 + 1);
      unaff_x23 = (double *******)(ulong)uVar16;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      pppppppdVar52 = pppppppdVar51 + 2 + (long)(int)(uVar12 - 1) * 2;
      *(double ********)(param_1 + 0x68) = pppppppdVar52;
      ppppppdVar49 = *pppppppdVar51;
      if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
        puVar22 = (undefined8 *)FUN_008b4200(param_1);
        pppppppdVar52 = *(double ********)(param_1 + 0x68);
      }
      else {
        puVar22 = (undefined8 *)(*(long *)(param_1 + 0x50) + 0x30);
        *(undefined8 **)(param_1 + 0x50) = puVar22;
      }
      bVar5 = *(byte *)((long)ppppppdVar49 + 4);
      *(uint *)(puVar22 + 4) = uVar16;
      lVar50 = *(long *)(param_1 + 0x48);
      lVar43 = *(long *)(param_1 + 0x68);
      *puVar22 = 0;
      puVar22[1] = pppppppdVar51;
      uVar12 = uVar13 >> 0x18;
      unaff_x22 = (double *******)(ulong)uVar12;
      bVar4 = *(byte *)((long)ppppppdVar49 + 4);
      puVar22[2] = pppppppdVar51 + 2;
      puVar22[3] = pppppppdVar52 + (ulong)bVar5 * 2;
      *(uint *)(puVar22 + 5) = uVar12 - 1;
      *(undefined4 *)((long)puVar22 + 0x2c) = 0x12;
      if (lVar50 - lVar43 <= (long)((ulong)bVar4 * 0x10)) {
        iVar14 = *(int *)(param_1 + 0x40);
        iVar11 = iVar14 + (uint)bVar4;
        if ((int)(uint)bVar4 <= iVar14) {
          iVar11 = iVar14 << 1;
        }
        FUN_008b3fdc(param_1,iVar11,1);
      }
      iVar11 = uVar12 - 2;
      if (uVar13 >> 0x19 == 0) {
        iVar11 = uVar12 - 1;
      }
      iVar11 = FUN_008c8994(param_1,*(long *)(*(long *)(param_1 + 0x50) + 0x10) +
                                    (ulong)uVar16 * 0x10,iVar11);
      if (iVar11 == 0) {
        plVar27 = *(long **)(param_1 + 0x50);
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        *(uint *)((long)plVar27 + 0x2c) = *(uint *)((long)plVar27 + 0x2c) | 1;
        local_c0 = *(double ******)(*plVar27 + 0x28);
        pppppdVar53 = *(double ******)(*plVar27 + 0x30);
        local_c8 = *(double ********)plVar27[1];
        goto LAB_008be794;
      }
      if (iVar11 != 1) goto LAB_008c3618;
      FUN_008c8d44(param_1);
      break;
    case 0x5a:
switchD_008be7f4_caseD_5a:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppdVar53 = pppppdVar38 + 1;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      ppppppdVar49 = (double ******)local_c0[(ulong)uVar13 * 2];
      pppppppdVar51[1] = (double ******)(local_c0 + (ulong)uVar13 * 2)[1];
      *pppppppdVar51 = ppppppdVar49;
      ppppppdVar49 = *pppppppdVar51;
      *(byte *)((long)ppppppdVar49 + 0x69) = (byte)(uVar16 >> 0x18) & 1;
      if (((uVar16 ^ 0xffffffff) & 0xff0000) != 0) {
        pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
        if (*(uint *)((long)pppppppdVar46 + 0xc) != 0xb) {
          if (*(long *)(lVar17 + 0x28) == local_68) {
            pcVar25 = "extend";
LAB_008c35b4:
                    /* WARNING: Subroutine does not return */
            FUN_008b399c(param_1,pppppppdVar46,pcVar25);
          }
          goto LAB_008c37c0;
        }
        ppppppdVar49 = (double ******)FUN_008b25f4(param_1,ppppppdVar49,*pppppppdVar46);
        *pppppppdVar51 = ppppppdVar49;
        *(uint *)((long)pppppppdVar51 + 0xc) = 0xb;
      }
      goto LAB_008be794;
    case 0x5b:
switchD_008be7f4_caseD_5b:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38 + 1;
      FUN_008b30a8(param_1,pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2,
                   pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2,uVar13);
      pppppdVar38 = pppppdVar38 + 1;
      goto LAB_008be79c;
    case 0x5c:
switchD_008be7f4_caseD_5c:
      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
      if (*(uint *)((long)pppppppdVar51 + 0xc) == 0xc) {
        ppppppdVar49 = *pppppppdVar51;
        puVar36 = (uint *)((long)pppppdVar53 + ((ulong)(*(uint *)pppppdVar38 >> 0x16) & 0x3fc));
        uVar16 = *puVar36;
        uVar13 = uVar16 >> 0x18;
        pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
        pppppppdVar31 = pppppppdVar46 + 2;
        pppppppdVar46[1] = pppppppdVar51[1];
        *pppppppdVar46 = ppppppdVar49;
        if (uVar16 >> 0x18 < 3) goto LAB_008c261c;
        if (uVar13 - 3 == 0) {
          uVar12 = 1;
          pppppppdVar51 = pppppppdVar31;
          goto LAB_008c2604;
        }
        uVar30 = (ulong)(uVar13 - 3) + 1;
        uVar48 = uVar30 & 0x1fffffffe;
        uVar12 = (uint)uVar30 | 1;
        puVar34 = (undefined4 *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 0x10 + 0x2c);
        uVar44 = uVar48;
        do {
          uVar44 = uVar44 - 2;
          puVar34[-4] = 0;
          *puVar34 = 0;
          puVar34 = puVar34 + 8;
        } while (uVar44 != 0);
        pppppppdVar51 = pppppppdVar31 + uVar48 * 2;
        if (uVar30 != uVar48) {
LAB_008c2604:
          iVar11 = ~uVar12 + uVar13;
          puVar42 = (uint *)((long)pppppppdVar51 + 0xc);
          do {
            iVar11 = iVar11 + -1;
            *puVar42 = 0;
            puVar42 = puVar42 + 4;
          } while (iVar11 != 0);
        }
LAB_008c261c:
        if (uVar13 != 0) {
          pppppppdVar31 = *(double ********)(*(long *)(param_1 + 0x50) + 0x18);
        }
        *(double ********)(param_1 + 0x68) = pppppppdVar31;
        pppppdVar53 = (double *****)(puVar36 + 1);
      }
      goto LAB_008be794;
    case 0x5d:
switchD_008be7f4_caseD_5d:
      uVar16 = *(uint *)pppppdVar38;
      uVar13 = *(uint *)((long)pppppdVar38 + 4);
      pppppdVar53 = pppppdVar38 + 1;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
      unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
      if (*(uint *)((long)unaff_x22 + 0xc) - 0xd < 0xfffffffe) {
        if (*(long *)(lVar17 + 0x28) == local_68) {
          pcVar25 = "access private field of";
          goto LAB_008c3568;
        }
        goto LAB_008c37c0;
      }
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      iVar11 = *(int *)((long)local_c8 + uVar30 + 0x2c);
      plVar27 = (long *)((long)local_c8 + uVar30 + 0x20);
      if (iVar11 == 0xf) {
        plVar27 = *(long **)(*plVar27 + 8);
        iVar11 = *(int *)((long)plVar27 + 0xc);
      }
      if (iVar11 != 0xb) {
        if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_008b399c(param_1,plVar27,"verify object is an instance of");
        }
        goto LAB_008c37c0;
      }
      unaff_x23 = (double *******)*plVar27;
      unaff_x24 = (double *******)*unaff_x22;
      pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
      if (*(uint *)((long)unaff_x22 + 0xc) == 0xc) {
        uVar30 = FUN_008b3380(unaff_x24,unaff_x23);
        if ((uVar30 & 1) == 0) {
          if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
            FUN_008b39cc(param_1,"attempt to illegally access private field");
          }
          goto LAB_008c37c0;
        }
        if ((uVar13 >> 8 & 1) == 0) {
          uVar16 = *(uint *)((long)unaff_x23 + 100);
          if ((uVar13 >> 9 & 1) != 0) {
            ppppppdVar49 = *unaff_x22;
            pppppppdVar51[3] = unaff_x22[1];
            pppppppdVar51[2] = ppppppdVar49;
          }
          ppppppdVar49 = (double ******)unaff_x24[4][(ulong)(uVar16 + (uVar13 & 0xff)) * 2];
          pppppppdVar51[1] =
               (double ******)(unaff_x24[4] + (ulong)(uVar16 + (uVar13 & 0xff)) * 2)[1];
          *pppppppdVar51 = ppppppdVar49;
          goto LAB_008be794;
        }
      }
      else {
        uVar30 = FUN_008b33a4(unaff_x24,unaff_x23);
        if ((uVar30 & 1) == 0) {
          if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
            FUN_008b39cc(param_1,"attempt to illegally access private field of a class");
          }
          goto LAB_008c37c0;
        }
        if ((uVar13 >> 8 & 1) == 0) {
          if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
            FUN_008b39cc(param_1,"attempt to access private instance field of a class");
          }
          goto LAB_008c37c0;
        }
      }
      if ((uVar13 >> 9 & 1) != 0) {
        ppppppdVar49 = *unaff_x22;
        pppppppdVar51[3] = unaff_x22[1];
        pppppppdVar51[2] = ppppppdVar49;
      }
      ppppppdVar49 = (double ******)unaff_x23[6][((ulong)uVar13 & 0xff) * 2];
      pppppppdVar51[1] = (double ******)(unaff_x23[6] + ((ulong)uVar13 & 0xff) * 2)[1];
      *pppppppdVar51 = ppppppdVar49;
      goto LAB_008be794;
    case 0x5e:
      goto switchD_008be7f4_caseD_5e;
    }
    pppppppdVar52 = *(double ********)(param_1 + 0x70);
    pppppdVar38 = pppppdVar53;
    goto LAB_008be79c;
  }
  lVar17 = tpidr_el0;
  local_68 = *(long *)(lVar17 + 0x28);
  if (((*(byte *)((long)*(undefined8 **)(param_1 + 0x50) + 0x2c) >> 2 & 1) != 0) &&
     (iVar11 = (**(code **)(*(long *)(param_1 + 0x60) + 0x6f0))
                         (param_1,**(undefined8 **)(param_1 + 0x50)), iVar11 == 0)) {
LAB_008c8794:
    if (*(long *)(lVar17 + 0x28) == local_68) {
      return;
    }
LAB_008c8944:
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
LAB_008c3820:
  plVar27 = *(long **)(param_1 + 0x50);
  pppppppdVar52 = *(double ********)(param_1 + 0x70);
  pppppdVar53 = (double *****)plVar27[4];
  pppppdVar54 = *(double ******)(*plVar27 + 0x28);
  pppppppdVar51 = *(double ********)plVar27[1];
  pppppppdVar46 = pppppppdVar51;
  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(*(undefined1 *)pppppdVar53) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x29:
    goto switchD_008c3848_caseD_29;
  case 0x2a:
    goto switchD_008c3848_caseD_2a;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x33:
    goto switchD_008c3848_caseD_33;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3a:
    goto switchD_008c3848_caseD_3a;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3e:
    goto switchD_008c3848_caseD_3e;
  case 0x3f:
    goto switchD_008c3848_caseD_3f;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
    goto switchD_008c3848_caseD_42;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
switchD_008c3848_caseD_46:
    if (*(long *)(lVar17 + 0x28) == local_68) {
      pcVar25 = "access private field of";
LAB_008c86e4:
                    /* WARNING: Subroutine does not return */
      FUN_008b399c(param_1,unaff_x22,pcVar25);
    }
    goto LAB_008c8944;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
    goto switchD_008c3848_caseD_52;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
switchD_008c3848_caseD_5e:
    uVar16 = *(uint *)pppppdVar53;
    bVar5 = *(byte *)((long)pppppdVar53 + 4);
    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53 + 1;
    pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
    if (*(uint *)((long)pppppppdVar46 + 0xc) == 0xc) {
      uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
      iVar11 = *(int *)((long)pppppppdVar51 + uVar30 + 0x2c);
      plVar27 = (long *)((long)pppppppdVar51 + uVar30 + 0x20);
      if (iVar11 == 0xf) {
        plVar27 = *(long **)(*plVar27 + 8);
        iVar11 = *(int *)((long)plVar27 + 0xc);
      }
      if (iVar11 == 0xb) {
        ppppppdVar49 = *pppppppdVar46;
        lVar50 = *plVar27;
        uVar30 = FUN_008b3380(ppppppdVar49,lVar50);
        if ((uVar30 & 1) != 0) {
          iVar11 = *(int *)(lVar50 + 100);
          pppppdVar38 = ppppppdVar49[4];
          pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
          ppppppdVar60 = *pppppppdVar52;
          (pppppdVar38 + (ulong)(iVar11 + (uint)bVar5) * 2)[1] = (double ****)pppppppdVar52[1];
          pppppdVar38[(ulong)(iVar11 + (uint)bVar5) * 2] = (double ****)ppppppdVar60;
          if (((4 < (int)*(uint *)((long)pppppppdVar52 + 0xc)) &&
              ((*(byte *)((long)ppppppdVar49 + 2) >> 2 & 1) != 0)) &&
             (((ulong)**pppppppdVar52 & 0x30000) != 0)) {
            FUN_008b6188(param_1,ppppppdVar49);
          }
          bVar5 = *(byte *)(pppppdVar53 + 1);
LAB_008c86a0:
          UNRECOVERED_JUMPTABLE = (code *)(&switchD_008c3848::switchdataD_00c4da78)[bVar5];
LAB_008c86a4:
                    /* WARNING: Could not recover jumptable at 0x008c86ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*UNRECOVERED_JUMPTABLE)();
          return;
        }
        if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_008b39cc(param_1,"attempt to assign private field of an object with a different class"
                      );
        }
      }
      else if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_008b399c(param_1,plVar27,"assign private field of");
      }
    }
    else if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_008b399c(param_1,pppppppdVar46,"assign private field of");
    }
    goto LAB_008c8944;
  }
switchD_008c3848_caseD_f:
  uVar16 = *(uint *)pppppdVar53;
  pppppdVar38 = pppppdVar53 + 1;
  pppppppdVar46 = (double *******)(pppppdVar54 + (ulong)*(uint *)((long)pppppdVar53 + 4) * 2);
  pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
  unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  uVar13 = *(uint *)((long)pppppppdVar51 + 0xc);
  if (uVar13 == 6) {
    ppppppdVar49 = *pppppppdVar51;
    uVar16 = (uint)*(byte *)((long)ppppppdVar49 + 4) & uVar16 >> 0x18;
    pppppdVar54 = ppppppdVar49[5] + (ulong)uVar16 * 4;
    if ((((*(uint *)((long)pppppdVar54 + 0x1c) & 0xf) == 5) &&
        ((double ******)pppppdVar54[2] == *pppppppdVar46)) &&
       (*(int *)((long)pppppdVar54 + 0xc) != 0)) {
      ppppppdVar49 = (double ******)pppppdVar54[1];
      uVar55 = SUB84(*pppppdVar54,0);
      uVar58 = (undefined4)((ulong)*pppppdVar54 >> 0x20);
    }
    else {
      if (ppppppdVar49[2] != (double *****)0x0) {
        *(uint *)(param_1 + 0x2c) = uVar16;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008cadd4(param_1,pppppppdVar51,pppppppdVar46,unaff_x22);
        goto LAB_008c3c00;
      }
      puVar22 = (undefined8 *)FUN_008bb440(ppppppdVar49,*pppppppdVar46);
      puVar37 = (undefined8 *)FUN_008bb3b0(&DWORD_007f2ef0);
      if (puVar22 != puVar37) {
        *(char *)((long)pppppdVar53 + 3) =
             (char)((uint)((int)puVar22 - *(int *)(ppppppdVar49 + 5)) >> 5);
      }
      ppppppdVar49 = (double ******)puVar22[1];
      uVar55 = (undefined4)*puVar22;
      uVar58 = (undefined4)((ulong)*puVar22 >> 0x20);
    }
    unaff_x22[1] = ppppppdVar49;
    *unaff_x22 = (double ******)CONCAT44(uVar58,uVar55);
LAB_008c3bcc:
    bVar5 = *(byte *)pppppdVar38;
  }
  else {
    if (uVar13 == 8) {
      lVar50 = *(long *)(*(long *)(param_1 + 0x60) + (ulong)*(byte *)((long)*pppppppdVar51 + 3) * 8
                        + 0x5068);
      if (lVar50 != 0) {
        puVar22 = (undefined8 *)
                  (*(long *)(lVar50 + 0x28) +
                  (ulong)((uint)*(byte *)(lVar50 + 4) & uVar16 >> 0x18) * 0x20);
        if ((((*(uint *)((long)puVar22 + 0x1c) & 0xf) == 5) &&
            ((double ******)puVar22[2] == *pppppppdVar46)) && (*(int *)((long)puVar22 + 0xc) != 0))
        {
          (*(code *)*puVar22)(*pppppppdVar51 + 2,unaff_x22);
          goto LAB_008c3bcc;
        }
        puVar22 = (undefined8 *)FUN_008bb440(lVar50,*pppppppdVar46);
        if (*(int *)((long)puVar22 + 0xc) == 0) {
          uVar13 = *(uint *)((long)pppppppdVar51 + 0xc);
          if (uVar13 != 8) goto LAB_008c3d9c;
          goto LAB_008c3d30;
        }
        *(char *)((long)pppppdVar53 + 3) =
             (char)((uint)((int)puVar22 - *(int *)(lVar50 + 0x28)) >> 5);
        (*(code *)*puVar22)(*pppppppdVar51 + 2,unaff_x22);
        bVar5 = *(byte *)(pppppdVar53 + 1);
LAB_008c3f2c:
        UNRECOVERED_JUMPTABLE = (code *)(&switchD_008c3848::switchdataD_00c4da78)[bVar5];
LAB_008c3f38:
                    /* WARNING: Could not recover jumptable at 0x008c3f44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)();
        return;
      }
LAB_008c3d30:
      pppppdVar54 = (*pppppppdVar51)[1];
      if ((pppppdVar54 == (double *****)0x0) || (((ulong)*pppppdVar54 & 0x1000000000000) != 0)) {
LAB_008c3d98:
        uVar13 = *(uint *)((long)pppppppdVar51 + 0xc);
        goto LAB_008c3d9c;
      }
      if ((*(byte *)((long)pppppdVar54 + 7) >> 1 & 1) == 0) {
        ppppdVar21 = (double ****)
                     FUN_008bdfe0(pppppdVar54,0,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338));
        if (ppppdVar21 == (double ****)0x0) goto LAB_008c3d98;
      }
      else {
        ppppdVar21 = pppppdVar54[4] + -2;
      }
      if ((*(int *)((long)ppppdVar21 + 0xc) != 7) || (*(char *)((long)*ppppdVar21 + 6) == '\0'))
      goto LAB_008c3d98;
LAB_008c3e7c:
      puVar22 = *(undefined8 **)(param_1 + 0x68);
      pppdVar7 = *ppppdVar21;
      puVar22[1] = ppppdVar21[1];
      *puVar22 = pppdVar7;
      ppppppdVar49 = *pppppppdVar51;
      puVar22[3] = pppppppdVar51[1];
      puVar22[2] = ppppppdVar49;
      ppppppdVar49 = *pppppppdVar46;
      puVar22[5] = pppppppdVar46[1];
      puVar22[4] = ppppppdVar49;
      *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
      *(uint *)(param_1 + 0x2c) = uVar16 >> 0x18;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
      FUN_008cd928(param_1,2,uVar16 >> 8 & 0xff);
LAB_008c3c00:
      *(undefined1 *)((long)pppppdVar53 + 3) = *(undefined1 *)(param_1 + 0x2c);
      UNRECOVERED_JUMPTABLE =
           (code *)(&switchD_008c3848::switchdataD_00c4da78)[*(byte *)(pppppdVar53 + 1)];
      goto LAB_008c3bd4;
    }
LAB_008c3d9c:
    if (uVar13 == 4) {
      uVar13 = (*(byte *)(*pppppppdVar46 + 3) | 0x20) - 0x78;
      if ((uVar13 < 3) && (*(char *)((long)*pppppppdVar46 + 0x19) == '\0')) {
        fVar56 = *(float *)((long)pppppppdVar51 + (ulong)uVar13 * 4);
        *(uint *)((long)unaff_x22 + 0xc) = 3;
        *unaff_x22 = (double ******)(double)fVar56;
        goto LAB_008c3bcc;
      }
      lVar17 = *(long *)(*(long *)(param_1 + 0x60) + 0x468);
      if ((lVar17 != 0) && ((*(byte *)(lVar17 + 6) & 1) == 0)) {
        if ((*(byte *)(lVar17 + 7) >> 1 & 1) == 0) {
          ppppdVar21 = (double ****)
                       FUN_008bdfe0(lVar17,0,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338));
          if (ppppdVar21 == (double ****)0x0) goto LAB_008c3e24;
        }
        else {
          ppppdVar21 = (double ****)(*(long *)(lVar17 + 0x20) + -0x10);
        }
        if ((*(int *)((long)ppppdVar21 + 0xc) == 7) && (*(char *)((long)*ppppdVar21 + 6) != '\0'))
        goto LAB_008c3e7c;
      }
    }
    else if ((uVar13 == 0xc) && ((DAT_00d1fdd0 & 1) != 0)) {
      ppppppdVar49 = *pppppppdVar51;
      uVar16 = uVar16 >> 0x18;
      pppppdVar54 = ppppppdVar49[2];
      if ((uVar16 < *(int *)((long)pppppdVar54 + 0x5c) - (uint)*(byte *)(pppppdVar54 + 0xd)) &&
         (*pppppppdVar46 == (double ******)pppppdVar54[8][uVar16])) {
        if (uVar16 < *(uint *)(pppppdVar54 + 0xb)) {
          pppppdVar53 = ppppppdVar49[4] + (ulong)uVar16 * 2;
        }
        else {
          pppppdVar53 = (double *****)
                        (pppppdVar54[5] + (ulong)(uVar16 - *(uint *)(pppppdVar54 + 0xb)) * 2);
        }
        ppppppdVar49 = (double ******)*pppppdVar53;
        unaff_x22[1] = (double ******)pppppdVar53[1];
        *unaff_x22 = ppppppdVar49;
        bVar5 = *(byte *)pppppdVar38;
        goto LAB_008c3f2c;
      }
      pdVar20 = (double *)FUN_008bb440(pppppdVar54[7]);
      if (*(int *)((long)pdVar20 + 0xc) != 0) {
        uVar13 = (uint)*pdVar20;
        uVar16 = *(uint *)(ppppppdVar49[2] + 0xb);
        ppppppdVar60 = ppppppdVar49 + 4;
        if (uVar16 <= uVar13) {
          ppppppdVar60 = (double ******)(ppppppdVar49[2] + 5);
        }
        uVar12 = 0;
        if (uVar16 <= uVar13) {
          uVar12 = uVar16;
        }
        ppppppdVar49 = (double ******)(*ppppppdVar60)[(ulong)(uVar13 - uVar12) * 2];
        unaff_x22[1] = (double ******)(*ppppppdVar60 + (ulong)(uVar13 - uVar12) * 2)[1];
        *unaff_x22 = ppppppdVar49;
        *(char *)((long)pppppdVar53 + 3) = (char)uVar13;
        UNRECOVERED_JUMPTABLE =
             (code *)(&switchD_008c3848::switchdataD_00c4da78)[*(byte *)(pppppdVar53 + 1)];
        goto LAB_008c3f38;
      }
      if (*(long *)(lVar17 + 0x28) == local_68) {
        FUN_008b3c58(param_1,pppppppdVar51,pppppppdVar46);
LAB_008c8920:
        if (*(long *)(lVar17 + 0x28) == local_68) {
          FUN_008b3c58(param_1,pppppppdVar46,unaff_x22);
        }
      }
      goto LAB_008c8944;
    }
LAB_008c3e24:
    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
    FUN_008cadd4(param_1,pppppppdVar51,pppppppdVar46,unaff_x22);
    bVar5 = *(byte *)pppppdVar38;
  }
  UNRECOVERED_JUMPTABLE = (code *)(&switchD_008c3848::switchdataD_00c4da78)[bVar5];
LAB_008c3bd4:
                    /* WARNING: Could not recover jumptable at 0x008c3bdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
switchD_008be7f4_caseD_5e:
  uVar16 = *(uint *)pppppdVar38;
  pppppdVar53 = pppppdVar38 + 1;
  bVar5 = *(byte *)((long)pppppdVar38 + 4);
  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
  pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
  if (*(uint *)((long)pppppppdVar51 + 0xc) != 0xc) {
    if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_008b399c(param_1,pppppppdVar51,"assign private field of");
    }
    goto LAB_008c37c0;
  }
  uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
  uVar13 = *(uint *)((long)local_c8 + uVar30 + 0x2c);
  pppppppdVar46 = (double *******)((long)local_c8 + uVar30 + 0x20);
  if (uVar13 == 0xf) {
    pppppppdVar46 = (double *******)(*pppppppdVar46)[1];
    uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
  }
  if (uVar13 != 0xb) {
    if (*(long *)(lVar17 + 0x28) == local_68) {
      pcVar25 = "assign private field of";
      goto LAB_008c35b4;
    }
    goto LAB_008c37c0;
  }
  unaff_x22 = (double *******)*pppppppdVar51;
  unaff_x23 = (double *******)*pppppppdVar46;
  uVar30 = FUN_008b3380(unaff_x22,unaff_x23);
  if ((uVar30 & 1) == 0) {
    if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"attempt to assign private field of an object with a different class");
    }
    goto LAB_008c37c0;
  }
  uVar13 = *(uint *)((long)unaff_x23 + 100);
  ppppppdVar60 = unaff_x22[4];
  pppppppdVar51 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  ppppppdVar49 = *pppppppdVar51;
  (ppppppdVar60 + (ulong)(uVar13 + bVar5) * 2)[1] = (double *****)pppppppdVar51[1];
  ppppppdVar60[(ulong)(uVar13 + bVar5) * 2] = (double *****)ppppppdVar49;
  if (4 < (int)*(uint *)((long)pppppppdVar51 + 0xc)) {
    if ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) != 0) {
      if (((ulong)**pppppppdVar51 & 0x30000) != 0) goto code_r0x008c1128;
    }
  }
  goto LAB_008be794;
code_r0x008c1128:
  FUN_008b6188(param_1,unaff_x22);
  pppppdVar38 = pppppdVar53;
  goto LAB_008be79c;
  while( true ) {
    pdVar41 = pdVar20;
    pppppppdVar52 = pppppppdVar46;
    if (pppppppdVar51 <= pppppppdVar46) break;
LAB_008c218c:
    pppppppdVar46 = pppppppdVar52 + 2;
    ppppppdVar49 = *pppppppdVar52;
    uVar12 = uVar12 - 1;
    pdVar20 = pdVar41 + 2;
    pdVar41[1] = (double)pppppppdVar52[1];
    *pdVar41 = (double)ppppppdVar49;
    if (uVar12 == 0) break;
  }
joined_r0x008c21ac:
  if (0 < (int)uVar12) {
    if (uVar12 == 1) {
      iVar11 = 1;
      pdVar41 = pdVar20;
    }
    else {
      uVar44 = (ulong)uVar12 & 0x7ffffffe;
      pdVar41 = pdVar20 + uVar44 * 2;
      iVar11 = uVar12 - (int)uVar44;
      puVar34 = (undefined4 *)((long)pdVar20 + 0x1c);
      uVar30 = uVar44;
      do {
        uVar30 = uVar30 - 2;
        puVar34[-4] = 0;
        *puVar34 = 0;
        puVar34 = puVar34 + 8;
      } while (uVar30 != 0);
      pdVar20 = pdVar41;
      if (uVar44 == uVar12) goto LAB_008c2280;
    }
    uVar16 = iVar11 + 1;
    do {
      uVar16 = uVar16 - 1;
      *(undefined4 *)((long)pdVar41 + 0xc) = 0;
      pdVar20 = pdVar41 + 2;
      pdVar41 = pdVar41 + 2;
    } while (1 < uVar16);
  }
LAB_008c2280:
  pppppppdVar52 = *(double ********)(lVar50 + -0x20);
  *(long *)(param_1 + 0x50) = lVar50 + -0x30;
  *(double ********)(param_1 + 0x70) = pppppppdVar52;
  if (uVar13 != 0xffffffff) {
    pdVar20 = *(double **)(lVar50 + -0x18);
  }
  *(double **)(param_1 + 0x68) = pdVar20;
  if ((*(byte *)(lVar50 + 0x2c) & 1) != 0) {
LAB_008c3618:
    if (*(long *)(lVar17 + 0x28) == local_68) {
      return;
    }
LAB_008c37c0:
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  pppppdVar53 = *(double ******)(lVar50 + -0x10);
  local_c8 = (double *******)**(undefined8 **)(lVar50 + -0x28);
  local_c0 = *(double ******)(*(long *)(lVar50 + -0x30) + 0x28);
  goto LAB_008be794;
  while( true ) {
    puVar37 = puVar22;
    puVar40 = puVar39;
    if (puVar32 <= puVar39) break;
LAB_008c1e10:
    puVar39 = puVar40 + 2;
    uVar23 = *puVar40;
    uVar13 = (int)unaff_x23 - 1;
    unaff_x23 = (double *******)(ulong)uVar13;
    puVar22 = puVar37 + 2;
    puVar37[1] = puVar40[1];
    *puVar37 = uVar23;
    if (uVar13 == 0) break;
  }
LAB_008c1e2c:
  iVar11 = (int)unaff_x23;
  if (0 < iVar11) {
    if (iVar11 == 1) {
      puVar37 = puVar22;
      pppppppdVar51 = unaff_x23;
    }
    else {
      pppppppdVar46 = (double *******)((ulong)unaff_x23 & 0x7ffffffe);
      puVar37 = puVar22 + (long)pppppppdVar46 * 2;
      pppppppdVar51 = (double *******)(ulong)(uint)(iVar11 - (int)pppppppdVar46);
      puVar34 = (undefined4 *)((long)puVar22 + 0x1c);
      pppppppdVar52 = pppppppdVar46;
      do {
        pppppppdVar52 = (double *******)((long)pppppppdVar52 + -2);
        puVar34[-4] = 0;
        *puVar34 = 0;
        puVar34 = puVar34 + 8;
      } while (pppppppdVar52 != (double *******)0x0);
      bVar10 = pppppppdVar46 == unaff_x23;
      puVar22 = puVar37;
      unaff_x23 = pppppppdVar51;
      if (bVar10) goto LAB_008c2310;
    }
    uVar13 = (int)pppppppdVar51 + 1;
    do {
      uVar13 = uVar13 - 1;
      *(undefined4 *)((long)puVar37 + 0xc) = 0;
      puVar22 = puVar37 + 2;
      puVar37 = puVar37 + 2;
      unaff_x23 = pppppppdVar51;
    } while (1 < uVar13);
  }
LAB_008c2310:
  pppppppdVar52 = *(double ********)(lVar50 + -0x20);
  *(long *)(param_1 + 0x50) = lVar50 + -0x30;
  *(double ********)(param_1 + 0x70) = pppppppdVar52;
  if ((uVar16 & 0xff000000) != 0) {
    puVar22 = *(undefined8 **)(lVar50 + -0x18);
  }
  *(undefined8 **)(param_1 + 0x68) = puVar22;
  goto LAB_008be794;
LAB_008c17cc:
  do {
    uVar16 = *(uint *)((long)pppppdVar53 + uVar30 * 4);
    uVar13 = uVar16 >> 8 & 0xff;
    if (uVar13 == 2) {
      ppppppdVar60 = (unaff_x23 + ((ulong)(uVar16 >> 0x10) & 0xff) * 2)[1];
      ppppppdVar49 = unaff_x23[((ulong)(uVar16 >> 0x10) & 0xff) * 2];
      uVar55 = SUB84(ppppppdVar49,0);
      uVar58 = (undefined4)((ulong)ppppppdVar49 >> 0x20);
LAB_008c17b0:
      unaff_x24[1] = ppppppdVar60;
      *unaff_x24 = (double ******)CONCAT44(uVar58,uVar55);
    }
    else {
      if (uVar13 != 1) {
        ppppppdVar60 = (pppppppdVar52 + ((ulong)(uVar16 >> 0x10) & 0xff) * 2)[1];
        ppppppdVar49 = pppppppdVar52[((ulong)(uVar16 >> 0x10) & 0xff) * 2];
        uVar55 = SUB84(ppppppdVar49,0);
        uVar58 = (undefined4)((ulong)ppppppdVar49 >> 0x20);
        goto LAB_008c17b0;
      }
      ppppppdVar49 = (double ******)
                     FUN_008b4ec4(param_1,pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2);
      *unaff_x24 = ppppppdVar49;
      *(uint *)((long)unaff_x24 + 0xc) = 0xf;
    }
    uVar30 = uVar30 + 1;
    unaff_x24 = unaff_x24 + 2;
    lVar50 = lVar50 + 4;
  } while (uVar30 < *(byte *)((long)unaff_x22 + 6));
  pppppdVar53 = (double *****)((long)pppppdVar53 + lVar50);
LAB_008c20d4:
  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  pppppppdVar52 = *(double ********)(param_1 + 0x70);
  goto LAB_008be794;
switchD_008c3848_caseD_0:
  do {
    pppppdVar53 = (double *****)((long)pppppdVar53 + 4);
    pppppppdVar46 = pppppppdVar51;
    pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
    switch(*(undefined1 *)pppppdVar53) {
    case 1:
switchD_008c3848_caseD_1:
      do {
        lVar50 = **(long **)(param_1 + 0x50);
        uVar26 = *(undefined1 *)
                  (*(long *)(lVar50 + 0x60) +
                  ((ulong)((long)pppppdVar53 - *(long *)(lVar50 + 0x30)) >> 2 & 0xffffffff));
        if (*(long *)(*(long *)(param_1 + 0x60) + 0x678) != 0) {
          (*(long **)(param_1 + 0x50))[4] = (long)pppppdVar53;
          FUN_008be474(param_1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x678),0);
          if (*(char *)(param_1 + 3) != '\0') goto LAB_008c8794;
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
        }
        pppppppdVar46 = pppppppdVar51;
        pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
        switch(uVar26) {
        case 0:
          goto switchD_008c3848_caseD_0;
        case 2:
          goto switchD_008c3848_caseD_2;
        case 3:
          goto switchD_008c3848_caseD_3;
        case 4:
          goto switchD_008c3848_caseD_4;
        case 5:
          goto switchD_008c3848_caseD_5;
        case 6:
          goto switchD_008c3848_caseD_6;
        case 7:
switchD_008c3848_caseD_7:
          do {
            ppppppdVar49 = pppppppdVar51[2];
            pppppdVar53 = pppppdVar38 + 1;
            uVar13 = *(uint *)pppppdVar38;
            uVar16 = (uint)*(byte *)((long)ppppppdVar49 + 4) & uVar13 >> 0x18;
            pppppdVar19 = ppppppdVar49[5] + (ulong)uVar16 * 4;
            if ((((*(uint *)((long)pppppdVar19 + 0x1c) & 0xf) != 5) ||
                (pppppdVar19[2] != pppppdVar54[(ulong)*(uint *)((long)pppppdVar38 + 4) * 2])) ||
               (*(int *)((long)pppppdVar19 + 0xc) == 0)) {
              local_6c = 6;
              *(uint *)(param_1 + 0x2c) = uVar16;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
              local_78 = ppppppdVar49;
              FUN_008cadd4(param_1,&local_78);
              goto LAB_008c3950;
            }
            ppppppdVar49 = (double ******)*pppppdVar19;
            (pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2)[1] = (double ******)pppppdVar19[1];
            pppppppdVar52[(ulong)(byte)(uVar13 >> 8) * 2] = ppppppdVar49;
            uVar26 = *(undefined1 *)pppppdVar53;
LAB_008c3a18:
            pppppppdVar46 = pppppppdVar51;
            pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
            switch(uVar26) {
            case 0:
              goto switchD_008c3848_caseD_0;
            case 1:
              goto switchD_008c3848_caseD_1;
            case 2:
              goto switchD_008c3848_caseD_2;
            case 3:
              goto switchD_008c3848_caseD_3;
            case 4:
              goto switchD_008c3848_caseD_4;
            case 5:
              goto switchD_008c3848_caseD_5;
            case 6:
              goto switchD_008c3848_caseD_6;
            case 8:
switchD_008c3848_caseD_8:
              pppppppdVar31 = (double *******)pppppppdVar51[2];
              pppppdVar53 = pppppdVar38 + 1;
              uVar16 = (uint)*(byte *)((long)pppppppdVar31 + 4) & *(uint *)pppppdVar38 >> 0x18;
              ppppppdVar49 = pppppppdVar31[5] + (ulong)uVar16 * 4;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
              if ((((*(uint *)((long)ppppppdVar49 + 0x1c) & 0xf) != 5) ||
                  (ppppppdVar49[2] !=
                   (double *****)pppppdVar54[(ulong)*(uint *)((long)pppppdVar38 + 4) * 2])) ||
                 ((*(int *)((long)ppppppdVar49 + 0xc) == 0 ||
                  (*(char *)((long)pppppppdVar31 + 7) != '\0')))) {
                local_7c = 6;
                pppppppdVar46 = (double *******)&local_88;
                *(uint *)(param_1 + 0x2c) = uVar16;
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
                local_88 = pppppppdVar31;
LAB_008c4074:
                FUN_008cb374(param_1,pppppppdVar46);
LAB_008c3950:
                uVar26 = *(undefined1 *)(pppppdVar38 + 1);
                pppppppdVar52 = *(double ********)(param_1 + 0x70);
                *(undefined1 *)((long)pppppdVar38 + 3) = *(undefined1 *)(param_1 + 0x2c);
                do {
                  pppppppdVar46 = pppppppdVar51;
                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                  switch(uVar26) {
                  case 0:
                    goto switchD_008c3848_caseD_0;
                  case 1:
                    goto switchD_008c3848_caseD_1;
                  case 2:
                    goto switchD_008c3848_caseD_2;
                  case 3:
                    goto switchD_008c3848_caseD_3;
                  case 4:
                    goto switchD_008c3848_caseD_4;
                  case 5:
                    goto switchD_008c3848_caseD_5;
                  case 6:
                    goto switchD_008c3848_caseD_6;
                  case 7:
                    goto switchD_008c3848_caseD_7;
                  case 8:
                    goto switchD_008c3848_caseD_8;
                  case 9:
switchD_008c3848_caseD_9:
                    do {
                      pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
                      uVar16 = *(uint *)pppppdVar38;
                      bVar5 = (byte)(uVar16 >> 0x10);
                      pppppppdVar46 = pppppppdVar51 + (ulong)bVar5 * 2 + 4;
                      if (*(int *)((long)pppppppdVar51 + (ulong)bVar5 * 0x10 + 0x2c) == 0xf) {
                        pppppppdVar46 = (double *******)(*pppppppdVar46)[1];
                      }
                      ppppppdVar49 = *pppppppdVar46;
                      (pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2)[1] = pppppppdVar46[1];
                      pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = ppppppdVar49;
                      pppppppdVar46 = pppppppdVar51;
                      pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                      switch(*(undefined1 *)pppppdVar53) {
                      case 0:
                        goto switchD_008c3848_caseD_0;
                      case 1:
                        goto switchD_008c3848_caseD_1;
                      case 2:
                        goto switchD_008c3848_caseD_2;
                      case 3:
                        goto switchD_008c3848_caseD_3;
                      case 4:
                        goto switchD_008c3848_caseD_4;
                      case 5:
                        goto switchD_008c3848_caseD_5;
                      case 6:
                        goto switchD_008c3848_caseD_6;
                      case 7:
                        goto switchD_008c3848_caseD_7;
                      case 8:
                        goto switchD_008c3848_caseD_8;
                      case 10:
switchD_008c3848_caseD_a:
                        do {
                          pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                          pppppppdVar46 =
                               pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar53 >> 8) * 2;
                          ppppppdVar60 = pppppppdVar51
                                         [(ulong)(byte)(*(uint *)pppppdVar53 >> 0x10) * 2 + 4];
                          ppppppdVar49 = *pppppppdVar46;
                          pppppdVar53 = ppppppdVar60[1];
                          pppppdVar53[1] = (double ****)pppppppdVar46[1];
                          *pppppdVar53 = (double ****)ppppppdVar49;
                          pppppdVar53 = pppppdVar38;
                          if (((4 < (int)*(uint *)((long)pppppppdVar46 + 0xc)) &&
                              ((*(byte *)((long)ppppppdVar60 + 2) >> 2 & 1) != 0)) &&
                             (((ulong)**pppppppdVar46 & 0x30000) != 0)) {
                            FUN_008b6188(param_1);
                          }
LAB_008c3ab4:
                          pppppppdVar46 = pppppppdVar51;
                          pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                          switch(*(undefined1 *)pppppdVar53) {
                          case 0:
                            goto switchD_008c3848_caseD_0;
                          case 1:
                            goto switchD_008c3848_caseD_1;
                          case 2:
                            goto switchD_008c3848_caseD_2;
                          case 3:
                            goto switchD_008c3848_caseD_3;
                          case 4:
                            goto switchD_008c3848_caseD_4;
                          case 5:
                            goto switchD_008c3848_caseD_5;
                          case 6:
                            goto switchD_008c3848_caseD_6;
                          case 7:
                            goto switchD_008c3848_caseD_7;
                          case 8:
                            goto switchD_008c3848_caseD_8;
                          case 9:
                            goto switchD_008c3848_caseD_9;
                          case 0xb:
switchD_008c3848_caseD_b:
                            do {
                              if ((*(long *)(param_1 + 0x30) != 0) &&
                                 (pppppppdVar52 + (ulong)*(byte *)((long)pppppdVar53 + 1) * 2 <=
                                  *(double ********)(*(long *)(param_1 + 0x30) + 8))) {
                                FUN_008b4fa4(param_1);
                              }
                              pppppdVar53 = (double *****)((long)pppppdVar53 + 4);
                              pppppppdVar46 = pppppppdVar51;
                              pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                              switch(*(undefined1 *)pppppdVar53) {
                              case 0:
                                goto switchD_008c3848_caseD_0;
                              case 1:
                                goto switchD_008c3848_caseD_1;
                              case 2:
                                goto switchD_008c3848_caseD_2;
                              case 3:
                                goto switchD_008c3848_caseD_3;
                              case 4:
                                goto switchD_008c3848_caseD_4;
                              case 5:
                                goto switchD_008c3848_caseD_5;
                              case 6:
                                goto switchD_008c3848_caseD_6;
                              case 7:
                                goto switchD_008c3848_caseD_7;
                              case 8:
                                goto switchD_008c3848_caseD_8;
                              case 9:
                                goto switchD_008c3848_caseD_9;
                              case 10:
                                goto switchD_008c3848_caseD_a;
                              case 0xc:
switchD_008c3848_caseD_c:
                                do {
                                  pppppdVar53 = pppppdVar54 +
                                                (long)((int)*(uint *)pppppdVar38 >> 0x10) * 2;
                                  pppppppdVar46 =
                                       pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar38 >> 8) * 2;
                                  if ((*(int *)((long)pppppdVar53 + 0xc) == 0) ||
                                     (*(char *)((long)pppppppdVar51[2] + 3) == '\0')) {
                                    pppppdVar53 = pppppdVar38 + 1;
                                    uVar16 = *(uint *)((long)pppppdVar38 + 4);
                                    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53
                                    ;
                                    FUN_008c8e84(param_1,pppppppdVar51[2],pppppdVar54,pppppppdVar46,
                                                 uVar16,0);
                                    uVar26 = *(undefined1 *)(pppppdVar38 + 1);
                                    pppppppdVar52 = *(double ********)(param_1 + 0x70);
                                    goto LAB_008c3a18;
                                  }
                                  ppppppdVar49 = (double ******)*pppppdVar53;
                                  pppppppdVar46[1] = (double ******)pppppdVar53[1];
                                  *pppppppdVar46 = ppppppdVar49;
LAB_008c3b20:
                                  pppppdVar53 = pppppdVar38 + 1;
                                  pppppppdVar46 = pppppppdVar51;
                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                  switch(*(undefined1 *)pppppdVar53) {
                                  case 0:
                                    goto switchD_008c3848_caseD_0;
                                  case 1:
                                    goto switchD_008c3848_caseD_1;
                                  case 2:
                                    goto switchD_008c3848_caseD_2;
                                  case 3:
                                    goto switchD_008c3848_caseD_3;
                                  case 4:
                                    goto switchD_008c3848_caseD_4;
                                  case 5:
                                    goto switchD_008c3848_caseD_5;
                                  case 6:
                                    goto switchD_008c3848_caseD_6;
                                  case 7:
                                    goto switchD_008c3848_caseD_7;
                                  case 8:
                                    goto switchD_008c3848_caseD_8;
                                  case 9:
                                    goto switchD_008c3848_caseD_9;
                                  case 10:
                                    goto switchD_008c3848_caseD_a;
                                  case 0xb:
                                    goto switchD_008c3848_caseD_b;
                                  case 0xd:
switchD_008c3848_caseD_d:
                                    do {
                                      pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                                      uVar16 = *(uint *)pppppdVar53;
                                      pppppppdVar46 =
                                           pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
                                      pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2
                                      ;
                                      pdVar20 = (double *)
                                                ((long)pppppppdVar52 +
                                                ((ulong)(uVar16 >> 0x14) & 0xff0));
                                      pppppdVar53 = pppppdVar38;
                                      if ((*(uint *)((long)pppppppdVar46 + 0xc) != 6) ||
                                         (*(int *)((long)pdVar20 + 0xc) != 3)) {
LAB_008c4230:
                                        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                             pppppdVar38;
                                        goto LAB_008c424c;
                                      }
                                      ppppppdVar49 = *pppppppdVar46;
                                      iVar11 = (int)*pdVar20;
                                      uVar16 = iVar11 - 1;
                                      if ((*(uint *)(ppppppdVar49 + 1) <= uVar16) ||
                                         (*pdVar20 != (double)iVar11 ||
                                          ppppppdVar49[2] != (double *****)0x0)) goto LAB_008c4230;
                                      ppppppdVar60 = (double ******)
                                                     (ppppppdVar49[4] + (ulong)uVar16 * 2)[1];
                                      ppppdVar21 = ppppppdVar49[4][(ulong)uVar16 * 2];
                                      uVar55 = SUB84(ppppdVar21,0);
                                      uVar58 = (undefined4)((ulong)ppppdVar21 >> 0x20);
LAB_008c423c:
                                      pppppppdVar31[1] = ppppppdVar60;
                                      *pppppppdVar31 = (double ******)CONCAT44(uVar58,uVar55);
                                      pppppppdVar46 = pppppppdVar51;
                                      pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                      switch(*(undefined1 *)pppppdVar53) {
                                      case 0:
                                        goto switchD_008c3848_caseD_0;
                                      case 1:
                                        goto switchD_008c3848_caseD_1;
                                      case 2:
                                        goto switchD_008c3848_caseD_2;
                                      case 3:
                                        goto switchD_008c3848_caseD_3;
                                      case 4:
                                        goto switchD_008c3848_caseD_4;
                                      case 5:
                                        goto switchD_008c3848_caseD_5;
                                      case 6:
                                        goto switchD_008c3848_caseD_6;
                                      case 7:
                                        goto switchD_008c3848_caseD_7;
                                      case 8:
                                        goto switchD_008c3848_caseD_8;
                                      case 9:
                                        goto switchD_008c3848_caseD_9;
                                      case 10:
                                        goto switchD_008c3848_caseD_a;
                                      case 0xb:
                                        goto switchD_008c3848_caseD_b;
                                      case 0xc:
                                        goto switchD_008c3848_caseD_c;
                                      case 0xe:
switchD_008c3848_caseD_e:
                                        do {
                                          pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                                          uVar16 = *(uint *)pppppdVar53;
                                          pppppppdVar46 =
                                               pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
                                          pppppppdVar31 =
                                               pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
                                          pdVar20 = (double *)
                                                    ((long)pppppppdVar52 +
                                                    ((ulong)(uVar16 >> 0x14) & 0xff0));
                                          pppppdVar53 = pppppdVar38;
                                          if ((*(uint *)((long)pppppppdVar46 + 0xc) != 6) ||
                                             (*(int *)((long)pdVar20 + 0xc) != 3)) {
LAB_008c42d8:
                                            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                 pppppdVar38;
                                            goto LAB_008c4320;
                                          }
                                          ppppppdVar49 = *pppppppdVar46;
                                          iVar11 = (int)*pdVar20;
                                          uVar16 = iVar11 - 1;
                                          if ((*(uint *)(ppppppdVar49 + 1) <= uVar16) ||
                                             ((ppppppdVar49[2] != (double *****)0x0 ||
                                              (*pdVar20 != (double)iVar11 ||
                                               *(char *)((long)ppppppdVar49 + 7) != '\0'))))
                                          goto LAB_008c42d8;
                                          pppppdVar38 = ppppppdVar49[4];
                                          ppppppdVar60 = *pppppppdVar31;
                                          (pppppdVar38 + (ulong)uVar16 * 2)[1] =
                                               (double ****)pppppppdVar31[1];
                                          pppppdVar38[(ulong)uVar16 * 2] = (double ****)ppppppdVar60
                                          ;
LAB_008c42e4:
                                          if ((((int)*(uint *)((long)pppppppdVar31 + 0xc) < 5) ||
                                              ((*(byte *)((long)ppppppdVar49 + 2) >> 2 & 1) == 0))
                                             || (((ulong)**pppppppdVar31 & 0x30000) == 0))
                                          goto LAB_008c3ab4;
                                          FUN_008b6370(param_1,ppppppdVar49);
                                          pppppppdVar46 = pppppppdVar51;
                                          pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                          switch(*(undefined1 *)pppppdVar53) {
                                          case 0:
                                            goto switchD_008c3848_caseD_0;
                                          case 1:
                                            goto switchD_008c3848_caseD_1;
                                          case 2:
                                            goto switchD_008c3848_caseD_2;
                                          case 3:
                                            goto switchD_008c3848_caseD_3;
                                          case 4:
                                            goto switchD_008c3848_caseD_4;
                                          case 5:
                                            goto switchD_008c3848_caseD_5;
                                          case 6:
                                            goto switchD_008c3848_caseD_6;
                                          case 7:
                                            goto switchD_008c3848_caseD_7;
                                          case 8:
                                            goto switchD_008c3848_caseD_8;
                                          case 9:
                                            goto switchD_008c3848_caseD_9;
                                          case 10:
                                            goto switchD_008c3848_caseD_a;
                                          case 0xb:
                                            goto switchD_008c3848_caseD_b;
                                          case 0xc:
                                            goto switchD_008c3848_caseD_c;
                                          case 0xd:
                                            goto switchD_008c3848_caseD_d;
                                          case 0xf:
                                            goto switchD_008c3848_caseD_f;
                                          case 0x10:
                                            goto switchD_008c3848_caseD_10;
                                          case 0x11:
switchD_008c3848_caseD_11:
                                            do {
                                              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                                              uVar16 = *(uint *)pppppdVar53;
                                              pppppppdVar46 =
                                                   pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2
                                              ;
                                              uVar13 = uVar16 >> 0x18;
                                              pppppppdVar31 =
                                                   pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
                                              pppppdVar53 = pppppdVar38;
                                              if (((*(uint *)((long)pppppppdVar46 + 0xc) == 6) &&
                                                  (ppppppdVar49 = *pppppppdVar46,
                                                  uVar13 < *(uint *)(ppppppdVar49 + 1))) &&
                                                 (ppppppdVar49[2] == (double *****)0x0)) {
                                                ppppppdVar60 = (double ******)
                                                               (ppppppdVar49[4] + (ulong)uVar13 * 2)
                                                               [1];
                                                ppppdVar21 = ppppppdVar49[4][(ulong)uVar13 * 2];
                                                uVar55 = SUB84(ppppdVar21,0);
                                                uVar58 = (undefined4)((ulong)ppppdVar21 >> 0x20);
                                                goto LAB_008c423c;
                                              }
                                              pdVar20 = &local_98;
                                              local_98 = (double)(uVar13 + 1);
                                              local_8c = 3;
                                              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                   pppppdVar38;
LAB_008c424c:
                                              FUN_008cadd4(param_1,pppppppdVar46,pdVar20);
LAB_008c450c:
                                              pppppppdVar52 = *(double ********)(param_1 + 0x70);
                                              pppppppdVar46 = pppppppdVar51;
                                              pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                              switch(*(undefined1 *)pppppdVar53) {
                                              case 0:
                                                goto switchD_008c3848_caseD_0;
                                              case 1:
                                                goto switchD_008c3848_caseD_1;
                                              case 2:
                                                goto switchD_008c3848_caseD_2;
                                              case 3:
                                                goto switchD_008c3848_caseD_3;
                                              case 4:
                                                goto switchD_008c3848_caseD_4;
                                              case 5:
                                                goto switchD_008c3848_caseD_5;
                                              case 6:
                                                goto switchD_008c3848_caseD_6;
                                              case 7:
                                                goto switchD_008c3848_caseD_7;
                                              case 8:
                                                goto switchD_008c3848_caseD_8;
                                              case 9:
                                                goto switchD_008c3848_caseD_9;
                                              case 10:
                                                goto switchD_008c3848_caseD_a;
                                              case 0xb:
                                                goto switchD_008c3848_caseD_b;
                                              case 0xc:
                                                goto switchD_008c3848_caseD_c;
                                              case 0xd:
                                                goto switchD_008c3848_caseD_d;
                                              case 0xe:
                                                goto switchD_008c3848_caseD_e;
                                              case 0xf:
                                                goto switchD_008c3848_caseD_f;
                                              case 0x10:
                                                goto switchD_008c3848_caseD_10;
                                              case 0x12:
switchD_008c3848_caseD_12:
                                                pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                                                uVar16 = *(uint *)pppppdVar53;
                                                pppppppdVar46 =
                                                     pppppppdVar52 +
                                                     (ulong)(byte)(uVar16 >> 0x10) * 2;
                                                pppppppdVar31 =
                                                     pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
                                                uVar16 = uVar16 >> 0x18;
                                                pppppdVar53 = pppppdVar38;
                                                if ((((*(uint *)((long)pppppppdVar46 + 0xc) == 6) &&
                                                     (ppppppdVar49 = *pppppppdVar46,
                                                     uVar16 < *(uint *)(ppppppdVar49 + 1))) &&
                                                    (ppppppdVar49[2] == (double *****)0x0)) &&
                                                   (*(char *)((long)ppppppdVar49 + 7) == '\0')) {
                                                  pppppdVar38 = ppppppdVar49[4];
                                                  ppppppdVar60 = *pppppppdVar31;
                                                  (pppppdVar38 + (ulong)uVar16 * 2)[1] =
                                                       (double ****)pppppppdVar31[1];
                                                  pppppdVar38[(ulong)uVar16 * 2] =
                                                       (double ****)ppppppdVar60;
                                                  goto LAB_008c42e4;
                                                }
                                                pdVar20 = &local_a8;
                                                local_a8 = (double)(uVar16 + 1);
                                                local_9c = 3;
                                                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                     pppppdVar38;
LAB_008c4320:
                                                FUN_008cb374(param_1,pppppppdVar46,pdVar20);
                                                goto LAB_008c450c;
                                              case 0x13:
switchD_008c3848_caseD_13:
                                                pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                                                uVar16 = *(uint *)pppppdVar53;
                                                unaff_x22 = *(double ********)
                                                             (*(long *)(**(long **)(param_1 + 0x50)
                                                                       + 0x38) +
                                                             (long)((int)uVar16 >> 0x10) * 8);
                                                (*(long **)(param_1 + 0x50))[4] = (long)pppppdVar38;
                                                ppppppdVar49 = (double ******)
                                                               FUN_008b4d5c(param_1,*(undefined1 *)
                                                                                     ((long)
                                                  unaff_x22 + 6),pppppppdVar51[2],unaff_x22);
                                                pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] =
                                                     ppppppdVar49;
                                                cVar3 = *(char *)((long)unaff_x22 + 6);
                                                *(uint *)((long)(pppppppdVar52 +
                                                                (ulong)(byte)(uVar16 >> 8) * 2) +
                                                         0xc) = 7;
                                                if (cVar3 != '\0') {
                                                  lVar50 = 0;
                                                  uVar30 = 0;
                                                  ppppppdVar49 = ppppppdVar49 + 4;
                                                  do {
                                                    uVar16 = *(uint *)((long)pppppdVar38 +
                                                                      uVar30 * 4);
                                                    uVar13 = uVar16 >> 8 & 0xff;
                                                    if (uVar13 == 2) {
                                                      ppppppdVar62 = (pppppppdVar51 +
                                                                     ((ulong)(uVar16 >> 0x10) & 0xff
                                                                     ) * 2 + 4)[1];
                                                      ppppppdVar60 = pppppppdVar51
                                                                     [((ulong)(uVar16 >> 0x10) &
                                                                      0xff) * 2 + 4];
                                                      uVar55 = SUB84(ppppppdVar60,0);
                                                      uVar58 = (undefined4)
                                                               ((ulong)ppppppdVar60 >> 0x20);
LAB_008c447c:
                                                      ppppppdVar49[1] = (double *****)ppppppdVar62;
                                                      *ppppppdVar49 =
                                                           (double *****)CONCAT44(uVar58,uVar55);
                                                    }
                                                    else {
                                                      if (uVar13 != 1) {
                                                        ppppppdVar62 = (pppppppdVar52 +
                                                                       ((ulong)(uVar16 >> 0x10) &
                                                                       0xff) * 2)[1];
                                                        ppppppdVar60 = pppppppdVar52
                                                                       [((ulong)(uVar16 >> 0x10) &
                                                                        0xff) * 2];
                                                        uVar55 = SUB84(ppppppdVar60,0);
                                                        uVar58 = (undefined4)
                                                                 ((ulong)ppppppdVar60 >> 0x20);
                                                        goto LAB_008c447c;
                                                      }
                                                      pppppdVar53 = (double *****)
                                                                    FUN_008b4ec4(param_1,
                                                  pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2
                                                  );
                                                  *ppppppdVar49 = pppppdVar53;
                                                  *(undefined4 *)((long)ppppppdVar49 + 0xc) = 0xf;
                                                  }
                                                  uVar30 = uVar30 + 1;
                                                  ppppppdVar49 = ppppppdVar49 + 2;
                                                  lVar50 = lVar50 + 4;
                                                  } while (uVar30 < *(byte *)((long)unaff_x22 + 6));
                                                  pppppdVar38 = (double *****)
                                                                ((long)pppppdVar38 + lVar50);
                                                }
                                                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                     pppppdVar38;
                                                pppppdVar53 = pppppdVar38;
                                                if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <=
                                                    *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
                                                  FUN_008b52c4(param_1,1);
                                                }
                                                goto LAB_008c450c;
                                              case 0x14:
switchD_008c3848_caseD_14:
                                                do {
                                                  uVar16 = *(uint *)pppppdVar38;
                                                  pppppdVar53 = pppppdVar38 + 1;
                                                  uVar30 = (ulong)(uVar16 >> 8) & 0xff;
                                                  unaff_x22 = (double *******)
                                                              (pppppdVar54 +
                                                              (ulong)*(uint *)((long)pppppdVar38 + 4
                                                                              ) * 2);
                                                  pppppppdVar46 =
                                                       pppppppdVar52 +
                                                       (ulong)(byte)(uVar16 >> 0x10) * 2;
                                                  pppppppdVar31 =
                                                       pppppppdVar52 +
                                                       (ulong)(byte)(uVar16 >> 8) * 2;
                                                  uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
                                                  if (uVar13 == 6) {
                                                    ppppppdVar49 = *pppppppdVar46;
                                                    pppppdVar19 = ppppppdVar49[5] +
                                                                  (ulong)(*(uint *)(*unaff_x22 + 2)
                                                                         & (-1 << (ulong)(*(byte *)(
                                                  (long)ppppppdVar49 + 5) & 0x1f) ^ 0xffffffffU)) *
                                                  4;
                                                  if ((((*(uint *)((long)pppppdVar19 + 0x1c) & 0xf)
                                                        != 5) ||
                                                      ((double ******)pppppdVar19[2] != *unaff_x22))
                                                     || (*(int *)((long)pppppdVar19 + 0xc) == 0)) {
                                                    if (((*(uint *)((long)pppppdVar19 + 0x1c) < 0x10
                                                         ) && (pppppdVar19 = ppppppdVar49[2],
                                                              pppppdVar19 != (double *****)0x0)) &&
                                                       (((ulong)*pppppdVar19 & 0x1000000000000) == 0
                                                       )) {
                                                      if ((*(byte *)((long)pppppdVar19 + 7) >> 1 & 1
                                                          ) == 0) {
                                                        ppppdVar21 = (double ****)
                                                                     FUN_008bdfe0(pppppdVar19,0,
                                                                                  *(undefined8 *)
                                                                                   (*(long *)(
                                                  param_1 + 0x60) + 0x338));
                                                  if (ppppdVar21 == (double ****)0x0)
                                                  goto LAB_008c4644;
                                                  }
                                                  else {
                                                    ppppdVar21 = pppppdVar19[4] + -2;
                                                  }
                                                  if (*(int *)((long)ppppdVar21 + 0xc) == 6) {
                                                    ppdVar28 = (*ppppdVar21)[5];
                                                    if (((ppdVar28 != (double **)0x0) &&
                                                        (ppdVar28 = ppdVar28 +
                                                                    (ulong)((uint)*(byte *)((long)*
                                                  ppppdVar21 + 4) & uVar16 >> 0x18) * 4,
                                                  (*(uint *)((long)ppdVar28 + 0x1c) & 0xf) == 5)) &&
                                                  (((double ******)ppdVar28[2] == *unaff_x22 &&
                                                   (*(int *)((long)ppdVar28 + 0xc) != 0)))) {
                                                    ppppppdVar49 = *pppppppdVar46;
                                                    pppppppdVar31[3] = pppppppdVar46[1];
                                                    pppppppdVar31[2] = ppppppdVar49;
                                                    ppppppdVar49 = (double ******)ppdVar28[1];
                                                    uVar55 = SUB84(*ppdVar28,0);
                                                    uVar58 = (undefined4)((ulong)*ppdVar28 >> 0x20);
                                                    goto LAB_008c45e8;
                                                  }
                                                  }
                                                  }
LAB_008c4644:
                                                  ppppppdVar49 = pppppppdVar46[1];
                                                  uVar55 = SUB84(*pppppppdVar46,0);
                                                  uVar58 = (undefined4)
                                                           ((ulong)*pppppppdVar46 >> 0x20);
                                                  uVar16 = uVar16 >> 0x18;
LAB_008c464c:
                                                  pppppppdVar31[3] = ppppppdVar49;
                                                  pppppppdVar31[2] =
                                                       (double ******)CONCAT44(uVar58,uVar55);
                                                  *(uint *)(param_1 + 0x2c) = uVar16;
                                                  *(double ******)(*(long *)(param_1 + 0x50) + 0x20)
                                                       = pppppdVar53;
                                                  FUN_008cadd4(param_1,pppppppdVar46,unaff_x22);
                                                  pppppppdVar52 = *(double ********)(param_1 + 0x70)
                                                  ;
                                                  pppppppdVar46 = pppppppdVar52 + uVar30 * 2;
                                                  *(undefined1 *)((long)pppppdVar38 + 3) =
                                                       *(undefined1 *)(param_1 + 0x2c);
                                                  goto LAB_008c4678;
                                                  }
                                                  ppppppdVar49 = *pppppppdVar46;
                                                  pppppppdVar31[3] = pppppppdVar46[1];
                                                  pppppppdVar31[2] = ppppppdVar49;
                                                  ppppppdVar49 = (double ******)pppppdVar19[1];
                                                  uVar55 = SUB84(*pppppdVar19,0);
                                                  uVar58 = (undefined4)((ulong)*pppppdVar19 >> 0x20)
                                                  ;
LAB_008c45e8:
                                                  pppppppdVar31[1] = ppppppdVar49;
                                                  *pppppppdVar31 =
                                                       (double ******)CONCAT44(uVar58,uVar55);
                                                  }
                                                  else {
                                                    if (uVar13 == 8) {
                                                      ppppppdVar49 = *pppppppdVar46 + 1;
                                                    }
                                                    else {
                                                      ppppppdVar49 = (double ******)
                                                                     (*(long *)(param_1 + 0x60) +
                                                                      (long)(int)uVar13 * 8 + 0x448)
                                                      ;
                                                    }
                                                    pppppdVar19 = *ppppppdVar49;
                                                    if (pppppdVar19 != (double *****)0x0) {
                                                      bVar5 = *(byte *)((long)pppppdVar19 + 6);
                                                      if ((bVar5 >> 3 & 1) == 0) {
                                                        if ((*(byte *)((long)pppppdVar19 + 7) >> 1 &
                                                            1) == 0) {
                                                          ppppdVar21 = (double ****)
                                                                       FUN_008bdfe0(pppppdVar19,3,
                                                                                    *(undefined8 *)
                                                                                     (*(long *)(
                                                  param_1 + 0x60) + 0x350));
                                                  if (ppppdVar21 == (double ****)0x0) {
                                                    bVar5 = *(byte *)((long)pppppdVar19 + 6);
                                                    goto LAB_008c471c;
                                                  }
                                                  }
                                                  else {
                                                    ppppdVar21 = pppppdVar19[4] + -8;
                                                  }
                                                  ppppppdVar49 = *pppppppdVar46;
                                                  pppppppdVar31[3] = pppppppdVar46[1];
                                                  pppppppdVar31[2] = ppppppdVar49;
                                                  ppppppdVar49 = (double ******)*ppppdVar21;
                                                  pppppppdVar31[1] = (double ******)ppppdVar21[1];
                                                  *pppppppdVar31 = ppppppdVar49;
                                                  *(double *******)(param_1 + 8) = *unaff_x22;
                                                  goto LAB_008c4688;
                                                  }
LAB_008c471c:
                                                  if ((bVar5 & 1) == 0) {
                                                    if ((*(byte *)((long)pppppdVar19 + 7) >> 1 & 1)
                                                        == 0) {
                                                      ppppdVar21 = (double ****)
                                                                   FUN_008bdfe0(pppppdVar19,0,
                                                                                *(undefined8 *)
                                                                                 (*(long *)(param_1 
                                                  + 0x60) + 0x338));
                                                  if (ppppdVar21 == (double ****)0x0)
                                                  goto LAB_008c47d8;
                                                  }
                                                  else {
                                                    ppppdVar21 = pppppdVar19[4] + -2;
                                                  }
                                                  if (*(int *)((long)ppppdVar21 + 0xc) == 6) {
                                                    uVar16 = (uint)*(byte *)((long)*ppppdVar21 + 4)
                                                             & uVar16 >> 0x18;
                                                    ppdVar28 = (*ppppdVar21)[5] + (ulong)uVar16 * 4;
                                                    if ((((*(uint *)((long)ppdVar28 + 0x1c) & 0xf)
                                                          == 5) &&
                                                        ((double ******)ppdVar28[2] == *unaff_x22))
                                                       && (*(int *)((long)ppdVar28 + 0xc) != 0)) {
                                                      ppppppdVar49 = *pppppppdVar46;
                                                      pppppppdVar31[3] = pppppppdVar46[1];
                                                      pppppppdVar31[2] = ppppppdVar49;
                                                      ppppppdVar49 = (double ******)ppdVar28[1];
                                                      uVar55 = SUB84(*ppdVar28,0);
                                                      uVar58 = (undefined4)
                                                               ((ulong)*ppdVar28 >> 0x20);
                                                      goto LAB_008c45e8;
                                                    }
                                                    ppppppdVar49 = pppppppdVar46[1];
                                                    uVar55 = SUB84(*pppppppdVar46,0);
                                                    uVar58 = (undefined4)
                                                             ((ulong)*pppppppdVar46 >> 0x20);
                                                    goto LAB_008c464c;
                                                  }
                                                  }
                                                  }
LAB_008c47d8:
                                                  if ((DAT_00d1fdd0 == 1) &&
                                                     (*(uint *)((long)pppppppdVar46 + 0xc) == 0xc))
                                                  {
                                                    ppppppdVar49 = *pppppppdVar46;
                                                    uVar16 = uVar16 >> 0x18;
                                                    pppppdVar19 = ppppppdVar49[2];
                                                    if ((uVar16 < *(int *)((long)pppppdVar19 + 0x5c)
                                                                  - (uint)*(byte *)(pppppdVar19 +
                                                                                   0xd)) &&
                                                       (*unaff_x22 ==
                                                        (double ******)pppppdVar19[8][uVar16])) {
                                                      ppppppdVar60 = *pppppppdVar46;
                                                      pppppppdVar31[3] = pppppppdVar46[1];
                                                      pppppppdVar31[2] = ppppppdVar60;
                                                      uVar13 = *(uint *)(ppppppdVar49[2] + 0xb);
                                                      if (uVar16 < uVar13) {
                                                        pppppdVar38 = ppppppdVar49[4] +
                                                                      (ulong)uVar16 * 2;
                                                      }
                                                      else {
                                                        pppppdVar38 = (double *****)
                                                                      (ppppppdVar49[2][5] +
                                                                      (ulong)(uVar16 - uVar13) * 2);
                                                      }
                                                      ppppppdVar49 = (double ******)*pppppdVar38;
                                                      pppppppdVar31[1] =
                                                           (double ******)pppppdVar38[1];
                                                      *pppppppdVar31 = ppppppdVar49;
                                                    }
                                                    else {
                                                      pdVar20 = (double *)
                                                                FUN_008bb440(pppppdVar19[7]);
                                                      if (*(int *)((long)pdVar20 + 0xc) == 0)
                                                      goto LAB_008c8920;
                                                      ppppppdVar60 = *pppppppdVar46;
                                                      dVar63 = *pdVar20;
                                                      pppppppdVar31[3] = pppppppdVar46[1];
                                                      pppppppdVar31[2] = ppppppdVar60;
                                                      uVar13 = (uint)dVar63;
                                                      uVar16 = *(uint *)(ppppppdVar49[2] + 0xb);
                                                      ppppppdVar60 = ppppppdVar49 + 4;
                                                      if (uVar16 <= uVar13) {
                                                        ppppppdVar60 = (double ******)
                                                                       (ppppppdVar49[2] + 5);
                                                      }
                                                      uVar12 = 0;
                                                      if (uVar16 <= uVar13) {
                                                        uVar12 = uVar16;
                                                      }
                                                      ppppppdVar49 = (double ******)
                                                                     (*ppppppdVar60)
                                                                     [(ulong)(uVar13 - uVar12) * 2];
                                                      pppppppdVar31[1] =
                                                           (double ******)
                                                           (*ppppppdVar60 +
                                                           (ulong)(uVar13 - uVar12) * 2)[1];
                                                      *pppppppdVar31 = ppppppdVar49;
                                                      *(char *)((long)pppppdVar38 + 3) =
                                                           (char)uVar13;
                                                    }
                                                  }
                                                  else {
                                                    ppppppdVar49 = *pppppppdVar46;
                                                    pppppppdVar31[3] = pppppppdVar46[1];
                                                    pppppppdVar31[2] = ppppppdVar49;
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar53;
                                                    FUN_008cadd4(param_1,pppppppdVar46,unaff_x22);
                                                    pppppppdVar52 =
                                                         *(double ********)(param_1 + 0x70);
                                                    pppppppdVar46 = pppppppdVar52 + uVar30 * 2;
LAB_008c4678:
                                                    if (*(uint *)((long)pppppppdVar46 + 0xc) == 0) {
                                                      if (*(long *)(lVar17 + 0x28) != local_68)
                                                      goto LAB_008c8944;
                                                      FUN_008b3cbc(param_1,pppppppdVar46 + 2,
                                                                   *unaff_x22);
LAB_008c8888:
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      if (*(long *)(lVar17 + 0x28) != local_68)
                                                      goto LAB_008c8944;
                                                      pcVar25 = "iterate over";
                                                      goto LAB_008c86e4;
                                                    }
                                                  }
                                                  }
LAB_008c4688:
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x15:
switchD_008c3848_caseD_15:
                                                    do {
                                                      UNRECOVERED_JUMPTABLE =
                                                           *(code **)(*(long *)(param_1 + 0x60) +
                                                                     0x688);
                                                      lVar50 = *(long *)(param_1 + 0x50);
                                                      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                                                        *(double ******)(lVar50 + 0x20) =
                                                             pppppdVar38;
                                                        *(long *)(*(long *)(param_1 + 0x50) + 0x20)
                                                             = *(long *)(*(long *)(param_1 + 0x50) +
                                                                        0x20) + 4;
                                                        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff)
                                                        ;
                                                        lVar50 = *(long *)(param_1 + 0x50);
                                                        if (*(char *)(param_1 + 3) != '\0') {
LAB_008c8788:
                                                          *(long *)(lVar50 + 0x20) =
                                                               *(long *)(lVar50 + 0x20) + -4;
                                                          goto LAB_008c8794;
                                                        }
                                                        pppppppdVar52 =
                                                             *(double ********)(param_1 + 0x70);
                                                      }
                                                      pppppdVar53 = (double *****)
                                                                    ((long)pppppdVar38 + 4);
                                                      uVar16 = *(uint *)pppppdVar38;
                                                      pppppppdVar52 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 8) * 2;
                                                      pppppppdVar31 = pppppppdVar52 + 2;
                                                      pppppppdVar35 =
                                                           *(double ********)(param_1 + 0x68);
                                                      if ((uVar16 >> 0x10 & 0xff) != 0) {
                                                        pppppppdVar35 =
                                                             pppppppdVar31 +
                                                             (ulong)(byte)(uVar16 >> 0x10) * 2 + -2;
                                                      }
                                                      if (*(uint *)((long)pppppppdVar52 + 0xc) != 7)
                                                      {
                                                        *(double ******)(lVar50 + 0x20) =
                                                             pppppdVar53;
                                                        FUN_008cda50(param_1,pppppppdVar52);
                                                        lVar50 = *(long *)(param_1 + 0x50);
                                                        pppppppdVar35 = pppppppdVar35 + 2;
                                                      }
                                                      pppppppdVar51 = (double *******)*pppppppdVar52
                                                      ;
                                                      *(double ******)(lVar50 + 0x20) = pppppdVar53;
                                                      if (*(long *)(param_1 + 0x50) ==
                                                          *(long *)(param_1 + 0x18)) {
                                                        unaff_x22 = (double *******)
                                                                    FUN_008b4200(param_1);
                                                      }
                                                      else {
                                                        unaff_x22 = (double *******)
                                                                    (*(long *)(param_1 + 0x50) +
                                                                    0x30);
                                                        *(double ********)(param_1 + 0x50) =
                                                             unaff_x22;
                                                      }
                                                      cVar3 = *(char *)((long)pppppppdVar51 + 6);
                                                      unaff_x22[1] = (double ******)pppppppdVar52;
                                                      if (cVar3 == '\0') {
                                                        ppppppdVar49 = pppppppdVar51[3];
                                                        if ((DAT_00d1fdf0 == '\x01') &&
                                                           (ppppppdVar60 = (double ******)
                                                                           ppppppdVar49[0x1a],
                                                           (double ******)ppppppdVar49[0x1a] !=
                                                           (double ******)0x0)) {
                                                          do {
                                                            ppppppdVar49 = ppppppdVar60;
                                                            pppppppdVar51[3] = ppppppdVar49;
                                                            ppppppdVar60 = (double ******)
                                                                           ppppppdVar49[0x1a];
                                                          } while ((double ******)ppppppdVar49[0x1a]
                                                                   != (double ******)0x0);
                                                          *(undefined1 *)((long)pppppppdVar51 + 4) =
                                                               *(undefined1 *)
                                                                ((long)ppppppdVar49 + 5);
                                                        }
                                                      }
                                                      else {
                                                        ppppppdVar49 = (double ******)0x0;
                                                      }
                                                      bVar5 = *(byte *)((long)pppppppdVar51 + 4);
                                                      *unaff_x22 = ppppppdVar49;
                                                      unaff_x22[4] = (double ******)0x0;
                                                      lVar50 = *(long *)(param_1 + 0x48);
                                                      unaff_x22[2] = (double ******)pppppppdVar31;
                                                      unaff_x22[3] = (double ******)
                                                                     (pppppppdVar35 +
                                                                     (ulong)bVar5 * 2);
                                                      bVar5 = *(byte *)((long)pppppppdVar51 + 4);
                                                      uVar13 = (uVar16 >> 0x18) - 1;
                                                      *(uint *)(unaff_x22 + 5) = uVar13;
                                                      *(uint *)((long)unaff_x22 + 0x2c) = 0;
                                                      *(double ********)(param_1 + 0x68) =
                                                           pppppppdVar35;
                                                      *(double ********)(param_1 + 0x70) =
                                                           pppppppdVar31;
                                                      if (lVar50 - (long)pppppppdVar35 <=
                                                          (long)((ulong)bVar5 * 0x10)) {
                                                        iVar14 = *(int *)(param_1 + 0x40);
                                                        iVar11 = iVar14 + (uint)bVar5;
                                                        if ((int)(uint)bVar5 <= iVar14) {
                                                          iVar11 = iVar14 << 1;
                                                        }
                                                        FUN_008b3fdc(param_1,iVar11,1);
                                                      }
                                                      if (*(char *)((long)pppppppdVar51 + 6) != '\0'
                                                         ) {
                                                        uVar12 = (*(code *)pppppppdVar51[5])
                                                                           (param_1);
                                                        if ((int)uVar12 < 0) goto LAB_008c8794;
                                                        lVar50 = *(long *)(param_1 + 0x50);
                                                        puVar22 = *(undefined8 **)(lVar50 + 8);
                                                        if ((uVar13 != 0) && (uVar12 != 0)) {
                                                          puVar32 = *(undefined8 **)(param_1 + 0x68)
                                                          ;
                                                          puVar37 = puVar22;
                                                          puVar40 = puVar32 + (ulong)uVar12 * -2;
                                                          do {
                                                            puVar39 = puVar40 + 2;
                                                            uVar23 = *puVar40;
                                                            uVar13 = uVar13 - 1;
                                                            puVar22 = puVar37 + 2;
                                                            puVar37[1] = puVar40[1];
                                                            *puVar37 = uVar23;
                                                            if (uVar13 == 0) break;
                                                            puVar37 = puVar22;
                                                            puVar40 = puVar39;
                                                          } while (puVar39 < puVar32);
                                                        }
                                                        if (0 < (int)uVar13) {
                                                          if (uVar13 == 1) {
                                                            iVar11 = 1;
                                                            puVar37 = puVar22;
                                                          }
                                                          else {
                                                            uVar44 = (ulong)uVar13 & 0x7ffffffe;
                                                            puVar37 = puVar22 + uVar44 * 2;
                                                            iVar11 = uVar13 - (int)uVar44;
                                                            puVar34 = (undefined4 *)
                                                                      ((long)puVar22 + 0x1c);
                                                            uVar30 = uVar44;
                                                            do {
                                                              uVar30 = uVar30 - 2;
                                                              puVar34[-4] = 0;
                                                              *puVar34 = 0;
                                                              puVar34 = puVar34 + 8;
                                                            } while (uVar30 != 0);
                                                            puVar22 = puVar37;
                                                            if (uVar44 == uVar13) goto LAB_008c4bb8;
                                                          }
                                                          uVar13 = iVar11 + 1;
                                                          do {
                                                            uVar13 = uVar13 - 1;
                                                            *(undefined4 *)((long)puVar37 + 0xc) = 0
                                                            ;
                                                            puVar22 = puVar37 + 2;
                                                            puVar37 = puVar37 + 2;
                                                          } while (1 < uVar13);
                                                        }
LAB_008c4bb8:
                                                        pppppppdVar52 =
                                                             *(double ********)(lVar50 + -0x20);
                                                        *(long *)(param_1 + 0x50) = lVar50 + -0x30;
                                                        *(double ********)(param_1 + 0x70) =
                                                             pppppppdVar52;
                                                        if ((uVar16 & 0xff000000) != 0) {
                                                          puVar22 = *(undefined8 **)(lVar50 + -0x18)
                                                          ;
                                                        }
                                                        uVar26 = *(undefined1 *)pppppdVar53;
                                                        *(undefined8 **)(param_1 + 0x68) = puVar22;
                                                        pppppppdVar51 = pppppppdVar46;
                                                        pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                        switch(uVar26) {
                                                        case 0:
                                                          goto switchD_008c3848_caseD_0;
                                                        case 1:
                                                          goto switchD_008c3848_caseD_1;
                                                        case 2:
                                                          goto switchD_008c3848_caseD_2;
                                                        case 3:
                                                          goto switchD_008c3848_caseD_3;
                                                        case 4:
                                                          goto switchD_008c3848_caseD_4;
                                                        case 5:
                                                          goto switchD_008c3848_caseD_5;
                                                        case 6:
                                                          goto switchD_008c3848_caseD_6;
                                                        case 7:
                                                          goto switchD_008c3848_caseD_7;
                                                        case 8:
                                                          goto switchD_008c3848_caseD_8;
                                                        case 9:
                                                          goto switchD_008c3848_caseD_9;
                                                        case 10:
                                                          goto switchD_008c3848_caseD_a;
                                                        case 0xb:
                                                          goto switchD_008c3848_caseD_b;
                                                        case 0xc:
                                                          goto switchD_008c3848_caseD_c;
                                                        case 0xd:
                                                          goto switchD_008c3848_caseD_d;
                                                        case 0xe:
                                                          goto switchD_008c3848_caseD_e;
                                                        case 0xf:
                                                          goto switchD_008c3848_caseD_f;
                                                        case 0x10:
                                                          goto switchD_008c3848_caseD_10;
                                                        case 0x11:
                                                          goto switchD_008c3848_caseD_11;
                                                        case 0x12:
                                                          goto switchD_008c3848_caseD_12;
                                                        case 0x13:
                                                          goto switchD_008c3848_caseD_13;
                                                        case 0x14:
                                                          goto switchD_008c3848_caseD_14;
                                                        case 0x16:
                                                          goto switchD_008c3848_caseD_16;
                                                        case 0x17:
                                                          goto switchD_008c3848_caseD_17;
                                                        case 0x18:
                                                          goto switchD_008c3848_caseD_18;
                                                        case 0x19:
                                                          goto switchD_008c3848_caseD_19;
                                                        case 0x1a:
                                                          goto switchD_008c3848_caseD_1a;
                                                        case 0x1b:
                                                          goto switchD_008c3848_caseD_1b;
                                                        case 0x1c:
                                                          goto switchD_008c3848_caseD_1c;
                                                        case 0x1d:
                                                          goto switchD_008c3848_caseD_1d;
                                                        case 0x1e:
                                                          goto switchD_008c3848_caseD_1e;
                                                        case 0x1f:
                                                          goto switchD_008c3848_caseD_1f;
                                                        case 0x20:
                                                          goto switchD_008c3848_caseD_20;
                                                        case 0x21:
                                                          goto switchD_008c3848_caseD_21;
                                                        case 0x22:
                                                          goto switchD_008c3848_caseD_22;
                                                        case 0x23:
                                                          goto switchD_008c3848_caseD_23;
                                                        case 0x24:
                                                          goto switchD_008c3848_caseD_24;
                                                        case 0x25:
                                                          goto switchD_008c3848_caseD_25;
                                                        case 0x26:
                                                          goto switchD_008c3848_caseD_26;
                                                        case 0x27:
                                                          goto switchD_008c3848_caseD_27;
                                                        case 0x28:
                                                          goto switchD_008c3848_caseD_28;
                                                        case 0x29:
                                                          goto switchD_008c3848_caseD_29;
                                                        case 0x2a:
                                                          goto switchD_008c3848_caseD_2a;
                                                        case 0x2b:
                                                          goto switchD_008c3848_caseD_2b;
                                                        case 0x2c:
                                                          goto switchD_008c3848_caseD_2c;
                                                        case 0x2d:
                                                          goto switchD_008c3848_caseD_2d;
                                                        case 0x2e:
                                                          goto switchD_008c3848_caseD_2e;
                                                        case 0x2f:
                                                          goto switchD_008c3848_caseD_2f;
                                                        case 0x30:
                                                          goto switchD_008c3848_caseD_30;
                                                        case 0x31:
                                                          goto switchD_008c3848_caseD_31;
                                                        case 0x32:
                                                          goto switchD_008c3848_caseD_32;
                                                        case 0x33:
                                                          goto switchD_008c3848_caseD_33;
                                                        case 0x34:
                                                          goto switchD_008c3848_caseD_34;
                                                        case 0x35:
                                                          goto switchD_008c3848_caseD_35;
                                                        case 0x36:
                                                          goto switchD_008c3848_caseD_36;
                                                        case 0x37:
                                                          goto switchD_008c3848_caseD_37;
                                                        case 0x38:
                                                          goto switchD_008c3848_caseD_38;
                                                        case 0x39:
                                                          goto switchD_008c3848_caseD_39;
                                                        case 0x3a:
                                                          goto switchD_008c3848_caseD_3a;
                                                        case 0x3b:
                                                          goto switchD_008c3848_caseD_3b;
                                                        case 0x3c:
                                                          goto switchD_008c3848_caseD_3c;
                                                        case 0x3d:
                                                          goto switchD_008c3848_caseD_3d;
                                                        case 0x3e:
                                                          goto switchD_008c3848_caseD_3e;
                                                        case 0x3f:
                                                          goto switchD_008c3848_caseD_3f;
                                                        case 0x40:
                                                          goto switchD_008c3848_caseD_40;
                                                        case 0x41:
                                                          goto switchD_008c3848_caseD_41;
                                                        case 0x42:
                                                          goto switchD_008c3848_caseD_42;
                                                        case 0x43:
                                                          goto switchD_008c3848_caseD_43;
                                                        case 0x44:
                                                          goto switchD_008c3848_caseD_44;
                                                        case 0x45:
                                                          goto switchD_008c3848_caseD_45;
                                                        case 0x46:
                                                          goto switchD_008c3848_caseD_46;
                                                        case 0x47:
                                                          goto switchD_008c3848_caseD_47;
                                                        case 0x48:
                                                          goto switchD_008c3848_caseD_48;
                                                        case 0x49:
                                                          goto switchD_008c3848_caseD_49;
                                                        case 0x4a:
                                                          goto switchD_008c3848_caseD_4a;
                                                        case 0x4b:
                                                          goto switchD_008c3848_caseD_4b;
                                                        case 0x4c:
                                                          goto switchD_008c3848_caseD_4c;
                                                        case 0x4d:
                                                          goto switchD_008c3848_caseD_4d;
                                                        case 0x4e:
                                                          goto switchD_008c3848_caseD_4e;
                                                        case 0x4f:
                                                          goto switchD_008c3848_caseD_4f;
                                                        case 0x50:
                                                          goto switchD_008c3848_caseD_50;
                                                        case 0x51:
                                                          goto switchD_008c3848_caseD_51;
                                                        case 0x52:
                                                          goto switchD_008c3848_caseD_52;
                                                        case 0x53:
                                                          goto switchD_008c3848_caseD_53;
                                                        case 0x54:
                                                          goto switchD_008c3848_caseD_54;
                                                        case 0x55:
                                                          goto switchD_008c3848_caseD_55;
                                                        case 0x56:
                                                          goto switchD_008c3848_caseD_56;
                                                        case 0x57:
                                                          goto switchD_008c3848_caseD_57;
                                                        case 0x58:
                                                          goto switchD_008c3848_caseD_58;
                                                        case 0x59:
                                                          goto switchD_008c3848_caseD_59;
                                                        case 0x5a:
                                                          goto switchD_008c3848_caseD_5a;
                                                        case 0x5b:
                                                          goto switchD_008c3848_caseD_5b;
                                                        case 0x5c:
                                                          goto switchD_008c3848_caseD_5c;
                                                        case 0x5d:
                                                          goto switchD_008c3848_caseD_5d;
                                                        case 0x5e:
                                                          goto switchD_008c3848_caseD_5e;
                                                        }
                                                        goto switchD_008c3848_caseD_15;
                                                      }
                                                      ppppppdVar49 = pppppppdVar51[3];
                                                      if (DAT_00d1f4f8 == '\x01') {
                                                        *(int *)(ppppppdVar49 + 9) =
                                                             *(int *)(ppppppdVar49 + 9) + 1;
                                                      }
                                                      pppppppdVar31 =
                                                           *(double ********)(param_1 + 0x68);
                                                      pppppppdVar52 =
                                                           *(double ********)(param_1 + 0x70);
                                                      pppppppdVar46 =
                                                           pppppppdVar52 +
                                                           (ulong)*(byte *)((long)ppppppdVar49 + 7)
                                                           * 2;
                                                      if (pppppppdVar31 < pppppppdVar46) {
                                                        pppppppdVar35 = pppppppdVar46;
                                                        if (pppppppdVar46 <= pppppppdVar31 + 2) {
                                                          pppppppdVar35 = pppppppdVar31 + 2;
                                                        }
                                                        if ((long)pppppppdVar35 +
                                                            ~(ulong)pppppppdVar31 < 0x10) {
LAB_008c4b18:
                                                          do {
                                                            pppppppdVar35 = pppppppdVar31 + 2;
                                                            *(uint *)((long)pppppppdVar31 + 0xc) = 0
                                                            ;
                                                            pppppppdVar31 = pppppppdVar35;
                                                          } while (pppppppdVar35 < pppppppdVar46);
                                                        }
                                                        else {
                                                          uVar30 = ((long)pppppppdVar35 +
                                                                    ~(ulong)pppppppdVar31 >> 4) + 1;
                                                          uVar48 = uVar30 & 0x1ffffffffffffffe;
                                                          pppppppdVar35 = pppppppdVar31 + uVar48 * 2
                                                          ;
                                                          puVar36 = (uint *)((long)pppppppdVar31 +
                                                                            0x1c);
                                                          uVar44 = uVar48;
                                                          do {
                                                            uVar44 = uVar44 - 2;
                                                            puVar36[-4] = 0;
                                                            *puVar36 = 0;
                                                            puVar36 = puVar36 + 8;
                                                          } while (uVar44 != 0);
                                                          pppppppdVar31 = pppppppdVar35;
                                                          if (uVar30 != uVar48) goto LAB_008c4b18;
                                                        }
                                                        cVar3 = *(char *)((long)ppppppdVar49 + 3);
                                                      }
                                                      else {
                                                        cVar3 = *(char *)((long)ppppppdVar49 + 3);
                                                        pppppppdVar35 = pppppppdVar31;
                                                      }
                                                      if (cVar3 == '\0') {
                                                        pppppppdVar35 = (double *******)unaff_x22[3]
                                                        ;
                                                      }
                                                      pppppdVar53 = ppppppdVar49[3];
                                                      *(double ********)(param_1 + 0x68) =
                                                           pppppppdVar35;
                                                      pppppdVar54 = ppppppdVar49[5];
                                                      pppppppdVar46 = pppppppdVar51;
                                                      pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                      switch(*(undefined1 *)pppppdVar53) {
                                                      case 0:
                                                        goto switchD_008c3848_caseD_0;
                                                      case 1:
                                                        goto switchD_008c3848_caseD_1;
                                                      case 2:
                                                        goto switchD_008c3848_caseD_2;
                                                      case 3:
                                                        goto switchD_008c3848_caseD_3;
                                                      case 4:
                                                        goto switchD_008c3848_caseD_4;
                                                      case 5:
                                                        goto switchD_008c3848_caseD_5;
                                                      case 6:
                                                        goto switchD_008c3848_caseD_6;
                                                      case 7:
                                                        goto switchD_008c3848_caseD_7;
                                                      case 8:
                                                        goto switchD_008c3848_caseD_8;
                                                      case 9:
                                                        goto switchD_008c3848_caseD_9;
                                                      case 10:
                                                        goto switchD_008c3848_caseD_a;
                                                      case 0xb:
                                                        goto switchD_008c3848_caseD_b;
                                                      case 0xc:
                                                        goto switchD_008c3848_caseD_c;
                                                      case 0xd:
                                                        goto switchD_008c3848_caseD_d;
                                                      case 0xe:
                                                        goto switchD_008c3848_caseD_e;
                                                      case 0xf:
                                                        goto switchD_008c3848_caseD_f;
                                                      case 0x10:
                                                        goto switchD_008c3848_caseD_10;
                                                      case 0x11:
                                                        goto switchD_008c3848_caseD_11;
                                                      case 0x12:
                                                        goto switchD_008c3848_caseD_12;
                                                      case 0x13:
                                                        goto switchD_008c3848_caseD_13;
                                                      case 0x14:
                                                        goto switchD_008c3848_caseD_14;
                                                      case 0x16:
switchD_008c3848_caseD_16:
                                                        do {
                                                          UNRECOVERED_JUMPTABLE =
                                                               *(code **)(*(long *)(param_1 + 0x60)
                                                                         + 0x688);
                                                          lVar50 = *(long *)(param_1 + 0x50);
                                                          if (UNRECOVERED_JUMPTABLE != (code *)0x0)
                                                          {
                                                            *(double ******)(lVar50 + 0x20) =
                                                                 pppppdVar53;
                                                            *(long *)(*(long *)(param_1 + 0x50) +
                                                                     0x20) =
                                                                 *(long *)(*(long *)(param_1 + 0x50)
                                                                          + 0x20) + 4;
                                                            (*UNRECOVERED_JUMPTABLE)
                                                                      (param_1,0xffffffff);
                                                            lVar50 = *(long *)(param_1 + 0x50);
                                                            if (*(char *)(param_1 + 3) != '\0')
                                                            goto LAB_008c8788;
                                                            pppppppdVar52 =
                                                                 *(double ********)(param_1 + 0x70);
                                                          }
                                                          uVar16 = *(uint *)pppppdVar53;
                                                          uVar30 = (ulong)(uVar16 >> 0x10) & 0xff;
                                                          if ((int)uVar30 == 0) {
                                                            pppppppdVar51 =
                                                                 *(double ********)(param_1 + 0x68);
                                                          }
                                                          else {
                                                            pppppppdVar51 =
                                                                 pppppppdVar52 +
                                                                 (ulong)(byte)(uVar16 >> 8) * 2 +
                                                                 uVar30 * 2 + -2;
                                                          }
                                                          uVar13 = *(uint *)(lVar50 + 0x28);
                                                          pdVar20 = *(double **)(lVar50 + 8);
                                                          uVar12 = uVar13;
                                                          if ((uVar13 == 0) ||
                                                             (pppppppdVar51 <=
                                                              pppppppdVar52 +
                                                              (ulong)(byte)(uVar16 >> 8) * 2)) {
                                                            pdVar41 = pdVar20;
                                                            if (0 < (int)uVar13) goto LAB_008c5068;
                                                          }
                                                          else {
                                                            pdVar41 = pdVar20;
                                                            pppppppdVar52 =
                                                                 pppppppdVar52 +
                                                                 ((ulong)(uVar16 >> 8) & 0xff) * 2;
                                                            do {
                                                              pppppppdVar46 = pppppppdVar52 + 2;
                                                              ppppppdVar49 = *pppppppdVar52;
                                                              uVar12 = uVar12 - 1;
                                                              pdVar20 = pdVar41 + 2;
                                                              pdVar41[1] = (double)pppppppdVar52[1];
                                                              *pdVar41 = (double)ppppppdVar49;
                                                              if (uVar12 == 0) break;
                                                              pdVar41 = pdVar20;
                                                              pppppppdVar52 = pppppppdVar46;
                                                            } while (pppppppdVar46 < pppppppdVar51);
                                                            pdVar41 = pdVar20;
                                                            if (0 < (int)uVar12) {
LAB_008c5068:
                                                              if (uVar12 == 1) {
                                                                iVar11 = 1;
                                                                pdVar20 = pdVar41;
                                                              }
                                                              else {
                                                                uVar44 = (ulong)uVar12 & 0x7ffffffe;
                                                                pdVar20 = pdVar41 + uVar44 * 2;
                                                                iVar11 = uVar12 - (int)uVar44;
                                                                puVar34 = (undefined4 *)
                                                                          ((long)pdVar41 + 0x1c);
                                                                uVar30 = uVar44;
                                                                do {
                                                                  uVar30 = uVar30 - 2;
                                                                  puVar34[-4] = 0;
                                                                  *puVar34 = 0;
                                                                  puVar34 = puVar34 + 8;
                                                                } while (uVar30 != 0);
                                                                if (uVar44 == uVar12)
                                                                goto LAB_008c50d8;
                                                              }
                                                              uVar16 = iVar11 + 1;
                                                              pdVar41 = pdVar20;
                                                              do {
                                                                uVar16 = uVar16 - 1;
                                                                pdVar20 = pdVar41 + 2;
                                                                *(undefined4 *)((long)pdVar41 + 0xc)
                                                                     = 0;
                                                                pdVar41 = pdVar20;
                                                              } while (1 < uVar16);
                                                            }
                                                          }
LAB_008c50d8:
                                                          pppppppdVar52 =
                                                               *(double ********)(lVar50 + -0x20);
                                                          *(long *)(param_1 + 0x50) = lVar50 + -0x30
                                                          ;
                                                          *(double ********)(param_1 + 0x70) =
                                                               pppppppdVar52;
                                                          if (uVar13 != 0xffffffff) {
                                                            pdVar20 = *(double **)(lVar50 + -0x18);
                                                          }
                                                          *(double **)(param_1 + 0x68) = pdVar20;
                                                          if ((*(byte *)(lVar50 + 0x2c) & 1) != 0)
                                                          goto LAB_008c8794;
                                                          if ((*(byte *)(lVar50 + -4) >> 2 & 1) != 0
                                                             ) {
                                                            iVar11 = (**(code **)(*(long *)(param_1 
                                                  + 0x60) + 0x6f0))(param_1);
LAB_008c517c:
                                                  if (iVar11 != 1) goto LAB_008c8794;
                                                  goto LAB_008c3820;
                                                  }
                                                  pppppdVar53 = *(double ******)(lVar50 + -0x10);
                                                  pppppdVar54 = *(double ******)
                                                                 (*(long *)(lVar50 + -0x30) + 0x28);
                                                  pppppppdVar51 =
                                                       (double *******)
                                                       **(undefined8 **)(lVar50 + -0x28);
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
switchD_008c3848_caseD_18:
                                                    do {
                                                      lVar50 = *(long *)(param_1 + 0x60);
                                                      UNRECOVERED_JUMPTABLE =
                                                           *(code **)(lVar50 + 0x688);
                                                      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                                                        *(double ******)
                                                         (*(long *)(param_1 + 0x50) + 0x20) =
                                                             pppppdVar53;
                                                        *(long *)(*(long *)(param_1 + 0x50) + 0x20)
                                                             = *(long *)(*(long *)(param_1 + 0x50) +
                                                                        0x20) + 4;
                                                        (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff)
                                                        ;
                                                        if (*(char *)(param_1 + 3) != '\0') {
LAB_008c8784:
                                                          lVar50 = *(long *)(param_1 + 0x50);
                                                          goto LAB_008c8788;
                                                        }
                                                        pppppppdVar52 =
                                                             *(double ********)(param_1 + 0x70);
                                                        lVar50 = *(long *)(param_1 + 0x60);
                                                      }
                                                      if (*(ulong *)(lVar50 + 8) <=
                                                          *(ulong *)(lVar50 + 0x10)) {
                                                        *(double ******)
                                                         (*(long *)(param_1 + 0x50) + 0x20) =
                                                             pppppdVar53;
                                                        FUN_008b52c4(param_1,1);
                                                        pppppppdVar52 =
                                                             *(double ********)(param_1 + 0x70);
                                                      }
                                                      puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                      uVar16 = *(uint *)pppppdVar53;
                                                      if (DAT_00d1f4f8 == '\x01') {
                                                        *(int *)(**(long **)(param_1 + 0x50) + 0x48)
                                                             = *(int *)(**(long **)(param_1 + 0x50)
                                                                       + 0x48) + 1;
                                                      }
                                                      iVar11 = (int)uVar16 >> 0x10;
LAB_008c75e0:
                                                      pppppdVar53 = (double *****)(puVar36 + iVar11)
                                                      ;
                                                      pppppppdVar46 = pppppppdVar51;
                                                      pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                      switch(*(undefined1 *)pppppdVar53) {
                                                      case 0:
                                                        goto switchD_008c3848_caseD_0;
                                                      case 1:
                                                        goto switchD_008c3848_caseD_1;
                                                      case 2:
                                                        goto switchD_008c3848_caseD_2;
                                                      case 3:
                                                        goto switchD_008c3848_caseD_3;
                                                      case 4:
                                                        goto switchD_008c3848_caseD_4;
                                                      case 5:
                                                        goto switchD_008c3848_caseD_5;
                                                      case 6:
                                                        goto switchD_008c3848_caseD_6;
                                                      case 7:
                                                        goto switchD_008c3848_caseD_7;
                                                      case 8:
                                                        goto switchD_008c3848_caseD_8;
                                                      case 9:
                                                        goto switchD_008c3848_caseD_9;
                                                      case 10:
                                                        goto switchD_008c3848_caseD_a;
                                                      case 0xb:
                                                        goto switchD_008c3848_caseD_b;
                                                      case 0xc:
                                                        goto switchD_008c3848_caseD_c;
                                                      case 0xd:
                                                        goto switchD_008c3848_caseD_d;
                                                      case 0xe:
                                                        goto switchD_008c3848_caseD_e;
                                                      case 0xf:
                                                        goto switchD_008c3848_caseD_f;
                                                      case 0x10:
                                                        goto switchD_008c3848_caseD_10;
                                                      case 0x11:
                                                        goto switchD_008c3848_caseD_11;
                                                      case 0x12:
                                                        goto switchD_008c3848_caseD_12;
                                                      case 0x13:
                                                        goto switchD_008c3848_caseD_13;
                                                      case 0x14:
                                                        goto switchD_008c3848_caseD_14;
                                                      case 0x15:
                                                        goto switchD_008c3848_caseD_15;
                                                      case 0x16:
                                                        goto switchD_008c3848_caseD_16;
                                                      case 0x17:
                                                        goto switchD_008c3848_caseD_17;
                                                      case 0x19:
switchD_008c3848_caseD_19:
                                                        do {
                                                          uVar16 = *(uint *)((long)(pppppppdVar52 +
                                                                                   (ulong)(byte)(*(
                                                  uint *)pppppdVar53 >> 8) * 2) + 0xc);
                                                  uVar30 = (ulong)uVar16;
                                                  if (uVar16 != 0) {
                                                    if ((uVar16 == 1) &&
                                                       (*(uint *)(pppppppdVar52 +
                                                                 (ulong)(byte)(*(uint *)pppppdVar53
                                                                              >> 8) * 2) == 0)) {
                                                      uVar30 = 0;
                                                    }
                                                    else {
                                                      uVar30 = (long)((ulong)*(uint *)pppppdVar53 <<
                                                                     0x20) >> 0x30;
                                                    }
                                                  }
                                                  pppppdVar53 = (double *****)
                                                                ((long)pppppdVar53 +
                                                                (uVar30 + 1) * 4);
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x1a:
switchD_008c3848_caseD_1a:
                                                    do {
                                                      puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                      uVar16 = *(uint *)((long)(pppppppdVar52 +
                                                                               (ulong)(byte)(*(uint 
                                                  *)pppppdVar53 >> 8) * 2) + 0xc);
                                                  if ((uVar16 == 0) ||
                                                     ((uVar16 == 1 &&
                                                      (*(uint *)(pppppppdVar52 +
                                                                (ulong)(byte)(*(uint *)pppppdVar53
                                                                             >> 8) * 2) == 0)))) {
                                                    lVar50 = (long)((ulong)*(uint *)pppppdVar53 <<
                                                                   0x20) >> 0x30;
                                                  }
                                                  else {
                                                    lVar50 = 0;
                                                  }
LAB_008c5204:
                                                  pppppdVar53 = (double *****)(puVar36 + lVar50);
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1b:
switchD_008c3848_caseD_1b:
                                                    do {
                                                      uVar16 = *(uint *)pppppdVar53;
                                                      uVar30 = (ulong)uVar16;
                                                      puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                      pppppppdVar35 =
                                                           pppppppdVar52 + (ulong)*puVar36 * 2;
                                                      pppppppdVar31 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 8) * 2;
                                                      uVar13 = *(uint *)((long)pppppppdVar31 + 0xc);
                                                      pppppdVar38 = pppppdVar53;
                                                      if (uVar13 != *(uint *)((long)pppppppdVar35 +
                                                                             0xc))
                                                      goto LAB_008c3b20;
                                                      iVar11 = (int)uVar16 >> 0x10;
                                                      pppppppdVar46 = pppppppdVar51;
                                                      if (6 < (int)uVar13) {
                                                        if ((int)uVar13 < 9) {
                                                          if (uVar13 == 7) goto LAB_008c5318;
                                                          ppppppdVar49 = *pppppppdVar31;
                                                          ppppppdVar60 = *pppppppdVar35;
                                                          pppppdVar53 = ppppppdVar49[1];
                                                          if (pppppdVar53 != ppppppdVar60[1]) {
LAB_008c5494:
                                                            *(uint **)(*(long *)(param_1 + 0x50) +
                                                                      0x20) = puVar36;
                                                            iVar14 = FUN_008cbdc8(param_1);
                                                            if (iVar14 != 1) {
                                                              iVar11 = 1;
                                                            }
                                                            pppppdVar53 = (double *****)
                                                                          (puVar36 + iVar11);
                                                            goto LAB_008c450c;
                                                          }
                                                          if ((pppppdVar53 != (double *****)0x0) &&
                                                             (-1 < *(char *)((long)pppppdVar53 + 6))
                                                             ) {
                                                            if ((*(byte *)((long)pppppdVar53 + 7) >>
                                                                 1 & 1) == 0) {
                                                              ppppdVar21 = (double ****)
                                                                           FUN_008bdfe0(pppppdVar53,
                                                                                        7,*(
                                                  undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
                                                  unaff_x22 = pppppppdVar35;
                                                  if (ppppdVar21 == (double ****)0x0)
                                                  goto LAB_008c5318;
                                                  }
                                                  else {
                                                    ppppdVar21 = pppppdVar53[4] + -0x10;
                                                  }
                                                  if ((*(int *)((long)ppppdVar21 + 0xc) == 7) &&
                                                     (*(char *)((long)*ppppdVar21 + 6) != '\0')) {
                                                    puVar22 = *(undefined8 **)(param_1 + 0x68);
                                                    pppdVar7 = *ppppdVar21;
                                                    puVar22[1] = ppppdVar21[1];
                                                    *puVar22 = pppdVar7;
                                                    ppppppdVar49 = *pppppppdVar31;
                                                    unaff_x22 = (double *******)
                                                                ((ulong)((long)puVar22 -
                                                                        (long)pppppppdVar52) >> 4);
                                                    puVar22[3] = pppppppdVar31[1];
                                                    puVar22[2] = ppppppdVar49;
                                                    ppppppdVar49 = *pppppppdVar35;
                                                    puVar22[5] = pppppppdVar35[1];
                                                    puVar22[4] = ppppppdVar49;
                                                    *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
                                                    *(uint **)(*(long *)(param_1 + 0x50) + 0x20) =
                                                         puVar36;
                                                    FUN_008cd928(param_1,2,
                                                                 (ulong)unaff_x22 & 0xffffffff);
                                                    pppppppdVar52 =
                                                         *(double ********)(param_1 + 0x70);
                                                    uVar16 = *(uint *)((long)(pppppppdVar52 +
                                                                             (long)(int)unaff_x22 *
                                                                             2) + 0xc);
                                                    if ((uVar16 == 0) ||
                                                       ((uVar16 == 1 &&
                                                        (*(uint *)(pppppppdVar52 +
                                                                  (long)(int)unaff_x22 * 2) == 0))))
                                                    goto LAB_008c5480;
                                                    goto LAB_008c5364;
                                                  }
                                                  goto LAB_008c5494;
                                                  }
                                                  }
                                                  else {
                                                    if ((1 < uVar13 - 9) && (uVar13 != 0xb))
                                                    goto LAB_008c5494;
LAB_008c5318:
                                                    ppppppdVar49 = *pppppppdVar31;
                                                    ppppppdVar60 = *pppppppdVar35;
                                                  }
LAB_008c5320:
                                                  lVar50 = (long)(uVar30 << 0x20) >> 0x30;
                                                  if (ppppppdVar49 != ppppppdVar60) {
                                                    lVar50 = 1;
                                                  }
LAB_008c5484:
                                                  pppppdVar53 = (double *****)(puVar36 + lVar50);
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  goto switchD_008c3848_caseD_1b;
                                                  }
                                                  if (2 < (int)uVar13) {
                                                    if (4 < (int)uVar13) {
                                                      if (uVar13 != 5) {
                                                        ppppppdVar49 = *pppppppdVar31;
                                                        ppppppdVar60 = *pppppppdVar35;
                                                        pppppdVar53 = ppppppdVar49[2];
                                                        if (pppppdVar53 == ppppppdVar60[2]) {
                                                          if ((pppppdVar53 == (double *****)0x0) ||
                                                             (*(char *)((long)pppppdVar53 + 6) <
                                                              '\0')) goto LAB_008c5320;
                                                          if ((*(byte *)((long)pppppdVar53 + 7) >> 1
                                                              & 1) == 0) {
                                                            lVar50 = FUN_008bdfe0(pppppdVar53,7,
                                                                                  *(undefined8 *)
                                                                                   (*(long *)(
                                                  param_1 + 0x60) + 0x370));
                                                  unaff_x22 = pppppppdVar35;
                                                  if (lVar50 == 0) goto LAB_008c5318;
                                                  }
                                                  }
                                                  goto LAB_008c5494;
                                                  }
                                                  goto LAB_008c5318;
                                                  }
                                                  if (uVar13 == 3) {
                                                    bVar10 = (double)*pppppppdVar31 ==
                                                             (double)*pppppppdVar35;
                                                  }
                                                  else {
                                                    if ((*(float *)pppppppdVar31 !=
                                                         *(float *)pppppppdVar35) ||
                                                       (*(float *)((long)pppppppdVar31 + 4) !=
                                                        *(float *)((long)pppppppdVar35 + 4))) {
LAB_008c5480:
                                                      lVar50 = 1;
                                                      goto LAB_008c5484;
                                                    }
                                                    bVar10 = false;
                                                    if (!NAN(*(float *)(pppppppdVar31 + 1)) &&
                                                        !NAN(*(float *)(pppppppdVar35 + 1))) {
                                                      bVar10 = *(float *)(pppppppdVar31 + 1) ==
                                                               *(float *)(pppppppdVar35 + 1);
                                                    }
                                                  }
                                                  lVar50 = (long)(uVar30 << 0x20) >> 0x30;
                                                  if (!bVar10) {
                                                    lVar50 = 1;
                                                  }
                                                  goto LAB_008c5484;
                                                  }
                                                  if (uVar13 != 0) {
                                                    if (uVar13 != 1) {
                                                      if ((*pppppppdVar31 != *pppppppdVar35) ||
                                                         (*(uint *)(pppppppdVar31 + 1) !=
                                                          *(uint *)(pppppppdVar35 + 1)))
                                                      goto LAB_008c5480;
LAB_008c5364:
                                                      lVar50 = (long)(uVar30 << 0x20) >> 0x30;
                                                      goto LAB_008c5484;
                                                    }
                                                    if (*(uint *)pppppppdVar31 !=
                                                        *(uint *)pppppppdVar35) {
                                                      iVar11 = 1;
                                                    }
                                                  }
                                                  pppppdVar53 = (double *****)(puVar36 + iVar11);
                                                  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar53) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
switchD_008c3848_caseD_1d:
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    pppppppdVar31 =
                                                         pppppppdVar52 + (ulong)*puVar36 * 2;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    iVar11 = (int)uVar16 >> 0x10;
                                                    if (*(uint *)((long)pppppppdVar46 + 0xc) != 3) {
                                                      if ((*(uint *)((long)pppppppdVar46 + 0xc) == 5
                                                          ) && (*(uint *)((long)pppppppdVar31 + 0xc)
                                                                == 5)) {
                                                        uVar16 = FUN_008cba50(*pppppppdVar46,
                                                                              *pppppppdVar31);
                                                        goto LAB_008c7a7c;
                                                      }
LAB_008c591c:
                                                      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) =
                                                           puVar36;
                                                      iVar14 = FUN_008cbab8(param_1);
                                                      bVar10 = iVar14 == 1;
                                                      goto LAB_008c589c;
                                                    }
                                                    if (*(uint *)((long)pppppppdVar31 + 0xc) != 3)
                                                    goto LAB_008c591c;
                                                    lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
                                                    if ((double)*pppppppdVar31 <=
                                                        (double)*pppppppdVar46) {
                                                      lVar50 = 1;
                                                    }
                                                    pppppdVar53 = (double *****)(puVar36 + lVar50);
LAB_008c6924:
                                                    pppppppdVar46 = pppppppdVar51;
                                                    pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                    switch(*(undefined1 *)pppppdVar53) {
                                                    case 0:
                                                      goto switchD_008c3848_caseD_0;
                                                    case 1:
                                                      goto switchD_008c3848_caseD_1;
                                                    case 2:
                                                      goto switchD_008c3848_caseD_2;
                                                    case 3:
                                                      goto switchD_008c3848_caseD_3;
                                                    case 4:
                                                      goto switchD_008c3848_caseD_4;
                                                    case 5:
                                                      goto switchD_008c3848_caseD_5;
                                                    case 6:
                                                      goto switchD_008c3848_caseD_6;
                                                    case 7:
                                                      goto switchD_008c3848_caseD_7;
                                                    case 8:
                                                      goto switchD_008c3848_caseD_8;
                                                    case 9:
                                                      goto switchD_008c3848_caseD_9;
                                                    case 10:
                                                      goto switchD_008c3848_caseD_a;
                                                    case 0xb:
                                                      goto switchD_008c3848_caseD_b;
                                                    case 0xc:
                                                      goto switchD_008c3848_caseD_c;
                                                    case 0xd:
                                                      goto switchD_008c3848_caseD_d;
                                                    case 0xe:
                                                      goto switchD_008c3848_caseD_e;
                                                    case 0xf:
                                                      goto switchD_008c3848_caseD_f;
                                                    case 0x10:
                                                      goto switchD_008c3848_caseD_10;
                                                    case 0x11:
                                                      goto switchD_008c3848_caseD_11;
                                                    case 0x12:
                                                      goto switchD_008c3848_caseD_12;
                                                    case 0x13:
                                                      goto switchD_008c3848_caseD_13;
                                                    case 0x14:
                                                      goto switchD_008c3848_caseD_14;
                                                    case 0x15:
                                                      goto switchD_008c3848_caseD_15;
                                                    case 0x16:
                                                      goto switchD_008c3848_caseD_16;
                                                    case 0x17:
                                                      goto switchD_008c3848_caseD_17;
                                                    case 0x18:
                                                      goto switchD_008c3848_caseD_18;
                                                    case 0x19:
                                                      goto switchD_008c3848_caseD_19;
                                                    case 0x1a:
                                                      goto switchD_008c3848_caseD_1a;
                                                    case 0x1b:
                                                      goto switchD_008c3848_caseD_1b;
                                                    case 0x1c:
                                                      goto switchD_008c3848_caseD_1c;
                                                    case 0x1d:
                                                      goto switchD_008c3848_caseD_1d;
                                                    case 0x1e:
                                                      goto switchD_008c3848_caseD_1e;
                                                    case 0x1f:
                                                      goto switchD_008c3848_caseD_1f;
                                                    case 0x20:
                                                      goto switchD_008c3848_caseD_20;
                                                    case 0x21:
                                                      goto switchD_008c3848_caseD_21;
                                                    case 0x22:
                                                      goto switchD_008c3848_caseD_22;
                                                    case 0x23:
                                                      goto switchD_008c3848_caseD_23;
                                                    case 0x24:
                                                      goto switchD_008c3848_caseD_24;
                                                    case 0x25:
                                                      goto switchD_008c3848_caseD_25;
                                                    case 0x26:
                                                      goto switchD_008c3848_caseD_26;
                                                    case 0x27:
                                                      goto switchD_008c3848_caseD_27;
                                                    case 0x28:
                                                      goto switchD_008c3848_caseD_28;
                                                    case 0x29:
                                                      goto switchD_008c3848_caseD_29;
                                                    case 0x2a:
                                                      goto switchD_008c3848_caseD_2a;
                                                    case 0x2b:
                                                      goto switchD_008c3848_caseD_2b;
                                                    case 0x2c:
                                                      goto switchD_008c3848_caseD_2c;
                                                    case 0x2d:
switchD_008c3848_caseD_2d:
                                                      pppppdVar38 = (double *****)
                                                                    ((long)pppppdVar53 + 4);
                                                      uVar16 = *(uint *)pppppdVar53;
                                                      uVar30 = (ulong)uVar16;
                                                      pppppppdVar46 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 0x10) * 2;
                                                      if ((*(uint *)((long)pppppppdVar46 + 0xc) != 0
                                                          ) && ((*(uint *)((long)pppppppdVar46 + 0xc
                                                                          ) != 1 ||
                                                                (*(uint *)pppppppdVar46 != 0)))) {
                                                        pppppppdVar46 =
                                                             (double *******)
                                                             ((long)pppppppdVar52 +
                                                             ((ulong)(uVar16 >> 0x14) & 0xff0));
                                                      }
                                                      break;
                                                    case 0x2e:
switchD_008c3848_caseD_2e:
                                                      uVar13 = *(uint *)pppppdVar53;
                                                      pppppppdVar31 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar13 >> 0x10) * 2;
                                                      uVar16 = *(uint *)((long)pppppppdVar31 + 0xc);
                                                      pppppppdVar46 =
                                                           (double *******)
                                                           ((long)pppppppdVar52 +
                                                           ((ulong)(uVar13 >> 0x14) & 0xff0));
                                                      goto joined_r0x008c65c0;
                                                    case 0x2f:
switchD_008c3848_caseD_2f:
                                                      pppppdVar38 = (double *****)
                                                                    ((long)pppppdVar53 + 4);
                                                      uVar16 = *(uint *)pppppdVar53;
                                                      uVar30 = (ulong)uVar16;
                                                      pppppppdVar46 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 0x10) * 2;
                                                      if ((*(uint *)((long)pppppppdVar46 + 0xc) != 0
                                                          ) && ((*(uint *)((long)pppppppdVar46 + 0xc
                                                                          ) != 1 ||
                                                                (*(uint *)pppppppdVar46 != 0)))) {
                                                        pppppppdVar46 =
                                                             (double *******)
                                                             ((long)pppppdVar54 +
                                                             ((ulong)(uVar16 >> 0x14) & 0xff0));
                                                      }
                                                      break;
                                                    case 0x30:
switchD_008c3848_caseD_30:
                                                      uVar13 = *(uint *)pppppdVar53;
                                                      pppppppdVar31 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar13 >> 0x10) * 2;
                                                      uVar16 = *(uint *)((long)pppppppdVar31 + 0xc);
                                                      pppppppdVar46 =
                                                           (double *******)
                                                           ((long)pppppdVar54 +
                                                           ((ulong)(uVar13 >> 0x14) & 0xff0));
joined_r0x008c65c0:
                                                      uVar30 = (ulong)uVar13;
                                                      pppppdVar38 = (double *****)
                                                                    ((long)pppppdVar53 + 4);
                                                      if ((uVar16 != 0) &&
                                                         ((uVar16 != 1 ||
                                                          (*(uint *)pppppppdVar31 != 0)))) {
                                                        pppppppdVar46 = pppppppdVar31;
                                                      }
                                                      break;
                                                    case 0x31:
                                                      goto switchD_008c3848_caseD_31;
                                                    case 0x32:
switchD_008c3848_caseD_32:
                                                      uVar13 = *(uint *)pppppdVar53;
                                                      uVar16 = *(uint *)((long)(pppppppdVar52 +
                                                                               (ulong)(byte)(uVar13 
                                                  >> 0x10) * 2) + 0xc);
                                                  if (uVar16 == 0) {
                                                    uVar16 = 1;
                                                  }
                                                  else if (uVar16 == 1) {
                                                    uVar16 = (uint)(*(uint *)(pppppppdVar52 +
                                                                             (ulong)(byte)(uVar13 >>
                                                                                          0x10) * 2)
                                                                   == 0);
                                                  }
                                                  else {
                                                    uVar16 = 0;
                                                  }
                                                  *(uint *)(pppppppdVar52 +
                                                           (ulong)(byte)(uVar13 >> 8) * 2) = uVar16;
                                                  *(uint *)((long)(pppppppdVar52 +
                                                                  (ulong)(byte)(uVar13 >> 8) * 2) +
                                                           0xc) = 1;
                                                  pppppdVar53 = (double *****)
                                                                ((long)pppppdVar53 + 4);
                                                  goto LAB_008c6924;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
switchD_008c3848_caseD_37:
                                                    uVar13 = *(uint *)pppppdVar53;
                                                    uVar16 = *(uint *)((long)pppppdVar53 + 4);
                                                    if ((uVar13 & 0xff000000) == 0) {
                                                      uVar12 = (uint)((ulong)(*(long *)(param_1 +
                                                                                       0x68) -
                                                                             (long)(pppppppdVar52 +
                                                                                   (ulong)(byte)(
                                                  uVar13 >> 0x10) * 2)) >> 4);
                                                  *(undefined8 *)(param_1 + 0x68) =
                                                       *(undefined8 *)
                                                        (*(long *)(param_1 + 0x50) + 0x18);
                                                  }
                                                  else {
                                                    uVar12 = (uVar13 >> 0x18) - 1;
                                                  }
                                                  if (*(uint *)((long)(pppppppdVar52 +
                                                                      (ulong)(byte)(uVar13 >> 8) * 2
                                                                      ) + 0xc) != 6)
                                                  goto LAB_008c8794;
                                                  unaff_x22 = (double *******)
                                                              pppppppdVar52
                                                              [(ulong)(byte)(uVar13 >> 8) * 2];
                                                  pppppdVar53 = pppppdVar53 + 1;
                                                  if ((int)*(uint *)(unaff_x22 + 1) <
                                                      (int)(uVar16 + uVar12 + -1)) {
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar53;
                                                    FUN_008ba760(param_1,unaff_x22);
                                                  }
                                                  if (0 < (int)uVar12) {
                                                    ppppppdVar49 = unaff_x22[4];
                                                    uVar30 = (ulong)uVar12;
                                                    uVar16 = uVar16 - 1;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar13 >> 0x10) * 2;
                                                    do {
                                                      ppppppdVar60 = *pppppppdVar46;
                                                      uVar30 = uVar30 - 1;
                                                      (ppppppdVar49 + (ulong)uVar16 * 2)[1] =
                                                           (double *****)pppppppdVar46[1];
                                                      ppppppdVar49[(ulong)uVar16 * 2] =
                                                           (double *****)ppppppdVar60;
                                                      uVar16 = uVar16 + 1;
                                                      pppppppdVar46 = pppppppdVar46 + 2;
                                                    } while (uVar30 != 0);
                                                  }
                                                  if ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1) != 0
                                                     ) {
                                                    FUN_008b63a4(param_1,unaff_x22,unaff_x22 + 3);
                                                  }
                                                  goto LAB_008c6924;
                                                  case 0x38:
switchD_008c3848_caseD_38:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    unaff_x22 = pppppppdVar52 +
                                                                (ulong)(byte)(uVar16 >> 8) * 2;
                                                    if (((*(uint *)((long)unaff_x22 + 0xc) != 3) ||
                                                        (*(uint *)((long)unaff_x22 + 0x1c) != 3)) ||
                                                       (*(uint *)((long)unaff_x22 + 0x2c) != 3)) {
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      FUN_008cd7b4(param_1,unaff_x22,unaff_x22 + 2,
                                                                   unaff_x22 + 4);
                                                    }
                                                    ppppppdVar49 = *unaff_x22;
                                                    ppppppdVar62 = unaff_x22[2];
                                                    ppppppdVar60 = unaff_x22[4];
                                                    pppppdVar53 = pppppdVar38;
                                                    if (DAT_00d1f4f8 == '\x01') {
                                                      if ((double)ppppppdVar62 <= 0.0) {
                                                        if ((double)ppppppdVar60 <
                                                            (double)ppppppdVar49) goto LAB_008c6a70;
                                                      }
                                                      else if ((double)ppppppdVar49 <
                                                               (double)ppppppdVar60) {
LAB_008c6a70:
                                                        pppppdVar53 = (double *****)
                                                                      ((long)pppppdVar38 +
                                                                      (long)((int)uVar16 >> 0x10) *
                                                                      4);
                                                        goto LAB_008c6924;
                                                      }
                                                      dVar63 = ((double)ppppppdVar49 -
                                                               (double)ppppppdVar60) /
                                                               (double)ppppppdVar62 + 1.0;
                                                      if (0.0 < dVar63) {
                                                        iVar11 = *(int *)(**(long **)(param_1 + 0x50
                                                                                     ) + 0x48);
                                                        uVar13 = 0x3fffffff - iVar11;
                                                        uVar16 = (int)dVar63;
                                                        if ((double)uVar13 <= dVar63) {
                                                          uVar16 = uVar13;
                                                        }
                                                        *(uint *)(**(long **)(param_1 + 0x50) + 0x48
                                                                 ) = uVar16 + iVar11;
                                                      }
                                                      goto LAB_008c6924;
                                                    }
                                                    if ((double)ppppppdVar62 <= 0.0) {
                                                      if ((double)ppppppdVar49 <=
                                                          (double)ppppppdVar60) goto LAB_008c6924;
                                                    }
                                                    else if ((double)ppppppdVar60 <=
                                                             (double)ppppppdVar49)
                                                    goto LAB_008c6924;
                                                    pppppdVar53 = (double *****)
                                                                  ((long)pppppdVar38 +
                                                                  ((long)((ulong)uVar16 << 0x20) >>
                                                                  0x30) * 4);
                                                    goto LAB_008c6924;
                                                  case 0x39:
switchD_008c3848_caseD_39:
                                                    lVar50 = *(long *)(param_1 + 0x60);
                                                    UNRECOVERED_JUMPTABLE =
                                                         *(code **)(lVar50 + 0x688);
                                                    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar53;
                                                      *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
                                                           *(long *)(*(long *)(param_1 + 0x50) +
                                                                    0x20) + 4;
                                                      (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
                                                      if (*(char *)(param_1 + 3) != '\0')
                                                      goto LAB_008c8784;
                                                      pppppppdVar52 =
                                                           *(double ********)(param_1 + 0x70);
                                                      lVar50 = *(long *)(param_1 + 0x60);
                                                    }
                                                    if (*(ulong *)(lVar50 + 8) <=
                                                        *(ulong *)(lVar50 + 0x10)) {
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar53;
                                                      FUN_008b52c4(param_1,1);
                                                      pppppppdVar52 =
                                                           *(double ********)(param_1 + 0x70);
                                                    }
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    *(uint *)((long)pppppppdVar46 + 0x2c) = 3;
                                                    ppppppdVar49 = (double ******)
                                                                   ((double)pppppppdVar46[2] +
                                                                   (double)pppppppdVar46[4]);
                                                    pppppppdVar46[4] = ppppppdVar49;
                                                    pppppdVar53 = pppppdVar38;
                                                    if (0.0 < (double)pppppppdVar46[2]) {
                                                      if ((double)ppppppdVar49 <=
                                                          (double)*pppppppdVar46) goto LAB_008c6b40;
                                                      goto LAB_008c6924;
                                                    }
                                                    if ((double)ppppppdVar49 <
                                                        (double)*pppppppdVar46) goto LAB_008c6924;
                                                    goto LAB_008c6b40;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
switchD_008c3848_caseD_3b:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    if (((*(char *)((long)pppppppdVar51[2] + 3) !=
                                                          '\0') &&
                                                        (*(uint *)((long)pppppppdVar46 + 0x1c) == 6)
                                                        ) && ((*(uint *)((long)pppppppdVar46 + 0x2c)
                                                               == 3 && ((double)pppppppdVar46[4] ==
                                                                        0.0)))) {
                                                      if (DAT_00d1f4f8 == '\x01') {
                                                        uVar13 = *(uint *)(pppppppdVar46[2] + 1);
joined_r0x008c713c:
                                                        if (0 < (int)uVar13) {
                                                          iVar11 = *(int *)(**(long **)(param_1 +
                                                                                       0x50) + 0x48)
                                                          ;
                                                          uVar12 = 0x3fffffff - iVar11;
                                                          if (uVar12 <= uVar13) {
                                                            uVar13 = uVar12;
                                                          }
                                                          *(uint *)(**(long **)(param_1 + 0x50) +
                                                                   0x48) = uVar13 + iVar11;
                                                        }
                                                      }
                                                      goto LAB_008c70b8;
                                                    }
LAB_008c70fc:
                                                    if (*(uint *)((long)pppppppdVar46 + 0xc) == 7)
                                                    goto LAB_008c6b40;
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar38;
                                                    if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                      FUN_008b399c(param_1,pppppppdVar46,
                                                                   "iterate over");
                                                    }
                                                    goto LAB_008c8944;
                                                  case 0x3c:
switchD_008c3848_caseD_3c:
                                                    pppppdVar53 = pppppdVar38 + 1;
                                                    uVar16 = *(uint *)pppppdVar38;
                                                    if (*(char *)((long)pppppppdVar51[2] + 3) ==
                                                        '\0') goto LAB_008c3a14;
                                                    uVar13 = *(uint *)((long)pppppdVar38 + 4);
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 +
                                                                  ((ulong)(uVar16 >> 0x16) & 0x3fc))
                                                    ;
                                                    UNRECOVERED_JUMPTABLE =
                                                         *(code **)(&DAT_00c4c918 +
                                                                   ((ulong)(uVar16 >> 8) & 0xff) * 8
                                                                   );
                                                    uVar12 = *(uint *)((long)pppppdVar38 + -4);
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar53;
                                                    pdVar20 = *(double **)(param_1 + 0x68);
                                                    ppppppdVar49 = pppppppdVar52
                                                                   [((ulong)uVar13 & 0xff) * 2];
                                                    pdVar20[1] = (double)(pppppppdVar52 +
                                                                         ((ulong)uVar13 & 0xff) * 2)
                                                                         [1];
                                                    *pdVar20 = (double)ppppppdVar49;
                                                    unaff_x22 = pppppppdVar52 +
                                                                (ulong)(byte)(uVar12 >> 8) * 2;
                                                    ppppppdVar49 = pppppppdVar52
                                                                   [((ulong)(uVar13 >> 8) & 0xff) *
                                                                    2];
                                                    pdVar20[3] = (double)(pppppppdVar52 +
                                                                         ((ulong)(uVar13 >> 8) &
                                                                         0xff) * 2)[1];
                                                    pdVar20[2] = (double)ppppppdVar49;
                                                    uVar16 = (*UNRECOVERED_JUMPTABLE)
                                                                       (param_1,unaff_x22,
                                                                        pppppppdVar52 +
                                                                        (ulong)(uVar16 >> 0x10 &
                                                                               0xff) * 2,
                                                                        (uVar12 >> 0x18) - 1,pdVar20
                                                                        ,3);
                                                    if ((int)uVar16 < 0) goto LAB_008c3a14;
                                                    pppppdVar53 = pppppdVar38;
                                                    if ((uVar12 & 0xff000000) == 0) {
                                                      *(double ********)(param_1 + 0x68) =
                                                           unaff_x22 + (ulong)uVar16 * 2;
                                                    }
                                                    goto LAB_008c6924;
                                                  case 0x3d:
switchD_008c3848_caseD_3d:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    if (((*(char *)((long)pppppppdVar51[2] + 3) ==
                                                          '\0') ||
                                                        (*(uint *)((long)pppppppdVar46 + 0x1c) != 6)
                                                        ) || (*(uint *)((long)pppppppdVar46 + 0x2c)
                                                              != 0)) goto LAB_008c70fc;
                                                    if (DAT_00d1f4f8 == '\x01') {
                                                      uVar13 = (1 << (ulong)(*(byte *)((long)
                                                  pppppppdVar46[2] + 5) & 0x1f)) +
                                                  *(int *)(pppppppdVar46[2] + 1);
                                                  goto joined_r0x008c713c;
                                                  }
LAB_008c70b8:
                                                  *(uint *)((long)pppppppdVar46 + 0xc) = 0;
                                                  pppppppdVar46[4] = (double ******)0x0;
                                                  pppppppdVar46[5] = (double ******)0x200000080;
LAB_008c6b40:
                                                  pppppdVar53 = (double *****)
                                                                ((long)pppppdVar38 +
                                                                (long)((int)uVar16 >> 0x10) * 4);
                                                  goto LAB_008c6924;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
switchD_008c3848_caseD_40:
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    uVar13 = *(uint *)pppppdVar53;
                                                    uVar16 = (int)uVar13 >> 0x10;
                                                    pppppppdVar46 =
                                                         *(double ********)
                                                          ((long)pppppdVar54 +
                                                          (-(ulong)(uVar16 >> 0x1f) &
                                                           0xfffffff000000000 | (ulong)uVar16 << 4))
                                                    ;
                                                    *(uint **)(*(long *)(param_1 + 0x50) + 0x20) =
                                                         puVar36;
                                                    ppppppdVar49 = pppppppdVar51[2];
                                                    unaff_x22 = pppppppdVar46;
                                                    if (pppppppdVar46[2] != ppppppdVar49) {
                                                      if (*(char *)((long)pppppppdVar46 + 6) == '\0'
                                                         ) {
                                                        ppppppdVar60 = pppppppdVar46[3];
                                                        if ((DAT_00d1fdf0 == '\x01') &&
                                                           (ppppppdVar62 = (double ******)
                                                                           ppppppdVar60[0x1a],
                                                           (double ******)ppppppdVar60[0x1a] !=
                                                           (double ******)0x0)) {
                                                          do {
                                                            ppppppdVar60 = ppppppdVar62;
                                                            pppppppdVar46[3] = ppppppdVar60;
                                                            ppppppdVar62 = (double ******)
                                                                           ppppppdVar60[0x1a];
                                                          } while ((double ******)ppppppdVar60[0x1a]
                                                                   != (double ******)0x0);
                                                          *(undefined1 *)((long)pppppppdVar46 + 4) =
                                                               *(undefined1 *)
                                                                ((long)ppppppdVar60 + 5);
                                                        }
                                                      }
                                                      else {
                                                        ppppppdVar60 = (double ******)0x0;
                                                      }
                                                      unaff_x22 = (double *******)
                                                                  FUN_008b4d5c(param_1,*(undefined1
                                                                                         *)((long)
                                                  pppppppdVar46 + 5),ppppppdVar49,ppppppdVar60);
                                                  }
                                                  pppppppdVar31 =
                                                       pppppppdVar52 +
                                                       (ulong)(byte)(uVar13 >> 8) * 2;
                                                  *pppppppdVar31 = (double ******)unaff_x22;
                                                  cVar3 = *(char *)((long)pppppppdVar46 + 5);
                                                  *(uint *)((long)pppppppdVar31 + 0xc) = 7;
                                                  if (cVar3 == '\0') {
                                                    uVar30 = 0;
                                                  }
                                                  else {
                                                    iVar11 = 0;
                                                    do {
                                                      pppppppdVar35 = pppppppdVar52;
                                                      if ((puVar36[iVar11] & 0xff00) != 0) {
                                                        pppppppdVar35 = pppppppdVar51 + 4;
                                                      }
                                                      pdVar20 = (double *)
                                                                ((long)pppppppdVar35 +
                                                                ((ulong)(puVar36[iVar11] >> 0xc) &
                                                                0xff0));
                                                      if (unaff_x22 == pppppppdVar46) {
                                                        iVar14 = FUN_008b9214(unaff_x22 +
                                                                              (long)iVar11 * 2 + 4,
                                                                              pdVar20);
                                                        if (iVar14 == 0) {
                                                          if (*(char *)((long)pppppppdVar46 + 3) !=
                                                              '\0') goto LAB_008c73f8;
                                                          ppppppdVar49 = pppppppdVar51[2];
                                                          if (*(char *)((long)pppppppdVar46 + 6) ==
                                                              '\0') {
                                                            ppppppdVar60 = pppppppdVar46[3];
                                                            if ((DAT_00d1fdf0 == '\x01') &&
                                                               (ppppppdVar62 = (double ******)
                                                                               ppppppdVar60[0x1a],
                                                               (double ******)ppppppdVar60[0x1a] !=
                                                               (double ******)0x0)) {
                                                              do {
                                                                ppppppdVar60 = ppppppdVar62;
                                                                pppppppdVar46[3] = ppppppdVar60;
                                                                ppppppdVar62 = (double ******)
                                                                               ppppppdVar60[0x1a];
                                                              } while ((double ******)
                                                                       ppppppdVar60[0x1a] !=
                                                                       (double ******)0x0);
                                                              *(undefined1 *)
                                                               ((long)pppppppdVar46 + 4) =
                                                                   *(undefined1 *)
                                                                    ((long)ppppppdVar60 + 5);
                                                            }
                                                          }
                                                          else {
                                                            ppppppdVar60 = (double ******)0x0;
                                                          }
                                                          unaff_x22 = (double *******)
                                                                      FUN_008b4d5c(param_1,*(
                                                  undefined1 *)((long)pppppppdVar46 + 5),
                                                  ppppppdVar49,ppppppdVar60);
                                                  *pppppppdVar31 = (double ******)unaff_x22;
                                                  *(uint *)((long)pppppppdVar31 + 0xc) = 7;
                                                  iVar11 = -1;
                                                  }
                                                  }
                                                  else {
LAB_008c73f8:
                                                    ppppppdVar49 = (double ******)*pdVar20;
                                                    unaff_x22[(long)iVar11 * 2 + 5] =
                                                         (double ******)pdVar20[1];
                                                    unaff_x22[(long)iVar11 * 2 + 4] = ppppppdVar49;
                                                    if (((4 < *(int *)((long)pdVar20 + 0xc)) &&
                                                        ((*(byte *)((long)unaff_x22 + 2) >> 2 & 1)
                                                         != 0)) &&
                                                       ((*(byte *)((long)*pdVar20 + 2) & 3) != 0)) {
                                                      FUN_008b6188(param_1,unaff_x22);
                                                    }
                                                  }
                                                  uVar30 = (ulong)*(byte *)((long)pppppppdVar46 + 5)
                                                  ;
                                                  iVar11 = iVar11 + 1;
                                                  } while (iVar11 < (int)(uint)*(byte *)((long)
                                                  pppppppdVar46 + 5));
                                                  }
                                                  *(undefined1 *)((long)unaff_x22 + 3) = 0;
                                                  if (pppppppdVar46 != unaff_x22) {
                                                    *(uint **)(*(long *)(param_1 + 0x50) + 0x20) =
                                                         puVar36;
                                                    if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <=
                                                        *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)
                                                       ) {
                                                      FUN_008b52c4(param_1,1);
                                                    }
                                                    pppppppdVar52 =
                                                         *(double ********)(param_1 + 0x70);
                                                    uVar30 = (ulong)*(byte *)((long)pppppppdVar46 +
                                                                             5);
                                                  }
                                                  pppppdVar53 = (double *****)(puVar36 + uVar30);
                                                  goto LAB_008c6924;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
switchD_008c3848_caseD_44:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar13 = *(uint *)pppppdVar53;
                                                    puVar36 = (uint *)((long)pppppdVar38 +
                                                                      ((ulong)(uVar13 >> 0x16) &
                                                                      0x3fc));
                                                    uVar16 = *puVar36;
                                                    uVar12 = uVar16 >> 0x10 & 0xff;
                                                    unaff_x22 = pppppppdVar52 +
                                                                (ulong)(byte)(uVar16 >> 8) * 2;
                                                    if (uVar12 == 0) {
                                                      uVar12 = (uint)((ulong)(*(long *)(param_1 +
                                                                                       0x68) -
                                                                             (long)unaff_x22) >> 4);
                                                    }
                                                    pppppdVar53 = pppppdVar38;
                                                    if (*(char *)((long)pppppppdVar51[2] + 3) !=
                                                        '\0') {
                                                      UNRECOVERED_JUMPTABLE =
                                                           *(code **)(&DAT_00c4c918 +
                                                                     ((ulong)(uVar13 >> 8) & 0xff) *
                                                                     8);
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      uVar13 = (*UNRECOVERED_JUMPTABLE)
                                                                         (param_1,unaff_x22,
                                                                          unaff_x22 + 2,
                                                                          (uVar16 >> 0x18) - 1,
                                                                          unaff_x22 + 4,uVar12 - 1);
                                                      if (-1 < (int)uVar13) {
                                                        if ((uVar16 & 0xff000000) == 0) {
                                                          pppppppdVar46 =
                                                               unaff_x22 + (ulong)uVar13 * 2;
                                                        }
                                                        else {
                                                          pppppppdVar46 =
                                                               *(double ********)
                                                                (*(long *)(param_1 + 0x50) + 0x18);
                                                        }
                                                        pppppdVar53 = (double *****)(puVar36 + 1);
                                                        uVar26 = *(undefined1 *)pppppdVar53;
                                                        goto LAB_008c7758;
                                                      }
                                                    }
                                                    goto LAB_008c6924;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
switchD_008c3848_caseD_49:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    pppppdVar53 = pppppdVar38;
                                                    if (*(char *)((long)pppppppdVar51[2] + 3) !=
                                                        '\0') {
                                                      puVar36 = (uint *)((long)pppppdVar38 +
                                                                        ((ulong)(uVar16 >> 0x16) &
                                                                        0x3fc));
                                                      uVar13 = *puVar36;
                                                      UNRECOVERED_JUMPTABLE =
                                                           *(code **)(&DAT_00c4c918 +
                                                                     ((ulong)(uVar16 >> 8) & 0xff) *
                                                                     8);
                                                      unaff_x22 = pppppppdVar52 +
                                                                  (ulong)(byte)(uVar13 >> 8) * 2;
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      uVar16 = (*UNRECOVERED_JUMPTABLE)
                                                                         (param_1,unaff_x22,
                                                                          pppppppdVar52 +
                                                                          (ulong)(uVar16 >> 0x10 &
                                                                                 0xff) * 2,
                                                                          (uVar13 >> 0x18) - 1,0,1);
                                                      if (-1 < (int)uVar16) {
                                                        if ((uVar13 & 0xff000000) == 0) {
                                                          *(double ********)(param_1 + 0x68) =
                                                               unaff_x22 + (ulong)uVar16 * 2;
                                                        }
                                                        pppppdVar53 = (double *****)(puVar36 + 1);
                                                        uVar26 = *(undefined1 *)pppppdVar53;
                                                        goto LAB_008c3a18;
                                                      }
                                                    }
                                                    goto LAB_008c6924;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
switchD_008c3848_caseD_4d:
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    iVar11 = (int)*(uint *)pppppdVar53 >> 0x10;
                                                    uVar16 = *(int *)((long)pppppppdVar52 +
                                                                     (ulong)(byte)(*(uint *)
                                                  pppppdVar53 >> 8) * 0x10 + 0xc) - 1U ^ *puVar36;
LAB_008c7a7c:
                                                  if (-1 < (int)uVar16) {
                                                    iVar11 = 1;
                                                  }
                                                  pppppdVar53 = (double *****)(puVar36 + iVar11);
                                                  goto LAB_008c6924;
                                                  case 0x4e:
switchD_008c3848_caseD_4e:
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    if (*(uint *)((long)(pppppppdVar52 +
                                                                        (ulong)(byte)(uVar16 >> 8) *
                                                                        2) + 0xc) == 1) {
                                                      uVar13 = (uint)(*(uint *)(pppppppdVar52 +
                                                                               (ulong)(byte)(uVar16 
                                                  >> 8) * 2) == (*puVar36 & 1));
                                                  }
                                                  else {
                                                    uVar13 = 0;
                                                  }
                                                  bVar10 = uVar13 == -((int)*puVar36 >> 0x1f);
                                                  goto LAB_008c7ac4;
                                                  case 0x4f:
switchD_008c3848_caseD_4f:
                                                    uVar16 = *(uint *)((long)pppppdVar53 + 4);
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(*(uint *)pppppdVar53 >> 8) *
                                                         2;
                                                    bVar10 = *(uint *)((long)pppppppdVar46 + 0xc) ==
                                                             3;
                                                    if ((int)uVar16 < 0) {
                                                      if ((!bVar10) ||
                                                         ((double)*pppppppdVar46 !=
                                                          (double)pppppdVar54
                                                                  [((ulong)uVar16 & 0xffffff) * 2]))
                                                      goto LAB_008c7b2c;
                                                    }
                                                    else if ((bVar10) &&
                                                            ((double)*pppppppdVar46 ==
                                                             (double)pppppdVar54
                                                                     [((ulong)uVar16 & 0xffffff) * 2
                                                                     ])) {
LAB_008c7b2c:
                                                      pppppdVar53 = (double *****)
                                                                    ((uint *)((long)pppppdVar53 + 4)
                                                                    + ((long)((ulong)*(uint *)
                                                  pppppdVar53 << 0x20) >> 0x30));
                                                  goto LAB_008c6924;
                                                  }
                                                  pppppdVar53 = pppppdVar53 + 1;
                                                  goto LAB_008c6924;
                                                  case 0x50:
switchD_008c3848_caseD_50:
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    if (*(uint *)((long)(pppppppdVar52 +
                                                                        (ulong)(byte)(uVar16 >> 8) *
                                                                        2) + 0xc) == 5) {
                                                      uVar13 = (uint)(pppppppdVar52
                                                                      [(ulong)(byte)(uVar16 >> 8) *
                                                                       2] == (double ******)
                                                                             pppppdVar54
                                                                             [((ulong)*puVar36 &
                                                                              0xffffff) * 2]);
                                                    }
                                                    else {
                                                      uVar13 = 0;
                                                    }
                                                    bVar10 = uVar13 == -((int)*puVar36 >> 0x1f);
LAB_008c7ac4:
                                                    iVar11 = (int)uVar16 >> 0x10;
                                                    if (bVar10) {
                                                      iVar11 = 1;
                                                    }
                                                    pppppdVar53 = (double *****)(puVar36 + iVar11);
                                                    goto LAB_008c6924;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
switchD_008c3848_caseD_56:
                                                    pppppdVar38 = pppppdVar53 + 1;
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    uVar13 = *(uint *)((long)pppppdVar53 + 4);
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar38;
                                                    uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
                                                    pppppdVar53 = pppppdVar38;
                                                    if ((uVar16 & 0xff0000) == 0) {
                                                      FUN_008b2a58(param_1,pppppppdVar52
                                                                           [(ulong)(byte)(uVar16 >>
                                                                                         8) * 2],
                                                                   pppppdVar54[(ulong)uVar13 * 2],
                                                                   (long)pppppppdVar52 + uVar30);
                                                    }
                                                    else {
                                                      FUN_008b2c3c(param_1,pppppppdVar52
                                                                           [(ulong)(byte)(uVar16 >>
                                                                                         8) * 2],
                                                                   (ulong)uVar13,
                                                                   (long)pppppppdVar52 + uVar30);
                                                    }
                                                    goto LAB_008c6924;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
switchD_008c3848_caseD_5a:
                                                    pppppdVar38 = pppppdVar53 + 1;
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    uVar13 = *(uint *)((long)pppppdVar53 + 4);
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar38;
                                                    ppppppdVar49 = (double ******)
                                                                   pppppdVar54[(ulong)uVar13 * 2];
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    pppppppdVar46[1] =
                                                         (double ******)
                                                         (pppppdVar54 + (ulong)uVar13 * 2)[1];
                                                    *pppppppdVar46 = ppppppdVar49;
                                                    ppppppdVar49 = *pppppppdVar46;
                                                    *(byte *)((long)ppppppdVar49 + 0x69) =
                                                         (byte)(uVar16 >> 0x18) & 1;
                                                    pppppdVar53 = pppppdVar38;
                                                    if (((uVar16 ^ 0xffffffff) & 0xff0000) != 0) {
                                                      pppppppdVar31 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 0x10) * 2;
                                                      if (*(uint *)((long)pppppppdVar31 + 0xc) !=
                                                          0xb) {
                                                        if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                          FUN_008b399c(param_1,pppppppdVar31,
                                                                       "extend");
                                                        }
                                                        goto LAB_008c8944;
                                                      }
                                                      ppppppdVar49 = (double ******)
                                                                     FUN_008b25f4(param_1,
                                                  ppppppdVar49,*pppppppdVar31);
                                                  *pppppppdVar46 = ppppppdVar49;
                                                  *(uint *)((long)pppppppdVar46 + 0xc) = 0xb;
                                                  }
                                                  goto LAB_008c6924;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
switchD_008c3848_caseD_5c:
                                                    pppppdVar38 = (double *****)
                                                                  ((long)pppppdVar53 + 4);
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    pppppdVar53 = pppppdVar38;
                                                    if (*(uint *)((long)pppppppdVar46 + 0xc) == 0xc)
                                                    {
                                                      ppppppdVar49 = *pppppppdVar46;
                                                      puVar36 = (uint *)((long)pppppdVar38 +
                                                                        ((ulong)(uVar16 >> 0x16) &
                                                                        0x3fc));
                                                      uVar16 = *puVar36;
                                                      pppppppdVar31 =
                                                           pppppppdVar52 +
                                                           (ulong)(byte)(uVar16 >> 8) * 2;
                                                      uVar13 = uVar16 >> 0x18;
                                                      pppppppdVar35 = pppppppdVar31 + 2;
                                                      pppppppdVar31[1] = pppppppdVar46[1];
                                                      *pppppppdVar31 = ppppppdVar49;
                                                      if (2 < uVar16 >> 0x18) {
                                                        if (uVar13 - 3 == 0) {
                                                          uVar12 = 1;
                                                          pppppppdVar46 = pppppppdVar35;
                                                        }
                                                        else {
                                                          uVar30 = (ulong)(uVar13 - 3) + 1;
                                                          uVar48 = uVar30 & 0x1fffffffe;
                                                          uVar12 = (uint)uVar30 | 1;
                                                          puVar34 = (undefined4 *)
                                                                    ((long)pppppppdVar52 +
                                                                    ((ulong)(uVar16 >> 8) & 0xff) *
                                                                    0x10 + 0x2c);
                                                          uVar44 = uVar48;
                                                          do {
                                                            uVar44 = uVar44 - 2;
                                                            puVar34[-4] = 0;
                                                            *puVar34 = 0;
                                                            puVar34 = puVar34 + 8;
                                                          } while (uVar44 != 0);
                                                          pppppppdVar46 = pppppppdVar35 + uVar48 * 2
                                                          ;
                                                          if (uVar30 == uVar48) goto LAB_008c84d4;
                                                        }
                                                        iVar11 = ~uVar12 + uVar13;
                                                        puVar42 = (uint *)((long)pppppppdVar46 + 0xc
                                                                          );
                                                        do {
                                                          iVar11 = iVar11 + -1;
                                                          *puVar42 = 0;
                                                          puVar42 = puVar42 + 4;
                                                        } while (iVar11 != 0);
                                                      }
LAB_008c84d4:
                                                      if (uVar13 != 0) {
                                                        pppppppdVar35 =
                                                             *(double ********)
                                                              (*(long *)(param_1 + 0x50) + 0x18);
                                                      }
                                                      *(double ********)(param_1 + 0x68) =
                                                           pppppppdVar35;
                                                      pppppdVar53 = (double *****)(puVar36 + 1);
                                                    }
                                                    goto LAB_008c6924;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  ppppppdVar49 = *pppppppdVar46;
                                                  (pppppppdVar52 + (uVar30 >> 8 & 0xff) * 2)[1] =
                                                       pppppppdVar46[1];
                                                  pppppppdVar52[(uVar30 >> 8 & 0xff) * 2] =
                                                       ppppppdVar49;
                                                  pppppdVar53 = pppppdVar38;
                                                  goto LAB_008c6924;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x1c:
switchD_008c3848_caseD_1c:
                                                    uVar16 = *(uint *)pppppdVar53;
                                                    puVar36 = (uint *)((long)pppppdVar53 + 4);
                                                    pppppppdVar31 =
                                                         pppppppdVar52 + (ulong)*puVar36 * 2;
                                                    pppppppdVar46 =
                                                         pppppppdVar52 +
                                                         (ulong)(byte)(uVar16 >> 8) * 2;
                                                    iVar11 = (int)uVar16 >> 0x10;
                                                    if (*(uint *)((long)pppppppdVar46 + 0xc) != 3) {
                                                      if ((*(uint *)((long)pppppppdVar46 + 0xc) == 5
                                                          ) && (*(uint *)((long)pppppppdVar31 + 0xc)
                                                                == 5)) {
                                                        iVar14 = FUN_008cba50(*pppppppdVar46,
                                                                              *pppppppdVar31);
                                                        if (0 < iVar14) {
                                                          iVar11 = 1;
                                                        }
                                                        goto LAB_008c75e0;
                                                      }
LAB_008c57dc:
                                                      *(uint **)(*(long *)(param_1 + 0x50) + 0x20) =
                                                           puVar36;
                                                      iVar14 = FUN_008cbbf8(param_1);
                                                      if (iVar14 != 1) {
                                                        iVar11 = 1;
                                                      }
                                                      pppppdVar53 = (double *****)(puVar36 + iVar11)
                                                      ;
                                                      goto LAB_008c450c;
                                                    }
                                                    if (*(uint *)((long)pppppppdVar31 + 0xc) != 3)
                                                    goto LAB_008c57dc;
                                                    lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
                                                    if ((double)*pppppppdVar31 <
                                                        (double)*pppppppdVar46) {
                                                      lVar50 = 1;
                                                    }
                                                    goto LAB_008c5204;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                } while( true );
                                              case 0x15:
                                                goto switchD_008c3848_caseD_15;
                                              case 0x16:
                                                goto switchD_008c3848_caseD_16;
                                              case 0x17:
                                                goto switchD_008c3848_caseD_17;
                                              case 0x18:
                                                goto switchD_008c3848_caseD_18;
                                              case 0x19:
                                                goto switchD_008c3848_caseD_19;
                                              case 0x1a:
                                                goto switchD_008c3848_caseD_1a;
                                              case 0x1b:
                                                goto switchD_008c3848_caseD_1b;
                                              case 0x1c:
                                                goto switchD_008c3848_caseD_1c;
                                              case 0x1d:
                                                goto switchD_008c3848_caseD_1d;
                                              case 0x1e:
                                                goto switchD_008c3848_caseD_1e;
                                              case 0x1f:
                                                goto switchD_008c3848_caseD_1f;
                                              case 0x20:
                                                goto switchD_008c3848_caseD_20;
                                              case 0x21:
                                                goto switchD_008c3848_caseD_21;
                                              case 0x22:
                                                goto switchD_008c3848_caseD_22;
                                              case 0x23:
                                                goto switchD_008c3848_caseD_23;
                                              case 0x24:
                                                goto switchD_008c3848_caseD_24;
                                              case 0x25:
                                                goto switchD_008c3848_caseD_25;
                                              case 0x26:
                                                goto switchD_008c3848_caseD_26;
                                              case 0x27:
                                                goto switchD_008c3848_caseD_27;
                                              case 0x28:
                                                goto switchD_008c3848_caseD_28;
                                              case 0x29:
                                                goto switchD_008c3848_caseD_29;
                                              case 0x2a:
                                                goto switchD_008c3848_caseD_2a;
                                              case 0x2b:
                                                goto switchD_008c3848_caseD_2b;
                                              case 0x2c:
                                                goto switchD_008c3848_caseD_2c;
                                              case 0x2d:
                                                goto switchD_008c3848_caseD_2d;
                                              case 0x2e:
                                                goto switchD_008c3848_caseD_2e;
                                              case 0x2f:
                                                goto switchD_008c3848_caseD_2f;
                                              case 0x30:
                                                goto switchD_008c3848_caseD_30;
                                              case 0x31:
                                                goto switchD_008c3848_caseD_31;
                                              case 0x32:
                                                goto switchD_008c3848_caseD_32;
                                              case 0x33:
                                                goto switchD_008c3848_caseD_33;
                                              case 0x34:
                                                goto switchD_008c3848_caseD_34;
                                              case 0x35:
                                                goto switchD_008c3848_caseD_35;
                                              case 0x36:
                                                goto switchD_008c3848_caseD_36;
                                              case 0x37:
                                                goto switchD_008c3848_caseD_37;
                                              case 0x38:
                                                goto switchD_008c3848_caseD_38;
                                              case 0x39:
                                                goto switchD_008c3848_caseD_39;
                                              case 0x3a:
                                                goto switchD_008c3848_caseD_3a;
                                              case 0x3b:
                                                goto switchD_008c3848_caseD_3b;
                                              case 0x3c:
                                                goto switchD_008c3848_caseD_3c;
                                              case 0x3d:
                                                goto switchD_008c3848_caseD_3d;
                                              case 0x3e:
                                                goto switchD_008c3848_caseD_3e;
                                              case 0x3f:
                                                goto switchD_008c3848_caseD_3f;
                                              case 0x40:
                                                goto switchD_008c3848_caseD_40;
                                              case 0x41:
                                                goto switchD_008c3848_caseD_41;
                                              case 0x42:
                                                goto switchD_008c3848_caseD_42;
                                              case 0x43:
                                                goto switchD_008c3848_caseD_43;
                                              case 0x44:
                                                goto switchD_008c3848_caseD_44;
                                              case 0x45:
                                                goto switchD_008c3848_caseD_45;
                                              case 0x46:
                                                goto switchD_008c3848_caseD_46;
                                              case 0x47:
                                                goto switchD_008c3848_caseD_47;
                                              case 0x48:
                                                goto switchD_008c3848_caseD_48;
                                              case 0x49:
                                                goto switchD_008c3848_caseD_49;
                                              case 0x4a:
                                                goto switchD_008c3848_caseD_4a;
                                              case 0x4b:
                                                goto switchD_008c3848_caseD_4b;
                                              case 0x4c:
                                                goto switchD_008c3848_caseD_4c;
                                              case 0x4d:
                                                goto switchD_008c3848_caseD_4d;
                                              case 0x4e:
                                                goto switchD_008c3848_caseD_4e;
                                              case 0x4f:
                                                goto switchD_008c3848_caseD_4f;
                                              case 0x50:
                                                goto switchD_008c3848_caseD_50;
                                              case 0x51:
                                                goto switchD_008c3848_caseD_51;
                                              case 0x52:
                                                goto switchD_008c3848_caseD_52;
                                              case 0x53:
                                                goto switchD_008c3848_caseD_53;
                                              case 0x54:
                                                goto switchD_008c3848_caseD_54;
                                              case 0x55:
                                                goto switchD_008c3848_caseD_55;
                                              case 0x56:
                                                goto switchD_008c3848_caseD_56;
                                              case 0x57:
                                                goto switchD_008c3848_caseD_57;
                                              case 0x58:
                                                goto switchD_008c3848_caseD_58;
                                              case 0x59:
                                                goto switchD_008c3848_caseD_59;
                                              case 0x5a:
                                                goto switchD_008c3848_caseD_5a;
                                              case 0x5b:
                                                goto switchD_008c3848_caseD_5b;
                                              case 0x5c:
                                                goto switchD_008c3848_caseD_5c;
                                              case 0x5d:
                                                goto switchD_008c3848_caseD_5d;
                                              case 0x5e:
                                                goto switchD_008c3848_caseD_5e;
                                              }
                                            } while( true );
                                          case 0x12:
                                            goto switchD_008c3848_caseD_12;
                                          case 0x13:
                                            goto switchD_008c3848_caseD_13;
                                          case 0x14:
                                            goto switchD_008c3848_caseD_14;
                                          case 0x15:
                                            goto switchD_008c3848_caseD_15;
                                          case 0x16:
                                            goto switchD_008c3848_caseD_16;
                                          case 0x17:
                                            goto switchD_008c3848_caseD_17;
                                          case 0x18:
                                            goto switchD_008c3848_caseD_18;
                                          case 0x19:
                                            goto switchD_008c3848_caseD_19;
                                          case 0x1a:
                                            goto switchD_008c3848_caseD_1a;
                                          case 0x1b:
                                            goto switchD_008c3848_caseD_1b;
                                          case 0x1c:
                                            goto switchD_008c3848_caseD_1c;
                                          case 0x1d:
                                            goto switchD_008c3848_caseD_1d;
                                          case 0x1e:
                                            goto switchD_008c3848_caseD_1e;
                                          case 0x1f:
                                            goto switchD_008c3848_caseD_1f;
                                          case 0x20:
                                            goto switchD_008c3848_caseD_20;
                                          case 0x21:
                                            goto switchD_008c3848_caseD_21;
                                          case 0x22:
                                            goto switchD_008c3848_caseD_22;
                                          case 0x23:
                                            goto switchD_008c3848_caseD_23;
                                          case 0x24:
                                            goto switchD_008c3848_caseD_24;
                                          case 0x25:
                                            goto switchD_008c3848_caseD_25;
                                          case 0x26:
                                            goto switchD_008c3848_caseD_26;
                                          case 0x27:
                                            goto switchD_008c3848_caseD_27;
                                          case 0x28:
                                            goto switchD_008c3848_caseD_28;
                                          case 0x29:
                                            goto switchD_008c3848_caseD_29;
                                          case 0x2a:
                                            goto switchD_008c3848_caseD_2a;
                                          case 0x2b:
                                            goto switchD_008c3848_caseD_2b;
                                          case 0x2c:
                                            goto switchD_008c3848_caseD_2c;
                                          case 0x2d:
                                            goto switchD_008c3848_caseD_2d;
                                          case 0x2e:
                                            goto switchD_008c3848_caseD_2e;
                                          case 0x2f:
                                            goto switchD_008c3848_caseD_2f;
                                          case 0x30:
                                            goto switchD_008c3848_caseD_30;
                                          case 0x31:
                                            goto switchD_008c3848_caseD_31;
                                          case 0x32:
                                            goto switchD_008c3848_caseD_32;
                                          case 0x33:
                                            goto switchD_008c3848_caseD_33;
                                          case 0x34:
                                            goto switchD_008c3848_caseD_34;
                                          case 0x35:
                                            goto switchD_008c3848_caseD_35;
                                          case 0x36:
                                            goto switchD_008c3848_caseD_36;
                                          case 0x37:
                                            goto switchD_008c3848_caseD_37;
                                          case 0x38:
                                            goto switchD_008c3848_caseD_38;
                                          case 0x39:
                                            goto switchD_008c3848_caseD_39;
                                          case 0x3a:
                                            goto switchD_008c3848_caseD_3a;
                                          case 0x3b:
                                            goto switchD_008c3848_caseD_3b;
                                          case 0x3c:
                                            goto switchD_008c3848_caseD_3c;
                                          case 0x3d:
                                            goto switchD_008c3848_caseD_3d;
                                          case 0x3e:
                                            goto switchD_008c3848_caseD_3e;
                                          case 0x3f:
                                            goto switchD_008c3848_caseD_3f;
                                          case 0x40:
                                            goto switchD_008c3848_caseD_40;
                                          case 0x41:
                                            goto switchD_008c3848_caseD_41;
                                          case 0x42:
                                            goto switchD_008c3848_caseD_42;
                                          case 0x43:
                                            goto switchD_008c3848_caseD_43;
                                          case 0x44:
                                            goto switchD_008c3848_caseD_44;
                                          case 0x45:
                                            goto switchD_008c3848_caseD_45;
                                          case 0x46:
                                            goto switchD_008c3848_caseD_46;
                                          case 0x47:
                                            goto switchD_008c3848_caseD_47;
                                          case 0x48:
                                            goto switchD_008c3848_caseD_48;
                                          case 0x49:
                                            goto switchD_008c3848_caseD_49;
                                          case 0x4a:
                                            goto switchD_008c3848_caseD_4a;
                                          case 0x4b:
                                            goto switchD_008c3848_caseD_4b;
                                          case 0x4c:
                                            goto switchD_008c3848_caseD_4c;
                                          case 0x4d:
                                            goto switchD_008c3848_caseD_4d;
                                          case 0x4e:
                                            goto switchD_008c3848_caseD_4e;
                                          case 0x4f:
                                            goto switchD_008c3848_caseD_4f;
                                          case 0x50:
                                            goto switchD_008c3848_caseD_50;
                                          case 0x51:
                                            goto switchD_008c3848_caseD_51;
                                          case 0x52:
                                            goto switchD_008c3848_caseD_52;
                                          case 0x53:
                                            goto switchD_008c3848_caseD_53;
                                          case 0x54:
                                            goto switchD_008c3848_caseD_54;
                                          case 0x55:
                                            goto switchD_008c3848_caseD_55;
                                          case 0x56:
                                            goto switchD_008c3848_caseD_56;
                                          case 0x57:
                                            goto switchD_008c3848_caseD_57;
                                          case 0x58:
                                            goto switchD_008c3848_caseD_58;
                                          case 0x59:
                                            goto switchD_008c3848_caseD_59;
                                          case 0x5a:
                                            goto switchD_008c3848_caseD_5a;
                                          case 0x5b:
                                            goto switchD_008c3848_caseD_5b;
                                          case 0x5c:
                                            goto switchD_008c3848_caseD_5c;
                                          case 0x5d:
                                            goto switchD_008c3848_caseD_5d;
                                          case 0x5e:
                                            goto switchD_008c3848_caseD_5e;
                                          }
                                        } while( true );
                                      case 0xf:
                                        goto switchD_008c3848_caseD_f;
                                      case 0x10:
                                        goto switchD_008c3848_caseD_10;
                                      case 0x11:
                                        goto switchD_008c3848_caseD_11;
                                      case 0x12:
                                        goto switchD_008c3848_caseD_12;
                                      case 0x13:
                                        goto switchD_008c3848_caseD_13;
                                      case 0x14:
                                        goto switchD_008c3848_caseD_14;
                                      case 0x15:
                                        goto switchD_008c3848_caseD_15;
                                      case 0x16:
                                        goto switchD_008c3848_caseD_16;
                                      case 0x17:
                                        goto switchD_008c3848_caseD_17;
                                      case 0x18:
                                        goto switchD_008c3848_caseD_18;
                                      case 0x19:
                                        goto switchD_008c3848_caseD_19;
                                      case 0x1a:
                                        goto switchD_008c3848_caseD_1a;
                                      case 0x1b:
                                        goto switchD_008c3848_caseD_1b;
                                      case 0x1c:
                                        goto switchD_008c3848_caseD_1c;
                                      case 0x1d:
                                        goto switchD_008c3848_caseD_1d;
                                      case 0x1e:
                                        goto switchD_008c3848_caseD_1e;
                                      case 0x1f:
                                        goto switchD_008c3848_caseD_1f;
                                      case 0x20:
                                        goto switchD_008c3848_caseD_20;
                                      case 0x21:
                                        goto switchD_008c3848_caseD_21;
                                      case 0x22:
                                        goto switchD_008c3848_caseD_22;
                                      case 0x23:
                                        goto switchD_008c3848_caseD_23;
                                      case 0x24:
                                        goto switchD_008c3848_caseD_24;
                                      case 0x25:
                                        goto switchD_008c3848_caseD_25;
                                      case 0x26:
                                        goto switchD_008c3848_caseD_26;
                                      case 0x27:
                                        goto switchD_008c3848_caseD_27;
                                      case 0x28:
                                        goto switchD_008c3848_caseD_28;
                                      case 0x29:
                                        goto switchD_008c3848_caseD_29;
                                      case 0x2a:
                                        goto switchD_008c3848_caseD_2a;
                                      case 0x2b:
                                        goto switchD_008c3848_caseD_2b;
                                      case 0x2c:
                                        goto switchD_008c3848_caseD_2c;
                                      case 0x2d:
                                        goto switchD_008c3848_caseD_2d;
                                      case 0x2e:
                                        goto switchD_008c3848_caseD_2e;
                                      case 0x2f:
                                        goto switchD_008c3848_caseD_2f;
                                      case 0x30:
                                        goto switchD_008c3848_caseD_30;
                                      case 0x31:
                                        goto switchD_008c3848_caseD_31;
                                      case 0x32:
                                        goto switchD_008c3848_caseD_32;
                                      case 0x33:
                                        goto switchD_008c3848_caseD_33;
                                      case 0x34:
                                        goto switchD_008c3848_caseD_34;
                                      case 0x35:
                                        goto switchD_008c3848_caseD_35;
                                      case 0x36:
                                        goto switchD_008c3848_caseD_36;
                                      case 0x37:
                                        goto switchD_008c3848_caseD_37;
                                      case 0x38:
                                        goto switchD_008c3848_caseD_38;
                                      case 0x39:
                                        goto switchD_008c3848_caseD_39;
                                      case 0x3a:
                                        goto switchD_008c3848_caseD_3a;
                                      case 0x3b:
                                        goto switchD_008c3848_caseD_3b;
                                      case 0x3c:
                                        goto switchD_008c3848_caseD_3c;
                                      case 0x3d:
                                        goto switchD_008c3848_caseD_3d;
                                      case 0x3e:
                                        goto switchD_008c3848_caseD_3e;
                                      case 0x3f:
                                        goto switchD_008c3848_caseD_3f;
                                      case 0x40:
                                        goto switchD_008c3848_caseD_40;
                                      case 0x41:
                                        goto switchD_008c3848_caseD_41;
                                      case 0x42:
                                        goto switchD_008c3848_caseD_42;
                                      case 0x43:
                                        goto switchD_008c3848_caseD_43;
                                      case 0x44:
                                        goto switchD_008c3848_caseD_44;
                                      case 0x45:
                                        goto switchD_008c3848_caseD_45;
                                      case 0x46:
                                        goto switchD_008c3848_caseD_46;
                                      case 0x47:
                                        goto switchD_008c3848_caseD_47;
                                      case 0x48:
                                        goto switchD_008c3848_caseD_48;
                                      case 0x49:
                                        goto switchD_008c3848_caseD_49;
                                      case 0x4a:
                                        goto switchD_008c3848_caseD_4a;
                                      case 0x4b:
                                        goto switchD_008c3848_caseD_4b;
                                      case 0x4c:
                                        goto switchD_008c3848_caseD_4c;
                                      case 0x4d:
                                        goto switchD_008c3848_caseD_4d;
                                      case 0x4e:
                                        goto switchD_008c3848_caseD_4e;
                                      case 0x4f:
                                        goto switchD_008c3848_caseD_4f;
                                      case 0x50:
                                        goto switchD_008c3848_caseD_50;
                                      case 0x51:
                                        goto switchD_008c3848_caseD_51;
                                      case 0x52:
                                        goto switchD_008c3848_caseD_52;
                                      case 0x53:
                                        goto switchD_008c3848_caseD_53;
                                      case 0x54:
                                        goto switchD_008c3848_caseD_54;
                                      case 0x55:
                                        goto switchD_008c3848_caseD_55;
                                      case 0x56:
                                        goto switchD_008c3848_caseD_56;
                                      case 0x57:
                                        goto switchD_008c3848_caseD_57;
                                      case 0x58:
                                        goto switchD_008c3848_caseD_58;
                                      case 0x59:
                                        goto switchD_008c3848_caseD_59;
                                      case 0x5a:
                                        goto switchD_008c3848_caseD_5a;
                                      case 0x5b:
                                        goto switchD_008c3848_caseD_5b;
                                      case 0x5c:
                                        goto switchD_008c3848_caseD_5c;
                                      case 0x5d:
                                        goto switchD_008c3848_caseD_5d;
                                      case 0x5e:
                                        goto switchD_008c3848_caseD_5e;
                                      }
                                    } while( true );
                                  case 0xe:
                                    goto switchD_008c3848_caseD_e;
                                  case 0xf:
                                    goto switchD_008c3848_caseD_f;
                                  case 0x10:
                                    goto switchD_008c3848_caseD_10;
                                  case 0x11:
                                    goto switchD_008c3848_caseD_11;
                                  case 0x12:
                                    goto switchD_008c3848_caseD_12;
                                  case 0x13:
                                    goto switchD_008c3848_caseD_13;
                                  case 0x14:
                                    goto switchD_008c3848_caseD_14;
                                  case 0x15:
                                    goto switchD_008c3848_caseD_15;
                                  case 0x16:
                                    goto switchD_008c3848_caseD_16;
                                  case 0x17:
                                    goto switchD_008c3848_caseD_17;
                                  case 0x18:
                                    goto switchD_008c3848_caseD_18;
                                  case 0x19:
                                    goto switchD_008c3848_caseD_19;
                                  case 0x1a:
                                    goto switchD_008c3848_caseD_1a;
                                  case 0x1b:
                                    goto switchD_008c3848_caseD_1b;
                                  case 0x1c:
                                    goto switchD_008c3848_caseD_1c;
                                  case 0x1d:
                                    goto switchD_008c3848_caseD_1d;
                                  case 0x1e:
                                    goto switchD_008c3848_caseD_1e;
                                  case 0x1f:
                                    goto switchD_008c3848_caseD_1f;
                                  case 0x20:
                                    goto switchD_008c3848_caseD_20;
                                  case 0x21:
                                    goto switchD_008c3848_caseD_21;
                                  case 0x22:
                                    goto switchD_008c3848_caseD_22;
                                  case 0x23:
                                    goto switchD_008c3848_caseD_23;
                                  case 0x24:
                                    goto switchD_008c3848_caseD_24;
                                  case 0x25:
                                    goto switchD_008c3848_caseD_25;
                                  case 0x26:
                                    goto switchD_008c3848_caseD_26;
                                  case 0x27:
                                    goto switchD_008c3848_caseD_27;
                                  case 0x28:
                                    goto switchD_008c3848_caseD_28;
                                  case 0x29:
                                    goto switchD_008c3848_caseD_29;
                                  case 0x2a:
                                    goto switchD_008c3848_caseD_2a;
                                  case 0x2b:
                                    goto switchD_008c3848_caseD_2b;
                                  case 0x2c:
                                    goto switchD_008c3848_caseD_2c;
                                  case 0x2d:
                                    goto switchD_008c3848_caseD_2d;
                                  case 0x2e:
                                    goto switchD_008c3848_caseD_2e;
                                  case 0x2f:
                                    goto switchD_008c3848_caseD_2f;
                                  case 0x30:
                                    goto switchD_008c3848_caseD_30;
                                  case 0x31:
                                    goto switchD_008c3848_caseD_31;
                                  case 0x32:
                                    goto switchD_008c3848_caseD_32;
                                  case 0x33:
                                    goto switchD_008c3848_caseD_33;
                                  case 0x34:
                                    goto switchD_008c3848_caseD_34;
                                  case 0x35:
                                    goto switchD_008c3848_caseD_35;
                                  case 0x36:
                                    goto switchD_008c3848_caseD_36;
                                  case 0x37:
                                    goto switchD_008c3848_caseD_37;
                                  case 0x38:
                                    goto switchD_008c3848_caseD_38;
                                  case 0x39:
                                    goto switchD_008c3848_caseD_39;
                                  case 0x3a:
                                    goto switchD_008c3848_caseD_3a;
                                  case 0x3b:
                                    goto switchD_008c3848_caseD_3b;
                                  case 0x3c:
                                    goto switchD_008c3848_caseD_3c;
                                  case 0x3d:
                                    goto switchD_008c3848_caseD_3d;
                                  case 0x3e:
                                    goto switchD_008c3848_caseD_3e;
                                  case 0x3f:
                                    goto switchD_008c3848_caseD_3f;
                                  case 0x40:
                                    goto switchD_008c3848_caseD_40;
                                  case 0x41:
                                    goto switchD_008c3848_caseD_41;
                                  case 0x42:
                                    goto switchD_008c3848_caseD_42;
                                  case 0x43:
                                    goto switchD_008c3848_caseD_43;
                                  case 0x44:
                                    goto switchD_008c3848_caseD_44;
                                  case 0x45:
                                    goto switchD_008c3848_caseD_45;
                                  case 0x46:
                                    goto switchD_008c3848_caseD_46;
                                  case 0x47:
                                    goto switchD_008c3848_caseD_47;
                                  case 0x48:
                                    goto switchD_008c3848_caseD_48;
                                  case 0x49:
                                    goto switchD_008c3848_caseD_49;
                                  case 0x4a:
                                    goto switchD_008c3848_caseD_4a;
                                  case 0x4b:
                                    goto switchD_008c3848_caseD_4b;
                                  case 0x4c:
                                    goto switchD_008c3848_caseD_4c;
                                  case 0x4d:
                                    goto switchD_008c3848_caseD_4d;
                                  case 0x4e:
                                    goto switchD_008c3848_caseD_4e;
                                  case 0x4f:
                                    goto switchD_008c3848_caseD_4f;
                                  case 0x50:
                                    goto switchD_008c3848_caseD_50;
                                  case 0x51:
                                    goto switchD_008c3848_caseD_51;
                                  case 0x52:
                                    goto switchD_008c3848_caseD_52;
                                  case 0x53:
                                    goto switchD_008c3848_caseD_53;
                                  case 0x54:
                                    goto switchD_008c3848_caseD_54;
                                  case 0x55:
                                    goto switchD_008c3848_caseD_55;
                                  case 0x56:
                                    goto switchD_008c3848_caseD_56;
                                  case 0x57:
                                    goto switchD_008c3848_caseD_57;
                                  case 0x58:
                                    goto switchD_008c3848_caseD_58;
                                  case 0x59:
                                    goto switchD_008c3848_caseD_59;
                                  case 0x5a:
                                    goto switchD_008c3848_caseD_5a;
                                  case 0x5b:
                                    goto switchD_008c3848_caseD_5b;
                                  case 0x5c:
                                    goto switchD_008c3848_caseD_5c;
                                  case 0x5d:
                                    goto switchD_008c3848_caseD_5d;
                                  case 0x5e:
                                    goto switchD_008c3848_caseD_5e;
                                  }
                                } while( true );
                              case 0xd:
                                goto switchD_008c3848_caseD_d;
                              case 0xe:
                                goto switchD_008c3848_caseD_e;
                              case 0xf:
                                goto switchD_008c3848_caseD_f;
                              case 0x10:
                                goto switchD_008c3848_caseD_10;
                              case 0x11:
                                goto switchD_008c3848_caseD_11;
                              case 0x12:
                                goto switchD_008c3848_caseD_12;
                              case 0x13:
                                goto switchD_008c3848_caseD_13;
                              case 0x14:
                                goto switchD_008c3848_caseD_14;
                              case 0x15:
                                goto switchD_008c3848_caseD_15;
                              case 0x16:
                                goto switchD_008c3848_caseD_16;
                              case 0x17:
                                goto switchD_008c3848_caseD_17;
                              case 0x18:
                                goto switchD_008c3848_caseD_18;
                              case 0x19:
                                goto switchD_008c3848_caseD_19;
                              case 0x1a:
                                goto switchD_008c3848_caseD_1a;
                              case 0x1b:
                                goto switchD_008c3848_caseD_1b;
                              case 0x1c:
                                goto switchD_008c3848_caseD_1c;
                              case 0x1d:
                                goto switchD_008c3848_caseD_1d;
                              case 0x1e:
                                goto switchD_008c3848_caseD_1e;
                              case 0x1f:
                                goto switchD_008c3848_caseD_1f;
                              case 0x20:
                                goto switchD_008c3848_caseD_20;
                              case 0x21:
                                goto switchD_008c3848_caseD_21;
                              case 0x22:
                                goto switchD_008c3848_caseD_22;
                              case 0x23:
                                goto switchD_008c3848_caseD_23;
                              case 0x24:
                                goto switchD_008c3848_caseD_24;
                              case 0x25:
                                goto switchD_008c3848_caseD_25;
                              case 0x26:
                                goto switchD_008c3848_caseD_26;
                              case 0x27:
                                goto switchD_008c3848_caseD_27;
                              case 0x28:
                                goto switchD_008c3848_caseD_28;
                              case 0x29:
                                goto switchD_008c3848_caseD_29;
                              case 0x2a:
                                goto switchD_008c3848_caseD_2a;
                              case 0x2b:
                                goto switchD_008c3848_caseD_2b;
                              case 0x2c:
                                goto switchD_008c3848_caseD_2c;
                              case 0x2d:
                                goto switchD_008c3848_caseD_2d;
                              case 0x2e:
                                goto switchD_008c3848_caseD_2e;
                              case 0x2f:
                                goto switchD_008c3848_caseD_2f;
                              case 0x30:
                                goto switchD_008c3848_caseD_30;
                              case 0x31:
                                goto switchD_008c3848_caseD_31;
                              case 0x32:
                                goto switchD_008c3848_caseD_32;
                              case 0x33:
                                goto switchD_008c3848_caseD_33;
                              case 0x34:
                                goto switchD_008c3848_caseD_34;
                              case 0x35:
                                goto switchD_008c3848_caseD_35;
                              case 0x36:
                                goto switchD_008c3848_caseD_36;
                              case 0x37:
                                goto switchD_008c3848_caseD_37;
                              case 0x38:
                                goto switchD_008c3848_caseD_38;
                              case 0x39:
                                goto switchD_008c3848_caseD_39;
                              case 0x3a:
                                goto switchD_008c3848_caseD_3a;
                              case 0x3b:
                                goto switchD_008c3848_caseD_3b;
                              case 0x3c:
                                goto switchD_008c3848_caseD_3c;
                              case 0x3d:
                                goto switchD_008c3848_caseD_3d;
                              case 0x3e:
                                goto switchD_008c3848_caseD_3e;
                              case 0x3f:
                                goto switchD_008c3848_caseD_3f;
                              case 0x40:
                                goto switchD_008c3848_caseD_40;
                              case 0x41:
                                goto switchD_008c3848_caseD_41;
                              case 0x42:
                                goto switchD_008c3848_caseD_42;
                              case 0x43:
                                goto switchD_008c3848_caseD_43;
                              case 0x44:
                                goto switchD_008c3848_caseD_44;
                              case 0x45:
                                goto switchD_008c3848_caseD_45;
                              case 0x46:
                                goto switchD_008c3848_caseD_46;
                              case 0x47:
                                goto switchD_008c3848_caseD_47;
                              case 0x48:
                                goto switchD_008c3848_caseD_48;
                              case 0x49:
                                goto switchD_008c3848_caseD_49;
                              case 0x4a:
                                goto switchD_008c3848_caseD_4a;
                              case 0x4b:
                                goto switchD_008c3848_caseD_4b;
                              case 0x4c:
                                goto switchD_008c3848_caseD_4c;
                              case 0x4d:
                                goto switchD_008c3848_caseD_4d;
                              case 0x4e:
                                goto switchD_008c3848_caseD_4e;
                              case 0x4f:
                                goto switchD_008c3848_caseD_4f;
                              case 0x50:
                                goto switchD_008c3848_caseD_50;
                              case 0x51:
                                goto switchD_008c3848_caseD_51;
                              case 0x52:
                                goto switchD_008c3848_caseD_52;
                              case 0x53:
                                goto switchD_008c3848_caseD_53;
                              case 0x54:
                                goto switchD_008c3848_caseD_54;
                              case 0x55:
                                goto switchD_008c3848_caseD_55;
                              case 0x56:
                                goto switchD_008c3848_caseD_56;
                              case 0x57:
                                goto switchD_008c3848_caseD_57;
                              case 0x58:
                                goto switchD_008c3848_caseD_58;
                              case 0x59:
                                goto switchD_008c3848_caseD_59;
                              case 0x5a:
                                goto switchD_008c3848_caseD_5a;
                              case 0x5b:
                                goto switchD_008c3848_caseD_5b;
                              case 0x5c:
                                goto switchD_008c3848_caseD_5c;
                              case 0x5d:
                                goto switchD_008c3848_caseD_5d;
                              case 0x5e:
                                goto switchD_008c3848_caseD_5e;
                              }
                            } while( true );
                          case 0xc:
                            goto switchD_008c3848_caseD_c;
                          case 0xd:
                            goto switchD_008c3848_caseD_d;
                          case 0xe:
                            goto switchD_008c3848_caseD_e;
                          case 0xf:
                            goto switchD_008c3848_caseD_f;
                          case 0x10:
                            goto switchD_008c3848_caseD_10;
                          case 0x11:
                            goto switchD_008c3848_caseD_11;
                          case 0x12:
                            goto switchD_008c3848_caseD_12;
                          case 0x13:
                            goto switchD_008c3848_caseD_13;
                          case 0x14:
                            goto switchD_008c3848_caseD_14;
                          case 0x15:
                            goto switchD_008c3848_caseD_15;
                          case 0x16:
                            goto switchD_008c3848_caseD_16;
                          case 0x17:
                            goto switchD_008c3848_caseD_17;
                          case 0x18:
                            goto switchD_008c3848_caseD_18;
                          case 0x19:
                            goto switchD_008c3848_caseD_19;
                          case 0x1a:
                            goto switchD_008c3848_caseD_1a;
                          case 0x1b:
                            goto switchD_008c3848_caseD_1b;
                          case 0x1c:
                            goto switchD_008c3848_caseD_1c;
                          case 0x1d:
                            goto switchD_008c3848_caseD_1d;
                          case 0x1e:
                            goto switchD_008c3848_caseD_1e;
                          case 0x1f:
                            goto switchD_008c3848_caseD_1f;
                          case 0x20:
                            goto switchD_008c3848_caseD_20;
                          case 0x21:
                            goto switchD_008c3848_caseD_21;
                          case 0x22:
                            goto switchD_008c3848_caseD_22;
                          case 0x23:
                            goto switchD_008c3848_caseD_23;
                          case 0x24:
                            goto switchD_008c3848_caseD_24;
                          case 0x25:
                            goto switchD_008c3848_caseD_25;
                          case 0x26:
                            goto switchD_008c3848_caseD_26;
                          case 0x27:
                            goto switchD_008c3848_caseD_27;
                          case 0x28:
                            goto switchD_008c3848_caseD_28;
                          case 0x29:
                            goto switchD_008c3848_caseD_29;
                          case 0x2a:
                            goto switchD_008c3848_caseD_2a;
                          case 0x2b:
                            goto switchD_008c3848_caseD_2b;
                          case 0x2c:
                            goto switchD_008c3848_caseD_2c;
                          case 0x2d:
                            goto switchD_008c3848_caseD_2d;
                          case 0x2e:
                            goto switchD_008c3848_caseD_2e;
                          case 0x2f:
                            goto switchD_008c3848_caseD_2f;
                          case 0x30:
                            goto switchD_008c3848_caseD_30;
                          case 0x31:
                            goto switchD_008c3848_caseD_31;
                          case 0x32:
                            goto switchD_008c3848_caseD_32;
                          case 0x33:
                            goto switchD_008c3848_caseD_33;
                          case 0x34:
                            goto switchD_008c3848_caseD_34;
                          case 0x35:
                            goto switchD_008c3848_caseD_35;
                          case 0x36:
                            goto switchD_008c3848_caseD_36;
                          case 0x37:
                            goto switchD_008c3848_caseD_37;
                          case 0x38:
                            goto switchD_008c3848_caseD_38;
                          case 0x39:
                            goto switchD_008c3848_caseD_39;
                          case 0x3a:
                            goto switchD_008c3848_caseD_3a;
                          case 0x3b:
                            goto switchD_008c3848_caseD_3b;
                          case 0x3c:
                            goto switchD_008c3848_caseD_3c;
                          case 0x3d:
                            goto switchD_008c3848_caseD_3d;
                          case 0x3e:
                            goto switchD_008c3848_caseD_3e;
                          case 0x3f:
                            goto switchD_008c3848_caseD_3f;
                          case 0x40:
                            goto switchD_008c3848_caseD_40;
                          case 0x41:
                            goto switchD_008c3848_caseD_41;
                          case 0x42:
                            goto switchD_008c3848_caseD_42;
                          case 0x43:
                            goto switchD_008c3848_caseD_43;
                          case 0x44:
                            goto switchD_008c3848_caseD_44;
                          case 0x45:
                            goto switchD_008c3848_caseD_45;
                          case 0x46:
                            goto switchD_008c3848_caseD_46;
                          case 0x47:
                            goto switchD_008c3848_caseD_47;
                          case 0x48:
                            goto switchD_008c3848_caseD_48;
                          case 0x49:
                            goto switchD_008c3848_caseD_49;
                          case 0x4a:
                            goto switchD_008c3848_caseD_4a;
                          case 0x4b:
                            goto switchD_008c3848_caseD_4b;
                          case 0x4c:
                            goto switchD_008c3848_caseD_4c;
                          case 0x4d:
                            goto switchD_008c3848_caseD_4d;
                          case 0x4e:
                            goto switchD_008c3848_caseD_4e;
                          case 0x4f:
                            goto switchD_008c3848_caseD_4f;
                          case 0x50:
                            goto switchD_008c3848_caseD_50;
                          case 0x51:
                            goto switchD_008c3848_caseD_51;
                          case 0x52:
                            goto switchD_008c3848_caseD_52;
                          case 0x53:
                            goto switchD_008c3848_caseD_53;
                          case 0x54:
                            goto switchD_008c3848_caseD_54;
                          case 0x55:
                            goto switchD_008c3848_caseD_55;
                          case 0x56:
                            goto switchD_008c3848_caseD_56;
                          case 0x57:
                            goto switchD_008c3848_caseD_57;
                          case 0x58:
                            goto switchD_008c3848_caseD_58;
                          case 0x59:
                            goto switchD_008c3848_caseD_59;
                          case 0x5a:
                            goto switchD_008c3848_caseD_5a;
                          case 0x5b:
                            goto switchD_008c3848_caseD_5b;
                          case 0x5c:
                            goto switchD_008c3848_caseD_5c;
                          case 0x5d:
                            goto switchD_008c3848_caseD_5d;
                          case 0x5e:
                            goto switchD_008c3848_caseD_5e;
                          }
                        } while( true );
                      case 0xb:
                        goto switchD_008c3848_caseD_b;
                      case 0xc:
                        goto switchD_008c3848_caseD_c;
                      case 0xd:
                        goto switchD_008c3848_caseD_d;
                      case 0xe:
                        goto switchD_008c3848_caseD_e;
                      case 0xf:
                        goto switchD_008c3848_caseD_f;
                      case 0x10:
                        goto switchD_008c3848_caseD_10;
                      case 0x11:
                        goto switchD_008c3848_caseD_11;
                      case 0x12:
                        goto switchD_008c3848_caseD_12;
                      case 0x13:
                        goto switchD_008c3848_caseD_13;
                      case 0x14:
                        goto switchD_008c3848_caseD_14;
                      case 0x15:
                        goto switchD_008c3848_caseD_15;
                      case 0x16:
                        goto switchD_008c3848_caseD_16;
                      case 0x17:
                        goto switchD_008c3848_caseD_17;
                      case 0x18:
                        goto switchD_008c3848_caseD_18;
                      case 0x19:
                        goto switchD_008c3848_caseD_19;
                      case 0x1a:
                        goto switchD_008c3848_caseD_1a;
                      case 0x1b:
                        goto switchD_008c3848_caseD_1b;
                      case 0x1c:
                        goto switchD_008c3848_caseD_1c;
                      case 0x1d:
                        goto switchD_008c3848_caseD_1d;
                      case 0x1e:
                        goto switchD_008c3848_caseD_1e;
                      case 0x1f:
                        goto switchD_008c3848_caseD_1f;
                      case 0x20:
                        goto switchD_008c3848_caseD_20;
                      case 0x21:
                        goto switchD_008c3848_caseD_21;
                      case 0x22:
                        goto switchD_008c3848_caseD_22;
                      case 0x23:
                        goto switchD_008c3848_caseD_23;
                      case 0x24:
                        goto switchD_008c3848_caseD_24;
                      case 0x25:
                        goto switchD_008c3848_caseD_25;
                      case 0x26:
                        goto switchD_008c3848_caseD_26;
                      case 0x27:
                        goto switchD_008c3848_caseD_27;
                      case 0x28:
                        goto switchD_008c3848_caseD_28;
                      case 0x29:
                        goto switchD_008c3848_caseD_29;
                      case 0x2a:
                        goto switchD_008c3848_caseD_2a;
                      case 0x2b:
                        goto switchD_008c3848_caseD_2b;
                      case 0x2c:
                        goto switchD_008c3848_caseD_2c;
                      case 0x2d:
                        goto switchD_008c3848_caseD_2d;
                      case 0x2e:
                        goto switchD_008c3848_caseD_2e;
                      case 0x2f:
                        goto switchD_008c3848_caseD_2f;
                      case 0x30:
                        goto switchD_008c3848_caseD_30;
                      case 0x31:
                        goto switchD_008c3848_caseD_31;
                      case 0x32:
                        goto switchD_008c3848_caseD_32;
                      case 0x33:
                        goto switchD_008c3848_caseD_33;
                      case 0x34:
                        goto switchD_008c3848_caseD_34;
                      case 0x35:
                        goto switchD_008c3848_caseD_35;
                      case 0x36:
                        goto switchD_008c3848_caseD_36;
                      case 0x37:
                        goto switchD_008c3848_caseD_37;
                      case 0x38:
                        goto switchD_008c3848_caseD_38;
                      case 0x39:
                        goto switchD_008c3848_caseD_39;
                      case 0x3a:
                        goto switchD_008c3848_caseD_3a;
                      case 0x3b:
                        goto switchD_008c3848_caseD_3b;
                      case 0x3c:
                        goto switchD_008c3848_caseD_3c;
                      case 0x3d:
                        goto switchD_008c3848_caseD_3d;
                      case 0x3e:
                        goto switchD_008c3848_caseD_3e;
                      case 0x3f:
                        goto switchD_008c3848_caseD_3f;
                      case 0x40:
                        goto switchD_008c3848_caseD_40;
                      case 0x41:
                        goto switchD_008c3848_caseD_41;
                      case 0x42:
                        goto switchD_008c3848_caseD_42;
                      case 0x43:
                        goto switchD_008c3848_caseD_43;
                      case 0x44:
                        goto switchD_008c3848_caseD_44;
                      case 0x45:
                        goto switchD_008c3848_caseD_45;
                      case 0x46:
                        goto switchD_008c3848_caseD_46;
                      case 0x47:
                        goto switchD_008c3848_caseD_47;
                      case 0x48:
                        goto switchD_008c3848_caseD_48;
                      case 0x49:
                        goto switchD_008c3848_caseD_49;
                      case 0x4a:
                        goto switchD_008c3848_caseD_4a;
                      case 0x4b:
                        goto switchD_008c3848_caseD_4b;
                      case 0x4c:
                        goto switchD_008c3848_caseD_4c;
                      case 0x4d:
                        goto switchD_008c3848_caseD_4d;
                      case 0x4e:
                        goto switchD_008c3848_caseD_4e;
                      case 0x4f:
                        goto switchD_008c3848_caseD_4f;
                      case 0x50:
                        goto switchD_008c3848_caseD_50;
                      case 0x51:
                        goto switchD_008c3848_caseD_51;
                      case 0x52:
                        goto switchD_008c3848_caseD_52;
                      case 0x53:
                        goto switchD_008c3848_caseD_53;
                      case 0x54:
                        goto switchD_008c3848_caseD_54;
                      case 0x55:
                        goto switchD_008c3848_caseD_55;
                      case 0x56:
                        goto switchD_008c3848_caseD_56;
                      case 0x57:
                        goto switchD_008c3848_caseD_57;
                      case 0x58:
                        goto switchD_008c3848_caseD_58;
                      case 0x59:
                        goto switchD_008c3848_caseD_59;
                      case 0x5a:
                        goto switchD_008c3848_caseD_5a;
                      case 0x5b:
                        goto switchD_008c3848_caseD_5b;
                      case 0x5c:
                        goto switchD_008c3848_caseD_5c;
                      case 0x5d:
                        goto switchD_008c3848_caseD_5d;
                      case 0x5e:
                        goto switchD_008c3848_caseD_5e;
                      }
                    } while( true );
                  case 10:
                    goto switchD_008c3848_caseD_a;
                  case 0xb:
                    goto switchD_008c3848_caseD_b;
                  case 0xc:
                    goto switchD_008c3848_caseD_c;
                  case 0xd:
                    goto switchD_008c3848_caseD_d;
                  case 0xe:
                    goto switchD_008c3848_caseD_e;
                  case 0xf:
                    goto switchD_008c3848_caseD_f;
                  case 0x10:
                    goto switchD_008c3848_caseD_10;
                  case 0x11:
                    goto switchD_008c3848_caseD_11;
                  case 0x12:
                    goto switchD_008c3848_caseD_12;
                  case 0x13:
                    goto switchD_008c3848_caseD_13;
                  case 0x14:
                    goto switchD_008c3848_caseD_14;
                  case 0x15:
                    goto switchD_008c3848_caseD_15;
                  case 0x16:
                    goto switchD_008c3848_caseD_16;
                  case 0x17:
                    goto switchD_008c3848_caseD_17;
                  case 0x18:
                    goto switchD_008c3848_caseD_18;
                  case 0x19:
                    goto switchD_008c3848_caseD_19;
                  case 0x1a:
                    goto switchD_008c3848_caseD_1a;
                  case 0x1b:
                    goto switchD_008c3848_caseD_1b;
                  case 0x1c:
                    goto switchD_008c3848_caseD_1c;
                  case 0x1d:
                    goto switchD_008c3848_caseD_1d;
                  case 0x1e:
                    goto switchD_008c3848_caseD_1e;
                  case 0x1f:
                    goto switchD_008c3848_caseD_1f;
                  case 0x20:
                    goto switchD_008c3848_caseD_20;
                  case 0x21:
                    goto switchD_008c3848_caseD_21;
                  case 0x22:
                    goto switchD_008c3848_caseD_22;
                  case 0x23:
                    goto switchD_008c3848_caseD_23;
                  case 0x24:
                    goto switchD_008c3848_caseD_24;
                  case 0x25:
                    goto switchD_008c3848_caseD_25;
                  case 0x26:
                    goto switchD_008c3848_caseD_26;
                  case 0x27:
                    goto switchD_008c3848_caseD_27;
                  case 0x28:
                    goto switchD_008c3848_caseD_28;
                  case 0x29:
                    goto switchD_008c3848_caseD_29;
                  case 0x2a:
                    goto switchD_008c3848_caseD_2a;
                  case 0x2b:
                    goto switchD_008c3848_caseD_2b;
                  case 0x2c:
                    goto switchD_008c3848_caseD_2c;
                  case 0x2d:
                    goto switchD_008c3848_caseD_2d;
                  case 0x2e:
                    goto switchD_008c3848_caseD_2e;
                  case 0x2f:
                    goto switchD_008c3848_caseD_2f;
                  case 0x30:
                    goto switchD_008c3848_caseD_30;
                  case 0x31:
                    goto switchD_008c3848_caseD_31;
                  case 0x32:
                    goto switchD_008c3848_caseD_32;
                  case 0x33:
                    goto switchD_008c3848_caseD_33;
                  case 0x34:
                    goto switchD_008c3848_caseD_34;
                  case 0x35:
                    goto switchD_008c3848_caseD_35;
                  case 0x36:
                    goto switchD_008c3848_caseD_36;
                  case 0x37:
                    goto switchD_008c3848_caseD_37;
                  case 0x38:
                    goto switchD_008c3848_caseD_38;
                  case 0x39:
                    goto switchD_008c3848_caseD_39;
                  case 0x3a:
                    goto switchD_008c3848_caseD_3a;
                  case 0x3b:
                    goto switchD_008c3848_caseD_3b;
                  case 0x3c:
                    goto switchD_008c3848_caseD_3c;
                  case 0x3d:
                    goto switchD_008c3848_caseD_3d;
                  case 0x3e:
                    goto switchD_008c3848_caseD_3e;
                  case 0x3f:
                    goto switchD_008c3848_caseD_3f;
                  case 0x40:
                    goto switchD_008c3848_caseD_40;
                  case 0x41:
switchD_008c3848_caseD_41:
                    pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
                    bVar5 = *(byte *)((long)pppppdVar38 + 1);
                    uVar30 = (ulong)bVar5;
                    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
                    pppppppdVar52 = *(double ********)(param_1 + 0x68);
                    if (*(long *)(param_1 + 0x48) - (long)pppppppdVar52 <=
                        (long)(ulong)(((uint)bVar5 + (uint)*(byte *)((long)pppppppdVar51 + 4)) *
                                     0x10)) {
                      FUN_008b41e4(param_1);
                      pppppppdVar52 = *(double ********)(param_1 + 0x68);
                    }
                    if (bVar5 != 0) {
                      pdVar20 = *(double **)(param_1 + 0x70);
                      pppppppdVar46 = pppppppdVar52;
                      do {
                        ppppppdVar49 = (double ******)*pdVar20;
                        uVar30 = uVar30 - 1;
                        pppppppdVar46[1] = (double ******)pdVar20[1];
                        *pppppppdVar46 = ppppppdVar49;
                        *(undefined4 *)((long)pdVar20 + 0xc) = 0;
                        pdVar20 = pdVar20 + 2;
                        pppppppdVar46 = pppppppdVar46 + 2;
                      } while (uVar30 != 0);
                    }
                    bVar5 = *(byte *)((long)pppppppdVar51 + 4);
                    lVar50 = *(long *)(param_1 + 0x50);
                    *(double ********)(param_1 + 0x70) = pppppppdVar52;
                    pppppppdVar46 = pppppppdVar52 + (ulong)bVar5 * 2;
                    *(double ********)(lVar50 + 0x10) = pppppppdVar52;
                    *(double ********)(lVar50 + 0x18) = pppppppdVar46;
                    uVar26 = *(undefined1 *)pppppdVar53;
LAB_008c7758:
                    *(double ********)(param_1 + 0x68) = pppppppdVar46;
                    break;
                  case 0x42:
                    goto switchD_008c3848_caseD_42;
                  case 0x43:
                    goto switchD_008c3848_caseD_43;
                  case 0x44:
                    goto switchD_008c3848_caseD_44;
                  case 0x45:
                    goto switchD_008c3848_caseD_45;
                  case 0x46:
                    goto switchD_008c3848_caseD_46;
                  case 0x47:
                    goto switchD_008c3848_caseD_47;
                  case 0x48:
                    goto switchD_008c3848_caseD_48;
                  case 0x49:
                    goto switchD_008c3848_caseD_49;
                  case 0x4a:
                    goto switchD_008c3848_caseD_4a;
                  case 0x4b:
                    goto switchD_008c3848_caseD_4b;
                  case 0x4c:
                    goto switchD_008c3848_caseD_4c;
                  case 0x4d:
                    goto switchD_008c3848_caseD_4d;
                  case 0x4e:
                    goto switchD_008c3848_caseD_4e;
                  case 0x4f:
                    goto switchD_008c3848_caseD_4f;
                  case 0x50:
                    goto switchD_008c3848_caseD_50;
                  case 0x51:
                    goto switchD_008c3848_caseD_51;
                  case 0x52:
                    goto switchD_008c3848_caseD_52;
                  case 0x53:
                    goto switchD_008c3848_caseD_53;
                  case 0x54:
                    goto switchD_008c3848_caseD_54;
                  case 0x55:
                    goto switchD_008c3848_caseD_55;
                  case 0x56:
                    goto switchD_008c3848_caseD_56;
                  case 0x57:
                    goto switchD_008c3848_caseD_57;
                  case 0x58:
                    goto switchD_008c3848_caseD_58;
                  case 0x59:
                    goto switchD_008c3848_caseD_59;
                  case 0x5a:
                    goto switchD_008c3848_caseD_5a;
                  case 0x5b:
                    goto switchD_008c3848_caseD_5b;
                  case 0x5c:
                    goto switchD_008c3848_caseD_5c;
                  case 0x5d:
                    goto switchD_008c3848_caseD_5d;
                  case 0x5e:
                    goto switchD_008c3848_caseD_5e;
                  }
                } while( true );
              }
              ppppppdVar60 = *pppppppdVar46;
              ppppppdVar49[1] = (double *****)pppppppdVar46[1];
              *ppppppdVar49 = (double *****)ppppppdVar60;
              if (((4 < (int)*(uint *)((long)pppppppdVar46 + 0xc)) &&
                  ((*(byte *)((long)pppppppdVar31 + 2) >> 2 & 1) != 0)) &&
                 (((ulong)**pppppppdVar46 & 0x30000) != 0)) {
LAB_008c3a10:
                FUN_008b6370(param_1,pppppppdVar31);
              }
LAB_008c3a14:
              uVar26 = *(undefined1 *)pppppdVar53;
              goto LAB_008c3a18;
            case 9:
              goto switchD_008c3848_caseD_9;
            case 10:
              goto switchD_008c3848_caseD_a;
            case 0xb:
              goto switchD_008c3848_caseD_b;
            case 0xc:
              goto switchD_008c3848_caseD_c;
            case 0xd:
              goto switchD_008c3848_caseD_d;
            case 0xe:
              goto switchD_008c3848_caseD_e;
            case 0xf:
              goto switchD_008c3848_caseD_f;
            case 0x10:
              goto switchD_008c3848_caseD_10;
            case 0x11:
              goto switchD_008c3848_caseD_11;
            case 0x12:
              goto switchD_008c3848_caseD_12;
            case 0x13:
              goto switchD_008c3848_caseD_13;
            case 0x14:
              goto switchD_008c3848_caseD_14;
            case 0x15:
              goto switchD_008c3848_caseD_15;
            case 0x16:
              goto switchD_008c3848_caseD_16;
            case 0x17:
              goto switchD_008c3848_caseD_17;
            case 0x18:
              goto switchD_008c3848_caseD_18;
            case 0x19:
              goto switchD_008c3848_caseD_19;
            case 0x1a:
              goto switchD_008c3848_caseD_1a;
            case 0x1b:
              goto switchD_008c3848_caseD_1b;
            case 0x1c:
              goto switchD_008c3848_caseD_1c;
            case 0x1d:
              goto switchD_008c3848_caseD_1d;
            case 0x1e:
              goto switchD_008c3848_caseD_1e;
            case 0x1f:
              goto switchD_008c3848_caseD_1f;
            case 0x20:
              goto switchD_008c3848_caseD_20;
            case 0x21:
              goto switchD_008c3848_caseD_21;
            case 0x22:
              goto switchD_008c3848_caseD_22;
            case 0x23:
              goto switchD_008c3848_caseD_23;
            case 0x24:
              goto switchD_008c3848_caseD_24;
            case 0x25:
              goto switchD_008c3848_caseD_25;
            case 0x26:
              goto switchD_008c3848_caseD_26;
            case 0x27:
              goto switchD_008c3848_caseD_27;
            case 0x28:
              goto switchD_008c3848_caseD_28;
            case 0x29:
              goto switchD_008c3848_caseD_29;
            case 0x2a:
              goto switchD_008c3848_caseD_2a;
            case 0x2b:
              goto switchD_008c3848_caseD_2b;
            case 0x2c:
              goto switchD_008c3848_caseD_2c;
            case 0x2d:
              goto switchD_008c3848_caseD_2d;
            case 0x2e:
              goto switchD_008c3848_caseD_2e;
            case 0x2f:
              goto switchD_008c3848_caseD_2f;
            case 0x30:
              goto switchD_008c3848_caseD_30;
            case 0x31:
              goto switchD_008c3848_caseD_31;
            case 0x32:
              goto switchD_008c3848_caseD_32;
            case 0x33:
              goto switchD_008c3848_caseD_33;
            case 0x34:
              goto switchD_008c3848_caseD_34;
            case 0x35:
              goto switchD_008c3848_caseD_35;
            case 0x36:
              goto switchD_008c3848_caseD_36;
            case 0x37:
              goto switchD_008c3848_caseD_37;
            case 0x38:
              goto switchD_008c3848_caseD_38;
            case 0x39:
              goto switchD_008c3848_caseD_39;
            case 0x3a:
              goto switchD_008c3848_caseD_3a;
            case 0x3b:
              goto switchD_008c3848_caseD_3b;
            case 0x3c:
              goto switchD_008c3848_caseD_3c;
            case 0x3d:
              goto switchD_008c3848_caseD_3d;
            case 0x3e:
              goto switchD_008c3848_caseD_3e;
            case 0x3f:
              goto switchD_008c3848_caseD_3f;
            case 0x40:
              goto switchD_008c3848_caseD_40;
            case 0x41:
              goto switchD_008c3848_caseD_41;
            case 0x42:
              goto switchD_008c3848_caseD_42;
            case 0x43:
              goto switchD_008c3848_caseD_43;
            case 0x44:
              goto switchD_008c3848_caseD_44;
            case 0x45:
              goto switchD_008c3848_caseD_45;
            case 0x46:
              goto switchD_008c3848_caseD_46;
            case 0x47:
              goto switchD_008c3848_caseD_47;
            case 0x48:
              goto switchD_008c3848_caseD_48;
            case 0x49:
              goto switchD_008c3848_caseD_49;
            case 0x4a:
              goto switchD_008c3848_caseD_4a;
            case 0x4b:
              goto switchD_008c3848_caseD_4b;
            case 0x4c:
              goto switchD_008c3848_caseD_4c;
            case 0x4d:
              goto switchD_008c3848_caseD_4d;
            case 0x4e:
              goto switchD_008c3848_caseD_4e;
            case 0x4f:
              goto switchD_008c3848_caseD_4f;
            case 0x50:
              goto switchD_008c3848_caseD_50;
            case 0x51:
              goto switchD_008c3848_caseD_51;
            case 0x52:
              goto switchD_008c3848_caseD_52;
            case 0x53:
              goto switchD_008c3848_caseD_53;
            case 0x54:
              goto switchD_008c3848_caseD_54;
            case 0x55:
              goto switchD_008c3848_caseD_55;
            case 0x56:
              goto switchD_008c3848_caseD_56;
            case 0x57:
              goto switchD_008c3848_caseD_57;
            case 0x58:
              goto switchD_008c3848_caseD_58;
            case 0x59:
              goto switchD_008c3848_caseD_59;
            case 0x5a:
              goto switchD_008c3848_caseD_5a;
            case 0x5b:
switchD_008c3848_caseD_5b:
              uVar16 = *(uint *)pppppdVar38;
              uVar13 = *(uint *)((long)pppppdVar38 + 4);
              pppppdVar53 = pppppdVar38 + 1;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
              FUN_008b30a8(param_1,pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2,
                           pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2,uVar13);
              uVar26 = *(undefined1 *)(pppppdVar38 + 1);
              goto LAB_008c3a18;
            case 0x5c:
              goto switchD_008c3848_caseD_5c;
            case 0x5d:
              goto switchD_008c3848_caseD_5d;
            case 0x5e:
              goto switchD_008c3848_caseD_5e;
            }
          } while( true );
        case 8:
          goto switchD_008c3848_caseD_8;
        case 9:
          goto switchD_008c3848_caseD_9;
        case 10:
          goto switchD_008c3848_caseD_a;
        case 0xb:
          goto switchD_008c3848_caseD_b;
        case 0xc:
          goto switchD_008c3848_caseD_c;
        case 0xd:
          goto switchD_008c3848_caseD_d;
        case 0xe:
          goto switchD_008c3848_caseD_e;
        case 0xf:
          goto switchD_008c3848_caseD_f;
        case 0x10:
          goto switchD_008c3848_caseD_10;
        case 0x11:
          goto switchD_008c3848_caseD_11;
        case 0x12:
          goto switchD_008c3848_caseD_12;
        case 0x13:
          goto switchD_008c3848_caseD_13;
        case 0x14:
          goto switchD_008c3848_caseD_14;
        case 0x15:
          goto switchD_008c3848_caseD_15;
        case 0x16:
          goto switchD_008c3848_caseD_16;
        case 0x17:
          goto switchD_008c3848_caseD_17;
        case 0x18:
          goto switchD_008c3848_caseD_18;
        case 0x19:
          goto switchD_008c3848_caseD_19;
        case 0x1a:
          goto switchD_008c3848_caseD_1a;
        case 0x1b:
          goto switchD_008c3848_caseD_1b;
        case 0x1c:
          goto switchD_008c3848_caseD_1c;
        case 0x1d:
          goto switchD_008c3848_caseD_1d;
        case 0x1e:
          goto switchD_008c3848_caseD_1e;
        case 0x1f:
          goto switchD_008c3848_caseD_1f;
        case 0x20:
          goto switchD_008c3848_caseD_20;
        case 0x21:
          goto switchD_008c3848_caseD_21;
        case 0x22:
          goto switchD_008c3848_caseD_22;
        case 0x23:
          goto switchD_008c3848_caseD_23;
        case 0x24:
          goto switchD_008c3848_caseD_24;
        case 0x25:
          goto switchD_008c3848_caseD_25;
        case 0x26:
          goto switchD_008c3848_caseD_26;
        case 0x27:
          goto switchD_008c3848_caseD_27;
        case 0x28:
          goto switchD_008c3848_caseD_28;
        case 0x29:
          goto switchD_008c3848_caseD_29;
        case 0x2a:
          goto switchD_008c3848_caseD_2a;
        case 0x2b:
          goto switchD_008c3848_caseD_2b;
        case 0x2c:
          goto switchD_008c3848_caseD_2c;
        case 0x2d:
          goto switchD_008c3848_caseD_2d;
        case 0x2e:
          goto switchD_008c3848_caseD_2e;
        case 0x2f:
          goto switchD_008c3848_caseD_2f;
        case 0x30:
          goto switchD_008c3848_caseD_30;
        case 0x31:
          goto switchD_008c3848_caseD_31;
        case 0x32:
          goto switchD_008c3848_caseD_32;
        case 0x33:
          goto switchD_008c3848_caseD_33;
        case 0x34:
          goto switchD_008c3848_caseD_34;
        case 0x35:
          goto switchD_008c3848_caseD_35;
        case 0x36:
          goto switchD_008c3848_caseD_36;
        case 0x37:
          goto switchD_008c3848_caseD_37;
        case 0x38:
          goto switchD_008c3848_caseD_38;
        case 0x39:
          goto switchD_008c3848_caseD_39;
        case 0x3a:
          goto switchD_008c3848_caseD_3a;
        case 0x3b:
          goto switchD_008c3848_caseD_3b;
        case 0x3c:
          goto switchD_008c3848_caseD_3c;
        case 0x3d:
          goto switchD_008c3848_caseD_3d;
        case 0x3e:
          goto switchD_008c3848_caseD_3e;
        case 0x3f:
          goto switchD_008c3848_caseD_3f;
        case 0x40:
          goto switchD_008c3848_caseD_40;
        case 0x41:
          goto switchD_008c3848_caseD_41;
        case 0x42:
          goto switchD_008c3848_caseD_42;
        case 0x43:
          goto switchD_008c3848_caseD_43;
        case 0x44:
          goto switchD_008c3848_caseD_44;
        case 0x45:
          goto switchD_008c3848_caseD_45;
        case 0x46:
          goto switchD_008c3848_caseD_46;
        case 0x47:
          goto switchD_008c3848_caseD_47;
        case 0x48:
          goto switchD_008c3848_caseD_48;
        case 0x49:
          goto switchD_008c3848_caseD_49;
        case 0x4a:
          goto switchD_008c3848_caseD_4a;
        case 0x4b:
          goto switchD_008c3848_caseD_4b;
        case 0x4c:
          goto switchD_008c3848_caseD_4c;
        case 0x4d:
          goto switchD_008c3848_caseD_4d;
        case 0x4e:
          goto switchD_008c3848_caseD_4e;
        case 0x4f:
          goto switchD_008c3848_caseD_4f;
        case 0x50:
          goto switchD_008c3848_caseD_50;
        case 0x51:
          goto switchD_008c3848_caseD_51;
        case 0x52:
          goto switchD_008c3848_caseD_52;
        case 0x53:
          goto switchD_008c3848_caseD_53;
        case 0x54:
          goto switchD_008c3848_caseD_54;
        case 0x55:
          goto switchD_008c3848_caseD_55;
        case 0x56:
          goto switchD_008c3848_caseD_56;
        case 0x57:
          goto switchD_008c3848_caseD_57;
        case 0x58:
          goto switchD_008c3848_caseD_58;
        case 0x59:
          goto switchD_008c3848_caseD_59;
        case 0x5a:
          goto switchD_008c3848_caseD_5a;
        case 0x5b:
          goto switchD_008c3848_caseD_5b;
        case 0x5c:
          goto switchD_008c3848_caseD_5c;
        case 0x5d:
          goto switchD_008c3848_caseD_5d;
        case 0x5e:
          goto switchD_008c3848_caseD_5e;
        }
      } while( true );
    case 2:
switchD_008c3848_caseD_2:
      *(undefined4 *)((long)pppppppdVar52 + (ulong)*(byte *)((long)pppppdVar53 + 1) * 0x10 + 0xc) =
           0;
      break;
    case 3:
switchD_008c3848_caseD_3:
      uVar16 = *(uint *)pppppdVar53;
      pppppdVar53 = (double *****)((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
      *(uint *)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) = uVar16 >> 0x10 & 0xff;
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 1;
      break;
    case 4:
switchD_008c3848_caseD_4:
      uVar16 = *(uint *)pppppdVar53;
      *(uint *)((long)(pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2) + 0xc) = 3;
      pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2] = (double ******)(double)((int)uVar16 >> 0x10);
      break;
    case 5:
switchD_008c3848_caseD_5:
      uVar16 = *(uint *)pppppdVar53;
      ppppppdVar49 = (double ******)pppppdVar54[(long)((int)uVar16 >> 0x10) * 2];
      (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
           (double ******)(pppppdVar54 + (long)((int)uVar16 >> 0x10) * 2)[1];
      pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
      break;
    case 6:
switchD_008c3848_caseD_6:
      uVar16 = *(uint *)pppppdVar53;
      ppppppdVar49 = pppppppdVar52[((ulong)(uVar16 >> 0x10) & 0xff) * 2];
      (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
           (pppppppdVar52 + ((ulong)(uVar16 >> 0x10) & 0xff) * 2)[1];
      pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
      break;
    case 7:
      goto switchD_008c3848_caseD_7;
    case 8:
      goto switchD_008c3848_caseD_8;
    case 9:
      goto switchD_008c3848_caseD_9;
    case 10:
      goto switchD_008c3848_caseD_a;
    case 0xb:
      goto switchD_008c3848_caseD_b;
    case 0xc:
      goto switchD_008c3848_caseD_c;
    case 0xd:
      goto switchD_008c3848_caseD_d;
    case 0xe:
      goto switchD_008c3848_caseD_e;
    case 0xf:
      goto switchD_008c3848_caseD_f;
    case 0x10:
      goto switchD_008c3848_caseD_10;
    case 0x11:
      goto switchD_008c3848_caseD_11;
    case 0x12:
      goto switchD_008c3848_caseD_12;
    case 0x13:
      goto switchD_008c3848_caseD_13;
    case 0x14:
      goto switchD_008c3848_caseD_14;
    case 0x15:
      goto switchD_008c3848_caseD_15;
    case 0x16:
      goto switchD_008c3848_caseD_16;
    case 0x17:
switchD_008c3848_caseD_17:
      pppppdVar53 = (double *****)((long)pppppdVar53 + (long)*(short *)((long)pppppdVar53 + 2) * 4);
      break;
    case 0x18:
      goto switchD_008c3848_caseD_18;
    case 0x19:
      goto switchD_008c3848_caseD_19;
    case 0x1a:
      goto switchD_008c3848_caseD_1a;
    case 0x1b:
      goto switchD_008c3848_caseD_1b;
    case 0x1c:
      goto switchD_008c3848_caseD_1c;
    case 0x1d:
      goto switchD_008c3848_caseD_1d;
    case 0x1e:
      goto switchD_008c3848_caseD_1e;
    case 0x1f:
      goto switchD_008c3848_caseD_1f;
    case 0x20:
      goto switchD_008c3848_caseD_20;
    case 0x21:
      goto switchD_008c3848_caseD_21;
    case 0x22:
      goto switchD_008c3848_caseD_22;
    case 0x23:
      goto switchD_008c3848_caseD_23;
    case 0x24:
      goto switchD_008c3848_caseD_24;
    case 0x25:
      goto switchD_008c3848_caseD_25;
    case 0x26:
      goto switchD_008c3848_caseD_26;
    case 0x27:
      goto switchD_008c3848_caseD_27;
    case 0x28:
      goto switchD_008c3848_caseD_28;
    case 0x29:
      goto switchD_008c3848_caseD_29;
    case 0x2a:
      goto switchD_008c3848_caseD_2a;
    case 0x2b:
      goto switchD_008c3848_caseD_2b;
    case 0x2c:
      goto switchD_008c3848_caseD_2c;
    case 0x2d:
      goto switchD_008c3848_caseD_2d;
    case 0x2e:
      goto switchD_008c3848_caseD_2e;
    case 0x2f:
      goto switchD_008c3848_caseD_2f;
    case 0x30:
      goto switchD_008c3848_caseD_30;
    case 0x31:
      goto switchD_008c3848_caseD_31;
    case 0x32:
      goto switchD_008c3848_caseD_32;
    case 0x33:
      goto switchD_008c3848_caseD_33;
    case 0x34:
      goto switchD_008c3848_caseD_34;
    case 0x35:
      goto switchD_008c3848_caseD_35;
    case 0x36:
      goto switchD_008c3848_caseD_36;
    case 0x37:
      goto switchD_008c3848_caseD_37;
    case 0x38:
      goto switchD_008c3848_caseD_38;
    case 0x39:
      goto switchD_008c3848_caseD_39;
    case 0x3a:
      goto switchD_008c3848_caseD_3a;
    case 0x3b:
      goto switchD_008c3848_caseD_3b;
    case 0x3c:
      goto switchD_008c3848_caseD_3c;
    case 0x3d:
      goto switchD_008c3848_caseD_3d;
    case 0x3e:
      goto switchD_008c3848_caseD_3e;
    case 0x3f:
      goto switchD_008c3848_caseD_3f;
    case 0x40:
      goto switchD_008c3848_caseD_40;
    case 0x41:
      goto switchD_008c3848_caseD_41;
    case 0x42:
      goto switchD_008c3848_caseD_42;
    case 0x43:
      goto switchD_008c3848_caseD_43;
    case 0x44:
      goto switchD_008c3848_caseD_44;
    case 0x45:
      goto switchD_008c3848_caseD_45;
    case 0x46:
      goto switchD_008c3848_caseD_46;
    case 0x47:
      goto switchD_008c3848_caseD_47;
    case 0x48:
      goto switchD_008c3848_caseD_48;
    case 0x49:
      goto switchD_008c3848_caseD_49;
    case 0x4a:
      goto switchD_008c3848_caseD_4a;
    case 0x4b:
      goto switchD_008c3848_caseD_4b;
    case 0x4c:
      goto switchD_008c3848_caseD_4c;
    case 0x4d:
      goto switchD_008c3848_caseD_4d;
    case 0x4e:
      goto switchD_008c3848_caseD_4e;
    case 0x4f:
      goto switchD_008c3848_caseD_4f;
    case 0x50:
      goto switchD_008c3848_caseD_50;
    case 0x51:
      goto switchD_008c3848_caseD_51;
    case 0x52:
      goto switchD_008c3848_caseD_52;
    case 0x53:
      goto switchD_008c3848_caseD_53;
    case 0x54:
      goto switchD_008c3848_caseD_54;
    case 0x55:
      goto switchD_008c3848_caseD_55;
    case 0x56:
      goto switchD_008c3848_caseD_56;
    case 0x57:
      goto switchD_008c3848_caseD_57;
    case 0x58:
      goto switchD_008c3848_caseD_58;
    case 0x59:
      goto switchD_008c3848_caseD_59;
    case 0x5a:
      goto switchD_008c3848_caseD_5a;
    case 0x5b:
      goto switchD_008c3848_caseD_5b;
    case 0x5c:
      goto switchD_008c3848_caseD_5c;
    case 0x5d:
      goto switchD_008c3848_caseD_5d;
    case 0x5e:
      goto switchD_008c3848_caseD_5e;
    }
  } while( true );
switchD_008c3848_caseD_1e:
  uVar16 = *(uint *)pppppdVar53;
  uVar30 = (ulong)uVar16;
  puVar36 = (uint *)((long)pppppdVar53 + 4);
  pppppppdVar31 = pppppppdVar52 + (ulong)*puVar36 * 2;
  pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  uVar13 = *(uint *)((long)pppppppdVar46 + 0xc);
  iVar11 = (int)uVar16 >> 0x10;
  if (uVar13 == *(uint *)((long)pppppppdVar31 + 0xc)) {
    if ((int)uVar13 < 7) {
      if ((int)uVar13 < 3) {
        if (uVar13 == 0) goto LAB_008c7638;
        if (uVar13 == 1) {
          if (*(uint *)pppppppdVar46 == *(uint *)pppppppdVar31) {
            iVar11 = 1;
          }
          pppppdVar53 = (double *****)(puVar36 + iVar11);
        }
        else if ((*pppppppdVar46 == *pppppppdVar31) &&
                (*(uint *)(pppppppdVar46 + 1) == *(uint *)(pppppppdVar31 + 1))) {
LAB_008c5614:
          pppppdVar53 = pppppdVar53 + 1;
        }
        else {
LAB_008c575c:
          pppppdVar53 = (double *****)(puVar36 + ((long)(uVar30 << 0x20) >> 0x30));
        }
      }
      else {
        if (4 < (int)uVar13) {
          if (uVar13 == 5) goto LAB_008c55d8;
          ppppppdVar49 = *pppppppdVar46;
          ppppppdVar60 = *pppppppdVar31;
          pppppdVar53 = ppppppdVar49[2];
          if (pppppdVar53 != ppppppdVar60[2]) goto LAB_008c5674;
          if ((pppppdVar53 == (double *****)0x0) || (*(char *)((long)pppppdVar53 + 6) < '\0'))
          goto LAB_008c55e0;
          if ((*(byte *)((long)pppppdVar53 + 7) >> 1 & 1) != 0) goto LAB_008c5674;
          lVar50 = FUN_008bdfe0(pppppdVar53,7,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
          unaff_x22 = pppppppdVar31;
          if (lVar50 != 0) goto LAB_008c5674;
          goto LAB_008c553c;
        }
        if (uVar13 == 3) {
          lVar50 = (long)(uVar30 << 0x20) >> 0x30;
          bVar10 = (double)*pppppppdVar46 == (double)*pppppppdVar31;
        }
        else {
          if ((*(float *)pppppppdVar46 != *(float *)pppppppdVar31) ||
             (*(float *)((long)pppppppdVar46 + 4) != *(float *)((long)pppppppdVar31 + 4)))
          goto LAB_008c575c;
          lVar50 = (long)(uVar30 << 0x20) >> 0x30;
          bVar10 = false;
          if (!NAN(*(float *)(pppppppdVar46 + 1)) && !NAN(*(float *)(pppppppdVar31 + 1))) {
            bVar10 = *(float *)(pppppppdVar46 + 1) == *(float *)(pppppppdVar31 + 1);
          }
        }
        if (bVar10) {
          lVar50 = 1;
        }
        pppppdVar53 = (double *****)(puVar36 + lVar50);
      }
    }
    else {
      if ((int)uVar13 < 9) {
        if (uVar13 == 7) goto LAB_008c55d8;
        ppppppdVar49 = *pppppppdVar46;
        ppppppdVar60 = *pppppppdVar31;
        pppppdVar38 = ppppppdVar49[1];
        if (pppppdVar38 != ppppppdVar60[1]) goto LAB_008c5674;
        if ((pppppdVar38 != (double *****)0x0) && (-1 < *(char *)((long)pppppdVar38 + 6))) {
          if ((*(byte *)((long)pppppdVar38 + 7) >> 1 & 1) == 0) {
            ppppdVar21 = (double ****)
                         FUN_008bdfe0(pppppdVar38,7,
                                      *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
            unaff_x22 = pppppppdVar31;
            if (ppppdVar21 == (double ****)0x0) goto LAB_008c553c;
          }
          else {
            ppppdVar21 = pppppdVar38[4] + -0x10;
          }
          if ((*(int *)((long)ppppdVar21 + 0xc) != 7) || (*(char *)((long)*ppppdVar21 + 6) == '\0'))
          {
LAB_008c5674:
            *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
            iVar14 = FUN_008cbdc8(param_1);
            if (iVar14 != 0) {
              iVar11 = 1;
            }
            pppppdVar38 = (double *****)(puVar36 + iVar11);
LAB_008c6620:
            pppppppdVar52 = *(double ********)(param_1 + 0x70);
            pppppppdVar46 = pppppppdVar51;
            pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
            switch(*(undefined1 *)pppppdVar38) {
            case 0:
              goto switchD_008c3848_caseD_0;
            case 1:
              goto switchD_008c3848_caseD_1;
            case 2:
              goto switchD_008c3848_caseD_2;
            case 3:
              goto switchD_008c3848_caseD_3;
            case 4:
              goto switchD_008c3848_caseD_4;
            case 5:
              goto switchD_008c3848_caseD_5;
            case 6:
              goto switchD_008c3848_caseD_6;
            case 7:
              goto switchD_008c3848_caseD_7;
            case 8:
              goto switchD_008c3848_caseD_8;
            case 9:
              goto switchD_008c3848_caseD_9;
            case 10:
              goto switchD_008c3848_caseD_a;
            case 0xb:
              goto switchD_008c3848_caseD_b;
            case 0xc:
              goto switchD_008c3848_caseD_c;
            case 0xd:
              goto switchD_008c3848_caseD_d;
            case 0xe:
              goto switchD_008c3848_caseD_e;
            case 0xf:
              goto switchD_008c3848_caseD_f;
            case 0x10:
              goto switchD_008c3848_caseD_10;
            case 0x11:
              goto switchD_008c3848_caseD_11;
            case 0x12:
              goto switchD_008c3848_caseD_12;
            case 0x13:
              goto switchD_008c3848_caseD_13;
            case 0x14:
              goto switchD_008c3848_caseD_14;
            case 0x15:
              goto switchD_008c3848_caseD_15;
            case 0x16:
              goto switchD_008c3848_caseD_16;
            case 0x17:
              goto switchD_008c3848_caseD_17;
            case 0x18:
              goto switchD_008c3848_caseD_18;
            case 0x19:
              goto switchD_008c3848_caseD_19;
            case 0x1a:
              goto switchD_008c3848_caseD_1a;
            case 0x1b:
              goto switchD_008c3848_caseD_1b;
            case 0x1c:
              goto switchD_008c3848_caseD_1c;
            case 0x1d:
              goto switchD_008c3848_caseD_1d;
            case 0x1e:
              goto switchD_008c3848_caseD_1e;
            case 0x1f:
switchD_008c3848_caseD_1f:
              uVar16 = *(uint *)pppppdVar53;
              puVar36 = (uint *)((long)pppppdVar53 + 4);
              pppppppdVar31 = pppppppdVar52 + (ulong)*puVar36 * 2;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
                if (*(uint *)((long)pppppppdVar31 + 0xc) == 3) {
                  lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
                  if ((double)*pppppppdVar46 <= (double)*pppppppdVar31) {
                    lVar50 = 1;
                  }
                  pppppdVar53 = (double *****)(puVar36 + lVar50);
                  goto LAB_008c6924;
                }
              }
              else if ((*(uint *)((long)pppppppdVar46 + 0xc) == 5) &&
                      (*(uint *)((long)pppppppdVar31 + 0xc) == 5)) {
                iVar11 = FUN_008cba50(*pppppppdVar46,*pppppppdVar31);
                bVar10 = SBORROW4(iVar11,1);
                iVar11 = iVar11 + -1;
LAB_008c5888:
                iVar14 = (int)uVar16 >> 0x10;
                if (iVar11 < 0 != bVar10) {
                  iVar14 = 1;
                }
                pppppdVar53 = (double *****)(puVar36 + iVar14);
                goto LAB_008c6924;
              }
              *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
              iVar14 = FUN_008cbbf8(param_1);
              goto LAB_008c5894;
            case 0x20:
switchD_008c3848_caseD_20:
              uVar16 = *(uint *)pppppdVar53;
              puVar36 = (uint *)((long)pppppdVar53 + 4);
              pppppppdVar31 = pppppppdVar52 + (ulong)*puVar36 * 2;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
                if (*(uint *)((long)pppppppdVar31 + 0xc) == 3) {
                  lVar50 = (long)((ulong)uVar16 << 0x20) >> 0x30;
                  if ((double)*pppppppdVar46 < (double)*pppppppdVar31) {
                    lVar50 = 1;
                  }
                  pppppdVar53 = (double *****)(puVar36 + lVar50);
                  goto LAB_008c6924;
                }
              }
              else if ((*(uint *)((long)pppppppdVar46 + 0xc) == 5) &&
                      (*(uint *)((long)pppppppdVar31 + 0xc) == 5)) {
                iVar11 = FUN_008cba50(*pppppppdVar46,*pppppppdVar31);
                bVar10 = false;
                goto LAB_008c5888;
              }
              *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
              iVar14 = FUN_008cbab8(param_1);
LAB_008c5894:
              iVar11 = (int)uVar16 >> 0x10;
              bVar10 = iVar14 == 0;
LAB_008c589c:
              if (!bVar10) {
                iVar11 = 1;
              }
              pppppdVar38 = (double *****)(puVar36 + iVar11);
              goto LAB_008c6620;
            case 0x21:
switchD_008c3848_caseD_21:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar13 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
              pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
              uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
              if (uVar16 == 3) {
                if (*(int *)((long)pdVar20 + 0xc) != 3) goto LAB_008c5a88;
                ppppppdVar49 = (double ******)((double)*pppppppdVar46 + *pdVar20);
                break;
              }
              pppppdVar53 = pppppdVar38;
              if (uVar16 == 4) goto code_r0x008c5a10;
              if (uVar16 == 8) {
                plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,8);
                unaff_x22 = pppppppdVar46;
                if (((plVar27 == (long *)0x0) || (*(int *)((long)plVar27 + 0xc) != 7)) ||
                   (*(char *)(*plVar27 + 6) == '\0')) goto LAB_008c5a88;
LAB_008c5ab4:
                uVar30 = (ulong)uVar13;
                plVar29 = *(long **)(param_1 + 0x68);
                lVar50 = *plVar27;
                plVar29[1] = plVar27[1];
                *plVar29 = lVar50;
                ppppppdVar49 = *pppppppdVar46;
                plVar29[3] = (long)pppppppdVar46[1];
                plVar29[2] = (long)ppppppdVar49;
                dVar63 = pdVar20[1];
                uVar55 = SUB84(*pdVar20,0);
                uVar58 = (undefined4)((ulong)*pdVar20 >> 0x20);
LAB_008c5acc:
                plVar29[5] = (long)dVar63;
                plVar29[4] = CONCAT44(uVar58,uVar55);
                uVar30 = uVar30 >> 8;
                lVar50 = *(long *)(param_1 + 0x50);
                uVar23 = 2;
                *(long **)(param_1 + 0x68) = plVar29 + 6;
                unaff_x22 = pppppppdVar46;
LAB_008c5ae8:
                *(double ******)(lVar50 + 0x20) = pppppdVar53;
                FUN_008cd928(param_1,uVar23,uVar30 & 0xff);
                pppppdVar38 = pppppdVar53;
                goto LAB_008c6620;
              }
              goto LAB_008c5a88;
            case 0x22:
              goto switchD_008c3848_caseD_22;
            case 0x23:
              goto switchD_008c3848_caseD_23;
            case 0x24:
              goto switchD_008c3848_caseD_24;
            case 0x25:
switchD_008c3848_caseD_25:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
              if ((*(uint *)((long)pppppppdVar46 + 0xc) != 3) ||
                 (*(int *)((long)pdVar20 + 0xc) != 3)) {
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
LAB_008c6090:
                FUN_008cd058(param_1,pppppppdVar31,pppppppdVar46,pdVar20);
                goto LAB_008c6620;
              }
              ppppppdVar49 = (double ******)
                             ((double)*pppppppdVar46 -
                             *pdVar20 * (double)(long)((double)*pppppppdVar46 / *pdVar20));
              break;
            case 0x26:
switchD_008c3848_caseD_26:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
              if ((*(uint *)((long)pppppppdVar46 + 0xc) == 3) &&
                 (*(int *)((long)pdVar20 + 0xc) == 3)) {
                ppppppdVar49 = (double ******)pow((double)*pppppppdVar46,*pdVar20);
                *pppppppdVar31 = ppppppdVar49;
                *(uint *)((long)pppppppdVar31 + 0xc) = 3;
                pppppdVar53 = pppppdVar38;
                goto LAB_008c6924;
              }
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
LAB_008c60fc:
              FUN_008cd244(param_1,pppppppdVar31,pppppppdVar46,pdVar20);
              goto LAB_008c6620;
            case 0x27:
switchD_008c3848_caseD_27:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
              if (*(uint *)((long)pppppppdVar46 + 0xc) != 3) {
                pdVar20 = (double *)((long)pppppdVar54 + uVar30);
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
LAB_008c5aa8:
                FUN_008cc36c(param_1,pppppppdVar31,pppppppdVar46,pdVar20);
                goto LAB_008c6620;
              }
              ppppppdVar49 = (double ******)
                             ((double)*pppppppdVar46 + *(double *)((long)pppppdVar54 + uVar30));
              break;
            case 0x28:
switchD_008c3848_caseD_28:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
              if (*(uint *)((long)pppppppdVar46 + 0xc) == 3) {
                uVar55 = SUB84(*pppppppdVar46,0);
                uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
                dVar63 = *(double *)((long)pppppdVar54 + uVar30);
LAB_008c6194:
                ppppppdVar49 = (double ******)((double)CONCAT44(uVar58,uVar55) - dVar63);
                break;
              }
              pdVar20 = (double *)((long)pppppdVar54 + uVar30);
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              goto LAB_008c5bc4;
            case 0x29:
              goto switchD_008c3848_caseD_29;
            case 0x2a:
              goto switchD_008c3848_caseD_2a;
            case 0x2b:
switchD_008c3848_caseD_2b:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
              if (*(uint *)((long)pppppppdVar46 + 0xc) != 3) {
                pdVar20 = (double *)((long)pppppdVar54 + uVar30);
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                goto LAB_008c6090;
              }
              dVar63 = *(double *)((long)pppppdVar54 + uVar30);
              ppppppdVar49 = (double ******)
                             ((double)*pppppppdVar46 -
                             dVar63 * (double)(long)((double)*pppppppdVar46 / dVar63));
              break;
            case 0x2c:
switchD_008c3848_caseD_2c:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              uVar30 = (ulong)(uVar16 >> 0x14) & 0xff0;
              if (*(uint *)((long)pppppppdVar46 + 0xc) != 3) {
                pdVar20 = (double *)((long)pppppdVar54 + uVar30);
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                goto LAB_008c60fc;
              }
              dVar63 = *(double *)((long)pppppdVar54 + uVar30);
              ppppppdVar49 = *pppppppdVar46;
              if (dVar63 == 2.0) {
                ppppppdVar49 = (double ******)((double)ppppppdVar49 * (double)ppppppdVar49);
              }
              else if (dVar63 == 0.5) {
                ppppppdVar49 = (double ******)SQRT((double)ppppppdVar49);
              }
              else if (dVar63 == 3.0) {
                ppppppdVar49 = (double ******)
                               ((double)ppppppdVar49 * (double)ppppppdVar49 * (double)ppppppdVar49);
              }
              else {
                ppppppdVar49 = (double ******)pow((double)ppppppdVar49,dVar63);
              }
              break;
            case 0x2d:
              goto switchD_008c3848_caseD_2d;
            case 0x2e:
              goto switchD_008c3848_caseD_2e;
            case 0x2f:
              goto switchD_008c3848_caseD_2f;
            case 0x30:
              goto switchD_008c3848_caseD_30;
            case 0x31:
switchD_008c3848_caseD_31:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              uVar30 = (ulong)(uVar16 >> 0x10) & 0xff;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              FUN_008cc074(param_1,((uVar16 >> 0x18) - (int)uVar30) + 1);
              puVar22 = (undefined8 *)(*(long *)(param_1 + 0x70) + uVar30 * 0x10);
              uVar23 = *puVar22;
              puVar37 = (undefined8 *)
                        (*(long *)(param_1 + 0x70) + ((ulong)(uVar16 >> 8) & 0xff) * 0x10);
              puVar37[1] = puVar22[1];
              *puVar37 = uVar23;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              goto LAB_008c6604;
            case 0x32:
              goto switchD_008c3848_caseD_32;
            case 0x33:
              goto switchD_008c3848_caseD_33;
            case 0x34:
switchD_008c3848_caseD_34:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar53 >> 0x10) * 2;
              unaff_x22 = pppppppdVar52 + (ulong)(byte)(*(uint *)pppppdVar53 >> 8) * 2;
              if (*(uint *)((long)pppppppdVar46 + 0xc) == 6) {
                if (((*pppppppdVar46)[2] != (double *****)0x0) &&
                   ((*(byte *)((long)(*pppppppdVar46)[2] + 6) >> 6 & 1) == 0)) goto LAB_008c67a0;
                iVar11 = FUN_008bcf64();
                ppppppdVar49 = (double ******)(double)iVar11;
              }
              else {
                if (*(uint *)((long)pppppppdVar46 + 0xc) != 5) {
LAB_008c67a0:
                  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                  FUN_008cd618(param_1,unaff_x22);
                  goto LAB_008c6620;
                }
                ppppppdVar49 = (double ******)
                               NEON_ucvtf((ulong)*(uint *)((long)*pppppppdVar46 + 0x14));
              }
LAB_008c6760:
              *unaff_x22 = ppppppdVar49;
              *(uint *)((long)unaff_x22 + 0xc) = 3;
              pppppdVar53 = pppppdVar38;
              goto LAB_008c6924;
            case 0x35:
switchD_008c3848_caseD_35:
              pppppdVar38 = pppppdVar53 + 1;
              uVar16 = *(uint *)pppppdVar53;
              uVar13 = *(uint *)((long)pppppdVar53 + 4);
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              iVar11 = 0;
              if ((uVar16 >> 0x10 & 0xff) != 0) {
                iVar11 = 1 << (ulong)((uVar16 >> 0x10 & 0xff) - 1 & 0x1f);
              }
              ppppppdVar49 = (double ******)FUN_008bae54(param_1,uVar13,iVar11);
              goto LAB_008c6848;
            case 0x36:
switchD_008c3848_caseD_36:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar13 = *(uint *)pppppdVar53;
              uVar16 = (int)uVar13 >> 0x10;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
              ppppppdVar49 = (double ******)
                             FUN_008bd16c(param_1,*(undefined8 *)
                                                   ((long)pppppdVar54 +
                                                   (-(ulong)(uVar16 >> 0x1f) & 0xfffffff000000000 |
                                                   (ulong)uVar16 << 4)));
LAB_008c6848:
              *pppppppdVar52 = ppppppdVar49;
              lVar50 = *(long *)(param_1 + 0x50);
              *(uint *)((long)pppppppdVar52 + 0xc) = 6;
              *(double ******)(lVar50 + 0x20) = pppppdVar38;
LAB_008c6604:
              if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <=
                  *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
                FUN_008b52c4(param_1,1);
              }
              goto LAB_008c6620;
            case 0x37:
              goto switchD_008c3848_caseD_37;
            case 0x38:
              goto switchD_008c3848_caseD_38;
            case 0x39:
              goto switchD_008c3848_caseD_39;
            case 0x3a:
              goto switchD_008c3848_caseD_3a;
            case 0x3b:
              goto switchD_008c3848_caseD_3b;
            case 0x3c:
              goto switchD_008c3848_caseD_3c;
            case 0x3d:
              goto switchD_008c3848_caseD_3d;
            case 0x3e:
              goto switchD_008c3848_caseD_3e;
            case 0x3f:
              goto switchD_008c3848_caseD_3f;
            case 0x40:
              goto switchD_008c3848_caseD_40;
            case 0x41:
              goto switchD_008c3848_caseD_41;
            case 0x42:
              goto switchD_008c3848_caseD_42;
            case 0x43:
              goto switchD_008c3848_caseD_43;
            case 0x44:
              goto switchD_008c3848_caseD_44;
            case 0x45:
              goto switchD_008c3848_caseD_45;
            case 0x46:
              goto switchD_008c3848_caseD_46;
            case 0x47:
switchD_008c3848_caseD_47:
              pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
              uVar16 = *(uint *)pppppdVar53;
              pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
              pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
              pppppppdVar46 = (double *******)(pppppdVar54 + (ulong)(byte)(uVar16 >> 0x10) * 2);
              if (*(int *)((long)pdVar20 + 0xc) == 3) {
                uVar55 = SUB84(*pppppppdVar46,0);
                uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
                dVar63 = *pdVar20;
                goto LAB_008c6194;
              }
LAB_008c5bbc:
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
LAB_008c5bc4:
              FUN_008cc574(param_1,pppppppdVar31,pppppppdVar46,pdVar20);
              goto LAB_008c6620;
            case 0x48:
              goto switchD_008c3848_caseD_48;
            case 0x49:
              goto switchD_008c3848_caseD_49;
            case 0x4a:
              goto switchD_008c3848_caseD_4a;
            case 0x4b:
              goto switchD_008c3848_caseD_4b;
            case 0x4c:
              goto switchD_008c3848_caseD_4c;
            case 0x4d:
              goto switchD_008c3848_caseD_4d;
            case 0x4e:
              goto switchD_008c3848_caseD_4e;
            case 0x4f:
              goto switchD_008c3848_caseD_4f;
            case 0x50:
              goto switchD_008c3848_caseD_50;
            case 0x51:
              goto switchD_008c3848_caseD_51;
            case 0x52:
              goto switchD_008c3848_caseD_52;
            case 0x53:
              goto switchD_008c3848_caseD_53;
            case 0x54:
              goto switchD_008c3848_caseD_54;
            case 0x55:
              goto switchD_008c3848_caseD_55;
            case 0x56:
              goto switchD_008c3848_caseD_56;
            case 0x57:
              goto switchD_008c3848_caseD_57;
            case 0x58:
              goto switchD_008c3848_caseD_58;
            case 0x59:
              goto switchD_008c3848_caseD_59;
            case 0x5a:
              goto switchD_008c3848_caseD_5a;
            case 0x5b:
              goto switchD_008c3848_caseD_5b;
            case 0x5c:
              goto switchD_008c3848_caseD_5c;
            case 0x5d:
              goto switchD_008c3848_caseD_5d;
            case 0x5e:
              goto switchD_008c3848_caseD_5e;
            }
LAB_008c619c:
            *pppppppdVar31 = ppppppdVar49;
            *(uint *)((long)pppppppdVar31 + 0xc) = 3;
            pppppdVar53 = pppppdVar38;
            goto LAB_008c6924;
          }
          puVar22 = *(undefined8 **)(param_1 + 0x68);
          pppdVar7 = *ppppdVar21;
          puVar22[1] = ppppdVar21[1];
          *puVar22 = pppdVar7;
          ppppppdVar49 = *pppppppdVar46;
          unaff_x22 = (double *******)((ulong)((long)puVar22 - (long)pppppppdVar52) >> 4);
          puVar22[3] = pppppppdVar46[1];
          puVar22[2] = ppppppdVar49;
          ppppppdVar49 = *pppppppdVar31;
          puVar22[5] = pppppppdVar31[1];
          puVar22[4] = ppppppdVar49;
          *(undefined8 **)(param_1 + 0x68) = puVar22 + 6;
          *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
          FUN_008cd928(param_1,2,(ulong)unaff_x22 & 0xffffffff);
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
          uVar16 = *(uint *)((long)(pppppppdVar52 + (long)(int)unaff_x22 * 2) + 0xc);
          if ((uVar16 != 0) &&
             ((uVar16 != 1 || (*(uint *)(pppppppdVar52 + (long)(int)unaff_x22 * 2) != 0))))
          goto LAB_008c5614;
          goto LAB_008c575c;
        }
      }
      else if (uVar13 - 9 < 2) {
LAB_008c55d8:
        ppppppdVar49 = *pppppppdVar46;
        ppppppdVar60 = *pppppppdVar31;
      }
      else {
        if (uVar13 != 0xb) goto LAB_008c5674;
LAB_008c553c:
        ppppppdVar49 = *pppppppdVar46;
        ppppppdVar60 = *pppppppdVar31;
      }
LAB_008c55e0:
      lVar50 = (long)(uVar30 << 0x20) >> 0x30;
      if (ppppppdVar49 == ppppppdVar60) {
        lVar50 = 1;
      }
      pppppdVar53 = (double *****)(puVar36 + lVar50);
    }
  }
  else {
    pppppdVar53 = (double *****)(puVar36 + iVar11);
  }
  goto LAB_008c6924;
code_r0x008c5a10:
  if (*(int *)((long)pdVar20 + 0xc) == 4) {
    ppppppdVar49 = *pppppppdVar46;
    dVar63 = *pdVar20;
    fVar59 = *(float *)(pppppppdVar46 + 1);
    fVar64 = *(float *)(pdVar20 + 1);
    *(uint *)((long)pppppppdVar31 + 0xc) = 4;
    fVar56 = SUB84(ppppppdVar49,0) + SUB84(dVar63,0);
    fVar57 = (float)((ulong)ppppppdVar49 >> 0x20) + (float)((ulong)dVar63 >> 0x20);
    fVar59 = fVar59 + fVar64;
    do {
      uVar26 = *(undefined1 *)pppppdVar53;
      *pppppppdVar31 = (double ******)CONCAT44(fVar57,fVar56);
      *(float *)(pppppppdVar31 + 1) = fVar59;
      pppppppdVar46 = pppppppdVar51;
      pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
      switch(uVar26) {
      case 0:
        goto switchD_008c3848_caseD_0;
      case 1:
        goto switchD_008c3848_caseD_1;
      case 2:
        goto switchD_008c3848_caseD_2;
      case 3:
        goto switchD_008c3848_caseD_3;
      case 4:
        goto switchD_008c3848_caseD_4;
      case 5:
        goto switchD_008c3848_caseD_5;
      case 6:
        goto switchD_008c3848_caseD_6;
      case 7:
        goto switchD_008c3848_caseD_7;
      case 8:
        goto switchD_008c3848_caseD_8;
      case 9:
        goto switchD_008c3848_caseD_9;
      case 10:
        goto switchD_008c3848_caseD_a;
      case 0xb:
        goto switchD_008c3848_caseD_b;
      case 0xc:
        goto switchD_008c3848_caseD_c;
      case 0xd:
        goto switchD_008c3848_caseD_d;
      case 0xe:
        goto switchD_008c3848_caseD_e;
      case 0xf:
        goto switchD_008c3848_caseD_f;
      case 0x10:
        goto switchD_008c3848_caseD_10;
      case 0x11:
        goto switchD_008c3848_caseD_11;
      case 0x12:
        goto switchD_008c3848_caseD_12;
      case 0x13:
        goto switchD_008c3848_caseD_13;
      case 0x14:
        goto switchD_008c3848_caseD_14;
      case 0x15:
        goto switchD_008c3848_caseD_15;
      case 0x16:
        goto switchD_008c3848_caseD_16;
      case 0x17:
        goto switchD_008c3848_caseD_17;
      case 0x18:
        goto switchD_008c3848_caseD_18;
      case 0x19:
        goto switchD_008c3848_caseD_19;
      case 0x1a:
        goto switchD_008c3848_caseD_1a;
      case 0x1b:
        goto switchD_008c3848_caseD_1b;
      case 0x1c:
        goto switchD_008c3848_caseD_1c;
      case 0x1d:
        goto switchD_008c3848_caseD_1d;
      case 0x1e:
        goto switchD_008c3848_caseD_1e;
      case 0x1f:
        goto switchD_008c3848_caseD_1f;
      case 0x20:
        goto switchD_008c3848_caseD_20;
      case 0x21:
        goto switchD_008c3848_caseD_21;
      case 0x22:
switchD_008c3848_caseD_22:
        pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
        uVar13 = *(uint *)pppppdVar53;
        pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
        pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
        pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
        uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
        if (uVar16 == 3) {
          if (*(int *)((long)pdVar20 + 0xc) != 3) goto LAB_008c5bbc;
          ppppppdVar49 = (double ******)((double)*pppppppdVar46 - *pdVar20);
          goto LAB_008c619c;
        }
        pppppdVar53 = pppppdVar38;
        if (uVar16 != 4) {
          if (uVar16 != 8) goto LAB_008c5bbc;
          plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,9);
          unaff_x22 = pppppppdVar46;
          if (((plVar27 == (long *)0x0) || (*(int *)((long)plVar27 + 0xc) != 7)) ||
             (*(char *)(*plVar27 + 6) == '\0')) goto LAB_008c5bbc;
          goto LAB_008c5ab4;
        }
        if (*(int *)((long)pdVar20 + 0xc) != 4) goto LAB_008c5bbc;
        ppppppdVar49 = *pppppppdVar46;
        dVar63 = *pdVar20;
        fVar59 = *(float *)(pppppppdVar46 + 1);
        fVar64 = *(float *)(pdVar20 + 1);
        *(uint *)((long)pppppppdVar31 + 0xc) = 4;
        fVar56 = SUB84(ppppppdVar49,0) - SUB84(dVar63,0);
        fVar57 = (float)((ulong)ppppppdVar49 >> 0x20) - (float)((ulong)dVar63 >> 0x20);
        fVar59 = fVar59 - fVar64;
        break;
      case 0x23:
switchD_008c3848_caseD_23:
        pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
        uVar13 = *(uint *)pppppdVar53;
        pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
        unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
        pppppppdVar31 = (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
        uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
        if (uVar16 == 3) {
          uVar16 = *(uint *)((long)pppppppdVar31 + 0xc);
          if (uVar16 == 3) {
            ppppppdVar49 = (double ******)((double)*pppppppdVar46 * (double)*pppppppdVar31);
            goto LAB_008c5cf4;
          }
          pppppppdVar35 = pppppppdVar31;
          if (uVar16 == 4) {
            uVar55 = SUB84(*pppppppdVar46,0);
            uVar58 = (undefined4)((ulong)*pppppppdVar46 >> 0x20);
            ppppppdVar49 = *pppppppdVar31;
            fVar56 = *(float *)(pppppppdVar31 + 1);
LAB_008c5c68:
            fVar57 = (float)(double)CONCAT44(uVar58,uVar55);
            ppppppdVar49 = (double ******)
                           CONCAT44((float)((ulong)ppppppdVar49 >> 0x20) * fVar57,
                                    SUB84(ppppppdVar49,0) * fVar57);
            *(uint *)((long)unaff_x22 + 0xc) = 4;
            fVar56 = fVar56 * fVar57;
            pppppdVar53 = pppppdVar38;
            goto LAB_008c5e14;
          }
        }
        else {
          pppppppdVar35 = pppppppdVar46;
          if (uVar16 == 4) {
            if (*(uint *)((long)pppppppdVar31 + 0xc) == 4) {
              ppppppdVar49 = *pppppppdVar46;
              ppppppdVar60 = *pppppppdVar31;
              fVar59 = *(float *)(pppppppdVar46 + 1);
              fVar64 = *(float *)(pppppppdVar31 + 1);
              *(uint *)((long)unaff_x22 + 0xc) = 4;
              fVar56 = SUB84(ppppppdVar49,0) * SUB84(ppppppdVar60,0);
              fVar57 = (float)((ulong)ppppppdVar49 >> 0x20) * (float)((ulong)ppppppdVar60 >> 0x20);
              fVar59 = fVar59 * fVar64;
              UNRECOVERED_JUMPTABLE =
                   (code *)(&switchD_008c3848::switchdataD_00c4da78)[*(byte *)pppppdVar38];
LAB_008c5d00:
              *unaff_x22 = (double ******)CONCAT44(fVar57,fVar56);
              *(float *)(unaff_x22 + 1) = fVar59;
                    /* WARNING: Could not recover jumptable at 0x008c5d0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*UNRECOVERED_JUMPTABLE)();
              return;
            }
            if (*(uint *)((long)pppppppdVar31 + 0xc) == 3) {
              uVar55 = SUB84(*pppppppdVar31,0);
              uVar58 = (undefined4)((ulong)*pppppppdVar31 >> 0x20);
              ppppppdVar49 = *pppppppdVar46;
              fVar56 = *(float *)(pppppppdVar46 + 1);
              goto LAB_008c5c68;
            }
            goto LAB_008c5cac;
          }
        }
        if ((((uVar16 == 8) &&
             (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,10), plVar27 != (long *)0x0)) &&
            (*(int *)((long)plVar27 + 0xc) == 7)) && (*(char *)(*plVar27 + 6) != '\0'))
        goto LAB_008c5d10;
LAB_008c5cac:
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
        FUN_008cc77c(param_1,unaff_x22,pppppppdVar46,pppppppdVar31);
LAB_008c5d4c:
        uVar26 = *(undefined1 *)pppppdVar38;
        pppppppdVar52 = *(double ********)(param_1 + 0x70);
        do {
          pppppppdVar46 = pppppppdVar51;
          pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
          switch(uVar26) {
          case 0:
            goto switchD_008c3848_caseD_0;
          case 1:
            goto switchD_008c3848_caseD_1;
          case 2:
            goto switchD_008c3848_caseD_2;
          case 3:
            goto switchD_008c3848_caseD_3;
          case 4:
            goto switchD_008c3848_caseD_4;
          case 5:
            goto switchD_008c3848_caseD_5;
          case 6:
            goto switchD_008c3848_caseD_6;
          case 7:
            goto switchD_008c3848_caseD_7;
          case 8:
            goto switchD_008c3848_caseD_8;
          case 9:
            goto switchD_008c3848_caseD_9;
          case 10:
            goto switchD_008c3848_caseD_a;
          case 0xb:
            goto switchD_008c3848_caseD_b;
          case 0xc:
            goto switchD_008c3848_caseD_c;
          case 0xd:
            goto switchD_008c3848_caseD_d;
          case 0xe:
            goto switchD_008c3848_caseD_e;
          case 0xf:
            goto switchD_008c3848_caseD_f;
          case 0x10:
            goto switchD_008c3848_caseD_10;
          case 0x11:
            goto switchD_008c3848_caseD_11;
          case 0x12:
            goto switchD_008c3848_caseD_12;
          case 0x13:
            goto switchD_008c3848_caseD_13;
          case 0x14:
            goto switchD_008c3848_caseD_14;
          case 0x15:
            goto switchD_008c3848_caseD_15;
          case 0x16:
            goto switchD_008c3848_caseD_16;
          case 0x17:
            goto switchD_008c3848_caseD_17;
          case 0x18:
            goto switchD_008c3848_caseD_18;
          case 0x19:
            goto switchD_008c3848_caseD_19;
          case 0x1a:
            goto switchD_008c3848_caseD_1a;
          case 0x1b:
            goto switchD_008c3848_caseD_1b;
          case 0x1c:
            goto switchD_008c3848_caseD_1c;
          case 0x1d:
            goto switchD_008c3848_caseD_1d;
          case 0x1e:
            goto switchD_008c3848_caseD_1e;
          case 0x1f:
            goto switchD_008c3848_caseD_1f;
          case 0x20:
            goto switchD_008c3848_caseD_20;
          case 0x21:
            goto switchD_008c3848_caseD_21;
          case 0x22:
            goto switchD_008c3848_caseD_22;
          case 0x23:
            goto switchD_008c3848_caseD_23;
          case 0x24:
switchD_008c3848_caseD_24:
            pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
            uVar13 = *(uint *)pppppdVar53;
            pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
            unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
            pppppppdVar31 =
                 (double *******)((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
            uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
            if (uVar16 == 3) {
              uVar16 = *(uint *)((long)pppppppdVar31 + 0xc);
              if (uVar16 != 3) {
                pppppppdVar35 = pppppppdVar31;
                if (uVar16 != 4) goto LAB_008c5e2c;
                fVar56 = (float)(double)*pppppppdVar46;
                ppppppdVar49 = (double ******)
                               CONCAT44(fVar56 / (float)((ulong)*pppppppdVar31 >> 0x20),
                                        fVar56 / SUB84(*pppppppdVar31,0));
                fVar56 = fVar56 / *(float *)(pppppppdVar31 + 1);
LAB_008c5e10:
                *(uint *)((long)unaff_x22 + 0xc) = 4;
                pppppdVar53 = pppppdVar38;
                goto LAB_008c5e14;
              }
              ppppppdVar49 = (double ******)((double)*pppppppdVar46 / (double)*pppppppdVar31);
LAB_008c5cf4:
              *unaff_x22 = ppppppdVar49;
              *(uint *)((long)unaff_x22 + 0xc) = 3;
              goto LAB_008c6d54;
            }
            pppppppdVar35 = pppppppdVar46;
            if (uVar16 == 4) {
              if (*(uint *)((long)pppppppdVar31 + 0xc) == 4) {
                ppppppdVar49 = *pppppppdVar46;
                ppppppdVar60 = *pppppppdVar31;
                *(uint *)((long)unaff_x22 + 0xc) = 4;
                fVar56 = SUB84(ppppppdVar49,0) / SUB84(ppppppdVar60,0);
                fVar57 = (float)((ulong)ppppppdVar49 >> 0x20) / (float)((ulong)ppppppdVar60 >> 0x20)
                ;
                UNRECOVERED_JUMPTABLE =
                     (code *)(&switchD_008c3848::switchdataD_00c4da78)[*(byte *)pppppdVar38];
                fVar59 = *(float *)(pppppppdVar46 + 1) / *(float *)(pppppppdVar31 + 1);
                goto LAB_008c5d00;
              }
              if (*(uint *)((long)pppppppdVar31 + 0xc) == 3) {
                fVar56 = (float)(double)*pppppppdVar31;
                ppppppdVar49 = (double ******)
                               CONCAT44((float)((ulong)*pppppppdVar46 >> 0x20) / fVar56,
                                        SUB84(*pppppppdVar46,0) / fVar56);
                fVar56 = *(float *)(pppppppdVar46 + 1) / fVar56;
                goto LAB_008c5e10;
              }
            }
            else {
LAB_008c5e2c:
              if ((((uVar16 == 8) &&
                   (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,0xb),
                   plVar27 != (long *)0x0)) && (*(int *)((long)plVar27 + 0xc) == 7)) &&
                 (*(char *)(*plVar27 + 6) != '\0')) goto LAB_008c5d10;
            }
            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
            FUN_008cca4c(param_1,unaff_x22,pppppppdVar46,pppppppdVar31);
            goto LAB_008c5d4c;
          case 0x25:
            goto switchD_008c3848_caseD_25;
          case 0x26:
            goto switchD_008c3848_caseD_26;
          case 0x27:
            goto switchD_008c3848_caseD_27;
          case 0x28:
            goto switchD_008c3848_caseD_28;
          case 0x29:
            goto switchD_008c3848_caseD_29;
          case 0x2a:
            goto switchD_008c3848_caseD_2a;
          case 0x2b:
            goto switchD_008c3848_caseD_2b;
          case 0x2c:
            goto switchD_008c3848_caseD_2c;
          case 0x2d:
            goto switchD_008c3848_caseD_2d;
          case 0x2e:
            goto switchD_008c3848_caseD_2e;
          case 0x2f:
            goto switchD_008c3848_caseD_2f;
          case 0x30:
            goto switchD_008c3848_caseD_30;
          case 0x31:
            goto switchD_008c3848_caseD_31;
          case 0x32:
            goto switchD_008c3848_caseD_32;
          case 0x33:
            goto switchD_008c3848_caseD_33;
          case 0x34:
            goto switchD_008c3848_caseD_34;
          case 0x35:
            goto switchD_008c3848_caseD_35;
          case 0x36:
            goto switchD_008c3848_caseD_36;
          case 0x37:
            goto switchD_008c3848_caseD_37;
          case 0x38:
            goto switchD_008c3848_caseD_38;
          case 0x39:
            goto switchD_008c3848_caseD_39;
          case 0x3a:
            goto switchD_008c3848_caseD_3a;
          case 0x3b:
            goto switchD_008c3848_caseD_3b;
          case 0x3c:
            goto switchD_008c3848_caseD_3c;
          case 0x3d:
            goto switchD_008c3848_caseD_3d;
          case 0x3e:
            goto switchD_008c3848_caseD_3e;
          case 0x3f:
            goto switchD_008c3848_caseD_3f;
          case 0x40:
            goto switchD_008c3848_caseD_40;
          case 0x41:
            goto switchD_008c3848_caseD_41;
          case 0x42:
            goto switchD_008c3848_caseD_42;
          case 0x43:
            goto switchD_008c3848_caseD_43;
          case 0x44:
            goto switchD_008c3848_caseD_44;
          case 0x45:
            goto switchD_008c3848_caseD_45;
          case 0x46:
            goto switchD_008c3848_caseD_46;
          case 0x47:
            goto switchD_008c3848_caseD_47;
          case 0x48:
            goto switchD_008c3848_caseD_48;
          case 0x49:
            goto switchD_008c3848_caseD_49;
          case 0x4a:
            goto switchD_008c3848_caseD_4a;
          case 0x4b:
            goto switchD_008c3848_caseD_4b;
          case 0x4c:
switchD_008c3848_caseD_4c:
            pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
            uVar13 = *(uint *)pppppdVar53;
            unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
            uVar16 = *(uint *)((long)unaff_x22 + 0xc);
            if (DAT_00d1fdd0 == 1) {
              if (uVar16 == 6) {
                lVar50 = 0x10;
LAB_008c6bfc:
                lVar50 = *(long *)((long)*unaff_x22 + lVar50);
                if (lVar50 == 0) goto LAB_008c6c7c;
                if ((*(byte *)(lVar50 + 6) >> 5 & 1) != 0) goto LAB_008c6c50;
                if ((*(byte *)(lVar50 + 7) >> 1 & 1) == 0) {
                  pdVar20 = (double *)
                            FUN_008bdfe0(lVar50,5,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x360)
                                        );
                  if (pdVar20 == (double *)0x0) {
                    uVar16 = *(uint *)((long)unaff_x22 + 0xc);
                    bVar10 = false;
                    goto LAB_008c6c44;
                  }
                  goto LAB_008c6d00;
                }
LAB_008c6cf8:
                pdVar20 = (double *)(*(long *)(lVar50 + 0x20) + -0x60);
              }
              else {
                if (uVar16 == 7) goto LAB_008c6d4c;
                if (uVar16 == 8) {
                  lVar50 = 8;
                  goto LAB_008c6bfc;
                }
                lVar50 = 0;
                bVar10 = true;
LAB_008c6c44:
                if (uVar16 != 0xc) {
                  if (!bVar10) {
LAB_008c6c50:
                    if ((*(byte *)(lVar50 + 6) >> 4 & 1) != 0) goto LAB_008c6c7c;
                    goto LAB_008c6c58;
                  }
                  goto LAB_008c6c7c;
                }
                pdVar20 = (double *)FUN_008be028(param_1,unaff_x22,5);
                if (*(int *)((long)pdVar20 + 0xc) == 0) goto LAB_008c8888;
              }
LAB_008c6d00:
              unaff_x22[3] = unaff_x22[1];
              unaff_x22[2] = *unaff_x22;
              ppppppdVar49 = (double ******)*pdVar20;
              unaff_x22[1] = (double ******)pdVar20[1];
              *unaff_x22 = ppppppdVar49;
              *(double ********)(param_1 + 0x68) = unaff_x22 + 4;
              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
              FUN_008b465c(param_1,unaff_x22,3);
              pppppppdVar52 = *(double ********)(param_1 + 0x70);
              uVar16 = *(uint *)((long)(pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2) + 0xc);
              *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x18);
              if (uVar16 == 0) {
                *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                  FUN_008b399c(param_1,pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2,
                               &DAT_002c8ca6);
                }
                goto LAB_008c8944;
              }
            }
            else if (uVar16 == 6) {
              lVar50 = 0x10;
LAB_008c6bb8:
              lVar50 = *(long *)((long)*unaff_x22 + lVar50);
              if (lVar50 != 0) {
                bVar5 = *(byte *)(lVar50 + 6);
                if ((bVar5 >> 5 & 1) == 0) {
                  if ((*(byte *)(lVar50 + 7) >> 1 & 1) != 0) goto LAB_008c6cf8;
                  pdVar20 = (double *)
                            FUN_008bdfe0(lVar50,5,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x360)
                                        );
                  if (pdVar20 != (double *)0x0) goto LAB_008c6d00;
                  bVar5 = *(byte *)(lVar50 + 6);
                }
                if ((bVar5 >> 4 & 1) == 0) {
LAB_008c6c58:
                  if (((*(byte *)(lVar50 + 7) >> 1 & 1) != 0) ||
                     (lVar50 = FUN_008bdfe0(lVar50,4,*(undefined8 *)
                                                      (*(long *)(param_1 + 0x60) + 0x358)),
                     lVar50 != 0)) goto LAB_008c6d4c;
                }
              }
              uVar16 = *(uint *)((long)unaff_x22 + 0xc);
LAB_008c6c7c:
              if (uVar16 != 6) goto LAB_008c8888;
              if ((DAT_00d1f4f8 == '\x01') &&
                 (iVar11 = *(int *)(*unaff_x22 + 1),
                 iVar14 = 1 << (ulong)(*(byte *)((long)*unaff_x22 + 5) & 0x1f),
                 uVar16 = iVar14 + iVar11, uVar16 != 0 && (int)uVar16 < 0 == SCARRY4(iVar14,iVar11))
                 ) {
                iVar11 = *(int *)(**(long **)(param_1 + 0x50) + 0x48);
                uVar12 = 0x3fffffff - iVar11;
                if (uVar12 <= uVar16) {
                  uVar16 = uVar12;
                }
                *(uint *)(**(long **)(param_1 + 0x50) + 0x48) = uVar16 + iVar11;
              }
              unaff_x22[4] = (double ******)0x0;
              *(uint *)((long)unaff_x22 + 0xc) = 0;
              unaff_x22[3] = unaff_x22[1];
              unaff_x22[2] = *unaff_x22;
              unaff_x22[5] = (double ******)0x200000080;
            }
            else if (uVar16 != 7) {
              if (uVar16 == 8) {
                lVar50 = 8;
                goto LAB_008c6bb8;
              }
              goto LAB_008c8888;
            }
LAB_008c6d4c:
            pppppdVar38 = (double *****)((long)pppppdVar38 + (long)((int)uVar13 >> 0x10) * 4);
LAB_008c6d54:
            uVar26 = *(undefined1 *)pppppdVar38;
            break;
          case 0x4d:
            goto switchD_008c3848_caseD_4d;
          case 0x4e:
            goto switchD_008c3848_caseD_4e;
          case 0x4f:
            goto switchD_008c3848_caseD_4f;
          case 0x50:
            goto switchD_008c3848_caseD_50;
          case 0x51:
            goto switchD_008c3848_caseD_51;
          case 0x52:
            goto switchD_008c3848_caseD_52;
          case 0x53:
            goto switchD_008c3848_caseD_53;
          case 0x54:
            goto switchD_008c3848_caseD_54;
          case 0x55:
            goto switchD_008c3848_caseD_55;
          case 0x56:
            goto switchD_008c3848_caseD_56;
          case 0x57:
            goto switchD_008c3848_caseD_57;
          case 0x58:
            goto switchD_008c3848_caseD_58;
          case 0x59:
            goto switchD_008c3848_caseD_59;
          case 0x5a:
            goto switchD_008c3848_caseD_5a;
          case 0x5b:
            goto switchD_008c3848_caseD_5b;
          case 0x5c:
            goto switchD_008c3848_caseD_5c;
          case 0x5d:
            goto switchD_008c3848_caseD_5d;
          case 0x5e:
            goto switchD_008c3848_caseD_5e;
          }
        } while( true );
      case 0x24:
        goto switchD_008c3848_caseD_24;
      case 0x25:
        goto switchD_008c3848_caseD_25;
      case 0x26:
        goto switchD_008c3848_caseD_26;
      case 0x27:
        goto switchD_008c3848_caseD_27;
      case 0x28:
        goto switchD_008c3848_caseD_28;
      case 0x29:
        goto switchD_008c3848_caseD_29;
      case 0x2a:
        goto switchD_008c3848_caseD_2a;
      case 0x2b:
        goto switchD_008c3848_caseD_2b;
      case 0x2c:
        goto switchD_008c3848_caseD_2c;
      case 0x2d:
        goto switchD_008c3848_caseD_2d;
      case 0x2e:
        goto switchD_008c3848_caseD_2e;
      case 0x2f:
        goto switchD_008c3848_caseD_2f;
      case 0x30:
        goto switchD_008c3848_caseD_30;
      case 0x31:
        goto switchD_008c3848_caseD_31;
      case 0x32:
        goto switchD_008c3848_caseD_32;
      case 0x33:
        goto switchD_008c3848_caseD_33;
      case 0x34:
        goto switchD_008c3848_caseD_34;
      case 0x35:
        goto switchD_008c3848_caseD_35;
      case 0x36:
        goto switchD_008c3848_caseD_36;
      case 0x37:
        goto switchD_008c3848_caseD_37;
      case 0x38:
        goto switchD_008c3848_caseD_38;
      case 0x39:
        goto switchD_008c3848_caseD_39;
      case 0x3a:
        goto switchD_008c3848_caseD_3a;
      case 0x3b:
        goto switchD_008c3848_caseD_3b;
      case 0x3c:
        goto switchD_008c3848_caseD_3c;
      case 0x3d:
        goto switchD_008c3848_caseD_3d;
      case 0x3e:
        goto switchD_008c3848_caseD_3e;
      case 0x3f:
        goto switchD_008c3848_caseD_3f;
      case 0x40:
        goto switchD_008c3848_caseD_40;
      case 0x41:
        goto switchD_008c3848_caseD_41;
      case 0x42:
        goto switchD_008c3848_caseD_42;
      case 0x43:
        goto switchD_008c3848_caseD_43;
      case 0x44:
        goto switchD_008c3848_caseD_44;
      case 0x45:
        goto switchD_008c3848_caseD_45;
      case 0x46:
        goto switchD_008c3848_caseD_46;
      case 0x47:
        goto switchD_008c3848_caseD_47;
      case 0x48:
        goto switchD_008c3848_caseD_48;
      case 0x49:
        goto switchD_008c3848_caseD_49;
      case 0x4a:
        goto switchD_008c3848_caseD_4a;
      case 0x4b:
        goto switchD_008c3848_caseD_4b;
      case 0x4c:
        goto switchD_008c3848_caseD_4c;
      case 0x4d:
        goto switchD_008c3848_caseD_4d;
      case 0x4e:
        goto switchD_008c3848_caseD_4e;
      case 0x4f:
        goto switchD_008c3848_caseD_4f;
      case 0x50:
        goto switchD_008c3848_caseD_50;
      case 0x51:
        goto switchD_008c3848_caseD_51;
      case 0x52:
        goto switchD_008c3848_caseD_52;
      case 0x53:
        goto switchD_008c3848_caseD_53;
      case 0x54:
        goto switchD_008c3848_caseD_54;
      case 0x55:
        goto switchD_008c3848_caseD_55;
      case 0x56:
        goto switchD_008c3848_caseD_56;
      case 0x57:
        goto switchD_008c3848_caseD_57;
      case 0x58:
        goto switchD_008c3848_caseD_58;
      case 0x59:
        goto switchD_008c3848_caseD_59;
      case 0x5a:
        goto switchD_008c3848_caseD_5a;
      case 0x5b:
        goto switchD_008c3848_caseD_5b;
      case 0x5c:
        goto switchD_008c3848_caseD_5c;
      case 0x5d:
        goto switchD_008c3848_caseD_5d;
      case 0x5e:
        goto switchD_008c3848_caseD_5e;
      }
    } while( true );
  }
LAB_008c5a88:
  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
  goto LAB_008c5aa8;
LAB_008c5e14:
  uVar26 = *(undefined1 *)pppppdVar53;
  *unaff_x22 = ppppppdVar49;
  *(float *)(unaff_x22 + 1) = fVar56;
  pppppppdVar46 = pppppppdVar51;
  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(uVar26) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0xf:
    goto switchD_008c3848_caseD_f;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x2a:
    goto switchD_008c3848_caseD_2a;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x33:
    goto switchD_008c3848_caseD_33;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3a:
    goto switchD_008c3848_caseD_3a;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3e:
    goto switchD_008c3848_caseD_3e;
  case 0x3f:
    goto switchD_008c3848_caseD_3f;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
    goto switchD_008c3848_caseD_42;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
    goto switchD_008c3848_caseD_46;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
    goto switchD_008c3848_caseD_52;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
    goto switchD_008c3848_caseD_5e;
  }
switchD_008c3848_caseD_29:
  pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
  uVar16 = *(uint *)pppppdVar53;
  uVar30 = (ulong)uVar16;
  pppppppdVar35 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
  unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  uVar44 = (ulong)(uVar16 >> 0x14) & 0xff0;
  uVar16 = *(uint *)((long)pppppppdVar35 + 0xc);
  if (uVar16 == 3) {
    ppppppdVar49 = (double ******)((double)*pppppppdVar35 * *(double *)((long)pppppdVar54 + uVar44))
    ;
    goto LAB_008c6760;
  }
  if (uVar16 != 4) {
    if (((uVar16 != 8) ||
        (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,10), plVar27 == (long *)0x0)) ||
       ((*(int *)((long)plVar27 + 0xc) != 7 ||
        (pppppppdVar46 = unaff_x22, *(char *)(*plVar27 + 6) == '\0')))) {
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
      FUN_008cc77c(param_1,unaff_x22,pppppppdVar35,(long)pppppdVar54 + uVar44);
      goto LAB_008c6620;
    }
LAB_008c6270:
    plVar29 = *(long **)(param_1 + 0x68);
    lVar50 = *plVar27;
    plVar29[1] = plVar27[1];
    *plVar29 = lVar50;
    ppppppdVar49 = *pppppppdVar35;
    plVar29[3] = (long)pppppppdVar35[1];
    plVar29[2] = (long)ppppppdVar49;
    dVar63 = (double)((undefined8 *)((long)pppppdVar54 + uVar44))[1];
    uVar23 = *(undefined8 *)((long)pppppdVar54 + uVar44);
    uVar55 = (undefined4)uVar23;
    uVar58 = (undefined4)((ulong)uVar23 >> 0x20);
    pppppdVar53 = pppppdVar38;
    goto LAB_008c5acc;
  }
  dVar63 = *(double *)((long)pppppdVar54 + uVar44);
  ppppppdVar49 = *pppppppdVar35;
  fVar57 = *(float *)(pppppppdVar35 + 1);
  *(uint *)((long)unaff_x22 + 0xc) = 4;
  fVar56 = (float)dVar63;
  auVar61._0_4_ = SUB84(ppppppdVar49,0) * fVar56;
  auVar61._4_4_ = (float)((ulong)ppppppdVar49 >> 0x20) * fVar56;
  auVar61._8_8_ = 0;
  fVar57 = fVar57 * fVar56;
LAB_008c625c:
  uVar26 = *(undefined1 *)pppppdVar38;
  *unaff_x22 = auVar61._0_8_;
  *(float *)(unaff_x22 + 1) = fVar57;
  pppppppdVar46 = pppppppdVar51;
  pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(uVar26) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0xf:
    goto switchD_008c3848_caseD_f;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x29:
    goto switchD_008c3848_caseD_29;
  case 0x2a:
switchD_008c3848_caseD_2a:
    pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
    uVar16 = *(uint *)pppppdVar53;
    uVar30 = (ulong)uVar16;
    pppppppdVar35 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
    pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
    uVar44 = (ulong)(uVar16 >> 0x14) & 0xff0;
    uVar16 = *(uint *)((long)pppppppdVar35 + 0xc);
    unaff_x22 = pppppppdVar31;
    if (uVar16 == 3) {
      ppppppdVar49 = (double ******)
                     ((double)*pppppppdVar35 / *(double *)((long)pppppdVar54 + uVar44));
      goto LAB_008c6760;
    }
    if (uVar16 != 4) {
      if ((((uVar16 == 8) &&
           (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,0xb), plVar27 != (long *)0x0)) &&
          (*(int *)((long)plVar27 + 0xc) == 7)) &&
         (pppppppdVar46 = pppppppdVar31, *(char *)(*plVar27 + 6) != '\0')) goto LAB_008c6270;
      lVar50 = *(long *)(param_1 + 0x50);
      pdVar20 = (double *)((long)pppppdVar54 + uVar44);
LAB_008c7850:
      *(double ******)(lVar50 + 0x20) = pppppdVar38;
      FUN_008cca4c(param_1,pppppppdVar31,pppppppdVar35,pdVar20);
      goto LAB_008c6620;
    }
    dVar63 = *(double *)((long)pppppdVar54 + uVar44);
    ppppppdVar49 = *pppppppdVar35;
    *(uint *)((long)pppppppdVar31 + 0xc) = 4;
    fVar57 = (float)dVar63;
    auVar61._0_4_ = SUB84(ppppppdVar49,0) / fVar57;
    auVar61._4_4_ = (float)((ulong)ppppppdVar49 >> 0x20) / fVar57;
    auVar61._8_8_ = 0;
    fVar57 = *(float *)(pppppppdVar35 + 1) / fVar57;
    goto LAB_008c625c;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3a:
    goto switchD_008c3848_caseD_3a;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3e:
    goto switchD_008c3848_caseD_3e;
  case 0x3f:
    goto switchD_008c3848_caseD_3f;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
    goto switchD_008c3848_caseD_42;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
    goto switchD_008c3848_caseD_46;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
switchD_008c3848_caseD_52:
    pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
    uVar16 = *(uint *)pppppdVar53;
    uVar30 = (ulong)uVar16;
    pppppppdVar35 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
    unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
    uVar44 = (ulong)(uVar16 >> 0x14) & 0xff0;
    uVar16 = *(uint *)((long)pppppppdVar35 + 0xc);
    if (uVar16 == 3) {
      ppppppdVar49 = (double ******)
                     (long)((double)*pppppppdVar35 / *(double *)((long)pppppdVar54 + uVar44));
      goto LAB_008c6760;
    }
    if (uVar16 != 4) {
      if (((uVar16 == 8) &&
          (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,0xc), plVar27 != (long *)0x0)) &&
         ((*(int *)((long)plVar27 + 0xc) == 7 &&
          (pppppppdVar46 = unaff_x22, *(char *)(*plVar27 + 6) != '\0')))) goto LAB_008c6270;
      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
      FUN_008ccd18(param_1,unaff_x22,pppppppdVar35,(long)pppppdVar54 + uVar44);
      goto LAB_008c6620;
    }
    dVar63 = *(double *)((long)pppppdVar54 + uVar44);
    ppppppdVar49 = *pppppppdVar35;
    *(uint *)((long)unaff_x22 + 0xc) = 4;
    fVar56 = (float)dVar63;
    auVar61._0_4_ = (float)(double)(long)(SUB84(ppppppdVar49,0) / fVar56);
    auVar61._4_4_ = (float)(double)(long)((float)((ulong)ppppppdVar49 >> 0x20) / fVar56);
    auVar61._8_8_ = 0;
    fVar57 = (float)(double)(long)(*(float *)(pppppppdVar35 + 1) / fVar56);
    goto LAB_008c625c;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
    goto switchD_008c3848_caseD_5e;
  }
switchD_008c3848_caseD_33:
  pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
  uVar13 = *(uint *)pppppdVar38;
  pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
  unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
  uVar16 = *(uint *)((long)pppppppdVar46 + 0xc);
  pppppdVar38 = pppppdVar53;
  if (uVar16 == 3) {
    ppppppdVar49 = (double ******)-(double)*pppppppdVar46;
    goto LAB_008c6760;
  }
  if (uVar16 != 4) {
    if (((uVar16 == 8) &&
        (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar46,0xf), plVar27 != (long *)0x0)) &&
       ((*(int *)((long)plVar27 + 0xc) == 7 && (*(char *)(*plVar27 + 6) != '\0')))) {
      plVar29 = *(long **)(param_1 + 0x68);
      lVar50 = *plVar27;
      uVar30 = (ulong)(uVar13 >> 8) & 0xff000000000000ff;
      uVar23 = 1;
      plVar29[1] = plVar27[1];
      *plVar29 = lVar50;
      ppppppdVar49 = *pppppppdVar46;
      plVar29[3] = (long)pppppppdVar46[1];
      plVar29[2] = (long)ppppppdVar49;
      lVar50 = *(long *)(param_1 + 0x50);
      *(long **)(param_1 + 0x68) = plVar29 + 4;
      goto LAB_008c5ae8;
    }
    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
    FUN_008cd428(param_1,unaff_x22,pppppppdVar46,pppppppdVar46);
    goto LAB_008c6620;
  }
  ppppppdVar49 = *pppppppdVar46;
  fVar56 = *(float *)(pppppppdVar46 + 1);
  *(uint *)((long)unaff_x22 + 0xc) = 4;
  uVar26 = *(undefined1 *)pppppdVar53;
  *unaff_x22 = (double ******)CONCAT44(-(float)((ulong)ppppppdVar49 >> 0x20),-SUB84(ppppppdVar49,0))
  ;
  *(float *)(unaff_x22 + 1) = -fVar56;
  pppppppdVar46 = pppppppdVar51;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(uVar26) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0xf:
    goto switchD_008c3848_caseD_f;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x29:
    goto switchD_008c3848_caseD_29;
  case 0x2a:
    goto switchD_008c3848_caseD_2a;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x33:
    goto switchD_008c3848_caseD_33;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3e:
    goto switchD_008c3848_caseD_3e;
  case 0x3f:
    goto switchD_008c3848_caseD_3f;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
    goto switchD_008c3848_caseD_42;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
    goto switchD_008c3848_caseD_46;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
    goto switchD_008c3848_caseD_52;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
    goto switchD_008c3848_caseD_5e;
  }
switchD_008c3848_caseD_3a:
  lVar50 = *(long *)(param_1 + 0x60);
  UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
    *(long *)(*(long *)(param_1 + 0x50) + 0x20) = *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
    (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
    if (*(char *)(param_1 + 3) != '\0') goto LAB_008c8784;
    pppppppdVar52 = *(double ********)(param_1 + 0x70);
    lVar50 = *(long *)(param_1 + 0x60);
  }
  if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
    *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
    FUN_008b52c4(param_1,1);
    pppppppdVar52 = *(double ********)(param_1 + 0x70);
  }
  uVar16 = *(uint *)pppppdVar53;
  unaff_x22 = (double *******)(ulong)uVar16;
  puVar36 = (uint *)((long)pppppdVar53 + 4);
  uVar13 = *puVar36;
  uVar30 = (ulong)(uVar16 >> 8) & 0xff;
  pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  iVar11 = (int)uVar16 >> 0x10;
  if ((*(uint *)((long)pppppppdVar46 + 0xc) != 0) || (*(uint *)((long)pppppppdVar46 + 0x1c) != 6)) {
    if (DAT_00d1f4f8 == '\x01') {
      *(int *)(**(long **)(param_1 + 0x50) + 0x48) =
           *(int *)(**(long **)(param_1 + 0x50) + 0x48) + 1;
    }
    pppppppdVar46[9] = SUB168(*(undefined1 (*) [16])(pppppppdVar46 + 2),8);
    pppppppdVar46[8] = SUB168(*(undefined1 (*) [16])(pppppppdVar46 + 2),0);
    pppppppdVar46[0xb] = pppppppdVar46[5];
    pppppppdVar46[10] = pppppppdVar46[4];
    pppppppdVar46[7] = pppppppdVar46[1];
    pppppppdVar46[6] = *pppppppdVar46;
    *(double ********)(param_1 + 0x68) = pppppppdVar46 + 0xc;
    *(uint **)(*(long *)(param_1 + 0x50) + 0x20) = puVar36;
    uVar44 = FUN_008b4310(param_1,pppppppdVar46 + 6,uVar13 & 0xff);
    if ((uVar44 & 1) == 0) {
      pppppppdVar52 = *(double ********)(param_1 + 0x70);
      iVar14 = *(int *)((long)pppppppdVar52 + uVar30 * 0x10 + 0x3c);
      *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x18);
      if (iVar14 == 0) {
        iVar11 = 1;
      }
      pppppppdVar52[uVar30 * 2 + 5] = pppppppdVar52[uVar30 * 2 + 7];
      pppppppdVar52[uVar30 * 2 + 4] = pppppppdVar52[uVar30 * 2 + 6];
      pppppdVar38 = (double *****)(puVar36 + iVar11);
      goto LAB_008c6ef0;
    }
    goto LAB_008c8794;
  }
  ppppppdVar49 = pppppppdVar46[2];
  ppppppdVar60 = pppppppdVar46[4];
  uVar16 = (uint)ppppppdVar60;
  uVar12 = *(uint *)(ppppppdVar49 + 1);
  if (2 < (int)uVar13) {
    uVar44 = (ulong)uVar13 - 2;
    if (uVar44 < 2) {
      lVar50 = 2;
    }
    else {
      uVar33 = uVar44 & 0xfffffffffffffffe;
      lVar50 = uVar33 + 2;
      puVar42 = (uint *)((long)pppppppdVar46 + 0x6c);
      uVar48 = uVar33;
      do {
        uVar48 = uVar48 - 2;
        puVar42[-4] = 0;
        *puVar42 = 0;
        puVar42 = puVar42 + 8;
      } while (uVar48 != 0);
      if (uVar44 == uVar33) goto LAB_008c6df0;
    }
    lVar43 = (ulong)uVar13 - lVar50;
    puVar34 = (undefined4 *)((long)pppppppdVar52 + lVar50 * 0x10 + uVar30 * 0x10 + 0x3c);
    do {
      lVar43 = lVar43 + -1;
      *puVar34 = 0;
      puVar34 = puVar34 + 4;
    } while (lVar43 != 0);
  }
LAB_008c6df0:
  if ((-1 < (int)uVar13) ||
     ((uVar16 < uVar12 &&
      (*(int *)((long)ppppppdVar49[4] + (((long)ppppppdVar60 << 0x20) >> 0x1c) + 0xc) != 0)))) {
    if (uVar16 < uVar12) {
      pppppdVar38 = ppppppdVar49[4] + (long)(int)uVar16 * 2;
      do {
        if (*(int *)((long)pppppdVar38 + 0xc) != 0) {
          iVar14 = (int)ppppppdVar60 + 1;
          pppppppdVar46[4] = (double ******)(long)iVar14;
          *(uint *)((long)pppppppdVar46 + 0x3c) = 3;
          pppppppdVar46[5] = (double ******)0x200000080;
          pppppppdVar46[6] = (double ******)(double)iVar14;
          ppppppdVar49 = (double ******)pppppdVar38[1];
          uVar55 = SUB84(*pppppdVar38,0);
          uVar58 = (undefined4)((ulong)*pppppdVar38 >> 0x20);
          goto LAB_008c6f8c;
        }
        uVar16 = (int)ppppppdVar60 + 1;
        ppppppdVar60 = (double ******)(ulong)uVar16;
        pppppdVar38 = pppppdVar38 + 2;
      } while (uVar16 < uVar12);
    }
    uVar12 = uVar16 - uVar12;
    if (uVar12 >> (ulong)(*(byte *)((long)ppppppdVar49 + 5) & 0x1f) == 0) {
      lVar50 = (ulong)uVar16 << 0x20;
      while( true ) {
        lVar50 = lVar50 + 0x100000000;
        pppppdVar38 = ppppppdVar49[5] + (long)(int)uVar12 * 4;
        if (*(int *)((long)pppppdVar38 + 0xc) != 0) break;
        uVar12 = uVar12 + 1;
        if (uVar12 >> (ulong)(*(byte *)((long)ppppppdVar49 + 5) & 0x1f) != 0) goto LAB_008c7638;
      }
      pppppppdVar46[4] = (double ******)(lVar50 >> 0x20);
      pppppppdVar46[5] = (double ******)0x200000080;
      pppppppdVar46[6] = (double ******)pppppdVar38[2];
      *(uint *)(pppppppdVar46 + 7) = *(uint *)(pppppdVar38 + 3);
      *(uint *)((long)pppppppdVar46 + 0x3c) = *(uint *)((long)pppppdVar38 + 0x1c) & 0xf;
      ppppppdVar49 = (double ******)pppppdVar38[1];
      uVar55 = SUB84(*pppppdVar38,0);
      uVar58 = (undefined4)((ulong)*pppppdVar38 >> 0x20);
LAB_008c6f8c:
      pppppppdVar46[9] = ppppppdVar49;
      pppppppdVar46[8] = (double ******)CONCAT44(uVar58,uVar55);
      pppppdVar53 = (double *****)(puVar36 + iVar11);
      goto LAB_008c6924;
    }
  }
LAB_008c7638:
  pppppdVar53 = pppppdVar53 + 1;
  pppppppdVar46 = pppppppdVar51;
  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(*(undefined1 *)pppppdVar53) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0xf:
    goto switchD_008c3848_caseD_f;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x29:
    goto switchD_008c3848_caseD_29;
  case 0x2a:
    goto switchD_008c3848_caseD_2a;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x33:
    goto switchD_008c3848_caseD_33;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3a:
    goto switchD_008c3848_caseD_3a;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3f:
    goto switchD_008c3848_caseD_3f;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
switchD_008c3848_caseD_42:
    bVar5 = *(byte *)((long)pppppdVar53 + 1);
    ppppppdVar49 = (double ******)pppppdVar54[(ulong)*(uint *)((long)pppppdVar53 + 4) * 2];
    (pppppppdVar52 + (ulong)bVar5 * 2)[1] =
         (double ******)(pppppdVar54 + (ulong)*(uint *)((long)pppppdVar53 + 4) * 2)[1];
    pppppppdVar52[(ulong)bVar5 * 2] = ppppppdVar49;
    goto LAB_008c7638;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
    goto switchD_008c3848_caseD_46;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
    goto switchD_008c3848_caseD_52;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
    goto switchD_008c3848_caseD_5e;
  }
switchD_008c3848_caseD_3e:
  plVar27 = *(long **)(param_1 + 0x50);
  lVar50 = *plVar27;
  if (*(long *)(lVar50 + 0x50) != 0) {
    plVar27[4] = *(long *)(lVar50 + 0x30);
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x60) + 0x6f0);
    *(uint *)((long)plVar27 + 0x2c) = *(uint *)((long)plVar27 + 0x2c) | 4;
    iVar11 = (*UNRECOVERED_JUMPTABLE)(param_1);
    goto LAB_008c517c;
  }
  plVar27[4] = (long)pppppdVar53;
  FUN_008c9034(param_1);
  pppppppdVar52 = *(double ********)(param_1 + 0x70);
  *(undefined8 *)(*(long *)(param_1 + 0x50) + 0x20) = *(undefined8 *)(lVar50 + 0x30);
  pppppdVar53 = *(double ******)(lVar50 + 0x18);
  pppppdVar54 = *(double ******)(lVar50 + 0x28);
  pppppppdVar46 = pppppppdVar51;
  pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(*(undefined1 *)pppppdVar53) {
  case 0:
    goto switchD_008c3848_caseD_0;
  case 1:
    goto switchD_008c3848_caseD_1;
  case 2:
    goto switchD_008c3848_caseD_2;
  case 3:
    goto switchD_008c3848_caseD_3;
  case 4:
    goto switchD_008c3848_caseD_4;
  case 5:
    goto switchD_008c3848_caseD_5;
  case 6:
    goto switchD_008c3848_caseD_6;
  case 7:
    goto switchD_008c3848_caseD_7;
  case 8:
    goto switchD_008c3848_caseD_8;
  case 9:
    goto switchD_008c3848_caseD_9;
  case 10:
    goto switchD_008c3848_caseD_a;
  case 0xb:
    goto switchD_008c3848_caseD_b;
  case 0xc:
    goto switchD_008c3848_caseD_c;
  case 0xd:
    goto switchD_008c3848_caseD_d;
  case 0xe:
    goto switchD_008c3848_caseD_e;
  case 0xf:
    goto switchD_008c3848_caseD_f;
  case 0x10:
    goto switchD_008c3848_caseD_10;
  case 0x11:
    goto switchD_008c3848_caseD_11;
  case 0x12:
    goto switchD_008c3848_caseD_12;
  case 0x13:
    goto switchD_008c3848_caseD_13;
  case 0x14:
    goto switchD_008c3848_caseD_14;
  case 0x15:
    goto switchD_008c3848_caseD_15;
  case 0x16:
    goto switchD_008c3848_caseD_16;
  case 0x17:
    goto switchD_008c3848_caseD_17;
  case 0x18:
    goto switchD_008c3848_caseD_18;
  case 0x19:
    goto switchD_008c3848_caseD_19;
  case 0x1a:
    goto switchD_008c3848_caseD_1a;
  case 0x1b:
    goto switchD_008c3848_caseD_1b;
  case 0x1c:
    goto switchD_008c3848_caseD_1c;
  case 0x1d:
    goto switchD_008c3848_caseD_1d;
  case 0x1e:
    goto switchD_008c3848_caseD_1e;
  case 0x1f:
    goto switchD_008c3848_caseD_1f;
  case 0x20:
    goto switchD_008c3848_caseD_20;
  case 0x21:
    goto switchD_008c3848_caseD_21;
  case 0x22:
    goto switchD_008c3848_caseD_22;
  case 0x23:
    goto switchD_008c3848_caseD_23;
  case 0x24:
    goto switchD_008c3848_caseD_24;
  case 0x25:
    goto switchD_008c3848_caseD_25;
  case 0x26:
    goto switchD_008c3848_caseD_26;
  case 0x27:
    goto switchD_008c3848_caseD_27;
  case 0x28:
    goto switchD_008c3848_caseD_28;
  case 0x29:
    goto switchD_008c3848_caseD_29;
  case 0x2a:
    goto switchD_008c3848_caseD_2a;
  case 0x2b:
    goto switchD_008c3848_caseD_2b;
  case 0x2c:
    goto switchD_008c3848_caseD_2c;
  case 0x2d:
    goto switchD_008c3848_caseD_2d;
  case 0x2e:
    goto switchD_008c3848_caseD_2e;
  case 0x2f:
    goto switchD_008c3848_caseD_2f;
  case 0x30:
    goto switchD_008c3848_caseD_30;
  case 0x31:
    goto switchD_008c3848_caseD_31;
  case 0x32:
    goto switchD_008c3848_caseD_32;
  case 0x33:
    goto switchD_008c3848_caseD_33;
  case 0x34:
    goto switchD_008c3848_caseD_34;
  case 0x35:
    goto switchD_008c3848_caseD_35;
  case 0x36:
    goto switchD_008c3848_caseD_36;
  case 0x37:
    goto switchD_008c3848_caseD_37;
  case 0x38:
    goto switchD_008c3848_caseD_38;
  case 0x39:
    goto switchD_008c3848_caseD_39;
  case 0x3a:
    goto switchD_008c3848_caseD_3a;
  case 0x3b:
    goto switchD_008c3848_caseD_3b;
  case 0x3c:
    goto switchD_008c3848_caseD_3c;
  case 0x3d:
    goto switchD_008c3848_caseD_3d;
  case 0x3e:
    goto switchD_008c3848_caseD_3e;
  case 0x40:
    goto switchD_008c3848_caseD_40;
  case 0x41:
    goto switchD_008c3848_caseD_41;
  case 0x42:
    goto switchD_008c3848_caseD_42;
  case 0x43:
    goto switchD_008c3848_caseD_43;
  case 0x44:
    goto switchD_008c3848_caseD_44;
  case 0x45:
    goto switchD_008c3848_caseD_45;
  case 0x46:
    goto switchD_008c3848_caseD_46;
  case 0x47:
    goto switchD_008c3848_caseD_47;
  case 0x48:
    goto switchD_008c3848_caseD_48;
  case 0x49:
    goto switchD_008c3848_caseD_49;
  case 0x4a:
    goto switchD_008c3848_caseD_4a;
  case 0x4b:
    goto switchD_008c3848_caseD_4b;
  case 0x4c:
    goto switchD_008c3848_caseD_4c;
  case 0x4d:
    goto switchD_008c3848_caseD_4d;
  case 0x4e:
    goto switchD_008c3848_caseD_4e;
  case 0x4f:
    goto switchD_008c3848_caseD_4f;
  case 0x50:
    goto switchD_008c3848_caseD_50;
  case 0x51:
    goto switchD_008c3848_caseD_51;
  case 0x52:
    goto switchD_008c3848_caseD_52;
  case 0x53:
    goto switchD_008c3848_caseD_53;
  case 0x54:
    goto switchD_008c3848_caseD_54;
  case 0x55:
    goto switchD_008c3848_caseD_55;
  case 0x56:
    goto switchD_008c3848_caseD_56;
  case 0x57:
    goto switchD_008c3848_caseD_57;
  case 0x58:
    goto switchD_008c3848_caseD_58;
  case 0x59:
    goto switchD_008c3848_caseD_59;
  case 0x5a:
    goto switchD_008c3848_caseD_5a;
  case 0x5b:
    goto switchD_008c3848_caseD_5b;
  case 0x5c:
    goto switchD_008c3848_caseD_5c;
  case 0x5d:
    goto switchD_008c3848_caseD_5d;
  case 0x5e:
    goto switchD_008c3848_caseD_5e;
  }
switchD_008c3848_caseD_3f:
  plVar27 = *(long **)(param_1 + 0x50);
  pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
  uVar13 = *(uint *)pppppdVar38;
  uVar12 = uVar13 >> 0x10 & 0xff;
  uVar16 = (int)((ulong)((long)pppppppdVar52 - plVar27[1]) >> 4) + ~(uint)*(byte *)(*plVar27 + 7);
  unaff_x22 = (double *******)(ulong)uVar16;
  bVar5 = (byte)(uVar13 >> 8);
  if (uVar12 == 0) {
    plVar27[4] = (long)pppppdVar53;
    if (*(long *)(param_1 + 0x48) - *(long *)(param_1 + 0x68) <= (long)(int)(uVar16 * 0x10)) {
      FUN_008b41e4(param_1,unaff_x22);
    }
    pppppppdVar52 = *(double ********)(param_1 + 0x70);
    if (0 < (int)uVar16) {
      pppppppdVar31 = pppppppdVar52 + (long)unaff_x22 * -2;
      pppppppdVar46 = unaff_x22;
      pppppppdVar35 = pppppppdVar52 + (ulong)bVar5 * 2;
      do {
        ppppppdVar49 = *pppppppdVar31;
        pppppppdVar46 = (double *******)((long)pppppppdVar46 + -1);
        pppppppdVar35[1] = pppppppdVar31[1];
        *pppppppdVar35 = ppppppdVar49;
        pppppppdVar31 = pppppppdVar31 + 2;
        pppppppdVar35 = pppppppdVar35 + 2;
      } while (pppppppdVar46 != (double *******)0x0);
    }
    uVar26 = *(undefined1 *)pppppdVar53;
    *(double ********)(param_1 + 0x68) = pppppppdVar52 + (ulong)bVar5 * 2 + (long)(int)uVar16 * 2;
    pppppppdVar46 = pppppppdVar51;
    pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
    switch(uVar26) {
    case 0:
      goto switchD_008c3848_caseD_0;
    case 1:
      goto switchD_008c3848_caseD_1;
    case 2:
      goto switchD_008c3848_caseD_2;
    case 3:
      goto switchD_008c3848_caseD_3;
    case 4:
      goto switchD_008c3848_caseD_4;
    case 5:
      goto switchD_008c3848_caseD_5;
    case 6:
      goto switchD_008c3848_caseD_6;
    case 7:
      goto switchD_008c3848_caseD_7;
    case 8:
      goto switchD_008c3848_caseD_8;
    case 9:
      goto switchD_008c3848_caseD_9;
    case 10:
      goto switchD_008c3848_caseD_a;
    case 0xb:
      goto switchD_008c3848_caseD_b;
    case 0xc:
      goto switchD_008c3848_caseD_c;
    case 0xd:
      goto switchD_008c3848_caseD_d;
    case 0xe:
      goto switchD_008c3848_caseD_e;
    case 0xf:
      goto switchD_008c3848_caseD_f;
    case 0x10:
      goto switchD_008c3848_caseD_10;
    case 0x11:
      goto switchD_008c3848_caseD_11;
    case 0x12:
      goto switchD_008c3848_caseD_12;
    case 0x13:
      goto switchD_008c3848_caseD_13;
    case 0x14:
      goto switchD_008c3848_caseD_14;
    case 0x15:
      goto switchD_008c3848_caseD_15;
    case 0x16:
      goto switchD_008c3848_caseD_16;
    case 0x17:
      goto switchD_008c3848_caseD_17;
    case 0x18:
      goto switchD_008c3848_caseD_18;
    case 0x19:
      goto switchD_008c3848_caseD_19;
    case 0x1a:
      goto switchD_008c3848_caseD_1a;
    case 0x1b:
      goto switchD_008c3848_caseD_1b;
    case 0x1c:
      goto switchD_008c3848_caseD_1c;
    case 0x1d:
      goto switchD_008c3848_caseD_1d;
    case 0x1e:
      goto switchD_008c3848_caseD_1e;
    case 0x1f:
      goto switchD_008c3848_caseD_1f;
    case 0x20:
      goto switchD_008c3848_caseD_20;
    case 0x21:
      goto switchD_008c3848_caseD_21;
    case 0x22:
      goto switchD_008c3848_caseD_22;
    case 0x23:
      goto switchD_008c3848_caseD_23;
    case 0x24:
      goto switchD_008c3848_caseD_24;
    case 0x25:
      goto switchD_008c3848_caseD_25;
    case 0x26:
      goto switchD_008c3848_caseD_26;
    case 0x27:
      goto switchD_008c3848_caseD_27;
    case 0x28:
      goto switchD_008c3848_caseD_28;
    case 0x29:
      goto switchD_008c3848_caseD_29;
    case 0x2a:
      goto switchD_008c3848_caseD_2a;
    case 0x2b:
      goto switchD_008c3848_caseD_2b;
    case 0x2c:
      goto switchD_008c3848_caseD_2c;
    case 0x2d:
      goto switchD_008c3848_caseD_2d;
    case 0x2e:
      goto switchD_008c3848_caseD_2e;
    case 0x2f:
      goto switchD_008c3848_caseD_2f;
    case 0x30:
      goto switchD_008c3848_caseD_30;
    case 0x31:
      goto switchD_008c3848_caseD_31;
    case 0x32:
      goto switchD_008c3848_caseD_32;
    case 0x33:
      goto switchD_008c3848_caseD_33;
    case 0x34:
      goto switchD_008c3848_caseD_34;
    case 0x35:
      goto switchD_008c3848_caseD_35;
    case 0x36:
      goto switchD_008c3848_caseD_36;
    case 0x37:
      goto switchD_008c3848_caseD_37;
    case 0x38:
      goto switchD_008c3848_caseD_38;
    case 0x39:
      goto switchD_008c3848_caseD_39;
    case 0x3a:
      goto switchD_008c3848_caseD_3a;
    case 0x3b:
      goto switchD_008c3848_caseD_3b;
    case 0x3c:
      goto switchD_008c3848_caseD_3c;
    case 0x3d:
      goto switchD_008c3848_caseD_3d;
    case 0x3e:
      goto switchD_008c3848_caseD_3e;
    case 0x40:
      goto switchD_008c3848_caseD_40;
    case 0x41:
      goto switchD_008c3848_caseD_41;
    case 0x42:
      goto switchD_008c3848_caseD_42;
    case 0x43:
switchD_008c3848_caseD_43:
      do {
        lVar50 = *(long *)(param_1 + 0x60);
        UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x688);
        if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
               *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
          (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
          if (*(char *)(param_1 + 3) != '\0') goto LAB_008c8784;
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
          lVar50 = *(long *)(param_1 + 0x60);
        }
        if (*(ulong *)(lVar50 + 8) <= *(ulong *)(lVar50 + 0x10)) {
          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
          FUN_008b52c4(param_1,1);
          pppppppdVar52 = *(double ********)(param_1 + 0x70);
        }
        pppppdVar53 = (double *****)
                      ((long)pppppdVar53 + ((long)((int)*(uint *)pppppdVar53 >> 8) + 1) * 4);
        pppppppdVar46 = pppppppdVar51;
        pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
        switch(*(undefined1 *)pppppdVar53) {
        case 0:
          goto switchD_008c3848_caseD_0;
        case 1:
          goto switchD_008c3848_caseD_1;
        case 2:
          goto switchD_008c3848_caseD_2;
        case 3:
          goto switchD_008c3848_caseD_3;
        case 4:
          goto switchD_008c3848_caseD_4;
        case 5:
          goto switchD_008c3848_caseD_5;
        case 6:
          goto switchD_008c3848_caseD_6;
        case 7:
          goto switchD_008c3848_caseD_7;
        case 8:
          goto switchD_008c3848_caseD_8;
        case 9:
          goto switchD_008c3848_caseD_9;
        case 10:
          goto switchD_008c3848_caseD_a;
        case 0xb:
          goto switchD_008c3848_caseD_b;
        case 0xc:
          goto switchD_008c3848_caseD_c;
        case 0xd:
          goto switchD_008c3848_caseD_d;
        case 0xe:
          goto switchD_008c3848_caseD_e;
        case 0xf:
          goto switchD_008c3848_caseD_f;
        case 0x10:
          goto switchD_008c3848_caseD_10;
        case 0x11:
          goto switchD_008c3848_caseD_11;
        case 0x12:
          goto switchD_008c3848_caseD_12;
        case 0x13:
          goto switchD_008c3848_caseD_13;
        case 0x14:
          goto switchD_008c3848_caseD_14;
        case 0x15:
          goto switchD_008c3848_caseD_15;
        case 0x16:
          goto switchD_008c3848_caseD_16;
        case 0x17:
          goto switchD_008c3848_caseD_17;
        case 0x18:
          goto switchD_008c3848_caseD_18;
        case 0x19:
          goto switchD_008c3848_caseD_19;
        case 0x1a:
          goto switchD_008c3848_caseD_1a;
        case 0x1b:
          goto switchD_008c3848_caseD_1b;
        case 0x1c:
          goto switchD_008c3848_caseD_1c;
        case 0x1d:
          goto switchD_008c3848_caseD_1d;
        case 0x1e:
          goto switchD_008c3848_caseD_1e;
        case 0x1f:
          goto switchD_008c3848_caseD_1f;
        case 0x20:
          goto switchD_008c3848_caseD_20;
        case 0x21:
          goto switchD_008c3848_caseD_21;
        case 0x22:
          goto switchD_008c3848_caseD_22;
        case 0x23:
          goto switchD_008c3848_caseD_23;
        case 0x24:
          goto switchD_008c3848_caseD_24;
        case 0x25:
          goto switchD_008c3848_caseD_25;
        case 0x26:
          goto switchD_008c3848_caseD_26;
        case 0x27:
          goto switchD_008c3848_caseD_27;
        case 0x28:
          goto switchD_008c3848_caseD_28;
        case 0x29:
          goto switchD_008c3848_caseD_29;
        case 0x2a:
          goto switchD_008c3848_caseD_2a;
        case 0x2b:
          goto switchD_008c3848_caseD_2b;
        case 0x2c:
          goto switchD_008c3848_caseD_2c;
        case 0x2d:
          goto switchD_008c3848_caseD_2d;
        case 0x2e:
          goto switchD_008c3848_caseD_2e;
        case 0x2f:
          goto switchD_008c3848_caseD_2f;
        case 0x30:
          goto switchD_008c3848_caseD_30;
        case 0x31:
          goto switchD_008c3848_caseD_31;
        case 0x32:
          goto switchD_008c3848_caseD_32;
        case 0x33:
          goto switchD_008c3848_caseD_33;
        case 0x34:
          goto switchD_008c3848_caseD_34;
        case 0x35:
          goto switchD_008c3848_caseD_35;
        case 0x36:
          goto switchD_008c3848_caseD_36;
        case 0x37:
          goto switchD_008c3848_caseD_37;
        case 0x38:
          goto switchD_008c3848_caseD_38;
        case 0x39:
          goto switchD_008c3848_caseD_39;
        case 0x3a:
          goto switchD_008c3848_caseD_3a;
        case 0x3b:
          goto switchD_008c3848_caseD_3b;
        case 0x3c:
          goto switchD_008c3848_caseD_3c;
        case 0x3d:
          goto switchD_008c3848_caseD_3d;
        case 0x3e:
          goto switchD_008c3848_caseD_3e;
        case 0x3f:
          goto switchD_008c3848_caseD_3f;
        case 0x40:
          goto switchD_008c3848_caseD_40;
        case 0x41:
          goto switchD_008c3848_caseD_41;
        case 0x42:
          goto switchD_008c3848_caseD_42;
        case 0x44:
          goto switchD_008c3848_caseD_44;
        case 0x45:
switchD_008c3848_caseD_45:
          do {
            iVar11 = (int)*(uint *)pppppdVar38 >> 8;
            pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
            if (iVar11 < 0x7fffff) {
              iVar11 = iVar11 + 1;
            }
            *(uint *)pppppdVar38 = *(uint *)pppppdVar38 & 0xff | iVar11 << 8;
            pppppppdVar46 = pppppppdVar51;
            pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
            switch(*(undefined1 *)pppppdVar53) {
            case 0:
              goto switchD_008c3848_caseD_0;
            case 1:
              goto switchD_008c3848_caseD_1;
            case 2:
              goto switchD_008c3848_caseD_2;
            case 3:
              goto switchD_008c3848_caseD_3;
            case 4:
              goto switchD_008c3848_caseD_4;
            case 5:
              goto switchD_008c3848_caseD_5;
            case 6:
              goto switchD_008c3848_caseD_6;
            case 7:
              goto switchD_008c3848_caseD_7;
            case 8:
              goto switchD_008c3848_caseD_8;
            case 9:
              goto switchD_008c3848_caseD_9;
            case 10:
              goto switchD_008c3848_caseD_a;
            case 0xb:
              goto switchD_008c3848_caseD_b;
            case 0xc:
              goto switchD_008c3848_caseD_c;
            case 0xd:
              goto switchD_008c3848_caseD_d;
            case 0xe:
              goto switchD_008c3848_caseD_e;
            case 0xf:
              goto switchD_008c3848_caseD_f;
            case 0x10:
              goto switchD_008c3848_caseD_10;
            case 0x11:
              goto switchD_008c3848_caseD_11;
            case 0x12:
              goto switchD_008c3848_caseD_12;
            case 0x13:
              goto switchD_008c3848_caseD_13;
            case 0x14:
              goto switchD_008c3848_caseD_14;
            case 0x15:
              goto switchD_008c3848_caseD_15;
            case 0x16:
              goto switchD_008c3848_caseD_16;
            case 0x17:
              goto switchD_008c3848_caseD_17;
            case 0x18:
              goto switchD_008c3848_caseD_18;
            case 0x19:
              goto switchD_008c3848_caseD_19;
            case 0x1a:
              goto switchD_008c3848_caseD_1a;
            case 0x1b:
              goto switchD_008c3848_caseD_1b;
            case 0x1c:
              goto switchD_008c3848_caseD_1c;
            case 0x1d:
              goto switchD_008c3848_caseD_1d;
            case 0x1e:
              goto switchD_008c3848_caseD_1e;
            case 0x1f:
              goto switchD_008c3848_caseD_1f;
            case 0x20:
              goto switchD_008c3848_caseD_20;
            case 0x21:
              goto switchD_008c3848_caseD_21;
            case 0x22:
              goto switchD_008c3848_caseD_22;
            case 0x23:
              goto switchD_008c3848_caseD_23;
            case 0x24:
              goto switchD_008c3848_caseD_24;
            case 0x25:
              goto switchD_008c3848_caseD_25;
            case 0x26:
              goto switchD_008c3848_caseD_26;
            case 0x27:
              goto switchD_008c3848_caseD_27;
            case 0x28:
              goto switchD_008c3848_caseD_28;
            case 0x29:
              goto switchD_008c3848_caseD_29;
            case 0x2a:
              goto switchD_008c3848_caseD_2a;
            case 0x2b:
              goto switchD_008c3848_caseD_2b;
            case 0x2c:
              goto switchD_008c3848_caseD_2c;
            case 0x2d:
              goto switchD_008c3848_caseD_2d;
            case 0x2e:
              goto switchD_008c3848_caseD_2e;
            case 0x2f:
              goto switchD_008c3848_caseD_2f;
            case 0x30:
              goto switchD_008c3848_caseD_30;
            case 0x31:
              goto switchD_008c3848_caseD_31;
            case 0x32:
              goto switchD_008c3848_caseD_32;
            case 0x33:
              goto switchD_008c3848_caseD_33;
            case 0x34:
              goto switchD_008c3848_caseD_34;
            case 0x35:
              goto switchD_008c3848_caseD_35;
            case 0x36:
              goto switchD_008c3848_caseD_36;
            case 0x37:
              goto switchD_008c3848_caseD_37;
            case 0x38:
              goto switchD_008c3848_caseD_38;
            case 0x39:
              goto switchD_008c3848_caseD_39;
            case 0x3a:
              goto switchD_008c3848_caseD_3a;
            case 0x3b:
              goto switchD_008c3848_caseD_3b;
            case 0x3c:
              goto switchD_008c3848_caseD_3c;
            case 0x3d:
              goto switchD_008c3848_caseD_3d;
            case 0x3e:
              goto switchD_008c3848_caseD_3e;
            case 0x3f:
              goto switchD_008c3848_caseD_3f;
            case 0x40:
              goto switchD_008c3848_caseD_40;
            case 0x41:
              goto switchD_008c3848_caseD_41;
            case 0x42:
              goto switchD_008c3848_caseD_42;
            case 0x43:
              goto switchD_008c3848_caseD_43;
            case 0x44:
              goto switchD_008c3848_caseD_44;
            case 0x46:
              goto switchD_008c3848_caseD_46;
            case 0x47:
              goto switchD_008c3848_caseD_47;
            case 0x48:
switchD_008c3848_caseD_48:
              do {
                pppppdVar53 = (double *****)((long)pppppdVar38 + 4);
                uVar16 = *(uint *)pppppdVar38;
                pppppppdVar35 = (double *******)(pppppdVar54 + (ulong)(byte)(uVar16 >> 0x10) * 2);
                pdVar20 = (double *)((long)pppppppdVar52 + ((ulong)(uVar16 >> 0x14) & 0xff0));
                pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
                pppppdVar38 = pppppdVar53;
                if (*(int *)((long)pdVar20 + 0xc) == 3) {
                  ppppppdVar49 = (double ******)((double)*pppppppdVar35 / *pdVar20);
                  goto LAB_008c619c;
                }
                if (*(int *)((long)pdVar20 + 0xc) != 4) {
                  lVar50 = *(long *)(param_1 + 0x50);
                  goto LAB_008c7850;
                }
                ppppppdVar49 = *pppppppdVar35;
                dVar63 = *pdVar20;
                *(uint *)((long)pppppppdVar31 + 0xc) = 4;
                uVar26 = *(undefined1 *)pppppdVar53;
                fVar56 = (float)(double)ppppppdVar49;
                fVar57 = *(float *)(pdVar20 + 1);
                *pppppppdVar31 =
                     (double ******)
                     CONCAT44(fVar56 / (float)((ulong)dVar63 >> 0x20),fVar56 / SUB84(dVar63,0));
                *(float *)(pppppppdVar31 + 1) = fVar56 / fVar57;
                pppppppdVar46 = pppppppdVar51;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                switch(uVar26) {
                case 0:
                  goto switchD_008c3848_caseD_0;
                case 1:
                  goto switchD_008c3848_caseD_1;
                case 2:
                  goto switchD_008c3848_caseD_2;
                case 3:
                  goto switchD_008c3848_caseD_3;
                case 4:
                  goto switchD_008c3848_caseD_4;
                case 5:
                  goto switchD_008c3848_caseD_5;
                case 6:
                  goto switchD_008c3848_caseD_6;
                case 7:
                  goto switchD_008c3848_caseD_7;
                case 8:
                  goto switchD_008c3848_caseD_8;
                case 9:
                  goto switchD_008c3848_caseD_9;
                case 10:
                  goto switchD_008c3848_caseD_a;
                case 0xb:
                  goto switchD_008c3848_caseD_b;
                case 0xc:
                  goto switchD_008c3848_caseD_c;
                case 0xd:
                  goto switchD_008c3848_caseD_d;
                case 0xe:
                  goto switchD_008c3848_caseD_e;
                case 0xf:
                  goto switchD_008c3848_caseD_f;
                case 0x10:
                  goto switchD_008c3848_caseD_10;
                case 0x11:
                  goto switchD_008c3848_caseD_11;
                case 0x12:
                  goto switchD_008c3848_caseD_12;
                case 0x13:
                  goto switchD_008c3848_caseD_13;
                case 0x14:
                  goto switchD_008c3848_caseD_14;
                case 0x15:
                  goto switchD_008c3848_caseD_15;
                case 0x16:
                  goto switchD_008c3848_caseD_16;
                case 0x17:
                  goto switchD_008c3848_caseD_17;
                case 0x18:
                  goto switchD_008c3848_caseD_18;
                case 0x19:
                  goto switchD_008c3848_caseD_19;
                case 0x1a:
                  goto switchD_008c3848_caseD_1a;
                case 0x1b:
                  goto switchD_008c3848_caseD_1b;
                case 0x1c:
                  goto switchD_008c3848_caseD_1c;
                case 0x1d:
                  goto switchD_008c3848_caseD_1d;
                case 0x1e:
                  goto switchD_008c3848_caseD_1e;
                case 0x1f:
                  goto switchD_008c3848_caseD_1f;
                case 0x20:
                  goto switchD_008c3848_caseD_20;
                case 0x21:
                  goto switchD_008c3848_caseD_21;
                case 0x22:
                  goto switchD_008c3848_caseD_22;
                case 0x23:
                  goto switchD_008c3848_caseD_23;
                case 0x24:
                  goto switchD_008c3848_caseD_24;
                case 0x25:
                  goto switchD_008c3848_caseD_25;
                case 0x26:
                  goto switchD_008c3848_caseD_26;
                case 0x27:
                  goto switchD_008c3848_caseD_27;
                case 0x28:
                  goto switchD_008c3848_caseD_28;
                case 0x29:
                  goto switchD_008c3848_caseD_29;
                case 0x2a:
                  goto switchD_008c3848_caseD_2a;
                case 0x2b:
                  goto switchD_008c3848_caseD_2b;
                case 0x2c:
                  goto switchD_008c3848_caseD_2c;
                case 0x2d:
                  goto switchD_008c3848_caseD_2d;
                case 0x2e:
                  goto switchD_008c3848_caseD_2e;
                case 0x2f:
                  goto switchD_008c3848_caseD_2f;
                case 0x30:
                  goto switchD_008c3848_caseD_30;
                case 0x31:
                  goto switchD_008c3848_caseD_31;
                case 0x32:
                  goto switchD_008c3848_caseD_32;
                case 0x33:
                  goto switchD_008c3848_caseD_33;
                case 0x34:
                  goto switchD_008c3848_caseD_34;
                case 0x35:
                  goto switchD_008c3848_caseD_35;
                case 0x36:
                  goto switchD_008c3848_caseD_36;
                case 0x37:
                  goto switchD_008c3848_caseD_37;
                case 0x38:
                  goto switchD_008c3848_caseD_38;
                case 0x39:
                  goto switchD_008c3848_caseD_39;
                case 0x3a:
                  goto switchD_008c3848_caseD_3a;
                case 0x3b:
                  goto switchD_008c3848_caseD_3b;
                case 0x3c:
                  goto switchD_008c3848_caseD_3c;
                case 0x3d:
                  goto switchD_008c3848_caseD_3d;
                case 0x3e:
                  goto switchD_008c3848_caseD_3e;
                case 0x3f:
                  goto switchD_008c3848_caseD_3f;
                case 0x40:
                  goto switchD_008c3848_caseD_40;
                case 0x41:
                  goto switchD_008c3848_caseD_41;
                case 0x42:
                  goto switchD_008c3848_caseD_42;
                case 0x43:
                  goto switchD_008c3848_caseD_43;
                case 0x44:
                  goto switchD_008c3848_caseD_44;
                case 0x45:
                  goto switchD_008c3848_caseD_45;
                case 0x46:
                  goto switchD_008c3848_caseD_46;
                case 0x47:
                  goto switchD_008c3848_caseD_47;
                case 0x49:
                  goto switchD_008c3848_caseD_49;
                case 0x4a:
switchD_008c3848_caseD_4a:
                  pppppdVar53 = pppppdVar38 + 1;
                  uVar16 = *(uint *)pppppdVar38;
                  if (*(char *)((long)pppppppdVar51[2] + 3) != '\0') {
                    pppppdVar19 = (double *****)
                                  ((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
                    pppppppdVar46 = pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2;
                    uVar13 = *(uint *)((long)pppppdVar19 + -4);
                    lVar50 = *(long *)(param_1 + 0x50);
                    UNRECOVERED_JUMPTABLE =
                         *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
                    pppppppdVar31 = pppppppdVar52 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2;
                    do {
                      *(double ******)(lVar50 + 0x20) = pppppdVar53;
                      unaff_x22 = pppppppdVar52 + ((ulong)(uVar13 >> 8) & 0xff) * 2;
                      uVar16 = (*UNRECOVERED_JUMPTABLE)
                                         (param_1,unaff_x22,pppppppdVar46,(uVar13 >> 0x18) - 1,
                                          pppppppdVar31,2);
                      if ((int)uVar16 < 0) break;
                      if (uVar13 >> 0x18 == 0) {
                        *(double ********)(param_1 + 0x68) = unaff_x22 + (ulong)uVar16 * 2;
                      }
                      pppppppdVar46 = pppppppdVar51;
                      pppppdVar38 = pppppdVar19;
                      pppppdVar53 = pppppdVar19;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                      switch(*(undefined1 *)pppppdVar19) {
                      case 0:
                        goto switchD_008c3848_caseD_0;
                      case 1:
                        goto switchD_008c3848_caseD_1;
                      case 2:
                        goto switchD_008c3848_caseD_2;
                      case 3:
                        goto switchD_008c3848_caseD_3;
                      case 4:
                        goto switchD_008c3848_caseD_4;
                      case 5:
                        goto switchD_008c3848_caseD_5;
                      case 6:
                        goto switchD_008c3848_caseD_6;
                      case 7:
                        goto switchD_008c3848_caseD_7;
                      case 8:
                        goto switchD_008c3848_caseD_8;
                      case 9:
                        goto switchD_008c3848_caseD_9;
                      case 10:
                        goto switchD_008c3848_caseD_a;
                      case 0xb:
                        goto switchD_008c3848_caseD_b;
                      case 0xc:
                        goto switchD_008c3848_caseD_c;
                      case 0xd:
                        goto switchD_008c3848_caseD_d;
                      case 0xe:
                        goto switchD_008c3848_caseD_e;
                      case 0xf:
                        goto switchD_008c3848_caseD_f;
                      case 0x10:
                        goto switchD_008c3848_caseD_10;
                      case 0x11:
                        goto switchD_008c3848_caseD_11;
                      case 0x12:
                        goto switchD_008c3848_caseD_12;
                      case 0x13:
                        goto switchD_008c3848_caseD_13;
                      case 0x14:
                        goto switchD_008c3848_caseD_14;
                      case 0x15:
                        goto switchD_008c3848_caseD_15;
                      case 0x16:
                        goto switchD_008c3848_caseD_16;
                      case 0x17:
                        goto switchD_008c3848_caseD_17;
                      case 0x18:
                        goto switchD_008c3848_caseD_18;
                      case 0x19:
                        goto switchD_008c3848_caseD_19;
                      case 0x1a:
                        goto switchD_008c3848_caseD_1a;
                      case 0x1b:
                        goto switchD_008c3848_caseD_1b;
                      case 0x1c:
                        goto switchD_008c3848_caseD_1c;
                      case 0x1d:
                        goto switchD_008c3848_caseD_1d;
                      case 0x1e:
                        goto switchD_008c3848_caseD_1e;
                      case 0x1f:
                        goto switchD_008c3848_caseD_1f;
                      case 0x20:
                        goto switchD_008c3848_caseD_20;
                      case 0x21:
                        goto switchD_008c3848_caseD_21;
                      case 0x22:
                        goto switchD_008c3848_caseD_22;
                      case 0x23:
                        goto switchD_008c3848_caseD_23;
                      case 0x24:
                        goto switchD_008c3848_caseD_24;
                      case 0x25:
                        goto switchD_008c3848_caseD_25;
                      case 0x26:
                        goto switchD_008c3848_caseD_26;
                      case 0x27:
                        goto switchD_008c3848_caseD_27;
                      case 0x28:
                        goto switchD_008c3848_caseD_28;
                      case 0x29:
                        goto switchD_008c3848_caseD_29;
                      case 0x2a:
                        goto switchD_008c3848_caseD_2a;
                      case 0x2b:
                        goto switchD_008c3848_caseD_2b;
                      case 0x2c:
                        goto switchD_008c3848_caseD_2c;
                      case 0x2d:
                        goto switchD_008c3848_caseD_2d;
                      case 0x2e:
                        goto switchD_008c3848_caseD_2e;
                      case 0x2f:
                        goto switchD_008c3848_caseD_2f;
                      case 0x30:
                        goto switchD_008c3848_caseD_30;
                      case 0x31:
                        goto switchD_008c3848_caseD_31;
                      case 0x32:
                        goto switchD_008c3848_caseD_32;
                      case 0x33:
                        goto switchD_008c3848_caseD_33;
                      case 0x34:
                        goto switchD_008c3848_caseD_34;
                      case 0x35:
                        goto switchD_008c3848_caseD_35;
                      case 0x36:
                        goto switchD_008c3848_caseD_36;
                      case 0x37:
                        goto switchD_008c3848_caseD_37;
                      case 0x38:
                        goto switchD_008c3848_caseD_38;
                      case 0x39:
                        goto switchD_008c3848_caseD_39;
                      case 0x3a:
                        goto switchD_008c3848_caseD_3a;
                      case 0x3b:
                        goto switchD_008c3848_caseD_3b;
                      case 0x3c:
                        goto switchD_008c3848_caseD_3c;
                      case 0x3d:
                        goto switchD_008c3848_caseD_3d;
                      case 0x3e:
                        goto switchD_008c3848_caseD_3e;
                      case 0x3f:
                        goto switchD_008c3848_caseD_3f;
                      case 0x40:
                        goto switchD_008c3848_caseD_40;
                      case 0x41:
                        goto switchD_008c3848_caseD_41;
                      case 0x42:
                        goto switchD_008c3848_caseD_42;
                      case 0x43:
                        goto switchD_008c3848_caseD_43;
                      case 0x44:
                        goto switchD_008c3848_caseD_44;
                      case 0x45:
                        goto switchD_008c3848_caseD_45;
                      case 0x46:
                        goto switchD_008c3848_caseD_46;
                      case 0x47:
                        goto switchD_008c3848_caseD_47;
                      case 0x48:
                        goto switchD_008c3848_caseD_48;
                      case 0x49:
                        goto switchD_008c3848_caseD_49;
                      case 0x4a:
                        goto switchD_008c3848_caseD_4a;
                      case 0x4b:
switchD_008c3848_caseD_4b:
                        pppppdVar53 = pppppdVar38 + 1;
                        uVar16 = *(uint *)pppppdVar38;
                        if (*(char *)((long)pppppppdVar51[2] + 3) == '\0') goto LAB_008c3a14;
                        pppppdVar19 = (double *****)
                                      ((long)pppppdVar53 + ((ulong)(uVar16 >> 0x16) & 0x3fc));
                        pppppppdVar46 = pppppppdVar52 + (ulong)(uVar16 >> 0x10 & 0xff) * 2;
                        uVar13 = *(uint *)((long)pppppdVar19 + -4);
                        lVar50 = *(long *)(param_1 + 0x50);
                        UNRECOVERED_JUMPTABLE =
                             *(code **)(&DAT_00c4c918 + ((ulong)(uVar16 >> 8) & 0xff) * 8);
                        pppppppdVar31 =
                             (double *******)
                             (pppppdVar54 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2);
                        break;
                      case 0x4c:
                        goto switchD_008c3848_caseD_4c;
                      case 0x4d:
                        goto switchD_008c3848_caseD_4d;
                      case 0x4e:
                        goto switchD_008c3848_caseD_4e;
                      case 0x4f:
                        goto switchD_008c3848_caseD_4f;
                      case 0x50:
                        goto switchD_008c3848_caseD_50;
                      case 0x51:
switchD_008c3848_caseD_51:
                        do {
                          pppppdVar38 = (double *****)((long)pppppdVar53 + 4);
                          uVar13 = *(uint *)pppppdVar53;
                          pppppppdVar31 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 0x10) * 2;
                          unaff_x22 = pppppppdVar52 + (ulong)(byte)(uVar13 >> 8) * 2;
                          pppppppdVar52 =
                               (double *******)
                               ((long)pppppppdVar52 + ((ulong)(uVar13 >> 0x14) & 0xff0));
                          uVar16 = *(uint *)((long)pppppppdVar31 + 0xc);
                          pppppppdVar46 = pppppppdVar51;
                          pppppdVar53 = pppppdVar38;
                          if (uVar16 == 3) {
                            uVar16 = *(uint *)((long)pppppppdVar52 + 0xc);
                            if (uVar16 == 3) {
                              ppppppdVar49 = *pppppppdVar31;
                              ppppppdVar60 = *pppppppdVar52;
                              *(uint *)((long)unaff_x22 + 0xc) = 3;
                              *unaff_x22 = (double ******)
                                           (long)((double)ppppppdVar49 / (double)ppppppdVar60);
                              bVar5 = *(byte *)pppppdVar38;
                              goto LAB_008c86a0;
                            }
                            pppppppdVar35 = pppppppdVar52;
LAB_008c5f04:
                            if ((((uVar16 == 8) &&
                                 (plVar27 = (long *)FUN_008be028(param_1,pppppppdVar35,0xc),
                                 plVar27 != (long *)0x0)) && (*(int *)((long)plVar27 + 0xc) == 7))
                               && (*(char *)(*plVar27 + 6) != '\0')) {
                              lVar50 = *plVar27;
                              plVar29 = *(long **)(param_1 + 0x68);
                              plVar29[1] = plVar27[1];
                              *plVar29 = lVar50;
                              ppppppdVar49 = *pppppppdVar31;
                              plVar29[3] = (long)pppppppdVar31[1];
                              plVar29[2] = (long)ppppppdVar49;
                              ppppppdVar49 = *pppppppdVar52;
                              plVar29[5] = (long)pppppppdVar52[1];
                              plVar29[4] = (long)ppppppdVar49;
                              *(long **)(param_1 + 0x68) = plVar29 + 6;
                              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                              FUN_008cd928(param_1,2,uVar13 >> 8 & 0xff);
                              pppppppdVar52 = *(double ********)(param_1 + 0x70);
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                              switch(*(undefined1 *)pppppdVar38) {
                              case 0:
                                goto switchD_008c3848_caseD_0;
                              case 1:
                                goto switchD_008c3848_caseD_1;
                              case 2:
                                goto switchD_008c3848_caseD_2;
                              case 3:
                                goto switchD_008c3848_caseD_3;
                              case 4:
                                goto switchD_008c3848_caseD_4;
                              case 5:
                                goto switchD_008c3848_caseD_5;
                              case 6:
                                goto switchD_008c3848_caseD_6;
                              case 7:
                                goto switchD_008c3848_caseD_7;
                              case 8:
                                goto switchD_008c3848_caseD_8;
                              case 9:
                                goto switchD_008c3848_caseD_9;
                              case 10:
                                goto switchD_008c3848_caseD_a;
                              case 0xb:
                                goto switchD_008c3848_caseD_b;
                              case 0xc:
                                goto switchD_008c3848_caseD_c;
                              case 0xd:
                                goto switchD_008c3848_caseD_d;
                              case 0xe:
                                goto switchD_008c3848_caseD_e;
                              case 0xf:
                                goto switchD_008c3848_caseD_f;
                              case 0x10:
                                goto switchD_008c3848_caseD_10;
                              case 0x11:
                                goto switchD_008c3848_caseD_11;
                              case 0x12:
                                goto switchD_008c3848_caseD_12;
                              case 0x13:
                                goto switchD_008c3848_caseD_13;
                              case 0x14:
                                goto switchD_008c3848_caseD_14;
                              case 0x15:
                                goto switchD_008c3848_caseD_15;
                              case 0x16:
                                goto switchD_008c3848_caseD_16;
                              case 0x17:
                                goto switchD_008c3848_caseD_17;
                              case 0x18:
                                goto switchD_008c3848_caseD_18;
                              case 0x19:
                                goto switchD_008c3848_caseD_19;
                              case 0x1a:
                                goto switchD_008c3848_caseD_1a;
                              case 0x1b:
                                goto switchD_008c3848_caseD_1b;
                              case 0x1c:
                                goto switchD_008c3848_caseD_1c;
                              case 0x1d:
                                goto switchD_008c3848_caseD_1d;
                              case 0x1e:
                                goto switchD_008c3848_caseD_1e;
                              case 0x1f:
                                goto switchD_008c3848_caseD_1f;
                              case 0x20:
                                goto switchD_008c3848_caseD_20;
                              case 0x21:
                                goto switchD_008c3848_caseD_21;
                              case 0x22:
                                goto switchD_008c3848_caseD_22;
                              case 0x23:
                                goto switchD_008c3848_caseD_23;
                              case 0x24:
                                goto switchD_008c3848_caseD_24;
                              case 0x25:
                                goto switchD_008c3848_caseD_25;
                              case 0x26:
                                goto switchD_008c3848_caseD_26;
                              case 0x27:
                                goto switchD_008c3848_caseD_27;
                              case 0x28:
                                goto switchD_008c3848_caseD_28;
                              case 0x29:
                                goto switchD_008c3848_caseD_29;
                              case 0x2a:
                                goto switchD_008c3848_caseD_2a;
                              case 0x2b:
                                goto switchD_008c3848_caseD_2b;
                              case 0x2c:
                                goto switchD_008c3848_caseD_2c;
                              case 0x2d:
                                goto switchD_008c3848_caseD_2d;
                              case 0x2e:
                                goto switchD_008c3848_caseD_2e;
                              case 0x2f:
                                goto switchD_008c3848_caseD_2f;
                              case 0x30:
                                goto switchD_008c3848_caseD_30;
                              case 0x31:
                                goto switchD_008c3848_caseD_31;
                              case 0x32:
                                goto switchD_008c3848_caseD_32;
                              case 0x33:
                                goto switchD_008c3848_caseD_33;
                              case 0x34:
                                goto switchD_008c3848_caseD_34;
                              case 0x35:
                                goto switchD_008c3848_caseD_35;
                              case 0x36:
                                goto switchD_008c3848_caseD_36;
                              case 0x37:
                                goto switchD_008c3848_caseD_37;
                              case 0x38:
                                goto switchD_008c3848_caseD_38;
                              case 0x39:
                                goto switchD_008c3848_caseD_39;
                              case 0x3a:
                                goto switchD_008c3848_caseD_3a;
                              case 0x3b:
                                goto switchD_008c3848_caseD_3b;
                              case 0x3c:
                                goto switchD_008c3848_caseD_3c;
                              case 0x3d:
                                goto switchD_008c3848_caseD_3d;
                              case 0x3e:
                                goto switchD_008c3848_caseD_3e;
                              case 0x3f:
                                goto switchD_008c3848_caseD_3f;
                              case 0x40:
                                goto switchD_008c3848_caseD_40;
                              case 0x41:
                                goto switchD_008c3848_caseD_41;
                              case 0x42:
                                goto switchD_008c3848_caseD_42;
                              case 0x43:
                                goto switchD_008c3848_caseD_43;
                              case 0x44:
                                goto switchD_008c3848_caseD_44;
                              case 0x45:
                                goto switchD_008c3848_caseD_45;
                              case 0x46:
                                goto switchD_008c3848_caseD_46;
                              case 0x47:
                                goto switchD_008c3848_caseD_47;
                              case 0x48:
                                goto switchD_008c3848_caseD_48;
                              case 0x49:
                                goto switchD_008c3848_caseD_49;
                              case 0x4a:
                                goto switchD_008c3848_caseD_4a;
                              case 0x4b:
                                goto switchD_008c3848_caseD_4b;
                              case 0x4c:
                                goto switchD_008c3848_caseD_4c;
                              case 0x4d:
                                goto switchD_008c3848_caseD_4d;
                              case 0x4e:
                                goto switchD_008c3848_caseD_4e;
                              case 0x4f:
                                goto switchD_008c3848_caseD_4f;
                              case 0x50:
                                goto switchD_008c3848_caseD_50;
                              case 0x52:
                                goto switchD_008c3848_caseD_52;
                              case 0x53:
                                goto switchD_008c3848_caseD_53;
                              case 0x54:
                                goto switchD_008c3848_caseD_54;
                              case 0x55:
                                goto switchD_008c3848_caseD_55;
                              case 0x56:
                                goto switchD_008c3848_caseD_56;
                              case 0x57:
                                goto switchD_008c3848_caseD_57;
                              case 0x58:
                                goto switchD_008c3848_caseD_58;
                              case 0x59:
                                goto switchD_008c3848_caseD_59;
                              case 0x5a:
                                goto switchD_008c3848_caseD_5a;
                              case 0x5b:
                                goto switchD_008c3848_caseD_5b;
                              case 0x5c:
                                goto switchD_008c3848_caseD_5c;
                              case 0x5d:
                                goto switchD_008c3848_caseD_5d;
                              case 0x5e:
                                goto switchD_008c3848_caseD_5e;
                              }
                              goto switchD_008c3848_caseD_51;
                            }
                          }
                          else {
                            pppppppdVar35 = pppppppdVar31;
                            if (uVar16 != 4) goto LAB_008c5f04;
                            if (*(uint *)((long)pppppppdVar52 + 0xc) == 3) {
                              ppppppdVar49 = *pppppppdVar52;
                              ppppppdVar60 = *pppppppdVar31;
                              *(uint *)((long)unaff_x22 + 0xc) = 4;
                              fVar56 = (float)(double)ppppppdVar49;
                              UNRECOVERED_JUMPTABLE =
                                   (code *)(&switchD_008c3848::switchdataD_00c4da78)
                                           [*(byte *)pppppdVar38];
                              fVar57 = *(float *)(pppppppdVar31 + 1);
                              *unaff_x22 = (double ******)
                                           CONCAT44((float)(double)(long)((float)((ulong)
                                                  ppppppdVar60 >> 0x20) / fVar56),
                                                  (float)(double)(long)(SUB84(ppppppdVar60,0) /
                                                                       fVar56));
                              *(float *)(unaff_x22 + 1) = (float)(double)(long)(fVar57 / fVar56);
                              goto LAB_008c86a4;
                            }
                          }
                          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                          FUN_008ccd18(param_1,unaff_x22,pppppppdVar31,pppppppdVar52);
                          pppppppdVar52 = *(double ********)(param_1 + 0x70);
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                          switch(*(undefined1 *)pppppdVar38) {
                          case 0:
                            goto switchD_008c3848_caseD_0;
                          case 1:
                            goto switchD_008c3848_caseD_1;
                          case 2:
                            goto switchD_008c3848_caseD_2;
                          case 3:
                            goto switchD_008c3848_caseD_3;
                          case 4:
                            goto switchD_008c3848_caseD_4;
                          case 5:
                            goto switchD_008c3848_caseD_5;
                          case 6:
                            goto switchD_008c3848_caseD_6;
                          case 7:
                            goto switchD_008c3848_caseD_7;
                          case 8:
                            goto switchD_008c3848_caseD_8;
                          case 9:
                            goto switchD_008c3848_caseD_9;
                          case 10:
                            goto switchD_008c3848_caseD_a;
                          case 0xb:
                            goto switchD_008c3848_caseD_b;
                          case 0xc:
                            goto switchD_008c3848_caseD_c;
                          case 0xd:
                            goto switchD_008c3848_caseD_d;
                          case 0xe:
                            goto switchD_008c3848_caseD_e;
                          case 0xf:
                            goto switchD_008c3848_caseD_f;
                          case 0x10:
                            goto switchD_008c3848_caseD_10;
                          case 0x11:
                            goto switchD_008c3848_caseD_11;
                          case 0x12:
                            goto switchD_008c3848_caseD_12;
                          case 0x13:
                            goto switchD_008c3848_caseD_13;
                          case 0x14:
                            goto switchD_008c3848_caseD_14;
                          case 0x15:
                            goto switchD_008c3848_caseD_15;
                          case 0x16:
                            goto switchD_008c3848_caseD_16;
                          case 0x17:
                            goto switchD_008c3848_caseD_17;
                          case 0x18:
                            goto switchD_008c3848_caseD_18;
                          case 0x19:
                            goto switchD_008c3848_caseD_19;
                          case 0x1a:
                            goto switchD_008c3848_caseD_1a;
                          case 0x1b:
                            goto switchD_008c3848_caseD_1b;
                          case 0x1c:
                            goto switchD_008c3848_caseD_1c;
                          case 0x1d:
                            goto switchD_008c3848_caseD_1d;
                          case 0x1e:
                            goto switchD_008c3848_caseD_1e;
                          case 0x1f:
                            goto switchD_008c3848_caseD_1f;
                          case 0x20:
                            goto switchD_008c3848_caseD_20;
                          case 0x21:
                            goto switchD_008c3848_caseD_21;
                          case 0x22:
                            goto switchD_008c3848_caseD_22;
                          case 0x23:
                            goto switchD_008c3848_caseD_23;
                          case 0x24:
                            goto switchD_008c3848_caseD_24;
                          case 0x25:
                            goto switchD_008c3848_caseD_25;
                          case 0x26:
                            goto switchD_008c3848_caseD_26;
                          case 0x27:
                            goto switchD_008c3848_caseD_27;
                          case 0x28:
                            goto switchD_008c3848_caseD_28;
                          case 0x29:
                            goto switchD_008c3848_caseD_29;
                          case 0x2a:
                            goto switchD_008c3848_caseD_2a;
                          case 0x2b:
                            goto switchD_008c3848_caseD_2b;
                          case 0x2c:
                            goto switchD_008c3848_caseD_2c;
                          case 0x2d:
                            goto switchD_008c3848_caseD_2d;
                          case 0x2e:
                            goto switchD_008c3848_caseD_2e;
                          case 0x2f:
                            goto switchD_008c3848_caseD_2f;
                          case 0x30:
                            goto switchD_008c3848_caseD_30;
                          case 0x31:
                            goto switchD_008c3848_caseD_31;
                          case 0x32:
                            goto switchD_008c3848_caseD_32;
                          case 0x33:
                            goto switchD_008c3848_caseD_33;
                          case 0x34:
                            goto switchD_008c3848_caseD_34;
                          case 0x35:
                            goto switchD_008c3848_caseD_35;
                          case 0x36:
                            goto switchD_008c3848_caseD_36;
                          case 0x37:
                            goto switchD_008c3848_caseD_37;
                          case 0x38:
                            goto switchD_008c3848_caseD_38;
                          case 0x39:
                            goto switchD_008c3848_caseD_39;
                          case 0x3a:
                            goto switchD_008c3848_caseD_3a;
                          case 0x3b:
                            goto switchD_008c3848_caseD_3b;
                          case 0x3c:
                            goto switchD_008c3848_caseD_3c;
                          case 0x3d:
                            goto switchD_008c3848_caseD_3d;
                          case 0x3e:
                            goto switchD_008c3848_caseD_3e;
                          case 0x3f:
                            goto switchD_008c3848_caseD_3f;
                          case 0x40:
                            goto switchD_008c3848_caseD_40;
                          case 0x41:
                            goto switchD_008c3848_caseD_41;
                          case 0x42:
                            goto switchD_008c3848_caseD_42;
                          case 0x43:
                            goto switchD_008c3848_caseD_43;
                          case 0x44:
                            goto switchD_008c3848_caseD_44;
                          case 0x45:
                            goto switchD_008c3848_caseD_45;
                          case 0x46:
                            goto switchD_008c3848_caseD_46;
                          case 0x47:
                            goto switchD_008c3848_caseD_47;
                          case 0x48:
                            goto switchD_008c3848_caseD_48;
                          case 0x49:
                            goto switchD_008c3848_caseD_49;
                          case 0x4a:
                            goto switchD_008c3848_caseD_4a;
                          case 0x4b:
                            goto switchD_008c3848_caseD_4b;
                          case 0x4c:
                            goto switchD_008c3848_caseD_4c;
                          case 0x4d:
                            goto switchD_008c3848_caseD_4d;
                          case 0x4e:
                            goto switchD_008c3848_caseD_4e;
                          case 0x4f:
                            goto switchD_008c3848_caseD_4f;
                          case 0x50:
                            goto switchD_008c3848_caseD_50;
                          case 0x52:
                            goto switchD_008c3848_caseD_52;
                          case 0x53:
switchD_008c3848_caseD_53:
                            do {
                              uVar16 = *(uint *)pppppdVar53;
                              uVar13 = *(uint *)((long)pppppdVar53 + 4);
                              pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
                              if (*(uint *)((long)pppppppdVar52 + 0xc) != 8) {
LAB_008c7cdc:
                                *(uint *)pppppdVar53 = uVar16 & 0xffffff00 | 0xf;
                                *(uint *)((long)pppppdVar53 + 4) = uVar13 & 0xffff;
                                UNRECOVERED_JUMPTABLE = (code *)0x8c3b5c;
LAB_008c7cf0:
                    /* WARNING: Could not recover jumptable at 0x008c7cfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                (*UNRECOVERED_JUMPTABLE)();
                                return;
                              }
                              ppppppdVar49 = *pppppppdVar52;
                              unaff_x22 = (double *******)(ulong)*(byte *)((long)ppppppdVar49 + 3);
                              lVar50 = *(long *)(param_1 + 0x60) + (long)unaff_x22 * 0x48;
                              UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x960);
                              if ((UNRECOVERED_JUMPTABLE == (code *)0x0) ||
                                 (*(int *)(lVar50 + 0x93c) == 0)) goto LAB_008c7cdc;
                              puVar22 = *(undefined8 **)(param_1 + 0x68);
                              uVar23 = *(undefined8 *)(lVar50 + 0x930);
                              pppppdVar38 = pppppdVar53 + 1;
                              puVar22[1] = *(undefined8 *)(lVar50 + 0x938);
                              *puVar22 = uVar23;
                              ppppppdVar60 = *pppppppdVar52;
                              pppppdVar19 = pppppdVar54 + (ulong)(ushort)uVar13 * 2;
                              puVar22[3] = pppppppdVar52[1];
                              puVar22[2] = ppppppdVar60;
                              ppppdVar21 = *pppppdVar19;
                              puVar22[5] = pppppdVar19[1];
                              puVar22[4] = ppppdVar21;
                              *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x30;
                              *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                              sVar6 = *(short *)(param_1 + 0x28);
                              *(short *)(param_1 + 0x28) = sVar6 + 1;
                              if (199 < (ushort)(sVar6 + 1U)) {
                                FUN_008b42d8(param_1);
                              }
                              FUN_008be620(param_1,1,puVar22);
                              local_ac[0] = (ushort)(uVar13 >> 0x10);
                              (*UNRECOVERED_JUMPTABLE)
                                        (param_1,ppppppdVar49 + 2,
                                         (long)*(short *)((long)*pppppdVar19 + 6),local_ac,unaff_x22
                                        );
                              if ((uVar13 >> 0x10 != (uint)local_ac[0]) &&
                                 (*(char *)pppppdVar53 == 'S')) {
                                *(uint *)((long)pppppdVar53 + 4) =
                                     uVar13 & 0xffff | (uint)local_ac[0] << 0x10;
                              }
                              lVar50 = *(long *)(param_1 + 0x50);
                              pppppppdVar52 = *(double ********)(lVar50 + -0x20);
                              *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
                              *(long *)(param_1 + 0x50) = lVar50 + -0x30;
                              *(double ********)(param_1 + 0x70) = pppppppdVar52;
                              ppppppdVar49 = *(double *******)(*(long *)(param_1 + 0x68) + -0x10);
                              (pppppppdVar52 + ((ulong)(uVar16 >> 8) & 0xff) * 2)[1] =
                                   *(double *******)(*(long *)(param_1 + 0x68) + -8);
                              pppppppdVar52[((ulong)(uVar16 >> 8) & 0xff) * 2] = ppppppdVar49;
                              uVar26 = *(undefined1 *)pppppdVar38;
                              *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(lVar50 + -0x18);
                              pppppppdVar46 = pppppppdVar51;
                              pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                              switch(uVar26) {
                              case 0:
                                goto switchD_008c3848_caseD_0;
                              case 1:
                                goto switchD_008c3848_caseD_1;
                              case 2:
                                goto switchD_008c3848_caseD_2;
                              case 3:
                                goto switchD_008c3848_caseD_3;
                              case 4:
                                goto switchD_008c3848_caseD_4;
                              case 5:
                                goto switchD_008c3848_caseD_5;
                              case 6:
                                goto switchD_008c3848_caseD_6;
                              case 7:
                                goto switchD_008c3848_caseD_7;
                              case 8:
                                goto switchD_008c3848_caseD_8;
                              case 9:
                                goto switchD_008c3848_caseD_9;
                              case 10:
                                goto switchD_008c3848_caseD_a;
                              case 0xb:
                                goto switchD_008c3848_caseD_b;
                              case 0xc:
                                goto switchD_008c3848_caseD_c;
                              case 0xd:
                                goto switchD_008c3848_caseD_d;
                              case 0xe:
                                goto switchD_008c3848_caseD_e;
                              case 0xf:
                                goto switchD_008c3848_caseD_f;
                              case 0x10:
                                goto switchD_008c3848_caseD_10;
                              case 0x11:
                                goto switchD_008c3848_caseD_11;
                              case 0x12:
                                goto switchD_008c3848_caseD_12;
                              case 0x13:
                                goto switchD_008c3848_caseD_13;
                              case 0x14:
                                goto switchD_008c3848_caseD_14;
                              case 0x15:
                                goto switchD_008c3848_caseD_15;
                              case 0x16:
                                goto switchD_008c3848_caseD_16;
                              case 0x17:
                                goto switchD_008c3848_caseD_17;
                              case 0x18:
                                goto switchD_008c3848_caseD_18;
                              case 0x19:
                                goto switchD_008c3848_caseD_19;
                              case 0x1a:
                                goto switchD_008c3848_caseD_1a;
                              case 0x1b:
                                goto switchD_008c3848_caseD_1b;
                              case 0x1c:
                                goto switchD_008c3848_caseD_1c;
                              case 0x1d:
                                goto switchD_008c3848_caseD_1d;
                              case 0x1e:
                                goto switchD_008c3848_caseD_1e;
                              case 0x1f:
                                goto switchD_008c3848_caseD_1f;
                              case 0x20:
                                goto switchD_008c3848_caseD_20;
                              case 0x21:
                                goto switchD_008c3848_caseD_21;
                              case 0x22:
                                goto switchD_008c3848_caseD_22;
                              case 0x23:
                                goto switchD_008c3848_caseD_23;
                              case 0x24:
                                goto switchD_008c3848_caseD_24;
                              case 0x25:
                                goto switchD_008c3848_caseD_25;
                              case 0x26:
                                goto switchD_008c3848_caseD_26;
                              case 0x27:
                                goto switchD_008c3848_caseD_27;
                              case 0x28:
                                goto switchD_008c3848_caseD_28;
                              case 0x29:
                                goto switchD_008c3848_caseD_29;
                              case 0x2a:
                                goto switchD_008c3848_caseD_2a;
                              case 0x2b:
                                goto switchD_008c3848_caseD_2b;
                              case 0x2c:
                                goto switchD_008c3848_caseD_2c;
                              case 0x2d:
                                goto switchD_008c3848_caseD_2d;
                              case 0x2e:
                                goto switchD_008c3848_caseD_2e;
                              case 0x2f:
                                goto switchD_008c3848_caseD_2f;
                              case 0x30:
                                goto switchD_008c3848_caseD_30;
                              case 0x31:
                                goto switchD_008c3848_caseD_31;
                              case 0x32:
                                goto switchD_008c3848_caseD_32;
                              case 0x33:
                                goto switchD_008c3848_caseD_33;
                              case 0x34:
                                goto switchD_008c3848_caseD_34;
                              case 0x35:
                                goto switchD_008c3848_caseD_35;
                              case 0x36:
                                goto switchD_008c3848_caseD_36;
                              case 0x37:
                                goto switchD_008c3848_caseD_37;
                              case 0x38:
                                goto switchD_008c3848_caseD_38;
                              case 0x39:
                                goto switchD_008c3848_caseD_39;
                              case 0x3a:
                                goto switchD_008c3848_caseD_3a;
                              case 0x3b:
                                goto switchD_008c3848_caseD_3b;
                              case 0x3c:
                                goto switchD_008c3848_caseD_3c;
                              case 0x3d:
                                goto switchD_008c3848_caseD_3d;
                              case 0x3e:
                                goto switchD_008c3848_caseD_3e;
                              case 0x3f:
                                goto switchD_008c3848_caseD_3f;
                              case 0x40:
                                goto switchD_008c3848_caseD_40;
                              case 0x41:
                                goto switchD_008c3848_caseD_41;
                              case 0x42:
                                goto switchD_008c3848_caseD_42;
                              case 0x43:
                                goto switchD_008c3848_caseD_43;
                              case 0x44:
                                goto switchD_008c3848_caseD_44;
                              case 0x45:
                                goto switchD_008c3848_caseD_45;
                              case 0x46:
                                goto switchD_008c3848_caseD_46;
                              case 0x47:
                                goto switchD_008c3848_caseD_47;
                              case 0x48:
                                goto switchD_008c3848_caseD_48;
                              case 0x49:
                                goto switchD_008c3848_caseD_49;
                              case 0x4a:
                                goto switchD_008c3848_caseD_4a;
                              case 0x4b:
                                goto switchD_008c3848_caseD_4b;
                              case 0x4c:
                                goto switchD_008c3848_caseD_4c;
                              case 0x4d:
                                goto switchD_008c3848_caseD_4d;
                              case 0x4e:
                                goto switchD_008c3848_caseD_4e;
                              case 0x4f:
                                goto switchD_008c3848_caseD_4f;
                              case 0x50:
                                goto switchD_008c3848_caseD_50;
                              case 0x51:
                                goto switchD_008c3848_caseD_51;
                              case 0x52:
                                goto switchD_008c3848_caseD_52;
                              case 0x54:
switchD_008c3848_caseD_54:
                                do {
                                  uVar16 = *(uint *)pppppdVar53;
                                  uVar13 = *(uint *)((long)pppppdVar53 + 4);
                                  pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
                                  if (*(uint *)((long)pppppppdVar46 + 0xc) != 8) {
LAB_008c7d50:
                                    *(uint *)pppppdVar53 = uVar16 & 0xffffff00 | 0x10;
                                    *(uint *)((long)pppppdVar53 + 4) = uVar13 & 0xffff;
                                    pppppdVar38 = pppppdVar53;
                                    goto switchD_008c3848_caseD_10;
                                  }
                                  ppppppdVar49 = *pppppppdVar46;
                                  unaff_x22 = (double *******)
                                              (ulong)*(byte *)((long)ppppppdVar49 + 3);
                                  lVar50 = *(long *)(param_1 + 0x60) + (long)unaff_x22 * 0x48;
                                  UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x968);
                                  if ((UNRECOVERED_JUMPTABLE == (code *)0x0) ||
                                     (*(int *)(lVar50 + 0x94c) == 0)) goto LAB_008c7d50;
                                  uVar23 = *(undefined8 *)(lVar50 + 0x940);
                                  pppppdVar38 = pppppdVar53 + 1;
                                  puVar22 = *(undefined8 **)(param_1 + 0x68);
                                  puVar22[1] = *(undefined8 *)(lVar50 + 0x948);
                                  *puVar22 = uVar23;
                                  ppppppdVar60 = *pppppppdVar46;
                                  pppppdVar19 = pppppdVar54 + (ulong)(ushort)uVar13 * 2;
                                  puVar22[3] = pppppppdVar46[1];
                                  puVar22[2] = ppppppdVar60;
                                  ppppdVar21 = *pppppdVar19;
                                  puVar22[5] = pppppdVar19[1];
                                  puVar22[4] = ppppdVar21;
                                  ppppppdVar60 = pppppppdVar52[(ulong)(byte)(uVar16 >> 8) * 2];
                                  puVar22[7] = (pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2)[1];
                                  puVar22[6] = ppppppdVar60;
                                  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x40;
                                  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
                                  sVar6 = *(short *)(param_1 + 0x28);
                                  *(short *)(param_1 + 0x28) = sVar6 + 1;
                                  if (199 < (ushort)(sVar6 + 1U)) {
                                    FUN_008b42d8(param_1);
                                  }
                                  FUN_008be620(param_1,0,puVar22);
                                  local_b0[0] = (ushort)(uVar13 >> 0x10);
                                  (*UNRECOVERED_JUMPTABLE)
                                            (param_1,ppppppdVar49 + 2,
                                             (long)*(short *)((long)*pppppdVar19 + 6),local_b0,
                                             unaff_x22);
                                  if ((uVar13 >> 0x10 != (uint)local_b0[0]) &&
                                     (*(char *)pppppdVar53 == 'T')) {
                                    *(uint *)((long)pppppdVar53 + 4) =
                                         uVar13 & 0xffff | (uint)local_b0[0] << 0x10;
                                  }
                                  uVar26 = *(undefined1 *)pppppdVar38;
                                  pauVar1 = (undefined1 (*) [16])(*(long *)(param_1 + 0x50) + -0x20)
                                  ;
                                  pppppppdVar52 = *(double ********)*pauVar1;
                                  auVar8 = *pauVar1;
                                  auVar61 = *pauVar1;
                                  *(long *)(param_1 + 0x50) = *(long *)(param_1 + 0x50) + -0x30;
                                  auVar61 = NEON_ext(auVar61,auVar8,8,1);
                                  *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
                                  *(long *)(param_1 + 0x70) = auVar61._8_8_;
                                  *(long *)(param_1 + 0x68) = auVar61._0_8_;
                                  pppppppdVar46 = pppppppdVar51;
                                  pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                  switch(uVar26) {
                                  case 0:
                                    goto switchD_008c3848_caseD_0;
                                  case 1:
                                    goto switchD_008c3848_caseD_1;
                                  case 2:
                                    goto switchD_008c3848_caseD_2;
                                  case 3:
                                    goto switchD_008c3848_caseD_3;
                                  case 4:
                                    goto switchD_008c3848_caseD_4;
                                  case 5:
                                    goto switchD_008c3848_caseD_5;
                                  case 6:
                                    goto switchD_008c3848_caseD_6;
                                  case 7:
                                    goto switchD_008c3848_caseD_7;
                                  case 8:
                                    goto switchD_008c3848_caseD_8;
                                  case 9:
                                    goto switchD_008c3848_caseD_9;
                                  case 10:
                                    goto switchD_008c3848_caseD_a;
                                  case 0xb:
                                    goto switchD_008c3848_caseD_b;
                                  case 0xc:
                                    goto switchD_008c3848_caseD_c;
                                  case 0xd:
                                    goto switchD_008c3848_caseD_d;
                                  case 0xe:
                                    goto switchD_008c3848_caseD_e;
                                  case 0xf:
                                    goto switchD_008c3848_caseD_f;
                                  case 0x10:
                                    goto switchD_008c3848_caseD_10;
                                  case 0x11:
                                    goto switchD_008c3848_caseD_11;
                                  case 0x12:
                                    goto switchD_008c3848_caseD_12;
                                  case 0x13:
                                    goto switchD_008c3848_caseD_13;
                                  case 0x14:
                                    goto switchD_008c3848_caseD_14;
                                  case 0x15:
                                    goto switchD_008c3848_caseD_15;
                                  case 0x16:
                                    goto switchD_008c3848_caseD_16;
                                  case 0x17:
                                    goto switchD_008c3848_caseD_17;
                                  case 0x18:
                                    goto switchD_008c3848_caseD_18;
                                  case 0x19:
                                    goto switchD_008c3848_caseD_19;
                                  case 0x1a:
                                    goto switchD_008c3848_caseD_1a;
                                  case 0x1b:
                                    goto switchD_008c3848_caseD_1b;
                                  case 0x1c:
                                    goto switchD_008c3848_caseD_1c;
                                  case 0x1d:
                                    goto switchD_008c3848_caseD_1d;
                                  case 0x1e:
                                    goto switchD_008c3848_caseD_1e;
                                  case 0x1f:
                                    goto switchD_008c3848_caseD_1f;
                                  case 0x20:
                                    goto switchD_008c3848_caseD_20;
                                  case 0x21:
                                    goto switchD_008c3848_caseD_21;
                                  case 0x22:
                                    goto switchD_008c3848_caseD_22;
                                  case 0x23:
                                    goto switchD_008c3848_caseD_23;
                                  case 0x24:
                                    goto switchD_008c3848_caseD_24;
                                  case 0x25:
                                    goto switchD_008c3848_caseD_25;
                                  case 0x26:
                                    goto switchD_008c3848_caseD_26;
                                  case 0x27:
                                    goto switchD_008c3848_caseD_27;
                                  case 0x28:
                                    goto switchD_008c3848_caseD_28;
                                  case 0x29:
                                    goto switchD_008c3848_caseD_29;
                                  case 0x2a:
                                    goto switchD_008c3848_caseD_2a;
                                  case 0x2b:
                                    goto switchD_008c3848_caseD_2b;
                                  case 0x2c:
                                    goto switchD_008c3848_caseD_2c;
                                  case 0x2d:
                                    goto switchD_008c3848_caseD_2d;
                                  case 0x2e:
                                    goto switchD_008c3848_caseD_2e;
                                  case 0x2f:
                                    goto switchD_008c3848_caseD_2f;
                                  case 0x30:
                                    goto switchD_008c3848_caseD_30;
                                  case 0x31:
                                    goto switchD_008c3848_caseD_31;
                                  case 0x32:
                                    goto switchD_008c3848_caseD_32;
                                  case 0x33:
                                    goto switchD_008c3848_caseD_33;
                                  case 0x34:
                                    goto switchD_008c3848_caseD_34;
                                  case 0x35:
                                    goto switchD_008c3848_caseD_35;
                                  case 0x36:
                                    goto switchD_008c3848_caseD_36;
                                  case 0x37:
                                    goto switchD_008c3848_caseD_37;
                                  case 0x38:
                                    goto switchD_008c3848_caseD_38;
                                  case 0x39:
                                    goto switchD_008c3848_caseD_39;
                                  case 0x3a:
                                    goto switchD_008c3848_caseD_3a;
                                  case 0x3b:
                                    goto switchD_008c3848_caseD_3b;
                                  case 0x3c:
                                    goto switchD_008c3848_caseD_3c;
                                  case 0x3d:
                                    goto switchD_008c3848_caseD_3d;
                                  case 0x3e:
                                    goto switchD_008c3848_caseD_3e;
                                  case 0x3f:
                                    goto switchD_008c3848_caseD_3f;
                                  case 0x40:
                                    goto switchD_008c3848_caseD_40;
                                  case 0x41:
                                    goto switchD_008c3848_caseD_41;
                                  case 0x42:
                                    goto switchD_008c3848_caseD_42;
                                  case 0x43:
                                    goto switchD_008c3848_caseD_43;
                                  case 0x44:
                                    goto switchD_008c3848_caseD_44;
                                  case 0x45:
                                    goto switchD_008c3848_caseD_45;
                                  case 0x46:
                                    goto switchD_008c3848_caseD_46;
                                  case 0x47:
                                    goto switchD_008c3848_caseD_47;
                                  case 0x48:
                                    goto switchD_008c3848_caseD_48;
                                  case 0x49:
                                    goto switchD_008c3848_caseD_49;
                                  case 0x4a:
                                    goto switchD_008c3848_caseD_4a;
                                  case 0x4b:
                                    goto switchD_008c3848_caseD_4b;
                                  case 0x4c:
                                    goto switchD_008c3848_caseD_4c;
                                  case 0x4d:
                                    goto switchD_008c3848_caseD_4d;
                                  case 0x4e:
                                    goto switchD_008c3848_caseD_4e;
                                  case 0x4f:
                                    goto switchD_008c3848_caseD_4f;
                                  case 0x50:
                                    goto switchD_008c3848_caseD_50;
                                  case 0x51:
                                    goto switchD_008c3848_caseD_51;
                                  case 0x52:
                                    goto switchD_008c3848_caseD_52;
                                  case 0x53:
                                    goto switchD_008c3848_caseD_53;
                                  case 0x55:
switchD_008c3848_caseD_55:
                                    do {
                                      uVar16 = *(uint *)pppppdVar53;
                                      uVar13 = *(uint *)((long)pppppdVar53 + 4);
                                      pppppppdVar46 =
                                           pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
                                      if (*(uint *)((long)pppppppdVar46 + 0xc) != 8) {
LAB_008c80b0:
                                        *(uint *)pppppdVar53 = uVar16 & 0xffffff00 | 0x14;
                                        *(uint *)((long)pppppdVar53 + 4) = uVar13 & 0xffff;
                                        UNRECOVERED_JUMPTABLE = (code *)0x8c451c;
                                        goto LAB_008c7cf0;
                                      }
                                      ppppppdVar49 = *pppppppdVar46;
                                      uVar30 = (ulong)*(byte *)((long)ppppppdVar49 + 3);
                                      lVar50 = *(long *)(param_1 + 0x60) + uVar30 * 0x48;
                                      UNRECOVERED_JUMPTABLE = *(code **)(lVar50 + 0x970);
                                      if ((UNRECOVERED_JUMPTABLE == (code *)0x0) ||
                                         (*(int *)(lVar50 + 0x95c) == 0)) goto LAB_008c80b0;
                                      ppppppdVar60 = *pppppppdVar46;
                                      pppppppdVar52 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2
                                      ;
                                      pppppppdVar52[3] = pppppppdVar46[1];
                                      pppppppdVar52[2] = ppppppdVar60;
                                      ppppppdVar60 = *(double *******)(lVar50 + 0x950);
                                      pppppppdVar52[1] = *(double *******)(lVar50 + 0x958);
                                      *pppppppdVar52 = ppppppdVar60;
                                      uVar16 = *(uint *)(pppppdVar53 + 1);
                                      lVar50 = 0x10;
                                      if ((uVar16 & 0xff) != 0x57) {
                                        lVar50 = 0xc;
                                      }
                                      pppppdVar38 = (double *****)((long)pppppdVar53 + lVar50);
                                      uVar44 = (ulong)(uVar16 >> 0x10) & 0xff;
                                      *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                           pppppdVar38;
                                      *(double *****)(param_1 + 8) =
                                           pppppdVar54[(ulong)(ushort)uVar13 * 2];
                                      if ((int)uVar44 == 0) {
                                        pppppppdVar52 = *(double ********)(param_1 + 0x68);
                                      }
                                      else {
                                        pppppppdVar52 = pppppppdVar52 + uVar44 * 2;
                                      }
                                      *(double ********)(param_1 + 0x68) = pppppppdVar52;
                                      uVar12 = (uVar16 >> 0x18) - 1;
                                      unaff_x22 = (double *******)(ulong)uVar12;
                                      FUN_008be620(param_1,unaff_x22);
                                      local_b4[0] = (ushort)(uVar13 >> 0x10);
                                      uVar15 = (*UNRECOVERED_JUMPTABLE)
                                                         (param_1,ppppppdVar49 + 2,
                                                          (long)*(short *)((long)pppppdVar54
                                                                                 [(ulong)(ushort)
                                                  uVar13 * 2] + 6),local_b4,uVar30);
                                      if ((uVar13 >> 0x10 != (uint)local_b4[0]) &&
                                         (*(char *)pppppdVar53 == 'U')) {
                                        *(uint *)((long)pppppdVar53 + 4) =
                                             uVar13 & 0xffff | (uint)local_b4[0] << 0x10;
                                      }
                                      if ((int)uVar15 < 0) goto LAB_008c8794;
                                      lVar50 = *(long *)(param_1 + 0x50);
                                      puVar22 = *(undefined8 **)(lVar50 + 8);
                                      if ((uVar12 == 0) || (uVar15 == 0)) {
                                        puVar37 = puVar22;
                                        if (0 < (int)uVar12) goto LAB_008c7ffc;
                                      }
                                      else {
                                        puVar32 = *(undefined8 **)(param_1 + 0x68);
                                        puVar37 = puVar22;
                                        puVar40 = puVar32 + (ulong)uVar15 * -2;
                                        do {
                                          puVar39 = puVar40 + 2;
                                          uVar23 = *puVar40;
                                          uVar12 = (int)unaff_x22 - 1;
                                          unaff_x22 = (double *******)(ulong)uVar12;
                                          puVar22 = puVar37 + 2;
                                          puVar37[1] = puVar40[1];
                                          *puVar37 = uVar23;
                                          if (uVar12 == 0) break;
                                          puVar37 = puVar22;
                                          puVar40 = puVar39;
                                        } while (puVar39 < puVar32);
                                        puVar37 = puVar22;
                                        if (0 < (int)uVar12) {
LAB_008c7ffc:
                                          if (uVar12 == 1) {
                                            puVar22 = puVar37;
                                          }
                                          else {
                                            pppppppdVar46 =
                                                 (double *******)((ulong)unaff_x22 & 0x7ffffffe);
                                            puVar22 = puVar37 + (long)pppppppdVar46 * 2;
                                            pppppppdVar31 =
                                                 (double *******)
                                                 (ulong)(uint)((int)unaff_x22 - (int)pppppppdVar46);
                                            puVar34 = (undefined4 *)((long)puVar37 + 0x1c);
                                            pppppppdVar52 = pppppppdVar46;
                                            do {
                                              pppppppdVar52 =
                                                   (double *******)((long)pppppppdVar52 + -2);
                                              puVar34[-4] = 0;
                                              *puVar34 = 0;
                                              puVar34 = puVar34 + 8;
                                            } while (pppppppdVar52 != (double *******)0x0);
                                            bVar10 = pppppppdVar46 == unaff_x22;
                                            unaff_x22 = pppppppdVar31;
                                            if (bVar10) goto LAB_008c8080;
                                          }
                                          uVar13 = (int)unaff_x22 + 1;
                                          puVar37 = puVar22;
                                          do {
                                            uVar13 = uVar13 - 1;
                                            puVar22 = puVar37 + 2;
                                            *(undefined4 *)((long)puVar37 + 0xc) = 0;
                                            puVar37 = puVar22;
                                          } while (1 < uVar13);
                                        }
                                      }
LAB_008c8080:
                                      pppppppdVar52 = *(double ********)(lVar50 + -0x20);
                                      *(long *)(param_1 + 0x50) = lVar50 + -0x30;
                                      *(double ********)(param_1 + 0x70) = pppppppdVar52;
                                      if ((uVar16 & 0xff000000) != 0) {
                                        puVar22 = *(undefined8 **)(lVar50 + -0x18);
                                      }
                                      uVar26 = *(undefined1 *)pppppdVar38;
                                      *(undefined8 **)(param_1 + 0x68) = puVar22;
                                      pppppppdVar46 = pppppppdVar51;
                                      pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                      switch(uVar26) {
                                      case 0:
                                        goto switchD_008c3848_caseD_0;
                                      case 1:
                                        goto switchD_008c3848_caseD_1;
                                      case 2:
                                        goto switchD_008c3848_caseD_2;
                                      case 3:
                                        goto switchD_008c3848_caseD_3;
                                      case 4:
                                        goto switchD_008c3848_caseD_4;
                                      case 5:
                                        goto switchD_008c3848_caseD_5;
                                      case 6:
                                        goto switchD_008c3848_caseD_6;
                                      case 7:
                                        goto switchD_008c3848_caseD_7;
                                      case 8:
                                        goto switchD_008c3848_caseD_8;
                                      case 9:
                                        goto switchD_008c3848_caseD_9;
                                      case 10:
                                        goto switchD_008c3848_caseD_a;
                                      case 0xb:
                                        goto switchD_008c3848_caseD_b;
                                      case 0xc:
                                        goto switchD_008c3848_caseD_c;
                                      case 0xd:
                                        goto switchD_008c3848_caseD_d;
                                      case 0xe:
                                        goto switchD_008c3848_caseD_e;
                                      case 0xf:
                                        goto switchD_008c3848_caseD_f;
                                      case 0x10:
                                        goto switchD_008c3848_caseD_10;
                                      case 0x11:
                                        goto switchD_008c3848_caseD_11;
                                      case 0x12:
                                        goto switchD_008c3848_caseD_12;
                                      case 0x13:
                                        goto switchD_008c3848_caseD_13;
                                      case 0x14:
                                        goto switchD_008c3848_caseD_14;
                                      case 0x15:
                                        goto switchD_008c3848_caseD_15;
                                      case 0x16:
                                        goto switchD_008c3848_caseD_16;
                                      case 0x17:
                                        goto switchD_008c3848_caseD_17;
                                      case 0x18:
                                        goto switchD_008c3848_caseD_18;
                                      case 0x19:
                                        goto switchD_008c3848_caseD_19;
                                      case 0x1a:
                                        goto switchD_008c3848_caseD_1a;
                                      case 0x1b:
                                        goto switchD_008c3848_caseD_1b;
                                      case 0x1c:
                                        goto switchD_008c3848_caseD_1c;
                                      case 0x1d:
                                        goto switchD_008c3848_caseD_1d;
                                      case 0x1e:
                                        goto switchD_008c3848_caseD_1e;
                                      case 0x1f:
                                        goto switchD_008c3848_caseD_1f;
                                      case 0x20:
                                        goto switchD_008c3848_caseD_20;
                                      case 0x21:
                                        goto switchD_008c3848_caseD_21;
                                      case 0x22:
                                        goto switchD_008c3848_caseD_22;
                                      case 0x23:
                                        goto switchD_008c3848_caseD_23;
                                      case 0x24:
                                        goto switchD_008c3848_caseD_24;
                                      case 0x25:
                                        goto switchD_008c3848_caseD_25;
                                      case 0x26:
                                        goto switchD_008c3848_caseD_26;
                                      case 0x27:
                                        goto switchD_008c3848_caseD_27;
                                      case 0x28:
                                        goto switchD_008c3848_caseD_28;
                                      case 0x29:
                                        goto switchD_008c3848_caseD_29;
                                      case 0x2a:
                                        goto switchD_008c3848_caseD_2a;
                                      case 0x2b:
                                        goto switchD_008c3848_caseD_2b;
                                      case 0x2c:
                                        goto switchD_008c3848_caseD_2c;
                                      case 0x2d:
                                        goto switchD_008c3848_caseD_2d;
                                      case 0x2e:
                                        goto switchD_008c3848_caseD_2e;
                                      case 0x2f:
                                        goto switchD_008c3848_caseD_2f;
                                      case 0x30:
                                        goto switchD_008c3848_caseD_30;
                                      case 0x31:
                                        goto switchD_008c3848_caseD_31;
                                      case 0x32:
                                        goto switchD_008c3848_caseD_32;
                                      case 0x33:
                                        goto switchD_008c3848_caseD_33;
                                      case 0x34:
                                        goto switchD_008c3848_caseD_34;
                                      case 0x35:
                                        goto switchD_008c3848_caseD_35;
                                      case 0x36:
                                        goto switchD_008c3848_caseD_36;
                                      case 0x37:
                                        goto switchD_008c3848_caseD_37;
                                      case 0x38:
                                        goto switchD_008c3848_caseD_38;
                                      case 0x39:
                                        goto switchD_008c3848_caseD_39;
                                      case 0x3a:
                                        goto switchD_008c3848_caseD_3a;
                                      case 0x3b:
                                        goto switchD_008c3848_caseD_3b;
                                      case 0x3c:
                                        goto switchD_008c3848_caseD_3c;
                                      case 0x3d:
                                        goto switchD_008c3848_caseD_3d;
                                      case 0x3e:
                                        goto switchD_008c3848_caseD_3e;
                                      case 0x3f:
                                        goto switchD_008c3848_caseD_3f;
                                      case 0x40:
                                        goto switchD_008c3848_caseD_40;
                                      case 0x41:
                                        goto switchD_008c3848_caseD_41;
                                      case 0x42:
                                        goto switchD_008c3848_caseD_42;
                                      case 0x43:
                                        goto switchD_008c3848_caseD_43;
                                      case 0x44:
                                        goto switchD_008c3848_caseD_44;
                                      case 0x45:
                                        goto switchD_008c3848_caseD_45;
                                      case 0x46:
                                        goto switchD_008c3848_caseD_46;
                                      case 0x47:
                                        goto switchD_008c3848_caseD_47;
                                      case 0x48:
                                        goto switchD_008c3848_caseD_48;
                                      case 0x49:
                                        goto switchD_008c3848_caseD_49;
                                      case 0x4a:
                                        goto switchD_008c3848_caseD_4a;
                                      case 0x4b:
                                        goto switchD_008c3848_caseD_4b;
                                      case 0x4c:
                                        goto switchD_008c3848_caseD_4c;
                                      case 0x4d:
                                        goto switchD_008c3848_caseD_4d;
                                      case 0x4e:
                                        goto switchD_008c3848_caseD_4e;
                                      case 0x4f:
                                        goto switchD_008c3848_caseD_4f;
                                      case 0x50:
                                        goto switchD_008c3848_caseD_50;
                                      case 0x51:
                                        goto switchD_008c3848_caseD_51;
                                      case 0x52:
                                        goto switchD_008c3848_caseD_52;
                                      case 0x53:
                                        goto switchD_008c3848_caseD_53;
                                      case 0x54:
                                        goto switchD_008c3848_caseD_54;
                                      case 0x56:
                                        goto switchD_008c3848_caseD_56;
                                      case 0x57:
switchD_008c3848_caseD_57:
                                        do {
                                          UNRECOVERED_JUMPTABLE =
                                               *(code **)(*(long *)(param_1 + 0x60) + 0x688);
                                          if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                                            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                 pppppdVar38;
                                            *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
                                                 *(long *)(*(long *)(param_1 + 0x50) + 0x20) + 4;
                                            (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
                                            if (*(char *)(param_1 + 3) != '\0') goto LAB_008c8784;
                                            pppppppdVar52 = *(double ********)(param_1 + 0x70);
                                          }
                                          pppppdVar53 = pppppdVar38 + 1;
                                          uVar16 = *(uint *)pppppdVar38;
                                          uVar13 = *(uint *)((long)pppppdVar38 + 4);
                                          pppppppdVar52 =
                                               pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
                                          pppppppdVar46 = pppppppdVar52 + 2;
                                          pppppppdVar31 = *(double ********)(param_1 + 0x68);
                                          if ((uVar16 >> 0x10 & 0xff) != 0) {
                                            pppppppdVar31 =
                                                 pppppppdVar46 +
                                                 (ulong)(byte)(uVar16 >> 0x10) * 2 + -2;
                                          }
                                          if (*(uint *)((long)pppppppdVar52 + 0xc) != 7) {
                                            if (uVar13 != 0xffffffff) {
                                              *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
                                            }
                                            *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                                 pppppdVar53;
                                            FUN_008cda50(param_1,pppppppdVar52);
                                            pppppppdVar31 = pppppppdVar31 + 2;
                                          }
                                          unaff_x22 = (double *******)*pppppppdVar52;
                                          *(double ******)(*(long *)(param_1 + 0x50) + 0x20) =
                                               pppppdVar53;
                                          if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)
                                             ) {
                                            pdVar20 = (double *)FUN_008b4200(param_1);
                                          }
                                          else {
                                            pdVar20 = (double *)(*(long *)(param_1 + 0x50) + 0x30);
                                            *(double **)(param_1 + 0x50) = pdVar20;
                                          }
                                          cVar3 = *(char *)((long)unaff_x22 + 6);
                                          pdVar20[1] = (double)pppppppdVar52;
                                          if (cVar3 == '\0') {
                                            ppppppdVar49 = unaff_x22[3];
                                            if ((DAT_00d1fdf0 == '\x01') &&
                                               (ppppppdVar60 = (double ******)ppppppdVar49[0x1a],
                                               (double ******)ppppppdVar49[0x1a] !=
                                               (double ******)0x0)) {
                                              do {
                                                ppppppdVar49 = ppppppdVar60;
                                                unaff_x22[3] = ppppppdVar49;
                                                ppppppdVar60 = (double ******)ppppppdVar49[0x1a];
                                              } while ((double ******)ppppppdVar49[0x1a] !=
                                                       (double ******)0x0);
                                              *(undefined1 *)((long)unaff_x22 + 4) =
                                                   *(undefined1 *)((long)ppppppdVar49 + 5);
                                            }
                                          }
                                          else {
                                            ppppppdVar49 = (double ******)0x0;
                                          }
                                          bVar5 = *(byte *)((long)unaff_x22 + 4);
                                          *pdVar20 = (double)ppppppdVar49;
                                          pdVar20[4] = 0.0;
                                          lVar50 = *(long *)(param_1 + 0x48);
                                          pdVar20[2] = (double)pppppppdVar46;
                                          pdVar20[3] = (double)(pppppppdVar31 + (ulong)bVar5 * 2);
                                          bVar5 = *(byte *)((long)unaff_x22 + 4);
                                          uVar12 = (uVar16 >> 0x18) - 1;
                                          *(uint *)(pdVar20 + 5) = uVar12;
                                          *(undefined4 *)((long)pdVar20 + 0x2c) = 0;
                                          *(double ********)(param_1 + 0x68) = pppppppdVar31;
                                          *(double ********)(param_1 + 0x70) = pppppppdVar46;
                                          if (lVar50 - (long)pppppppdVar31 <=
                                              (long)((ulong)bVar5 * 0x10)) {
                                            iVar14 = *(int *)(param_1 + 0x40);
                                            iVar11 = iVar14 + (uint)bVar5;
                                            if ((int)(uint)bVar5 <= iVar14) {
                                              iVar11 = iVar14 << 1;
                                            }
                                            FUN_008b3fdc(param_1,iVar11,1);
                                          }
                                          if (*(char *)((long)unaff_x22 + 6) != '\0') {
                                            if (uVar13 != 0xffffffff) {
                                              *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
                                            }
                                            uVar13 = (*(code *)unaff_x22[5])(param_1);
                                            if ((int)uVar13 < 0) goto LAB_008c8794;
                                            lVar50 = *(long *)(param_1 + 0x50);
                                            puVar37 = *(undefined8 **)(lVar50 + 8);
                                            puVar22 = puVar37;
                                            if (uVar12 == 0) goto LAB_008c4fbc;
                                            if (uVar13 == 0) goto LAB_008c4f3c;
                                            puVar32 = *(undefined8 **)(param_1 + 0x68);
                                            puVar40 = puVar32 + (ulong)uVar13 * -2;
                                            goto LAB_008c4f20;
                                          }
                                          ppppppdVar49 = unaff_x22[3];
                                          if (DAT_00d1f4f8 == '\x01') {
                                            *(int *)(ppppppdVar49 + 9) =
                                                 *(int *)(ppppppdVar49 + 9) + 1;
                                          }
                                          if ((uVar13 != 0xffffffff) &&
                                             (uVar30 = FUN_008b51c8(param_1,pppppppdVar51,unaff_x22,
                                                                    uVar13), (uVar30 & 1) == 0)) {
                                            *(uint *)((long)pppppdVar38 + 4) = 0xffffffff;
                                          }
                                          pppppppdVar46 = *(double ********)(param_1 + 0x68);
                                          pppppppdVar52 = *(double ********)(param_1 + 0x70);
                                          pppppppdVar51 =
                                               pppppppdVar52 +
                                               (ulong)*(byte *)((long)ppppppdVar49 + 7) * 2;
                                          if (pppppppdVar46 < pppppppdVar51) {
                                            pppppppdVar31 = pppppppdVar51;
                                            if (pppppppdVar51 <= pppppppdVar46 + 2) {
                                              pppppppdVar31 = pppppppdVar46 + 2;
                                            }
                                            if ((long)pppppppdVar31 + ~(ulong)pppppppdVar46 < 0x10)
                                            {
LAB_008c4e34:
                                              do {
                                                pppppppdVar31 = pppppppdVar46 + 2;
                                                *(uint *)((long)pppppppdVar46 + 0xc) = 0;
                                                pppppppdVar46 = pppppppdVar31;
                                              } while (pppppppdVar31 < pppppppdVar51);
                                            }
                                            else {
                                              uVar30 = ((long)pppppppdVar31 + ~(ulong)pppppppdVar46
                                                       >> 4) + 1;
                                              uVar48 = uVar30 & 0x1ffffffffffffffe;
                                              pppppppdVar31 = pppppppdVar46 + uVar48 * 2;
                                              puVar36 = (uint *)((long)pppppppdVar46 + 0x1c);
                                              uVar44 = uVar48;
                                              do {
                                                uVar44 = uVar44 - 2;
                                                puVar36[-4] = 0;
                                                *puVar36 = 0;
                                                puVar36 = puVar36 + 8;
                                              } while (uVar44 != 0);
                                              pppppppdVar46 = pppppppdVar31;
                                              if (uVar30 != uVar48) goto LAB_008c4e34;
                                            }
                                            cVar3 = *(char *)((long)ppppppdVar49 + 3);
                                          }
                                          else {
                                            cVar3 = *(char *)((long)ppppppdVar49 + 3);
                                            pppppppdVar31 = pppppppdVar46;
                                          }
                                          if (cVar3 == '\0') {
                                            pppppppdVar31 = (double *******)pdVar20[3];
                                          }
                                          pppppdVar53 = ppppppdVar49[3];
                                          *(double ********)(param_1 + 0x68) = pppppppdVar31;
                                          pppppdVar54 = ppppppdVar49[5];
                                          pppppppdVar51 = unaff_x22;
                                          pppppppdVar46 = unaff_x22;
                                          pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                          switch(*(undefined1 *)pppppdVar53) {
                                          case 0:
                                            goto switchD_008c3848_caseD_0;
                                          case 1:
                                            goto switchD_008c3848_caseD_1;
                                          case 2:
                                            goto switchD_008c3848_caseD_2;
                                          case 3:
                                            goto switchD_008c3848_caseD_3;
                                          case 4:
                                            goto switchD_008c3848_caseD_4;
                                          case 5:
                                            goto switchD_008c3848_caseD_5;
                                          case 6:
                                            goto switchD_008c3848_caseD_6;
                                          case 7:
                                            goto switchD_008c3848_caseD_7;
                                          case 8:
                                            goto switchD_008c3848_caseD_8;
                                          case 9:
                                            goto switchD_008c3848_caseD_9;
                                          case 10:
                                            goto switchD_008c3848_caseD_a;
                                          case 0xb:
                                            goto switchD_008c3848_caseD_b;
                                          case 0xc:
                                            goto switchD_008c3848_caseD_c;
                                          case 0xd:
                                            goto switchD_008c3848_caseD_d;
                                          case 0xe:
                                            goto switchD_008c3848_caseD_e;
                                          case 0xf:
                                            goto switchD_008c3848_caseD_f;
                                          case 0x10:
                                            goto switchD_008c3848_caseD_10;
                                          case 0x11:
                                            goto switchD_008c3848_caseD_11;
                                          case 0x12:
                                            goto switchD_008c3848_caseD_12;
                                          case 0x13:
                                            goto switchD_008c3848_caseD_13;
                                          case 0x14:
                                            goto switchD_008c3848_caseD_14;
                                          case 0x15:
                                            goto switchD_008c3848_caseD_15;
                                          case 0x16:
                                            goto switchD_008c3848_caseD_16;
                                          case 0x17:
                                            goto switchD_008c3848_caseD_17;
                                          case 0x18:
                                            goto switchD_008c3848_caseD_18;
                                          case 0x19:
                                            goto switchD_008c3848_caseD_19;
                                          case 0x1a:
                                            goto switchD_008c3848_caseD_1a;
                                          case 0x1b:
                                            goto switchD_008c3848_caseD_1b;
                                          case 0x1c:
                                            goto switchD_008c3848_caseD_1c;
                                          case 0x1d:
                                            goto switchD_008c3848_caseD_1d;
                                          case 0x1e:
                                            goto switchD_008c3848_caseD_1e;
                                          case 0x1f:
                                            goto switchD_008c3848_caseD_1f;
                                          case 0x20:
                                            goto switchD_008c3848_caseD_20;
                                          case 0x21:
                                            goto switchD_008c3848_caseD_21;
                                          case 0x22:
                                            goto switchD_008c3848_caseD_22;
                                          case 0x23:
                                            goto switchD_008c3848_caseD_23;
                                          case 0x24:
                                            goto switchD_008c3848_caseD_24;
                                          case 0x25:
                                            goto switchD_008c3848_caseD_25;
                                          case 0x26:
                                            goto switchD_008c3848_caseD_26;
                                          case 0x27:
                                            goto switchD_008c3848_caseD_27;
                                          case 0x28:
                                            goto switchD_008c3848_caseD_28;
                                          case 0x29:
                                            goto switchD_008c3848_caseD_29;
                                          case 0x2a:
                                            goto switchD_008c3848_caseD_2a;
                                          case 0x2b:
                                            goto switchD_008c3848_caseD_2b;
                                          case 0x2c:
                                            goto switchD_008c3848_caseD_2c;
                                          case 0x2d:
                                            goto switchD_008c3848_caseD_2d;
                                          case 0x2e:
                                            goto switchD_008c3848_caseD_2e;
                                          case 0x2f:
                                            goto switchD_008c3848_caseD_2f;
                                          case 0x30:
                                            goto switchD_008c3848_caseD_30;
                                          case 0x31:
                                            goto switchD_008c3848_caseD_31;
                                          case 0x32:
                                            goto switchD_008c3848_caseD_32;
                                          case 0x33:
                                            goto switchD_008c3848_caseD_33;
                                          case 0x34:
                                            goto switchD_008c3848_caseD_34;
                                          case 0x35:
                                            goto switchD_008c3848_caseD_35;
                                          case 0x36:
                                            goto switchD_008c3848_caseD_36;
                                          case 0x37:
                                            goto switchD_008c3848_caseD_37;
                                          case 0x38:
                                            goto switchD_008c3848_caseD_38;
                                          case 0x39:
                                            goto switchD_008c3848_caseD_39;
                                          case 0x3a:
                                            goto switchD_008c3848_caseD_3a;
                                          case 0x3b:
                                            goto switchD_008c3848_caseD_3b;
                                          case 0x3c:
                                            goto switchD_008c3848_caseD_3c;
                                          case 0x3d:
                                            goto switchD_008c3848_caseD_3d;
                                          case 0x3e:
                                            goto switchD_008c3848_caseD_3e;
                                          case 0x3f:
                                            goto switchD_008c3848_caseD_3f;
                                          case 0x40:
                                            goto switchD_008c3848_caseD_40;
                                          case 0x41:
                                            goto switchD_008c3848_caseD_41;
                                          case 0x42:
                                            goto switchD_008c3848_caseD_42;
                                          case 0x43:
                                            goto switchD_008c3848_caseD_43;
                                          case 0x44:
                                            goto switchD_008c3848_caseD_44;
                                          case 0x45:
                                            goto switchD_008c3848_caseD_45;
                                          case 0x46:
                                            goto switchD_008c3848_caseD_46;
                                          case 0x47:
                                            goto switchD_008c3848_caseD_47;
                                          case 0x48:
                                            goto switchD_008c3848_caseD_48;
                                          case 0x49:
                                            goto switchD_008c3848_caseD_49;
                                          case 0x4a:
                                            goto switchD_008c3848_caseD_4a;
                                          case 0x4b:
                                            goto switchD_008c3848_caseD_4b;
                                          case 0x4c:
                                            goto switchD_008c3848_caseD_4c;
                                          case 0x4d:
                                            goto switchD_008c3848_caseD_4d;
                                          case 0x4e:
                                            goto switchD_008c3848_caseD_4e;
                                          case 0x4f:
                                            goto switchD_008c3848_caseD_4f;
                                          case 0x50:
                                            goto switchD_008c3848_caseD_50;
                                          case 0x51:
                                            goto switchD_008c3848_caseD_51;
                                          case 0x52:
                                            goto switchD_008c3848_caseD_52;
                                          case 0x53:
                                            goto switchD_008c3848_caseD_53;
                                          case 0x54:
                                            goto switchD_008c3848_caseD_54;
                                          case 0x55:
                                            goto switchD_008c3848_caseD_55;
                                          case 0x56:
                                            goto switchD_008c3848_caseD_56;
                                          case 0x58:
switchD_008c3848_caseD_58:
                                            do {
                                              pppppdVar38 = pppppdVar53 + 1;
                                              iVar11 = (int)*(uint *)pppppdVar53 >> 0x10;
                                              pppppppdVar46 = pppppppdVar51;
                                              if (*(uint *)((long)(pppppppdVar52 +
                                                                  (ulong)(byte)(*(uint *)pppppdVar53
                                                                               >> 8) * 2) + 0xc) ==
                                                  7) {
                                                ppppppdVar49 = pppppppdVar52
                                                               [(ulong)(byte)(*(uint *)pppppdVar53
                                                                             >> 8) * 2];
                                                if ((*(char *)((long)ppppppdVar49 + 6) != '\0') ||
                                                   (*(uint *)((long)ppppppdVar49[3] + 0xcc) !=
                                                    *(uint *)((long)pppppdVar53 + 4))) {
                                                  pppppdVar38 = (double *****)
                                                                ((long)pppppdVar38 +
                                                                ((long)iVar11 + -1) * 4);
                                                }
                                                pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                switch(*(undefined1 *)pppppdVar38) {
                                                case 0:
                                                  goto switchD_008c3848_caseD_0;
                                                case 1:
                                                  goto switchD_008c3848_caseD_1;
                                                case 2:
                                                  goto switchD_008c3848_caseD_2;
                                                case 3:
                                                  goto switchD_008c3848_caseD_3;
                                                case 4:
                                                  goto switchD_008c3848_caseD_4;
                                                case 5:
                                                  goto switchD_008c3848_caseD_5;
                                                case 6:
                                                  goto switchD_008c3848_caseD_6;
                                                case 7:
                                                  goto switchD_008c3848_caseD_7;
                                                case 8:
                                                  goto switchD_008c3848_caseD_8;
                                                case 9:
                                                  goto switchD_008c3848_caseD_9;
                                                case 10:
                                                  goto switchD_008c3848_caseD_a;
                                                case 0xb:
                                                  goto switchD_008c3848_caseD_b;
                                                case 0xc:
                                                  goto switchD_008c3848_caseD_c;
                                                case 0xd:
                                                  goto switchD_008c3848_caseD_d;
                                                case 0xe:
                                                  goto switchD_008c3848_caseD_e;
                                                case 0xf:
                                                  goto switchD_008c3848_caseD_f;
                                                case 0x10:
                                                  goto switchD_008c3848_caseD_10;
                                                case 0x11:
                                                  goto switchD_008c3848_caseD_11;
                                                case 0x12:
                                                  goto switchD_008c3848_caseD_12;
                                                case 0x13:
                                                  goto switchD_008c3848_caseD_13;
                                                case 0x14:
                                                  goto switchD_008c3848_caseD_14;
                                                case 0x15:
                                                  goto switchD_008c3848_caseD_15;
                                                case 0x16:
                                                  goto switchD_008c3848_caseD_16;
                                                case 0x17:
                                                  goto switchD_008c3848_caseD_17;
                                                case 0x18:
                                                  goto switchD_008c3848_caseD_18;
                                                case 0x19:
                                                  goto switchD_008c3848_caseD_19;
                                                case 0x1a:
                                                  goto switchD_008c3848_caseD_1a;
                                                case 0x1b:
                                                  goto switchD_008c3848_caseD_1b;
                                                case 0x1c:
                                                  goto switchD_008c3848_caseD_1c;
                                                case 0x1d:
                                                  goto switchD_008c3848_caseD_1d;
                                                case 0x1e:
                                                  goto switchD_008c3848_caseD_1e;
                                                case 0x1f:
                                                  goto switchD_008c3848_caseD_1f;
                                                case 0x20:
                                                  goto switchD_008c3848_caseD_20;
                                                case 0x21:
                                                  goto switchD_008c3848_caseD_21;
                                                case 0x22:
                                                  goto switchD_008c3848_caseD_22;
                                                case 0x23:
                                                  goto switchD_008c3848_caseD_23;
                                                case 0x24:
                                                  goto switchD_008c3848_caseD_24;
                                                case 0x25:
                                                  goto switchD_008c3848_caseD_25;
                                                case 0x26:
                                                  goto switchD_008c3848_caseD_26;
                                                case 0x27:
                                                  goto switchD_008c3848_caseD_27;
                                                case 0x28:
                                                  goto switchD_008c3848_caseD_28;
                                                case 0x29:
                                                  goto switchD_008c3848_caseD_29;
                                                case 0x2a:
                                                  goto switchD_008c3848_caseD_2a;
                                                case 0x2b:
                                                  goto switchD_008c3848_caseD_2b;
                                                case 0x2c:
                                                  goto switchD_008c3848_caseD_2c;
                                                case 0x2d:
                                                  goto switchD_008c3848_caseD_2d;
                                                case 0x2e:
                                                  goto switchD_008c3848_caseD_2e;
                                                case 0x2f:
                                                  goto switchD_008c3848_caseD_2f;
                                                case 0x30:
                                                  goto switchD_008c3848_caseD_30;
                                                case 0x31:
                                                  goto switchD_008c3848_caseD_31;
                                                case 0x32:
                                                  goto switchD_008c3848_caseD_32;
                                                case 0x33:
                                                  goto switchD_008c3848_caseD_33;
                                                case 0x34:
                                                  goto switchD_008c3848_caseD_34;
                                                case 0x35:
                                                  goto switchD_008c3848_caseD_35;
                                                case 0x36:
                                                  goto switchD_008c3848_caseD_36;
                                                case 0x37:
                                                  goto switchD_008c3848_caseD_37;
                                                case 0x38:
                                                  goto switchD_008c3848_caseD_38;
                                                case 0x39:
                                                  goto switchD_008c3848_caseD_39;
                                                case 0x3a:
                                                  goto switchD_008c3848_caseD_3a;
                                                case 0x3b:
                                                  goto switchD_008c3848_caseD_3b;
                                                case 0x3c:
                                                  goto switchD_008c3848_caseD_3c;
                                                case 0x3d:
                                                  goto switchD_008c3848_caseD_3d;
                                                case 0x3e:
                                                  goto switchD_008c3848_caseD_3e;
                                                case 0x3f:
                                                  goto switchD_008c3848_caseD_3f;
                                                case 0x40:
                                                  goto switchD_008c3848_caseD_40;
                                                case 0x41:
                                                  goto switchD_008c3848_caseD_41;
                                                case 0x42:
                                                  goto switchD_008c3848_caseD_42;
                                                case 0x43:
                                                  goto switchD_008c3848_caseD_43;
                                                case 0x44:
                                                  goto switchD_008c3848_caseD_44;
                                                case 0x45:
                                                  goto switchD_008c3848_caseD_45;
                                                case 0x46:
                                                  goto switchD_008c3848_caseD_46;
                                                case 0x47:
                                                  goto switchD_008c3848_caseD_47;
                                                case 0x48:
                                                  goto switchD_008c3848_caseD_48;
                                                case 0x49:
                                                  goto switchD_008c3848_caseD_49;
                                                case 0x4a:
                                                  goto switchD_008c3848_caseD_4a;
                                                case 0x4b:
                                                  goto switchD_008c3848_caseD_4b;
                                                case 0x4c:
                                                  goto switchD_008c3848_caseD_4c;
                                                case 0x4d:
                                                  goto switchD_008c3848_caseD_4d;
                                                case 0x4e:
                                                  goto switchD_008c3848_caseD_4e;
                                                case 0x4f:
                                                  goto switchD_008c3848_caseD_4f;
                                                case 0x50:
                                                  goto switchD_008c3848_caseD_50;
                                                case 0x51:
                                                  goto switchD_008c3848_caseD_51;
                                                case 0x52:
                                                  goto switchD_008c3848_caseD_52;
                                                case 0x53:
                                                  goto switchD_008c3848_caseD_53;
                                                case 0x54:
                                                  goto switchD_008c3848_caseD_54;
                                                case 0x55:
                                                  goto switchD_008c3848_caseD_55;
                                                case 0x56:
                                                  goto switchD_008c3848_caseD_56;
                                                case 0x57:
                                                  goto switchD_008c3848_caseD_57;
                                                case 0x59:
                                                  goto switchD_008c3848_caseD_59;
                                                case 0x5a:
                                                  goto switchD_008c3848_caseD_5a;
                                                case 0x5b:
                                                  goto switchD_008c3848_caseD_5b;
                                                case 0x5c:
                                                  goto switchD_008c3848_caseD_5c;
                                                case 0x5d:
                                                  goto switchD_008c3848_caseD_5d;
                                                case 0x5e:
                                                  goto switchD_008c3848_caseD_5e;
                                                }
                                                goto switchD_008c3848_caseD_58;
                                              }
                                              pppppdVar53 = (double *****)
                                                            ((long)pppppdVar38 +
                                                            ((long)iVar11 + -1) * 4);
                                              pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                              switch(*(undefined1 *)pppppdVar53) {
                                              case 0:
                                                goto switchD_008c3848_caseD_0;
                                              case 1:
                                                goto switchD_008c3848_caseD_1;
                                              case 2:
                                                goto switchD_008c3848_caseD_2;
                                              case 3:
                                                goto switchD_008c3848_caseD_3;
                                              case 4:
                                                goto switchD_008c3848_caseD_4;
                                              case 5:
                                                goto switchD_008c3848_caseD_5;
                                              case 6:
                                                goto switchD_008c3848_caseD_6;
                                              case 7:
                                                goto switchD_008c3848_caseD_7;
                                              case 8:
                                                goto switchD_008c3848_caseD_8;
                                              case 9:
                                                goto switchD_008c3848_caseD_9;
                                              case 10:
                                                goto switchD_008c3848_caseD_a;
                                              case 0xb:
                                                goto switchD_008c3848_caseD_b;
                                              case 0xc:
                                                goto switchD_008c3848_caseD_c;
                                              case 0xd:
                                                goto switchD_008c3848_caseD_d;
                                              case 0xe:
                                                goto switchD_008c3848_caseD_e;
                                              case 0xf:
                                                goto switchD_008c3848_caseD_f;
                                              case 0x10:
                                                goto switchD_008c3848_caseD_10;
                                              case 0x11:
                                                goto switchD_008c3848_caseD_11;
                                              case 0x12:
                                                goto switchD_008c3848_caseD_12;
                                              case 0x13:
                                                goto switchD_008c3848_caseD_13;
                                              case 0x14:
                                                goto switchD_008c3848_caseD_14;
                                              case 0x15:
                                                goto switchD_008c3848_caseD_15;
                                              case 0x16:
                                                goto switchD_008c3848_caseD_16;
                                              case 0x17:
                                                goto switchD_008c3848_caseD_17;
                                              case 0x18:
                                                goto switchD_008c3848_caseD_18;
                                              case 0x19:
                                                goto switchD_008c3848_caseD_19;
                                              case 0x1a:
                                                goto switchD_008c3848_caseD_1a;
                                              case 0x1b:
                                                goto switchD_008c3848_caseD_1b;
                                              case 0x1c:
                                                goto switchD_008c3848_caseD_1c;
                                              case 0x1d:
                                                goto switchD_008c3848_caseD_1d;
                                              case 0x1e:
                                                goto switchD_008c3848_caseD_1e;
                                              case 0x1f:
                                                goto switchD_008c3848_caseD_1f;
                                              case 0x20:
                                                goto switchD_008c3848_caseD_20;
                                              case 0x21:
                                                goto switchD_008c3848_caseD_21;
                                              case 0x22:
                                                goto switchD_008c3848_caseD_22;
                                              case 0x23:
                                                goto switchD_008c3848_caseD_23;
                                              case 0x24:
                                                goto switchD_008c3848_caseD_24;
                                              case 0x25:
                                                goto switchD_008c3848_caseD_25;
                                              case 0x26:
                                                goto switchD_008c3848_caseD_26;
                                              case 0x27:
                                                goto switchD_008c3848_caseD_27;
                                              case 0x28:
                                                goto switchD_008c3848_caseD_28;
                                              case 0x29:
                                                goto switchD_008c3848_caseD_29;
                                              case 0x2a:
                                                goto switchD_008c3848_caseD_2a;
                                              case 0x2b:
                                                goto switchD_008c3848_caseD_2b;
                                              case 0x2c:
                                                goto switchD_008c3848_caseD_2c;
                                              case 0x2d:
                                                goto switchD_008c3848_caseD_2d;
                                              case 0x2e:
                                                goto switchD_008c3848_caseD_2e;
                                              case 0x2f:
                                                goto switchD_008c3848_caseD_2f;
                                              case 0x30:
                                                goto switchD_008c3848_caseD_30;
                                              case 0x31:
                                                goto switchD_008c3848_caseD_31;
                                              case 0x32:
                                                goto switchD_008c3848_caseD_32;
                                              case 0x33:
                                                goto switchD_008c3848_caseD_33;
                                              case 0x34:
                                                goto switchD_008c3848_caseD_34;
                                              case 0x35:
                                                goto switchD_008c3848_caseD_35;
                                              case 0x36:
                                                goto switchD_008c3848_caseD_36;
                                              case 0x37:
                                                goto switchD_008c3848_caseD_37;
                                              case 0x38:
                                                goto switchD_008c3848_caseD_38;
                                              case 0x39:
                                                goto switchD_008c3848_caseD_39;
                                              case 0x3a:
                                                goto switchD_008c3848_caseD_3a;
                                              case 0x3b:
                                                goto switchD_008c3848_caseD_3b;
                                              case 0x3c:
                                                goto switchD_008c3848_caseD_3c;
                                              case 0x3d:
                                                goto switchD_008c3848_caseD_3d;
                                              case 0x3e:
                                                goto switchD_008c3848_caseD_3e;
                                              case 0x3f:
                                                goto switchD_008c3848_caseD_3f;
                                              case 0x40:
                                                goto switchD_008c3848_caseD_40;
                                              case 0x41:
                                                goto switchD_008c3848_caseD_41;
                                              case 0x42:
                                                goto switchD_008c3848_caseD_42;
                                              case 0x43:
                                                goto switchD_008c3848_caseD_43;
                                              case 0x44:
                                                goto switchD_008c3848_caseD_44;
                                              case 0x45:
                                                goto switchD_008c3848_caseD_45;
                                              case 0x46:
                                                goto switchD_008c3848_caseD_46;
                                              case 0x47:
                                                goto switchD_008c3848_caseD_47;
                                              case 0x48:
                                                goto switchD_008c3848_caseD_48;
                                              case 0x49:
                                                goto switchD_008c3848_caseD_49;
                                              case 0x4a:
                                                goto switchD_008c3848_caseD_4a;
                                              case 0x4b:
                                                goto switchD_008c3848_caseD_4b;
                                              case 0x4c:
                                                goto switchD_008c3848_caseD_4c;
                                              case 0x4d:
                                                goto switchD_008c3848_caseD_4d;
                                              case 0x4e:
                                                goto switchD_008c3848_caseD_4e;
                                              case 0x4f:
                                                goto switchD_008c3848_caseD_4f;
                                              case 0x50:
                                                goto switchD_008c3848_caseD_50;
                                              case 0x51:
                                                goto switchD_008c3848_caseD_51;
                                              case 0x52:
                                                goto switchD_008c3848_caseD_52;
                                              case 0x53:
                                                goto switchD_008c3848_caseD_53;
                                              case 0x54:
                                                goto switchD_008c3848_caseD_54;
                                              case 0x55:
                                                goto switchD_008c3848_caseD_55;
                                              case 0x56:
                                                goto switchD_008c3848_caseD_56;
                                              case 0x57:
                                                goto switchD_008c3848_caseD_57;
                                              case 0x59:
switchD_008c3848_caseD_59:
                                                do {
                                                  pppppdVar38 = (double *****)
                                                                ((long)pppppdVar53 + 4);
                                                  uVar16 = *(uint *)pppppdVar53;
                                                  UNRECOVERED_JUMPTABLE =
                                                       *(code **)(*(long *)(param_1 + 0x60) + 0x688)
                                                  ;
                                                  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                                                    *(double ******)
                                                     (*(long *)(param_1 + 0x50) + 0x20) =
                                                         pppppdVar38;
                                                    *(long *)(*(long *)(param_1 + 0x50) + 0x20) =
                                                         *(long *)(*(long *)(param_1 + 0x50) + 0x20)
                                                         + 4;
                                                    (*UNRECOVERED_JUMPTABLE)(param_1,0xffffffff);
                                                    if (*(char *)(param_1 + 3) != '\0')
                                                    goto LAB_008c8784;
                                                    pppppppdVar52 =
                                                         *(double ********)(param_1 + 0x70);
                                                  }
                                                  puVar36 = (uint *)((long)pppppdVar38 +
                                                                    ((ulong)(uVar16 >> 0x16) & 0x3fc
                                                                    ));
                                                  uVar13 = *puVar36;
                                                  uVar12 = uVar13 >> 0x10 & 0xff;
                                                  pppppppdVar46 =
                                                       pppppppdVar52 +
                                                       (ulong)(byte)(uVar13 >> 8) * 2;
                                                  if (uVar12 == 0) {
                                                    uVar12 = (uint)((ulong)(*(long *)(param_1 + 0x68
                                                                                     ) -
                                                                           (long)pppppppdVar46) >> 4
                                                                   );
                                                  }
                                                  if ((*(char *)((long)pppppppdVar51[2] + 3) != '\0'
                                                      ) && (*(ushort *)(param_1 + 0x28) <=
                                                            *(ushort *)(param_1 + 0x2a))) {
                                                    uVar16 = (*(code *)(&PTR_LAB_00c4d118)
                                                                       [uVar16 >> 8 & 0xff])
                                                                       (param_1,pppppppdVar46,
                                                                        uVar12 - 1);
                                                    if ((int)uVar16 < 0) {
                                                      uVar26 = *(undefined1 *)pppppdVar38;
                                                    }
                                                    else {
                                                      pppppdVar38 = (double *****)(puVar36 + 1);
                                                      unaff_x22 = (double *******)(ulong)uVar16;
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      pppppppdVar52 =
                                                           pppppppdVar46 + 2 +
                                                           (long)(int)(uVar12 - 1) * 2;
                                                      *(double ********)(param_1 + 0x68) =
                                                           pppppppdVar52;
                                                      ppppppdVar49 = *pppppppdVar46;
                                                      if (*(long *)(param_1 + 0x50) ==
                                                          *(long *)(param_1 + 0x18)) {
                                                        puVar22 = (undefined8 *)
                                                                  FUN_008b4200(param_1);
                                                        pppppppdVar52 =
                                                             *(double ********)(param_1 + 0x68);
                                                      }
                                                      else {
                                                        puVar22 = (undefined8 *)
                                                                  (*(long *)(param_1 + 0x50) + 0x30)
                                                        ;
                                                        *(undefined8 **)(param_1 + 0x50) = puVar22;
                                                      }
                                                      bVar5 = *(byte *)((long)ppppppdVar49 + 4);
                                                      *(uint *)(puVar22 + 4) = uVar16;
                                                      lVar50 = *(long *)(param_1 + 0x48);
                                                      lVar43 = *(long *)(param_1 + 0x68);
                                                      *puVar22 = 0;
                                                      puVar22[1] = pppppppdVar46;
                                                      bVar4 = *(byte *)((long)ppppppdVar49 + 4);
                                                      puVar22[2] = pppppppdVar46 + 2;
                                                      puVar22[3] = pppppppdVar52 + (ulong)bVar5 * 2;
                                                      iVar11 = (uVar13 >> 0x18) - 1;
                                                      *(int *)(puVar22 + 5) = iVar11;
                                                      *(undefined4 *)((long)puVar22 + 0x2c) = 0x12;
                                                      if (lVar50 - lVar43 <=
                                                          (long)((ulong)bVar4 * 0x10)) {
                                                        iVar2 = *(int *)(param_1 + 0x40);
                                                        iVar14 = iVar2 + (uint)bVar4;
                                                        if ((int)(uint)bVar4 <= iVar2) {
                                                          iVar14 = iVar2 << 1;
                                                        }
                                                        FUN_008b3fdc(param_1,iVar14,1);
                                                      }
                                                      iVar14 = (uVar13 >> 0x18) - 2;
                                                      if (uVar13 >> 0x19 == 0) {
                                                        iVar14 = iVar11;
                                                      }
                                                      iVar11 = FUN_008c8994(param_1,*(long *)(*(long
                                                                                                *)(
                                                  param_1 + 0x50) + 0x10) + (ulong)uVar16 * 0x10,
                                                  iVar14);
                                                  if (iVar11 == 0) {
                                                    plVar27 = *(long **)(param_1 + 0x50);
                                                    pppppppdVar52 =
                                                         *(double ********)(param_1 + 0x70);
                                                    pppppdVar53 = *(double ******)(*plVar27 + 0x18);
                                                    *(uint *)((long)plVar27 + 0x2c) =
                                                         *(uint *)((long)plVar27 + 0x2c) | 1;
                                                    pppppdVar54 = *(double ******)(*plVar27 + 0x28);
                                                    pppppppdVar51 = *(double ********)plVar27[1];
                                                    pppppppdVar46 = pppppppdVar51;
                                                    pppppdVar38 = pppppdVar53;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                    switch(*(undefined1 *)pppppdVar53) {
                                                    case 0:
                                                      goto switchD_008c3848_caseD_0;
                                                    case 1:
                                                      goto switchD_008c3848_caseD_1;
                                                    case 2:
                                                      goto switchD_008c3848_caseD_2;
                                                    case 3:
                                                      goto switchD_008c3848_caseD_3;
                                                    case 4:
                                                      goto switchD_008c3848_caseD_4;
                                                    case 5:
                                                      goto switchD_008c3848_caseD_5;
                                                    case 6:
                                                      goto switchD_008c3848_caseD_6;
                                                    case 7:
                                                      goto switchD_008c3848_caseD_7;
                                                    case 8:
                                                      goto switchD_008c3848_caseD_8;
                                                    case 9:
                                                      goto switchD_008c3848_caseD_9;
                                                    case 10:
                                                      goto switchD_008c3848_caseD_a;
                                                    case 0xb:
                                                      goto switchD_008c3848_caseD_b;
                                                    case 0xc:
                                                      goto switchD_008c3848_caseD_c;
                                                    case 0xd:
                                                      goto switchD_008c3848_caseD_d;
                                                    case 0xe:
                                                      goto switchD_008c3848_caseD_e;
                                                    case 0xf:
                                                      goto switchD_008c3848_caseD_f;
                                                    case 0x10:
                                                      goto switchD_008c3848_caseD_10;
                                                    case 0x11:
                                                      goto switchD_008c3848_caseD_11;
                                                    case 0x12:
                                                      goto switchD_008c3848_caseD_12;
                                                    case 0x13:
                                                      goto switchD_008c3848_caseD_13;
                                                    case 0x14:
                                                      goto switchD_008c3848_caseD_14;
                                                    case 0x15:
                                                      goto switchD_008c3848_caseD_15;
                                                    case 0x16:
                                                      goto switchD_008c3848_caseD_16;
                                                    case 0x17:
                                                      goto switchD_008c3848_caseD_17;
                                                    case 0x18:
                                                      goto switchD_008c3848_caseD_18;
                                                    case 0x19:
                                                      goto switchD_008c3848_caseD_19;
                                                    case 0x1a:
                                                      goto switchD_008c3848_caseD_1a;
                                                    case 0x1b:
                                                      goto switchD_008c3848_caseD_1b;
                                                    case 0x1c:
                                                      goto switchD_008c3848_caseD_1c;
                                                    case 0x1d:
                                                      goto switchD_008c3848_caseD_1d;
                                                    case 0x1e:
                                                      goto switchD_008c3848_caseD_1e;
                                                    case 0x1f:
                                                      goto switchD_008c3848_caseD_1f;
                                                    case 0x20:
                                                      goto switchD_008c3848_caseD_20;
                                                    case 0x21:
                                                      goto switchD_008c3848_caseD_21;
                                                    case 0x22:
                                                      goto switchD_008c3848_caseD_22;
                                                    case 0x23:
                                                      goto switchD_008c3848_caseD_23;
                                                    case 0x24:
                                                      goto switchD_008c3848_caseD_24;
                                                    case 0x25:
                                                      goto switchD_008c3848_caseD_25;
                                                    case 0x26:
                                                      goto switchD_008c3848_caseD_26;
                                                    case 0x27:
                                                      goto switchD_008c3848_caseD_27;
                                                    case 0x28:
                                                      goto switchD_008c3848_caseD_28;
                                                    case 0x29:
                                                      goto switchD_008c3848_caseD_29;
                                                    case 0x2a:
                                                      goto switchD_008c3848_caseD_2a;
                                                    case 0x2b:
                                                      goto switchD_008c3848_caseD_2b;
                                                    case 0x2c:
                                                      goto switchD_008c3848_caseD_2c;
                                                    case 0x2d:
                                                      goto switchD_008c3848_caseD_2d;
                                                    case 0x2e:
                                                      goto switchD_008c3848_caseD_2e;
                                                    case 0x2f:
                                                      goto switchD_008c3848_caseD_2f;
                                                    case 0x30:
                                                      goto switchD_008c3848_caseD_30;
                                                    case 0x31:
                                                      goto switchD_008c3848_caseD_31;
                                                    case 0x32:
                                                      goto switchD_008c3848_caseD_32;
                                                    case 0x33:
                                                      goto switchD_008c3848_caseD_33;
                                                    case 0x34:
                                                      goto switchD_008c3848_caseD_34;
                                                    case 0x35:
                                                      goto switchD_008c3848_caseD_35;
                                                    case 0x36:
                                                      goto switchD_008c3848_caseD_36;
                                                    case 0x37:
                                                      goto switchD_008c3848_caseD_37;
                                                    case 0x38:
                                                      goto switchD_008c3848_caseD_38;
                                                    case 0x39:
                                                      goto switchD_008c3848_caseD_39;
                                                    case 0x3a:
                                                      goto switchD_008c3848_caseD_3a;
                                                    case 0x3b:
                                                      goto switchD_008c3848_caseD_3b;
                                                    case 0x3c:
                                                      goto switchD_008c3848_caseD_3c;
                                                    case 0x3d:
                                                      goto switchD_008c3848_caseD_3d;
                                                    case 0x3e:
                                                      goto switchD_008c3848_caseD_3e;
                                                    case 0x3f:
                                                      goto switchD_008c3848_caseD_3f;
                                                    case 0x40:
                                                      goto switchD_008c3848_caseD_40;
                                                    case 0x41:
                                                      goto switchD_008c3848_caseD_41;
                                                    case 0x42:
                                                      goto switchD_008c3848_caseD_42;
                                                    case 0x43:
                                                      goto switchD_008c3848_caseD_43;
                                                    case 0x44:
                                                      goto switchD_008c3848_caseD_44;
                                                    case 0x45:
                                                      goto switchD_008c3848_caseD_45;
                                                    case 0x46:
                                                      goto switchD_008c3848_caseD_46;
                                                    case 0x47:
                                                      goto switchD_008c3848_caseD_47;
                                                    case 0x48:
                                                      goto switchD_008c3848_caseD_48;
                                                    case 0x49:
                                                      goto switchD_008c3848_caseD_49;
                                                    case 0x4a:
                                                      goto switchD_008c3848_caseD_4a;
                                                    case 0x4b:
                                                      goto switchD_008c3848_caseD_4b;
                                                    case 0x4c:
                                                      goto switchD_008c3848_caseD_4c;
                                                    case 0x4d:
                                                      goto switchD_008c3848_caseD_4d;
                                                    case 0x4e:
                                                      goto switchD_008c3848_caseD_4e;
                                                    case 0x4f:
                                                      goto switchD_008c3848_caseD_4f;
                                                    case 0x50:
                                                      goto switchD_008c3848_caseD_50;
                                                    case 0x51:
                                                      goto switchD_008c3848_caseD_51;
                                                    case 0x52:
                                                      goto switchD_008c3848_caseD_52;
                                                    case 0x53:
                                                      goto switchD_008c3848_caseD_53;
                                                    case 0x54:
                                                      goto switchD_008c3848_caseD_54;
                                                    case 0x55:
                                                      goto switchD_008c3848_caseD_55;
                                                    case 0x56:
                                                      goto switchD_008c3848_caseD_56;
                                                    case 0x57:
                                                      goto switchD_008c3848_caseD_57;
                                                    case 0x58:
                                                      goto switchD_008c3848_caseD_58;
                                                    case 0x5a:
                                                      goto switchD_008c3848_caseD_5a;
                                                    case 0x5b:
                                                      goto switchD_008c3848_caseD_5b;
                                                    case 0x5c:
                                                      goto switchD_008c3848_caseD_5c;
                                                    case 0x5d:
                                                      goto switchD_008c3848_caseD_5d;
                                                    case 0x5e:
                                                      goto switchD_008c3848_caseD_5e;
                                                    }
                                                    goto switchD_008c3848_caseD_59;
                                                  }
                                                  if (iVar11 != 1) goto LAB_008c8794;
                                                  FUN_008c8d44(param_1);
                                                  uVar26 = *(undefined1 *)pppppdVar38;
                                                  pppppppdVar52 = *(double ********)(param_1 + 0x70)
                                                  ;
                                                  }
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(uVar26) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
                                                    goto switchD_008c3848_caseD_5d;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  goto switchD_008c3848_caseD_59;
                                                  }
LAB_008c6ef0:
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar38) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5d:
switchD_008c3848_caseD_5d:
                                                    do {
                                                      pppppdVar38 = pppppdVar53 + 1;
                                                      uVar13 = *(uint *)pppppdVar53;
                                                      uVar16 = *(uint *)((long)pppppdVar53 + 4);
                                                      *(double ******)
                                                       (*(long *)(param_1 + 0x50) + 0x20) =
                                                           pppppdVar38;
                                                      unaff_x22 = pppppppdVar52 +
                                                                  (ulong)(byte)(uVar13 >> 0x10) * 2;
                                                      if (*(uint *)((long)unaff_x22 + 0xc) - 0xd <
                                                          0xfffffffe)
                                                      goto switchD_008c3848_caseD_46;
                                                      uVar30 = (ulong)(uVar13 >> 0x14) & 0xff0;
                                                      iVar11 = *(int *)((long)pppppppdVar51 +
                                                                       uVar30 + 0x2c);
                                                      plVar27 = (long *)((long)pppppppdVar51 +
                                                                        uVar30 + 0x20);
                                                      if (iVar11 == 0xf) {
                                                        plVar27 = *(long **)(*plVar27 + 8);
                                                        iVar11 = *(int *)((long)plVar27 + 0xc);
                                                      }
                                                      if (iVar11 != 0xb) {
                                                        if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                          FUN_008b399c(param_1,plVar27,
                                                                                                                                              
                                                  "verify object is an instance of");
                                                  }
                                                  goto LAB_008c8944;
                                                  }
                                                  lVar50 = *plVar27;
                                                  ppppppdVar49 = *unaff_x22;
                                                  pppppppdVar46 =
                                                       pppppppdVar52 +
                                                       (ulong)(byte)(uVar13 >> 8) * 2;
                                                  if (*(uint *)((long)unaff_x22 + 0xc) == 0xc) {
                                                    uVar30 = FUN_008b3380(ppppppdVar49,lVar50);
                                                    if ((uVar30 & 1) == 0) {
                                                      if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                        FUN_008b39cc(param_1,
                                                  "attempt to illegally access private field");
                                                  }
                                                  goto LAB_008c8944;
                                                  }
                                                  if ((uVar16 >> 8 & 1) != 0) goto LAB_008c85a0;
                                                  iVar11 = *(int *)(lVar50 + 100);
                                                  if ((uVar16 >> 9 & 1) != 0) {
                                                    ppppppdVar60 = *unaff_x22;
                                                    pppppppdVar46[3] = unaff_x22[1];
                                                    pppppppdVar46[2] = ppppppdVar60;
                                                  }
                                                  uVar16 = iVar11 + (uVar16 & 0xff);
                                                  ppppppdVar49 = ppppppdVar49 + 4;
                                                  }
                                                  else {
                                                    uVar30 = FUN_008b33a4(ppppppdVar49,lVar50);
                                                    if ((uVar30 & 1) == 0) {
                                                      if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                        FUN_008b39cc(param_1,
                                                  "attempt to illegally access private field of a class"
                                                  );
                                                  }
                                                  goto LAB_008c8944;
                                                  }
                                                  if ((uVar16 >> 8 & 1) == 0) {
                                                    if (*(long *)(lVar17 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                                                      FUN_008b39cc(param_1,
                                                  "attempt to access private instance field of a class"
                                                  );
                                                  }
                                                  goto LAB_008c8944;
                                                  }
LAB_008c85a0:
                                                  if ((uVar16 >> 9 & 1) != 0) {
                                                    ppppppdVar49 = *unaff_x22;
                                                    pppppppdVar46[3] = unaff_x22[1];
                                                    pppppppdVar46[2] = ppppppdVar49;
                                                  }
                                                  ppppppdVar49 = (double ******)(lVar50 + 0x30);
                                                  uVar16 = uVar16 & 0xff;
                                                  }
                                                  ppppppdVar60 = (double ******)
                                                                 (*ppppppdVar49)[(ulong)uVar16 * 2];
                                                  pppppppdVar46[1] =
                                                       (double ******)
                                                       (*ppppppdVar49 + (ulong)uVar16 * 2)[1];
                                                  *pppppppdVar46 = ppppppdVar60;
                                                  pppppppdVar46 = pppppppdVar51;
                                                  pppppdVar53 = pppppdVar38;
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
                                                  switch(*(undefined1 *)pppppdVar38) {
                                                  case 0:
                                                    goto switchD_008c3848_caseD_0;
                                                  case 1:
                                                    goto switchD_008c3848_caseD_1;
                                                  case 2:
                                                    goto switchD_008c3848_caseD_2;
                                                  case 3:
                                                    goto switchD_008c3848_caseD_3;
                                                  case 4:
                                                    goto switchD_008c3848_caseD_4;
                                                  case 5:
                                                    goto switchD_008c3848_caseD_5;
                                                  case 6:
                                                    goto switchD_008c3848_caseD_6;
                                                  case 7:
                                                    goto switchD_008c3848_caseD_7;
                                                  case 8:
                                                    goto switchD_008c3848_caseD_8;
                                                  case 9:
                                                    goto switchD_008c3848_caseD_9;
                                                  case 10:
                                                    goto switchD_008c3848_caseD_a;
                                                  case 0xb:
                                                    goto switchD_008c3848_caseD_b;
                                                  case 0xc:
                                                    goto switchD_008c3848_caseD_c;
                                                  case 0xd:
                                                    goto switchD_008c3848_caseD_d;
                                                  case 0xe:
                                                    goto switchD_008c3848_caseD_e;
                                                  case 0xf:
                                                    goto switchD_008c3848_caseD_f;
                                                  case 0x10:
                                                    goto switchD_008c3848_caseD_10;
                                                  case 0x11:
                                                    goto switchD_008c3848_caseD_11;
                                                  case 0x12:
                                                    goto switchD_008c3848_caseD_12;
                                                  case 0x13:
                                                    goto switchD_008c3848_caseD_13;
                                                  case 0x14:
                                                    goto switchD_008c3848_caseD_14;
                                                  case 0x15:
                                                    goto switchD_008c3848_caseD_15;
                                                  case 0x16:
                                                    goto switchD_008c3848_caseD_16;
                                                  case 0x17:
                                                    goto switchD_008c3848_caseD_17;
                                                  case 0x18:
                                                    goto switchD_008c3848_caseD_18;
                                                  case 0x19:
                                                    goto switchD_008c3848_caseD_19;
                                                  case 0x1a:
                                                    goto switchD_008c3848_caseD_1a;
                                                  case 0x1b:
                                                    goto switchD_008c3848_caseD_1b;
                                                  case 0x1c:
                                                    goto switchD_008c3848_caseD_1c;
                                                  case 0x1d:
                                                    goto switchD_008c3848_caseD_1d;
                                                  case 0x1e:
                                                    goto switchD_008c3848_caseD_1e;
                                                  case 0x1f:
                                                    goto switchD_008c3848_caseD_1f;
                                                  case 0x20:
                                                    goto switchD_008c3848_caseD_20;
                                                  case 0x21:
                                                    goto switchD_008c3848_caseD_21;
                                                  case 0x22:
                                                    goto switchD_008c3848_caseD_22;
                                                  case 0x23:
                                                    goto switchD_008c3848_caseD_23;
                                                  case 0x24:
                                                    goto switchD_008c3848_caseD_24;
                                                  case 0x25:
                                                    goto switchD_008c3848_caseD_25;
                                                  case 0x26:
                                                    goto switchD_008c3848_caseD_26;
                                                  case 0x27:
                                                    goto switchD_008c3848_caseD_27;
                                                  case 0x28:
                                                    goto switchD_008c3848_caseD_28;
                                                  case 0x29:
                                                    goto switchD_008c3848_caseD_29;
                                                  case 0x2a:
                                                    goto switchD_008c3848_caseD_2a;
                                                  case 0x2b:
                                                    goto switchD_008c3848_caseD_2b;
                                                  case 0x2c:
                                                    goto switchD_008c3848_caseD_2c;
                                                  case 0x2d:
                                                    goto switchD_008c3848_caseD_2d;
                                                  case 0x2e:
                                                    goto switchD_008c3848_caseD_2e;
                                                  case 0x2f:
                                                    goto switchD_008c3848_caseD_2f;
                                                  case 0x30:
                                                    goto switchD_008c3848_caseD_30;
                                                  case 0x31:
                                                    goto switchD_008c3848_caseD_31;
                                                  case 0x32:
                                                    goto switchD_008c3848_caseD_32;
                                                  case 0x33:
                                                    goto switchD_008c3848_caseD_33;
                                                  case 0x34:
                                                    goto switchD_008c3848_caseD_34;
                                                  case 0x35:
                                                    goto switchD_008c3848_caseD_35;
                                                  case 0x36:
                                                    goto switchD_008c3848_caseD_36;
                                                  case 0x37:
                                                    goto switchD_008c3848_caseD_37;
                                                  case 0x38:
                                                    goto switchD_008c3848_caseD_38;
                                                  case 0x39:
                                                    goto switchD_008c3848_caseD_39;
                                                  case 0x3a:
                                                    goto switchD_008c3848_caseD_3a;
                                                  case 0x3b:
                                                    goto switchD_008c3848_caseD_3b;
                                                  case 0x3c:
                                                    goto switchD_008c3848_caseD_3c;
                                                  case 0x3d:
                                                    goto switchD_008c3848_caseD_3d;
                                                  case 0x3e:
                                                    goto switchD_008c3848_caseD_3e;
                                                  case 0x3f:
                                                    goto switchD_008c3848_caseD_3f;
                                                  case 0x40:
                                                    goto switchD_008c3848_caseD_40;
                                                  case 0x41:
                                                    goto switchD_008c3848_caseD_41;
                                                  case 0x42:
                                                    goto switchD_008c3848_caseD_42;
                                                  case 0x43:
                                                    goto switchD_008c3848_caseD_43;
                                                  case 0x44:
                                                    goto switchD_008c3848_caseD_44;
                                                  case 0x45:
                                                    goto switchD_008c3848_caseD_45;
                                                  case 0x46:
                                                    goto switchD_008c3848_caseD_46;
                                                  case 0x47:
                                                    goto switchD_008c3848_caseD_47;
                                                  case 0x48:
                                                    goto switchD_008c3848_caseD_48;
                                                  case 0x49:
                                                    goto switchD_008c3848_caseD_49;
                                                  case 0x4a:
                                                    goto switchD_008c3848_caseD_4a;
                                                  case 0x4b:
                                                    goto switchD_008c3848_caseD_4b;
                                                  case 0x4c:
                                                    goto switchD_008c3848_caseD_4c;
                                                  case 0x4d:
                                                    goto switchD_008c3848_caseD_4d;
                                                  case 0x4e:
                                                    goto switchD_008c3848_caseD_4e;
                                                  case 0x4f:
                                                    goto switchD_008c3848_caseD_4f;
                                                  case 0x50:
                                                    goto switchD_008c3848_caseD_50;
                                                  case 0x51:
                                                    goto switchD_008c3848_caseD_51;
                                                  case 0x52:
                                                    goto switchD_008c3848_caseD_52;
                                                  case 0x53:
                                                    goto switchD_008c3848_caseD_53;
                                                  case 0x54:
                                                    goto switchD_008c3848_caseD_54;
                                                  case 0x55:
                                                    goto switchD_008c3848_caseD_55;
                                                  case 0x56:
                                                    goto switchD_008c3848_caseD_56;
                                                  case 0x57:
                                                    goto switchD_008c3848_caseD_57;
                                                  case 0x58:
                                                    goto switchD_008c3848_caseD_58;
                                                  case 0x59:
                                                    goto switchD_008c3848_caseD_59;
                                                  case 0x5a:
                                                    goto switchD_008c3848_caseD_5a;
                                                  case 0x5b:
                                                    goto switchD_008c3848_caseD_5b;
                                                  case 0x5c:
                                                    goto switchD_008c3848_caseD_5c;
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                  } while( true );
                                                  case 0x5e:
                                                    goto switchD_008c3848_caseD_5e;
                                                  }
                                                } while( true );
                                              case 0x5a:
                                                goto switchD_008c3848_caseD_5a;
                                              case 0x5b:
                                                goto switchD_008c3848_caseD_5b;
                                              case 0x5c:
                                                goto switchD_008c3848_caseD_5c;
                                              case 0x5d:
                                                goto switchD_008c3848_caseD_5d;
                                              case 0x5e:
                                                goto switchD_008c3848_caseD_5e;
                                              }
                                            } while( true );
                                          case 0x59:
                                            goto switchD_008c3848_caseD_59;
                                          case 0x5a:
                                            goto switchD_008c3848_caseD_5a;
                                          case 0x5b:
                                            goto switchD_008c3848_caseD_5b;
                                          case 0x5c:
                                            goto switchD_008c3848_caseD_5c;
                                          case 0x5d:
                                            goto switchD_008c3848_caseD_5d;
                                          case 0x5e:
                                            goto switchD_008c3848_caseD_5e;
                                          }
                                        } while( true );
                                      case 0x58:
                                        goto switchD_008c3848_caseD_58;
                                      case 0x59:
                                        goto switchD_008c3848_caseD_59;
                                      case 0x5a:
                                        goto switchD_008c3848_caseD_5a;
                                      case 0x5b:
                                        goto switchD_008c3848_caseD_5b;
                                      case 0x5c:
                                        goto switchD_008c3848_caseD_5c;
                                      case 0x5d:
                                        goto switchD_008c3848_caseD_5d;
                                      case 0x5e:
                                        goto switchD_008c3848_caseD_5e;
                                      }
                                    } while( true );
                                  case 0x56:
                                    goto switchD_008c3848_caseD_56;
                                  case 0x57:
                                    goto switchD_008c3848_caseD_57;
                                  case 0x58:
                                    goto switchD_008c3848_caseD_58;
                                  case 0x59:
                                    goto switchD_008c3848_caseD_59;
                                  case 0x5a:
                                    goto switchD_008c3848_caseD_5a;
                                  case 0x5b:
                                    goto switchD_008c3848_caseD_5b;
                                  case 0x5c:
                                    goto switchD_008c3848_caseD_5c;
                                  case 0x5d:
                                    goto switchD_008c3848_caseD_5d;
                                  case 0x5e:
                                    goto switchD_008c3848_caseD_5e;
                                  }
                                } while( true );
                              case 0x55:
                                goto switchD_008c3848_caseD_55;
                              case 0x56:
                                goto switchD_008c3848_caseD_56;
                              case 0x57:
                                goto switchD_008c3848_caseD_57;
                              case 0x58:
                                goto switchD_008c3848_caseD_58;
                              case 0x59:
                                goto switchD_008c3848_caseD_59;
                              case 0x5a:
                                goto switchD_008c3848_caseD_5a;
                              case 0x5b:
                                goto switchD_008c3848_caseD_5b;
                              case 0x5c:
                                goto switchD_008c3848_caseD_5c;
                              case 0x5d:
                                goto switchD_008c3848_caseD_5d;
                              case 0x5e:
                                goto switchD_008c3848_caseD_5e;
                              }
                            } while( true );
                          case 0x54:
                            goto switchD_008c3848_caseD_54;
                          case 0x55:
                            goto switchD_008c3848_caseD_55;
                          case 0x56:
                            goto switchD_008c3848_caseD_56;
                          case 0x57:
                            goto switchD_008c3848_caseD_57;
                          case 0x58:
                            goto switchD_008c3848_caseD_58;
                          case 0x59:
                            goto switchD_008c3848_caseD_59;
                          case 0x5a:
                            goto switchD_008c3848_caseD_5a;
                          case 0x5b:
                            goto switchD_008c3848_caseD_5b;
                          case 0x5c:
                            goto switchD_008c3848_caseD_5c;
                          case 0x5d:
                            goto switchD_008c3848_caseD_5d;
                          case 0x5e:
                            goto switchD_008c3848_caseD_5e;
                          }
                        } while( true );
                      case 0x52:
                        goto switchD_008c3848_caseD_52;
                      case 0x53:
                        goto switchD_008c3848_caseD_53;
                      case 0x54:
                        goto switchD_008c3848_caseD_54;
                      case 0x55:
                        goto switchD_008c3848_caseD_55;
                      case 0x56:
                        goto switchD_008c3848_caseD_56;
                      case 0x57:
                        goto switchD_008c3848_caseD_57;
                      case 0x58:
                        goto switchD_008c3848_caseD_58;
                      case 0x59:
                        goto switchD_008c3848_caseD_59;
                      case 0x5a:
                        goto switchD_008c3848_caseD_5a;
                      case 0x5b:
                        goto switchD_008c3848_caseD_5b;
                      case 0x5c:
                        goto switchD_008c3848_caseD_5c;
                      case 0x5d:
                        goto switchD_008c3848_caseD_5d;
                      case 0x5e:
                        goto switchD_008c3848_caseD_5e;
                      }
                    } while( true );
                  }
                  goto LAB_008c3a14;
                case 0x4b:
                  goto switchD_008c3848_caseD_4b;
                case 0x4c:
                  goto switchD_008c3848_caseD_4c;
                case 0x4d:
                  goto switchD_008c3848_caseD_4d;
                case 0x4e:
                  goto switchD_008c3848_caseD_4e;
                case 0x4f:
                  goto switchD_008c3848_caseD_4f;
                case 0x50:
                  goto switchD_008c3848_caseD_50;
                case 0x51:
                  goto switchD_008c3848_caseD_51;
                case 0x52:
                  goto switchD_008c3848_caseD_52;
                case 0x53:
                  goto switchD_008c3848_caseD_53;
                case 0x54:
                  goto switchD_008c3848_caseD_54;
                case 0x55:
                  goto switchD_008c3848_caseD_55;
                case 0x56:
                  goto switchD_008c3848_caseD_56;
                case 0x57:
                  goto switchD_008c3848_caseD_57;
                case 0x58:
                  goto switchD_008c3848_caseD_58;
                case 0x59:
                  goto switchD_008c3848_caseD_59;
                case 0x5a:
                  goto switchD_008c3848_caseD_5a;
                case 0x5b:
                  goto switchD_008c3848_caseD_5b;
                case 0x5c:
                  goto switchD_008c3848_caseD_5c;
                case 0x5d:
                  goto switchD_008c3848_caseD_5d;
                case 0x5e:
                  goto switchD_008c3848_caseD_5e;
                }
              } while( true );
            case 0x49:
              goto switchD_008c3848_caseD_49;
            case 0x4a:
              goto switchD_008c3848_caseD_4a;
            case 0x4b:
              goto switchD_008c3848_caseD_4b;
            case 0x4c:
              goto switchD_008c3848_caseD_4c;
            case 0x4d:
              goto switchD_008c3848_caseD_4d;
            case 0x4e:
              goto switchD_008c3848_caseD_4e;
            case 0x4f:
              goto switchD_008c3848_caseD_4f;
            case 0x50:
              goto switchD_008c3848_caseD_50;
            case 0x51:
              goto switchD_008c3848_caseD_51;
            case 0x52:
              goto switchD_008c3848_caseD_52;
            case 0x53:
              goto switchD_008c3848_caseD_53;
            case 0x54:
              goto switchD_008c3848_caseD_54;
            case 0x55:
              goto switchD_008c3848_caseD_55;
            case 0x56:
              goto switchD_008c3848_caseD_56;
            case 0x57:
              goto switchD_008c3848_caseD_57;
            case 0x58:
              goto switchD_008c3848_caseD_58;
            case 0x59:
              goto switchD_008c3848_caseD_59;
            case 0x5a:
              goto switchD_008c3848_caseD_5a;
            case 0x5b:
              goto switchD_008c3848_caseD_5b;
            case 0x5c:
              goto switchD_008c3848_caseD_5c;
            case 0x5d:
              goto switchD_008c3848_caseD_5d;
            case 0x5e:
              goto switchD_008c3848_caseD_5e;
            }
          } while( true );
        case 0x46:
          goto switchD_008c3848_caseD_46;
        case 0x47:
          goto switchD_008c3848_caseD_47;
        case 0x48:
          goto switchD_008c3848_caseD_48;
        case 0x49:
          goto switchD_008c3848_caseD_49;
        case 0x4a:
          goto switchD_008c3848_caseD_4a;
        case 0x4b:
          goto switchD_008c3848_caseD_4b;
        case 0x4c:
          goto switchD_008c3848_caseD_4c;
        case 0x4d:
          goto switchD_008c3848_caseD_4d;
        case 0x4e:
          goto switchD_008c3848_caseD_4e;
        case 0x4f:
          goto switchD_008c3848_caseD_4f;
        case 0x50:
          goto switchD_008c3848_caseD_50;
        case 0x51:
          goto switchD_008c3848_caseD_51;
        case 0x52:
          goto switchD_008c3848_caseD_52;
        case 0x53:
          goto switchD_008c3848_caseD_53;
        case 0x54:
          goto switchD_008c3848_caseD_54;
        case 0x55:
          goto switchD_008c3848_caseD_55;
        case 0x56:
          goto switchD_008c3848_caseD_56;
        case 0x57:
          goto switchD_008c3848_caseD_57;
        case 0x58:
          goto switchD_008c3848_caseD_58;
        case 0x59:
          goto switchD_008c3848_caseD_59;
        case 0x5a:
          goto switchD_008c3848_caseD_5a;
        case 0x5b:
          goto switchD_008c3848_caseD_5b;
        case 0x5c:
          goto switchD_008c3848_caseD_5c;
        case 0x5d:
          goto switchD_008c3848_caseD_5d;
        case 0x5e:
          goto switchD_008c3848_caseD_5e;
        }
      } while( true );
    case 0x44:
      goto switchD_008c3848_caseD_44;
    case 0x45:
      goto switchD_008c3848_caseD_45;
    case 0x46:
      goto switchD_008c3848_caseD_46;
    case 0x47:
      goto switchD_008c3848_caseD_47;
    case 0x48:
      goto switchD_008c3848_caseD_48;
    case 0x49:
      goto switchD_008c3848_caseD_49;
    case 0x4a:
      goto switchD_008c3848_caseD_4a;
    case 0x4b:
      goto switchD_008c3848_caseD_4b;
    case 0x4c:
      goto switchD_008c3848_caseD_4c;
    case 0x4d:
      goto switchD_008c3848_caseD_4d;
    case 0x4e:
      goto switchD_008c3848_caseD_4e;
    case 0x4f:
      goto switchD_008c3848_caseD_4f;
    case 0x50:
      goto switchD_008c3848_caseD_50;
    case 0x51:
      goto switchD_008c3848_caseD_51;
    case 0x52:
      goto switchD_008c3848_caseD_52;
    case 0x53:
      goto switchD_008c3848_caseD_53;
    case 0x54:
      goto switchD_008c3848_caseD_54;
    case 0x55:
      goto switchD_008c3848_caseD_55;
    case 0x56:
      goto switchD_008c3848_caseD_56;
    case 0x57:
      goto switchD_008c3848_caseD_57;
    case 0x58:
      goto switchD_008c3848_caseD_58;
    case 0x59:
      goto switchD_008c3848_caseD_59;
    case 0x5a:
      goto switchD_008c3848_caseD_5a;
    case 0x5b:
      goto switchD_008c3848_caseD_5b;
    case 0x5c:
      goto switchD_008c3848_caseD_5c;
    case 0x5d:
      goto switchD_008c3848_caseD_5d;
    case 0x5e:
      goto switchD_008c3848_caseD_5e;
    }
    goto switchD_008c3848_caseD_3f;
  }
  uVar12 = uVar12 - 1;
  uVar15 = uVar12;
  if ((int)uVar16 <= (int)uVar12) {
    uVar15 = uVar16;
  }
  if (0 < (int)uVar15) {
    lVar50 = (ulong)uVar15 << 4;
    pppppppdVar46 = pppppppdVar52 + (ulong)bVar5 * 2;
    pppppppdVar31 = pppppppdVar52 + (long)(int)uVar16 * -2;
    do {
      ppppppdVar49 = *pppppppdVar31;
      lVar50 = lVar50 + -0x10;
      pppppppdVar46[1] = pppppppdVar31[1];
      *pppppppdVar46 = ppppppdVar49;
      pppppppdVar46 = pppppppdVar46 + 2;
      pppppppdVar31 = pppppppdVar31 + 2;
    } while (lVar50 != 0);
  }
  if ((int)uVar12 <= (int)uVar16) goto LAB_008c6924;
  uVar44 = (ulong)(int)uVar16;
  uVar48 = (ulong)(uVar13 >> 0x10 & 0xff);
  uVar30 = ~uVar44 + uVar48;
  uVar33 = (ulong)(uVar13 >> 8) & 0xff;
  if (1 < uVar30) {
    lVar50 = uVar44 * 0x10;
    uVar45 = uVar30 & 0xfffffffffffffffe;
    uVar44 = uVar45 + uVar44;
    puVar34 = (undefined4 *)((long)pppppppdVar52 + lVar50 + uVar33 * 0x10 + 0x1c);
    uVar47 = uVar45;
    do {
      uVar47 = uVar47 - 2;
      puVar34[-4] = 0;
      *puVar34 = 0;
      puVar34 = puVar34 + 8;
    } while (uVar47 != 0);
    if (uVar30 == uVar45) goto LAB_008c6924;
  }
  lVar50 = ~uVar44 + uVar48;
  puVar34 = (undefined4 *)((long)pppppppdVar52 + uVar44 * 0x10 + uVar33 * 0x10 + 0xc);
  do {
    lVar50 = lVar50 + -1;
    *puVar34 = 0;
    puVar34 = puVar34 + 4;
  } while (lVar50 != 0);
  goto LAB_008c6924;
  while( true ) {
    puVar22 = puVar37;
    puVar40 = puVar39;
    if (puVar32 <= puVar39) break;
LAB_008c4f20:
    puVar39 = puVar40 + 2;
    uVar23 = *puVar40;
    uVar12 = uVar12 - 1;
    puVar37 = puVar22 + 2;
    puVar22[1] = puVar40[1];
    *puVar22 = uVar23;
    if (uVar12 == 0) break;
  }
LAB_008c4f3c:
  puVar22 = puVar37;
  if (0 < (int)uVar12) {
    if (uVar12 == 1) {
      iVar11 = 1;
    }
    else {
      uVar44 = (ulong)uVar12 & 0x7ffffffe;
      puVar22 = puVar37 + uVar44 * 2;
      iVar11 = uVar12 - (int)uVar44;
      puVar34 = (undefined4 *)((long)puVar37 + 0x1c);
      uVar30 = uVar44;
      do {
        uVar30 = uVar30 - 2;
        puVar34[-4] = 0;
        *puVar34 = 0;
        puVar34 = puVar34 + 8;
      } while (uVar30 != 0);
      if (uVar44 == uVar12) goto LAB_008c4fbc;
    }
    uVar13 = iVar11 + 1;
    puVar37 = puVar22;
    do {
      uVar13 = uVar13 - 1;
      puVar22 = puVar37 + 2;
      *(undefined4 *)((long)puVar37 + 0xc) = 0;
      puVar37 = puVar22;
    } while (1 < uVar13);
  }
LAB_008c4fbc:
  pppppppdVar52 = *(double ********)(lVar50 + -0x20);
  *(long *)(param_1 + 0x50) = lVar50 + -0x30;
  *(double ********)(param_1 + 0x70) = pppppppdVar52;
  if ((uVar16 & 0xff000000) != 0) {
    puVar22 = *(undefined8 **)(lVar50 + -0x18);
  }
  uVar26 = *(undefined1 *)pppppdVar53;
  *(undefined8 **)(param_1 + 0x68) = puVar22;
  goto LAB_008c3a18;
LAB_008c5d10:
  plVar29 = *(long **)(param_1 + 0x68);
  lVar50 = *plVar27;
  plVar29[1] = plVar27[1];
  *plVar29 = lVar50;
  ppppppdVar49 = *pppppppdVar46;
  plVar29[3] = (long)pppppppdVar46[1];
  plVar29[2] = (long)ppppppdVar49;
  ppppppdVar49 = *pppppppdVar31;
  plVar29[5] = (long)pppppppdVar31[1];
  plVar29[4] = (long)ppppppdVar49;
  *(long **)(param_1 + 0x68) = plVar29 + 6;
  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar38;
  FUN_008cd928(param_1,2,uVar13 >> 8 & 0xff);
  goto LAB_008c5d4c;
switchD_008c3848_caseD_10:
  uVar16 = *(uint *)pppppdVar38;
  pppppdVar53 = pppppdVar38 + 1;
  pppppdVar19 = pppppdVar54 + (ulong)*(uint *)((long)pppppdVar38 + 4) * 2;
  pppppppdVar46 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 0x10) * 2;
  pppppppdVar35 = pppppppdVar52 + (ulong)(byte)(uVar16 >> 8) * 2;
  if (*(uint *)((long)pppppppdVar46 + 0xc) == 6) goto code_r0x008c3fcc;
  if (*(uint *)((long)pppppppdVar46 + 0xc) == 8) {
    pppppdVar18 = (*pppppppdVar46)[1];
    if ((pppppdVar18 != (double *****)0x0) && ((*(byte *)((long)pppppdVar18 + 6) >> 1 & 1) == 0)) {
      if ((*(byte *)((long)pppppdVar18 + 7) >> 1 & 1) == 0) {
        ppppdVar21 = (double ****)
                     FUN_008bdfe0(pppppdVar18,1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x340));
        unaff_x22 = pppppppdVar46;
        if (ppppdVar21 == (double ****)0x0) goto LAB_008c41a0;
      }
      else {
        ppppdVar21 = pppppdVar18[4] + -4;
      }
      if ((*(int *)((long)ppppdVar21 + 0xc) == 7) && (*(char *)((long)*ppppdVar21 + 6) != '\0')) {
        puVar22 = *(undefined8 **)(param_1 + 0x68);
        pppdVar7 = *ppppdVar21;
        puVar22[1] = ppppdVar21[1];
        *puVar22 = pppdVar7;
        ppppppdVar49 = *pppppppdVar46;
        puVar22[3] = pppppppdVar46[1];
        puVar22[2] = ppppppdVar49;
        ppppdVar21 = *pppppdVar19;
        puVar22[5] = pppppdVar19[1];
        puVar22[4] = ppppdVar21;
        ppppppdVar49 = *pppppppdVar35;
        puVar22[7] = pppppppdVar35[1];
        puVar22[6] = ppppppdVar49;
        *(undefined8 **)(param_1 + 0x68) = puVar22 + 8;
        *(uint *)(param_1 + 0x2c) = uVar16 >> 0x18;
        *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
        FUN_008cd928(param_1,3,0xffffffff);
        goto LAB_008c3950;
      }
    }
  }
LAB_008c41a0:
  *(double ******)(*(long *)(param_1 + 0x50) + 0x20) = pppppdVar53;
  FUN_008cb374(param_1);
  uVar26 = *(undefined1 *)pppppdVar53;
  pppppppdVar52 = *(double ********)(param_1 + 0x70);
  goto LAB_008c3a18;
code_r0x008c3fcc:
  pppppppdVar31 = (double *******)*pppppppdVar46;
  uVar16 = (uint)*(byte *)((long)pppppppdVar31 + 4) & uVar16 >> 0x18;
  ppppppdVar49 = pppppppdVar31[5] + (ulong)uVar16 * 4;
  unaff_x22 = pppppppdVar31;
  if ((((*(uint *)((long)ppppppdVar49 + 0x1c) & 0xf) == 5) &&
      (ppppppdVar49[2] == (double *****)*pppppdVar19)) &&
     ((*(int *)((long)ppppppdVar49 + 0xc) != 0 && (*(char *)((long)pppppppdVar31 + 7) == '\0')))) {
    ppppppdVar60 = *pppppppdVar35;
    ppppppdVar49[1] = (double *****)pppppppdVar35[1];
    *ppppppdVar49 = (double *****)ppppppdVar60;
    if (((int)*(uint *)((long)pppppppdVar35 + 0xc) < 5) ||
       ((*(byte *)((long)pppppppdVar31 + 2) >> 2 & 1) == 0)) goto LAB_008c3a14;
    ppppppdVar49 = *pppppppdVar35;
  }
  else {
    if (pppppppdVar31[2] == (double ******)0x0) {
      lVar50 = *(long *)(param_1 + 0x50);
    }
    else {
      lVar50 = *(long *)(param_1 + 0x50);
      if ((*(byte *)((long)pppppppdVar31[2] + 6) >> 1 & 1) == 0) goto LAB_008c406c;
    }
    if (*(char *)((long)pppppppdVar31 + 7) != '\0') {
LAB_008c406c:
      *(uint *)(param_1 + 0x2c) = uVar16;
      *(double ******)(lVar50 + 0x20) = pppppdVar53;
      goto LAB_008c4074;
    }
    *(double ******)(lVar50 + 0x20) = pppppdVar53;
    pdVar20 = (double *)FUN_008bce4c(param_1,pppppppdVar31,*pppppdVar19);
    *(char *)((long)pppppdVar38 + 3) = (char)((int)pdVar20 - *(uint *)(pppppppdVar31 + 5) >> 5);
    ppppppdVar49 = *pppppppdVar35;
    pdVar20[1] = (double)pppppppdVar35[1];
    *pdVar20 = (double)ppppppdVar49;
    if (((int)*(uint *)((long)pppppppdVar35 + 0xc) < 5) ||
       ((*(byte *)((long)pppppppdVar31 + 2) >> 2 & 1) == 0)) goto LAB_008c3a14;
    ppppppdVar49 = *pppppppdVar35;
  }
  if (((ulong)*ppppppdVar49 & 0x30000) != 0) goto LAB_008c3a10;
  goto LAB_008c3a14;
}

