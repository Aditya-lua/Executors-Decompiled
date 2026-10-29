/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc085b8..0xc086a8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c085b8_0 {
    char padding_0[96];
    unsigned long long field_60;
    struct st_c085b8_1 *field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
} st_c085b8_0;

typedef struct st_c085b8_1 {
    long long field_0;
} st_c085b8_1;


unsigned long long sub_c085b8(unsigned long long *a0)
{
    unsigned long long v13;  // x9
    unsigned long long v14;  // x8
    unsigned long long v15;  // x0
    st_c085b8_0 *v16;  // x20
    unsigned long long v17;  // x21
    unsigned long v18;  // x21
    unsigned long v19;  // x21
    unsigned long long v20;  // 4102
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long v10;  // [bp-0x48]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = *a0;
    if (v13)
    {
        v14 = a0[2];
        v1 = 0;
        v2 = v13;
        v3 = a0[1];
        v5 = 0;
        v6 = v13;
        v7 = a0[1];
        v13 = 1;
    }
    else
    {
        v14 = 0;
    }
    v0 = v13;
    v4 = v13;
    v8 = v14;
    while (1)
    {
        v15 = sub_c086a8(&v9, &v0);
        if (!v9)
            break;
        v16 = v9 + 72 * v10;
        if (v16->field_80)
            _free(v16->field_78 - v16->field_80 * 8 - 8);
        v17 = 0;
        while (1)
        {
            v18 = v17;
            if (v18 == v16->field_70)
                break;
            v19 = v18 + 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v20 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            v17 = v19;
            if (!(v20 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)&v16->field_68[2 * v18]);
                v17 = v19;
            }
        }
        if (v16->field_60)
            _free(v16->field_68);
    }
    return v15;
}
