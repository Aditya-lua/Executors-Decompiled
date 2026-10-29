/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a73a0..0x1a74a8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a73a0_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_1a73a0_0;


unsigned long long sub_1a73a0(st_1a73a0_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v5;  // x0
    long long v6;  // x23
    char v0;  // [bp-0x42]
    char v1;  // [bp-0x41]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((unsigned long long)a3 > (long long)(a0->field_10 - a0->field_0) >> 4)
    {
        sub_1acd8c(a0);
        sub_311b0(a0, sub_20b20(a0, a3));
        v5 = sub_1b37f0(a0, a1, a2, a0->field_8);
    }
    else
    {
        v6 = a0->field_8 - a0->field_0;
        if ((unsigned long long)a3 <= (unsigned long long)(v6 >> 4))
        {
            sub_1acbe8(&v1);
            return sub_c84c(a0);
        }
        sub_1acbe8(&v0);
        v5 = sub_1b37f0(a0, a1 + v6, a2, a0->field_8);
    }
    a0->field_8 = v5;
    return v5;
}
