/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69e24
 */

undefined8 EVP_PBE_get(undefined4 *param_1,undefined4 *param_2,ulong param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_3 < 0x1d) {
    if (param_1 != (undefined4 *)0x0) {
      *param_1 = *(undefined4 *)(&DAT_00c5e550 + param_3 * 0x20);
    }
    if (param_2 != (undefined4 *)0x0) {
      *param_2 = *(undefined4 *)(&DAT_00c5e554 + param_3 * 0x20);
    }
    uVar1 = 1;
  }
  return uVar1;
}

