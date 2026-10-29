/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3cac..0x9c3fc4 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3cac_0 {
    unsigned int field_0;
    unsigned int field_4;
    long long field_8;
} st_9c3cac_0;

extern char g_d2c110;

unsigned long long sub_9c3cac(unsigned long long *a0, unsigned long long a1, unsigned long long a2, st_9c3cac_0 *a3)
{
    unsigned long v3;  // x23
    unsigned int v5;  // w8
    unsigned int v6;  // w9
    unsigned long v7;  // x23
    unsigned long long v8;  // x8
    unsigned int v9;  // w9
    unsigned long long v10;  // w8
    unsigned long long v11;  // x0
    unsigned long long v0;  // [bp-0x71]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a3->field_4;
    if (a2 >> 6 & 1)
    {
        _strlen(sub_9c876c(v3));
        a0();
    }
    else if (!(a2 >> 7 & 1))
    {
        if (!(a2 >> 5 & 1))
        {
            if (29 >= (unsigned int)v3 - 1 && !(0x2a23efff >> ((char)v3 & 63) & 1))
            {
                v5 = (&g_d2c110)[v3 & 0xffffffff];
                if ((unsigned int)v3 != 12)
                    v6 = v5 | 8;
                else
                    v6 = 1;
                goto LABEL_9c3d7c;
            }
            else if (a2 >> 8 & 1)
            {
                a0();
            }
        }
        v6 = 9;
        v5 = 1;
LABEL_9c3d7c:
        if (!(a2 & 16))
            v7 = v5;
        else
            v7 = v6;
        v8 = sub_9c4058();
        if (v8 >> 31 & 1)
        {
            return 0xffffffff;
        }
        else if (0x7ffffffd >= (int)v8)
        {
            v9 = v8;
            v10 = (unsigned int)v0;
            if (!v10)
                v11 = v9;
            else
                v11 = v9 + 2;
            if (!a1)
            {
                return v11;
            }
            else if (v10)
            {
                a0();
            }
            else if (sub_9c4058(a3->field_8, a3->field_0, v7, (unsigned int)a2 & 1039, 0, a0, a1) >> 31 & 1)
            {
                return 0xffffffff;
            }
            else if (v0)
            {
                a0();
            }
            else
            {
                return v11;
            }
        }
        else
        {
            return 0xffffffff;
        }
    }
    else
    {
        a0();
    }
}
