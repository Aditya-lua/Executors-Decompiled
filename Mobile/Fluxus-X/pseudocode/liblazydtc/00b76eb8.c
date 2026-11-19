/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b76eb8
 */

undefined8
mbedtls_platform_entropy_poll(undefined8 param_1,void *param_2,size_t param_3,size_t *param_4)

{
  FILE *__stream;
  size_t sVar1;
  
  *param_4 = 0;
  __stream = fopen("/dev/urandom","rb");
  if (__stream != (FILE *)0x0) {
    setbuf(__stream,(char *)0x0);
    sVar1 = fread(param_2,1,param_3,__stream);
    fclose(__stream);
    if (sVar1 == param_3) {
      *param_4 = param_3;
      return 0;
    }
  }
  return 0xffffffc4;
}

