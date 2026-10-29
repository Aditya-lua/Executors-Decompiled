/* 7ff70c94edd0 FUN_7ff70c94edd0 */

undefined8 FUN_7ff70c94edd0(int *param_1,undefined4 *param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  longlong lVar3;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined4 uStack_38;
  undefined4 uStack_34;
  int iStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  int iStack_20;
  undefined4 uStack_1c;
  
  uVar2 = 1;
  if (((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) &&
     (uVar2 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    if ((char)param_1[0x6d] == '\x01') {
      *param_2 = 0;
    }
    else {
      if (*(longlong *)(param_1 + 0x34) != 0) {
        FUN_7ff70c958630(&uStack_38);
        uStack_48 = 0;
        uStack_40 = 0;
        lVar3 = FUN_7ff70c992fc0(&uStack_48,*(undefined8 *)(param_1 + 0x34));
        *(longlong *)(param_1 + 0x34) = lVar3;
        uVar1 = 0;
        if ((CONCAT44(uStack_34,uStack_38) <= *(longlong *)(lVar3 + 0x20)) &&
           ((CONCAT44(uStack_34,uStack_38) < *(longlong *)(lVar3 + 0x20) ||
            (uVar1 = 0, iStack_30 < *(int *)(lVar3 + 0x28))))) {
          uStack_48 = *(undefined8 *)(lVar3 + 0x20);
          uStack_40 = *(undefined8 *)(lVar3 + 0x28);
          uStack_28 = uStack_38;
          uStack_24 = uStack_34;
          iStack_20 = iStack_30;
          uStack_1c = uStack_2c;
          uVar1 = FUN_7ff70c958730(&uStack_48,&uStack_28);
        }
        *param_2 = uVar1;
        return 0;
      }
      *param_2 = 0xffffffff;
    }
    return 0;
  }
  return uVar2;
}


