/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd83e4..0xbd84b8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_bd83e4(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x8
    unsigned long long v20;  // x23
    unsigned long long v21;  // x24
    unsigned int v22;  // w10
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long *v16;  // x19
    unsigned long long *v17;  // x20
    unsigned long long v18;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a2;
    v17 = a1;
    if (a3 >= 8)
    {
        v18 = a3 >> 3;
        v19 = v18 * 8;
        v20 = (v19 + v18) * 32;
        v21 = v18 * 0x200 - v19;
        a0 = sub_bd83e4(a0, (char *)a0 + v20, (char *)a0 + v21, v18);
        v17 = sub_bd83e4(v17, (char *)v17 + v20, (char *)v17 + v21, v18);
        v16 = sub_bd83e4(v16, (char *)v16 + v20, (char *)v16 + v21, v18);
    }
    v22 = *v17 > *a0;
    if (v22 ^ *v16 > *v17)
        v17 = v16;
    if (!(v22 ^ *v16 > *a0))
        return v17;
    return a0;
}
