/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a3554..0x2a38a4 (848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a3554_0 {
    char field_0;
} st_2a3554_0;

typedef struct st_2a3554_3 {
    char padding_0[376];
    struct st_2a3554_4 *field_178;
} st_2a3554_3;

typedef struct st_2a3554_4 {
    unsigned long long field_0;
} st_2a3554_4;

typedef struct st_2a3554_2 {
    char padding_0[96];
    void* field_60;
} st_2a3554_2;

extern st_2a3554_2 *g_f0d198;
extern st_2a3554_4 *g_f0d368;
extern st_2a3554_3 *g_f0d3d8;

void sub_2a3554(void* a0)
{
    unsigned long long v17;  // x28
    unsigned long long v18;  // x27
    unsigned long long v27;  // x30
    unsigned long v28;  // x8
    void* v29;  // x9
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4102
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    st_2a3554_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_2a3554_0 *v1;  // [bp-0x88]
    st_2a3554_0 **v2;  // [bp-0x80], Other Possible Types: char
    st_2a3554_0 *v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v1 = &v0;
    v0 = &v1;
    v28 = *(long long *)(*(long long *)((long long)a0[8] + 24) + 48);
    v29 = g_f0d198->field_60;
    v30 = v28;
    if (v28 == (long long)v29[1408] && (char)a0[2] < 0)
    {
        if (v28)
        {
            v31 = arm64g_calculate_condition(20, v30, (long long)v29[1408], 0);
            v32 = arm64g_calculate_condition(4, (v31 & 1 ? (long long)a0[80] : 0x40000000), (v31 & 1 ? (long long)v29[1664] : 0), 0);
            if (!(v32 & 1))
                goto LABEL_2a35c8;
        }
        else
        {
            v33 = arm64g_calculate_condition(20, v30, (long long)v29[1408], 0);
            v34 = arm64g_calculate_condition(0, (v33 & 1 ? (long long)a0[80] : 0x40000000), (v33 & 1 ? (long long)v29[1664] : 0), 0);
            if (!(v34 & 1))
            {
LABEL_2a35c8:
                v3 = &v2;
                v2 = &v3;
                g_f0d3d8->field_178();
            }
        }
    }
    g_f0d368();
}
