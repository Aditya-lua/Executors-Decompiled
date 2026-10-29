/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb381bc..0xb3823c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b381bc_0 {
    struct st_b381bc_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b381bc_0 *field_10;
} st_b381bc_0;


st_b381bc_0 * sub_b381bc(st_b381bc_0 *a0, st_b381bc_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b381bc_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        if (a1 && a1->field_0)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            v8 = sub_a6fbc4(a1, "operation");
            if (!v8)
                return 1;
            if (v8->field_8 != 4 || !v8->field_10 || sub_a6e200("RSASVE"))
                return 0;
            *(unsigned int *)&a0->field_10 = 0;
            return 1;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
