/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74118..0x74234 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74118_1 {
    char padding_0[96];
    long long field_60;
} st_74118_1;

typedef struct st_74118_0 {
    char field_0;
} st_74118_0;


long long sub_74118(st_74118_1 *a0, long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long a4, char *a5)
{
    long long v8;  // x0
    unsigned int v9;  // w0
    unsigned long v10;  // x8
    char *v11;  // x9
    unsigned long long v13;  // 4143
    st_74118_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_74118_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0[1].padding_0[8]);
    sub_73e28(&a0->padding_0[88], a0->field_60, *a1, a1[1], a1[1] - *a1);
    v2 = *a3;
    v3 = *a2;
    v4 = *a3;
    v5 = *a2;
    v8 = sub_75454(&v5, &v4);
    sub_74744(&a0->padding_0[88], a0->field_60, &v3, &v2, v8);
    v9 = sub_60768(&a0->padding_0[24], 5);
    if (a4 && v9)
    {
        v10 = 0;
        v11 = -a4;
        do
        {
            v11[a0->field_60] = v11[a0->field_60] ^ a5[v10 & 3];
            v10 += 1;
            v13 = arm64g_calculate_condition(50, v11, 1, 0);
            v11 += 1;
        } while (v13 & 1);
    }
    return std::__1::mutex::unlock(&a0[1].padding_0[8]);
}
