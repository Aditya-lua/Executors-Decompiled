
/* WARNING: Removing unreachable block (ram,0x0042b268) */
/* WARNING: Removing unreachable block (ram,0x0042b1ac) */
/* WARNING: Removing unreachable block (ram,0x0042b1b4) */
/* WARNING: Removing unreachable block (ram,0x0042b22c) */
/* WARNING: Removing unreachable block (ram,0x0042b234) */
/* WARNING: Removing unreachable block (ram,0x0042b1a8) */
/* WARNING: Removing unreachable block (ram,0x0042b1e0) */
/* WARNING: Removing unreachable block (ram,0x0042b1e8) */
/* WARNING: Removing unreachable block (ram,0x0042b1dc) */
/* WARNING: Removing unreachable block (ram,0x0042b1ec) */
/* WARNING: Removing unreachable block (ram,0x0042b1fc) */
/* WARNING: Removing unreachable block (ram,0x0042b204) */
/* WARNING: Removing unreachable block (ram,0x0042b20c) */
/* WARNING: Removing unreachable block (ram,0x0042b218) */

void FUN_0042b17c(void)

{
  uint uVar1;
  char cVar2;
  uint *puVar3;
  undefined2 *unaff_x19;
  
  puVar3 = (uint *)___error();
  uVar1 = *puVar3;
  cVar2 = func_0x004307b8(uVar1);
  if (cVar2 == '\0') {
    *unaff_x19 = 0;
  }
  else {
    *(ulong *)(unaff_x19 + 4) = (ulong)uVar1 << 0x20 | 2;
    *(undefined1 *)unaff_x19 = 1;
  }
  return;
}

