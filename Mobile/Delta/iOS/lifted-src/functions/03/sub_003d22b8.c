/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d22b8..0x3d2500 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d22b8_0 {
    char field_0;
} st_3d22b8_0;

typedef struct st_3d22b8_1 {
    unsigned long long field_0;
} st_3d22b8_1;

extern char g_d0dbe4;
extern st_3d22b8_1 *g_f0b120;
extern char g_10002b0;

unsigned long long sub_3d22b8(long long a0)
{
    unsigned int v10;  // w0
    unsigned int v11;  // w0
    unsigned int v20;  // w23
    unsigned long v21;  // x24
    long long v22;  // w0
    unsigned long v23;  // x26
    unsigned long i;  // x21
    char *v13;  // x23
    unsigned long v14;  // x21
    char v15;  // x0
    unsigned long long v17;  // x0
    unsigned long v18;  // x21
    unsigned long v19;  // x20
    st_3d22b8_0 **v0;  // [bp-0xa38], Other Possible Types: char
    st_3d22b8_0 *v1;  // [bp-0xa30]
    unsigned long v2;  // [bp-0xa28]
    unsigned long v3;  // [bp-0xa20]
    unsigned int v4;  // [bp-0xa19]
    char v5;  // [bp-0xa13]
    char v6;  // [bp-0x84c]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_3d37fc();
    v11 = sub_3d37fc(a0, 5);
    i = sub_3d37fc(a0, 4) + 4;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    if ((int)i >= 1)
    {
        v13 = &g_d0dbe4;
        do
        {
            v14 = i;
            v15 = sub_3d37fc(a0, 3);
            *((char *)&v2 + *v13) = v15;
            i = v14 - 1;
            v13 += 1;
        } while (i);
    }
    v17 = sub_3d66d0(&v6, &v2, 19);
    if ((unsigned int)v17)
    {
        v18 = v10 + 0x101;
        v19 = v11 + 1;
        v20 = (unsigned int)v19 + (unsigned int)v18;
        if ((int)v20 >= 1)
        {
            v21 = 0;
            while (1)
            {
                v22 = (unsigned int)sub_3cecf0(a0, &v6);
                if (19 <= v22)
                    break;
                if (v22 <= 15)
                {
                    (&v5)[(unsigned int)v21] = v22;
                    v21 = (unsigned int)v21 + 1;
                    if ((int)v20 > (int)v21)
                        continue;
LABEL_3d2458:
                    if ((unsigned int)v21 == v20)
                        goto LABEL_3d2460;
                    break;
                }
                else
                {
                    if (v22 != 18)
                    {
                        if (v22 == 0x11)
                        {
                            v23 = sub_3d37fc(a0, 3) + 3;
                            if ((int)v23 > (int)(v20 - v21))
                                break;
                        }
                        else
                        {
                            if (!(unsigned int)v21 || !(v23 = sub_3d37fc(a0, 2) + 3, (int)(v20 - v21) >= (int)v23))
                                break;
                        }
                    }
                    else
                    {
                        v23 = sub_3d37fc(a0, 7) + 11;
                        if ((int)v23 > (int)(v20 - v21))
                            break;
                    }
                    _memset(&(&v5)[(int)v21]);
                    v21 += v23;
                    if ((int)v21 >= (int)v20)
                        goto LABEL_3d2458;
                }
            }
        }
        else if (!v20)
        {
LABEL_3d2460:
            v17 = sub_3d66d0(a0 + 60, &v5, v18);
            if ((unsigned int)v17)
            {
                v17 = sub_3d66d0(a0 + 2080, &(&v5)[(int)v18], v19) != 0;
                if (*(long long *)&g_10002b0 == v7)
                    return v17;
                ___stack_chk_fail();
            }
            else
            {
                if (*(long long *)&g_10002b0 == v7)
                    return v17;
                ___stack_chk_fail();
            }
        }
        g_f0b120();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v7)
            return v17;
        ___stack_chk_fail();
    }
}
