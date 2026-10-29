/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x987cd8..0x987f90 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_987cd8_0 {
    char *field_0;
    struct st_987cd8_1 *field_8;
} st_987cd8_0;

typedef struct st_987cd8_2 {
    char *field_0;
    char *field_8;
    struct st_987cd8_1 *field_10;
    struct st_987cd8_1 *field_18;
    struct st_987cd8_1 *field_20;
    struct st_987cd8_1 *field_28;
    char *field_2c;
    struct st_987cd8_1 *field_30;
    struct st_987cd8_1 *field_38;
    struct st_987cd8_1 *field_3c;
    struct st_987cd8_1 *field_40;
} st_987cd8_2;

typedef struct st_987cd8_1 {
    struct st_987cd8_1 *field_0;
    struct st_987cd8_1 *field_8;
    struct st_987cd8_1 *field_10;
    struct st_987cd8_1 *field_18;
    struct st_987cd8_1 *field_20;
    struct st_987cd8_1 *field_28;
    struct st_987cd8_1 *field_30;
    struct st_987cd8_1 *field_34;
    struct st_987cd8_1 *field_38;
    char padding_40[4];
    struct st_987cd8_1 *field_44;
} st_987cd8_1;


int sub_987cd8(st_987cd8_2 *a0, st_987cd8_0 *a1, char *a2, char *a3, char *a4)
{
    char *v2;  // x8
    st_987cd8_2 *v3;  // x25
    char *i;  // x27
    char *v13;  // x23
    st_987cd8_2 *v14;  // x28
    char *v15;  // x22
    char *v16;  // x8
    char *v17;  // x8
    st_987cd8_2 *v18;  // x8
    char *v19;  // x23
    char *v20;  // w8
    char *v4;  // x10
    char *v5;  // x25
    char *v6;  // x9
    char *v7;  // x0
    char *v8;  // x23
    char *v9;  // x8
    char *v10;  // x27
    char *v11;  // x27
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 > a0->field_20)
    {
        v3 = a0;
        v4 = v3->field_8;
        v5 = &v3->field_8;
        if (!v4)
        {
            v7 = sub_a6bffc(48, "ssl/quic/quic_sf_list.c", 33);
            if (!v7)
            {
                a0->field_0 = 0;
                a0->field_8 = 0;
                return (unsigned int)v7;
            }
            v19 = v7;
            if (a2)
                sub_984308(a2);
            *(int128_t *)&v19[16] = *(int128_t *)a1;
            *(char **)&v19[32] = a2;
            *(char **)&v19[40] = a3;
            a0->field_0 = v19;
            a0->field_8 = v19;
            goto LABEL_987dc8;
        }
        v6 = a1->field_0;
        if (v6 <= (unsigned long long)*(long long *)&v4[16])
        {
            v10 = a0->field_0;
            if (!v10)
                return 0;
            if (v6 > (unsigned long long)*(long long *)&v10[16])
            {
                do
                {
                    v11 = v10;
                    i = *(long long *)&v11[8];
                    if (!i)
                        return 0;
                } while ((v10 = i, (unsigned long long)*(long long *)&v10[16] < v6));
            }
            else
            {
                v11 = 0;
                i = v10;
            }
            if (!v11 || v2 > (unsigned long long)*(long long *)&v11[24])
            {
                v7 = sub_a6bffc(48, "ssl/quic/quic_sf_list.c", 33);
                if (!v7)
                    return (unsigned int)v7;
                v13 = v7;
                if (a2)
                    sub_984308(a2);
                *(int128_t *)&v13[16] = *(int128_t *)a1;
                *(char **)&v13[32] = a2;
                *(char **)&v13[40] = a3;
                v14 = v11 + 8;
                do
                {
                    v15 = i;
                    v16 = *(long long *)&i[24];
                    if (a1->field_8 < v16)
                    {
                        if (v11)
                        {
                            v17 = v15;
                            if ((unsigned long long)*(long long *)&v11[24] >= (unsigned long long)*(long long *)&v15[16])
                            {
                                sub_987c88(a0, v13);
                                goto LABEL_987dd4;
                            }
                        }
                        else
                        {
                            v17 = v15;
                            goto LABEL_987f78;
                        }
                    }
                    i = *(long long *)&v15[8];
                    if (i)
                        *(long long *)i = *(long long *)v15;
                    if (v11)
                        v14->field_0 = i;
                    if (a0->field_0 == v15)
                        a0->field_0 = i;
                    if (*(long long *)v5 == v15)
                        *(char **)v5 = v11;
                    a0->field_18 = (char *)a0->field_18 - 1;
                    if (*(int *)((char *)&a0->field_28 + 4) && *(long long *)&v15[40])
                        sub_a66ec0(*(long long *)&v15[40], &v16[-1 * *(long long *)&v15[16]]);
                    sub_9842b4(*(long long *)&v15[32]);
                    sub_a6c2e4(v15, "ssl/quic/quic_sf_list.c", 27);
                } while (i);
                v17 = 0;
                v15 = v5;
LABEL_987f78:
                *(char **)v15 = v13;
                *(char **)v13 = v11;
                *(char **)&v13[8] = v17;
                if (!v11)
                    v18 = a0;
                else
                    v18 = v14;
                v18->field_0 = v13;
LABEL_987dc8:
                a0->field_18 = (char *)&a0->field_18->field_0 + 1;
            }
        }
        else if (v2 > (unsigned long long)*(long long *)&v4[24])
        {
            v7 = sub_a6bffc(48, "ssl/quic/quic_sf_list.c", 33);
            if (!v7)
                return (unsigned int)v7;
            v8 = v7;
            if (a2)
                sub_984308(a2);
            *(int128_t *)&v8[16] = *(int128_t *)a1;
            *(char **)&v8[32] = a2;
            *(char **)&v8[40] = a3;
            v9 = *(long long *)v5;
            *(char **)v8 = v9;
            if (v9)
                *(char **)&v9[8] = v8;
            a0->field_8 = v8;
            goto LABEL_987dc8;
        }
    }
LABEL_987dd4:
    if (a4)
        v20 = (char *)1;
    else
        v20 = (char *)((int)a0->field_10 != 0);
    *(unsigned int *)&a0->field_10 = (unsigned int)v20;
    return 1;
}
