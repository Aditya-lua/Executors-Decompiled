/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98ca8
 */

void OPENSSL_config(char *config_name)

{
  undefined8 local_28;
  char *local_20;
  undefined8 local_18;
  
  local_28 = 0;
  local_20 = (char *)0x0;
  local_18 = 0;
  if (config_name != (char *)0x0) {
    local_20 = strdup(config_name);
  }
  local_18 = 0x32;
  OPENSSL_init_crypto(0x40,&local_28);
  return;
}

