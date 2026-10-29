/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45718..0xb457cc (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45718_0 {
    char padding_0[8];
    char field_8;
    char padding_9[127];
    long long field_88;
    long long field_8c;
} st_b45718_0;


unsigned long long sub_b45718(st_b45718_0 *a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "size");
    if (v2)
    {
        v3 = sub_a70efc(v2, sub_a1abe8(&a0->field_8));
        if (!(unsigned int)v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "c-rounds"))
    {
        v4 = sub_a70210();
        if (!(unsigned int)v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "d-rounds"))
    {
        v5 = sub_a70210();
        if (!(unsigned int)v5)
            return v5;
    }
    return 1;
}
