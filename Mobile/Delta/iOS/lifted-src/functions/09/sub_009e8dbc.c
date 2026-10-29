/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e8dbc..0x9e8ecc (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e8dbc_0 {
    struct st_9e8dbc_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_9e8dbc_0;

typedef struct st_9e8dbc_1 {
    unsigned long long field_0;
} st_9e8dbc_1;


int sub_9e8dbc(long long a0, st_9e8dbc_0 *a1)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // w23
    unsigned long v4;  // x21
    unsigned long idx;  // x21
    unsigned long long v6;  // x25
    unsigned long long v7;  // x8
    unsigned long long v8;  // 4109
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((!(int)a1->field_10 || sub_9d3fec(a0, "-", 1) == 1) && (!sub_9e4828(a1) || sub_9d3fec(a0, "0", 1) == 1))
    {
        v2 = a1->field_8;
        if ((int)v2 < 1)
            return 1;
        v3 = 0;
        while (1)
        {
            v4 = v2;
            idx = v4 - 1;
            v6 = 60;
            do
            {
                v7 = (unsigned long long)(*(long long *)&a1->field_0[idx]) >> ((char)v6 & 63) & 15;
                if (v3 || v7)
                {
                    v3 = 1;
                    if (sub_9d3fec(a0, v7 + 13836744, 1) == 1)
                        continue;
                }
                else
                {
                    v3 = 0;
                }
            } while ((v6 -= 4, v8 = arm64g_calculate_condition(2, v6, 4, 0), !(v8 & 1)));
            v2 = idx;
            if ((long long)v4 < 2)
                return 1;
        }
    }
    return 0;
}
