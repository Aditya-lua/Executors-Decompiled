/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3238
 */

void blake3_hash_many_portable
               (long *param_1,long param_2,long param_3,undefined8 *param_4,long param_5,
               ulong param_6,uint param_7,uint param_8,byte param_9,undefined4 *param_10)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 local_78;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_2 != 0) {
    do {
      uStack_88 = param_4[1];
      local_90 = *param_4;
      local_78 = param_4[3];
      uStack_80 = param_4[2];
      lVar4 = *param_1;
      if (param_3 != 0) {
        uVar2 = param_8 | param_7;
        if (param_3 == 1) {
          uVar2 = param_8 | param_7 | (uint)param_9;
        }
        blake3_compress_in_place_portable(&local_90,lVar4,0x40,param_5,uVar2);
        lVar3 = param_3;
        do {
          lVar4 = lVar4 + 0x40;
          if (lVar3 == 2) {
            uVar2 = param_7 | param_9;
          }
          else {
            uVar2 = param_7;
            if (lVar3 == 1) break;
          }
          blake3_compress_in_place_portable(&local_90,lVar4,0x40,param_5,uVar2);
          lVar3 = lVar3 + -1;
        } while( true );
      }
      param_2 = param_2 + -1;
      param_1 = param_1 + 1;
      *param_10 = (undefined4)local_90;
      param_10[1] = local_90._4_4_;
      param_5 = param_5 + (param_6 & 1);
      *(undefined8 *)(param_10 + 4) = uStack_80;
      *(undefined8 *)(param_10 + 2) = uStack_88;
      param_10[6] = (undefined4)local_78;
      param_10[7] = local_78._4_4_;
      param_10 = param_10 + 8;
    } while (param_2 != 0);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

