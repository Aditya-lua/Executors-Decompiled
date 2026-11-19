/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52238
 */

int ENGINE_up_ref(ENGINE *e)

{
  ENGINE *pEVar1;
  char cVar2;
  bool bVar3;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x1ba,"ENGINE_up_ref");
    ERR_set_error(0x26,0xc0102,0);
    return 0;
  }
  pEVar1 = e + 0x9c;
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
    if (bVar3) {
      *(int *)pEVar1 = *(int *)pEVar1 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  return 1;
}

