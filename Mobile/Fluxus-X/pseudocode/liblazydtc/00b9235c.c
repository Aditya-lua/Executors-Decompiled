/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9235c
 */

undefined8
mbedtls_ecp_tls_write_group(int *param_1,undefined8 *param_2,undefined1 *param_3,ulong param_4)

{
  int iVar1;
  undefined *puVar2;
  
  iVar1 = *param_1;
  if (0xc < iVar1 - 1U) {
    return 0xffffb080;
  }
  *param_2 = 3;
  if (param_4 < 3) {
    return 0xffffb100;
  }
  puVar2 = (&PTR_DAT_00ca8660)[(int)(iVar1 - 1U)];
  *param_3 = 3;
  *(ushort *)(param_3 + 1) = *(ushort *)(puVar2 + 4) >> 8 | *(ushort *)(puVar2 + 4) << 8;
  return 0;
}

