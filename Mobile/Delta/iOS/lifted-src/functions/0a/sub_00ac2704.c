/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2704..0xac27ec (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2704_1 {
    char padding_0[128];
    unsigned int field_80;
} st_ac2704_1;

typedef struct st_ac2704_0 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
    char field_50;
    char padding_51[127];
    unsigned int field_d0;
} st_ac2704_0;


long long sub_ac2704(st_ac2704_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x9
    unsigned long v20;  // x8
    unsigned long long v21;  // x22
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x20
    st_ac2704_1 *v17;  // x21
    unsigned long v18;  // 4171
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
    v17 = &a0->field_50;
    v18 = arm64g_calculate_flag_c(2, a0->field_40, a2 * 8, 0);
    v19 = (a2 >> 61) + a0->field_48 + v18;
    a0->field_40 = a0->field_40 + a2 * 8;
    a0->field_48 = v19;
    v20 = a0->field_d0;
    if ((unsigned int)v20)
    {
        v21 = 128 - v20;
        if (v21 > v16)
        {
            _memcpy(&v17->padding_0[v20]);
            a0->field_d0 = a0->field_d0 + (unsigned int)v16;
            return 1;
        }
        _memcpy(&v17->padding_0[v20]);
        a0->field_d0 = 0;
        sub_ac0d40(a0, v17, 1);
        v16 -= v21;
    }
    if (v16 >= 128)
    {
        sub_ac0d40(a0);
        v16 &= 127;
    }
    if (!v16)
        return 1;
    _memcpy(v17);
    a0->field_d0 = v16;
    return 1;
}
