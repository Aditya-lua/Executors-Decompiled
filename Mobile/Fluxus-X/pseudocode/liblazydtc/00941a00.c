/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941a00
 */

char * curl_easy_strerror(uint param_1)

{
  if (param_1 < 0x66) {
    return (&PTR_s_No_error_00c4fca0)[(int)param_1];
  }
  return "Unknown error";
}

