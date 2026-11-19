/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008253f8
 */

void FUN_008253f8(ulong *param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  void *__src;
  void *__dest;
  ulong local_78;
  ulong uStack_70;
  void *local_68;
  ulong local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (((DAT_00d1cc70 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1cc70), iVar3 != 0)) {
    DAT_00d1cc68 = '\x01';
    DAT_00d1cc60 = 0xdb0f9eda2fffd86c;
    __cxa_atexit(&LAB_0082615c,&DAT_00d1cc60,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cc70);
  }
  if (DAT_00d1cc68 == '\x01') {
    DAT_00d1cc68 = '\0';
    DAT_00d1cc60 = DAT_00d1cc60 ^ 0xdb6bf7ad478bbd0b;
  }
                    /* try { // try from 00825470 to 00825483 has its CatchHandler @ 0082560c */
  FUN_008acba4(param_2,0xffffd8ee,&DAT_00d1cc60);
                    /* try { // try from 00825484 to 008254bb has its CatchHandler @ 00825610 */
  iVar3 = FUN_008ab0e0(param_2,0xffffffff);
  if (iVar3 == 7) {
    (*DAT_00d1b350)(param_2,0,1);
    iVar3 = FUN_008ab0e0(param_2,0xffffffff);
                    /* try { // try from 008254c4 to 008254d3 has its CatchHandler @ 00825608 */
    if ((iVar3 == 5) &&
       (__src = (void *)FUN_008ab8a4(param_2,0xffffffff,&local_60), __src != (void *)0x0)) {
      if (0xfffffffffffffff7 < local_60) {
        if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00825600 to 00825603 has its CatchHandler @ 00825604 */
          FUN_007fe124();
        }
        goto LAB_00825644;
      }
      if (local_60 < 0x17) {
        __dest = (void *)((ulong)&local_78 | 1);
        local_78 = CONCAT71(local_78._1_7_,(char)((int)local_60 << 1));
        if (local_60 != 0) goto LAB_00825530;
      }
      else {
        uVar2 = 0x1a;
        if ((local_60 | 7) != 0x17) {
          uVar2 = (local_60 | 7) + 1;
        }
                    /* try { // try from 00825518 to 0082551f has its CatchHandler @ 00825604 */
        __dest = operator_new(uVar2);
        local_78 = uVar2 | 1;
        uStack_70 = local_60;
        local_68 = __dest;
LAB_00825530:
        memmove(__dest,__src,local_60);
      }
      uVar2 = *param_1;
      *(undefined1 *)((long)__dest + local_60) = 0;
      if ((uVar2 & 1) != 0) {
        operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
      }
      param_1[1] = uStack_70;
      *param_1 = local_78;
      param_1[2] = (ulong)local_68;
    }
  }
                    /* try { // try from 0082556c to 00825577 has its CatchHandler @ 00825610 */
  FUN_008aa994(param_2,0xfffffffe);
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return;
  }
LAB_00825644:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

