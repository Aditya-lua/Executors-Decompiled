/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941a70
 */

char * curl_url_strerror(uint param_1)

{
  if (param_1 < 0x20) {
    return (&PTR_s_No_error_00c50070)[(int)param_1];
  }
  return "CURLUcode unknown";
}

