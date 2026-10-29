/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc408..0x1bc4cc (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc408_2 {
    char padding_0[160];
    unsigned int field_a0;
} st_1bc408_2;

typedef struct st_1bc408_1 {
    char padding_0[24];
    unsigned int field_18;
} st_1bc408_1;

typedef struct st_1bc408_0 {
    char field_0;
} st_1bc408_0;


long long sub_1bc408(st_1bc408_1 *a0, long long a1, long long a2, st_1bc408_2 *a3)
{
    long long v7;  // x0
    unsigned long long v8;  // x0
    st_1bc408_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1bc408_0 *v1;  // [bp-0x50]
    unsigned short v2;  // [bp-0x44]
    char v3;  // [bp-0x42]
    char v4;  // [bp-0x41]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v2 = 23866;
    v3 = 0;
    v7 = sub_1a5708(a1, a2, &v2, &v3, &v4, &v3, &v3);
    if (v7 != a2)
    {
        v8 = sub_1bc7bc(a0, a1, v7, a0->field_18 & 1, 0);
        if ((unsigned int)v8)
        {
            a3->field_a0 = a3->field_a0 | (unsigned int)v8;
            return v7 + 2;
        }
    }
    else
    {
        v8 = sub_1a8238();
    }
    sub_1a4aa0(v8);
}
