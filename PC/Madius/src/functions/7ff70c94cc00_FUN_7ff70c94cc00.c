/* 7ff70c94cc00 FUN_7ff70c94cc00 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70c94e2ee) overlaps instruction at (ram,0x7ff70c94e2ed)
    */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c94cc00(longlong param_1,longlong *param_2,int *param_3)

{
  longlong *plVar1;
  byte bVar2;
  longlong *plVar3;
  longlong lVar4;
  char cVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  longlong lVar9;
  longlong lVar10;
  code *pcVar11;
  uint uVar12;
  int *piVar13;
  undefined8 uVar14;
  int iVar15;
  int iVar16;
  bool bVar17;
  undefined4 *in_stack_ffffffffffffff48;
  char cStack_a5;
  uint uStack_a4;
  char cStack_9e;
  char cStack_9d;
  byte bStack_9c;
  byte bStack_9b;
  char cStack_9a;
  char cStack_99;
  undefined8 uStack_98;
  undefined8 uStack_90;
  longlong lStack_88;
  int iStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  uint uStack_64;
  int *piStack_60;
  
  cStack_9e = '\0';
  cStack_9d = '\0';
  bStack_9b = 0;
  uStack_a4 = 0;
  if (*param_3 != -0x3f212453) {
    return 2;
  }
  if (*(char *)(param_1 + 0x1b4) == '\x01') {
    uStack_a4 = 0x2a;
    FUN_7ff70c9950b0(param_3);
    FUN_7ff70c94acb0(param_3,0x2a,0);
    if (param_3[0x16] != 0xf) {
      param_3[0x16] = 0xf;
      *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) =
           *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) + -1;
      FUN_7ff70c94f130(param_3);
    }
  }
  plVar1 = (longlong *)(param_1 + 0x40);
  piStack_60 = param_3 + 4;
