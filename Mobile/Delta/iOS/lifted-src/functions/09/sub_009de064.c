/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de064..0x9de17c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9de064_1 {
    unsigned int field_0;
} st_9de064_1;

typedef struct st_9de064_0 {
    char padding_0[32];
    struct st_9de064_1 *field_20;
    struct st_9de064_1 *field_28;
    struct st_9de064_1 *field_2c;
    unsigned int field_30;
    struct st_9de064_1 *field_34;
    struct st_9de064_1 *field_38;
} st_9de064_0;


st_9de064_0 * sub_9de064(st_9de064_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned int *v19;  // x0
    unsigned int *ptr;  // x19
    unsigned long v21;  // x8
    st_9de064_0 *v22;  // x0
    st_9de064_0 *v23;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned int v16;  // w21
    unsigned int *v17;  // w8
    unsigned int *v18;  // w23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!*(int *)((char *)&a0->field_2c + 4) && !a0->field_30)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        v16 = (int)a0->field_2c;
        v17 = (unsigned int *)(int)a0->field_28;
        if (v17 == *(int *)((char *)&a0->field_28 + 4))
        {
            if (!v17)
                v18 = (unsigned int *)32;
            else
                v18 = v17 * 3 >> 1;
            v19 = sub_a6bf4c();
            if (!v19)
            {
                sub_a368c8();
                sub_a369bc("crypto/bn/bn_ctx.c", 193, "BN_CTX_start");
                v23 = sub_a36abc(3, 109, 0);
                *(int *)((char *)&a0->field_2c + 4) = *(int *)((char *)&a0->field_2c + 4) + 1;
                return v23;
            }
            ptr = v19;
            v21 = (int)a0->field_28;
            if ((unsigned int)v21)
                _memcpy(ptr, a0->field_20, v21 * 4);
            sub_a6c2e4(a0->field_20, "crypto/bn/bn_ctx.c", 277);
            v22 = a0;
            a0->field_20 = ptr;
            *(unsigned int *)((char *)&a0->field_28 + 4) = (unsigned int)v18;
            v17 = (unsigned int *)(int)a0->field_28;
            a0 = v22;
        }
        else
        {
            ptr = a0->field_20;
        }
        *(unsigned int *)&a0->field_28 = (unsigned int)(unsigned int *)((char *)v17 + 1);
        *(unsigned int *)((char *)ptr + 0x4 * v17) = v16;
        return a0;
    }
    *(int *)((char *)&a0->field_2c + 4) = *(int *)((char *)&a0->field_2c + 4) + 1;
    return a0;
}
