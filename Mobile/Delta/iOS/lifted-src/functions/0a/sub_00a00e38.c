/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00e38..0xa00f60 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00e38_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a00e38_0;


st_a00e38_0 * sub_a00e38(long long a0, unsigned long a1, st_a00e38_0 *a2, long long a3)
{
    st_a00e38_0 *v5;  // x0
    st_a00e38_0 *v6;  // x19
    long long v0;  // [bp-0x48]
    long long v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a2)
        return (int)sub_9d4888(a0, "\n") > 0;
    v2 = a2->field_8;
    v5 = sub_a03544(0, &v2, a2->field_0);
    if (v5)
    {
        sub_9d0460();
        if (sub_9d3fec(a0, "\n", 1) == 1 && sub_9cab08(a0, "r:   ", v1, 0, a3))
            v6 = sub_9cab08(a0, "s:   ", v0, 0, a3) != 0;
        else
            v6 = 0;
        sub_a034fc(v5);
        return v6;
    }
    else if ((int)sub_9d4888(a0, "\n") >= 1)
    {
        return sub_adef10(a0, a2, a3);
    }
    else
    {
        return 0;
    }
}
