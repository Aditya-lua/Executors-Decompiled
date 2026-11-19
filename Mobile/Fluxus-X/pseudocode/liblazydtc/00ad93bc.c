/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad93bc
 */

undefined * ossl_rsa_digestinfo_encoding(int param_1,undefined8 *param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  
  puVar1 = (undefined *)0x0;
  if (0x445 < param_1) {
    switch(param_1) {
    case 0x446:
      puVar1 = &DAT_00774a54;
      break;
    case 0x447:
      puVar1 = &DAT_00774a67;
      break;
    case 0x448:
      puVar1 = &DAT_00774a7a;
      break;
    case 0x449:
      puVar1 = &DAT_00774a8d;
      break;
    case 0x44a:
      puVar1 = &DAT_00774aa0;
      break;
    case 1099:
      puVar1 = &DAT_00774ab3;
      break;
    default:
      goto switchD_00ad9418_default;
    }
    goto LAB_00ad94f0;
  }
  if (param_1 < 0x75) {
    if (param_1 == 4) {
      puVar1 = &DAT_007749d8;
      uVar2 = 0x12;
    }
    else if (param_1 == 0x40) {
      puVar1 = &DAT_007749f9;
      uVar2 = 0xf;
    }
    else {
      if (param_1 != 0x5f) {
        return (undefined *)0x0;
      }
      puVar1 = &DAT_007749b8;
      uVar2 = 0xe;
    }
  }
  else {
    switch(param_1) {
    case 0x2a0:
      puVar1 = &DAT_00774a1b;
      break;
    case 0x2a1:
      puVar1 = &DAT_00774a2e;
      break;
    case 0x2a2:
      puVar1 = &DAT_00774a41;
      break;
    case 0x2a3:
      puVar1 = &DAT_00774a08;
      break;
    default:
      if (param_1 == 0x75) {
        puVar1 = &DAT_007749ea;
        uVar2 = 0xf;
      }
      else {
        if (param_1 != 0x101) {
          return (undefined *)0x0;
        }
        puVar1 = &DAT_007749c6;
        uVar2 = 0x12;
      }
      goto LAB_00ad94f4;
    }
LAB_00ad94f0:
    uVar2 = 0x13;
  }
LAB_00ad94f4:
  *param_2 = uVar2;
switchD_00ad9418_default:
  return puVar1;
}

