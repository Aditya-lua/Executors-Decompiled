/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b922d4
 */

undefined8 mbedtls_ecp_tls_read_group_id(undefined4 *param_1,long *param_2,ulong param_3)

{
  ushort uVar1;
  char *pcVar2;
  
  if (param_3 < 3) {
    return 0xffffb080;
  }
  pcVar2 = (char *)*param_2;
  *param_2 = (long)(pcVar2 + 1);
  if (*pcVar2 != '\x03') {
    return 0xffffb080;
  }
  uVar1 = *(ushort *)(pcVar2 + 1);
  *param_2 = (long)(pcVar2 + 3);
  uVar1 = (uVar1 >> 8 | uVar1 << 8) - 0x12;
  if (uVar1 < 0xd) {
    *param_1 = *(undefined4 *)(&PTR_DAT_00ca85f0)[(short)uVar1];
    return 0;
  }
  return 0xffffb180;
}

