
/* WARNING: Possible PIC construction at 0x002b5e7c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002b5e94: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002b5e80) */
/* WARNING: Removing unreachable block (ram,0x002b5e98) */
/* WARNING: Removing unreachable block (ram,0x0036e3d8) */
/* WARNING: Removing unreachable block (ram,0x0036e42c) */
/* WARNING: Removing unreachable block (ram,0x0036e3e8) */
/* WARNING: Removing unreachable block (ram,0x0036e438) */
/* WARNING: Removing unreachable block (ram,0x0036e444) */
/* WARNING: Removing unreachable block (ram,0x0036e44c) */
/* WARNING: Removing unreachable block (ram,0x007b3494) */
/* WARNING: Removing unreachable block (ram,0x0036e3f8) */
/* WARNING: Removing unreachable block (ram,0x0036e45c) */
/* WARNING: Removing unreachable block (ram,0x0036e404) */
/* WARNING: Removing unreachable block (ram,0x0036e460) */
/* WARNING: Removing unreachable block (ram,0x0036e410) */

void FUN_002b5e68(undefined1 param_1 [16])

{
  undefined8 *unaff_x19;
  
  unaff_x19[1] = param_1._8_8_;
  *unaff_x19 = param_1._0_8_;
  *(undefined4 *)(unaff_x19 + 0x12) = 1;
  _bzero(unaff_x19 + 0x13);
  return;
}

