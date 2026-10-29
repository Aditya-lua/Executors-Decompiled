/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e8734..0x9e8920 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_d311ca;

char * sub_9e8734(long long a0, long long a1, char *a2, char *a3, char *a4)
{
    char *v3;  // x22
    unsigned int v4;  // w0
    char *v13;  // x19
    char *v5;  // x8
    char *i;  // x24
    unsigned short *v7;  // x25
    char *v8;  // x24
    char *v10;  // x0
    unsigned long long v11;  // 4106
    char *v12;  // x23
    char v0;  // [bp-0x54], Other Possible Types: long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2;
    if ((int)sub_9e5528(a0, sub_9e4624()) < 1)
    {
        return 0;
    }
    else if (!sub_9e5c70(a0))
    {
        return sub_9e5bc4();
    }
    else if (sub_9e5bc4(a0, 3))
    {
        return 1;
    }
    else
    {
        if (a3)
        {
            v4 = sub_9e46a8(a0);
            if (513 > (int)v4)
            {
                v5 = 64;
            }
            else if (1025 > v4)
            {
                v5 = 128;
            }
            else if (2049 > v4)
            {
                v5 = 384;
            }
            else
            {
                v5 = 0x800;
                if (v4 <= 0x1000)
                    v5 = 0x400;
            }
            i = v5 - 1;
            v7 = &g_d311ca;
            do
            {
                v8 = i;
                v10 = sub_9eb810(a0, *v7);
                v11 = arm64g_calculate_condition(2, v10, 1, 0);
                if (v11 & 1)
                    return 0xffffffff;
                if (!v10)
                    return sub_9e5bc4();
                i = v8 - 1;
                v7 += 1;
            } while (i);
            if (a4)
            {
                if (*(int *)a4 == 2)
                {
                    (*(long long *)&a4[16])();
                }
                else if (*(int *)a4 != 1)
                {
                    return 0xffffffff;
                }
                else if (*(long long *)&a4[16])
                {
                    (*(long long *)&a4[16])();
                }
            }
        }
        if (v3)
        {
            v12 = 0;
        }
        else
        {
            v3 = sub_9dde10();
            v12 = v3;
            if (!v3)
                goto LABEL_9e890c;
        }
        if (sub_9e897c(a0, a1, v3, a4, 0, &v0))
        {
            v13 = v0 == 3;
        }
        else
        {
LABEL_9e890c:
            v13 = 0xffffffff;
        }
        sub_9dded4(v12);
        return v13;
    }
}
