/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbce810..0xbce9f4 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bce810_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_bce810_0;


long long sub_bce810(long long a0, unsigned long a1, unsigned long a2, void* a3, void* a4, st_bce810_0 *a5, unsigned long a6)
{
    unsigned long v10;  // x21
    unsigned long v11;  // x22
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long v24;  // x8
    unsigned long v25;  // x9
    long long v26;  // x0
    unsigned long v27;  // x25
    unsigned long v28;  // x24
    unsigned long v29;  // x8
    unsigned long v12;  // x23
    unsigned long v30;  // x9
    long long v31;  // x0
    unsigned long long *v13;  // x8
    unsigned long long *v14;  // x9
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // x6
    unsigned long long *v18;  // x9
    unsigned long long *v19;  // x8
    char v0;  // [bp-0x98]
    long long v1;  // [bp-0x90]
    unsigned long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    char v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    long long ptr;  // [bp-0x60], Other Possible Types: unsigned long
    char v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a2;
    v11 = a1;
    v12 = (long long)a3[16];
    if (v12 == a6)
    {
        if (a6)
        {
            v13 = &a5->field_8;
            v14 = (long long)a3[8] + 8;
            v15 = v12;
            v16 = a6;
            do
            {
                v17 = a6;
                v18 = v14 + 2;
                v19 = v13 + 2;
                if (*(int *)((char *)v14 - 8) == *(int *)((char *)v13 - 8))
                {
                    v20 = arm64g_calculate_condition(4, v15, v16, 0);
                    v21 = arm64g_calculate_condition(20, (v20 & 1 ? *v14 : 0), (v20 & 1 ? *v13 : 0), 0);
                    if (!(v21 & 1))
                        continue;
                }
                else
                {
                    v22 = arm64g_calculate_condition(4, v15, v16, 0);
                    v23 = arm64g_calculate_condition(16, (v22 & 1 ? *v14 : 0), (v22 & 1 ? *v13 : 0), 0);
                    if (v23 & 1)
                        goto LABEL_bce8c0;
                }
            } while ((a6 = v17 - 1, v16 = 1, v15 = v17, v14 = v18, v13 = v19, v15 != 1));
        }
        v24 = *(long long *)a4;
        v25 = (long long)a4[8];
        if (v11 >= (unsigned long long)*(long long *)a4)
            v11 = v24;
        if ((unsigned long long)(long long)a4[8] >= v10)
            v10 = v25;
        *(unsigned long *)a4 = v11;
        *(unsigned long *)&a4[8] = v10;
        *(char *)&a4[16] = 0;
        v26 = sub_bcf4ec();
        if ((long long)v5 >= 1)
            v26 = _free(ptr);
    }
    else
    {
LABEL_bce8c0:
        v27 = *(long long *)a4;
        v28 = (long long)a4[8];
        if (v27 < v11)
            v29 = v11;
        else
            v29 = v27;
        if (v10 < v28)
            v30 = v10;
        else
            v30 = v28;
        v26 = a0;
        if (v30 >= v29)
        {
            v26 = sub_bcf4ec(&v5, a0, v11);
            if ((long long)v5 >= 1)
                v26 = _free(ptr);
            if (v27 > v11)
            {
                v2 = v11;
                v3 = v27 - 1;
                v4 = 0;
                sub_b9ebec(&v5, (long long)a3[8], v12);
                v26 = sub_bce9f4(&v0, a0, &v2, &v5);
                if (v0 >= 1)
                    v26 = _free(v1);
            }
            if (v10 > v28)
            {
                v5 = v28 + 1;
                ptr = v10;
                v7 = 0;
                v31 = sub_bce9f4(&v2, a0, &v5, a3);
                if ((long long)v2 < 1)
                    return v31;
                return _free(v3);
            }
        }
    }
    if (!*(long long *)a3)
        return v26;
    return _free();
}
