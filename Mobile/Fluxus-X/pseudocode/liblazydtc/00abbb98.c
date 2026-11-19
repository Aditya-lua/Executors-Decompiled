/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abbb98
 */

void PKCS12_get0_mac(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4
                    ,long param_5)

{
  if (*(undefined8 **)(param_5 + 8) == (undefined8 *)0x0) {
    if (param_1 != (undefined8 *)0x0) {
      *param_1 = 0;
    }
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = 0;
    }
    if (param_3 != (undefined8 *)0x0) {
      *param_3 = 0;
    }
    if (param_4 != (undefined8 *)0x0) {
      *param_4 = 0;
    }
  }
  else {
    X509_SIG_get0(**(undefined8 **)(param_5 + 8));
    if (param_3 != (undefined8 *)0x0) {
      *param_3 = *(undefined8 *)(*(long *)(param_5 + 8) + 8);
    }
    if (param_4 != (undefined8 *)0x0) {
      *param_4 = *(undefined8 *)(*(long *)(param_5 + 8) + 0x10);
    }
  }
  return;
}