LAB_7ff70c94ccb0:
  do {
    cStack_a5 = '\0';
    cVar5 = *(char *)(param_1 + 0x1b2);
    *(undefined1 *)(param_1 + 0x1b2) = 0;
    if ((cVar5 == '\x01') && (plVar3 = (longlong *)*plVar1, plVar3 != (longlong *)0x0)) {
      lVar9 = *plVar3;
      *(undefined8 *)(lVar9 + 0x10) = 0;
      if (*(longlong *)(param_1 + 8) == 0) {
        *(undefined8 *)(lVar9 + 0x18) = 0;
        *(longlong *)(param_1 + 8) = lVar9;
        *(longlong *)(param_1 + 0x10) = lVar9;
        iVar8 = *(int *)(lVar9 + 0x58);
      }
      else {
        lVar10 = *(longlong *)(param_1 + 0x10);
        *(longlong *)(lVar10 + 0x10) = lVar9;
        *(longlong *)(lVar9 + 0x18) = lVar10;
        *(longlong *)(param_1 + 0x10) = lVar9;
        iVar8 = *(int *)(lVar9 + 0x58);
      }
      if (iVar8 != 2) {
        *(undefined4 *)(lVar9 + 0x58) = 2;
        FUN_7ff70c994d50(lVar9);
      }
      FUN_7ff70c991030(plVar1,plVar3,0);
      FUN_7ff70c94a660(lVar9,0,8);
      *(undefined1 *)(lVar9 + 0x12c8) = 1;
    }
    uVar6 = param_3[0x16];
    iVar8 = 4;
    if (uVar6 - 3 < 0xc && *(longlong *)(param_3 + 8) == 0) {
      return 4;
    }
    if (uVar6 - 2 < 0xd && *(longlong *)(param_3 + 8) != 0) {
      in_stack_ffffffffffffff48 =
           (undefined4 *)((ulonglong)in_stack_ffffffffffffff48 & 0xffffffffffffff00);
      cVar5 = FUN_7ff70c94f220(param_3,param_2,&cStack_a5,&uStack_a4,in_stack_ffffffffffffff48);
      uVar6 = param_3[0x16];
      iVar16 = 0;
      if (cVar5 == '\0') goto LAB_7ff70c94cd93;
      goto LAB_7ff70c94dfc0;
    }
LAB_7ff70c94cd93:
    iVar16 = 0;
    iVar15 = 0;
    switch(uVar6) {
    case 0:
      uStack_a4 = func_0x7ff70c994d80(param_3);
      iVar16 = iVar15;
      if (uStack_a4 == 0) {
        if (param_3[0x16] != 2) {
          param_3[0x16] = 2;
          FUN_7ff70c994d50(param_3);
        }
        func_0x7ff70c990a70(&uStack_98,param_3);
        *(undefined4 *)param_2 = (undefined4)uStack_98;
        *(undefined4 *)((longlong)param_2 + 4) = uStack_98._4_4_;
        *(undefined4 *)(param_2 + 1) = (undefined4)uStack_90;
        *(undefined4 *)((longlong)param_2 + 0xc) = uStack_90._4_4_;
        goto code_r0x7ff70c94df60;
      }
      break;
    case 1:
    case 0xf:
    case 0x10:
      break;
    case 2:
      if (*(longlong *)(param_3 + 0x310) == 0) {
        lVar9 = (*_DAT_7ff70cbebad0)(param_3[0x1af] + 1);
        *(longlong *)(param_3 + 0x310) = lVar9;
        if (lVar9 == 0) {
          uStack_a4 = 0x1b;
          iVar16 = iVar15;
          break;
        }
      }
      func_0x7ff70c990a70(&uStack_98,param_3,2);
      *(undefined4 *)param_2 = (undefined4)uStack_98;
      *(undefined4 *)((longlong)param_2 + 4) = uStack_98._4_4_;
      *(undefined4 *)(param_2 + 1) = (undefined4)uStack_90;
      *(undefined4 *)((longlong)param_2 + 0xc) = uStack_90._4_4_;
      if (param_3[0xc0] != 0) {
        FUN_7ff70c94a660(param_3,param_3[0xc0],10);
      }
      if (param_3[0xc1] != 0) {
        FUN_7ff70c94a660(param_3,param_3[0xc1],2);
      }
      uVar6 = func_0x7ff70c946640(param_3,&cStack_99);
      uStack_a4 = uVar6;
      if (uVar6 == 0x59) {
        if (param_3[0x16] != 1) {
          param_3[0x16] = 1;
        }
        FUN_7ff70c990fc0(plVar1,*(undefined8 *)(param_1 + 0x48),param_3,param_3 + 10);
        lVar9 = *(longlong *)(param_3 + 4);
        if (*(longlong *)(param_3 + 6) == 0) {
          *(longlong *)(param_1 + 8) = lVar9;
          uVar14 = *(undefined8 *)(param_3 + 6);
          if (lVar9 != 0) goto code_r0x7ff70c94d2e4;
code_r0x7ff70c94d91d:
          *(undefined8 *)(param_1 + 0x10) = uVar14;
        }
        else {
          *(longlong *)(*(longlong *)(param_3 + 6) + 0x10) = lVar9;
          uVar14 = *(undefined8 *)(param_3 + 6);
          if (lVar9 == 0) goto code_r0x7ff70c94d91d;
code_r0x7ff70c94d2e4:
          *(undefined8 *)(lVar9 + 0x18) = uVar14;
        }
        param_3[4] = 0;
        param_3[5] = 0;
        param_3[6] = 0;
        param_3[7] = 0;
        uStack_a4 = 0;
        iVar16 = iVar15;
      }
      else {
        if ((char)param_3[0x4b2] == '\x01') {
          if (*(char *)((longlong)param_3 + 0xa37) == '\x01') {
            FUN_7ff70c941400(param_3,&UNK_7ff70cb83878);
          }
          lVar9 = *(longlong *)(param_3 + 0x36);
          plVar3 = *(longlong **)(lVar9 + 0x40);
          if (plVar3 != (longlong *)0x0) {
            lVar10 = *plVar3;
            *(undefined8 *)(lVar10 + 0x10) = 0;
            if (*(longlong *)(lVar9 + 8) == 0) {
              *(undefined8 *)(lVar10 + 0x18) = 0;
              *(longlong *)(lVar9 + 8) = lVar10;
            }
            else {
              lVar4 = *(longlong *)(lVar9 + 0x10);
              *(longlong *)(lVar4 + 0x10) = lVar10;
              *(longlong *)(lVar10 + 0x18) = lVar4;
            }
            *(longlong *)(lVar9 + 0x10) = lVar10;
            uStack_64 = uVar6;
            if (*(int *)(lVar10 + 0x58) != 2) {
              *(undefined4 *)(lVar10 + 0x58) = 2;
              FUN_7ff70c994d50(lVar10);
            }
            FUN_7ff70c991030(lVar9 + 0x40,plVar3,0);
            FUN_7ff70c94a660(lVar10,0);
            *(undefined1 *)(lVar10 + 0x12c8) = 1;
            uVar6 = uStack_64;
          }
        }
        iVar16 = iVar15;
        if (uVar6 == 0) {
          if (cStack_99 == '\x01') {
            iVar16 = 0;
            uVar6 = 3;
            if (param_3[0x16] != 3) {
              param_3[0x16] = 3;
            }
          }
          else if (bStack_9c == 1) {
            iVar16 = -1;
            uVar6 = 6;
            if (param_3[0x16] != 6) goto code_r0x7ff70c94d59b;
          }
          else {
            iVar16 = -1;
            uVar6 = 4;
            if (param_3[0x16] != 4) {
              param_3[0x16] = 4;
            }
          }
          goto code_r0x7ff70c94df73;
        }
      }
      break;
    case 3:
      uStack_98 = 0;
      lVar9 = *(longlong *)(param_3 + 8);
      lVar10 = 0xf8;
      if ((*(char *)(lVar9 + 0x2c8) == '\0') && (lVar10 = 0x70, *(char *)(lVar9 + 0x2d1) != '\0')) {
        lVar10 = 0xa0;
      }
      uStack_98 = func_0x7ff70c983c70(param_3,*(undefined8 *)(lVar9 + lVar10));
      if (uStack_98 == 0) {
code_r0x7ff70c94d0fb:
        uStack_a4 = func_0x7ff70c984880(param_3,&uStack_98);
        bVar17 = uStack_a4 == 0;
      }
      else {
        *(longlong *)(param_3 + 0x364) = uStack_98;
        *(undefined1 *)(param_3 + 0x36c) = 1;
        uStack_a4 = 0;
        bVar17 = true;
        if ((*(char *)((longlong)param_3 + 0xa37) == '\x01') &&
           (FUN_7ff70c941400(param_3,&UNK_7ff70cb871b6), uStack_98 == 0)) goto code_r0x7ff70c94d0fb;
      }
      iVar8 = FUN_7ff70c94b110(param_1,param_3);
      if (iVar8 != 0) {
        return iVar8;
      }
      if (uStack_98 == 0) {
        iVar16 = 0;
        if (!bVar17) goto code_r0x7ff70c94d760;
      }
      else {
        uStack_a4 = func_0x7ff70c985000(param_3,&bStack_9c);
        if (uStack_a4 == 0) {
          if (bStack_9c == 1) {
            iVar16 = -1;
            if (param_3[0x16] != 6) {
              param_3[0x16] = 6;
            }
          }
          else {
            iVar16 = -1;
            if (param_3[0x16] != 4) {
              param_3[0x16] = 4;
            }
          }
        }
        else {
          param_3[8] = 0;
          param_3[9] = 0;
code_r0x7ff70c94d760:
          cStack_a5 = '\x01';
          iVar16 = 0;
        }
      }
      break;
    case 4:
      uStack_a4 = func_0x7ff70c954da0(param_3,0,0,&bStack_9c);
      if ((uStack_a4 == 0 & bStack_9c) != 1) {
joined_r0x7ff70c94d53f:
        iVar16 = iVar15;
        if (uStack_a4 != 0) goto code_r0x7ff70c94d5b6;
        break;
      }
code_r0x7ff70c94d586:
      iVar16 = -1;
      uVar6 = 6;
      if (param_3[0x16] == 6) goto code_r0x7ff70c94df73;
code_r0x7ff70c94d59b:
      uVar6 = 6;
      iVar16 = -1;
      param_3[0x16] = 6;
      goto code_r0x7ff70c94df73;
    case 5:
      uStack_a4 = func_0x7ff70c989fb0(param_3,&cStack_9e);
      if (*(char *)(*(longlong *)(param_3 + 8) + 0x2cc) == '\x01') {
        uStack_a4 = 0;
        FUN_7ff70c94acb0(param_3,0);
        if (param_3[0x16] == 2) {
          iVar16 = -1;
          uVar6 = 2;
          goto code_r0x7ff70c94df73;
        }
        param_3[0x16] = 2;
        FUN_7ff70c994d50(param_3);
        goto code_r0x7ff70c94df60;
      }
      if (uStack_a4 == 0) goto code_r0x7ff70c94d586;
code_r0x7ff70c94d57c:
      cStack_a5 = '\x01';
      iVar16 = iVar15;
      break;
    case 6:
      uVar6 = uStack_a4;
      if (*(char *)((longlong)param_3 + 0x12ce) == '\x01') {
        *(undefined1 *)((longlong)param_3 + 0x12ce) = 0;
        *(byte *)(param_3 + 0x55) = *(byte *)(param_3 + 0x55) & 0xfd;
        piVar13 = param_3 + 0xd4;
        if (((*(byte *)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x84) & 3) != 0) &&
           (piVar13 = *(int **)(param_3 + 0x460), *(int **)(param_3 + 0x460) == (int *)0x0)) {
          piVar13 = param_3 + 0xd4;
        }
        uVar6 = 0;
        uVar12 = 0;
        if (*(longlong *)(param_3 + 0x86) == 0) {
          bVar2 = *(byte *)((longlong)param_3 + 0x12ba);
          if (bVar2 - 2 < 2) {
            uVar7 = func_0x7ff70c8fb700(piVar13);
            uVar6 = uVar12;
            if (uVar7 != 0) {
              FUN_7ff70c9412d0(param_3,&UNK_7ff70cb892c9);
              uVar6 = uVar7;
            }
          }
          else if ((bVar2 != 0) && (bVar2 != 5)) {
            pcVar11 = *(code **)(param_3 + 0x88);
            if (pcVar11 == (code *)0x0) {
              pcVar11 = *(code **)(param_3 + 0x9c);
              if (pcVar11 == (code *)0x0) {
                if (*(longlong *)(param_3 + 0x444) == _DAT_7ff70cb96428) {
                  do {
                    lVar9 = *(longlong *)(param_3 + 0x446);
                    cVar5 = func_0x7ff70d93ea85(lVar9,0,0);
                    plVar1 = param_2 + -0xf5e0001;
                    *(char *)plVar1 = (char)*plVar1 - cVar5;
                  } while (lVar9 != 1 && (char)*plVar1 != '\0');
                    /* WARNING: Bad instruction - Truncating control flow here */
                  halt_baddata();
                }
                FUN_7ff70c9412d0(param_3,&UNK_7ff70cb87015);
              }
              else {
                lVar9 = *(longlong *)(param_3 + 0x38);
                if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
                  *(undefined1 *)(lVar9 + 0x1b3) = 1;
                  pcVar11 = *(code **)(param_3 + 0x9c);
                }
                iVar8 = (*pcVar11)(param_3,1);
                lVar9 = *(longlong *)(param_3 + 0x38);
                if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
                  *(undefined1 *)(lVar9 + 0x1b3) = 0;
                }
                if (*(char *)((longlong)param_3 + 0xa37) == '\x01') {
                  FUN_7ff70c941400(param_3,&UNK_7ff70cb88d2e);
                }
                uVar6 = uVar12;
                if (iVar8 == 0) goto joined_r0x7ff70c94d5ad;
                FUN_7ff70c9412d0(param_3,&UNK_7ff70cb88c32);
              }
            }
            else {
              lVar9 = *(longlong *)(param_3 + 0x38);
              if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
                *(undefined1 *)(lVar9 + 0x1b3) = 1;
                pcVar11 = *(code **)(param_3 + 0x88);
              }
              iVar8 = (*pcVar11)(*(undefined8 *)(param_3 + 0xae),0);
              lVar9 = *(longlong *)(param_3 + 0x38);
              if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
                *(undefined1 *)(lVar9 + 0x1b3) = 0;
              }
              uVar6 = uVar12;
              if (iVar8 == 0) goto joined_r0x7ff70c94d5ad;
              FUN_7ff70c9412d0(param_3,&UNK_7ff70cb88c53);
            }
            uVar6 = 0x41;
          }
        }
      }
