/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c7c8..0x95c8ac (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c7c8_0 {
    char field_0;
} st_95c7c8_0;


unsigned long long sub_95c7c8(void* a0, st_95c7c8_0 **a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x20
    unsigned long v20;  // x24
    char *v21;  // x19
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char *v16;  // x19
    unsigned long long v17;  // x21
    unsigned long long len;  // x0
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
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a1;
    if (!v16)
        return 0;
    v17 = (long long)a0[8];
    if (v17)
    {
        len = _strlen(v16);
        v19 = (long long)a0[16];
        if (len > v19 && (v20 = *(int *)a0, !(v20 & 1) || !_strncmp(v16, v17, v19)))
        {
            if (!(v20 >> 1 & 1))
            {
                goto LABEL_95c89c;
            }
            else if (!sub_a6e258(v16, v17, v19))
            {
                v19 = (long long)a0[16];
                v16 = *a1;
LABEL_95c89c:
                v21 = &v16[v19];
LABEL_95c8a0:
                *a1 = v21;
                return 1;
            }
        }
    }
    else
    {
        if (!(*(char *)a0 & 1))
            return 1;
        if (*v16 == 45 && (v21 = v16 + 1, v16[1]))
            goto LABEL_95c8a0;
    }
    return 0;
}
