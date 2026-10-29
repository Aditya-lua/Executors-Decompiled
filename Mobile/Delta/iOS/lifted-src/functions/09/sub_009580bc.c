/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9580bc..0x958124 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9580bc_0 {
    int field_0;
    char padding_4[4];
    long long field_8;
} st_9580bc_0;


long long sub_9580bc(st_9580bc_0 **a0, st_9580bc_0 *a1)
{
    st_9580bc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(*a0, "ssl/ssl_asn1.c", 231);
    *a0 = 0;
    if (!a1)
        return 1;
    v2 = sub_a6da14(a1->field_8, a1->field_0, "ssl/ssl_asn1.c", 235);
    *a0 = v2;
    return v2 != 0;
}
