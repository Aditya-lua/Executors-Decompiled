/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2edc0..0xa2efd4 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2edc0_2 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_a2edc0_2;

typedef struct st_a2edc0_3 {
    long long field_0;
    long long field_8;
    struct st_a2edc0_2 *field_10;
    long long field_18;
    struct st_a2edc0_2 *field_20;
    struct st_a2edc0_4 *field_28;
    long long field_30;
} st_a2edc0_3;

typedef struct st_a2edc0_4 {
    struct st_a2edc0_2 *field_0;
} st_a2edc0_4;

typedef struct st_a2edc0_1 {
    unsigned long long field_0;
} st_a2edc0_1;

typedef struct st_a2edc0_0 {
    char padding_0[112];
    struct st_a2edc0_1 *field_70;
} st_a2edc0_0;


st_a2edc0_2 * sub_a2edc0(long long a0, long long a1, st_a2edc0_3 *a2)
{
    st_a2edc0_0 *v5;  // x21
    unsigned long long v6;  // x23
    st_a2edc0_2 *v15;  // w8
    st_a2edc0_2 *v16;  // x20
    st_a2edc0_2 *v17;  // x0
    st_a2edc0_2 *v7;  // x0
    st_a2edc0_2 *v8;  // x0
    unsigned int v9;  // w0
    st_a2edc0_2 *v10;  // x27
    st_a2edc0_2 *v11;  // x1
    st_a2edc0_2 *v12;  // x22
    st_a2edc0_2 *v13;  // x0
    st_a2edc0_2 *v14;  // x0
    st_a2edc0_2 *v0;  // [bp-0x78]
    st_a2edc0_2 *v1;  // [bp-0x70]
    st_a2edc0_2 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a2d030();
    sub_9f2aec(a0);
    v6 = sub_a2d6cc(v5);
    if (sub_a6fbc4(a1, "data-type"))
    {
        v0 = 0;
        v7 = sub_a71220();
        if (!(unsigned int)v7)
            return v7;
        sub_a6c2e4(a2->field_20, "crypto/encode_decode/decoder_pkey.c", 100);
        a2->field_20 = v0;
    }
    v8 = sub_a6fbc4(a1, "reference");
    if (!v8)
    {
        return v8;
    }
    else if (v8->field_8 == 5)
    {
        v9 = sub_ad69e4(a2->field_18);
        if ((int)v9 >= 1)
        {
            v10 = 0;
            while (1)
            {
                v11 = v10;
                v12 = sub_ad69f8(a2->field_18, v11);
                if (sub_975ff4(v12, v11) == v6 && sub_a55b40(v12) && sub_a558b4(v12, a2->field_20))
                    break;
                v10 = (unsigned int)v10 + 1;
                if (v9 == (unsigned int)v10)
                    goto LABEL_a2eef0;
            }
            v13 = sub_a2d050(v12);
            if (!(unsigned int)v13)
                return v13;
            goto LABEL_a2ef70;
        }
        else
        {
LABEL_a2eef0:
            v14 = sub_a55808(a2->field_0, a2->field_20, a2->field_8);
            if (v14)
            {
                v12 = v14;
                if (sub_975ff4() != v6)
                {
                    v0 = v12;
                    v1 = 0;
                    v15 = (st_a2edc0_2 *)(int)a2->field_10;
                    if (!(int)a2->field_10)
                        v15 = (st_a2edc0_2 *)135;
                    v2 = v15;
                    v5->field_70();
                }
LABEL_a2ef70:
                v16 = sub_a55b54(v12, v8->field_10, v8->field_18);
                if (v16)
                {
                    v17 = sub_a54918(v12, v16);
                    if (v17)
                        goto LABEL_a2ef94;
                    sub_a55970(v12, v16);
                }
                else
                {
                    sub_a2ca70(a2->field_30);
                }
                v17 = 0;
LABEL_a2ef94:
                *(st_a2edc0_2 **)a2->field_28 = v17;
                sub_a55830(v12);
            }
        }
        return *(long long *)a2->field_28 != 0;
    }
    else
    {
        return 0;
    }
}
