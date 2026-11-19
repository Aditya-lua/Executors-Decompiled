/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b988
 */

undefined8 psa_generic_status_to_mbedtls(undefined8 param_1)

{
  switch((int)param_1) {
  case -0x97:
    return 0xffffff92;
  case -0x96:
  case -0x95:
  case -0x94:
  case -0x92:
  case -0x90:
  case -0x8f:
  case -0x8e:
  case -0x8d:
  case -0x8c:
  case -0x8b:
  case -0x8a:
  case -0x89:
  case -0x88:
  case -0x87:
    goto switchD_00b7b9a4_caseD_ffffff6a;
  case -0x93:
  case -0x91:
    return 0xffffff90;
  case -0x86:
    return 0xffffff8e;
  default:
    if ((int)param_1 == 0) {
      return param_1;
    }
switchD_00b7b9a4_caseD_ffffff6a:
    return 0xffffffff;
  }
}

