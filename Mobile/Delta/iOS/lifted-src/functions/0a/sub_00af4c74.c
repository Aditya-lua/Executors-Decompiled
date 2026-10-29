/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4c74..0xaf4d88 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4c74_0 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_af4c74_1 *field_8;
} st_af4c74_0;

typedef struct st_af4c74_1 {
    char field_0;
} st_af4c74_1;


unsigned long long sub_af4c74(st_af4c74_0 *a0, unsigned int a1)
{
    unsigned int v4;  // x21
    unsigned long long v5;  // x0
    unsigned long v6;  // x8
    unsigned int v7;  // x20
    unsigned int v8;  // x19
    char v0;  // [bp-0x3c], Other Possible Types: unsigned int
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_4 != 24)
    {
        if (a0->field_4 == 23 && a0->field_0 == 13)
            goto LABEL_af4cbc;
    }
    else
    {
        if (a0->field_0 == 15)
        {
LABEL_af4cbc:
            v4 = 0;
            do
            {
                v5 = sub_a69974(*(char *)&a0->field_8[v4]);
                if (!(unsigned int)v5)
                    return v5;
            } while ((v4 += 1, v6 = a0->field_0 - 1, v4 < (long long)v6));
            if (*(char *)&a0->field_8[v6] == 90)
            {
                if (a1)
                    v1 = *(long long *)a1;
                else
                    _time(&v1);
                v7 = sub_9c4f78(0);
                if (v7 && sub_9c5048(&v1, &v0, a0, v7))
                {
                    if (0 <= (int)((unsigned int)v1 | v0))
                        v8 = 0xffffffff;
                    else
                        v8 = 0;
                }
                else
                {
                    v8 = 0;
                }
                sub_9c47fc(v7);
                return v8;
            }
        }
    }
    return 0;
}
