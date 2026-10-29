/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0464..0xac0564 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0464_1 {
    char padding_0[64];
    unsigned int field_40;
} st_ac0464_1;

typedef struct st_ac0464_0 {
    char padding_0[32];
    unsigned int field_20;
    unsigned int field_24;
    char field_28;
    char padding_29[63];
    unsigned int field_68;
} st_ac0464_0;


long long sub_ac0464(st_ac0464_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // x8
    st_ac0464_1 *v20;  // x21
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x19
    unsigned long long v17;  // 4180
    unsigned int v18;  // w9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a2)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a2;
    v17 = arm64g_calculate_flag_c(1, a0->field_20, (unsigned int)v16 * 8, 0);
    v18 = (unsigned int)(a2 >> 29) + a0->field_24 + (unsigned int)v17;
    a0->field_20 = a0->field_20 + (unsigned int)v16 * 8;
    a0->field_24 = v18;
    v19 = a0->field_68;
    if ((unsigned int)v19)
    {
        v20 = &a0->field_28;
        if (63 >= v16 && 64 > v19 + v16)
        {
            _memcpy(&v20->padding_0[v19]);
            a0->field_68 = a0->field_68 + (unsigned int)v16;
            return 1;
        }
        _memcpy(&v20->padding_0[v19]);
        sub_abe680(a0, v20, 1);
        v16 -= 64 - v19;
        a0->field_68 = 0;
        memset(v20, 0, 64);
    }
    if (v16 >= 64)
    {
        sub_abe680(a0);
        v16 &= 63;
    }
    if (!v16)
        return 1;
    a0->field_68 = v16;
    _memcpy(&a0->field_28);
    return 1;
}
