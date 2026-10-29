/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf12a0..0xaf1390 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af12a0_0 {
    unsigned short field_0;
    char padding_2[14];
    unsigned int field_10;
    unsigned int field_14;
} st_af12a0_0;


unsigned long long sub_af12a0(char *a0, unsigned long long a1, st_af12a0_0 *a2)
{
    unsigned int v2;  // w8
    unsigned int *v3;  // x21
    unsigned long long v13;  // 4118
    unsigned long long v4;  // w20
    char *v5;  // x19
    unsigned long v6;  // x22
    unsigned long long v7;  // x0
    unsigned long long v9;  // x24
    unsigned long long v10;  // w20
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_10;
    v3 = &a2->field_10;
    if (v2 == 16)
        return 0;
    v4 = a1;
    if (a1)
    {
        v5 = a0;
        v6 = v2;
        if (v4 < 5)
        {
            v9 = 0;
            while (1)
            {
                v10 = v4;
                v11 = sub_a6dd0c(*v5);
                if (v11 >> 31 & 1)
                    break;
                v5 += 1;
                v9 = (char)v11 | (unsigned int)v9 * 16;
                v4 = v10 - 1;
                if (v10 == 1)
                {
                    *(unsigned short *)((char *)a2 + v6) = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                    *v3 = *v3 + 2;
                    return 1;
                }
            }
        }
        else if (12 >= (int)v2 && !v5[v4])
        {
            v7 = sub_af06a4((char *)a2 + v6, v5);
            if (!(unsigned int)v7)
                return v7;
            *v3 = *v3 + 4;
            return 1;
        }
    }
    else
    {
        v13 = arm64g_calculate_condition(1, a2->field_14, 1, 0);
        if (v13 & 1)
        {
            a2->field_14 = v2;
            *(int *)&a2[1].field_0 = *(int *)&a2[1].field_0 + 1;
            return 1;
        }
        else if (a2->field_14 == v2)
        {
            *(int *)&a2[1].field_0 = *(int *)&a2[1].field_0 + 1;
            return 1;
        }
    }
    return 0;
}
