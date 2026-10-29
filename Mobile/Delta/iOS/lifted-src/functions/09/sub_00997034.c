/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x997034..0x9972a0 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_997034_0 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[57];
    char field_51;
    char field_52;
    char padding_53[13];
    char field_60;
    char padding_61[15];
    char field_70;
    char padding_71[31];
    char field_90;
    char padding_91[15];
    long long field_a0;
    char padding_a8[24];
    char field_c0;
    char padding_c1[1495];
    char field_698;
} st_997034_0;

typedef struct st_997034_2 {
    char padding_0[16];
    unsigned long long field_10;
} st_997034_2;

typedef struct st_997034_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_997034_1;


char sub_997034(st_997034_0 *a0, char i, char a2, long long a3)
{
    long long v2;  // x21
    char v3;  // x23
    char v12;  // x0
    char v13;  // x23
    st_997034_1 *node;  // x24
    unsigned long long v4;  // x22
    unsigned long long v5;  // x8
    unsigned long long v6;  // x23
    unsigned long long v7;  // x10
    char v8;  // x0
    char v9;  // x22
    st_997034_2 *iter;  // x24
    char v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    if (!a2 || (v3 = 0, i >= 2 && !v2))
    {
        if (!*(int *)&a0->padding_0[16])
            v4 = 12;
        else
            v4 = 21;
        v5 = v4 + *(long long *)&a0[2].padding_c1[573];
        if (a0->field_14 == 772)
            v5 += 1;
        v6 = v5 + *(int *)&a0[2].padding_c1[601];
        if (a0->field_52 >> 1 & 1)
        {
            v3 = v6 + 80;
        }
        else if (*(long long *)&a0[2].padding_c1[821])
        {
            (*(long long *)&a0[2].padding_c1[821])();
        }
        else
        {
            v3 = v6 + 1104;
        }
        v7 = v4 + v3 + 80;
        if (!(a0->field_51 & 8))
            v3 = v7;
    }
    if (i)
    {
        if (!a2)
            a2 = v3;
        v8 = *(long long *)&a0->field_60;
        if (*(long long *)&a0->field_70 != a2)
        {
            sub_a6c2e4(v8, "ssl/record/methods/tls_common.c", 190);
            *(unsigned long long *)&a0->field_60 = 0;
        }
        else if (v8)
        {
            goto LABEL_997140;
        }
        v8 = sub_a6bf4c(a2, "ssl/record/methods/tls_common.c", 196);
        if (!v8)
        {
LABEL_997254:
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", 205, "tls_setup_write_buffer");
            sub_996e84(a0, 0xffffffff, 0x8000f, 0);
            return 0;
        }
LABEL_997140:
        memset(&a0->field_60, 0, 48);
        *(unsigned long long *)&a0->field_60 = v8;
        *(unsigned long long *)&a0->field_70 = a2;
        if (i == 1)
        {
            v9 = 1;
        }
        else
        {
            if (!v2)
                v2 = v3;
            iter = &a0->field_90;
            v11 = 1;
            do
            {
                v12 = *(long long *)&iter->padding_0[0];
                if (iter->field_10 != v2)
                {
                    sub_a6c2e4(v12, "ssl/record/methods/tls_common.c", 190);
                    *(unsigned long long *)&iter->padding_0[0] = 0;
                }
                else if (v12)
                {
                    continue;
                }
                v12 = sub_a6bf4c(v2, "ssl/record/methods/tls_common.c", 196);
                if (!v12 && v11 > (unsigned long long)*(long long *)&a0->field_698)
                {
                    *(unsigned long long *)&a0->field_698 = v11;
                    goto LABEL_997254;
                }
                memset(iter, 0, 48);
                *(unsigned long long *)&iter->padding_0[0] = v12;
                v11 += 1;
                iter->field_10 = v2;
                iter += 2;
            } while (i != v11);
            v9 = i;
        }
    }
    else
    {
        v9 = 0;
    }
    v13 = *(long long *)&a0->field_698;
    if (v13 > v9)
    {
        node = &a0->padding_18[24 + 48 * v13];
        do
        {
            if (!*(int *)&node->padding_0[40])
                sub_a6c2e4(*(long long *)&node->padding_0[0], "ssl/record/methods/tls_common.c", 0x88);
            else
                *(unsigned int *)&node->padding_0[40] = 0;
        } while ((v13 -= 1, *(unsigned long long *)&node->padding_0[0] = 0, node = (char *)node - 48, v13 > v9));
    }
    *(unsigned long long *)&a0->field_698 = i;
    return 1;
}
