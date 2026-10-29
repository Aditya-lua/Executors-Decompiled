/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c8d4..0xa3ca9c (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c8d4_1 {
    unsigned int field_0;
} st_a3c8d4_1;

typedef struct st_a3c8d4_0 {
    char padding_0[49];
    struct st_a3c8d4_1 *field_31;
} st_a3c8d4_0;

extern char g_def038;
extern unsigned int g_e92a58[4];

unsigned long long sub_a3c8d4(unsigned long long a0, long long a1, void* a2)
{
    unsigned long long v3;  // x0
    unsigned int *v4;  // w8
    unsigned long v5;  // x8
    unsigned long long v6;  // 4118
    st_a3c8d4_0 *v7;  // x0
    unsigned long long v8;  // x0
    unsigned int *v9;  // x21
    unsigned int v10;  // w8
    unsigned int *v11;  // x8
    unsigned int *v12;  // x9
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a3bbe8();
    if ((int)v3 < 1)
        return v3;
    v4 = (unsigned int *)(int)a2[8];
    if ((unsigned int)a0 == 1)
    {
        if (v4 == 1)
        {
            *(long long *)&a2[56] = (long long)a2[32];
            *(void* *)&a2[32] = a2 + 64;
            *(unsigned int *)&a2[28] = 50;
        }
        else if (v4 == 2)
        {
LABEL_a3c94c:
            v5 = (int)a2[28];
            v6 = arm64g_calculate_condition(145, v5 & 0xffffffff, 4, 0);
            if (!(v6 & 1))
            {
                _strncpy(a2 + 64, *(long long *)&g_e92a58[2 + 4 * *(long long *)&(&g_def038)[24 + 8 * (int)v5]], 49);
                *(char *)&a2[113] = 0;
            }
            else
            {
                v0 = v5;
                sub_9d5b44(a2 + 64, 50, "%d");
            }
            v7 = a2 + 64;
            *(st_a3c8d4_0 **)&a2[32] = v7;
            *(unsigned int *)&a2[28] = _strlen(v7);
        }
    }
    else
    {
        if ((unsigned int)a0 == 8 && v4 == 1)
            goto LABEL_a3c94c;
    }
    v8 = sub_a3aef4(a0, a1, a2);
    if ((int)v8 < 1)
        return v8;
    if ((unsigned int)a0 != 7 || (int)a2[8] != 2)
    {
        if ((unsigned int)a0 != 2)
        {
            return v8;
        }
        else if ((int)a2[8] != 1)
        {
            return v8;
        }
    }
    v9 = (long long)a2[32];
    if (!_strcmp(v9, "digest"))
    {
        v11 = 0;
    }
    else if (!_strcmp(v9, "max"))
    {
        v11 = 1;
    }
    else if (_strcmp(v9, "auto"))
    {
        v10 = _atoi(v9);
        goto LABEL_a3ca68;
    }
    else
    {
        v11 = 2;
    }
    v10 = *(int *)((char *)&g_e92a58[0] + 0x10 * v11);
LABEL_a3ca68:
    if ((unsigned int)a0 == 2)
        v12 = (long long)a2[56];
    else
        v12 = a2 + 28;
    *v12 = v10;
    *(unsigned long long *)&a2[32] = 0;
    return v8;
}
