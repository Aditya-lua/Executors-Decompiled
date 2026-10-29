/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c50..0xb4dd8 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c50_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[28];
    long long field_28;
} st_b4c50_1;

typedef struct st_b4c50_2 {
    char padding_0[4];
    unsigned int field_4;
} st_b4c50_2;

typedef struct st_b4c50_0 {
    char field_0;
} st_b4c50_0;


unsigned long long sub_b4c50(st_b4c50_1 *a0, unsigned long long *a1, unsigned int *a2, long long a3, unsigned long long a4)
{
    unsigned long long iter;  // x8
    unsigned long long v6;  // x22
    unsigned long long v15;  // x25
    long long v16;  // x0
    unsigned long long v17;  // 4106
    unsigned long long v18;  // x8
    st_b4c50_2 *v19;  // x9
    long long v7;  // x28
    unsigned int *v8;  // x26
    unsigned long long *v9;  // x21
    unsigned long long v10;  // x20
    unsigned long v11;  // x24
    long long v12;  // x19
    unsigned long long v13;  // x20
    unsigned long long v14;  // x22
    unsigned int v0;  // [bp-0x74]
    st_b4c50_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_b4c50_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    iter = a4 >> 20;
    if (a4 & 0xfffff)
        iter += 1;
    if (!iter)
        return 0;
    v6 = a4;
    v7 = a3;
    v8 = a2;
    v9 = a1;
    v10 = 0;
    v0 = 1 << ((char)a2[5] & 31);
    v11 = a1[3];
    v12 = a3;
    do
    {
        v13 = v10;
        v14 = v6 - 0x100000;
        if (v6 < 0x100000)
            v15 = v6;
        else
            v15 = 0x100000;
        if (v9[4] <= v11)
            break;
        if ((unsigned int)(v15 + v12 - a0->field_8) >= 3670016001)
        {
            v16 = sub_b42f0(a0);
            v9 = a1;
            sub_b4264(a0->field_28, 1 << ((char)v8[1] & 31), v16);
            *(unsigned int *)&a0[1].padding_0[0] = 0;
        }
        sub_b5198(a0, v7 + v15, v0, a0 + 1);
        v10 = sub_b4688(a0, v9, v8, v7, v15);
        v17 = arm64g_calculate_condition(130, v10, 120, 0);
        if (v17 & 1)
            return v10;
        v18 = v9[3];
        if (v11 < v18)
        {
            v19 = *v9 + 12 * v11;
            v19->field_4 = v19->field_4 + (unsigned int)v13;
        }
        else
        {
            v10 = v15 + v13;
        }
        v12 += 0x100000;
        v7 += 0x100000;
        iter -= 1;
        v11 = v18;
        v6 = v14;
    } while (iter);
    return 0;
}
