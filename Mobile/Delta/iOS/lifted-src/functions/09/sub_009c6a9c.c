/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c6a9c..0x9c6b90 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_e89e3c;

char * sub_9c6a9c(char *a0, unsigned int a1, unsigned long long *a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    void* v19;  // x22
    unsigned long long v20;  // w23
    unsigned long long v21;  // w23
    unsigned long v22;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // 4155
    unsigned long long v17;  // x0
    unsigned long v18;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = arm64g_calculate_condition(1, a1, 1, 0);
    if (v16 & 1)
    {
        a1 = _strlen(a0);
    }
    else if (a1 == 3)
    {
        if (*a0 == 0x44 && a0[1] == 73 && a0[2] == 82)
        {
            *a2 = *a2 | 10502;
            return 1;
        }
        a1 = 3;
    }
    v18 = a1;
    v19 = &g_e89e3c;
    v20 = 49;
    while (1)
    {
        v21 = v20;
        if ((unsigned int)v18 == *(int *)((char *)v19 - 4) && !(v17 = sub_a6e258(*(long long *)((char *)v19 - 12), a0, v18), (unsigned int)v17))
            break;
        v19 += 16;
        v20 = v21 - 1;
        if (v21 == 1)
            return 0;
    }
    v22 = *(int *)v19;
    if (!(unsigned int)v22)
    {
        return v17;
    }
    else if (!(v22 >> 16 & 1))
    {
        v17 = sub_9cacc4(v22);
        if (!v17)
            return v17;
        *a2 = *a2 | v17;
        return 1;
    }
    else
    {
        return v17;
    }
}
