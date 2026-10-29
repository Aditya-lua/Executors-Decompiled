/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5cec..0x1c5f38 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c5cec_1 {
    unsigned long long *field_0;
    unsigned long long *field_8;
    unsigned long long *field_10;
    unsigned long long *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_1c5cec_1;

typedef struct st_1c5cec_0 {
    char field_0;
} st_1c5cec_0;


unsigned long long sub_1c5cec(st_1c5cec_1 *a0)
{
    unsigned long long v14;  // x0
    unsigned long long *v15;  // x9
    st_1c5cec_1 *v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long *i;  // x20
    unsigned long long *v19;  // x8
    unsigned long long *v20;  // x9
    unsigned long long *v21;  // x9
    unsigned long long v22;  // x8
    st_1c5cec_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1c5cec_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x60]
    st_1c5cec_1 *v4;  // [bp-0x58]
    long long v5;  // [bp-0x50]
    unsigned long long *v6;  // [bp-0x48], Other Possible Types: unsigned long
    unsigned long long *v7;  // [bp-0x40]
    unsigned long long *v8;  // [bp-0x40]
    unsigned long long *v9;  // [bp-0x38]
    unsigned long long *v10;  // [bp-0x38]
    unsigned long long *v11;  // [bp-0x30]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v1 = &v0;
    v0 = &v1;
    v14 = sub_1ad9f8();
    if (v14 - (a0->field_20 + a0->field_28) >= 42)
    {
        a0->field_20 = a0->field_20 + 42;
        v6 = *(long long *)((char *)a0->field_10 - 8);
        sub_10780(a0, (char *)a0->field_10 - 8);
        return sub_1b20f0(a0, &v6);
    }
    v15 = a0->field_0;
    if (a0->field_18 - v15 > a0->field_10 - a0->field_8)
    {
        v16 = a0;
        if (a0->field_8 != v15)
        {
            v6 = sub_149b1c(v16, 42);
            v17 = sub_1ae448(a0, &v6);
            if (a0->field_10 - a0->field_8 != 8)
            {
                a0->field_20 = a0->field_20 + 42;
                return v17;
            }
        }
        else
        {
            v6 = sub_149b1c(v16, 42);
            sub_1a576c(a0, &v6);
            v6 = *(long long *)((char *)a0->field_10 - 8);
            sub_10780(a0, (char *)a0->field_10 - 8);
            v17 = sub_1b20f0(a0, &v6);
            if (a0->field_10 - a0->field_8 != 8)
            {
                a0->field_20 = a0->field_20 + 42;
                return v17;
            }
        }
        a0->field_20 = 21;
        return v17;
    }
    else
    {
        sub_ec54();
        v3 = sub_149b1c(a0, 42);
        v4 = a0;
        v5 = 42;
        v2 = v3;
        sub_1c0ae8(&v6, &v2);
        v3 = 0;
        i = a0->field_8;
        v19 = a0->field_10;
        if (i != a0->field_10)
        {
            do
            {
                sub_1b0d54(&v6, i);
                i += 1;
                v19 = a0->field_10;
            } while (i != a0->field_10);
            i = a0->field_8;
        }
        v20 = a0->field_0;
        a0->field_0 = v6;
        a0->field_8 = v7;
        v6 = v20;
        v8 = i;
        v21 = a0->field_18;
        *(uint128_t *)&a0->field_10 = (uint128_t)v9;
        v10 = v19;
        v11 = v21;
        if ((unsigned long long)v9 - (char *)v7 == 8)
            v22 = 21;
        else
            v22 = a0->field_20 + 42;
        a0->field_20 = v22;
        sub_2217c(&v3, 0);
        return sub_1089c(&v6);
    }
}
