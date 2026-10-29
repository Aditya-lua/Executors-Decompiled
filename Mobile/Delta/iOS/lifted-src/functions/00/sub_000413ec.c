/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x413ec..0x41af0 (1796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_413ec_3 {
    struct st_413ec_4 *field_0;
    char padding_8[24];
    struct st_413ec_2 *field_20;
} st_413ec_3;

typedef struct st_413ec_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[23];
    long long field_28;
    unsigned int field_30;
    long long field_34;
} st_413ec_1;

typedef struct st_413ec_2 {
    long long field_0;
} st_413ec_2;

typedef struct st_413ec_4 {
    struct st_413ec_2 *field_0;
} st_413ec_4;

typedef struct st_413ec_0 {
    char field_0;
} st_413ec_0;

extern unsigned long long g_e64b68;
extern unsigned long long g_e64b70;
extern unsigned long long g_e656a0;
extern char g_f0ca10;
extern char g_f0ca30;
extern char g_f0ca50;
extern char g_f0cc58;
extern char g_f0ce38;

unsigned long long sub_413ec(void* a0, void* a1, char *a2)
{
    unsigned int v10;  // w25
    long long v11;  // x22
    long long v20;  // x23
    long long len;  // x0
    st_413ec_2 **j;  // x27
    long long len1;  // x0
    st_413ec_2 **iter;  // x23
    long long v25;  // x0
    void* v26;  // x0
    unsigned long v27;  // x8
    long long v28;  // x23
    st_413ec_1 *v29;  // x0
    unsigned long long v12;  // x0
    st_413ec_1 *v30;  // x21
    long long v31;  // x8
    void* v32;  // x8
    char v13;  // x0
    void* v14;  // x8
    long long i;  // x24
    st_413ec_3 *v16;  // x22
    long long v17;  // x24
    unsigned long long v18;  // x23
    long long v19;  // w8
    st_413ec_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_413ec_0 *v1;  // [bp-0xb8]
    char *v2;  // [bp-0xb0], Other Possible Types: unsigned long long *, unsigned long long
    void* v3;  // [bp-0xa8]
    long long v4;  // [bp-0xa0]
    char v5;  // [bp-0x98]
    char v6;  // [bp-0x80]
    void* v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v7 = a1;
    if (g_f0ca10 == 1)
    {
        *(void* *)&a0[1560] = a1;
        if (g_f0ce38 == 1 && sub_47e14(a0))
            sub_3aee0(a0);
    }
    v10 = (int)a0[1532];
    v11 = (long long)v7[80];
    v12 = sub_2a360();
    sub_395b0(a0, v7);
    if ((char)v7[112] == 1)
        sub_2ad10(*(long long *)a0, 65, (int)v7[96] + (v11 != 0) & 0xff, 0, 0);
    v13 = sub_3b87c();
    v14 = v7;
    if ((long long)v14[80])
    {
        sub_3f5c4(a0);
        v14 = v7;
    }
    if ((long long)v14[96])
    {
        i = 0;
        do
        {
            sub_3f5c4(a0, *(long long *)((long long)v14[88] + i * 8), v13 + (v11 != 0) + (int)i & 0xff, 0xffffffff);
            i += 1;
            v14 = v7;
        } while ((unsigned long long)i < (unsigned long long)(long long)v14[96]);
    }
    *(long long *)&a0[1544] = (long long)a0[1592] - (long long)a0[1584] >> 3;
    v16 = (long long)v14[144];
    *(void* *)&a0[1560] = v14;
    if (g_f0ca50 == 1 && sub_47e14(a0))
        sub_475e4(a0, v16);
    if (v16[1].field_0)
    {
        v17 = 0;
        do
        {
            sub_38924(a0, *(long long *)&v16->field_20[v17]);
            v18 = sub_3e65c(a0 + 264, *(long long *)&v16->field_20[v17]);
        } while (!(unsigned int)v18 && (v17 += 1, (unsigned long long)v17 < v16[1].field_0));
        if (g_f0ca10 & 1)
            goto LABEL_415fc;
        if (!(v18 & 1))
            goto LABEL_41634;
    }
    else if (g_f0ca10 == 1)
    {
        v18 = 0;
LABEL_415fc:
        sub_439a4(a0, v16);
        if (!(sub_40910(a0 + 1728) & 1) && sub_47e14(a0))
        {
            sub_3a354(a0);
        }
        else if (!(v18 & 1))
        {
            goto LABEL_41640;
        }
    }
    else
    {
LABEL_41634:
        sub_439a4(a0, v16);
LABEL_41640:
        sub_3b76c(a0, 0);
        sub_2ad10(*(long long *)a0, 22, 0, 1, 0);
    }
    if ((int)a0[8] >= 1 && (int)a0[12] >= 2)
        sub_37ff8(a0, v7);
    sub_2bc5c(*(long long *)a0, (int)v7[12] + 1);
    v19 = (int)a0[12];
    if ((int)a0[12] >= 1)
    {
        v20 = (long long)v7[160];
        if (v20)
        {
            len = _strlen(v20);
            sub_2ad80(*(long long *)a0, v20, len);
            v19 = (int)a0[12];
        }
        if (v19 > 1)
        {
            j = (long long)a0[1608];
            if ((long long)a0[1608] != (long long)a0[1616])
            {
                do
                {
                    len1 = _strlen(*(long long *)*j);
                    sub_2b410(*(long long *)a0, *(long long *)*j, len1);
                    j += 1;
                } while (j != (long long)a0[1616]);
            }
        }
    }
    if ((int)a0[16] >= 1)
    {
        iter = (long long)a0[1608];
        if ((long long)a0[1608] != (long long)a0[1616])
        {
            do
            {
                v2 = *iter;
            } while ((sub_3043c(*(long long *)a0), iter += 1, iter != (long long)a0[1616]));
        }
    }
    if ((int)a0[8] >= 1)
        sub_29e38(*(long long *)a0);
    sub_2ced0(*(long long *)a0);
    v2 = &v6;
    sub_1aedc(&v2);
    sub_46278(a0, 0);
    if (1000000001 <= sub_2bc4c(*(long long *)a0))
    {
        sub_45808(v7 + 12, "Exceeded function instruction limit; split the function into parts to compile");
        __debugbreak();
    }
    v25 = sub_463c8(a0 + 504, &v7);
    if (v25)
    {
        sub_5c38(&v5, v25 + 8);
        sub_29e20(*(long long *)a0, &v5);
    }
    v26 = v7;
    if (!(long long)v26[152] && !((char)a0[1552] & 1))
        *a2 = *a2 | 2;
    if (sub_6ec4(v26))
        *a2 = *a2 | 4;
    if (g_f0ca10 != 1 || sub_40910(a0 + 1728) & 1 || (long long)v7[152])
    {
        if (!((char)a0[1553] & 1))
            goto LABEL_4187c;
LABEL_4185c:
        v27 = g_e64b68;
    }
    else
    {
        *a2 = *a2 | 16;
        if ((char)a0[1553] & 1)
            goto LABEL_4185c;
LABEL_4187c:
        v27 = g_e64b68;
        if (!((char)a0[1576] & 1) && !(char)a0[1577])
            v27 = g_e64b70;
    }
    if (g_f0cc58 == 1)
    {
        goto *((void *)(v27));
    }
    else
    {
        v28 = 0;
        sub_2e8b0(*(long long *)a0, (char)a0[0x600], __ROL__((int)a0[1616] - (int)a0[1608], 29) & 0xe00000ff & 0xff, *a2, 0);
        sub_3b960(a0 + 104, &v7);
        v29 = sub_3c28c(a0 + 104, &v7);
        v30 = v29;
        v29->field_8 = v12;
        sub_1a5f0(&v30->field_10, a0 + 1608);
        if ((int)a0[8] >= 2 && !((char)v7[112] & 1) && !(long long)v7[80] && !((char)a0[1576] & 1) && !((char)a0[1577] & 1))
        {
            if (g_f0ca30 == 1 && sub_77f4() & 1)
                v31 = 0;
            else
                v31 = 1;
            *(char *)&(&v30->field_30)[1] = v31;
            v30->field_30 = (int)a0[0x600];
            v32 = v7;
            v28 = sub_4eb3c((long long)v32[144], (long long)v32[88], (long long)v32[96], a0 + 424, a0 + 264);
            v32 = v7;
            v30->field_28 = v28;
            if (sub_3e65c(a0 + 264, (long long)v32[144]))
            {
                v2 = &g_e656a0;
                v3 = a0;
                v4 = 1;
                (*(long long *)v16->field_0)();
            }
        }
        sub_c84c(a0 + 1608, (long long)a0[1608]);
        *(unsigned int *)&a0[0x600] = 0;
        *(unsigned long long *)&a0[1544] = 0;
        *(unsigned short *)&a0[1552] = 0;
        *(unsigned long long *)&a0[1560] = 0;
        *(unsigned int *)&a0[1532] = v10;
        return v12;
    }
}
