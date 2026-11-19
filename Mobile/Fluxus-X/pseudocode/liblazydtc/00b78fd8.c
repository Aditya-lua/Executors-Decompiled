/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78fd8
 */

undefined8 mbedtls_md_get_name(int *param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  uVar1 = 0;
  if (param_1 != (int *)0x0) {
    if (*param_1 - 3U < 0x11) {
      puVar2 = (undefined8 *)(&PTR_PTR_00ca8460)[(int)(*param_1 - 3U)];
    }
    else {
      puVar2 = &DAT_00ca83c0;
    }
    uVar1 = *puVar2;
  }
  return uVar1;
}

