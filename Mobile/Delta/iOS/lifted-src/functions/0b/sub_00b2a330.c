/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a330..0xb2a3c4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a330_1 {
    unsigned long long field_0[2];
    long long field_8;
    unsigned long long field_10;
} st_b2a330_1;

typedef struct st_b2a330_0 {
    unsigned long long field_0[2];
    struct st_b2a330_0 *field_8;
    long long field_10;
} st_b2a330_0;


st_b2a330_0 * sub_b2a330(st_b2a330_1 *a0)
{
    st_b2a330_0 *v2;  // x19
    long long v3;  // x0
    st_b2a330_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(24, "providers/implementations/exchange/kdf_exch.c", 149);
    if (!v2)
        return v2;
    v2->field_0 = a0->field_0;
    v3 = a0->field_0[1];
    v2->field_8 = a0->field_8;
    v4 = sub_a535d8(v3);
    v2->field_0[1] = v4;
    if (v4)
    {
        if (!sub_b3cf38(v2->field_8))
            sub_a53588(v2->field_0[1]);
        else
            return v2;
    }
    sub_a6c2e4(v2, "providers/implementations/exchange/kdf_exch.c");
    return 0;
}
