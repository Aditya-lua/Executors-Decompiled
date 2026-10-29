/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8f1d6c..0x8f20dc (880 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8f1d6c_4 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[8];
    struct st_8f1d6c_1 *field_18;
    char padding_20[120];
    struct st_8f1d6c_5 *field_98;
} st_8f1d6c_4;

typedef struct st_8f1d6c_3 {
    char padding_0[32];
    struct st_8f1d6c_4 *field_20;
} st_8f1d6c_3;

typedef struct st_8f1d6c_2 {
    unsigned int field_0;
} st_8f1d6c_2;

typedef struct st_8f1d6c_1 {
    char padding_0[480];
    struct st_8f1d6c_2 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_8f1d6c_1;

typedef struct st_8f1d6c_5 {
    struct st_8f1d6c_3 *field_0;
} st_8f1d6c_5;

typedef struct st_8f1d6c_0 {
    char field_0;
} st_8f1d6c_0;

typedef struct st_8f1d6c_9 {
    unsigned long long field_0;
} st_8f1d6c_9;

typedef struct st_8f1d6c_6 {
    char padding_0[672];
    struct st_8f1d6c_4 *field_2a0;
    char padding_2a8[312];
    long long field_3e0;
} st_8f1d6c_6;

typedef struct st_8f1d6c_8 {
    char padding_0[48];
    struct st_8f1d6c_9 *field_30;
} st_8f1d6c_8;

typedef struct st_8f1d6c_7 {
    char padding_0[96];
    struct st_8f1d6c_6 *field_60;
} st_8f1d6c_7;

extern st_8f1d6c_7 *g_f0d198;
extern st_8f1d6c_8 *g_f0d3d8;

void sub_8f1d6c(void)
{
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v32;  // x30
    st_8f1d6c_4 *v34;  // x0
    st_8f1d6c_4 *v35;  // w22
    unsigned long v36;  // x23
    unsigned long long v37;  // 4121
    st_8f1d6c_4 **v38;  // x8
    st_8f1d6c_4 *v39;  // x21
    char *v40;  // x0
    st_8f1d6c_4 *i;  // w10
    unsigned long long v24;  // x26
    st_8f1d6c_4 *v42;  // w8
    char *v43;  // x9
    unsigned int v44;  // w11
    unsigned int v45;  // w12
    unsigned long long v25;  // x25
    unsigned long long v26;  // x24
    unsigned long long v27;  // x23
    unsigned long long v28;  // x22
    unsigned long long v29;  // x21
    unsigned long long v30;  // x20
    unsigned long long v31;  // x19
    st_8f1d6c_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_8f1d6c_0 *v1;  // [bp-0xa0]
    st_8f1d6c_4 *v2;  // [bp-0x94]
    st_8f1d6c_0 **v3;  // [bp-0x90], Other Possible Types: char
    st_8f1d6c_0 *v4;  // [bp-0x88]
    st_8f1d6c_0 **v5;  // [bp-0x80], Other Possible Types: char
    st_8f1d6c_0 *v6;  // [bp-0x78]
    st_8f1d6c_5 **v7;  // [bp-0x70]
    st_8f1d6c_5 **v8;  // [bp-0x68]
    unsigned long long v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x58]
    unsigned long long v11;  // [bp-0x50]
    unsigned long long v12;  // [bp-0x48]
    unsigned long long v13;  // [bp-0x40]
    unsigned long long v14;  // [bp-0x38]
    unsigned long long v15;  // [bp-0x30]
    unsigned long long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = &v21;
    v20 = v32;
    v1 = &v0;
    v0 = &v1;
    v2 = (st_8f1d6c_4 *)0;
    sub_3c5de4(sub_8b4808(g_f0d198->field_60->field_3e0, &v2), 8);
    v34 = sub_3c78b8(0);
    if (v34)
    {
        v35 = (st_8f1d6c_4 *)0;
        v4 = &v3;
        v3 = &v4;
        v36 = v34->field_18;
        v6 = &v5;
        v5 = &v6;
        do
        {
            v37 = arm64g_calculate_condition(1, *(int *)(*(long long *)(v36 + 480) + (unsigned long long)v35 * 4), 1, 0);
            if (v37 & 1 || !(v38 = *(long long *)(v36 + 488) + (*(int *)(v36 + 496) + (*(int *)(*(long long *)(v36 + 480) + (unsigned long long)v35 * 4) | ~*(int *)(v36 + 496)) + 1) * 16, !(int)v38[1]))
                continue;
            v39 = *v38;
            v40 = sub_a0c8(v39->field_8);
            v7 = &v8;
            v8 = &v7;
            i = (st_8f1d6c_4 *)*v40;
            if (!i)
                continue;
            v42 = (st_8f1d6c_4 *)0;
            v43 = v40 + 1;
            v44 = 3760312;
            do
            {
                v45 = v44 + ~v44 * 2 + 1;
                v42 = &v42->field_1;
                v44 = 23 * ((v44 ^ -i) + (v45 + (v44 & -i) + (i | ~v45)) * 2 + 2) * v42;
                i = (st_8f1d6c_4 *)*v43;
                v43 += 1;
            } while (i);
            if (v44 == 4176861214 && v39)
            {
                v8 = &v7;
                v7 = &v8;
                if (*(long long *)(*(long long *)v39->field_98 + 32))
                    (*(long long *)(*(long long *)v39->field_98 + 32))();
                goto LABEL_8f1f00;
                goto LABEL_8f1f00;
            }
        } while ((v35 = &v35->field_1, !(v35 >> ((char)*(int *)(v36 + 500) & 31))));
LABEL_8f1f00:
        g_f0d198->field_60->field_2a0 = 0;
    }
    g_f0d3d8->field_30();
}
