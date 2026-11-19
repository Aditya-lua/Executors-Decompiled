/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2148
 */

undefined8 tls_check_sigalg_curve(long param_1,int param_2)

{
  long lVar1;
  undefined2 *puVar2;
  ulong uVar3;
  ulong uVar4;
  
  puVar2 = *(undefined2 **)(*(long *)(param_1 + 0x898) + 0x198);
  if (puVar2 == (undefined2 *)0x0) {
    puVar2 = &DAT_0074cd90;
    uVar3 = 0x1c;
  }
  else {
    uVar3 = *(ulong *)(*(long *)(param_1 + 0x898) + 0x1a0);
    if (uVar3 == 0) {
      return 0;
    }
  }
  uVar4 = 0;
  while ((((lVar1 = FUN_009c21e4(param_1,puVar2[uVar4]), lVar1 == 0 ||
           (*(int *)(lVar1 + 0x14) != 0x198)) || (*(int *)(lVar1 + 0x20) == 0)) ||
         (*(int *)(lVar1 + 0x20) != param_2))) {
    uVar4 = uVar4 + 1;
    if (uVar3 <= uVar4) {
      return 0;
    }
  }
  return 1;
}

