/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00845a74
 */

void FUN_00845a74(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00c48d10;
  std::__ndk1::locale::~locale((locale *)(param_1 + 2));
  *param_1 = &PTR_LAB_00c48b78;
  if ((long *)param_1[1] == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00845ac0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)param_1[1] + 8))();
  return;
}

