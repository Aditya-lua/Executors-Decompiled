/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b258..0xa4b348 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4b258_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    unsigned long long field_4;
} st_a4b258_0;


unsigned long long sub_a4b258(unsigned long long *a0, char *a1, unsigned int a2)
{
    unsigned long long v0;  // x0
    char *v1;  // x10
    st_a4b258_0 *v10;  // x8
    char v11;  // x12
    unsigned int v2;  // w2
    unsigned long v3;  // x12
    unsigned long long v4;  // x11
    unsigned int v5;  // w13
    unsigned long v6;  // x14
    char *v7;  // x15
    unsigned long long v8;  // x14
    unsigned long long v9;  // 4102

    if ((int)a2 < 1)
    {
        *(char *)a0 = 0;
        return 0;
    }
    v0 = 0;
    v1 = a1 + 1;
    while (1)
    {
        v2 = a2;
        v3 = *(v1 - 1);
        v4 = v3 * 0x10000;
        if (v2 <= 2)
            break;
        v5 = *v1;
        v6 = v1[1];
        v7 = (char *)a0 + v0;
        *v7 = *(char *)((v3 >> 2) + 13195301);
        v8 = (unsigned int)v6 & 0xffff0000 | ((unsigned int)v6 & 0xffff00ff | (v5 * 0x100 | v5 >> 24) & 0xff00) & 0xffff;
        v7[1] = *(char *)((((v5 * 0x100 | (unsigned int)v4) * 0x10000000000000 | (v5 * 0x100 | (unsigned int)v4) >> 12) & 0xfff000000000003f & 63) + 13195301);
        v7[2] = *(char *)(((v8 * 0x400000000000000 | v8 >> 6) & 18158513697557839935 & 63) + 13195301);
        v7[3] = *(char *)((v6 & 63) + 13195301);
        v0 += 4;
        v1 += 3;
        a2 = v2 - 3;
        if (v2 == 3)
        {
            *((char *)a0 + v0) = 0;
            return v0;
        }
    }
    v9 = arm64g_calculate_condition(19, v2, 2, 0);
    if (!(v9 & 1))
        v4 |= *v1 * 0x100;
    v10 = (char *)a0 + v0;
    v10->field_0 = *(char *)((v4 >> 18) + 13195301);
    v10->field_1 = *(char *)(((v4 * 0x10000000000000 | v4 >> 12) & 0xfff000000000003f & 63) + 13195301);
    v11 = 61;
    if (v2 != 1)
        v11 = *(char *)(((v4 * 0x400000000000000 | v4 >> 6) & 18158513697557839935 & 63) + 13195301);
    v10->field_2 = v11;
    v10->field_3 = 61;
    (&v10->field_3)[1] = 0;
    return (unsigned int)v0 + 4;
}
