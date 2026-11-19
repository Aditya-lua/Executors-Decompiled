/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ba80
 */

undefined8 mbedtls_ecc_group_to_psa(undefined4 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar1 = 0x12;
  uVar2 = 0xc0;
  switch(param_1) {
  case 1:
    goto switchD_00b7baa4_caseD_1;
  case 2:
    *param_2 = 0xe0;
    return 0x12;
  case 3:
    *param_2 = 0x100;
    return 0x12;
  case 4:
    *param_2 = 0x180;
    return 0x12;
  case 5:
    *param_2 = 0x209;
    return 0x12;
  case 6:
    *param_2 = 0x100;
    return 0x30;
  case 7:
    *param_2 = 0x180;
    return 0x30;
  case 8:
    *param_2 = 0x200;
    return 0x30;
  case 9:
    *param_2 = 0xff;
    return 0x41;
  case 10:
    *param_2 = 0xc0;
    return 0x17;
  default:
    uVar2 = 0;
    uVar1 = 0;
switchD_00b7baa4_caseD_1:
    *param_2 = uVar2;
    return uVar1;
  case 0xc:
    *param_2 = 0x100;
    return 0x17;
  case 0xd:
    *param_2 = 0x1c0;
    return 0x41;
  }
}

