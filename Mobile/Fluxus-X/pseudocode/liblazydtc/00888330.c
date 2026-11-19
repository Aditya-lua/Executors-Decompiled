/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00888330
 */

void FUN_00888330(undefined8 *param_1,long param_2)

{
  void *__src;
  undefined1 uVar1;
  undefined1 uVar2;
  ulong __n;
  long lVar3;
  void *__dest;
  long lVar4;
  void *unaff_x20;
  undefined8 uVar5;
  long unaff_x28;
  undefined8 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
  lVar4 = param_1[0xfe];
  __src = *(void **)(lVar4 + -0x18);
  uVar5 = *(undefined8 *)(lVar4 + -0x30);
  uVar1 = *(undefined1 *)(lVar4 + -0x28);
  uVar2 = *(undefined1 *)(lVar4 + -0x27);
  __n = *(long *)(lVar4 + -0x10) - (long)__src;
  if (__n == 0) {
    lVar4 = 0;
    __dest = (void *)0x0;
  }
  else {
    if ((long)__n < 0) {
      if (*(long *)(lVar3 + 0x28) == local_68) {
        uVar5 = FUN_00894518();
                    /* catch() { ... } // from try @ 008883c8 with catch @ 00888474 */
                    /* catch() { ... } // from try @ 008883f0 with catch @ 00888478 */
        if (unaff_x20 != (void *)0x0) {
          operator_delete(unaff_x20,unaff_x28 - (long)unaff_x20);
        }
        if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar5);
        }
      }
      goto LAB_008884a4;
    }
    __dest = operator_new(__n);
    lVar4 = (long)__dest + __n;
    memcpy(__dest,__src,__n);
  }
                    /* try { // try from 008883c8 to 008883eb has its CatchHandler @ 00888474 */
  FUN_00895520(param_1,param_2 + 0x20,uVar1,uVar2,0);
  FUN_008860c8(param_1,uVar5);
                    /* try { // try from 008883f0 to 0088841f has its CatchHandler @ 00888478 */
  local_70 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x17,0,0);
  FUN_00894434(param_1[0xfe] + -0x18,&local_70);
  if (__dest != (void *)0x0) {
    operator_delete(__dest,lVar4 - (long)__dest);
  }
  if (*(long *)(lVar3 + 0x28) == local_68) {
    return;
  }
LAB_008884a4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

