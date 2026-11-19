/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009718e8
 */

void FUN_009718e8(void)

{
  int iVar1;
  char *__filename;
  
  if ((DAT_00d20260 != (FILE *)0x0) ||
     (__filename = (char *)curl_getenv("SSLKEYLOGFILE"), __filename == (char *)0x0)) {
    return;
  }
  DAT_00d20260 = fopen(__filename,"a");
  if ((DAT_00d20260 != (FILE *)0x0) &&
     (iVar1 = setvbuf(DAT_00d20260,(char *)0x0,1,0x1000), iVar1 != 0)) {
    fclose(DAT_00d20260);
    DAT_00d20260 = (FILE *)0x0;
  }
  (*(code *)PTR_free_00cc4678)(__filename);
  return;
}

