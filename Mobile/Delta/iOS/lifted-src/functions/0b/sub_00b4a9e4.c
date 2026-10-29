/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a9e4..0xb4ab10 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a9e4_0 {
    char padding_0[8];
    long long field_8;
} st_b4a9e4_0;


long long sub_b4a9e4(st_b4a9e4_0 *a0, long long a1, unsigned long a2, long long a3, unsigned long a4, long long a5, long long a6)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x0
    long long v5;  // x0
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a0->field_8 == 1)
    {
        v2 = sub_aa96d4(a3, 1);
        if (v2)
        {
            v3 = v2;
            v4 = sub_b4b494();
            if (v4)
            {
                if (sub_aa9ce4(v3, a5, a6))
                {
                    v5 = sub_954340(v3);
                    _memcpy(a1, v5, sub_c4c40(v3));
                }
                else
                {
                    sub_aa97ac(v3);
                    return 0;
                }
            }
            sub_aa97ac(v3);
            return v4 != 0;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 107, "seed_src_generate");
        v7 = 524324;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 101, "seed_src_generate");
        if ((int)a0->field_8 == 2)
            v7 = 192;
        else
            v7 = 193;
    }
    sub_a36abc(57, v7, 0);
    return 0;
}
