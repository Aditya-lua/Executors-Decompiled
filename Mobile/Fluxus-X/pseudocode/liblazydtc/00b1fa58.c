/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fa58
 */

undefined8 ossl_prov_bio_from_dispatch(long param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(param_1 + 8);
LAB_00b1fa94:
  switch((int)plVar1[-1]) {
  case 0:
    goto switchD_00b1faa8_caseD_0;
  case 0x28:
    if (DAT_00d237b8 == 0) {
      DAT_00d237b8 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x29:
    if (DAT_00d237c0 == 0) {
      DAT_00d237c0 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x2a:
    if (DAT_00d237c8 == 0) {
      DAT_00d237c8 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x2b:
    if (DAT_00d237d0 == 0) {
      DAT_00d237d0 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x2c:
    if (DAT_00d237f0 == 0) {
      DAT_00d237f0 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x2d:
    if (DAT_00d237f8 == 0) {
      DAT_00d237f8 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x2e:
    if (DAT_00d23800 == 0) {
      DAT_00d23800 = *plVar1;
    }
    break;
  case 0x30:
    if (DAT_00d237e0 == 0) {
      DAT_00d237e0 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x31:
    if (DAT_00d237d8 == 0) {
      DAT_00d237d8 = *plVar1;
      plVar1 = plVar1 + 2;
      goto LAB_00b1fa94;
    }
    break;
  case 0x32:
    if (DAT_00d237e8 != 0) break;
    DAT_00d237e8 = *plVar1;
    plVar1 = plVar1 + 2;
    goto LAB_00b1fa94;
  }
  plVar1 = plVar1 + 2;
  goto LAB_00b1fa94;
switchD_00b1faa8_caseD_0:
  return 1;
}