joined_r0x7ff70c94d5ad:
      uStack_a4 = uVar6;
      if (uStack_a4 != 0) {
code_r0x7ff70c94d5b6:
        uVar6 = uStack_a4;
        FUN_7ff70c9950b0(param_3);
code_r0x7ff70c94d5c3:
        FUN_7ff70c94acb0(param_3,uVar6);
        cStack_a5 = '\x01';
        iVar16 = 0;
        break;
      }
      lVar9 = *(longlong *)(param_3 + 8);
      if (*(char *)(lVar9 + 0x2cf) == '\x01') goto code_r0x7ff70c94dbac;
      cStack_9e = '\0';
      cVar5 = func_0x7ff70c955100(lVar9,0);
      if (cVar5 == '\0') {
        if (*(char *)(lVar9 + 0x2d6) == '\0') goto code_r0x7ff70c94dc10;
      }
      else if (*(char *)(lVar9 + 0x2d6) == '\0') {
code_r0x7ff70c94dc10:
        pcVar11 = *(code **)(*(longlong *)(lVar9 + 0x2e8) + 0x28);
        if (pcVar11 == (code *)0x0) {
          cStack_9e = '\x01';
        }
        else {
          uStack_a4 = (*pcVar11)(param_3,&cStack_9e);
          if (uStack_a4 != 0) goto code_r0x7ff70c94d5b6;
        }
        *(undefined1 *)(lVar9 + 0x2d6) = 1;
      }
      else if (*(longlong *)(*(longlong *)(lVar9 + 0x2e8) + 0x30) == 0) {
        cStack_9e = '\x01';
      }
      uStack_a4 = 0;
      iVar8 = param_3[0x16];
      if (cStack_9e != '\0') goto joined_r0x7ff70c94dbbb;
      iVar16 = -1;
      uVar6 = 7;
      if (iVar8 != 7) {
        param_3[0x16] = 7;
      }
      goto code_r0x7ff70c94df73;
    case 7:
      if ((*(longlong *)(param_3 + 8) == 0) ||
         (pcVar11 = *(code **)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x30),
         pcVar11 == (code *)0x0)) {
        cStack_9e = '\x01';
        uStack_a4 = 0;
      }
      else {
        cStack_9e = '\0';
        uStack_a4 = (*pcVar11)(param_3,&cStack_9e);
        if (uStack_a4 != 0) goto joined_r0x7ff70c94d53f;
      }
      if (cStack_9e == '\0') goto joined_r0x7ff70c94d53f;
