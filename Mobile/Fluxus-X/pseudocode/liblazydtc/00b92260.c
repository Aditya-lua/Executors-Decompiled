/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b92260
 */

undefined8 mbedtls_ecp_tls_read_group(undefined8 param_1,long *param_2,ulong param_3)

{
  ushort uVar1;
  undefined8 uVar2;
  char *pcVar3;
  
  if (param_3 < 3) {
    return 0xffffb080;
  }
  pcVar3 = (char *)*param_2;
  *param_2 = (long)(pcVar3 + 1);
  if (*pcVar3 != '\x03') {
    return 0xffffb080;
  }
  uVar1 = *(ushort *)(pcVar3 + 1);
  *param_2 = (long)(pcVar3 + 3);
  uVar1 = (uVar1 >> 8 | uVar1 << 8) - 0x12;
  if (uVar1 < 0xd) {
    uVar2 = mbedtls_ecp_group_load(param_1,*(undefined4 *)(&PTR_DAT_00ca85f0)[(short)uVar1]);
    return uVar2;
  }
  return 0xffffb180;
}

