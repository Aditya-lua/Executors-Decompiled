/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5bd20..0xa5bdac (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5bd20_0 {
    unsigned long long field_0;
    char padding_8[160];
    struct st_a5bd20_0 *field_a8;
} st_a5bd20_0;

typedef struct st_a5bd20_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a5bd20_0 *field_8;
    struct st_a5bd20_0 *field_10;
    struct st_a5bd20_0 *field_18;
    struct st_a5bd20_0 *field_20;
    struct st_a5bd20_0 *field_28;
} st_a5bd20_1;


unsigned long long sub_a5bd20(st_a5bd20_1 *a0)
{
    st_a5bd20_0 *v3;  // x0
    unsigned long long v4;  // x0
    st_a5bd20_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_8;
    v0 = 0;
    if (a0->field_8 || a0->field_28 && !(v3 = sub_9c5df4(&v0, a0->field_0), !v3))
    {
        if (a0->field_28)
        {
            a0->field_20 = a0->field_28;
            a0->field_28 = 0;
        }
        if (v3->field_a8)
            v3->field_a8();
        a0->field_20 = 0;
    }
    sub_a32e7c(v0);
    sub_a32e7c(a0->field_10);
    a0->field_10 = 0;
    v4 = sub_a32e7c(a0->field_18);
    a0->field_18 = 0;
    return v4;
}
