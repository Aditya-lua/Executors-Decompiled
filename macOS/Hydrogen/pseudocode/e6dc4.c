
void FUN_000e6dc4(undefined8 param_1,float param_2)

{
  uint *puVar1;
  bool in_ZR;
  int iVar2;
  long unaff_x19;
  long lVar3;
  uint *puVar4;
  long lVar5;
  float unaff_s9;
  char *pcStack0000000000000000;
  char *pcStack0000000000000008;
  double dStack0000000000000010;
  
  if (!in_ZR) {
    unaff_s9 = param_2;
  }
  dStack0000000000000010 = (double)unaff_s9;
  pcStack0000000000000000 = (char *)0x1;
  pcStack0000000000000008 = (char *)param_1;
  func_0x0010b3a8();
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
  if (0 < (int)*(uint *)(unaff_x19 + 0x290)) {
    iVar2 = func_0x001226d4("Columns","Columns sets (%d)");
    if (iVar2 != 0) {
      if (*(int *)(unaff_x19 + 0x290) != 0) {
        lVar3 = *(long *)(unaff_x19 + 0x298);
        lVar5 = (long)*(int *)(unaff_x19 + 0x290) * 0x88;
        do {
          func_0x000e62e0(lVar3);
          lVar3 = lVar3 + 0x88;
          lVar5 = lVar5 + -0x88;
        } while (lVar5 != 0);
      }
      func_0x00123710();
    }
  }
  pcStack0000000000000008 = (char *)(ulong)*(uint *)(unaff_x19 + 0x280);
  dStack0000000000000010 = (double)(ulong)(*(uint *)(unaff_x19 + 0x280) << 4);
  pcStack0000000000000000 = "Storage";
  iVar2 = func_0x001226d4("Storage","%s: %d entries, %d bytes");
  if (iVar2 != 0) {
    if (*(int *)(unaff_x19 + 0x280) != 0) {
      puVar4 = *(uint **)(unaff_x19 + 0x288);
      puVar1 = puVar4 + (long)*(int *)(unaff_x19 + 0x280) * 4;
      do {
        pcStack0000000000000000 = (char *)(ulong)*puVar4;
        pcStack0000000000000008 = (char *)(ulong)puVar4[2];
        func_0x0010b3a8("Key 0x%08X Value { i: %d }");
        puVar4 = puVar4 + 4;
      } while (puVar4 != puVar1);
    }
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

