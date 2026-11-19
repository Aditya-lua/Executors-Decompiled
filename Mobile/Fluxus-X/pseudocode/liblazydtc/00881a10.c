/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00881a10
 */

void FUN_00881a10(long param_1)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  
  if (*(long *)(param_1 + 0xd38) != 0) {
                    /* try { // try from 00881a2c to 00881a33 has its CatchHandler @ 00881eec */
    FUN_00882bf8(param_1 + 0xd38);
  }
  operator_delete(*(void **)(param_1 + 0xd50));
  if (*(long *)(param_1 + 0xd00) != 0) {
                    /* try { // try from 00881a44 to 00881a4b has its CatchHandler @ 00881ee8 */
    FUN_00882da0(param_1 + 0xd00);
  }
  operator_delete(*(void **)(param_1 + 0xd18));
  FUN_008826c4(param_1 + 0xc30);
  pvVar1 = *(void **)(param_1 + 0xc18);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0xc20) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0xc28) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x800);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x808) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x810) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x7e8);
  if (pvVar1 != (void *)0x0) {
    pvVar3 = *(void **)(param_1 + 0x7f0);
    pvVar2 = pvVar1;
    if (pvVar1 != pvVar3) {
      do {
        pvVar2 = *(void **)((long)pvVar3 + -0x18);
        if (pvVar2 != (void *)0x0) {
          *(void **)((long)pvVar3 + -0x10) = pvVar2;
          operator_delete(pvVar2,*(long *)((long)pvVar3 + -8) - (long)pvVar2);
        }
        pvVar3 = (void *)((long)pvVar3 + -0x38);
      } while (pvVar3 != pvVar1);
      pvVar2 = *(void **)(param_1 + 0x7e8);
    }
    *(void **)(param_1 + 0x7f0) = pvVar1;
    operator_delete(pvVar2,*(long *)(param_1 + 0x7f8) - (long)pvVar2);
  }
  pvVar1 = *(void **)(param_1 + 2000);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x7d8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x7e0) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x7b8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x7c0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x7c8) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x7a0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x7a8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x7b0) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x680);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x688) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x690) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x3c8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x3d0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x3d8) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x3b0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x3b8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x3c0) - (long)pvVar1);
  }
  if (*(void **)(param_1 + 0x378) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x378));
    *(undefined8 *)(param_1 + 0x378) = 0;
    operator_delete(*(void **)(param_1 + 0x390));
    *(undefined8 *)(param_1 + 0x390) = 0;
    *(undefined8 *)(param_1 + 0x388) = 0;
    *(undefined8 *)(param_1 + 0x380) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x398) = 0;
    *(undefined1 *)(param_1 + 0x3a8) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x390));
  if (*(void **)(param_1 + 0x340) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x340));
    *(undefined8 *)(param_1 + 0x340) = 0;
    operator_delete(*(void **)(param_1 + 0x358));
    *(undefined8 *)(param_1 + 0x358) = 0;
    *(undefined8 *)(param_1 + 0x350) = 0;
    *(undefined8 *)(param_1 + 0x348) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x360) = 0;
    *(undefined1 *)(param_1 + 0x370) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x358));
  if (*(void **)(param_1 + 0x308) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x308));
    *(undefined8 *)(param_1 + 0x308) = 0;
    operator_delete(*(void **)(param_1 + 800));
    *(undefined8 *)(param_1 + 800) = 0;
    *(undefined8 *)(param_1 + 0x318) = 0;
    *(undefined8 *)(param_1 + 0x310) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x328) = 0;
    *(undefined1 *)(param_1 + 0x338) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 800));
  if (*(void **)(param_1 + 0x2d0) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x2d0));
    *(undefined8 *)(param_1 + 0x2d0) = 0;
    operator_delete(*(void **)(param_1 + 0x2e8));
    *(undefined8 *)(param_1 + 0x2e8) = 0;
    *(undefined8 *)(param_1 + 0x2e0) = 0;
    *(undefined8 *)(param_1 + 0x2d8) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x2f0) = 0;
    *(undefined1 *)(param_1 + 0x300) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x2e8));
  if (*(long *)(param_1 + 0x298) != 0) {
                    /* try { // try from 00881c84 to 00881c8b has its CatchHandler @ 00881ee4 */
    FUN_00882ec8(param_1 + 0x298);
  }
  operator_delete(*(void **)(param_1 + 0x2b0));
  if (*(void **)(param_1 + 0x260) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x260));
    *(undefined8 *)(param_1 + 0x260) = 0;
    operator_delete(*(void **)(param_1 + 0x278));
    *(undefined8 *)(param_1 + 0x278) = 0;
    *(undefined8 *)(param_1 + 0x270) = 0;
    *(undefined8 *)(param_1 + 0x268) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x280) = 0;
    *(undefined1 *)(param_1 + 0x290) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x278));
  if (*(void **)(param_1 + 0x228) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x228));
    *(undefined8 *)(param_1 + 0x228) = 0;
    operator_delete(*(void **)(param_1 + 0x240));
    *(undefined8 *)(param_1 + 0x240) = 0;
    *(undefined8 *)(param_1 + 0x238) = 0;
    *(undefined8 *)(param_1 + 0x230) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x248) = 0;
    *(undefined1 *)(param_1 + 600) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x240));
  if (*(void **)(param_1 + 0x1f0) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x1f0));
    *(undefined8 *)(param_1 + 0x1f0) = 0;
    operator_delete(*(void **)(param_1 + 0x208));
    *(undefined8 *)(param_1 + 0x1f8) = 0;
    *(undefined8 *)(param_1 + 0x200) = 0;
    *(undefined8 *)(param_1 + 0x208) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x210) = 0;
    *(undefined1 *)(param_1 + 0x220) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x208));
  if (*(void **)(param_1 + 0x1b8) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x1b8));
    *(undefined8 *)(param_1 + 0x1b8) = 0;
    operator_delete(*(void **)(param_1 + 0x1d0));
    *(undefined8 *)(param_1 + 0x1c0) = 0;
    *(undefined8 *)(param_1 + 0x1c8) = 0;
    *(undefined8 *)(param_1 + 0x1d0) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x1d8) = 0;
    *(undefined1 *)(param_1 + 0x1e8) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x1d0));
  if (*(void **)(param_1 + 0x180) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x180));
    *(undefined8 *)(param_1 + 0x180) = 0;
    operator_delete(*(void **)(param_1 + 0x198));
    *(undefined8 *)(param_1 + 0x188) = 0;
    *(undefined8 *)(param_1 + 400) = 0;
    *(undefined8 *)(param_1 + 0x198) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x1a0) = 0;
    *(undefined1 *)(param_1 + 0x1b0) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x198));
  if (*(void **)(param_1 + 0x148) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x148));
    *(undefined8 *)(param_1 + 0x148) = 0;
    operator_delete(*(void **)(param_1 + 0x160));
    *(undefined8 *)(param_1 + 0x150) = 0;
    *(undefined8 *)(param_1 + 0x158) = 0;
    *(undefined8 *)(param_1 + 0x160) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x168) = 0;
    *(undefined1 *)(param_1 + 0x178) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x160));
  if (*(void **)(param_1 + 0x110) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x110));
    *(undefined8 *)(param_1 + 0x110) = 0;
    operator_delete(*(void **)(param_1 + 0x128));
    *(undefined8 *)(param_1 + 0x118) = 0;
    *(undefined8 *)(param_1 + 0x120) = 0;
    *(undefined8 *)(param_1 + 0x128) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x130) = 0;
    *(undefined1 *)(param_1 + 0x140) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x128));
  if (*(void **)(param_1 + 0xd8) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0xd8));
    *(undefined8 *)(param_1 + 0xd8) = 0;
    operator_delete(*(void **)(param_1 + 0xf0));
    *(undefined8 *)(param_1 + 0xe0) = 0;
    *(undefined8 *)(param_1 + 0xe8) = 0;
    *(undefined8 *)(param_1 + 0xf0) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0xf8) = 0;
    *(undefined1 *)(param_1 + 0x108) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0xf0));
  if (*(void **)(param_1 + 0xa0) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0xa0));
    *(undefined8 *)(param_1 + 0xa0) = 0;
    operator_delete(*(void **)(param_1 + 0xb8));
    *(undefined8 *)(param_1 + 0xa8) = 0;
    *(undefined8 *)(param_1 + 0xb0) = 0;
    *(undefined8 *)(param_1 + 0xb8) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0xc0) = 0;
    *(undefined1 *)(param_1 + 0xd0) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0xb8));
  if (*(long *)(param_1 + 0x68) != 0) {
                    /* try { // try from 00881ec8 to 00881ecb has its CatchHandler @ 00881ee0 */
    FUN_00882ff0();
  }
  operator_delete(*(void **)(param_1 + 0x80));
  return;
}

