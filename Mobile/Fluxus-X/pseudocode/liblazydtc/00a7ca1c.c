/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ca1c
 */

undefined ** ossl_ffc_uid_to_dh_named_group(int param_1)

{
  undefined **ppuVar1;
  long lVar2;
  
  ppuVar1 = (undefined **)0x0;
  if (param_1 < 0x466) {
    if (param_1 == 1) {
      lVar2 = 0xb;
    }
    else if (param_1 == 2) {
      lVar2 = 0xc;
    }
    else {
      if (param_1 != 3) {
        return (undefined **)0x0;
      }
      lVar2 = 0xd;
    }
  }
  else {
    lVar2 = 0;
    switch(param_1) {
    case 0x466:
      break;
    case 0x467:
      lVar2 = 1;
      break;
    case 0x468:
      lVar2 = 2;
      break;
    case 0x469:
      lVar2 = 3;
      break;
    case 0x46a:
      lVar2 = 4;
      break;
    default:
      goto switchD_00a7ca4c_caseD_46b;
    case 0x4bc:
      lVar2 = 5;
      break;
    case 0x4bd:
      lVar2 = 6;
      break;
    case 0x4be:
      lVar2 = 7;
      break;
    case 0x4bf:
      lVar2 = 8;
      break;
    case 0x4c0:
      lVar2 = 9;
      break;
    case 0x4c1:
      lVar2 = 10;
    }
  }
  ppuVar1 = &PTR_s_ffdhe2048_00c61108 + lVar2 * 6;
switchD_00a7ca4c_caseD_46b:
  return ppuVar1;
}

