/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a67e4..0x1a6904 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a67e4_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_1a67e4_0;


unsigned long long sub_1a67e4(st_1a67e4_0 *a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v5;  // x0
    long long v6;  // x23
    char v0;  // [bp-0x42]
    char v1;  // [bp-0x41]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3 > ((long long)(a0->field_10 - a0->field_0) >> 3) * 12297829382473034411)
    {
        sub_1b1b2c(a0);
        sub_27204(a0, sub_1e4b0(a0, a3));
        v5 = sub_1a2b98(a0, a1, a2, a0->field_8);
    }
    else
    {
        v6 = a0->field_8 - a0->field_0;
        if (a3 <= (unsigned long long)((v6 >> 3) * 12297829382473034411))
        {
            sub_1bec8c(&v1);
            return sub_c84c(a0);
        }
        sub_1bec8c(&v0);
        v5 = sub_1a2b98(a0, a1 + v6, a2, a0->field_8);
    }
    a0->field_8 = v5;
    return v5;
}
