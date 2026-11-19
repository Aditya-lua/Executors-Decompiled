/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00872e24
 */

void FUN_00872e24(undefined8 *param_1,byte *param_2,byte *param_3,ulong param_4)

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
    if (0xaaaaaaaaaaaaaaa < param_4) {
      if (*(long *)(lVar1 + 0x28) == local_48) {
                    /* try { // try from 00872f40 to 00872f43 has its CatchHandler @ 00872f44 */
        uVar2 = FUN_00849168();
                    /* catch() { ... } // from try @ 00872e80 with catch @ 00872f44
                       catch() { ... } // from try @ 00872f40 with catch @ 00872f44 */
        FUN_00872f80(&local_78);
        if (*(long *)(lVar1 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar2);
        }
      }
      goto LAB_00872f7c;
    }
                    /* try { // try from 00872e80 to 00872e83 has its CatchHandler @ 00872f44 */
    local_88 = operator_new(param_4 * 0x18);
    *param_1 = local_88;
    param_1[1] = local_88;
    local_50 = 0;
    local_68 = param_1 + 2;
    *local_68 = local_88 + param_4 * 3;
    ppuStack_60 = &local_88;
    local_58 = &local_80;
    local_80 = local_88;
    if (param_2 != param_3) {
      do {
        if ((*param_2 & 1) == 0) {
          uVar3 = *(undefined8 *)(param_2 + 8);
          uVar2 = *(undefined8 *)param_2;
          local_80[2] = *(undefined8 *)(param_2 + 0x10);
          local_80[1] = uVar3;
          *local_80 = uVar2;
        }
        else {
                    /* try { // try from 00872ef4 to 00872ef7 has its CatchHandler @ 00872f4c */
          FUN_007ff40c(local_80,*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 8));
        }
        param_2 = param_2 + 0x18;
        local_80 = local_80 + 3;
      } while (param_2 != param_3);
    }
    param_1[1] = local_80;
  }
  if (*(long *)(lVar1 + 0x28) == local_48) {
    return;
  }
LAB_00872f7c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

