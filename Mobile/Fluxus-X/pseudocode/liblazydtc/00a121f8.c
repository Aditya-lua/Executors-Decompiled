/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a121f8
 */

void CTLOG_STORE_load_default_file(undefined8 param_1)

{
  char *pcVar1;
  char *pcVar2;
  
  pcVar2 = (char *)ossl_safe_getenv("CTLOG_FILE");
  pcVar1 = "/home/z/my-project/build/stage-arm64/etc/ssl/ct_log_list.cnf";
  if (pcVar2 != (char *)0x0) {
    pcVar1 = pcVar2;
  }
  CTLOG_STORE_load_file(param_1,pcVar1);
  return;
}

