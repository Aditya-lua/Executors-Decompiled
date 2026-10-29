/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xce5d0..0xce8b0 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ce5d0_1 {
    char padding_0[96];
    long long field_60;
    char padding_68[96];
    unsigned long long field_c8;
    char padding_d0[8];
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    unsigned long long field_f0;
    char padding_f8[64];
    unsigned long long field_138;
} st_ce5d0_1;

typedef struct st_ce5d0_0 {
    char field_0;
} st_ce5d0_0;


unsigned long long sub_ce5d0(st_ce5d0_1 *a0, unsigned int *a1, unsigned long a2, unsigned long a3)
{
    unsigned int v9;  // w0
    unsigned int v10;  // w0
    unsigned int v11;  // w0
    unsigned long long v12;  // w24
    unsigned long long v13;  // w9
    unsigned long long v14;  // w8
    unsigned long long v15;  // w0
    unsigned long long v16;  // w23
    unsigned long long v17;  // x24
    unsigned long long v18;  // x0
    st_ce5d0_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_ce5d0_0 *v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    char v3;  // [bp-0x70]
    char v4;  // [bp-0x68]
    char v5;  // [bp-0x60]
    char v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    *a1 = 0;
    *(unsigned long long *)a2 = 0;
    *(unsigned int *)a3 = 0;
    if (sub_cd068())
        return 0xffffffff;
    v9 = sub_ce304(a0, a0->field_60, &v6);
    v10 = sub_ce450(a0, a0->field_60, &v5);
    v11 = sub_ce450(a0, a0->field_60, &v4);
    if (sub_ce450(a0, a0->field_60, &v5))
    {
        v12 = 0xffffffff;
    }
    else
    {
        if (v6 == 67324752)
            v13 = 0;
        else
            v13 = 0xffffff99;
        v14 = v11 | v10 | v9;
        if (!v14)
            v12 = v13;
        else
            v12 = 0xffffffff;
        if (!v14 && v6 == 67324752)
        {
            if (v5 == a0->field_c8 && 12 >= v5 && 1 << (v5 & 63) & 4353)
                v12 = 0;
            else
                v12 = 0xffffff99;
        }
    }
    v15 = (unsigned int)sub_ce304(a0, a0->field_60, &v5);
    if (sub_ce304(a0, a0->field_60, &v5))
    {
        v16 = 0xffffffff;
    }
    else
    {
        if (!v15)
            v16 = v12;
        else
            v16 = 0xffffffff;
        if (!v16)
        {
            if (v5 == a0->field_d8)
            {
                v16 = 0;
            }
            else if (!(v4 & 8))
            {
                v16 = 0xffffff99;
            }
            else
            {
                v16 = 0;
            }
        }
    }
    if (sub_ce304(a0, a0->field_60, &v5))
    {
        v16 = 0xffffffff;
    }
    else if (v5 != 0xffffffff && !v16)
    {
        if (v5 == a0->field_e0)
        {
            v16 = 0;
        }
        else
        {
            if (!(v4 & 8))
                v16 = 0xffffff99;
            else
                v16 = 0;
        }
    }
    if (sub_ce304(a0, a0->field_60, &v5))
    {
        v16 = 0xffffffff;
    }
    else if (v5 != 0xffffffff && !v16)
    {
        if (v5 == a0->field_e8)
        {
            v16 = 0;
        }
        else
        {
            if (!(v4 & 8))
                v16 = 0xffffff99;
            else
                v16 = 0;
        }
    }
    if (sub_ce450(a0, a0->field_60, &v3))
    {
        v16 = 0xffffffff;
        v17 = v3;
    }
    else
    {
        v17 = v3;
        if (!v16)
        {
            if (v17 == a0->field_f0)
                v16 = 0;
            else
                v16 = 0xffffff99;
        }
    }
    *a1 = *a1 + (unsigned int)v17;
    if (!sub_ce450(a0, a0->field_60, &v2))
        v18 = v16;
    else
        v18 = 0xffffffff;
    *(unsigned long long *)a2 = v17 + a0->field_138 + 30;
    *(unsigned int *)a3 = v2;
    *a1 = *a1 + v2;
    return v18;
}
