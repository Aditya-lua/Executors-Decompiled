/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7a84..0x9c7af8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9c7a84(void* a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = (long long)a0[8];
    if (v2 && !((char)((char)a0[16]) >> 4 & 1))
        v2 = sub_a66ec0();
    if (!((unsigned long long)((long long)a0[16]) >> 4 & 1))
        v2 = sub_a6c2e4((long long)a0[8], "crypto/asn1/asn1_lib.c", 367);
    if ((unsigned long long)((long long)a0[16]) >> 7 & 1)
        return v2;
    return sub_a6c2e4();
}
