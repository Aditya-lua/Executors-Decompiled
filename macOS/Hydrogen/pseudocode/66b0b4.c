
/* WARNING: Removing unreachable block (ram,0x0066b114) */
/* WARNING: Removing unreachable block (ram,0x0066b118) */
/* WARNING: Removing unreachable block (ram,0x0066b120) */
/* WARNING: Removing unreachable block (ram,0x0066b048) */
/* WARNING: Removing unreachable block (ram,0x0066b15c) */
/* WARNING: Removing unreachable block (ram,0x0066b04c) */
/* WARNING: Removing unreachable block (ram,0x0066b17c) */
/* WARNING: Removing unreachable block (ram,0x0066b1b8) */
/* WARNING: Removing unreachable block (ram,0x0066b1dc) */
/* WARNING: Removing unreachable block (ram,0x0066b2d8) */
/* WARNING: Removing unreachable block (ram,0x0066b308) */
/* WARNING: Removing unreachable block (ram,0x0066b210) */
/* WARNING: Removing unreachable block (ram,0x0066b270) */
/* WARNING: Removing unreachable block (ram,0x0066b274) */
/* WARNING: Removing unreachable block (ram,0x0066b290) */
/* WARNING: Removing unreachable block (ram,0x0066b268) */
/* WARNING: Removing unreachable block (ram,0x0066b2b8) */
/* WARNING: Removing unreachable block (ram,0x0066b2d4) */
/* WARNING: Removing unreachable block (ram,0x0066b054) */
/* WARNING: Removing unreachable block (ram,0x0066b078) */
/* WARNING: Removing unreachable block (ram,0x0066b30c) */
/* WARNING: Removing unreachable block (ram,0x0066b318) */

undefined8 FUN_0066b0b4(long param_1)

{
  long unaff_x19;
  int unaff_w25;
  
  *(long *)(unaff_x19 + 0x38) = *(long *)(unaff_x19 + 0x38) + param_1;
  *(long *)(unaff_x19 + 0x30) = *(long *)(unaff_x19 + 0x30) + param_1;
  *(undefined8 *)(unaff_x19 + 0x88) = 0;
  if (unaff_w25 != 0) {
    *(undefined8 *)(unaff_x19 + 0x30) = 0;
    *(ulong *)(unaff_x19 + 0x40) =
         CONCAT44((int)((ulong)*(undefined8 *)(unaff_x19 + 0x40) >> 0x20) + 1,
                  (int)*(undefined8 *)(unaff_x19 + 0x40) + 1);
  }
  return 0;
}

