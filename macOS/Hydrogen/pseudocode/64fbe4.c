
/* WARNING: Possible PIC construction at 0x0064fbe4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0064fcac: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0064fbe8) */
/* WARNING: Removing unreachable block (ram,0x0064fc14) */
/* WARNING: Removing unreachable block (ram,0x0064fc1c) */
/* WARNING: Removing unreachable block (ram,0x0064fc20) */
/* WARNING: Removing unreachable block (ram,0x0064fc24) */
/* WARNING: Removing unreachable block (ram,0x0064fc30) */
/* WARNING: Removing unreachable block (ram,0x0064fc40) */
/* WARNING: Removing unreachable block (ram,0x0064fc74) */
/* WARNING: Removing unreachable block (ram,0x0064fc7c) */
/* WARNING: Removing unreachable block (ram,0x0064fc80) */
/* WARNING: Removing unreachable block (ram,0x0064fc84) */
/* WARNING: Removing unreachable block (ram,0x0064fc90) */
/* WARNING: Removing unreachable block (ram,0x0064fca0) */
/* WARNING: Removing unreachable block (ram,0x0064fcb0) */

long * FUN_0064fbe4(long *param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  lVar1 = param_1[1];
  lVar2 = param_1[2];
  while (lVar2 != lVar1) {
    puVar3 = *(undefined8 **)(lVar2 + -0x70);
    param_1[2] = (long)(lVar2 + -0x70);
    (*(code *)*puVar3)();
    lVar2 = param_1[2];
  }
  if (*param_1 != 0) {
    __ZdlPv();
  }
  return param_1;
}

