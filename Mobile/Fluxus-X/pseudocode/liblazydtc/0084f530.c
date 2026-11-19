/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f530
 */

void FUN_0084f530(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  
  uVar1 = (**(code **)(*param_2 + 0xb8))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if (((DAT_00d1ece0 == '\x01') && (*(long *)(param_1 + 0x48) != 0)) &&
     (puVar2 = *(undefined8 **)(*(long *)(param_1 + 0x48) + 0x38), puVar2 != (undefined8 *)0x0)) {
    (**(code **)*puVar2)(puVar2,param_2);
  }
  (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
  (**(code **)**(undefined8 **)(param_1 + 0x30))(*(undefined8 **)(param_1 + 0x30),param_2);
                    /* WARNING: Could not recover jumptable at 0x0084f5d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x40))(*(undefined8 **)(param_1 + 0x40),param_2);
  return;
}

