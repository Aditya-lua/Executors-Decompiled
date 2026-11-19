/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008756fc
 */

ulong FUN_008756fc(long param_1,uint param_2)

{
  long lVar1;
  undefined2 *puVar2;
  ulong uVar3;
  uint local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_3c = param_2;
  if (*(long *)(param_1 + 400) != 0) {
    uVar3 = (ulong)param_2 * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 0x198) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x180) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        if (*(uint *)(*(long *)(param_1 + 0x168) + uVar3 * 8) == param_2) {
          uVar3 = (ulong)*(ushort *)(*(long *)(param_1 + 0x168) + uVar3 * 8 + 4);
          goto LAB_008757d8;
        }
        uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x188) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x180) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) !=
               0);
    }
  }
  uVar3 = *(long *)(param_1 + 0x80) - *(long *)(param_1 + 0x78);
  if ((uVar3 & 0x3fffe0000) == 0) {
    uVar3 = uVar3 >> 2;
    puVar2 = (undefined2 *)FUN_00875804(param_1 + 0x168,&local_3c);
    *puVar2 = (short)uVar3;
    FUN_0087593c((long *)(param_1 + 0x78),&local_3c);
  }
  else {
    uVar3 = 0xffff;
  }
LAB_008757d8:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar3 & 0xffffffff;
}

