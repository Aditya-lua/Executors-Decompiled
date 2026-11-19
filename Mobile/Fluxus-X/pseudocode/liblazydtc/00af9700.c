/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af9700
 */

ulong X509v3_asid_canonize(undefined8 *param_1)

{
  int iVar1;
  ulong uVar2;
  
  if (param_1 == (undefined8 *)0x0) {
    uVar2 = 1;
  }
  else {
    uVar2 = FUN_00af9744(*param_1);
    if ((int)uVar2 != 0) {
      iVar1 = FUN_00af9744(param_1[1]);
      uVar2 = (ulong)(iVar1 != 0);
    }
  }
  return uVar2;
}

