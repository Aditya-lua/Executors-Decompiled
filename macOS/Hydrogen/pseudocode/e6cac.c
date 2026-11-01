
void FUN_000e6cac(void)

{
  int iVar1;
  char *pcVar2;
  long unaff_x19;
  long lVar3;
  long lVar4;
  
  func_0x0010b3a8("NavLastIds[%d]: 0x%08X");
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3b8));
  if ((*(float *)(unaff_x19 + 0x3d0) < *(float *)(unaff_x19 + 0x3dc)) ||
     (*(float *)(unaff_x19 + 0x3d4) < *(float *)(unaff_x19 + 0x3dc))) {
    pcVar2 = "NavLastIds[%d]: 0x%08X at +(%.1f,%.1f)(%.1f,%.1f)";
  }
  else {
    pcVar2 = "NavLastIds[%d]: 0x%08X";
  }
  func_0x0010b3a8(pcVar2);
  func_0x000e5bd8(*(undefined4 *)(unaff_x19 + 0x3bc));
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
  func_0x0010b3a8("NavPreferredScoringPosRel[%d] = {%.1f,%.1f)");
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
     (iVar1 = func_0x001226d4("Columns","Columns sets (%d)"), iVar1 != 0)) {
    if (*(int *)(unaff_x19 + 0x290) != 0) {
      lVar3 = *(long *)(unaff_x19 + 0x298);
      lVar4 = (long)*(int *)(unaff_x19 + 0x290) * 0x88;
      do {
        func_0x000e62e0(lVar3);
        lVar3 = lVar3 + 0x88;
        lVar4 = lVar4 + -0x88;
      } while (lVar4 != 0);
    }
    func_0x00123710();
  }
  iVar1 = func_0x001226d4("Storage","%s: %d entries, %d bytes");
  if (iVar1 != 0) {
    if (*(int *)(unaff_x19 + 0x280) != 0) {
      lVar3 = *(long *)(unaff_x19 + 0x288);
      lVar4 = lVar3 + (long)*(int *)(unaff_x19 + 0x280) * 0x10;
      do {
        func_0x0010b3a8("Key 0x%08X Value { i: %d }");
        lVar3 = lVar3 + 0x10;
      } while (lVar3 != lVar4);
    }
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

