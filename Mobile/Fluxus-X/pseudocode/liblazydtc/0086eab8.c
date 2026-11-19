/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086eab8
 */

void FUN_0086eab8(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,ulong param_4)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *local_88;
  undefined8 *local_80;
  undefined8 *local_78;
  undefined1 local_70;
  undefined8 *local_68;
  undefined8 **ppuStack_60;
  undefined8 **local_58;
  undefined1 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_70 = 0;
  local_78 = param_1;
  if (param_4 != 0) {
    if (0x666666666666666 < param_4) {
      if (*(long *)(lVar1 + 0x28) == local_48) {
                    /* try { // try from 0086ebe4 to 0086ebe7 has its CatchHandler @ 0086ebe8 */
        uVar2 = FUN_0086ecc0();
                    /* catch() { ... } // from try @ 0086eb14 with catch @ 0086ebe8
                       catch() { ... } // from try @ 0086ebe4 with catch @ 0086ebe8 */
        FUN_0086ec24(&local_78);
        if (*(long *)(lVar1 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar2);
        }
      }
      goto LAB_0086ec20;
    }
                    /* try { // try from 0086eb14 to 0086eb17 has its CatchHandler @ 0086ebe8 */
    local_88 = operator_new(param_4 * 0x28);
    *param_1 = local_88;
    param_1[1] = local_88;
    local_50 = 0;
    local_68 = param_1 + 2;
    *local_68 = local_88 + param_4 * 5;
    ppuStack_60 = &local_88;
    local_58 = &local_80;
    local_80 = local_88;
    if (param_2 != param_3) {
      do {
        uVar2 = *param_2;
        local_80[1] = param_2[1];
        *local_80 = uVar2;
        if ((*(byte *)(param_2 + 2) & 1) == 0) {
          uVar3 = param_2[3];
          uVar2 = param_2[2];
          local_80[4] = param_2[4];
          local_80[3] = uVar3;
          local_80[2] = uVar2;
        }
        else {
                    /* try { // try from 0086eb94 to 0086eb9b has its CatchHandler @ 0086ebf0 */
          FUN_007ff40c(local_80 + 2,param_2[4],param_2[3]);
        }
        param_2 = param_2 + 5;
        local_80 = local_80 + 5;
      } while (param_2 != param_3);
    }
    param_1[1] = local_80;
  }
  if (*(long *)(lVar1 + 0x28) == local_48) {
    return;
  }
LAB_0086ec20:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

