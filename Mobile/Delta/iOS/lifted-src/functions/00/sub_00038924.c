/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x38924..0x38f54 (1584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_38924_2 {
    char padding_0[12];
    unsigned int field_c;
} st_38924_2;

typedef struct st_38924_1 {
    long long field_0;
    int field_8;
    char padding_c[132];
    char field_90;
    char padding_91[119];
    char field_108;
    char padding_109[1267];
    unsigned int field_5fc;
    char padding_600[32];
    unsigned long long field_620;
    char padding_628[8];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    char field_660;
    char padding_661[31];
    void* field_680;
    char padding_688[8];
    unsigned long long field_690;
    unsigned long long field_698;
} st_38924_1;

typedef struct st_38924_0 {
    char field_0;
} st_38924_0;

extern unsigned int g_f00b70;
extern unsigned int g_f00c20;
extern unsigned int g_f00c30;
extern unsigned int g_f00c40;
extern unsigned int g_f00c50;
extern unsigned int g_f00c60;
extern unsigned int g_f00c70;
extern unsigned int g_f00c80;
extern unsigned int g_f00c90;
extern unsigned int g_f00ca0;
extern unsigned int g_f00cb0;
extern unsigned int g_f00cc0;
extern unsigned int g_f00cd0;
extern unsigned int g_f00ce0;
extern unsigned int g_f00cf0;
extern unsigned int g_f00d00;
extern unsigned int g_f00d10;
extern unsigned int g_f00d20;
extern unsigned int g_f00d50;
extern char g_f0ca10;
extern char g_f0ca50;
extern char g_f0ce38;

unsigned long long sub_38924(st_38924_1 *a0, char idx)
{
    unsigned long long v6;  // x0
    unsigned int v7;  // w8
    char v16;  // x21
    unsigned long long i;  // x22
    unsigned long long v18;  // x22
    unsigned long v19;  // x21
    long long v20;  // x21
    long long len;  // x0
    unsigned long long v22;  // x0
    long long v23;  // x0
    long long len1;  // x0
    char v25;  // x0
    unsigned long long v8;  // x23
    unsigned long long v26;  // x0
    long long v27;  // x21
    unsigned long long *v28;  // x20
    st_38924_2 *v29;  // x0
    unsigned long long v30;  // x0
    unsigned long long v9;  // x24
    unsigned int v10;  // w22
    char v11;  // x26
    long long v12;  // x20
    unsigned long long v13;  // x0
    unsigned long long v14;  // x20
    void* v15;  // x8
    st_38924_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_38924_0 *v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_395b0();
    if (*(int *)&a0->padding_c[8] >= 1)
    {
        v6 = sub_400d8(a0, idx);
        if ((unsigned int)v6)
            v6 = sub_2ad10(a0->field_0, 69, 0, 0, 0);
    }
    v7 = *(int *)(idx + 8);
    if (idx && v7 == g_f00c20)
    {
        if (g_f0ca10 == 1)
            a0->field_620 = a0->field_620 + 1;
        v8 = a0->field_638;
        v9 = a0->field_630;
        v10 = a0->field_5fc;
        if (*(long long *)(idx + 40))
        {
            v11 = 0;
            do
            {
                sub_38924(a0, *(long long *)(*(long long *)(idx + 32) + v11 * 8));
            } while (!sub_3e65c(&a0->field_108, *(long long *)(*(long long *)(idx + 32) + v11 * 8)) && (v11 += 1, v11 < (unsigned long long)*(long long *)(idx + 40)));
            if (g_f0ca10 & 1)
                goto LABEL_38a1c;
        }
        else if (g_f0ca10)
        {
LABEL_38a1c:
            a0->field_620 = a0->field_620 - 1;
        }
        v12 = (long long)(v8 - v9) >> 3;
        sub_3b76c(a0, v12);
        v13 = sub_46278(a0, v12);
        a0->field_5fc = v10;
        return v13;
    }
    if (idx && v7 == g_f00c30)
        return sub_48688(a0, idx);
    if (idx && v7 == g_f00c40)
        return sub_4645c(a0, idx);
    if (idx && v7 == g_f00c50)
        return sub_3bc78(a0, idx);
    if (v7 == g_f00c60)
    {
        sub_3b76c(a0, *(long long *)((char *)a0->field_680 - 24));
        v14 = sub_2bc4c(a0->field_0);
        sub_2fdb0(a0->field_0, 23, 0, 0);
        v2 = 0;
    }
    else if (idx && v7 == g_f00c70)
    {
        v15 = a0->field_680;
        if (!*(long long *)((char *)v15 - 8))
            *(unsigned long long *)((char *)v15 - 8) = idx;
        sub_3b76c(a0, *(long long *)((char *)v15 - 16));
        v14 = sub_2bc4c(a0->field_0);
        sub_2fdb0(a0->field_0, 23, 0, 0);
        v2 = 1;
    }
    else
    {
        if (idx && v7 == g_f00c80)
        {
            if (a0->field_8 < 2 || a0->field_690 == a0->field_698)
                return sub_455c8(a0, idx);
            return sub_40814(a0, idx, 0);
            return sub_455c8(a0, idx);
        }
        if (idx && v7 == g_f00c90)
        {
            if (!*(long long *)(idx + 32) || *(int *)(*(long long *)(idx + 32) + 8) != g_f00b70)
                return sub_4716c(a0);
            return sub_3d4b0(a0);
            return sub_4716c(a0);
        }
        if (idx && v7 == g_f00ca0)
        {
            if (g_f0ca10 != 1 || !*(long long *)(idx + 40))
                return sub_47230(a0, idx);
            v16 = *(long long *)(idx + 32);
            i = *(long long *)(idx + 40) * 8;
            do
            {
                v18 = i;
                v19 = v16 + 8;
                sub_3aea0(a0, *(long long *)v16, idx + 12);
                i = v18 - 8;
                v16 = v19;
            } while (i);
            return sub_47230(a0, idx);
        }
        if (idx && v7 == g_f00cb0)
            return sub_3e8a4(a0, idx);
        if (idx && v7 == g_f00cc0)
            return sub_3f8e8(a0, idx);
        if (idx && v7 == g_f00cd0)
            return sub_42688(a0, idx);
        if (idx && v7 == g_f00ce0)
            return sub_3fc90(a0, idx);
        if (idx && v7 == g_f00cf0)
            return sub_3a86c(a0, idx);
        if (idx && v7 == g_f00d00)
        {
            if (g_f0ca10 == 1 && !(g_f0ce38 & 1) && *(char *)(*(long long *)(idx + 32) + 49) == 1)
            {
                sub_3aea0(a0);
                sub_45d78(a0, idx);
                v20 = sub_3b87c(a0, idx, 1);
                sub_39788(a0, *(long long *)(idx + 40), v20);
                len = _strlen(*(long long *)*(long long *)(idx + 32));
                v22 = sub_2df40(a0->field_0, *(long long *)*(long long *)(idx + 32), len);
                if (!(v22 >> 31 & 1))
                {
                    v23 = sub_3baf4(a0, idx);
                    len1 = _strlen(*(long long *)*(long long *)(idx + 32));
                    v25 = sub_2ffe8(*(long long *)*(long long *)(idx + 32), len1);
                    sub_2ad10(a0->field_0, 16, v20, v23, v25);
                    v26 = sub_31514(a0->field_0, v22);
                    a0->field_5fc = a0->field_5fc;
                    return v26;
                }
                sub_45808(*(long long *)(idx + 32) + 8, "Exceeded constant limit; simplify the code to compile");
                __debugbreak();
            }
            v27 = sub_3b87c(a0, idx, 1);
            v28 = idx + 32;
            sub_3f5c4(a0, *(long long *)(idx + 32), v27, 0xffffffff);
            sub_39788(a0, v28[1], v27);
            sub_3c0f0(&a0->field_90, v28);
            v29 = sub_3f3c0(&a0->field_90, v28);
            v30 = sub_2b4f8(a0->field_0);
            v29->field_c = v30;
            return v30;
        }
        if (v7 == g_f00d10)
        {
            return v6;
        }
        else if (v7 == g_f00d20)
        {
            return v6;
        }
        else if (g_f0ca50 != 1)
        {
            return v6;
        }
        else if (v7 != g_f00d50)
        {
            return v6;
        }
        else
        {
            return sub_39d04(a0, idx);
        }
    }
    v3 = v14;
    return sub_15cac(&a0->field_660, &v2);
}
