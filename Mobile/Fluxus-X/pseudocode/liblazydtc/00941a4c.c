/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941a4c
 */

char * curl_share_strerror(uint param_1)

{
  if (param_1 < 6) {
    return (&PTR_s_No_error_00c50040)[(int)param_1];
  }
  return "CURLSHcode unknown";
}

