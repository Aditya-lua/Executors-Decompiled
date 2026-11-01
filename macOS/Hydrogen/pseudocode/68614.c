
/* WARNING: Removing unreachable block (ram,0x00068640) */
/* WARNING: Removing unreachable block (ram,0x00068718) */
/* WARNING: Removing unreachable block (ram,0x00068728) */
/* WARNING: Removing unreachable block (ram,0x0006877c) */

undefined8 FUN_00068614(void)

{
  ulong uVar1;
  int *piVar2;
  byte bVar3;
  undefined6 uVar4;
  undefined6 uVar5;
  undefined2 uVar6;
  undefined2 uVar7;
  undefined6 uVar8;
  undefined6 uVar9;
  bool bVar10;
  int iVar11;
  int *piVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  char acStack_68 [6];
  char acStack_62 [2];
  char acStack_60 [6];
  undefined1 uStack_5a;
  char cStack_51;
  char acStack_50 [6];
  char acStack_4a [2];
  char acStack_48 [6];
  undefined1 uStack_42;
  char cStack_39;
  undefined1 uStack_31;
  
  __ZdlPv(*(undefined8 *)(unaff_x29 + -0xb8));
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  piVar12 = (int *)__Unwind_Resume(unaff_x19);
  bVar3 = *(byte *)((long)piVar12 + 0x17);
  uVar1 = *(ulong *)(piVar12 + 2);
  if (-1 < (char)bVar3) {
    uVar1 = (ulong)bVar3;
  }
  switch(uVar1) {
  case 3:
    piVar2 = *(int **)piVar12;
    if (-1 < (char)bVar3) {
      piVar2 = piVar12;
    }
    iVar11 = _memcmp(piVar2,"PUT");
    break;
  case 4:
    piVar2 = *(int **)piVar12;
    if (-1 < (char)bVar3) {
      piVar2 = piVar12;
    }
    if (*piVar2 == 0x54534f50) {
      return 1;
    }
    goto code_r0x00068868;
  case 5:
    piVar2 = *(int **)piVar12;
    if (-1 < (char)bVar3) {
      piVar2 = piVar12;
    }
    iVar11 = _memcmp(piVar2,"PATCH");
    break;
  case 6:
    piVar2 = *(int **)piVar12;
    if (-1 < (char)bVar3) {
      piVar2 = piVar12;
    }
    iVar11 = _memcmp(piVar2,"DELETE");
    break;
  default:
    goto code_r0x00068868;
  }
  if (iVar11 != 0) {
code_r0x00068868:
    uVar8 = s_Content_Length_008d1a55._8_6_;
    uVar6 = s_Content_Length_008d1a55._6_2_;
    uVar4 = s_Content_Length_008d1a55._0_6_;
    cStack_39 = '\x0e';
    acStack_50[0] = s_Content_Length_008d1a55[0];
    acStack_50[1] = s_Content_Length_008d1a55[1];
    acStack_50[2] = s_Content_Length_008d1a55[2];
    acStack_50[3] = s_Content_Length_008d1a55[3];
    acStack_50[4] = s_Content_Length_008d1a55[4];
    acStack_50[5] = s_Content_Length_008d1a55[5];
    acStack_4a[0] = s_Content_Length_008d1a55[6];
    acStack_4a[1] = s_Content_Length_008d1a55[7];
    acStack_48[0] = s_Content_Length_008d1a55[8];
    acStack_48[1] = s_Content_Length_008d1a55[9];
    acStack_48[2] = s_Content_Length_008d1a55[10];
    acStack_48[3] = s_Content_Length_008d1a55[0xb];
    acStack_48[4] = s_Content_Length_008d1a55[0xc];
    acStack_48[5] = s_Content_Length_008d1a55[0xd];
    uStack_42 = 0;
    piVar12 = piVar12 + 0x12;
    lVar13 = func_0x00063e9c(piVar12,acStack_50);
    uVar9 = s_Content_Length_008d1a55._8_6_;
    uVar7 = s_Content_Length_008d1a55._6_2_;
    uVar5 = s_Content_Length_008d1a55._0_6_;
    if (lVar13 == 0) {
      bVar10 = false;
    }
    else {
      cStack_51 = '\x0e';
      s_Content_Length_008d1a55[0] = (char)uVar4;
      s_Content_Length_008d1a55[1] = SUB61(uVar4,1);
      s_Content_Length_008d1a55[2] = SUB61(uVar4,2);
      s_Content_Length_008d1a55[3] = SUB61(uVar4,3);
      s_Content_Length_008d1a55[4] = SUB61(uVar4,4);
      s_Content_Length_008d1a55[5] = SUB61(uVar4,5);
      acStack_68[0] = s_Content_Length_008d1a55[0];
      acStack_68[1] = s_Content_Length_008d1a55[1];
      acStack_68[2] = s_Content_Length_008d1a55[2];
      acStack_68[3] = s_Content_Length_008d1a55[3];
      acStack_68[4] = s_Content_Length_008d1a55[4];
      acStack_68[5] = s_Content_Length_008d1a55[5];
      s_Content_Length_008d1a55[6] = (char)uVar6;
      s_Content_Length_008d1a55[7] = SUB21(uVar6,1);
      acStack_62[0] = s_Content_Length_008d1a55[6];
      acStack_62[1] = s_Content_Length_008d1a55[7];
      s_Content_Length_008d1a55[8] = (char)uVar8;
      s_Content_Length_008d1a55[9] = SUB61(uVar8,1);
      s_Content_Length_008d1a55[10] = SUB61(uVar8,2);
      s_Content_Length_008d1a55[0xb] = SUB61(uVar8,3);
      s_Content_Length_008d1a55[0xc] = SUB61(uVar8,4);
      s_Content_Length_008d1a55[0xd] = SUB61(uVar8,5);
      acStack_60[0] = s_Content_Length_008d1a55[8];
      acStack_60[1] = s_Content_Length_008d1a55[9];
      acStack_60[2] = s_Content_Length_008d1a55[10];
      acStack_60[3] = s_Content_Length_008d1a55[0xb];
      acStack_60[4] = s_Content_Length_008d1a55[0xc];
      acStack_60[5] = s_Content_Length_008d1a55[0xd];
      uStack_5a = 0;
      uStack_31 = 0;
      s_Content_Length_008d1a55._0_6_ = uVar5;
      s_Content_Length_008d1a55._6_2_ = uVar7;
      s_Content_Length_008d1a55._8_6_ = uVar9;
      lVar13 = func_0x00069608(piVar12,acStack_68,0,0,&uStack_31);
      bVar10 = lVar13 != 0;
      if (cStack_51 < '\0') {
        __ZdlPv(CONCAT26(acStack_62,acStack_68));
      }
    }
    if (cStack_39 < '\0') {
      __ZdlPv(CONCAT26(acStack_4a,acStack_50));
    }
    if (!bVar10) {
      uVar14 = func_0x000692e4(piVar12);
      return uVar14;
    }
  }
  return 1;
}

