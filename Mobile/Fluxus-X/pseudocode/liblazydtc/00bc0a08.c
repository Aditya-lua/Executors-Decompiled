/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc0a08
 */

char * ERR_getErrorString(undefined4 param_1)

{
  char *pcVar1;
  
  pcVar1 = "No error detected";
  switch(param_1) {
  case 0:
    goto switchD_00bc0a30_caseD_0;
  case 1:
    return "Error (generic)";
  default:
    pcVar1 = "Unspecified error code";
switchD_00bc0a30_caseD_0:
    return pcVar1;
  case 10:
    return "Unknown frame descriptor";
  case 0xc:
    return "Version not supported";
  case 0xe:
    return "Unsupported frame parameter";
  case 0x10:
    return "Frame requires too much memory for decoding";
  case 0x14:
    return "Data corruption detected";
  case 0x16:
    return "Restored data doesn\'t match checksum";
  case 0x18:
    return "Header of Literals\' block doesn\'t respect format specification";
  case 0x1e:
    return "Dictionary is corrupted";
  case 0x20:
    return "Dictionary mismatch";
  case 0x22:
    return "Cannot create Dictionary from provided samples";
  case 0x28:
    return "Unsupported parameter";
  case 0x29:
    return "Unsupported combination of parameters";
  case 0x2a:
    return "Parameter is out of bound";
  case 0x2c:
    return "tableLog requires too much memory : unsupported";
  case 0x2e:
    return "Unsupported max Symbol Value : too large";
  case 0x30:
    return "Specified maxSymbolValue is too small";
  case 0x31:
    return "This mode cannot generate an uncompressed block";
  case 0x32:
    return "pledged buffer stability condition is not respected";
  case 0x3c:
    return "Operation not authorized at current processing stage";
  case 0x3e:
    return "Context should be init first";
  case 0x40:
    return "Allocation error : not enough memory";
  case 0x42:
    return "workSpace buffer is not large enough";
  case 0x46:
    return "Destination buffer is too small";
  case 0x48:
    return "Src size is incorrect";
  case 0x4a:
    return "Operation on NULL destination buffer";
  case 0x50:
    return "Operation made no progress over multiple calls, due to output buffer being full";
  case 0x52:
    return "Operation made no progress over multiple calls, due to input being empty";
  case 100:
    return "Frame index is too large";
  case 0x66:
    return "An I/O error occurred when reading/seeking";
  case 0x68:
    return "Destination buffer is wrong";
  case 0x69:
    return "Source buffer is wrong";
  case 0x6a:
    return "Block-level external sequence producer returned an error code";
  case 0x6b:
    return "External sequences are not valid";
  }
}

