/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af0ec..0x1af3c8 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af0ec_1 {
    unsigned int field_0;
} st_1af0ec_1;

typedef struct st_1af0ec_0 {
    char field_0;
} st_1af0ec_0;


st_1af0ec_1 ** sub_1af0ec(st_1af0ec_1 **a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int *v7;  // x22
    long long v8;  // x20
    long long iter;  // x8
    unsigned long long idx;  // x17
    unsigned long long idx1;  // x10
    long long v20;  // x16
    long long v21;  // x12
    unsigned int v22;  // w0
    unsigned long long v23;  // x0
    unsigned long long v24;  // x9
    st_1af0ec_1 **v25;  // x0
    long long node;  // x9
    unsigned int *v9;  // x15
    long long iter1;  // x10
    long long iter2;  // x11
    long long v29;  // x17
    long long i;  // x17
    long long v31;  // x17
    unsigned int v32;  // w0
    unsigned long long v33;  // x0
    unsigned int *v34;  // x15
    long long j;  // x14
    long long v36;  // x14
    unsigned int *v10;  // x11
    unsigned int v37;  // w15
    unsigned int v38;  // w15
    unsigned int v39;  // w15
    long long k;  // x13
    long long v41;  // x13
    unsigned int v42;  // w15
    unsigned int v43;  // w14
    unsigned int v44;  // w14
    unsigned long long v11;  // x9
    long long v12;  // x14
    unsigned long long v13;  // x10
    unsigned long long v14;  // x12
    unsigned long long v15;  // x13
    unsigned long long v16;  // x16
    st_1af0ec_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1af0ec_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x44]
    st_1af0ec_0 **v3;  // [bp-0x40], Other Possible Types: char
    st_1af0ec_0 *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a0;
    v2 = 0x8b8b8b8b;
    v4 = &v3;
    v3 = &v4;
    v7 = a2 - a1;
    v8 = v7 >> 2;
    sub_1a3ff4(a1, v8, &v2);
    v9 = *a0;
    v10 = a0[1];
    v11 = v10 - v9;
    v12 = (long long)(v11) >> 2;
    v13 = 11;
    v14 = 7;
    v15 = 5;
    v16 = 3;
    iter = v8 - 1;
    if (6 >= (unsigned long long)v8)
        v16 = (unsigned long long)(iter) >> 1;
    if (38 < (unsigned long long)v8)
        v16 = v15;
    if (67 < (unsigned long long)v8)
        v16 = v14;
    if (622 < (unsigned long long)v8)
        v16 = v13;
    idx = v8 - v16 >> 1;
    idx1 = idx + v16;
    v20 = v12 + 1;
    if ((unsigned long long)v20 <= (unsigned long long)v8)
        v21 = v8;
    else
        v21 = v12 + 1;
    v22 = *a1 ^ *(int *)(a1 + v7 - 4) ^ a1[idx];
    v23 = 1664525 * (v22 ^ v22 >> 27);
    a1[idx] = (unsigned int)v23 + a1[idx];
    v24 = v23 + (v11 >> 2);
    v25 = v24 + a1[idx1];
    a1[idx1] = (unsigned int)v25;
    *a1 = v24;
    node = idx - v8 * idx / v8;
    iter1 = idx1 - v8 * idx1 / v8;
    if (v10 != v9)
    {
        iter2 = 0;
        v29 = 2;
        if (2 < (unsigned long long)v20)
            v29 = v20;
        i = v29 - 1;
        do
        {
            v31 = i;
            if (iter2 + 1 == v8)
                iter2 = 0;
            else
                iter2 += 1;
            if (iter + 1 == v8)
                iter = 0;
            else
                iter += 1;
            if (node + 1 == v8)
                node = 0;
            else
                node += 1;
            if (iter1 + 1 == v8)
                iter1 = 0;
            else
                iter1 += 1;
            v32 = a1[iter2] ^ a1[iter] ^ a1[node];
            v33 = 1664525 * (v32 ^ v32 >> 27);
            a1[node] = (unsigned int)v33 + a1[node];
            v34 = v9 + 1;
            v25 = *v9 + iter2 + v33;
            a1[iter1] = (unsigned int)v25 + a1[iter1];
            a1[iter2] = (unsigned int)v25;
            i = v31 - 1;
            v9 = v34;
        } while (i);
        if ((unsigned long long)v20 < (unsigned long long)v8)
            goto LABEL_1af2b4;
    }
    else
    {
        iter2 = 0;
        if ((unsigned long long)v8 > (unsigned long long)v20)
        {
LABEL_1af2b4:
            j = ~v12 + v21;
            do
            {
                v36 = j;
                if (iter2 + 1 == v8)
                    iter2 = 0;
                else
                    iter2 += 1;
                if (iter + 1 == v8)
                    iter = 0;
                else
                    iter += 1;
                if (node + 1 == v8)
                    node = 0;
                else
                    node += 1;
                if (iter1 + 1 == v8)
                    iter1 = 0;
                else
                    iter1 += 1;
                v37 = a1[iter2] ^ a1[iter] ^ a1[node];
                v38 = 1664525 * (v37 ^ v37 >> 27);
                a1[node] = v38 + a1[node];
                v39 = v38 + (int)iter2;
                a1[iter1] = v39 + a1[iter1];
                a1[iter2] = v39;
                j = v36 - 1;
            } while (j);
        }
    }
    if ((unsigned long long)(v21 + v8) <= (unsigned long long)v21)
        return v25;
    k = v8;
    do
    {
        v41 = k;
        if (iter2 + 1 == v8)
            iter2 = 0;
        else
            iter2 += 1;
        if (iter + 1 == v8)
            iter = 0;
        else
            iter += 1;
        if (node + 1 == v8)
            node = 0;
        else
            node += 1;
        if (iter1 + 1 == v8)
            iter1 = 0;
        else
            iter1 += 1;
        v42 = a1[node];
        v43 = 1566083941 * (v42 + a1[iter2] + a1[iter] ^ v42 + a1[iter2] + a1[iter] >> 27);
        a1[node] = v43 ^ v42;
        v44 = v43 - iter2;
        a1[iter1] = v44 ^ a1[iter1];
        a1[iter2] = v44;
        k = v41 - 1;
    } while (k);
    return v25;
}
