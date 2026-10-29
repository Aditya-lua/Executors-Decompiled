/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae171c..0xae1a0c (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae171c_2 {
    char padding_0[8];
    void* field_8;
} st_ae171c_2;

typedef struct st_ae171c_1 {
    unsigned int field_0;
    char padding_4[4];
    void* field_8;
} st_ae171c_1;

typedef struct st_ae171c_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned long long field_10;
} st_ae171c_0;

extern char g_10002b0;

unsigned long long sub_ae171c(st_ae171c_1 *a0, st_ae171c_2 *a1, unsigned long long a2)
{
    void* v5;  // x20
    unsigned long v6;  // x2
    unsigned long v15;  // x2
    st_ae171c_0 *v16;  // w8
    unsigned long long v17;  // x21
    st_ae171c_0 *v18;  // x21
    unsigned long v19;  // x2
    unsigned int v20;  // w8
    unsigned long long v7;  // x0
    st_ae171c_2 *v8;  // x21
    st_ae171c_0 *v9;  // w8
    unsigned long long v10;  // x20
    st_ae171c_0 *v11;  // x20
    unsigned long v12;  // x2
    unsigned int v13;  // w8
    void* v14;  // x21
    char v0;  // [bp-0x58]
    char v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a0->field_0 != 1)
    {
        if (a0->field_0)
            goto LABEL_ae1900;
        v5 = a0->field_8;
        v6 = *(int *)v5;
        v7 = 0xffffffff;
        if (v6 >> 31 & 1)
        {
            if (*(long long *)&g_10002b0 == v2)
                return 0xffffffff;
            ___stack_chk_fail();
        }
        if (a2 >= (int)v6)
        {
            v8 = a1;
            if ((unsigned int)v6)
            {
                ___memcpy_chk(&v1, (long long)v5[8]);
                v9 = (st_ae171c_0 *)*(int *)v5;
                if ((long long)v5[16] & 7)
                {
                    *(char *)(&v1 + v9 - 1) = *(char *)(&v1 + v9 - 1) & (char)(-0x100 >> ((char)(8 - ((long long)v5[16] & 7)) & 31));
                    v9 = (st_ae171c_0 *)*(int *)v5;
                }
            }
            else
            {
                v9 = (st_ae171c_0 *)0;
            }
            _bzero(&v1 + v9, a2 - (char *)v9);
            v10 = *(int *)v5 * 8 - ((int)v5[16] & 7);
            goto LABEL_ae1884;
        }
    }
    else
    {
        v11 = *(long long *)a0->field_8;
        v12 = v11->field_0;
        v7 = 0xffffffff;
        if (!(v12 >> 31 & 1) && a2 >= (int)v12)
        {
            v8 = a1;
            if ((unsigned int)v12)
            {
                ___memcpy_chk(&v1, v11->field_8);
                v13 = v11->field_0;
                if (v11->field_10 & 7)
                {
                    *(&(&v1)[v13] - 1) = *(&(&v1)[v13] - 1) & (char)(-0x100 >> ((char)(8 - (v11->field_10 & 7)) & 31));
                    v13 = v11->field_0;
                }
            }
            else
            {
                v13 = 0;
            }
            _bzero(&(&v1)[v13], a2 - v13);
            v10 = a2 * 8;
LABEL_ae1884:
            if (*(int *)&v8->padding_0[0] == 1)
            {
                v18 = *(long long *)v8->field_8;
                v19 = v18->field_0;
                v7 = 0xffffffff;
                if (!(v19 >> 31 & 1) && a2 >= (int)v19)
                {
                    if ((unsigned int)v19)
                    {
                        ___memcpy_chk(&v0, v18->field_8);
                        v20 = v18->field_0;
                        if (v18->field_10 & 7)
                        {
                            *(&(&v0)[v20] - 1) = *(&(&v0)[v20] - 1) & (char)(-0x100 >> ((char)(8 - (v18->field_10 & 7)) & 31));
                            v20 = v18->field_0;
                        }
                    }
                    else
                    {
                        v20 = 0;
                    }
                    _bzero(&(&v0)[v20], a2 - v20);
                    v17 = a2 * 8;
LABEL_ae19ec:
                    v7 = _memcmp(&v1, &v0, a2);
                    if (!(unsigned int)v7)
                        v7 = v10 - v17;
                }
            }
            else if (!*(int *)&v8->padding_0[0])
            {
                v14 = v8->field_8;
                v15 = *(int *)v14;
                v7 = 0xffffffff;
                if (v15 >> 31 & 1)
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return 0xffffffff;
                    ___stack_chk_fail();
                }
                if (a2 >= (int)v15)
                {
                    if ((unsigned int)v15)
                    {
                        ___memcpy_chk(&v0, (long long)v14[8]);
                        v16 = (st_ae171c_0 *)*(int *)v14;
                        if ((long long)v14[16] & 7)
                        {
                            *(char *)(&v0 + v16 - 1) = *(char *)(&v0 + v16 - 1) & (char)(-0x100 >> ((char)(8 - ((long long)v14[16] & 7)) & 31));
                            v16 = (st_ae171c_0 *)*(int *)v14;
                        }
                    }
                    else
                    {
                        v16 = (st_ae171c_0 *)0;
                    }
                    _bzero(&v0 + v16, a2 - (char *)v16);
                    v17 = *(int *)v14 * 8 - ((int)v14[16] & 7);
                    goto LABEL_ae19ec;
                }
            }
            else
            {
LABEL_ae1900:
                v7 = 0xffffffff;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v7;
    ___stack_chk_fail();
}
