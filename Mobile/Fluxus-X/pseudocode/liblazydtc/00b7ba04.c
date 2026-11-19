/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ba04
 */

undefined8 psa_pk_status_to_mbedtls(undefined8 param_1)

{
  switch((int)param_1) {
  case -0x99:
  case -0x98:
  case -0x92:
    return 0xffffc200;
  case -0x97:
    return 0xffffff92;
  case -0x96:
  case -0x95:
  case -0x94:
  case -0x90:
  case -0x8f:
  case -0x8e:
  case -0x8c:
  case -0x8b:
    goto switchD_00b7ba24_caseD_ffffff6a;
  case -0x93:
  case -0x91:
    return 0xffffff90;
  case -0x8d:
    return 0xffffc080;
  case -0x8a:
    return 0xffffc780;
  case -0x89:
    return 0xffffc180;
  case -0x88:
    return 0xffffc300;
  case -0x87:
    return 0xffffc580;
  case -0x86:
    return 0xffffc680;
  case -0x85:
    return 0xffffc100;
  default:
    if ((int)param_1 == 0) {
      return param_1;
    }
switchD_00b7ba24_caseD_ffffff6a:
    return 0xffffffff;
  }
}

