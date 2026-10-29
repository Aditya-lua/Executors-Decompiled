/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x466b4..0x469d0 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_466b4_1 {
    long long field_0;
    char padding_8[256];
    char field_108;
    char padding_109[1267];
    unsigned int field_5fc;
} st_466b4_1;

typedef struct st_466b4_2 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned long long field_20;
    unsigned long long field_28;
} st_466b4_2;

typedef struct st_466b4_0 {
    char field_0;
} st_466b4_0;

extern char g_e66430;
extern char g_f0c9f0;

unsigned long long sub_466b4(st_466b4_1 *a0, st_466b4_2 *a1, unsigned long long a2)
{
    unsigned int v7;  // w25
    unsigned long v8;  // x21
    long long v17;  // x23
    long long v18;  // x24
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x8
    unsigned long long v22;  // w9
    unsigned long long v23;  // x10
    unsigned long long v24;  // x9
    unsigned long v9;  // x23
    unsigned int v10;  // w0
    unsigned long v11;  // x21
    unsigned long v12;  // x24
    unsigned long v13;  // x24
    unsigned long long v14;  // w23
    long long v15;  // x21
    unsigned long long v16;  // x8
    st_466b4_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_466b4_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    st_466b4_1 *v3;  // [bp-0x60]
    unsigned int v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v3 = a0;
    v4 = a0->field_5fc;
    v7 = a1->field_1c & 0xfffffffe;
    v8 = a1->field_20;
    v9 = a1->field_28;
    v2 = v9;
    v10 = sub_4663c();
    if (v7 != 8 || v10 & 1)
    {
        v11 = v8;
        if (v10)
        {
            v12 = v9;
            v11 = v8;
            goto LABEL_46748;
        }
LABEL_46758:
        v14 = 1;
    }
    else
    {
        v11 = v8;
        if (!sub_4663c(a0, v11))
            goto LABEL_46758;
        v2 = v8;
        v12 = v8;
        v11 = v9;
LABEL_46748:
        v13 = v12;
        if (sub_3a9b4(a0, v13) & 1 || g_f0c9f0 == 1 && sub_45580(a0, v13))
            goto LABEL_46758;
        v14 = 0;
    }
    v15 = sub_385b8(a0, v11, &v3);
    if (v7 == 8)
        v16 = v14;
    else
        v16 = 1;
    if (v16 & 1)
    {
        v17 = sub_3b4b0(a0, a1->field_1c, a2);
        v18 = sub_385b8(a0, v2, &v3);
        v19 = sub_2bc4c(a0->field_0);
        if ((a1->field_1c & 0xfffffffe) == 12)
        {
            sub_2fdb0(a0->field_0, v17, v18, 0);
        }
        else
        {
            sub_2fdb0(a0->field_0, v17, v15, 0);
            v15 = v18;
        }
        sub_31514(a0->field_0, v15);
        v3->field_5fc = v4;
        return v19;
    }
    v20 = sub_3a7e0(&a0->field_108, &v2);
    v21 = v20 + 8;
    if (!v20)
        v21 = 0;
    v22 = *(int *)v21;
    v23 = 72;
    if (v22 == 1)
        v23 = 192;
    if (v22 == 2)
        v23 = 0;
    if (v22 == 3)
        v23 = 224;
    v24 = 216;
    if (v22 == 7)
        v23 = v24;
    goto *((void *)(*(long long *)&(&g_e66430)[v23]));
}
