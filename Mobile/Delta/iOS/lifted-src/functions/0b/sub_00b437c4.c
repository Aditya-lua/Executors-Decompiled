/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb437c4..0xb43888 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b437c4_0 {
    char padding_0[8];
    long long field_8;
} st_b437c4_0;


unsigned long long sub_b437c4(st_b437c4_0 *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "size");
    if (v2)
    {
        v3 = sub_954340(a0->field_8);
        if (sub_a2d030(v3))
            sub_a50638(v3);
        v4 = sub_a70efc(v2);
        if (!(unsigned int)v4)
            return v4;
    }
    v5 = sub_a6fbc4(a1, "block-size");
    if (v5)
    {
        v6 = sub_954340(a0->field_8);
        if (sub_a2d030(v6))
            sub_a50638(v6);
        v7 = sub_a70efc(v5);
        if (!(unsigned int)v7)
            return v7;
    }
    return 1;
}
