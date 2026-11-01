
void FUN_00736bc0(long param_1,long param_2)

{
  long *plVar1;
  long unaff_x19;
  long *unaff_x20;
  long *plVar2;
  undefined4 *puVar3;
  
  puVar3 = *(undefined4 **)(param_1 + 0x10);
  if ((((param_2 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc))) {
    func_0x0073cbdc();
  }
  plVar2 = unaff_x20 + 1;
  plVar1 = (long *)*plVar2;
  *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) & 0xfe;
  *puVar3 = 0;
  if (plVar1 == (long *)0x0) {
    return;
  }
  (**(code **)(*plVar1 + 0x20))();
  plVar1 = (long *)*plVar2;
  if (plVar1 != (long *)0x0) {
    *plVar2 = 0;
    do {
      plVar2 = (long *)plVar1[1];
      plVar1[1] = 0;
      (**(code **)(*plVar1 + 0x10))(plVar1);
      (*pcRam0000000000a2b5f0)(plVar1);
      plVar1 = plVar2;
    } while (plVar2 != (long *)0x0);
  }
  return;
}

