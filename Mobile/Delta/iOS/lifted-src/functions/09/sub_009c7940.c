/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7940..0x9c79a0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7940_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
} st_9c7940_0;


st_9c7940_0 * sub_9c7940(st_9c7940_0 *a0)
{
    st_9c7940_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a0;
    if (!(v2->field_10 >> 4 & 1))
    {
        sub_a6c2e4(a0->field_8, "crypto/asn1/asn1_lib.c", 367);
        v2 = a0;
    }
    if (a0->field_10 >> 7 & 1)
        return v2;
    return sub_a6c2e4();
}
