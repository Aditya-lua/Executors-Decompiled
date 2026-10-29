/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c12a4..0x1c1650 (940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c12a4_1 {
    char padding_0[24];
    unsigned int field_18;
} st_1c12a4_1;

typedef struct st_1c12a4_2 {
    struct st_1c12a4_0 *field_0;
} st_1c12a4_2;

typedef struct st_1c12a4_0 {
    char field_0;
} st_1c12a4_0;

extern unsigned long long g_e715e8;
extern unsigned long long g_e71658;

char * sub_1c12a4(st_1c12a4_1 *a0, char *a1, char *a2, long long a3)
{
    char *v13;  // x20
    unsigned int v14;  // w8
    char *v23;  // x22
    unsigned int v24;  // w8
    char *v25;  // x0
    char *v26;  // x0
    char *v27;  // x0
    char *v15;  // x9
    st_1c12a4_1 *v17;  // x21
    unsigned int v18;  // w23
    unsigned int v19;  // w8
    char *v20;  // x2
    unsigned int v21;  // w9
    char *v22;  // x8
    st_1c12a4_0 **v0;  // [bp-0xb8], Other Possible Types: char
    st_1c12a4_0 *v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    char v3;  // [bp-0x90]
    st_1c12a4_0 *v4;  // [bp-0x78], Other Possible Types: st_1c12a4_2 **, unsigned long
    unsigned long v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    unsigned long v7;  // [bp-0x60]
    unsigned long v8;  // [bp-0x58]
    unsigned long v9;  // [bp-0x50]
    st_1c12a4_0 **v10;  // [bp-0x48], Other Possible Types: st_1c12a4_2 **, char
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a1;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return v13;
    v14 = *v13;
    if (v14 == 93)
        return v13;
    v15 = v13 + 1;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    if (v15 != a2 && v14 == 91)
    {
        switch (*v15)
        {
        case 46:
            v13 = sub_1b5580();
LABEL_1c1334:
            v17 = a0;
            v18 = a0->field_18 & 496;
            v4 = &v10;
            v10 = &v4;
            if (!sub_6b08(&v7))
            {
                if ((v18 | 64) == 64)
                {
                    v19 = *v13;
                    if (v19 != 92)
                        goto LABEL_1c13dc;
                    if (v18)
                        v13 = sub_1b4794(v17, v13 + 1, a2, &v7);
                    else
                        v13 = sub_1b501c(v17, v13 + 1, a2, &v7, a3);
                }
                else
                {
                    v19 = *v13;
LABEL_1c13dc:
                    v7 = (char)v19;
                    v13 += 1;
                }
            }
            v20 = a2;
            if (v13 != v20)
            {
                v21 = *v13;
                if (v21 != 93)
                {
                    v22 = v13 + 1;
                    if (v22 != v20 && v21 == 45 && *v22 != 93)
                    {
                        v4 = 0;
                        v5 = 0;
                        v6 = 0;
                        v23 = v13 + 2;
                        if (v23 != v20 && *v22 == 91 && *v23 == 46)
                        {
                            sub_1b5580(v17, v13 + 3);
                            goto LABEL_1c156c;
                        }
                        else if ((v18 | 64) == 64)
                        {
                            v24 = *v22;
                            if (v24 != 92)
                                goto LABEL_1c1548;
                            if (v18)
                                sub_1b4794(v17, v23);
                            else
                                sub_1b501c(v17, v23);
LABEL_1c156c:
                        }
                        else
                        {
                            v24 = *v22;
LABEL_1c1548:
                            v4 = (char)v24;
                        }
                        sub_5c38(&v3, &v7);
                        sub_5c38(&v2, &v4);
                        sub_1b3978(a3, &v3, &v2);
                        goto *((void *)(g_e71658));
                    }
                }
            }
            v4 = &v10;
            v10 = &v4;
            if (sub_6b08(&v7))
            {
                if (sub_6b08(&v7) == 1)
                {
                    v25 = sub_9c78(&v7, 0);
                    sub_1af524(a3, *v25);
                }
                else
                {
                    v26 = sub_9c78(&v7, 0);
                    v27 = sub_9c78(&v7, 1);
                    sub_1b4278(a3, *v26, *v27);
                }
            }
            goto *((void *)(g_e71658));
        case 58:
            sub_1bc408();
        case 61:
            sub_1a75c4();
            break;
        default:
            goto LABEL_1c1330;
        }
        goto *((void *)(g_e715e8));
    }
    else
    {
LABEL_1c1330:
        goto LABEL_1c1334;
    }
}
