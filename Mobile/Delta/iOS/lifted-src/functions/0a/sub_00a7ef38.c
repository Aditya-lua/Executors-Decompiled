/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ef38..0xa7f0b0 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7ef38_0 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    long long field_28;
} st_a7ef38_0;

typedef struct st_a7ef38_1 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[32];
    unsigned int field_38;
    char padding_3c[20];
    long long field_50;
} st_a7ef38_1;

extern unsigned long long g_a7f0b0;
extern unsigned long long g_a7f1e4;

unsigned long long sub_a7ef38(st_a7ef38_0 *a0, st_a7ef38_1 *a1, long long a2)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v21;  // x24
    long long v22;  // x21
    unsigned long long i;  // x8
    unsigned long long v24;  // x9
    unsigned long long v25;  // x11
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long *v18;  // x22
    unsigned long v19;  // x22
    unsigned long long v20;  // x23
    char v0;  // [bp-0x80]
    char *v1;  // [bp-0x48], Other Possible Types: char
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a2)
        return 0;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    if (a1->field_14 == 0x80000)
        v18 = &g_a7f0b0;
    else
        v18 = &g_a7f1e4;
    if (sub_c68800() && sub_a6ebd4(&v0, a0->field_20, a0->field_28))
    {
        if (*(long long *)&a0->padding_0[8])
            v18();
        v19 = a1->field_38;
        v20 = a0->field_10;
        v21 = a0->field_18;
        v22 = v19 + v21;
        if (sub_a6e830(&v0, v22, &v1))
        {
            _bzero(v1, v22);
            if ((int)v21 >= 1)
            {
                i = 0;
                v24 = 0;
                do
                {
                    v25 = 0;
                    do
                    {
                        if (*(int *)(v20 + v25 * 4))
                        {
                            *(char *)(v1 + v24) = v25;
                            v24 += 1;
                        }
                    } while ((v25 += 1, v25 != 0x100));
                    v1[v19 + i & 0xffffffff] = v24;
                    i += 1;
                    v20 += 0x400;
                } while (i != (v21 & 0x7fffffff));
            }
            sub_a6eaf8(&v0);
            return 1;
        }
    }
    sub_a6eaf8(&v0);
    sub_a66ec0(a2, a1->field_50);
    return 0;
}
