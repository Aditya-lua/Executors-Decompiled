/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4dcac..0xa4dd70 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4dcac_0 {
    unsigned long long field_0;
    char padding_8[240];
    struct st_a4dcac_0 *field_f8;
} st_a4dcac_0;


st_a4dcac_0 * sub_a4dcac(st_a4dcac_0 **a0, unsigned long a1)
{
    st_a4dcac_0 *v7;  // x8
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = *a0;
    if (!v7)
        return 0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    if (!v7->field_f8)
        return 0;
    v7->field_f8();
}
