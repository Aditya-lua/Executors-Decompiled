/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972714..0x972880 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_972714(void* a0, unsigned long long a1, char a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x0
    char v7;  // w21
    char *iter;  // x1
    unsigned long long i;  // x20
    unsigned long long v10;  // x10
    unsigned short v0;  // [bp-0x3a]
    char v1;  // [bp-0x39]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v2 = *(long long *)&g_10002b0;
    if (a2)
    {
        v6 = sub_972498(a0);
        if ((unsigned int)v6)
            goto LABEL_972750;
    }
    else
    {
        v6 = sub_972498(a0);
        if ((unsigned int)v6)
        {
            if (v5 <= 0x1fffffffffffff || !((unsigned int)(*(int *)a0) >> 2 & 1))
            {
LABEL_972750:
                if (v5)
                {
                    v7 = 0;
                    goto LABEL_972788;
                }
                v6 = sub_972574(a0, "0");
                if ((char)a0[5])
                    goto LABEL_972804;
LABEL_9727fc:
                if ((long long)a0[72])
                    goto LABEL_972804;
                *(char *)&a0[6] = 2;
                if (*(char *)a0 & 1)
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return sub_9721c8();
                    ___stack_chk_fail();
                }
            }
            else
            {
                sub_9721c8(a0, 0x22);
                v7 = 1;
LABEL_972788:
                iter = &v1;
                *((char *)&v0 + 1) = 0;
                do
                {
                    i = v5;
                    v10 = i / 10;
                    *(iter - 1) = (char)((unsigned int)i - 10 * (unsigned int)v10) | 48;
                    iter -= 1;
                    v5 = v10;
                } while (9 < i);
                v6 = sub_972574(a0);
                if (v7)
                    v6 = sub_9721c8(a0, 0x22);
                if (!(char)a0[5])
                    goto LABEL_9727fc;
LABEL_972804:
                *(char *)&a0[6] = 2;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
