/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8e7c..0xbd8f3c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8e7c_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bd8e7c_1;

typedef struct st_bd8e7c_0 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bd8e7c_0;


double sub_bd8e7c(void* a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long v10;  // x10
    st_bd8e7c_0 *v11;  // x10
    uint128_t v12;  // q0
    char v0;  // [bp-0x60], Other Possible Types: unsigned long
    st_bd8e7c_1 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x30]
    unsigned int v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a2;
    if (a1[5] <= v10 || (v11 = a1[4] + v10 * 32, v11->field_0 == 0x8000000000000000))
        v12 = CONCAT(0xffffffffffffffff, 0xffffffffffffffff);
    else
        v12 = *(unsigned long long *)&v11->field_18;
    v7 = a2;
    v4 = a1[7];
    v5 = a1[8];
    v6 = *(unsigned long long *)&v12;
    v3 = 0;
    sub_b9b9f0(&v0, &v3);
    if (v2 == 1)
    {
        v12 = v1->field_0;
        *(uint128_t *)a0 = v12;
        *(unsigned long long *)&a0[16] = v1->field_10;
        if (!v0)
            return *(unsigned long long *)&v12;
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        if (!v0)
            return *(unsigned long long *)&v12;
    }
}
