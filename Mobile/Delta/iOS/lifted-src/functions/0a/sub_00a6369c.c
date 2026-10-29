/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6369c..0xa637e0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6369c_1 {
    char padding_0[8];
    struct st_a6369c_2 *field_8;
} st_a6369c_1;

typedef struct st_a6369c_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_a6369c_0;

typedef struct st_a6369c_4 {
    char padding_0[24];
    struct st_a6369c_3 *field_18;
} st_a6369c_4;

typedef struct st_a6369c_3 {
    char padding_0[32];
    struct st_a6369c_1 *field_20;
} st_a6369c_3;

typedef struct st_a6369c_5 {
    char padding_0[40];
    struct st_a6369c_3 *field_28;
} st_a6369c_5;

typedef struct st_a6369c_6 {
    char padding_0[56];
    struct st_a6369c_3 *field_38;
} st_a6369c_6;

typedef struct st_a6369c_2 {
    unsigned long long field_0;
} st_a6369c_2;


void sub_a6369c(st_a6369c_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // x23
    unsigned long v20;  // x8
    st_a6369c_1 *v21;  // x9
    st_a6369c_4 *v22;  // x9
    st_a6369c_5 *v23;  // x9
    st_a6369c_6 *v24;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // 4149
    st_a6369c_3 *v17;  // x22
    unsigned long i;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = arm64g_calculate_condition(2, a0->field_10, 1, 0);
    if (!(v16 & 1))
    {
        v17 = 0;
        i = a0->field_10 + 1;
        do
        {
            v19 = i;
            v20 = a0->field_0;
            v21 = &v17->padding_0[v20];
            if (v21->field_8)
                (*(long long *)(*(long long *)&v21->field_8[4] + 8))();
            v22 = &v17->padding_0[v20];
            if (v22->field_18)
                v22->field_18->field_20->field_8();
            v23 = &v17->padding_0[v20];
            if (v23->field_28)
                v23->field_28->field_20->field_8();
            v24 = &v17->padding_0[v20];
            if (v24->field_38)
                v24->field_38->field_20->field_8();
            v17 = &v17[1].padding_0[24];
            i = v19 - 1;
        } while (i);
    }
    sub_a6c2e4(a0->field_8, "crypto/hashtable/hashtable.c", 280);
    sub_a6c2e4();
    return;
}
