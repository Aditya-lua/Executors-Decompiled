/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b120..0x1b298 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b120_0 {
    char field_0;
} st_1b120_0;


unsigned long long sub_1b120(unsigned long long *a0, unsigned long a1)
{
    unsigned long v4;  // x25
    unsigned long long *v5;  // x26
    unsigned long long v14;  // x28
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    long long v17;  // x19
    unsigned long long v18;  // x0
    long long v19;  // x19
    unsigned long long v20;  // x8
    unsigned long v21;  // x8
    long long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x20
    unsigned long long v10;  // x0
    long long v11;  // x20
    unsigned long long v12;  // x27
    long long v13;  // x19
    st_1b120_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1b120_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[3];
    v5 = (char *)a0 + a1;
    v6 = *a0 + 14097894508562428199 * (*(long long *)((char *)v5 - 16) + a1);
    v7 = sub_16f2c(v6 + v4, 52);
    v8 = sub_16f2c(v6, 37);
    v9 = v6 + a0[1];
    v10 = sub_16f2c(v9, 7);
    v11 = a0[2] + v9;
    v12 = v8 + v7 + v10 + sub_16f2c(v11, 31);
    v13 = *(long long *)((char *)v5 - 32) + a0[2];
    v14 = *(long long *)((char *)v5 - 8) + v4;
    v15 = sub_16f2c(v14 + v13, 52);
    v16 = sub_16f2c(v13, 37);
    v17 = *(long long *)((char *)v5 - 24) + v13;
    v18 = sub_16f2c(v17, 7);
    v19 = *(long long *)((char *)v5 - 16) + v17;
    v20 = v4 + v15 + v16 + v18 + sub_16f2c(v19, 31);
    v21 = 11160318154034397263 * (v11 + v20) + 14097894508562428199 * (v14 + v19 + v12) ^ 11160318154034397263 * (v11 + v20) + 14097894508562428199 * (v14 + v19 + v12) >> 47;
    return 11160318154034397263 * (v12 + 14097894508562428199 * v21 ^ v12 + 14097894508562428199 * v21 >> 47);
}
