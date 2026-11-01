
/* WARNING: Removing unreachable block (ram,0x00061ffc) */
/* WARNING: Removing unreachable block (ram,0x00061f2c) */
/* WARNING: Removing unreachable block (ram,0x00061e40) */
/* WARNING: Removing unreachable block (ram,0x00061db8) */
/* WARNING: Removing unreachable block (ram,0x00061e0c) */
/* WARNING: Removing unreachable block (ram,0x00061ce0) */
/* WARNING: Removing unreachable block (ram,0x00061e1c) */
/* WARNING: Removing unreachable block (ram,0x00061e34) */
/* WARNING: Removing unreachable block (ram,0x00061e3c) */
/* WARNING: Removing unreachable block (ram,0x00061ed8) */
/* WARNING: Removing unreachable block (ram,0x00061f3c) */
/* WARNING: Removing unreachable block (ram,0x00061fd8) */
/* WARNING: Removing unreachable block (ram,0x0006205c) */
/* WARNING: Removing unreachable block (ram,0x00061e08) */

bool FUN_00061c98(void)

{
  int *piVar1;
  byte bVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  undefined5 uVar5;
  undefined5 uVar6;
  char cVar7;
  undefined4 uVar8;
  char cVar9;
  code *pcVar10;
  int iVar11;
  long lVar12;
  long *plVar13;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  bool bVar14;
  ulong uVar15;
  ulong uVar16;
  char cStack0000000000000000;
  char cStack0000000000000001;
  char cStack0000000000000002;
  char cStack0000000000000003;
  char cStack0000000000000004;
  char cStack0000000000000005;
  char cStack0000000000000006;
  char cStack0000000000000007;
  undefined4 uStack0000000000000008;
  char cStack000000000000000c;
  undefined1 uStack000000000000000f;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  
  uStack0000000000000008 = 0x65707954;
  _cStack0000000000000000 = s_Content_Type_008d186c._0_5_;
  uVar5 = _cStack0000000000000000;
  cStack0000000000000005 = s_Content_Type_008d186c[5];
  cVar7 = cStack0000000000000005;
  _cStack0000000000000006 = s_Content_Type_008d186c._6_2_;
  uVar3 = _cStack0000000000000006;
  cStack000000000000000c = '\0';
  lVar12 = func_0x00063e9c(unaff_x19 + 0x38);
  if (lVar12 == 0) {
    uStack0000000000000008 = 0x65707954;
    cStack000000000000000c = '\0';
    _cStack0000000000000000 = uVar5;
    cStack0000000000000005 = cVar7;
    _cStack0000000000000006 = uVar3;
    func_0x0005dd28();
  }
  uVar3 = s_Content_Length_008d1a55._6_2_;
  uVar15 = *(ulong *)(unaff_x19 + 0x68);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
    uVar15 = (ulong)*(byte *)(unaff_x19 + 0x77);
  }
  if (((uVar15 == 0) && (*(long *)(unaff_x19 + 0x90) == 0)) && (*(long *)(unaff_x19 + 0xb0) == 0)) {
    _cStack0000000000000000 = s_Content_Length_008d1a55._0_5_;
    uVar5 = _cStack0000000000000000;
    cStack0000000000000005 = s_Content_Length_008d1a55[5];
    cVar7 = cStack0000000000000005;
    cStack0000000000000006 = s_Content_Length_008d1a55[6];
    cStack0000000000000007 = s_Content_Length_008d1a55[7];
    uStack0000000000000008 = s_Content_Length_008d1a55._8_4_;
    uVar8 = uStack0000000000000008;
    cStack000000000000000c = s_Content_Length_008d1a55[0xc];
    cVar9 = cStack000000000000000c;
    lVar12 = func_0x00063e9c(unaff_x19 + 0x38);
    uVar4 = s_Content_Length_008d1a55._6_2_;
    if (lVar12 == 0) {
      s_Content_Length_008d1a55[6] = (char)uVar3;
      s_Content_Length_008d1a55[7] = SUB21(uVar3,1);
      cStack0000000000000006 = s_Content_Length_008d1a55[6];
      cStack0000000000000007 = s_Content_Length_008d1a55[7];
      s_Content_Length_008d1a55._6_2_ = uVar4;
      _cStack0000000000000000 = uVar5;
      cStack0000000000000005 = cVar7;
      uStack0000000000000008 = uVar8;
      cStack000000000000000c = cVar9;
      func_0x0005dd28();
    }
  }
  uVar5 = s_Accept_Ranges_008d1a64._0_5_;
  bVar2 = *(byte *)((long)unaff_x20 + 0x17);
  uVar15 = *(ulong *)(unaff_x20 + 2);
  if (-1 < (char)bVar2) {
    uVar15 = (ulong)bVar2;
  }
  if (uVar15 == 4) {
    piVar1 = *(int **)unaff_x20;
    if (-1 < (char)bVar2) {
      piVar1 = unaff_x20;
    }
    if (*piVar1 == 0x44414548) {
      cStack0000000000000000 = s_Accept_Ranges_008d1a64[0];
      cStack0000000000000001 = s_Accept_Ranges_008d1a64[1];
      cStack0000000000000002 = s_Accept_Ranges_008d1a64[2];
      cStack0000000000000003 = s_Accept_Ranges_008d1a64[3];
      cStack0000000000000004 = s_Accept_Ranges_008d1a64[4];
      cStack0000000000000005 = s_Accept_Ranges_008d1a64[5];
      cVar7 = cStack0000000000000005;
      _cStack0000000000000006 = s_Accept_Ranges_008d1a64._6_2_;
      uVar3 = _cStack0000000000000006;
      uStack0000000000000008 = s_Accept_Ranges_008d1a64._8_4_;
      uVar8 = uStack0000000000000008;
      cStack000000000000000c = s_Accept_Ranges_008d1a64[0xc];
      cVar9 = cStack000000000000000c;
      lVar12 = func_0x00063e9c(unaff_x19 + 0x38);
      uVar6 = s_Accept_Ranges_008d1a64._0_5_;
      if (lVar12 == 0) {
        s_Accept_Ranges_008d1a64[0] = (char)uVar5;
        s_Accept_Ranges_008d1a64[1] = SUB51(uVar5,1);
        s_Accept_Ranges_008d1a64[2] = SUB51(uVar5,2);
        s_Accept_Ranges_008d1a64[3] = SUB51(uVar5,3);
        s_Accept_Ranges_008d1a64[4] = SUB51(uVar5,4);
        cStack0000000000000000 = s_Accept_Ranges_008d1a64[0];
        cStack0000000000000001 = s_Accept_Ranges_008d1a64[1];
        cStack0000000000000002 = s_Accept_Ranges_008d1a64[2];
        cStack0000000000000003 = s_Accept_Ranges_008d1a64[3];
        cStack0000000000000004 = s_Accept_Ranges_008d1a64[4];
        s_Accept_Ranges_008d1a64._0_5_ = uVar6;
        cStack0000000000000005 = cVar7;
        _cStack0000000000000006 = uVar3;
        uStack0000000000000008 = uVar8;
        cStack000000000000000c = cVar9;
        func_0x0005dd28();
      }
    }
  }
  if (*(long **)(unaff_x21 + 0x250) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x21 + 0x250) + 0x30))();
  }
  _cStack0000000000000000 = 0x9b8350;
  cStack0000000000000005 = 0;
  _cStack0000000000000006 = 0;
  uStack0000000000000008 = 0;
  cStack000000000000000c = 0;
  uStack000000000000000f = 0;
  lVar12 = func_0x0005d154();
  if (lVar12 != 0) {
    if (*(long **)(unaff_x21 + 0x300) == (long *)0x0) {
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar10 = (code *)SoftwareBreakpoint(1,0x62178);
      (*pcVar10)();
    }
    lVar12 = (**(code **)(**(long **)(unaff_x21 + 0x300) + 0x30))();
    if (lVar12 != 0) {
      bVar2 = *(byte *)((long)unaff_x20 + 0x17);
      uVar15 = *(ulong *)(unaff_x20 + 2);
      if (-1 < (char)bVar2) {
        uVar15 = (ulong)bVar2;
      }
      if (uVar15 == 4) {
        piVar1 = *(int **)unaff_x20;
        if (-1 < (char)bVar2) {
          piVar1 = unaff_x20;
        }
        if (*piVar1 != 0x44414548) goto code_r0x00062040;
        plVar13 = *(long **)(unaff_x21 + 0x290);
joined_r0x000620fc:
        bVar14 = true;
      }
      else {
code_r0x00062040:
        bVar2 = *(byte *)(unaff_x19 + 0x77);
        if ((char)bVar2 < '\0') {
          uVar15 = *(ulong *)(unaff_x19 + 0x68);
          if (uVar15 == 0) goto code_r0x000620a8;
code_r0x00062078:
          uVar16 = 0;
          do {
            bVar14 = uVar15 <= uVar16;
            if (uVar15 <= uVar16) goto code_r0x00062108;
            lVar12 = (**(code **)(*unaff_x22 + 0x30))();
            uVar16 = lVar12 + uVar16;
          } while (-1 < lVar12);
        }
        else {
          uVar15 = (ulong)bVar2;
          if (bVar2 != 0) goto code_r0x00062078;
code_r0x000620a8:
          if (*(long *)(unaff_x19 + 0xb0) == 0) {
            bVar14 = true;
code_r0x00062108:
            plVar13 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
          iVar11 = func_0x00062af0();
          if (iVar11 != 0) {
            *(undefined1 *)(unaff_x19 + 0xd9) = 1;
            plVar13 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
        }
        bVar14 = false;
        plVar13 = *(long **)(unaff_x21 + 0x290);
      }
joined_r0x000620fc:
      if (plVar13 != (long *)0x0) {
        (**(code **)(*plVar13 + 0x30))();
      }
      goto code_r0x00062124;
    }
  }
  bVar14 = false;
code_r0x00062124:
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  if (in_stack_00000068 < 0) {
    __ZdlPv(in_stack_00000058);
  }
  return bVar14;
}

