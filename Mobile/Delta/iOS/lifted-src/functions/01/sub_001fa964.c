/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa964..0x1faaf8 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa964_2 {
    char padding_0[44];
    unsigned int field_2c;
    char padding_30[12];
    char field_3c;
} st_1fa964_2;

typedef struct st_1fa964_0 {
    char field_0;
} st_1fa964_0;


long long sub_1fa964(void* a0)
{
    unsigned long long v8;  // x20
    unsigned long long iter;  // x21
    unsigned long long node;  // x22
    unsigned long v11;  // x24
    unsigned long v12;  // x24
    st_1fa964_2 *v13;  // x23
    unsigned long long v14;  // 4112
    unsigned long v15;  // x0
    st_1fa964_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1fa964_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned int v5;  // [bp-0x44]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v8 = *(int *)(*(long long *)a0 + 20) & 1;
    v3 = 0;
    v4 = 0;
    if ((unsigned long long)(long long)a0[8] >= 2)
    {
        iter = 0;
        node = 1;
        if (!(unsigned int)v8)
        {
            do
            {
                v11 = *(long long *)a0 + iter;
                if (!(sub_1fbcc0(v11 + 40) & 1))
                {
                    if (!*(int *)(v11 + 40))
                    {
                        v5 = *(int *)(*(long long *)a0 + iter + 44);
                        sub_1f8478(&v2, &v5);
                    }
                    else
                    {
                        return sub_1eccac(&v2);
                    }
                }
            } while ((node += 1, iter += 40, (unsigned long long)(long long)a0[8] > node));
        }
        else
        {
            do
            {
                v12 = *(long long *)a0 + iter;
                if (sub_1fbcc0(v12 + 40) & 1)
                    continue;
                if (*(int *)(v12 + 40))
                    return sub_1eccac(&v2);
                v13 = *(long long *)a0 + iter;
                if (!(v13->field_3c & 1) && (v14 = arm64g_calculate_condition(1, sub_1f4470(v13->field_2c) & 0xffffffff, 1, 0), !(v14 & 1)))
                    goto LABEL_1faa9c;
                v5 = v13->field_2c;
                sub_1f8478(&v2, &v5);
            } while ((node += 1, iter += 40, (unsigned long long)(long long)a0[8] > node));
        }
    }
    if (v3 >= 2)
    {
        v15 = operatornew(72);
        memset(v15, 0, 72);
        *(unsigned long *)&a0[200] = v15;
        sub_1ebec8(v15, &v2, v8);
    }
LABEL_1faa9c:
    return sub_1eccac(&v2);
}
