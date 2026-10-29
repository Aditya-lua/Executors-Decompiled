/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd1104..0xbd11f0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd1104_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_bd1104_1;

typedef struct st_bd1104_0 {
    struct st_bd1104_1 *field_0;
    unsigned long long field_8;
    struct st_bd1104_1 *field_10;
} st_bd1104_0;


unsigned long long * sub_bd1104(st_bd1104_0 *a0, st_bd1104_0 *a1)
{
    unsigned long long *v27;  // x8
    unsigned long long v28;  // x22
    unsigned long v37;  // x15
    unsigned long long *v38;  // x0
    unsigned long long *v39;  // x20
    unsigned long long *v40;  // x0
    unsigned long long v41;  // 4110
    unsigned long long v42;  // 4102
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    unsigned long long v29;  // x21
    unsigned long long v30;  // x20
    unsigned long long v31;  // x19
    unsigned long long v32;  // x30
    unsigned long long *v33;  // x9
    unsigned long v34;  // x11
    unsigned long long *v35;  // x12
    unsigned long long *v36;  // x13
    unsigned long v0;  // [bp-0xd0]
    unsigned long long *v1;  // [bp-0xc8]
    unsigned long long *v2;  // [bp-0xc0]
    unsigned long v3;  // [bp-0xb8]
    unsigned long v4;  // [bp-0xb0]
    unsigned long long *v5;  // [bp-0xa8]
    unsigned long long *v6;  // [bp-0xa0]
    unsigned long v7;  // [bp-0x98]
    unsigned long long *v8;  // [bp-0x90]
    unsigned long v9;  // [bp-0x88]
    unsigned long long *v10;  // [bp-0x80]
    unsigned long long *v11;  // [bp-0x78]
    unsigned long v12;  // [bp-0x70]
    unsigned long v13;  // [bp-0x68]
    unsigned long long *v14;  // [bp-0x60]
    unsigned long long *v15;  // [bp-0x58]
    unsigned long v16;  // [bp-0x50]
    unsigned long long *v17;  // [bp-0x48]
    unsigned long long *v18;  // [bp-0x40]
    unsigned long long *v19;  // [bp-0x38]
    unsigned long long v20;  // [bp-0x30]
    unsigned long long v21;  // [bp-0x28]
    unsigned long long v22;  // [bp-0x20]
    unsigned long long v23;  // [bp-0x18]
    char *v24;  // [bp-0x10]
    unsigned long long v25;  // [bp-0x8]
    char v26;  // [bp+0x0]

    v27 = &a0->field_10->field_0;
    if (v27 != a1->field_10)
        return 0;
    v20 = v28;
    v21 = v29;
    v22 = v30;
    v23 = v31;
    v24 = &v26;
    v25 = v32;
    v33 = &a0->field_0->field_0;
    v34 = v33 != 0;
    if (v33)
        v35 = v27;
    else
        v35 = 0;
    v36 = &a1->field_0->field_0;
    v37 = v36 != 0;
    if (!v36)
        v27 = 0;
    v0 = v34;
    v1 = 0;
    v2 = v33;
    v3 = a0->field_8;
    v4 = v34;
    v5 = 0;
    v6 = v33;
    v7 = a0->field_8;
    v8 = v35;
    v9 = v37;
    v10 = 0;
    v11 = v36;
    v12 = a1->field_8;
    v13 = v37;
    v14 = 0;
    v15 = v36;
    v16 = a1->field_8;
    v17 = v27;
    v18 = 0;
    v19 = 0;
    while (1)
    {
        v38 = sub_bd11f0(&v0);
        if (!v38 || !(v39 = v38, v40 = sub_bd11f0(&v9), v40))
            break;
        if (*v39 != *v40)
            return 0;
        if (v39[1] == v40[1])
        {
            v41 = arm64g_calculate_condition(4, *v39, *v40, 0);
            v42 = arm64g_calculate_condition(20, (v41 & 1 ? v39[2] : 0), (v41 & 1 ? v40[2] : 0), 0);
            if (v42 & 1)
                return 0;
        }
        else
        {
            v43 = arm64g_calculate_condition(4, *v39, *v40, 0);
            v44 = arm64g_calculate_condition(16, (v43 & 1 ? v39[2] : 0), (v43 & 1 ? v40[2] : 0), 0);
            if (v44 & 1)
                return 0;
        }
        if (0)
            return 0;
    }
    return 1;
}
