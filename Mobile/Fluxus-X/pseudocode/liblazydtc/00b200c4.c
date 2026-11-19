/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b200c4
 */

undefined8 ossl_prov_seeding_from_dispatch(long param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  plVar1 = (long *)(param_1 + 8);
LAB_00b200e8:
  switch((int)plVar1[-1]) {
  case 0x65:
    lVar2 = *plVar1;
    lVar3 = DAT_00d23808;
    if (DAT_00d23808 != 0) goto LAB_00b20160;
    plVar1 = plVar1 + 2;
    DAT_00d23808 = lVar2;
    goto LAB_00b200e8;
  case 0x66:
    lVar2 = *plVar1;
    lVar3 = DAT_00d23810;
    if (DAT_00d23810 == 0) {
      plVar1 = plVar1 + 2;
      DAT_00d23810 = lVar2;
      goto LAB_00b200e8;
    }
LAB_00b20160:
    if (lVar3 != lVar2) {
      return 0;
    }
    break;
  case 0x67:
    lVar2 = *plVar1;
    lVar3 = DAT_00d23818;
    if (DAT_00d23818 != 0) goto LAB_00b20160;
    plVar1 = plVar1 + 2;
    DAT_00d23818 = lVar2;
    goto LAB_00b200e8;
  case 0x68:
    lVar2 = *plVar1;
    lVar3 = DAT_00d23820;
    if (DAT_00d23820 != 0) goto LAB_00b20160;
    DAT_00d23820 = lVar2;
    break;
  default:
    if ((int)plVar1[-1] == 0) {
      return 1;
    }
  }
  plVar1 = plVar1 + 2;
  goto LAB_00b200e8;
}

