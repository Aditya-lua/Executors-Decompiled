/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a598e0
 */

undefined * ossl_ec_curve_nid2nist_int(int param_1)

{
  undefined *puVar1;
  long lVar2;
  
  puVar1 = (undefined *)0x0;
  lVar2 = 0;
  switch(param_1) {
  case 0x2c9:
    lVar2 = 0xb;
    break;
  case 0x2ca:
  case 0x2cd:
  case 0x2ce:
  case 0x2cf:
  case 0x2d0:
  case 0x2d2:
  case 0x2d4:
  case 0x2d5:
  case 0x2d8:
    goto switchD_00a59908_caseD_2ca;
  case 0x2cb:
    lVar2 = 0xd;
    break;
  case 0x2cc:
    lVar2 = 0xe;
    break;
  case 0x2d1:
    lVar2 = 5;
    break;
  case 0x2d3:
    break;
  case 0x2d6:
    lVar2 = 6;
    break;
  case 0x2d7:
    lVar2 = 1;
    break;
  case 0x2d9:
    lVar2 = 7;
    break;
  case 0x2da:
    lVar2 = 2;
    break;
  case 0x2db:
    lVar2 = 8;
    break;
  case 0x2dc:
    lVar2 = 3;
    break;
  case 0x2dd:
    lVar2 = 9;
    break;
  case 0x2de:
    lVar2 = 4;
    break;
  default:
    if (param_1 == 0x199) {
      lVar2 = 10;
    }
    else {
      if (param_1 != 0x19f) {
        return (undefined *)0x0;
      }
      lVar2 = 0xc;
    }
  }
  puVar1 = (&PTR_s_B_163_00c5d590)[lVar2 * 2];
switchD_00a59908_caseD_2ca:
  return puVar1;
}

