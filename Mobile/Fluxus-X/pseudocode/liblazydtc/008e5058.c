/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5058
 */

undefined8 FUN_008e5058(long param_1)

{
  undefined8 local_8;
  
  (**(code **)(**(long **)(param_1 + 8) + 0x30))
            (*(long **)(param_1 + 8),*(undefined8 *)(param_1 + 0x10),&local_8);
  return local_8;
}

