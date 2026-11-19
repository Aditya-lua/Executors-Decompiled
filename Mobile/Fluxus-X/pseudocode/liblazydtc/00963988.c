/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00963988
 */

undefined * curl_version_info(void)

{
  uint *puVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  uint *puVar6;
  
  thunk_FUN_0096f9e8(&DAT_00d200c4,0x50);
  DAT_00cc4c58 = &DAT_00d200c4;
  DAT_00cc4c68 = zlibVersion();
  uVar4 = 0;
  lVar5 = 0;
  puVar6 = &DAT_00c51370;
  do {
    if ((*(code **)(puVar6 + -2) == (code *)0x0) ||
       (iVar3 = (**(code **)(puVar6 + -2))(&DAT_00cc4c30), iVar3 != 0)) {
      uVar2 = *puVar6;
      (&DAT_00d20118)[lVar5] = *(undefined8 *)(puVar6 + -4);
      lVar5 = lVar5 + 1;
      uVar4 = uVar2 | uVar4;
    }
    puVar1 = puVar6 + 2;
    puVar6 = puVar6 + 6;
  } while (*(long *)puVar1 != 0);
  (&DAT_00d20118)[lVar5] = 0;
  DAT_00cc4c50 = uVar4;
  return &DAT_00cc4c30;
}

