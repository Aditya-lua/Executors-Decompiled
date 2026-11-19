/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960b7c
 */

undefined8 curl_getenv(char *param_1)

{
  char *pcVar1;
  undefined8 uVar2;
  
  pcVar1 = getenv(param_1);
  if ((pcVar1 == (char *)0x0) || (*pcVar1 == '\0')) {
    return 0;
  }
  uVar2 = (*(code *)PTR_strdup_00cc4688)();
  return uVar2;
}

