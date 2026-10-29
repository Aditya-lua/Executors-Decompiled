/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3624..0x9c3654 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3624_0 {
    char padding_0[32];
    unsigned int field_20;
} st_9c3624_0;


int sub_9c3624(void)
{
    st_9c3624_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/asn1/a_object.c", 337);
    if (v2)
        v2->field_20 = 1;
    return (unsigned int)v2;
}
