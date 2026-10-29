/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23040..0x2344c (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23040_3 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_23040_2 *field_20;
} st_23040_3;

typedef struct st_23040_1 {
    char padding_0[96];
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[4];
    unsigned long long field_98;
    char padding_a0[116];
    long long field_114;
    char padding_11c[44];
    unsigned long long field_148;
    unsigned long long field_150;
    char padding_158[208];
    long long field_228;
} st_23040_1;

typedef struct st_23040_2 {
    long long field_0;
    char field_8;
    char padding_9[39];
    char field_30[2];
    long long field_31;
} st_23040_2;

typedef struct st_23040_0 {
    char field_0;
} st_23040_0;

extern unsigned int g_f00d00;
extern unsigned int g_f00d50;
extern long long g_f0ca50;

st_23040_3 * sub_23040(st_23040_1 *a0, long long *a1, long long a2, unsigned long a3, long long a4)
{
    st_23040_1 *v12;  // x0
    unsigned int v13;  // w8
    st_23040_3 *v14;  // x0
    unsigned long long v16;  // x0
    st_23040_3 *v17;  // x20
    st_23040_3 *v18;  // x0
    st_23040_3 *v19;  // x20
    unsigned long long v0;  // [bp-0xb0], Other Possible Types: unsigned long
    st_23040_0 **v1;  // [bp-0xa0], Other Possible Types: char
    st_23040_0 *v2;  // [bp-0x98]
    uint128_t v3;  // [bp-0x90], Other Possible Types: char, unsigned long, unsigned long long
    unsigned long long v4;  // [bp-0x88]
    uint128_t v5;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x58]
    st_23040_1 *v8;  // [bp-0x50]
    st_23040_1 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v2 = &v1;
    v1 = &v2;
    if (*(long long *)&a0->padding_11c[32] - *(long long *)&a0->padding_11c[24] == 8 && *(int *)&a0->padding_a0[100] == 1)
    {
        if (a0->padding_158[184] == 1)
            goto LABEL_230dc;
LABEL_230a4:
        v8 = a0;
        v9 = a0;
        v7 = &v9;
        if (*(long long *)(a3 + 8))
            goto LABEL_23104;
    }
    else
    {
        sub_1db64(a0, a1, "'export' may only be applied to top-level statements");
        if (a0->padding_158[184] != 1)
            goto LABEL_230a4;
LABEL_230dc:
        sub_1db64(a0, a1, "Exporting values is not compatible with top-level return (export/return conflict)");
        v8 = a0;
        v9 = a0;
        v7 = &v9;
        if (*(long long *)(a3 + 8))
        {
LABEL_23104:
            v12 = a0;
            if (v12->field_80 != 299)
            {
                sub_b814(&v12->field_80);
                v0 = sub_a0c8(&v3);
                sub_1db64(a0, &(&a0->field_80)[1], "Expected 'function' after export declaration with attribute, but got %s instead");
            }
        }
    }
    switch (v13)
    {
    case 299:
        v18 = sub_20418(a0, *a1, a1[1], a2, a3, 1, a4);
        if (v18->field_8 != g_f00d00)
            return v18;
        v19 = v18;
        if (!(sub_24a68(&v9, v18->field_20->field_0, &v18->field_20->field_8) & 1))
        {
            v0 = v19->field_20->field_0;
            sub_1db64(a0, &v19->field_20->field_8, "Duplicate exported identifier '%s'");
        }
        *(unsigned short *)v19->field_20->field_30 = 0x101;
        return v19;
    case 302:
        v5 = *(int128_t *)&(&a0->field_80)[1];
        sub_b1a4(&a0->field_60);
        if ((unsigned int)v3 != 299)
        {
            v3 = 0;
            v4 = 0;
            v14 = sub_20418(a0, *a1, a1[1], a2, &v3, 0, 0);
            sub_1f2d8(&v7, v14, &v5);
            return v14;
        }
        sub_1db64(a0, a1, "'export' must be followed by an identifier or 'function'; try removing 'local'");
        v3 = 0;
        v4 = 0;
        break;
    case 281:
        v3 = *(long long *)((char *)&a0->field_84 + 8);
        if (!sub_1935c(&v3, "const"))
            goto LABEL_232b8;
        v3 = *(int128_t *)&(&a0->field_80)[1];
        sub_f8d0(a0);
        if (a0->field_80 != 299)
        {
            v5 = 0;
            v6 = 0;
            v14 = sub_20418(a0, *a1, a1[1], *(unsigned long long *)&v3, &v5, 1, 0);
            sub_1f2d8(&v7, v14, &v3);
            return v14;
        }
        sub_1db64(a0, a1, "'export' must be followed by an identifier or 'function'");
        v5 = 0;
        v6 = 0;
        break;
    default:
LABEL_232b8:
        if ((char)g_f0ca50 == 1 && a0->field_80 == 281)
        {
            v3 = *(long long *)((char *)&a0->field_84 + 8);
            if (sub_1935c(&v3, "class"))
            {
                sub_f8d0(a0);
                v16 = sub_1ccd0(a0, a1, 1);
                if (!v16)
                {
                    return v16;
                }
                else if (*(int *)(v16 + 8) != g_f00d50)
                {
                    return v16;
                }
                else
                {
                    v17 = v16;
                    if (!(sub_24a68(&v9, *(long long *)*(long long *)(v16 + 32), *(long long *)(v16 + 32) + 8) & 1))
                    {
                        v0 = v17->field_20->field_0;
                        sub_1db64(a0, &v17->field_20->field_8, "Duplicate exported class '%s'");
                    }
                    v17->field_20->field_30[1] = 1;
                    return v17;
                }
            }
        }
        v3 = 0;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        return sub_ebbc(a0, a1, &v3, &v5, "'export' must be followed by an identifier or 'function'");
    }
    return sub_20418(a0);
}
