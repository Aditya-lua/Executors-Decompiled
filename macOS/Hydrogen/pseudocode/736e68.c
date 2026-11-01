
void FUN_00736e68(long *param_1,long param_2,long param_3,ulong param_4)

{
  long *plVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000008;
  
  *(undefined4 *)(param_3 + 0x60) = 0;
  *(byte *)(param_3 + 100) = *(byte *)(param_3 + 100) & 0xf7 | 2;
  if (*(long *)(param_3 + 0x10) == 0) {
LAB_00737018:
    *(byte *)(param_3 + 100) = *(byte *)(param_3 + 100) | 4;
    return;
  }
  plVar1 = (long *)(param_3 + 0x28);
  do {
    auVar6 = func_0x00782d28();
    *(undefined1 (*) [16])(param_3 + 0x40) = auVar6;
    lVar5 = *(long *)(param_3 + 0x10);
    do {
      if ((lVar5 == 0) || (lVar5 = *(long *)(lVar5 + 0x28), lVar5 == 0)) {
        iVar3 = 0;
        goto LAB_00736ef0;
      }
    } while (*(int *)(lVar5 + 4) != *(int *)(param_3 + 0x18));
    iVar3 = 1;
LAB_00736ef0:
    iVar2 = 0;
    if (600 < (long)param_4) {
      iVar2 = iVar3;
    }
    *(ulong *)(param_3 + 0x50) = param_4 >> iVar2;
    lVar5 = *(long *)(param_3 + 0x28);
    uStack0000000000000008 = lVar5;
    iVar3 = (**(code **)(param_3 + 0x20))
                      (plVar1,param_2,param_1[3],*(long *)(param_3 + 0x10),*(undefined4 *)param_1[2]
                      );
    if (iVar3 == 0) {
      for (lVar4 = *plVar1; lVar4 != 0; lVar4 = *(long *)(lVar4 + 8)) {
        *(long *)(lVar4 + 0x18) = param_1[3];
        *(int *)(lVar4 + 0x20) = (int)param_1[4];
      }
      lVar4 = *(long *)(param_3 + 0x10);
      do {
        if ((lVar4 == 0) || (lVar4 = *(long *)(lVar4 + 0x28), lVar4 == 0)) goto LAB_00736fd4;
      } while (*(int *)(lVar4 + 4) != *(int *)(param_3 + 0x18));
      func_0x00768170(param_2,*(undefined8 *)(param_3 + 0x50),*(undefined4 *)(param_3 + 0x58));
    }
    else {
      if ((((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     param_2 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + param_2 + 0x18) + 8))))) && (0 < *(int *)(*param_1 + 0xc))) {
        func_0x0073cbdc(param_2,param_1,"%s failed");
      }
      if (*plVar1 != 0) {
        func_0x00730b28(plVar1,param_2);
      }
    }
LAB_00736fd4:
    if (lVar5 != 0) {
      func_0x00730b28(&uStack0000000000000008,param_2);
    }
    *(int *)(param_3 + 0x5c) = iVar3;
    lVar5 = *(long *)(param_3 + 0x10);
    if (iVar3 == 0) {
      if (lVar5 != 0) {
        return;
      }
      goto LAB_00737018;
    }
    do {
      if ((lVar5 == 0) || (lVar5 = *(long *)(lVar5 + 0x28), lVar5 == 0)) {
        *(undefined8 *)(param_3 + 0x10) = 0;
        goto LAB_00737018;
      }
    } while (*(int *)(lVar5 + 4) != *(int *)(param_3 + 0x18));
    *(long *)(param_3 + 0x10) = lVar5;
  } while( true );
}

