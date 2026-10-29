/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f01c..0x4f204 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f01c_1 {
    char padding_0[64];
    unsigned long long field_40;
} st_4f01c_1;

typedef struct st_4f01c_4 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    char padding_38[8];
    struct st_4f01c_3 *field_40;
} st_4f01c_4;

typedef struct st_4f01c_2 {
    unsigned long long field_0;
} st_4f01c_2;

typedef struct st_4f01c_3 {
    struct st_4f01c_2 *field_0;
} st_4f01c_3;

typedef struct st_4f01c_0 {
    char field_0;
} st_4f01c_0;


void sub_4f01c(st_4f01c_1 *a0, st_4f01c_4 *a1)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v22;  // x0
    unsigned long long v23;  // x8
    unsigned long long v24;  // x0
    st_4f01c_3 **v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // x0
    unsigned long long *v18;  // x22
    unsigned long long v19;  // x8
    unsigned long long v20;  // x0
    unsigned long long v21;  // x8
    st_4f01c_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_4f01c_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    char v3;  // [bp-0x40]
    char v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v1 = &v0;
    v0 = &v1;
    v17 = sub_4f204();
    v18 = &a0->field_40;
    v19 = v17 + a0->field_40;
    *v18 = (v19 & 0x8080808080808080) - ((v19 & 0x8080808080808080) >> 7) | v19 & 0x7f7f7f7f7f7f7f7f;
    *(unsigned long long *)&a0[1].padding_0[0] = 0;
    v20 = sub_4f204(a0, a1->field_30);
    v21 = v20 + *v18;
    *v18 = (v21 & 0x8080808080808080) - ((v21 & 0x8080808080808080) >> 7) | v21 & 0x7f7f7f7f7f7f7f7f;
    *(unsigned long long *)&a0[1].padding_0[0] = 0;
    if (a1->padding_38)
    {
        v22 = sub_4f204(a0);
        v23 = v22 + a0->field_40;
        a0->field_40 = (v23 & 0x8080808080808080) - ((v23 & 0x8080808080808080) >> 7) | v23 & 0x7f7f7f7f7f7f7f7f;
        *(unsigned long long *)&a0[1].padding_0[0] = 0;
    }
    v2 = 0x3ff0000000000000;
    if (!sub_4f800(a0, a1->field_28, &v4) || !sub_4f800(a0, a1->field_30, &v3))
    {
LABEL_4f130:
        v25 = a1->field_40;
    }
    else if (a1->padding_38)
    {
        if (!sub_4f800(a0))
            goto LABEL_4f130;
        v24 = sub_4fe30();
        v25 = a1->field_40;
        if (!(v24 >> 31 & 1))
            goto LABEL_4f138;
    }
    else
    {
        v26 = sub_4fe30();
        v25 = a1->field_40;
        if (!(v26 >> 31 & 1))
            goto LABEL_4f138;
    }
LABEL_4f138:
    *v18 = 0;
    v18[1] = 0;
    (*(long long *)*v25)();
}
