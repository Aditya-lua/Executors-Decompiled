/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7910..0x9c7940 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7910_0 {
    char padding_0[4];
    unsigned int field_4;
} st_9c7910_0;


int sub_9c7910(void)
{
    st_9c7910_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "crypto/asn1/asn1_lib.c", 355);
    if (v2)
        v2->field_4 = 4;
    return (unsigned int)v2;
}
