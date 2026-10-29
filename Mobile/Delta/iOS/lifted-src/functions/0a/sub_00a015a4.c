/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa015a4..0xa016b0 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a015a4_0 {
    char padding_0[8];
    char field_8;
    char padding_9[95];
    long long field_68;
    char padding_70[8];
    unsigned int field_78;
    char padding_7c[20];
    char field_90;
    char padding_91[39];
    long long field_b8;
} st_a015a4_0;

typedef struct st_a015a4_1 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned int field_78;
} st_a015a4_1;


st_a015a4_1 * sub_a015a4(st_a015a4_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x8
    unsigned long long v18;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x21
    long long v13;  // x0
    unsigned long long v14;  // x0
    st_a015a4_1 *v15;  // x0
    st_a015a4_1 *v16;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (*(long long *)&a0->padding_91[23])
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a1;
    v13 = sub_a01e1c();
    if (v13 != sub_a02240(v13))
        return 0;
    v14 = sub_a01fbc(a0->field_b8);
    if (!v14)
        return v14;
    if (!(v12 >> 2 & 1))
    {
        *(unsigned int *)(v14 + 120) = a0->field_78;
        v15 = v14;
        if (!((unsigned int)v12 & 3))
            goto LABEL_a01678;
    }
    else
    {
        v16 = v14;
        v15 = v16;
        if (sub_a60efc(v14 + 8, &a0->field_8) && !(v15->field_78 = a0->field_78, v12 >> 1 & 1 && a0->field_68 && !(v12 = v12, v17 = sub_9e4b00(a0->field_68), v15 = v16, v16->field_68 = v17, v17)))
        {
            if (!(v12 & 1) || !a0->padding_70 || (v18 = sub_9e4b00(a0->padding_70), v15 = v16, v16->field_70 = v18, v18))
            {
LABEL_a01678:
                if (sub_a6a674(7, &v15[1].padding_0[20], &a0->field_90))
                    return v15;
            }
        }
    }
    sub_a01fd4();
    return 0;
}
