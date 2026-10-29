/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99051c..0x990604 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99051c_0 {
    struct st_99051c_1 *field_0;
    struct st_99051c_2 *field_8;
} st_99051c_0;

typedef struct st_99051c_2 {
    unsigned long long field_0;
} st_99051c_2;

typedef struct st_99051c_1 {
    char field_0;
} st_99051c_1;


unsigned long long * sub_99051c(st_99051c_0 *a0, unsigned long long *a1, char *a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    char *v19;  // x8
    unsigned long long *v20;  // x9
    unsigned long long *v21;  // x23
    unsigned long long *v22;  // x0
    char *v23;  // x1
    unsigned long long *v24;  // x8
    unsigned long long *v25;  // x2
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long *v16;  // x22
    unsigned long long v17;  // x0
    unsigned long long *v18;  // x9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (a0->field_8 < v16)
        return 0;
    v17 = sub_a7b0d8(a0->field_0);
    v18 = a0->field_8;
    v19 = a0->field_0 + v16;
    v20 = v18 - v16;
    a0->field_0 = v19;
    a0->field_8 = v20;
    if (v18 != v16)
    {
        v21 = 1 << (*v19 >> 6 & 63);
        if (v20 >= v21)
        {
            v22 = sub_a7b0d8(v19);
            v23 = a0->field_0 + v21;
            v24 = a0->field_8 - v21;
            a0->field_0 = v23;
            a0->field_8 = v24;
            if (v24 >= v22)
            {
                v25 = v22;
                a0->field_0 = v23 + v22;
                a0->field_8 = v24 - v22;
                if (a1)
                    *a1 = v17;
                if (v25 <= 20)
                {
                    *a2 = (char)v25;
                    _memcpy(a2 + 1);
                    return 1;
                }
            }
        }
    }
    return 0;
}