code_r0x7ff70c94dbac:
      iVar8 = param_3[0x16];
joined_r0x7ff70c94dbbb:
      iVar16 = -1;
      uVar6 = 8;
      if (iVar8 != 8) {
        uVar6 = 8;
        iVar16 = -1;
        param_3[0x16] = 8;
      }
      goto code_r0x7ff70c94df73;
    case 8:
      pcVar11 = *(code **)(param_3 + 0xaa);
      if (pcVar11 != (code *)0x0) {
        lVar9 = *(longlong *)(param_3 + 0x38);
        if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
          *(undefined1 *)(lVar9 + 0x1b3) = 1;
          pcVar11 = *(code **)(param_3 + 0xaa);
        }
        in_stack_ffffffffffffff48 =
             (undefined4 *)
             CONCAT44((int)((ulonglong)in_stack_ffffffffffffff48 >> 0x20),param_3[0x4e1]);
        iVar8 = (*pcVar11)(*(undefined8 *)(param_3 + 0xac),param_3 + 0x4c7,param_3 + 0x4d5,
                           param_3[0x4d3],in_stack_ffffffffffffff48);
        lVar9 = *(longlong *)(param_3 + 0x38);
        if ((lVar9 != 0) || (lVar9 = *(longlong *)(param_3 + 0x36), lVar9 != 0)) {
          *(undefined1 *)(lVar9 + 0x1b3) = 0;
        }
        if (iVar8 != 0) {
          FUN_7ff70c9412d0(param_3,&UNK_7ff70cb8527b);
          uStack_a4 = 0x2a;
          FUN_7ff70c9950b0(param_3);
          uVar6 = 0x2a;
          goto code_r0x7ff70c94d5c3;
        }
      }
      if (*(char *)((longlong)param_3 + 0xa22) != '\x01') {
        pcVar11 = *(code **)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x10);
        if (pcVar11 == (code *)0x0) {
          uStack_a4 = 0;
code_r0x7ff70c94d9db:
          if (cStack_9d == '\0') {
            iVar16 = -1;
            uVar6 = 9;
            if (param_3[0x16] != 9) {
              param_3[0x16] = 9;
            }
          }
          else if (*(char *)(*(longlong *)(param_3 + 8) + 0x2d5) == '\x01') {
            iVar16 = -1;
            uVar6 = 10;
            if (param_3[0x16] != 10) {
              param_3[0x16] = 10;
            }
          }
          else {
            if (param_3[0x16] != 0xb) {
              param_3[0x16] = 0xb;
              goto code_r0x7ff70c94df46;
            }
            iVar16 = -1;
            uVar6 = 0xb;
          }
          goto code_r0x7ff70c94df73;
        }
        uVar6 = (*pcVar11)(param_3,&cStack_9d);
        uStack_a4 = uVar6;
        if (uVar6 == 0x37) {
          if (*(char *)(*(longlong *)(param_3 + 8) + 0x2cf) == '\x01') {
            uStack_98 = 0;
            uVar6 = func_0x7ff70c995630(param_3,&uStack_98);
            if (uVar6 == 0) {
              uVar6 = 0x37;
            }
            else {
              cStack_a5 = '\x01';
              uStack_a4 = uVar6;
            }
            FUN_7ff70c9950b0(param_3);
            uVar6 = FUN_7ff70c94acb0(param_3,uVar6);
            if (uStack_98 == 0) {
              cStack_a5 = '\x01';
              uVar6 = uStack_a4;
code_r0x7ff70c94e281:
              uStack_a4 = uVar6;
              iVar16 = 0;
            }
            else {
              if (((uVar6 != 0x37) && (uVar6 != 0)) ||
                 (uVar6 = func_0x7ff70c9950c0(param_3), uVar6 != 0)) goto code_r0x7ff70c94e281;
              if (param_3[0x16] != 2) {
                param_3[0x16] = 2;
                FUN_7ff70c994d50(param_3);
              }
              uStack_a4 = 0;
              iVar16 = -1;
            }
            (*_DAT_7ff70cbebad8)(uStack_98);
            break;
          }
        }
        else if (uVar6 == 0) goto code_r0x7ff70c94d9db;
        FUN_7ff70c9950b0(param_3);
        if (*(longlong *)(param_3 + 8) != 0) {
          FUN_7ff70c94acb0(param_3,uVar6);
        }
        goto code_r0x7ff70c94d57c;
      }
      FUN_7ff70c956760(*(longlong *)(param_3 + 8),0);
      if (param_3[0x16] != 0xe) {
        param_3[0x16] = 0xe;
      }
      uStack_a4 = 0;
      goto code_r0x7ff70c94df60;
    case 9:
      lVar9 = *(longlong *)(param_3 + 8);
      if ((lVar9 == 0) ||
         (pcVar11 = *(code **)(*(longlong *)(lVar9 + 0x2e8) + 0x38), pcVar11 == (code *)0x0)) {
        cStack_9d = '\x01';
        uStack_a4 = 0;
        bVar2 = *(byte *)(lVar9 + 0x2d5);
        param_3[0x16] = bVar2 ^ 0xb;
        if (bVar2 == 0) {
code_r0x7ff70c94df46:
          *(undefined1 *)((longlong)param_3 + 0x1cf) = 0;
          func_0x7ff70c990a70(&uStack_98,param_3);
          goto code_r0x7ff70c94df60;
        }
        iVar16 = -1;
        uVar6 = 10;
      }
      else {
        cStack_9d = '\0';
        uVar6 = (*pcVar11)(param_3,&cStack_9d);
        if (uVar6 != 0) {
code_r0x7ff70c94d18d:
          uStack_a4 = uVar6;
          FUN_7ff70c9950b0(param_3);
          goto code_r0x7ff70c94d5c3;
        }
        iVar16 = iVar15;
        uStack_a4 = uVar6;
        if (cStack_9d != '\x01') break;
        uVar6 = param_3[0x16];
        bVar2 = *(byte *)(*(longlong *)(param_3 + 8) + 0x2d5);
        uVar12 = bVar2 ^ 0xb;
        iVar16 = -1;
        if (uVar6 != uVar12) {
          param_3[0x16] = uVar12;
          uVar6 = 10;
          if (bVar2 == 0) goto code_r0x7ff70c94df46;
        }
      }
      goto code_r0x7ff70c94df73;
    case 10:
      iStack_7c = 0;
      pcVar11 = *(code **)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x20);
      if (pcVar11 == (code *)0x0) {
        uStack_a4 = 0;
        iVar16 = iVar15;
      }
      else {
        uVar6 = (*pcVar11)(param_3,&iStack_7c);
        if (uVar6 != 0) goto code_r0x7ff70c94d18d;
        iVar16 = iVar15;
        uStack_a4 = uVar6;
        if (iStack_7c != 0) {
          uVar6 = (uint)(iStack_7c == 1) * 2 + 9;
          iVar16 = -1;
          if (param_3[0x16] != uVar6) {
            param_3[0x16] = uVar6;
            uVar6 = 9;
            if (iStack_7c == 1) goto code_r0x7ff70c94df46;
          }
          goto code_r0x7ff70c94df73;
        }
      }
      break;
    case 0xb:
      lVar9 = *(longlong *)(param_3 + 8);
      if ((*(char *)(lVar9 + 0x2db) == '\x01') &&
         (plVar3 = (longlong *)*plVar1, plVar3 != (longlong *)0x0)) {
        lVar9 = *plVar3;
        *(undefined8 *)(lVar9 + 0x10) = 0;
        if (*(longlong *)(param_1 + 8) == 0) {
          *(undefined8 *)(lVar9 + 0x18) = 0;
          *(longlong *)(param_1 + 8) = lVar9;
          *(longlong *)(param_1 + 0x10) = lVar9;
          iVar8 = *(int *)(lVar9 + 0x58);
        }
        else {
          lVar10 = *(longlong *)(param_1 + 0x10);
          *(longlong *)(lVar10 + 0x10) = lVar9;
          *(longlong *)(lVar9 + 0x18) = lVar10;
          *(longlong *)(param_1 + 0x10) = lVar9;
          iVar8 = *(int *)(lVar9 + 0x58);
        }
        if (iVar8 != 2) {
          *(undefined4 *)(lVar9 + 0x58) = 2;
          FUN_7ff70c994d50(lVar9);
        }
        FUN_7ff70c991030(plVar1,plVar3,0);
        FUN_7ff70c94a660(lVar9,0);
        *(undefined1 *)(lVar9 + 0x12c8) = 1;
        lVar9 = *(longlong *)(param_3 + 8);
      }
      if (*(longlong *)(lVar9 + 0x308) == -1) {
        iVar8 = param_3[0x16];
        if (*(longlong *)(lVar9 + 0x310) == -1) {
          iVar16 = -1;
          uVar6 = 0xe;
          if (iVar8 != 0xe) {
            param_3[0x16] = 0xe;
          }
          goto code_r0x7ff70c94df73;
        }
      }
      else {
        iVar8 = param_3[0x16];
      }
      iVar16 = -1;
      if (iVar8 == 0xc) break;
      param_3[0x16] = 0xc;
      iVar16 = -1;
      uVar6 = 0xc;
      goto code_r0x7ff70c94df73;
    case 0xc:
      lStack_88 = 0;
      cStack_9a = '\0';
      if (*(longlong *)(param_3 + 0xca) == 0) {
        lVar10 = 0;
        lVar9 = *(longlong *)(param_3 + 0xcc);
        if (lVar9 != 0) goto code_r0x7ff70c94cf39;
code_r0x7ff70c94d649:
        lVar9 = 0;
        if (lVar10 == 0) {
code_r0x7ff70c94d658:
          uVar6 = func_0x7ff70c993c40(*(undefined8 *)(param_3 + 8),param_3,&bStack_9b,&cStack_9a);
          uStack_a4 = uVar6;
          if ((uVar6 == 0x38 | bStack_9b) == 1) {
            uVar12 = func_0x7ff70c995630(param_3,&lStack_88);
            if (uVar12 == 0) {
              if (lStack_88 == 0) goto code_r0x7ff70c94da4f;
              uStack_a4 = 0;
              bStack_9b = 1;
              bVar17 = true;
              goto code_r0x7ff70c94daa3;
            }
            if (uVar6 == 0) {
              uStack_a4 = uVar12;
              uVar6 = uVar12;
            }
          }
          else {
code_r0x7ff70c94da4f:
            if (uVar6 == 0) {
              bVar17 = false;
              if (bStack_9b != 1) {
                iVar16 = 0;
                if (cStack_9a == '\x01') {
                  FUN_7ff70c94a660(param_3,0);
                  iVar16 = 0;
                }
                break;
              }
code_r0x7ff70c94daa3:
              FUN_7ff70c9950b0(param_3);
              if ((bVar17) || (*(longlong *)(param_3 + 100) != 0)) {
                if (!bVar17) {
                  (*_DAT_7ff70cbebad8)(lStack_88);
                  lStack_88 = *(longlong *)(param_3 + 100);
                  param_3[100] = 0;
                  param_3[0x65] = 0;
                }
                iVar16 = 0;
                FUN_7ff70c94acb0(param_3,0,0);
                uStack_a4 = func_0x7ff70c9950c0(param_3,lStack_88);
                if ((uStack_a4 == 0) && (iVar16 = -1, param_3[0x16] != 2)) {
                  param_3[0x16] = 2;
                  FUN_7ff70c994d50(param_3);
                }
                (*_DAT_7ff70cbebad8)(lStack_88);
              }
              else {
                if (*(longlong *)(param_3 + 0x62) != 0) {
                  (*_DAT_7ff70cbebad8)(lStack_88);
                  lStack_88 = *(longlong *)(param_3 + 0x62);
                  param_3[0x62] = 0;
                  param_3[99] = 0;
                  uVar6 = func_0x7ff70c9950c0(param_3);
                  uStack_a4 = uVar6;
                  (*_DAT_7ff70cbebad8)(lStack_88);
                  if (uVar6 != 0) {
                    cStack_a5 = '\x01';
                    uStack_a4 = FUN_7ff70c94acb0(param_3,uVar6);
                    iVar16 = 0;
                    if (uStack_a4 != 0) break;
                  }
                }
                iVar16 = -1;
                if (param_3[0x16] != 0xe) {
                  param_3[0x16] = 0xe;
                }
              }
              break;
            }
          }
          if ((uVar6 != 0x5c) &&
             ((*(uint *)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x8c) & 2) == 0)) {
            FUN_7ff70c956760(*(longlong *)(param_3 + 8),2);
          }
          FUN_7ff70c9950b0(param_3);
          FUN_7ff70c94acb0(param_3,uVar6);
          iVar16 = 0;
          break;
        }
      }
      else {
        uStack_98 = *(longlong *)(param_3 + 0x2cc);
        uStack_90 = *(longlong *)(param_3 + 0x2ce);
        uStack_78 = (undefined4)*param_2;
        uStack_74 = *(undefined4 *)((longlong)param_2 + 4);
        uStack_70 = (undefined4)param_2[1];
        uStack_6c = *(undefined4 *)((longlong)param_2 + 0xc);
        in_stack_ffffffffffffff48 = &uStack_78;
        lVar10 = func_0x7ff70c990d70(*(undefined8 *)(param_3 + 0x2a4),
                                     *(undefined8 *)(param_3 + 0x2d0),*(longlong *)(param_3 + 0xca),
                                     &uStack_98,in_stack_ffffffffffffff48);
        lVar9 = *(longlong *)(param_3 + 0xcc);
        if (lVar9 == 0) goto code_r0x7ff70c94d649;
code_r0x7ff70c94cf39:
        uStack_98 = *(longlong *)(param_3 + 0x2d2);
        uStack_90 = *(longlong *)(param_3 + 0x2d4);
        uStack_78 = (undefined4)*param_2;
        uStack_74 = *(undefined4 *)((longlong)param_2 + 4);
        uStack_70 = (undefined4)param_2[1];
        uStack_6c = *(undefined4 *)((longlong)param_2 + 0xc);
        in_stack_ffffffffffffff48 = &uStack_78;
        lVar9 = func_0x7ff70c990d70(*(undefined8 *)(param_3 + 0x2a2),
                                    *(undefined8 *)(param_3 + 0x2d6),lVar9,&uStack_98,
                                    in_stack_ffffffffffffff48);
        if (lVar10 == 0 && lVar9 == 0) goto code_r0x7ff70c94d658;
      }
      uStack_98 = *param_2;
      uStack_90 = param_2[1];
      func_0x7ff70c990cb0(param_3,&uStack_98);
      if (param_3[0x16] != 0xd) {
        param_3[0x16] = 0xd;
      }
      if (lVar10 < lVar9) {
        lVar10 = lVar9;
      }
      FUN_7ff70c94a660(param_3,lVar10);
      iVar16 = 0;
      break;
    case 0xd:
      iVar8 = FUN_7ff70c98fd10(param_3);
      if (iVar8 == 0) {
        uStack_98 = *param_2;
        uStack_90 = param_2[1];
        uStack_a4 = func_0x7ff70c992250(param_3,&uStack_98);
        if (uStack_a4 == 0) {
          if (*(longlong *)(param_3 + 0xca) == 0) {
            lVar9 = 0;
          }
          else {
            uStack_98 = *(longlong *)(param_3 + 0x2cc);
            uStack_90 = *(longlong *)(param_3 + 0x2ce);
            uStack_78 = (undefined4)*param_2;
            uStack_74 = *(undefined4 *)((longlong)param_2 + 4);
            uStack_70 = (undefined4)param_2[1];
            uStack_6c = *(undefined4 *)((longlong)param_2 + 0xc);
            in_stack_ffffffffffffff48 = &uStack_78;
            lVar9 = func_0x7ff70c990d70(*(undefined8 *)(param_3 + 0x2a4),
                                        *(undefined8 *)(param_3 + 0x2d0),
                                        *(longlong *)(param_3 + 0xca),&uStack_98,
                                        in_stack_ffffffffffffff48);
          }
          if (*(longlong *)(param_3 + 0xcc) == 0) {
            lVar10 = 0;
            if (lVar9 == 0) goto code_r0x7ff70c94ddd5;
          }
          else {
            uStack_98 = *(longlong *)(param_3 + 0x2d2);
            uStack_90 = *(longlong *)(param_3 + 0x2d4);
            uStack_78 = (undefined4)*param_2;
            uStack_74 = *(undefined4 *)((longlong)param_2 + 4);
            uStack_70 = (undefined4)param_2[1];
            uStack_6c = *(undefined4 *)((longlong)param_2 + 0xc);
            in_stack_ffffffffffffff48 = &uStack_78;
            lVar10 = func_0x7ff70c990d70(*(undefined8 *)(param_3 + 0x2a2),
                                         *(undefined8 *)(param_3 + 0x2d6),
                                         *(longlong *)(param_3 + 0xcc),&uStack_98,
                                         in_stack_ffffffffffffff48);
            if (lVar9 == 0 && lVar10 == 0) {
code_r0x7ff70c94ddd5:
              if (param_3[0x16] != 0xc) {
                param_3[0x16] = 0xc;
              }
              uStack_98 = *param_2;
              uStack_90 = param_2[1];
              func_0x7ff70c990cb0(param_3,&uStack_98);
              iVar16 = iVar15;
              break;
            }
          }
          if (lVar9 < lVar10) {
            lVar9 = lVar10;
          }
          FUN_7ff70c94a660(param_3,lVar9);
          break;
        }
      }
      else {
        uStack_a4 = 0x2a;
      }
      uVar6 = uStack_a4;
      if ((uStack_a4 != 0x5c) &&
         ((*(uint *)(*(longlong *)(*(longlong *)(param_3 + 8) + 0x2e8) + 0x8c) & 2) == 0)) {
        FUN_7ff70c956760(*(longlong *)(param_3 + 8),2);
      }
      FUN_7ff70c9950b0(param_3);
      FUN_7ff70c94acb0(param_3,uVar6);
      break;
    case 0xe:
      if (*(longlong *)(param_3 + 8) != 0) {
        if ((*(char *)(*(longlong *)(param_3 + 8) + 0x2db) == '\x01') &&
           (plVar3 = (longlong *)*plVar1, plVar3 != (longlong *)0x0)) {
          lVar9 = *plVar3;
          *(undefined8 *)(lVar9 + 0x10) = 0;
          if (*(longlong *)(param_1 + 8) == 0) {
            *(undefined8 *)(lVar9 + 0x18) = 0;
            *(longlong *)(param_1 + 8) = lVar9;
            *(longlong *)(param_1 + 0x10) = lVar9;
            iVar8 = *(int *)(lVar9 + 0x58);
          }
          else {
            lVar10 = *(longlong *)(param_1 + 0x10);
            *(longlong *)(lVar10 + 0x10) = lVar9;
            *(longlong *)(lVar9 + 0x18) = lVar10;
            *(longlong *)(param_1 + 0x10) = lVar9;
            iVar8 = *(int *)(lVar9 + 0x58);
          }
          if (iVar8 != 2) {
            *(undefined4 *)(lVar9 + 0x58) = 2;
            FUN_7ff70c994d50(lVar9);
          }
          FUN_7ff70c991030(plVar1,plVar3,0);
          FUN_7ff70c94a660(lVar9,0);
          *(undefined1 *)(lVar9 + 0x12c8) = 1;
        }
        uVar6 = uStack_a4;
        uVar12 = FUN_7ff70c94acb0(param_3,uStack_a4);
        if (uVar6 == 0) {
          iVar8 = param_3[0x16];
          uStack_a4 = uVar12;
        }
        else {
          iVar8 = param_3[0x16];
        }
        if (iVar8 == 0xf) {
          iVar16 = -1;
          uVar6 = 0xf;
          goto code_r0x7ff70c94df73;
        }
      }
      param_3[0x16] = 0xf;
      *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) =
           *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) + -1;
      FUN_7ff70c94f130(param_3);
