/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e980..0xb3eb88 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3e980_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b3e980_2;

typedef struct st_b3e980_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b3e980_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b3e980_0;

typedef struct st_b3e980_1 {
    struct st_b3e980_2 *field_0;
    char padding_8[56];
    struct st_b3e980_0 *field_40;
    char padding_48[8];
    struct st_b3e980_0 *field_50;
    char padding_58[8];
    struct st_b3e980_0 *field_60;
} st_b3e980_1;


st_b3e980_0 * sub_b3e980(st_b3e980_1 *a0, long long a1)
{
    unsigned long long *v2;  // x22
    st_b3e980_0 *v3;  // x0
    long long v12;  // x2
    st_b3e980_0 *v13;  // x0
    st_b3e980_0 *v14;  // x0
    unsigned long long v15;  // x1
    st_b3e980_0 *v16;  // x0
    st_b3e980_0 *v17;  // x0
    st_b3e980_0 *v18;  // x0
    st_b3e980_0 *v4;  // x0
    st_b3e980_0 *v5;  // x0
    st_b3e980_0 *v6;  // x0
    long long v7;  // x1
    st_b3e980_0 *v8;  // x0
    st_b3e980_0 *v9;  // x21
    st_b3e980_0 *v10;  // x0
    st_b3e980_0 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (sub_a6fbc4(a1, "bits"))
    {
        v3 = sub_a6fe3c();
        if (!(unsigned int)v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "security-bits"))
    {
        v4 = sub_a6fe3c();
        if (!(unsigned int)v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "max-size"))
    {
        v5 = sub_a6fe3c();
        if (!(unsigned int)v5)
            return v5;
    }
    if (a0->field_40)
    {
        v6 = sub_a6fbc4(a1, "pub");
        if (!v6)
        {
LABEL_b3ea5c:
            v9 = 0;
            goto LABEL_b3ea60;
        }
        if (v6->field_8 != 5)
            return 0;
        v7 = v2[3];
        v6->field_20 = v7;
        if (!v6->field_10)
            goto LABEL_b3ea5c;
        if (v6->field_18 >= (unsigned long long)v7)
        {
            v8 = sub_a82fdc(v6->field_10);
            if (!(unsigned int)v8)
                return v8;
            v9 = v6->field_10;
LABEL_b3ea60:
            v10 = sub_a6fbc4(a1, "encoded-pub-key");
            if (v10)
            {
                v11 = v10;
                if (v10->field_8 != 5)
                    return 0;
                v12 = v2[3];
                v11->field_20 = v12;
                if (v11->field_10)
                {
                    if (v11->field_18 < (unsigned long long)v12)
                    {
                        return 0;
                    }
                    else if (v9)
                    {
                        _memcpy();
                        goto LABEL_b3eac0;
                    }
                    else
                    {
                        v13 = sub_a82fdc();
                        if (!(unsigned int)v13)
                            return v13;
                    }
                }
            }
        }
    }
    else
    {
LABEL_b3eac0:
        v14 = sub_a6fbc4(a1, "priv");
        if (!v14 || !a0->field_50)
        {
LABEL_b3eb14:
            v17 = sub_a6fbc4(a1, "seed");
            if (!v17)
                return 1;
            if (a0->field_60)
            {
                if (v17->field_8 == 5)
                {
                    v17->field_20 = 64;
                    if (!v17->field_10)
                        return 1;
                    if (64 <= v17->field_18)
                    {
                        v18 = sub_a83238(v17->field_10, 64, a0);
                        if (!(unsigned int)v18)
                            return v18;
                        return 1;
                    }
                }
            }
            else
            {
                return 1;
            }
        }
        else if (v14->field_8 == 5)
        {
            v15 = v2[1];
            v14->field_20 = v15;
            if (!v14->field_10)
                goto LABEL_b3eb14;
            if (v14->field_18 >= v15)
            {
                v16 = sub_a830a4(v14->field_10);
                if (!(unsigned int)v16)
                    return v16;
                goto LABEL_b3eb14;
            }
        }
    }
    return 0;
}
