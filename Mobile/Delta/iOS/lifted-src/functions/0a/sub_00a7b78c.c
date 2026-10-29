/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b78c..0xa7b8f4 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a7b78c(char *a0, unsigned long long a1, char *a2)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    char *v21;  // w23
    char *v22;  // w23
    unsigned long long v23;  // x8
    unsigned long long v24;  // x8
    unsigned long v25;  // x8
    char *v26;  // x0
    char *v27;  // x24
    char *v28;  // x23
    unsigned long long v29;  // x25
    unsigned long long idx;  // x26
    unsigned long long v13;  // x24
    unsigned long long index;  // x8
    char *v32;  // x9
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long v20;  // x21
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (a0)
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        v20 = a1;
        v21 = (char *)1;
        v22 = (char *)1;
        if (a1 >= 16)
        {
            v23 = v20;
            do
            {
                v24 = v23;
                v22 = v21 + 1;
            } while (14 >= v21 && (v23 = v24 >> 4, v21 = v22, 0x100 <= v24));
        }
        v25 = *(int *)a0;
        if (v22 > (int)v25)
        {
            do
            {
                v26 = sub_a6bffc(128, "crypto/sparse_array.c", 176);
                if (!v26)
                    goto LABEL_a7b8dc;
            } while ((*(long long *)v26 = *(long long *)&a0[24], *(char **)&a0[24] = v26, v25 = *(int *)a0 + 1, *(unsigned int *)a0 = v25, (int)v25 < v22));
        }
        if (v20 > (unsigned long long)*(long long *)&a0[8])
            *(unsigned long long *)&a0[8] = v20;
        v27 = *(long long *)&a0[24];
        if ((int)v25 >= 2)
        {
            v28 = (v25 & 0xffffffff) + 1;
            v29 = ((v25 * 4 | v25 >> 62) & 0x3fffffffc & 0x3ffffffff) - 4;
            do
            {
                idx = v20 >> ((char)v29 & 63) & 15;
                v26 = *(long long *)&v27[8 * idx];
                if (!v26 && (v26 = sub_a6bffc(128, "crypto/sparse_array.c", 176), *(char **)&v27[8 * idx] = v26, !v26))
                    goto LABEL_a7b8dc;
            } while ((v28 -= 1, v29 -= 4, v27 = v26, v28 > 2));
        }
        else
        {
            v26 = v27;
        }
        index = v20 & 15;
        if (a2)
        {
            if (*(long long *)&v26[8 * index])
                goto LABEL_a7b8d4;
            v32 = 1;
            goto LABEL_a7b8c8;
        }
        else if (*(long long *)&v26[8 * index])
        {
            v32 = 0xffffffffffffffff;
LABEL_a7b8c8:
            *(char **)&a0[16] = &v32[*(long long *)&a0[16]];
        }
LABEL_a7b8d4:
        *(char **)&v26[8 * index] = a2;
        v26 = 1;
LABEL_a7b8dc:
        a0 = v26;
    }
    return (unsigned int)a0;
}
