/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41cf2c..0x41d004 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41cf2c_0 {
    char field_0;
} st_41cf2c_0;


void* sub_41cf2c(void* a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_41cf2c_0 *v10;  // x9
    st_41cf2c_0 **v11;  // x10
    unsigned long long v12;  // x10
    unsigned long long v13;  // x9
    void* v14;  // x0
    st_41cf2c_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_41cf2c_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!*(long long *)a0)
        return a0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    sub_27250();
    v1 = &v0;
    v0 = &v1;
    v10 = v1;
    v11 = v0;
    v12 = v11 - v10 + (v10 & ~v11) * 2;
    v13 = (v11 | v10) - (char *)&v10[v11 | ~v10] + v12 + 2 * ~v12;
    v0 = v13 + 22;
    v1 = v13 + (2 - v13 | 0xfffffffffffffffc) + ((unsigned int)v13 + 1 & 3) + 5;
    v14 = sub_4e14(*(long long *)a0, ((long long)a0[16] - *(long long *)a0) / ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1), 8);
    memset(a0, 0, 24);
    return v14;
}
