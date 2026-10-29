/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9058..0x2a916c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9058_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2a9058_0;


st_2a9058_0 * sub_2a9058(void* *a0)
{
    st_2a9058_0 *v6;  // x8
    char v7;  // x1
    unsigned long v8;  // x9
    void* v9;  // x8
    char v10;  // x1
    unsigned long v11;  // x9
    char v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (a0[1] == a0[2])
    {
        v2 = 0;
        sub_2ae53c(&v3, 0);
        v9 = *a0;
        v10 = *(char *)v9;
        *(char *)v9 = v2;
        v2 = v10;
        v11 = (long long)v9[8];
        *(unsigned long *)&v9[8] = v3;
        v3 = v11;
        sub_2a6e94(&v3, v2);
        return *a0;
    }
    else if (*(char *)*(long long *)((char *)a0[2] - 8) == 2)
    {
        sub_2aad70(*(long long *)(*(long long *)((char *)a0[2] - 8) + 8));
        return *(long long *)(*(long long *)(*(long long *)((char *)a0[2] - 8) + 8) + 8) - 16;
    }
    else
    {
        v0 = 0;
        sub_2ae53c(&v1, 0);
        v6 = a0[4];
        v7 = v6->field_0;
        v6->field_0 = v0;
        v0 = v7;
        v8 = v6->field_8;
        v6->field_8 = v1;
        v1 = v8;
        sub_2a6e94(&v1, v0);
        return a0[4];
    }
}
