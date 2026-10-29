/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f82d0..0x9f8478 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_9f82d0(long long a0, void* a1, void* a2)
{
    unsigned int v15;  // w8
    unsigned long long v16;  // 4160
    unsigned long long v17;  // x9
    unsigned long v18;  // x0
    unsigned long long v19;  // x8
    unsigned long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long v22;  // x8
    unsigned short v0;  // [bp-0x44], Other Possible Types: char
    char v1;  // [bp-0x43]
    char v2;  // [bp-0x42]
    char v3;  // [bp-0x41]
    char v4;  // [bp-0x40]
    char v5;  // [bp-0x3f]
    char v6;  // [bp-0x3e]
    char v7;  // [bp-0x3d]
    char v8;  // [bp-0x3c]
    char v9;  // [bp-0x3b]
    char v10;  // [bp-0x3a]
    char v11;  // [bp-0x39]
    unsigned long v12;  // [bp-0x38]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v15 = (int)a2[88];
    v16 = arm64g_calculate_condition(1, v15, 1, 0);
    if (!(v16 & 1) && (v15 != 1 || (long long)a1[24]))
    {
        v0 = *(int *)a2;
        v1 = 0;
        v17 = (long long)a2[40];
        v2 = v17 >> 56;
        v3 = v17 >> 48;
        v4 = v17 >> 40;
        v5 = v17 >> 32;
        v6 = v17 >> 24;
        v7 = v17 >> 16;
        v8 = v17 >> 8;
        v9 = v17;
        v10 = v15 >> 8;
        v11 = v15;
        v18 = sub_a3fe10(a0, &v0, 12);
        if (!(unsigned int)v18)
        {
            if (*(long long *)&g_10002b0 == v12)
                return v18;
            ___stack_chk_fail();
        }
        if ((int)a2[88])
        {
            v18 = sub_a3fe10(a0, (long long)a1[24], (long long)a1[32]);
            if (!(unsigned int)v18)
            {
                if (*(long long *)&g_10002b0 == v12)
                    return v18;
                ___stack_chk_fail();
            }
            v19 = 64;
            v20 = (long long)a1[56];
            if ((long long)a1[56])
                goto LABEL_9f83b0;
        }
        else
        {
            v19 = 48;
            v20 = (long long)a1[40];
            if ((long long)a1[40])
            {
LABEL_9f83b0:
                v21 = *(long long *)((char *)a1 + v19);
                v0 = v21 >> 16;
                v1 = v21 >> 8;
                v2 = v21;
                v18 = sub_a3fe10(a0, &v0, 3);
                if ((unsigned int)v18)
                {
                    v18 = sub_a3fe10(a0, v20, v21);
                    if ((unsigned int)v18)
                    {
                        v22 = (short)a2[56];
                        v0 = (((((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        v18 = sub_a3fe10(a0, &v0, 2);
                        if ((unsigned int)v18 && (!(long long)a2[56] || !(v18 = sub_a3fe10(a0, (long long)a2[48]), !(unsigned int)v18)))
                        {
                            if (*(long long *)&g_10002b0 == v12)
                                return 1;
                            ___stack_chk_fail();
                        }
                    }
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v12)
                        return v18;
                    ___stack_chk_fail();
                }
                goto LABEL_9f8448;
            }
        }
    }
    v18 = 0;
LABEL_9f8448:
    if (*(long long *)&g_10002b0 == v12)
        return v18;
    ___stack_chk_fail();
}
