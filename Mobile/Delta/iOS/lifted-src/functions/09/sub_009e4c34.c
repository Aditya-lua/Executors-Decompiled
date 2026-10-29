/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4c34..0x9e4cdc (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4c34_0 {
    long long field_0;
    int field_8;
    char padding_c[4];
    unsigned int field_10;
    char field_14;
} st_9e4c34_0;


char sub_9e4c34(char idx, st_9e4c34_0 *a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long v14;  // x20
    int v15;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = 12;
    v8 = 8;
    if (!(a1->field_14 & 4))
        v7 = v8;
    if (idx == a1)
        return idx;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = &v6;
    v5 = v13;
    v14 = *(int *)((char *)a1 + v7);
    if ((int)v14 <= *(int *)(idx + 12) || sub_9e49b8())
    {
        v15 = a1->field_8;
        if (a1->field_8 >= 1)
        {
            _memcpy(*(long long *)idx, a1->field_0, v14 * 8);
            v15 = a1->field_8;
        }
        *(unsigned int *)(idx + 16) = a1->field_10;
        *(int *)(idx + 8) = v15;
    }
    else
    {
        idx = 0;
    }
    return idx;
}
