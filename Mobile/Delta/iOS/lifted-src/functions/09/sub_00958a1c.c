/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958a1c..0x958ae8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958a1c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_958a1c_1;

typedef struct st_958a1c_0 {
    struct st_958a1c_1 *field_0;
    char padding_8[24];
    struct st_958a1c_1 *field_20;
    long long field_28;
} st_958a1c_0;


long long sub_958a1c(st_958a1c_0 *a0, long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    long long v19;  // x10
    long long v20;  // x21
    long long v21;  // x22
    unsigned long long *v22;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x8
    unsigned long long *v17;  // x9
    long long v18;  // x10
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_28;
    if (!v16)
        return 0;
    v17 = &a0->field_20->field_0;
    v18 = v16;
    do
    {
        v19 = v18;
        if (*v17 == a1 && v17[1])
        {
            a0->field_0 = v17;
            return 1;
        }
    } while ((v17 += 5, v18 = v19 - 1, v19 != 1));
    v20 = 0;
    v21 = 0;
    do
    {
        v22 = &a0->field_20->field_0;
        if (*(long long *)((char *)v22 + v20 + 8) && *(long long *)((char *)v22 + v20))
        {
            if (sub_af1a9c(*(long long *)((char *)v22 + v20), a1))
            {
                v16 = a0->field_28;
            }
            else
            {
                a0->field_0 = (char *)v22 + v20;
                return 1;
            }
        }
    } while ((v21 += 1, v20 += 40, (unsigned long long)v16 > (unsigned long long)v21));
    return 0;
}
