/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce124
 */

/* std::__ndk1::ios_base::copyfmt(std::__ndk1::ios_base const&) */

void __thiscall std::__ndk1::ios_base::copyfmt(ios_base *this,ios_base *param_1)

{
  void *__ptr;
  void *__ptr_00;
  void *__ptr_01;
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  void *unaff_x19;
  void *pvVar5;
  void *unaff_x23;
  undefined8 uVar6;
  
  pvVar5 = *(void **)(param_1 + 0x48);
  if (*(void **)(this + 0x50) < pvVar5) {
    __ptr = malloc((long)pvVar5 << 3);
    if (__ptr == (void *)0x0) {
      __throw_bad_alloc();
LAB_00bce384:
                    /* try { // try from 00bce384 to 00bce387 has its CatchHandler @ 00bce3b0 */
      uVar1 = __throw_bad_alloc();
                    /* catch() { ... } // from try @ 00bce1c8 with catch @ 00bce388 */
      if (unaff_x23 != (void *)0x0) {
        free(unaff_x23);
      }
      if (pvVar5 != (void *)0x0) {
        free(pvVar5);
      }
      if (unaff_x19 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar1);
      }
      free(unaff_x19);
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar1);
    }
    __ptr_00 = malloc((long)pvVar5 << 2);
    unaff_x19 = __ptr;
    if (__ptr_00 == (void *)0x0) goto LAB_00bce384;
  }
  else {
    __ptr_00 = (void *)0x0;
    __ptr = (void *)0x0;
  }
  if (*(ulong *)(this + 0x68) < *(ulong *)(param_1 + 0x60)) {
    pvVar5 = malloc(*(ulong *)(param_1 + 0x60) << 3);
    if (pvVar5 == (void *)0x0) {
                    /* try { // try from 00bce1a0 to 00bce1a3 has its CatchHandler @ 00bce3b8 */
      __throw_bad_alloc();
      goto LAB_00bce1a4;
    }
  }
  else {
LAB_00bce1a4:
    pvVar5 = (void *)0x0;
  }
  if (*(ulong *)(this + 0x80) < *(ulong *)(param_1 + 0x78)) {
    __ptr_01 = malloc(*(ulong *)(param_1 + 0x78) << 3);
    if (__ptr_01 != (void *)0x0) goto LAB_00bce1d0;
                    /* try { // try from 00bce1c8 to 00bce1cb has its CatchHandler @ 00bce388 */
    __throw_bad_alloc();
  }
  __ptr_01 = (void *)0x0;
LAB_00bce1d0:
  uVar6 = *(undefined8 *)(param_1 + 0x18);
  uVar1 = *(undefined8 *)(param_1 + 0x10);
  *(undefined4 *)(this + 8) = *(undefined4 *)(param_1 + 8);
  *(undefined8 *)(this + 0x18) = uVar6;
  *(undefined8 *)(this + 0x10) = uVar1;
  locale::operator=((locale *)(this + 0x30),(locale *)(param_1 + 0x30));
  if (*(ulong *)(this + 0x50) < *(ulong *)(param_1 + 0x48)) {
    free(*(void **)(this + 0x38));
    *(void **)(this + 0x38) = __ptr;
    free(*(void **)(this + 0x40));
    uVar1 = *(undefined8 *)(param_1 + 0x48);
    __ptr = (void *)0x0;
    *(void **)(this + 0x40) = __ptr_00;
    __ptr_00 = (void *)0x0;
    *(undefined8 *)(this + 0x50) = uVar1;
  }
  *(undefined8 *)(this + 0x48) = 0;
  if (*(long *)(param_1 + 0x48) != 0) {
    uVar2 = 0;
    do {
      *(undefined8 *)(*(long *)(this + 0x38) + uVar2 * 8) =
           *(undefined8 *)(*(long *)(param_1 + 0x38) + uVar2 * 8);
      *(undefined4 *)(*(long *)(this + 0x40) + uVar2 * 4) =
           *(undefined4 *)(*(long *)(param_1 + 0x40) + uVar2 * 4);
      uVar2 = uVar2 + 1;
      *(ulong *)(this + 0x48) = uVar2;
    } while (uVar2 < *(ulong *)(param_1 + 0x48));
  }
  if (*(ulong *)(this + 0x68) < *(ulong *)(param_1 + 0x60)) {
    free(*(void **)(this + 0x58));
    uVar1 = *(undefined8 *)(param_1 + 0x60);
    *(void **)(this + 0x58) = pvVar5;
    pvVar5 = (void *)0x0;
    *(undefined8 *)(this + 0x68) = uVar1;
  }
  *(undefined8 *)(this + 0x60) = 0;
  if (*(long *)(param_1 + 0x60) != 0) {
    lVar3 = *(long *)(param_1 + 0x58);
    lVar4 = *(long *)(this + 0x58);
    uVar2 = 0;
    do {
      *(undefined8 *)(lVar4 + uVar2 * 8) = *(undefined8 *)(lVar3 + uVar2 * 8);
      uVar2 = *(long *)(this + 0x60) + 1;
      *(ulong *)(this + 0x60) = uVar2;
    } while (uVar2 < *(ulong *)(param_1 + 0x60));
  }
  if (*(ulong *)(this + 0x80) < *(ulong *)(param_1 + 0x78)) {
    free(*(void **)(this + 0x70));
    uVar1 = *(undefined8 *)(param_1 + 0x78);
    *(void **)(this + 0x70) = __ptr_01;
    __ptr_01 = (void *)0x0;
    *(undefined8 *)(this + 0x80) = uVar1;
  }
  *(undefined8 *)(this + 0x78) = 0;
  if (*(long *)(param_1 + 0x78) != 0) {
    uVar2 = 0;
    do {
      *(undefined8 *)(*(long *)(this + 0x70) + uVar2 * 8) =
           *(undefined8 *)(*(long *)(param_1 + 0x70) + uVar2 * 8);
      uVar2 = uVar2 + 1;
      *(ulong *)(this + 0x78) = uVar2;
    } while (uVar2 < *(ulong *)(param_1 + 0x78));
  }
  if (__ptr_01 != (void *)0x0) {
    free(__ptr_01);
  }
  if (pvVar5 != (void *)0x0) {
    free(pvVar5);
  }
  if (__ptr_00 != (void *)0x0) {
    free(__ptr_00);
  }
  if (__ptr == (void *)0x0) {
    return;
  }
  free(__ptr);
  return;
}

