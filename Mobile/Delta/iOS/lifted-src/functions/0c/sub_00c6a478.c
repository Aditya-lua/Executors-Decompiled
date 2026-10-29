/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a478..0xc6a744 (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6a478_1 {
    char padding_0[152];
    char field_98;
} st_c6a478_1;

typedef struct st_c6a478_0 {
    char padding_0[24];
    long long field_18;
} st_c6a478_0;


unsigned long long sub_c6a478(void* a0, st_c6a478_1 *a1)
{
    unsigned int v11;  // w0
    char *v12;  // x21
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned long long v23;  // x0
    unsigned long long v24;  // x0
    unsigned long long v25;  // x21
    unsigned long long v26;  // w0
    unsigned long long v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v30;  // x0
    unsigned long v13;  // x1
    unsigned long long v14;  // x0
    unsigned long v15;  // x8
    unsigned long long v16;  // x0
    unsigned long long v17;  // w0
    unsigned int v18;  // w0
    long long v19;  // x0
    unsigned long long v20;  // w22
    char v0;  // [bp-0x158]
    unsigned long v1;  // [bp-0x140]
    st_c6a478_0 *v2;  // [bp-0x138], Other Possible Types: long long, unsigned long long
    unsigned long v3;  // [bp-0x120]
    unsigned long long v4;  // [bp-0xd0]
    long long v5;  // [bp-0xc0], Other Possible Types: unsigned long long
    long long v6;  // [bp-0xb8], Other Possible Types: unsigned long long
    char v7;  // [bp-0x78]
    unsigned long long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = sub_ad69e4((long long)a0[152]);
    v12 = (long long)a0[192];
    if (!(long long)a0[192])
    {
        v13 = v11 - 1;
        if ((int)v13 > (int)a0[172])
        {
            v12 = sub_ad69f8((long long)a0[152], (int)a0[172] + 1);
            if (!v12)
                return 1;
        }
        else
        {
            v30 = sub_ad69f8((long long)a0[152], v13);
            if (!v30)
                return v30;
            (long long)a0[72]();
        }
    }
    if (!*(long long *)&a1[1].padding_0[15])
    {
        if (v12[232] >> 1 & 1 && !(v12[236] >> 1 & 1))
        {
            v14 = sub_af8298();
            if (!(unsigned int)v14)
                return v14;
        }
        v15 = (int)a0[208];
        if (!(v15 >> 7 & 1))
        {
            v16 = sub_af8298();
            if (!(unsigned int)v16)
                return v16;
            v15 = (int)a0[208];
        }
        if (!(v15 >> 3 & 1))
        {
            _bzero(&v0, 280);
            if ((long long)a0[216] || !sub_af5208(&v0, *(long long *)a0, (long long)a0[192], (long long)a0[16]))
            {
LABEL_c6a5a8:
                v21 = sub_af8298();
                if (!(unsigned int)v21)
                    return v21;
            }
            else
            {
                v1 = (long long)a0[24];
                sub_af82fc(v2);
                v2 = (long long)a0[32];
                v3 = (long long)a0[56];
                if (v8)
                    v17 = (unsigned int)sub_af41f8(&v0);
                else
                    v17 = (unsigned int)sub_af44e8(&v0);
                if (v17 >= 1)
                {
                    v18 = sub_ad69e4((long long)a0[152]);
                    v19 = sub_ad69f8((long long)a0[152], v18 - 1);
                    v20 = sub_af1a9c(v19, sub_ad69f8(v5, sub_ad69e4(v5) - 1)) != 0;
                }
                else
                {
                    v20 = 1;
                }
                if (v4)
                    v4();
                if (v2)
                {
                    if (!a0)
                        sub_af82fc();
                    v2 = 0;
                }
                sub_ade218(v6);
                v6 = 0;
                sub_aded90(v5);
                v5 = 0;
                sub_a6a9e8(5, &v0, &v7);
                if (v20)
                    goto LABEL_c6a5a8;
            }
        }
        if (a1->field_98 >> 1 & 1)
        {
            v22 = sub_af8298();
            if (!(unsigned int)v22)
                return v22;
        }
    }
    if (!((char)((char)a0[208]) >> 6 & 1))
    {
        v23 = sub_af7af4(a0, a1, 1);
        if (!(unsigned int)v23)
            return v23;
    }
    v24 = sub_af1e94(v12);
    if (!v24)
    {
        *(unsigned int *)&a0[176] = 6;
        return sub_af82ac() != 0;
    }
    v25 = v24;
    v26 = (unsigned int)sub_af2388(a1, v25, *(long long *)((long long)a0[32] + 24));
    if (v26)
    {
        *(unsigned int *)&a0[176] = v26;
        v27 = sub_af82ac(0);
        if (!(unsigned int)v27)
            return v27;
    }
    if (0 < (int)sub_af9a24(a1, v25))
        return 1;
    v28 = sub_af8298();
    if (!(unsigned int)v28)
        return v28;
    return 1;
}
