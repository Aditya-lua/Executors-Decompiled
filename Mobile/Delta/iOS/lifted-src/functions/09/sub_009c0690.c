/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0690..0x9c0a90 (1024 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c0690_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9c0690_0;

extern unsigned int g_7fffff;

unsigned long long sub_9c0690(long long a0, st_9c0690_0 **a1)
{
    st_9c0690_0 *v6;  // x0
    st_9c0690_0 *v7;  // x19
    unsigned long long v16;  // x2
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    unsigned long long v19;  // x26
    unsigned long long v20;  // 4114
    char *v21;  // x24
    char *v22;  // x9
    unsigned long long v23;  // x10
    unsigned long long v24;  // x9
    unsigned long v25;  // x11
    unsigned long long iter;  // w25
    unsigned long long v26;  // x11
    unsigned long long v27;  // x0
    unsigned int v28;  // w8
    unsigned long long v30;  // x8
    unsigned long long v31;  // x20
    unsigned long long v32;  // x9
    unsigned long long i;  // x27
    unsigned long long v34;  // 4110
    unsigned int v35;  // x23
    unsigned long long v9;  // x20
    unsigned int v36;  // x24
    unsigned long long v37;  // x24
    unsigned long long v38;  // x23
    unsigned long long v39;  // x23
    unsigned long long v40;  // w0
    unsigned long long v41;  // x8
    unsigned long long v42;  // 4108
    unsigned long long v43;  // 4112
    unsigned long long v10;  // x26
    unsigned long long v11;  // x23
    unsigned long long v12;  // x8
    unsigned long long v13;  // x23
    unsigned long long v14;  // 4107
    char *v15;  // x1
    char v0;  // [bp-0x78]
    char v1;  // [bp-0x74], Other Possible Types: unsigned long long
    char v2;  // [bp-0x70]
    char *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9ebce0();
    if (v6)
    {
        v7 = v6;
        sub_a36c8c();
        iter = 0;
        v9 = 0;
        v10 = 0;
        while (1)
        {
            v11 = 2;
            while (1)
            {
                while (1)
                {
                    while (1)
                    {
                        v12 = v10 - v9;
                        v13 = v11 - v12;
                        if (v11 < v12)
                            break;
                        v14 = arm64g_calculate_condition(0x22, v13, v10, 0);
                        if (v14 & 1 || !sub_9ebee0(v7))
                        {
                            v36 = 137;
LABEL_9c09a4:
                            v35 = 524295;
                            goto LABEL_9c09f8;
                        }
                        v15 = v7->field_8 + v10;
                        v16 = v13;
                        v17 = sub_9d3d84(a0, v15, v16);
                        if ((int)v17 <= 0)
                        {
                            v35 = 142;
                            v36 = 155;
                            if (v10 == v9 && !(unsigned int)v17 && !iter)
                                goto LABEL_9c0a24;
                            goto LABEL_9c09f8;
                        }
                        v18 = v17 & 0xffffffff;
                        v19 = v10 + v18;
                        v20 = arm64g_calculate_condition(0x22, v10, v18, 0);
                        if (v20 & 1)
                        {
                            v35 = 155;
                            v36 = 160;
                            goto LABEL_9c09f8;
                        }
                        v10 = v19;
                        v11 = v13;
                        if (v18 >= v11)
                        {
                            v12 = v19 - v9;
                            v10 = v19;
                            break;
                        }
                    }
                    v21 = v7->field_8 + v9;
                    v3 = v21;
                    if (v12 < 2)
                    {
                        v35 = 142;
                        v36 = 176;
                        goto LABEL_9c09f8;
                    }
                    v22 = v21 + 1;
                    v3 = v22;
                    if (~(*v21 & 31))
                        break;
                    v23 = v12 - 2;
                    if (v12 == 2)
                    {
LABEL_9c06e4:
                        if (0 <= *v22)
                            v24 = 2;
                        else
                            v24 = 3;
                        v11 = v22 - v21 + v24;
                    }
                    else
                    {
                        v22 = v21 + 2;
                        v3 = v22;
                        if ((char)v21[1] >= 0)
                            goto LABEL_9c07f4;
                        v23 = v12 - 3;
                        if (v12 == 3)
                            goto LABEL_9c06e4;
                        v22 = v21 + 3;
                        v3 = v22;
                        if ((char)v21[2] >= 0)
                            goto LABEL_9c07f4;
                        v23 = v12 - 4;
                        if (v12 == 4)
                            goto LABEL_9c06e4;
                        v22 = v21 + 4;
                        v3 = v22;
                        if ((char)v21[3] >= 0)
                            goto LABEL_9c07f4;
                        v23 = v12 - 5;
                        if (v12 == 5)
                            goto LABEL_9c06e4;
                        v22 = v21 + 5;
                        v3 = v22;
                        if ((char)v21[4] >= 0)
                            goto LABEL_9c07f4;
                        v23 = v12 - 6;
                        if (v12 == 6)
                            goto LABEL_9c06e4;
                        v22 = v21 + 6;
                        v3 = v22;
                        if ((char)v21[5] >= 0)
                            goto LABEL_9c07f4;
                        v35 = 123;
                        v36 = 0xbb;
LABEL_9c09f8:
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_d2i_fp.c", v36, "asn1_d2i_read_bio");
                        v15 = (char *)v35;
                        v16 = 0;
                        v17 = sub_a36abc(13, v15, 0);
LABEL_9c0a24:
                        sub_a36e70(v17, v15, v16);
                        sub_9ebcf4(v7);
                        goto LABEL_9c0a30;
                    }
                }
                v23 = v12 - 1;
LABEL_9c07f4:
                v25 = *v22;
                if (!(v25 >> 31 & 1))
                    break;
                v26 = v25 & 0xff & 127;
                if (8 < (unsigned int)v26)
                {
                    v35 = 155;
                    v36 = 213;
                    goto LABEL_9c09f8;
                }
                if (v26 <= v23 - 1)
                    break;
                v11 = v22 - v21 + v26 + 1;
            }
            v3 = v21;
            v15 = &v2;
            v16 = &v1;
            v27 = sub_9c7328(&v3, &v2, &v1, &v0, (int)v12);
            if (v27 >> 7 & 1)
            {
                v17 = sub_a36000();
                if (0 <= (int)v17)
                    v28 = (unsigned int)&g_7fffff;
                else
                    v28 = 0x7fffffff;
                if ((v28 & (unsigned int)v17) != 155)
                    goto LABEL_9c0a24;
                sub_a36c8c(sub_a36cd4());
            }
            v9 += v3 - v21;
            if (!(v27 & 1))
            {
                v30 = v2;
                if (!iter || v30 || v1)
                {
                    v32 = v10 - v9;
                    i = v30 - v32;
                    if (v30 > v32)
                    {
                        v34 = arm64g_calculate_condition(50, v10, i, 0);
                        v35 = 155;
                        v36 = 263;
                        if (i > 0x7fffffff || !(v34 & 1))
                            goto LABEL_9c09f8;
                        if (i)
                        {
                            v37 = 0x4000;
                            do
                            {
                                if (i < v37)
                                    v38 = i;
                                else
                                    v38 = v37;
                                if (!sub_9ebee0())
                                {
                                    v36 = 276;
                                    goto LABEL_9c09a4;
                                }
                                i -= v38;
                                do
                                {
                                    v39 = v38;
                                    v40 = (unsigned int)sub_9d3d84(a0, v7->field_8 + v10, v39);
                                    if (v40 < 1)
                                    {
                                        v35 = 142;
                                        v36 = 283;
                                        goto LABEL_9c09f8;
                                    }
                                } while ((v41 = v40, v10 += v41, v38 = v39 - v41, v39 != v41));
                                v37 <<= 0x3fffffff > v37;
                            } while (i);
                            v30 = v2;
                        }
                    }
                    v31 = v30 + v9;
                    v42 = arm64g_calculate_condition(0x22, v30, v9, 0);
                    if (v42 & 1)
                    {
                        v35 = 155;
                        v36 = 298;
                        goto LABEL_9c09f8;
                    }
                    v9 = v31;
                    if (!iter)
                        goto LABEL_9c0958;
                }
                else
                {
                    iter -= 1;
                    v31 = v9;
                    if (iter == 1)
                    {
LABEL_9c0958:
                        if (v31 <= 0x7fffffff)
                        {
                            *a1 = v7;
                            sub_a36e70();
                            return v31;
                        }
                        v35 = 155;
                        v36 = 310;
                        goto LABEL_9c09f8;
                    }
                }
            }
            else
            {
                v43 = arm64g_calculate_condition(1, iter, 1, 0);
                if (!(v43 & 1))
                {
                    iter += 1;
                }
                else
                {
                    v35 = 123;
                    v36 = 243;
                    goto LABEL_9c09f8;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_d2i_fp.c", 126, "asn1_d2i_read_bio");
        sub_a36abc(13, 0x80007, 0);
    }
LABEL_9c0a30:
    return 0xffffffff;
}
