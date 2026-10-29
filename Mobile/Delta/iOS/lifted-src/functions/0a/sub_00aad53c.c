/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad53c..0xaad8dc (928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aad53c_0 {
    char padding_0[40];
    unsigned long long field_28;
    long long field_30;
    unsigned long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[24];
    long long field_80;
    long long field_88;
} st_aad53c_0;

typedef struct st_aad53c_1 {
    char padding_0[8];
    struct st_aad53c_2 *field_8;
    char padding_10[16];
    struct st_aad53c_0 *field_20;
} st_aad53c_1;

typedef struct st_aad53c_2 {
    unsigned int field_0;
} st_aad53c_2;

extern long long g_c7c2eb;

unsigned long long sub_aad53c(long long a0, st_aad53c_1 *a1, long long a2, unsigned long long a3)
{
    st_aad53c_0 *v4;  // x28
    unsigned long long v5;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x27
    long long *v20;  // x26
    unsigned long long v21;  // x0
    unsigned long v22;  // x27
    unsigned long long v23;  // x0
    unsigned long long v6;  // w24
    unsigned long long v24;  // x0
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    unsigned long long v9;  // x8
    long long v10;  // x23
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_20;
    if (v4->field_28)
        v5 = sub_9e46a8(v4->field_28);
    else
        v5 = 0;
    v6 = (unsigned int)sub_ad69e4(v4->field_88);
    v7 = sub_9d4cf4(a0, a2, 128);
    if (!(unsigned int)v7)
        return v7;
    if (*(int *)a1->field_8 == 912)
        v8 = "RSA-PSS";
    else
        v8 = "RSA";
    v0 = v8;
    if ((int)sub_9d524c() < 1)
        return 0;
    if (a3 && v4->field_38)
    {
        if (v6 < 1)
            v9 = 2;
        else
            v9 = v6 + 2;
        v0 = v5;
        v1 = v9;
        if ((int)sub_9d524c() >= 1)
        {
            v10 = "publicExponent:";
            goto LABEL_aad65c;
        }
    }
    else
    {
        v0 = v5;
        if ((int)sub_9d524c(a0, "Public-Key: (%d bit)\n") >= 1)
        {
            v10 = "Exponent:";
LABEL_aad65c:
            v11 = sub_9cab08(a0);
            if (!(unsigned int)v11)
                return v11;
            v12 = sub_9cab08(a0, v10, v4->field_30, 0, a2);
            if (!(unsigned int)v12)
                return v12;
            if (a3)
            {
                v13 = sub_9cab08(a0, "privateExponent:", v4->field_38, 0, a2);
                if (!(unsigned int)v13)
                    return v13;
                v14 = sub_9cab08(a0, "prime1:", v4->field_40, 0, a2);
                if (!(unsigned int)v14)
                    return v14;
                v15 = sub_9cab08(a0, "prime2:", v4->field_48, 0, a2);
                if (!(unsigned int)v15)
                    return v15;
                v16 = sub_9cab08(a0, "exponent1:", v4->field_50, 0, a2);
                if (!(unsigned int)v16)
                    return v16;
                v17 = sub_9cab08(a0, "exponent2:", v4->field_58, 0, a2);
                if (!(unsigned int)v17)
                    return v17;
                v18 = sub_9cab08(a0, "coefficient:", v4->field_60, 0, a2);
                if (!(unsigned int)v18)
                {
                    return v18;
                }
                else if ((int)sub_ad69e4(v4->field_88) >= 1)
                {
                    v19 = 0;
                    do
                    {
                        v20 = sub_ad69f8(v4->field_88, v19);
                        v21 = sub_9d4cf4(a0, a2, 128);
                        if (!(unsigned int)v21)
                            return v21;
                        v22 = (unsigned int)v19 + 3;
                        v0 = v22;
                        if ((int)sub_9d524c(a0, "prime%d:") < 1)
                            return 0;
                        v23 = sub_9cab08(a0, &g_c7c2eb, *v20, 0, a2);
                        if (!(unsigned int)v23)
                            return v23;
                        v24 = sub_9d4cf4(a0, a2, 128);
                        if (!(unsigned int)v24)
                            return v24;
                        v0 = v22;
                        if ((int)sub_9d524c(a0, "exponent%d:") < 1)
                            return 0;
                        v25 = sub_9cab08(a0, &g_c7c2eb, v20[1], 0, a2);
                        if (!(unsigned int)v25)
                            return v25;
                        v26 = sub_9d4cf4(a0, a2, 128);
                        if (!(unsigned int)v26)
                            return v26;
                        v0 = v22;
                        if ((int)sub_9d524c(a0, "coefficient%d:") < 1)
                            return 0;
                        v27 = sub_9cab08(a0, &g_c7c2eb, v20[2], 0, a2);
                        if (!(unsigned int)v27)
                            return v27;
                        v19 = (unsigned int)v22 - 2;
                    } while ((int)v19 < (int)sub_ad69e4(v4->field_88));
                }
            }
            if (*(int *)a1->field_8 != 912)
                return 1;
            v28 = sub_aad8dc(a0, 1, v4->field_80, a2);
            if (!(unsigned int)v28)
                return v28;
            return 1;
        }
    }
    return 0;
}
