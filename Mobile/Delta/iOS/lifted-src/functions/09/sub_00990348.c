/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990348..0x99041c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_990348(void* *a0, void* a1, void* *a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    void* v19;  // x8
    void* v20;  // x9
    void* v21;  // x23
    void* v22;  // x8
    void* v23;  // x0
    void* v24;  // x9
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    void* v16;  // x22
    unsigned long long v17;  // x0
    void* v18;  // x9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0[1])
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 1 << ((char)(*(char *)*a0) >> 6 & 63);
    if (a0[1] >= v16)
    {
        v17 = sub_a7b0d8(*a0);
        v18 = a0[1];
        v19 = *a0 + v16;
        v20 = v18 - v16;
        *a0 = v19;
        a0[1] = v20;
        if (v18 == v16 || (v21 = 1 << ((char)(*(char *)v19) >> 6 & 63), v20 < v21))
            goto LABEL_9903e4;
        v22 = sub_a7b0d8(v19);
        v23 = *a0 + v21;
        v24 = a0[1] - v21;
        *a0 = v23;
        a0[1] = v24;
        if (v22 > v24)
            goto LABEL_9903e4;
        *a0 = v23 + v22;
        a0[1] = v24 - v22;
        *a2 = v22;
        if (a1)
            *(unsigned long long *)a1 = v17;
    }
    else
    {
LABEL_9903e4:
        v23 = 0;
    }
    return v23;
}
