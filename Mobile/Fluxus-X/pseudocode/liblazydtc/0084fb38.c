/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084fb38
 */

void FUN_0084fb38(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  
  uVar1 = (**(code **)(*param_2 + 0xf0))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if ((((char)DAT_00d1ed00 == '\x01') && (*(long *)(param_1 + 0x48) != 0)) &&
     (puVar2 = *(undefined8 **)(*(long *)(param_1 + 0x48) + 0x38), puVar2 != (undefined8 *)0x0)) {
    (**(code **)*puVar2)(puVar2,param_2);
  }
  (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
                    /* WARNING: Could not recover jumptable at 0x0084fbc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x28))(*(undefined8 **)(param_1 + 0x28),param_2);
  return;
}

