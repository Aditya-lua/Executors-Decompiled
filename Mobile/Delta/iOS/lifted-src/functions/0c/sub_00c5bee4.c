/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5bee4..0xc5c018 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c5bee4(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long a3)
{
    unsigned long long *v3;  // x19
    unsigned long long *v4;  // x20
    unsigned long long v13;  // x27
    unsigned int v14;  // w0
    unsigned long v15;  // x8
    unsigned int v16;  // w0
    unsigned long v17;  // x8
    unsigned long long v18;  // 4113
    unsigned long long *v5;  // x21
    unsigned long long v6;  // x22
    unsigned long long v7;  // x23
    unsigned long long v8;  // x24
    unsigned long long v9;  // x28
    unsigned long long v10;  // x25
    unsigned int v11;  // w0
    unsigned long long v12;  // x26
    unsigned long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2;
    v4 = a1;
    v5 = a0;
    if (a3 >= 8)
    {
        v6 = a3 >> 3;
        v7 = v6 * 96;
        v8 = 168 * v6;
        v5 = sub_c5bee4(v5, (char *)v5 + v7, (char *)v5 + v8, v6);
        v4 = sub_c5bee4(v4, (char *)v4 + v7, (char *)v4 + v8, v6);
        v3 = sub_c5bee4(v3, (char *)v3 + v7, (char *)v3 + v8, v6);
    }
    v9 = v5[1];
    v10 = v4[1];
    v0 = *v4;
    v11 = _memcmp();
    if (!v11)
        v12 = v9 - v10;
    else
        v12 = v11;
    v13 = v3[1];
    v14 = _memcmp();
    v15 = v14;
    if (!v14)
        v15 = v9 - v13;
    if ((long long)(v15 ^ v12) < 0)
        return v5;
    v16 = _memcmp();
    v17 = v16;
    if (!v16)
        v17 = v10 - v13;
    v18 = arm64g_calculate_condition(0x44, v17 ^ v12, 0, 0);
    if (!(v18 & 1))
        return v4;
    return v3;
}
