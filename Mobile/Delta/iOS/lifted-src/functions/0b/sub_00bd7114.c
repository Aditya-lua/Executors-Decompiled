/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd7114..0xbd71f0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd7114_1 {
    char padding_0[1];
    struct st_bd7114_0 *field_1;
} st_bd7114_1;

typedef struct st_bd7114_4 {
    struct st_bd7114_2 *field_0;
    struct st_bd7114_0 *field_8;
} st_bd7114_4;

typedef struct st_bd7114_2 {
    struct st_bd7114_3 *field_0;
    struct st_bd7114_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_bd7114_2;

typedef struct st_bd7114_0 {
    struct st_bd7114_0 *field_0;
} st_bd7114_0;

typedef struct st_bd7114_3 {
    char field_0;
} st_bd7114_3;


void sub_bd7114(st_bd7114_4 *a0)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_bd7114_0 **v21;  // x20
    unsigned long long v22;  // 4110
    st_bd7114_0 **v23;  // x21
    unsigned long long v24;  // x9
    st_bd7114_1 *v25;  // x8
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_bd7114_2 *v20;  // x19
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a0->field_0;
    v21 = a0->field_8;
    if (v21)
    {
        v22 = arm64g_calculate_condition(2, v20->field_8, 1, 0);
        if (!(v22 & 1))
        {
            v23 = 0;
            do
            {
                if (*(char *)(v20->field_0 + v23) == 128)
                {
                    v24 = v20->field_8 & (char *)v23 - 8;
                    *(char *)(v20->field_0 + v23) = 0xff;
                    *(char *)&v20->field_0[8 + v24] = 0xff;
                    v21();
                }
            } while ((v23 = (char *)v23 + 1, (v20->field_8->padding_0)[1] != v23));
        }
    }
    v25 = v20->field_8;
    if (v25 >= 8)
        v25 = ((v25->padding_0)[1] >> 3) * 7;
    v20->field_10 = &(v25->padding_0)[-1 * v20->field_18];
    return;
}
