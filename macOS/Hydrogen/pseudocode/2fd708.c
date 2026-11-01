
/* WARNING: Possible PIC construction at 0x002fd730: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002fd734) */
/* WARNING: Removing unreachable block (ram,0x002fd758) */
/* WARNING: Removing unreachable block (ram,0x002fd74c) */
/* WARNING: Removing unreachable block (ram,0x002fd848) */

undefined8 FUN_002fd708(void)

{
  undefined *puVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined1 uStack0000000000000020;
  
  func_0x003001c4();
  func_0x0036e464(&uStack0000000000000020,0x70);
  lVar3 = 0x20;
  iVar2 = _memcmp();
  puVar1 = PTR____stderrp_009b01f0;
  if (iVar2 == 0) {
    return 1;
  }
  _fprintf(*(undefined8 *)PTR____stderrp_009b01f0,"%s failed.\nExpected:   ");
  lVar4 = 0x20;
  do {
    _fprintf(*(undefined8 *)puVar1,"%02x");
    lVar4 = lVar4 + -1;
  } while (lVar4 != 0);
  _fwrite("\nCalculated: ",0xd,1,*(undefined8 *)puVar1);
  do {
    _fprintf(*(undefined8 *)puVar1,"%02x");
    lVar3 = lVar3 + -1;
  } while (lVar3 != 0);
  _fputc(10,*(undefined8 *)puVar1);
  _fflush(*(undefined8 *)puVar1);
  return 0;
}

