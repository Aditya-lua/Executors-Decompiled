/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d36ac..0x9d3928 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_9d36ac(unsigned long long *a0, unsigned long long a1, char *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v11;  // w8
    unsigned long long v12;  // x8
    unsigned long long v21;  // x25
    unsigned long long v22;  // x28
    unsigned long long v23;  // x26
    unsigned long long v24;  // x8
    unsigned long long v25;  // 4116
    unsigned long long v26;  // x10
    unsigned long long v27;  // x8
    unsigned long long v28;  // 4116
    unsigned short *v29;  // x8
    unsigned long long v30;  // x8
    unsigned long long v13;  // w8
    char *v31;  // x9
    unsigned long long v32;  // x8
    unsigned long long v33;  // x10
    unsigned int v34;  // w11
    char v35;  // x11
    unsigned long long v36;  // x1
    unsigned long long v37;  // x26
    char v14;  // x8
    unsigned long long v15;  // x9
    unsigned int v16;  // w10
    unsigned long v17;  // x9
    unsigned long long v18;  // x20
    unsigned long long v19;  // x21
    unsigned long long v20;  // x0
    unsigned long v0;  // [bp-0x1e0], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x1d8]
    unsigned long long v2;  // [bp-0x1d0]
    unsigned long v3;  // [bp-0x1c0]
    unsigned long long v4;  // [bp-0x1b0]
    unsigned long long v5;  // [bp-0x1a8]
    unsigned long long v6;  // [bp-0x198]
    char v7;  // [bp-0x191]
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v4 = a1;
    v8 = *(long long *)&g_10002b0;
    if (a4 < 64)
        v11 = a4;
    else
        v11 = 64;
    if (a4 < 0)
        v12 = 0;
    else
        v12 = v11;
    v5 = v12;
    if ((unsigned int)v12 < 6)
        v13 = 0;
    else
        v13 = (unsigned int)v12 - 6;
    v14 = 16 - (v13 + 3 >> 2);
    v15 = v14;
    v16 = a3 / v15;
    if ((int)a3 <= (int)((unsigned int)v15 * v16))
        v17 = v16;
    else
        v17 = v16 + 1;
    v3 = v17;
    if ((int)v17 >= 1)
    {
        v18 = (int)a3;
        v19 = v14;
        v1 = &g_c7c2eb;
        v2 = v19 * 0;
        v0 = v5;
        v20 = sub_9d5b44(&v7, 289, "%*s%04x - ");
        if (!(v20 >> 31 & 1))
        {
            v21 = v20;
            v6 = 0;
            v22 = 0;
            v23 = 7;
            do
            {
                v24 = v21 & 0xffffffff;
                v25 = arm64g_calculate_condition(130, v24 - 290, 5, 0);
                if (!(v25 & 1))
                {
                    if ((long long)v22 < (long long)v18)
                    {
                        v26 = 32;
                        if (!v23)
                            v26 = 45;
                        v0 = a2[v22];
                        v1 = v26;
                        sub_9d5b44();
                    }
                    else
                    {
                        *(unsigned int *)&(&v7)[v24] = 0x202020;
                    }
                    v21 = (unsigned int)v21 + 3;
                }
            } while ((v23 -= 1, v22 += 1, v19 + v23 != 7));
            v27 = v21 & 0xffffffff;
            v28 = arm64g_calculate_condition(130, v27 - 290, 4, 0);
            if (!(v28 & 1))
            {
                v29 = &(&v7)[v27];
                *(char *)&v29[1] = 0;
                *v29 = 0x2020;
                v21 = (unsigned int)v21 + 2;
            }
            if ((long long)v18 > (long long)v2)
            {
                v30 = 1;
                v31 = a2;
                do
                {
                    v32 = v30;
                    v33 = v21 & 0xffffffff;
                    if ((v33 & 0x7ffffffe) != 288)
                    {
                        v34 = *v31;
                        if (v34 - 32 < 95)
                            v35 = v34;
                        else
                            v35 = 46;
                        v21 = v33 + 1;
                        (&v7)[v33] = v35;
                        (&v7)[v21] = 0;
                    }
                } while (v19 > v32 && (v31 += 1, v30 = v32 + 1, (long long)v32 < (long long)v18));
            }
            v36 = v21 & 0xffffffff;
            if ((v36 & 0x7ffffffe) != 288)
                *(unsigned short *)&(&v7)[v36] = 10;
            a0();
        }
        else
        {
            v37 = 0xffffffff;
        }
    }
    else
    {
        v37 = 0;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v37;
    ___stack_chk_fail();
}
