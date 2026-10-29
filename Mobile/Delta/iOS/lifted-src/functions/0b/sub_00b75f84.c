/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb75f84..0xb7639c (1048 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b75f84_0 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[12];
    struct st_b75f84_1 *field_40;
    char padding_48[16];
    struct st_b75f84_1 *field_58;
    unsigned long long field_60;
    struct st_b75f84_1 *field_68;
    char padding_70[8];
    struct st_b75f84_1 *field_78;
    char padding_80[8];
    struct st_b75f84_1 *field_88;
} st_b75f84_0;

typedef struct st_b75f84_1 {
    unsigned long long field_0;
} st_b75f84_1;


unsigned long long sub_b75f84(st_b75f84_0 *a0)
{
    unsigned long long *v9;  // x0
    unsigned long long v10;  // x27
    unsigned long v19;  // x1
    unsigned long long v20;  // x1
    unsigned long long v21;  // x1
    unsigned long long *v22;  // x9
    unsigned long long v23;  // x20
    unsigned long long v24;  // x22
    unsigned long long v25;  // x25
    unsigned long long v26;  // x21
    unsigned long long v27;  // x23
    unsigned long long *v28;  // x24
    unsigned long long v11;  // x1
    unsigned long long *v29;  // x20
    unsigned long v30;  // x8
    unsigned long long *v31;  // x9
    unsigned long long v32;  // x8
    unsigned long long *v33;  // x9
    unsigned long long v34;  // x8
    unsigned long long *v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long *v14;  // x28
    unsigned long long v15;  // x26
    unsigned long long v16;  // x8
    unsigned long long *v17;  // x1
    unsigned long v18;  // x9
    unsigned int v0;  // [bp-0x94]
    unsigned long long v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x88]
    unsigned long long v3;  // [bp-0x80]
    char v4;  // [bp-0x78]
    unsigned long long *v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    if (*(long long *)&a0->padding_48[8])
    {
        if (a0->field_58 != a0->field_68)
        {
            v32 = *(long long *)a0->field_58;
            a0->field_58 = a0->field_58 + 1;
            return v32;
        }
        if (a0->field_60)
            _free(*(long long *)&a0->padding_48[8]);
        *(unsigned long long *)&a0->padding_48[8] = 0;
    }
    switch (v10)
    {
    case 0:
        v11 = *(long long *)&a0->padding_0[24];
        v3 = *(long long *)&a0->padding_0[16];
        v12 = a0->field_40;
        v1 = *(long long *)&a0->padding_48[0];
        goto LABEL_b76040;
    case 2:
LABEL_b7606c:
        v15 = v11;
        if (v12 && v12 != v1)
        {
            v14 = v12 + 16;
            a0->field_40 = v14;
            v17 = v12;
            v18 = *v17;
            v19 = v17 + 8;
            *(unsigned long long *)&a0->padding_0[16] = 1;
            *(unsigned long *)&a0->padding_0[24] = v19;
            v3 = 1;
            *(unsigned long long *)&a0->padding_0[0] = 1;
            *(unsigned long long *)&a0->padding_0[8] = 0;
            if (v18 == 12)
            {
                v15 = 0;
                *(unsigned long long *)&a0->padding_0[0] = 0;
                *(unsigned long long *)&a0->padding_0[24] = 0;
                v3 = 1;
                sub_b74fb0(&v4);
                v16 = v4;
                if (v16 != 0x8000000000000000)
                    goto LABEL_b76160;
                goto LABEL_b76338;
            }
            else
            {
                v15 = v19;
                sub_b74fb0(&v4, v12);
                v16 = v4;
                if (v16 != 0x8000000000000000)
                {
LABEL_b76160:
                    v9 = v5;
                    v22 = &v9[v6];
                    v0 = a0->field_30;
                    v23 = *(long long *)&a0->padding_0[8];
                    v24 = *(long long *)&a0->padding_0[40];
                    v2 = *(long long *)&a0->padding_0[32];
                    v25 = *(long long *)&a0->padding_34[4];
                    *(unsigned long long **)&a0->padding_48[8] = v9;
                    a0->field_58 = v9;
                    a0->field_60 = v16;
                    a0->field_68 = v22;
                    if (v9 != v22)
                    {
                        v32 = *v9;
                        a0->field_58 = v9 + 1;
                        return v32;
                    }
                    while (1)
                    {
                        if (v16)
                            _free();
                        *(unsigned long long *)&a0->padding_48[8] = 0;
                        switch (v10)
                        {
                        case 0:
                            v26 = v23;
                            if (v3 & 1)
                                goto LABEL_b761e8;
                            goto LABEL_b76208;
                        case 2:
                            v26 = v23;
                            if (v14)
                                goto LABEL_b76214;
                            goto LABEL_b76268;
                        default:
                            *(unsigned long long *)&a0->padding_0[8] = 0;
                            v26 = 0;
                            if (v23)
                            {
                                v27 = v24;
                                v28 = v14;
                            }
                            else
                            {
                                *(unsigned long long *)&a0->padding_0[0] = 0;
                                if (v3 & 1)
                                {
LABEL_b761e8:
                                    *(unsigned long long *)&a0->padding_0[24] = 0;
                                    if (v15)
                                    {
                                        v23 = v15;
                                        v27 = v24;
                                        v28 = v14;
                                        goto LABEL_b7625c;
                                    }
                                }
LABEL_b76208:
                                *(unsigned long long *)&a0->padding_0[0] = 2;
                                if (v14)
                                {
LABEL_b76214:
                                    if (v14 == v1)
                                        goto LABEL_b76268;
                                    v29 = v14;
                                    v30 = *v29;
                                    v23 = v29 + 8;
                                    v28 = v14 + 16;
                                    a0->field_40 = v28;
                                    *(unsigned long long *)&a0->padding_0[16] = 1;
                                    *(unsigned long long *)&a0->padding_0[24] = v23;
                                    *(unsigned long long *)&a0->padding_0[0] = 1;
                                    *(unsigned long long *)&a0->padding_0[8] = 0;
                                    if (v30 == 12)
                                    {
                                        v26 = 0;
                                        *(unsigned long long *)&a0->padding_0[0] = 0;
                                        *(unsigned long long *)&a0->padding_0[24] = 0;
                                        v27 = v24;
                                        v15 = 0;
LABEL_b7625c:
                                        v3 = 1;
                                    }
                                    else
                                    {
                                        v26 = 0;
                                        v27 = v24;
                                        v15 = v23;
                                        v3 = 1;
                                        v23 = v14;
                                    }
                                }
                                else
                                {
LABEL_b76268:
                                    switch (v2)
                                    {
                                    case 0:
                                        v27 = v24;
                                        if (v0)
                                            goto LABEL_b762d0;
                                        goto LABEL_b76330;
                                    case 2:
                                        goto LABEL_b76338;
                                    default:
                                        *(unsigned long long *)&a0->padding_0[40] = 0;
                                        v27 = 0;
                                        if (v24)
                                        {
                                            v28 = v14;
                                            v23 = v24;
                                            break;
                                        }
                                        else
                                        {
                                            *(unsigned long long *)&a0->padding_0[32] = 0;
                                            if (v0)
                                            {
LABEL_b762d0:
                                                *(unsigned long long *)&a0->padding_34[4] = 0;
                                                if (!v25)
                                                    goto LABEL_b76330;
                                                v23 = v25;
                                                v25 = 0;
                                                v2 = 0;
                                                v28 = v14;
                                                break;
                                            }
                                            else
                                            {
LABEL_b76330:
                                                *(unsigned long long *)&a0->padding_0[32] = 2;
                                                goto LABEL_b76338;
                                            }
                                        }
                                    }
                                }
                            }
                            sub_b74fb0(&v4, v23);
                            v16 = v4;
                            if (v16 == 0x8000000000000000)
                                goto LABEL_b76338;
                            v9 = v5;
                            v31 = &v9[v6];
                            v24 = v27;
                            v23 = v26;
                            v14 = v28;
                            *(unsigned long long **)&a0->padding_48[8] = v9;
                            a0->field_58 = v9;
                            a0->field_60 = v16;
                            a0->field_68 = v31;
                            if (v9 != v31)
                            {
                                v32 = *v9;
                                a0->field_58 = v9 + 1;
                                return v32;
                            }
                            break;
                        }
                    }
                }
            }
        }
        else if (!*(long long *)&a0->padding_0[32])
        {
LABEL_b76100:
            if (*(long long *)&a0->field_30 != 1 || (v21 = *(long long *)&a0->padding_34[4], *(unsigned long long *)&a0->padding_34[4] = 0, !*(long long *)&a0->padding_34[4]))
                goto LABEL_b76330;
LABEL_b76118:
LABEL_b7611c:
            v14 = v12;
            sub_b74fb0(&v4);
            v16 = v4;
            if (v16 != 0x8000000000000000)
                goto LABEL_b76160;
            goto LABEL_b76338;
        }
        else if (*(long long *)&a0->padding_0[32] != 2)
        {
            v20 = *(long long *)&a0->padding_0[40];
            *(unsigned long long *)&a0->padding_0[40] = 0;
            if (v20)
                goto LABEL_b76118;
            *(unsigned long long *)&a0->padding_0[32] = 0;
            goto LABEL_b76100;
        }
    case 3:
LABEL_b76338:
        if (!a0->padding_70)
            return 0;
        v33 = a0->field_78;
        if (v33 != a0->field_88)
        {
            v34 = *v33;
            a0->field_78 = v33 + 1;
            return v34;
        }
        if (a0->padding_80)
            _free();
        *(unsigned long long *)a0->padding_70 = 0;
        return 0;
    default:
        v13 = *(long long *)&a0->padding_0[8];
        *(unsigned long long *)&a0->padding_0[8] = 0;
        if (!v13)
        {
            *(unsigned long long *)&a0->padding_0[0] = 0;
LABEL_b76040:
            if (v3 & 1 && !(*(unsigned long long *)&a0->padding_0[24] = 0, !v11))
            {
                v15 = 0;
                v3 = 1;
                goto LABEL_b7611c;
            }
            else
            {
                *(unsigned long long *)&a0->padding_0[0] = 2;
                goto LABEL_b7606c;
            }
            goto LABEL_b7606c;
        }
        v14 = v12;
        v15 = v11;
        sub_b74fb0(&v4, v13);
        v16 = v4;
        if (v16 != 0x8000000000000000)
            goto LABEL_b76160;
        goto LABEL_b76338;
    }
}
