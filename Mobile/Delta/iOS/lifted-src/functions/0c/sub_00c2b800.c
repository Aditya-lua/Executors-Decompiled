/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b800..0xc2b994 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c2b800(unsigned long long *a0, long long a1, unsigned long a2)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x8
    unsigned long long v22;  // x9
    unsigned long long ptr;  // x0
    unsigned long long *v24;  // x23
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x8
    unsigned long long v28;  // x0
    unsigned long long *v14;  // x23
    unsigned long long v15;  // x8
    unsigned long long ptr1;  // x0
    unsigned long long *v17;  // x10
    unsigned long long *v18;  // x10
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v21;  // x21
    unsigned long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a0[1];
    v13 = a0[2] * 32;
    v14 = v12 + v13;
    v0 = a2;
    v1 = 0;
    v15 = -v13;
    ptr1 = 4;
    v17 = v14;
    do
    {
        v18 = v17;
        if (!v15)
        {
            v20 = 0;
            goto LABEL_c2b888;
        }
    } while ((v17 = (char *)v18 - 32, v15 += 32, *(long long *)((char *)v18 - 32) == 0x8000000000000000));
    v19 = (((char *)v17 - v12) * 0x800000000000000 | (char *)v17 - v12 >> 5) & 0xf8000000ffffffff & 0xffffffff;
    v20 = v19 + 32 >> 5;
    v21 = v20 * 4;
    ptr1 = _calloc(v21, 1);
    if (ptr1)
    {
        v15 = v19 + 1;
LABEL_c2b888:
        v2 = v20;
        v3 = ptr1;
        v22 = -(a0[2] * 32);
        ptr = 4;
        v4 = v20;
        v5 = v15;
        do
        {
            v24 = v14;
            if (!v22)
            {
                v26 = 0;
                v27 = 0;
                goto LABEL_c2b8e4;
            }
        } while ((v14 = (char *)v24 - 32, v22 += 32, *(long long *)((char *)v24 - 32) == 0x8000000000000000));
        v25 = (((char *)v14 - v12) * 0x800000000000000 | (char *)v14 - v12 >> 5) & 0xf8000000ffffffff & 0xffffffff;
        v26 = v25 + 32 >> 5;
        v21 = v26 * 4;
        ptr = _calloc(v21, 1);
        if (ptr)
        {
            v27 = v25 + 1;
LABEL_c2b8e4:
            v6 = v26;
            v7 = ptr;
            v8 = v26;
            v9 = v27;
            v28 = sub_c2b994(a0, a1, &v0, &v2, &v6, &v1);
            if (v6)
                v28 = _free(v7);
            if (v2)
                v28 = _free(v3);
            return v28;
        }
    }
    else
    {
        sub_c6b970(4, v21);
    }
    sub_c6b970(4, v21);
    __debugbreak();
}
