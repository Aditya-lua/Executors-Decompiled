/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44380..0xb4441c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44380_0 {
    char padding_0[8];
    long long field_8;
} st_b44380_0;


unsigned long long sub_b44380(st_b44380_0 *a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "size");
    if (v2)
    {
        v3 = sub_a70efc(v2, sub_a64404(a0->field_8));
        if (!(unsigned int)v3)
            return v3;
    }
    v4 = sub_a6fbc4(a1, "block-size");
    if (v4)
    {
        if (sub_954340(a0 + 1))
            sub_a50a7c();
        v5 = sub_a6fe3c(v4);
        if (!(unsigned int)v5)
            return v5;
    }
    return 1;
}
