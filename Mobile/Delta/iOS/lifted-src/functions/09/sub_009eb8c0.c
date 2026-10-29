/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eb8c0..0x9eb9e0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9eb8c0_0 {
    struct st_9eb8c0_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_9eb8c0_0;

typedef struct st_9eb8c0_1 {
    long long field_0;
} st_9eb8c0_1;


unsigned long long sub_9eb8c0(st_9eb8c0_0 *a0, unsigned long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x0
    long long v20;  // x21
    long long *v21;  // x9
    unsigned long long v22;  // x23
    unsigned long long idx;  // x23
    unsigned long long v24;  // x0
    unsigned long long v25;  // x9
    unsigned long long v26;  // w8
    unsigned long long v27;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x0
    unsigned long long v17;  // x20
    unsigned long long v18;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1)
        return 0xffffffffffffffff;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (!(int)a0->field_8)
        return 0;
    v16 = sub_9e4630(a1);
    v17 = 64 - v16;
    if (!sub_9ea668(a0, a0, v17))
        return 0xffffffffffffffff;
    v18 = (unsigned int)a0->field_8;
    if ((int)v18 >= 1)
    {
        v19 = 0;
        v20 = a1 << ((char)-(unsigned int)v16 & 63);
        v21 = a0->field_0;
        v22 = v18 - 1;
        do
        {
            idx = v22;
            v24 = sub_9db928(v19, v21[idx], v20);
            v19 = v21[idx] - v20 * v24;
            v21 = a0->field_0;
            v21[idx] = v24;
            v22 = idx - 1;
        } while (1 < idx + 1);
        v25 = (unsigned int)a0->field_8;
        v26 = (unsigned int)v25 - 1;
        if ((int)v25 < 1)
        {
            v27 = v19 >> ((char)v17 & 63);
            if ((unsigned int)v25)
                return v19 >> ((char)v17 & 63);
        }
        else if (*(long long *)((char *)&a0->field_0[v25].field_0 - 8))
        {
            return v19 >> ((char)v17 & 63);
        }
        else
        {
            *(unsigned int *)&a0->field_8 = v26;
            v27 = v19 >> ((char)v17 & 63);
            if (v26)
                return v19 >> ((char)v17 & 63);
        }
    }
    else
    {
        v27 = 0 >> ((char)v17 & 63);
        if ((unsigned int)v18)
            return 0 >> ((char)v17 & 63);
    }
    *(unsigned int *)&a0->field_10 = 0;
    return v27;
}
