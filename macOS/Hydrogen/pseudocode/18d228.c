
void FUN_0018d228(long param_1,long param_2,undefined8 *param_3)

{
  long *plVar1;
  undefined *puVar2;
  code *pcVar3;
  long lVar4;
  undefined *puVar5;
  undefined *puVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long *plVar11;
  
  puVar2 = PTR__kCFAllocatorDefault_009b0238;
  plVar1 = (long *)*param_3;
  lVar8 = param_3[1];
  if (param_1 != param_2) {
    lVar9 = param_3[2];
    uVar10 = (ulong)(param_2 - param_1) >> 4;
    plVar11 = (long *)(param_1 + 8);
    puVar5 = &UNK_009c06e0;
    puVar6 = &UNK_00819e0d;
    uVar7 = 0x12;
    do {
      if (*plVar11 < 0) {
LAB_0018d2d8:
        func_0x007a11c0(puVar6,uVar7,puVar5);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x18d2ec);
        (*pcVar3)();
      }
      lVar4 = _CFStringCreateWithBytes(*(undefined8 *)puVar2,plVar11[-1],*plVar11,0x8000100,0);
      if (lVar4 == 0) {
        puVar6 = &UNK_00819d21;
        uVar7 = 0x22;
        puVar5 = &UNK_009c06c8;
        goto LAB_0018d2d8;
      }
      *(long *)(lVar9 + lVar8 * 8) = lVar4;
      lVar8 = lVar8 + 1;
      plVar11 = plVar11 + 2;
      uVar10 = uVar10 - 1;
    } while (uVar10 != 0);
  }
  *plVar1 = lVar8;
  return;
}

