
void FUN_000e6ad8(undefined1 param_1 [16],float param_2)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  long unaff_x19;
  ulong unaff_x20;
  long lVar4;
  long lVar5;
  char *unaff_x23;
  float fVar6;
  char *pcStack0000000000000008;
  char *pcStack0000000000000010;
  char *pcStack0000000000000018;
  char *pcStack0000000000000020;
  char *pcStack0000000000000028;
  char *pcStack0000000000000030;
  char *pcStack0000000000000038;
  
  pcStack0000000000000008 = (char *)(double)param_2;
  pcStack0000000000000010 = (char *)(double)*(float *)(unaff_x19 + 0x30);
  pcStack0000000000000018 = (char *)(double)*(float *)(unaff_x19 + 0x34);
  pcStack0000000000000020 = (char *)(double)*(float *)(unaff_x19 + 0x40);
  pcStack0000000000000028 = (char *)(double)*(float *)(unaff_x19 + 0x44);
  pcStack0000000000000030 = (char *)(double)*(float *)(unaff_x19 + 0x48);
  pcStack0000000000000038 = (char *)(double)*(float *)(unaff_x19 + 0x4c);
  func_0x0010b3a8("Pos: (%.1f,%.1f), Size: (%.1f,%.1f), ContentSize (%.1f,%.1f) Ideal (%.1f,%.1f)");
  pcStack0000000000000008 = unaff_x23;
  if ((unaff_x20 & 0x1000000) != 0) {
    pcStack0000000000000008 = "Child ";
  }
  pcStack0000000000000010 = unaff_x23;
  if ((unaff_x20 & 0x2000000) != 0) {
    pcStack0000000000000010 = "Tooltip ";
  }
  pcStack0000000000000018 = unaff_x23;
  if ((unaff_x20 & 0x4000000) != 0) {
    pcStack0000000000000018 = "Popup ";
  }
  pcStack0000000000000020 = unaff_x23;
  if ((unaff_x20 & 0x8000000) != 0) {
    pcStack0000000000000020 = "Modal ";
  }
  pcStack0000000000000028 = unaff_x23;
  if ((unaff_x20 & 0x10000000) != 0) {
    pcStack0000000000000028 = "ChildMenu ";
  }
  pcStack0000000000000030 = unaff_x23;
  if ((unaff_x20 & 0x100) != 0) {
    pcStack0000000000000030 = "NoSavedSettings ";
  }
  pcStack0000000000000038 = unaff_x23;
  if ((unaff_x20 & 0x200) != 0) {
    pcStack0000000000000038 = "NoMouseInputs";
  }
  func_0x0010b3a8("Flags: 0x%08X (%s%s%s%s%s%s%s%s%s..)");
  pcStack0000000000000008 = (char *)(double)*(float *)(unaff_x19 + 0x94);
  pcStack0000000000000010 = (char *)(double)*(float *)(unaff_x19 + 0x90);
  pcStack0000000000000018 = (char *)(double)*(float *)(unaff_x19 + 0x98);
  pcStack0000000000000020 = unaff_x23;
  if (*(char *)(unaff_x19 + 0xbc) != '\0') {
    pcStack0000000000000020 = "X";
  }
  if (*(char *)(unaff_x19 + 0xbd) != '\0') {
    unaff_x23 = "Y";
  }
  pcStack0000000000000028 = unaff_x23;
  func_0x0010b3a8("Scroll: (%.2f/%.2f,%.2f/%.2f) Scrollbar:%s%s");
  pcStack0000000000000008 = (char *)(ulong)*(byte *)(unaff_x19 + 0xbf);
  pcStack0000000000000010 = (char *)(ulong)*(byte *)(unaff_x19 + 0xc0);
  if (*(byte *)(unaff_x19 + 0xbf) == 0 && *(char *)(unaff_x19 + 0xbe) == '\0') {
    pcStack0000000000000018 = (char *)0xffffffff;
  }
  else {
    pcStack0000000000000018 = (char *)(long)*(short *)(unaff_x19 + 0xd2);
  }
  func_0x0010b3a8("Active: %d/%d, WriteAccessed: %d, BeginOrderWithinContext: %d");
  pcStack0000000000000008 = (char *)(ulong)*(byte *)(unaff_x19 + 0xc5);
  pcStack0000000000000010 = (char *)(long)*(char *)(unaff_x19 + 0xe4);
  pcStack0000000000000018 = (char *)(long)*(char *)(unaff_x19 + 0xe5);
  pcStack0000000000000020 = (char *)(ulong)*(byte *)(unaff_x19 + 0xc3);
  func_0x0010b3a8("Appearing: %d, Hidden: %d (CanSkip %d Cannot %d), SkipItems: %d");
  fVar6 = *(float *)(unaff_x19 + 0x3cc);
  if ((*(float *)(unaff_x19 + 0x3c0) < fVar6) || (*(float *)(unaff_x19 + 0x3c4) < fVar6)) {
    pcStack0000000000000010 = (char *)(double)*(float *)(unaff_x19 + 0x3c0);
    pcStack0000000000000018 = (char *)(double)*(float *)(unaff_x19 + 0x3c4);
    pcStack0000000000000020 = (char *)(double)*(float *)(unaff_x19 + 0x3c8);
    pcStack0000000000000028 = (char *)(double)fVar6;
    uVar1 = *(uint *)(unaff_x19 + 0x3b8);
    pcVar3 = "NavLastIds[%d]: 0x%08X at +(%.1f,%.1f)(%.1f,%.1f)";
  }
  else {
    uVar1 = *(uint *)(unaff_x19 + 0x3b8);
    pcVar3 = "NavLastIds[%d]: 0x%08X";
  }
  pcStack0000000000000008 = (char *)(ulong)uVar1;
  func_0x0010b3a8(pcVar3);
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3b8));
  fVar6 = *(float *)(unaff_x19 + 0x3dc);
  if ((*(float *)(unaff_x19 + 0x3d0) < fVar6) || (*(float *)(unaff_x19 + 0x3d4) < fVar6)) {
    pcStack0000000000000010 = (char *)(double)*(float *)(unaff_x19 + 0x3d0);
    pcStack0000000000000018 = (char *)(double)*(float *)(unaff_x19 + 0x3d4);
    pcStack0000000000000020 = (char *)(double)*(float *)(unaff_x19 + 0x3d8);
    pcStack0000000000000028 = (char *)(double)fVar6;
    uVar1 = *(uint *)(unaff_x19 + 0x3bc);
    pcVar3 = "NavLastIds[%d]: 0x%08X at +(%.1f,%.1f)(%.1f,%.1f)";
  }
  else {
    uVar1 = *(uint *)(unaff_x19 + 0x3bc);
    pcVar3 = "NavLastIds[%d]: 0x%08X";
  }
  pcStack0000000000000008 = (char *)(ulong)uVar1;
  func_0x0010b3a8(pcVar3);
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3bc));
  fVar6 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3e0) != 3.4028235e+38) {
    fVar6 = *(float *)(unaff_x19 + 0x3e0);
  }
  pcStack0000000000000008 = (char *)(double)fVar6;
  fVar6 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3e4) != 3.4028235e+38) {
    fVar6 = *(float *)(unaff_x19 + 0x3e4);
  }
  pcStack0000000000000010 = (char *)(double)fVar6;
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
  fVar6 = -99999.0;
  if (*(float *)(unaff_x19 + 1000) != 3.4028235e+38) {
    fVar6 = *(float *)(unaff_x19 + 1000);
  }
  pcStack0000000000000008 = (char *)(double)fVar6;
  fVar6 = -99999.0;
  if (*(float *)(unaff_x19 + 0x3ec) != 3.4028235e+38) {
    fVar6 = *(float *)(unaff_x19 + 0x3ec);
  }
  pcStack0000000000000010 = (char *)(double)fVar6;
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
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
  if ((0 < *(int *)(unaff_x19 + 0x290)) &&
     (iVar2 = func_0x001226d4("Columns","Columns sets (%d)"), iVar2 != 0)) {
    if (*(int *)(unaff_x19 + 0x290) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x298);
      lVar5 = (long)*(int *)(unaff_x19 + 0x290) * 0x88;
      do {
        func_0x000e62e0(lVar4);
        lVar4 = lVar4 + 0x88;
        lVar5 = lVar5 + -0x88;
      } while (lVar5 != 0);
    }
    func_0x00123710();
  }
  pcStack0000000000000008 = (char *)(ulong)*(uint *)(unaff_x19 + 0x280);
  pcStack0000000000000010 = (char *)(ulong)(*(uint *)(unaff_x19 + 0x280) << 4);
  iVar2 = func_0x001226d4("Storage","%s: %d entries, %d bytes");
  if (iVar2 != 0) {
    if (*(int *)(unaff_x19 + 0x280) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x288);
      lVar5 = lVar4 + (long)*(int *)(unaff_x19 + 0x280) * 0x10;
      do {
        pcStack0000000000000008 = (char *)(ulong)*(uint *)(lVar4 + 8);
        func_0x0010b3a8("Key 0x%08X Value { i: %d }");
        lVar4 = lVar4 + 0x10;
      } while (lVar4 != lVar5);
    }
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

