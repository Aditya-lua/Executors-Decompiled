/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12548..0x12604 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12548_0 {
    uint128_t field_0;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char field_28;
} st_12548_0;

typedef struct st_12548_1 {
    char field_0;
} st_12548_1;


double sub_12548(void* a0, char a1)
{
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long v19;  // x22
    unsigned long long v20;  // x0
    st_12548_0 *v21;  // x8
    st_12548_1 **v0;  // [bp-0x78], Other Possible Types: char
    st_12548_1 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50], Other Possible Types: char
    unsigned long v5;  // [bp-0x40]
    char v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v7 = v14;
    v8 = v15;
    v9 = v16;
    v10 = v17;
    v11 = &v13;
    v12 = v18;
    v1 = &v0;
    v0 = &v1;
    sub_107a4();
    if (!(v6 & 1))
    {
        v2 = (long long)a0[296];
        v3 = (int128_t)a0[132];
        sub_19994(&v4, &v2);
    }
    if ((int)a0[128] == 58)
        v19 = (long long)a0[132];
    else
        v19 = 0xffffffffffffffff;
    v20 = sub_20fe8(a0);
    if (!(char)a0[88])
        v19 = 0xffffffffffffffff;
    v21->field_0 = v4;
    v21->field_10 = v5;
    v21->field_18 = v20;
    v21->field_20 = v19;
    v21->field_28 = a1;
    return *(unsigned long long *)&v4;
}
