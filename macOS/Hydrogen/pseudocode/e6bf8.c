
void FUN_000e6bf8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint *puVar1;
  uint uVar2;
  int iVar3;
  char *pcVar4;
  long unaff_x19;
  long lVar5;
  uint *puVar6;
  long lVar7;
  char *unaff_x23;
  float fVar8;
  char *pcStack0000000000000000;
  char *pcStack0000000000000008;
  double dStack0000000000000010;
  double dStack0000000000000018;
  double dStack0000000000000020;
  char *pcStack0000000000000028;
  
  if (*(char *)(unaff_x19 + 0xbd) != '\0') {
    unaff_x23 = "Y";
  }
  pcStack0000000000000000 = (char *)param_1;
  pcStack0000000000000008 = (char *)param_3;
  dStack0000000000000010 = (double)param_2;
  dStack0000000000000018 = (double)param_4;
  pcStack0000000000000028 = unaff_x23;
  func_0x0010b3a8("Scroll: (%.2f/%.2f,%.2f/%.2f) Scrollbar:%s%s");
  pcStack0000000000000000 = (char *)(ulong)*(byte *)(unaff_x19 + 0xbe);
  pcStack0000000000000008 = (char *)(ulong)*(byte *)(unaff_x19 + 0xbf);
  dStack0000000000000010 = (double)(ulong)*(byte *)(unaff_x19 + 0xc0);
  if (*(byte *)(unaff_x19 + 0xbf) == 0 && *(byte *)(unaff_x19 + 0xbe) == 0) {
    dStack0000000000000018 = 2.12199579047121e-314;
  }
  else {
    dStack0000000000000018 = (double)(long)*(short *)(unaff_x19 + 0xd2);
  }
  func_0x0010b3a8("Active: %d/%d, WriteAccessed: %d, BeginOrderWithinContext: %d");
  pcStack0000000000000000 = (char *)(ulong)*(byte *)(unaff_x19 + 0xc4);
  pcStack0000000000000008 = (char *)(ulong)*(byte *)(unaff_x19 + 0xc5);
  dStack0000000000000010 = (double)(long)*(char *)(unaff_x19 + 0xe4);
  dStack0000000000000018 = (double)(long)*(char *)(unaff_x19 + 0xe5);
  dStack0000000000000020 = (double)(ulong)*(byte *)(unaff_x19 + 0xc3);
  func_0x0010b3a8("Appearing: %d, Hidden: %d (CanSkip %d Cannot %d), SkipItems: %d");
  fVar8 = *(float *)(unaff_x19 + 0x3cc);
  if ((*(float *)(unaff_x19 + 0x3c0) < fVar8) || (*(float *)(unaff_x19 + 0x3c4) < fVar8)) {
    dStack0000000000000010 = (double)*(float *)(unaff_x19 + 0x3c0);
    dStack0000000000000018 = (double)*(float *)(unaff_x19 + 0x3c4);
    dStack0000000000000020 = (double)*(float *)(unaff_x19 + 0x3c8);
    pcStack0000000000000028 = (char *)(double)fVar8;
    uVar2 = *(uint *)(unaff_x19 + 0x3b8);
    pcVar4 = "NavLastIds[%d]: 0x%08X at +(%.1f,%.1f)(%.1f,%.1f)";
  }
  else {
    uVar2 = *(uint *)(unaff_x19 + 0x3b8);
    pcVar4 = "NavLastIds[%d]: 0x%08X";
  }
  pcStack0000000000000008 = (char *)(ulong)uVar2;
  pcStack0000000000000000 = (char *)0x0;
  func_0x0010b3a8(pcVar4);
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3b8));
  fVar8 = *(float *)(unaff_x19 + 0x3dc);
  if ((*(float *)(unaff_x19 + 0x3d0) < fVar8) || (*(float *)(unaff_x19 + 0x3d4) < fVar8)) {
    dStack0000000000000010 = (double)*(float *)(unaff_x19 + 0x3d0);
    dStack0000000000000018 = (double)*(float *)(unaff_x19 + 0x3d4);
    dStack0000000000000020 = (double)*(float *)(unaff_x19 + 0x3d8);
    pcStack0000000000000028 = (char *)(double)fVar8;
    uVar2 = *(uint *)(unaff_x19 + 0x3bc);
    pcVar4 = "NavLastIds[%d]: 0x%08X at +(%.1f,%.1f)(%.1f,%.1f)";
  }
  else {
    uVar2 = *(uint *)(unaff_x19 + 0x3bc);
    pcVar4 = "NavLastIds[%d]: 0x%08X";
  }
  pcStack0000000000000008 = (char *)(ulong)uVar2;
  pcStack0000000000000000 = (char *)0x1;
  func_0x0010b3a8(pcVar4);
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3bc));
  fVar8 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3e0) != 3.4028235e+38) {
    fVar8 = *(float *)(unaff_x19 + 0x3e0);
  }
  pcStack0000000000000008 = (char *)(double)fVar8;
  fVar8 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3e4) != 3.4028235e+38) {
    fVar8 = *(float *)(unaff_x19 + 0x3e4);
  }
  dStack0000000000000010 = (double)fVar8;
  pcStack0000000000000000 = (char *)0x0;
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
  fVar8 = -99999.0;
  if (*(float *)(unaff_x19 + 1000) != 3.4028235e+38) {
    fVar8 = *(float *)(unaff_x19 + 1000);
  }
  pcStack0000000000000008 = (char *)(double)fVar8;
  fVar8 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3ec) != 3.4028235e+38) {
    fVar8 = *(float *)(unaff_x19 + 0x3ec);
  }
  dStack0000000000000010 = (double)fVar8;
  pcStack0000000000000000 = (char *)0x1;
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
  pcStack0000000000000000 = (char *)(long)*(short *)(unaff_x19 + 0x16c);
  if (*(long *)(unaff_x19 + 0x3b0) == 0) {
    pcStack0000000000000008 = "NULL";
  }
  else {
    pcStack0000000000000008 = *(char **)(*(long *)(unaff_x19 + 0x3b0) + 8);
  }
  func_0x0010b3a8("NavLayersActiveMask: %X, NavLastChildNavWindow: %s");
  if (*(long *)(unaff_x19 + 0x388) != unaff_x19) {
    func_0x000e6884(*(long *)(unaff_x19 + 0x388),"RootWindow");
  }
  if (*(long *)(unaff_x19 + 0x378) != 0) {
    func_0x000e6884(*(long *)(unaff_x19 + 0x378),"ParentWindow");
  }
  if (*(long *)(unaff_x19 + 0x3a8) != 0) {
    func_0x000e6884(*(long *)(unaff_x19 + 0x3a8),"ParentWindowForFocusRoute");
  }
  if (0 < *(int *)(unaff_x19 + 0x1a0)) {
    func_0x000e48cc(unaff_x19 + 0x1a0,"ChildWindows");
  }
  pcStack0000000000000000 = (char *)(ulong)*(uint *)(unaff_x19 + 0x290);
  if ((0 < (int)*(uint *)(unaff_x19 + 0x290)) &&
     (iVar3 = func_0x001226d4("Columns","Columns sets (%d)"), iVar3 != 0)) {
    if (*(int *)(unaff_x19 + 0x290) != 0) {
      lVar5 = *(long *)(unaff_x19 + 0x298);
      lVar7 = (long)*(int *)(unaff_x19 + 0x290) * 0x88;
      do {
        func_0x000e62e0(lVar5);
        lVar5 = lVar5 + 0x88;
        lVar7 = lVar7 + -0x88;
      } while (lVar7 != 0);
    }
    func_0x00123710();
  }
  pcStack0000000000000008 = (char *)(ulong)*(uint *)(unaff_x19 + 0x280);
  dStack0000000000000010 = (double)(ulong)(*(uint *)(unaff_x19 + 0x280) << 4);
  pcStack0000000000000000 = "Storage";
  iVar3 = func_0x001226d4("Storage","%s: %d entries, %d bytes");
  if (iVar3 != 0) {
    if (*(int *)(unaff_x19 + 0x280) != 0) {
      puVar6 = *(uint **)(unaff_x19 + 0x288);
      puVar1 = puVar6 + (long)*(int *)(unaff_x19 + 0x280) * 4;
      do {
        pcStack0000000000000000 = (char *)(ulong)*puVar6;
        pcStack0000000000000008 = (char *)(ulong)puVar6[2];
        func_0x0010b3a8("Key 0x%08X Value { i: %d }");
        puVar6 = puVar6 + 4;
      } while (puVar6 != puVar1);
    }
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

