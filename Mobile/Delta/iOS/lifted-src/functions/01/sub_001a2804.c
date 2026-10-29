/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2804..0x1a2858 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2804_0 {
    unsigned long long field_0;
    struct st_1a2804_0 *field_8;
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[31];
    struct st_1a2804_0 *field_38;
} st_1a2804_0;

extern char g_e6fd38;

int sub_1a2804(st_1a2804_0 *a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_1a2804_0 *v8;  // x0
    st_1a2804_0 *v9;  // x8
    st_1a2804_0 *v10;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!(a0->field_18 >> 1 & 1))
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = operatornew(24);
        v9 = a0->field_38;
        v10 = v9->field_8;
        v8->field_0 = &g_e6fd38;
        v8->field_8 = v10;
        v8->field_10 = a1;
        v9->field_8 = v8;
        a0->field_38 = v8;
        a0 = v8;
    }
    return (unsigned int)a0;
}
