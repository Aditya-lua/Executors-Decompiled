/* 7ff70c94e790 FUN_7ff70c94e790 */

/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8 FUN_7ff70c94e790(int *param_1,int param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iStackX_18;
  
  uVar2 = 1;
  if (((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) &&
     (uVar2 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    uVar2 = 0;
    uVar3 = 0;
    if (param_2 < 0x2712) {
      iStackX_18 = (int)param_3;
      switch(param_2) {
      case 3:
        iStackX_18._0_1_ = (byte)param_3;
        *(byte *)((longlong)param_1 + 0x1b1) = (byte)iStackX_18 >> 1 & 1;
        return uVar3;
      case 6:
        param_1[0x5c] = iStackX_18;
        return uVar3;
      case 7:
        param_1[0x5d] = iStackX_18;
        return uVar3;
      case 8:
        goto LAB_7ff70c94e7bf;
      case 0xd:
        param_1[0x5e] = iStackX_18;
        return uVar3;
      case 0x10:
        iVar1 = 100;
        if (0 < iStackX_18) {
          iVar1 = iStackX_18;
        }
        iVar1 = func_0x7ff70c94fb40(iVar1);
        param_1[0x68] = iVar1;
        return 0;
      }
    }
    else if (param_2 < 0x4e24) {
      switch(param_2) {
      case 0x2712:
        *(undefined8 *)(param_1 + 0x22) = param_3;
        return uVar3;
      case 0x2713:
      case 0x2714:
      case 0x2716:
      case 0x2717:
      case 0x2718:
      case 0x2719:
      case 0x271a:
      case 0x271d:
      case 0x271e:
        break;
      case 0x2715:
        *(undefined8 *)(param_1 + 0x62) = param_3;
        return uVar3;
      case 0x271b:
      case 0x271c:
        goto LAB_7ff70c94e7bf;
      case 0x271f:
        *(undefined8 *)(param_1 + 0x26) = param_3;
        return uVar3;
      default:
        if (param_2 == 0x4e21) {
          *(undefined8 *)(param_1 + 0x20) = param_3;
          return uVar3;
        }
      }
    }
    else {
      if (param_2 - 0x7539U < 2) {
        return 0;
      }
      if (param_2 == 0x4e24) {
        *(undefined8 *)(param_1 + 0x60) = param_3;
        return uVar3;
      }
      if (param_2 == 0x4e2e) {
        *(undefined8 *)(param_1 + 0x24) = param_3;
        return uVar3;
      }
    }
    return 6;
  }
LAB_7ff70c94e7bf:
  return uVar2;
}


