/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd9a4..0x9fdac0 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd9a4_1 {
    char padding_0[8];
    char field_8;
    char padding_9[95];
    unsigned int field_68;
    char padding_6c[4];
    unsigned int field_70;
    char padding_74[4];
    unsigned int field_78;
    char padding_7c[4];
    unsigned int field_80;
} st_9fd9a4_1;

typedef struct st_9fd9a4_0 {
    char padding_0[8];
    char field_8;
    char padding_9[103];
    long long field_70;
    char padding_78[8];
    unsigned int field_80;
    char padding_84[20];
    char field_98;
    char padding_99[23];
    long long field_b0;
} st_9fd9a4_0;


st_9fd9a4_1 * sub_9fd9a4(st_9fd9a4_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_9fd9a4_1 *v17;  // x0
    unsigned int v18;  // x8
    unsigned int v19;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x21
    long long v13;  // x0
    unsigned int v14;  // x0
    st_9fd9a4_1 *v15;  // x20
    st_9fd9a4_1 *v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (*(long long *)&a0->padding_99[15])
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a1;
    v13 = sub_9ff990();
    if (v13 != sub_9ff2e4(v13))
        return 0;
    v14 = sub_9ffb30(a0->field_b0);
    if (!v14)
        return v14;
    v15 = (st_9fd9a4_1 *)v14;
    v15->field_68 = sub_9ffd38(a0);
    if (!(v12 >> 2 & 1))
    {
        v16 = v15;
        v15->field_80 = a0->field_80;
        v17 = v16;
        if (!((unsigned int)v12 & 3))
            goto LABEL_9fda8c;
    }
    else
    {
        v16 = v15;
        v17 = v16;
        if (sub_a60efc(&v15->field_8, &a0->field_8))
        {
            v16->field_80 = a0->field_80;
            if (v12 >> 1 & 1 && a0->field_70)
            {
                v18 = sub_9e4b00(a0->field_70);
                v16 = v15;
                *(unsigned long long *)&v15->field_70 = v18;
                v17 = v16;
                if (v18)
                    goto LABEL_9fda68;
            }
            else
            {
LABEL_9fda68:
                if (!(v12 & 1) || !a0->padding_78 || (v19 = sub_9e4b00(a0->padding_78), v16 = v15, *(unsigned long long *)&v15->field_78 = v19, v17 = v16, v19))
                {
LABEL_9fda8c:
                    v17 = v15;
                    if (sub_a6a674(6, &v16[1].padding_9[11], &a0->field_98))
                        return v15;
                }
            }
        }
    }
    sub_9ffb3c(v17);
    return 0;
}
