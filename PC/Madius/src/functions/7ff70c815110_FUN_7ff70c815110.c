/* 7ff70c815110 FUN_7ff70c815110 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c815110(longlong param_1)

{
  int *piVar1;
  longlong lVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined4 *puVar7;
  short sVar8;
  int iVar9;
  longlong lVar10;
  longlong lVar11;
  undefined4 *puVar12;
  longlong lVar13;
  code *unaff_R15;
  longlong lVar14;
  undefined4 extraout_XMM0_Da;
  ulonglong uVar15;
  undefined4 uVar16;
  undefined4 auStack_268 [132];
  undefined8 uStack_58;
  undefined4 *puStack_50;
  undefined8 uStack_48;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_48 = 0xfffffffffffffffe;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2674) = 0;
  if (param_1 == 0) {
    return;
  }
  puVar7 = (undefined4 *)(lVar2 + 0x2678);
  if (*(int *)(lVar2 + 0x267c) < 0) {
    uVar6 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    lVar13 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar1) {
        sVar8 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar14 * 8) + 1;
      }
      else {
        iVar4 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar4;
        lVar14 = (longlong)iVar4;
        *(int *)(lVar13 + 0x2874 + lVar14 * 8) = *piVar1;
        *(undefined4 *)(lVar13 + 0x2878 + lVar14 * 8) = 0;
        sVar8 = 1;
      }
      *(short *)(lVar13 + 0x2878 + lVar14 * 8) = sVar8;
      *(int *)(lVar13 + 0x2868) = *(int *)(lVar13 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar2 + 0x2680) != 0) {
      FUN_7ff70cb12b60(uVar6,*(longlong *)(lVar2 + 0x2680),(longlong)*(int *)(lVar2 + 0x2678));
      lVar14 = _DAT_7ff70cc1a3c0;
      lVar13 = *(longlong *)(lVar2 + 0x2680);
      if ((lVar13 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar10 * 8) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar10 * 8) + 1;
        }
        else {
          iVar4 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar4;
          lVar10 = (longlong)iVar4;
          *(int *)(lVar14 + 0x2874 + lVar10 * 8) = *piVar1;
          *(undefined4 *)(lVar14 + 0x2878 + lVar10 * 8) = 0;
          sVar8 = 1;
        }
        *(short *)(lVar14 + 0x287a + lVar10 * 8) = sVar8;
        *(int *)(lVar14 + 0x286c) = *(int *)(lVar14 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar2 + 0x2680) = uVar6;
    *(undefined8 *)(lVar2 + 0x2678) = 0;
  }
  else {
    *puVar7 = 0;
    if (*(int *)(lVar2 + 0x267c) != 0) {
      lVar13 = *(longlong *)(lVar2 + 0x2680);
      lVar14 = 0;
      goto LAB_7ff70c81547e;
    }
  }
  lVar13 = (*_DAT_7ff70cbe9460)(8,_DAT_7ff70cc1a3d0);
  lVar14 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != 0) {
    piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar10 * 8) == *piVar1) {
      sVar8 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar10 * 8) + 1;
    }
    else {
      iVar4 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar4;
      lVar10 = (longlong)iVar4;
      *(int *)(lVar14 + 0x2874 + lVar10 * 8) = *piVar1;
      *(undefined4 *)(lVar14 + 0x2878 + lVar10 * 8) = 0;
      sVar8 = 1;
    }
    *(short *)(lVar14 + 0x2878 + lVar10 * 8) = sVar8;
    *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
  }
  if (*(longlong *)(lVar2 + 0x2680) != 0) {
    FUN_7ff70cb12b60(lVar13,*(longlong *)(lVar2 + 0x2680),(longlong)*(int *)(lVar2 + 0x2678));
    lVar10 = _DAT_7ff70cc1a3c0;
    lVar14 = *(longlong *)(lVar2 + 0x2680);
    if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar11 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar11 * 8) == *piVar1) {
        sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar11 * 8) + 1;
      }
      else {
        iVar4 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar4;
        lVar11 = (longlong)iVar4;
        *(int *)(lVar10 + 0x2874 + lVar11 * 8) = *piVar1;
        *(undefined4 *)(lVar10 + 0x2878 + lVar11 * 8) = 0;
        sVar8 = 1;
      }
      *(short *)(lVar10 + 0x287a + lVar11 * 8) = sVar8;
      *(int *)(lVar10 + 0x286c) = *(int *)(lVar10 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
  }
  *(longlong *)(lVar2 + 0x2680) = lVar13;
  *(undefined4 *)(lVar2 + 0x267c) = 8;
  lVar14 = (longlong)*(int *)(lVar2 + 0x2678);
LAB_7ff70c81547e:
  *(undefined1 *)(lVar13 + lVar14) = 0;
  *(int *)(lVar2 + 0x2678) = *(int *)(lVar2 + 0x2678) + 1;
  if ((longlong)*(int *)(lVar2 + 0x2688) != 0) {
    lVar13 = *(longlong *)(lVar2 + 0x2690);
    lVar14 = (longlong)*(int *)(lVar2 + 0x2688) * 0x48;
    do {
      (**(code **)(lVar13 + 0x38))(lVar2,lVar13,puVar7);
      lVar13 = lVar13 + 0x48;
      lVar14 = lVar14 + -0x48;
    } while (lVar14 != 0);
    unaff_R15 = (code *)0x0;
  }
  uVar16 = 0;
  uVar15 = 0;
  uVar3 = func_0x7ff70da3b7b3();
  uVar3 = uVar3 & 0xe9b9db31;
  *(char *)(ulonglong)uVar3 = *(char *)(ulonglong)uVar3 + (char)uVar3;
  iVar4 = (*unaff_R15)(extraout_XMM0_Da,0,param_1,0xffffffff);
  uVar15 = uVar15 & 0xffffffff00000000;
  iVar5 = (*unaff_R15)(0xfde9,0,&UNK_7ff70cb808ed,0xffffffff,0,uVar15,uVar16);
  uVar16 = (undefined4)(uVar15 >> 0x20);
  uStack_58 = 0;
  puStack_50 = (undefined4 *)0x0;
  iVar5 = iVar5 + iVar4;
  if (0x104 < iVar5) {
    puVar7 = (undefined4 *)(*_DAT_7ff70cbe9460)(iVar5 * 2,_DAT_7ff70cc1a3d0);
    lVar2 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
        sVar8 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar13 = (longlong)iVar9;
        *(int *)(lVar2 + 0x2874 + lVar13 * 8) = *piVar1;
        *(undefined4 *)(lVar2 + 0x2878 + lVar13 * 8) = 0;
        sVar8 = 1;
      }
      *(short *)(lVar2 + 0x2878 + lVar13 * 8) = sVar8;
      *(int *)(lVar2 + 0x2868) = *(int *)(lVar2 + 0x2868) + 1;
    }
    uStack_58 = CONCAT44(iVar5,iVar5);
    puStack_50 = puVar7;
  }
  puVar12 = auStack_268;
  if (puVar7 != (undefined4 *)0x0) {
    puVar12 = puVar7;
  }
  func_0x7ff70d8ce770(0xfde9,0,param_1,0xffffffff,puVar12,CONCAT44(uVar16,iVar4));
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


