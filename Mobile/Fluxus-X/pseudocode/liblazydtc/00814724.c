/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814724
 */

void FUN_00814724(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  size_t __n;
  long lVar2;
  ulong uVar3;
  int iVar4;
  void *__dest;
  undefined8 uVar5;
  void *unaff_x20;
  ulong __n_00;
  long lVar6;
  long lVar7;
  ulong local_68;
  ulong local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = 0;
  mbedtls_base64_decode(0,0,&local_60,param_2,param_3);
  __n_00 = local_60;
  if (local_60 == 0) {
    unaff_x20 = (void *)0x0;
    lVar6 = 0;
LAB_008147a8:
    __n_00 = lVar6 - (long)unaff_x20;
    local_68 = 0;
                    /* try { // try from 008147b0 to 0081481b has its CatchHandler @ 008148c4 */
    iVar4 = mbedtls_base64_decode(unaff_x20,__n_00,&local_68,param_2,param_3);
    uVar3 = local_68;
    if (iVar4 == 0) {
      __n = local_68 - __n_00;
      if (local_68 < __n_00 || __n == 0) {
        lVar7 = (long)unaff_x20 + local_68;
        if (local_68 >= __n_00) {
          lVar7 = lVar6;
        }
        __dest = unaff_x20;
      }
      else {
        if ((long)local_68 < 0) goto LAB_008148b0;
        uVar1 = __n_00 * 2;
        if (__n_00 * 2 <= local_68) {
          uVar1 = local_68;
        }
        if (0x3ffffffffffffffe < __n_00) {
          uVar1 = 0x7fffffffffffffff;
        }
        __dest = operator_new(uVar1);
        lVar6 = (long)__dest + uVar1;
        lVar7 = (long)__dest + uVar3;
        memset((void *)((long)__dest + __n_00),0,__n);
        memcpy(__dest,unaff_x20,__n_00);
        if (unaff_x20 != (void *)0x0) {
          operator_delete(unaff_x20,__n_00);
        }
      }
      *param_1 = __dest;
      param_1[1] = lVar7;
      param_1[2] = lVar6;
    }
    else {
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      if (unaff_x20 != (void *)0x0) {
        operator_delete(unaff_x20,__n_00);
      }
    }
    if (*(long *)(lVar2 + 0x28) == local_58) {
      return;
    }
  }
  else {
    if (-1 < (long)local_60) {
      unaff_x20 = operator_new(local_60);
      lVar6 = (long)unaff_x20 + __n_00;
      memset(unaff_x20,0,__n_00);
      goto LAB_008147a8;
    }
    if (*(long *)(lVar2 + 0x28) != local_58) goto LAB_008148f0;
    FUN_0080734c();
LAB_008148b0:
    if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* try { // try from 008148c0 to 008148c3 has its CatchHandler @ 008148c4 */
      uVar5 = FUN_0080734c();
                    /* catch() { ... } // from try @ 008147b0 with catch @ 008148c4
                       catch() { ... } // from try @ 008148c0 with catch @ 008148c4 */
      if (unaff_x20 != (void *)0x0) {
        operator_delete(unaff_x20,__n_00);
      }
      if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar5);
      }
    }
  }
LAB_008148f0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

