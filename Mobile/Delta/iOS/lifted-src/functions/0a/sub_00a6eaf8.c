/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6eaf8..0xa6eb5c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6eaf8_1 {
    char padding_0[40];
    struct st_a6eaf8_0 *field_28;
} st_a6eaf8_1;

typedef struct st_a6eaf8_0 {
    struct st_a6eaf8_0 *field_0;
} st_a6eaf8_0;


st_a6eaf8_0 ** sub_a6eaf8(st_a6eaf8_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a6eaf8_0 **v8;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_28)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (*(long long *)a0->field_28)
        return 0;
    v8 = (st_a6eaf8_0 **)(unsigned int)sub_c68a50();
    if (v8)
    {
        sub_a6c2e4(a0->field_28, "crypto/packet.c", 360);
        a0->field_28 = 0;
        return 1;
    }
    return v8;
}