code_r0x7ff70c94df60:
      iVar16 = -1;
      break;
    default:
      goto LAB_7ff70c94e3b2;
    }
    uVar6 = param_3[0x16];
code_r0x7ff70c94df73:
    if (*(longlong *)(param_3 + 8) != 0) {
      if (1 < (int)uVar6) {
        if (iVar16 != -1 && uVar6 < 8) {
          iVar16 = 0;
          if (*(char *)(param_1 + 0x1b2) != '\0') goto code_r0x7ff70c94dfc9;
          in_stack_ffffffffffffff48 =
               (undefined4 *)CONCAT71((int7)((ulonglong)in_stack_ffffffffffffff48 >> 8),1);
          FUN_7ff70c94f220(param_3,param_2,&cStack_a5,&uStack_a4,in_stack_ffffffffffffff48);
          uVar6 = param_3[0x16];
          iVar16 = 0;
        }
        goto LAB_7ff70c94dfc0;
      }
code_r0x7ff70c94dfc9:
      if (uStack_a4 != 0) {
        plVar3 = (longlong *)*plVar1;
        if (plVar3 != (longlong *)0x0) {
          lVar9 = *plVar3;
          *(undefined8 *)(lVar9 + 0x10) = 0;
          if (*(longlong *)(param_1 + 8) == 0) {
            *(undefined8 *)(lVar9 + 0x18) = 0;
            *(longlong *)(param_1 + 8) = lVar9;
            *(longlong *)(param_1 + 0x10) = lVar9;
            iVar8 = *(int *)(lVar9 + 0x58);
          }
          else {
            lVar10 = *(longlong *)(param_1 + 0x10);
            *(longlong *)(lVar10 + 0x10) = lVar9;
            *(longlong *)(lVar9 + 0x18) = lVar10;
            *(longlong *)(param_1 + 0x10) = lVar9;
            iVar8 = *(int *)(lVar9 + 0x58);
          }
          if (iVar8 != 2) {
            *(undefined4 *)(lVar9 + 0x58) = 2;
            FUN_7ff70c994d50(lVar9);
          }
          FUN_7ff70c991030(plVar1,plVar3,0);
          FUN_7ff70c94a660(lVar9,0);
          *(undefined1 *)(lVar9 + 0x12c8) = 1;
        }
        lVar9 = *(longlong *)(param_3 + 8);
        if (lVar9 == 0) {
          iVar8 = param_3[0x16];
          if (iVar8 == 2) {
            FUN_7ff70c9950b0(param_3);
            goto LAB_7ff70c94e111;
          }
        }
        else {
          if (cStack_a5 == '\x01') {
            FUN_7ff70c955550(lVar9,param_3);
            FUN_7ff70c991030(lVar9 + 0x378,param_3 + 0x10,0);
            param_3[8] = 0;
            param_3[9] = 0;
            FUN_7ff70c958b40(param_3,lVar9,1);
            FUN_7ff70c945f70(param_3,lVar9);
          }
LAB_7ff70c94e111:
          iVar8 = param_3[0x16];
        }
        iVar16 = -1;
        if (iVar8 != 0xf) {
          param_3[0x16] = 0xf;
LAB_7ff70c94e126:
          *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) =
               *(int *)(*(longlong *)(param_3 + 0x36) + 0x1c) + -1;
          FUN_7ff70c94f130(param_3);
          iVar16 = -1;
        }
LAB_7ff70c94e13e:
        uVar6 = param_3[0x16];
        goto LAB_7ff70c94e141;
      }
      if ((*(longlong *)(param_3 + 8) == 0) || (iVar8 = FUN_7ff70c98fd10(param_3), iVar8 == 0))
      goto LAB_7ff70c94e13e;
      uStack_a4 = 0x2a;
      FUN_7ff70c956760(*(undefined8 *)(param_3 + 8),2);
      uVar6 = param_3[0x16];
      uVar12 = 0xd < (int)uVar6 | 0xe;
      if (uVar6 != uVar12) {
        param_3[0x16] = uVar12;
        iVar16 = -1;
        if ((int)uVar6 < 0xe) goto LAB_7ff70c94e13e;
        goto LAB_7ff70c94e126;
      }
      if (uVar6 == 0xf) {
LAB_7ff70c94e301:
        if (*(code **)(param_3 + 0x27e) == (code *)0x0) {
          param_3[0x1e] = 1;
          *(int **)(param_3 + 0x20) = param_3;
          param_3[0x22] = uStack_a4;
          FUN_7ff70c990fc0(param_1 + 0x20,*(undefined8 *)(param_1 + 0x28),param_3 + 0x18,
                           param_3 + 0x18);
          iVar8 = param_3[0x16];
        }
        else {
          (**(code **)(param_3 + 0x27e))(param_3,uStack_a4);
          iVar8 = param_3[0x16];
        }
        if (iVar8 != 0x10) {
          param_3[0x16] = 0x10;
        }
        FUN_7ff70c990fc0(param_1 + 0x60,*(undefined8 *)(param_1 + 0x68),param_3,param_3 + 10);
        lVar9 = *(longlong *)(param_3 + 4);
        if (*(longlong *)(param_3 + 6) == 0) {
          *(longlong *)(param_1 + 8) = lVar9;
          uVar14 = *(undefined8 *)(param_3 + 6);
          if (lVar9 != 0) goto LAB_7ff70c94e351;
LAB_7ff70c94e3a1:
          *(undefined8 *)(param_1 + 0x10) = uVar14;
        }
        else {
          *(longlong *)(*(longlong *)(param_3 + 6) + 0x10) = lVar9;
          uVar14 = *(undefined8 *)(param_3 + 6);
          if (lVar9 == 0) goto LAB_7ff70c94e3a1;
LAB_7ff70c94e351:
          *(undefined8 *)(lVar9 + 0x18) = uVar14;
        }
        piStack_60[0] = 0;
        piStack_60[1] = 0;
        piStack_60[2] = 0;
        piStack_60[3] = 0;
        goto LAB_7ff70c94e3b0;
      }
      goto LAB_7ff70c94ccb0;
    }
LAB_7ff70c94dfc0:
    if ((int)uVar6 < 0xf) goto code_r0x7ff70c94dfc9;
LAB_7ff70c94e141:
    if (uVar6 == 0xf) goto LAB_7ff70c94e301;
    if ((iVar16 != -1) && (*(char *)(param_1 + 0x1b2) == '\0')) {
      param_3[0x17] = uStack_a4;
LAB_7ff70c94e3b0:
      iVar8 = 0;
LAB_7ff70c94e3b2:
      return iVar8;
    }
  } while( true );
}


