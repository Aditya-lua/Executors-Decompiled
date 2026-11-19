/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008068b4
 */

void FUN_008068b4(void)

{
  int iVar1;
  
  if (((DAT_00d1b3a0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3a0), iVar1 != 0)) {
                    /* try { // try from 00806b20 to 00806b23 has its CatchHandler @ 00806e38 */
    DAT_00d1b398 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3a0);
  }
  DAT_00d1b348 = DAT_00d1b398 + 0x21c6e44;
  if (((DAT_00d1b3b0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3b0), iVar1 != 0)) {
                    /* try { // try from 00806b50 to 00806b53 has its CatchHandler @ 00806e28 */
    DAT_00d1b3a8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3b0);
  }
  DAT_00d1b350 = DAT_00d1b3a8 + 0x220d800;
  if (((DAT_00d1b3c0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3c0), iVar1 != 0)) {
                    /* try { // try from 00806b80 to 00806b83 has its CatchHandler @ 00806e18 */
    DAT_00d1b3b8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3c0);
  }
  DAT_00d1b358 = DAT_00d1b3b8 + 0x2e89dd4;
  if (((DAT_00d1b3d0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3d0), iVar1 != 0)) {
                    /* try { // try from 00806bb0 to 00806bb3 has its CatchHandler @ 00806e08 */
    DAT_00d1b3c8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3d0);
  }
  DAT_00ccb130 = DAT_00d1b3c8 + 0x21c9870;
  if (((DAT_00d1b3e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3e0), iVar1 != 0)) {
                    /* try { // try from 00806be0 to 00806be3 has its CatchHandler @ 00806df8 */
    DAT_00d1b3d8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3e0);
  }
  DAT_00ccb160 = DAT_00d1b3d8 + 0x1e46e78;
  if (((DAT_00d1b3f0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b3f0), iVar1 != 0)) {
                    /* try { // try from 00806c10 to 00806c13 has its CatchHandler @ 00806de8 */
    DAT_00d1b3e8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b3f0);
  }
  DAT_00d1b360 = DAT_00d1b3e8 + 0x2186b44;
  if (((DAT_00d1b400 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b400), iVar1 != 0)) {
                    /* try { // try from 00806c40 to 00806c43 has its CatchHandler @ 00806dd8 */
    DAT_00d1b3f8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b400);
  }
  DAT_00d1b368 = DAT_00d1b3f8 + 0x21ff790;
  if (((DAT_00d1b410 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b410), iVar1 != 0)) {
                    /* try { // try from 00806c70 to 00806c73 has its CatchHandler @ 00806dc8 */
    DAT_00d1b408 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b410);
  }
  DAT_00d1b370 = DAT_00d1b408 + 0x1e79bb4;
  if (((DAT_00d1b420 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b420), iVar1 != 0)) {
                    /* try { // try from 00806ca0 to 00806ca3 has its CatchHandler @ 00806db8 */
    DAT_00d1b418 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b420);
  }
  DAT_00d1b378 = DAT_00d1b418 + 0x57447a0;
  if (((DAT_00d1b430 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b430), iVar1 != 0)) {
                    /* try { // try from 00806cd0 to 00806cd3 has its CatchHandler @ 00806da8 */
    DAT_00d1b428 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b430);
  }
  DAT_00d1b380 = DAT_00d1b428 + 0x4631b10;
  if (((DAT_00d1b440 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b440), iVar1 != 0)) {
                    /* try { // try from 00806d00 to 00806d03 has its CatchHandler @ 00806d98 */
    DAT_00d1b438 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b440);
  }
  DAT_00d1b388 = DAT_00d1b438 + 0x4ce7118;
  if (((DAT_00d1b450 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b450), iVar1 != 0)) {
                    /* try { // try from 00806d30 to 00806d33 has its CatchHandler @ 00806d88 */
    DAT_00d1b448 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b450);
  }
  DAT_00d1b390 = DAT_00d1b448 + 0x21cee5c;
  if (((DAT_00d1b460 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b460), iVar1 != 0)) {
                    /* try { // try from 00806d60 to 00806d63 has its CatchHandler @ 00806d78 */
    DAT_00d1b458 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1b460);
  }
  DAT_00ccaae8 = DAT_00d1b458 + 0x21d2ed0;
  return;
}

