/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d98f8..0x3d9ae4 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d98f8_1 {
    unsigned int field_0;
    char padding_4[2492];
    unsigned long long field_9c0;
} st_3d98f8_1;

typedef struct st_3d98f8_0 {
    char field_0;
} st_3d98f8_0;


long long sub_3d98f8(unsigned long a0, unsigned long a1, unsigned int *a2)
{
    unsigned long v6;  // x0
    unsigned int v7;  // w22
    unsigned long long idx;  // x9
    unsigned long long idx1;  // x10
    unsigned int v18;  // w13
    unsigned int v19;  // w11
    unsigned int v20;  // w8
    unsigned int v21;  // w9
    char v8;  // x8
    st_3d98f8_1 *v9;  // x8
    unsigned long long idx2;  // x11
    unsigned long long index;  // x12
    unsigned int v12;  // w14
    unsigned int v13;  // w13
    unsigned int v14;  // w12
    st_3d98f8_1 *v15;  // x8
    st_3d98f8_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_3d98f8_0 *v1;  // [bp-0x80]
    st_3d98f8_1 *v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a2[1];
    if ((unsigned int)v6 == *a2)
        return v6;
    v7 = (unsigned int)(v6 - *a2) + 1;
    if (v7)
    {
        if (!(v7 * 0x100000000))
            v8 = 32;
        else
            v8 = Clz(v7 * 0x100000000);
        sub_3d9ae4();
        v9 = v2;
        idx2 = v9->field_9c0;
        do
        {
            index = idx2;
            idx2 = idx2 + 1 - 624 * (idx2 + 1 >> 4) / 39;
            if ((&v9->field_0)[idx2] & 1)
                v12 = 2567483615;
            else
                v12 = 0;
        } while ((v13 = v12 ^ *(int *)&v9->padding_4[1584 + 4 * index + -0x9c0 * (index + 397 >> 4) / 39] ^ ((&v9->field_0)[idx2] & 0x7ffffffe | (&v9->field_0)[index] & 0x80000000) >> 1, (&v9->field_0)[index] = v13, v14 = 2636928640 & (v13 ^ v13 >> 11) * 128 ^ v13 ^ v13 >> 11, v7 <= ((v14 * 0x8000 & 0xefc60000 ^ v14 ^ (v14 * 0x8000 & 0xefc60000 ^ v14) >> 18) & v3)));
        v9->field_9c0 = idx2;
        return *a2 + ((0xefc60000 & v14 * 0x8000 ^ v14 ^ (0xefc60000 & v14 * 0x8000 ^ v14) >> 18) & v3);
    }
    else
    {
        sub_3d9ae4(&v2);
        v15 = v2;
        idx = v15->field_9c0;
        idx1 = idx + 1 - 624 * (idx + 1 >> 4) / 39;
        if ((&v15->field_0)[idx1] & 1)
            v18 = 2567483615;
        else
            v18 = 0;
        v19 = v18 ^ *(int *)&v15->padding_4[1584 + 4 * idx + -0x9c0 * (idx + 397 >> 4) / 39] ^ ((&v15->field_0)[idx1] & 0x7ffffffe | (&v15->field_0)[idx] & 0x80000000) >> 1;
        (&v15->field_0)[idx] = v19;
        v15->field_9c0 = idx1;
        v20 = 2636928640 & (v19 ^ v19 >> 11) * 128 ^ v19 ^ v19 >> 11;
        v21 = 0xefc60000 & v20 * 0x8000;
        return (v21 ^ v20 ^ (v21 ^ v20) >> 18) & v3;
    }
}
