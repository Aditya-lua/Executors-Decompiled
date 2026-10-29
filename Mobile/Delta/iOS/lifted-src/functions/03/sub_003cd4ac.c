/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cd4ac..0x3cdc68 (1980 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cd4ac_2 {
    struct st_3cd4ac_0 *field_0;
} st_3cd4ac_2;

typedef struct st_3cd4ac_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_3cd4ac_1;

typedef struct st_3cd4ac_0 {
    char field_0;
} st_3cd4ac_0;

typedef struct st_3cd4ac_3 {
    st_3cd4ac_0 field_0;
} st_3cd4ac_3;

typedef struct st_3cd4ac_4 {
    unsigned long long field_0;
} st_3cd4ac_4;

extern st_3cd4ac_4 *g_f0b120;
extern char g_1000000;

unsigned int sub_3cd4ac(st_3cd4ac_1 *a0, void* a1)
{
    unsigned int v8;  // w0
    unsigned int v9;  // w0
    unsigned int v18;  // w0
    unsigned int v19;  // w0
    unsigned int v20;  // w0
    unsigned int v21;  // w8
    unsigned int v22;  // w0
    unsigned int v23;  // w0
    unsigned int v24;  // w0
    unsigned int v25;  // w21
    unsigned int v26;  // w0
    unsigned int v27;  // w0
    unsigned int v10;  // w0
    unsigned int v28;  // w0
    unsigned long long v29;  // x21
    unsigned int v30;  // w0
    unsigned int v11;  // w0
    unsigned int v12;  // w0
    unsigned int v13;  // w0
    unsigned int v14;  // w22
    unsigned int v15;  // w0
    unsigned int v16;  // w0
    unsigned int v17;  // w0
    st_3cd4ac_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_3cd4ac_0 *v1;  // [bp-0x88]
    st_3cd4ac_0 *v2;  // [bp-0x80], Other Possible Types: void* *, st_3cd4ac_2 **
    st_3cd4ac_0 **v3;  // [bp-0x78], Other Possible Types: st_3cd4ac_3 **, st_3cd4ac_2 **, char
    st_3cd4ac_2 **v4;  // [bp-0x70]
    void* *v5;  // [bp-0x68], Other Possible Types: st_3cd4ac_2 **
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (sub_3d706c() == 66 && sub_3d706c(a0) == 77)
    {
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        v8 = sub_3d706c(a0);
        v9 = sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        v10 = sub_3d706c(a0);
        *(unsigned int *)&a1[4] = v10 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v8 | v9 * 0x100;
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        v11 = sub_3d706c(a0);
        v12 = sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        v13 = sub_3d706c(a0);
        v14 = v13 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v11 | v12 * 0x100;
        *(unsigned int *)&a1[8] = v14;
        *(unsigned long long *)&a1[20] = 0;
        *(unsigned long long *)&a1[12] = 0;
        *(unsigned int *)&a1[32] = 14;
        if ((int)a1[4] >= 0)
        {
            switch (v14)
            {
            case 40: case 56: case 108: case 124:
                v2 = &v3;
                v3 = &v2;
                v4 = &v5;
                v5 = &v4;
                v15 = sub_3d706c(a0);
                v16 = sub_3d706c(a0);
                v4 = &v5;
                v5 = &v4;
                v17 = sub_3d706c(a0);
                a0->field_0 = v17 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v15 | v16 * 0x100;
                v2 = &v3;
                v3 = &v2;
                v4 = &v5;
                v5 = &v4;
                v18 = sub_3d706c(a0);
                v19 = sub_3d706c(a0);
                v4 = &v5;
                v5 = &v4;
                v20 = sub_3d706c(a0);
                v21 = v20 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v18 | v19 * 0x100;
                break;
            case 12:
                v4 = &v5;
                v5 = &v4;
                v22 = sub_3d706c(a0);
                a0->field_0 = v22 | sub_3d706c(a0) * 0x100;
                v4 = &v5;
                v5 = &v4;
                v23 = sub_3d706c(a0);
                v21 = v23 | sub_3d706c(a0) * 0x100;
                break;
            default:
                g_f0b120();
            }
            a0->field_4 = v21;
            v4 = &v5;
            v5 = &v4;
            v24 = sub_3d706c(a0);
            if ((v24 | sub_3d706c(a0) * 0x100) == 1)
            {
                v4 = &v5;
                v5 = &v4;
                v25 = sub_3d706c(a0);
                *(unsigned int *)a1 = v25 | sub_3d706c(a0) * 0x100;
                if (v14 == 12)
                {
LABEL_3cd720:
                    return 1;
                }
                v3 = &v2;
                v2 = &v3;
                v4 = &v5;
                v5 = &v4;
                v26 = sub_3d706c(a0);
                v27 = sub_3d706c(a0);
                v4 = &v5;
                v5 = &v4;
                v28 = sub_3d706c(a0);
                v29 = v28 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v26 | v27 * 0x100;
                if (1 >= (unsigned int)v29 - 1)
                    g_f0b120();
                if ((int)v29 >= 4)
                    g_f0b120();
                if ((unsigned int)v29 != 3 || *(int *)a1 == 16 || *(int *)a1 == 32)
                {
                    sub_3c918c(a0);
                    sub_3c918c(a0);
                    sub_3c918c(a0);
                    sub_3c918c(a0);
                    sub_3c918c(a0);
                    if (107 >= (int)v14)
                    {
                        switch (v14)
                        {
                        case 56:
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                        case 40:
                            if (*(int *)a1 != 32 && *(int *)a1 != 16)
                                goto LABEL_3cd720;
                            if (!(unsigned int)v29)
                            {
                                sub_3d4490(a1, 0);
                                return 1;
                            }
                            if ((unsigned int)v29 == 3)
                            {
                                *(unsigned int *)&a1[12] = sub_3c918c(a0);
                                *(unsigned int *)&a1[16] = sub_3c918c(a0);
                                v30 = sub_3c918c(a0);
                                *(unsigned int *)&a1[20] = v30;
                                *(int *)&a1[32] = (int)a1[32] + 12;
                                if ((int)a1[12] != (int)a1[16])
                                    return 1;
                                if ((int)a1[16] != v30)
                                    return 1;
                            }
                            break;
                        default:
                            break;
                        }
                    }
                    else if (v14 == 108 || v14 == 124)
                    {
                        *(unsigned int *)&a1[12] = sub_3c918c(a0);
                        *(unsigned int *)&a1[16] = sub_3c918c(a0);
                        *(unsigned int *)&a1[20] = sub_3c918c(a0);
                        *(unsigned int *)&a1[24] = sub_3c918c(a0);
                        if ((unsigned int)v29 != 3)
                            sub_3d4490(a1, v29);
                        sub_3c918c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v2 = &v3;
                        v3 = &v2;
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        v4 = &v5;
                        v5 = &v4;
                        sub_3d706c(a0);
                        sub_3d706c(a0);
                        if (v14 == 124)
                        {
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                            sub_3c918c(a0);
                            return 1;
                        }
                        goto LABEL_3cd720;
                    }
                }
            }
        }
        g_f0b120();
    }
    g_f0b120();
}
