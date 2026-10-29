/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4cf0..0x9e4d2c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4cf0_0 {
    struct st_9e4cf0_0 *field_0;
    struct st_9e4cf0_0 *field_8;
    int field_c;
    struct st_9e4cf0_0 *field_10;
} st_9e4cf0_0;


st_9e4cf0_0 * sub_9e4cf0(st_9e4cf0_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9e4cf0_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    if (v8)
        v8 = sub_a66ec0(v8, *(int *)((char *)&a0->field_8 + 4) * 8);
    a0->field_c = 0;
    *(unsigned int *)&a0->field_8 = 0;
    return v8;
}
