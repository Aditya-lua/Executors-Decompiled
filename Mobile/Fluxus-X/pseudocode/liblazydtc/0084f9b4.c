/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f9b4
 */

void FUN_0084f9b4(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  
  uVar1 = (**(code **)(*param_2 + 0xe8))(param_2,param_1);
  if ((uVar1 & 1) != 0) {
    if (((DAT_00d1ece0 == '\x01') && (*(long *)(param_1 + 0x60) != 0)) &&
       (puVar2 = *(undefined8 **)(*(long *)(param_1 + 0x60) + 0x38), puVar2 != (undefined8 *)0x0)) {
      (**(code **)*puVar2)(puVar2,param_2);
    }
    (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
    (**(code **)**(undefined8 **)(param_1 + 0x28))(*(undefined8 **)(param_1 + 0x28),param_2);
    puVar2 = *(undefined8 **)(param_1 + 0x30);
    if (puVar2 != (undefined8 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x0084fa58. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)*puVar2)(puVar2,param_2);
      return;
    }
  }
  return;
}

