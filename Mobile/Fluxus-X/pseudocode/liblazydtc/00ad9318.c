/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9318
 */

undefined * ossl_rsa_oaeppss_nid2name(int param_1)

{
  long lVar1;
  
  if (param_1 < 0x446) {
    switch(param_1) {
    case 0x2a0:
      lVar1 = 2;
      break;
    case 0x2a1:
      lVar1 = 3;
      break;
    case 0x2a2:
      lVar1 = 4;
      break;
    case 0x2a3:
      lVar1 = 1;
      break;
    default:
      lVar1 = 0;
      if (param_1 != 0x40) {
        return (undefined *)0x0;
      }
    }
  }
  else if (param_1 == 0x446) {
    lVar1 = 5;
  }
  else {
    if (param_1 != 0x447) {
      return (undefined *)0x0;
    }
    lVar1 = 6;
  }
  return (&PTR_DAT_00c7da90)[lVar1 * 2];
}

