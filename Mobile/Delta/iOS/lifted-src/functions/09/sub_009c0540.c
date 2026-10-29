/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0540..0x9c064c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c0540(unsigned long long idx, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x19
    unsigned int v20;  // w20
    unsigned long long v21;  // x24
    unsigned long long v22;  // x0
    unsigned long v23;  // x8
    unsigned long long v24;  // w8
    unsigned long v25;  // x9
    unsigned long long v26;  // w8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned int v16;  // w21
    unsigned long long v17;  // x22
    unsigned long long v18;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a1 >> 31 & 1)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 1 << (7 & (char)~(unsigned int)a1 & 31);
    if (!a2)
        v17 = 0;
    else
        v17 = (char)v16;
    if (!idx)
        return idx;
    v18 = (a1 & 0xffffffff) >> 3;
    *(unsigned long long *)(idx + 16) = *(long long *)(idx + 16) & 0xfffffffffffffff0;
    if (*(int *)idx <= (int)v18 || (v19 = *(long long *)(idx + 8), !v19))
    {
        if (a2)
        {
            v20 = (unsigned int)v18 + 1;
            v21 = idx;
            v22 = sub_a6c304(*(long long *)(idx + 8));
            if (!v22)
                return v22;
            v19 = v22;
            v23 = *(int *)v21;
            if ((int)(v20 - v23) >= 1)
            {
                _bzero(v19 + v23);
                v21 = v21;
            }
            *(unsigned long long *)(v21 + 8) = v19;
            *(unsigned int *)v21 = v20;
            idx = v21;
        }
        else
        {
            return 1;
        }
    }
    *(char *)(v19 + v18) = *(char *)(v19 + v18) & (char)~v16 | v17;
    v24 = *(int *)idx;
    if (v24 < 1)
        return 1;
    v25 = *(long long *)(idx + 8) - 1;
    do
    {
        v26 = v24;
    } while (!*(char *)(v25 + v26) && (v24 = v26 - 1, *(unsigned int *)idx = v24, 1 < v26));
    return 1;
}
