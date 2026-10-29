/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac96b8..0xac9800 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac96b8_1 {
    char padding_0[64];
    unsigned int field_40;
} st_ac96b8_1;

typedef struct st_ac96b8_0 {
    char padding_0[32];
    unsigned int field_20;
    unsigned int field_24;
    char field_28;
    char padding_29[63];
    unsigned int field_68;
} st_ac96b8_0;

extern unsigned long long g_ac9000;
extern unsigned long long g_ac9800;
extern unsigned int g_f0d568;

int sub_ac96b8(st_ac96b8_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_ac96b8_1 *v19;  // x21
    unsigned long long *v20;  // x8
    unsigned long long *v21;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // 4180
    unsigned int v17;  // w9
    unsigned long v18;  // x8
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
    v16 = arm64g_calculate_flag_c(1, a0->field_20, (unsigned int)a2 * 8, 0);
    v17 = (unsigned int)(a2 >> 29) + a0->field_24 + (unsigned int)v16;
    a0->field_20 = a0->field_20 + (unsigned int)a2 * 8;
    a0->field_24 = v17;
    v18 = a0->field_68;
    if ((unsigned int)v18)
    {
        v19 = &a0->field_28;
        if (63 >= a2 && 64 > v18 + a2)
        {
            _memcpy(&v19->padding_0[v18]);
            a0->field_68 = a0->field_68 + (unsigned int)a2;
        }
        else
        {
            _memcpy(&v19->padding_0[v18]);
            if (!(g_f0d568 & 0x200))
                v20 = &g_ac9800;
            else
                v20 = &g_ac9000;
            v20();
        }
    }
    else if (a2 >= 64)
    {
        if (!(g_f0d568 & 0x200))
            v21 = &g_ac9800;
        else
            v21 = &g_ac9000;
        v21();
    }
    else if (a2)
    {
        a0->field_68 = a2;
        _memcpy(&a0->field_28);
    }
    return 1;
}
