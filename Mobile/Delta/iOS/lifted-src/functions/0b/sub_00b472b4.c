/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb472b4..0xb47338 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b472b4_0 {
    char padding_0[120];
    long long field_78;
} st_b472b4_0;

typedef struct st_b472b4_1 {
    long long field_0;
    char padding_8[232];
    struct st_b472b4_0 *field_f0;
} st_b472b4_1;


unsigned long long sub_b472b4(st_b472b4_1 *a0)
{
    unsigned long long v2;  // x0
    st_b472b4_0 *v3;  // x20
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = sub_a7c198(a0->field_0);
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = a0->field_f0;
    sub_a66ec0(&v3->padding_0[52], 32);
    sub_a66ec0(&v3->padding_0[84], 16);
    sub_a66ec0(&v3->padding_0[100], 16);
    sub_a66ec0(v3 + 1, 48);
    v3->field_78 = 0;
    v4 = sub_b46508(a0);
    if (!a0->field_0)
        return v4;
    sub_a7c1b4(a0->field_0);
    return v4;
}
