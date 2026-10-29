/* 7ff70c94f4c0 FUN_7ff70c94f4c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8 FUN_7ff70c94f4c0(longlong param_1,undefined8 param_2,double *param_3)

{
  longlong lVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  undefined8 uVar5;
  double dVar6;
  undefined8 uVar7;
  undefined *puVar8;
  longlong lVar9;
  undefined8 *puVar10;
  
  if (param_1 == 0) {
    return 0x2b;
  }
  uVar4 = (uint)param_2;
  uVar5 = 0x30;
  switch((uVar4 & 0xf00000) - 0x100000 >> 0x14) {
  case 0:
    if (param_3 == (double *)0x0) {
      return 0x30;
    }
    switch(uVar4) {
    case 0x100001:
      puVar8 = &UNK_7ff70cb923a7;
      if (*(undefined **)(param_1 + 0x1168) != (undefined *)0x0) {
        puVar8 = *(undefined **)(param_1 + 0x1168);
      }
      break;
    default:
      goto LAB_7ff70c94fa69;
    case 0x100012:
      puVar8 = *(undefined **)(param_1 + 0x1300);
      break;
    case 0x100015:
      puVar8 = *(undefined **)(param_1 + 0x6c8);
      break;
    case 0x10001e:
      puVar8 = *(undefined **)(param_1 + 0x10f0);
      break;
    case 0x10001f:
      puVar8 = *(undefined **)(param_1 + 0x1308);
      break;
    case 0x100020:
      puVar8 = (undefined *)(param_1 + 0x131c);
      break;
    case 0x100024:
      puVar8 = *(undefined **)(param_1 + 0x870);
      break;
    case 0x100029:
      puVar8 = (undefined *)(param_1 + 0x1354);
      break;
    case 0x100031:
      puVar8 = *(undefined **)(param_1 + 5000);
      break;
    case 0x10003a:
      puVar8 = *(undefined **)(param_1 + 0x720);
      if (*(undefined **)(param_1 + 0x720) == (undefined *)0x0) {
        if (*(char *)(param_1 + 0xa36) == '\0') {
          bVar2 = *(char *)(param_1 + 0x12ba) - 1;
          if (bVar2 < 5) {
            puVar8 = *(undefined **)(&UNK_7ff70cb504f0 + (ulonglong)bVar2 * 8);
          }
          else {
            puVar8 = &UNK_7ff70cb89a1d;
          }
        }
        else {
          puVar8 = &UNK_7ff70cb8aa79;
        }
      }
      break;
    case 0x10003c:
      puVar8 = *(undefined **)(param_1 + 0x1170);
      break;
    case 0x10003d:
    case 0x10003e:
      puVar8 = (undefined *)0x0;
    }
    goto code_r0x7ff70c94f960;
  case 1:
    if (param_3 == (double *)0x0) {
      return 0x30;
    }
    switch(uVar4) {
    case 0x200002:
      uVar4 = *(uint *)(param_1 + 0x12d0);
      break;
    default:
      goto LAB_7ff70c94fa69;
    case 0x20000b:
      uVar4 = *(uint *)(param_1 + 0x1318);
      break;
    case 0x20000c:
      uVar4 = *(uint *)(param_1 + 0x12e8);
      break;
    case 0x20000d:
      uVar4 = *(uint *)(param_1 + 0x598);
      break;
    case 0x20000e:
      lVar1 = *(longlong *)(param_1 + 0x12e0);
      uVar4 = 0x7fffffff;
      if (lVar1 < 0x80000000) {
        lVar9 = -0x80000000;
        if (-0x80000000 < lVar1) {
          lVar9 = lVar1;
        }
        uVar4 = (uint)lVar9;
      }
      break;
    case 0x200014:
      uVar4 = *(uint *)(param_1 + 0xd08);
      break;
    case 0x200016:
      uVar4 = *(uint *)(param_1 + 0x12d4);
      break;
    case 0x200017:
      uVar4 = *(uint *)(param_1 + 0x12f4);
      break;
    case 0x200018:
      uVar4 = *(uint *)(param_1 + 0x12f0);
      break;
    case 0x200019:
      uVar4 = *(uint *)(param_1 + 0xcfc);
      break;
    case 0x20001a:
      uVar4 = *(uint *)(param_1 + 0x12f8);
      break;
    case 0x20001d:
      uVar4 = FUN_7ff70c956670(param_1,0);
      break;
    case 0x200023:
      uVar4 = 1;
      if (*(int *)(param_1 + 0x12d0) != 0x130) {
        uVar4 = (uint)*(byte *)(param_1 + 0x13ac);
      }
      break;
    case 0x200028:
      uVar4 = *(uint *)(param_1 + 0x134c);
      break;
    case 0x20002a:
      uVar4 = *(uint *)(param_1 + 0x1384);
      break;
    case 0x20002e:
      switch(*(undefined4 *)(param_1 + 0x12d8)) {
      case 10:
        uVar4 = 1;
        break;
      case 0xb:
        uVar4 = 2;
        break;
      default:
        uVar4 = 0;
        break;
      case 0x14:
        uVar4 = 3;
        break;
      case 0x1e:
        uVar4 = 0x1e;
      }
      break;
    case 0x20002f:
      uVar4 = *(uint *)(param_1 + 0x650);
      break;
    case 0x200030:
      uVar4 = *(uint *)(param_1 + 0x1390);
      break;
    case 0x20003b:
      uVar4 = *(uint *)(param_1 + 0x13a8);
    }
    *(uint *)param_3 = uVar4;
    goto code_r0x7ff70c94fa67;
  case 2:
    if (param_3 == (double *)0x0) {
      return 0x30;
    }
    break;
  case 3:
    if (param_3 == (double *)0x0) {
      return 0x30;
    }
    switch(uVar4) {
    case 0x40001b:
      dVar6 = (double)func_0x7ff70c942940();
      break;
    case 0x40001c:
      dVar6 = (double)func_0x7ff70c954040();
      break;
    default:
      goto LAB_7ff70c94fa69;
    case 0x400022:
      *param_3 = (double)(param_1 + 0x1398);
      goto code_r0x7ff70c94fa67;
    case 0x40002b:
    case 0x40002d:
      lVar1 = *(longlong *)(param_1 + 0x20);
      *param_3 = (double)(param_1 + 0x13b0);
      iVar3 = FUN_7ff70c941fb0();
      uVar5 = 0;
      *(int *)(param_1 + 0x13b0) = iVar3;
      *(undefined8 *)(param_1 + 0x13b8) = 0;
      if ((lVar1 != 0) && (iVar3 != 0)) {
        uVar7 = func_0x7ff70c943d10(param_1,0,param_2,0);
        uVar5 = 0;
        *(undefined8 *)(param_1 + 0x13b8) = uVar7;
      }
      goto LAB_7ff70c94fa69;
    }
    *param_3 = dVar6;
    goto code_r0x7ff70c94fa67;
  case 4:
    if (uVar4 != 0x50002c || param_3 == (double *)0x0) {
      return 0x30;
    }
    dVar6 = (double)FUN_7ff70c956670(param_1,0);
    *param_3 = dVar6;
    return 0;
  case 5:
    if (param_3 == (double *)0x0) {
      return 0x30;
    }
    switch(uVar4) {
    case 0x600007:
      puVar8 = *(undefined **)(param_1 + 0xa90);
      break;
    case 0x600008:
      puVar8 = *(undefined **)(param_1 + 0xa88);
      break;
    case 0x600009:
      puVar8 = *(undefined **)(param_1 + 0xab0);
      break;
    case 0x60000a:
      puVar8 = *(undefined **)(param_1 + 0xab8);
      break;
    default:
      goto LAB_7ff70c94fa69;
    case 0x60000e:
      puVar8 = *(undefined **)(param_1 + 0x12e0);
      break;
    case 0x60000f:
      puVar8 = (undefined *)0xffffffffffffffff;
      if ((*(byte *)(param_1 + 0xaa4) & 0x40) != 0) {
        puVar8 = *(undefined **)(param_1 + 0xa78);
      }
      break;
    case 0x600010:
      puVar8 = (undefined *)0xffffffffffffffff;
      if ((*(byte *)(param_1 + 0xaa4) & 0x20) != 0) {
        puVar8 = *(undefined **)(param_1 + 0xa80);
      }
      break;
    case 0x600032:
      puVar8 = *(undefined **)(param_1 + 0xaa8);
      break;
    case 0x600033:
      puVar8 = *(undefined **)(param_1 + 0xac0);
      break;
    case 0x600034:
      puVar8 = *(undefined **)(param_1 + 0xac8);
      break;
    case 0x600035:
      puVar8 = *(undefined **)(param_1 + 0xad8);
      break;
    case 0x600036:
      puVar8 = *(undefined **)(param_1 + 0xae0);
      break;
    case 0x600037:
      puVar8 = *(undefined **)(param_1 + 0xae8);
      break;
    case 0x600038:
      puVar8 = *(undefined **)(param_1 + 0xad0);
      break;
    case 0x600039:
      puVar8 = *(undefined **)(param_1 + 0x1310);
      break;
    case 0x60003f:
      puVar8 = *(undefined **)(param_1 + 8);
      break;
    case 0x600040:
      puVar10 = (undefined8 *)(param_1 + 0xc18);
      if (*(longlong *)(param_1 + 0x20) != 0) {
        puVar10 = (undefined8 *)(*(longlong *)(param_1 + 0x20) + 0x48);
      }
      puVar8 = (undefined *)*puVar10;
    }
code_r0x7ff70c94f960:
    *param_3 = (double)puVar8;
    goto code_r0x7ff70c94fa67;
  default:
    goto LAB_7ff70c94fa69;
  }
  dVar6 = _UNK_7ff70cb50520;
  switch(uVar4) {
  case 0x300003:
    dVar6 = (double)*(longlong *)(param_1 + 0xaa8);
    break;
  case 0x300004:
    dVar6 = (double)*(longlong *)(param_1 + 0xac0);
    break;
  case 0x300005:
    dVar6 = (double)*(longlong *)(param_1 + 0xac8);
    break;
  case 0x300006:
    dVar6 = (double)*(longlong *)(param_1 + 0xad8);
    break;
  case 0x300007:
    dVar6 = (double)*(longlong *)(param_1 + 0xa90);
    goto code_r0x7ff70c94f7bd;
  case 0x300008:
    dVar6 = (double)*(longlong *)(param_1 + 0xa88);
    goto code_r0x7ff70c94f7bd;
  case 0x300009:
    dVar6 = (double)*(longlong *)(param_1 + 0xab0);
    goto code_r0x7ff70c94f7bd;
  case 0x30000a:
    dVar6 = (double)*(longlong *)(param_1 + 0xab8);
    goto code_r0x7ff70c94f7bd;
  default:
    goto LAB_7ff70c94fa69;
  case 0x30000f:
    if ((*(byte *)(param_1 + 0xaa4) & 0x40) != 0) {
      dVar6 = (double)*(longlong *)(param_1 + 0xa78);
    }
    goto code_r0x7ff70c94f7bd;
  case 0x300010:
    if ((*(byte *)(param_1 + 0xaa4) & 0x20) != 0) {
      dVar6 = (double)*(longlong *)(param_1 + 0xa80);
    }
    goto code_r0x7ff70c94f7bd;
  case 0x300011:
    dVar6 = (double)*(longlong *)(param_1 + 0xae0);
    break;
  case 0x300013:
    dVar6 = (double)*(longlong *)(param_1 + 0xae8);
    break;
  case 0x300021:
    dVar6 = (double)*(longlong *)(param_1 + 0xad0);
  }
  dVar6 = dVar6 / _UNK_7ff70cb50518;
code_r0x7ff70c94f7bd:
  *param_3 = dVar6;
code_r0x7ff70c94fa67:
  uVar5 = 0;
LAB_7ff70c94fa69:
  return uVar5;
}


